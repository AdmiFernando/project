package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PLN_v25 {
	@JsonProperty("pnl_1_idNumber")
	private String pnl_1_idNumber;
	@JsonProperty("pnl_2_typeOfIdNumber")
	private String pnl_2_typeOfIdNumber;
	@JsonProperty("pnl_3_stateOtherQualifyingInformation")
	private String pnl_3_stateOtherQualifyingInformation;
	@JsonProperty("pnl_4_expirationDate")
	private String pnl_4_expirationDate;
	public PLN_v25(String pnl_1_idNumber, String pnl_2_typeOfIdNumber, String pnl_3_stateOtherQualifyingInformation,
			String pnl_4_expirationDate) {
		super();
		this.pnl_1_idNumber = pnl_1_idNumber;
		this.pnl_2_typeOfIdNumber = pnl_2_typeOfIdNumber;
		this.pnl_3_stateOtherQualifyingInformation = pnl_3_stateOtherQualifyingInformation;
		this.pnl_4_expirationDate = pnl_4_expirationDate;
	}
	public PLN_v25() {
		super();
		this.pnl_1_idNumber = "";
		this.pnl_2_typeOfIdNumber = "";
		this.pnl_3_stateOtherQualifyingInformation = "";
		this.pnl_4_expirationDate = "";
	}
	public String getPnl_1_idNumber() {
		return pnl_1_idNumber;
	}
	public void setPnl_1_idNumber(String pnl_1_idNumber) {
		this.pnl_1_idNumber = pnl_1_idNumber;
	}
	public String getPnl_2_typeOfIdNumber() {
		return pnl_2_typeOfIdNumber;
	}
	public void setPnl_2_typeOfIdNumber(String pnl_2_typeOfIdNumber) {
		this.pnl_2_typeOfIdNumber = pnl_2_typeOfIdNumber;
	}
	public String getPnl_3_stateOtherQualifyingInformation() {
		return pnl_3_stateOtherQualifyingInformation;
	}
	public void setPnl_3_stateOtherQualifyingInformation(String pnl_3_stateOtherQualifyingInformation) {
		this.pnl_3_stateOtherQualifyingInformation = pnl_3_stateOtherQualifyingInformation;
	}
	public String getPnl_4_expirationDate() {
		return pnl_4_expirationDate;
	}
	public void setPnl_4_expirationDate(String pnl_4_expirationDate) {
		this.pnl_4_expirationDate = pnl_4_expirationDate;
	}
	@Override
	public String toString() {
		return "PLN_v25 [pnl_1_idNumber=" + pnl_1_idNumber + ", pnl_2_typeOfIdNumber=" + pnl_2_typeOfIdNumber
				+ ", pnl_3_stateOtherQualifyingInformation=" + pnl_3_stateOtherQualifyingInformation
				+ ", pnl_4_expirationDate=" + pnl_4_expirationDate + "]";
	}
	
}
