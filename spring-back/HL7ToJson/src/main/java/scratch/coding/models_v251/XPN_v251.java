package scratch.coding.models_v251;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XPN_v251 {
	@JsonProperty("xpn_1_FamilyName")
	private FN_v251 xpn_1_FamilyName;
	@JsonProperty("xpn_2_GivenName")
	private String xpn_2_GivenName;
	@JsonProperty("xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof")
	private String xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof;
	@JsonProperty("xpn_4_SuffixJrOrIii")
	private String xpn_4_SuffixJrOrIii;
	@JsonProperty("xpn_5_Prefix")
	private String xpn_5_Prefix;
	@JsonProperty("xpn_6_Degree")
	private String xpn_6_Degree;
	@JsonProperty("xpn_7_NameTypeCode")
	private String xpn_7_NameTypeCode;
	@JsonProperty("xpn_8_NameRepresentationCode")
	private String xpn_8_NameRepresentationCode;
	@JsonProperty("xpn_9_NameContext")
	private CE_v2 xpn_9_NameContext;
	@JsonProperty("xpn_10_NameValidityRange")
	private DR_v2 xpn_10_NameValidityRange;
	@JsonProperty("xpn_11_NameAssemblyOrder")
	private String xpn_11_NameAssemblyOrder;
	@JsonProperty("xpn_12_EffectiveDate")
	private TS_v2 xpn_12_EffectiveDate;
	@JsonProperty("xpn_13_ExpirationDate")
	private TS_v2 xpn_13_ExpirationDate;
	@JsonProperty("xpn_14_ProfessionalSuffix")
	private String xpn_14_ProfessionalSuffix;
	public XPN_v251(FN_v251 xpn_1_FamilyName, String xpn_2_GivenName,
			String xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof, String xpn_4_SuffixJrOrIii, String xpn_5_Prefix,
			String xpn_6_Degree, String xpn_7_NameTypeCode, String xpn_8_NameRepresentationCode,
			CE_v2 xpn_9_NameContext, DR_v2 xpn_10_NameValidityRange, String xpn_11_NameAssemblyOrder,
			TS_v2 xpn_12_EffectiveDate, TS_v2 xpn_13_ExpirationDate,
			String xpn_14_ProfessionalSuffix) {
		super();
		this.xpn_1_FamilyName = xpn_1_FamilyName;
		this.xpn_2_GivenName = xpn_2_GivenName;
		this.xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof = xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof;
		this.xpn_4_SuffixJrOrIii = xpn_4_SuffixJrOrIii;
		this.xpn_5_Prefix = xpn_5_Prefix;
		this.xpn_6_Degree = xpn_6_Degree;
		this.xpn_7_NameTypeCode = xpn_7_NameTypeCode;
		this.xpn_8_NameRepresentationCode = xpn_8_NameRepresentationCode;
		this.xpn_9_NameContext = xpn_9_NameContext;
		this.xpn_10_NameValidityRange = xpn_10_NameValidityRange;
		this.xpn_11_NameAssemblyOrder = xpn_11_NameAssemblyOrder;
		this.xpn_12_EffectiveDate = xpn_12_EffectiveDate;
		this.xpn_13_ExpirationDate = xpn_13_ExpirationDate;
		this.xpn_14_ProfessionalSuffix = xpn_14_ProfessionalSuffix;
	}
	public XPN_v251() {
		super();
		this.xpn_1_FamilyName = new FN_v251();
		this.xpn_2_GivenName = "";
		this.xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof = "";
		this.xpn_4_SuffixJrOrIii = "";
		this.xpn_5_Prefix = "";
		this.xpn_6_Degree = "";
		this.xpn_7_NameTypeCode = "";
		this.xpn_8_NameRepresentationCode = "";
		this.xpn_9_NameContext = new CE_v2();
		this.xpn_10_NameValidityRange = new DR_v2();
		this.xpn_11_NameAssemblyOrder = "";
		this.xpn_12_EffectiveDate = new TS_v2();
		this.xpn_13_ExpirationDate = new TS_v2();
		this.xpn_14_ProfessionalSuffix = "";
	}
	public FN_v251 getXpn_1_FamilyName() {
		return xpn_1_FamilyName;
	}
	public void setXpn_1_FamilyName(FN_v251 xpn_1_FamilyName) {
		this.xpn_1_FamilyName = xpn_1_FamilyName;
	}
	public String getXpn_2_GivenName() {
		return xpn_2_GivenName;
	}
	public void setXpn_2_GivenName(String xpn_2_GivenName) {
		this.xpn_2_GivenName = xpn_2_GivenName;
	}
	public String getXpn_3_SecondAndFurtherGivenNamesOrInitialsThereof() {
		return xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof;
	}
	public void setXpn_3_SecondAndFurtherGivenNamesOrInitialsThereof(
			String xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof) {
		this.xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof = xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof;
	}
	public String getXpn_4_SuffixJrOrIii() {
		return xpn_4_SuffixJrOrIii;
	}
	public void setXpn_4_SuffixJrOrIii(String xpn_4_SuffixJrOrIii) {
		this.xpn_4_SuffixJrOrIii = xpn_4_SuffixJrOrIii;
	}
	public String getXpn_5_Prefix() {
		return xpn_5_Prefix;
	}
	public void setXpn_5_Prefix(String xpn_5_Prefix) {
		this.xpn_5_Prefix = xpn_5_Prefix;
	}
	public String getXpn_6_Degree() {
		return xpn_6_Degree;
	}
	public void setXpn_6_Degree(String xpn_6_Degree) {
		this.xpn_6_Degree = xpn_6_Degree;
	}
	public String getXpn_7_NameTypeCode() {
		return xpn_7_NameTypeCode;
	}
	public void setXpn_7_NameTypeCode(String xpn_7_NameTypeCode) {
		this.xpn_7_NameTypeCode = xpn_7_NameTypeCode;
	}
	public String getXpn_8_NameRepresentationCode() {
		return xpn_8_NameRepresentationCode;
	}
	public void setXpn_8_NameRepresentationCode(String xpn_8_NameRepresentationCode) {
		this.xpn_8_NameRepresentationCode = xpn_8_NameRepresentationCode;
	}
	public CE_v2 getXpn_9_NameContext() {
		return xpn_9_NameContext;
	}
	public void setXpn_9_NameContext(CE_v2 xpn_9_NameContext) {
		this.xpn_9_NameContext = xpn_9_NameContext;
	}
	public DR_v2 getXpn_10_NameValidityRange() {
		return xpn_10_NameValidityRange;
	}
	public void setXpn_10_NameValidityRange(DR_v2 xpn_10_NameValidityRange) {
		this.xpn_10_NameValidityRange = xpn_10_NameValidityRange;
	}
	public String getXpn_11_NameAssemblyOrder() {
		return xpn_11_NameAssemblyOrder;
	}
	public void setXpn_11_NameAssemblyOrder(String xpn_11_NameAssemblyOrder) {
		this.xpn_11_NameAssemblyOrder = xpn_11_NameAssemblyOrder;
	}
	public TS_v2 getXpn_12_EffectiveDate() {
		return xpn_12_EffectiveDate;
	}
	public void setXpn_12_EffectiveDate(TS_v2 xpn_12_EffectiveDate) {
		this.xpn_12_EffectiveDate = xpn_12_EffectiveDate;
	}
	public TS_v2 getXpn_13_ExpirationDate() {
		return xpn_13_ExpirationDate;
	}
	public void setXpn_13_ExpirationDate(TS_v2 xpn_13_ExpirationDate) {
		this.xpn_13_ExpirationDate = xpn_13_ExpirationDate;
	}
	public String getXpn_14_ProfessionalSuffix() {
		return xpn_14_ProfessionalSuffix;
	}
	public void setXpn_14_ProfessionalSuffix(String xpn_14_ProfessionalSuffix) {
		this.xpn_14_ProfessionalSuffix = xpn_14_ProfessionalSuffix;
	}
	@Override
	public String toString() {
		return "XPN_v251 [xpn_1_FamilyName=" + xpn_1_FamilyName + ", xpn_2_GivenName=" + xpn_2_GivenName
				+ ", xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof="
				+ xpn_3_SecondAndFurtherGivenNamesOrInitialsThereof + ", xpn_4_SuffixJrOrIii=" + xpn_4_SuffixJrOrIii
				+ ", xpn_5_Prefix=" + xpn_5_Prefix + ", xpn_6_Degree=" + xpn_6_Degree + ", xpn_7_NameTypeCode="
				+ xpn_7_NameTypeCode + ", xpn_8_NameRepresentationCode=" + xpn_8_NameRepresentationCode
				+ ", xpn_9_NameContext=" + xpn_9_NameContext + ", xpn_10_NameValidityRange=" + xpn_10_NameValidityRange
				+ ", xpn_11_NameAssemblyOrder=" + xpn_11_NameAssemblyOrder + ", xpn_12_EffectiveDate="
				+ xpn_12_EffectiveDate + ", xpn_13_ExpirationDate=" + xpn_13_ExpirationDate
				+ ", xpn_14_ProfessionalSuffix=" + xpn_14_ProfessionalSuffix + "]";
	}
}
