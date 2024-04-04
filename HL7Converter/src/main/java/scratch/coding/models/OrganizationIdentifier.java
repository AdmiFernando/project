package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class OrganizationIdentifier implements Serializable {
	
	@JsonProperty("idNumber")
	private String idNumber;
	@JsonProperty("organizationName")
	private String organizationName;
	@JsonProperty("assigningAuthority")
	private AuthorityAndFacility assigningAuthority;
	@JsonProperty("assigningFacility")
	private AuthorityAndFacility assigningFacility;
	@JsonProperty("identifierTypeCode")
	private String identifierTypeCode;
	@JsonProperty("organizationTypeCode")
	private String organizationTypeCode;
	public OrganizationIdentifier(String idNumber, String organizationName, AuthorityAndFacility assigningAuthority,
			AuthorityAndFacility assigningFacility, String identifierTypeCode, String organizationTypeCode) {
		super();
		this.idNumber = idNumber;
		this.organizationName = organizationName;
		this.assigningAuthority = assigningAuthority;
		this.assigningFacility = assigningFacility;
		this.identifierTypeCode = identifierTypeCode;
		this.organizationTypeCode = organizationTypeCode;
	}
	public OrganizationIdentifier() {
		super();
	}
	@JsonProperty("idNumber")
	public String getIdNumber() {
		return idNumber;
	}
	@JsonProperty("idNumber")
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	@JsonProperty("organizationName")
	public String getOrganizationName() {
		return organizationName;
	}
	@JsonProperty("organizationName")
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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
	@JsonProperty("identifierTypeCode")
	public String getIdentifierTypeCode() {
		return identifierTypeCode;
	}
	@JsonProperty("identifierTypeCode")
	public void setIdentifierTypeCode(String identifierTypeCode) {
		this.identifierTypeCode = identifierTypeCode;
	}
	@JsonProperty("organizationTypeCode")
	public String getOrganizationTypeCode() {
		return organizationTypeCode;
	}
	@JsonProperty("organizationTypeCode")
	public void setOrganizationTypeCode(String organizationTypeCode) {
		this.organizationTypeCode = organizationTypeCode;
	}
	@Override
	public String toString() {
		return "PrimaryFacility [idNumber=" + idNumber + ", organizationName=" + organizationName
				+ ", assigningAuthority=" + assigningAuthority + ", assigningFacility=" + assigningFacility
				+ ", identifierTypeCode=" + identifierTypeCode + ", organizationTypeCode=" + organizationTypeCode + "]";
	}
}
