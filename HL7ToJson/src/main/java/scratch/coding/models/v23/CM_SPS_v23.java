package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_SPS_v23  {
	@JsonProperty("ce_cm_sps_1_specimenSourceNameOrCode")
	private CE_v2 ce_cm_sps_1_specimenSourceNameOrCode;
	@JsonProperty("cm_sps_2_additives")
	private String cm_sps_2_additives;
	@JsonProperty("cm_sps_3_freeText")
	private String cm_sps_3_freeText;
	@JsonProperty("ce_cm_sps_4_bodySite")
	private CE_v2 ce_cm_sps_4_bodySite;
	@JsonProperty("ce_cm_sps_5_siteModifier")
	private CE_v2 ce_cm_sps_5_siteModifier;
	@JsonProperty("ce_cm_sps_6_collectionModifierMethodCode")
	private CE_v2 ce_cm_sps_6_collectionModifierMethodCode;
	public CM_SPS_v23(CE_v2 ce_cm_sps_1_specimenSourceNameOrCode, String cm_sps_2_additives,
			String cm_sps_3_freeText, CE_v2 ce_cm_sps_4_bodySite, CE_v2 ce_cm_sps_5_siteModifier,
			CE_v2 ce_cm_sps_6_collectionModifierMethodCode) {
		super();
		this.ce_cm_sps_1_specimenSourceNameOrCode = ce_cm_sps_1_specimenSourceNameOrCode;
		this.cm_sps_2_additives = cm_sps_2_additives;
		this.cm_sps_3_freeText = cm_sps_3_freeText;
		this.ce_cm_sps_4_bodySite = ce_cm_sps_4_bodySite;
		this.ce_cm_sps_5_siteModifier = ce_cm_sps_5_siteModifier;
		this.ce_cm_sps_6_collectionModifierMethodCode = ce_cm_sps_6_collectionModifierMethodCode;
	}
	public CM_SPS_v23() {
		super();
		this.ce_cm_sps_1_specimenSourceNameOrCode = new CE_v2();
		this.cm_sps_2_additives = "";
		this.cm_sps_3_freeText = "";
		this.ce_cm_sps_4_bodySite = new CE_v2();
		this.ce_cm_sps_5_siteModifier = new CE_v2();
		this.ce_cm_sps_6_collectionModifierMethodCode = new CE_v2();
	}
	public CE_v2 getCe_cm_sps_1_specimenSourceNameOrCode() {
		return ce_cm_sps_1_specimenSourceNameOrCode;
	}
	public void setCe_cm_sps_1_specimenSourceNameOrCode(CE_v2 ce_cm_sps_1_specimenSourceNameOrCode) {
		this.ce_cm_sps_1_specimenSourceNameOrCode = ce_cm_sps_1_specimenSourceNameOrCode;
	}
	public String getCm_sps_2_additives() {
		return cm_sps_2_additives;
	}
	public void setCm_sps_2_additives(String cm_sps_2_additives) {
		this.cm_sps_2_additives = cm_sps_2_additives;
	}
	public String getCm_sps_3_freeText() {
		return cm_sps_3_freeText;
	}
	public void setCm_sps_3_freeText(String cm_sps_3_freeText) {
		this.cm_sps_3_freeText = cm_sps_3_freeText;
	}
	public CE_v2 getCe_cm_sps_4_bodySite() {
		return ce_cm_sps_4_bodySite;
	}
	public void setCe_cm_sps_4_bodySite(CE_v2 ce_cm_sps_4_bodySite) {
		this.ce_cm_sps_4_bodySite = ce_cm_sps_4_bodySite;
	}
	public CE_v2 getCe_cm_sps_5_siteModifier() {
		return ce_cm_sps_5_siteModifier;
	}
	public void setCe_cm_sps_5_siteModifier(CE_v2 ce_cm_sps_5_siteModifier) {
		this.ce_cm_sps_5_siteModifier = ce_cm_sps_5_siteModifier;
	}
	public CE_v2 getCe_cm_sps_6_collectionModifierMethodCode() {
		return ce_cm_sps_6_collectionModifierMethodCode;
	}
	public void setCe_cm_sps_6_collectionModifierMethodCode(CE_v2 ce_cm_sps_6_collectionModifierMethodCode) {
		this.ce_cm_sps_6_collectionModifierMethodCode = ce_cm_sps_6_collectionModifierMethodCode;
	}
	@Override
	public String toString() {
		return "CM_SPS_Specimen [ce_cm_sps_1_specimenSourceNameOrCode=" + ce_cm_sps_1_specimenSourceNameOrCode
				+ ", cm_sps_2_additives=" + cm_sps_2_additives + ", cm_sps_3_freeText=" + cm_sps_3_freeText
				+ ", ce_cm_sps_4_bodySite=" + ce_cm_sps_4_bodySite + ", ce_cm_sps_5_siteModifier="
				+ ce_cm_sps_5_siteModifier + ", ce_cm_sps_6_collectionModifierMethodCode="
				+ ce_cm_sps_6_collectionModifierMethodCode + "]";
	}
}
