package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class FullName implements Serializable {
	@JsonProperty("degreeEgMD")
	private String degreeEgMD;
	@JsonProperty("familyName")
	private String familyName;
	@JsonProperty("givenName")
	private String givenName;
	@JsonProperty("middleInitialOrName")
	private String middleInitialOrName;
	@JsonProperty("nameRepresentationCode")
	private String nameRepresentationCode;
	@JsonProperty("nameTypeCode")
	private String nameTypeCode;
	@JsonProperty("prefixEgDR")
	private String prefixEgDR;
	@JsonProperty("suffixEgJRorIII")
	private String suffixEgJRorIII;
	public FullName(String degreeEgMD, String familyName, String givenName, String middleInitialOrName,
			String nameRepresentationCode, String nameTypeCode, String prefixEgDR, String suffixEgJRorIII) {
		super();
		this.degreeEgMD = degreeEgMD;
		this.familyName = familyName;
		this.givenName = givenName;
		this.middleInitialOrName = middleInitialOrName;
		this.nameRepresentationCode = nameRepresentationCode;
		this.nameTypeCode = nameTypeCode;
		this.prefixEgDR = prefixEgDR;
		this.suffixEgJRorIII = suffixEgJRorIII;
	}
	public FullName() {
		super();
	}
	@JsonProperty("degreeEgMD")
	public String getDegreeEgMD() {
		return degreeEgMD;
	}
	@JsonProperty("degreeEgMD")
	public void setDegreeEgMD(String degreeEgMD) {
		this.degreeEgMD = degreeEgMD;
	}
	@JsonProperty("familyName")
	public String getFamilyName() {
		return familyName;
	}
	@JsonProperty("familyName")
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	@JsonProperty("givenName")
	public String getGivenName() {
		return givenName;
	}
	@JsonProperty("givenName")
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	@JsonProperty("middleInitialOrName")
	public String getMiddleInitialOrName() {
		return middleInitialOrName;
	}
	@JsonProperty("middleInitialOrName")
	public void setMiddleInitialOrName(String middleInitialOrName) {
		this.middleInitialOrName = middleInitialOrName;
	}
	@JsonProperty("nameRepresentationCode")
	public String getNameRepresentationCode() {
		return nameRepresentationCode;
	}
	@JsonProperty("nameRepresentationCode")
	public void setNameRepresentationCode(String nameRepresentationCode) {
		this.nameRepresentationCode = nameRepresentationCode;
	}
	@JsonProperty("nameTypeCode")
	public String getNameTypeCode() {
		return nameTypeCode;
	}
	@JsonProperty("nameTypeCode")
	public void setNameTypeCode(String nameTypeCode) {
		this.nameTypeCode = nameTypeCode;
	}
	@JsonProperty("prefixEgDR")
	public String getPrefixEgDR() {
		return prefixEgDR;
	}
	@JsonProperty("prefixEgDR")
	public void setPrefixEgDR(String prefixEgDR) {
		this.prefixEgDR = prefixEgDR;
	}
	@JsonProperty("suffixEgJRorIII")
	public String getSuffixEgJRorIII() {
		return suffixEgJRorIII;
	}
	@JsonProperty("suffixEgJRorIII")
	public void setSuffixEgJRorIII(String suffixEgJRorIII) {
		this.suffixEgJRorIII = suffixEgJRorIII;
	}
	@Override
	public String toString() {
		return "FullName [degreeEgMD=" + degreeEgMD + ", familyName=" + familyName + ", givenName=" + givenName
				+ ", middleInitialOrName=" + middleInitialOrName + ", nameRepresentationCode=" + nameRepresentationCode
				+ ", nameTypeCode=" + nameTypeCode + ", prefixEgDR=" + prefixEgDR + ", suffixEgJRorIII="
				+ suffixEgJRorIII + "]";
	}
}
