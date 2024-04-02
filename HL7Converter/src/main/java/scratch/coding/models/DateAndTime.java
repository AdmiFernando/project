package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class DateAndTime implements Serializable {
	@JsonProperty("name")
	private String name;
	@JsonProperty("timeOfAnEvent")
	private String timeOfAnEvent;
	@JsonProperty("degreeOfPrecision")
	private String degreeOfPrecision;
	public DateAndTime(String name, String timeOfAnEvent, String degreeOfPrecision) {
		super();
		this.name = name;
		this.timeOfAnEvent = timeOfAnEvent;
		this.degreeOfPrecision = degreeOfPrecision;
	}
	public DateAndTime() {
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
	@JsonProperty("timeOfAnEvent")
	public String getTimeOfAnEvent() {
		return timeOfAnEvent;
	}
	@JsonProperty("timeOfAnEvent")
	public void setTimeOfAnEvent(String timeOfAnEvent) {
		this.timeOfAnEvent = timeOfAnEvent;
	}
	@JsonProperty("degreeOfPrecision")
	public String getDegreeOfPrecision() {
		return degreeOfPrecision;
	}
	@JsonProperty("degreeOfPrecision")
	public void setDegreeOfPrecision(String degreeOfPrecision) {
		this.degreeOfPrecision = degreeOfPrecision;
	}
	@Override
	public String toString() {
		return "DateAndTime [name=" + name + ", timeOfAnEvent=" + timeOfAnEvent + ", degreeOfPrecision="
				+ degreeOfPrecision + "]";
	}
}
