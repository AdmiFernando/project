package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JCC_v25 {
	@JsonProperty("jcc_1_jobCode")
	private String jcc_1_jobCode;
	@JsonProperty("jcc_2_jobClass")
	private String jcc_2_jobClass;
	@JsonProperty("jcc_3_jobDescriptionText")
	private String jcc_3_jobDescriptionText;
	public JCC_v25(String jcc_1_jobCode, String jcc_2_jobClass, String jcc_3_jobDescriptionText) {
		super();
		this.jcc_1_jobCode = jcc_1_jobCode;
		this.jcc_2_jobClass = jcc_2_jobClass;
		this.jcc_3_jobDescriptionText = jcc_3_jobDescriptionText;
	}
	public JCC_v25() {
		super();
		this.jcc_1_jobCode = "";
		this.jcc_2_jobClass = "";
		this.jcc_3_jobDescriptionText = "";
	}
	public String getJcc_1_jobCode() {
		return jcc_1_jobCode;
	}
	public void setJcc_1_jobCode(String jcc_1_jobCode) {
		this.jcc_1_jobCode = jcc_1_jobCode;
	}
	public String getJcc_2_jobClass() {
		return jcc_2_jobClass;
	}
	public void setJcc_2_jobClass(String jcc_2_jobClass) {
		this.jcc_2_jobClass = jcc_2_jobClass;
	}
	public String getJcc_3_jobDescriptionText() {
		return jcc_3_jobDescriptionText;
	}
	public void setJcc_3_jobDescriptionText(String jcc_3_jobDescriptionText) {
		this.jcc_3_jobDescriptionText = jcc_3_jobDescriptionText;
	}
	@Override
	public String toString() {
		return "JCC_v25 [jcc_1_jobCode=" + jcc_1_jobCode + ", jcc_2_jobClass=" + jcc_2_jobClass
				+ ", jcc_3_jobDescriptionText=" + jcc_3_jobDescriptionText + "]";
	}
	
}
