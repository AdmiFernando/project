package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CNE_v25 {
			
	@JsonProperty("cne_1_identifier")
	private String cne_1_identifier;
	@JsonProperty("cne_2_text")
	private String cne_2_text;
	@JsonProperty("cne_3_nameOfCodingSystem")
	private String cne_3_nameOfCodingSystem;
	@JsonProperty("cne_4_alternateIdentifier")
	private String cne_4_alternateIdentifier;
	@JsonProperty("cne_5_alternateText")
	private String cne_5_alternateText;
	@JsonProperty("cne_6_nameOfAlternateCodingSystem")
	private String cne_6_nameOfAlternateCodingSystem;
	@JsonProperty("cne_7_codingSystemVersionId")
	private String cne_7_codingSystemVersionId;
	@JsonProperty("cne_8_alternateCodingSystemVersionId")
	private String cne_8_alternateCodingSystemVersionId;
	@JsonProperty("cne_9_originalText")
	private String cne_9_originalText;
	public CNE_v25(String cne_1_identifier, String cne_2_text, String cne_3_nameOfCodingSystem,
			String cne_4_alternateIdentifier, String cne_5_alternateText, String cne_6_nameOfAlternateCodingSystem,
			String cne_7_codingSystemVersionId, String cne_8_alternateCodingSystemVersionId,
			String cne_9_originalText) {
		super();
		this.cne_1_identifier = cne_1_identifier;
		this.cne_2_text = cne_2_text;
		this.cne_3_nameOfCodingSystem = cne_3_nameOfCodingSystem;
		this.cne_4_alternateIdentifier = cne_4_alternateIdentifier;
		this.cne_5_alternateText = cne_5_alternateText;
		this.cne_6_nameOfAlternateCodingSystem = cne_6_nameOfAlternateCodingSystem;
		this.cne_7_codingSystemVersionId = cne_7_codingSystemVersionId;
		this.cne_8_alternateCodingSystemVersionId = cne_8_alternateCodingSystemVersionId;
		this.cne_9_originalText = cne_9_originalText;
	} 
	public CNE_v25() {
		super();
		this.cne_1_identifier = "";
		this.cne_2_text = "";
		this.cne_3_nameOfCodingSystem = "";
		this.cne_4_alternateIdentifier = "";
		this.cne_5_alternateText = "";
		this.cne_6_nameOfAlternateCodingSystem = "";
		this.cne_7_codingSystemVersionId = "";
		this.cne_8_alternateCodingSystemVersionId = "";
		this.cne_9_originalText = "";
	}
	public String getCne_1_identifier() {
		return cne_1_identifier;
	}
	public void setCne_1_identifier(String cne_1_identifier) {
		this.cne_1_identifier = cne_1_identifier;
	}
	public String getCne_2_text() {
		return cne_2_text;
	}
	public void setCne_2_text(String cne_2_text) {
		this.cne_2_text = cne_2_text;
	}
	public String getCne_3_nameOfCodingSystem() {
		return cne_3_nameOfCodingSystem;
	}
	public void setCne_3_nameOfCodingSystem(String cne_3_nameOfCodingSystem) {
		this.cne_3_nameOfCodingSystem = cne_3_nameOfCodingSystem;
	}
	public String getCne_4_alternateIdentifier() {
		return cne_4_alternateIdentifier;
	}
	public void setCne_4_alternateIdentifier(String cne_4_alternateIdentifier) {
		this.cne_4_alternateIdentifier = cne_4_alternateIdentifier;
	}
	public String getCne_5_alternateText() {
		return cne_5_alternateText;
	}
	public void setCne_5_alternateText(String cne_5_alternateText) {
		this.cne_5_alternateText = cne_5_alternateText;
	}
	public String getCne_6_nameOfAlternateCodingSystem() {
		return cne_6_nameOfAlternateCodingSystem;
	}
	public void setCne_6_nameOfAlternateCodingSystem(String cne_6_nameOfAlternateCodingSystem) {
		this.cne_6_nameOfAlternateCodingSystem = cne_6_nameOfAlternateCodingSystem;
	}
	public String getCne_7_codingSystemVersionId() {
		return cne_7_codingSystemVersionId;
	}
	public void setCne_7_codingSystemVersionId(String cne_7_codingSystemVersionId) {
		this.cne_7_codingSystemVersionId = cne_7_codingSystemVersionId;
	}
	public String getCne_8_alternateCodingSystemVersionId() {
		return cne_8_alternateCodingSystemVersionId;
	}
	public void setCne_8_alternateCodingSystemVersionId(String cne_8_alternateCodingSystemVersionId) {
		this.cne_8_alternateCodingSystemVersionId = cne_8_alternateCodingSystemVersionId;
	}
	public String getCne_9_originalText() {
		return cne_9_originalText;
	}
	public void setCne_9_originalText(String cne_9_originalText) {
		this.cne_9_originalText = cne_9_originalText;
	}
	@Override
	public String toString() {
		return "CNE_v25 [cne_1_identifier=" + cne_1_identifier + ", cne_2_text=" + cne_2_text
				+ ", cne_3_nameOfCodingSystem=" + cne_3_nameOfCodingSystem + ", cne_4_alternateIdentifier="
				+ cne_4_alternateIdentifier + ", cne_5_alternateText=" + cne_5_alternateText
				+ ", cne_6_nameOfAlternateCodingSystem=" + cne_6_nameOfAlternateCodingSystem
				+ ", cne_7_codingSystemVersionId=" + cne_7_codingSystemVersionId
				+ ", cne_8_alternateCodingSystemVersionId=" + cne_8_alternateCodingSystemVersionId
				+ ", cne_9_originalText=" + cne_9_originalText + "]";
	} 
}
