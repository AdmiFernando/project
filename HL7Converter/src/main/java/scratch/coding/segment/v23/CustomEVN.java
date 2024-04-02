package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.EVN;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CN_v23;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomEVN implements Serializable {

	
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
	
	private EVN evn;
	
	private CustomEVN(EVN evn) {
		super();
		this.evn =evn;
	}
	public static CustomEVN createEvn1WithTypeAndVersion(EVN evn) throws HL7Exception, IOException {
		return new CustomEVN(evn);
	}
	/**
	 *	@return the evn_1_eventTypeCode
	 */
	
	@JsonProperty("evn_1_eventTypeCode")
	public String getEvn_1_eventTypeCode() {
		return this.evn.getEvn1_EventTypeCode().getValue()==null?"":this.evn.getEvn1_EventTypeCode().getValue();
	}
	/**
	 * @param evn_1_eventTypeCode the evn_1_eventTypeCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("evn_1_eventTypeCode")
	public void setEvn_1_eventTypeCode(String evn_1_eventTypeCode) throws DataTypeException {
		this.evn.getEvn1_EventTypeCode().setValue(evn_1_eventTypeCode);
		this.evn_1_eventTypeCode = evn_1_eventTypeCode;
	}
	/**
	 *	@return the ts_evn_2_recordedDateTime
	 */
	
	@JsonProperty("ts_evn_2_recordedDateTime")
	public TS_v2 getTs_evn_2_recordedDateTime() {
		return CommonService.getTS_v2(this.evn.getEvn2_RecordedDateTime());
	}
	/**
	 * @param ts_evn_2_recordedDateTime the ts_evn_2_recordedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_evn_2_recordedDateTime")
	public void setTs_evn_2_recordedDateTime(TS_v2 ts_evn_2_recordedDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.evn.getEvn2_RecordedDateTime(), ts_evn_2_recordedDateTime);
		this.ts_evn_2_recordedDateTime = ts_evn_2_recordedDateTime;
	}
	/**
	 *	@return the ts_evn_3_dateTimePlannedEvent
	 */
	
	@JsonProperty("ts_evn_3_dateTimePlannedEvent")
	public TS_v2 getTs_evn_3_dateTimePlannedEvent() {
		return CommonService.getTS_v2(this.evn.getEvn3_DateTimePlannedEvent());
	}
	/**
	 * @param ts_evn_3_dateTimePlannedEvent the ts_evn_3_dateTimePlannedEvent to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_evn_3_dateTimePlannedEvent")
	public void setTs_evn_3_dateTimePlannedEvent(TS_v2 ts_evn_3_dateTimePlannedEvent) throws DataTypeException {
		CommonService.setTS_v2(this.evn.getEvn3_DateTimePlannedEvent(), ts_evn_3_dateTimePlannedEvent);
		this.ts_evn_3_dateTimePlannedEvent = ts_evn_3_dateTimePlannedEvent;
	}
	/**
	 *	@return the evn_4_eventReasonCode
	 */
	
	@JsonProperty("evn_4_eventReasonCode")
	public String getEvn_4_eventReasonCode() {
		return this.evn.getEvn4_EventReasonCode().getValue()==null?"":this.evn.getEvn4_EventReasonCode().getValue();
	}
	/**
	 * @param evn_4_eventReasonCode the evn_4_eventReasonCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("evn_4_eventReasonCode")
	public void setEvn_4_eventReasonCode(String evn_4_eventReasonCode) throws DataTypeException {
		this.evn.getEvn4_EventReasonCode().setValue(evn_4_eventReasonCode);
		this.evn_4_eventReasonCode = evn_4_eventReasonCode;
	}
	/**
	 *	@return the cn_evn_5_operatorId
	 */
	
	@JsonProperty("cn_evn_5_operatorId")
	public CN_v23 getCn_evn_5_operatorId() {
		return CommonService.getCN_v23(this.evn.getEvn5_OperatorID());
	}
	/**
	 * @param cn_evn_5_operatorId the cn_evn_5_operatorId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cn_evn_5_operatorId")
	public void setCn_evn_5_operatorId(CN_v23 cn_evn_5_operatorId) throws DataTypeException {
		CommonService.setCN_v23(this.evn.getEvn5_OperatorID(), cn_evn_5_operatorId);
		this.cn_evn_5_operatorId = cn_evn_5_operatorId;
	}
	/**
	 *	@return the ts_evn_6_eventOccurred
	 */
	
	@JsonProperty("ts_evn_6_eventOccurred")
	public TS_v2 getTs_evn_6_eventOccurred() {
		return CommonService.getTS_v2(this.evn.getEvn6_EventOccurred());
	}
	/**
	 * @param ts_evn_6_eventOccurred the ts_evn_6_eventOccurred to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_evn_6_eventOccurred")
	public void setTs_evn_6_eventOccurred(TS_v2 ts_evn_6_eventOccurred) throws DataTypeException {
		CommonService.setTS_v2(this.evn.getEvn6_EventOccurred(), ts_evn_6_eventOccurred);
		this.ts_evn_6_eventOccurred = ts_evn_6_eventOccurred;
	}
	@Override
	public String toString() {
		return "CustomEVN [evn_1_eventTypeCode=" + evn_1_eventTypeCode + ", ts_evn_2_recordedDateTime="
				+ ts_evn_2_recordedDateTime + ", ts_evn_3_dateTimePlannedEvent=" + ts_evn_3_dateTimePlannedEvent
				+ ", evn_4_eventReasonCode=" + evn_4_eventReasonCode + ", cn_evn_5_operatorId=" + cn_evn_5_operatorId
				+ ", ts_evn_6_eventOccurred=" + ts_evn_6_eventOccurred + ", evn=" + evn + "]";
	}
}
