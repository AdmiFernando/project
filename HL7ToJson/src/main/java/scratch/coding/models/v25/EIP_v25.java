package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.EI_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class EIP_v25 {
			
	@JsonProperty("eip_1_placerAssignedIdentifier")
	private EI_v2 eip_1_placerAssignedIdentifier;
	@JsonProperty("eip_2_fillerAssignedIdentifier")
	private EI_v2 eip_2_fillerAssignedIdentifier;
	public EIP_v25(EI_v2 eip_1_placerAssignedIdentifier, EI_v2 eip_2_fillerAssignedIdentifier) {
		super();
		this.eip_1_placerAssignedIdentifier = eip_1_placerAssignedIdentifier;
		this.eip_2_fillerAssignedIdentifier = eip_2_fillerAssignedIdentifier;
	} 
	public EIP_v25() {
		super();
		this.eip_1_placerAssignedIdentifier = new EI_v2();
		this.eip_2_fillerAssignedIdentifier = new EI_v2();
	}
	public EI_v2 getEip_1_placerAssignedIdentifier() {
		return eip_1_placerAssignedIdentifier;
	}
	public void setEip_1_placerAssignedIdentifier(EI_v2 eip_1_placerAssignedIdentifier) {
		this.eip_1_placerAssignedIdentifier = eip_1_placerAssignedIdentifier;
	}
	public EI_v2 getEip_2_fillerAssignedIdentifier() {
		return eip_2_fillerAssignedIdentifier;
	}
	public void setEip_2_fillerAssignedIdentifier(EI_v2 eip_2_fillerAssignedIdentifier) {
		this.eip_2_fillerAssignedIdentifier = eip_2_fillerAssignedIdentifier;
	}
	@Override
	public String toString() {
		return "EIP_v25 [eip_1_placerAssignedIdentifier=" + eip_1_placerAssignedIdentifier
				+ ", eip_2_fillerAssignedIdentifier=" + eip_2_fillerAssignedIdentifier + "]";
	} 
	
}
