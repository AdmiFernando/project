package fdny.org.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import fdny.org.models.CE_v2;
import fdny.org.models.DR_v2;
import fdny.org.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XCN_v24 {
	@JsonProperty("idNumber_xcn_1")
	private String idNumber_xcn_1;
	@JsonProperty("familyName_xcn_2")
	private FN_v24 familyName_xcn_2;
	@JsonProperty("givenName_xcn_3")
	private String givenName_xcn_3;
	@JsonProperty("secondAndFurtherGivenNamesOrInitialsThereof_xcn_4")
	private String secondAndFurtherGivenNamesOrInitialsThereof_xcn_4;
	@JsonProperty("suffix_xcn_5")
	private String suffix_xcn_5;
	@JsonProperty("prefix_xcn_6")
	private String prefix_xcn_6;
	@JsonProperty("degree_xcn_7")
	private String degree_xcn_7;
	@JsonProperty("sourceTable_xcn_8")
	private String sourceTable_xcn_8;
	@JsonProperty("assigningAuthority_xcn_9")
	private HD_v2 assigningAuthority_xcn_9;
	@JsonProperty("nameTypeCode_xcn_10")
	private String nameTypeCode_xcn_10;
	@JsonProperty("identifierCheckDigit_xcn_11")
	private String identifierCheckDigit_xcn_11;
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12")
	private String codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12;
	@JsonProperty("identifierTypeCode_xcn_13")
	private String identifierTypeCode_xcn_13;
	@JsonProperty("assigningFacility_xcn_14")
	private HD_v2 assigningFacility_xcn_14;
	@JsonProperty("nameRepresentationCode_xcn_15")
	private String nameRepresentationCode_xcn_15;
	@JsonProperty("nameContext_xcn_16")
	private CE_v2 nameContext_xcn_16;
	@JsonProperty("nameValidityRange_xcn_17")
	private DR_v2 nameValidityRange_xcn_17;
	@JsonProperty("nameAssemblyOrder_xcn_18")
	private String nameAssemblyOrder_xcn_18;
	public XCN_v24(String idNumber_xcn_1, FN_v24 familyNamexcn_2, String givenName_xcn_3,
			String secondAndFurtherGivenNamesOrInitialsThereof_xcn_4, String suffix_xcn_5, String prefix_xcn_6,
			String degree_xcn_7, String sourceTable_xcn_8, HD_v2 assigningAuthority_xcn_9,
			String nameTypeCode_xcn_10, String identifierCheckDigit_xcn_11,
			String codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12, String identifierTypeCode_xcn_13,
			HD_v2 assigningFacility_xcn_14, String nameRepresentationCode_xcn_15,
			CE_v2 nameContext_xcn_16, DR_v2 nameValidityRange_xcn_17,
			String nameAssemblyOrder_xcn_18) {
		super();
		this.idNumber_xcn_1 = idNumber_xcn_1;
		this.familyName_xcn_2 = familyNamexcn_2;
		this.givenName_xcn_3 = givenName_xcn_3;
		this.secondAndFurtherGivenNamesOrInitialsThereof_xcn_4 = secondAndFurtherGivenNamesOrInitialsThereof_xcn_4;
		this.suffix_xcn_5 = suffix_xcn_5;
		this.prefix_xcn_6 = prefix_xcn_6;
		this.degree_xcn_7 = degree_xcn_7;
		this.sourceTable_xcn_8 = sourceTable_xcn_8;
		this.assigningAuthority_xcn_9 = assigningAuthority_xcn_9;
		this.nameTypeCode_xcn_10 = nameTypeCode_xcn_10;
		this.identifierCheckDigit_xcn_11 = identifierCheckDigit_xcn_11;
		this.codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12 = codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12;
		this.identifierTypeCode_xcn_13 = identifierTypeCode_xcn_13;
		this.assigningFacility_xcn_14 = assigningFacility_xcn_14;
		this.nameRepresentationCode_xcn_15 = nameRepresentationCode_xcn_15;
		this.nameContext_xcn_16 = nameContext_xcn_16;
		this.nameValidityRange_xcn_17 = nameValidityRange_xcn_17;
		this.nameAssemblyOrder_xcn_18 = nameAssemblyOrder_xcn_18;
	}
	public XCN_v24() {
		super();
		this.idNumber_xcn_1 = "";
		this.familyName_xcn_2 = new FN_v24();
		this.givenName_xcn_3 = "";
		this.secondAndFurtherGivenNamesOrInitialsThereof_xcn_4 = "";
		this.suffix_xcn_5 = "";
		this.prefix_xcn_6 = "";
		this.degree_xcn_7 = "";
		this.sourceTable_xcn_8 = "";
		this.assigningAuthority_xcn_9 = new HD_v2();
		this.nameTypeCode_xcn_10 = "";
		this.identifierCheckDigit_xcn_11 = "";
		this.codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12 = "";
		this.identifierTypeCode_xcn_13 = "";
		this.assigningFacility_xcn_14 = new HD_v2();
		this.nameRepresentationCode_xcn_15 = "";
		this.nameContext_xcn_16 = new CE_v2();
		this.nameValidityRange_xcn_17 = new DR_v2();
		this.nameAssemblyOrder_xcn_18 = "";
	}
	public String getIdNumber_xcn_1() {
		return idNumber_xcn_1;
	}
	public void setIdNumber_xcn_1(String idNumber_xcn_1) {
		this.idNumber_xcn_1 = idNumber_xcn_1;
	}
	public FN_v24 getFamilyName_xcn_2() {
		return familyName_xcn_2;
	}
	public void setFamilyName_xcn_2(FN_v24 familyName_xcn_2) {
		this.familyName_xcn_2 = familyName_xcn_2;
	}
	public String getGivenName_xcn_3() {
		return givenName_xcn_3;
	}
	public void setGivenName_xcn_3(String givenName_xcn_3) {
		this.givenName_xcn_3 = givenName_xcn_3;
	}
	public String getSecondAndFurtherGivenNamesOrInitialsThereof_xcn_4() {
		return secondAndFurtherGivenNamesOrInitialsThereof_xcn_4;
	}
	public void setSecondAndFurtherGivenNamesOrInitialsThereof_xcn_4(
			String secondAndFurtherGivenNamesOrInitialsThereof_xcn_4) {
		this.secondAndFurtherGivenNamesOrInitialsThereof_xcn_4 = secondAndFurtherGivenNamesOrInitialsThereof_xcn_4;
	}
	public String getSuffix_xcn_5() {
		return suffix_xcn_5;
	}
	public void setSuffix_xcn_5(String suffix_xcn_5) {
		this.suffix_xcn_5 = suffix_xcn_5;
	}
	public String getPrefix_xcn_6() {
		return prefix_xcn_6;
	}
	public void setPrefix_xcn_6(String prefix_xcn_6) {
		this.prefix_xcn_6 = prefix_xcn_6;
	}
	public String getDegree_xcn_7() {
		return degree_xcn_7;
	}
	public void setDegree_xcn_7(String degree_xcn_7) {
		this.degree_xcn_7 = degree_xcn_7;
	}
	public String getSourceTable_xcn_8() {
		return sourceTable_xcn_8;
	}
	public void setSourceTable_xcn_8(String sourceTable_xcn_8) {
		this.sourceTable_xcn_8 = sourceTable_xcn_8;
	}
	public HD_v2 getAssigningAuthority_xcn_9() {
		return assigningAuthority_xcn_9;
	}
	public void setAssigningAuthority_xcn_9(HD_v2 assigningAuthority_xcn_9) {
		this.assigningAuthority_xcn_9 = assigningAuthority_xcn_9;
	}
	public String getNameTypeCode_xcn_10() {
		return nameTypeCode_xcn_10;
	}
	public void setNameTypeCode_xcn_10(String nameTypeCode_xcn_10) {
		this.nameTypeCode_xcn_10 = nameTypeCode_xcn_10;
	}
	public String getIdentifierCheckDigit_xcn_11() {
		return identifierCheckDigit_xcn_11;
	}
	public void setIdentifierCheckDigit_xcn_11(String identifierCheckDigit_xcn_11) {
		this.identifierCheckDigit_xcn_11 = identifierCheckDigit_xcn_11;
	}
	public String getCodeIdentifyingTheCheckDigitSchemeEmployed_xcn_12() {
		return codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12;
	}
	public void setCodeIdentifyingTheCheckDigitSchemeEmployed_xcn_12(
			String codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12) {
		this.codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12 = codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12;
	}
	public String getIdentifierTypeCode_xcn_13() {
		return identifierTypeCode_xcn_13;
	}
	public void setIdentifierTypeCode_xcn_13(String identifierTypeCode_xcn_13) {
		this.identifierTypeCode_xcn_13 = identifierTypeCode_xcn_13;
	}
	public HD_v2 getAssigningFacility_xcn_14() {
		return assigningFacility_xcn_14;
	}
	public void setAssigningFacility_xcn_14(HD_v2 assigningFacility_xcn_14) {
		this.assigningFacility_xcn_14 = assigningFacility_xcn_14;
	}
	public String getNameRepresentationCode_xcn_15() {
		return nameRepresentationCode_xcn_15;
	}
	public void setNameRepresentationCode_xcn_15(String nameRepresentationCode_xcn_15) {
		this.nameRepresentationCode_xcn_15 = nameRepresentationCode_xcn_15;
	}
	public CE_v2 getNameContext_xcn_16() {
		return nameContext_xcn_16;
	}
	public void setNameContext_xcn_16(CE_v2 nameContext_xcn_16) {
		this.nameContext_xcn_16 = nameContext_xcn_16;
	}
	public DR_v2 getNameValidityRange_xcn_17() {
		return nameValidityRange_xcn_17;
	}
	public void setNameValidityRange_xcn_17(DR_v2 nameValidityRange_xcn_17) {
		this.nameValidityRange_xcn_17 = nameValidityRange_xcn_17;
	}
	public String getNameAssemblyOrder_xcn_18() {
		return nameAssemblyOrder_xcn_18;
	}
	public void setNameAssemblyOrder_xcn_18(String nameAssemblyOrder_xcn_18) {
		this.nameAssemblyOrder_xcn_18 = nameAssemblyOrder_xcn_18;
	}
	@Override
	public String toString() {
		return "XCN_v24 [idNumber_xcn_1=" + idNumber_xcn_1 + ", familyNamexcn_2=" + familyName_xcn_2
				+ ", givenName_xcn_3=" + givenName_xcn_3 + ", secondAndFurtherGivenNamesOrInitialsThereof_xcn_4="
				+ secondAndFurtherGivenNamesOrInitialsThereof_xcn_4 + ", suffix_xcn_5=" + suffix_xcn_5
				+ ", prefix_xcn_6=" + prefix_xcn_6 + ", degree_xcn_7=" + degree_xcn_7 + ", sourceTable_xcn_8="
				+ sourceTable_xcn_8 + ", assigningAuthority_xcn_9=" + assigningAuthority_xcn_9
				+ ", nameTypeCode_xcn_10=" + nameTypeCode_xcn_10 + ", identifierCheckDigit_xcn_11="
				+ identifierCheckDigit_xcn_11 + ", codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12="
				+ codeIdentifyingTheCheckDigitSchemeEmployed_xcn_12 + ", identifierTypeCode_xcn_13="
				+ identifierTypeCode_xcn_13 + ", assigningFacility_xcn_14=" + assigningFacility_xcn_14
				+ ", nameRepresentationCode_xcn_15=" + nameRepresentationCode_xcn_15 + ", nameContext_xcn_16="
				+ nameContext_xcn_16 + ", nameValidityRange_xcn_17=" + nameValidityRange_xcn_17
				+ ", nameAssemblyOrder_xcn_18=" + nameAssemblyOrder_xcn_18 + "]";
	} 
	
}