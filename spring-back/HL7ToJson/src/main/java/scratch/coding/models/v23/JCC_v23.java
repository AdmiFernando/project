package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JCC_v23 {
	@JsonProperty("jcc_1_jobCode")
	private String jcc_1_jobCode;
	@JsonProperty("jcc_2_jobClass")
	private String jcc_2_jobClass;
	public JCC_v23(String jcc_1_jobCode, String jcc_2_jobClass) {
		super();
		this.jcc_1_jobCode = jcc_1_jobCode;
		this.jcc_2_jobClass = jcc_2_jobClass;
	}
	public JCC_v23() {
		super();
		this.jcc_1_jobCode = "";
		this.jcc_2_jobClass = "";
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
	@Override
	public String toString() {
		return "JCC_v2 [jcc_1_jobCode=" + jcc_1_jobCode + ", jcc_2_jobClass=" + jcc_2_jobClass + "]";
	}
}
