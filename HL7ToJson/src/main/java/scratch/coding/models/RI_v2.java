package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class RI_v2 {
	@JsonProperty("ri_1_repeatPattern")
	private String ri_1_repeatPattern;
	@JsonProperty("ri_2_explicitTimeInterval")
	private String ri_2_explicitTimeInterval;
	public RI_v2(String ri_1_repeatPattern, String ri_2_explicitTimeInterval) {
		super();
		this.ri_1_repeatPattern = ri_1_repeatPattern;
		this.ri_2_explicitTimeInterval = ri_2_explicitTimeInterval;
	}
	public RI_v2() {
		super();
		this.ri_1_repeatPattern = "";
		this.ri_2_explicitTimeInterval = "";
	}
	public String getRi_1_repeatPattern() {
		return ri_1_repeatPattern;
	}
	public void setRi_1_repeatPattern(String ri_1_repeatPattern) {
		this.ri_1_repeatPattern = ri_1_repeatPattern;
	}
	public String getRi_2_explicitTimeInterval() {
		return ri_2_explicitTimeInterval;
	}
	public void setRi_2_explicitTimeInterval(String ri_2_explicitTimeInterval) {
		this.ri_2_explicitTimeInterval = ri_2_explicitTimeInterval;
	}
	@Override
	public String toString() {
		return "RI_v25 [ri_1_repeatPattern=" + ri_1_repeatPattern + ", ri_2_explicitTimeInterval="
				+ ri_2_explicitTimeInterval + "]";
	}

}
