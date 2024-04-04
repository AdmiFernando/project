package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class PrimaryCareProviderNameAndIdNo implements Serializable {
	@JsonProperty("primaryFacility")
	private OrganizationIdentifier primaryFacility;
	@JsonProperty("fullName")
	private FullName fullName;
	@JsonProperty("DegreeEgMD")
	private String DegreeEgMD;
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed")
	private String codeIdentifyingTheCheckDigitSchemeEmployed;
	public PrimaryCareProviderNameAndIdNo(OrganizationIdentifier primaryFacility, FullName fullName, String degreeEgMD,
			String codeIdentifyingTheCheckDigitSchemeEmployed) {
		super();
		this.primaryFacility = primaryFacility;
		this.fullName = fullName;
		DegreeEgMD = degreeEgMD;
		this.codeIdentifyingTheCheckDigitSchemeEmployed = codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	public PrimaryCareProviderNameAndIdNo() {
		super();
	}
	public OrganizationIdentifier getPrimaryFacility() {
		return primaryFacility;
	}
	public void setPrimaryFacility(OrganizationIdentifier primaryFacility) {
		this.primaryFacility = primaryFacility;
	}
	public FullName getFullName() {
		return fullName;
	}
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	@JsonProperty("DegreeEgMD")
	public String getDegreeEgMD() {
		return DegreeEgMD;
	}
	@JsonProperty("DegreeEgMD")
	public void setDegreeEgMD(String degreeEgMD) {
		DegreeEgMD = degreeEgMD;
	}
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed")
	public String getCodeIdentifyingTheCheckDigitSchemeEmployed() {
		return codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed")
	public void setCodeIdentifyingTheCheckDigitSchemeEmployed(String codeIdentifyingTheCheckDigitSchemeEmployed) {
		this.codeIdentifyingTheCheckDigitSchemeEmployed = codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	@Override
	public String toString() {
		return "PrimaryCareProviderNameAndIdNo [primaryFacility=" + primaryFacility + ", fullName=" + fullName
				+ ", DegreeEgMD=" + DegreeEgMD + ", codeIdentifyingTheCheckDigitSchemeEmployed="
				+ codeIdentifyingTheCheckDigitSchemeEmployed + "]";
	}
}
