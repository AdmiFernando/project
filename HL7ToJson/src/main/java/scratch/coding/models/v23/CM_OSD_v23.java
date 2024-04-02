package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_OSD_v23  {
	@JsonProperty("cm_osd_1_sequenceResultsflags")
	private String cm_osd_1_sequenceResultsflags;
	@JsonProperty("cm_osd_2_placerOrderNumberEntityIdentifier")
	private String cm_osd_2_placerOrderNumberEntityIdentifier;
	@JsonProperty("cm_osd_3_fillerOrderNumberEntityIdentifier")
	private String cm_osd_3_fillerOrderNumberEntityIdentifier;
	@JsonProperty("cm_osd_4_fillerOrderNumberEntityIdentifier")
	private String cm_osd_4_fillerOrderNumberEntityIdentifier;
	@JsonProperty("cm_osd_5_fillerOrderNumberNamespaceID")
	private String cm_osd_5_fillerOrderNumberNamespaceID;
	@JsonProperty("cm_osd_6_sequenceConditionValue")
	private String cm_osd_6_sequenceConditionValue;
	@JsonProperty("cm_osd_7_maximumNumberOfRepeats")
	private String cm_osd_7_maximumNumberOfRepeats;
	@JsonProperty("cm_osd_8_placerOrderNumberUniversalID")
	private String cm_osd_8_placerOrderNumberUniversalID;
	@JsonProperty("cm_osd_9_placerOrderNumberUniversalIDType")
	private String cm_osd_9_placerOrderNumberUniversalIDType;
	@JsonProperty("cm_osd_10_fillerOrderNumberUniversalID")
	private String cm_osd_10_fillerOrderNumberUniversalID;
	@JsonProperty("cm_osd_11_fillerOrderNumberUniversalIDType")
	private String cm_osd_11_fillerOrderNumberUniversalIDType;
	public CM_OSD_v23(String cm_osd_1_sequenceResultsflags,
			String cm_osd_2_placerOrderNumberEntityIdentifier, String cm_osd_3_fillerOrderNumberEntityIdentifier,
			String cm_osd_4_fillerOrderNumberEntityIdentifier, String cm_osd_5_fillerOrderNumberNamespaceID,
			String cm_osd_6_sequenceConditionValue, String cm_osd_7_maximumNumberOfRepeats,
			String cm_osd_8_placerOrderNumberUniversalID, String cm_osd_9_placerOrderNumberUniversalIDType,
			String cm_osd_10_fillerOrderNumberUniversalID, String cm_osd_11_fillerOrderNumberUniversalIDType) {
		super();
		this.cm_osd_1_sequenceResultsflags = cm_osd_1_sequenceResultsflags;
		this.cm_osd_2_placerOrderNumberEntityIdentifier = cm_osd_2_placerOrderNumberEntityIdentifier;
		this.cm_osd_3_fillerOrderNumberEntityIdentifier = cm_osd_3_fillerOrderNumberEntityIdentifier;
		this.cm_osd_4_fillerOrderNumberEntityIdentifier = cm_osd_4_fillerOrderNumberEntityIdentifier;
		this.cm_osd_5_fillerOrderNumberNamespaceID = cm_osd_5_fillerOrderNumberNamespaceID;
		this.cm_osd_6_sequenceConditionValue = cm_osd_6_sequenceConditionValue;
		this.cm_osd_7_maximumNumberOfRepeats = cm_osd_7_maximumNumberOfRepeats;
		this.cm_osd_8_placerOrderNumberUniversalID = cm_osd_8_placerOrderNumberUniversalID;
		this.cm_osd_9_placerOrderNumberUniversalIDType = cm_osd_9_placerOrderNumberUniversalIDType;
		this.cm_osd_10_fillerOrderNumberUniversalID = cm_osd_10_fillerOrderNumberUniversalID;
		this.cm_osd_11_fillerOrderNumberUniversalIDType = cm_osd_11_fillerOrderNumberUniversalIDType;
	}
	public CM_OSD_v23() {
		super();
		this.cm_osd_1_sequenceResultsflags = "";
		this.cm_osd_2_placerOrderNumberEntityIdentifier = "";
		this.cm_osd_3_fillerOrderNumberEntityIdentifier = "";
		this.cm_osd_4_fillerOrderNumberEntityIdentifier = "";
		this.cm_osd_5_fillerOrderNumberNamespaceID = "";
		this.cm_osd_6_sequenceConditionValue = "";
		this.cm_osd_7_maximumNumberOfRepeats = "";
		this.cm_osd_8_placerOrderNumberUniversalID = "";
		this.cm_osd_9_placerOrderNumberUniversalIDType = "";
		this.cm_osd_10_fillerOrderNumberUniversalID = "";
		this.cm_osd_11_fillerOrderNumberUniversalIDType = "";
	}
	public String getCm_osd_1_sequenceResultsflags() {
		return cm_osd_1_sequenceResultsflags;
	}
	public void setCm_osd_1_sequenceResultsflags(String cm_osd_1_sequenceResultsflags) {
		this.cm_osd_1_sequenceResultsflags = cm_osd_1_sequenceResultsflags;
	}
	public String getCm_osd_2_placerOrderNumberEntityIdentifier() {
		return cm_osd_2_placerOrderNumberEntityIdentifier;
	}
	public void setCm_osd_2_placerOrderNumberEntityIdentifier(String cm_osd_2_placerOrderNumberEntityIdentifier) {
		this.cm_osd_2_placerOrderNumberEntityIdentifier = cm_osd_2_placerOrderNumberEntityIdentifier;
	}
	public String getCm_osd_3_fillerOrderNumberEntityIdentifier() {
		return cm_osd_3_fillerOrderNumberEntityIdentifier;
	}
	public void setCm_osd_3_fillerOrderNumberEntityIdentifier(String cm_osd_3_fillerOrderNumberEntityIdentifier) {
		this.cm_osd_3_fillerOrderNumberEntityIdentifier = cm_osd_3_fillerOrderNumberEntityIdentifier;
	}
	public String getCm_osd_4_fillerOrderNumberEntityIdentifier() {
		return cm_osd_4_fillerOrderNumberEntityIdentifier;
	}
	public void setCm_osd_4_fillerOrderNumberEntityIdentifier(String cm_osd_4_fillerOrderNumberEntityIdentifier) {
		this.cm_osd_4_fillerOrderNumberEntityIdentifier = cm_osd_4_fillerOrderNumberEntityIdentifier;
	}
	public String getCm_osd_5_fillerOrderNumberNamespaceID() {
		return cm_osd_5_fillerOrderNumberNamespaceID;
	}
	public void setCm_osd_5_fillerOrderNumberNamespaceID(String cm_osd_5_fillerOrderNumberNamespaceID) {
		this.cm_osd_5_fillerOrderNumberNamespaceID = cm_osd_5_fillerOrderNumberNamespaceID;
	}
	public String getCm_osd_6_sequenceConditionValue() {
		return cm_osd_6_sequenceConditionValue;
	}
	public void setCm_osd_6_sequenceConditionValue(String cm_osd_6_sequenceConditionValue) {
		this.cm_osd_6_sequenceConditionValue = cm_osd_6_sequenceConditionValue;
	}
	public String getCm_osd_7_maximumNumberOfRepeats() {
		return cm_osd_7_maximumNumberOfRepeats;
	}
	public void setCm_osd_7_maximumNumberOfRepeats(String cm_osd_7_maximumNumberOfRepeats) {
		this.cm_osd_7_maximumNumberOfRepeats = cm_osd_7_maximumNumberOfRepeats;
	}
	public String getCm_osd_8_placerOrderNumberUniversalID() {
		return cm_osd_8_placerOrderNumberUniversalID;
	}
	public void setCm_osd_8_placerOrderNumberUniversalID(String cm_osd_8_placerOrderNumberUniversalID) {
		this.cm_osd_8_placerOrderNumberUniversalID = cm_osd_8_placerOrderNumberUniversalID;
	}
	public String getCm_osd_9_placerOrderNumberUniversalIDType() {
		return cm_osd_9_placerOrderNumberUniversalIDType;
	}
	public void setCm_osd_9_placerOrderNumberUniversalIDType(String cm_osd_9_placerOrderNumberUniversalIDType) {
		this.cm_osd_9_placerOrderNumberUniversalIDType = cm_osd_9_placerOrderNumberUniversalIDType;
	}
	public String getCm_osd_10_fillerOrderNumberUniversalID() {
		return cm_osd_10_fillerOrderNumberUniversalID;
	}
	public void setCm_osd_10_fillerOrderNumberUniversalID(String cm_osd_10_fillerOrderNumberUniversalID) {
		this.cm_osd_10_fillerOrderNumberUniversalID = cm_osd_10_fillerOrderNumberUniversalID;
	}
	public String getCm_osd_11_fillerOrderNumberUniversalIDType() {
		return cm_osd_11_fillerOrderNumberUniversalIDType;
	}
	public void setCm_osd_11_fillerOrderNumberUniversalIDType(String cm_osd_11_fillerOrderNumberUniversalIDType) {
		this.cm_osd_11_fillerOrderNumberUniversalIDType = cm_osd_11_fillerOrderNumberUniversalIDType;
	}
	@Override
	public String toString() {
		return "CM_OSD_OrderSequencing [cm_osd_1_sequenceResultsflags=" + cm_osd_1_sequenceResultsflags
				+ ", cm_osd_2_placerOrderNumberEntityIdentifier=" + cm_osd_2_placerOrderNumberEntityIdentifier
				+ ", cm_osd_3_fillerOrderNumberEntityIdentifier=" + cm_osd_3_fillerOrderNumberEntityIdentifier
				+ ", cm_osd_4_fillerOrderNumberEntityIdentifier=" + cm_osd_4_fillerOrderNumberEntityIdentifier
				+ ", cm_osd_5_fillerOrderNumberNamespaceID=" + cm_osd_5_fillerOrderNumberNamespaceID
				+ ", cm_osd_6_sequenceConditionValue=" + cm_osd_6_sequenceConditionValue
				+ ", cm_osd_7_maximumNumberOfRepeats=" + cm_osd_7_maximumNumberOfRepeats
				+ ", cm_osd_8_placerOrderNumberUniversalID=" + cm_osd_8_placerOrderNumberUniversalID
				+ ", cm_osd_9_placerOrderNumberUniversalIDType=" + cm_osd_9_placerOrderNumberUniversalIDType
				+ ", cm_osd_10_fillerOrderNumberUniversalID=" + cm_osd_10_fillerOrderNumberUniversalID
				+ ", cm_osd_11_fillerOrderNumberUniversalIDType=" + cm_osd_11_fillerOrderNumberUniversalIDType + "]";
	}
}
