package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class FC_v23 {
	@JsonProperty("fc_1_financialClass")
	private String fc_1_financialClass;
	@JsonProperty("ts_fc_2_effectiveDate")
	private TS_v2 ts_fc_2_effectiveDate;
	public FC_v23(String fc_1_financialClass, TS_v2 ts_fc_2_effectiveDate) {
		super();
		this.fc_1_financialClass = fc_1_financialClass;
		this.ts_fc_2_effectiveDate = ts_fc_2_effectiveDate;
	}
	public FC_v23() {
		super();
		this.fc_1_financialClass = "";
		this.ts_fc_2_effectiveDate = new TS_v2();
	}
	public String getFc_1_financialClass() {
		return fc_1_financialClass;
	}
	public void setFc_1_financialClass(String fc_1_financialClass) {
		this.fc_1_financialClass = fc_1_financialClass;
	}
	public TS_v2 getTs_fc_2_effectiveDate() {
		return ts_fc_2_effectiveDate;
	}
	public void setTs_fc_2_effectiveDate(TS_v2 ts_fc_2_effectiveDate) {
		this.ts_fc_2_effectiveDate = ts_fc_2_effectiveDate;
	}
	@Override
	public String toString() {
		return "FC_v23 [fc_1_financialClass=" + fc_1_financialClass + ", ts_fc_2_effectiveDate=" + ts_fc_2_effectiveDate
				+ "]";
	}
}
