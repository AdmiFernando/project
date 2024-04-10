package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class HealthCareProvider implements Serializable {
	@JsonProperty("idNumber")
	private String idNumber;
	@JsonProperty("assigningAuthority")
	private String assigningAuthority;
	@JsonProperty("assigningFacilityId")
	private String assigningFacilityId;
	@JsonProperty("degreeEGMD")
	private String degreeEGMD;
	@JsonProperty("fullName")
	private FullName fullName;
	public HealthCareProvider(String idNumber, String assigningAuthority, String assigningFacilityId,
			String degreeEGMD, FullName fullName) {
		super();
		this.idNumber = idNumber;
		this.assigningAuthority = assigningAuthority;
		this.assigningFacilityId = assigningFacilityId;
		this.degreeEGMD = degreeEGMD;
		this.fullName = fullName;
	}
	public HealthCareProvider() {
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
	@JsonProperty("assigningAuthority")
	public String getAssigningAuthority() {
		return assigningAuthority;
	}
	@JsonProperty("assigningAuthority")
	public void setAssigningAuthority(String assigningAuthority) {
		this.assigningAuthority = assigningAuthority;
	}
	@JsonProperty("assigningFacilityId")
	public String getAssigningFacilityId() {
		return assigningFacilityId;
	}
	@JsonProperty("assigningFacilityId")
	public void setAssigningFacilityId(String assigningFacilityId) {
		this.assigningFacilityId = assigningFacilityId;
	}
	@JsonProperty("degreeEGMD")
	public String getDegreeEGMD() {
		return degreeEGMD;
	}
	@JsonProperty("degreeEGMD")
	public void setDegreeEGMD(String degreeEGMD) {
		this.degreeEGMD = degreeEGMD;
	}
	@JsonProperty("fullName")
	public FullName getFullName() {
		return fullName;
	}
	@JsonProperty("fullName")
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Doctor [assigningAuthority=" + assigningAuthority + ", assigningFacilityId=" + assigningFacilityId
				+ ", degreeEGMD=" + degreeEGMD + ", fullName=" + fullName + "]";
	}
}
