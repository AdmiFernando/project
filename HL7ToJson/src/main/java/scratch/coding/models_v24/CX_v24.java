package scratch.coding.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CX_v24 {
	
	@JsonProperty("id_cx_1")
	private String id_cx_1;
	@JsonProperty("checkDigit_cx_2")
	private String checkDigit_cx_2;
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed_cx")
	private String codeIdentifyingTheCheckDigitSchemeEmployed_cx_3;
	@JsonProperty("assigningAuthority_cx_4")
	private HD_v2 assigningAuthority_cx_4;
	@JsonProperty("identifierTypeCode_cx_5")
	private String identifierTypeCode_cx_5;
	@JsonProperty("assigningFacility_cx_6")
	private HD_v2 assigningFacility_cx_6;
	@JsonProperty("effectiveDate_cx_7")
	private String effectiveDate_cx_7;
	@JsonProperty("expirationDate_cx_8")
	private String expirationDate_cx_8;
	public CX_v24(String id_cx_1, String checkDigit_cx_2, String codeIdentifyingTheCheckDigitSchemeEmployed_cx_3,
			HD_v2 assigningAuthority_cx_4, String identifierTypeCode_cx_5,
			HD_v2 assigningFacility_cx_6, String effectiveDate_cx_7, String expirationDate_cx_8) {
		super();
		this.id_cx_1 = id_cx_1;
		this.checkDigit_cx_2 = checkDigit_cx_2;
		this.codeIdentifyingTheCheckDigitSchemeEmployed_cx_3 = codeIdentifyingTheCheckDigitSchemeEmployed_cx_3;
		this.assigningAuthority_cx_4 = assigningAuthority_cx_4;
		this.identifierTypeCode_cx_5 = identifierTypeCode_cx_5;
		this.assigningFacility_cx_6 = assigningFacility_cx_6;
		this.effectiveDate_cx_7 = effectiveDate_cx_7;
		this.expirationDate_cx_8 = expirationDate_cx_8;
	}
	public CX_v24() {
		super();
		this.id_cx_1 = "";
		this.checkDigit_cx_2 = "";
		this.codeIdentifyingTheCheckDigitSchemeEmployed_cx_3 = "";
		this.assigningAuthority_cx_4 = new HD_v2();
		this.identifierTypeCode_cx_5 = "";
		this.assigningFacility_cx_6 = new HD_v2();
		this.effectiveDate_cx_7 = "";
		this.expirationDate_cx_8 = "";
	}
	public String getId_cx_1() {
		return id_cx_1;
	}
	public void setId_cx_1(String id_cx_1) {
		this.id_cx_1 = id_cx_1;
	}
	public String getCheckDigit_cx_2() {
		return checkDigit_cx_2;
	}
	public void setCheckDigit_cx_2(String checkDigit_cx_2) {
		this.checkDigit_cx_2 = checkDigit_cx_2;
	}
	public String getCodeIdentifyingTheCheckDigitSchemeEmployed_cx_3() {
		return codeIdentifyingTheCheckDigitSchemeEmployed_cx_3;
	}
	public void setCodeIdentifyingTheCheckDigitSchemeEmployed_cx_3(String codeIdentifyingTheCheckDigitSchemeEmployed_cx_3) {
		this.codeIdentifyingTheCheckDigitSchemeEmployed_cx_3 = codeIdentifyingTheCheckDigitSchemeEmployed_cx_3;
	}
	public HD_v2 getAssigningAuthority_cx_4() {
		return assigningAuthority_cx_4;
	}
	public void setAssigningAuthority_cx_4(HD_v2 assigningAuthority_cx_4) {
		this.assigningAuthority_cx_4 = assigningAuthority_cx_4;
	}
	public String getIdentifierTypeCode_cx_5() {
		return identifierTypeCode_cx_5;
	}
	public void setIdentifierTypeCode_cx_5(String identifierTypeCode_cx_5) {
		this.identifierTypeCode_cx_5 = identifierTypeCode_cx_5;
	}
	public HD_v2 getAssigningFacility_cx_6() {
		return assigningFacility_cx_6;
	}
	public void setAssigningFacility_cx_6(HD_v2 assigningFacility_cx_6) {
		this.assigningFacility_cx_6 = assigningFacility_cx_6;
	}
	public String getEffectiveDate_cx_7() {
		return effectiveDate_cx_7;
	}
	public void setEffectiveDate_cx_7(String effectiveDate_cx_7) {
		this.effectiveDate_cx_7 = effectiveDate_cx_7;
	}
	public String getExpirationDate_cx_8() {
		return expirationDate_cx_8;
	}
	public void setExpirationDate_cx_8(String expirationDate_cx_8) {
		this.expirationDate_cx_8 = expirationDate_cx_8;
	}
	@Override
	public String toString() {
		return "CX_v24 [id_cx_1=" + id_cx_1 + ", checkDigit_cx_2=" + checkDigit_cx_2
				+ ", codeIdentifyingTheCheckDigitSchemeEmployed_cx_3=" + codeIdentifyingTheCheckDigitSchemeEmployed_cx_3
				+ ", assigningAuthority_cx_4=" + assigningAuthority_cx_4 + ", identifierTypeCode_cx_5="
				+ identifierTypeCode_cx_5 + ", assigningFacility_cx_6=" + assigningFacility_cx_6
				+ ", effectiveDate_cx_7=" + effectiveDate_cx_7 + ", expirationDate_cx_8=" + expirationDate_cx_8 + "]";
	}
	
}