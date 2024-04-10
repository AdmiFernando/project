package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CQ_v25 {
			
	@JsonProperty("cq_1_quantity")
	private String cq_1_quantity;
	@JsonProperty("cq_2_units")
	private CE_v2 cq_2_units;
	public CQ_v25(String cq_1_quantity, CE_v2 cq_2_units) {
		super();
		this.cq_1_quantity = cq_1_quantity;
		this.cq_2_units = cq_2_units;
	}
	public CQ_v25() {
		super();
		this.cq_1_quantity = "";
		this.cq_2_units = new CE_v2();
	}
	public String getCq_1_quantity() {
		return cq_1_quantity;
	}
	public void setCq_1_quantity(String cq_1_quantity) {
		this.cq_1_quantity = cq_1_quantity;
	}
	public CE_v2 getCq_2_units() {
		return cq_2_units;
	}
	public void setCq_2_units(CE_v2 cq_2_units) {
		this.cq_2_units = cq_2_units;
	}
	@Override
	public String toString() {
		return "CQ_v25 [cq_1_quantity=" + cq_1_quantity + ", cq_2_units=" + cq_2_units + "]";
	}
	
}
