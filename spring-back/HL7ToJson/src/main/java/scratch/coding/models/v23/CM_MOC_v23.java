package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_MOC_v23 {
	@JsonProperty("mo_cm_moc_1_dollarAmount")
	private MO_v23 mo_cm_moc_1_dollarAmount;
	@JsonProperty("ce_cm_moc_2_chargeCode")
	private CE_v2 ce_cm_moc_2_chargeCode;
	public CM_MOC_v23(MO_v23 mo_cm_moc_1_dollarAmount, CE_v2 ce_cm_moc_2_chargeCode) {
		super();
		this.mo_cm_moc_1_dollarAmount = mo_cm_moc_1_dollarAmount;
		this.ce_cm_moc_2_chargeCode = ce_cm_moc_2_chargeCode;
	}
	public CM_MOC_v23() {
		super();
		this.mo_cm_moc_1_dollarAmount = new MO_v23();
		this.ce_cm_moc_2_chargeCode = new CE_v2();
	}
	public MO_v23 getMo_cm_moc_1_dollarAmount() {
		return mo_cm_moc_1_dollarAmount;
	}
	public void setMo_cm_moc_1_dollarAmount(MO_v23 mo_cm_moc_1_dollarAmount) {
		this.mo_cm_moc_1_dollarAmount = mo_cm_moc_1_dollarAmount;
	}
	public CE_v2 getCe_cm_moc_2_chargeCode() {
		return ce_cm_moc_2_chargeCode;
	}
	public void setCe_cm_moc_2_chargeCode(CE_v2 ce_cm_moc_2_chargeCode) {
		this.ce_cm_moc_2_chargeCode = ce_cm_moc_2_chargeCode;
	}
	@Override
	public String toString() {
		return "CM_MOC_v23 [mo_cm_moc_1_dollarAmount=" + mo_cm_moc_1_dollarAmount + ", ce_cm_moc_2_chargeCode="
				+ ce_cm_moc_2_chargeCode + "]";
	}
	
}
