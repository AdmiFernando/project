package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XTN_v23 {
	@JsonProperty("xtn_1_telephoneNumber")
	private String xtn_1_telephoneNumber;
	@JsonProperty("xtn_2_telecomunicationUseCode")
	private String xtn_2_telecomunicationUseCode;
	@JsonProperty("xtn_3_telecomunicationEquipmentType")
	private String xtn_3_telecomunicationEquipmentType;
	@JsonProperty("xtn_4_emailAddress")
	private String xtn_4_emailAddress;
	@JsonProperty("xtn_5_countryCode")
	private String xtn_5_countryCode;
	@JsonProperty("xtn_6_areaCityCode")
	private String xtn_6_areaCityCode;
	@JsonProperty("xtn_7_phoneNumber")
	private String xtn_7_phoneNumber;
	@JsonProperty("xtn_8_extension")
	private String xtn_8_extension;
	@JsonProperty("xtn_9_anyText")
	private String xtn_9_anyText;
	public XTN_v23(String xtn_1_telephoneNumber, String xtn_2_telecomunicationUseCode,
			String xtn_3_telecomunicationEquipmentType, String xtn_4_emailAddress, String xtn_5_countryCode,
			String xtn_6_areaCityCode, String xtn_7_phoneNumber, String xtn_8_extension, String xtn_9_anyText) {
		super();
		this.xtn_1_telephoneNumber = xtn_1_telephoneNumber;
		this.xtn_2_telecomunicationUseCode = xtn_2_telecomunicationUseCode;
		this.xtn_3_telecomunicationEquipmentType = xtn_3_telecomunicationEquipmentType;
		this.xtn_4_emailAddress = xtn_4_emailAddress;
		this.xtn_5_countryCode = xtn_5_countryCode;
		this.xtn_6_areaCityCode = xtn_6_areaCityCode;
		this.xtn_7_phoneNumber = xtn_7_phoneNumber;
		this.xtn_8_extension = xtn_8_extension;
		this.xtn_9_anyText = xtn_9_anyText;
	}
	public XTN_v23() {
		super();
		this.xtn_1_telephoneNumber = "";
		this.xtn_2_telecomunicationUseCode = "";
		this.xtn_3_telecomunicationEquipmentType = "";
		this.xtn_4_emailAddress = "";
		this.xtn_5_countryCode = "";
		this.xtn_6_areaCityCode = "";
		this.xtn_7_phoneNumber = "";
		this.xtn_8_extension = "";
		this.xtn_9_anyText = "";
	}
	public String getXtn_1_telephoneNumber() {
		return xtn_1_telephoneNumber;
	}
	public void setXtn_1_telephoneNumber(String xtn_1_telephoneNumber) {
		this.xtn_1_telephoneNumber = xtn_1_telephoneNumber;
	}
	public String getXtn_2_telecomunicationUseCode() {
		return xtn_2_telecomunicationUseCode;
	}
	public void setXtn_2_telecomunicationUseCode(String xtn_2_telecomunicationUseCode) {
		this.xtn_2_telecomunicationUseCode = xtn_2_telecomunicationUseCode;
	}
	public String getXtn_3_telecomunicationEquipmentType() {
		return xtn_3_telecomunicationEquipmentType;
	}
	public void setXtn_3_telecomunicationEquipmentType(String xtn_3_telecomunicationEquipmentType) {
		this.xtn_3_telecomunicationEquipmentType = xtn_3_telecomunicationEquipmentType;
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
	public String getXtn_7_phoneNumber() {
		return xtn_7_phoneNumber;
	}
	public void setXtn_7_phoneNumber(String xtn_7_phoneNumber) {
		this.xtn_7_phoneNumber = xtn_7_phoneNumber;
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
	@Override
	public String toString() {
		return "XTN_v23 [xtn_1_telephoneNumber=" + xtn_1_telephoneNumber + ", xtn_2_telecomunicationUseCode="
				+ xtn_2_telecomunicationUseCode + ", xtn_3_telecomunicationEquipmentType="
				+ xtn_3_telecomunicationEquipmentType + ", xtn_4_emailAddress=" + xtn_4_emailAddress
				+ ", xtn_5_countryCode=" + xtn_5_countryCode + ", xtn_6_areaCityCode=" + xtn_6_areaCityCode
				+ ", xtn_7_phoneNumber=" + xtn_7_phoneNumber + ", xtn_8_extension=" + xtn_8_extension
				+ ", xtn_9_anyText=" + xtn_9_anyText + "]";
	}
}
