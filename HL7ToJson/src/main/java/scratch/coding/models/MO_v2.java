package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class MO_v2 {
				
	@JsonProperty("mo_1_quantity")
	private String mo_1_quantity;
	@JsonProperty("mo_2_denomination")
	private String mo_2_denomination;
	public MO_v2() {
		super();
		this.mo_1_quantity = "";
		this.mo_2_denomination = "";
	}
	public MO_v2(String mo_1_quantity, String mo_2_denomination) {
		super();
		this.mo_1_quantity = mo_1_quantity;
		this.mo_2_denomination = mo_2_denomination;
	}
	public String getMo_1_quantity() {
		return mo_1_quantity;
	}
	public void setMo_1_quantity(String mo_1_quantity) {
		this.mo_1_quantity = mo_1_quantity;
	}
	public String getMo_2_denomination() {
		return mo_2_denomination;
	}
	public void setMo_2_denomination(String mo_2_denomination) {
		this.mo_2_denomination = mo_2_denomination;
	}
	@Override
	public String toString() {
		return "MO_v25 [mo_1_quantity=" + mo_1_quantity + ", mo_2_denomination=" + mo_2_denomination + "]";
	} 
	
}
