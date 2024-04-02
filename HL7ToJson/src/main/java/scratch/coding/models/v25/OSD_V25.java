package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class OSD_V25 {
		
	@JsonProperty("osd_1_sequenceResultsFlag")
	private String osd_1_sequenceResultsFlag;
	@JsonProperty("osd_2_placerOrderNumber")
	private String osd_2_placerOrderNumber;
	@JsonProperty("osd_3_placerOrderNumberNamespaceId")
	private String osd_3_placerOrderNumberNamespaceId;
	@JsonProperty("osd_4_fillerOrderNumber")
	private String osd_4_fillerOrderNumber;
	@JsonProperty("osd_5_fillerOrderNumber")
	private String osd_5_fillerOrderNumber;
	@JsonProperty("osd_6_sequenceConditionValue")
	private String osd_6_sequenceConditionValue;
	@JsonProperty("osd_7_maximumNumberOfRepeats")
	private String osd_7_maximumNumberOfRepeats;
	@JsonProperty("osd_8_placerOrderNumber")
	private String osd_8_placerOrderNumber;
	@JsonProperty("osd_9_placerOrderNumber")
	private String osd_9_placerOrderNumber;
	@JsonProperty("osd_10_fillerOrderNumberUniversalID")
	private String osd_10_fillerOrderNumberUniversalID;
	@JsonProperty("osd_11_fillerOrderNumberUniversalIDType")
	private String osd_11_fillerOrderNumberUniversalIDType;
	public OSD_V25(String osd_1_sequenceResultsFlag, String osd_2_placerOrderNumber,
			String osd_3_placerOrderNumberNamespaceId, String osd_4_fillerOrderNumber, String osd_5_fillerOrderNumber,
			String osd_6_sequenceConditionValue, String osd_7_maximumNumberOfRepeats, String osd_8_placerOrderNumber,
			String osd_9_placerOrderNumber, String osd_10_fillerOrderNumber, String osd_11_fillerOrderNumber) {
		super();
		this.osd_1_sequenceResultsFlag = osd_1_sequenceResultsFlag;
		this.osd_2_placerOrderNumber = osd_2_placerOrderNumber;
		this.osd_3_placerOrderNumberNamespaceId = osd_3_placerOrderNumberNamespaceId;
		this.osd_4_fillerOrderNumber = osd_4_fillerOrderNumber;
		this.osd_5_fillerOrderNumber = osd_5_fillerOrderNumber;
		this.osd_6_sequenceConditionValue = osd_6_sequenceConditionValue;
		this.osd_7_maximumNumberOfRepeats = osd_7_maximumNumberOfRepeats;
		this.osd_8_placerOrderNumber = osd_8_placerOrderNumber;
		this.osd_9_placerOrderNumber = osd_9_placerOrderNumber;
		this.osd_10_fillerOrderNumberUniversalID = osd_10_fillerOrderNumber;
		this.osd_11_fillerOrderNumberUniversalIDType = osd_11_fillerOrderNumber;
	}
	public OSD_V25() {
		super();
		this.osd_1_sequenceResultsFlag = "";
		this.osd_2_placerOrderNumber = "";
		this.osd_3_placerOrderNumberNamespaceId = "";
		this.osd_4_fillerOrderNumber = "";
		this.osd_5_fillerOrderNumber = "";
		this.osd_6_sequenceConditionValue = "";
		this.osd_7_maximumNumberOfRepeats = "";
		this.osd_8_placerOrderNumber = "";
		this.osd_9_placerOrderNumber = "";
		this.osd_10_fillerOrderNumberUniversalID = "";
		this.osd_11_fillerOrderNumberUniversalIDType = "";
	}
	public String getOsd_1_sequenceResultsFlag() {
		return osd_1_sequenceResultsFlag;
	}
	public void setOsd_1_sequenceResultsFlag(String osd_1_sequenceResultsFlag) {
		this.osd_1_sequenceResultsFlag = osd_1_sequenceResultsFlag;
	}
	public String getOsd_2_placerOrderNumber() {
		return osd_2_placerOrderNumber;
	}
	public void setOsd_2_placerOrderNumber(String osd_2_placerOrderNumber) {
		this.osd_2_placerOrderNumber = osd_2_placerOrderNumber;
	}
	public String getOsd_3_placerOrderNumberNamespaceId() {
		return osd_3_placerOrderNumberNamespaceId;
	}
	public void setOsd_3_placerOrderNumberNamespaceId(String osd_3_placerOrderNumberNamespaceId) {
		this.osd_3_placerOrderNumberNamespaceId = osd_3_placerOrderNumberNamespaceId;
	}
	public String getOsd_4_fillerOrderNumber() {
		return osd_4_fillerOrderNumber;
	}
	public void setOsd_4_fillerOrderNumber(String osd_4_fillerOrderNumber) {
		this.osd_4_fillerOrderNumber = osd_4_fillerOrderNumber;
	}
	public String getOsd_5_fillerOrderNumber() {
		return osd_5_fillerOrderNumber;
	}
	public void setOsd_5_fillerOrderNumber(String osd_5_fillerOrderNumber) {
		this.osd_5_fillerOrderNumber = osd_5_fillerOrderNumber;
	}
	public String getOsd_6_sequenceConditionValue() {
		return osd_6_sequenceConditionValue;
	}
	public void setOsd_6_sequenceConditionValue(String osd_6_sequenceConditionValue) {
		this.osd_6_sequenceConditionValue = osd_6_sequenceConditionValue;
	}
	public String getOsd_7_maximumNumberOfRepeats() {
		return osd_7_maximumNumberOfRepeats;
	}
	public void setOsd_7_maximumNumberOfRepeats(String osd_7_maximumNumberOfRepeats) {
		this.osd_7_maximumNumberOfRepeats = osd_7_maximumNumberOfRepeats;
	}
	public String getOsd_8_placerOrderNumber() {
		return osd_8_placerOrderNumber;
	}
	public void setOsd_8_placerOrderNumber(String osd_8_placerOrderNumber) {
		this.osd_8_placerOrderNumber = osd_8_placerOrderNumber;
	}
	public String getOsd_9_placerOrderNumber() {
		return osd_9_placerOrderNumber;
	}
	public void setOsd_9_placerOrderNumber(String osd_9_placerOrderNumber) {
		this.osd_9_placerOrderNumber = osd_9_placerOrderNumber;
	}
	public String getOsd_10_fillerOrderNumberUniversalID() {
		return osd_10_fillerOrderNumberUniversalID;
	}
	public void setOsd_10_fillerOrderNumberUniversalID(String osd_10_fillerOrderNumberUniversalID) {
		this.osd_10_fillerOrderNumberUniversalID = osd_10_fillerOrderNumberUniversalID;
	}
	public String getOsd_11_fillerOrderNumberUniversalIDType() {
		return osd_11_fillerOrderNumberUniversalIDType;
	}
	public void setOsd_11_fillerOrderNumberUniversalIDType(String osd_11_fillerOrderNumberUniversalIDType) {
		this.osd_11_fillerOrderNumberUniversalIDType = osd_11_fillerOrderNumberUniversalIDType;
	}
	@Override
	public String toString() {
		return "OSD_V25 [osd_1_sequenceResultsFlag=" + osd_1_sequenceResultsFlag + ", osd_2_placerOrderNumber="
				+ osd_2_placerOrderNumber + ", osd_3_placerOrderNumberNamespaceId=" + osd_3_placerOrderNumberNamespaceId
				+ ", osd_4_fillerOrderNumber=" + osd_4_fillerOrderNumber + ", osd_5_fillerOrderNumber="
				+ osd_5_fillerOrderNumber + ", osd_6_sequenceConditionValue=" + osd_6_sequenceConditionValue
				+ ", osd_7_maximumNumberOfRepeats=" + osd_7_maximumNumberOfRepeats + ", osd_8_placerOrderNumber="
				+ osd_8_placerOrderNumber + ", osd_9_placerOrderNumber=" + osd_9_placerOrderNumber
				+ ", osd_10_fillerOrderNumberUniversalID=" + osd_10_fillerOrderNumberUniversalID
				+ ", osd_11_fillerOrderNumberUniversalIDType=" + osd_11_fillerOrderNumberUniversalIDType + "]";
	}
	
	
}
