package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PatientID implements Serializable {
	@JsonProperty("assigningAuthority")
	private AuthorityAndFacility assigningAuthority;
	@JsonProperty("assigningFacility")
	private AuthorityAndFacility assigningFacility;
	@JsonProperty("checkDigit")
	private String checkDigit;
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed")
	private String codeIdentifyingTheCheckDigitSchemeEmployed;
	@JsonProperty("id")
	private String id;
	@JsonProperty("identifierTypeCode")
	private String identifierTypeCode;
	public PatientID(AuthorityAndFacility assigningAuthority, AuthorityAndFacility assigningFacility, String checkDigit,
			String codeIdentifyingTheCheckDigitSchemeEmployed, String id, String identifierTypeCode) {
		super();
		this.assigningAuthority = assigningAuthority;
		this.assigningFacility = assigningFacility;
		this.checkDigit = checkDigit;
		this.codeIdentifyingTheCheckDigitSchemeEmployed = codeIdentifyingTheCheckDigitSchemeEmployed;
		this.id = id;
		this.identifierTypeCode = identifierTypeCode;
	}
	public PatientID() {
		super();
	}
	@JsonProperty("assigningAuthority")
	public AuthorityAndFacility getAssigningAuthority() {
		return assigningAuthority;
	}
	@JsonProperty("assigningAuthority")
	public void setAssigningAuthority(AuthorityAndFacility assigningAuthority) {
		this.assigningAuthority = assigningAuthority;
	}
	@JsonProperty("assigningFacility")
	public AuthorityAndFacility getAssigningFacility() {
		return assigningFacility;
	}
	@JsonProperty("assigningFacility")
	public void setAssigningFacility(AuthorityAndFacility assigningFacility) {
		this.assigningFacility = assigningFacility;
	}
	@JsonProperty("checkDigit")
	public String getCheckDigit() {
		return checkDigit;
	}
	@JsonProperty("checkDigit")
	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed")
	public String getCodeIdentifyingTheCheckDigitSchemeEmployed() {
		return codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	@JsonProperty("codeIdentifyingTheCheckDigitSchemeEmployed")
	public void setCodeIdentifyingTheCheckDigitSchemeEmployed(String codeIdentifyingTheCheckDigitSchemeEmployed) {
		this.codeIdentifyingTheCheckDigitSchemeEmployed = codeIdentifyingTheCheckDigitSchemeEmployed;
	}
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}
	@JsonProperty("identifierTypeCode")
	public String getIdentifierTypeCode() {
		return identifierTypeCode;
	}
	@JsonProperty("identifierTypeCode")
	public void setIdentifierTypeCode(String identifierTypeCode) {
		this.identifierTypeCode = identifierTypeCode;
	}
	@Override
	public String toString() {
		return "PatientID [assigningAuthority=" + assigningAuthority + ", assigningFacility=" + assigningFacility
				+ ", checkDigit=" + checkDigit + ", codeIdentifyingTheCheckDigitSchemeEmployed="
				+ codeIdentifyingTheCheckDigitSchemeEmployed + ", id=" + id + ", identifierTypeCode="
				+ identifierTypeCode + "]";
	}
}
