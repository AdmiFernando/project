package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XPN_v25 {
			
	@JsonProperty("xpn_1_familyName")
	private FN_v25 xpn_1_familyName;
	@JsonProperty("xpn_2_givenName")
	private String xpn_2_givenName;
	@JsonProperty("xpn_3_secondAndFurtherGivenNamesOrInitialsThereof")
	private String xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
	@JsonProperty("xpn_4_suffixEGJrOrIii")
	private String xpn_4_suffixEGJrOrIii;
	@JsonProperty("xpn_5_prefixEGDr")
	private String xpn_5_prefixEGDr;
	@JsonProperty("xpn_6_degreeEGMd")
	private String xpn_6_degreeEGMd;
	@JsonProperty("xpn_7_nameTypeCode")
	private String xpn_7_nameTypeCode;
	@JsonProperty("xpn_8_nameRepresentationCode")
	private String xpn_8_nameRepresentationCode;
	@JsonProperty("xpn_9_nameContext")
	private CE_v2 xpn_9_nameContext;
	@JsonProperty("xpn_10_nameValidityRange")
	private DR_v2 xpn_10_nameValidityRange;
	@JsonProperty("xpn_11_nameAssemblyOrder")
	private String xpn_11_nameAssemblyOrder;
	@JsonProperty("xpn_12_effectiveDate")
	private TS_v2 xpn_12_effectiveDate;
	@JsonProperty("xpn_13_expirationDate")
	private TS_v2 xpn_13_expirationDate;
	@JsonProperty("xpn_14_professionalSuffix")
	private String xpn_14_professionalSuffix;
	public XPN_v25(FN_v25 xpn_1_familyName, String xpn_2_givenName,
			String xpn_3_secondAndFurtherGivenNamesOrInitialsThereof, String xpn_4_suffixEGJrOrIii,
			String xpn_5_prefixEGDr, String xpn_6_degreeEGMd, String xpn_7_nameTypeCode,
			String xpn_8_nameRepresentationCode, CE_v2 xpn_9_nameContext, DR_v2 xpn_10_nameValidityRange,
			String xpn_11_nameAssemblyOrder, TS_v2 xpn_12_effectiveDate, TS_v2 xpn_13_expirationDate,
			String xpn_14_professionalSuffix) {
		super();
		this.xpn_1_familyName = xpn_1_familyName;
		this.xpn_2_givenName = xpn_2_givenName;
		this.xpn_3_secondAndFurtherGivenNamesOrInitialsThereof = xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
		this.xpn_4_suffixEGJrOrIii = xpn_4_suffixEGJrOrIii;
		this.xpn_5_prefixEGDr = xpn_5_prefixEGDr;
		this.xpn_6_degreeEGMd = xpn_6_degreeEGMd;
		this.xpn_7_nameTypeCode = xpn_7_nameTypeCode;
		this.xpn_8_nameRepresentationCode = xpn_8_nameRepresentationCode;
		this.xpn_9_nameContext = xpn_9_nameContext;
		this.xpn_10_nameValidityRange = xpn_10_nameValidityRange;
		this.xpn_11_nameAssemblyOrder = xpn_11_nameAssemblyOrder;
		this.xpn_12_effectiveDate = xpn_12_effectiveDate;
		this.xpn_13_expirationDate = xpn_13_expirationDate;
		this.xpn_14_professionalSuffix = xpn_14_professionalSuffix;
	}
	public XPN_v25() {
		super();
		this.xpn_1_familyName = new FN_v25();
		this.xpn_2_givenName = "";
		this.xpn_3_secondAndFurtherGivenNamesOrInitialsThereof = "";
		this.xpn_4_suffixEGJrOrIii = "";
		this.xpn_5_prefixEGDr = "";
		this.xpn_6_degreeEGMd = "";
		this.xpn_7_nameTypeCode = "";
		this.xpn_8_nameRepresentationCode = "";
		this.xpn_9_nameContext = new CE_v2();
		this.xpn_10_nameValidityRange = new DR_v2();
		this.xpn_11_nameAssemblyOrder = "";
		this.xpn_12_effectiveDate = new TS_v2();
		this.xpn_13_expirationDate = new TS_v2();
		this.xpn_14_professionalSuffix = "";
	}
	public FN_v25 getXpn_1_familyName() {
		return xpn_1_familyName;
	}
	public void setXpn_1_familyName(FN_v25 xpn_1_familyName) {
		this.xpn_1_familyName = xpn_1_familyName;
	}
	public String getXpn_2_givenName() {
		return xpn_2_givenName;
	}
	public void setXpn_2_givenName(String xpn_2_givenName) {
		this.xpn_2_givenName = xpn_2_givenName;
	}
	public String getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof() {
		return xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
	}
	public void setXpn_3_secondAndFurtherGivenNamesOrInitialsThereof(
			String xpn_3_secondAndFurtherGivenNamesOrInitialsThereof) {
		this.xpn_3_secondAndFurtherGivenNamesOrInitialsThereof = xpn_3_secondAndFurtherGivenNamesOrInitialsThereof;
	}
	public String getXpn_4_suffixEGJrOrIii() {
		return xpn_4_suffixEGJrOrIii;
	}
	public void setXpn_4_suffixEGJrOrIii(String xpn_4_suffixEGJrOrIii) {
		this.xpn_4_suffixEGJrOrIii = xpn_4_suffixEGJrOrIii;
	}
	public String getXpn_5_prefixEGDr() {
		return xpn_5_prefixEGDr;
	}
	public void setXpn_5_prefixEGDr(String xpn_5_prefixEGDr) {
		this.xpn_5_prefixEGDr = xpn_5_prefixEGDr;
	}
	public String getXpn_6_degreeEGMd() {
		return xpn_6_degreeEGMd;
	}
	public void setXpn_6_degreeEGMd(String xpn_6_degreeEGMd) {
		this.xpn_6_degreeEGMd = xpn_6_degreeEGMd;
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
	public CE_v2 getXpn_9_nameContext() {
		return xpn_9_nameContext;
	}
	public void setXpn_9_nameContext(CE_v2 xpn_9_nameContext) {
		this.xpn_9_nameContext = xpn_9_nameContext;
	}
	public DR_v2 getXpn_10_nameValidityRange() {
		return xpn_10_nameValidityRange;
	}
	public void setXpn_10_nameValidityRange(DR_v2 xpn_10_nameValidityRange) {
		this.xpn_10_nameValidityRange = xpn_10_nameValidityRange;
	}
	public String getXpn_11_nameAssemblyOrder() {
		return xpn_11_nameAssemblyOrder;
	}
	public void setXpn_11_nameAssemblyOrder(String xpn_11_nameAssemblyOrder) {
		this.xpn_11_nameAssemblyOrder = xpn_11_nameAssemblyOrder;
	}
	public TS_v2 getXpn_12_effectiveDate() {
		return xpn_12_effectiveDate;
	}
	public void setXpn_12_effectiveDate(TS_v2 xpn_12_effectiveDate) {
		this.xpn_12_effectiveDate = xpn_12_effectiveDate;
	}
	public TS_v2 getXpn_13_expirationDate() {
		return xpn_13_expirationDate;
	}
	public void setXpn_13_expirationDate(TS_v2 xpn_13_expirationDate) {
		this.xpn_13_expirationDate = xpn_13_expirationDate;
	}
	public String getXpn_14_professionalSuffix() {
		return xpn_14_professionalSuffix;
	}
	public void setXpn_14_professionalSuffix(String xpn_14_professionalSuffix) {
		this.xpn_14_professionalSuffix = xpn_14_professionalSuffix;
	}
	@Override
	public String toString() {
		return "XPN_v25 [xpn_1_familyName=" + xpn_1_familyName + ", xpn_2_givenName=" + xpn_2_givenName
				+ ", xpn_3_secondAndFurtherGivenNamesOrInitialsThereof="
				+ xpn_3_secondAndFurtherGivenNamesOrInitialsThereof + ", xpn_4_suffixEGJrOrIii=" + xpn_4_suffixEGJrOrIii
				+ ", xpn_5_prefixEGDr=" + xpn_5_prefixEGDr + ", xpn_6_degreeEGMd=" + xpn_6_degreeEGMd
				+ ", xpn_7_nameTypeCode=" + xpn_7_nameTypeCode + ", xpn_8_nameRepresentationCode="
				+ xpn_8_nameRepresentationCode + ", xpn_9_nameContext=" + xpn_9_nameContext
				+ ", xpn_10_nameValidityRange=" + xpn_10_nameValidityRange + ", xpn_11_nameAssemblyOrder="
				+ xpn_11_nameAssemblyOrder + ", xpn_12_effectiveDate=" + xpn_12_effectiveDate
				+ ", xpn_13_expirationDate=" + xpn_13_expirationDate + ", xpn_14_professionalSuffix="
				+ xpn_14_professionalSuffix + "]";
	}
	

}
