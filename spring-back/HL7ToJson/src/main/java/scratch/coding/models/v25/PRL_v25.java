package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PRL_v25 {
					
	@JsonProperty("prl_1_parentObservationIdentifier")
	private CE_v2 prl_1_parentObservationIdentifier;
	@JsonProperty("prl_2_parentObservationSubidentifier")
	private String prl_2_parentObservationSubidentifier;
	@JsonProperty("prl_3_parentObservationValueDescriptor")
	private String prl_3_parentObservationValueDescriptor;
	public PRL_v25() {
		super();
		this.prl_1_parentObservationIdentifier = new CE_v2();
		this.prl_2_parentObservationSubidentifier = "";
		this.prl_3_parentObservationValueDescriptor = "";
	}
	public PRL_v25(CE_v2 prl_1_parentObservationIdentifier, String prl_2_parentObservationSubidentifier,
			String prl_3_parentObservationValueDescriptor) {
		super();
		this.prl_1_parentObservationIdentifier = prl_1_parentObservationIdentifier;
		this.prl_2_parentObservationSubidentifier = prl_2_parentObservationSubidentifier;
		this.prl_3_parentObservationValueDescriptor = prl_3_parentObservationValueDescriptor;
	}
	public CE_v2 getPrl_1_parentObservationIdentifier() {
		return prl_1_parentObservationIdentifier;
	}
	public void setPrl_1_parentObservationIdentifier(CE_v2 prl_1_parentObservationIdentifier) {
		this.prl_1_parentObservationIdentifier = prl_1_parentObservationIdentifier;
	}
	public String getPrl_2_parentObservationSubidentifier() {
		return prl_2_parentObservationSubidentifier;
	}
	public void setPrl_2_parentObservationSubidentifier(String prl_2_parentObservationSubidentifier) {
		this.prl_2_parentObservationSubidentifier = prl_2_parentObservationSubidentifier;
	}
	public String getPrl_3_parentObservationValueDescriptor() {
		return prl_3_parentObservationValueDescriptor;
	}
	public void setPrl_3_parentObservationValueDescriptor(String prl_3_parentObservationValueDescriptor) {
		this.prl_3_parentObservationValueDescriptor = prl_3_parentObservationValueDescriptor;
	}
	@Override
	public String toString() {
		return "PRL_v25 [prl_1_parentObservationIdentifier=" + prl_1_parentObservationIdentifier
				+ ", prl_2_parentObservationSubidentifier=" + prl_2_parentObservationSubidentifier
				+ ", prl_3_parentObservationValueDescriptor=" + prl_3_parentObservationValueDescriptor + "]";
	}
	
}
