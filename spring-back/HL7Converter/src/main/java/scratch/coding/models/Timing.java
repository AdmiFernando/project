package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Timing implements Serializable {
	@JsonProperty("condition")
	private String condition;
	@JsonProperty("conjunction")
	private String conjunction;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("endDateTime")
	private DateAndTime endDateTime;
	@JsonProperty("interval")
	private Interval interval;
	@JsonProperty("orderSequencing")
	private OrderSequencingCM orderSequencing;
	@JsonProperty("priority")
	private String priority;
	@JsonProperty("quantity")
	private VolumeCE quantity;
	@JsonProperty("startDateTime")
	private DateAndTime startDateTime;
	@JsonProperty("text")
	private String text;
	public Timing(String condition, String conjunction, String duration, DateAndTime endDateTime, Interval interval,
			OrderSequencingCM orderSequencing, String priority, VolumeCE quantity, DateAndTime startDateTime, String text) {
		super();
		this.condition = condition;
		this.conjunction = conjunction;
		this.duration = duration;
		this.endDateTime = endDateTime;
		this.interval = interval;
		this.orderSequencing = orderSequencing;
		this.priority = priority;
		this.quantity = quantity;
		this.startDateTime = startDateTime;
		this.text = text;
	}
	public Timing() {
		super();
	}
	@JsonProperty("condition")
	public String getCondition() {
		return condition;
	}
	@JsonProperty("condition")
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@JsonProperty("conjunction")
	public String getConjunction() {
		return conjunction;
	}
	@JsonProperty("conjunction")
	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}
	@JsonProperty("duration")
	public String getDuration() {
		return duration;
	}
	@JsonProperty("duration")
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@JsonProperty("endDateTime")
	public DateAndTime getEndDateTime() {
		return endDateTime;
	}
	@JsonProperty("endDateTime")
	public void setEndDateTime(DateAndTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	@JsonProperty("interval")
	public Interval getInterval() {
		return interval;
	}
	@JsonProperty("interval")
	public void setInterval(Interval interval) {
		this.interval = interval;
	}
	@JsonProperty("orderSequencing")
	public OrderSequencingCM getOrderSequencing() {
		return orderSequencing;
	}
	@JsonProperty("orderSequencing")
	public void setOrderSequencing(OrderSequencingCM orderSequencing) {
		this.orderSequencing = orderSequencing;
	}
	@JsonProperty("priority")
	public String getPriority() {
		return priority;
	}
	@JsonProperty("priority")
	public void setPriority(String priority) {
		this.priority = priority;
	}
	@JsonProperty("quantity")
	public VolumeCE getQuantity() {
		return quantity;
	}
	@JsonProperty("quantity")
	public void setQuantity(VolumeCE quantity) {
		this.quantity = quantity;
	}
	@JsonProperty("startDateTime")
	public DateAndTime getStartDateTime() {
		return startDateTime;
	}
	@JsonProperty("startDateTime")
	public void setStartDateTime(DateAndTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	@JsonProperty("text")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Timing [condition=" + condition + ", conjunction=" + conjunction + ", duration=" + duration
				+ ", endDateTime=" + endDateTime + ", interval=" + interval + ", orderSequencing=" + orderSequencing
				+ ", priority=" + priority + ", quantity=" + quantity + ", startDateTime=" + startDateTime + ", text="
				+ text + "]";
	}
}
