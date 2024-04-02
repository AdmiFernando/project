//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
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
//import scratch.coding.models.base.HD_ST;
//
//@Table(name="XON_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XON_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="XON_ID")
//	private Long id;
//	@Column(name="XON_1_v25")
//	@JsonProperty("xon_1_organizationName")
//	private String xon_1_organizationName;
//	@Column(name="XON_2_v25")
//	@JsonProperty("xon_2_organizationNameTypeCode")
//	private String xon_2_organizationNameTypeCode;
//	@Column(name="XON_3_v25")
//	@JsonProperty("xon_3_idNumber")
//	private String xon_3_idNumber;
//	@Column(name="XON_4_v25")
//	@JsonProperty("xon_4_checkDigit")
//	private String xon_4_checkDigit;
//	@Column(name="XON_5_v25")
//	@JsonProperty("xon_5_checkDigitScheme")
//	private String xon_5_checkDigitScheme;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_XON_6_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("xon_6_assigningAuthority")
//	private HD_ST xon_6_assigningAuthority;
//	@Column(name="XON_7_v25")
//	@JsonProperty("xon_7_identifierTypeCode")
//	private String xon_7_identifierTypeCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_XON_8_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("xon_8_assigningFacility")
//	private HD_ST xon_8_assigningFacility;
//	@Column(name="XON_9_v25")
//	@JsonProperty("xon_9_nameRepresentationCode")
//	private String xon_9_nameRepresentationCode;
//	@Column(name="XON_10_v25")
//	@JsonProperty("xon_10_organizationIdentifier")
//	private String xon_10_organizationIdentifier;
//
//	public XON_ST_v25(String xon_1_organizationName, String xon_2_organizationNameTypeCode, String xon_3_idNumber,
//			String xon_4_checkDigit, String xon_5_checkDigitScheme, HD_ST xon_6_assigningAuthority,
//			String xon_7_identifierTypeCode, HD_ST xon_8_assigningFacility, String xon_9_nameRepresentationCode,
//			String xon_10_organizationIdentifier) {
//		super();
//		this.xon_1_organizationName = xon_1_organizationName;
//		this.xon_2_organizationNameTypeCode = xon_2_organizationNameTypeCode;
//		this.xon_3_idNumber = xon_3_idNumber;
//		this.xon_4_checkDigit = xon_4_checkDigit;
//		this.xon_5_checkDigitScheme = xon_5_checkDigitScheme;
//		this.xon_6_assigningAuthority = xon_6_assigningAuthority;
//		this.xon_7_identifierTypeCode = xon_7_identifierTypeCode;
//		this.xon_8_assigningFacility = xon_8_assigningFacility;
//		this.xon_9_nameRepresentationCode = xon_9_nameRepresentationCode;
//		this.xon_10_organizationIdentifier = xon_10_organizationIdentifier;
//	}
//
//	public XON_ST_v25() {
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
//	 * @return the xon_1_organizationName
//	 *	@JsonProperty("xon_1_organizationName")
//	 */
//	
//	public String getXon_1_organizationName() {
//		return xon_1_organizationName;
//	}
//
//	/**
//	 * @param xon_1_organizationName the xon_1_organizationName to set
//	 * @JsonProperty("xon_1_organizationName")
//	 */
//	public void setXon_1_organizationName(String xon_1_organizationName) {
//		this.xon_1_organizationName = xon_1_organizationName;
//	}
//
//	/**
//	 * @return the xon_2_organizationNameTypeCode
//	 *	@JsonProperty("xon_2_organizationNameTypeCode")
//	 */
//	
//	public String getXon_2_organizationNameTypeCode() {
//		return xon_2_organizationNameTypeCode;
//	}
//
//	/**
//	 * @param xon_2_organizationNameTypeCode the xon_2_organizationNameTypeCode to set
//	 * @JsonProperty("xon_2_organizationNameTypeCode")
//	 */
//	public void setXon_2_organizationNameTypeCode(String xon_2_organizationNameTypeCode) {
//		this.xon_2_organizationNameTypeCode = xon_2_organizationNameTypeCode;
//	}
//
//	/**
//	 * @return the xon_3_idNumber
//	 *	@JsonProperty("xon_3_idNumber")
//	 */
//	
//	public String getXon_3_idNumber() {
//		return xon_3_idNumber;
//	}
//
//	/**
//	 * @param xon_3_idNumber the xon_3_idNumber to set
//	 * @JsonProperty("xon_3_idNumber")
//	 */
//	public void setXon_3_idNumber(String xon_3_idNumber) {
//		this.xon_3_idNumber = xon_3_idNumber;
//	}
//
//	/**
//	 * @return the xon_4_checkDigit
//	 *	@JsonProperty("xon_4_checkDigit")
//	 */
//	
//	public String getXon_4_checkDigit() {
//		return xon_4_checkDigit;
//	}
//
//	/**
//	 * @param xon_4_checkDigit the xon_4_checkDigit to set
//	 * @JsonProperty("xon_4_checkDigit")
//	 */
//	public void setXon_4_checkDigit(String xon_4_checkDigit) {
//		this.xon_4_checkDigit = xon_4_checkDigit;
//	}
//
//	/**
//	 * @return the xon_5_checkDigitScheme
//	 *	@JsonProperty("xon_5_checkDigitScheme")
//	 */
//	
//	public String getXon_5_checkDigitScheme() {
//		return xon_5_checkDigitScheme;
//	}
//
//	/**
//	 * @param xon_5_checkDigitScheme the xon_5_checkDigitScheme to set
//	 * @JsonProperty("xon_5_checkDigitScheme")
//	 */
//	public void setXon_5_checkDigitScheme(String xon_5_checkDigitScheme) {
//		this.xon_5_checkDigitScheme = xon_5_checkDigitScheme;
//	}
//
//	/**
//	 * @return the xon_6_assigningAuthority
//	 *	@JsonProperty("xon_6_assigningAuthority")
//	 */
//	
//	public HD_ST getXon_6_assigningAuthority() {
//		return xon_6_assigningAuthority;
//	}
//
//	/**
//	 * @param xon_6_assigningAuthority the xon_6_assigningAuthority to set
//	 * @JsonProperty("xon_6_assigningAuthority")
//	 */
//	public void setXon_6_assigningAuthority(HD_ST xon_6_assigningAuthority) {
//		this.xon_6_assigningAuthority = xon_6_assigningAuthority;
//	}
//
//	/**
//	 * @return the xon_7_identifierTypeCode
//	 *	@JsonProperty("xon_7_identifierTypeCode")
//	 */
//	
//	public String getXon_7_identifierTypeCode() {
//		return xon_7_identifierTypeCode;
//	}
//
//	/**
//	 * @param xon_7_identifierTypeCode the xon_7_identifierTypeCode to set
//	 * @JsonProperty("xon_7_identifierTypeCode")
//	 */
//	public void setXon_7_identifierTypeCode(String xon_7_identifierTypeCode) {
//		this.xon_7_identifierTypeCode = xon_7_identifierTypeCode;
//	}
//
//	/**
//	 * @return the xon_8_assigningFacility
//	 *	@JsonProperty("xon_8_assigningFacility")
//	 */
//	
//	public HD_ST getXon_8_assigningFacility() {
//		return xon_8_assigningFacility;
//	}
//
//	/**
//	 * @param xon_8_assigningFacility the xon_8_assigningFacility to set
//	 * @JsonProperty("xon_8_assigningFacility")
//	 */
//	public void setXon_8_assigningFacility(HD_ST xon_8_assigningFacility) {
//		this.xon_8_assigningFacility = xon_8_assigningFacility;
//	}
//
//	/**
//	 * @return the xon_9_nameRepresentationCode
//	 *	@JsonProperty("xon_9_nameRepresentationCode")
//	 */
//	
//	public String getXon_9_nameRepresentationCode() {
//		return xon_9_nameRepresentationCode;
//	}
//
//	/**
//	 * @param xon_9_nameRepresentationCode the xon_9_nameRepresentationCode to set
//	 * @JsonProperty("xon_9_nameRepresentationCode")
//	 */
//	public void setXon_9_nameRepresentationCode(String xon_9_nameRepresentationCode) {
//		this.xon_9_nameRepresentationCode = xon_9_nameRepresentationCode;
//	}
//
//	/**
//	 * @return the xon_10_organizationIdentifier
//	 *	@JsonProperty("xon_10_organizationIdentifier")
//	 */
//	
//	public String getXon_10_organizationIdentifier() {
//		return xon_10_organizationIdentifier;
//	}
//
//	/**
//	 * @param xon_10_organizationIdentifier the xon_10_organizationIdentifier to set
//	 * @JsonProperty("xon_10_organizationIdentifier")
//	 */
//	public void setXon_10_organizationIdentifier(String xon_10_organizationIdentifier) {
//		this.xon_10_organizationIdentifier = xon_10_organizationIdentifier;
//	}
//
//	@Override
//	public String toString() {
//		return "XON_ST_v25 [id=" + id + ", xon_1_organizationName=" + xon_1_organizationName
//				+ ", xon_2_organizationNameTypeCode=" + xon_2_organizationNameTypeCode + ", xon_3_idNumber="
//				+ xon_3_idNumber + ", xon_4_checkDigit=" + xon_4_checkDigit + ", xon_5_checkDigitScheme="
//				+ xon_5_checkDigitScheme + ", xon_6_assigningAuthority=" + xon_6_assigningAuthority
//				+ ", xon_7_identifierTypeCode=" + xon_7_identifierTypeCode + ", xon_8_assigningFacility="
//				+ xon_8_assigningFacility + ", xon_9_nameRepresentationCode=" + xon_9_nameRepresentationCode
//				+ ", xon_10_organizationIdentifier=" + xon_10_organizationIdentifier + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, xon_10_organizationIdentifier, xon_1_organizationName, xon_2_organizationNameTypeCode,
//				xon_3_idNumber, xon_4_checkDigit, xon_5_checkDigitScheme, xon_6_assigningAuthority,
//				xon_7_identifierTypeCode, xon_8_assigningFacility, xon_9_nameRepresentationCode);
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
//		XON_ST_v25 other = (XON_ST_v25) obj;
//		return Objects.equals(id, other.id)
//				&& Objects.equals(xon_10_organizationIdentifier, other.xon_10_organizationIdentifier)
//				&& Objects.equals(xon_1_organizationName, other.xon_1_organizationName)
//				&& Objects.equals(xon_2_organizationNameTypeCode, other.xon_2_organizationNameTypeCode)
//				&& Objects.equals(xon_3_idNumber, other.xon_3_idNumber)
//				&& Objects.equals(xon_4_checkDigit, other.xon_4_checkDigit)
//				&& Objects.equals(xon_5_checkDigitScheme, other.xon_5_checkDigitScheme)
//				&& Objects.equals(xon_6_assigningAuthority, other.xon_6_assigningAuthority)
//				&& Objects.equals(xon_7_identifierTypeCode, other.xon_7_identifierTypeCode)
//				&& Objects.equals(xon_8_assigningFacility, other.xon_8_assigningFacility)
//				&& Objects.equals(xon_9_nameRepresentationCode, other.xon_9_nameRepresentationCode);
//	}
//	
//}
