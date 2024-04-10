package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CWE_v25 {
				
	@JsonProperty("cwe_1_identifier")
	private String cwe_1_identifier;
	@JsonProperty("cwe_2_text")
	private String cwe_2_text;
	@JsonProperty("cwe_3_nameOfCodingSystem")
	private String cwe_3_nameOfCodingSystem;
	@JsonProperty("cwe_4_alternateIdentifier")
	private String cwe_4_alternateIdentifier;
	@JsonProperty("cwe_5_alternateText")
	private String cwe_5_alternateText;
	@JsonProperty("cwe_6_nameOfAlternateCodingSystem")
	private String cwe_6_nameOfAlternateCodingSystem;
	@JsonProperty("cwe_7_codingSystemVersionId")
	private String cwe_7_codingSystemVersionId;
	@JsonProperty("cwe_8_alternateCodingSystemVersionId")
	private String cwe_8_alternateCodingSystemVersionId;
	@JsonProperty("cwe_9_originalText")
	private String cwe_9_originalText;
	public CWE_v25(String cwe_1_identifier, String cwe_2_text, String cwe_3_nameOfCodingSystem,
			String cwe_4_alternateIdentifier, String cwe_5_alternateText, String cwe_6_nameOfAlternateCodingSystem,
			String cwe_7_codingSystemVersionId, String cwe_8_alternateCodingSystemVersionId,
			String cwe_9_originalText) {
		super();
		this.cwe_1_identifier = cwe_1_identifier;
		this.cwe_2_text = cwe_2_text;
		this.cwe_3_nameOfCodingSystem = cwe_3_nameOfCodingSystem;
		this.cwe_4_alternateIdentifier = cwe_4_alternateIdentifier;
		this.cwe_5_alternateText = cwe_5_alternateText;
		this.cwe_6_nameOfAlternateCodingSystem = cwe_6_nameOfAlternateCodingSystem;
		this.cwe_7_codingSystemVersionId = cwe_7_codingSystemVersionId;
		this.cwe_8_alternateCodingSystemVersionId = cwe_8_alternateCodingSystemVersionId;
		this.cwe_9_originalText = cwe_9_originalText;
	}
	public CWE_v25() {
		super();
		this.cwe_1_identifier = "";
		this.cwe_2_text = "";
		this.cwe_3_nameOfCodingSystem = "";
		this.cwe_4_alternateIdentifier = "";
		this.cwe_5_alternateText = "";
		this.cwe_6_nameOfAlternateCodingSystem = "";
		this.cwe_7_codingSystemVersionId = "";
		this.cwe_8_alternateCodingSystemVersionId = "";
		this.cwe_9_originalText = "";
	}
	public String getCwe_1_identifier() {
		return cwe_1_identifier;
	}
	public void setCwe_1_identifier(String cwe_1_identifier) {
		this.cwe_1_identifier = cwe_1_identifier;
	}
	public String getCwe_2_text() {
		return cwe_2_text;
	}
	public void setCwe_2_text(String cwe_2_text) {
		this.cwe_2_text = cwe_2_text;
	}
	public String getCwe_3_nameOfCodingSystem() {
		return cwe_3_nameOfCodingSystem;
	}
	public void setCwe_3_nameOfCodingSystem(String cwe_3_nameOfCodingSystem) {
		this.cwe_3_nameOfCodingSystem = cwe_3_nameOfCodingSystem;
	}
	public String getCwe_4_alternateIdentifier() {
		return cwe_4_alternateIdentifier;
	}
	public void setCwe_4_alternateIdentifier(String cwe_4_alternateIdentifier) {
		this.cwe_4_alternateIdentifier = cwe_4_alternateIdentifier;
	}
	public String getCwe_5_alternateText() {
		return cwe_5_alternateText;
	}
	public void setCwe_5_alternateText(String cwe_5_alternateText) {
		this.cwe_5_alternateText = cwe_5_alternateText;
	}
	public String getCwe_6_nameOfAlternateCodingSystem() {
		return cwe_6_nameOfAlternateCodingSystem;
	}
	public void setCwe_6_nameOfAlternateCodingSystem(String cwe_6_nameOfAlternateCodingSystem) {
		this.cwe_6_nameOfAlternateCodingSystem = cwe_6_nameOfAlternateCodingSystem;
	}
	public String getCwe_7_codingSystemVersionId() {
		return cwe_7_codingSystemVersionId;
	}
	public void setCwe_7_codingSystemVersionId(String cwe_7_codingSystemVersionId) {
		this.cwe_7_codingSystemVersionId = cwe_7_codingSystemVersionId;
	}
	public String getCwe_8_alternateCodingSystemVersionId() {
		return cwe_8_alternateCodingSystemVersionId;
	}
	public void setCwe_8_alternateCodingSystemVersionId(String cwe_8_alternateCodingSystemVersionId) {
		this.cwe_8_alternateCodingSystemVersionId = cwe_8_alternateCodingSystemVersionId;
	}
	public String getCwe_9_originalText() {
		return cwe_9_originalText;
	}
	public void setCwe_9_originalText(String cwe_9_originalText) {
		this.cwe_9_originalText = cwe_9_originalText;
	}
	@Override
	public String toString() {
		return "CWE_v25 [cwe_1_identifier=" + cwe_1_identifier + ", cwe_2_text=" + cwe_2_text
				+ ", cwe_3_nameOfCodingSystem=" + cwe_3_nameOfCodingSystem + ", cwe_4_alternateIdentifier="
				+ cwe_4_alternateIdentifier + ", cwe_5_alternateText=" + cwe_5_alternateText
				+ ", cwe_6_nameOfAlternateCodingSystem=" + cwe_6_nameOfAlternateCodingSystem
				+ ", cwe_7_codingSystemVersionId=" + cwe_7_codingSystemVersionId
				+ ", cwe_8_alternateCodingSystemVersionId=" + cwe_8_alternateCodingSystemVersionId
				+ ", cwe_9_originalText=" + cwe_9_originalText + "]";
	}
}
