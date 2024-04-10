package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class NDL_v25 {
					
	@JsonProperty("ndl_1_name")
	private CNN_v25 ndl_1_name;
	@JsonProperty("ndl_2_startDateTime")
	private TS_v2 ndl_2_startDateTime;
	@JsonProperty("ndl_3_endDateTime")
	private TS_v2 ndl_3_endDateTime;
	@JsonProperty("ndl_4_pointOfCare")
	private String ndl_4_pointOfCare;
	@JsonProperty("ndl_5_room")
	private String ndl_5_room;
	@JsonProperty("ndl_6_bed")
	private String ndl_6_bed;
	@JsonProperty("ndl_7_facility")
	private HD_v2 ndl_7_facility;
	@JsonProperty("ndl_8_locationStatus")
	private String ndl_8_locationStatus;
	@JsonProperty("ndl_9_patientLocationType")
	private String ndl_9_patientLocationType;
	@JsonProperty("ndl_10_building")
	private String ndl_10_building;
	@JsonProperty("ndl_11_floor")
	private String ndl_11_floor;
	public NDL_v25() {
		super();
	}
	public NDL_v25(CNN_v25 ndl_1_name, TS_v2 ndl_2_startDateTime, TS_v2 ndl_3_endDateTime, String ndl_4_pointOfCare,
			String ndl_5_room, String ndl_6_bed, HD_v2 ndl_7_facility, String ndl_8_locationStatus,
			String ndl_9_patientLocationType, String ndl_10_building, String ndl_11_floor) {
		super();
		this.ndl_1_name = ndl_1_name;
		this.ndl_2_startDateTime = ndl_2_startDateTime;
		this.ndl_3_endDateTime = ndl_3_endDateTime;
		this.ndl_4_pointOfCare = ndl_4_pointOfCare;
		this.ndl_5_room = ndl_5_room;
		this.ndl_6_bed = ndl_6_bed;
		this.ndl_7_facility = ndl_7_facility;
		this.ndl_8_locationStatus = ndl_8_locationStatus;
		this.ndl_9_patientLocationType = ndl_9_patientLocationType;
		this.ndl_10_building = ndl_10_building;
		this.ndl_11_floor = ndl_11_floor;
	}
	public CNN_v25 getNdl_1_name() {
		return ndl_1_name;
	}
	public void setNdl_1_name(CNN_v25 ndl_1_name) {
		this.ndl_1_name = ndl_1_name;
	}
	public TS_v2 getNdl_2_startDateTime() {
		return ndl_2_startDateTime;
	}
	public void setNdl_2_startDateTime(TS_v2 ndl_2_startDateTime) {
		this.ndl_2_startDateTime = ndl_2_startDateTime;
	}
	public TS_v2 getNdl_3_endDateTime() {
		return ndl_3_endDateTime;
	}
	public void setNdl_3_endDateTime(TS_v2 ndl_3_endDateTime) {
		this.ndl_3_endDateTime = ndl_3_endDateTime;
	}
	public String getNdl_4_pointOfCare() {
		return ndl_4_pointOfCare;
	}
	public void setNdl_4_pointOfCare(String ndl_4_pointOfCare) {
		this.ndl_4_pointOfCare = ndl_4_pointOfCare;
	}
	public String getNdl_5_room() {
		return ndl_5_room;
	}
	public void setNdl_5_room(String ndl_5_room) {
		this.ndl_5_room = ndl_5_room;
	}
	public String getNdl_6_bed() {
		return ndl_6_bed;
	}
	public void setNdl_6_bed(String ndl_6_bed) {
		this.ndl_6_bed = ndl_6_bed;
	}
	public HD_v2 getNdl_7_facility() {
		return ndl_7_facility;
	}
	public void setNdl_7_facility(HD_v2 ndl_7_facility) {
		this.ndl_7_facility = ndl_7_facility;
	}
	public String getNdl_8_locationStatus() {
		return ndl_8_locationStatus;
	}
	public void setNdl_8_locationStatus(String ndl_8_locationStatus) {
		this.ndl_8_locationStatus = ndl_8_locationStatus;
	}
	public String getNdl_9_patientLocationType() {
		return ndl_9_patientLocationType;
	}
	public void setNdl_9_patientLocationType(String ndl_9_patientLocationType) {
		this.ndl_9_patientLocationType = ndl_9_patientLocationType;
	}
	public String getNdl_10_building() {
		return ndl_10_building;
	}
	public void setNdl_10_building(String ndl_10_building) {
		this.ndl_10_building = ndl_10_building;
	}
	public String getNdl_11_floor() {
		return ndl_11_floor;
	}
	public void setNdl_11_floor(String ndl_11_floor) {
		this.ndl_11_floor = ndl_11_floor;
	}
	@Override
	public String toString() {
		return "NDL_v25 [ndl_1_name=" + ndl_1_name + ", ndl_2_startDateTime=" + ndl_2_startDateTime
				+ ", ndl_3_endDateTime=" + ndl_3_endDateTime + ", ndl_4_pointOfCare=" + ndl_4_pointOfCare
				+ ", ndl_5_room=" + ndl_5_room + ", ndl_6_bed=" + ndl_6_bed + ", ndl_7_facility=" + ndl_7_facility
				+ ", ndl_8_locationStatus=" + ndl_8_locationStatus + ", ndl_9_patientLocationType="
				+ ndl_9_patientLocationType + ", ndl_10_building=" + ndl_10_building + ", ndl_11_floor=" + ndl_11_floor
				+ "]";
	}
	
	
}
