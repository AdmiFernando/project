package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class MSG_v25 {
			
	@JsonProperty("msg_1_messageCode")
	private String msg_1_messageCode;
	@JsonProperty("msg_2_triggerEvent")
	private String msg_2_triggerEvent;
	@JsonProperty("msg_3_messageStructure")
	private String msg_3_messageStructure;
	public MSG_v25() {
		super();
	}
	public MSG_v25(String msg_1_messageCode, String msg_2_triggerEvent, String msg_3_messageStructure) {
		super();
		this.msg_1_messageCode = msg_1_messageCode;
		this.msg_2_triggerEvent = msg_2_triggerEvent;
		this.msg_3_messageStructure = msg_3_messageStructure;
	}
	public String getMsg_1_messageCode() {
		return msg_1_messageCode;
	}
	public void setMsg_1_messageCode(String msg_1_messageCode) {
		this.msg_1_messageCode = msg_1_messageCode;
	}
	public String getMsg_2_triggerEvent() {
		return msg_2_triggerEvent;
	}
	public void setMsg_2_triggerEvent(String msg_2_triggerEvent) {
		this.msg_2_triggerEvent = msg_2_triggerEvent;
	}
	public String getMsg_3_messageStructure() {
		return msg_3_messageStructure;
	}
	public void setMsg_3_messageStructure(String msg_3_messageStructure) {
		this.msg_3_messageStructure = msg_3_messageStructure;
	}
	@Override
	public String toString() {
		return "MSG_v25 [msg_1_messageCode=" + msg_1_messageCode + ", msg_2_triggerEvent=" + msg_2_triggerEvent
				+ ", msg_3_messageStructure=" + msg_3_messageStructure + "]";
	} 
	
}
