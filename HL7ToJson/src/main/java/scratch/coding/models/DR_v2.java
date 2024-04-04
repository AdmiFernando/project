package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class DR_v2 {
	@JsonProperty("ts_dr_1_rangeStartDateTime")
	private TS_v2 ts_dr_1_rangeStartDateTime;
	@JsonProperty("ts_dr_2_rangeEndDateTime")
	private TS_v2 ts_dr_2_rangeEndDateTime;
	public DR_v2(TS_v2 ts_dr_1_rangeStartDateTime, TS_v2 ts_dr_2_rangeEndDateTime) {
		super();
		this.ts_dr_1_rangeStartDateTime = ts_dr_1_rangeStartDateTime;
		this.ts_dr_2_rangeEndDateTime = ts_dr_2_rangeEndDateTime;
	}
	public DR_v2() {
		super();
		this.ts_dr_1_rangeStartDateTime = new TS_v2();
		this.ts_dr_2_rangeEndDateTime = new TS_v2();
	}
	public TS_v2 getTs_dr_1_rangeStartDateTime() {
		return ts_dr_1_rangeStartDateTime;
	}
	public void setTs_dr_1_rangeStartDateTime(TS_v2 ts_dr_1_rangeStartDateTime) {
		this.ts_dr_1_rangeStartDateTime = ts_dr_1_rangeStartDateTime;
	}
	public TS_v2 getTs_dr_2_rangeEndDateTime() {
		return ts_dr_2_rangeEndDateTime;
	}
	public void setTs_dr_2_rangeEndDateTime(TS_v2 ts_dr_2_rangeEndDateTime) {
		this.ts_dr_2_rangeEndDateTime = ts_dr_2_rangeEndDateTime;
	}
	@Override
	public String toString() {
		return "DR_v2 [ts_dr_1_rangeStartDateTime=" + ts_dr_1_rangeStartDateTime + ", ts_dr_2_rangeEndDateTime="
				+ ts_dr_2_rangeEndDateTime + "]";
	}
	
}