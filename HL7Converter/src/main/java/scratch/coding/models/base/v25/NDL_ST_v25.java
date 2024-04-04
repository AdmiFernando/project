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
//import scratch.coding.models.base.TS_ST;
//
//@Table(name="NDL_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class NDL_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="NDL_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CNN_NDL_1_v25", referencedColumnName = "CNN_ID")
//	@JsonProperty("ndl_1_name")
//	private CNN_ST_v25 ndl_1_name;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_NDL_2_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("ndl_2_startDateTime")
//	private TS_ST ndl_2_startDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_NDL_3_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("ndl_3_endDateTime")
//	private TS_ST ndl_3_endDateTime;
//	@Column(name="NDL_4_v25")
//	@JsonProperty("ndl_4_pointOfCare")
//	private String ndl_4_pointOfCare;
//	@Column(name="NDL_5_v25")
//	@JsonProperty("ndl_5_room")
//	private String ndl_5_room;
//	@Column(name="NDL_6_v25")
//	@JsonProperty("ndl_6_bed")
//	private String ndl_6_bed;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_NDL_7_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("ndl_7_facility")
//	private HD_ST ndl_7_facility;
//	@Column(name="NDL_8_v25")
//	@JsonProperty("ndl_8_locationStatus")
//	private String ndl_8_locationStatus;
//	@Column(name="NDL_9_v25")
//	@JsonProperty("ndl_9_patientLocationType")
//	private String ndl_9_patientLocationType;
//	@Column(name="NDL_10_v25")
//	@JsonProperty("ndl_10_building")
//	private String ndl_10_building;
//	@Column(name="NDL_11_v25")
//	@JsonProperty("ndl_11_floor")
//	private String ndl_11_floor;
//	public NDL_ST_v25(CNN_ST_v25 ndl_1_name, TS_ST ndl_2_startDateTime, TS_ST ndl_3_endDateTime,
//			String ndl_4_pointOfCare, String ndl_5_room, String ndl_6_bed, HD_ST ndl_7_facility,
//			String ndl_8_locationStatus, String ndl_9_patientLocationType, String ndl_10_building,
//			String ndl_11_floor) {
//		super();
//		this.ndl_1_name = ndl_1_name;
//		this.ndl_2_startDateTime = ndl_2_startDateTime;
//		this.ndl_3_endDateTime = ndl_3_endDateTime;
//		this.ndl_4_pointOfCare = ndl_4_pointOfCare;
//		this.ndl_5_room = ndl_5_room;
//		this.ndl_6_bed = ndl_6_bed;
//		this.ndl_7_facility = ndl_7_facility;
//		this.ndl_8_locationStatus = ndl_8_locationStatus;
//		this.ndl_9_patientLocationType = ndl_9_patientLocationType;
//		this.ndl_10_building = ndl_10_building;
//		this.ndl_11_floor = ndl_11_floor;
//	}
//	public NDL_ST_v25() {
//		super();
//	}
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * @return the ndl_1_name
//	 *	@JsonProperty("ndl_1_name")
//	 */
//	
//	public CNN_ST_v25 getNdl_1_name() {
//		return ndl_1_name;
//	}
//	/**
//	 * @param ndl_1_name the ndl_1_name to set
//	 * @JsonProperty("ndl_1_name")
//	 */
//	public void setNdl_1_name(CNN_ST_v25 ndl_1_name) {
//		this.ndl_1_name = ndl_1_name;
//	}
//	/**
//	 * @return the ndl_2_startDateTime
//	 *	@JsonProperty("ndl_2_startDateTime")
//	 */
//	
//	public TS_ST getNdl_2_startDateTime() {
//		return ndl_2_startDateTime;
//	}
//	/**
//	 * @param ndl_2_startDateTime the ndl_2_startDateTime to set
//	 * @JsonProperty("ndl_2_startDateTime")
//	 */
//	public void setNdl_2_startDateTime(TS_ST ndl_2_startDateTime) {
//		this.ndl_2_startDateTime = ndl_2_startDateTime;
//	}
//	/**
//	 * @return the ndl_3_endDateTime
//	 *	@JsonProperty("ndl_3_endDateTime")
//	 */
//	
//	public TS_ST getNdl_3_endDateTime() {
//		return ndl_3_endDateTime;
//	}
//	/**
//	 * @param ndl_3_endDateTime the ndl_3_endDateTime to set
//	 * @JsonProperty("ndl_3_endDateTime")
//	 */
//	public void setNdl_3_endDateTime(TS_ST ndl_3_endDateTime) {
//		this.ndl_3_endDateTime = ndl_3_endDateTime;
//	}
//	/**
//	 * @return the ndl_4_pointOfCare
//	 *	@JsonProperty("ndl_4_pointOfCare")
//	 */
//	
//	public String getNdl_4_pointOfCare() {
//		return ndl_4_pointOfCare;
//	}
//	/**
//	 * @param ndl_4_pointOfCare the ndl_4_pointOfCare to set
//	 * @JsonProperty("ndl_4_pointOfCare")
//	 */
//	public void setNdl_4_pointOfCare(String ndl_4_pointOfCare) {
//		this.ndl_4_pointOfCare = ndl_4_pointOfCare;
//	}
//	/**
//	 * @return the ndl_5_room
//	 *	@JsonProperty("ndl_5_room")
//	 */
//	
//	public String getNdl_5_room() {
//		return ndl_5_room;
//	}
//	/**
//	 * @param ndl_5_room the ndl_5_room to set
//	 * @JsonProperty("ndl_5_room")
//	 */
//	public void setNdl_5_room(String ndl_5_room) {
//		this.ndl_5_room = ndl_5_room;
//	}
//	/**
//	 * @return the ndl_6_bed
//	 *	@JsonProperty("ndl_6_bed")
//	 */
//	
//	public String getNdl_6_bed() {
//		return ndl_6_bed;
//	}
//	/**
//	 * @param ndl_6_bed the ndl_6_bed to set
//	 * @JsonProperty("ndl_6_bed")
//	 */
//	public void setNdl_6_bed(String ndl_6_bed) {
//		this.ndl_6_bed = ndl_6_bed;
//	}
//	/**
//	 * @return the ndl_7_facility
//	 *	@JsonProperty("ndl_7_facility")
//	 */
//	
//	public HD_ST getNdl_7_facility() {
//		return ndl_7_facility;
//	}
//	/**
//	 * @param ndl_7_facility the ndl_7_facility to set
//	 * @JsonProperty("ndl_7_facility")
//	 */
//	public void setNdl_7_facility(HD_ST ndl_7_facility) {
//		this.ndl_7_facility = ndl_7_facility;
//	}
//	/**
//	 * @return the ndl_8_locationStatus
//	 *	@JsonProperty("ndl_8_locationStatus")
//	 */
//	
//	public String getNdl_8_locationStatus() {
//		return ndl_8_locationStatus;
//	}
//	/**
//	 * @param ndl_8_locationStatus the ndl_8_locationStatus to set
//	 * @JsonProperty("ndl_8_locationStatus")
//	 */
//	public void setNdl_8_locationStatus(String ndl_8_locationStatus) {
//		this.ndl_8_locationStatus = ndl_8_locationStatus;
//	}
//	/**
//	 * @return the ndl_9_patientLocationType
//	 *	@JsonProperty("ndl_9_patientLocationType")
//	 */
//	
//	public String getNdl_9_patientLocationType() {
//		return ndl_9_patientLocationType;
//	}
//	/**
//	 * @param ndl_9_patientLocationType the ndl_9_patientLocationType to set
//	 * @JsonProperty("ndl_9_patientLocationType")
//	 */
//	public void setNdl_9_patientLocationType(String ndl_9_patientLocationType) {
//		this.ndl_9_patientLocationType = ndl_9_patientLocationType;
//	}
//	/**
//	 * @return the ndl_10_building
//	 *	@JsonProperty("ndl_10_building")
//	 */
//	
//	public String getNdl_10_building() {
//		return ndl_10_building;
//	}
//	/**
//	 * @param ndl_10_building the ndl_10_building to set
//	 * @JsonProperty("ndl_10_building")
//	 */
//	public void setNdl_10_building(String ndl_10_building) {
//		this.ndl_10_building = ndl_10_building;
//	}
//	/**
//	 * @return the ndl_11_floor
//	 *	@JsonProperty("ndl_11_floor")
//	 */
//	
//	public String getNdl_11_floor() {
//		return ndl_11_floor;
//	}
//	/**
//	 * @param ndl_11_floor the ndl_11_floor to set
//	 * @JsonProperty("ndl_11_floor")
//	 */
//	public void setNdl_11_floor(String ndl_11_floor) {
//		this.ndl_11_floor = ndl_11_floor;
//	}
//	@Override
//	public String toString() {
//		return "NDL_ST_v25 [id=" + id + ", ndl_1_name=" + ndl_1_name + ", ndl_2_startDateTime=" + ndl_2_startDateTime
//				+ ", ndl_3_endDateTime=" + ndl_3_endDateTime + ", ndl_4_pointOfCare=" + ndl_4_pointOfCare
//				+ ", ndl_5_room=" + ndl_5_room + ", ndl_6_bed=" + ndl_6_bed + ", ndl_7_facility=" + ndl_7_facility
//				+ ", ndl_8_locationStatus=" + ndl_8_locationStatus + ", ndl_9_patientLocationType="
//				+ ndl_9_patientLocationType + ", ndl_10_building=" + ndl_10_building + ", ndl_11_floor=" + ndl_11_floor
//				+ "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, ndl_10_building, ndl_11_floor, ndl_1_name, ndl_2_startDateTime, ndl_3_endDateTime,
//				ndl_4_pointOfCare, ndl_5_room, ndl_6_bed, ndl_7_facility, ndl_8_locationStatus,
//				ndl_9_patientLocationType);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		NDL_ST_v25 other = (NDL_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(ndl_10_building, other.ndl_10_building)
//				&& Objects.equals(ndl_11_floor, other.ndl_11_floor) && Objects.equals(ndl_1_name, other.ndl_1_name)
//				&& Objects.equals(ndl_2_startDateTime, other.ndl_2_startDateTime)
//				&& Objects.equals(ndl_3_endDateTime, other.ndl_3_endDateTime)
//				&& Objects.equals(ndl_4_pointOfCare, other.ndl_4_pointOfCare)
//				&& Objects.equals(ndl_5_room, other.ndl_5_room) && Objects.equals(ndl_6_bed, other.ndl_6_bed)
//				&& Objects.equals(ndl_7_facility, other.ndl_7_facility)
//				&& Objects.equals(ndl_8_locationStatus, other.ndl_8_locationStatus)
//				&& Objects.equals(ndl_9_patientLocationType, other.ndl_9_patientLocationType);
//	}
//
//	
//}
