package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class IdentifierAndCoding implements Serializable {
	@JsonProperty("identifier")
	private String identifier;
	@JsonProperty("name")
	private String name;
	@JsonProperty("alternateIdentifier")
	private String alternateIdentifier;
	@JsonProperty("alternateText")
	private String alternateText;
	@JsonProperty("nameOfAlternateCodingSystem")
	private String nameOfAlternateCodingSystem;
	@JsonProperty("nameOfCodingSystem")
	private String nameOfCodingSystem;
	@JsonProperty("text")
	private String text;
	public IdentifierAndCoding(String identifier, String name, String alternateIdentifier, String alternateText,
			String nameOfAlternateCodingSystem, String nameOfCodingSystem, String text) {
		super();
		this.identifier = identifier;
		this.name = name;
		this.alternateIdentifier = alternateIdentifier;
		this.alternateText = alternateText;
		this.nameOfAlternateCodingSystem = nameOfAlternateCodingSystem;
		this.nameOfCodingSystem = nameOfCodingSystem;
		this.text = text;
	}
	public IdentifierAndCoding() {
		super();
	}
	@JsonProperty("identifier")
	public String getIdentifier() {
		return identifier;
	}
	@JsonProperty("identifier")
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("nameOfAlternateCodingSystem")
	public String getNameOfAlternateCodingSystem() {
		return nameOfAlternateCodingSystem;
	}
	@JsonProperty("nameOfAlternateCodingSystem")
	public void setNameOfAlternateCodingSystem(String nameOfAlternateCodingSystem) {
		this.nameOfAlternateCodingSystem = nameOfAlternateCodingSystem;
	}
	@JsonProperty("nameOfCodingSystem")
	public String getNameOfCodingSystem() {
		return nameOfCodingSystem;
	}
	@JsonProperty("nameOfCodingSystem")
	public void setNameOfCodingSystem(String nameOfCodingSystem) {
		this.nameOfCodingSystem = nameOfCodingSystem;
	}
	@JsonProperty("text")
	public String getText() {
		return text;
	}
	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}
	@JsonProperty("alternateIdentifier")
	public String getAlternateIdentifier() {
		return alternateIdentifier;
	}
	@JsonProperty("alternateIdentifier")
	public void setAlternateIdentifier(String alternateIdentifier) {
		this.alternateIdentifier = alternateIdentifier;
	}
	@JsonProperty("alternateText")
	public String getAlternateText() {
		return alternateText;
	}
	@JsonProperty("alternateText")
	public void setAlternateText(String alternateText) {
		this.alternateText = alternateText;
	}
	@Override
	public String toString() {
		return "PrincipalLanguage [identifier=" + identifier + ", name=" + name + ", alternateIdentifier="
				+ alternateIdentifier + ", alternateText=" + alternateText + ", nameOfAlternateCodingSystem="
				+ nameOfAlternateCodingSystem + ", nameOfCodingSystem=" + nameOfCodingSystem + ", text=" + text + "]";
	}
}
