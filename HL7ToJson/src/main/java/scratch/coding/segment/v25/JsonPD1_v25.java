package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPD1_v25 {
	
	@JsonProperty("pd1_1_livingDependency")
	private String pd1_1_livingDependency;
	@JsonProperty("pd1_2_livingArrangement")
	private String pd1_2_livingArrangement;
	@JsonProperty("pd1_3_patientPrimaryFacility")
	private XON_v25 pd1_3_patientPrimaryFacility;
	@JsonProperty("pd1_4_patientPrimaryCareProviderNameandIDNo")
	private XCN_v25 pd1_4_patientPrimaryCareProviderNameandIDNo;
	@JsonProperty("pd1_5_studentIndicator")
	private String pd1_5_studentIndicator;
	@JsonProperty("pd1_6_handicap")
	private String pd1_6_handicap;
	@JsonProperty("pd1_7_livingWillCode")
	private String pd1_7_livingWillCode;
	@JsonProperty("pd1_8_organDonorCode")
	private String pd1_8_organDonorCode;
	@JsonProperty("pd1_9_separateBill")
	private String pd1_9_separateBill;
	@JsonProperty("pd1_10_duplicatePatient")
	private CX_v25 pd1_10_duplicatePatient;
	@JsonProperty("pd1_11_publicityCode")
	private CE_v2 pd1_11_publicityCode;
	@JsonProperty("pd1_12_protectionIndicator")
	private String pd1_12_protectionIndicator;
	@JsonProperty("pd1_13_protectionIndicatorEffectiveDate")
	private String pd1_13_protectionIndicatorEffectiveDate;
	@JsonProperty("pd1_14_placeofWorship")
	private XON_v25 pd1_14_placeofWorship;
	@JsonProperty("pd1_15_advanceDirectiveCode")
	private CE_v2 pd1_15_advanceDirectiveCode;
	@JsonProperty("pd1_16_immunizationRegistryStatus")
	private String pd1_16_immunizationRegistryStatus;
	@JsonProperty("pd1_17_immunizationRegistryStatusEffectiveDate")
	private String pd1_17_immunizationRegistryStatusEffectiveDate;
	@JsonProperty("pd1_18_publicityCodeEffectiveDate")
	private String pd1_18_publicityCodeEffectiveDate;
	@JsonProperty("pd1_19_militaryBranch")
	private String pd1_19_militaryBranch;
	@JsonProperty("pd1_20_militaryRankGrade")
	private String pd1_20_militaryRankGrade;
	@JsonProperty("pd1_21_militaryStatus")
	private String pd1_21_militaryStatus;
	public JsonPD1_v25() {
		super();
		this.pd1_1_livingDependency = "";
		this.pd1_2_livingArrangement = "";
		this.pd1_3_patientPrimaryFacility = new XON_v25();
		this.pd1_4_patientPrimaryCareProviderNameandIDNo = new XCN_v25();
		this.pd1_5_studentIndicator = "";
		this.pd1_6_handicap = "";
		this.pd1_7_livingWillCode = "";
		this.pd1_8_organDonorCode = "";
		this.pd1_9_separateBill = "";
		this.pd1_10_duplicatePatient = new CX_v25();
		this.pd1_11_publicityCode = new CE_v2();
		this.pd1_12_protectionIndicator = "";
		this.pd1_13_protectionIndicatorEffectiveDate = "";
		this.pd1_14_placeofWorship = new XON_v25();
		this.pd1_15_advanceDirectiveCode = new CE_v2();
		this.pd1_16_immunizationRegistryStatus = "";
		this.pd1_17_immunizationRegistryStatusEffectiveDate = "";
		this.pd1_18_publicityCodeEffectiveDate = "";
		this.pd1_19_militaryBranch = "";
		this.pd1_20_militaryRankGrade = "";
		this.pd1_21_militaryStatus = "";
	}
	private JsonPD1_v25(PD1Builder builder) {
		this.pd1_1_livingDependency = builder.pd1_1_livingDependency;
		this.pd1_2_livingArrangement = builder.pd1_2_livingArrangement;
		this.pd1_3_patientPrimaryFacility = builder.pd1_3_patientPrimaryFacility;
		this.pd1_4_patientPrimaryCareProviderNameandIDNo = builder.pd1_4_patientPrimaryCareProviderNameandIDNo;
		this.pd1_5_studentIndicator = builder.pd1_5_studentIndicator;
		this.pd1_6_handicap = builder.pd1_6_handicap;
		this.pd1_7_livingWillCode = builder.pd1_7_livingWillCode;
		this.pd1_8_organDonorCode = builder.pd1_8_organDonorCode;
		this.pd1_9_separateBill = builder.pd1_9_separateBill;
		this.pd1_10_duplicatePatient = builder.pd1_10_duplicatePatient;
		this.pd1_11_publicityCode = builder.pd1_11_publicityCode;
		this.pd1_12_protectionIndicator = builder.pd1_12_protectionIndicator;
		this.pd1_13_protectionIndicatorEffectiveDate = builder.pd1_13_protectionIndicatorEffectiveDate;
		this.pd1_14_placeofWorship = builder.pd1_14_placeofWorship;
		this.pd1_15_advanceDirectiveCode = builder.pd1_15_advanceDirectiveCode;
		this.pd1_16_immunizationRegistryStatus = builder.pd1_16_immunizationRegistryStatus;
		this.pd1_17_immunizationRegistryStatusEffectiveDate = builder.pd1_17_immunizationRegistryStatusEffectiveDate;
		this.pd1_18_publicityCodeEffectiveDate = builder.pd1_18_publicityCodeEffectiveDate;
		this.pd1_19_militaryBranch = builder.pd1_19_militaryBranch;
		this.pd1_20_militaryRankGrade = builder.pd1_20_militaryRankGrade;
		this.pd1_21_militaryStatus = builder.pd1_21_militaryStatus;
	}
	
	public static class PD1Builder {
		private String pd1_1_livingDependency;
		private String pd1_2_livingArrangement;
		private XON_v25 pd1_3_patientPrimaryFacility;
		private XCN_v25 pd1_4_patientPrimaryCareProviderNameandIDNo;
		private String pd1_5_studentIndicator;	
		private String pd1_6_handicap;
		private String pd1_7_livingWillCode;
		private String pd1_8_organDonorCode;
		private String pd1_9_separateBill;
		private CX_v25 pd1_10_duplicatePatient;
		private CE_v2 pd1_11_publicityCode;
		private String pd1_12_protectionIndicator;
		private String pd1_13_protectionIndicatorEffectiveDate;
		private XON_v25 pd1_14_placeofWorship;
		private CE_v2 pd1_15_advanceDirectiveCode;
		private String pd1_16_immunizationRegistryStatus;
		private String pd1_17_immunizationRegistryStatusEffectiveDate;
		private String pd1_18_publicityCodeEffectiveDate;
		private String pd1_19_militaryBranch;
		private String pd1_20_militaryRankGrade;
		private String pd1_21_militaryStatus;
		public PD1Builder() {
			super();
			this.pd1_1_livingDependency = "";
			this.pd1_2_livingArrangement = "";
			this.pd1_3_patientPrimaryFacility = new XON_v25();
			this.pd1_4_patientPrimaryCareProviderNameandIDNo = new XCN_v25();
			this.pd1_5_studentIndicator = "";
			this.pd1_6_handicap = "";
			this.pd1_7_livingWillCode = "";
			this.pd1_8_organDonorCode = "";
			this.pd1_9_separateBill = "";
			this.pd1_10_duplicatePatient = new CX_v25();
			this.pd1_11_publicityCode = new CE_v2();
			this.pd1_12_protectionIndicator = "";
			this.pd1_13_protectionIndicatorEffectiveDate = "";
			this.pd1_14_placeofWorship = new XON_v25();
			this.pd1_15_advanceDirectiveCode = new CE_v2();
			this.pd1_16_immunizationRegistryStatus = "";
			this.pd1_17_immunizationRegistryStatusEffectiveDate = "";
			this.pd1_18_publicityCodeEffectiveDate = "";
			this.pd1_19_militaryBranch = "";
			this.pd1_20_militaryRankGrade = "";
			this.pd1_21_militaryStatus = "";
		}
		public PD1Builder pd1_1_livingDependency(String pd1_1_livingDependency) {
			this.pd1_1_livingDependency = pd1_1_livingDependency;
			return this;
		}
		public PD1Builder setPd1_2_livingArrangement(String pd1_2_livingArrangement) {
			this.pd1_2_livingArrangement = pd1_2_livingArrangement;
			return this;
		}
		public PD1Builder setPd1_3_patientPrimaryFacility(XON_v25 pd1_3_patientPrimaryFacility) {
			this.pd1_3_patientPrimaryFacility = pd1_3_patientPrimaryFacility;
			return this;
		}
		public PD1Builder setPd1_4_patientPrimaryCareProviderNameandIDNo(XCN_v25 pd1_4_patientPrimaryCareProviderNameandIDNo) {
			this.pd1_4_patientPrimaryCareProviderNameandIDNo = pd1_4_patientPrimaryCareProviderNameandIDNo;
			return this;
		}
		public PD1Builder setPd1_5_studentIndicator(String pd1_5_studentIndicator) {
			this.pd1_5_studentIndicator = pd1_5_studentIndicator;
			return this;
		}
		public PD1Builder setPd1_6_handicap(String pd1_6_handicap) {
			this.pd1_6_handicap = pd1_6_handicap;
			return this;
		}
		public PD1Builder setPd1_7_livingWillCode(String pd1_7_livingWillCode) {
			this.pd1_7_livingWillCode = pd1_7_livingWillCode;
			return this;
		}
		public PD1Builder setPd1_8_organDonorCode(String pd1_8_organDonorCode) {
			this.pd1_8_organDonorCode = pd1_8_organDonorCode;
			return this;
		}
		public PD1Builder setPd1_9_separateBill(String pd1_9_separateBill) {
			this.pd1_9_separateBill = pd1_9_separateBill;
			return this;
		}
		public PD1Builder setPd1_10_duplicatePatient(CX_v25 pd1_10_duplicatePatient) {
			this.pd1_10_duplicatePatient = pd1_10_duplicatePatient;
			return this;
		}
		public PD1Builder setPd1_11_publicityCode(CE_v2 pd1_11_publicityCode) {
			this.pd1_11_publicityCode = pd1_11_publicityCode;
			return this;
		}
		public PD1Builder setPd1_12_protectionIndicator(String pd1_12_protectionIndicator) {
			this.pd1_12_protectionIndicator = pd1_12_protectionIndicator;
			return this;
		}
		public PD1Builder setPd1_13_protectionIndicatorEffectiveDate(String pd1_13_protectionIndicatorEffectiveDate) {
			this.pd1_13_protectionIndicatorEffectiveDate = pd1_13_protectionIndicatorEffectiveDate;
			return this;
		}
		public PD1Builder setPd1_14_placeofWorship(XON_v25 pd1_14_placeofWorship) {
			this.pd1_14_placeofWorship = pd1_14_placeofWorship;
			return this;
		}
		public PD1Builder setPd1_15_advanceDirectiveCode(CE_v2 pd1_15_advanceDirectiveCode) {
			this.pd1_15_advanceDirectiveCode = pd1_15_advanceDirectiveCode;
			return this;
		}
		public PD1Builder setPd1_16_immunizationRegistryStatus(String pd1_16_immunizationRegistryStatus) {
			this.pd1_16_immunizationRegistryStatus = pd1_16_immunizationRegistryStatus;
			return this;
		}
		public PD1Builder setPd1_17_immunizationRegistryStatusEffectiveDate(String pd1_17_immunizationRegistryStatusEffectiveDate) {
			this.pd1_17_immunizationRegistryStatusEffectiveDate = pd1_17_immunizationRegistryStatusEffectiveDate;
			return this;
		}
		public PD1Builder setPd1_18_publicityCodeEffectiveDate(String pd1_18_publicityCodeEffectiveDate) {
			this.pd1_18_publicityCodeEffectiveDate = pd1_18_publicityCodeEffectiveDate;
			return this;
		}
		public PD1Builder setPd1_19_militaryBranch(String pd1_19_militaryBranch) {
			this.pd1_19_militaryBranch = pd1_19_militaryBranch;
			return this;
		}
		public PD1Builder setPd1_20_militaryRankGrade(String pd1_20_militaryRankGrade) {
			this.pd1_20_militaryRankGrade = pd1_20_militaryRankGrade;
			return this;
		}
		public PD1Builder setPd1_21_militaryStatus(String pd1_21_militaryStatus) {
			this.pd1_21_militaryStatus = pd1_21_militaryStatus;
			return this;
		}
		public JsonPD1_v25 build() {
			return new JsonPD1_v25(this);
		}
	}

	public String getPd1_1_livingDependency() {
		return pd1_1_livingDependency;
	}
	public String getPd1_2_livingArrangement() {
		return pd1_2_livingArrangement;
	}
	public XON_v25 getPd1_3_patientPrimaryFacility() {
		return pd1_3_patientPrimaryFacility;
	}
	public XCN_v25 getPd1_4_patientPrimaryCareProviderNameandIDNo() {
		return pd1_4_patientPrimaryCareProviderNameandIDNo;
	}
	public String getPd1_5_studentIndicator() {
		return pd1_5_studentIndicator;
	}
	public String getPd1_6_handicap() {
		return pd1_6_handicap;
	}
	public String getPd1_7_livingWillCode() {
		return pd1_7_livingWillCode;
	}
	public String getPd1_8_organDonorCode() {
		return pd1_8_organDonorCode;
	}
	public String getPd1_9_separateBill() {
		return pd1_9_separateBill;
	}
	public CX_v25 getPd1_10_duplicatePatient() {
		return pd1_10_duplicatePatient;
	}
	public CE_v2 getPd1_11_publicityCode() {
		return pd1_11_publicityCode;
	}
	public String getPd1_12_protectionIndicator() {
		return pd1_12_protectionIndicator;
	}
	public String getPd1_13_protectionIndicatorEffectiveDate() {
		return pd1_13_protectionIndicatorEffectiveDate;
	}
	public XON_v25 getPd1_14_placeofWorship() {
		return pd1_14_placeofWorship;
	}
	public CE_v2 getPd1_15_advanceDirectiveCode() {
		return pd1_15_advanceDirectiveCode;
	}
	public String getPd1_16_immunizationRegistryStatus() {
		return pd1_16_immunizationRegistryStatus;
	}
	public String getPd1_17_immunizationRegistryStatusEffectiveDate() {
		return pd1_17_immunizationRegistryStatusEffectiveDate;
	}
	public String getPd1_18_publicityCodeEffectiveDate() {
		return pd1_18_publicityCodeEffectiveDate;
	}
	public String getPd1_19_militaryBranch() {
		return pd1_19_militaryBranch;
	}
	public String getPd1_20_militaryRankGrade() {
		return pd1_20_militaryRankGrade;
	}
	public String getPd1_21_militaryStatus() {
		return pd1_21_militaryStatus;
	}
	@Override
	public String toString() {
		return "JsonPD1_v25 [pd1_1_livingDependency=" + pd1_1_livingDependency + ", pd1_2_livingArrangement="
				+ pd1_2_livingArrangement + ", pd1_3_patientPrimaryFacility=" + pd1_3_patientPrimaryFacility
				+ ", pd1_4_patientPrimaryCareProviderNameandIDNo=" + pd1_4_patientPrimaryCareProviderNameandIDNo
				+ ", pd1_5_studentIndicator=" + pd1_5_studentIndicator + ", pd1_6_handicap=" + pd1_6_handicap
				+ ", pd1_7_livingWillCode=" + pd1_7_livingWillCode + ", pd1_8_organDonorCode=" + pd1_8_organDonorCode
				+ ", pd1_9_separateBill=" + pd1_9_separateBill + ", pd1_10_duplicatePatient=" + pd1_10_duplicatePatient
				+ ", pd1_11_publicityCode=" + pd1_11_publicityCode + ", pd1_12_protectionIndicator="
				+ pd1_12_protectionIndicator + ", pd1_13_protectionIndicatorEffectiveDate="
				+ pd1_13_protectionIndicatorEffectiveDate + ", pd1_14_placeofWorship=" + pd1_14_placeofWorship
				+ ", pd1_15_advanceDirectiveCode=" + pd1_15_advanceDirectiveCode
				+ ", pd1_16_immunizationRegistryStatus=" + pd1_16_immunizationRegistryStatus
				+ ", pd1_17_immunizationRegistryStatusEffectiveDate=" + pd1_17_immunizationRegistryStatusEffectiveDate
				+ ", pd1_18_publicityCodeEffectiveDate=" + pd1_18_publicityCodeEffectiveDate
				+ ", pd1_19_militaryBranch=" + pd1_19_militaryBranch + ", pd1_20_militaryRankGrade="
				+ pd1_20_militaryRankGrade + ", pd1_21_militaryStatus=" + pd1_21_militaryStatus + "]";
	}
}
