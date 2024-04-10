//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
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
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.DR_ST;
//import scratch.coding.models.base.HD_ST;
//import scratch.coding.models.base.TS_ST;
////import scratch.coding.segment.base.v25.ORC_ST_v25;
//@Table(name="XCN_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XCN_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="XCN_ID")
//	private Long id;
//	@Column(name="XCN_1_v25")
//	@JsonProperty("xcn_1_idNumber")
//	private String xcn_1_idNumber;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "FN_XCN_2_v25", referencedColumnName = "FN_ID")
//	@JsonProperty("xcn_2_familyName")
//	private FN_ST_v25 xcn_2_familyName;
//	@Column(name="XCN_3_v25")
//	@JsonProperty("xcn_3_givenName")
//	private String xcn_3_givenName;
//	@Column(name="XCN_4_v25")
//	@JsonProperty("xcn_4_secondAndFurtherGivenNamesOrInitialsThereof")
//	private String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//	@Column(name="XCN_5_v25")
//	@JsonProperty("xcn_5_suffixegJrOrIii")
//	private String xcn_5_suffixegJrOrIii;
//	@Column(name="XCN_6_v25")
//	@JsonProperty("xcn_6_prefixegDr")
//	private String xcn_6_prefixegDr;
//	@Column(name="XCN_7_v25")
//	@JsonProperty("xcn_7_degreeegMd")
//	private String xcn_7_degreeegMd;
//	@Column(name="XCN_8_v25")
//	@JsonProperty("xcn_8_sourceTable")
//	private String xcn_8_sourceTable;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_XCN_9_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("xcn_9_assigningAuthority")
//	private HD_ST xcn_9_assigningAuthority;
//	@Column(name="XCN_10_v25")
//	@JsonProperty("xcn_10_nameTypeCode")
//	private String xcn_10_nameTypeCode;
//	@Column(name="XCN_11_v25")
//	@JsonProperty("xcn_11_identifierCheckDigit")
//	private String xcn_11_identifierCheckDigit;
//	@Column(name="XCN_12_v25")
//	@JsonProperty("xcn_12_checkDigitScheme")
//	private String xcn_12_checkDigitScheme;
//	@Column(name="XCN_13_v25")
//	@JsonProperty("xcn_13_identifierTypeCode")
//	private String xcn_13_identifierTypeCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_XCN_14_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("xcn_14_assigningFacility")
//	private HD_ST xcn_14_assigningFacility;
//	@Column(name="XCN_15_v25")
//	@JsonProperty("xcn_15_nameRepresentationCode")
//	private String xcn_15_nameRepresentationCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_XCN_16_v25", referencedColumnName = "CE_ID")
//	@JsonIgnoreProperties({"xcn_16_v25"})
//	@JsonProperty("xcn_16_nameContext")
//	private CE_ST xcn_16_nameContext;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "DR_XCN_17_v25", referencedColumnName = "DR_ID")
//	@JsonProperty("xcn_17_nameValidityRange")
//	private DR_ST xcn_17_nameValidityRange;
//	@Column(name="XCN_18_v25")
//	@JsonProperty("xcn_18_nameAssemblyOrder")
//	private String xcn_18_nameAssemblyOrder;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_XCN_19_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("xcn_19_effectiveDate")
//	private TS_ST xcn_19_effectiveDate;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_XCN_20_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("xcn_20_expirationDate")
//	private TS_ST xcn_20_expirationDate;
//	@Column(name="XCN_21_v25")
//	@JsonProperty("xcn_21_professionalSuffix")
//	private String xcn_21_professionalSuffix;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_XCN_22_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("xcn_22_assigningJurisdiction")
//	private CWE_ST_v25 xcn_22_assigningJurisdiction;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_XCN_23_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("xcn_23_assigningAgencyOrDepartment")
//	private CWE_ST_v25 xcn_23_assigningAgencyOrDepartment;
//	
//	public XCN_ST_v25(String xcn_1_idNumber, FN_ST_v25 xcn_2_familyName, String xcn_3_givenName,
//			String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof, String xcn_5_suffixegJrOrIii,
//			String xcn_6_prefixegDr, String xcn_7_degreeegMd, String xcn_8_sourceTable, HD_ST xcn_9_assigningAuthority,
//			String xcn_10_nameTypeCode, String xcn_11_identifierCheckDigit, String xcn_12_checkDigitScheme,
//			String xcn_13_identifierTypeCode, HD_ST xcn_14_assigningFacility, String xcn_15_nameRepresentationCode,
//			CE_ST xcn_16_nameContext, DR_ST xcn_17_nameValidityRange, String xcn_18_nameAssemblyOrder,
//			TS_ST xcn_19_effectiveDate, TS_ST xcn_20_expirationDate, String xcn_21_professionalSuffix,
//			CWE_ST_v25 xcn_22_assigningJurisdiction, CWE_ST_v25 xcn_23_assigningAgencyOrDepartment) {
//		super();
//		this.xcn_1_idNumber = xcn_1_idNumber;
//		this.xcn_2_familyName = xcn_2_familyName;
//		this.xcn_3_givenName = xcn_3_givenName;
//		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//		this.xcn_5_suffixegJrOrIii = xcn_5_suffixegJrOrIii;
//		this.xcn_6_prefixegDr = xcn_6_prefixegDr;
//		this.xcn_7_degreeegMd = xcn_7_degreeegMd;
//		this.xcn_8_sourceTable = xcn_8_sourceTable;
//		this.xcn_9_assigningAuthority = xcn_9_assigningAuthority;
//		this.xcn_10_nameTypeCode = xcn_10_nameTypeCode;
//		this.xcn_11_identifierCheckDigit = xcn_11_identifierCheckDigit;
//		this.xcn_12_checkDigitScheme = xcn_12_checkDigitScheme;
//		this.xcn_13_identifierTypeCode = xcn_13_identifierTypeCode;
//		this.xcn_14_assigningFacility = xcn_14_assigningFacility;
//		this.xcn_15_nameRepresentationCode = xcn_15_nameRepresentationCode;
//		this.xcn_16_nameContext = xcn_16_nameContext;
//		this.xcn_17_nameValidityRange = xcn_17_nameValidityRange;
//		this.xcn_18_nameAssemblyOrder = xcn_18_nameAssemblyOrder;
//		this.xcn_19_effectiveDate = xcn_19_effectiveDate;
//		this.xcn_20_expirationDate = xcn_20_expirationDate;
//		this.xcn_21_professionalSuffix = xcn_21_professionalSuffix;
//		this.xcn_22_assigningJurisdiction = xcn_22_assigningJurisdiction;
//		this.xcn_23_assigningAgencyOrDepartment = xcn_23_assigningAgencyOrDepartment;
//	}
//	public XCN_ST_v25() {
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
//	 * @return the xcn_1_idNumber
//	 *	@JsonProperty("xcn_1_idNumber")
//	 */
//	
//	public String getXcn_1_idNumber() {
//		return xcn_1_idNumber;
//	}
//	/**
//	 * @param xcn_1_idNumber the xcn_1_idNumber to set
//	 * @JsonProperty("xcn_1_idNumber")
//	 */
//	public void setXcn_1_idNumber(String xcn_1_idNumber) {
//		this.xcn_1_idNumber = xcn_1_idNumber;
//	}
//	/**
//	 * @return the xcn_2_familyName
//	 *	@JsonProperty("xcn_2_familyName")
//	 */
//	
//	public FN_ST_v25 getXcn_2_familyName() {
//		return xcn_2_familyName;
//	}
//	/**
//	 * @param xcn_2_familyName the xcn_2_familyName to set
//	 * @JsonProperty("xcn_2_familyName")
//	 */
//	public void setXcn_2_familyName(FN_ST_v25 xcn_2_familyName) {
//		this.xcn_2_familyName = xcn_2_familyName;
//	}
//	/**
//	 * @return the xcn_3_givenName
//	 *	@JsonProperty("xcn_3_givenName")
//	 */
//	
//	public String getXcn_3_givenName() {
//		return xcn_3_givenName;
//	}
//	/**
//	 * @param xcn_3_givenName the xcn_3_givenName to set
//	 * @JsonProperty("xcn_3_givenName")
//	 */
//	public void setXcn_3_givenName(String xcn_3_givenName) {
//		this.xcn_3_givenName = xcn_3_givenName;
//	}
//	/**
//	 * @return the xcn_4_secondAndFurtherGivenNamesOrInitialsThereof
//	 *	@JsonProperty("xcn_4_secondAndFurtherGivenNamesOrInitialsThereof")
//	 */
//	
//	public String getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof() {
//		return xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//	}
//	/**
//	 * @param xcn_4_secondAndFurtherGivenNamesOrInitialsThereof the xcn_4_secondAndFurtherGivenNamesOrInitialsThereof to set
//	 * @JsonProperty("xcn_4_secondAndFurtherGivenNamesOrInitialsThereof")
//	 */
//	public void setXcn_4_secondAndFurtherGivenNamesOrInitialsThereof(
//			String xcn_4_secondAndFurtherGivenNamesOrInitialsThereof) {
//		this.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof = xcn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//	}
//	/**
//	 * @return the xcn_5_suffixegJrOrIii
//	 *	@JsonProperty("xcn_5_suffixegJrOrIii")
//	 */
//	
//	public String getXcn_5_suffixegJrOrIii() {
//		return xcn_5_suffixegJrOrIii;
//	}
//	/**
//	 * @param xcn_5_suffixegJrOrIii the xcn_5_suffixegJrOrIii to set
//	 * @JsonProperty("xcn_5_suffixegJrOrIii")
//	 */
//	public void setXcn_5_suffixegJrOrIii(String xcn_5_suffixegJrOrIii) {
//		this.xcn_5_suffixegJrOrIii = xcn_5_suffixegJrOrIii;
//	}
//	/**
//	 * @return the xcn_6_prefixegDr
//	 *	@JsonProperty("xcn_6_prefixegDr")
//	 */
//	
//	public String getXcn_6_prefixegDr() {
//		return xcn_6_prefixegDr;
//	}
//	/**
//	 * @param xcn_6_prefixegDr the xcn_6_prefixegDr to set
//	 * @JsonProperty("xcn_6_prefixegDr")
//	 */
//	public void setXcn_6_prefixegDr(String xcn_6_prefixegDr) {
//		this.xcn_6_prefixegDr = xcn_6_prefixegDr;
//	}
//	/**
//	 * @return the xcn_7_degreeegMd
//	 *	@JsonProperty("xcn_7_degreeegMd")
//	 */
//	
//	public String getXcn_7_degreeegMd() {
//		return xcn_7_degreeegMd;
//	}
//	/**
//	 * @param xcn_7_degreeegMd the xcn_7_degreeegMd to set
//	 * @JsonProperty("xcn_7_degreeegMd")
//	 */
//	public void setXcn_7_degreeegMd(String xcn_7_degreeegMd) {
//		this.xcn_7_degreeegMd = xcn_7_degreeegMd;
//	}
//	/**
//	 * @return the xcn_8_sourceTable
//	 *	@JsonProperty("xcn_8_sourceTable")
//	 */
//	
//	public String getXcn_8_sourceTable() {
//		return xcn_8_sourceTable;
//	}
//	/**
//	 * @param xcn_8_sourceTable the xcn_8_sourceTable to set
//	 * @JsonProperty("xcn_8_sourceTable")
//	 */
//	public void setXcn_8_sourceTable(String xcn_8_sourceTable) {
//		this.xcn_8_sourceTable = xcn_8_sourceTable;
//	}
//	/**
//	 * @return the xcn_9_assigningAuthority
//	 *	@JsonProperty("xcn_9_assigningAuthority")
//	 */
//	
//	public HD_ST getXcn_9_assigningAuthority() {
//		return xcn_9_assigningAuthority;
//	}
//	/**
//	 * @param xcn_9_assigningAuthority the xcn_9_assigningAuthority to set
//	 * @JsonProperty("xcn_9_assigningAuthority")
//	 */
//	public void setXcn_9_assigningAuthority(HD_ST xcn_9_assigningAuthority) {
//		this.xcn_9_assigningAuthority = xcn_9_assigningAuthority;
//	}
//	/**
//	 * @return the xcn_10_nameTypeCode
//	 *	@JsonProperty("xcn_10_nameTypeCode")
//	 */
//	
//	public String getXcn_10_nameTypeCode() {
//		return xcn_10_nameTypeCode;
//	}
//	/**
//	 * @param xcn_10_nameTypeCode the xcn_10_nameTypeCode to set
//	 * @JsonProperty("xcn_10_nameTypeCode")
//	 */
//	public void setXcn_10_nameTypeCode(String xcn_10_nameTypeCode) {
//		this.xcn_10_nameTypeCode = xcn_10_nameTypeCode;
//	}
//	/**
//	 * @return the xcn_11_identifierCheckDigit
//	 *	@JsonProperty("xcn_11_identifierCheckDigit")
//	 */
//	
//	public String getXcn_11_identifierCheckDigit() {
//		return xcn_11_identifierCheckDigit;
//	}
//	/**
//	 * @param xcn_11_identifierCheckDigit the xcn_11_identifierCheckDigit to set
//	 * @JsonProperty("xcn_11_identifierCheckDigit")
//	 */
//	public void setXcn_11_identifierCheckDigit(String xcn_11_identifierCheckDigit) {
//		this.xcn_11_identifierCheckDigit = xcn_11_identifierCheckDigit;
//	}
//	/**
//	 * @return the xcn_12_checkDigitScheme
//	 *	@JsonProperty("xcn_12_checkDigitScheme")
//	 */
//	
//	public String getXcn_12_checkDigitScheme() {
//		return xcn_12_checkDigitScheme;
//	}
//	/**
//	 * @param xcn_12_checkDigitScheme the xcn_12_checkDigitScheme to set
//	 * @JsonProperty("xcn_12_checkDigitScheme")
//	 */
//	public void setXcn_12_checkDigitScheme(String xcn_12_checkDigitScheme) {
//		this.xcn_12_checkDigitScheme = xcn_12_checkDigitScheme;
//	}
//	/**
//	 * @return the xcn_13_identifierTypeCode
//	 *	@JsonProperty("xcn_13_identifierTypeCode")
//	 */
//	
//	public String getXcn_13_identifierTypeCode() {
//		return xcn_13_identifierTypeCode;
//	}
//	/**
//	 * @param xcn_13_identifierTypeCode the xcn_13_identifierTypeCode to set
//	 * @JsonProperty("xcn_13_identifierTypeCode")
//	 */
//	public void setXcn_13_identifierTypeCode(String xcn_13_identifierTypeCode) {
//		this.xcn_13_identifierTypeCode = xcn_13_identifierTypeCode;
//	}
//	/**
//	 * @return the xcn_14_assigningFacility
//	 *	@JsonProperty("xcn_14_assigningFacility")
//	 */
//	
//	public HD_ST getXcn_14_assigningFacility() {
//		return xcn_14_assigningFacility;
//	}
//	/**
//	 * @param xcn_14_assigningFacility the xcn_14_assigningFacility to set
//	 * @JsonProperty("xcn_14_assigningFacility")
//	 */
//	public void setXcn_14_assigningFacility(HD_ST xcn_14_assigningFacility) {
//		this.xcn_14_assigningFacility = xcn_14_assigningFacility;
//	}
//	/**
//	 * @return the xcn_15_nameRepresentationCode
//	 *	@JsonProperty("xcn_15_nameRepresentationCode")
//	 */
//	
//	public String getXcn_15_nameRepresentationCode() {
//		return xcn_15_nameRepresentationCode;
//	}
//	/**
//	 * @param xcn_15_nameRepresentationCode the xcn_15_nameRepresentationCode to set
//	 * @JsonProperty("xcn_15_nameRepresentationCode")
//	 */
//	public void setXcn_15_nameRepresentationCode(String xcn_15_nameRepresentationCode) {
//		this.xcn_15_nameRepresentationCode = xcn_15_nameRepresentationCode;
//	}
//	/**
//	 * @return the xcn_16_nameContext
//	 *	@JsonProperty("xcn_16_nameContext")
//	 */
//	
//	public CE_ST getXcn_16_nameContext() {
//		return xcn_16_nameContext;
//	}
//	/**
//	 * @param xcn_16_nameContext the xcn_16_nameContext to set
//	 * @JsonProperty("xcn_16_nameContext")
//	 */
//	public void setXcn_16_nameContext(CE_ST xcn_16_nameContext) {
//		this.xcn_16_nameContext = xcn_16_nameContext;
//	}
//	/**
//	 * @return the xcn_17_nameValidityRange
//	 *	@JsonProperty("xcn_17_nameValidityRange")
//	 */
//	
//	public DR_ST getXcn_17_nameValidityRange() {
//		return xcn_17_nameValidityRange;
//	}
//	/**
//	 * @param xcn_17_nameValidityRange the xcn_17_nameValidityRange to set
//	 * @JsonProperty("xcn_17_nameValidityRange")
//	 */
//	public void setXcn_17_nameValidityRange(DR_ST xcn_17_nameValidityRange) {
//		this.xcn_17_nameValidityRange = xcn_17_nameValidityRange;
//	}
//	/**
//	 * @return the xcn_18_nameAssemblyOrder
//	 *	@JsonProperty("xcn_18_nameAssemblyOrder")
//	 */
//	
//	public String getXcn_18_nameAssemblyOrder() {
//		return xcn_18_nameAssemblyOrder;
//	}
//	/**
//	 * @param xcn_18_nameAssemblyOrder the xcn_18_nameAssemblyOrder to set
//	 * @JsonProperty("xcn_18_nameAssemblyOrder")
//	 */
//	public void setXcn_18_nameAssemblyOrder(String xcn_18_nameAssemblyOrder) {
//		this.xcn_18_nameAssemblyOrder = xcn_18_nameAssemblyOrder;
//	}
//	/**
//	 * @return the xcn_19_effectiveDate
//	 *	@JsonProperty("xcn_19_effectiveDate")
//	 */
//	
//	public TS_ST getXcn_19_effectiveDate() {
//		return xcn_19_effectiveDate;
//	}
//	/**
//	 * @param xcn_19_effectiveDate the xcn_19_effectiveDate to set
//	 * @JsonProperty("xcn_19_effectiveDate")
//	 */
//	public void setXcn_19_effectiveDate(TS_ST xcn_19_effectiveDate) {
//		this.xcn_19_effectiveDate = xcn_19_effectiveDate;
//	}
//	/**
//	 * @return the xcn_20_expirationDate
//	 *	@JsonProperty("xcn_20_expirationDate")
//	 */
//	
//	public TS_ST getXcn_20_expirationDate() {
//		return xcn_20_expirationDate;
//	}
//	/**
//	 * @param xcn_20_expirationDate the xcn_20_expirationDate to set
//	 * @JsonProperty("xcn_20_expirationDate")
//	 */
//	public void setXcn_20_expirationDate(TS_ST xcn_20_expirationDate) {
//		this.xcn_20_expirationDate = xcn_20_expirationDate;
//	}
//	/**
//	 * @return the xcn_21_professionalSuffix
//	 *	@JsonProperty("xcn_21_professionalSuffix")
//	 */
//	
//	public String getXcn_21_professionalSuffix() {
//		return xcn_21_professionalSuffix;
//	}
//	/**
//	 * @param xcn_21_professionalSuffix the xcn_21_professionalSuffix to set
//	 * @JsonProperty("xcn_21_professionalSuffix")
//	 */
//	public void setXcn_21_professionalSuffix(String xcn_21_professionalSuffix) {
//		this.xcn_21_professionalSuffix = xcn_21_professionalSuffix;
//	}
//	/**
//	 * @return the xcn_22_assigningJurisdiction
//	 *	@JsonProperty("xcn_22_assigningJurisdiction")
//	 */
//	
//	public CWE_ST_v25 getXcn_22_assigningJurisdiction() {
//		return xcn_22_assigningJurisdiction;
//	}
//	/**
//	 * @param xcn_22_assigningJurisdiction the xcn_22_assigningJurisdiction to set
//	 * @JsonProperty("xcn_22_assigningJurisdiction")
//	 */
//	public void setXcn_22_assigningJurisdiction(CWE_ST_v25 xcn_22_assigningJurisdiction) {
//		this.xcn_22_assigningJurisdiction = xcn_22_assigningJurisdiction;
//	}
//	/**
//	 * @return the xcn_23_assigningAgencyOrDepartment
//	 *	@JsonProperty("xcn_23_assigningAgencyOrDepartment")
//	 */
//	
//	public CWE_ST_v25 getXcn_23_assigningAgencyOrDepartment() {
//		return xcn_23_assigningAgencyOrDepartment;
//	}
//	/**
//	 * @param xcn_23_assigningAgencyOrDepartment the xcn_23_assigningAgencyOrDepartment to set
//	 * @JsonProperty("xcn_23_assigningAgencyOrDepartment")
//	 */
//	public void setXcn_23_assigningAgencyOrDepartment(CWE_ST_v25 xcn_23_assigningAgencyOrDepartment) {
//		this.xcn_23_assigningAgencyOrDepartment = xcn_23_assigningAgencyOrDepartment;
//	}
//	@Override
//	public String toString() {
//		return "XCN_ST_v25 [id=" + id + ", xcn_1_idNumber=" + xcn_1_idNumber + ", xcn_2_familyName=" + xcn_2_familyName
//				+ ", xcn_3_givenName=" + xcn_3_givenName + ", xcn_4_secondAndFurtherGivenNamesOrInitialsThereof="
//				+ xcn_4_secondAndFurtherGivenNamesOrInitialsThereof + ", xcn_5_suffixegJrOrIii=" + xcn_5_suffixegJrOrIii
//				+ ", xcn_6_prefixegDr=" + xcn_6_prefixegDr + ", xcn_7_degreeegMd=" + xcn_7_degreeegMd
//				+ ", xcn_8_sourceTable=" + xcn_8_sourceTable + ", xcn_9_assigningAuthority=" + xcn_9_assigningAuthority
//				+ ", xcn_10_nameTypeCode=" + xcn_10_nameTypeCode + ", xcn_11_identifierCheckDigit="
//				+ xcn_11_identifierCheckDigit + ", xcn_12_checkDigitScheme=" + xcn_12_checkDigitScheme
//				+ ", xcn_13_identifierTypeCode=" + xcn_13_identifierTypeCode + ", xcn_14_assigningFacility="
//				+ xcn_14_assigningFacility + ", xcn_15_nameRepresentationCode=" + xcn_15_nameRepresentationCode
//				+ ", xcn_16_nameContext=" + xcn_16_nameContext + ", xcn_17_nameValidityRange="
//				+ xcn_17_nameValidityRange + ", xcn_18_nameAssemblyOrder=" + xcn_18_nameAssemblyOrder
//				+ ", xcn_19_effectiveDate=" + xcn_19_effectiveDate + ", xcn_20_expirationDate=" + xcn_20_expirationDate
//				+ ", xcn_21_professionalSuffix=" + xcn_21_professionalSuffix + ", xcn_22_assigningJurisdiction="
//				+ xcn_22_assigningJurisdiction + ", xcn_23_assigningAgencyOrDepartment="
//				+ xcn_23_assigningAgencyOrDepartment + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, xcn_10_nameTypeCode, xcn_11_identifierCheckDigit, xcn_12_checkDigitScheme,
//				xcn_13_identifierTypeCode, xcn_14_assigningFacility, xcn_15_nameRepresentationCode, xcn_16_nameContext,
//				xcn_17_nameValidityRange, xcn_18_nameAssemblyOrder, xcn_19_effectiveDate, xcn_1_idNumber,
//				xcn_20_expirationDate, xcn_21_professionalSuffix, xcn_22_assigningJurisdiction,
//				xcn_23_assigningAgencyOrDepartment, xcn_2_familyName, xcn_3_givenName,
//				xcn_4_secondAndFurtherGivenNamesOrInitialsThereof, xcn_5_suffixegJrOrIii, xcn_6_prefixegDr,
//				xcn_7_degreeegMd, xcn_8_sourceTable, xcn_9_assigningAuthority);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		XCN_ST_v25 other = (XCN_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(xcn_10_nameTypeCode, other.xcn_10_nameTypeCode)
//				&& Objects.equals(xcn_11_identifierCheckDigit, other.xcn_11_identifierCheckDigit)
//				&& Objects.equals(xcn_12_checkDigitScheme, other.xcn_12_checkDigitScheme)
//				&& Objects.equals(xcn_13_identifierTypeCode, other.xcn_13_identifierTypeCode)
//				&& Objects.equals(xcn_14_assigningFacility, other.xcn_14_assigningFacility)
//				&& Objects.equals(xcn_15_nameRepresentationCode, other.xcn_15_nameRepresentationCode)
//				&& Objects.equals(xcn_16_nameContext, other.xcn_16_nameContext)
//				&& Objects.equals(xcn_17_nameValidityRange, other.xcn_17_nameValidityRange)
//				&& Objects.equals(xcn_18_nameAssemblyOrder, other.xcn_18_nameAssemblyOrder)
//				&& Objects.equals(xcn_19_effectiveDate, other.xcn_19_effectiveDate)
//				&& Objects.equals(xcn_1_idNumber, other.xcn_1_idNumber)
//				&& Objects.equals(xcn_20_expirationDate, other.xcn_20_expirationDate)
//				&& Objects.equals(xcn_21_professionalSuffix, other.xcn_21_professionalSuffix)
//				&& Objects.equals(xcn_22_assigningJurisdiction, other.xcn_22_assigningJurisdiction)
//				&& Objects.equals(xcn_23_assigningAgencyOrDepartment, other.xcn_23_assigningAgencyOrDepartment)
//				&& Objects.equals(xcn_2_familyName, other.xcn_2_familyName)
//				&& Objects.equals(xcn_3_givenName, other.xcn_3_givenName)
//				&& Objects.equals(xcn_4_secondAndFurtherGivenNamesOrInitialsThereof,
//						other.xcn_4_secondAndFurtherGivenNamesOrInitialsThereof)
//				&& Objects.equals(xcn_5_suffixegJrOrIii, other.xcn_5_suffixegJrOrIii)
//				&& Objects.equals(xcn_6_prefixegDr, other.xcn_6_prefixegDr)
//				&& Objects.equals(xcn_7_degreeegMd, other.xcn_7_degreeegMd)
//				&& Objects.equals(xcn_8_sourceTable, other.xcn_8_sourceTable)
//				&& Objects.equals(xcn_9_assigningAuthority, other.xcn_9_assigningAuthority);
//	}
//	
//}
