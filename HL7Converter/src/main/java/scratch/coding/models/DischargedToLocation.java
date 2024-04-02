package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class DischargedToLocation implements Serializable {
	@JsonProperty("location")
	private String location;
	@JsonProperty("effectiveDate")
	private DateAndTime effectiveDate;
	public DischargedToLocation(String location, DateAndTime effectiveDate) {
		super();
		this.location = location;
		this.effectiveDate = effectiveDate;
	}
	public DischargedToLocation() {
		super();
	}
	@JsonProperty("location")
	public String getLocation() {
		return location;
	}
	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}
	@JsonProperty("effectiveDate")
	public DateAndTime getEffectiveDate() {
		return effectiveDate;
	}
	@JsonProperty("effectiveDate")
	public void setEffectiveDate(DateAndTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	@Override
	public String toString() {
		return "DischargedToLocation [location=" + location + ", effectiveDate=" + effectiveDate + "]";
	}
}
