package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class TS_v2 {
		
	@JsonProperty("ts_1_timeOfAnEvent")
	private String ts_1_timeOfAnEvent;
	@JsonProperty("ts_2_degreeOfPrecision")
	private String ts_2_degreeOfPrecision;
	public TS_v2() {
		super();
	}
	public TS_v2(String ts_1_timeOfAnEvent, String ts_2_degreeOfPrecision) {
		super();
		this.ts_1_timeOfAnEvent = ts_1_timeOfAnEvent;
		this.ts_2_degreeOfPrecision = ts_2_degreeOfPrecision;
	}
	public String getTs_1_time() {
		return ts_1_timeOfAnEvent;
	}
	public void setTs_1_time(String ts_1_timeOfAnEvent) {
		this.ts_1_timeOfAnEvent = ts_1_timeOfAnEvent;
	}
	public String getTs_2_degreeOfPrecision() {
		return ts_2_degreeOfPrecision;
	}
	public void setTs_2_degreeOfPrecision(String ts_2_degreeOfPrecision) {
		this.ts_2_degreeOfPrecision = ts_2_degreeOfPrecision;
	}
	@Override
	public String toString() {
		return "TS_v25 [ts_1_timeOfAnEvent=" + ts_1_timeOfAnEvent + ", ts_2_degreeOfPrecision=" + ts_2_degreeOfPrecision + "]";
	}
	
}
