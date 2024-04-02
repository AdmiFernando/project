package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XON_v25 {
		
	@JsonProperty("xon_1_organizationName")
	private String xon_1_organizationName;
	@JsonProperty("xon_2_organizationNameTypeCode")
	private String xon_2_organizationNameTypeCode;
	@JsonProperty("xon_3_idNumber")
	private String xon_3_idNumber;
	@JsonProperty("xon_4_checkDigit")
	private String xon_4_checkDigit;
	@JsonProperty("xon_5_checkDigitScheme")
	private String xon_5_checkDigitScheme;
	@JsonProperty("xon_6_assigningAuthority")
	private HD_v2 xon_6_assigningAuthority;
	@JsonProperty("xon_7_identifierTypeCode")
	private String xon_7_identifierTypeCode;
	@JsonProperty("xon_8_assigningFacility")
	private HD_v2 xon_8_assigningFacility;
	@JsonProperty("xon_9_nameRepresentationCode")
	private String xon_9_nameRepresentationCode;
	@JsonProperty("xon_10_organizationIdentifier")
	private String xon_10_organizationIdentifier;
	public XON_v25(String xon_1_organizationName, String xon_2_organizationNameTypeCode, String xon_3_idNumber,
			String xon_4_checkDigit, String xon_5_checkDigitScheme, HD_v2 xon_6_assigningAuthority,
			String xon_7_identifierTypeCode, HD_v2 xon_8_assigningFacility, String xon_9_nameRepresentationCode,
			String xon_10_organizationIdentifier) {
		super();
		this.xon_1_organizationName = xon_1_organizationName;
		this.xon_2_organizationNameTypeCode = xon_2_organizationNameTypeCode;
		this.xon_3_idNumber = xon_3_idNumber;
		this.xon_4_checkDigit = xon_4_checkDigit;
		this.xon_5_checkDigitScheme = xon_5_checkDigitScheme;
		this.xon_6_assigningAuthority = xon_6_assigningAuthority;
		this.xon_7_identifierTypeCode = xon_7_identifierTypeCode;
		this.xon_8_assigningFacility = xon_8_assigningFacility;
		this.xon_9_nameRepresentationCode = xon_9_nameRepresentationCode;
		this.xon_10_organizationIdentifier = xon_10_organizationIdentifier;
	}
	public XON_v25() {
		super();
		this.xon_1_organizationName = "";
		this.xon_2_organizationNameTypeCode = "";
		this.xon_3_idNumber = "";
		this.xon_4_checkDigit = "";
		this.xon_5_checkDigitScheme = "";
		this.xon_6_assigningAuthority = new HD_v2();
		this.xon_7_identifierTypeCode = "";
		this.xon_8_assigningFacility = new HD_v2();
		this.xon_9_nameRepresentationCode = "";
		this.xon_10_organizationIdentifier = "";
	}
	public String getXon_1_organizationName() {
		return xon_1_organizationName;
	}
	public void setXon_1_organizationName(String xon_1_organizationName) {
		this.xon_1_organizationName = xon_1_organizationName;
	}
	public String getXon_2_organizationNameTypeCode() {
		return xon_2_organizationNameTypeCode;
	}
	public void setXon_2_organizationNameTypeCode(String xon_2_organizationNameTypeCode) {
		this.xon_2_organizationNameTypeCode = xon_2_organizationNameTypeCode;
	}
	public String getXon_3_idNumber() {
		return xon_3_idNumber;
	}
	public void setXon_3_idNumber(String xon_3_idNumber) {
		this.xon_3_idNumber = xon_3_idNumber;
	}
	public String getXon_4_checkDigit() {
		return xon_4_checkDigit;
	}
	public void setXon_4_checkDigit(String xon_4_checkDigit) {
		this.xon_4_checkDigit = xon_4_checkDigit;
	}
	public String getXon_5_checkDigitScheme() {
		return xon_5_checkDigitScheme;
	}
	public void setXon_5_checkDigitScheme(String xon_5_checkDigitScheme) {
		this.xon_5_checkDigitScheme = xon_5_checkDigitScheme;
	}
	public HD_v2 getXon_6_assigningAuthority() {
		return xon_6_assigningAuthority;
	}
	public void setXon_6_assigningAuthority(HD_v2 xon_6_assigningAuthority) {
		this.xon_6_assigningAuthority = xon_6_assigningAuthority;
	}
	public String getXon_7_identifierTypeCode() {
		return xon_7_identifierTypeCode;
	}
	public void setXon_7_identifierTypeCode(String xon_7_identifierTypeCode) {
		this.xon_7_identifierTypeCode = xon_7_identifierTypeCode;
	}
	public HD_v2 getXon_8_assigningFacility() {
		return xon_8_assigningFacility;
	}
	public void setXon_8_assigningFacility(HD_v2 xon_8_assigningFacility) {
		this.xon_8_assigningFacility = xon_8_assigningFacility;
	}
	public String getXon_9_nameRepresentationCode() {
		return xon_9_nameRepresentationCode;
	}
	public void setXon_9_nameRepresentationCode(String xon_9_nameRepresentationCode) {
		this.xon_9_nameRepresentationCode = xon_9_nameRepresentationCode;
	}
	public String getXon_10_organizationIdentifier() {
		return xon_10_organizationIdentifier;
	}
	public void setXon_10_organizationIdentifier(String xon_10_organizationIdentifier) {
		this.xon_10_organizationIdentifier = xon_10_organizationIdentifier;
	}
	@Override
	public String toString() {
		return "XON_v25 [xon_1_organizationName=" + xon_1_organizationName + ", xon_2_organizationNameTypeCode="
				+ xon_2_organizationNameTypeCode + ", xon_3_idNumber=" + xon_3_idNumber + ", xon_4_checkDigit="
				+ xon_4_checkDigit + ", xon_5_checkDigitScheme=" + xon_5_checkDigitScheme
				+ ", xon_6_assigningAuthority=" + xon_6_assigningAuthority + ", xon_7_identifierTypeCode="
				+ xon_7_identifierTypeCode + ", xon_8_assigningFacility=" + xon_8_assigningFacility
				+ ", xon_9_nameRepresentationCode=" + xon_9_nameRepresentationCode + ", xon_10_organizationIdentifier="
				+ xon_10_organizationIdentifier + "]";
	}
	
}
