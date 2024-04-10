package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XCN_v25 {
				
	@JsonProperty("xcn_1_idNumber")
	private String xcn_1_idNumber;
	@JsonProperty("xcn_2_familyName")
	private FN_v25 xcn_2_familyName;
	@JsonProperty("xcn_3_givenName")
	private String xcn_3_givenName;
	@JsonProperty("xcn_4_secondAndFurtherGivenNamesOrInitialsThereof")
	private String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	@JsonProperty("xcn_5_suffixegJrOrIii")
	private String xcn_5_suffixegJrOrIii;
	@JsonProperty("xcn_6_prefixegDr")
	private String xcn_6_prefixegDr;
	@JsonProperty("xcn_7_degreeegMd")
	private String xcn_7_degreeegMd;
	@JsonProperty("xcn_8_sourceTable")
	private String xcn_8_sourceTable;
	@JsonProperty("xcn_9_assigningAuthority")
	private HD_v2 xcn_9_assigningAuthority;
	@JsonProperty("xcn_10_nameTypeCode")
	private String xcn_10_nameTypeCode;
	@JsonProperty("xcn_11_identifierCheckDigit")
	private String xcn_11_identifierCheckDigit;
	@JsonProperty("xcn_12_checkDigitScheme")
	private String xcn_12_checkDigitScheme;
	@JsonProperty("xcn_13_identifierTypeCode")
	private String xcn_13_identifierTypeCode;
	@JsonProperty("xcn_14_assigningFacility")
	private HD_v2 xcn_14_assigningFacility;
	@JsonProperty("xcn_15_nameRepresentationCode")
	private String xcn_15_nameRepresentationCode;
	@JsonProperty("xcn_16_nameContext")
	private CE_v2 xcn_16_nameContext;
	@JsonProperty("xcn_17_nameValidityRange")
	private DR_v2 xcn_17_nameValidityRange;
	@JsonProperty("xcn_18_nameAssemblyOrder")
	private String xcn_18_nameAssemblyOrder;
	@JsonProperty("xcn_19_effectiveDate")
	private TS_v2 xcn_19_effectiveDate;
	@JsonProperty("xcn_20_expirationDate")
	private TS_v2 xcn_20_expirationDate;
	@JsonProperty("xcn_21_professionalSuffix")
	private String xcn_21_professionalSuffix;
	@JsonProperty("xcn_22_assigningJurisdiction")
	private CWE_v25 xcn_22_assigningJurisdiction;
	@JsonProperty("xcn_23_assigningAgencyOrDepartment")
	private CWE_v25 xcn_23_assigningAgencyOrDepartment;
	public XCN_v25(String xcn_1_idNumber, FN_v25 xcn_2_familyName, String xcn_3_givenName,
			String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof, String xcn_5_suffixegJrOrIii,
			String xcn_6_prefixegDr, String xcn_7_degreeegMd, String xcn_8_sourceTable, HD_v2 xcn_9_assigningAuthority,
			String xcn_10_nameTypeCode, String xcn_11_identifierCheckDigit, String xcn_12_checkDigitScheme,
			String xcn_13_identifierTypeCode, HD_v2 xcn_14_assigningFacility, String xcn_15_nameRepresentationCode,
			CE_v2 xcn_16_nameContext, DR_v2 xcn_17_nameValidityRange, String xcn_18_nameAssemblyOrder,
			TS_v2 xcn_19_effectiveDate, TS_v2 xcn_20_expirationDate, String xcn_21_professionalSuffix,
			CWE_v25 xcn_22_assigningJurisdiction, CWE_v25 xcn_23_assigningAgencyOrDepartment) {
		super();
		this.xcn_1_idNumber = xcn_1_idNumber;
		this.xcn_2_familyName = xcn_2_familyName;
		this.xcn_3_givenName = xcn_3_givenName;
		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
		this.xcn_5_suffixegJrOrIii = xcn_5_suffixegJrOrIii;
		this.xcn_6_prefixegDr = xcn_6_prefixegDr;
		this.xcn_7_degreeegMd = xcn_7_degreeegMd;
		this.xcn_8_sourceTable = xcn_8_sourceTable;
		this.xcn_9_assigningAuthority = xcn_9_assigningAuthority;
		this.xcn_10_nameTypeCode = xcn_10_nameTypeCode;
		this.xcn_11_identifierCheckDigit = xcn_11_identifierCheckDigit;
		this.xcn_12_checkDigitScheme = xcn_12_checkDigitScheme;
		this.xcn_13_identifierTypeCode = xcn_13_identifierTypeCode;
		this.xcn_14_assigningFacility = xcn_14_assigningFacility;
		this.xcn_15_nameRepresentationCode = xcn_15_nameRepresentationCode;
		this.xcn_16_nameContext = xcn_16_nameContext;
		this.xcn_17_nameValidityRange = xcn_17_nameValidityRange;
		this.xcn_18_nameAssemblyOrder = xcn_18_nameAssemblyOrder;
		this.xcn_19_effectiveDate = xcn_19_effectiveDate;
		this.xcn_20_expirationDate = xcn_20_expirationDate;
		this.xcn_21_professionalSuffix = xcn_21_professionalSuffix;
		this.xcn_22_assigningJurisdiction = xcn_22_assigningJurisdiction;
		this.xcn_23_assigningAgencyOrDepartment = xcn_23_assigningAgencyOrDepartment;
	} 
	public XCN_v25() {
		super();
		this.xcn_1_idNumber = "";
		this.xcn_2_familyName = new FN_v25();
		this.xcn_3_givenName = "";
		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = "";
		this.xcn_5_suffixegJrOrIii = "";
		this.xcn_6_prefixegDr = "";
		this.xcn_7_degreeegMd = "";
		this.xcn_8_sourceTable = "";
		this.xcn_9_assigningAuthority = new HD_v2();
		this.xcn_10_nameTypeCode = "";
		this.xcn_11_identifierCheckDigit = "";
		this.xcn_12_checkDigitScheme = "";
		this.xcn_13_identifierTypeCode = "";
		this.xcn_14_assigningFacility = new HD_v2();
		this.xcn_15_nameRepresentationCode = "";
		this.xcn_16_nameContext = new CE_v2();
		this.xcn_17_nameValidityRange = new DR_v2();
		this.xcn_18_nameAssemblyOrder = "";
		this.xcn_19_effectiveDate = new TS_v2();
		this.xcn_20_expirationDate = new TS_v2();
		this.xcn_21_professionalSuffix = "";
		this.xcn_22_assigningJurisdiction = new CWE_v25();
		this.xcn_23_assigningAgencyOrDepartment = new CWE_v25();
	}
	public String getXcn_1_idNumber() {
		return xcn_1_idNumber;
	}
	public void setXcn_1_idNumber(String xcn_1_idNumber) {
		this.xcn_1_idNumber = xcn_1_idNumber;
	}
	public FN_v25 getXcn_2_familyName() {
		return xcn_2_familyName;
	}
	public void setXcn_2_familyName(FN_v25 xcn_2_familyName) {
		this.xcn_2_familyName = xcn_2_familyName;
	}
	public String getXcn_3_givenName() {
		return xcn_3_givenName;
	}
	public void setXcn_3_givenName(String xcn_3_givenName) {
		this.xcn_3_givenName = xcn_3_givenName;
	}
	public String getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof() {
		return xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	}
	public void setXcn_4_secondAndFurtherGivenNamesOrInitialsThereof(
			String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof) {
		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	}
	public String getXcn_5_suffixegJrOrIii() {
		return xcn_5_suffixegJrOrIii;
	}
	public void setXcn_5_suffixegJrOrIii(String xcn_5_suffixegJrOrIii) {
		this.xcn_5_suffixegJrOrIii = xcn_5_suffixegJrOrIii;
	}
	public String getXcn_6_prefixegDr() {
		return xcn_6_prefixegDr;
	}
	public void setXcn_6_prefixegDr(String xcn_6_prefixegDr) {
		this.xcn_6_prefixegDr = xcn_6_prefixegDr;
	}
	public String getXcn_7_degreeegMd() {
		return xcn_7_degreeegMd;
	}
	public void setXcn_7_degreeegMd(String xcn_7_degreeegMd) {
		this.xcn_7_degreeegMd = xcn_7_degreeegMd;
	}
	public String getXcn_8_sourceTable() {
		return xcn_8_sourceTable;
	}
	public void setXcn_8_sourceTable(String xcn_8_sourceTable) {
		this.xcn_8_sourceTable = xcn_8_sourceTable;
	}
	public HD_v2 getXcn_9_assigningAuthority() {
		return xcn_9_assigningAuthority;
	}
	public void setXcn_9_assigningAuthority(HD_v2 xcn_9_assigningAuthority) {
		this.xcn_9_assigningAuthority = xcn_9_assigningAuthority;
	}
	public String getXcn_10_nameTypeCode() {
		return xcn_10_nameTypeCode;
	}
	public void setXcn_10_nameTypeCode(String xcn_10_nameTypeCode) {
		this.xcn_10_nameTypeCode = xcn_10_nameTypeCode;
	}
	public String getXcn_11_identifierCheckDigit() {
		return xcn_11_identifierCheckDigit;
	}
	public void setXcn_11_identifierCheckDigit(String xcn_11_identifierCheckDigit) {
		this.xcn_11_identifierCheckDigit = xcn_11_identifierCheckDigit;
	}
	public String getXcn_12_checkDigitScheme() {
		return xcn_12_checkDigitScheme;
	}
	public void setXcn_12_checkDigitScheme(String xcn_12_checkDigitScheme) {
		this.xcn_12_checkDigitScheme = xcn_12_checkDigitScheme;
	}
	public String getXcn_13_identifierTypeCode() {
		return xcn_13_identifierTypeCode;
	}
	public void setXcn_13_identifierTypeCode(String xcn_13_identifierTypeCode) {
		this.xcn_13_identifierTypeCode = xcn_13_identifierTypeCode;
	}
	public HD_v2 getXcn_14_assigningFacility() {
		return xcn_14_assigningFacility;
	}
	public void setXcn_14_assigningFacility(HD_v2 xcn_14_assigningFacility) {
		this.xcn_14_assigningFacility = xcn_14_assigningFacility;
	}
	public String getXcn_15_nameRepresentationCode() {
		return xcn_15_nameRepresentationCode;
	}
	public void setXcn_15_nameRepresentationCode(String xcn_15_nameRepresentationCode) {
		this.xcn_15_nameRepresentationCode = xcn_15_nameRepresentationCode;
	}
	public CE_v2 getXcn_16_nameContext() {
		return xcn_16_nameContext;
	}
	public void setXcn_16_nameContext(CE_v2 xcn_16_nameContext) {
		this.xcn_16_nameContext = xcn_16_nameContext;
	}
	public DR_v2 getXcn_17_nameValidityRange() {
		return xcn_17_nameValidityRange;
	}
	public void setXcn_17_nameValidityRange(DR_v2 xcn_17_nameValidityRange) {
		this.xcn_17_nameValidityRange = xcn_17_nameValidityRange;
	}
	public String getXcn_18_nameAssemblyOrder() {
		return xcn_18_nameAssemblyOrder;
	}
	public void setXcn_18_nameAssemblyOrder(String xcn_18_nameAssemblyOrder) {
		this.xcn_18_nameAssemblyOrder = xcn_18_nameAssemblyOrder;
	}
	public TS_v2 getXcn_19_effectiveDate() {
		return xcn_19_effectiveDate;
	}
	public void setXcn_19_effectiveDate(TS_v2 xcn_19_effectiveDate) {
		this.xcn_19_effectiveDate = xcn_19_effectiveDate;
	}
	public TS_v2 getXcn_20_expirationDate() {
		return xcn_20_expirationDate;
	}
	public void setXcn_20_expirationDate(TS_v2 xcn_20_expirationDate) {
		this.xcn_20_expirationDate = xcn_20_expirationDate;
	}
	public String getXcn_21_professionalSuffix() {
		return xcn_21_professionalSuffix;
	}
	public void setXcn_21_professionalSuffix(String xcn_21_professionalSuffix) {
		this.xcn_21_professionalSuffix = xcn_21_professionalSuffix;
	}
	public CWE_v25 getXcn_22_assigningJurisdiction() {
		return xcn_22_assigningJurisdiction;
	}
	public void setXcn_22_assigningJurisdiction(CWE_v25 xcn_22_assigningJurisdiction) {
		this.xcn_22_assigningJurisdiction = xcn_22_assigningJurisdiction;
	}
	public CWE_v25 getXcn_23_assigningAgencyOrDepartment() {
		return xcn_23_assigningAgencyOrDepartment;
	}
	public void setXcn_23_assigningAgencyOrDepartment(CWE_v25 xcn_23_assigningAgencyOrDepartment) {
		this.xcn_23_assigningAgencyOrDepartment = xcn_23_assigningAgencyOrDepartment;
	}
	@Override
	public String toString() {
		return "XCN_v25 [xcn_1_idNumber=" + xcn_1_idNumber + ", xcn_2_familyName=" + xcn_2_familyName
				+ ", xcn_3_givenName=" + xcn_3_givenName + ", xcn_4_secondAndFurtherGivenNamesOrInitialsThereof="
				+ xcn_4_secondAndFurtherGivenNamesOrInitialsThereof + ", xcn_5_suffixegJrOrIii=" + xcn_5_suffixegJrOrIii
				+ ", xcn_6_prefixegDr=" + xcn_6_prefixegDr + ", xcn_7_degreeegMd=" + xcn_7_degreeegMd
				+ ", xcn_8_sourceTable=" + xcn_8_sourceTable + ", xcn_9_assigningAuthority=" + xcn_9_assigningAuthority
				+ ", xcn_10_nameTypeCode=" + xcn_10_nameTypeCode + ", xcn_11_identifierCheckDigit="
				+ xcn_11_identifierCheckDigit + ", xcn_12_checkDigitScheme=" + xcn_12_checkDigitScheme
				+ ", xcn_13_identifierTypeCode=" + xcn_13_identifierTypeCode + ", xcn_14_assigningFacility="
				+ xcn_14_assigningFacility + ", xcn_15_nameRepresentationCode=" + xcn_15_nameRepresentationCode
				+ ", xcn_16_nameContext=" + xcn_16_nameContext + ", xcn_17_nameValidityRange="
				+ xcn_17_nameValidityRange + ", xcn_18_nameAssemblyOrder=" + xcn_18_nameAssemblyOrder
				+ ", xcn_19_effectiveDate=" + xcn_19_effectiveDate + ", xcn_20_expirationDate=" + xcn_20_expirationDate
				+ ", xcn_21_professionalSuffix=" + xcn_21_professionalSuffix + ", xcn_22_assigningJurisdiction="
				+ xcn_22_assigningJurisdiction + ", xcn_23_assigningAgencyOrDepartment="
				+ xcn_23_assigningAgencyOrDepartment + "]";
	} 
	
}
