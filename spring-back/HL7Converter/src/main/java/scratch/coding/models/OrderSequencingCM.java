package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class OrderSequencingCM implements Serializable {
	@JsonProperty("fillerOrderNumberEntityIdentifier")
	private String fillerOrderNumberEntityIdentifier;
	@JsonProperty("fillerOrderNumber")
	private AuthorityAndFacility fillerOrderNumber;
	@JsonProperty("maximunNumberOfRepeats")
	private String maximunNumberOfRepeats;
	@JsonProperty("placerOrderNumberEntityIdentifier")
	private String placerOrderNumberEntityIdentifier;
	@JsonProperty("placerOrderNumber")
	private AuthorityAndFacility placerOrderNumber;
	@JsonProperty("sequenceCondition")
	private String sequenceCondition;
	@JsonProperty("sequenceResultsflags")
	private String sequenceResultsflags;
	public OrderSequencingCM(String fillerOrderNumberEntityIdentifier, AuthorityAndFacility fillerOrderNumber,
			String maximunNumberOfRepeats, String placerOrderNumberEntityIdentifier,
			AuthorityAndFacility placerOrderNumber, String sequenceCondition, String sequenceResultsflags) {
		super();
		this.fillerOrderNumberEntityIdentifier = fillerOrderNumberEntityIdentifier;
		this.fillerOrderNumber = fillerOrderNumber;
		this.maximunNumberOfRepeats = maximunNumberOfRepeats;
		this.placerOrderNumberEntityIdentifier = placerOrderNumberEntityIdentifier;
		this.placerOrderNumber = placerOrderNumber;
		this.sequenceCondition = sequenceCondition;
		this.sequenceResultsflags = sequenceResultsflags;
	}
	public OrderSequencingCM() {
		super();
	}
	@JsonProperty("fillerOrderNumberEntityIdentifier")
	public String getFillerOrderNumberEntityIdentifier() {
		return fillerOrderNumberEntityIdentifier;
	}
	@JsonProperty("fillerOrderNumberEntityIdentifier")
	public void setFillerOrderNumberEntityIdentifier(String fillerOrderNumberEntityIdentifier) {
		this.fillerOrderNumberEntityIdentifier = fillerOrderNumberEntityIdentifier;
	}
	@JsonProperty("fillerOrderNumber")
	public AuthorityAndFacility getFillerOrderNumber() {
		return fillerOrderNumber;
	}
	@JsonProperty("fillerOrderNumber")
	public void setFillerOrderNumber(AuthorityAndFacility fillerOrderNumber) {
		this.fillerOrderNumber = fillerOrderNumber;
	}
	@JsonProperty("maximunNumberOfRepeats")
	public String getMaximunNumberOfRepeats() {
		return maximunNumberOfRepeats;
	}
	@JsonProperty("maximunNumberOfRepeats")
	public void setMaximunNumberOfRepeats(String maximunNumberOfRepeats) {
		this.maximunNumberOfRepeats = maximunNumberOfRepeats;
	}
	@JsonProperty("placerOrderNumber")
	public AuthorityAndFacility getPlacerOrderNumber() {
		return placerOrderNumber;
	}
	@JsonProperty("placerOrderNumber")
	public void setPlacerOrderNumber(AuthorityAndFacility placerOrderNumber) {
		this.placerOrderNumber = placerOrderNumber;
	}
	@JsonProperty("sequenceCondition")
	public String getSequenceCondition() {
		return sequenceCondition;
	}
	@JsonProperty("sequenceCondition")
	public void setSequenceCondition(String sequenceCondition) {
		this.sequenceCondition = sequenceCondition;
	}
	@JsonProperty("sequenceResultsflags")
	public String getSequenceResultsflags() {
		return sequenceResultsflags;
	}
	@JsonProperty("sequenceResultsflags")
	public void setSequenceResultsflags(String sequenceResultsflags) {
		this.sequenceResultsflags = sequenceResultsflags;
	}
	@JsonProperty("placerOrderNumberEntityIdentifier")
	public String getPlacerOrderNumberEntityIdentifier() {
		return placerOrderNumberEntityIdentifier;
	}
	@JsonProperty("placerOrderNumberEntityIdentifier")
	public void setPlacerOrderNumberEntityIdentifier(String placerOrderNumberEntityIdentifier) {
		this.placerOrderNumberEntityIdentifier = placerOrderNumberEntityIdentifier;
	}
	@Override
	public String toString() {
		return "OrderSequencingCM [fillerOrderNumberEntityIdentifier=" + fillerOrderNumberEntityIdentifier
				+ ", fillerOrderNumber=" + fillerOrderNumber + ", maximunNumberOfRepeats=" + maximunNumberOfRepeats
				+ ", placerOrderNumber=" + placerOrderNumber + ", sequenceCondition=" + sequenceCondition
				+ ", sequenceResultsflags=" + sequenceResultsflags + "]";
	}
}
