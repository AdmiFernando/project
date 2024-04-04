package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class MessageType implements Serializable {
	@JsonProperty("name")
	private String name;
	@JsonProperty("messageType")
	private String messageType;
	@JsonProperty("triggerEvent")
	private String triggerEvent;
	public MessageType(String name, String messageType, String triggerEvent) {
		super();
		this.name = name;
		this.messageType = messageType;
		this.triggerEvent = triggerEvent;
	}
	public MessageType() {
		super();
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("messageType")
	public String getMessageType() {
		return messageType;
	}
	@JsonProperty("messageType")
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	@JsonProperty("triggerEvent")
	public String getTriggerEvent() {
		return triggerEvent;
	}
	@JsonProperty("triggerEvent")
	public void setTriggerEvent(String triggerEvent) {
		this.triggerEvent = triggerEvent;
	}
	@Override
	public String toString() {
		return "messageType [name=" + name + ", messageType=" + messageType + ", triggerEvent=" + triggerEvent + "]";
	}
}
