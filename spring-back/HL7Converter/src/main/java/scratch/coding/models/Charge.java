package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Charge implements Serializable {
	@JsonProperty("chargeCode")
	private IdentifierAndCoding chargeCode;
	@JsonProperty("denomication")
	private String denomication;
	@JsonProperty("quantity")
	private String quantity;
	public Charge(IdentifierAndCoding chargeCode, String denomication, String quantity) {
		super();
		this.chargeCode = chargeCode;
		this.denomication = denomication;
		this.quantity = quantity;
	}
	public Charge() {
		super();
	}
	@JsonProperty("chargeCode")
	public IdentifierAndCoding getChargeCode() {
		return chargeCode;
	}
	@JsonProperty("chargeCode")
	public void setChargeCode(IdentifierAndCoding chargeCode) {
		this.chargeCode = chargeCode;
	}
	@JsonProperty("denomication")
	public String getDenomication() {
		return denomication;
	}
	@JsonProperty("denomication")
	public void setDenomication(String denomication) {
		this.denomication = denomication;
	}
	@JsonProperty("quantity")
	public String getQuantity() {
		return quantity;
	}
	@JsonProperty("quantity")
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Charge [chargeCode=" + chargeCode + ", denomication=" + denomication + ", quantity=" + quantity + "]";
	}
}
