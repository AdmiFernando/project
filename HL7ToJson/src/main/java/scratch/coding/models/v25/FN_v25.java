package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class FN_v25 {
		
	@JsonProperty("fn_1_surname")
	private String fn_1_surname;
	@JsonProperty("fn_2_ownSurnamePrefix")
	private String fn_2_ownSurnamePrefix;
	@JsonProperty("fn_3_ownSurname")
	private String fn_3_ownSurname;
	@JsonProperty("fn_4_surnamePrefixFromPartnerSpouse")
	private String fn_4_surnamePrefixFromPartnerSpouse;
	@JsonProperty("fn_5_surnameFromPartnerSpouse")
	private String fn_5_surnameFromPartnerSpouse;
	public FN_v25(String fn_1_surname, String fn_2_ownSurnamePrefix, String fn_3_ownSurname,
			String fn_4_surnamePrefixFromPartnerSpouse, String fn_5_surnameFromPartnerSpouse) {
		super();
		this.fn_1_surname = fn_1_surname;
		this.fn_2_ownSurnamePrefix = fn_2_ownSurnamePrefix;
		this.fn_3_ownSurname = fn_3_ownSurname;
		this.fn_4_surnamePrefixFromPartnerSpouse = fn_4_surnamePrefixFromPartnerSpouse;
		this.fn_5_surnameFromPartnerSpouse = fn_5_surnameFromPartnerSpouse;
	}
	public FN_v25() {
		super();
		this.fn_1_surname = "";
		this.fn_2_ownSurnamePrefix = "";
		this.fn_3_ownSurname = "";
		this.fn_4_surnamePrefixFromPartnerSpouse = "";
		this.fn_5_surnameFromPartnerSpouse = "";
	}
	public String getFn_1_surname() {
		return fn_1_surname;
	}
	public void setFn_1_surname(String fn_1_surname) {
		this.fn_1_surname = fn_1_surname;
	}
	public String getFn_2_ownSurnamePrefix() {
		return fn_2_ownSurnamePrefix;
	}
	public void setFn_2_ownSurnamePrefix(String fn_2_ownSurnamePrefix) {
		this.fn_2_ownSurnamePrefix = fn_2_ownSurnamePrefix;
	}
	public String getFn_3_ownSurname() {
		return fn_3_ownSurname;
	}
	public void setFn_3_ownSurname(String fn_3_ownSurname) {
		this.fn_3_ownSurname = fn_3_ownSurname;
	}
	public String getFn_4_surnamePrefixFromPartnerSpouse() {
		return fn_4_surnamePrefixFromPartnerSpouse;
	}
	public void setFn_4_surnamePrefixFromPartnerSpouse(String fn_4_surnamePrefixFromPartnerSpouse) {
		this.fn_4_surnamePrefixFromPartnerSpouse = fn_4_surnamePrefixFromPartnerSpouse;
	}
	public String getFn_5_surnameFromPartnerSpouse() {
		return fn_5_surnameFromPartnerSpouse;
	}
	public void setFn_5_surnameFromPartnerSpouse(String fn_5_surnameFromPartnerSpouse) {
		this.fn_5_surnameFromPartnerSpouse = fn_5_surnameFromPartnerSpouse;
	}
	@Override
	public String toString() {
		return "FN_v25 [fn_1_surname=" + fn_1_surname + ", fn_2_ownSurnamePrefix=" + fn_2_ownSurnamePrefix
				+ ", fn_3_ownSurname=" + fn_3_ownSurname + ", fn_4_surnamePrefixFromPartnerSpouse="
				+ fn_4_surnamePrefixFromPartnerSpouse + ", fn_5_surnameFromPartnerSpouse="
				+ fn_5_surnameFromPartnerSpouse + "]";
	}
	
}
