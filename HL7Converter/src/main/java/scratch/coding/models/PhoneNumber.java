package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PhoneNumber implements Serializable {
	@JsonProperty("d999text")
	private String d999text;
	@JsonProperty("anyText")
	private String anyText;
	@JsonProperty("areaCityCode")
	private String areaCityCode;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("emailAddress")
	private String emailAddress;
	@JsonProperty("extension")
	private String extension;
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	@JsonProperty("telecomunicationEquipmentType")
	private String telecomunicationEquipmentType;
	@JsonProperty("telecomunicationUseCode")
	private String telecomunicationUseCode;
	
	public PhoneNumber(String d999text, String anyText, String areaCityCode, String countryCode, String emailAddress,
			String extension, String phoneNumber, String telecomunicationEquipmentType,
			String telecomunicationUseCode) {
		super();
		this.d999text = d999text;
		this.anyText = anyText;
		this.areaCityCode = areaCityCode;
		this.countryCode = countryCode;
		this.emailAddress = emailAddress;
		this.extension = extension;
		this.phoneNumber = phoneNumber;
		this.telecomunicationEquipmentType = telecomunicationEquipmentType;
		this.telecomunicationUseCode = telecomunicationUseCode;
	}

	public PhoneNumber() {
		super();
	}
	@JsonProperty("d999text")
	public String getD999text() {
		return d999text;
	}
	@JsonProperty("d999text")
	public void setD999text(String d999text) {
		this.d999text = d999text;
	}

	@JsonProperty("anyText")
	public String getAnyText() {
		return anyText;
	}
	@JsonProperty("anyText")
	public void setAnyText(String anyText) {
		this.anyText = anyText;
	}
	@JsonProperty("areaCityCode")
	public String getAreaCityCode() {
		return areaCityCode;
	}
	@JsonProperty("areaCityCode")
	public void setAreaCityCode(String areaCityCode) {
		this.areaCityCode = areaCityCode;
	}
	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}
	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	@JsonProperty("emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}
	@JsonProperty("emailAddress")
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@JsonProperty("extension")
	public String getExtension() {
		return extension;
	}
	@JsonProperty("extension")
	public void setExtension(String extension) {
		this.extension = extension;
	}
	@JsonProperty("phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@JsonProperty("phoneNumber")
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@JsonProperty("telecomunicationEquipmentType")
	public String getTelecomunicationEquipmentType() {
		return telecomunicationEquipmentType;
	}
	@JsonProperty("telecomunicationEquipmentType")
	public void setTelecomunicationEquipmentType(String telecomunicationEquipmentType) {
		this.telecomunicationEquipmentType = telecomunicationEquipmentType;
	}
	@JsonProperty("telecomunicationUseCode")
	public String getTelecomunicationUseCode() {
		return telecomunicationUseCode;
	}
	@JsonProperty("telecomunicationUseCode")
	public void setTelecomunicationUseCode(String telecomunicationUseCode) {
		this.telecomunicationUseCode = telecomunicationUseCode;
	}
	
	@Override
	public String toString() {
		return "PhoneNumberHome [anyText=" + anyText + ", areaCityCode=" + areaCityCode + ", countryCode=" + countryCode
				+ ", emailAddress=" + emailAddress + ", extension=" + extension + ", phoneNumber=" + phoneNumber
				+ ", telecomunicationEquipmentType=" + telecomunicationEquipmentType + ", telecomunicationUseCode="
				+ telecomunicationUseCode + "]";
	}
	
}
