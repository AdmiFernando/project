package scratch.coding.hl7.v251;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v251.message.VXU_V04;
import scratch.coding.generic.JsonGenerator;
import scratch.coding.segment.v251.CustomMSH;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomVXU_V04v251 implements JsonGenerator {

	@JsonProperty("msh")
	private CustomMSH msh;
	
	public CustomVXU_V04v251(CustomMSH msh) {
		super();
		this.msh = msh;
	}
	public CustomVXU_V04v251() {
		super();
	}
	@SuppressWarnings("unchecked")
	@Override
	public <T, S> T createJsonFromHL7(S s) throws HL7Exception, IOException {
		VXU_V04  vxu= (VXU_V04)s;
		return (T) new CustomVXU_V04v251(getMSH(vxu));
	}
	private static CustomMSH getMSH(VXU_V04 vxu) throws HL7Exception, IOException {
		return CustomMSH.createMshWithMSH(vxu.getMSH());
	}

}
