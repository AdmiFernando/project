package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_AUI_v23{
	@JsonProperty("cm_aui_1_authorizationNumber")
	private String cm_aui_1_authorizationNumber;
	@JsonProperty("cm_aui_2_date")
	private TS_v2 cm_aui_2_date;
	@JsonProperty("cm_aui_3_source")
	private String cm_aui_3_source;
	public CM_AUI_v23(String cm_aui_1_authorizationNumber, TS_v2 cm_aui_2_date, String cm_aui_3_source) {
		super();
		this.cm_aui_1_authorizationNumber = cm_aui_1_authorizationNumber;
		this.cm_aui_2_date = cm_aui_2_date;
		this.cm_aui_3_source = cm_aui_3_source;
	}
	public CM_AUI_v23() {
		super();
		this.cm_aui_1_authorizationNumber = "";
		this.cm_aui_2_date = new TS_v2();
		this.cm_aui_3_source = "";
	}
	public String getCm_aui_1_authorizationNumber() {
		return cm_aui_1_authorizationNumber;
	}
	public void setCm_aui_1_authorizationNumber(String cm_aui_1_authorizationNumber) {
		this.cm_aui_1_authorizationNumber = cm_aui_1_authorizationNumber;
	}
	public TS_v2 getCm_aui_2_date() {
		return cm_aui_2_date;
	}
	public void setCm_aui_2_date(TS_v2 cm_aui_2_date) {
		this.cm_aui_2_date = cm_aui_2_date;
	}
	public String getCm_aui_3_source() {
		return cm_aui_3_source;
	}
	public void setCm_aui_3_source(String cm_aui_3_source) {
		this.cm_aui_3_source = cm_aui_3_source;
	}
	
}
