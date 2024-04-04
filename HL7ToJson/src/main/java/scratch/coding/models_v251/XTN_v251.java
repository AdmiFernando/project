package scratch.coding.models_v251;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XTN_v251 {
	@JsonProperty("telephoneNumber_xtn_1")
	private String telephoneNumber_xtn_1;
	@JsonProperty("telecommunicationUseCode_xtn_2")
	private String telecommunicationUseCode_xtn_2;
	@JsonProperty("telecommunicationEquipmentType_xtn_3")
	private String telecommunicationEquipmentType_xtn_3;
	@JsonProperty("emailAddress_xtn_4")
	private String emailAddress_xtn_4;
	@JsonProperty("countryCode_xtn_5")
	private String countryCode_xtn_5;
	@JsonProperty("areaCityCode_xtn_6")
	private String areaCityCode_xtn_6;
	@JsonProperty("localNumber_xtn_7")
	private String localNumber_xtn_7;
	@JsonProperty("extension_xtn_8")
	private String extension_xtn_8;	
	@JsonProperty("anyText_xtn_9")
	private String anyText_xtn_9;	
	@JsonProperty("extensionPrefix_xtn_10")
	private String extensionPrefix_xtn_10;
	@JsonProperty("speedDialCode_xtn_11")
	private String speedDialCode_xtn_11;
	@JsonProperty("unformattedTelephoneNumber_xtn_12")
	private String unformattedTelephoneNumber_xtn_12;
	public XTN_v251(String telephoneNumber_xtn_1, String telecommunicationUseCode_xtn_2,
			String telecommunicationEquipmentType_xtn_3, String emailAddress_xtn_4, String countryCode_xtn_5,
			String areaCityCode_xtn_6, String localNumber_xtn_7, String extension_xtn_8, String anyText_xtn_9,
			String extensionPrefix_xtn_10, String speedDialCode_xtn_11, String unformattedTelephoneNumber_xtn_12) {
		super();
		this.telephoneNumber_xtn_1 = telephoneNumber_xtn_1;
		this.telecommunicationUseCode_xtn_2 = telecommunicationUseCode_xtn_2;
		this.telecommunicationEquipmentType_xtn_3 = telecommunicationEquipmentType_xtn_3;
		this.emailAddress_xtn_4 = emailAddress_xtn_4;
		this.countryCode_xtn_5 = countryCode_xtn_5;
		this.areaCityCode_xtn_6 = areaCityCode_xtn_6;
		this.localNumber_xtn_7 = localNumber_xtn_7;
		this.extension_xtn_8 = extension_xtn_8;
		this.anyText_xtn_9 = anyText_xtn_9;
		this.extensionPrefix_xtn_10 = extensionPrefix_xtn_10;
		this.speedDialCode_xtn_11 = speedDialCode_xtn_11;
		this.unformattedTelephoneNumber_xtn_12 = unformattedTelephoneNumber_xtn_12;
	}
	public XTN_v251() {
		super();
		this.telephoneNumber_xtn_1 = "";
		this.telecommunicationUseCode_xtn_2 = "";
		this.telecommunicationEquipmentType_xtn_3 = "";
		this.emailAddress_xtn_4 = "";
		this.countryCode_xtn_5 = "";
		this.areaCityCode_xtn_6 = "";
		this.localNumber_xtn_7 = "";
		this.extension_xtn_8 = "";
		this.anyText_xtn_9 = "";
		this.extensionPrefix_xtn_10 = "";
		this.speedDialCode_xtn_11 = "";
		this.unformattedTelephoneNumber_xtn_12 = "";
	}
	public String getTelephoneNumber_xtn_1() {
		return telephoneNumber_xtn_1;
	}
	public void setTelephoneNumber_xtn_1(String telephoneNumber_xtn_1) {
		this.telephoneNumber_xtn_1 = telephoneNumber_xtn_1;
	}
	public String getTelecommunicationUseCode_xtn_2() {
		return telecommunicationUseCode_xtn_2;
	}
	public void setTelecommunicationUseCode_xtn_2(String telecommunicationUseCode_xtn_2) {
		this.telecommunicationUseCode_xtn_2 = telecommunicationUseCode_xtn_2;
	}
	public String getTelecommunicationEquipmentType_xtn_3() {
		return telecommunicationEquipmentType_xtn_3;
	}
	public void setTelecommunicationEquipmentType_xtn_3(String telecommunicationEquipmentType_xtn_3) {
		this.telecommunicationEquipmentType_xtn_3 = telecommunicationEquipmentType_xtn_3;
	}
	public String getEmailAddress_xtn_4() {
		return emailAddress_xtn_4;
	}
	public void setEmailAddress_xtn_4(String emailAddress_xtn_4) {
		this.emailAddress_xtn_4 = emailAddress_xtn_4;
	}
	public String getCountryCode_xtn_5() {
		return countryCode_xtn_5;
	}
	public void setCountryCode_xtn_5(String countryCode_xtn_5) {
		this.countryCode_xtn_5 = countryCode_xtn_5;
	}
	public String getAreaCityCode_xtn_6() {
		return areaCityCode_xtn_6;
	}
	public void setAreaCityCode_xtn_6(String areaCityCode_xtn_6) {
		this.areaCityCode_xtn_6 = areaCityCode_xtn_6;
	}
	public String getLocalNumber_xtn_7() {
		return localNumber_xtn_7;
	}
	public void setLocalNumber_xtn_7(String localNumber_xtn_7) {
		this.localNumber_xtn_7 = localNumber_xtn_7;
	}
	public String getExtension_xtn_8() {
		return extension_xtn_8;
	}
	public void setExtension_xtn_8(String extension_xtn_8) {
		this.extension_xtn_8 = extension_xtn_8;
	}
	public String getAnyText_xtn_9() {
		return anyText_xtn_9;
	}
	public void setAnyText_xtn_9(String anyText_xtn_9) {
		this.anyText_xtn_9 = anyText_xtn_9;
	}
	public String getExtensionPrefix_xtn_10() {
		return extensionPrefix_xtn_10;
	}
	public void setExtensionPrefix_xtn_10(String extensionPrefix_xtn_10) {
		this.extensionPrefix_xtn_10 = extensionPrefix_xtn_10;
	}
	public String getSpeedDialCode_xtn_11() {
		return speedDialCode_xtn_11;
	}
	public void setSpeedDialCode_xtn_11(String speedDialCode_xtn_11) {
		this.speedDialCode_xtn_11 = speedDialCode_xtn_11;
	}
	public String getUnformattedTelephoneNumber_xtn_12() {
		return unformattedTelephoneNumber_xtn_12;
	}
	public void setUnformattedTelephoneNumber_xtn_12(String unformattedTelephoneNumber_xtn_12) {
		this.unformattedTelephoneNumber_xtn_12 = unformattedTelephoneNumber_xtn_12;
	}
	@Override
	public String toString() {
		return "XTN_v251 [telephoneNumber_xtn_1=" + telephoneNumber_xtn_1 + ", telecommunicationUseCode_xtn_2="
				+ telecommunicationUseCode_xtn_2 + ", telecommunicationEquipmentType_xtn_3="
				+ telecommunicationEquipmentType_xtn_3 + ", emailAddress_xtn_4=" + emailAddress_xtn_4
				+ ", countryCode_xtn_5=" + countryCode_xtn_5 + ", areaCityCode_xtn_6=" + areaCityCode_xtn_6
				+ ", localNumber_xtn_7=" + localNumber_xtn_7 + ", extension_xtn_8=" + extension_xtn_8
				+ ", anyText_xtn_9=" + anyText_xtn_9 + ", extensionPrefix_xtn_10=" + extensionPrefix_xtn_10
				+ ", speedDialCode_xtn_11=" + speedDialCode_xtn_11 + ", unformattedTelephoneNumber_xtn_12="
				+ unformattedTelephoneNumber_xtn_12 + "]";
	}
	
	
}
