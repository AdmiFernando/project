package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PL_v25 {
			
	@JsonProperty("pl_1_pointOfCare")
	private String pl_1_pointOfCare;
	@JsonProperty("pl_2_room")
	private String pl_2_room;
	@JsonProperty("pl_3_bed")
	private String pl_3_bed;
	@JsonProperty("pl_4_facility")
	private HD_v2 pl_4_facility;
	@JsonProperty("pl_5_locationStatus")
	private String pl_5_locationStatus;
	@JsonProperty("pl_6_personLocationType")
	private String pl_6_personLocationType;
	@JsonProperty("pl_7_building")
	private String pl_7_building;
	@JsonProperty("pl_8_floor")
	private String pl_8_floor;
	@JsonProperty("pl_9_locationDescription")
	private String pl_9_locationDescription;
	@JsonProperty("pl_10_comprehensiveLocationIdentifier")
	private EI_v2 pl_10_comprehensiveLocationIdentifier;
	@JsonProperty("pl_11_assigningAuthorityForLocation")
	private HD_v2 pl_11_assigningAuthorityForLocation;
	public PL_v25(String pl_1_pointOfCare, String pl_2_room, String pl_3_bed, HD_v2 pl_4_facility,
			String pl_5_locationStatus, String pl_6_personLocationType, String pl_7_building, String pl_8_floor,
			String pl_9_locationDescription, EI_v2 pl_10_comprehensiveLocationIdentifier,
			HD_v2 pl_11_assigningAuthorityForLocation) {
		super();
		this.pl_1_pointOfCare = pl_1_pointOfCare;
		this.pl_2_room = pl_2_room;
		this.pl_3_bed = pl_3_bed;
		this.pl_4_facility = pl_4_facility;
		this.pl_5_locationStatus = pl_5_locationStatus;
		this.pl_6_personLocationType = pl_6_personLocationType;
		this.pl_7_building = pl_7_building;
		this.pl_8_floor = pl_8_floor;
		this.pl_9_locationDescription = pl_9_locationDescription;
		this.pl_10_comprehensiveLocationIdentifier = pl_10_comprehensiveLocationIdentifier;
		this.pl_11_assigningAuthorityForLocation = pl_11_assigningAuthorityForLocation;
	}
	public PL_v25() {
		super();
		this.pl_1_pointOfCare = "";
		this.pl_2_room = "";
		this.pl_3_bed = "";
		this.pl_4_facility = new HD_v2();
		this.pl_5_locationStatus = "";
		this.pl_6_personLocationType = "";
		this.pl_7_building = "";
		this.pl_8_floor = "";
		this.pl_9_locationDescription = "";
		this.pl_10_comprehensiveLocationIdentifier = new EI_v2();
		this.pl_11_assigningAuthorityForLocation = new HD_v2();
	}
	public String getPl_1_pointOfCare() {
		return pl_1_pointOfCare;
	}
	public void setPl_1_pointOfCare(String pl_1_pointOfCare) {
		this.pl_1_pointOfCare = pl_1_pointOfCare;
	}
	public String getPl_2_room() {
		return pl_2_room;
	}
	public void setPl_2_room(String pl_2_room) {
		this.pl_2_room = pl_2_room;
	}
	public String getPl_3_bed() {
		return pl_3_bed;
	}
	public void setPl_3_bed(String pl_3_bed) {
		this.pl_3_bed = pl_3_bed;
	}
	public HD_v2 getPl_4_facility() {
		return pl_4_facility;
	}
	public void setPl_4_facility(HD_v2 pl_4_facility) {
		this.pl_4_facility = pl_4_facility;
	}
	public String getPl_5_locationStatus() {
		return pl_5_locationStatus;
	}
	public void setPl_5_locationStatus(String pl_5_locationStatus) {
		this.pl_5_locationStatus = pl_5_locationStatus;
	}
	public String getPl_6_personLocationType() {
		return pl_6_personLocationType;
	}
	public void setPl_6_personLocationType(String pl_6_personLocationType) {
		this.pl_6_personLocationType = pl_6_personLocationType;
	}
	public String getPl_7_building() {
		return pl_7_building;
	}
	public void setPl_7_building(String pl_7_building) {
		this.pl_7_building = pl_7_building;
	}
	public String getPl_8_floor() {
		return pl_8_floor;
	}
	public void setPl_8_floor(String pl_8_floor) {
		this.pl_8_floor = pl_8_floor;
	}
	public String getPl_9_locationDescription() {
		return pl_9_locationDescription;
	}
	public void setPl_9_locationDescription(String pl_9_locationDescription) {
		this.pl_9_locationDescription = pl_9_locationDescription;
	}
	public EI_v2 getPl_10_comprehensiveLocationIdentifier() {
		return pl_10_comprehensiveLocationIdentifier;
	}
	public void setPl_10_comprehensiveLocationIdentifier(EI_v2 pl_10_comprehensiveLocationIdentifier) {
		this.pl_10_comprehensiveLocationIdentifier = pl_10_comprehensiveLocationIdentifier;
	}
	public HD_v2 getPl_11_assigningAuthorityForLocation() {
		return pl_11_assigningAuthorityForLocation;
	}
	public void setPl_11_assigningAuthorityForLocation(HD_v2 pl_11_assigningAuthorityForLocation) {
		this.pl_11_assigningAuthorityForLocation = pl_11_assigningAuthorityForLocation;
	}
	@Override
	public String toString() {
		return "PL_v25 [pl_1_pointOfCare=" + pl_1_pointOfCare + ", pl_2_room=" + pl_2_room + ", pl_3_bed=" + pl_3_bed
				+ ", pl_4_facility=" + pl_4_facility + ", pl_5_locationStatus=" + pl_5_locationStatus
				+ ", pl_6_personLocationType=" + pl_6_personLocationType + ", pl_7_building=" + pl_7_building
				+ ", pl_8_floor=" + pl_8_floor + ", pl_9_locationDescription=" + pl_9_locationDescription
				+ ", pl_10_comprehensiveLocationIdentifier=" + pl_10_comprehensiveLocationIdentifier
				+ ", pl_11_assigningAuthorityForLocation=" + pl_11_assigningAuthorityForLocation + "]";
	}
	
}
