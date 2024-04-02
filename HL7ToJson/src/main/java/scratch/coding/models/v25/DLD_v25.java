package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class DLD_v25 {
	@JsonProperty("dld_1_dischargeLocation")
	private String dld_1_dischargeLocation;
	@JsonProperty("dld_2_effectiveDate")
	private TS_v2 dld_2_effectiveDate;
	public DLD_v25(String dld_1_dischargeLocation, TS_v2 dld_2_effectiveDate) {
		super();
		this.dld_1_dischargeLocation = dld_1_dischargeLocation;
		this.dld_2_effectiveDate = dld_2_effectiveDate;
	}
	public DLD_v25() {
		super();
		this.dld_1_dischargeLocation = "";
		this.dld_2_effectiveDate = new TS_v2();
	}
	public String getDld_1_dischargeLocation() {
		return dld_1_dischargeLocation;
	}
	public void setDld_1_dischargeLocation(String dld_1_dischargeLocation) {
		this.dld_1_dischargeLocation = dld_1_dischargeLocation;
	}
	public TS_v2 getDld_2_effectiveDate() {
		return dld_2_effectiveDate;
	}
	public void setDld_2_effectiveDate(TS_v2 dld_2_effectiveDate) {
		this.dld_2_effectiveDate = dld_2_effectiveDate;
	}
	@Override
	public String toString() {
		return "DLD_v25 [dld_1_dischargeLocation=" + dld_1_dischargeLocation + ", dld_2_effectiveDate="
				+ dld_2_effectiveDate + "]";
	}
}
