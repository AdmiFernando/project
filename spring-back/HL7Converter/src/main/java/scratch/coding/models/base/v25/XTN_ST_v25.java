//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
////import scratch.coding.segment.base.v25.ORC_ST_v25;
////import scratch.coding.segment.base.v25.PID_ST_v25;
//
//@Table(name="XTN_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XTN_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="XTN_ID")
//	private Long id;
//	@Column(name="XTN_1_v25")
//	@JsonProperty("xtn_1_telephoneNumber")
//	private String xtn_1_telephoneNumber;
//	@Column(name="XTN_2_v25")
//	@JsonProperty("xtn_2_telecommunicationUseCode")
//	private String xtn_2_telecommunicationUseCode;
//	@Column(name="XTN_3_v25")
//	@JsonProperty("xtn_3_telecommunicationEquipmentType")
//	private String xtn_3_telecommunicationEquipmentType;
//	@Column(name="XTN_4_v25")
//	@JsonProperty("xtn_4_emailAddress")
//	private String xtn_4_emailAddress;
//	@Column(name="XTN_5_v25")
//	@JsonProperty("xtn_5_countryCode")
//	private String xtn_5_countryCode;
//	@Column(name="XTN_6_v25")
//	@JsonProperty("xtn_6_areaCityCode")
//	private String xtn_6_areaCityCode;
//	@Column(name="XTN_7_v25")
//	@JsonProperty("xtn_7_localNumber")
//	private String xtn_7_localNumber;
//	@Column(name="XTN_8_v25")
//	@JsonProperty("xtn_8_extension")
//	private String xtn_8_extension;
//	@Column(name="XTN_9_v25")
//	@JsonProperty("xtn_9_anyText")
//	private String xtn_9_anyText;
//	@Column(name="XTN_10_v25")
//	@JsonProperty("xtn_10_extensionPrefix")
//	private String xtn_10_extensionPrefix;
//	@Column(name="XTN_11_v25")
//	@JsonProperty("xtn_11_SpeedDialCode")
//	private String xtn_11_SpeedDialCode;
//	@Column(name="XTN_12_v25")
//	@JsonProperty("xtn_12_unformattedTelephoneNumber")
//	private String xtn_12_unformattedTelephoneNumber;
//	
//
//	public XTN_ST_v25(String xtn_1_telephoneNumber, String xtn_2_telecommunicationUseCode,
//			String xtn_3_telecommunicationEquipmentType, String xtn_4_emailAddress, String xtn_5_countryCode,
//			String xtn_6_areaCityCode, String xtn_7_localNumber, String xtn_8_extension, String xtn_9_anyText,
//			String xtn_10_extensionPrefix, String xtn_11_SpeedDialCode, String xtn_12_unformattedTelephoneNumber) {
//		super();
//		this.xtn_1_telephoneNumber = xtn_1_telephoneNumber;
//		this.xtn_2_telecommunicationUseCode = xtn_2_telecommunicationUseCode;
//		this.xtn_3_telecommunicationEquipmentType = xtn_3_telecommunicationEquipmentType;
//		this.xtn_4_emailAddress = xtn_4_emailAddress;
//		this.xtn_5_countryCode = xtn_5_countryCode;
//		this.xtn_6_areaCityCode = xtn_6_areaCityCode;
//		this.xtn_7_localNumber = xtn_7_localNumber;
//		this.xtn_8_extension = xtn_8_extension;
//		this.xtn_9_anyText = xtn_9_anyText;
//		this.xtn_10_extensionPrefix = xtn_10_extensionPrefix;
//		this.xtn_11_SpeedDialCode = xtn_11_SpeedDialCode;
//		this.xtn_12_unformattedTelephoneNumber = xtn_12_unformattedTelephoneNumber;
//	}
//
//	public XTN_ST_v25() {
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
//	 * @return the xtn_1_telephoneNumber
//	 *	@JsonProperty("xtn_1_telephoneNumber")
//	 */
//	
//	public String getXtn_1_telephoneNumber() {
//		return xtn_1_telephoneNumber;
//	}
//
//	/**
//	 * @param xtn_1_telephoneNumber the xtn_1_telephoneNumber to set
//	 * @JsonProperty("xtn_1_telephoneNumber")
//	 */
//	public void setXtn_1_telephoneNumber(String xtn_1_telephoneNumber) {
//		this.xtn_1_telephoneNumber = xtn_1_telephoneNumber;
//	}
//
//	/**
//	 * @return the xtn_2_telecommunicationUseCode
//	 *	@JsonProperty("xtn_2_telecommunicationUseCode")
//	 */
//	
//	public String getXtn_2_telecommunicationUseCode() {
//		return xtn_2_telecommunicationUseCode;
//	}
//
//	/**
//	 * @param xtn_2_telecommunicationUseCode the xtn_2_telecommunicationUseCode to set
//	 * @JsonProperty("xtn_2_telecommunicationUseCode")
//	 */
//	public void setXtn_2_telecommunicationUseCode(String xtn_2_telecommunicationUseCode) {
//		this.xtn_2_telecommunicationUseCode = xtn_2_telecommunicationUseCode;
//	}
//
//	/**
//	 * @return the xtn_3_telecommunicationEquipmentType
//	 *	@JsonProperty("xtn_3_telecommunicationEquipmentType")
//	 */
//	
//	public String getXtn_3_telecommunicationEquipmentType() {
//		return xtn_3_telecommunicationEquipmentType;
//	}
//
//	/**
//	 * @param xtn_3_telecommunicationEquipmentType the xtn_3_telecommunicationEquipmentType to set
//	 * @JsonProperty("xtn_3_telecommunicationEquipmentType")
//	 */
//	public void setXtn_3_telecommunicationEquipmentType(String xtn_3_telecommunicationEquipmentType) {
//		this.xtn_3_telecommunicationEquipmentType = xtn_3_telecommunicationEquipmentType;
//	}
//
//	/**
//	 * @return the xtn_4_emailAddress
//	 *	@JsonProperty("xtn_4_emailAddress")
//	 */
//	
//	public String getXtn_4_emailAddress() {
//		return xtn_4_emailAddress;
//	}
//
//	/**
//	 * @param xtn_4_emailAddress the xtn_4_emailAddress to set
//	 * @JsonProperty("xtn_4_emailAddress")
//	 */
//	public void setXtn_4_emailAddress(String xtn_4_emailAddress) {
//		this.xtn_4_emailAddress = xtn_4_emailAddress;
//	}
//
//	/**
//	 * @return the xtn_5_countryCode
//	 *	@JsonProperty("xtn_5_countryCode")
//	 */
//	
//	public String getXtn_5_countryCode() {
//		return xtn_5_countryCode;
//	}
//
//	/**
//	 * @param xtn_5_countryCode the xtn_5_countryCode to set
//	 * @JsonProperty("xtn_5_countryCode")
//	 */
//	public void setXtn_5_countryCode(String xtn_5_countryCode) {
//		this.xtn_5_countryCode = xtn_5_countryCode;
//	}
//
//	/**
//	 * @return the xtn_6_areaCityCode
//	 *	@JsonProperty("xtn_6_areaCityCode")
//	 */
//	
//	public String getXtn_6_areaCityCode() {
//		return xtn_6_areaCityCode;
//	}
//
//	/**
//	 * @param xtn_6_areaCityCode the xtn_6_areaCityCode to set
//	 * @JsonProperty("xtn_6_areaCityCode")
//	 */
//	public void setXtn_6_areaCityCode(String xtn_6_areaCityCode) {
//		this.xtn_6_areaCityCode = xtn_6_areaCityCode;
//	}
//
//	/**
//	 * @return the xtn_7_localNumber
//	 *	@JsonProperty("xtn_7_localNumber")
//	 */
//	
//	public String getXtn_7_localNumber() {
//		return xtn_7_localNumber;
//	}
//
//	/**
//	 * @param xtn_7_localNumber the xtn_7_localNumber to set
//	 * @JsonProperty("xtn_7_localNumber")
//	 */
//	public void setXtn_7_localNumber(String xtn_7_localNumber) {
//		this.xtn_7_localNumber = xtn_7_localNumber;
//	}
//
//	/**
//	 * @return the xtn_8_extension
//	 *	@JsonProperty("xtn_8_extension")
//	 */
//	
//	public String getXtn_8_extension() {
//		return xtn_8_extension;
//	}
//
//	/**
//	 * @param xtn_8_extension the xtn_8_extension to set
//	 * @JsonProperty("xtn_8_extension")
//	 */
//	public void setXtn_8_extension(String xtn_8_extension) {
//		this.xtn_8_extension = xtn_8_extension;
//	}
//
//	/**
//	 * @return the xtn_9_anyText
//	 *	@JsonProperty("xtn_9_anyText")
//	 */
//	
//	public String getXtn_9_anyText() {
//		return xtn_9_anyText;
//	}
//
//	/**
//	 * @param xtn_9_anyText the xtn_9_anyText to set
//	 * @JsonProperty("xtn_9_anyText")
//	 */
//	public void setXtn_9_anyText(String xtn_9_anyText) {
//		this.xtn_9_anyText = xtn_9_anyText;
//	}
//
//	/**
//	 * @return the xtn_10_extensionPrefix
//	 *	@JsonProperty("xtn_10_extensionPrefix")
//	 */
//	
//	public String getXtn_10_extensionPrefix() {
//		return xtn_10_extensionPrefix;
//	}
//
//	/**
//	 * @param xtn_10_extensionPrefix the xtn_10_extensionPrefix to set
//	 * @JsonProperty("xtn_10_extensionPrefix")
//	 */
//	public void setXtn_10_extensionPrefix(String xtn_10_extensionPrefix) {
//		this.xtn_10_extensionPrefix = xtn_10_extensionPrefix;
//	}
//
//	/**
//	 * @return the xtn_11_SpeedDialCode
//	 *	@JsonProperty("xtn_11_SpeedDialCode")
//	 */
//	
//	public String getXtn_11_SpeedDialCode() {
//		return xtn_11_SpeedDialCode;
//	}
//
//	/**
//	 * @param xtn_11_SpeedDialCode the xtn_11_SpeedDialCode to set
//	 * @JsonProperty("xtn_11_SpeedDialCode")
//	 */
//	public void setXtn_11_SpeedDialCode(String xtn_11_SpeedDialCode) {
//		this.xtn_11_SpeedDialCode = xtn_11_SpeedDialCode;
//	}
//
//	/**
//	 * @return the xtn_12_unformattedTelephoneNumber
//	 *	@JsonProperty("xtn_12_unformattedTelephoneNumber")
//	 */
//	
//	public String getXtn_12_unformattedTelephoneNumber() {
//		return xtn_12_unformattedTelephoneNumber;
//	}
//
//	/**
//	 * @param xtn_12_unformattedTelephoneNumber the xtn_12_unformattedTelephoneNumber to set
//	 * @JsonProperty("xtn_12_unformattedTelephoneNumber")
//	 */
//	public void setXtn_12_unformattedTelephoneNumber(String xtn_12_unformattedTelephoneNumber) {
//		this.xtn_12_unformattedTelephoneNumber = xtn_12_unformattedTelephoneNumber;
//	}
//
//	@Override
//	public String toString() {
//		return "XTN_ST_v25 [id=" + id + ", xtn_1_telephoneNumber=" + xtn_1_telephoneNumber
//				+ ", xtn_2_telecommunicationUseCode=" + xtn_2_telecommunicationUseCode
//				+ ", xtn_3_telecommunicationEquipmentType=" + xtn_3_telecommunicationEquipmentType
//				+ ", xtn_4_emailAddress=" + xtn_4_emailAddress + ", xtn_5_countryCode=" + xtn_5_countryCode
//				+ ", xtn_6_areaCityCode=" + xtn_6_areaCityCode + ", xtn_7_localNumber=" + xtn_7_localNumber
//				+ ", xtn_8_extension=" + xtn_8_extension + ", xtn_9_anyText=" + xtn_9_anyText
//				+ ", xtn_10_extensionPrefix=" + xtn_10_extensionPrefix + ", xtn_11_SpeedDialCode="
//				+ xtn_11_SpeedDialCode + ", xtn_12_unformattedTelephoneNumber=" + xtn_12_unformattedTelephoneNumber
//				+ "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, xtn_10_extensionPrefix, xtn_11_SpeedDialCode, xtn_12_unformattedTelephoneNumber,
//				xtn_1_telephoneNumber, xtn_2_telecommunicationUseCode, xtn_3_telecommunicationEquipmentType,
//				xtn_4_emailAddress, xtn_5_countryCode, xtn_6_areaCityCode, xtn_7_localNumber, xtn_8_extension,
//				xtn_9_anyText);
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
//		XTN_ST_v25 other = (XTN_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(xtn_10_extensionPrefix, other.xtn_10_extensionPrefix)
//				&& Objects.equals(xtn_11_SpeedDialCode, other.xtn_11_SpeedDialCode)
//				&& Objects.equals(xtn_12_unformattedTelephoneNumber, other.xtn_12_unformattedTelephoneNumber)
//				&& Objects.equals(xtn_1_telephoneNumber, other.xtn_1_telephoneNumber)
//				&& Objects.equals(xtn_2_telecommunicationUseCode, other.xtn_2_telecommunicationUseCode)
//				&& Objects.equals(xtn_3_telecommunicationEquipmentType, other.xtn_3_telecommunicationEquipmentType)
//				&& Objects.equals(xtn_4_emailAddress, other.xtn_4_emailAddress)
//				&& Objects.equals(xtn_5_countryCode, other.xtn_5_countryCode)
//				&& Objects.equals(xtn_6_areaCityCode, other.xtn_6_areaCityCode)
//				&& Objects.equals(xtn_7_localNumber, other.xtn_7_localNumber)
//				&& Objects.equals(xtn_8_extension, other.xtn_8_extension)
//				&& Objects.equals(xtn_9_anyText, other.xtn_9_anyText);
//	}
//
//	
//}
