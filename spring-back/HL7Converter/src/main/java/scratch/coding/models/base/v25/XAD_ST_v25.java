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
//import scratch.coding.models.base.DR_ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//
//@Table(name="XAD_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XAD_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="XAD_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="SAD_XAD_1_v25", referencedColumnName = "SAD_ID")
//	@JsonProperty("xad_1_streetAddress")
//	private SAD_ST_v25 xad_1_streetAddress;
//	@Column(name="XAD_2_v25")
//	@JsonProperty("xad_2_otherDesignation")
//	private String xad_2_otherDesignation;
//	@Column(name="XAD_3_v25")
//	@JsonProperty("xad_3_city")
//	private String xad_3_city;
//	@Column(name="XAD_4_v25")
//	@JsonProperty("xad_4_stateOrProvince")
//	private String xad_4_stateOrProvince;
//	@Column(name="XAD_5_v25")
//	@JsonProperty("xad_5_zipOrPostalCode")
//	private String xad_5_zipOrPostalCode;
//	@Column(name="XAD_6_v25")
//	@JsonProperty("xad_6_country")
//	private String xad_6_country;
//	@Column(name="XAD_7_v25")
//	@JsonProperty("xad_7_addressType")
//	private String xad_7_addressType;
//	@Column(name="XAD_8_v25")
//	@JsonProperty("xad_8_otherGeographicDesignation")
//	private String xad_8_otherGeographicDesignation;
//	@Column(name="XAD_9_v25")
//	@JsonProperty("xad_9_countyParishCode")
//	private String xad_9_countyParishCode;
//	@Column(name="XAD_10_v25")
//	@JsonProperty("xad_10_censusTract")
//	private String xad_10_censusTract;
//	@Column(name="XAD_11_v25")
//	@JsonProperty("xad_11_addressRepresentationCode")
//	private String xad_11_addressRepresentationCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="DR_XAD_12_v25", referencedColumnName = "DR_ID")
//	@JsonProperty("xad_12_addressValidityRange")
//	private DR_ST xad_12_addressValidityRange;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="XAD_13_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("xad_13_effectiveDate")
//	private TS_ST xad_13_effectiveDate;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="TS_XAD_14_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("xad_14_expirationDate")
//	private TS_ST xad_14_expirationDate;
//	
//	public XAD_ST_v25(SAD_ST_v25 xad_1_streetAddress, String xad_2_otherDesignation, String xad_3_city,
//			String xad_4_stateOrProvince, String xad_5_zipOrPostalCode, String xad_6_country, String xad_7_addressType,
//			String xad_8_otherGeographicDesignation, String xad_9_countyParishCode, String xad_10_censusTract,
//			String xad_11_addressRepresentationCode, DR_ST xad_12_addressValidityRange, TS_ST xad_13_effectiveDate,
//			TS_ST xad_14_expirationDate) {
//		super();
//		this.xad_1_streetAddress = xad_1_streetAddress;
//		this.xad_2_otherDesignation = xad_2_otherDesignation;
//		this.xad_3_city = xad_3_city;
//		this.xad_4_stateOrProvince = xad_4_stateOrProvince;
//		this.xad_5_zipOrPostalCode = xad_5_zipOrPostalCode;
//		this.xad_6_country = xad_6_country;
//		this.xad_7_addressType = xad_7_addressType;
//		this.xad_8_otherGeographicDesignation = xad_8_otherGeographicDesignation;
//		this.xad_9_countyParishCode = xad_9_countyParishCode;
//		this.xad_10_censusTract = xad_10_censusTract;
//		this.xad_11_addressRepresentationCode = xad_11_addressRepresentationCode;
//		this.xad_12_addressValidityRange = xad_12_addressValidityRange;
//		this.xad_13_effectiveDate = xad_13_effectiveDate;
//		this.xad_14_expirationDate = xad_14_expirationDate;
//	}
//	public XAD_ST_v25() {
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
//	 * @return the xad_1_streetAddress
//	 *	@JsonProperty("xad_1_streetAddress")
//	 */
//	
//	public SAD_ST_v25 getXad_1_streetAddress() {
//		return xad_1_streetAddress;
//	}
//	/**
//	 * @param xad_1_streetAddress the xad_1_streetAddress to set
//	 * @JsonProperty("xad_1_streetAddress")
//	 */
//	public void setXad_1_streetAddress(SAD_ST_v25 xad_1_streetAddress) {
//		this.xad_1_streetAddress = xad_1_streetAddress;
//	}
//	/**
//	 * @return the xad_2_otherDesignation
//	 *	@JsonProperty("xad_2_otherDesignation")
//	 */
//	
//	public String getXad_2_otherDesignation() {
//		return xad_2_otherDesignation;
//	}
//	/**
//	 * @param xad_2_otherDesignation the xad_2_otherDesignation to set
//	 * @JsonProperty("xad_2_otherDesignation")
//	 */
//	public void setXad_2_otherDesignation(String xad_2_otherDesignation) {
//		this.xad_2_otherDesignation = xad_2_otherDesignation;
//	}
//	/**
//	 * @return the xad_3_city
//	 *	@JsonProperty("xad_3_city")
//	 */
//	
//	public String getXad_3_city() {
//		return xad_3_city;
//	}
//	/**
//	 * @param xad_3_city the xad_3_city to set
//	 * @JsonProperty("xad_3_city")
//	 */
//	public void setXad_3_city(String xad_3_city) {
//		this.xad_3_city = xad_3_city;
//	}
//	/**
//	 * @return the xad_4_stateOrProvince
//	 *	@JsonProperty("xad_4_stateOrProvince")
//	 */
//	
//	public String getXad_4_stateOrProvince() {
//		return xad_4_stateOrProvince;
//	}
//	/**
//	 * @param xad_4_stateOrProvince the xad_4_stateOrProvince to set
//	 * @JsonProperty("xad_4_stateOrProvince")
//	 */
//	public void setXad_4_stateOrProvince(String xad_4_stateOrProvince) {
//		this.xad_4_stateOrProvince = xad_4_stateOrProvince;
//	}
//	/**
//	 * @return the xad_5_zipOrPostalCode
//	 *	@JsonProperty("xad_5_zipOrPostalCode")
//	 */
//	
//	public String getXad_5_zipOrPostalCode() {
//		return xad_5_zipOrPostalCode;
//	}
//	/**
//	 * @param xad_5_zipOrPostalCode the xad_5_zipOrPostalCode to set
//	 * @JsonProperty("xad_5_zipOrPostalCode")
//	 */
//	public void setXad_5_zipOrPostalCode(String xad_5_zipOrPostalCode) {
//		this.xad_5_zipOrPostalCode = xad_5_zipOrPostalCode;
//	}
//	/**
//	 * @return the xad_6_country
//	 *	@JsonProperty("xad_6_country")
//	 */
//	
//	public String getXad_6_country() {
//		return xad_6_country;
//	}
//	/**
//	 * @param xad_6_country the xad_6_country to set
//	 * @JsonProperty("xad_6_country")
//	 */
//	public void setXad_6_country(String xad_6_country) {
//		this.xad_6_country = xad_6_country;
//	}
//	/**
//	 * @return the xad_7_addressType
//	 *	@JsonProperty("xad_7_addressType")
//	 */
//	
//	public String getXad_7_addressType() {
//		return xad_7_addressType;
//	}
//	/**
//	 * @param xad_7_addressType the xad_7_addressType to set
//	 * @JsonProperty("xad_7_addressType")
//	 */
//	public void setXad_7_addressType(String xad_7_addressType) {
//		this.xad_7_addressType = xad_7_addressType;
//	}
//	/**
//	 * @return the xad_8_otherGeographicDesignation
//	 *	@JsonProperty("xad_8_otherGeographicDesignation")
//	 */
//	
//	public String getXad_8_otherGeographicDesignation() {
//		return xad_8_otherGeographicDesignation;
//	}
//	/**
//	 * @param xad_8_otherGeographicDesignation the xad_8_otherGeographicDesignation to set
//	 * @JsonProperty("xad_8_otherGeographicDesignation")
//	 */
//	public void setXad_8_otherGeographicDesignation(String xad_8_otherGeographicDesignation) {
//		this.xad_8_otherGeographicDesignation = xad_8_otherGeographicDesignation;
//	}
//	/**
//	 * @return the xad_9_countyParishCode
//	 *	@JsonProperty("xad_9_countyParishCode")
//	 */
//	
//	public String getXad_9_countyParishCode() {
//		return xad_9_countyParishCode;
//	}
//	/**
//	 * @param xad_9_countyParishCode the xad_9_countyParishCode to set
//	 * @JsonProperty("xad_9_countyParishCode")
//	 */
//	public void setXad_9_countyParishCode(String xad_9_countyParishCode) {
//		this.xad_9_countyParishCode = xad_9_countyParishCode;
//	}
//	/**
//	 * @return the xad_10_censusTract
//	 *	@JsonProperty("xad_10_censusTract")
//	 */
//	
//	public String getXad_10_censusTract() {
//		return xad_10_censusTract;
//	}
//	/**
//	 * @param xad_10_censusTract the xad_10_censusTract to set
//	 * @JsonProperty("xad_10_censusTract")
//	 */
//	public void setXad_10_censusTract(String xad_10_censusTract) {
//		this.xad_10_censusTract = xad_10_censusTract;
//	}
//	/**
//	 * @return the xad_11_addressRepresentationCode
//	 *	@JsonProperty("xad_11_addressRepresentationCode")
//	 */
//	
//	public String getXad_11_addressRepresentationCode() {
//		return xad_11_addressRepresentationCode;
//	}
//	/**
//	 * @param xad_11_addressRepresentationCode the xad_11_addressRepresentationCode to set
//	 * @JsonProperty("xad_11_addressRepresentationCode")
//	 */
//	public void setXad_11_addressRepresentationCode(String xad_11_addressRepresentationCode) {
//		this.xad_11_addressRepresentationCode = xad_11_addressRepresentationCode;
//	}
//	/**
//	 * @return the xad_12_addressValidityRange
//	 *	@JsonProperty("xad_12_addressValidityRange")
//	 */
//	
//	public DR_ST getXad_12_addressValidityRange() {
//		return xad_12_addressValidityRange;
//	}
//	/**
//	 * @param xad_12_addressValidityRange the xad_12_addressValidityRange to set
//	 * @JsonProperty("xad_12_addressValidityRange")
//	 */
//	public void setXad_12_addressValidityRange(DR_ST xad_12_addressValidityRange) {
//		this.xad_12_addressValidityRange = xad_12_addressValidityRange;
//	}
//	/**
//	 * @return the xad_13_effectiveDate
//	 *	@JsonProperty("xad_13_effectiveDate")
//	 */
//	
//	public TS_ST getXad_13_effectiveDate() {
//		return xad_13_effectiveDate;
//	}
//	/**
//	 * @param xad_13_effectiveDate the xad_13_effectiveDate to set
//	 * @JsonProperty("xad_13_effectiveDate")
//	 */
//	public void setXad_13_effectiveDate(TS_ST xad_13_effectiveDate) {
//		this.xad_13_effectiveDate = xad_13_effectiveDate;
//	}
//	/**
//	 * @return the xad_14_expirationDate
//	 *	@JsonProperty("xad_14_expirationDate")
//	 */
//	
//	public TS_ST getXad_14_expirationDate() {
//		return xad_14_expirationDate;
//	}
//	/**
//	 * @param xad_14_expirationDate the xad_14_expirationDate to set
//	 * @JsonProperty("xad_14_expirationDate")
//	 */
//	public void setXad_14_expirationDate(TS_ST xad_14_expirationDate) {
//		this.xad_14_expirationDate = xad_14_expirationDate;
//	}
//	@Override
//	public String toString() {
//		return "XAD_ST_v25 [id=" + id + ", xad_1_streetAddress=" + xad_1_streetAddress + ", xad_2_otherDesignation="
//				+ xad_2_otherDesignation + ", xad_3_city=" + xad_3_city + ", xad_4_stateOrProvince="
//				+ xad_4_stateOrProvince + ", xad_5_zipOrPostalCode=" + xad_5_zipOrPostalCode + ", xad_6_country="
//				+ xad_6_country + ", xad_7_addressType=" + xad_7_addressType + ", xad_8_otherGeographicDesignation="
//				+ xad_8_otherGeographicDesignation + ", xad_9_countyParishCode=" + xad_9_countyParishCode
//				+ ", xad_10_censusTract=" + xad_10_censusTract + ", xad_11_addressRepresentationCode="
//				+ xad_11_addressRepresentationCode + ", xad_12_addressValidityRange=" + xad_12_addressValidityRange
//				+ ", xad_13_effectiveDate=" + xad_13_effectiveDate + ", xad_14_expirationDate=" + xad_14_expirationDate
//				+ "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, xad_10_censusTract, xad_11_addressRepresentationCode, xad_12_addressValidityRange,
//				xad_13_effectiveDate, xad_14_expirationDate, xad_1_streetAddress, xad_2_otherDesignation, xad_3_city,
//				xad_4_stateOrProvince, xad_5_zipOrPostalCode, xad_6_country, xad_7_addressType,
//				xad_8_otherGeographicDesignation, xad_9_countyParishCode);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		XAD_ST_v25 other = (XAD_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(xad_10_censusTract, other.xad_10_censusTract)
//				&& Objects.equals(xad_11_addressRepresentationCode, other.xad_11_addressRepresentationCode)
//				&& Objects.equals(xad_12_addressValidityRange, other.xad_12_addressValidityRange)
//				&& Objects.equals(xad_13_effectiveDate, other.xad_13_effectiveDate)
//				&& Objects.equals(xad_14_expirationDate, other.xad_14_expirationDate)
//				&& Objects.equals(xad_1_streetAddress, other.xad_1_streetAddress)
//				&& Objects.equals(xad_2_otherDesignation, other.xad_2_otherDesignation)
//				&& Objects.equals(xad_3_city, other.xad_3_city)
//				&& Objects.equals(xad_4_stateOrProvince, other.xad_4_stateOrProvince)
//				&& Objects.equals(xad_5_zipOrPostalCode, other.xad_5_zipOrPostalCode)
//				&& Objects.equals(xad_6_country, other.xad_6_country)
//				&& Objects.equals(xad_7_addressType, other.xad_7_addressType)
//				&& Objects.equals(xad_8_otherGeographicDesignation, other.xad_8_otherGeographicDesignation)
//				&& Objects.equals(xad_9_countyParishCode, other.xad_9_countyParishCode);
//	}
//	
//	
//}
