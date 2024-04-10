package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CQ_v23  {
	@JsonProperty("cq_1_Quantity")
	private String cq_1_Quantity;
	@JsonProperty("cq_2_Units")
	private CE_v2 cq_2_Units;
	public CQ_v23(String cq_1_Quantity, CE_v2 cq_2_Units) {
		super();
		this.cq_1_Quantity = cq_1_Quantity;
		this.cq_2_Units = cq_2_Units;
	}
	public CQ_v23() {
		super();
		this.cq_1_Quantity = "";
		this.cq_2_Units = new CE_v2();
	}
	public String getCq_1_Quantity() {
		return cq_1_Quantity;
	}
	public void setCq_1_Quantity(String cq_1_Quantity) {
		this.cq_1_Quantity = cq_1_Quantity;
	}
	public CE_v2 getCq_2_Units() {
		return cq_2_Units;
	}
	public void setCq_2_Units(CE_v2 cq_2_Units) {
		this.cq_2_Units = cq_2_Units;
	}
	@Override
	public String toString() {
		return "CQ_Volume [cq_1_Quantity=" + cq_1_Quantity + ", cq_2_Units=" + cq_2_Units + "]";
	}
}
