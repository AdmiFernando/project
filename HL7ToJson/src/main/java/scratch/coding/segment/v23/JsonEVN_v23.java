package scratch.coding.segment.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonEVN_v23 {

	@JsonProperty("evn_1_eventTypeCode")
	private String evn_1_eventTypeCode;
	@JsonProperty("ts_evn_2_recordedDateTime")
	private TS_v2 ts_evn_2_recordedDateTime;
	@JsonProperty("ts_evn_3_dateTimePlannedEvent")
	private TS_v2 ts_evn_3_dateTimePlannedEvent;
	@JsonProperty("evn_4_eventReasonCode")
	private String evn_4_eventReasonCode;
	@JsonProperty("cn_evn_5_operatorId")
	private CN_v23 cn_evn_5_operatorId;
	@JsonProperty("ts_evn_6_eventOccurred")
	private TS_v2 ts_evn_6_eventOccurred;
	private JsonEVN_v23(EVNBuilder builder) {
		super();
		this.evn_1_eventTypeCode = builder.evn_1_eventTypeCode;
		this.ts_evn_2_recordedDateTime = builder.ts_evn_2_recordedDateTime;
		this.ts_evn_3_dateTimePlannedEvent = builder.ts_evn_3_dateTimePlannedEvent;
		this.evn_4_eventReasonCode = builder.evn_4_eventReasonCode;
		this.cn_evn_5_operatorId = builder.cn_evn_5_operatorId;
		this.ts_evn_6_eventOccurred = builder.ts_evn_6_eventOccurred;
	}
	
	public JsonEVN_v23(String evn_1_eventTypeCode, TS_v2 ts_evn_2_recordedDateTime, TS_v2 ts_evn_3_dateTimePlannedEvent,
			String evn_4_eventReasonCode, CN_v23 cn_evn_5_operatorId, TS_v2 ts_evn_6_eventOccurred) {
		super();
		this.evn_1_eventTypeCode = evn_1_eventTypeCode;
		this.ts_evn_2_recordedDateTime = ts_evn_2_recordedDateTime;
		this.ts_evn_3_dateTimePlannedEvent = ts_evn_3_dateTimePlannedEvent;
		this.evn_4_eventReasonCode = evn_4_eventReasonCode;
		this.cn_evn_5_operatorId = cn_evn_5_operatorId;
		this.ts_evn_6_eventOccurred = ts_evn_6_eventOccurred;
	}
	public JsonEVN_v23() {
		super();
		this.evn_1_eventTypeCode = "";
		this.ts_evn_2_recordedDateTime = new TS_v2();
		this.ts_evn_3_dateTimePlannedEvent = new TS_v2();
		this.evn_4_eventReasonCode = "";
		this.cn_evn_5_operatorId = new CN_v23();
		this.ts_evn_6_eventOccurred = new TS_v2();
	}
	public static class EVNBuilder{
		private String evn_1_eventTypeCode;
		private TS_v2 ts_evn_2_recordedDateTime;
		private TS_v2 ts_evn_3_dateTimePlannedEvent;
		private String evn_4_eventReasonCode;
		private CN_v23 cn_evn_5_operatorId;
		private TS_v2 ts_evn_6_eventOccurred;
		public EVNBuilder(TS_v2 ts_evn_2_recordedDateTime) {
			super();
			this.evn_1_eventTypeCode = "";
			this.ts_evn_2_recordedDateTime = ts_evn_2_recordedDateTime;
			this.ts_evn_3_dateTimePlannedEvent = new TS_v2();
			this.evn_4_eventReasonCode = "";
			this.cn_evn_5_operatorId = new CN_v23();
			this.ts_evn_6_eventOccurred = new TS_v2();
		}
		public EVNBuilder evn_1_eventTypeCode(String evn_1_eventTypeCode) {
			this.evn_1_eventTypeCode = evn_1_eventTypeCode;
			return this;
		}
		public EVNBuilder ts_evn_2_recordedDateTime(TS_v2 ts_evn_2_recordedDateTime) {
			this.ts_evn_2_recordedDateTime = ts_evn_2_recordedDateTime;
			return this;
		}
		public EVNBuilder ts_evn_3_dateTimePlannedEvent(TS_v2 ts_evn_3_dateTimePlannedEvent) {
			this.ts_evn_3_dateTimePlannedEvent = ts_evn_3_dateTimePlannedEvent;
			return this;
		}
		public EVNBuilder evn_4_eventReasonCode(String evn_4_eventReasonCode) {
			this.evn_4_eventReasonCode = evn_4_eventReasonCode;
			return this;
		}
		public EVNBuilder cn_evn_5_operatorId(CN_v23 cn_evn_5_operatorId) {
			this.cn_evn_5_operatorId = cn_evn_5_operatorId;
			return this;
		}
		public EVNBuilder ts_evn_6_eventOccurred(TS_v2 ts_evn_6_eventOccurred) {
			this.ts_evn_6_eventOccurred = ts_evn_6_eventOccurred;
			return this;
		}
		public JsonEVN_v23 build() {
			return new JsonEVN_v23(this);
		}
	}
	public String getEvn_1_eventTypeCode() {
		return evn_1_eventTypeCode;
	}
	public TS_v2 getTs_evn_2_recordedDateTime() {
		return ts_evn_2_recordedDateTime;
	}
	public TS_v2 getTs_evn_3_dateTimePlannedEvent() {
		return ts_evn_3_dateTimePlannedEvent;
	}
	public String getEvn_4_eventReasonCode() {
		return evn_4_eventReasonCode;
	}
	public CN_v23 getCn_evn_5_operatorId() {
		return cn_evn_5_operatorId;
	}
	public TS_v2 getTs_evn_6_eventOccurred() {
		return ts_evn_6_eventOccurred;
	}
	@Override
	public String toString() {
		return "JsonEVN_v23 [evn_1_eventTypeCode=" + evn_1_eventTypeCode + ", ts_evn_2_recordedDateTime="
				+ ts_evn_2_recordedDateTime + ", ts_evn_3_dateTimePlannedEvent=" + ts_evn_3_dateTimePlannedEvent
				+ ", evn_4_eventReasonCode=" + evn_4_eventReasonCode + ", xcn_evn_5_operatorId=" + cn_evn_5_operatorId
				+ ", ts_evn_6_eventOccurred=" + ts_evn_6_eventOccurred + "]";
	}
	
}
