//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.HD_ST;
//
//@Table(name="PL_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class PL_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="PL_ID")
//	private Long id;
//	@Column(name="PL_1_v25")
//	@JsonProperty("pl_1_pointOfCare")
//	private String pl_1_pointOfCare;
//	@Column(name="PL_2_v25")
//	@JsonProperty("pl_2_room")
//	private String pl_2_room;
//	@Column(name="PL_3_v25")
//	@JsonProperty("pl_3_bed")
//	private String pl_3_bed;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_PL_4_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("pl_4_facility")
//	private HD_ST pl_4_facility;
//	@Column(name="PL_5_v25")
//	@JsonProperty("pl_5_locationStatus")
//	private String pl_5_locationStatus;
//	@Column(name="PL_6_v25")
//	@JsonProperty("pl_6_personLocationType")
//	private String pl_6_personLocationType;
//	@Column(name="PL_7_v25")
//	@JsonProperty("pl_7_building")
//	private String pl_7_building;
//	@Column(name="PL_8_v25")
//	@JsonProperty("pl_8_floor")
//	private String pl_8_floor;
//	@Column(name="PL_9_v25")
//	@JsonProperty("pl_9_locationDescription")
//	private String pl_9_locationDescription;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_PL_10_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("pl_10_comprehensiveLocationIdentifier")
//	private EI_ST_v25 pl_10_comprehensiveLocationIdentifier;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_PL_11_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("pl_11_assigningAuthorityForLocation")
//	private HD_ST pl_11_assigningAuthorityForLocation;
//	
//
//	public PL_ST_v25(String pl_1_pointOfCare, String pl_2_room, String pl_3_bed, HD_ST pl_4_facility,
//			String pl_5_locationStatus, String pl_6_personLocationType, String pl_7_building, String pl_8_floor,
//			String pl_9_locationDescription, EI_ST_v25 pl_10_comprehensiveLocationIdentifier,
//			HD_ST pl_11_assigningAuthorityForLocation) {
//		super();
//		this.pl_1_pointOfCare = pl_1_pointOfCare;
//		this.pl_2_room = pl_2_room;
//		this.pl_3_bed = pl_3_bed;
//		this.pl_4_facility = pl_4_facility;
//		this.pl_5_locationStatus = pl_5_locationStatus;
//		this.pl_6_personLocationType = pl_6_personLocationType;
//		this.pl_7_building = pl_7_building;
//		this.pl_8_floor = pl_8_floor;
//		this.pl_9_locationDescription = pl_9_locationDescription;
//		this.pl_10_comprehensiveLocationIdentifier = pl_10_comprehensiveLocationIdentifier;
//		this.pl_11_assigningAuthorityForLocation = pl_11_assigningAuthorityForLocation;
//	}
//
//	public PL_ST_v25() {
//		super();
//	}
//
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the pl_1_pointOfCare
//	 *	@JsonProperty("pl_1_pointOfCare")
//	 */
//	
//	public String getPl_1_pointOfCare() {
//		return pl_1_pointOfCare;
//	}
//
//	/**
//	 * @param pl_1_pointOfCare the pl_1_pointOfCare to set
//	 * @JsonProperty("pl_1_pointOfCare")
//	 */
//	public void setPl_1_pointOfCare(String pl_1_pointOfCare) {
//		this.pl_1_pointOfCare = pl_1_pointOfCare;
//	}
//
//	/**
//	 * @return the pl_2_room
//	 *	@JsonProperty("pl_2_room")
//	 */
//	
//	public String getPl_2_room() {
//		return pl_2_room;
//	}
//
//	/**
//	 * @param pl_2_room the pl_2_room to set
//	 * @JsonProperty("pl_2_room")
//	 */
//	public void setPl_2_room(String pl_2_room) {
//		this.pl_2_room = pl_2_room;
//	}
//
//	/**
//	 * @return the pl_3_bed
//	 *	@JsonProperty("pl_3_bed")
//	 */
//	
//	public String getPl_3_bed() {
//		return pl_3_bed;
//	}
//
//	/**
//	 * @param pl_3_bed the pl_3_bed to set
//	 * @JsonProperty("pl_3_bed")
//	 */
//	public void setPl_3_bed(String pl_3_bed) {
//		this.pl_3_bed = pl_3_bed;
//	}
//
//	/**
//	 * @return the pl_4_facility
//	 *	@JsonProperty("pl_4_facility")
//	 */
//	
//	public HD_ST getPl_4_facility() {
//		return pl_4_facility;
//	}
//
//	/**
//	 * @param pl_4_facility the pl_4_facility to set
//	 * @JsonProperty("pl_4_facility")
//	 */
//	public void setPl_4_facility(HD_ST pl_4_facility) {
//		this.pl_4_facility = pl_4_facility;
//	}
//
//	/**
//	 * @return the pl_5_locationStatus
//	 *	@JsonProperty("pl_5_locationStatus")
//	 */
//	
//	public String getPl_5_locationStatus() {
//		return pl_5_locationStatus;
//	}
//
//	/**
//	 * @param pl_5_locationStatus the pl_5_locationStatus to set
//	 * @JsonProperty("pl_5_locationStatus")
//	 */
//	public void setPl_5_locationStatus(String pl_5_locationStatus) {
//		this.pl_5_locationStatus = pl_5_locationStatus;
//	}
//
//	/**
//	 * @return the pl_6_personLocationType
//	 *	@JsonProperty("pl_6_personLocationType")
//	 */
//	
//	public String getPl_6_personLocationType() {
//		return pl_6_personLocationType;
//	}
//
//	/**
//	 * @param pl_6_personLocationType the pl_6_personLocationType to set
//	 * @JsonProperty("pl_6_personLocationType")
//	 */
//	public void setPl_6_personLocationType(String pl_6_personLocationType) {
//		this.pl_6_personLocationType = pl_6_personLocationType;
//	}
//
//	/**
//	 * @return the pl_7_building
//	 *	@JsonProperty("pl_7_building")
//	 */
//	
//	public String getPl_7_building() {
//		return pl_7_building;
//	}
//
//	/**
//	 * @param pl_7_building the pl_7_building to set
//	 * @JsonProperty("pl_7_building")
//	 */
//	public void setPl_7_building(String pl_7_building) {
//		this.pl_7_building = pl_7_building;
//	}
//
//	/**
//	 * @return the pl_8_floor
//	 *	@JsonProperty("pl_8_floor")
//	 */
//	
//	public String getPl_8_floor() {
//		return pl_8_floor;
//	}
//
//	/**
//	 * @param pl_8_floor the pl_8_floor to set
//	 * @JsonProperty("pl_8_floor")
//	 */
//	public void setPl_8_floor(String pl_8_floor) {
//		this.pl_8_floor = pl_8_floor;
//	}
//
//	/**
//	 * @return the pl_9_locationDescription
//	 *	@JsonProperty("pl_9_locationDescription")
//	 */
//	
//	public String getPl_9_locationDescription() {
//		return pl_9_locationDescription;
//	}
//
//	/**
//	 * @param pl_9_locationDescription the pl_9_locationDescription to set
//	 * @JsonProperty("pl_9_locationDescription")
//	 */
//	public void setPl_9_locationDescription(String pl_9_locationDescription) {
//		this.pl_9_locationDescription = pl_9_locationDescription;
//	}
//
//	/**
//	 * @return the pl_10_comprehensiveLocationIdentifier
//	 *	@JsonProperty("pl_10_comprehensiveLocationIdentifier")
//	 */
//	
//	public EI_ST_v25 getPl_10_comprehensiveLocationIdentifier() {
//		return pl_10_comprehensiveLocationIdentifier;
//	}
//
//	/**
//	 * @param pl_10_comprehensiveLocationIdentifier the pl_10_comprehensiveLocationIdentifier to set
//	 * @JsonProperty("pl_10_comprehensiveLocationIdentifier")
//	 */
//	public void setPl_10_comprehensiveLocationIdentifier(EI_ST_v25 pl_10_comprehensiveLocationIdentifier) {
//		this.pl_10_comprehensiveLocationIdentifier = pl_10_comprehensiveLocationIdentifier;
//	}
//
//	/**
//	 * @return the pl_11_assigningAuthorityForLocation
//	 *	@JsonProperty("pl_11_assigningAuthorityForLocation")
//	 */
//	
//	public HD_ST getPl_11_assigningAuthorityForLocation() {
//		return pl_11_assigningAuthorityForLocation;
//	}
//
//	/**
//	 * @param pl_11_assigningAuthorityForLocation the pl_11_assigningAuthorityForLocation to set
//	 * @JsonProperty("pl_11_assigningAuthorityForLocation")
//	 */
//	public void setPl_11_assigningAuthorityForLocation(HD_ST pl_11_assigningAuthorityForLocation) {
//		this.pl_11_assigningAuthorityForLocation = pl_11_assigningAuthorityForLocation;
//	}
//
//	/**
//	 * @return the orc_13_v25
//	 *	@JsonProperty("orc_13_v25")
//	 */
//
//
//	@Override
//	public String toString() {
//		return "PL_ST_v25 [id=" + id + ", pl_1_pointOfCare=" + pl_1_pointOfCare + ", pl_2_room=" + pl_2_room
//				+ ", pl_3_bed=" + pl_3_bed + ", pl_4_facility=" + pl_4_facility + ", pl_5_locationStatus="
//				+ pl_5_locationStatus + ", pl_6_personLocationType=" + pl_6_personLocationType + ", pl_7_building="
//				+ pl_7_building + ", pl_8_floor=" + pl_8_floor + ", pl_9_locationDescription="
//				+ pl_9_locationDescription + ", pl_10_comprehensiveLocationIdentifier="
//				+ pl_10_comprehensiveLocationIdentifier + ", pl_11_assigningAuthorityForLocation="
//				+ pl_11_assigningAuthorityForLocation + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, pl_10_comprehensiveLocationIdentifier, pl_11_assigningAuthorityForLocation,
//				pl_1_pointOfCare, pl_2_room, pl_3_bed, pl_4_facility, pl_5_locationStatus, pl_6_personLocationType,
//				pl_7_building, pl_8_floor, pl_9_locationDescription);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		PL_ST_v25 other = (PL_ST_v25) obj;
//		return Objects.equals(id, other.id)
//				&& Objects.equals(pl_10_comprehensiveLocationIdentifier, other.pl_10_comprehensiveLocationIdentifier)
//				&& Objects.equals(pl_11_assigningAuthorityForLocation, other.pl_11_assigningAuthorityForLocation)
//				&& Objects.equals(pl_1_pointOfCare, other.pl_1_pointOfCare)
//				&& Objects.equals(pl_2_room, other.pl_2_room) && Objects.equals(pl_3_bed, other.pl_3_bed)
//				&& Objects.equals(pl_4_facility, other.pl_4_facility)
//				&& Objects.equals(pl_5_locationStatus, other.pl_5_locationStatus)
//				&& Objects.equals(pl_6_personLocationType, other.pl_6_personLocationType)
//				&& Objects.equals(pl_7_building, other.pl_7_building) && Objects.equals(pl_8_floor, other.pl_8_floor)
//				&& Objects.equals(pl_9_locationDescription, other.pl_9_locationDescription);
//	}
//	
//	
//}
