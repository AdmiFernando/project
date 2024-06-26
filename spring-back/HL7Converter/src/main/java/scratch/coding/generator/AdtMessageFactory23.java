package scratch.coding.generator;

import java.io.IOException;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

public class AdtMessageFactory23 {
public static Message createMessage(String messageType) throws HL7Exception, IOException {
        
        //This patterns enables you to build other message types 
        if ( messageType.equals("A01") )
        {
            return new OurAdtA01MessageBuilder23().BuildAdt();
        }
        if ( messageType.equals("R01") )
        {
            return new OurAdtA01MessageBuilder23().BuildOru();
        }
        //if other types of ADT messages are needed, then implement your builders here
        throw new RuntimeException(String.format("%s message type is not supported yet. Extend this if you need to", messageType));
        
    }
}
