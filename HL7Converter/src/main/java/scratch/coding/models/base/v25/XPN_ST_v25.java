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
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.DR_ST;
//import scratch.coding.models.base.TS_ST;
//
//@Table(name="XPN_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XPN_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="XPN_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "FN_XPN_1_v25", referencedColumnName = "FN_ID")
//	@JsonProperty("xpn_1_familyName")
//	private FN_ST_v25 xpn_1_familyName;
//	@Column(name="XPN_2_v25")
//	@JsonProperty("xpn_2_givenName")
//	private String xpn_2_givenName;
//	@Column(name="XPN_3_v25")
//	@JsonProperty("xpn_3_secondAndFurtherGivenNamesOrInitialsThereof")
//	private String xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
//	@Column(name="XPN_4_v25")
//	@JsonProperty("xpn_4_suffixEGJrOrIii")
//	private String xpn_4_suffixEGJrOrIii;
//	@Column(name="XPN_5_v25")
//	@JsonProperty("xpn_5_prefixEGDr")
//	private String xpn_5_prefixEGDr;
//	@Column(name="XPN_6_v25")
//	@JsonProperty("xpn_6_degreeEGMd")
//	private String xpn_6_degreeEGMd;
//	@Column(name="XPN_7_v25")
//	@JsonProperty("xpn_7_nameTypeCode")
//	private String xpn_7_nameTypeCode;
//	@Column(name="XPN_8_v25")
//	@JsonProperty("xpn_8_nameRepresentationCode")
//	private String xpn_8_nameRepresentationCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_XPN_9_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("xpn_9_nameContext")
//	private CE_ST xpn_9_nameContext;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "DR_XPN_10_v25", referencedColumnName = "DR_ID")
//	@JsonProperty("xpn_10_nameValidityRange")
//	private DR_ST xpn_10_nameValidityRange;
//	@Column(name="XPN_11_v25")
//	@JsonProperty("xpn_11_nameAssemblyOrder")
//	private String xpn_11_nameAssemblyOrder;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_XPN_12_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("xpn_12_effectiveDate")
//	private TS_ST xpn_12_effectiveDate;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_XPN_13_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("xpn_13_expirationDate")
//	private TS_ST xpn_13_expirationDate;
//	@Column(name="XPN_14_v25")
//	@JsonProperty("xpn_14_professionalSuffix")
//	private String xpn_14_professionalSuffix;
//
//	public XPN_ST_v25(FN_ST_v25 xpn_1_familyName, String xpn_2_givenName,
//			String xpn_3_secondAndFurtherGivenNamesOrInitialsThereof, String xpn_4_suffixEGJrOrIii,
//			String xpn_5_prefixEGDr, String xpn_6_degreeEGMd, String xpn_7_nameTypeCode,
//			String xpn_8_nameRepresentationCode, CE_ST xpn_9_nameContext, DR_ST xpn_10_nameValidityRange,
//			String xpn_11_nameAssemblyOrder, TS_ST xpn_12_effectiveDate, TS_ST xpn_13_expirationDate,
//			String xpn_14_professionalSuffix) {
//		super();
//		this.xpn_1_familyName = xpn_1_familyName;
//		this.xpn_2_givenName = xpn_2_givenName;
//		this.xpn_3_secondAndFurtherGivenNamesOrInitialsThereof = xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
//		this.xpn_4_suffixEGJrOrIii = xpn_4_suffixEGJrOrIii;
//		this.xpn_5_prefixEGDr = xpn_5_prefixEGDr;
//		this.xpn_6_degreeEGMd = xpn_6_degreeEGMd;
//		this.xpn_7_nameTypeCode = xpn_7_nameTypeCode;
//		this.xpn_8_nameRepresentationCode = xpn_8_nameRepresentationCode;
//		this.xpn_9_nameContext = xpn_9_nameContext;
//		this.xpn_10_nameValidityRange = xpn_10_nameValidityRange;
//		this.xpn_11_nameAssemblyOrder = xpn_11_nameAssemblyOrder;
//		this.xpn_12_effectiveDate = xpn_12_effectiveDate;
//		this.xpn_13_expirationDate = xpn_13_expirationDate;
//		this.xpn_14_professionalSuffix = xpn_14_professionalSuffix;
//	}
//
//	public XPN_ST_v25() {
//		super();
//	}
//
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the xpn_1_familyName
//	 *	@JsonProperty("xpn_1_familyName")
//	 */
//	
//	public FN_ST_v25 getXpn_1_familyName() {
//		return xpn_1_familyName;
//	}
//
//	/**
//	 * @param xpn_1_familyName the xpn_1_familyName to set
//	 * @JsonProperty("xpn_1_familyName")
//	 */
//	public void setXpn_1_familyName(FN_ST_v25 xpn_1_familyName) {
//		this.xpn_1_familyName = xpn_1_familyName;
//	}
//
//	/**
//	 * @return the xpn_2_givenName
//	 *	@JsonProperty("xpn_2_givenName")
//	 */
//	
//	public String getXpn_2_givenName() {
//		return xpn_2_givenName;
//	}
//
//	/**
//	 * @param xpn_2_givenName the xpn_2_givenName to set
//	 * @JsonProperty("xpn_2_givenName")
//	 */
//	public void setXpn_2_givenName(String xpn_2_givenName) {
//		this.xpn_2_givenName = xpn_2_givenName;
//	}
//
//	/**
//	 * @return the xpn_3_secondAndFurtherGivenNamesOrInitialsThereof
//	 *	@JsonProperty("xpn_3_secondAndFurtherGivenNamesOrInitialsThereof")
//	 */
//	
//	public String getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof() {
//		return xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
//	}
//
//	/**
//	 * @param xpn_3_secondAndFurtherGivenNamesOrInitialsThereof the xpn_3_secondAndFurtherGivenNamesOrInitialsThereof to set
//	 * @JsonProperty("xpn_3_secondAndFurtherGivenNamesOrInitialsThereof")
//	 */
//	public void setXpn_3_secondAndFurtherGivenNamesOrInitialsThereof(
//			String xpn_3_secondAndFurtherGivenNamesOrInitialsThereof) {
//		this.xpn_3_secondAndFurtherGivenNamesOrInitialsThereof = xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
//	}
//
//	/**
//	 * @return the xpn_4_suffixEGJrOrIii
//	 *	@JsonProperty("xpn_4_suffixEGJrOrIii")
//	 */
//	
//	public String getXpn_4_suffixEGJrOrIii() {
//		return xpn_4_suffixEGJrOrIii;
//	}
//
//	/**
//	 * @param xpn_4_suffixEGJrOrIii the xpn_4_suffixEGJrOrIii to set
//	 * @JsonProperty("xpn_4_suffixEGJrOrIii")
//	 */
//	public void setXpn_4_suffixEGJrOrIii(String xpn_4_suffixEGJrOrIii) {
//		this.xpn_4_suffixEGJrOrIii = xpn_4_suffixEGJrOrIii;
//	}
//
//	/**
//	 * @return the xpn_5_prefixEGDr
//	 *	@JsonProperty("xpn_5_prefixEGDr")
//	 */
//	
//	public String getXpn_5_prefixEGDr() {
//		return xpn_5_prefixEGDr;
//	}
//
//	/**
//	 * @param xpn_5_prefixEGDr the xpn_5_prefixEGDr to set
//	 * @JsonProperty("xpn_5_prefixEGDr")
//	 */
//	public void setXpn_5_prefixEGDr(String xpn_5_prefixEGDr) {
//		this.xpn_5_prefixEGDr = xpn_5_prefixEGDr;
//	}
//
//	/**
//	 * @return the xpn_6_degreeEGMd
//	 *	@JsonProperty("xpn_6_degreeEGMd")
//	 */
//	
//	public String getXpn_6_degreeEGMd() {
//		return xpn_6_degreeEGMd;
//	}
//
//	/**
//	 * @param xpn_6_degreeEGMd the xpn_6_degreeEGMd to set
//	 * @JsonProperty("xpn_6_degreeEGMd")
//	 */
//	public void setXpn_6_degreeEGMd(String xpn_6_degreeEGMd) {
//		this.xpn_6_degreeEGMd = xpn_6_degreeEGMd;
//	}
//
//	/**
//	 * @return the xpn_7_nameTypeCode
//	 *	@JsonProperty("xpn_7_nameTypeCode")
//	 */
//	
//	public String getXpn_7_nameTypeCode() {
//		return xpn_7_nameTypeCode;
//	}
//
//	/**
//	 * @param xpn_7_nameTypeCode the xpn_7_nameTypeCode to set
//	 * @JsonProperty("xpn_7_nameTypeCode")
//	 */
//	public void setXpn_7_nameTypeCode(String xpn_7_nameTypeCode) {
//		this.xpn_7_nameTypeCode = xpn_7_nameTypeCode;
//	}
//
//	/**
//	 * @return the xpn_8_nameRepresentationCode
//	 *	@JsonProperty("xpn_8_nameRepresentationCode")
//	 */
//	
//	public String getXpn_8_nameRepresentationCode() {
//		return xpn_8_nameRepresentationCode;
//	}
//
//	/**
//	 * @param xpn_8_nameRepresentationCode the xpn_8_nameRepresentationCode to set
//	 * @JsonProperty("xpn_8_nameRepresentationCode")
//	 */
//	public void setXpn_8_nameRepresentationCode(String xpn_8_nameRepresentationCode) {
//		this.xpn_8_nameRepresentationCode = xpn_8_nameRepresentationCode;
//	}
//
//	/**
//	 * @return the xpn_9_nameContext
//	 *	@JsonProperty("xpn_9_nameContext")
//	 */
//	
//	public CE_ST getXpn_9_nameContext() {
//		return xpn_9_nameContext;
//	}
//
//	/**
//	 * @param xpn_9_nameContext the xpn_9_nameContext to set
//	 * @JsonProperty("xpn_9_nameContext")
//	 */
//	public void setXpn_9_nameContext(CE_ST xpn_9_nameContext) {
//		this.xpn_9_nameContext = xpn_9_nameContext;
//	}
//
//	/**
//	 * @return the xpn_10_nameValidityRange
//	 *	@JsonProperty("xpn_10_nameValidityRange")
//	 */
//	
//	public DR_ST getXpn_10_nameValidityRange() {
//		return xpn_10_nameValidityRange;
//	}
//
//	/**
//	 * @param xpn_10_nameValidityRange the xpn_10_nameValidityRange to set
//	 * @JsonProperty("xpn_10_nameValidityRange")
//	 */
//	public void setXpn_10_nameValidityRange(DR_ST xpn_10_nameValidityRange) {
//		this.xpn_10_nameValidityRange = xpn_10_nameValidityRange;
//	}
//
//	/**
//	 * @return the xpn_11_nameAssemblyOrder
//	 *	@JsonProperty("xpn_11_nameAssemblyOrder")
//	 */
//	
//	public String getXpn_11_nameAssemblyOrder() {
//		return xpn_11_nameAssemblyOrder;
//	}
//
//	/**
//	 * @param xpn_11_nameAssemblyOrder the xpn_11_nameAssemblyOrder to set
//	 * @JsonProperty("xpn_11_nameAssemblyOrder")
//	 */
//	public void setXpn_11_nameAssemblyOrder(String xpn_11_nameAssemblyOrder) {
//		this.xpn_11_nameAssemblyOrder = xpn_11_nameAssemblyOrder;
//	}
//
//	/**
//	 * @return the xpn_12_effectiveDate
//	 *	@JsonProperty("xpn_12_effectiveDate")
//	 */
//	
//	public TS_ST getXpn_12_effectiveDate() {
//		return xpn_12_effectiveDate;
//	}
//
//	/**
//	 * @param xpn_12_effectiveDate the xpn_12_effectiveDate to set
//	 * @JsonProperty("xpn_12_effectiveDate")
//	 */
//	public void setXpn_12_effectiveDate(TS_ST xpn_12_effectiveDate) {
//		this.xpn_12_effectiveDate = xpn_12_effectiveDate;
//	}
//
//	/**
//	 * @return the xpn_13_expirationDate
//	 *	@JsonProperty("xpn_13_expirationDate")
//	 */
//	
//	public TS_ST getXpn_13_expirationDate() {
//		return xpn_13_expirationDate;
//	}
//
//	/**
//	 * @param xpn_13_expirationDate the xpn_13_expirationDate to set
//	 * @JsonProperty("xpn_13_expirationDate")
//	 */
//	public void setXpn_13_expirationDate(TS_ST xpn_13_expirationDate) {
//		this.xpn_13_expirationDate = xpn_13_expirationDate;
//	}
//
//	/**
//	 * @return the xpn_14_professionalSuffix
//	 *	@JsonProperty("xpn_14_professionalSuffix")
//	 */
//	
//	public String getXpn_14_professionalSuffix() {
//		return xpn_14_professionalSuffix;
//	}
//
//	/**
//	 * @param xpn_14_professionalSuffix the xpn_14_professionalSuffix to set
//	 * @JsonProperty("xpn_14_professionalSuffix")
//	 */
//	public void setXpn_14_professionalSuffix(String xpn_14_professionalSuffix) {
//		this.xpn_14_professionalSuffix = xpn_14_professionalSuffix;
//	}
//
//	@Override
//	public String toString() {
//		return "XPN_ST_v25 [id=" + id + ", xpn_1_familyName=" + xpn_1_familyName + ", xpn_2_givenName="
//				+ xpn_2_givenName + ", xpn_3_secondAndFurtherGivenNamesOrInitialsThereof="
//				+ xpn_3_secondAndFurtherGivenNamesOrInitialsThereof + ", xpn_4_suffixEGJrOrIii=" + xpn_4_suffixEGJrOrIii
//				+ ", xpn_5_prefixEGDr=" + xpn_5_prefixEGDr + ", xpn_6_degreeEGMd=" + xpn_6_degreeEGMd
//				+ ", xpn_7_nameTypeCode=" + xpn_7_nameTypeCode + ", xpn_8_nameRepresentationCode="
//				+ xpn_8_nameRepresentationCode + ", xpn_9_nameContext=" + xpn_9_nameContext
//				+ ", xpn_10_nameValidityRange=" + xpn_10_nameValidityRange + ", xpn_11_nameAssemblyOrder="
//				+ xpn_11_nameAssemblyOrder + ", xpn_12_effectiveDate=" + xpn_12_effectiveDate
//				+ ", xpn_13_expirationDate=" + xpn_13_expirationDate + ", xpn_14_professionalSuffix="
//				+ xpn_14_professionalSuffix + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, xpn_10_nameValidityRange, xpn_11_nameAssemblyOrder, xpn_12_effectiveDate,
//				xpn_13_expirationDate, xpn_14_professionalSuffix, xpn_1_familyName, xpn_2_givenName,
//				xpn_3_secondAndFurtherGivenNamesOrInitialsThereof, xpn_4_suffixEGJrOrIii, xpn_5_prefixEGDr,
//				xpn_6_degreeEGMd, xpn_7_nameTypeCode, xpn_8_nameRepresentationCode, xpn_9_nameContext);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		XPN_ST_v25 other = (XPN_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(xpn_10_nameValidityRange, other.xpn_10_nameValidityRange)
//				&& Objects.equals(xpn_11_nameAssemblyOrder, other.xpn_11_nameAssemblyOrder)
//				&& Objects.equals(xpn_12_effectiveDate, other.xpn_12_effectiveDate)
//				&& Objects.equals(xpn_13_expirationDate, other.xpn_13_expirationDate)
//				&& Objects.equals(xpn_14_professionalSuffix, other.xpn_14_professionalSuffix)
//				&& Objects.equals(xpn_1_familyName, other.xpn_1_familyName)
//				&& Objects.equals(xpn_2_givenName, other.xpn_2_givenName)
//				&& Objects.equals(xpn_3_secondAndFurtherGivenNamesOrInitialsThereof,
//						other.xpn_3_secondAndFurtherGivenNamesOrInitialsThereof)
//				&& Objects.equals(xpn_4_suffixEGJrOrIii, other.xpn_4_suffixEGJrOrIii)
//				&& Objects.equals(xpn_5_prefixEGDr, other.xpn_5_prefixEGDr)
//				&& Objects.equals(xpn_6_degreeEGMd, other.xpn_6_degreeEGMd)
//				&& Objects.equals(xpn_7_nameTypeCode, other.xpn_7_nameTypeCode)
//				&& Objects.equals(xpn_8_nameRepresentationCode, other.xpn_8_nameRepresentationCode)
//				&& Objects.equals(xpn_9_nameContext, other.xpn_9_nameContext);
//	}
//
//	
//	
//	
//}
