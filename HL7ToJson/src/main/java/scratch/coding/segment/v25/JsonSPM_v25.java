package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.DR_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CQ_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.EIP_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonSPM_v25 {
	@JsonProperty("spm_1_setID")
	private String spm_1_setID;
	@JsonProperty("spm_2_specimenID")
	private EIP_v25 spm_2_specimenID;
	@JsonProperty("spm_3_specimenParentIDs")
	private EIP_v25[] spm_3_specimenParentIDs;
	@JsonProperty("spm_4_specimenType")
	private CWE_v25 spm_4_specimenType;
	@JsonProperty("spm_5_specimenTypeModifier")
	private CWE_v25[] spm_5_specimenTypeModifier;
	@JsonProperty("spm_6_specimenAdditives")
	private CWE_v25[] spm_6_specimenAdditives;
	@JsonProperty("spm_7_specimenCollectionMethod")
	private CWE_v25 spm_7_specimenCollectionMethod;
	@JsonProperty("spm_8_specimenSourceSite")
	private CWE_v25 spm_8_specimenSourceSite;
	@JsonProperty("spm_9_specimenSourceSiteModifier")
	private CWE_v25[] spm_9_specimenSourceSiteModifier;
	@JsonProperty("spm_10_specimenCollectionSite")
	private CWE_v25 spm_10_specimenCollectionSite;
	@JsonProperty("spm_11_specimenRole")
	private CWE_v25[] spm_11_specimenRole;
	@JsonProperty("spm_12_specimenCollectionAmount")
	private CQ_v25 spm_12_specimenCollectionAmount;
	@JsonProperty("spm_13_groupedSpecimenCount")
	private String spm_13_groupedSpecimenCount;
	@JsonProperty("spm_14_specimenDescription")
	private String[] spm_14_specimenDescription;
	@JsonProperty("spm_15_specimenHandlingCode")
	private CWE_v25[] spm_15_specimenHandlingCode;
	@JsonProperty("spm_16_specimenRiskCode")
	private CWE_v25[] spm_16_specimenRiskCode;
	@JsonProperty("spm_17_specimenCollectionDateTime")
	private DR_v2 spm_17_specimenCollectionDateTime;
	@JsonProperty("spm_18_specimenReceivedDateTime")
	private TS_v2 spm_18_specimenReceivedDateTime;
	@JsonProperty("spm_19_specimenExpirationDateTime")
	private TS_v2 spm_19_specimenExpirationDateTime;
	@JsonProperty("spm_20_specimenAvailability")
	private String spm_20_specimenAvailability;
	@JsonProperty("spm_21_specimenRejectReason")
	private CWE_v25[] spm_21_specimenRejectReason;
	@JsonProperty("spm_22_specimenQuality")
	private CWE_v25 spm_22_specimenQuality;
	@JsonProperty("spm_23_specimenAppropriateness")
	private CWE_v25 spm_23_specimenAppropriateness;
	@JsonProperty("spm_24_specimenCondition")
	private CWE_v25[] spm_24_specimenCondition;
	@JsonProperty("spm_25_specimenCurrentQuantity")
	private CQ_v25 spm_25_specimenCurrentQuantity;
	@JsonProperty("spm_26_numberofSpecimenContainers")
	private String spm_26_numberofSpecimenContainers;
	@JsonProperty("spm_27_containerType")
	private CWE_v25 spm_27_containerType;
	@JsonProperty("spm_28_containerCondition")
	private CWE_v25 spm_28_containerCondition;
	@JsonProperty("spm_29_specimenChildRole")
	private CWE_v25 spm_29_specimenChildRole;
	
	private JsonSPM_v25(SPMBuilder builder) {
		super();
		this.spm_1_setID = builder.spm_1_setID;
		this.spm_2_specimenID = builder.spm_2_specimenID;
		this.spm_3_specimenParentIDs = builder.spm_3_specimenParentIDs;
		this.spm_4_specimenType = builder.spm_4_specimenType;
		this.spm_5_specimenTypeModifier = builder.spm_5_specimenTypeModifier;
		this.spm_6_specimenAdditives = builder.spm_6_specimenAdditives;
		this.spm_7_specimenCollectionMethod = builder.spm_7_specimenCollectionMethod;
		this.spm_8_specimenSourceSite = builder.spm_8_specimenSourceSite;
		this.spm_9_specimenSourceSiteModifier = builder.spm_9_specimenSourceSiteModifier;
		this.spm_10_specimenCollectionSite = builder.spm_10_specimenCollectionSite;
		this.spm_11_specimenRole = builder.spm_11_specimenRole;
		this.spm_12_specimenCollectionAmount = builder.spm_12_specimenCollectionAmount;
		this.spm_13_groupedSpecimenCount = builder.spm_13_groupedSpecimenCount;
		this.spm_14_specimenDescription = builder.spm_14_specimenDescription;
		this.spm_15_specimenHandlingCode = builder.spm_15_specimenHandlingCode;
		this.spm_16_specimenRiskCode = builder.spm_16_specimenRiskCode;
		this.spm_17_specimenCollectionDateTime = builder.spm_17_specimenCollectionDateTime;
		this.spm_18_specimenReceivedDateTime = builder.spm_18_specimenReceivedDateTime;
		this.spm_19_specimenExpirationDateTime = builder.spm_19_specimenExpirationDateTime;
		this.spm_20_specimenAvailability = builder.spm_20_specimenAvailability;
		this.spm_21_specimenRejectReason = builder.spm_21_specimenRejectReason;
		this.spm_22_specimenQuality = builder.spm_22_specimenQuality;
		this.spm_23_specimenAppropriateness = builder.spm_23_specimenAppropriateness;
		this.spm_24_specimenCondition = builder.spm_24_specimenCondition;
		this.spm_25_specimenCurrentQuantity = builder.spm_25_specimenCurrentQuantity;
		this.spm_26_numberofSpecimenContainers = builder.spm_26_numberofSpecimenContainers;
		this.spm_27_containerType = builder.spm_27_containerType;
		this.spm_28_containerCondition = builder.spm_28_containerCondition;
		this.spm_29_specimenChildRole = builder.spm_29_specimenChildRole;
	}
	public JsonSPM_v25() {
		super();
		this.spm_1_setID = "";
		this.spm_2_specimenID = new EIP_v25();
		this.spm_3_specimenParentIDs = new EIP_v25[] {};
		this.spm_4_specimenType = new CWE_v25();
		this.spm_5_specimenTypeModifier = new CWE_v25[] {};
		this.spm_6_specimenAdditives = new CWE_v25[] {};
		this.spm_7_specimenCollectionMethod = new CWE_v25();
		this.spm_8_specimenSourceSite = new CWE_v25();
		this.spm_9_specimenSourceSiteModifier = new CWE_v25[] {};
		this.spm_10_specimenCollectionSite = new CWE_v25();
		this.spm_11_specimenRole = new CWE_v25[] {};
		this.spm_12_specimenCollectionAmount = new CQ_v25();
		this.spm_13_groupedSpecimenCount = "";
		this.spm_14_specimenDescription = new String[] {};
		this.spm_15_specimenHandlingCode = new CWE_v25[] {};
		this.spm_16_specimenRiskCode = new CWE_v25[] {};
		this.spm_17_specimenCollectionDateTime = new DR_v2();
		this.spm_18_specimenReceivedDateTime = new TS_v2();
		this.spm_19_specimenExpirationDateTime = new TS_v2();
		this.spm_20_specimenAvailability = "";
		this.spm_21_specimenRejectReason = new CWE_v25[] {};
		this.spm_22_specimenQuality = new CWE_v25();
		this.spm_23_specimenAppropriateness = new CWE_v25();
		this.spm_24_specimenCondition = new CWE_v25[] {};
		this.spm_25_specimenCurrentQuantity = new CQ_v25();
		this.spm_26_numberofSpecimenContainers = "";
		this.spm_27_containerType = new CWE_v25();
		this.spm_28_containerCondition = new CWE_v25();
		this.spm_29_specimenChildRole = new CWE_v25();
	}
	public static class SPMBuilder {
		private String spm_1_setID;
		private EIP_v25 spm_2_specimenID;
		private EIP_v25[] spm_3_specimenParentIDs;
		private CWE_v25 spm_4_specimenType;
		private CWE_v25[] spm_5_specimenTypeModifier;
		private CWE_v25[] spm_6_specimenAdditives;
		private CWE_v25 spm_7_specimenCollectionMethod;
		private CWE_v25 spm_8_specimenSourceSite;
		private CWE_v25[] spm_9_specimenSourceSiteModifier;
		private CWE_v25 spm_10_specimenCollectionSite;
		private CWE_v25[] spm_11_specimenRole;
		private CQ_v25 spm_12_specimenCollectionAmount;
		private String spm_13_groupedSpecimenCount;
		private String[] spm_14_specimenDescription;
		private CWE_v25[] spm_15_specimenHandlingCode;
		private CWE_v25[] spm_16_specimenRiskCode;
		private DR_v2 spm_17_specimenCollectionDateTime;
		private TS_v2 spm_18_specimenReceivedDateTime;
		private TS_v2 spm_19_specimenExpirationDateTime;
		private String spm_20_specimenAvailability;
		private CWE_v25[] spm_21_specimenRejectReason;
		private CWE_v25 spm_22_specimenQuality;
		private CWE_v25 spm_23_specimenAppropriateness;
		private CWE_v25[] spm_24_specimenCondition;
		private CQ_v25 spm_25_specimenCurrentQuantity;
		private String spm_26_numberofSpecimenContainers;
		private CWE_v25 spm_27_containerType;
		private CWE_v25 spm_28_containerCondition;
		private CWE_v25 spm_29_specimenChildRole;
		public SPMBuilder() {
			super();
			this.spm_1_setID = "";
			this.spm_2_specimenID = new EIP_v25();
			this.spm_3_specimenParentIDs = new EIP_v25[] {};
			this.spm_4_specimenType = new CWE_v25();
			this.spm_5_specimenTypeModifier = new CWE_v25[] {};
			this.spm_6_specimenAdditives = new CWE_v25[] {};
			this.spm_7_specimenCollectionMethod = new CWE_v25();
			this.spm_8_specimenSourceSite = new CWE_v25();
			this.spm_9_specimenSourceSiteModifier = new CWE_v25[] {};
			this.spm_10_specimenCollectionSite = new CWE_v25();
			this.spm_11_specimenRole = new CWE_v25[] {};
			this.spm_12_specimenCollectionAmount = new CQ_v25();
			this.spm_13_groupedSpecimenCount = "";
			this.spm_14_specimenDescription = new String[] {};
			this.spm_15_specimenHandlingCode = new CWE_v25[] {};
			this.spm_16_specimenRiskCode = new CWE_v25[] {};
			this.spm_17_specimenCollectionDateTime = new DR_v2();
			this.spm_18_specimenReceivedDateTime = new TS_v2();
			this.spm_19_specimenExpirationDateTime = new TS_v2();
			this.spm_20_specimenAvailability = "";
			this.spm_21_specimenRejectReason = new CWE_v25[] {};
			this.spm_22_specimenQuality = new CWE_v25();
			this.spm_23_specimenAppropriateness = new CWE_v25();
			this.spm_24_specimenCondition = new CWE_v25[] {};
			this.spm_25_specimenCurrentQuantity = new CQ_v25();
			this.spm_26_numberofSpecimenContainers = "";
			this.spm_27_containerType = new CWE_v25();
			this.spm_28_containerCondition = new CWE_v25();
			this.spm_29_specimenChildRole = new CWE_v25();
		}
		public SPMBuilder spm_1_setID(String spm_1_setID) {
			this.spm_1_setID = spm_1_setID;
			return this;
		}
		public SPMBuilder spm_2_specimenID(EIP_v25 spm_2_specimenID) {
			this.spm_2_specimenID = spm_2_specimenID;
			return this;
		}
		public SPMBuilder spm_3_specimenParentIDs(EIP_v25[] spm_3_specimenParentIDs) {
			this.spm_3_specimenParentIDs = spm_3_specimenParentIDs;
			return this;
		}
		public SPMBuilder spm_4_specimenType(CWE_v25 spm_4_specimenType) {
			this.spm_4_specimenType = spm_4_specimenType;
			return this;
		}
		public SPMBuilder spm_5_specimenTypeModifier(CWE_v25[] spm_5_specimenTypeModifier) {
			this.spm_5_specimenTypeModifier = spm_5_specimenTypeModifier;
			return this;
		}
		public SPMBuilder spm_6_specimenAdditives(CWE_v25[] spm_6_specimenAdditives) {
			this.spm_6_specimenAdditives = spm_6_specimenAdditives;
			return this;
		}
		public SPMBuilder spm_7_specimenCollectionMethod(CWE_v25 spm_7_specimenCollectionMethod) {
			this.spm_7_specimenCollectionMethod = spm_7_specimenCollectionMethod;
			return this;
		}
		public SPMBuilder spm_8_specimenSourceSite(CWE_v25 spm_8_specimenSourceSite) {
			this.spm_8_specimenSourceSite = spm_8_specimenSourceSite;
			return this;
		}
		public SPMBuilder spm_9_specimenSourceSiteModifier(CWE_v25[] spm_9_specimenSourceSiteModifier) {
			this.spm_9_specimenSourceSiteModifier = spm_9_specimenSourceSiteModifier;
			return this;
		}
		public SPMBuilder spm_10_specimenCollectionSite(CWE_v25 spm_10_specimenCollectionSite) {
			this.spm_10_specimenCollectionSite = spm_10_specimenCollectionSite;
			return this;
		}
		public SPMBuilder spm_11_specimenRole(CWE_v25[] spm_11_specimenRole) {
			this.spm_11_specimenRole = spm_11_specimenRole;
			return this;
		}
		public SPMBuilder spm_12_specimenCollectionAmount(CQ_v25 spm_12_specimenCollectionAmount) {
			this.spm_12_specimenCollectionAmount = spm_12_specimenCollectionAmount;
			return this;
		}
		public SPMBuilder spm_13_groupedSpecimenCount(String spm_13_groupedSpecimenCount) {
			this.spm_13_groupedSpecimenCount = spm_13_groupedSpecimenCount;
			return this;
		}
		public SPMBuilder spm_14_specimenDescription(String[] spm_14_specimenDescription) {
			this.spm_14_specimenDescription = spm_14_specimenDescription;
			return this;
		}
		public SPMBuilder spm_15_specimenHandlingCode(CWE_v25[] spm_15_specimenHandlingCode) {
			this.spm_15_specimenHandlingCode = spm_15_specimenHandlingCode;
			return this;
		}
		public SPMBuilder spm_16_specimenRiskCode(CWE_v25[] spm_16_specimenRiskCode) {
			this.spm_16_specimenRiskCode = spm_16_specimenRiskCode;
			return this;
		}
		public SPMBuilder spm_17_specimenCollectionDateTime(DR_v2 spm_17_specimenCollectionDateTime) {
			this.spm_17_specimenCollectionDateTime = spm_17_specimenCollectionDateTime;
			return this;
		}
		public SPMBuilder spm_18_specimenReceivedDateTime(TS_v2 spm_18_specimenReceivedDateTime) {
			this.spm_18_specimenReceivedDateTime = spm_18_specimenReceivedDateTime;
			return this;
		}
		public SPMBuilder spm_19_specimenExpirationDateTime(TS_v2 spm_19_specimenExpirationDateTime) {
			this.spm_19_specimenExpirationDateTime = spm_19_specimenExpirationDateTime;
			return this;
		}
		public SPMBuilder spm_20_specimenAvailability(String spm_20_specimenAvailability) {
			this.spm_20_specimenAvailability = spm_20_specimenAvailability;
			return this;
		}
		public SPMBuilder spm_21_specimenRejectReason(CWE_v25[] spm_21_specimenRejectReason) {
			this.spm_21_specimenRejectReason = spm_21_specimenRejectReason;
			return this;
		}
		public SPMBuilder spm_22_specimenQuality(CWE_v25 spm_22_specimenQuality) {
			this.spm_22_specimenQuality = spm_22_specimenQuality;
			return this;
		}
		public SPMBuilder spm_23_specimenAppropriateness(CWE_v25 spm_23_specimenAppropriateness) {
			this.spm_23_specimenAppropriateness = spm_23_specimenAppropriateness;
			return this;
		}
		public SPMBuilder spm_24_specimenCondition(CWE_v25[] spm_24_specimenCondition) {
			this.spm_24_specimenCondition = spm_24_specimenCondition;
			return this;
		}
		public SPMBuilder spm_25_specimenCurrentQuantity(CQ_v25 spm_25_specimenCurrentQuantity) {
			this.spm_25_specimenCurrentQuantity = spm_25_specimenCurrentQuantity;
			return this;
		}
		public SPMBuilder spm_26_numberofSpecimenContainers(String spm_26_numberofSpecimenContainers) {
			this.spm_26_numberofSpecimenContainers = spm_26_numberofSpecimenContainers;
			return this;
		}
		public SPMBuilder spm_27_containerType(CWE_v25 spm_27_containerType) {
			this.spm_27_containerType = spm_27_containerType;
			return this;
		}
		public SPMBuilder spm_28_containerCondition(CWE_v25 spm_28_containerCondition) {
			this.spm_28_containerCondition = spm_28_containerCondition;
			return this;
		}
		public SPMBuilder spm_29_specimenChildRole(CWE_v25 spm_29_specimenChildRole) {
			this.spm_29_specimenChildRole = spm_29_specimenChildRole;
			return this;
		}
		public JsonSPM_v25 build() {
			return new JsonSPM_v25(this);
					
		}
	}
	public String getSpm_1_setID() {
		return spm_1_setID;
	}
	public EIP_v25 getSpm_2_specimenID() {
		return spm_2_specimenID;
	}
	public EIP_v25[] getSpm_3_specimenParentIDs() {
		return spm_3_specimenParentIDs;
	}
	public CWE_v25 getSpm_4_specimenType() {
		return spm_4_specimenType;
	}
	public CWE_v25[] getSpm_5_specimenTypeModifier() {
		return spm_5_specimenTypeModifier;
	}
	public CWE_v25[] getSpm_6_specimenAdditives() {
		return spm_6_specimenAdditives;
	}
	public CWE_v25 getSpm_7_specimenCollectionMethod() {
		return spm_7_specimenCollectionMethod;
	}
	public CWE_v25 getSpm_8_specimenSourceSite() {
		return spm_8_specimenSourceSite;
	}
	public CWE_v25[] getSpm_9_specimenSourceSiteModifier() {
		return spm_9_specimenSourceSiteModifier;
	}
	public CWE_v25 getSpm_10_specimenCollectionSite() {
		return spm_10_specimenCollectionSite;
	}
	public CWE_v25[] getSpm_11_specimenRole() {
		return spm_11_specimenRole;
	}
	public CQ_v25 getSpm_12_specimenCollectionAmount() {
		return spm_12_specimenCollectionAmount;
	}
	public String getSpm_13_groupedSpecimenCount() {
		return spm_13_groupedSpecimenCount;
	}
	public String[] getSpm_14_specimenDescription() {
		return spm_14_specimenDescription;
	}
	public CWE_v25[] getSpm_15_specimenHandlingCode() {
		return spm_15_specimenHandlingCode;
	}
	public CWE_v25[] getSpm_16_specimenRiskCode() {
		return spm_16_specimenRiskCode;
	}
	public DR_v2 getSpm_17_specimenCollectionDateTime() {
		return spm_17_specimenCollectionDateTime;
	}
	public TS_v2 getSpm_18_specimenReceivedDateTime() {
		return spm_18_specimenReceivedDateTime;
	}
	public TS_v2 getSpm_19_specimenExpirationDateTime() {
		return spm_19_specimenExpirationDateTime;
	}
	public String getSpm_20_specimenAvailability() {
		return spm_20_specimenAvailability;
	}
	public CWE_v25[] getSpm_21_specimenRejectReason() {
		return spm_21_specimenRejectReason;
	}
	public CWE_v25 getSpm_22_specimenQuality() {
		return spm_22_specimenQuality;
	}
	public CWE_v25 getSpm_23_specimenAppropriateness() {
		return spm_23_specimenAppropriateness;
	}
	public CWE_v25[] getSpm_24_specimenCondition() {
		return spm_24_specimenCondition;
	}
	public CQ_v25 getSpm_25_specimenCurrentQuantity() {
		return spm_25_specimenCurrentQuantity;
	}
	public String getSpm_26_numberofSpecimenContainers() {
		return spm_26_numberofSpecimenContainers;
	}
	public CWE_v25 getSpm_27_containerType() {
		return spm_27_containerType;
	}
	public CWE_v25 getSpm_28_containerCondition() {
		return spm_28_containerCondition;
	}
	public CWE_v25 getSpm_29_specimenChildRole() {
		return spm_29_specimenChildRole;
	}
	@Override
	public String toString() {
		return "JsonSPM_v25 [spm_1_setID=" + spm_1_setID + ", spm_2_specimenID=" + spm_2_specimenID
				+ ", spm_3_specimenParentIDs=" + Arrays.toString(spm_3_specimenParentIDs) + ", spm_4_specimenType="
				+ spm_4_specimenType + ", spm_5_specimenTypeModifier=" + Arrays.toString(spm_5_specimenTypeModifier)
				+ ", spm_6_specimenAdditives=" + Arrays.toString(spm_6_specimenAdditives)
				+ ", spm_7_specimenCollectionMethod=" + spm_7_specimenCollectionMethod + ", spm_8_specimenSourceSite="
				+ spm_8_specimenSourceSite + ", spm_9_specimenSourceSiteModifier="
				+ Arrays.toString(spm_9_specimenSourceSiteModifier) + ", spm_10_specimenCollectionSite="
				+ spm_10_specimenCollectionSite + ", spm_11_specimenRole=" + Arrays.toString(spm_11_specimenRole)
				+ ", spm_12_specimenCollectionAmount=" + spm_12_specimenCollectionAmount
				+ ", spm_13_groupedSpecimenCount=" + spm_13_groupedSpecimenCount + ", spm_14_specimenDescription="
				+ Arrays.toString(spm_14_specimenDescription) + ", spm_15_specimenHandlingCode="
				+ Arrays.toString(spm_15_specimenHandlingCode) + ", spm_16_specimenRiskCode="
				+ Arrays.toString(spm_16_specimenRiskCode) + ", spm_17_specimenCollectionDateTime="
				+ spm_17_specimenCollectionDateTime + ", spm_18_specimenReceivedDateTime="
				+ spm_18_specimenReceivedDateTime + ", spm_19_specimenExpirationDateTime="
				+ spm_19_specimenExpirationDateTime + ", spm_20_specimenAvailability=" + spm_20_specimenAvailability
				+ ", spm_21_specimenRejectReason=" + Arrays.toString(spm_21_specimenRejectReason)
				+ ", spm_22_specimenQuality=" + spm_22_specimenQuality + ", spm_23_specimenAppropriateness="
				+ spm_23_specimenAppropriateness + ", spm_24_specimenCondition="
				+ Arrays.toString(spm_24_specimenCondition) + ", spm_25_specimenCurrentQuantity="
				+ spm_25_specimenCurrentQuantity + ", spm_26_numberofSpecimenContainers="
				+ spm_26_numberofSpecimenContainers + ", spm_27_containerType=" + spm_27_containerType
				+ ", spm_28_containerCondition=" + spm_28_containerCondition + ", spm_29_specimenChildRole="
				+ spm_29_specimenChildRole + "]";
	}
}
