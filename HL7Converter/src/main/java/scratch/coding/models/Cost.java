package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Cost implements Serializable {
	@JsonProperty("fromValue")
	private String fromValue;
	@JsonProperty("price")
	private Charge price;
	@JsonProperty("priceType")
	private String priceType;
	@JsonProperty("rangeType")
	private String rangeType;
	@JsonProperty("rangeUnits")
	private String rangeUnits;
	@JsonProperty("toValue")
	private String toValue;

	public Cost(String fromValue, Charge price, String priceType, String rangeType, String rangeUnits, String toValue) {
		super();
		this.fromValue = fromValue;
		this.price = price;
		this.priceType = priceType;
		this.rangeType = rangeType;
		this.rangeUnits = rangeUnits;
		this.toValue = toValue;
	}
	public Cost() {
		super();
	}
	@JsonProperty("fromValue")
	public String getFromValue() {
		return fromValue;
	}
	@JsonProperty("fromValue")
	public void setFromValue(String fromValue) {
		this.fromValue = fromValue;
	}
	@JsonProperty("price")
	public Charge getPrice() {
		return price;
	}
	@JsonProperty("price")
	public void setPrice(Charge price) {
		this.price = price;
	}
	@JsonProperty("priceType")
	public String getPriceType() {
		return priceType;
	}
	@JsonProperty("priceType")
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	@JsonProperty("rangeType")
	public String getRangeType() {
		return rangeType;
	}
	@JsonProperty("rangeType")
	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}
	@JsonProperty("rangeUnits")
	public String getRangeUnits() {
		return rangeUnits;
	}
	@JsonProperty("rangeUnits")
	public void setRangeUnits(String rangeUnits) {
		this.rangeUnits = rangeUnits;
	}
	@JsonProperty("toValue")
	public String getToValue() {
		return toValue;
	}
	@JsonProperty("toValue")
	public void setToValue(String toValue) {
		this.toValue = toValue;
	}
	@Override
	public String toString() {
		return "Cost [fromValue=" + fromValue + ", price=" + price + ", priceType=" + priceType + ", rangeType="
				+ rangeType + ", rangeUnits=" + rangeUnits + ", toValue=" + toValue + "]";
	}
}
