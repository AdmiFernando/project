//package scratch.coding.models.base;
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
//import scratch.coding.models.base.v25.CQ_ST_v25;
//import scratch.coding.models.base.v25.TQ_ST_v25;
//import scratch.coding.models.base.v25.VID_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//@Table(name="CE_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CE_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CE_ID")
//	private Long id;
//	@Column(name="CE_1")
//	@JsonProperty("ce_1_identifier")
//	private String ce_1_identifier;
//	@Column(name="CE_2")
//	@JsonProperty("ce_2_text")
//	private String ce_2_text;
//	@Column(name="CE_3")
//	@JsonProperty("ce_3_nameOfCodingSystem")
//	private String ce_3_nameOfCodingSystem;
//	@Column(name="CE_4")
//	@JsonProperty("ce_4_alternateIdentifier")
//	private String ce_4_alternateIdentifier;
//	@Column(name="CE_5")
//	@JsonProperty("ce_5_alternateText")
//	private String ce_5_alternateText;
//	@Column(name="CE_6")
//	@JsonProperty("ce_6_nameOfAlternateCodingSystem")
//	private String ce_6_nameOfAlternateCodingSystem;
//
//	public CE_ST() {
//		super();
//	}
//	public CE_ST(String ce_1_identifier, String ce_2_text, String ce_3_nameOfCodingSystem,
//			String ce_4_alternateIdentifier, String ce_5_alternateText, String ce_6_nameOfAlternateCodingSystem) {
//		super();
//		this.ce_1_identifier = ce_1_identifier;
//		this.ce_2_text = ce_2_text;
//		this.ce_3_nameOfCodingSystem = ce_3_nameOfCodingSystem;
//		this.ce_4_alternateIdentifier = ce_4_alternateIdentifier;
//		this.ce_5_alternateText = ce_5_alternateText;
//		this.ce_6_nameOfAlternateCodingSystem = ce_6_nameOfAlternateCodingSystem;
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
//	 * @return the ce_1_identifier
//	 *	@JsonProperty("ce_1_identifier")
//	 */
//	
//	public String getCe_1_identifier() {
//		return ce_1_identifier;
//	}
//	/**
//	 * @param ce_1_identifier the ce_1_identifier to set
//	 * @JsonProperty("ce_1_identifier")
//	 */
//	public void setCe_1_identifier(String ce_1_identifier) {
//		this.ce_1_identifier = ce_1_identifier;
//	}
//	/**
//	 * @return the ce_2_text
//	 *	@JsonProperty("ce_2_text")
//	 */
//	
//	public String getCe_2_text() {
//		return ce_2_text;
//	}
//	/**
//	 * @param ce_2_text the ce_2_text to set
//	 * @JsonProperty("ce_2_text")
//	 */
//	public void setCe_2_text(String ce_2_text) {
//		this.ce_2_text = ce_2_text;
//	}
//	/**
//	 * @return the ce_3_nameOfCodingSystem
//	 *	@JsonProperty("ce_3_nameOfCodingSystem")
//	 */
//	
//	public String getCe_3_nameOfCodingSystem() {
//		return ce_3_nameOfCodingSystem;
//	}
//	/**
//	 * @param ce_3_nameOfCodingSystem the ce_3_nameOfCodingSystem to set
//	 * @JsonProperty("ce_3_nameOfCodingSystem")
//	 */
//	public void setCe_3_nameOfCodingSystem(String ce_3_nameOfCodingSystem) {
//		this.ce_3_nameOfCodingSystem = ce_3_nameOfCodingSystem;
//	}
//	/**
//	 * @return the ce_4_alternateIdentifier
//	 *	@JsonProperty("ce_4_alternateIdentifier")
//	 */
//	
//	public String getCe_4_alternateIdentifier() {
//		return ce_4_alternateIdentifier;
//	}
//	/**
//	 * @param ce_4_alternateIdentifier the ce_4_alternateIdentifier to set
//	 * @JsonProperty("ce_4_alternateIdentifier")
//	 */
//	public void setCe_4_alternateIdentifier(String ce_4_alternateIdentifier) {
//		this.ce_4_alternateIdentifier = ce_4_alternateIdentifier;
//	}
//	/**
//	 * @return the ce_5_alternateText
//	 *	@JsonProperty("ce_5_alternateText")
//	 */
//	
//	public String getCe_5_alternateText() {
//		return ce_5_alternateText;
//	}
//	/**
//	 * @param ce_5_alternateText the ce_5_alternateText to set
//	 * @JsonProperty("ce_5_alternateText")
//	 */
//	public void setCe_5_alternateText(String ce_5_alternateText) {
//		this.ce_5_alternateText = ce_5_alternateText;
//	}
//	/**
//	 * @return the ce_6_nameOfAlternateCodingSystem
//	 *	@JsonProperty("ce_6_nameOfAlternateCodingSystem")
//	 */
//	
//	public String getCe_6_nameOfAlternateCodingSystem() {
//		return ce_6_nameOfAlternateCodingSystem;
//	}
//	/**
//	 * @param ce_6_nameOfAlternateCodingSystem the ce_6_nameOfAlternateCodingSystem to set
//	 * @JsonProperty("ce_6_nameOfAlternateCodingSystem")
//	 */
//	public void setCe_6_nameOfAlternateCodingSystem(String ce_6_nameOfAlternateCodingSystem) {
//		this.ce_6_nameOfAlternateCodingSystem = ce_6_nameOfAlternateCodingSystem;
//	}
//	/**
//	 * @return the vid_2_v25
//	 *	@JsonProperty("vid_2_v25")
//	 */
//	@Override
//	public String toString() {
//		return "CE_ST [id=" + id + ", ce_1_identifier=" + ce_1_identifier + ", ce_2_text=" + ce_2_text
//				+ ", ce_3_nameOfCodingSystem=" + ce_3_nameOfCodingSystem + ", ce_4_alternateIdentifier="
//				+ ce_4_alternateIdentifier + ", ce_5_alternateText=" + ce_5_alternateText
//				+ ", ce_6_nameOfAlternateCodingSystem=" + ce_6_nameOfAlternateCodingSystem + "]";
//	}
//	
//
//}
