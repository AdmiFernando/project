package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CX_v23 {
	@JsonProperty("cx_1_id")
	private String cx_1_id;
	@JsonProperty("cx_2_checkDigit")
	private String cx_2_checkDigit;
	@JsonProperty("cx_3_codeIdentifyingTheCheckDigitSchemeEmployed")
	private String cx_3_codeIdentifyingTheCheckDigitSchemeEmployed;
	@JsonProperty("hd_cx_4_assigningAuthority")
	private HD_v2 hd_cx_4_assigningAuthority;
	@JsonProperty("cx_5_identifierTypeCode")
	private String cx_5_identifierTypeCode;	
	@JsonProperty("hd_cx_6_assigningFacility")
	private HD_v2 hd_cx_6_assigningFacility;
	public CX_v23(String cx_1_id, String cx_2_checkDigit, String cx_3_codeIdentifyingTheCheckDigitSchemeEmployed,
			HD_v2 hd_cx_4_assigningAuthority, String cx_5_identifierTypeCode, HD_v2 hd_cx_6_assigningFacility) {
		super();
		this.cx_1_id = cx_1_id;
		this.cx_2_checkDigit = cx_2_checkDigit;
		this.cx_3_codeIdentifyingTheCheckDigitSchemeEmployed = cx_3_codeIdentifyingTheCheckDigitSchemeEmployed;
		this.hd_cx_4_assigningAuthority = hd_cx_4_assigningAuthority;
		this.cx_5_identifierTypeCode = cx_5_identifierTypeCode;
		this.hd_cx_6_assigningFacility = hd_cx_6_assigningFacility;
	}
	public CX_v23() {
		super();
		this.cx_1_id = "";
		this.cx_2_checkDigit = "";
		this.cx_3_codeIdentifyingTheCheckDigitSchemeEmployed = "";
		this.hd_cx_4_assigningAuthority = new HD_v2();
		this.cx_5_identifierTypeCode = "";
		this.hd_cx_6_assigningFacility = new HD_v2();
	}
	public String getCx_1_id() {
		return cx_1_id;
	}
	public void setCx_1_id(String cx_1_id) {
		this.cx_1_id = cx_1_id;
	}
	public String getCx_2_checkDigit() {
		return cx_2_checkDigit;
	}
	public void setCx_2_checkDigit(String cx_2_checkDigit) {
		this.cx_2_checkDigit = cx_2_checkDigit;
	}
	public String getCx_3_codeIdentifyingTheCheckDigitSchemeEmployed() {
		return cx_3_codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public void setCx_3_codeIdentifyingTheCheckDigitSchemeEmployed(String cx_3_codeIdentifyingTheCheckDigitSchemeEmployed) {
		this.cx_3_codeIdentifyingTheCheckDigitSchemeEmployed = cx_3_codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public HD_v2 getHd_cx_4_assigningAuthority() {
		return hd_cx_4_assigningAuthority;
	}
	public void setHd_cx_4_assigningAuthority(HD_v2 hd_cx_4_assigningAuthority) {
		this.hd_cx_4_assigningAuthority = hd_cx_4_assigningAuthority;
	}
	public String getCx_5_identifierTypeCode() {
		return cx_5_identifierTypeCode;
	}
	public void setCx_5_identifierTypeCode(String cx_5_identifierTypeCode) {
		this.cx_5_identifierTypeCode = cx_5_identifierTypeCode;
	}
	public HD_v2 getHd_cx_6_assigningFacility() {
		return hd_cx_6_assigningFacility;
	}
	public void setHd_cx_6_assigningFacility(HD_v2 hd_cx_6_assigningFacility) {
		this.hd_cx_6_assigningFacility = hd_cx_6_assigningFacility;
	}
	@Override
	public String toString() {
		return "CX_v23 [cx_1_id=" + cx_1_id + ", cx_2_checkDigit=" + cx_2_checkDigit
				+ ", cx_3_codeIdentifyingTheCheckDigitSchemeEmployed=" + cx_3_codeIdentifyingTheCheckDigitSchemeEmployed
				+ ", hd_cx_4_assigningAuthority=" + hd_cx_4_assigningAuthority + ", cx_5_identifierTypeCode="
				+ cx_5_identifierTypeCode + ", hd_cx_6_assigningFacility=" + hd_cx_6_assigningFacility + "]";
	}
}
