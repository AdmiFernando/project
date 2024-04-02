package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CP_v2 {
	@JsonProperty("mo_cp_1_price")
	private MO_v2 mo_cp_1_price;
	@JsonProperty("cp_2_priceType")
	private String cp_2_priceType;
	@JsonProperty("cp_3_fromValue")
	private String cp_3_fromValue;
	@JsonProperty("cp_4_toValue")
	private String cp_4_toValue;
	@JsonProperty("cp_5_rangeUnits")
	private CE_v2 cp_5_rangeUnits;
	@JsonProperty("cp_6_rangeType")
	private String cp_6_rangeType;
	public CP_v2(MO_v2 mo_cp_1_price, String cp_2_priceType, String cp_3_fromValue, String cp_4_toValue,
			CE_v2 cp_5_rangeUnits, String cp_6_rangeType) {
		super();
		this.mo_cp_1_price = mo_cp_1_price;
		this.cp_2_priceType = cp_2_priceType;
		this.cp_3_fromValue = cp_3_fromValue;
		this.cp_4_toValue = cp_4_toValue;
		this.cp_5_rangeUnits = cp_5_rangeUnits;
		this.cp_6_rangeType = cp_6_rangeType;
	}
	public CP_v2() {
		super();
		this.mo_cp_1_price = new MO_v2();
		this.cp_2_priceType = "";
		this.cp_3_fromValue = "";
		this.cp_4_toValue = "";
		this.cp_5_rangeUnits = new CE_v2();
		this.cp_6_rangeType = "";
	}
	public MO_v2 getCp_1_price() {
		return mo_cp_1_price;
	}
	public void setCp_1_price(MO_v2 mo_cp_1_price) {
		this.mo_cp_1_price = mo_cp_1_price;
	}
	public String getCp_2_priceType() {
		return cp_2_priceType;
	}
	public void setCp_2_priceType(String cp_2_priceType) {
		this.cp_2_priceType = cp_2_priceType;
	}
	public String getCp_3_fromValue() {
		return cp_3_fromValue;
	}
	public void setCp_3_fromValue(String cp_3_fromValue) {
		this.cp_3_fromValue = cp_3_fromValue;
	}
	public String getCp_4_toValue() {
		return cp_4_toValue;
	}
	public void setCp_4_toValue(String cp_4_toValue) {
		this.cp_4_toValue = cp_4_toValue;
	}
	public CE_v2 getCp_5_rangeUnits() {
		return cp_5_rangeUnits;
	}
	public void setCp_5_rangeUnits(CE_v2 cp_5_rangeUnits) {
		this.cp_5_rangeUnits = cp_5_rangeUnits;
	}
	public String getCp_6_rangeType() {
		return cp_6_rangeType;
	}
	public void setCp_6_rangeType(String cp_6_rangeType) {
		this.cp_6_rangeType = cp_6_rangeType;
	}
	@Override
	public String toString() {
		return "CP_v2 [mo_cp_1_price=" + mo_cp_1_price + ", cp_2_priceType=" + cp_2_priceType + ", cp_3_fromValue="
				+ cp_3_fromValue + ", cp_4_toValue=" + cp_4_toValue + ", cp_5_rangeUnits=" + cp_5_rangeUnits
				+ ", cp_6_rangeType=" + cp_6_rangeType + "]";
	}
}
