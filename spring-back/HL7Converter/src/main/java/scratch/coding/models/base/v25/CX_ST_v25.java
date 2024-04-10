//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.HD_ST;
//
//@Table(name="CX_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CX_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CX_ID")
//	private Long id;
//	@Column(name="CX_1_v25")
//	@JsonProperty("cx_1_idNumber")
//	private String cx_1_idNumber;
//	@Column(name="CX_2_v25")
//	@JsonProperty("cx_2_checkDigit")
//	private String cx_2_checkDigit;
//	@Column(name="CX_3_v25")
//	@JsonProperty("cx_3_checkDigitScheme")
//	private String cx_3_checkDigitScheme;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_CX_4_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("cx_4_assigningAuthority")
//	private HD_ST cx_4_assigningAuthority;
//	@Column(name="CX_5_v25")
//	@JsonProperty("cx_5_identifierTypeCode")
//	private String cx_5_identifierTypeCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_CX_6_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("cx_6_assigningFacility")
//	@JsonIgnoreProperties({"cx_4_v25","cx_6_v25"})
//	private HD_ST cx_6_assigningFacility;
//	@Column(name="CX_7_v25")
//	@JsonProperty("cx_7_effectiveDate")
//	private String cx_7_effectiveDate;
//	@Column(name="CX_8_v25")
//	@JsonProperty("cx_8_expirationDate")
//	private String cx_8_expirationDate;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_CX_9_v25", referencedColumnName = "CWE_ID")
//	@JsonIgnoreProperties({"cx_9_v25","cx_10_v25"})
//	@JsonProperty("cx_9_assigningJurisdiction")
//	private CWE_ST_v25 cx_9_assigningJurisdiction;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_CX_10_v25", referencedColumnName = "CWE_ID")
//	@JsonIgnoreProperties({"cx_9_v25","cx_10_v25"})
//	@JsonProperty("cx_10_assigningAgencyOrDepartment")
//	private CWE_ST_v25 cx_10_assigningAgencyOrDepartment;
//	
//	public CX_ST_v25(String cx_1_idNumber, String cx_2_checkDigit, String cx_3_checkDigitScheme,
//			HD_ST cx_4_assigningAuthority, String cx_5_identifierTypeCode, HD_ST cx_6_assigningFacility,
//			String cx_7_effectiveDate, String cx_8_expirationDate, CWE_ST_v25 cx_9_assigningJurisdiction,
//			CWE_ST_v25 cx_10_assigningAgencyOrDepartment) {
//		super();
//		this.cx_1_idNumber = cx_1_idNumber;
//		this.cx_2_checkDigit = cx_2_checkDigit;
//		this.cx_3_checkDigitScheme = cx_3_checkDigitScheme;
//		this.cx_4_assigningAuthority = cx_4_assigningAuthority;
//		this.cx_5_identifierTypeCode = cx_5_identifierTypeCode;
//		this.cx_6_assigningFacility = cx_6_assigningFacility;
//		this.cx_7_effectiveDate = cx_7_effectiveDate;
//		this.cx_8_expirationDate = cx_8_expirationDate;
//		this.cx_9_assigningJurisdiction = cx_9_assigningJurisdiction;
//		this.cx_10_assigningAgencyOrDepartment = cx_10_assigningAgencyOrDepartment;
//	}
//	public CX_ST_v25() {
//		super();
//	}
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * @return the cx_1_idNumber
//	 *	@JsonProperty("cx_1_idNumber")
//	 */
//	
//	public String getCx_1_idNumber() {
//		return cx_1_idNumber;
//	}
//	/**
//	 * @param cx_1_idNumber the cx_1_idNumber to set
//	 * @JsonProperty("cx_1_idNumber")
//	 */
//	public void setCx_1_idNumber(String cx_1_idNumber) {
//		this.cx_1_idNumber = cx_1_idNumber;
//	}
//	/**
//	 * @return the cx_2_checkDigit
//	 *	@JsonProperty("cx_2_checkDigit")
//	 */
//	
//	public String getCx_2_checkDigit() {
//		return cx_2_checkDigit;
//	}
//	/**
//	 * @param cx_2_checkDigit the cx_2_checkDigit to set
//	 * @JsonProperty("cx_2_checkDigit")
//	 */
//	public void setCx_2_checkDigit(String cx_2_checkDigit) {
//		this.cx_2_checkDigit = cx_2_checkDigit;
//	}
//	/**
//	 * @return the cx_3_checkDigitScheme
//	 *	@JsonProperty("cx_3_checkDigitScheme")
//	 */
//	
//	public String getCx_3_checkDigitScheme() {
//		return cx_3_checkDigitScheme;
//	}
//	/**
//	 * @param cx_3_checkDigitScheme the cx_3_checkDigitScheme to set
//	 * @JsonProperty("cx_3_checkDigitScheme")
//	 */
//	public void setCx_3_checkDigitScheme(String cx_3_checkDigitScheme) {
//		this.cx_3_checkDigitScheme = cx_3_checkDigitScheme;
//	}
//	/**
//	 * @return the cx_4_assigningAuthority
//	 *	@JsonProperty("cx_4_assigningAuthority")
//	 */
//	
//	public HD_ST getCx_4_assigningAuthority() {
//		return cx_4_assigningAuthority;
//	}
//	/**
//	 * @param cx_4_assigningAuthority the cx_4_assigningAuthority to set
//	 * @JsonProperty("cx_4_assigningAuthority")
//	 */
//	public void setCx_4_assigningAuthority(HD_ST cx_4_assigningAuthority) {
//		this.cx_4_assigningAuthority = cx_4_assigningAuthority;
//	}
//	/**
//	 * @return the cx_5_identifierTypeCode
//	 *	@JsonProperty("cx_5_identifierTypeCode")
//	 */
//	
//	public String getCx_5_identifierTypeCode() {
//		return cx_5_identifierTypeCode;
//	}
//	/**
//	 * @param cx_5_identifierTypeCode the cx_5_identifierTypeCode to set
//	 * @JsonProperty("cx_5_identifierTypeCode")
//	 */
//	public void setCx_5_identifierTypeCode(String cx_5_identifierTypeCode) {
//		this.cx_5_identifierTypeCode = cx_5_identifierTypeCode;
//	}
//	/**
//	 * @return the cx_6_assigningFacility
//	 *	@JsonProperty("cx_6_assigningFacility")
//	 */
//	
//	public HD_ST getCx_6_assigningFacility() {
//		return cx_6_assigningFacility;
//	}
//	/**
//	 * @param cx_6_assigningFacility the cx_6_assigningFacility to set
//	 * @JsonProperty("cx_6_assigningFacility")
//	 */
//	public void setCx_6_assigningFacility(HD_ST cx_6_assigningFacility) {
//		this.cx_6_assigningFacility = cx_6_assigningFacility;
//	}
//	/**
//	 * @return the cx_7_effectiveDate
//	 *	@JsonProperty("cx_7_effectiveDate")
//	 */
//	
//	public String getCx_7_effectiveDate() {
//		return cx_7_effectiveDate;
//	}
//	/**
//	 * @param cx_7_effectiveDate the cx_7_effectiveDate to set
//	 * @JsonProperty("cx_7_effectiveDate")
//	 */
//	public void setCx_7_effectiveDate(String cx_7_effectiveDate) {
//		this.cx_7_effectiveDate = cx_7_effectiveDate;
//	}
//	/**
//	 * @return the cx_8_expirationDate
//	 *	@JsonProperty("cx_8_expirationDate")
//	 */
//	
//	public String getCx_8_expirationDate() {
//		return cx_8_expirationDate;
//	}
//	/**
//	 * @param cx_8_expirationDate the cx_8_expirationDate to set
//	 * @JsonProperty("cx_8_expirationDate")
//	 */
//	public void setCx_8_expirationDate(String cx_8_expirationDate) {
//		this.cx_8_expirationDate = cx_8_expirationDate;
//	}
//	/**
//	 * @return the cx_9_assigningJurisdiction
//	 *	@JsonProperty("cx_9_assigningJurisdiction")
//	 */
//	
//	public CWE_ST_v25 getCx_9_assigningJurisdiction() {
//		return cx_9_assigningJurisdiction;
//	}
//	/**
//	 * @param cx_9_assigningJurisdiction the cx_9_assigningJurisdiction to set
//	 * @JsonProperty("cx_9_assigningJurisdiction")
//	 */
//	public void setCx_9_assigningJurisdiction(CWE_ST_v25 cx_9_assigningJurisdiction) {
//		this.cx_9_assigningJurisdiction = cx_9_assigningJurisdiction;
//	}
//	/**
//	 * @return the cx_10_assigningAgencyOrDepartment
//	 *	@JsonProperty("cx_10_assigningAgencyOrDepartment")
//	 */
//	
//	public CWE_ST_v25 getCx_10_assigningAgencyOrDepartment() {
//		return cx_10_assigningAgencyOrDepartment;
//	}
//	/**
//	 * @param cx_10_assigningAgencyOrDepartment the cx_10_assigningAgencyOrDepartment to set
//	 * @JsonProperty("cx_10_assigningAgencyOrDepartment")
//	 */
//	public void setCx_10_assigningAgencyOrDepartment(CWE_ST_v25 cx_10_assigningAgencyOrDepartment) {
//		this.cx_10_assigningAgencyOrDepartment = cx_10_assigningAgencyOrDepartment;
//	}
//	@Override
//	public String toString() {
//		return "CX_ST_v25 [id=" + id + ", cx_1_idNumber=" + cx_1_idNumber + ", cx_2_checkDigit=" + cx_2_checkDigit
//				+ ", cx_3_checkDigitScheme=" + cx_3_checkDigitScheme + ", cx_4_assigningAuthority="
//				+ cx_4_assigningAuthority + ", cx_5_identifierTypeCode=" + cx_5_identifierTypeCode
//				+ ", cx_6_assigningFacility=" + cx_6_assigningFacility + ", cx_7_effectiveDate=" + cx_7_effectiveDate
//				+ ", cx_8_expirationDate=" + cx_8_expirationDate + ", cx_9_assigningJurisdiction="
//				+ cx_9_assigningJurisdiction + ", cx_10_assigningAgencyOrDepartment="
//				+ cx_10_assigningAgencyOrDepartment + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(cx_10_assigningAgencyOrDepartment, cx_1_idNumber, cx_2_checkDigit, cx_3_checkDigitScheme,
//				cx_4_assigningAuthority, cx_5_identifierTypeCode, cx_6_assigningFacility, cx_7_effectiveDate,
//				cx_8_expirationDate, cx_9_assigningJurisdiction, id);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CX_ST_v25 other = (CX_ST_v25) obj;
//		return Objects.equals(cx_10_assigningAgencyOrDepartment, other.cx_10_assigningAgencyOrDepartment)
//				&& Objects.equals(cx_1_idNumber, other.cx_1_idNumber)
//				&& Objects.equals(cx_2_checkDigit, other.cx_2_checkDigit)
//				&& Objects.equals(cx_3_checkDigitScheme, other.cx_3_checkDigitScheme)
//				&& Objects.equals(cx_4_assigningAuthority, other.cx_4_assigningAuthority)
//				&& Objects.equals(cx_5_identifierTypeCode, other.cx_5_identifierTypeCode)
//				&& Objects.equals(cx_6_assigningFacility, other.cx_6_assigningFacility)
//				&& Objects.equals(cx_7_effectiveDate, other.cx_7_effectiveDate)
//				&& Objects.equals(cx_8_expirationDate, other.cx_8_expirationDate)
//				&& Objects.equals(cx_9_assigningJurisdiction, other.cx_9_assigningJurisdiction)
//				&& Objects.equals(id, other.id);
//	}
//	
//	
//		
//}
