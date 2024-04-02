package scratch.coding.models_v251;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class FN_v251 {
	
	@JsonProperty("fn_1_Surname")
	private String fn_1_Surname;
	@JsonProperty("fn_2_OwnSurnamePrefix")
	private String fn_2_OwnSurnamePrefix;
	@JsonProperty("fn_3_OwnSurname")
	private String fn_3_OwnSurname;
	@JsonProperty("fn_4_SurnamePrefixFromPartnerSpouse")
	private String fn_4_SurnamePrefixFromPartnerSpouse;
	@JsonProperty("fn_5_SurnameFromPartnerSpouse")
	private String fn_5_SurnameFromPartnerSpouse;
	public FN_v251(String fn_1_Surname, String fn_2_OwnSurnamePrefix, String fn_3_OwnSurname,
			String fn_4_SurnamePrefixFromPartnerSpouse, String fn_5_SurnameFromPartnerSpouse) {
		super();
		this.fn_1_Surname = fn_1_Surname;
		this.fn_2_OwnSurnamePrefix = fn_2_OwnSurnamePrefix;
		this.fn_3_OwnSurname = fn_3_OwnSurname;
		this.fn_4_SurnamePrefixFromPartnerSpouse = fn_4_SurnamePrefixFromPartnerSpouse;
		this.fn_5_SurnameFromPartnerSpouse = fn_5_SurnameFromPartnerSpouse;
	}
	public FN_v251() {
		super();
		this.fn_1_Surname = "";
		this.fn_2_OwnSurnamePrefix = "";
		this.fn_3_OwnSurname = "";
		this.fn_4_SurnamePrefixFromPartnerSpouse = "";
		this.fn_5_SurnameFromPartnerSpouse = "";
	}
	public String getFn_1_Surname() {
		return fn_1_Surname;
	}
	public void setFn_1_Surname(String fn_1_Surname) {
		this.fn_1_Surname = fn_1_Surname;
	}
	public String getFn_2_OwnSurnamePrefix() {
		return fn_2_OwnSurnamePrefix;
	}
	public void setFn_2_OwnSurnamePrefix(String fn_2_OwnSurnamePrefix) {
		this.fn_2_OwnSurnamePrefix = fn_2_OwnSurnamePrefix;
	}
	public String getFn_3_OwnSurname() {
		return fn_3_OwnSurname;
	}
	public void setFn_3_OwnSurname(String fn_3_OwnSurname) {
		this.fn_3_OwnSurname = fn_3_OwnSurname;
	}
	public String getFn_4_SurnamePrefixFromPartnerSpouse() {
		return fn_4_SurnamePrefixFromPartnerSpouse;
	}
	public void setFn_4_SurnamePrefixFromPartnerSpouse(String fn_4_SurnamePrefixFromPartnerSpouse) {
		this.fn_4_SurnamePrefixFromPartnerSpouse = fn_4_SurnamePrefixFromPartnerSpouse;
	}
	public String getFn_5_SurnameFromPartnerSpouse() {
		return fn_5_SurnameFromPartnerSpouse;
	}
	public void setFn_5_SurnameFromPartnerSpouse(String fn_5_SurnameFromPartnerSpouse) {
		this.fn_5_SurnameFromPartnerSpouse = fn_5_SurnameFromPartnerSpouse;
	}
	@Override
	public String toString() {
		return "FN_v251 [fn_1_Surname=" + fn_1_Surname + ", fn_2_OwnSurnamePrefix=" + fn_2_OwnSurnamePrefix
				+ ", fn_3_OwnSurname=" + fn_3_OwnSurname + ", fn_4_SurnamePrefixFromPartnerSpouse="
				+ fn_4_SurnamePrefixFromPartnerSpouse + ", fn_5_SurnameFromPartnerSpouse="
				+ fn_5_SurnameFromPartnerSpouse + "]";
	}
	
	
	
}
