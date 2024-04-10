package scratch.coding.generator;


import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import scratch.coding.generator.segment.v23.MSHSegment_v23;
import scratch.coding.generator.segment.v23.ORCSegment_v23;
import scratch.coding.generator.segment.v23.PD1Segment_v23;
import scratch.coding.generator.segment.v23.PIDSegment_v23;
import scratch.coding.generator.segment.v23.PV1Segment_v23;
import scratch.coding.generator.segment.v25.MSHSegment_v25;
import scratch.coding.generator.segment.v25.ORCSegment_v25;
import scratch.coding.generator.segment.v25.PIDSegment_v25;
//import scratch.coding.hl7.base.v25.ORU_ST_v25;
import scratch.coding.hl7.v23.HL7_23;

/**
 * @author Betancof
 *
 */
@Service
public class Hl7Factory {
	
	
	
	@Autowired
	private ORCSegment_v23 orc_v23;
	
	
	/**
	 * @param json
	 * @return
	 * @throws HL7Exception
	 */
//	private static final Logger log = LoggerFactory.getLogger(Hl7Factory.class);//logs every transaction to the log file
//	public  <T>Message transformJsonToHl7(T json) throws HL7Exception, IOException {
//		log.info("transformJsonToHl7()","executed");
//		if(json instanceof HL7_23) return getORM_v23((HL7_23)json);
//		if(json instanceof ORU_ST_v25) return getORU_v25((ORU_ST_v25)json);
//		return null;
////		System.out.println(orm.encode());
//	}

	private  ORM_O01 getORM_v23(HL7_23 json) throws DataTypeException, HL7Exception, IOException {
		ORM_O01 orm = new ORM_O01();
		MSHSegment_v23.getMSH(orm, json.getMsh());
		PIDSegment_v23.getPID(orm, json.getPid());
		PD1Segment_v23.setPD1(orm, json.getPid().getPd1_pid());
		PV1Segment_v23.setPv1(orm, json.getPid().getPv1_pid());
//		IN1Segment_v23.setIN1(orm, json.getIn1());
		int i = 0;
		while(i<=json.getOrc().length-1) {
			ORCSegment_v23.setORC(orm.getORDER(i), json.getOrc()[i]);
			i++;
		}
//		log.info("getORM_v23()","executed successfully");
		return orm;
	}
//	private  ORU_R01 getORU_v25(ORU_ST_v25 json) throws DataTypeException, HL7Exception {
//		
//		ORU_R01 oru = new ORU_R01();
//		MSHSegment_v25.setMSH(oru.getMSH(), json.getMsh());
//		PIDSegment_v25.setPID(oru.getPATIENT_RESULT().getPATIENT().getPID(), json.getPid());
//		for(int i =0;i<json.getOrc().size();i++) {
//			ORCSegment_v25.setORC(oru.getPATIENT_RESULT().getORDER_OBSERVATION(i), json.getOrc().get(i));
//		}
//		log.info("getORU_v25()","executed successfully");
//		return oru;
//	}
	

}
