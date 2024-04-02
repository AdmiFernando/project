package scratch.coding.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PL_v24 {
	
	@JsonProperty("pointOfCare_pl_1")
	private String pointOfCare_pl_1;
	@JsonProperty("room_pl_2")
	private String room_pl_2;
	@JsonProperty("bed_pl_3")
	private String bed_pl_3;
	@JsonProperty("facility_pl_4")
	private HD_v2 facility_pl_4;
	@JsonProperty("locationStatus_pl_5")
	private String locationStatus_pl_5;
	@JsonProperty("personLocationType_pl_6")
	private String personLocationType_pl_6;
	@JsonProperty("building_pl_7")
	private String building_pl_7;
	@JsonProperty("floor_pl_8")
	private String floor_pl_8;
	@JsonProperty("locationDescription_pl_9")
	private String locationDescription_pl_9;
	public PL_v24(String pointOfCare_pl_1, String room_pl_2, String bed_pl_3, HD_v2 facility_pl_4,
			String locationStatus_pl_5, String personLocationType_pl_6, String building_pl_7, String floor_pl_8,
			String locationDescription_pl_9) {
		super();
		this.pointOfCare_pl_1 = pointOfCare_pl_1;
		this.room_pl_2 = room_pl_2;
		this.bed_pl_3 = bed_pl_3;
		this.facility_pl_4 = facility_pl_4;
		this.locationStatus_pl_5 = locationStatus_pl_5;
		this.personLocationType_pl_6 = personLocationType_pl_6;
		this.building_pl_7 = building_pl_7;
		this.floor_pl_8 = floor_pl_8;
		this.locationDescription_pl_9 = locationDescription_pl_9;
	}
	public PL_v24() {
		super();
		this.pointOfCare_pl_1 = "";
		this.room_pl_2 = "";
		this.bed_pl_3 = "";
		this.facility_pl_4 = new HD_v2();
		this.locationStatus_pl_5 = "";
		this.personLocationType_pl_6 = "";
		this.building_pl_7 = "";
		this.floor_pl_8 = "";
		this.locationDescription_pl_9 = "";
	}
	public String getPointOfCare_pl_1() {
		return pointOfCare_pl_1;
	}
	public void setPointOfCare_pl_1(String pointOfCare_pl_1) {
		this.pointOfCare_pl_1 = pointOfCare_pl_1;
	}
	public String getRoom_pl_2() {
		return room_pl_2;
	}
	public void setRoom_pl_2(String room_pl_2) {
		this.room_pl_2 = room_pl_2;
	}
	public String getBed_pl_3() {
		return bed_pl_3;
	}
	public void setBed_pl_3(String bed_pl_3) {
		this.bed_pl_3 = bed_pl_3;
	}
	public HD_v2 getFacility_pl_4() {
		return facility_pl_4;
	}
	public void setFacility_pl_4(HD_v2 facility_pl_4) {
		this.facility_pl_4 = facility_pl_4;
	}
	public String getLocationStatus_pl_5() {
		return locationStatus_pl_5;
	}
	public void setLocationStatus_pl_5(String locationStatus_pl_5) {
		this.locationStatus_pl_5 = locationStatus_pl_5;
	}
	public String getPersonLocationType_pl_6() {
		return personLocationType_pl_6;
	}
	public void setPersonLocationType_pl_6(String personLocationType_pl_6) {
		this.personLocationType_pl_6 = personLocationType_pl_6;
	}
	public String getBuilding_pl_7() {
		return building_pl_7;
	}
	public void setBuilding_pl_7(String building_pl_7) {
		this.building_pl_7 = building_pl_7;
	}
	public String getFloor_pl_8() {
		return floor_pl_8;
	}
	public void setFloor_pl_8(String floor_pl_8) {
		this.floor_pl_8 = floor_pl_8;
	}
	public String getLocationDescription_pl_9() {
		return locationDescription_pl_9;
	}
	public void setLocationDescription_pl_9(String locationDescription_pl_9) {
		this.locationDescription_pl_9 = locationDescription_pl_9;
	}
	@Override
	public String toString() {
		return "PL_v24 [pointOfCare_pl_1=" + pointOfCare_pl_1 + ", room_pl_2=" + room_pl_2 + ", bed_pl_3=" + bed_pl_3
				+ ", facility_pl_4=" + facility_pl_4 + ", locationStatus_pl_5=" + locationStatus_pl_5
				+ ", personLocationType_pl_6=" + personLocationType_pl_6 + ", building_pl_7=" + building_pl_7
				+ ", floor_pl_8=" + floor_pl_8 + ", locationDescription_pl_9=" + locationDescription_pl_9 + "]";
	}
	
	
}
