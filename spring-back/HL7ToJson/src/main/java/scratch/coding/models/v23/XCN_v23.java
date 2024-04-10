package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class XCN_v23 {
	@JsonProperty("xcn_1_idNumber")
	private String xcn_1_idNumber;
	@JsonProperty("xcn_2_familyName")
	private String xcn_2_familyName;
	@JsonProperty("xcn_3_givenName")
	private String xcn_3_givenName;
	@JsonProperty("xcn_4_middleInitialOrName")
	private String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	@JsonProperty("xcn_5_suffix")
	private String xcn_5_suffix;
	@JsonProperty("xcn_6_prefix")
	private String xcn_6_prefix;
	@JsonProperty("xcn_7_degree")
	private String xcn_7_degree;
	@JsonProperty("xcn_8_sourceTable")
	private String xcn_8_sourceTable;
	@JsonProperty("hd_xcn_9_assigningAuthority")
	private HD_v2 hd_xcn_9_assigningAuthority;
	@JsonProperty("xcn_10_nameTypeCode")
	private String xcn_10_nameTypeCode;
	@JsonProperty("xcn_11_identifierCheckDigit")
	private String xcn_11_identifierCheckDigit;
	@JsonProperty("xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed")
	private String xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed;
	@JsonProperty("xcn_13_identifierTypeCode")
	private String xcn_13_identifierTypeCode;
	@JsonProperty("hd_xcn_14_assigningFacilityId")
	private HD_v2 hd_xcn_14_assigningFacilityId;
	public XCN_v23(String xcn_1_idNumber, String xcn_2_familyName, String xcn_3_givenName,
			String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof, String xcn_5_suffix, String xcn_6_prefix,
			String xcn_7_degree, String xcn_8_sourceTable, HD_v2 hd_xcn_9_assigningAuthority,
			String xcn_10_nameTypeCode, String xcn_11_identifierCheckDigit,
			String xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed, String xcn_13_identifierTypeCode,
			HD_v2 hd_xcn_14_assigningFacilityId) {
		super();
		this.xcn_1_idNumber = xcn_1_idNumber;
		this.xcn_2_familyName = xcn_2_familyName;
		this.xcn_3_givenName = xcn_3_givenName;
		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
		this.xcn_5_suffix = xcn_5_suffix;
		this.xcn_6_prefix = xcn_6_prefix;
		this.xcn_7_degree = xcn_7_degree;
		this.xcn_8_sourceTable = xcn_8_sourceTable;
		this.hd_xcn_9_assigningAuthority = hd_xcn_9_assigningAuthority;
		this.xcn_10_nameTypeCode = xcn_10_nameTypeCode;
		this.xcn_11_identifierCheckDigit = xcn_11_identifierCheckDigit;
		this.xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed = xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed;
		this.xcn_13_identifierTypeCode = xcn_13_identifierTypeCode;
		this.hd_xcn_14_assigningFacilityId = hd_xcn_14_assigningFacilityId;
	}
	public XCN_v23() {
		super();
		this.xcn_1_idNumber = "";
		this.xcn_2_familyName = "";
		this.xcn_3_givenName = "";
		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = "";
		this.xcn_5_suffix = "";
		this.xcn_6_prefix = "";
		this.xcn_7_degree = "";
		this.xcn_8_sourceTable = "";
		this.hd_xcn_9_assigningAuthority = new HD_v2();
		this.xcn_10_nameTypeCode = "";
		this.xcn_11_identifierCheckDigit = "";
		this.xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed = "";
		this.xcn_13_identifierTypeCode = "";
		this.hd_xcn_14_assigningFacilityId = new HD_v2();
	}
	public String getXcn_1_idNumber() {
		return xcn_1_idNumber;
	}
	public void setXcn_1_idNumber(String xcn_1_idNumber) {
		this.xcn_1_idNumber = xcn_1_idNumber;
	}
	public String getXcn_2_familyName() {
		return xcn_2_familyName;
	}
	public void setXcn_2_familyName(String xcn_2_familyName) {
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
	public String getXcn_5_suffix() {
		return xcn_5_suffix;
	}
	public void setXcn_5_suffix(String xcn_5_suffix) {
		this.xcn_5_suffix = xcn_5_suffix;
	}
	public String getXcn_6_prefix() {
		return xcn_6_prefix;
	}
	public void setXcn_6_prefix(String xcn_6_prefix) {
		this.xcn_6_prefix = xcn_6_prefix;
	}
	public String getXcn_7_degree() {
		return xcn_7_degree;
	}
	public void setXcn_7_degree(String xcn_7_degree) {
		this.xcn_7_degree = xcn_7_degree;
	}
	public String getXcn_8_sourceTable() {
		return xcn_8_sourceTable;
	}
	public void setXcn_8_sourceTable(String xcn_8_sourceTable) {
		this.xcn_8_sourceTable = xcn_8_sourceTable;
	}
	public HD_v2 getHd_xcn_9_assigningAuthority() {
		return hd_xcn_9_assigningAuthority;
	}
	public void setHd_xcn_9_assigningAuthority(HD_v2 hd_xcn_9_assigningAuthority) {
		this.hd_xcn_9_assigningAuthority = hd_xcn_9_assigningAuthority;
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
	public String getXcn_12_codeIdentifyingTheCheckDigitSchemeEmployed() {
		return xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public void setXcn_12_codeIdentifyingTheCheckDigitSchemeEmployed(
			String xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed) {
		this.xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed = xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public String getXcn_13_identifierTypeCode() {
		return xcn_13_identifierTypeCode;
	}
	public void setXcn_13_identifierTypeCode(String xcn_13_identifierTypeCode) {
		this.xcn_13_identifierTypeCode = xcn_13_identifierTypeCode;
	}
	public HD_v2 getHd_xcn_14_assigningFacilityId() {
		return hd_xcn_14_assigningFacilityId;
	}
	public void setHd_xcn_14_assigningFacilityId(HD_v2 hd_xcn_14_assigningFacilityId) {
		this.hd_xcn_14_assigningFacilityId = hd_xcn_14_assigningFacilityId;
	}
	@Override
	public String toString() {
		return "XCN_Identification [xcn_1_idNumber=" + xcn_1_idNumber + ", xcn_2_familyName=" + xcn_2_familyName
				+ ", xcn_3_givenName=" + xcn_3_givenName + ", xcn_4_secondAndFurtherGivenNamesOrInitialsThereof="
				+ xcn_4_secondAndFurtherGivenNamesOrInitialsThereof + ", xcn_5_suffix=" + xcn_5_suffix
				+ ", xcn_6_prefix=" + xcn_6_prefix + ", xcn_7_degree=" + xcn_7_degree + ", xcn_8_sourceTable="
				+ xcn_8_sourceTable + ", hd_xcn_9_assigningAuthority=" + hd_xcn_9_assigningAuthority
				+ ", xcn_10_nameTypeCode=" + xcn_10_nameTypeCode + ", xcn_11_identifierCheckDigit="
				+ xcn_11_identifierCheckDigit + ", xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed="
				+ xcn_12_codeIdentifyingTheCheckDigitSchemeEmployed + ", xcn_13_identifierTypeCode="
				+ xcn_13_identifierTypeCode + ", hd_xcn_14_assigningFacilityId=" + hd_xcn_14_assigningFacilityId + "]";
	}
	
}
