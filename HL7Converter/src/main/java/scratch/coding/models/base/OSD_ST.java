//package scratch.coding.models.base;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.v25.TQ_ST_v25;
//
//@Table(name="OSD_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class OSD_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="OSD_ID")
//	private Long id;
//	@Column(name="OSD_1")
//	@JsonProperty("osd_1_sequenceResultsFlag")
//	private String osd_1_sequenceResultsFlag;
//	@Column(name="OSD_2")
//	@JsonProperty("osd_2_placerOrderNumber")
//	private String osd_2_placerOrderNumber;
//	@Column(name="OSD_3")
//	@JsonProperty("osd_3_placerOrderNumberNamespaceId")
//	private String osd_3_placerOrderNumberNamespaceId;
//	@Column(name="OSD_4")
//	@JsonProperty("osd_4_fillerOrderNumber")
//	private String osd_4_fillerOrderNumber;
//	@Column(name="OSD_5")
//	@JsonProperty("osd_5_fillerOrderNumber")
//	private String osd_5_fillerOrderNumber;
//	@Column(name="OSD_6")
//	@JsonProperty("osd_6_sequenceConditionValue")
//	private String osd_6_sequenceConditionValue;
//	@Column(name="OSD_7")
//	@JsonProperty("osd_7_maximumNumberOfRepeats")
//	private String osd_7_maximumNumberOfRepeats;
//	@Column(name="OSD_8")
//	@JsonProperty("osd_8_placerOrderNumber")
//	private String osd_8_placerOrderNumber;
//	@Column(name="OSD_9")
//	@JsonProperty("osd_9_placerOrderNumber")
//	private String osd_9_placerOrderNumber;
//	@Column(name="OSD_10")
//	@JsonProperty("osd_10_fillerOrderNumberUniversalID")
//	private String osd_10_fillerOrderNumberUniversalID;
//	@Column(name="OSD_11")
//	@JsonProperty("osd_11_fillerOrderNumberUniversalIDType")
//	private String osd_11_fillerOrderNumberUniversalIDType;
//	
//	@OneToOne(mappedBy = "tq_10_orderSequencing")
//	@JsonIgnoreProperties({"tq_10_orderSequencing"})
//	private TQ_ST_v25 tq_10_v25;
//
//	public OSD_ST(String osd_1_sequenceResultsFlag, String osd_2_placerOrderNumber,
//			String osd_3_placerOrderNumberNamespaceId, String osd_4_fillerOrderNumber, String osd_5_fillerOrderNumber,
//			String osd_6_sequenceConditionValue, String osd_7_maximumNumberOfRepeats, String osd_8_placerOrderNumber,
//			String osd_9_placerOrderNumber, String osd_10_fillerOrderNumberUniversalID,
//			String osd_11_fillerOrderNumberUniversalIDType) {
//		super();
//		this.osd_1_sequenceResultsFlag = osd_1_sequenceResultsFlag;
//		this.osd_2_placerOrderNumber = osd_2_placerOrderNumber;
//		this.osd_3_placerOrderNumberNamespaceId = osd_3_placerOrderNumberNamespaceId;
//		this.osd_4_fillerOrderNumber = osd_4_fillerOrderNumber;
//		this.osd_5_fillerOrderNumber = osd_5_fillerOrderNumber;
//		this.osd_6_sequenceConditionValue = osd_6_sequenceConditionValue;
//		this.osd_7_maximumNumberOfRepeats = osd_7_maximumNumberOfRepeats;
//		this.osd_8_placerOrderNumber = osd_8_placerOrderNumber;
//		this.osd_9_placerOrderNumber = osd_9_placerOrderNumber;
//		this.osd_10_fillerOrderNumberUniversalID = osd_10_fillerOrderNumberUniversalID;
//		this.osd_11_fillerOrderNumberUniversalIDType = osd_11_fillerOrderNumberUniversalIDType;
//	}
//
//	public OSD_ST() {
//		super();
//	}
//
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the osd_1_sequenceResultsFlag
//	 *	@JsonProperty("osd_1_sequenceResultsFlag")
//	 */
//	
//	public String getOsd_1_sequenceResultsFlag() {
//		return osd_1_sequenceResultsFlag;
//	}
//
//	/**
//	 * @param osd_1_sequenceResultsFlag the osd_1_sequenceResultsFlag to set
//	 * @JsonProperty("osd_1_sequenceResultsFlag")
//	 */
//	public void setOsd_1_sequenceResultsFlag(String osd_1_sequenceResultsFlag) {
//		this.osd_1_sequenceResultsFlag = osd_1_sequenceResultsFlag;
//	}
//
//	/**
//	 * @return the osd_2_placerOrderNumber
//	 *	@JsonProperty("osd_2_placerOrderNumber")
//	 */
//	
//	public String getOsd_2_placerOrderNumber() {
//		return osd_2_placerOrderNumber;
//	}
//
//	/**
//	 * @param osd_2_placerOrderNumber the osd_2_placerOrderNumber to set
//	 * @JsonProperty("osd_2_placerOrderNumber")
//	 */
//	public void setOsd_2_placerOrderNumber(String osd_2_placerOrderNumber) {
//		this.osd_2_placerOrderNumber = osd_2_placerOrderNumber;
//	}
//
//	/**
//	 * @return the osd_3_placerOrderNumberNamespaceId
//	 *	@JsonProperty("osd_3_placerOrderNumberNamespaceId")
//	 */
//	
//	public String getOsd_3_placerOrderNumberNamespaceId() {
//		return osd_3_placerOrderNumberNamespaceId;
//	}
//
//	/**
//	 * @param osd_3_placerOrderNumberNamespaceId the osd_3_placerOrderNumberNamespaceId to set
//	 * @JsonProperty("osd_3_placerOrderNumberNamespaceId")
//	 */
//	public void setOsd_3_placerOrderNumberNamespaceId(String osd_3_placerOrderNumberNamespaceId) {
//		this.osd_3_placerOrderNumberNamespaceId = osd_3_placerOrderNumberNamespaceId;
//	}
//
//	/**
//	 * @return the osd_4_fillerOrderNumber
//	 *	@JsonProperty("osd_4_fillerOrderNumber")
//	 */
//	
//	public String getOsd_4_fillerOrderNumber() {
//		return osd_4_fillerOrderNumber;
//	}
//
//	/**
//	 * @param osd_4_fillerOrderNumber the osd_4_fillerOrderNumber to set
//	 * @JsonProperty("osd_4_fillerOrderNumber")
//	 */
//	public void setOsd_4_fillerOrderNumber(String osd_4_fillerOrderNumber) {
//		this.osd_4_fillerOrderNumber = osd_4_fillerOrderNumber;
//	}
//
//	/**
//	 * @return the osd_5_fillerOrderNumber
//	 *	@JsonProperty("osd_5_fillerOrderNumber")
//	 */
//	
//	public String getOsd_5_fillerOrderNumber() {
//		return osd_5_fillerOrderNumber;
//	}
//
//	/**
//	 * @param osd_5_fillerOrderNumber the osd_5_fillerOrderNumber to set
//	 * @JsonProperty("osd_5_fillerOrderNumber")
//	 */
//	public void setOsd_5_fillerOrderNumber(String osd_5_fillerOrderNumber) {
//		this.osd_5_fillerOrderNumber = osd_5_fillerOrderNumber;
//	}
//
//	/**
//	 * @return the osd_6_sequenceConditionValue
//	 *	@JsonProperty("osd_6_sequenceConditionValue")
//	 */
//	
//	public String getOsd_6_sequenceConditionValue() {
//		return osd_6_sequenceConditionValue;
//	}
//
//	/**
//	 * @param osd_6_sequenceConditionValue the osd_6_sequenceConditionValue to set
//	 * @JsonProperty("osd_6_sequenceConditionValue")
//	 */
//	public void setOsd_6_sequenceConditionValue(String osd_6_sequenceConditionValue) {
//		this.osd_6_sequenceConditionValue = osd_6_sequenceConditionValue;
//	}
//
//	/**
//	 * @return the osd_7_maximumNumberOfRepeats
//	 *	@JsonProperty("osd_7_maximumNumberOfRepeats")
//	 */
//	
//	public String getOsd_7_maximumNumberOfRepeats() {
//		return osd_7_maximumNumberOfRepeats;
//	}
//
//	/**
//	 * @param osd_7_maximumNumberOfRepeats the osd_7_maximumNumberOfRepeats to set
//	 * @JsonProperty("osd_7_maximumNumberOfRepeats")
//	 */
//	public void setOsd_7_maximumNumberOfRepeats(String osd_7_maximumNumberOfRepeats) {
//		this.osd_7_maximumNumberOfRepeats = osd_7_maximumNumberOfRepeats;
//	}
//
//	/**
//	 * @return the osd_8_placerOrderNumber
//	 *	@JsonProperty("osd_8_placerOrderNumber")
//	 */
//	
//	public String getOsd_8_placerOrderNumber() {
//		return osd_8_placerOrderNumber;
//	}
//
//	/**
//	 * @param osd_8_placerOrderNumber the osd_8_placerOrderNumber to set
//	 * @JsonProperty("osd_8_placerOrderNumber")
//	 */
//	public void setOsd_8_placerOrderNumber(String osd_8_placerOrderNumber) {
//		this.osd_8_placerOrderNumber = osd_8_placerOrderNumber;
//	}
//
//	/**
//	 * @return the osd_9_placerOrderNumber
//	 *	@JsonProperty("osd_9_placerOrderNumber")
//	 */
//	
//	public String getOsd_9_placerOrderNumber() {
//		return osd_9_placerOrderNumber;
//	}
//
//	/**
//	 * @param osd_9_placerOrderNumber the osd_9_placerOrderNumber to set
//	 * @JsonProperty("osd_9_placerOrderNumber")
//	 */
//	public void setOsd_9_placerOrderNumber(String osd_9_placerOrderNumber) {
//		this.osd_9_placerOrderNumber = osd_9_placerOrderNumber;
//	}
//
//	/**
//	 * @return the osd_10_fillerOrderNumberUniversalID
//	 *	@JsonProperty("osd_10_fillerOrderNumberUniversalID")
//	 */
//	
//	public String getOsd_10_fillerOrderNumberUniversalID() {
//		return osd_10_fillerOrderNumberUniversalID;
//	}
//
//	/**
//	 * @param osd_10_fillerOrderNumberUniversalID the osd_10_fillerOrderNumberUniversalID to set
//	 * @JsonProperty("osd_10_fillerOrderNumberUniversalID")
//	 */
//	public void setOsd_10_fillerOrderNumberUniversalID(String osd_10_fillerOrderNumberUniversalID) {
//		this.osd_10_fillerOrderNumberUniversalID = osd_10_fillerOrderNumberUniversalID;
//	}
//
//	/**
//	 * @return the osd_11_fillerOrderNumberUniversalIDType
//	 *	@JsonProperty("osd_11_fillerOrderNumberUniversalIDType")
//	 */
//	
//	public String getOsd_11_fillerOrderNumberUniversalIDType() {
//		return osd_11_fillerOrderNumberUniversalIDType;
//	}
//
//	/**
//	 * @param osd_11_fillerOrderNumberUniversalIDType the osd_11_fillerOrderNumberUniversalIDType to set
//	 * @JsonProperty("osd_11_fillerOrderNumberUniversalIDType")
//	 */
//	public void setOsd_11_fillerOrderNumberUniversalIDType(String osd_11_fillerOrderNumberUniversalIDType) {
//		this.osd_11_fillerOrderNumberUniversalIDType = osd_11_fillerOrderNumberUniversalIDType;
//	}
//
//	/**
//	 * @return the tq_10_v25
//	 *	@JsonProperty("tq_10_v25")
//	 */
//	
//	public TQ_ST_v25 getTq_10_v25() {
//		return tq_10_v25;
//	}
//
//	/**
//	 * @param tq_10_v25 the tq_10_v25 to set
//	 * @JsonProperty("tq_10_v25")
//	 */
//	public void setTq_10_v25(TQ_ST_v25 tq_10_v25) {
//		this.tq_10_v25 = tq_10_v25;
//	}
//
//	@Override
//	public String toString() {
//		return "OSD_ST [id=" + id + ", osd_1_sequenceResultsFlag=" + osd_1_sequenceResultsFlag
//				+ ", osd_2_placerOrderNumber=" + osd_2_placerOrderNumber + ", osd_3_placerOrderNumberNamespaceId="
//				+ osd_3_placerOrderNumberNamespaceId + ", osd_4_fillerOrderNumber=" + osd_4_fillerOrderNumber
//				+ ", osd_5_fillerOrderNumber=" + osd_5_fillerOrderNumber + ", osd_6_sequenceConditionValue="
//				+ osd_6_sequenceConditionValue + ", osd_7_maximumNumberOfRepeats=" + osd_7_maximumNumberOfRepeats
//				+ ", osd_8_placerOrderNumber=" + osd_8_placerOrderNumber + ", osd_9_placerOrderNumber="
//				+ osd_9_placerOrderNumber + ", osd_10_fillerOrderNumberUniversalID="
//				+ osd_10_fillerOrderNumberUniversalID + ", osd_11_fillerOrderNumberUniversalIDType="
//				+ osd_11_fillerOrderNumberUniversalIDType + ", tq_10_v25=" + "]";
//	}
//	
//	
//}
