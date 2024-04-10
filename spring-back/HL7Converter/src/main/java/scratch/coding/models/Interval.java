package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Interval implements Serializable {
	@JsonProperty("explicitTimeInterval")
	private String explicitTimeInterval;
	@JsonProperty("repeatPattern")
	private String repeatPattern;
	public Interval(String explicitTimeInterval, String repeatPattern) {
		super();
		this.explicitTimeInterval = explicitTimeInterval;
		this.repeatPattern = repeatPattern;
	}
	public Interval() {
		super();
	}
	@JsonProperty("explicitTimeInterval")
	public String getExplicitTimeInterval() {
		return explicitTimeInterval;
	}
	@JsonProperty("explicitTimeInterval")
	public void setExplicitTimeInterval(String explicitTimeInterval) {
		this.explicitTimeInterval = explicitTimeInterval;
	}
	@JsonProperty("repeatPattern")
	public String getRepeatPattern() {
		return repeatPattern;
	}
	@JsonProperty("repeatPattern")
	public void setRepeatPattern(String repeatPattern) {
		this.repeatPattern = repeatPattern;
	}
}
