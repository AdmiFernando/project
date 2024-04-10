package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.EI_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_EIP_v23 {
	
	@JsonProperty("ei_cm_eip_1_parentsPlacerOrderNumber")
	private EI_v2 ei_cm_eip_1_parentsPlacerOrderNumber;
	@JsonProperty("ei_cm_eip_2_parentsFillerOrderNumber")
	private EI_v2 ei_cm_eip_2_parentsFillerOrderNumber;
	public CM_EIP_v23(EI_v2 ei_cm_eip_1_parentsPlacerOrderNumber, EI_v2 ei_cm_eip_2_parentsFillerOrderNumber) {
		super();
		this.ei_cm_eip_1_parentsPlacerOrderNumber = ei_cm_eip_1_parentsPlacerOrderNumber;
		this.ei_cm_eip_2_parentsFillerOrderNumber = ei_cm_eip_2_parentsFillerOrderNumber;
	}
	public CM_EIP_v23() {
		super();
		this.ei_cm_eip_1_parentsPlacerOrderNumber = new EI_v2();
		this.ei_cm_eip_2_parentsFillerOrderNumber = new EI_v2();
	}
	public EI_v2 getEi_cm_eip_1_parentsPlacerOrderNumber() {
		return ei_cm_eip_1_parentsPlacerOrderNumber;
	}
	public void setEi_cm_eip_1_parentsPlacerOrderNumber(EI_v2 ei_cm_eip_1_parentsPlacerOrderNumber) {
		this.ei_cm_eip_1_parentsPlacerOrderNumber = ei_cm_eip_1_parentsPlacerOrderNumber;
	}
	public EI_v2 getEi_cm_eip_2_parentsFillerOrderNumber() {
		return ei_cm_eip_2_parentsFillerOrderNumber;
	}
	public void setEi_cm_eip_2_parentsFillerOrderNumber(EI_v2 ei_cm_eip_2_parentsFillerOrderNumber) {
		this.ei_cm_eip_2_parentsFillerOrderNumber = ei_cm_eip_2_parentsFillerOrderNumber;
	}
	@Override
	public String toString() {
		return "CM_EIP_Parent [ei_cm_eip_1_parentsPlacerOrderNumber=" + ei_cm_eip_1_parentsPlacerOrderNumber
				+ ", ei_cm_eip_2_parentsFillerOrderNumber=" + ei_cm_eip_2_parentsFillerOrderNumber + "]";
	}
}
