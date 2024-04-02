//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
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
////import scratch.coding.segment.base.v25.ORC_ST_v25;
//
//@Table(name="CNE_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CNE_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CNE_ID")
//	private Long id;
//	@Column(name="CNE_1_v25")
//	@JsonProperty("cne_1_identifier")
//	private String cne_1_identifier;
//	@Column(name="CNE_2_v25")
//	@JsonProperty("cne_2_text")
//	private String cne_2_text;
//	@Column(name="CNE_3_v25")
//	@JsonProperty("cne_3_nameOfCodingSystem")
//	private String cne_3_nameOfCodingSystem;
//	@Column(name="CNE_4_v25")
//	@JsonProperty("cne_4_alternateIdentifier")
//	private String cne_4_alternateIdentifier;
//	@Column(name="CNE_5_v25")
//	@JsonProperty("cne_5_alternateText")
//	private String cne_5_alternateText;
//	@Column(name="CNE_6_v25")
//	@JsonProperty("cne_6_nameOfAlternateCodingSystem")
//	private String cne_6_nameOfAlternateCodingSystem;
//	@Column(name="CNE_7_v25")
//	@JsonProperty("cne_7_codingSystemVersionId")
//	private String cne_7_codingSystemVersionId;
//	@Column(name="CNE_8_v25")
//	@JsonProperty("cne_8_alternateCodingSystemVersionId")
//	private String cne_8_alternateCodingSystemVersionId;
//	@Column(name="CNE_9_v25")
//	@JsonProperty("cne_9_originalText")
//	private String cne_9_originalText;
//	
////	@OneToOne(mappedBy = "orc_30_entererAuthorizationMode")
////	@JsonIgnoreProperties({"orc_30_entererAuthorizationMode"})
////	private ORC_ST_v25 orc_30_v25;
//
//	public CNE_ST_v25(String cne_1_identifier, String cne_2_text, String cne_3_nameOfCodingSystem,
//			String cne_4_alternateIdentifier, String cne_5_alternateText, String cne_6_nameOfAlternateCodingSystem,
//			String cne_7_codingSystemVersionId, String cne_8_alternateCodingSystemVersionId,
//			String cne_9_originalText) {
//		super();
//		this.cne_1_identifier = cne_1_identifier;
//		this.cne_2_text = cne_2_text;
//		this.cne_3_nameOfCodingSystem = cne_3_nameOfCodingSystem;
//		this.cne_4_alternateIdentifier = cne_4_alternateIdentifier;
//		this.cne_5_alternateText = cne_5_alternateText;
//		this.cne_6_nameOfAlternateCodingSystem = cne_6_nameOfAlternateCodingSystem;
//		this.cne_7_codingSystemVersionId = cne_7_codingSystemVersionId;
//		this.cne_8_alternateCodingSystemVersionId = cne_8_alternateCodingSystemVersionId;
//		this.cne_9_originalText = cne_9_originalText;
//	}
//
//	public CNE_ST_v25() {
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
//	 * @return the cne_1_identifier
//	 *	@JsonProperty("cne_1_identifier")
//	 */
//	
//	public String getCne_1_identifier() {
//		return cne_1_identifier;
//	}
//
//	/**
//	 * @param cne_1_identifier the cne_1_identifier to set
//	 * @JsonProperty("cne_1_identifier")
//	 */
//	public void setCne_1_identifier(String cne_1_identifier) {
//		this.cne_1_identifier = cne_1_identifier;
//	}
//
//	/**
//	 * @return the cne_2_text
//	 *	@JsonProperty("cne_2_text")
//	 */
//	
//	public String getCne_2_text() {
//		return cne_2_text;
//	}
//
//	/**
//	 * @param cne_2_text the cne_2_text to set
//	 * @JsonProperty("cne_2_text")
//	 */
//	public void setCne_2_text(String cne_2_text) {
//		this.cne_2_text = cne_2_text;
//	}
//
//	/**
//	 * @return the cne_3_nameOfCodingSystem
//	 *	@JsonProperty("cne_3_nameOfCodingSystem")
//	 */
//	
//	public String getCne_3_nameOfCodingSystem() {
//		return cne_3_nameOfCodingSystem;
//	}
//
//	/**
//	 * @param cne_3_nameOfCodingSystem the cne_3_nameOfCodingSystem to set
//	 * @JsonProperty("cne_3_nameOfCodingSystem")
//	 */
//	public void setCne_3_nameOfCodingSystem(String cne_3_nameOfCodingSystem) {
//		this.cne_3_nameOfCodingSystem = cne_3_nameOfCodingSystem;
//	}
//
//	/**
//	 * @return the cne_4_alternateIdentifier
//	 *	@JsonProperty("cne_4_alternateIdentifier")
//	 */
//	
//	public String getCne_4_alternateIdentifier() {
//		return cne_4_alternateIdentifier;
//	}
//
//	/**
//	 * @param cne_4_alternateIdentifier the cne_4_alternateIdentifier to set
//	 * @JsonProperty("cne_4_alternateIdentifier")
//	 */
//	public void setCne_4_alternateIdentifier(String cne_4_alternateIdentifier) {
//		this.cne_4_alternateIdentifier = cne_4_alternateIdentifier;
//	}
//
//	/**
//	 * @return the cne_5_alternateText
//	 *	@JsonProperty("cne_5_alternateText")
//	 */
//	
//	public String getCne_5_alternateText() {
//		return cne_5_alternateText;
//	}
//
//	/**
//	 * @param cne_5_alternateText the cne_5_alternateText to set
//	 * @JsonProperty("cne_5_alternateText")
//	 */
//	public void setCne_5_alternateText(String cne_5_alternateText) {
//		this.cne_5_alternateText = cne_5_alternateText;
//	}
//
//	/**
//	 * @return the cne_6_nameOfAlternateCodingSystem
//	 *	@JsonProperty("cne_6_nameOfAlternateCodingSystem")
//	 */
//	
//	public String getCne_6_nameOfAlternateCodingSystem() {
//		return cne_6_nameOfAlternateCodingSystem;
//	}
//
//	/**
//	 * @param cne_6_nameOfAlternateCodingSystem the cne_6_nameOfAlternateCodingSystem to set
//	 * @JsonProperty("cne_6_nameOfAlternateCodingSystem")
//	 */
//	public void setCne_6_nameOfAlternateCodingSystem(String cne_6_nameOfAlternateCodingSystem) {
//		this.cne_6_nameOfAlternateCodingSystem = cne_6_nameOfAlternateCodingSystem;
//	}
//
//	/**
//	 * @return the cne_7_codingSystemVersionId
//	 *	@JsonProperty("cne_7_codingSystemVersionId")
//	 */
//	
//	public String getCne_7_codingSystemVersionId() {
//		return cne_7_codingSystemVersionId;
//	}
//
//	/**
//	 * @param cne_7_codingSystemVersionId the cne_7_codingSystemVersionId to set
//	 * @JsonProperty("cne_7_codingSystemVersionId")
//	 */
//	public void setCne_7_codingSystemVersionId(String cne_7_codingSystemVersionId) {
//		this.cne_7_codingSystemVersionId = cne_7_codingSystemVersionId;
//	}
//
//	/**
//	 * @return the cne_8_alternateCodingSystemVersionId
//	 *	@JsonProperty("cne_8_alternateCodingSystemVersionId")
//	 */
//	
//	public String getCne_8_alternateCodingSystemVersionId() {
//		return cne_8_alternateCodingSystemVersionId;
//	}
//
//	/**
//	 * @param cne_8_alternateCodingSystemVersionId the cne_8_alternateCodingSystemVersionId to set
//	 * @JsonProperty("cne_8_alternateCodingSystemVersionId")
//	 */
//	public void setCne_8_alternateCodingSystemVersionId(String cne_8_alternateCodingSystemVersionId) {
//		this.cne_8_alternateCodingSystemVersionId = cne_8_alternateCodingSystemVersionId;
//	}
//
//	/**
//	 * @return the cne_9_originalText
//	 *	@JsonProperty("cne_9_originalText")
//	 */
//	
//	public String getCne_9_originalText() {
//		return cne_9_originalText;
//	}
//
//	/**
//	 * @param cne_9_originalText the cne_9_originalText to set
//	 * @JsonProperty("cne_9_originalText")
//	 */
//	public void setCne_9_originalText(String cne_9_originalText) {
//		this.cne_9_originalText = cne_9_originalText;
//	}
//
//	/**
//	 * @return the orc_30_v25
//	 *	@JsonProperty("orc_30_v25")
//	 */
//	
////	public ORC_ST_v25 getOrc_30_v25() {
////		return orc_30_v25;
////	}
////
////	/**
////	 * @param orc_30_v25 the orc_30_v25 to set
////	 * @JsonProperty("orc_30_v25")
////	 */
////	public void setOrc_30_v25(ORC_ST_v25 orc_30_v25) {
////		this.orc_30_v25 = orc_30_v25;
////	}
//
//	@Override
//	public String toString() {
//		return "CNE_ST_v25 [id=" + id + ", cne_1_identifier=" + cne_1_identifier + ", cne_2_text=" + cne_2_text
//				+ ", cne_3_nameOfCodingSystem=" + cne_3_nameOfCodingSystem + ", cne_4_alternateIdentifier="
//				+ cne_4_alternateIdentifier + ", cne_5_alternateText=" + cne_5_alternateText
//				+ ", cne_6_nameOfAlternateCodingSystem=" + cne_6_nameOfAlternateCodingSystem
//				+ ", cne_7_codingSystemVersionId=" + cne_7_codingSystemVersionId
//				+ ", cne_8_alternateCodingSystemVersionId=" + cne_8_alternateCodingSystemVersionId
//				+ ", cne_9_originalText=" + cne_9_originalText + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(cne_1_identifier, cne_2_text, cne_3_nameOfCodingSystem, cne_4_alternateIdentifier,
//				cne_5_alternateText, cne_6_nameOfAlternateCodingSystem, cne_7_codingSystemVersionId,
//				cne_8_alternateCodingSystemVersionId, cne_9_originalText, id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CNE_ST_v25 other = (CNE_ST_v25) obj;
//		return Objects.equals(cne_1_identifier, other.cne_1_identifier) && Objects.equals(cne_2_text, other.cne_2_text)
//				&& Objects.equals(cne_3_nameOfCodingSystem, other.cne_3_nameOfCodingSystem)
//				&& Objects.equals(cne_4_alternateIdentifier, other.cne_4_alternateIdentifier)
//				&& Objects.equals(cne_5_alternateText, other.cne_5_alternateText)
//				&& Objects.equals(cne_6_nameOfAlternateCodingSystem, other.cne_6_nameOfAlternateCodingSystem)
//				&& Objects.equals(cne_7_codingSystemVersionId, other.cne_7_codingSystemVersionId)
//				&& Objects.equals(cne_8_alternateCodingSystemVersionId, other.cne_8_alternateCodingSystemVersionId)
//				&& Objects.equals(cne_9_originalText, other.cne_9_originalText) && Objects.equals(id, other.id);
//	}
//	
//	
//}
