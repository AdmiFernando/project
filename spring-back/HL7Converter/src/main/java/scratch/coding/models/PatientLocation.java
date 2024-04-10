package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class PatientLocation implements Serializable {
	
	@JsonProperty("bed")
	private String bed;
	@JsonProperty("building")
	private String building;
	@JsonProperty("facility")
	private AuthorityAndFacility facility;
	@JsonProperty("floor")
	private String floor;
	@JsonProperty("locationStatus")
	private String locationStatus;
	@JsonProperty("locationType")
	private String locationType;
	@JsonProperty("personLocationType")
	private String personLocationType;
	@JsonProperty("pointOfCare")
	private String pointOfCare;
	@JsonProperty("room")
	private String room;

	public PatientLocation(String bed, String building, AuthorityAndFacility facility, String floor,
			String locationStatus, String locationType, String personLocationType, String pointOfCare, String room) {
		super();
		this.bed = bed;
		this.building = building;
		this.facility = facility;
		this.floor = floor;
		this.locationStatus = locationStatus;
		this.locationType = locationType;
		this.personLocationType = personLocationType;
		this.pointOfCare = pointOfCare;
		this.room = room;
	}
	public PatientLocation() {
		super();
	}
	@JsonProperty("bed")
	public String getBed() {
		return bed;
	}
	@JsonProperty("bed")
	public void setBed(String bed) {
		this.bed = bed;
	}
	@JsonProperty("building")
	public String getBuilding() {
		return building;
	}
	@JsonProperty("building")
	public void setBuilding(String building) {
		this.building = building;
	}
	@JsonProperty("floor")
	public String getFloor() {
		return floor;
	}
	@JsonProperty("floor")
	public void setFloor(String floor) {
		this.floor = floor;
	}
	@JsonProperty("locationStatus")
	public String getLocationStatus() {
		return locationStatus;
	}
	@JsonProperty("locationStatus")
	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}
	@JsonProperty("locationType")
	public String getLocationType() {
		return locationType;
	}
	@JsonProperty("locationType")
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	@JsonProperty("personLocationType")
	public String getPersonLocationType() {
		return personLocationType;
	}
	@JsonProperty("personLocationType")
	public void setPersonLocationType(String personLocationType) {
		this.personLocationType = personLocationType;
	}
	@JsonProperty("pointOfCare")
	public String getPointOfCare() {
		return pointOfCare;
	}
	@JsonProperty("pointOfCare")
	public void setPointOfCare(String pointOfCare) {
		this.pointOfCare = pointOfCare;
	}
	@JsonProperty("room")
	public String getRoom() {
		return room;
	}
	@JsonProperty("room")
	public void setRoom(String room) {
		this.room = room;
	}
	@JsonProperty("facility")
	public AuthorityAndFacility getFacility() {
		return facility;
	}
	@JsonProperty("facility")
	public void setFacility(AuthorityAndFacility facility) {
		this.facility = facility;
	}
	@Override
	public String toString() {
		return "PatientLocation [bed=" + bed + ", building=" + building + ", facility=" + facility + ", floor=" + floor
				+ ", locationStatus=" + locationStatus + ", locationType=" + locationType + ", personLocationType="
				+ personLocationType + ", pointOfCare=" + pointOfCare + ", room=" + room + "]";
	}
}
