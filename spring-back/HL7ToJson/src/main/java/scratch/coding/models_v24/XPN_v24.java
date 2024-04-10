package scratch.coding.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class XPN_v24 {
	@JsonProperty("familyName_xpn_1")
	private FN_v24 familyName_xpn_1;
	@JsonProperty("givenName_xpn_2")
	private String givenName_xpn_2;
	@JsonProperty("secondAndFurtherGivenNamesOrInitialsThereof_xpn_3")
	private String secondAndFurtherGivenNamesOrInitialsThereof_xpn_3;
	@JsonProperty("suffix_xpn_4")
	private String suffix_xpn_4;
	@JsonProperty("prefix_xpn_5")
	private String prefix_xpn_5;
	@JsonProperty("degree_xpn_6")
	private String degree_xpn_6;
	@JsonProperty("nameTypeCode_xpn_7")
	private String nameTypeCode_xpn_7;
	@JsonProperty("nameRepresentationCode_xpn_8")
	private String nameRepresentationCode_xpn_8;
	@JsonProperty("nameContext_xpn_9")
	private CE_v2 nameContext_xpn_9;
	@JsonProperty("nameValidityRange_xpn_10")
	private DR_v2 nameValidityRange_xpn_10;
	@JsonProperty("nameAssemblyOrder_xpn_11")
	private String nameAssemblyOrder_xpn_11;
	public XPN_v24(FN_v24 familyName_xpn_1, String givenName_xpn_2,
			String secondAndFurtherGivenNamesOrInitialsThereof_xpn_3, String suffix_xpn_4, String prefix_xpn_5,
			String degree_xpn_6, String nameTypeCode_xpn_7, String nameRepresentationCode_xpn_8,
			CE_v2 nameContext_xpn_9, DR_v2 nameValidityRange_xpn_10,
			String nameAssemblyOrder_xpn_11) {
		super();
		this.familyName_xpn_1 = familyName_xpn_1;
		this.givenName_xpn_2 = givenName_xpn_2;
		this.secondAndFurtherGivenNamesOrInitialsThereof_xpn_3 = secondAndFurtherGivenNamesOrInitialsThereof_xpn_3;
		this.suffix_xpn_4 = suffix_xpn_4;
		this.prefix_xpn_5 = prefix_xpn_5;
		this.degree_xpn_6 = degree_xpn_6;
		this.nameTypeCode_xpn_7 = nameTypeCode_xpn_7;
		this.nameRepresentationCode_xpn_8 = nameRepresentationCode_xpn_8;
		this.nameContext_xpn_9 = nameContext_xpn_9;
		this.nameValidityRange_xpn_10 = nameValidityRange_xpn_10;
		this.nameAssemblyOrder_xpn_11 = nameAssemblyOrder_xpn_11;
	}
	public XPN_v24() {
		super();
		this.familyName_xpn_1 = new FN_v24();
		this.givenName_xpn_2 = "";
		this.secondAndFurtherGivenNamesOrInitialsThereof_xpn_3 = "";
		this.suffix_xpn_4 = "";
		this.prefix_xpn_5 = "";
		this.degree_xpn_6 = "";
		this.nameTypeCode_xpn_7 = "";
		this.nameRepresentationCode_xpn_8 = "";
		this.nameContext_xpn_9 = new CE_v2();
		this.nameValidityRange_xpn_10 = new DR_v2();
		this.nameAssemblyOrder_xpn_11 = "";
	}
	public FN_v24 getFamilyName_xpn_1() {
		return familyName_xpn_1;
	}
	public void setFamilyName_xpn_1(FN_v24 familyName_xpn_1) {
		this.familyName_xpn_1 = familyName_xpn_1;
	}
	public String getGivenName_xpn_2() {
		return givenName_xpn_2;
	}
	public void setGivenName_xpn_2(String givenName_xpn_2) {
		this.givenName_xpn_2 = givenName_xpn_2;
	}
	public String getSecondAndFurtherGivenNamesOrInitialsThereof_xpn_3() {
		return secondAndFurtherGivenNamesOrInitialsThereof_xpn_3;
	}
	public void setSecondAndFurtherGivenNamesOrInitialsThereof_xpn_3(
			String secondAndFurtherGivenNamesOrInitialsThereof_xpn_3) {
		this.secondAndFurtherGivenNamesOrInitialsThereof_xpn_3 = secondAndFurtherGivenNamesOrInitialsThereof_xpn_3;
	}
	public String getSuffix_xpn_4() {
		return suffix_xpn_4;
	}
	public void setSuffix_xpn_4(String suffix_xpn_4) {
		this.suffix_xpn_4 = suffix_xpn_4;
	}
	public String getPrefix_xpn_5() {
		return prefix_xpn_5;
	}
	public void setPrefix_xpn_5(String prefix_xpn_5) {
		this.prefix_xpn_5 = prefix_xpn_5;
	}
	public String getDegree_xpn_6() {
		return degree_xpn_6;
	}
	public void setDegree_xpn_6(String degree_xpn_6) {
		this.degree_xpn_6 = degree_xpn_6;
	}
	public String getNameTypeCode_xpn_7() {
		return nameTypeCode_xpn_7;
	}
	public void setNameTypeCode_xpn_7(String nameTypeCode_xpn_7) {
		this.nameTypeCode_xpn_7 = nameTypeCode_xpn_7;
	}
	public String getNameRepresentationCode_xpn_8() {
		return nameRepresentationCode_xpn_8;
	}
	public void setNameRepresentationCode_xpn_8(String nameRepresentationCode_xpn_8) {
		this.nameRepresentationCode_xpn_8 = nameRepresentationCode_xpn_8;
	}
	public CE_v2 getNameContext_xpn_9() {
		return nameContext_xpn_9;
	}
	public void setNameContext_xpn_9(CE_v2 nameContext_xpn_9) {
		this.nameContext_xpn_9 = nameContext_xpn_9;
	}
	public DR_v2 getNameValidityRange_xpn_10() {
		return nameValidityRange_xpn_10;
	}
	public void setNameValidityRange_xpn_10(DR_v2 nameValidityRange_xpn_10) {
		this.nameValidityRange_xpn_10 = nameValidityRange_xpn_10;
	}
	public String getNameAssemblyOrder_xpn_11() {
		return nameAssemblyOrder_xpn_11;
	}
	public void setNameAssemblyOrder_xpn_11(String nameAssemblyOrder_xpn_11) {
		this.nameAssemblyOrder_xpn_11 = nameAssemblyOrder_xpn_11;
	}
	@Override
	public String toString() {
		return "XPN_v24 [familyName_xpn_1=" + familyName_xpn_1 + ", givenName_xpn_2=" + givenName_xpn_2
				+ ", secondAndFurtherGivenNamesOrInitialsThereof_xpn_3="
				+ secondAndFurtherGivenNamesOrInitialsThereof_xpn_3 + ", suffix_xpn_4=" + suffix_xpn_4
				+ ", prefix_xpn_5=" + prefix_xpn_5 + ", degree_xpn_6=" + degree_xpn_6 + ", nameTypeCode_xpn_7="
				+ nameTypeCode_xpn_7 + ", nameRepresentationCode_xpn_8=" + nameRepresentationCode_xpn_8
				+ ", nameContext_xpn_9=" + nameContext_xpn_9 + ", nameValidityRange_xpn_10=" + nameValidityRange_xpn_10
				+ ", nameAssemblyOrder_xpn_11=" + nameAssemblyOrder_xpn_11 + "]";
	}
	
}
	