package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class ResultInterpreter implements Serializable {
	@JsonProperty("location")
	private PatientLocation location;
	@JsonProperty("assigningAuthority")
	private AuthorityAndFacility assigningAuthority;
	@JsonProperty("fullName")
	private FullName fullName;
	@JsonProperty("idNumber")
	private String idNumber;
	@JsonProperty("startDateTime")
	private DateAndTime startDateTime;
	@JsonProperty("endDateTime")
	private DateAndTime endDateTime;
	public ResultInterpreter(PatientLocation location, AuthorityAndFacility assigningAuthority, FullName fullName,
			String idNumber, DateAndTime startDateTime, DateAndTime endDateTime) {
		super();
		this.location = location;
		this.assigningAuthority = assigningAuthority;
		this.fullName = fullName;
		this.idNumber = idNumber;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}
	public ResultInterpreter() {
		super();
	}
	@JsonProperty("location")
	public PatientLocation getLocation() {
		return location;
	}
	@JsonProperty("location")
	public void setLocation(PatientLocation location) {
		this.location = location;
	}
	@JsonProperty("assigningAuthority")
	public AuthorityAndFacility getAssigningAuthority() {
		return assigningAuthority;
	}
	@JsonProperty("assigningAuthority")
	public void setAssigningAuthority(AuthorityAndFacility assigningAuthority) {
		this.assigningAuthority = assigningAuthority;
	}
	@JsonProperty("fullName")
	public FullName getFullName() {
		return fullName;
	}
	@JsonProperty("fullName")
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	@JsonProperty("idNumber")
	public String getIdNumber() {
		return idNumber;
	}
	@JsonProperty("idNumber")
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	@JsonProperty("startDateTime")
	public DateAndTime getStartDateTime() {
		return startDateTime;
	}
	@JsonProperty("startDateTime")
	public void setStartDateTime(DateAndTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	@JsonProperty("endDateTime")
	public DateAndTime getEndDateTime() {
		return endDateTime;
	}
	@JsonProperty("endDateTime")
	public void setEndDateTime(DateAndTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	@Override
	public String toString() {
		return "ResultInterpreter [location=" + location + ", assigningAuthority=" + assigningAuthority + ", fullName="
				+ fullName + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime + "]";
	}
}
