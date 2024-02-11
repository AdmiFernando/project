//package fdny.org.models_v251;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import fdny.org.models.HD_v2;
//import fdny.org.models.v23.CWE_Identifier;
//
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CX_v251 {
//	@JsonProperty("cx_1_IdNumber")
//	private String cx_1_IdNumber;
//	@JsonProperty("cx_2_CheckDigit")
//	private String cx_2_CheckDigit;
//	@JsonProperty("cx_3_CheckDigitScheme")
//	private String cx_3_CheckDigitScheme;	
//	@JsonProperty("cx_4_AssigningAuthority")
//	private HD_v2 cx_4_AssigningAuthority;	
//	@JsonProperty("cx_5_IdentifierTypeCode")
//	private String cx_5_IdentifierTypeCode;
//	@JsonProperty("cx_6_AssigningFacility")
//	private HD_v2 cx_6_AssigningFacility;		
//	@JsonProperty("cx_7_EffectiveDate")
//	private String cx_7_EffectiveDate;		
//	@JsonProperty("cx_8_ExpirationDate")
//	private String cx_8_ExpirationDate;
//	@JsonProperty("cx_9_AssigningJurisdiction")
//	private CWE_Identifier cx_9_AssigningJurisdiction;
//	@JsonProperty("cx_10_AssigningAgencyOrDepartment")
//	private CWE_Identifier cx_10_AssigningAgencyOrDepartment;
//	public CX_v251(String cx_1_IdNumber, String cx_2_CheckDigit, String cx_3_CheckDigitScheme,
//			HD_v2 cx_4_AssigningAuthority, String cx_5_IdentifierTypeCode,
//			HD_v2 cx_6_AssigningFacility, String cx_7_EffectiveDate, String cx_8_ExpirationDate,
//			CWE_Identifier cx_9_AssigningJurisdiction, CWE_Identifier cx_10_AssigningAgencyOrDepartment) {
//		super();
//		this.cx_1_IdNumber = cx_1_IdNumber;
//		this.cx_2_CheckDigit = cx_2_CheckDigit;
//		this.cx_3_CheckDigitScheme = cx_3_CheckDigitScheme;
//		this.cx_4_AssigningAuthority = cx_4_AssigningAuthority;
//		this.cx_5_IdentifierTypeCode = cx_5_IdentifierTypeCode;
//		this.cx_6_AssigningFacility = cx_6_AssigningFacility;
//		this.cx_7_EffectiveDate = cx_7_EffectiveDate;
//		this.cx_8_ExpirationDate = cx_8_ExpirationDate;
//		this.cx_9_AssigningJurisdiction = cx_9_AssigningJurisdiction;
//		this.cx_10_AssigningAgencyOrDepartment = cx_10_AssigningAgencyOrDepartment;
//	}
//	public CX_v251() {
//		super();
//		this.cx_1_IdNumber = "";
//		this.cx_2_CheckDigit = "";
//		this.cx_3_CheckDigitScheme = "";
//		this.cx_4_AssigningAuthority = new HD_v2();
//		this.cx_5_IdentifierTypeCode = "";
//		this.cx_6_AssigningFacility = new HD_v2();
//		this.cx_7_EffectiveDate = "";
//		this.cx_8_ExpirationDate = "";
//		this.cx_9_AssigningJurisdiction = new CWE_Identifier();
//		this.cx_10_AssigningAgencyOrDepartment = new CWE_Identifier();
//	}
//	public String getCx_1_IdNumber() {
//		return cx_1_IdNumber;
//	}
//	public void setCx_1_IdNumber(String cx_1_IdNumber) {
//		this.cx_1_IdNumber = cx_1_IdNumber;
//	}
//	public String getCx_2_CheckDigit() {
//		return cx_2_CheckDigit;
//	}
//	public void setCx_2_CheckDigit(String cx_2_CheckDigit) {
//		this.cx_2_CheckDigit = cx_2_CheckDigit;
//	}
//	public String getCx_3_CheckDigitScheme() {
//		return cx_3_CheckDigitScheme;
//	}
//	public void setCx_3_CheckDigitScheme(String cx_3_CheckDigitScheme) {
//		this.cx_3_CheckDigitScheme = cx_3_CheckDigitScheme;
//	}
//	public HD_v2 getCx_4_AssigningAuthority() {
//		return cx_4_AssigningAuthority;
//	}
//	public void setCx_4_AssigningAuthority(HD_v2 cx_4_AssigningAuthority) {
//		this.cx_4_AssigningAuthority = cx_4_AssigningAuthority;
//	}
//	public String getCx_5_IdentifierTypeCode() {
//		return cx_5_IdentifierTypeCode;
//	}
//	public void setCx_5_IdentifierTypeCode(String cx_5_IdentifierTypeCode) {
//		this.cx_5_IdentifierTypeCode = cx_5_IdentifierTypeCode;
//	}
//	public HD_v2 getCx_6_AssigningFacility() {
//		return cx_6_AssigningFacility;
//	}
//	public void setCx_6_AssigningFacility(HD_v2 cx_6_AssigningFacility) {
//		this.cx_6_AssigningFacility = cx_6_AssigningFacility;
//	}
//	public String getCx_7_EffectiveDate() {
//		return cx_7_EffectiveDate;
//	}
//	public void setCx_7_EffectiveDate(String cx_7_EffectiveDate) {
//		this.cx_7_EffectiveDate = cx_7_EffectiveDate;
//	}
//	public String getCx_8_ExpirationDate() {
//		return cx_8_ExpirationDate;
//	}
//	public void setCx_8_ExpirationDate(String cx_8_ExpirationDate) {
//		this.cx_8_ExpirationDate = cx_8_ExpirationDate;
//	}
//	public CWE_Identifier getCx_9_AssigningJurisdiction() {
//		return cx_9_AssigningJurisdiction;
//	}
//	public void setCx_9_AssigningJurisdiction(CWE_Identifier cx_9_AssigningJurisdiction) {
//		this.cx_9_AssigningJurisdiction = cx_9_AssigningJurisdiction;
//	}
//	public CWE_Identifier getCx_10_AssigningAgencyOrDepartment() {
//		return cx_10_AssigningAgencyOrDepartment;
//	}
//	public void setCx_10_AssigningAgencyOrDepartment(CWE_Identifier cx_10_AssigningAgencyOrDepartment) {
//		this.cx_10_AssigningAgencyOrDepartment = cx_10_AssigningAgencyOrDepartment;
//	}
//	@Override
//	public String toString() {
//		return "CX_v251 [cx_1_IdNumber=" + cx_1_IdNumber + ", cx_2_CheckDigit=" + cx_2_CheckDigit
//				+ ", cx_3_CheckDigitScheme=" + cx_3_CheckDigitScheme + ", cx_4_AssigningAuthority="
//				+ cx_4_AssigningAuthority + ", cx_5_IdentifierTypeCode=" + cx_5_IdentifierTypeCode
//				+ ", cx_6_AssigningFacility=" + cx_6_AssigningFacility + ", cx_7_EffectiveDate=" + cx_7_EffectiveDate
//				+ ", cx_8_ExpirationDate=" + cx_8_ExpirationDate + ", cx_9_AssigningJurisdiction="
//				+ cx_9_AssigningJurisdiction + ", cx_10_AssigningAgencyOrDepartment="
//				+ cx_10_AssigningAgencyOrDepartment + "]";
//	}
//}
