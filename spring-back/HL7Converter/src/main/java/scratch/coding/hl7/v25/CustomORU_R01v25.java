package scratch.coding.hl7.v25;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import scratch.coding.generic.JsonGenerator;
import scratch.coding.segment.v25.CustomMSH_v25;
import scratch.coding.segment.v25.CustomORC_v25;
import scratch.coding.segment.v25.CustomPID_v25;
@JsonIgnoreProperties(ignoreUnknown=true)
@Component
@Qualifier("CustomORU_R01v25")
public class CustomORU_R01v25 implements Serializable, JsonGenerator {
	@JsonProperty("msh")
	private CustomMSH_v25 msh;
	@JsonProperty("pid")
	private CustomPID_v25 pid;
	@JsonProperty("orc")
	private List<CustomORC_v25> orc;
	
	@JsonProperty("error")
	private String error;
	
	public static CustomORU_R01v25 createJsonFromORU_O01(ORU_R01 oru) throws HL7Exception, IOException {
		return new CustomORU_R01v25(getMSH(oru), getPID(oru), getORCAll(oru.getPATIENT_RESULT().getORDER_OBSERVATIONAll()));
	}

	private static CustomMSH_v25 getMSH(ORU_R01 oru) throws HL7Exception, IOException {
		return CustomMSH_v25.createMsh(oru);
	}
	
	private static CustomPID_v25 getPID(ORU_R01 oru) throws HL7Exception, IOException {
		return CustomPID_v25.createPid(oru);
	}
	
	private static List<CustomORC_v25> getORCAll(List<ORU_R01_ORDER_OBSERVATION> orcList) throws HL7Exception, IOException {
		List<CustomORC_v25> orcs = new ArrayList<CustomORC_v25>();
		for(ORU_R01_ORDER_OBSERVATION o : orcList) {
			orcs.add(CustomORC_v25.createOrc(o));
		}
		return orcs;
	}
	
	
	public CustomORU_R01v25(CustomMSH_v25 msh, CustomPID_v25 pid, List<CustomORC_v25> orc) {
		super();
		this.msh = msh;
		this.pid = pid;
		this.orc = orc;
	}



	public CustomORU_R01v25() {
		super();
	}
	/**
	 * @return the msh
	 *	@JsonProperty("msh")
	 */
	
	public CustomMSH_v25 getMsh() {
		return msh;
	}
	/**
	 * @param msh the msh to set
	 * @JsonProperty("msh")
	 */
	public void setMsh(CustomMSH_v25 msh) {
		this.msh = msh;
	}
	/**
	 * @return the pid
	 *	@JsonProperty("pid")
	 */
	
	public CustomPID_v25 getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 * @JsonProperty("pid")
	 */
	public void setPid(CustomPID_v25 pid) {
		this.pid = pid;
	}
	/**
	 * @return the orc
	 *	@JsonProperty("orc")
	 */
	
	public List<CustomORC_v25> getOrc() {
		return orc;
	}
	/**
	 * @param orc the orc to set
	 * @JsonProperty("orc")
	 */
	public void setOrc(List<CustomORC_v25> orc) {
		this.orc = orc;
	}
	/**
	 * @return the error
	 *	@JsonProperty("error")
	 */
	
	public String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 * @JsonProperty("error")
	 */
	public void setError(String error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "CustomORU_R01v25 [msh=" + msh + ", pid=" + pid + ", orc=" + orc + ", error=" + error + "]";
	}
	@SuppressWarnings("unchecked")
	@Override
	public <T, S> T createJsonFromHL7(S s) throws HL7Exception, IOException {
		ORU_R01 oru = (ORU_R01)s;
		return (T) new CustomORU_R01v25(getMSH(oru), getPID(oru), getORCAll(oru.getPATIENT_RESULT().getORDER_OBSERVATIONAll()));
	}
	

}
