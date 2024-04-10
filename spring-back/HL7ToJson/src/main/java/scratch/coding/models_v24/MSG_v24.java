package scratch.coding.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class MSG_v24 {

	@JsonProperty("messageType_MSG_1")
	private String messageType_MSG_1;
	@JsonProperty("triggerEvent_MSG_2")
	private String triggerEvent_MSG_2;
	@JsonProperty("messageStructure_MSG_3")
	private String messageStructure_MSG_3;
	public MSG_v24(String messageType_MSG_1, String triggerEvent_MSG_2, String messageStructure_MSG_3) {
		super();
		this.messageType_MSG_1 = messageType_MSG_1;
		this.triggerEvent_MSG_2 = triggerEvent_MSG_2;
		this.messageStructure_MSG_3 = messageStructure_MSG_3;
	}
	public MSG_v24() {
		super();
		this.messageType_MSG_1 = "";
		this.triggerEvent_MSG_2 = "";
		this.messageStructure_MSG_3 = "";
	}
	public String getMessageType_MSG_1() {
		return messageType_MSG_1;
	}
	public void setMessageType_MSG_1(String messageType_MSG_1) {
		this.messageType_MSG_1 = messageType_MSG_1;
	}
	public String getTriggerEvent_MSG_2() {
		return triggerEvent_MSG_2;
	}
	public void setTriggerEvent_MSG_2(String triggerEvent_MSG_2) {
		this.triggerEvent_MSG_2 = triggerEvent_MSG_2;
	}
	public String getMessageStructure_MSG_3() {
		return messageStructure_MSG_3;
	}
	public void setMessageStructure_MSG_3(String messageStructure_MSG_3) {
		this.messageStructure_MSG_3 = messageStructure_MSG_3;
	}
	@Override
	public String toString() {
		return "MSG_v24 [messageType_MSG_1=" + messageType_MSG_1 + ", triggerEvent_MSG_2=" + triggerEvent_MSG_2
				+ ", messageStructure_MSG_3=" + messageStructure_MSG_3 + "]";
	}
	
	 
}
