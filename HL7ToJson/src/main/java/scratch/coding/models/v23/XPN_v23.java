package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XPN_v23 {
	@JsonProperty("xpn_1_familyName")
	private String xpn_1_familyName;
	@JsonProperty("xpn_2_givenName")
	private String xpn_2_givenName;
	@JsonProperty("xpn_3_middleInitialOrName")
	private String xpn_3_middleInitialOrName;
	@JsonProperty("xpn_4_suffix")
	private String xpn_4_suffix;
	@JsonProperty("xpn_5_prefix")
	private String xpn_5_prefix;
	@JsonProperty("xpn_6_degree")
	private String xpn_6_degree;
	@JsonProperty("xpn_7_nameTypeCode")
	private String xpn_7_nameTypeCode;
	@JsonProperty("xpn_8_nameRepresentationCode")
	private String xpn_8_nameRepresentationCode;
	public XPN_v23(String xpn_1_familyName, String xpn_2_givenName, String xpn_3_middleInitialOrName,
			String xpn_4_suffix, String xpn_5_prefix, String xpn_6_degree, String xpn_7_nameTypeCode,
			String xpn_8_nameRepresentationCode) {
		super();
		this.xpn_1_familyName = xpn_1_familyName;
		this.xpn_2_givenName = xpn_2_givenName;
		this.xpn_3_middleInitialOrName = xpn_3_middleInitialOrName;
		this.xpn_4_suffix = xpn_4_suffix;
		this.xpn_5_prefix = xpn_5_prefix;
		this.xpn_6_degree = xpn_6_degree;
		this.xpn_7_nameTypeCode = xpn_7_nameTypeCode;
		this.xpn_8_nameRepresentationCode = xpn_8_nameRepresentationCode;
	}
	public XPN_v23() {
		super();
		this.xpn_1_familyName = "";
		this.xpn_2_givenName = "";
		this.xpn_3_middleInitialOrName = "";
		this.xpn_4_suffix = "";
		this.xpn_5_prefix = "";
		this.xpn_6_degree = "";
		this.xpn_7_nameTypeCode = "";
		this.xpn_8_nameRepresentationCode = "";
	}
	public String getXpn_1_familyName() {
		return xpn_1_familyName;
	}
	public void setXpn_1_familyName(String xpn_1_familyName) {
		this.xpn_1_familyName = xpn_1_familyName;
	}
	public String getXpn_2_givenName() {
		return xpn_2_givenName;
	}
	public void setXpn_2_givenName(String xpn_2_givenName) {
		this.xpn_2_givenName = xpn_2_givenName;
	}
	public String getXpn_3_middleInitialOrName() {
		return xpn_3_middleInitialOrName;
	}
	public void setXpn_3_middleInitialOrName(String xpn_3_middleInitialOrName) {
		this.xpn_3_middleInitialOrName = xpn_3_middleInitialOrName;
	}
	public String getXpn_4_suffix() {
		return xpn_4_suffix;
	}
	public void setXpn_4_suffix(String xpn_4_suffix) {
		this.xpn_4_suffix = xpn_4_suffix;
	}
	public String getXpn_5_prefix() {
		return xpn_5_prefix;
	}
	public void setXpn_5_prefix(String xpn_5_prefix) {
		this.xpn_5_prefix = xpn_5_prefix;
	}
	public String getXpn_6_degree() {
		return xpn_6_degree;
	}
	public void setXpn_6_degree(String xpn_6_degree) {
		this.xpn_6_degree = xpn_6_degree;
	}
	public String getXpn_7_nameTypeCode() {
		return xpn_7_nameTypeCode;
	}
	public void setXpn_7_nameTypeCode(String xpn_7_nameTypeCode) {
		this.xpn_7_nameTypeCode = xpn_7_nameTypeCode;
	}
	public String getXpn_8_nameRepresentationCode() {
		return xpn_8_nameRepresentationCode;
	}
	public void setXpn_8_nameRepresentationCode(String xpn_8_nameRepresentationCode) {
		this.xpn_8_nameRepresentationCode = xpn_8_nameRepresentationCode;
	}
	@Override
	public String toString() {
		return "XPN_v23 [xpn_1_familyName=" + xpn_1_familyName + ", xpn_2_givenName=" + xpn_2_givenName
				+ ", xpn_3_middleInitialOrName=" + xpn_3_middleInitialOrName + ", xpn_4_suffix=" + xpn_4_suffix
				+ ", xpn_5_prefix=" + xpn_5_prefix + ", xpn_6_degree=" + xpn_6_degree + ", xpn_7_nameTypeCode="
				+ xpn_7_nameTypeCode + ", xpn_8_nameRepresentationCode=" + xpn_8_nameRepresentationCode + "]";
	}
	
}

