package scratch.coding.generic;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import ca.uhn.hl7v2.HL7Exception;
@Repository
public interface JsonGenerator{
	public <T, S>T createJsonFromHL7(S s) throws HL7Exception, IOException;
}
