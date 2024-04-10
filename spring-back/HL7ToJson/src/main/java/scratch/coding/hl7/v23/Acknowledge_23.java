package scratch.coding.hl7.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.segment.v23.JsonMSA_v23;
import scratch.coding.segment.v23.JsonMSH_v23;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Acknowledge_23 {
	@JsonProperty("msh")
	private JsonMSH_v23 msh;
	@JsonProperty("msa")
	private JsonMSA_v23 msa;
	@JsonProperty("msg")
	private String msg;
	public Acknowledge_23(JsonMSH_v23 msh, JsonMSA_v23 msa, String msg) {
		super();
		this.msh = msh;
		this.msa = msa;
		this.msg = msg;
	}
	public Acknowledge_23() {
		super();
	}
	@JsonProperty("msh")
	public JsonMSH_v23 getMsh() {
		return msh;
	}
	@JsonProperty("msh")
	public void setMsh(JsonMSH_v23 msh) {
		this.msh = msh;
	}
	@JsonProperty("msa")
	public JsonMSA_v23 getMsa() {
		return msa;
	}
	@JsonProperty("msa")
	public void setMsa(JsonMSA_v23 msa) {
		this.msa = msa;
	}
	@JsonProperty("msg")
	public String getMsg() {
		return msg;
	}
	@JsonProperty("msg")
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Acknowledge_23 [msh=" + msh + ", msa=" + msa + ", msg=" + msg + "]";
	}
}