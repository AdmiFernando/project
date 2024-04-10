package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Address implements Serializable {
	
	@JsonProperty("streetAddress")
	private String streetAddress;
	@JsonProperty("city")
	private String city;
	@JsonProperty("stateOrProvince")
	private String stateOrProvince;
	@JsonProperty("zipOrPostalCode")
	private String zipOrPostalCode;
	@JsonProperty("country")
	private String country;
	@JsonProperty("countryParishCode")
	private String countryParishCode;
	@JsonProperty("addressType")
	private String addressType;
	@JsonProperty("censusTrack")
	private String censusTrack;
	@JsonProperty("otherDestination")
	private String otherDestination;
	@JsonProperty("otherGeographicDestination")
	private String otherGeographicDestination;
	public Address(String streetAddress, String city, String stateOrProvince, String zipOrPostalCode, String country,
			String countryParishCode, String addressType, String censusTrack, String otherDestination,
			String otherGeographicDestination) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.stateOrProvince = stateOrProvince;
		this.zipOrPostalCode = zipOrPostalCode;
		this.country = country;
		this.countryParishCode = countryParishCode;
		this.addressType = addressType;
		this.censusTrack = censusTrack;
		this.otherDestination = otherDestination;
		this.otherGeographicDestination = otherGeographicDestination;
	}
	public Address() {
		super();
	}
	@JsonProperty("streetAddress")
	public String getStreetAddress() {
		return streetAddress;
	}
	@JsonProperty("streetAddress")
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	@JsonProperty("stateOrProvince")
	public String getStateOrProvince() {
		return stateOrProvince;
	}
	@JsonProperty("stateOrProvince")
	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}
	@JsonProperty("zipOrPostalCode")
	public String getZipOrPostalCode() {
		return zipOrPostalCode;
	}
	@JsonProperty("zipOrPostalCode")
	public void setZipOrPostalCode(String zipOrPostalCode) {
		this.zipOrPostalCode = zipOrPostalCode;
	}
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}
	@JsonProperty("countryParishCode")
	public String getCountryParishCode() {
		return countryParishCode;
	}
	@JsonProperty("countryParishCode")
	public void setCountryParishCode(String countryParishCode) {
		this.countryParishCode = countryParishCode;
	}
	@JsonProperty("addressType")
	public String getAddressType() {
		return addressType;
	}
	@JsonProperty("addressType")
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@JsonProperty("censusTrack")
	public String getCensusTrack() {
		return censusTrack;
	}
	@JsonProperty("censusTrack")
	public void setCensusTrack(String censusTrack) {
		this.censusTrack = censusTrack;
	}
	@JsonProperty("otherDestination")
	public String getOtherDestination() {
		return otherDestination;
	}
	@JsonProperty("otherDestination")
	public void setOtherDestination(String otherDestination) {
		this.otherDestination = otherDestination;
	}
	@JsonProperty("otherGeographicDestination")
	public String getOtherGeographicDestination() {
		return otherGeographicDestination;
	}
	@JsonProperty("otherGeographicDestination")
	public void setOtherGeographicDestination(String otherGeographicDestination) {
		this.otherGeographicDestination = otherGeographicDestination;
	}
	@JsonProperty("city")
	public String getCity() {
		return city;
	}
	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", stateOrProvince=" + stateOrProvince + ", zipOrPostalCode="
				+ zipOrPostalCode + ", country=" + country + ", addressType=" + addressType + ", censusTrack="
				+ censusTrack + ", otherDestination=" + otherDestination + ", otherGeographicDestination="
				+ otherGeographicDestination + "]";
	}
}
