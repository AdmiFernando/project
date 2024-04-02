package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class ParentOrderNumber implements Serializable {
	@JsonProperty("parentsFillerOrderNumber")
	private AuthorityAndFacility parentsFillerOrderNumber;
	@JsonProperty("parentsPlacerOrderNumber")
	private AuthorityAndFacility parentsPlacerOrderNumber;
	public ParentOrderNumber(AuthorityAndFacility parentsFillerOrderNumber,
			AuthorityAndFacility parentsPlacerOrderNumber) {
		super();
		this.parentsFillerOrderNumber = parentsFillerOrderNumber;
		this.parentsPlacerOrderNumber = parentsPlacerOrderNumber;
	}
	public ParentOrderNumber() {
		super();
	}
	@JsonProperty("parentsFillerOrderNumber")
	public AuthorityAndFacility getParentsFillerOrderNumber() {
		return parentsFillerOrderNumber;
	}
	@JsonProperty("parentsFillerOrderNumber")
	public void setParentsFillerOrderNumber(AuthorityAndFacility parentsFillerOrderNumber) {
		this.parentsFillerOrderNumber = parentsFillerOrderNumber;
	}
	@JsonProperty("parentsPlacerOrderNumber")
	public AuthorityAndFacility getParentsPlacerOrderNumber() {
		return parentsPlacerOrderNumber;
	}
	@JsonProperty("parentsPlacerOrderNumber")
	public void setParentsPlacerOrderNumber(AuthorityAndFacility parentsPlacerOrderNumber) {
		this.parentsPlacerOrderNumber = parentsPlacerOrderNumber;
	}
	@Override
	public String toString() {
		return "ParentOrderNumber [parentsFillerOrderNumber=" + parentsFillerOrderNumber + ", parentsPlacerOrderNumber="
				+ parentsPlacerOrderNumber + "]";
	}
}
