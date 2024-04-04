package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author betancof
 *
 */
@JsonIgnoreProperties(ignoreUnknown= true)
public class XAD_v23 {
	
	@JsonProperty("xad_1_streetAddress")
	private String xad_1_streetAddress;
	@JsonProperty("xad_2_otherDestination")
	private String xad_2_otherDestination;
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
	@JsonProperty("xad_8_otherGeographicDestination")
	private String xad_8_otherGeographicDestination;
	@JsonProperty("xad_9_countryParishCode")
	private String xad_9_countryParishCode;
	@JsonProperty("xad_10_censusTrack")
	private String xad_10_censusTrack;
	public XAD_v23(String xad_1_streetAddress, String xad_2_otherDestination, String xad_3_city,
			String xad_4_stateOrProvince, String xad_5_zipOrPostalCode, String xad_6_country, String xad_7_addressType,
			String xad_8_otherGeographicDestination, String xad_9_countryParishCode, String xad_10_censusTrack) {
		super();
		this.xad_1_streetAddress = xad_1_streetAddress;
		this.xad_2_otherDestination = xad_2_otherDestination;
		this.xad_3_city = xad_3_city;
		this.xad_4_stateOrProvince = xad_4_stateOrProvince;
		this.xad_5_zipOrPostalCode = xad_5_zipOrPostalCode;
		this.xad_6_country = xad_6_country;
		this.xad_7_addressType = xad_7_addressType;
		this.xad_8_otherGeographicDestination = xad_8_otherGeographicDestination;
		this.xad_9_countryParishCode = xad_9_countryParishCode;
		this.xad_10_censusTrack = xad_10_censusTrack;
	}
	public XAD_v23() {
		super();
		this.xad_1_streetAddress = "";
		this.xad_2_otherDestination = "";
		this.xad_3_city = "";
		this.xad_4_stateOrProvince = "";
		this.xad_5_zipOrPostalCode = "";
		this.xad_6_country = "";
		this.xad_7_addressType = "";
		this.xad_8_otherGeographicDestination = "";
		this.xad_9_countryParishCode = "";
		this.xad_10_censusTrack = "";
	}
	public String getXad_1_streetAddress() {
		return xad_1_streetAddress;
	}
	public void setXad_1_streetAddress(String xad_1_streetAddress) {
		this.xad_1_streetAddress = xad_1_streetAddress;
	}
	public String getXad_2_otherDestination() {
		return xad_2_otherDestination;
	}
	public void setXad_2_otherDestination(String xad_2_otherDestination) {
		this.xad_2_otherDestination = xad_2_otherDestination;
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
	public String getXad_8_otherGeographicDestination() {
		return xad_8_otherGeographicDestination;
	}
	public void setXad_8_otherGeographicDestination(String xad_8_otherGeographicDestination) {
		this.xad_8_otherGeographicDestination = xad_8_otherGeographicDestination;
	}
	public String getXad_9_countryParishCode() {
		return xad_9_countryParishCode;
	}
	public void setXad_9_countryParishCode(String xad_9_countryParishCode) {
		this.xad_9_countryParishCode = xad_9_countryParishCode;
	}
	public String getXad_10_censusTrack() {
		return xad_10_censusTrack;
	}
	public void setXad_10_censusTrack(String xad_10_censusTrack) {
		this.xad_10_censusTrack = xad_10_censusTrack;
	}
	
}
