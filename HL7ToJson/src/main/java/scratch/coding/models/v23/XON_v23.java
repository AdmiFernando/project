package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class XON_v23 {
	
	@JsonProperty("xon_1_organizationName")
	private String xon_1_organizationName;
	@JsonProperty("xon_2_organizationNameTypeCode")
	private String xon_2_organizationNameTypeCode;
	@JsonProperty("xon_3_idNumber")
	private String xon_3_idNumber;
	@JsonProperty("xon_4_checkDigit")
	private String xon_4_checkDigit;
	@JsonProperty("xon_5_codeIdentifyingTheCheckDigitSchemeEmployed")
	private String xon_5_codeIdentifyingTheCheckDigitSchemeEmployed;
	@JsonProperty("hd_xon_6_assigningFacility")
	private HD_v2 hd_xon_6_assigningFacility;
	@JsonProperty("xon_7_identifierTypeCode")
	private String xon_7_identifierTypeCode;
	@JsonProperty("hd_xon_8_assigningAuthority")
	private HD_v2 hd_xon_8_assigningAuthority;
	public XON_v23(String xon_1_organizationName, String xon_2_organizationNameTypeCode, String xon_3_idNumber,
			String xon_4_checkDigit, String xon_5_codeIdentifyingTheCheckDigitSchemeEmployed,
			HD_v2 hd_xon_6_assigningFacility, String xon_7_identifierTypeCode, HD_v2 hd_xon_8_assigningAuthority) {
		super();
		this.xon_1_organizationName = xon_1_organizationName;
		this.xon_2_organizationNameTypeCode = xon_2_organizationNameTypeCode;
		this.xon_3_idNumber = xon_3_idNumber;
		this.xon_4_checkDigit = xon_4_checkDigit;
		this.xon_5_codeIdentifyingTheCheckDigitSchemeEmployed = xon_5_codeIdentifyingTheCheckDigitSchemeEmployed;
		this.hd_xon_6_assigningFacility = hd_xon_6_assigningFacility;
		this.xon_7_identifierTypeCode = xon_7_identifierTypeCode;
		this.hd_xon_8_assigningAuthority = hd_xon_8_assigningAuthority;
	}
	public XON_v23() {
		super();
		this.xon_1_organizationName = "";
		this.xon_2_organizationNameTypeCode = "";
		this.xon_3_idNumber = "";
		this.xon_4_checkDigit = "";
		this.xon_5_codeIdentifyingTheCheckDigitSchemeEmployed = "";
		this.hd_xon_6_assigningFacility = new HD_v2();
		this.xon_7_identifierTypeCode = "";
		this.hd_xon_8_assigningAuthority = new HD_v2();
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
	public String getXon_5_codeIdentifyingTheCheckDigitSchemeEmployed() {
		return xon_5_codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public void setXon_5_codeIdentifyingTheCheckDigitSchemeEmployed(
			String xon_5_codeIdentifyingTheCheckDigitSchemeEmployed) {
		this.xon_5_codeIdentifyingTheCheckDigitSchemeEmployed = xon_5_codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public HD_v2 getHd_xon_6_assigningFacility() {
		return hd_xon_6_assigningFacility;
	}
	public void setHd_xon_6_assigningFacility(HD_v2 hd_xon_6_assigningFacility) {
		this.hd_xon_6_assigningFacility = hd_xon_6_assigningFacility;
	}
	public String getXon_7_identifierTypeCode() {
		return xon_7_identifierTypeCode;
	}
	public void setXon_7_identifierTypeCode(String xon_7_identifierTypeCode) {
		this.xon_7_identifierTypeCode = xon_7_identifierTypeCode;
	}
	public HD_v2 getHd_xon_8_assigningAuthority() {
		return hd_xon_8_assigningAuthority;
	}
	public void setHd_xon_8_assigningAuthority(HD_v2 hd_xon_8_assigningAuthority) {
		this.hd_xon_8_assigningAuthority = hd_xon_8_assigningAuthority;
	}
	@Override
	public String toString() {
		return "XON_v23 [xon_1_organizationName=" + xon_1_organizationName + ", xon_2_organizationNameTypeCode="
				+ xon_2_organizationNameTypeCode + ", xon_3_idNumber=" + xon_3_idNumber + ", xon_4_checkDigit="
				+ xon_4_checkDigit + ", xon_5_codeIdentifyingTheCheckDigitSchemeEmployed="
				+ xon_5_codeIdentifyingTheCheckDigitSchemeEmployed + ", hd_xon_6_assigningFacility="
				+ hd_xon_6_assigningFacility + ", xon_7_identifierTypeCode=" + xon_7_identifierTypeCode
				+ ", hd_xon_8_assigningAuthority=" + hd_xon_8_assigningAuthority + "]";
	}
}
