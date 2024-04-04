package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Specimen implements Serializable {
	@JsonProperty("additives")
	private String additives;
	@JsonProperty("collectionModifierMethodCode")
	private IdentifierAndCoding CollectionModifierMethodCode;
	@JsonProperty("bodySite")
	private IdentifierAndCoding bodySite;
	@JsonProperty("freeText")
	private String freeText;
	@JsonProperty("siteModifier")
	private IdentifierAndCoding siteModifier;
	@JsonProperty("specimenSourceNameOrCode")
	private IdentifierAndCoding specimenSourceNameOrCode;
	public Specimen(String additives, IdentifierAndCoding collectionModifierMethodCode, IdentifierAndCoding bodySite,
			String freeText, IdentifierAndCoding siteModifier, IdentifierAndCoding specimenSourceNameOrCode) {
		super();
		this.additives = additives;
		CollectionModifierMethodCode = collectionModifierMethodCode;
		this.bodySite = bodySite;
		this.freeText = freeText;
		this.siteModifier = siteModifier;
		this.specimenSourceNameOrCode = specimenSourceNameOrCode;
	}
	public Specimen() {
		super();
	}
	@JsonProperty("additives")
	public String getAdditives() {
		return additives;
	}
	@JsonProperty("additives")
	public void setAdditives(String additives) {
		this.additives = additives;
	}
	@JsonProperty("bodySite")
	public IdentifierAndCoding getBodySite() {
		return bodySite;
	}
	@JsonProperty("bodySite")
	public void setBodySite(IdentifierAndCoding bodySite) {
		this.bodySite = bodySite;
	}
	@JsonProperty("collectionModifierMethodCode")
	public IdentifierAndCoding getCollectionModifierMethodCode() {
		return CollectionModifierMethodCode;
	}
	@JsonProperty("collectionModifierMethodCode")
	public void setCollectionModifierMethodCode(IdentifierAndCoding collectionModifierMethodCode) {
		CollectionModifierMethodCode = collectionModifierMethodCode;
	}
	@JsonProperty("freeText")
	public String getFreeText() {
		return freeText;
	}
	@JsonProperty("freeText")
	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}
	@JsonProperty("siteModifier")
	public IdentifierAndCoding getSiteModifier() {
		return siteModifier;
	}
	@JsonProperty("siteModifier")
	public void setSiteModifier(IdentifierAndCoding siteModifier) {
		this.siteModifier = siteModifier;
	}
	@JsonProperty("specimenSourceNameOrCode")
	public IdentifierAndCoding getSpecimenSourceNameOrCode() {
		return specimenSourceNameOrCode;
	}
	@JsonProperty("specimenSourceNameOrCode")
	public void setSpecimenSourceNameOrCode(IdentifierAndCoding specimenSourceNameOrCode) {
		this.specimenSourceNameOrCode = specimenSourceNameOrCode;
	}
	@Override
	public String toString() {
		return "Specimen [additives=" + additives + ", bodySite=" + bodySite + ", freeText=" + freeText
				+ ", siteModifier=" + siteModifier + ", specimenSourceNameOrCode=" + specimenSourceNameOrCode + "]";
	}
}
