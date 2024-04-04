package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class VolumeCE implements Serializable {
	@JsonProperty("units")
	private IdentifierAndCoding units;
	@JsonProperty("quantity")
	private String quantity;
	public VolumeCE(IdentifierAndCoding units, String quantity) {
		super();
		this.units = units;
		this.quantity = quantity;
	}
	public VolumeCE() {
		super();
	}
	@JsonProperty("units")
	public IdentifierAndCoding getUnits() {
		return units;
	}
	@JsonProperty("units")
	public void setUnits(IdentifierAndCoding units) {
		this.units = units;
	}
	@JsonProperty("quantity")
	public String getQuantity() {
		return quantity;
	}
	@JsonProperty("quantity")
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
