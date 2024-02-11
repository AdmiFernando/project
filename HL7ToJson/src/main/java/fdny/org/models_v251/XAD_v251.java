//package fdny.org.models_v251;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import fdny.org.models.DR_v2;
//import fdny.org.models.SAD_v2;
//import fdny.org.models.TS_v2;
//
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XAD_v251 {
//	
//	@JsonProperty("streetAddress_xad_1")
//	private SAD_v2 streetAddress_xad_1;
//	@JsonProperty("otherDesignation_xad_2")
//	private String otherDesignation_xad_2;
//	@JsonProperty("city_xad_3")
//	private String city_xad_3;
//	@JsonProperty("stateOrProvince_xad_4")
//	private String stateOrProvince_xad_4;
//	@JsonProperty("zipOrPostalCode_xad_5")
//	private String zipOrPostalCode_xad_5;
//	@JsonProperty("country_xad_6")
//	private String country_xad_6;
//	@JsonProperty("addressType_xad_7")
//	private String addressType_xad_7;
//	@JsonProperty("otherGeographicDestination_xad_8")
//	private String otherGeographicDestination_xad_8;
//	@JsonProperty("countryParishCode_xad_9")
//	private String countryParishCode_xad_9;
//	@JsonProperty("censusTrack_xad_10")
//	private String censusTrack_xad_10;
//	@JsonProperty("addressRepresentationCode_xad_11")
//	private String addressRepresentationCode_xad_11;
//	@JsonProperty("addressValidityRange_xad_12")
//	private DR_v2 addressValidityRange_xad_12;
//	@JsonProperty("effectiveDate_xad_13")
//	private TS_v2 effectiveDate_xad_13;
//	@JsonProperty("expirationDate_xad_14")
//	private TS_v2 expirationDate_xad_14;
//	public XAD_v251(SAD_v2 streetAddress_xad_1, String otherDesignation_xad_2, String city_xad_3,
//			String stateOrProvince_xad_4, String zipOrPostalCode_xad_5, String country_xad_6, String addressType_xad_7,
//			String otherGeographicDestination_xad_8, String countryParishCode_xad_9, String censusTrack_xad_10,
//			String addressRepresentationCode_xad_11, DR_v2 addressValidityRange_xad_12,
//			TS_v2 effectiveDate_xad_13, TS_v2 expirationDate_xad_14) {
//		super();
//		this.streetAddress_xad_1 = streetAddress_xad_1;
//		this.otherDesignation_xad_2 = otherDesignation_xad_2;
//		this.city_xad_3 = city_xad_3;
//		this.stateOrProvince_xad_4 = stateOrProvince_xad_4;
//		this.zipOrPostalCode_xad_5 = zipOrPostalCode_xad_5;
//		this.country_xad_6 = country_xad_6;
//		this.addressType_xad_7 = addressType_xad_7;
//		this.otherGeographicDestination_xad_8 = otherGeographicDestination_xad_8;
//		this.countryParishCode_xad_9 = countryParishCode_xad_9;
//		this.censusTrack_xad_10 = censusTrack_xad_10;
//		this.addressRepresentationCode_xad_11 = addressRepresentationCode_xad_11;
//		this.addressValidityRange_xad_12 = addressValidityRange_xad_12;
//		this.effectiveDate_xad_13 = effectiveDate_xad_13;
//		this.expirationDate_xad_14 = expirationDate_xad_14;
//	}
//	public XAD_v251() {
//		super();
//		this.streetAddress_xad_1 = new SAD_v2();
//		this.otherDesignation_xad_2 = "";
//		this.city_xad_3 = "";
//		this.stateOrProvince_xad_4 = "";
//		this.zipOrPostalCode_xad_5 = "";
//		this.country_xad_6 = "";
//		this.addressType_xad_7 = "";
//		this.otherGeographicDestination_xad_8 = "";
//		this.countryParishCode_xad_9 = "";
//		this.censusTrack_xad_10 = "";
//		this.addressRepresentationCode_xad_11 = "";
//		this.addressValidityRange_xad_12 = new DR_v2();
//		this.effectiveDate_xad_13 = new TS_v2();
//		this.expirationDate_xad_14 = new TS_v2();
//	}
//	public SAD_v2 getStreetAddress_xad_1() {
//		return streetAddress_xad_1;
//	}
//	public void setStreetAddress_xad_1(SAD_v2 streetAddress_xad_1) {
//		this.streetAddress_xad_1 = streetAddress_xad_1;
//	}
//	public String getOtherDesignation_xad_2() {
//		return otherDesignation_xad_2;
//	}
//	public void setOtherDesignation_xad_2(String otherDesignation_xad_2) {
//		this.otherDesignation_xad_2 = otherDesignation_xad_2;
//	}
//	public String getCity_xad_3() {
//		return city_xad_3;
//	}
//	public void setCity_xad_3(String city_xad_3) {
//		this.city_xad_3 = city_xad_3;
//	}
//	public String getStateOrProvince_xad_4() {
//		return stateOrProvince_xad_4;
//	}
//	public void setStateOrProvince_xad_4(String stateOrProvince_xad_4) {
//		this.stateOrProvince_xad_4 = stateOrProvince_xad_4;
//	}
//	public String getZipOrPostalCode_xad_5() {
//		return zipOrPostalCode_xad_5;
//	}
//	public void setZipOrPostalCode_xad_5(String zipOrPostalCode_xad_5) {
//		this.zipOrPostalCode_xad_5 = zipOrPostalCode_xad_5;
//	}
//	public String getCountry_xad_6() {
//		return country_xad_6;
//	}
//	public void setCountry_xad_6(String country_xad_6) {
//		this.country_xad_6 = country_xad_6;
//	}
//	public String getAddressType_xad_7() {
//		return addressType_xad_7;
//	}
//	public void setAddressType_xad_7(String addressType_xad_7) {
//		this.addressType_xad_7 = addressType_xad_7;
//	}
//	public String getOtherGeographicDestination_xad_8() {
//		return otherGeographicDestination_xad_8;
//	}
//	public void setOtherGeographicDestination_xad_8(String otherGeographicDestination_xad_8) {
//		this.otherGeographicDestination_xad_8 = otherGeographicDestination_xad_8;
//	}
//	public String getCountryParishCode_xad_9() {
//		return countryParishCode_xad_9;
//	}
//	public void setCountryParishCode_xad_9(String countryParishCode_xad_9) {
//		this.countryParishCode_xad_9 = countryParishCode_xad_9;
//	}
//	public String getCensusTrack_xad_10() {
//		return censusTrack_xad_10;
//	}
//	public void setCensusTrack_xad_10(String censusTrack_xad_10) {
//		this.censusTrack_xad_10 = censusTrack_xad_10;
//	}
//	public String getAddressRepresentationCode_xad_11() {
//		return addressRepresentationCode_xad_11;
//	}
//	public void setAddressRepresentationCode_xad_11(String addressRepresentationCode_xad_11) {
//		this.addressRepresentationCode_xad_11 = addressRepresentationCode_xad_11;
//	}
//	public DR_v2 getAddressValidityRange_xad_12() {
//		return addressValidityRange_xad_12;
//	}
//	public void setAddressValidityRange_xad_12(DR_v2 addressValidityRange_xad_12) {
//		this.addressValidityRange_xad_12 = addressValidityRange_xad_12;
//	}
//	public TS_v2 getEffectiveDate_xad_13() {
//		return effectiveDate_xad_13;
//	}
//	public void setEffectiveDate_xad_13(TS_v2 effectiveDate_xad_13) {
//		this.effectiveDate_xad_13 = effectiveDate_xad_13;
//	}
//	public TS_v2 getExpirationDate_xad_14() {
//		return expirationDate_xad_14;
//	}
//	public void setExpirationDate_xad_14(TS_v2 expirationDate_xad_14) {
//		this.expirationDate_xad_14 = expirationDate_xad_14;
//	}
//	@Override
//	public String toString() {
//		return "XAD_v251 [streetAddress_xad_1=" + streetAddress_xad_1 + ", otherDesignation_xad_2="
//				+ otherDesignation_xad_2 + ", city_xad_3=" + city_xad_3 + ", stateOrProvince_xad_4="
//				+ stateOrProvince_xad_4 + ", zipOrPostalCode_xad_5=" + zipOrPostalCode_xad_5 + ", country_xad_6="
//				+ country_xad_6 + ", addressType_xad_7=" + addressType_xad_7 + ", otherGeographicDestination_xad_8="
//				+ otherGeographicDestination_xad_8 + ", countryParishCode_xad_9=" + countryParishCode_xad_9
//				+ ", censusTrack_xad_10=" + censusTrack_xad_10 + ", addressRepresentationCode_xad_11="
//				+ addressRepresentationCode_xad_11 + ", addressValidityRange_xad_12=" + addressValidityRange_xad_12
//				+ ", effectiveDate_xad_13=" + effectiveDate_xad_13 + ", expirationDate_xad_14=" + expirationDate_xad_14
//				+ "]";
//	}
//	
//}
