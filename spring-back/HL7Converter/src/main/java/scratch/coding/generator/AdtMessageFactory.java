package scratch.coding.generator;

import java.io.IOException;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

public class AdtMessageFactory {
	public static Message createMessage(String messageType, String version) throws HL7Exception, IOException {
        
        //This patterns enables you to build other message types
		switch(messageType+version) {
		case "A012.3":
			return new OurAdtA01MessageBuilder23().BuildAdt();
		case "A012.4":
			return new OurAdtA01MessageBuilder().BuildAdt();
		case "R012.3":
			return new OurAdtA01MessageBuilder23().BuildOru();
		case "R012.4":
			return new OurAdtA01MessageBuilder().BuildOru();
		default:
			throw new RuntimeException(String.format("%s message type is not supported yet. Extend this if you need to", messageType));
		}
        //if other types of ADT messages are needed, then implement your builders here
    }
}

