package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.DR_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XAD_v25 {		
			
	@JsonProperty("xad_1_streetAddress")
	private SAD_v25 xad_1_streetAddress;
	@JsonProperty("xad_2_otherDesignation")
	private String xad_2_otherDesignation;
	@JsonProperty("xad_3_city")
	private String xad_3_city;
	@JsonProperty("xad_4_stateOrProvince")
	private String xad_4_stateOrProvince;
	@JsonProperty("xad_5_zipOrPostalCode")
	private String xad_5_zipOrPostalCode;
	@JsonProperty("xad_6_country")
	private String xad_6_country;
	@JsonProperty("xad_7_addressType")
	private String xad_7_addressType;
	@JsonProperty("xad_8_otherGeographicDesignation")
	private String xad_8_otherGeographicDesignation;
	@JsonProperty("xad_9_countyParishCode")
	private String xad_9_countyParishCode;
	@JsonProperty("xad_10_censusTract")
	private String xad_10_censusTract;
	@JsonProperty("xad_11_addressRepresentationCode")
	private String xad_11_addressRepresentationCode;
	@JsonProperty("xad_12_addressValidityRange")
	private DR_v2 xad_12_addressValidityRange;
	@JsonProperty("xad_13_effectiveDate")
	private TS_v2 xad_13_effectiveDate;
	@JsonProperty("xad_14_expirationDate")
	private TS_v2 xad_14_expirationDate;
	public XAD_v25(SAD_v25 xad_1_streetAddress, String xad_2_otherDesignation, String xad_3_city,
			String xad_4_stateOrProvince, String xad_5_zipOrPostalCode, String xad_6_country, String xad_7_addressType,
			String xad_8_otherGeographicDesignation, String xad_9_countyParishCode, String xad_10_censusTract,
			String xad_11_addressRepresentationCode, DR_v2 xad_12_addressValidityRange, TS_v2 xad_13_effectiveDate,
			TS_v2 xad_14_expirationDate) {
		super();
		this.xad_1_streetAddress = xad_1_streetAddress;
		this.xad_2_otherDesignation = xad_2_otherDesignation;
		this.xad_3_city = xad_3_city;
		this.xad_4_stateOrProvince = xad_4_stateOrProvince;
		this.xad_5_zipOrPostalCode = xad_5_zipOrPostalCode;
		this.xad_6_country = xad_6_country;
		this.xad_7_addressType = xad_7_addressType;
		this.xad_8_otherGeographicDesignation = xad_8_otherGeographicDesignation;
		this.xad_9_countyParishCode = xad_9_countyParishCode;
		this.xad_10_censusTract = xad_10_censusTract;
		this.xad_11_addressRepresentationCode = xad_11_addressRepresentationCode;
		this.xad_12_addressValidityRange = xad_12_addressValidityRange;
		this.xad_13_effectiveDate = xad_13_effectiveDate;
		this.xad_14_expirationDate = xad_14_expirationDate;
	}
	public XAD_v25() {
		super();
		this.xad_1_streetAddress = new SAD_v25();
		this.xad_2_otherDesignation = "";
		this.xad_3_city = "";
		this.xad_4_stateOrProvince = "";
		this.xad_5_zipOrPostalCode = "";
		this.xad_6_country = "";
		this.xad_7_addressType = "";
		this.xad_8_otherGeographicDesignation = "";
		this.xad_9_countyParishCode = "";
		this.xad_10_censusTract = "";
		this.xad_11_addressRepresentationCode = "";
		this.xad_12_addressValidityRange = new DR_v2();
		this.xad_13_effectiveDate = new TS_v2();
		this.xad_14_expirationDate = new TS_v2();
	}
	public SAD_v25 getXad_1_streetAddress() {
		return xad_1_streetAddress;
	}
	public void setXad_1_streetAddress(SAD_v25 xad_1_streetAddress) {
		this.xad_1_streetAddress = xad_1_streetAddress;
	}
	public String getXad_2_otherDesignation() {
		return xad_2_otherDesignation;
	}
	public void setXad_2_otherDesignation(String xad_2_otherDesignation) {
		this.xad_2_otherDesignation = xad_2_otherDesignation;
	}
	public String getXad_3_city() {
		return xad_3_city;
	}
	public void setXad_3_city(String xad_3_city) {
		this.xad_3_city = xad_3_city;
	}
	public String getXad_4_stateOrProvince() {
		return xad_4_stateOrProvince;
	}
	public void setXad_4_stateOrProvince(String xad_4_stateOrProvince) {
		this.xad_4_stateOrProvince = xad_4_stateOrProvince;
	}
	public String getXad_5_zipOrPostalCode() {
		return xad_5_zipOrPostalCode;
	}
	public void setXad_5_zipOrPostalCode(String xad_5_zipOrPostalCode) {
		this.xad_5_zipOrPostalCode = xad_5_zipOrPostalCode;
	}
	public String getXad_6_country() {
		return xad_6_country;
	}
	public void setXad_6_country(String xad_6_country) {
		this.xad_6_country = xad_6_country;
	}
	public String getXad_7_addressType() {
		return xad_7_addressType;
	}
	public void setXad_7_addressType(String xad_7_addressType) {
		this.xad_7_addressType = xad_7_addressType;
	}
	public String getXad_8_otherGeographicDesignation() {
		return xad_8_otherGeographicDesignation;
	}
	public void setXad_8_otherGeographicDesignation(String xad_8_otherGeographicDesignation) {
		this.xad_8_otherGeographicDesignation = xad_8_otherGeographicDesignation;
	}
	public String getXad_9_countyParishCode() {
		return xad_9_countyParishCode;
	}
	public void setXad_9_countyParishCode(String xad_9_countyParishCode) {
		this.xad_9_countyParishCode = xad_9_countyParishCode;
	}
	public String getXad_10_censusTract() {
		return xad_10_censusTract;
	}
	public void setXad_10_censusTract(String xad_10_censusTract) {
		this.xad_10_censusTract = xad_10_censusTract;
	}
	public String getXad_11_addressRepresentationCode() {
		return xad_11_addressRepresentationCode;
	}
	public void setXad_11_addressRepresentationCode(String xad_11_addressRepresentationCode) {
		this.xad_11_addressRepresentationCode = xad_11_addressRepresentationCode;
	}
	public DR_v2 getXad_12_addressValidityRange() {
		return xad_12_addressValidityRange;
	}
	public void setXad_12_addressValidityRange(DR_v2 xad_12_addressValidityRange) {
		this.xad_12_addressValidityRange = xad_12_addressValidityRange;
	}
	public TS_v2 getXad_13_effectiveDate() {
		return xad_13_effectiveDate;
	}
	public void setXad_13_effectiveDate(TS_v2 xad_13_effectiveDate) {
		this.xad_13_effectiveDate = xad_13_effectiveDate;
	}
	public TS_v2 getXad_14_expirationDate() {
		return xad_14_expirationDate;
	}
	public void setXad_14_expirationDate(TS_v2 xad_14_expirationDate) {
		this.xad_14_expirationDate = xad_14_expirationDate;
	}
	@Override
	public String toString() {
		return "XAD_v25 [xad_1_streetAddress=" + xad_1_streetAddress + ", xad_2_otherDesignation="
				+ xad_2_otherDesignation + ", xad_3_city=" + xad_3_city + ", xad_4_stateOrProvince="
				+ xad_4_stateOrProvince + ", xad_5_zipOrPostalCode=" + xad_5_zipOrPostalCode + ", xad_6_country="
				+ xad_6_country + ", xad_7_addressType=" + xad_7_addressType + ", xad_8_otherGeographicDesignation="
				+ xad_8_otherGeographicDesignation + ", xad_9_countyParishCode=" + xad_9_countyParishCode
				+ ", xad_10_censusTract=" + xad_10_censusTract + ", xad_11_addressRepresentationCode="
				+ xad_11_addressRepresentationCode + ", xad_12_addressValidityRange=" + xad_12_addressValidityRange
				+ ", xad_13_effectiveDate=" + xad_13_effectiveDate + ", xad_14_expirationDate=" + xad_14_expirationDate
				+ "]";
	}
	
}
