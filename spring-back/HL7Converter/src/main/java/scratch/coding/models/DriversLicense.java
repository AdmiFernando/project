package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class DriversLicense implements Serializable {
	@JsonProperty("expirationDate")
	private String expirationDate;
	@JsonProperty("issuingStateOrProvince")
	private String issuingStateOrProvince;
	@JsonProperty("driversLicense")
	private String driversLicense;
	public DriversLicense(String expirationDate, String issuingStateOrProvince, String driversLicense) {
		super();
		this.expirationDate = expirationDate;
		this.issuingStateOrProvince = issuingStateOrProvince;
		this.driversLicense = driversLicense;
	}
	public DriversLicense() {
		super();
	}
	@JsonProperty("expirationDate")
	public String getExpirationDate() {
		return expirationDate;
	}
	@JsonProperty("expirationDate")
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	@JsonProperty("issuingStateOrProvince")
	public String getIssuingStateOrProvince() {
		return issuingStateOrProvince;
	}
	@JsonProperty("issuingStateOrProvince")
	public void setIssuingStateOrProvince(String issuingStateOrProvince) {
		this.issuingStateOrProvince = issuingStateOrProvince;
	}
	@JsonProperty("driversLicense")
	public String getDriversLicense() {
		return driversLicense;
	}
	@JsonProperty("driversLicense")
	public void setDriversLicense(String driversLicense) {
		this.driversLicense = driversLicense;
	}
	@Override
	public String toString() {
		return "DriversLicense [expirationDate=" + expirationDate + ", issuingStateOrProvince=" + issuingStateOrProvince
				+ ", driversLicense=" + driversLicense + "]";
	}
}
