package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XTN_v25 {
					
	@JsonProperty("xtn_1_telephoneNumber")
	private String xtn_1_telephoneNumber;
	@JsonProperty("xtn_2_telecommunicationUseCode")
	private String xtn_2_telecommunicationUseCode;
	@JsonProperty("xtn_3_telecommunicationEquipmentType")
	private String xtn_3_telecommunicationEquipmentType;
	@JsonProperty("xtn_4_emailAddress")
	private String xtn_4_emailAddress;
	@JsonProperty("xtn_5_countryCode")
	private String xtn_5_countryCode;
	@JsonProperty("xtn_6_areaCityCode")
	private String xtn_6_areaCityCode;
	@JsonProperty("xtn_7_localNumber")
	private String xtn_7_localNumber;
	@JsonProperty("xtn_8_extension")
	private String xtn_8_extension;
	@JsonProperty("xtn_9_anyText")
	private String xtn_9_anyText;
	@JsonProperty("xtn_10_extensionPrefix")
	private String xtn_10_extensionPrefix;
	@JsonProperty("xtn_11_SpeedDialCode")
	private String xtn_11_SpeedDialCode;
	@JsonProperty("xtn_12_unformattedTelephoneNumber")
	private String xtn_12_unformattedTelephoneNumber;
	public XTN_v25(String xtn_1_telephoneNumber, String xtn_2_telecommunicationUseCode,
			String xtn_3_telecommunicationEquipmentType, String xtn_4_emailAddress, String xtn_5_countryCode,
			String xtn_6_areaCityCode, String xtn_7_localNumber, String xtn_8_extension, String xtn_9_anyText,
			String xtn_10_extensionPrefix, String xtn_11_SpeedDialCode, String xtn_12_unformattedTelephoneNumber) {
		super();
		this.xtn_1_telephoneNumber = xtn_1_telephoneNumber;
		this.xtn_2_telecommunicationUseCode = xtn_2_telecommunicationUseCode;
		this.xtn_3_telecommunicationEquipmentType = xtn_3_telecommunicationEquipmentType;
		this.xtn_4_emailAddress = xtn_4_emailAddress;
		this.xtn_5_countryCode = xtn_5_countryCode;
		this.xtn_6_areaCityCode = xtn_6_areaCityCode;
		this.xtn_7_localNumber = xtn_7_localNumber;
		this.xtn_8_extension = xtn_8_extension;
		this.xtn_9_anyText = xtn_9_anyText;
		this.xtn_10_extensionPrefix = xtn_10_extensionPrefix;
		this.xtn_11_SpeedDialCode = xtn_11_SpeedDialCode;
		this.xtn_12_unformattedTelephoneNumber = xtn_12_unformattedTelephoneNumber;
	}
	public XTN_v25() {
		super();
		this.xtn_1_telephoneNumber = "";
		this.xtn_2_telecommunicationUseCode = "";
		this.xtn_3_telecommunicationEquipmentType = "";
		this.xtn_4_emailAddress = "";
		this.xtn_5_countryCode = "";
		this.xtn_6_areaCityCode = "";
		this.xtn_7_localNumber = "";
		this.xtn_8_extension = "";
		this.xtn_9_anyText = "";
		this.xtn_10_extensionPrefix = "";
		this.xtn_11_SpeedDialCode = "";
		this.xtn_12_unformattedTelephoneNumber = "";
	}
	public String getXtn_1_telephoneNumber() {
		return xtn_1_telephoneNumber;
	}
	public void setXtn_1_telephoneNumber(String xtn_1_telephoneNumber) {
		this.xtn_1_telephoneNumber = xtn_1_telephoneNumber;
	}
	public String getXtn_2_telecommunicationUseCode() {
		return xtn_2_telecommunicationUseCode;
	}
	public void setXtn_2_telecommunicationUseCode(String xtn_2_telecommunicationUseCode) {
		this.xtn_2_telecommunicationUseCode = xtn_2_telecommunicationUseCode;
	}
	public String getXtn_3_telecommunicationEquipmentType() {
		return xtn_3_telecommunicationEquipmentType;
	}
	public void setXtn_3_telecommunicationEquipmentType(String xtn_3_telecommunicationEquipmentType) {
		this.xtn_3_telecommunicationEquipmentType = xtn_3_telecommunicationEquipmentType;
	}
	public String getXtn_4_emailAddress() {
		return xtn_4_emailAddress;
	}
	public void setXtn_4_emailAddress(String xtn_4_emailAddress) {
		this.xtn_4_emailAddress = xtn_4_emailAddress;
	}
	public String getXtn_5_countryCode() {
		return xtn_5_countryCode;
	}
	public void setXtn_5_countryCode(String xtn_5_countryCode) {
		this.xtn_5_countryCode = xtn_5_countryCode;
	}
	public String getXtn_6_areaCityCode() {
		return xtn_6_areaCityCode;
	}
	public void setXtn_6_areaCityCode(String xtn_6_areaCityCode) {
		this.xtn_6_areaCityCode = xtn_6_areaCityCode;
	}
	public String getXtn_7_localNumber() {
		return xtn_7_localNumber;
	}
	public void setXtn_7_localNumber(String xtn_7_localNumber) {
		this.xtn_7_localNumber = xtn_7_localNumber;
	}
	public String getXtn_8_extension() {
		return xtn_8_extension;
	}
	public void setXtn_8_extension(String xtn_8_extension) {
		this.xtn_8_extension = xtn_8_extension;
	}
	public String getXtn_9_anyText() {
		return xtn_9_anyText;
	}
	public void setXtn_9_anyText(String xtn_9_anyText) {
		this.xtn_9_anyText = xtn_9_anyText;
	}
	public String getXtn_10_extensionPrefix() {
		return xtn_10_extensionPrefix;
	}
	public void setXtn_10_extensionPrefix(String xtn_10_extensionPrefix) {
		this.xtn_10_extensionPrefix = xtn_10_extensionPrefix;
	}
	public String getXtn_11_SpeedDialCode() {
		return xtn_11_SpeedDialCode;
	}
	public void setXtn_11_SpeedDialCode(String xtn_11_SpeedDialCode) {
		this.xtn_11_SpeedDialCode = xtn_11_SpeedDialCode;
	}
	public String getXtn_12_unformattedTelephoneNumber() {
		return xtn_12_unformattedTelephoneNumber;
	}
	public void setXtn_12_unformattedTelephoneNumber(String xtn_12_unformattedTelephoneNumber) {
		this.xtn_12_unformattedTelephoneNumber = xtn_12_unformattedTelephoneNumber;
	}
	@Override
	public String toString() {
		return "XTN_v25 [xtn_1_telephoneNumber=" + xtn_1_telephoneNumber + ", xtn_2_telecommunicationUseCode="
				+ xtn_2_telecommunicationUseCode + ", xtn_3_telecommunicationEquipmentType="
				+ xtn_3_telecommunicationEquipmentType + ", xtn_4_emailAddress=" + xtn_4_emailAddress
				+ ", xtn_5_countryCode=" + xtn_5_countryCode + ", xtn_6_areaCityCode=" + xtn_6_areaCityCode
				+ ", xtn_7_localNumber=" + xtn_7_localNumber + ", xtn_8_extension=" + xtn_8_extension
				+ ", xtn_9_anyText=" + xtn_9_anyText + ", xtn_10_extensionPrefix=" + xtn_10_extensionPrefix
				+ ", xtn_11_SpeedDialCode=" + xtn_11_SpeedDialCode + ", xtn_12_unformattedTelephoneNumber="
				+ xtn_12_unformattedTelephoneNumber + "]";
	}

}
