package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_NDL_v23 {
	@JsonProperty("cn_cm_ndl_1_OPName")
	private CN_v23 cn_cm_ndl_1_OPName;
	@JsonProperty("ts_cm_ndl_2_startDatetime")
	private TS_v2 ts_cm_ndl_2_startDatetime;
	@JsonProperty("ts_cm_ndl_3_endDatetime")
	private TS_v2 ts_cm_ndl_3_endDatetime;
	@JsonProperty("cm_ndl_4_pointOfCare")
	private String cm_ndl_4_pointOfCare;
	@JsonProperty("cm_ndl_5_room")
	private String cm_ndl_5_room;
	@JsonProperty("cm_ndl_6_bed")
	private String cm_ndl_6_bed;
	@JsonProperty("hd_cm_ndl_7_facility")
	private HD_v2 _hd_cm_ndl_7_facility;
	@JsonProperty("cm_ndl_8_locationStatus")
	private String cm_ndl_8_locationStatus;
	@JsonProperty("cm_ndl_9_personLocationType")
	private String cm_ndl_9_personLocationType;
	@JsonProperty("cm_ndl_10_building")
	private String cm_ndl_10_building;
	@JsonProperty("cm_ndl_11_floor")
	private String cm_ndl_11_floor;
	public CM_NDL_v23(CN_v23 cn_cm_ndl_1_OPName, TS_v2 ts_cm_ndl_2_startDatetime,
			TS_v2 ts_cm_ndl_3_endDatetime, String cm_ndl_4_pointOfCare, String cm_ndl_5_room, String cm_ndl_6_bed,
			HD_v2 _hd_cm_ndl_7_facility, String cm_ndl_8_locationStatus, String cm_ndl_9_personLocationType,
			String cm_ndl_10_building, String cm_ndl_11_floor) {
		super();
		this.cn_cm_ndl_1_OPName = cn_cm_ndl_1_OPName;
		this.ts_cm_ndl_2_startDatetime = ts_cm_ndl_2_startDatetime;
		this.ts_cm_ndl_3_endDatetime = ts_cm_ndl_3_endDatetime;
		this.cm_ndl_4_pointOfCare = cm_ndl_4_pointOfCare;
		this.cm_ndl_5_room = cm_ndl_5_room;
		this.cm_ndl_6_bed = cm_ndl_6_bed;
		this._hd_cm_ndl_7_facility = _hd_cm_ndl_7_facility;
		this.cm_ndl_8_locationStatus = cm_ndl_8_locationStatus;
		this.cm_ndl_9_personLocationType = cm_ndl_9_personLocationType;
		this.cm_ndl_10_building = cm_ndl_10_building;
		this.cm_ndl_11_floor = cm_ndl_11_floor;
	}
	public CM_NDL_v23() {
		super();
		this.cn_cm_ndl_1_OPName = new CN_v23();
		this.ts_cm_ndl_2_startDatetime = new TS_v2();
		this.ts_cm_ndl_3_endDatetime = new TS_v2();
		this.cm_ndl_4_pointOfCare = "";
		this.cm_ndl_5_room = "";
		this.cm_ndl_6_bed = "";
		this._hd_cm_ndl_7_facility = new HD_v2();
		this.cm_ndl_8_locationStatus = "";
		this.cm_ndl_9_personLocationType = "";
		this.cm_ndl_10_building = "";
		this.cm_ndl_11_floor = "";
	}
	public CN_v23 getCn_cm_ndl_1_OPName() {
		return cn_cm_ndl_1_OPName;
	}
	public void setCn_cm_ndl_1_OPName(CN_v23 cn_cm_ndl_1_OPName) {
		this.cn_cm_ndl_1_OPName = cn_cm_ndl_1_OPName;
	}
	public TS_v2 getTs_cm_ndl_2_startDatetime() {
		return ts_cm_ndl_2_startDatetime;
	}
	public void setTs_cm_ndl_2_startDatetime(TS_v2 ts_cm_ndl_2_startDatetime) {
		this.ts_cm_ndl_2_startDatetime = ts_cm_ndl_2_startDatetime;
	}
	public TS_v2 getTs_cm_ndl_3_endDatetime() {
		return ts_cm_ndl_3_endDatetime;
	}
	public void setTs_cm_ndl_3_endDatetime(TS_v2 ts_cm_ndl_3_endDatetime) {
		this.ts_cm_ndl_3_endDatetime = ts_cm_ndl_3_endDatetime;
	}
	public String getCm_ndl_4_pointOfCare() {
		return cm_ndl_4_pointOfCare;
	}
	public void setCm_ndl_4_pointOfCare(String cm_ndl_4_pointOfCare) {
		this.cm_ndl_4_pointOfCare = cm_ndl_4_pointOfCare;
	}
	public String getCm_ndl_5_room() {
		return cm_ndl_5_room;
	}
	public void setCm_ndl_5_room(String cm_ndl_5_room) {
		this.cm_ndl_5_room = cm_ndl_5_room;
	}
	public String getCm_ndl_6_bed() {
		return cm_ndl_6_bed;
	}
	public void setCm_ndl_6_bed(String cm_ndl_6_bed) {
		this.cm_ndl_6_bed = cm_ndl_6_bed;
	}
	public HD_v2 get_hd_cm_ndl_7_facility() {
		return _hd_cm_ndl_7_facility;
	}
	public void set_hd_cm_ndl_7_facility(HD_v2 _hd_cm_ndl_7_facility) {
		this._hd_cm_ndl_7_facility = _hd_cm_ndl_7_facility;
	}
	public String getCm_ndl_8_locationStatus() {
		return cm_ndl_8_locationStatus;
	}
	public void setCm_ndl_8_locationStatus(String cm_ndl_8_locationStatus) {
		this.cm_ndl_8_locationStatus = cm_ndl_8_locationStatus;
	}
	public String getCm_ndl_9_personLocationType() {
		return cm_ndl_9_personLocationType;
	}
	public void setCm_ndl_9_personLocationType(String cm_ndl_9_personLocationType) {
		this.cm_ndl_9_personLocationType = cm_ndl_9_personLocationType;
	}
	public String getCm_ndl_10_building() {
		return cm_ndl_10_building;
	}
	public void setCm_ndl_10_building(String cm_ndl_10_building) {
		this.cm_ndl_10_building = cm_ndl_10_building;
	}
	public String getCm_ndl_11_floor() {
		return cm_ndl_11_floor;
	}
	public void setCm_ndl_11_floor(String cm_ndl_11_floor) {
		this.cm_ndl_11_floor = cm_ndl_11_floor;
	}
	@Override
	public String toString() {
		return "CM_NDL_v23 [cn_cm_ndl_1_OPName=" + cn_cm_ndl_1_OPName + ", ts_cm_ndl_2_startDatetime="
				+ ts_cm_ndl_2_startDatetime + ", ts_cm_ndl_3_endDatetime=" + ts_cm_ndl_3_endDatetime
				+ ", cm_ndl_4_pointOfCare=" + cm_ndl_4_pointOfCare + ", cm_ndl_5_room=" + cm_ndl_5_room
				+ ", cm_ndl_6_bed=" + cm_ndl_6_bed + ", _hd_cm_ndl_7_facility=" + _hd_cm_ndl_7_facility
				+ ", cm_ndl_8_locationStatus=" + cm_ndl_8_locationStatus + ", cm_ndl_9_personLocationType="
				+ cm_ndl_9_personLocationType + ", cm_ndl_10_building=" + cm_ndl_10_building + ", cm_ndl_11_floor="
				+ cm_ndl_11_floor + "]";
	}
	
}
