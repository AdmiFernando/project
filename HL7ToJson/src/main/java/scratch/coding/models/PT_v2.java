package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PT_v2 {
				
	@JsonProperty("pt_1_processingId")
	private String pt_1_processingId;
	@JsonProperty("pt_2_processingMode")
	private String pt_2_processingMode;
	public PT_v2(String pt_1_processingId, String pt_2_processingMode) {
		super();
		this.pt_1_processingId = pt_1_processingId;
		this.pt_2_processingMode = pt_2_processingMode;
	}
	public PT_v2() {
		super();
	}
	public String getPt_1_processingId() {
		return pt_1_processingId;
	}
	public void setPt_1_processingId(String pt_1_processingId) {
		this.pt_1_processingId = pt_1_processingId;
	}
	public String getPt_2_processingMode() {
		return pt_2_processingMode;
	}
	public void setPt_2_processingMode(String pt_2_processingMode) {
		this.pt_2_processingMode = pt_2_processingMode;
	}
	@Override
	public String toString() {
		return "PT_v25 [pt_1_processingId=" + pt_1_processingId + ", pt_2_processingMode=" + pt_2_processingMode + "]";
	}
	
}
