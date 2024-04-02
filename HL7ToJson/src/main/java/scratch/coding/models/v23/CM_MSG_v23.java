package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_MSG_v23 {
	
	@JsonProperty("cm_msg_1_messageType")
	private String cm_msg_1_messageType;
	@JsonProperty("cm_msg_2_triggerEvent")
	private String cm_msg_2_triggerEvent;
	public CM_MSG_v23(String cm_msg_1_messageType, String cm_msg_2_triggerEvent) {
		super();
		this.cm_msg_1_messageType = cm_msg_1_messageType;
		this.cm_msg_2_triggerEvent = cm_msg_2_triggerEvent;
	}
	public CM_MSG_v23() {
		super();
	}
	public String getCm_msg_1_messageType() {
		return cm_msg_1_messageType;
	}
	public void setCm_msg_1_messageType(String cm_msg_1_messageType) {
		this.cm_msg_1_messageType = cm_msg_1_messageType;
	}
	public String getCm_msg_2_triggerEvent() {
		return cm_msg_2_triggerEvent;
	}
	public void setCm_msg_2_triggerEvent(String cm_msg_2_triggerEvent) {
		this.cm_msg_2_triggerEvent = cm_msg_2_triggerEvent;
	}
	@Override
	public String toString() {
		return "CM_MSG_v23 [cm_msg_1_messageType=" + cm_msg_1_messageType + ", cm_msg_2_triggerEvent="
				+ cm_msg_2_triggerEvent + "]";
	}


}
