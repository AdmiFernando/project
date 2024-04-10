package scratch.coding.generator;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import scratch.coding.generic.JsonGenerator;
import scratch.coding.hl7.v23.CustomORM_O01v23;
import scratch.coding.hl7.v25.CustomORU_R01v25;
@Service
public class JsonFactory {
	
	@Autowired
	@Qualifier("CustomORM_O01v23")
	private JsonGenerator CustomORM_O01v23;
	@Autowired
	@Qualifier("CustomORU_R01v25")
	private JsonGenerator CustomORU_R01v25;
	
	public <T>T transformHL7ToJson(Message message) throws HL7Exception, IOException {
		switch(message.getVersion()) {
		case "2.3":
			switch(message.getName()) {
			case "ORM_O01":
				return CustomORM_O01v23.createJsonFromHL7(message);
			case "ORU_R01":
//				GENERATOR = new CustomORM_O01v23();
				return CustomORM_O01v23.createJsonFromHL7(message);
			default:
				throw new HL7Exception("type not supported");
			}
			
		case "2.5":
			switch(message.getName()) {
			case "ORM_O01":
//				GENERATOR = new CustomORU_R01v25();
				return CustomORU_R01v25.createJsonFromHL7(message);
			case "ORU_R01":
//				GENERATOR = new CustomORU_R01v25();
				return CustomORU_R01v25.createJsonFromHL7(message);
			default:
				throw new HL7Exception("type not supported");
			}
		default:
			throw new HL7Exception("Version not supported");
		}
			
	}
	
}
