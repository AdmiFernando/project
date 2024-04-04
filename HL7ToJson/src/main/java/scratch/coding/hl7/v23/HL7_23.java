package scratch.coding.hl7.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.segment.v23.JsonIN1_v23;
import scratch.coding.segment.v23.JsonMSH_v23;
import scratch.coding.segment.v23.JsonORC_v23;
import scratch.coding.segment.v23.JsonPID_v23;
@JsonIgnoreProperties(ignoreUnknown= true)
public class HL7_23 {
	@JsonProperty("msh")
	private JsonMSH_v23 msh;
	@JsonProperty("pid")
	private JsonPID_v23 pid;
	@JsonProperty("in1")
	private JsonIN1_v23 in1;
	@JsonProperty("orc")
	private JsonORC_v23[] orc;
	public HL7_23(JsonMSH_v23 msh, JsonPID_v23 pid, JsonIN1_v23 in1, JsonORC_v23[] orc) {
		super();
		System.out.println("updated");
		this.msh = msh;
		this.pid = pid;
		this.in1 = in1;
		this.orc = orc;
	}

	public HL7_23() {
		super();
	}

	/**
	 * @return the msh
	 */
	@JsonProperty("msh")
	public JsonMSH_v23 getMsh() {
		return msh;
	}
	/**
	 * @param msh the msh to set
	 */
	@JsonProperty("msh")
	public void setMsh(JsonMSH_v23 msh) {
		this.msh = msh;
	}
	/**
	 * @return the pid
	 */
	public JsonPID_v23 getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(JsonPID_v23 pid) {
		this.pid = pid;
	}
	/**
	 * @return the in1
	 */
	public JsonIN1_v23 getIn1() {
		return in1;
	}
	/**
	 * @param in1 the in1 to set
	 */
	public void setIn1(JsonIN1_v23 in1) {
		this.in1 = in1;
	}
	/**
	 * @return the orc
	 */
	public JsonORC_v23[] getOrc() {
		return orc;
	}
	/**
	 * @param orc the orc to set
	 */
	public void setOrc(JsonORC_v23[] orc) {
		this.orc = orc;
	}
	@Override
	public String toString() {
		return "HL7_23 [msh=" + msh + ", pid=" + pid + ", in1=" + in1 + ", orc=" + Arrays.toString(orc) + "]";
	}
}

