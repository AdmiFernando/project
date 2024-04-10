package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class SPS_v25 {
		
	@JsonProperty("sps_1_specimenSourceNameOrCode")
	private CWE_v25 sps_1_specimenSourceNameOrCode;
	@JsonProperty("sps_2_additives")
	private CWE_v25 sps_2_additives;
	@JsonProperty("sps_3_specimenCollectionMethod")
	private String sps_3_specimenCollectionMethod;
	@JsonProperty("sps_4_bodySite")
	private CWE_v25 sps_4_bodySite;
	@JsonProperty("sps_5_siteModifier")
	private CWE_v25 sps_5_siteModifier;
	@JsonProperty("sps_6_collectionMethodModifierCode")
	private CWE_v25 sps_6_collectionMethodModifierCode;
	@JsonProperty("sps_7_specimenRole")
	private CWE_v25 sps_7_specimenRole;
	public SPS_v25() {
		super();
		this.sps_1_specimenSourceNameOrCode = new CWE_v25();
		this.sps_2_additives = new CWE_v25();
		this.sps_3_specimenCollectionMethod = "";
		this.sps_4_bodySite = new CWE_v25();
		this.sps_5_siteModifier = new CWE_v25();
		this.sps_6_collectionMethodModifierCode = new CWE_v25();
		this.sps_7_specimenRole = new CWE_v25();
	}
	public SPS_v25(CWE_v25 sps_1_specimenSourceNameOrCode, CWE_v25 sps_2_additives,
			String sps_3_specimenCollectionMethod, CWE_v25 sps_4_bodySite, CWE_v25 sps_5_siteModifier,
			CWE_v25 sps_6_collectionMethodModifierCode, CWE_v25 sps_7_specimenRole) {
		super();
		this.sps_1_specimenSourceNameOrCode = sps_1_specimenSourceNameOrCode;
		this.sps_2_additives = sps_2_additives;
		this.sps_3_specimenCollectionMethod = sps_3_specimenCollectionMethod;
		this.sps_4_bodySite = sps_4_bodySite;
		this.sps_5_siteModifier = sps_5_siteModifier;
		this.sps_6_collectionMethodModifierCode = sps_6_collectionMethodModifierCode;
		this.sps_7_specimenRole = sps_7_specimenRole;
	}
	public CWE_v25 getSps_1_specimenSourceNameOrCode() {
		return sps_1_specimenSourceNameOrCode;
	}
	public void setSps_1_specimenSourceNameOrCode(CWE_v25 sps_1_specimenSourceNameOrCode) {
		this.sps_1_specimenSourceNameOrCode = sps_1_specimenSourceNameOrCode;
	}
	public CWE_v25 getSps_2_additives() {
		return sps_2_additives;
	}
	public void setSps_2_additives(CWE_v25 sps_2_additives) {
		this.sps_2_additives = sps_2_additives;
	}
	public String getSps_3_specimenCollectionMethod() {
		return sps_3_specimenCollectionMethod;
	}
	public void setSps_3_specimenCollectionMethod(String sps_3_specimenCollectionMethod) {
		this.sps_3_specimenCollectionMethod = sps_3_specimenCollectionMethod;
	}
	public CWE_v25 getSps_4_bodySite() {
		return sps_4_bodySite;
	}
	public void setSps_4_bodySite(CWE_v25 sps_4_bodySite) {
		this.sps_4_bodySite = sps_4_bodySite;
	}
	public CWE_v25 getSps_5_siteModifier() {
		return sps_5_siteModifier;
	}
	public void setSps_5_siteModifier(CWE_v25 sps_5_siteModifier) {
		this.sps_5_siteModifier = sps_5_siteModifier;
	}
	public CWE_v25 getSps_6_collectionMethodModifierCode() {
		return sps_6_collectionMethodModifierCode;
	}
	public void setSps_6_collectionMethodModifierCode(CWE_v25 sps_6_collectionMethodModifierCode) {
		this.sps_6_collectionMethodModifierCode = sps_6_collectionMethodModifierCode;
	}
	public CWE_v25 getSps_7_specimenRole() {
		return sps_7_specimenRole;
	}
	public void setSps_7_specimenRole(CWE_v25 sps_7_specimenRole) {
		this.sps_7_specimenRole = sps_7_specimenRole;
	}
	@Override
	public String toString() {
		return "SPS_v25 [sps_1_specimenSourceNameOrCode=" + sps_1_specimenSourceNameOrCode + ", sps_2_additives="
				+ sps_2_additives + ", sps_3_specimenCollectionMethod=" + sps_3_specimenCollectionMethod
				+ ", sps_4_bodySite=" + sps_4_bodySite + ", sps_5_siteModifier=" + sps_5_siteModifier
				+ ", sps_6_collectionMethodModifierCode=" + sps_6_collectionMethodModifierCode + ", sps_7_specimenRole="
				+ sps_7_specimenRole + "]";
	} 
}
