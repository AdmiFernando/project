//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
////import scratch.coding.segment.base.v25.ORC_ST_v25;
////import scratch.coding.segment.base.v25.PID_ST_v25;
//
//@Table(name="CWE_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CWE_ST_v25 {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CWE_ID")
//	private Long id;
//	@Column(name="CWE_1_v25")
//	@JsonProperty("cwe_1_identifier")
//	private String cwe_1_identifier;
//	@Column(name="CWE_2_v25")
//	@JsonProperty("cwe_2_text")
//	private String cwe_2_text;
//	@Column(name="CWE_3_v25")
//	@JsonProperty("cwe_3_nameOfCodingSystem")
//	private String cwe_3_nameOfCodingSystem;
//	@Column(name="CWE_4_v25")
//	@JsonProperty("cwe_4_alternateIdentifier")
//	private String cwe_4_alternateIdentifier;
//	@Column(name="CWE_5_v25")
//	@JsonProperty("cwe_5_alternateText")
//	private String cwe_5_alternateText;
//	@Column(name="CWE_6_v25")
//	@JsonProperty("cwe_6_nameOfAlternateCodingSystem")
//	private String cwe_6_nameOfAlternateCodingSystem;
//	@Column(name="CWE_7_v25")
//	@JsonProperty("cwe_7_codingSystemVersionId")
//	private String cwe_7_codingSystemVersionId;
//	@Column(name="CWE_8_v25")
//	@JsonProperty("cwe_8_alternateCodingSystemVersionId")
//	private String cwe_8_alternateCodingSystemVersionId;
//	@Column(name="CWE_9_v25")
//	@JsonProperty("cwe_9_originalText")
//	private String cwe_9_originalText;
//	   
//		
//	public CWE_ST_v25(String cwe_1_identifier, String cwe_2_text, String cwe_3_nameOfCodingSystem,
//			String cwe_4_alternateIdentifier, String cwe_5_alternateText, String cwe_6_nameOfAlternateCodingSystem,
//			String cwe_7_codingSystemVersionId, String cwe_8_alternateCodingSystemVersionId,
//			String cwe_9_originalText) {
//		super();
//		this.cwe_1_identifier = cwe_1_identifier;
//		this.cwe_2_text = cwe_2_text;
//		this.cwe_3_nameOfCodingSystem = cwe_3_nameOfCodingSystem;
//		this.cwe_4_alternateIdentifier = cwe_4_alternateIdentifier;
//		this.cwe_5_alternateText = cwe_5_alternateText;
//		this.cwe_6_nameOfAlternateCodingSystem = cwe_6_nameOfAlternateCodingSystem;
//		this.cwe_7_codingSystemVersionId = cwe_7_codingSystemVersionId;
//		this.cwe_8_alternateCodingSystemVersionId = cwe_8_alternateCodingSystemVersionId;
//		this.cwe_9_originalText = cwe_9_originalText;
//	}
//	public CWE_ST_v25() {
//		super();
//	}
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * @return the cwe_1_identifier
//	 *	@JsonProperty("cwe_1_identifier")
//	 */
//	
//	public String getCwe_1_identifier() {
//		return cwe_1_identifier;
//	}
//	/**
//	 * @param cwe_1_identifier the cwe_1_identifier to set
//	 * @JsonProperty("cwe_1_identifier")
//	 */
//	public void setCwe_1_identifier(String cwe_1_identifier) {
//		this.cwe_1_identifier = cwe_1_identifier;
//	}
//	/**
//	 * @return the cwe_2_text
//	 *	@JsonProperty("cwe_2_text")
//	 */
//	
//	public String getCwe_2_text() {
//		return cwe_2_text;
//	}
//	/**
//	 * @param cwe_2_text the cwe_2_text to set
//	 * @JsonProperty("cwe_2_text")
//	 */
//	public void setCwe_2_text(String cwe_2_text) {
//		this.cwe_2_text = cwe_2_text;
//	}
//	/**
//	 * @return the cwe_3_nameOfCodingSystem
//	 *	@JsonProperty("cwe_3_nameOfCodingSystem")
//	 */
//	
//	public String getCwe_3_nameOfCodingSystem() {
//		return cwe_3_nameOfCodingSystem;
//	}
//	/**
//	 * @param cwe_3_nameOfCodingSystem the cwe_3_nameOfCodingSystem to set
//	 * @JsonProperty("cwe_3_nameOfCodingSystem")
//	 */
//	public void setCwe_3_nameOfCodingSystem(String cwe_3_nameOfCodingSystem) {
//		this.cwe_3_nameOfCodingSystem = cwe_3_nameOfCodingSystem;
//	}
//	/**
//	 * @return the cwe_4_alternateIdentifier
//	 *	@JsonProperty("cwe_4_alternateIdentifier")
//	 */
//	
//	public String getCwe_4_alternateIdentifier() {
//		return cwe_4_alternateIdentifier;
//	}
//	/**
//	 * @param cwe_4_alternateIdentifier the cwe_4_alternateIdentifier to set
//	 * @JsonProperty("cwe_4_alternateIdentifier")
//	 */
//	public void setCwe_4_alternateIdentifier(String cwe_4_alternateIdentifier) {
//		this.cwe_4_alternateIdentifier = cwe_4_alternateIdentifier;
//	}
//	/**
//	 * @return the cwe_5_alternateText
//	 *	@JsonProperty("cwe_5_alternateText")
//	 */
//	
//	public String getCwe_5_alternateText() {
//		return cwe_5_alternateText;
//	}
//	/**
//	 * @param cwe_5_alternateText the cwe_5_alternateText to set
//	 * @JsonProperty("cwe_5_alternateText")
//	 */
//	public void setCwe_5_alternateText(String cwe_5_alternateText) {
//		this.cwe_5_alternateText = cwe_5_alternateText;
//	}
//	/**
//	 * @return the cwe_6_nameOfAlternateCodingSystem
//	 *	@JsonProperty("cwe_6_nameOfAlternateCodingSystem")
//	 */
//	
//	public String getCwe_6_nameOfAlternateCodingSystem() {
//		return cwe_6_nameOfAlternateCodingSystem;
//	}
//	/**
//	 * @param cwe_6_nameOfAlternateCodingSystem the cwe_6_nameOfAlternateCodingSystem to set
//	 * @JsonProperty("cwe_6_nameOfAlternateCodingSystem")
//	 */
//	public void setCwe_6_nameOfAlternateCodingSystem(String cwe_6_nameOfAlternateCodingSystem) {
//		this.cwe_6_nameOfAlternateCodingSystem = cwe_6_nameOfAlternateCodingSystem;
//	}
//	/**
//	 * @return the cwe_7_codingSystemVersionId
//	 *	@JsonProperty("cwe_7_codingSystemVersionId")
//	 */
//	
//	public String getCwe_7_codingSystemVersionId() {
//		return cwe_7_codingSystemVersionId;
//	}
//	/**
//	 * @param cwe_7_codingSystemVersionId the cwe_7_codingSystemVersionId to set
//	 * @JsonProperty("cwe_7_codingSystemVersionId")
//	 */
//	public void setCwe_7_codingSystemVersionId(String cwe_7_codingSystemVersionId) {
//		this.cwe_7_codingSystemVersionId = cwe_7_codingSystemVersionId;
//	}
//	/**
//	 * @return the cwe_8_alternateCodingSystemVersionId
//	 *	@JsonProperty("cwe_8_alternateCodingSystemVersionId")
//	 */
//	
//	public String getCwe_8_alternateCodingSystemVersionId() {
//		return cwe_8_alternateCodingSystemVersionId;
//	}
//	/**
//	 * @param cwe_8_alternateCodingSystemVersionId the cwe_8_alternateCodingSystemVersionId to set
//	 * @JsonProperty("cwe_8_alternateCodingSystemVersionId")
//	 */
//	public void setCwe_8_alternateCodingSystemVersionId(String cwe_8_alternateCodingSystemVersionId) {
//		this.cwe_8_alternateCodingSystemVersionId = cwe_8_alternateCodingSystemVersionId;
//	}
//	/**
//	 * @return the cwe_9_originalText
//	 *	@JsonProperty("cwe_9_originalText")
//	 */
//	
//	public String getCwe_9_originalText() {
//		return cwe_9_originalText;
//	}
//	/**
//	 * @param cwe_9_originalText the cwe_9_originalText to set
//	 * @JsonProperty("cwe_9_originalText")
//	 */
//	public void setCwe_9_originalText(String cwe_9_originalText) {
//		this.cwe_9_originalText = cwe_9_originalText;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(cwe_1_identifier, cwe_2_text, cwe_3_nameOfCodingSystem, cwe_4_alternateIdentifier,
//				cwe_5_alternateText, cwe_6_nameOfAlternateCodingSystem, cwe_7_codingSystemVersionId,
//				cwe_8_alternateCodingSystemVersionId, cwe_9_originalText, id);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CWE_ST_v25 other = (CWE_ST_v25) obj;
//		return Objects.equals(cwe_1_identifier, other.cwe_1_identifier) && Objects.equals(cwe_2_text, other.cwe_2_text)
//				&& Objects.equals(cwe_3_nameOfCodingSystem, other.cwe_3_nameOfCodingSystem)
//				&& Objects.equals(cwe_4_alternateIdentifier, other.cwe_4_alternateIdentifier)
//				&& Objects.equals(cwe_5_alternateText, other.cwe_5_alternateText)
//				&& Objects.equals(cwe_6_nameOfAlternateCodingSystem, other.cwe_6_nameOfAlternateCodingSystem)
//				&& Objects.equals(cwe_7_codingSystemVersionId, other.cwe_7_codingSystemVersionId)
//				&& Objects.equals(cwe_8_alternateCodingSystemVersionId, other.cwe_8_alternateCodingSystemVersionId)
//				&& Objects.equals(cwe_9_originalText, other.cwe_9_originalText) && Objects.equals(id, other.id);
//	}
//	
//	
//}
