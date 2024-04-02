package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class DLN_v23 {
	@JsonProperty("dln_1_driversLicense")
	private String dln_1_driversLicense;
	@JsonProperty("dln_2_issuingStateOrProvince")
	private String dln_2_issuingStateOrProvince;
	@JsonProperty("dln_3_expirationDate")
	private String dln_3_expirationDate;
	public DLN_v23(String dln_1_driversLicense, String dln_2_issuingStateOrProvince, String dln_3_expirationDate) {
		super();
		this.dln_1_driversLicense = dln_1_driversLicense;
		this.dln_2_issuingStateOrProvince = dln_2_issuingStateOrProvince;
		this.dln_3_expirationDate = dln_3_expirationDate;
	}
	public DLN_v23() {
		super();
		this.dln_1_driversLicense = "";
		this.dln_2_issuingStateOrProvince = "";
		this.dln_3_expirationDate = "";
	}
	public String getDln_1_driversLicense() {
		return dln_1_driversLicense;
	}
	public void setDln_1_driversLicense(String dln_1_driversLicense) {
		this.dln_1_driversLicense = dln_1_driversLicense;
	}
	public String getDln_2_issuingStateOrProvince() {
		return dln_2_issuingStateOrProvince;
	}
	public void setDln_2_issuingStateOrProvince(String dln_2_issuingStateOrProvince) {
		this.dln_2_issuingStateOrProvince = dln_2_issuingStateOrProvince;
	}
	public String getDln_3_expirationDate() {
		return dln_3_expirationDate;
	}
	public void setDln_3_expirationDate(String dln_3_expirationDate) {
		this.dln_3_expirationDate = dln_3_expirationDate;
	}
	@Override
	public String toString() {
		return "DLN_v23 [dln_1_driversLicense=" + dln_1_driversLicense + ", dln_2_issuingStateOrProvince="
				+ dln_2_issuingStateOrProvince + ", dln_3_expirationDate=" + dln_3_expirationDate + "]";
	}
}
