package scratch.coding.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class FN_v24 {
	@JsonProperty("surname_fn_1")
	private String surname_fn_1;
	@JsonProperty("ownSurnamePrefix_fn_2")
	private String ownSurnamePrefix_fn_2;
	@JsonProperty("ownSurname_fn3")
	private String ownSurname_fn3;
	@JsonProperty("surnamePrefixFromPartnerSpouse_fn_4")
	private String surnamePrefixFromPartnerSpouse_fn_4;
	@JsonProperty("surnameFromPartnerSpouse_fn_5")
	private String surnameFromPartnerSpouse_fn_5;
	public FN_v24(String surname_fn_1, String ownSurnamePrefix_fn_2, String ownSurname_fn3,
			String surnamePrefixFromPartnerSpouse_fn_4, String surnameFromPartnerSpouse_fn_5) {
		super();
		this.surname_fn_1 = surname_fn_1;
		this.ownSurnamePrefix_fn_2 = ownSurnamePrefix_fn_2;
		this.ownSurname_fn3 = ownSurname_fn3;
		this.surnamePrefixFromPartnerSpouse_fn_4 = surnamePrefixFromPartnerSpouse_fn_4;
		this.surnameFromPartnerSpouse_fn_5 = surnameFromPartnerSpouse_fn_5;
	}
	public FN_v24() {
		super();
		this.surname_fn_1 = "";
		this.ownSurnamePrefix_fn_2 = "";
		this.ownSurname_fn3 = "";
		this.surnamePrefixFromPartnerSpouse_fn_4 = "";
		this.surnameFromPartnerSpouse_fn_5 = "";
	}
	public String getSurname_fn_1() {
		return surname_fn_1;
	}
	public void setSurname_fn_1(String surname_fn_1) {
		this.surname_fn_1 = surname_fn_1;
	}
	public String getOwnSurnamePrefix_fn_2() {
		return ownSurnamePrefix_fn_2;
	}
	public void setOwnSurnamePrefix_fn_2(String ownSurnamePrefix_fn_2) {
		this.ownSurnamePrefix_fn_2 = ownSurnamePrefix_fn_2;
	}
	public String getOwnSurname_fn3() {
		return ownSurname_fn3;
	}
	public void setOwnSurname_fn3(String ownSurname_fn3) {
		this.ownSurname_fn3 = ownSurname_fn3;
	}
	public String getSurnamePrefixFromPartnerSpouse_fn_4() {
		return surnamePrefixFromPartnerSpouse_fn_4;
	}
	public void setSurnamePrefixFromPartnerSpouse_fn_4(String surnamePrefixFromPartnerSpouse_fn_4) {
		this.surnamePrefixFromPartnerSpouse_fn_4 = surnamePrefixFromPartnerSpouse_fn_4;
	}
	public String getSurnameFromPartnerSpouse_fn_5() {
		return surnameFromPartnerSpouse_fn_5;
	}
	public void setSurnameFromPartnerSpouse_fn_5(String surnameFromPartnerSpouse_fn_5) {
		this.surnameFromPartnerSpouse_fn_5 = surnameFromPartnerSpouse_fn_5;
	}
	@Override
	public String toString() {
		return "FN_v24 [surname_fn_1=" + surname_fn_1 + ", ownSurnamePrefix_fn_2=" + ownSurnamePrefix_fn_2
				+ ", ownSurname_fn3=" + ownSurname_fn3 + ", surnamePrefixFromPartnerSpouse_fn_4="
				+ surnamePrefixFromPartnerSpouse_fn_4 + ", surnameFromPartnerSpouse_fn_5="
				+ surnameFromPartnerSpouse_fn_5 + "]";
	}
	
}

