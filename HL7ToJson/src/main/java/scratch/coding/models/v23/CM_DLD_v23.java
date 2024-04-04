package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_DLD_v23 {
	@JsonProperty("cm_dld_1_dischargeLocation")
	private String cm_dld_1_dischargeLocation;
	@JsonProperty("ts_cm_dld_2_effectiveDate")
	private TS_v2 ts_cm_dld_2_effectiveDate;
	public CM_DLD_v23(String cm_dld_1_dischargeLocation, TS_v2 ts_cm_dld_2_effectiveDate) {
		super();
		this.cm_dld_1_dischargeLocation = cm_dld_1_dischargeLocation;
		this.ts_cm_dld_2_effectiveDate = ts_cm_dld_2_effectiveDate;
	}
	public CM_DLD_v23() {
		super();
		this.cm_dld_1_dischargeLocation = "";
		this.ts_cm_dld_2_effectiveDate = new TS_v2();
	}
	public String getCm_dld_1_dischargeLocation() {
		return cm_dld_1_dischargeLocation;
	}
	public void setCm_dld_1_dischargeLocation(String cm_dld_1_dischargeLocation) {
		this.cm_dld_1_dischargeLocation = cm_dld_1_dischargeLocation;
	}
	public TS_v2 getTs_cm_dld_2_effectiveDate() {
		return ts_cm_dld_2_effectiveDate;
	}
	public void setTs_cm_dld_2_effectiveDate(TS_v2 ts_cm_dld_2_effectiveDate) {
		this.ts_cm_dld_2_effectiveDate = ts_cm_dld_2_effectiveDate;
	}
	@Override
	public String toString() {
		return "CM_DLD_v23 [cm_dld_1_dischargeLocation=" + cm_dld_1_dischargeLocation + ", ts_cm_dld_2_effectiveDate="
				+ ts_cm_dld_2_effectiveDate + "]";
	}
}
