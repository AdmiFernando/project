package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.RI_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class TQ_v25 {
		
	@JsonProperty("tq_1_quantity")
	private CQ_v25 tq_1_quantity;
	@JsonProperty("tq_2_interval")
	private RI_v2 tq_2_interval;
	@JsonProperty("tq_3_duration")
	private String tq_3_duration;
	@JsonProperty("tq_4_startDateTime")
	private TS_v2 tq_4_startDateTime;
	@JsonProperty("tq_5_endDateTime")
	private TS_v2 tq_5_endDateTime;
	@JsonProperty("tq_6_priority")
	private String tq_6_priority;
	@JsonProperty("tq_7_condition")
	private String tq_7_condition;
	@JsonProperty("tq_8_text")
	private String tq_8_text;
	@JsonProperty("tq_9_conjunction")
	private String tq_9_conjunction;
	@JsonProperty("tq_10_orderSequencing")
	private OSD_V25 tq_10_orderSequencing;
	@JsonProperty("tq_11_occurrenceDuration")
	private CE_v2 tq_11_occurrenceDuration;
	@JsonProperty("tq_12_totalOccurrences")
	private String tq_12_totalOccurrences;
	public TQ_v25(CQ_v25 tq_1_quantity, RI_v2 tq_2_interval, String tq_3_duration, TS_v2 tq_4_startDateTime,
			TS_v2 tq_5_endDateTime, String tq_6_priority, String tq_7_condition, String tq_8_text,
			String tq_9_conjunction, OSD_V25 tq_10_orderSequencing, CE_v2 tq_11_occurrenceDuration,
			String tq_12_totalOccurrences) {
		super();
		this.tq_1_quantity = tq_1_quantity;
		this.tq_2_interval = tq_2_interval;
		this.tq_3_duration = tq_3_duration;
		this.tq_4_startDateTime = tq_4_startDateTime;
		this.tq_5_endDateTime = tq_5_endDateTime;
		this.tq_6_priority = tq_6_priority;
		this.tq_7_condition = tq_7_condition;
		this.tq_8_text = tq_8_text;
		this.tq_9_conjunction = tq_9_conjunction;
		this.tq_10_orderSequencing = tq_10_orderSequencing;
		this.tq_11_occurrenceDuration = tq_11_occurrenceDuration;
		this.tq_12_totalOccurrences = tq_12_totalOccurrences;
	}
	public TQ_v25() {
		super();
		this.tq_1_quantity = new CQ_v25();
		this.tq_2_interval = new RI_v2();
		this.tq_3_duration = "";
		this.tq_4_startDateTime = new TS_v2();
		this.tq_5_endDateTime = new TS_v2();
		this.tq_6_priority = "";
		this.tq_7_condition = "";
		this.tq_8_text = "";
		this.tq_9_conjunction = "";
		this.tq_10_orderSequencing = new OSD_V25();
		this.tq_11_occurrenceDuration = new CE_v2();
		this.tq_12_totalOccurrences = "";
	}
	public CQ_v25 getTq_1_quantity() {
		return tq_1_quantity;
	}
	public void setTq_1_quantity(CQ_v25 tq_1_quantity) {
		this.tq_1_quantity = tq_1_quantity;
	}
	public RI_v2 getTq_2_interval() {
		return tq_2_interval;
	}
	public void setTq_2_interval(RI_v2 tq_2_interval) {
		this.tq_2_interval = tq_2_interval;
	}
	public String getTq_3_duration() {
		return tq_3_duration;
	}
	public void setTq_3_duration(String tq_3_duration) {
		this.tq_3_duration = tq_3_duration;
	}
	public TS_v2 getTq_4_startDateTime() {
		return tq_4_startDateTime;
	}
	public void setTq_4_startDateTime(TS_v2 tq_4_startDateTime) {
		this.tq_4_startDateTime = tq_4_startDateTime;
	}
	public TS_v2 getTq_5_endDateTime() {
		return tq_5_endDateTime;
	}
	public void setTq_5_endDateTime(TS_v2 tq_5_endDateTime) {
		this.tq_5_endDateTime = tq_5_endDateTime;
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
	public OSD_V25 getTq_10_orderSequencing() {
		return tq_10_orderSequencing;
	}
	public void setTq_10_orderSequencing(OSD_V25 tq_10_orderSequencing) {
		this.tq_10_orderSequencing = tq_10_orderSequencing;
	}
	public CE_v2 getTq_11_occurrenceDuration() {
		return tq_11_occurrenceDuration;
	}
	public void setTq_11_occurrenceDuration(CE_v2 tq_11_occurrenceDuration) {
		this.tq_11_occurrenceDuration = tq_11_occurrenceDuration;
	}
	public String getTq_12_totalOccurrences() {
		return tq_12_totalOccurrences;
	}
	public void setTq_12_totalOccurrences(String tq_12_totalOccurrences) {
		this.tq_12_totalOccurrences = tq_12_totalOccurrences;
	}
	@Override
	public String toString() {
		return "TQ_v25 [tq_1_quantity=" + tq_1_quantity + ", tq_2_interval=" + tq_2_interval + ", tq_3_duration="
				+ tq_3_duration + ", tq_4_startDateTime=" + tq_4_startDateTime + ", tq_5_endDateTime="
				+ tq_5_endDateTime + ", tq_6_priority=" + tq_6_priority + ", tq_7_condition=" + tq_7_condition
				+ ", tq_8_text=" + tq_8_text + ", tq_9_conjunction=" + tq_9_conjunction + ", tq_10_orderSequencing="
				+ tq_10_orderSequencing + ", tq_11_occurrenceDuration=" + tq_11_occurrenceDuration
				+ ", tq_12_totalOccurrences=" + tq_12_totalOccurrences + "]";
	}
	
}
