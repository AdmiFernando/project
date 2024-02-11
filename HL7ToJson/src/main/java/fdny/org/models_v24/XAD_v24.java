//package fdny.org.models_v24;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import fdny.org.models.DR_v2;
//import fdny.org.models.SAD_v2;
//
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class XAD_v24 {
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
//	@JsonProperty("otherGeographicDesignation_xad_8")
//	private String otherGeographicDesignation_xad_8;
//	@JsonProperty("countyParishCode_xad_9")
//	private String countyParishCode_xad_9;
//	@JsonProperty("censusTract_xad_10")
//	private String censusTract_xad_10;
//	@JsonProperty("addressRepresentationCode_xad_11")
//	private String addressRepresentationCode_xad_11;
//	@JsonProperty("addressValidityRange_xad_12")
//	private DR_v2 addressValidityRange_xad_12;
//	public XAD_v24(SAD_v2 streetAddress_xad_1, String otherDesignation_xad_2, String city_xad_3,
//			String stateOrProvince_xad_4, String zipOrPostalCode_xad_5, String country_xad_6, String addressType_xad_7,
//			String otherGeographicDesignation_xad_8, String countyParishCode_xad_9, String censusTract_xad_10,
//			String addressRepresentationCode_xad_11, DR_v2 addressValidityRange_xad_12) {
//		super();
//		this.streetAddress_xad_1 = streetAddress_xad_1;
//		this.otherDesignation_xad_2 = otherDesignation_xad_2;
//		this.city_xad_3 = city_xad_3;
//		this.stateOrProvince_xad_4 = stateOrProvince_xad_4;
//		this.zipOrPostalCode_xad_5 = zipOrPostalCode_xad_5;
//		this.country_xad_6 = country_xad_6;
//		this.addressType_xad_7 = addressType_xad_7;
//		this.otherGeographicDesignation_xad_8 = otherGeographicDesignation_xad_8;
//		this.countyParishCode_xad_9 = countyParishCode_xad_9;
//		this.censusTract_xad_10 = censusTract_xad_10;
//		this.addressRepresentationCode_xad_11 = addressRepresentationCode_xad_11;
//		this.addressValidityRange_xad_12 = addressValidityRange_xad_12;
//	}
//	public XAD_v24() {
//		super();
//		this.streetAddress_xad_1 = new SAD_v2();
//		this.otherDesignation_xad_2 = "";
//		this.city_xad_3 = "";
//		this.stateOrProvince_xad_4 = "";
//		this.zipOrPostalCode_xad_5 = "";
//		this.country_xad_6 = "";
//		this.addressType_xad_7 = "";
//		this.otherGeographicDesignation_xad_8 = "";
//		this.countyParishCode_xad_9 = "";
//		this.censusTract_xad_10 = "";
//		this.addressRepresentationCode_xad_11 = "";
//		this.addressValidityRange_xad_12 = new DR_v2();
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
//	public String getOtherGeographicDesignation_xad_8() {
//		return otherGeographicDesignation_xad_8;
//	}
//	public void setOtherGeographicDesignation_xad_8(String otherGeographicDesignation_xad_8) {
//		this.otherGeographicDesignation_xad_8 = otherGeographicDesignation_xad_8;
//	}
//	public String getCountyParishCode_xad_9() {
//		return countyParishCode_xad_9;
//	}
//	public void setCountyParishCode_xad_9(String countyParishCode_xad_9) {
//		this.countyParishCode_xad_9 = countyParishCode_xad_9;
//	}
//	public String getCensusTract_xad_10() {
//		return censusTract_xad_10;
//	}
//	public void setCensusTract_xad_10(String censusTract_xad_10) {
//		this.censusTract_xad_10 = censusTract_xad_10;
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
//	@Override
//	public String toString() {
//		return "XAD_v24 [streetAddress_xad_1=" + streetAddress_xad_1 + ", otherDesignation_xad_2="
//				+ otherDesignation_xad_2 + ", city_xad_3=" + city_xad_3 + ", stateOrProvince_xad_4="
//				+ stateOrProvince_xad_4 + ", zipOrPostalCode_xad_5=" + zipOrPostalCode_xad_5 + ", country_xad_6="
//				+ country_xad_6 + ", addressType_xad_7=" + addressType_xad_7 + ", otherGeographicDesignation_xad_8="
//				+ otherGeographicDesignation_xad_8 + ", countyParishCode_xad_9=" + countyParishCode_xad_9
//				+ ", censusTract_xad_10=" + censusTract_xad_10 + ", addressRepresentationCode_xad_11="
//				+ addressRepresentationCode_xad_11 + ", addressValidityRange_xad_12=" + addressValidityRange_xad_12
//				+ "]";
//	}
//	
//}
//	