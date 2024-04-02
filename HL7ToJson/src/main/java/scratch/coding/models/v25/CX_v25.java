package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CX_v25 {
	
	@JsonProperty("cx_1_idNumber")
	private String cx_1_idNumber;
	@JsonProperty("cx_2_checkDigit")
	private String cx_2_checkDigit;
	@JsonProperty("cx_3_checkDigitScheme")
	private String cx_3_checkDigitScheme;
	@JsonProperty("cx_4_assigningAuthority")
	private HD_v2 cx_4_assigningAuthority;
	@JsonProperty("cx_5_identifierTypeCode")
	private String cx_5_identifierTypeCode;
	@JsonProperty("cx_6_assigningFacility")
	private HD_v2 cx_6_assigningFacility;
	@JsonProperty("cx_7_effectiveDate")
	private String cx_7_effectiveDate;
	@JsonProperty("cx_8_expirationDate")
	private String cx_8_expirationDate;
	@JsonProperty("cx_9_assigningJurisdiction")
	private CWE_v25 cx_9_assigningJurisdiction;
	@JsonProperty("cx_10_assigningAgencyOrDepartment")
	private CWE_v25 cx_10_assigningAgencyOrDepartment;
	public CX_v25(String cx_1_idNumber, String cx_2_checkDigit, String cx_3_checkDigitScheme,
			HD_v2 cx_4_assigningAuthority, String cx_5_identifierTypeCode, HD_v2 cx_6_assigningFacility,
			String cx_7_effectiveDate, String cx_8_expirationDate, CWE_v25 cx_9_assigningJurisdiction,
			CWE_v25 cx_10_assigningAgencyOrDepartment) {
		super();
		this.cx_1_idNumber = cx_1_idNumber;
		this.cx_2_checkDigit = cx_2_checkDigit;
		this.cx_3_checkDigitScheme = cx_3_checkDigitScheme;
		this.cx_4_assigningAuthority = cx_4_assigningAuthority;
		this.cx_5_identifierTypeCode = cx_5_identifierTypeCode;
		this.cx_6_assigningFacility = cx_6_assigningFacility;
		this.cx_7_effectiveDate = cx_7_effectiveDate;
		this.cx_8_expirationDate = cx_8_expirationDate;
		this.cx_9_assigningJurisdiction = cx_9_assigningJurisdiction;
		this.cx_10_assigningAgencyOrDepartment = cx_10_assigningAgencyOrDepartment;
	}
	public CX_v25() {
		super();
		this.cx_1_idNumber = "";
		this.cx_2_checkDigit = "";
		this.cx_3_checkDigitScheme = "";
		this.cx_4_assigningAuthority = new HD_v2();
		this.cx_5_identifierTypeCode = "";
		this.cx_6_assigningFacility = new HD_v2();
		this.cx_7_effectiveDate = "";
		this.cx_8_expirationDate = "";
		this.cx_9_assigningJurisdiction = new CWE_v25();
		this.cx_10_assigningAgencyOrDepartment = new CWE_v25();
	}
	public String getCx_1_idNumber() {
		return cx_1_idNumber;
	}
	public void setCx_1_idNumber(String cx_1_idNumber) {
		this.cx_1_idNumber = cx_1_idNumber;
	}
	public String getCx_2_checkDigit() {
		return cx_2_checkDigit;
	}
	public void setCx_2_checkDigit(String cx_2_checkDigit) {
		this.cx_2_checkDigit = cx_2_checkDigit;
	}
	public String getCx_3_checkDigitScheme() {
		return cx_3_checkDigitScheme;
	}
	public void setCx_3_checkDigitScheme(String cx_3_checkDigitScheme) {
		this.cx_3_checkDigitScheme = cx_3_checkDigitScheme;
	}
	public HD_v2 getCx_4_assigningAuthority() {
		return cx_4_assigningAuthority;
	}
	public void setCx_4_assigningAuthority(HD_v2 cx_4_assigningAuthority) {
		this.cx_4_assigningAuthority = cx_4_assigningAuthority;
	}
	public String getCx_5_identifierTypeCode() {
		return cx_5_identifierTypeCode;
	}
	public void setCx_5_identifierTypeCode(String cx_5_identifierTypeCode) {
		this.cx_5_identifierTypeCode = cx_5_identifierTypeCode;
	}
	public HD_v2 getCx_6_assigningFacility() {
		return cx_6_assigningFacility;
	}
	public void setCx_6_assigningFacility(HD_v2 cx_6_assigningFacility) {
		this.cx_6_assigningFacility = cx_6_assigningFacility;
	}
	public String getCx_7_effectiveDate() {
		return cx_7_effectiveDate;
	}
	public void setCx_7_effectiveDate(String cx_7_effectiveDate) {
		this.cx_7_effectiveDate = cx_7_effectiveDate;
	}
	public String getCx_8_expirationDate() {
		return cx_8_expirationDate;
	}
	public void setCx_8_expirationDate(String cx_8_expirationDate) {
		this.cx_8_expirationDate = cx_8_expirationDate;
	}
	public CWE_v25 getCx_9_assigningJurisdiction() {
		return cx_9_assigningJurisdiction;
	}
	public void setCx_9_assigningJurisdiction(CWE_v25 cx_9_assigningJurisdiction) {
		this.cx_9_assigningJurisdiction = cx_9_assigningJurisdiction;
	}
	public CWE_v25 getCx_10_assigningAgencyOrDepartment() {
		return cx_10_assigningAgencyOrDepartment;
	}
	public void setCx_10_assigningAgencyOrDepartment(CWE_v25 cx_10_assigningAgencyOrDepartment) {
		this.cx_10_assigningAgencyOrDepartment = cx_10_assigningAgencyOrDepartment;
	}
	@Override
	public String toString() {
		return "CX_v25 [cx_1_idNumber=" + cx_1_idNumber + ", cx_2_checkDigit=" + cx_2_checkDigit
				+ ", cx_3_checkDigitScheme=" + cx_3_checkDigitScheme + ", cx_4_assigningAuthority="
				+ cx_4_assigningAuthority + ", cx_5_identifierTypeCode=" + cx_5_identifierTypeCode
				+ ", cx_6_assigningFacility=" + cx_6_assigningFacility + ", cx_7_effectiveDate=" + cx_7_effectiveDate
				+ ", cx_8_expirationDate=" + cx_8_expirationDate + ", cx_9_assigningJurisdiction="
				+ cx_9_assigningJurisdiction + ", cx_10_assigningAgencyOrDepartment="
				+ cx_10_assigningAgencyOrDepartment + "]";
	}
	
	
}
