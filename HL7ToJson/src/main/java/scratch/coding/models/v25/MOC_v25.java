package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.MO_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class MOC_v25 {
			
	@JsonProperty("moc_1_monetaryAmount")
	private MO_v2 moc_1_monetaryAmount;
	@JsonProperty("moc_2_chargeCode")
	private CE_v2 moc_2_chargeCode;
	public MOC_v25() {
		super();
		this.moc_1_monetaryAmount = new MO_v2();
		this.moc_2_chargeCode = new CE_v2();
	}
	public MOC_v25(MO_v2 moc_1_monetaryAmount, CE_v2 moc_2_chargeCode) {
		super();
		this.moc_1_monetaryAmount = moc_1_monetaryAmount;
		this.moc_2_chargeCode = moc_2_chargeCode;
	}
	public MO_v2 getMoc_1_monetaryAmount() {
		return moc_1_monetaryAmount;
	}
	public void setMoc_1_monetaryAmount(MO_v2 moc_1_monetaryAmount) {
		this.moc_1_monetaryAmount = moc_1_monetaryAmount;
	}
	public CE_v2 getMoc_2_chargeCode() {
		return moc_2_chargeCode;
	}
	public void setMoc_2_chargeCode(CE_v2 moc_2_chargeCode) {
		this.moc_2_chargeCode = moc_2_chargeCode;
	}
	@Override
	public String toString() {
		return "MOC_v25 [moc_1_monetaryAmount=" + moc_1_monetaryAmount + ", moc_2_chargeCode=" + moc_2_chargeCode + "]";
	} 
}
