package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class FinancialClass implements Serializable {
	@JsonProperty("effectiveDate")
	private String effectiveDate;
	@JsonProperty("financialClass")
	private String financialClass;
	public FinancialClass(String effectiveDate, String financialClass) {
		super();
		this.effectiveDate = effectiveDate;
		this.financialClass = financialClass;
	}
	public FinancialClass() {
		super();
	}
	@JsonProperty("effectiveDate")
	public String getEffectiveDate() {
		return effectiveDate;
	}
	@JsonProperty("effectiveDate")
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	@JsonProperty("financialClass")
	public String getFinancialClass() {
		return financialClass;
	}
	@JsonProperty("financialClass")
	public void setFinancialClass(String financialClass) {
		this.financialClass = financialClass;
	}
	@Override
	public String toString() {
		return "FinancialClass [effectiveDate=" + effectiveDate + ", financialClass=" + financialClass + "]";
	}
}
