package scratch.coding.controllers;

import java.io.IOException;
import java.util.Base64;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v23.message.ACK;
import ca.uhn.hl7v2.parser.Parser;
//import scratch.coding.dao.services.Hl7DaoImpl;
import scratch.coding.generator.Hl7Factory;
import scratch.coding.generator.JsonFactory;
//import scratch.coding.hl7.base.v25.ORU_ST_v25;
import scratch.coding.hl7.v23.CustomORM_O01v23;
import scratch.coding.hl7.v23.HL7_23;
import scratch.coding.models.CustomAck_23;
import scratch.coding.segment.v23.CustomMSA;
import scratch.coding.segment.v23.CustomMSH;

@RestController
@CrossOrigin(origins="*", maxAge = 3600, methods = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
public class GeneratorController {

//	@Autowired
//	private Hl7DaoImpl daoService;
	
	@Autowired
	private Hl7Factory factory;
	
	@Autowired
	private JsonFactory jsonFactoy;
	
	@Autowired
	private CustomMSH msh;

	private static final Logger log = LoggerFactory.getLogger(GeneratorController.class);//logs every transaction to the log file
	@RequestMapping(value="/hl7tojson251", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String  getRawHL7251(@RequestBody String lineC) throws HL7Exception, IOException {
		try(HapiContext context = new DefaultHapiContext();) {
			context.getExecutorService();
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/hl7tojson", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public <T>ResponseEntity<T> getRawHL7(@RequestBody String lineC) {
		try(HapiContext context = new DefaultHapiContext();) {
			lineC = lineC.replaceAll("\n", "\r");	
			context.getExecutorService();
			Parser parser = context.getGenericParser();
			context.getParserConfiguration().setValidating(false);
			log.info("getRawHL7()","parsing starts...");
			Message message =  parser.parse(lineC);	
			log.info("getRawHL7()","parsing ends...");
			return ResponseEntity.status(HttpStatus.OK).body((T) jsonFactoy.transformHL7ToJson(message));
		}catch(HL7Exception | IOException ex) {
			ex.printStackTrace();
			CustomORM_O01v23 hl7error = new CustomORM_O01v23();
			hl7error.setError(ex.getMessage() + " "+ex.getCause());
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body((T) hl7error);
		} catch(Exception e) {
			e.printStackTrace();
			CustomORM_O01v23 hl7error = new CustomORM_O01v23();
			hl7error.setError(e.getMessage() + " "+e.getCause());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body((T) hl7error);
		}
	}
	/**
	 * consumes json and transform it into hl7 format using HAPI library
	 * @param json
	 * @return string in hl7 format
	 * @throws HL7Exception
	 */
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value="/posthl7", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public <T>ResponseEntity<T> postHl7(@RequestBody String lineC) {
//		try(HapiContext context = new DefaultHapiContext();) {
//			lineC = lineC.replaceAll("\n", "\r");	
//			context.getExecutorService();
//			Parser parser = context.getGenericParser();
//			context.getParserConfiguration().setValidating(false);
//			log.info("postHl7()","parsing starts...");
//			Message message =  parser.parse(lineC);
//			log.info("postHl7()","parsing ends...");
//			parser.getParserConfiguration().setDefaultObx2Type("ST");		
//			T t = daoService.insert((T)jsonFactoy.transformHL7ToJson(message), lineC);
//			log.info("record submitted");
//			return  ResponseEntity.status(HttpStatus.OK).body(t);
//		}catch(HL7Exception | IOException ex) {
//			ex.printStackTrace();
//			CustomORM_O01v23 hl7error = new CustomORM_O01v23();
//			hl7error.setError(ex.getMessage() + " "+ex.getCause());
//			return  ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body((T)(ex.getCause()+" "+ex.getMessage()));
//		} catch(Exception e) {
//			e.printStackTrace();
//			CustomORM_O01v23 hl7error = new CustomORM_O01v23();
//			hl7error.setError(e.getMessage() + " "+e.getCause());
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body((T) hl7error);
//		}
//	}
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value="/db", method=RequestMethod.GET)
//	public <T>T getORU_v25(@RequestParam("id")String id, @RequestParam(name="report", required=false)String report,@RequestParam(name="format", required=false)String format) throws HL7Exception, IOException {
//		if(null!=format) {
//			switch(format.toUpperCase()) {
//			case "JSON":
//				return (T) daoService.getORU_ST_v25(id, report);
//			case "HL7":
//				return (T) factory.transformJsonToHl7(daoService.getORU_ST_v25(id, report)).encode();
//				default:
//					return (T) "Format not supported";
//			}
//		}
//		return (T)(ORU_ST_v25)daoService.getORU_ST_v25(id, report);
//	}
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value="/report", method=RequestMethod.GET)
//	public <T>ResponseEntity<T> getORUReport_v25(@RequestParam("patientid")String patientId, @RequestParam("date")String date) {
//		try {
//		Optional<ORU_ST_v25> oru = daoService.getORU_ID(patientId, date);
//		if(!oru.isPresent()) {
//			return (ResponseEntity<T>) ResponseEntity
//					.status(HttpStatus.ACCEPTED)
//					.contentType(MediaType.TEXT_HTML)
//					.body("<script>alert('Record not found'); window.close()</script>");
//
//		} else {
//			return (ResponseEntity<T>) ResponseEntity
//					.status(HttpStatus.OK)
//					.contentType(MediaType.APPLICATION_PDF)
//					.header(HttpHeaders.CONTENT_DISPOSITION,  "attachment; filename= test.pdf")
//					.body(new ByteArrayResource(Base64.getDecoder().decode(daoService.getORUReport_v25(oru.get().getId()))));
//		}
//		}catch(IOException ie) {
//			ie.printStackTrace();
//			return (ResponseEntity<T>) ResponseEntity
//					.status(HttpStatus.INTERNAL_SERVER_ERROR)
//					.contentType(MediaType.TEXT_HTML)
//					.body("<script>alert('"+ie.getClass()+" "+ ie.getMessage()+"'); window.close()</script>");
//		}catch(SAXException se) {
//			se.printStackTrace();
//			return (ResponseEntity<T>) ResponseEntity
//					.status(HttpStatus.INTERNAL_SERVER_ERROR)
//					.contentType(MediaType.TEXT_HTML)
//					.body("<script>alert('"+se.getClass()+" "+se.getMessage()+"'); window.close()</script>");
//		}catch(Exception e) {
//			e.printStackTrace();
//			return (ResponseEntity<T>) ResponseEntity
//					.status(HttpStatus.INTERNAL_SERVER_ERROR)
//					.contentType(MediaType.TEXT_HTML)
//					.body("<script>alert('"+e.getClass()+" "+e.getMessage()+"'); window.close()</script>");
//		}
//	}
//	
//	@RequestMapping(value="/jsontohl7", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> createHL7(@RequestBody HL7_23 json) {
//		try {
//			log.info("createHL7()","");
//			return ResponseEntity.status(HttpStatus.OK).body(factory.transformJsonToHl7(json).encode());
//		}catch(HL7Exception he) {
//			he.printStackTrace();
//			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(he.getMessage()+" "+he.getCause());
//		} catch(Exception e) {
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage()+" "+e.getCause());
//		}
//	}
//
//	@RequestMapping(value="/ack", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public CustomAck_23 ack(@RequestBody String message) throws HL7Exception, IOException {
//		try(HapiContext context = new DefaultHapiContext()){
//			Parser parser = context.getGenericParser();
//			ACK mess = (ACK)parser.parse(message.replace("\n", "\r"));
//			return new CustomAck_23(msh.createMshWithMSH(mess.getMSH()), CustomMSA.createMSA(mess.getMSA()));
//		} catch(Exception ex) {
//			ex.printStackTrace();
//			return null;
//		}
//	}
	
	
}
