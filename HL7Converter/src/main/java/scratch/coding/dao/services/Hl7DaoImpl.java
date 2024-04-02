//package scratch.coding.dao.services;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.Base64;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//import org.apache.pdfbox.cos.COSDocument;
//import org.apache.pdfbox.io.RandomAccessFile;
//import org.apache.pdfbox.pdfparser.PDFParser;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.xml.sax.SAXException;
//import ca.uhn.hl7v2.HL7Exception;
//import scratch.coding.dao.MSH_ST_v23Dao;
//import scratch.coding.dao.MSH_ST_v25Dao;
//import scratch.coding.dao.ORU_ResultDao;
//import scratch.coding.dao.ORU_ST_v25Dao;
//import scratch.coding.entities.Attribute;
//import scratch.coding.entities.ORU_Result;
//import scratch.coding.hl7.base.v25.ORU_ST_v25;
//import scratch.coding.hl7.v23.CustomORM_O01v23;
//import scratch.coding.hl7.v25.CustomORU_R01v25;
//import scratch.coding.models.base.ST;
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//import scratch.coding.segment.base.v25.OBX_ST_v25;
//import scratch.coding.segment.base.v25.ORC_ST_v25;
//import scratch.coding.segment.base.v25.PID_ST_v25;
//import scratch.coding.services.CommonService;
//
//@Service
//public class Hl7DaoImpl {
//	
//	@Autowired
//	private MSH_ST_v25Dao mshv25;
//	@Autowired
//	private MSH_ST_v23Dao mshv23;
//	@Autowired
//	private ORU_ST_v25Dao oruService;
//	@Autowired
//	private ORU_ResultDao pftService;
//	private static final Logger log = LoggerFactory.getLogger(Hl7DaoImpl.class);//logs every transaction to the log file
//	@SuppressWarnings("unchecked")
//	@Transactional
//	public <T>T insert(T customObj, String hl7) throws HL7Exception, IOException, ParseException {
//		if(customObj instanceof CustomORM_O01v23) return (T) mshv23.save(CommonService.getMSH_ORM_v23((CustomORM_O01v23) customObj));
//		if(customObj instanceof CustomORU_R01v25) { 
//			CustomORU_R01v25 custom = (CustomORU_R01v25)customObj;
//			MSH_ST_v25 msh = CommonService.getMSH_v25(custom);
//			PID_ST_v25 pid = CommonService.getPID_ST_v25(custom);
//			String id = msh.getMsh_10_messageControlID();
//			List<ORC_ST_v25> orc = CommonService.getORC_ST_v25Array(custom);
//			if(!oruService.existsById(id)) {
//				log.info("insert()","...");
//				Attribute attr = new Attribute("grade", getGrade(CommonService.getPdfBase64(custom)));
//				ORU_Result oru = new ORU_Result(msh.getMsh_10_messageControlID(), pid.getPid_3_patientIdentifierList().get(0).getCx_1_idNumber(), hl7.getBytes(), CommonService.dateFormatting(msh.getMsh_7_dateTimeOfMessage().getTs_1_time()), new Date(), attr);
//				insert(oru);
//				return (T) oruService.save(ORU_ST_v25.createJsonFromORU_O01(msh,pid, orc,id));
//			}
//		}
//		log.info("insert()","not inserted");
//		return null;
//	}
//	@Transactional
//	public MSH_ST_v25 insert(MSH_ST_v25 msh) {
//		return mshv25.save(msh);
//	}
//	@Transactional
//	public MSH_ST_v23 insert(MSH_ST_v23 msh) {
//		return mshv23.save(msh);
//	}
//	@Transactional
//	public MSH_ST_v25 getMSHv25() {
//		return mshv25.findAll().get(0);
//	}
//	@Transactional
//	public MSH_ST_v23 getMSHv23() {
//		return mshv23.findAll().get(0);
//	}
//	@Transactional
//	public ORU_ST_v25 insertHl7(ORU_ST_v25 oru) {
//		return oruService.save(oru);
//	}
//	public ORU_ST_v25 getORU_ST_v25(String messageControlID, String report) {	
//		return getORU_ST_v25(oruService.findById(messageControlID).get(),  report);
//	}
//	public ORU_ST_v25 getORU_ST_v25(ORU_ST_v25 oru, String report) {
//		if(report.toUpperCase().equals("YES")) {
//			return oru;
//		} else {
//			for(ORC_ST_v25 orc: oru.getOrc()){
//				for(OBX_ST_v25 obx: orc.getObr().getObx()) {
//					for(ST st: obx.getObx_5_observationValue()) {
//						st.setSt_2("".getBytes());
//					}
//				}
//			}
//			return oru;
//		}
//	}
//	public String getORUReport_v25(String messageControlID) throws IOException, SAXException {
//		Optional<ORU_ST_v25> oru = oruService.findById(messageControlID);
//		String line = "";
//		if(oru.isPresent()) {
//			for(ORC_ST_v25 orc:oru.get().getOrc()) {
//				for(OBX_ST_v25 obx: orc.getObr().getObx()) {
//					for(ST st: obx.getObx_5_observationValue()) {
//						if(st.getSt_2()!=null) {
////							System.out.println(i++);
//							line+=new String(st.getSt_2()).substring("^AP^PDF^Base64^".length());
////							System.out.println(line);
//						}
//					}
//				}
//			}
//		}
//		getGrade(line);
//		return line;
//	}
//	private String getGrade(String line) throws FileNotFoundException, IOException {
//		File file = new File("temp.pdf");;
//		FileOutputStream fop = new FileOutputStream(file);
//		fop.write(Base64.getDecoder().decode(line.getBytes()));
//		fop.flush();
//		fop.close();
//		PDFParser parser = new PDFParser(new RandomAccessFile(file, "r"));
//		parser.parse();
//		COSDocument cosDoc = parser.getDocument();
//		PDFTextStripper stripper = new PDFTextStripper();
//		PDDocument pdDoc = new PDDocument(cosDoc);
//		pdDoc.getNumberOfPages();
//		stripper.setStartPage(0);
//		stripper.setEndPage(pdDoc.getNumberOfPages());
//		String text = stripper.getText(pdDoc);
//		cosDoc.close();
//		for(String tx: text.split("\n")) {
//			if(tx.contains("PreSession")) {
//				return tx.substring(0, 1);
//			}
//		}
//		return null;
//	}
//	public Optional<ORU_ST_v25> getORU_ID(String patientId, String dateStamp){
////		System.out.println(CommonService.dateParsing("02/14/2022"));
//		return oruService.getORU_ID(patientId, CommonService.dateParsing(dateStamp));
//	}
//	public boolean insert(ORU_Result pftOru) {
//		try {
//			pftService.save(pftOru);
//			return true;
//		} catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//}
