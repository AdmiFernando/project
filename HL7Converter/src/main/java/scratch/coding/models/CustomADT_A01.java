package scratch.coding.models;


import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.parser.Parser;
import scratch.coding.generator.AdtMessageFactory;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomADT_A01 {
	@JsonProperty("msh")
	private String msg;
	@JsonProperty("pid")
	private String pid;
	private static ADT_A01 adt;
	private static HapiContext context = new DefaultHapiContext();
	Parser pipeParser = context.getPipeParser();
	
	public CustomADT_A01() throws HL7Exception, IOException {
		super();
//		adt =(ADT_A01) AdtMessageFactory.createMessage("A01","2.4");
		
	}
	public static CustomADT_A01 createAdtWithTypeAndVersion(String type, String version) throws HL7Exception, IOException {
		adt=(ADT_A01) AdtMessageFactory.createMessage(type,version);
		CustomADT_A01 customAdt = new CustomADT_A01();
		customAdt.setMsg(adt.getMSH().toString());
		return customAdt;
	}
	@JsonProperty("msh")
	public void setMsg(String msh) throws HL7Exception {
		this.msg = adt.get("MSH").toString();
	}
	@JsonProperty("msh")
	public String getMsg() throws HL7Exception {
		MSH msh = (MSH) adt.get("MSH");
		
		return  msh.getFieldSeparator().getValue();
	}
	@JsonProperty("pid")
	public void setPid(String msh) throws HL7Exception {
		this.msg = adt.get("PID").toString();
	}
	@JsonProperty("pid")
	public String getPid() throws HL7Exception {
		
		PID p = (PID)adt.get("PID");
		String p1 = p.getPatientAddress()[0].encode();
		return  p1;
	}
}
