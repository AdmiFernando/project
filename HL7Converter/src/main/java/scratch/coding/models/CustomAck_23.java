package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.segment.v23.CustomMSA;
import scratch.coding.segment.v23.CustomMSH;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomAck_23 {
	@JsonProperty("msh")
	private CustomMSH msh;
	@JsonProperty("msa")
	private CustomMSA msa;
	public CustomAck_23(CustomMSH msh, CustomMSA msa) {
		super();
		this.msh = msh;
		this.msa = msa;
	}
	private CustomAck_23() {
		super();
	}
	/**
	 * @return the msh
	 */
	@JsonProperty("msh")
	public CustomMSH getMsh() {
		return msh;
	}
	/**
	 * @param msh the msh to set
	 */
	@JsonProperty("msh")
	public void setMsh(CustomMSH msh) {
		this.msh = msh;
	}
	/**
	 * @return the msa
	 */
	@JsonProperty("msa")
	public CustomMSA getMsa() {
		return msa;
	}
	/**
	 * @param msa the msa to set
	 */
	@JsonProperty("msa")
	public void setMsa(CustomMSA msa) {
		this.msa = msa;
	}
	@Override
	public String toString() {
		return "CustomAck_23 [msh=" + msh + ", msa=" + msa + "]";
	}
	
	

}
