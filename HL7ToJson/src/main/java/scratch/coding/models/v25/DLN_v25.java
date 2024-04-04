package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class DLN_v25 {
					
	@JsonProperty("dln_1_licenseNumber")
	private String dln_1_licenseNumber;
	@JsonProperty("dln_2_issuingStateProvinceCountry")
	private String dln_2_issuingStateProvinceCountry;
	@JsonProperty("dln_3_expirationDate")
	private String dln_3_expirationDate;
	public DLN_v25(String dln_1_licenseNumber, String dln_2_issuingStateProvinceCountry, String dln_3_expirationDate) {
		super();
		this.dln_1_licenseNumber = dln_1_licenseNumber;
		this.dln_2_issuingStateProvinceCountry = dln_2_issuingStateProvinceCountry;
		this.dln_3_expirationDate = dln_3_expirationDate;
	}
	public DLN_v25() {
		super();
		this.dln_1_licenseNumber = "";
		this.dln_2_issuingStateProvinceCountry = "";
		this.dln_3_expirationDate = "";
	}
	public String getDln_1_licenseNumber() {
		return dln_1_licenseNumber;
	}
	public void setDln_1_licenseNumber(String dln_1_licenseNumber) {
		this.dln_1_licenseNumber = dln_1_licenseNumber;
	}
	public String getDln_2_issuingStateProvinceCountry() {
		return dln_2_issuingStateProvinceCountry;
	}
	public void setDln_2_issuingStateProvinceCountry(String dln_2_issuingStateProvinceCountry) {
		this.dln_2_issuingStateProvinceCountry = dln_2_issuingStateProvinceCountry;
	}
	public String getDln_3_expirationDate() {
		return dln_3_expirationDate;
	}
	public void setDln_3_expirationDate(String dln_3_expirationDate) {
		this.dln_3_expirationDate = dln_3_expirationDate;
	}
	@Override
	public String toString() {
		return "DLN_v25 [dln_1_licenseNumber=" + dln_1_licenseNumber + ", dln_2_issuingStateProvinceCountry="
				+ dln_2_issuingStateProvinceCountry + ", dln_3_expirationDate=" + dln_3_expirationDate + "]";
	}
	
}
