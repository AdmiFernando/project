package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class MO_v23 {
	@JsonProperty("mo_1_quantity")
	private String mo_1_quantity;
	@JsonProperty("mo_2_denomication")
	private String mo_2_denomication;
	public MO_v23(String mo_1_quantity, String mo_2_denomication) {
		super();
		this.mo_1_quantity = mo_1_quantity;
		this.mo_2_denomication = mo_2_denomication;
	}
	public MO_v23() {
		super();
		this.mo_1_quantity = "";
		this.mo_2_denomication = "";
	}
	public String getMo_1_quantity() {
		return mo_1_quantity;
	}
	public void setMo_1_quantity(String mo_1_quantity) {
		this.mo_1_quantity = mo_1_quantity;
	}
	public String getMo_2_denomication() {
		return mo_2_denomication;
	}
	public void setMo_2_denomication(String mo_2_denomication) {
		this.mo_2_denomication = mo_2_denomication;
	}
	@Override
	public String toString() {
		return "MO_Charge [mo_1_quantity=" + mo_1_quantity + ", mo_2_denomication=" + mo_2_denomication + "]";
	}
	
}
