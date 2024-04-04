package scratch.coding.models_v24;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class DLD_v24 {
	@JsonProperty("dischargeLocation_dld_1")
	private String dischargeLocation_dld_1;
	@JsonProperty("effectiveDate_dld_2")
	private TS_v2 effectiveDate_dld_2;
	public DLD_v24(String dischargeLocation_dld_1, TS_v2 effectiveDate_dld_2) {
		super();
		this.dischargeLocation_dld_1 = dischargeLocation_dld_1;
		this.effectiveDate_dld_2 = effectiveDate_dld_2;
	}
	public DLD_v24() {
		super();
		this.dischargeLocation_dld_1 = "";
		this.effectiveDate_dld_2 = new TS_v2();
	}
	public String getDischargeLocation_dld_1() {
		return dischargeLocation_dld_1;
	}
	public void setDischargeLocation_dld_1(String dischargeLocation_dld_1) {
		this.dischargeLocation_dld_1 = dischargeLocation_dld_1;
	}
	public TS_v2 getEffectiveDate_dld_2() {
		return effectiveDate_dld_2;
	}
	public void setEffectiveDate_dld_2(TS_v2 effectiveDate_dld_2) {
		this.effectiveDate_dld_2 = effectiveDate_dld_2;
	}
	@Override
	public String toString() {
		return "DLD_v24 [dischargeLocation_dld_1=" + dischargeLocation_dld_1 + ", effectiveDate_dld_2="
				+ effectiveDate_dld_2 + "]";
	}
}

