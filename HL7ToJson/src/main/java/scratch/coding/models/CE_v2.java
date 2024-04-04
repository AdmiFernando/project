package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CE_v2 {
						
	@JsonProperty("ce_1_identifier")
	private String ce_1_identifier;
	@JsonProperty("ce_2_text")
	private String ce_2_text;
	@JsonProperty("ce_3_nameOfCodingSystem")
	private String ce_3_nameOfCodingSystem;
	@JsonProperty("ce_4_alternateIdentifier")
	private String ce_4_alternateIdentifier;
	@JsonProperty("ce_5_alternateText")
	private String ce_5_alternateText;
	@JsonProperty("ce_6_nameOfAlternateCodingSystem")
	private String ce_6_nameOfAlternateCodingSystem;
	public CE_v2() {
		super();
	}
	public CE_v2(String ce_1_identifier, String ce_2_text, String ce_3_nameOfCodingSystem,
			String ce_4_alternateIdentifier, String ce_5_alternateText, String ce_6_nameOfAlternateCodingSystem) {
		super();
		this.ce_1_identifier = ce_1_identifier;
		this.ce_2_text = ce_2_text;
		this.ce_3_nameOfCodingSystem = ce_3_nameOfCodingSystem;
		this.ce_4_alternateIdentifier = ce_4_alternateIdentifier;
		this.ce_5_alternateText = ce_5_alternateText;
		this.ce_6_nameOfAlternateCodingSystem = ce_6_nameOfAlternateCodingSystem;
	}
	public String getCe_1_identifier() {
		return ce_1_identifier;
	}
	public void setCe_1_identifier(String ce_1_identifier) {
		this.ce_1_identifier = ce_1_identifier;
	}
	public String getCe_2_text() {
		return ce_2_text;
	}
	public void setCe_2_text(String ce_2_text) {
		this.ce_2_text = ce_2_text;
	}
	public String getCe_3_nameOfCodingSystem() {
		return ce_3_nameOfCodingSystem;
	}
	public void setCe_3_nameOfCodingSystem(String ce_3_nameOfCodingSystem) {
		this.ce_3_nameOfCodingSystem = ce_3_nameOfCodingSystem;
	}
	public String getCe_4_alternateIdentifier() {
		return ce_4_alternateIdentifier;
	}
	public void setCe_4_alternateIdentifier(String ce_4_alternateIdentifier) {
		this.ce_4_alternateIdentifier = ce_4_alternateIdentifier;
	}
	public String getCe_5_alternateText() {
		return ce_5_alternateText;
	}
	public void setCe_5_alternateText(String ce_5_alternateText) {
		this.ce_5_alternateText = ce_5_alternateText;
	}
	public String getCe_6_nameOfAlternateCodingSystem() {
		return ce_6_nameOfAlternateCodingSystem;
	}
	public void setCe_6_nameOfAlternateCodingSystem(String ce_6_nameOfAlternateCodingSystem) {
		this.ce_6_nameOfAlternateCodingSystem = ce_6_nameOfAlternateCodingSystem;
	}
	@Override
	public String toString() {
		return "CE_v25 [ce_1_identifier=" + ce_1_identifier + ", ce_2_text=" + ce_2_text + ", ce_3_nameOfCodingSystem="
				+ ce_3_nameOfCodingSystem + ", ce_4_alternateIdentifier=" + ce_4_alternateIdentifier
				+ ", ce_5_alternateText=" + ce_5_alternateText + ", ce_6_nameOfAlternateCodingSystem="
				+ ce_6_nameOfAlternateCodingSystem + "]";
	}
	
}
