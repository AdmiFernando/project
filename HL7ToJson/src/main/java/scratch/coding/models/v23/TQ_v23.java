package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.RI_v2;
import scratch.coding.models.TS_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class TQ_v23 {
	@JsonProperty("cq_tq_1_quantity")
	private CQ_v23 cq_tq_1_quantity;
	@JsonProperty("ri_tq_2_interval")
	private RI_v2 ri_tq_2_interval;
	@JsonProperty("tq_3_duration")
	private String tq_3_duration;
	@JsonProperty("ts_tq_4_startDateTime")
	private TS_v2 ts_tq_4_startDateTime;
	@JsonProperty("ts_tq_5_endDateTime")
	private TS_v2 ts_tq_5_endDateTime;
	@JsonProperty("tq_6_priority")
	private String tq_6_priority;
	@JsonProperty("tq_7_condition")
	private String tq_7_condition;
	@JsonProperty("tq_8_text")
	private String tq_8_text;
	@JsonProperty("tq_9_conjunction")
	private String tq_9_conjunction;
	@JsonProperty("cm_osd_tq_10_orderSequencing")
	private CM_OSD_v23 cm_osd_tq_10_orderSequencing;
	public TQ_v23(CQ_v23 cq_tq_1_quantity, RI_v2 ri_tq_2_interval, String tq_3_duration, TS_v2 ts_tq_4_startDateTime,
			TS_v2 ts_tq_5_endDateTime, String tq_6_priority, String tq_7_condition, String tq_8_text,
			String tq_9_conjunction, CM_OSD_v23 cm_osd_tq_10_orderSequencing) {
		super();
		this.cq_tq_1_quantity = cq_tq_1_quantity;
		this.ri_tq_2_interval = ri_tq_2_interval;
		this.tq_3_duration = tq_3_duration;
		this.ts_tq_4_startDateTime = ts_tq_4_startDateTime;
		this.ts_tq_5_endDateTime = ts_tq_5_endDateTime;
		this.tq_6_priority = tq_6_priority;
		this.tq_7_condition = tq_7_condition;
		this.tq_8_text = tq_8_text;
		this.tq_9_conjunction = tq_9_conjunction;
		this.cm_osd_tq_10_orderSequencing = cm_osd_tq_10_orderSequencing;
	}
	public TQ_v23() {
		super();
		this.cq_tq_1_quantity = new CQ_v23();
		this.ri_tq_2_interval = new RI_v2();
		this.tq_3_duration = "";
		this.ts_tq_4_startDateTime = new TS_v2();
		this.ts_tq_5_endDateTime = new TS_v2();
		this.tq_6_priority = "";
		this.tq_7_condition = "";
		this.tq_8_text = "";
		this.tq_9_conjunction = "";
		this.cm_osd_tq_10_orderSequencing = new CM_OSD_v23();
	}
	public CQ_v23 getCq_tq_1_quantity() {
		return cq_tq_1_quantity;
	}
	public void setCq_tq_1_quantity(CQ_v23 cq_tq_1_quantity) {
		this.cq_tq_1_quantity = cq_tq_1_quantity;
	}
	public RI_v2 getRi_tq_2_interval() {
		return ri_tq_2_interval;
	}
	public void setRi_tq_2_interval(RI_v2 ri_tq_2_interval) {
		this.ri_tq_2_interval = ri_tq_2_interval;
	}
	public String getTq_3_duration() {
		return tq_3_duration;
	}
	public void setTq_3_duration(String tq_3_duration) {
		this.tq_3_duration = tq_3_duration;
	}
	public TS_v2 getTs_tq_4_startDateTime() {
		return ts_tq_4_startDateTime;
	}
	public void setTs_tq_4_startDateTime(TS_v2 ts_tq_4_startDateTime) {
		this.ts_tq_4_startDateTime = ts_tq_4_startDateTime;
	}
	public TS_v2 getTs_tq_5_endDateTime() {
		return ts_tq_5_endDateTime;
	}
	public void setTs_tq_5_endDateTime(TS_v2 ts_tq_5_endDateTime) {
		this.ts_tq_5_endDateTime = ts_tq_5_endDateTime;
	}
	public String getTq_6_priority() {
		return tq_6_priority;
	}
	public void setTq_6_priority(String tq_6_priority) {
		this.tq_6_priority = tq_6_priority;
	}
	public String getTq_7_condition() {
		return tq_7_condition;
	}
	public void setTq_7_condition(String tq_7_condition) {
		this.tq_7_condition = tq_7_condition;
	}
	public String getTq_8_text() {
		return tq_8_text;
	}
	public void setTq_8_text(String tq_8_text) {
		this.tq_8_text = tq_8_text;
	}
	public String getTq_9_conjunction() {
		return tq_9_conjunction;
	}
	public void setTq_9_conjunction(String tq_9_conjunction) {
		this.tq_9_conjunction = tq_9_conjunction;
	}
	public CM_OSD_v23 getCm_osd_tq_10_orderSequencing() {
		return cm_osd_tq_10_orderSequencing;
	}
	public void setCm_osd_tq_10_orderSequencing(CM_OSD_v23 cm_osd_tq_10_orderSequencing) {
		this.cm_osd_tq_10_orderSequencing = cm_osd_tq_10_orderSequencing;
	}
	@Override
	public String toString() {
		return "TQ_v23 [cq_tq_1_quantity=" + cq_tq_1_quantity + ", ri_tq_2_interval=" + ri_tq_2_interval
				+ ", tq_3_duration=" + tq_3_duration + ", ts_tq_4_startDateTime=" + ts_tq_4_startDateTime
				+ ", ts_tq_5_endDateTime=" + ts_tq_5_endDateTime + ", tq_6_priority=" + tq_6_priority
				+ ", tq_7_condition=" + tq_7_condition + ", tq_8_text=" + tq_8_text + ", tq_9_conjunction="
				+ tq_9_conjunction + ", cm_osd_tq_10_orderSequencing=" + cm_osd_tq_10_orderSequencing + "]";
	}
	
}
