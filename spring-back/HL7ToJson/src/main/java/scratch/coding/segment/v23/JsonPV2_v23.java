package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XON_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPV2_v23 {
	@JsonProperty("pl_pv2_1_priorPendingLocation")
	private PL_v23 pl_pv2_1_priorPendingLocation;
	@JsonProperty("ce_pv2_2_accommodationCode")
	private CE_v2 ce_pv2_2_accommodationCode;
	@JsonProperty("ce_pv2_3_admitReason")
	private CE_v2 ce_pv2_3_admitReason;
	@JsonProperty("ce_pv2_4_transferReason")
	private CE_v2 ce_pv2_4_transferReason;
	@JsonProperty("pv2_5_patientValuables")
	private String[] pv2_5_patientValuables;
	@JsonProperty("pv2_6_patientValuablesLocation")
	private String pv2_6_patientValuablesLocation;
	@JsonProperty("pv2_7_visitUserCode")
	private String pv2_7_visitUserCode;
	@JsonProperty("ts_pv2_8_expectedAdmitDate")
	private TS_v2 ts_pv2_8_expectedAdmitDate;
	@JsonProperty("ts_pv2_9_expectedDischargeDate")
	private TS_v2 ts_pv2_9_expectedDischargeDate;
	@JsonProperty("pv2_10_estimatedLengthOfInpatientStay")
	private String pv2_10_estimatedLengthOfInpatientStay;
	@JsonProperty("pv2_11_actualLengthOfInpatientStay")
	private String pv2_11_actualLengthOfInpatientStay;
	@JsonProperty("pv2_12_visitDescription")
	private String pv2_12_visitDescription;
	@JsonProperty("xcn_pv2_13_referralSourceCode")
	private XCN_v23 xcn_pv2_13_referralSourceCode;
	@JsonProperty("pv2_14_previousServiceDate")
	private String pv2_14_previousServiceDate;
	@JsonProperty("pv2_15_employmentIllnessRelatedIndicator")
	private String pv2_15_employmentIllnessRelatedIndicator;
	@JsonProperty("pv2_16_purgeStatusCode")
	private String pv2_16_purgeStatusCode;
	@JsonProperty("pv2_17_purgeStatusDate")
	private String pv2_17_purgeStatusDate;
	@JsonProperty("pv2_18_specialProgramCode")
	private String pv2_18_specialProgramCode;
	@JsonProperty("pv2_19_retentionIndicator")
	private String pv2_19_retentionIndicator;
	@JsonProperty("pv2_20_expectedNumberOfInsurancePlans")
	private String pv2_20_expectedNumberOfInsurancePlans;
	@JsonProperty("pv2_21_visitPublicityCode")
	private String pv2_21_visitPublicityCode;
	@JsonProperty("pv2_22_visitProtectionIndicator")
	private String pv2_22_visitProtectionIndicator;
	@JsonProperty("xon_pv2_23_clinicOrganizationName")
	private XON_v23[] xon_pv2_23_clinicOrganizationName;
	@JsonProperty("pv2_24_patientStatusCode")
	private String pv2_24_patientStatusCode;
	@JsonProperty("pv2_25_visitPriorityCode")
	private String pv2_25_visitPriorityCode;
	@JsonProperty("pv2_26_previousTreatmentDate")
	private String pv2_26_previousTreatmentDate;
	@JsonProperty("pv2_27_expectedDischargeDisposition")
	private String pv2_27_expectedDischargeDisposition;
	@JsonProperty("pv2_28_signatureOnFileDate")
	private String pv2_28_signatureOnFileDate;
	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	private String pv2_29_firstSimilarIllnessDate;
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	private String pv2_30_patientChargeAdjustmentCode;
	@JsonProperty("pv2_31_recurringServiceCode")
	private String pv2_31_recurringServiceCode;
	@JsonProperty("pv2_32_billingMediaCode")
	private String pv2_32_billingMediaCode;
	@JsonProperty("ts_pv2_33_expectedSurgeryDateAndTime")
	private TS_v2 ts_pv2_33_expectedSurgeryDateAndTime;
	@JsonProperty("pv2_34_militaryPartnershipCode")
	private String pv2_34_militaryPartnershipCode;
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	private String pv2_35_militaryNonAvailabilityCode;
	@JsonProperty("pv2_36_newbornBabyIndicator")
	private String pv2_36_newbornBabyIndicator;
	@JsonProperty("pv2_37_babyDetainedIndicator")
	private String pv2_37_babyDetainedIndicator;
	public JsonPV2_v23() {
		super();
		this.pl_pv2_1_priorPendingLocation = new PL_v23();
		this.ce_pv2_2_accommodationCode = new CE_v2();
		this.ce_pv2_3_admitReason = new CE_v2();
		this.ce_pv2_4_transferReason = new CE_v2();
		this.pv2_5_patientValuables = new String[] {};
		this.pv2_6_patientValuablesLocation = "";
		this.pv2_7_visitUserCode = "";
		this.ts_pv2_8_expectedAdmitDate = new TS_v2();
		this.ts_pv2_9_expectedDischargeDate = new TS_v2();
		this.pv2_10_estimatedLengthOfInpatientStay = "";
		this.pv2_11_actualLengthOfInpatientStay = "";
		this.pv2_12_visitDescription = "";
		this.xcn_pv2_13_referralSourceCode = new XCN_v23();
		this.pv2_14_previousServiceDate = "";
		this.pv2_15_employmentIllnessRelatedIndicator = "";
		this.pv2_16_purgeStatusCode = "";
		this.pv2_17_purgeStatusDate = "";
		this.pv2_18_specialProgramCode = "";
		this.pv2_19_retentionIndicator = "";
		this.pv2_20_expectedNumberOfInsurancePlans = "";
		this.pv2_21_visitPublicityCode = "";
		this.pv2_22_visitProtectionIndicator = "";
		this.xon_pv2_23_clinicOrganizationName = new XON_v23[] {};
		this.pv2_24_patientStatusCode = "";
		this.pv2_25_visitPriorityCode = "";
		this.pv2_26_previousTreatmentDate = "";
		this.pv2_27_expectedDischargeDisposition = "";
		this.pv2_28_signatureOnFileDate = "";
		this.pv2_29_firstSimilarIllnessDate = "";
		this.pv2_30_patientChargeAdjustmentCode = "";
		this.pv2_31_recurringServiceCode = "";
		this.pv2_32_billingMediaCode = "";
		this.ts_pv2_33_expectedSurgeryDateAndTime = new TS_v2();
		this.pv2_34_militaryPartnershipCode = "";
		this.pv2_35_militaryNonAvailabilityCode = "";
		this.pv2_36_newbornBabyIndicator = "";
		this.pv2_37_babyDetainedIndicator = "";
	}
	private JsonPV2_v23(PV2Builder builder) {
		super();
		this.pl_pv2_1_priorPendingLocation = builder.pl_pv2_1_priorPendingLocation;
		this.ce_pv2_2_accommodationCode = builder.ce_pv2_2_accommodationCode;
		this.ce_pv2_3_admitReason = builder.ce_pv2_3_admitReason;
		this.ce_pv2_4_transferReason = builder.ce_pv2_4_transferReason;
		this.pv2_5_patientValuables = builder.pv2_5_patientValuables;
		this.pv2_6_patientValuablesLocation = builder.pv2_6_patientValuablesLocation;
		this.pv2_7_visitUserCode = builder.pv2_7_visitUserCode;
		this.ts_pv2_8_expectedAdmitDate = builder.ts_pv2_8_expectedAdmitDate;
		this.ts_pv2_9_expectedDischargeDate = builder.ts_pv2_9_expectedDischargeDate;
		this.pv2_10_estimatedLengthOfInpatientStay = builder.pv2_10_estimatedLengthOfInpatientStay;
		this.pv2_11_actualLengthOfInpatientStay = builder.pv2_11_actualLengthOfInpatientStay;
		this.pv2_12_visitDescription = builder.pv2_12_visitDescription;
		this.xcn_pv2_13_referralSourceCode = builder.xcn_pv2_13_referralSourceCode;
		this.pv2_14_previousServiceDate = builder.pv2_14_previousServiceDate;
		this.pv2_15_employmentIllnessRelatedIndicator = builder.pv2_15_employmentIllnessRelatedIndicator;
		this.pv2_16_purgeStatusCode = builder.pv2_16_purgeStatusCode;
		this.pv2_17_purgeStatusDate = builder.pv2_17_purgeStatusDate;
		this.pv2_18_specialProgramCode = builder.pv2_18_specialProgramCode;
		this.pv2_19_retentionIndicator = builder.pv2_19_retentionIndicator;
		this.pv2_20_expectedNumberOfInsurancePlans = builder.pv2_20_expectedNumberOfInsurancePlans;
		this.pv2_21_visitPublicityCode = builder.pv2_21_visitPublicityCode;
		this.pv2_22_visitProtectionIndicator = builder.pv2_22_visitProtectionIndicator;
		this.xon_pv2_23_clinicOrganizationName = builder.xon_pv2_23_clinicOrganizationName;
		this.pv2_24_patientStatusCode = builder.pv2_24_patientStatusCode;
		this.pv2_25_visitPriorityCode = builder.pv2_25_visitPriorityCode;
		this.pv2_26_previousTreatmentDate = builder.pv2_26_previousTreatmentDate;
		this.pv2_27_expectedDischargeDisposition = builder.pv2_27_expectedDischargeDisposition;
		this.pv2_28_signatureOnFileDate = builder.pv2_28_signatureOnFileDate;
		this.pv2_29_firstSimilarIllnessDate = builder.pv2_29_firstSimilarIllnessDate;
		this.pv2_30_patientChargeAdjustmentCode = builder.pv2_30_patientChargeAdjustmentCode;
		this.pv2_31_recurringServiceCode = builder.pv2_31_recurringServiceCode;
		this.pv2_32_billingMediaCode = builder.pv2_32_billingMediaCode;
		this.ts_pv2_33_expectedSurgeryDateAndTime = builder.ts_pv2_33_expectedSurgeryDateAndTime;
		this.pv2_34_militaryPartnershipCode = builder.pv2_34_militaryPartnershipCode;
		this.pv2_35_militaryNonAvailabilityCode = builder.pv2_35_militaryNonAvailabilityCode;
		this.pv2_36_newbornBabyIndicator = builder.pv2_36_newbornBabyIndicator;
		this.pv2_37_babyDetainedIndicator = builder.pv2_37_babyDetainedIndicator;
	}

	public static class PV2Builder {
		private PL_v23 pl_pv2_1_priorPendingLocation;
		private CE_v2 ce_pv2_2_accommodationCode;
		private CE_v2 ce_pv2_3_admitReason;
		private CE_v2 ce_pv2_4_transferReason;
		private String[] pv2_5_patientValuables;
		private String pv2_6_patientValuablesLocation;
		private String pv2_7_visitUserCode;
		private TS_v2 ts_pv2_8_expectedAdmitDate;
		private TS_v2 ts_pv2_9_expectedDischargeDate;
		private String pv2_10_estimatedLengthOfInpatientStay;
		private String pv2_11_actualLengthOfInpatientStay;
		private String pv2_12_visitDescription;
		private XCN_v23 xcn_pv2_13_referralSourceCode;
		private String pv2_14_previousServiceDate;
		private String pv2_15_employmentIllnessRelatedIndicator;
		private String pv2_16_purgeStatusCode;
		private String pv2_17_purgeStatusDate;
		private String pv2_18_specialProgramCode;
		private String pv2_19_retentionIndicator;
		private String pv2_20_expectedNumberOfInsurancePlans;
		private String pv2_21_visitPublicityCode;
		private String pv2_22_visitProtectionIndicator;
		private XON_v23[] xon_pv2_23_clinicOrganizationName;
		private String pv2_24_patientStatusCode;
		private String pv2_25_visitPriorityCode;
		private String pv2_26_previousTreatmentDate;
		private String pv2_27_expectedDischargeDisposition;
		private String pv2_28_signatureOnFileDate;
		private String pv2_29_firstSimilarIllnessDate;
		private String pv2_30_patientChargeAdjustmentCode;
		private String pv2_31_recurringServiceCode;
		private String pv2_32_billingMediaCode;
		private TS_v2 ts_pv2_33_expectedSurgeryDateAndTime;
		private String pv2_34_militaryPartnershipCode;
		private String pv2_35_militaryNonAvailabilityCode;
		private String pv2_36_newbornBabyIndicator;
		private String pv2_37_babyDetainedIndicator;
		public PV2Builder() {
			super();
			this.pl_pv2_1_priorPendingLocation = new PL_v23();
			this.ce_pv2_2_accommodationCode = new CE_v2();
			this.ce_pv2_3_admitReason = new CE_v2();
			this.ce_pv2_4_transferReason = new CE_v2();
			this.pv2_5_patientValuables = new String[] {};
			this.pv2_6_patientValuablesLocation = "";
			this.pv2_7_visitUserCode = "";
			this.ts_pv2_8_expectedAdmitDate = new TS_v2();
			this.ts_pv2_9_expectedDischargeDate = new TS_v2();
			this.pv2_10_estimatedLengthOfInpatientStay = "";
			this.pv2_11_actualLengthOfInpatientStay = "";
			this.pv2_12_visitDescription = "";
			this.xcn_pv2_13_referralSourceCode = new XCN_v23();
			this.pv2_14_previousServiceDate = "";
			this.pv2_15_employmentIllnessRelatedIndicator = "";
			this.pv2_16_purgeStatusCode = "";
			this.pv2_17_purgeStatusDate = "";
			this.pv2_18_specialProgramCode = "";
			this.pv2_19_retentionIndicator = "";
			this.pv2_20_expectedNumberOfInsurancePlans = "";
			this.pv2_21_visitPublicityCode = "";
			this.pv2_22_visitProtectionIndicator = "";
			this.xon_pv2_23_clinicOrganizationName = new XON_v23[] {};
			this.pv2_24_patientStatusCode = "";
			this.pv2_25_visitPriorityCode = "";
			this.pv2_26_previousTreatmentDate = "";
			this.pv2_27_expectedDischargeDisposition = "";
			this.pv2_28_signatureOnFileDate = "";
			this.pv2_29_firstSimilarIllnessDate = "";
			this.pv2_30_patientChargeAdjustmentCode = "";
			this.pv2_31_recurringServiceCode = "";
			this.pv2_32_billingMediaCode = "";
			this.ts_pv2_33_expectedSurgeryDateAndTime = new TS_v2();
			this.pv2_34_militaryPartnershipCode = "";
			this.pv2_35_militaryNonAvailabilityCode = "";
			this.pv2_36_newbornBabyIndicator = "";
			this.pv2_37_babyDetainedIndicator = "";
		}
		public PV2Builder pl_pv2_1_priorPendingLocation(PL_v23 pl_pv2_1_priorPendingLocation) {
			this.pl_pv2_1_priorPendingLocation = pl_pv2_1_priorPendingLocation;
			return this;
		}
		public PV2Builder ce_pv2_2_accommodationCode(CE_v2 ce_pv2_2_accommodationCode) {
			this.ce_pv2_2_accommodationCode = ce_pv2_2_accommodationCode;
			return this;
		}
		public PV2Builder ce_pv2_3_admitReason(CE_v2 ce_pv2_3_admitReason) {
			this.ce_pv2_3_admitReason = ce_pv2_3_admitReason;
			return this;
		}
		public PV2Builder ce_pv2_4_transferReason(CE_v2 ce_pv2_4_transferReason) {
			this.ce_pv2_4_transferReason = ce_pv2_4_transferReason;
			return this;
		}
		public PV2Builder pv2_5_patientValuables(String[] pv2_5_patientValuables) {
			this.pv2_5_patientValuables = pv2_5_patientValuables;
			return this;
		}
		public PV2Builder pv2_6_patientValuablesLocation(String pv2_6_patientValuablesLocation) {
			this.pv2_6_patientValuablesLocation = pv2_6_patientValuablesLocation;
			return this;
		}
		public PV2Builder pv2_7_visitUserCode(String pv2_7_visitUserCode) {
			this.pv2_7_visitUserCode = pv2_7_visitUserCode;
			return this;
		}
		public PV2Builder ts_pv2_8_expectedAdmitDate(TS_v2 ts_pv2_8_expectedAdmitDate) {
			this.ts_pv2_8_expectedAdmitDate = ts_pv2_8_expectedAdmitDate;
			return this;
		}
		public PV2Builder ts_pv2_9_expectedDischargeDate(TS_v2 ts_pv2_9_expectedDischargeDate) {
			this.ts_pv2_9_expectedDischargeDate = ts_pv2_9_expectedDischargeDate;
			return this;
		}
		public PV2Builder pv2_10_estimatedLengthOfInpatientStay(String pv2_10_estimatedLengthOfInpatientStay) {
			this.pv2_10_estimatedLengthOfInpatientStay = pv2_10_estimatedLengthOfInpatientStay;
			return this;
		}
		public PV2Builder pv2_11_actualLengthOfInpatientStay(String pv2_11_actualLengthOfInpatientStay) {
			this.pv2_11_actualLengthOfInpatientStay = pv2_11_actualLengthOfInpatientStay;
			return this;
		}
		public PV2Builder pv2_12_visitDescription(String pv2_12_visitDescription) {
			this.pv2_12_visitDescription = pv2_12_visitDescription;
			return this;
		}
		public PV2Builder xcn_pv2_13_referralSourceCode(XCN_v23 xcn_pv2_13_referralSourceCode) {
			this.xcn_pv2_13_referralSourceCode = xcn_pv2_13_referralSourceCode;
			return this;
		}
		public PV2Builder pv2_14_previousServiceDate(String pv2_14_previousServiceDate) {
			this.pv2_14_previousServiceDate = pv2_14_previousServiceDate;
			return this;
		}
		public PV2Builder pv2_15_employmentIllnessRelatedIndicator(String pv2_15_employmentIllnessRelatedIndicator) {
			this.pv2_15_employmentIllnessRelatedIndicator = pv2_15_employmentIllnessRelatedIndicator;
			return this;
		}
		public PV2Builder pv2_16_purgeStatusCode(String pv2_16_purgeStatusCode) {
			this.pv2_16_purgeStatusCode = pv2_16_purgeStatusCode;
			return this;
		}
		public PV2Builder pv2_17_purgeStatusDate(String pv2_17_purgeStatusDate) {
			this.pv2_17_purgeStatusDate = pv2_17_purgeStatusDate;
			return this;
		}
		public PV2Builder pv2_18_specialProgramCode(String pv2_18_specialProgramCode) {
			this.pv2_18_specialProgramCode = pv2_18_specialProgramCode;
			return this;
		}
		public PV2Builder pv2_19_retentionIndicator(String pv2_19_retentionIndicator) {
			this.pv2_19_retentionIndicator = pv2_19_retentionIndicator;
			return this;
		}
		public PV2Builder pv2_20_expectedNumberOfInsurancePlans(String pv2_20_expectedNumberOfInsurancePlans) {
			this.pv2_20_expectedNumberOfInsurancePlans = pv2_20_expectedNumberOfInsurancePlans;
			return this;
		}
		public PV2Builder pv2_21_visitPublicityCode(String pv2_21_visitPublicityCode) {
			this.pv2_21_visitPublicityCode = pv2_21_visitPublicityCode;
			return this;
		}
		public PV2Builder pv2_22_visitProtectionIndicator(String pv2_22_visitProtectionIndicator) {
			this.pv2_22_visitProtectionIndicator = pv2_22_visitProtectionIndicator;
			return this;
		}
		public PV2Builder xon_pv2_23_clinicOrganizationName(XON_v23[] xon_pv2_23_clinicOrganizationName) {
			this.xon_pv2_23_clinicOrganizationName = xon_pv2_23_clinicOrganizationName;
			return this;
		}
		public PV2Builder pv2_24_patientStatusCode(String pv2_24_patientStatusCode) {
			this.pv2_24_patientStatusCode = pv2_24_patientStatusCode;
			return this;
		}
		public PV2Builder pv2_25_visitPriorityCode(String pv2_25_visitPriorityCode) {
			this.pv2_25_visitPriorityCode = pv2_25_visitPriorityCode;
			return this;
		}
		public PV2Builder pv2_26_previousTreatmentDate(String pv2_26_previousTreatmentDate) {
			this.pv2_26_previousTreatmentDate = pv2_26_previousTreatmentDate;
			return this;
		}
		public PV2Builder pv2_27_expectedDischargeDisposition(String pv2_27_expectedDischargeDisposition) {
			this.pv2_27_expectedDischargeDisposition = pv2_27_expectedDischargeDisposition;
			return this;
		}
		public PV2Builder pv2_28_signatureOnFileDate(String pv2_28_signatureOnFileDate) {
			this.pv2_28_signatureOnFileDate = pv2_28_signatureOnFileDate;
			return this;
		}
		public PV2Builder pv2_29_firstSimilarIllnessDate(String pv2_29_firstSimilarIllnessDate) {
			this.pv2_29_firstSimilarIllnessDate = pv2_29_firstSimilarIllnessDate;
			return this;
		}
		public PV2Builder pv2_30_patientChargeAdjustmentCode(String pv2_30_patientChargeAdjustmentCode) {
			this.pv2_30_patientChargeAdjustmentCode = pv2_30_patientChargeAdjustmentCode;
			return this;
		}
		public PV2Builder pv2_31_recurringServiceCode(String pv2_31_recurringServiceCode) {
			this.pv2_31_recurringServiceCode = pv2_31_recurringServiceCode;
			return this;
		}
		public PV2Builder pv2_32_billingMediaCode(String pv2_32_billingMediaCode) {
			this.pv2_32_billingMediaCode = pv2_32_billingMediaCode;
			return this;
		}
		public PV2Builder ts_pv2_33_expectedSurgeryDateAndTime(TS_v2 ts_pv2_33_expectedSurgeryDateAndTime) {
			this.ts_pv2_33_expectedSurgeryDateAndTime = ts_pv2_33_expectedSurgeryDateAndTime;
			return this;
		}
		public PV2Builder pv2_34_militaryPartnershipCode(String pv2_34_militaryPartnershipCode) {
			this.pv2_34_militaryPartnershipCode = pv2_34_militaryPartnershipCode;
			return this;
		}
		public PV2Builder pv2_35_militaryNonAvailabilityCode(String pv2_35_militaryNonAvailabilityCode) {
			this.pv2_35_militaryNonAvailabilityCode = pv2_35_militaryNonAvailabilityCode;
			return this;
		}
		public PV2Builder pv2_36_newbornBabyIndicator(String pv2_36_newbornBabyIndicator) {
			this.pv2_36_newbornBabyIndicator = pv2_36_newbornBabyIndicator;
			return this;
		}
		public PV2Builder pv2_37_babyDetainedIndicator(String pv2_37_babyDetainedIndicator) {
			this.pv2_37_babyDetainedIndicator = pv2_37_babyDetainedIndicator;
			return this;
		}
		public JsonPV2_v23 build() {
			return new JsonPV2_v23(this);
		}
	}

	public PL_v23 getPl_pv2_1_priorPendingLocation() {
		return pl_pv2_1_priorPendingLocation;
	}

	public CE_v2 getCe_pv2_2_accommodationCode() {
		return ce_pv2_2_accommodationCode;
	}

	public CE_v2 getCe_pv2_3_admitReason() {
		return ce_pv2_3_admitReason;
	}

	public CE_v2 getCe_pv2_4_transferReason() {
		return ce_pv2_4_transferReason;
	}

	public String[] getPv2_5_patientValuables() {
		return pv2_5_patientValuables;
	}

	public String getPv2_6_patientValuablesLocation() {
		return pv2_6_patientValuablesLocation;
	}

	public String getPv2_7_visitUserCode() {
		return pv2_7_visitUserCode;
	}

	public TS_v2 getTs_pv2_8_expectedAdmitDate() {
		return ts_pv2_8_expectedAdmitDate;
	}

	public TS_v2 getTs_pv2_9_expectedDischargeDate() {
		return ts_pv2_9_expectedDischargeDate;
	}

	public String getPv2_10_estimatedLengthOfInpatientStay() {
		return pv2_10_estimatedLengthOfInpatientStay;
	}

	public String getPv2_11_actualLengthOfInpatientStay() {
		return pv2_11_actualLengthOfInpatientStay;
	}

	public String getPv2_12_visitDescription() {
		return pv2_12_visitDescription;
	}

	public XCN_v23 getXcn_pv2_13_referralSourceCode() {
		return xcn_pv2_13_referralSourceCode;
	}

	public String getPv2_14_previousServiceDate() {
		return pv2_14_previousServiceDate;
	}

	public String getPv2_15_employmentIllnessRelatedIndicator() {
		return pv2_15_employmentIllnessRelatedIndicator;
	}

	public String getPv2_16_purgeStatusCode() {
		return pv2_16_purgeStatusCode;
	}

	public String getPv2_17_purgeStatusDate() {
		return pv2_17_purgeStatusDate;
	}

	public String getPv2_18_specialProgramCode() {
		return pv2_18_specialProgramCode;
	}

	public String getPv2_19_retentionIndicator() {
		return pv2_19_retentionIndicator;
	}

	public String getPv2_20_expectedNumberOfInsurancePlans() {
		return pv2_20_expectedNumberOfInsurancePlans;
	}

	public String getPv2_21_visitPublicityCode() {
		return pv2_21_visitPublicityCode;
	}

	public String getPv2_22_visitProtectionIndicator() {
		return pv2_22_visitProtectionIndicator;
	}

	public XON_v23[] getXon_pv2_23_clinicOrganizationName() {
		return xon_pv2_23_clinicOrganizationName;
	}

	public String getPv2_24_patientStatusCode() {
		return pv2_24_patientStatusCode;
	}

	public String getPv2_25_visitPriorityCode() {
		return pv2_25_visitPriorityCode;
	}

	public String getPv2_26_previousTreatmentDate() {
		return pv2_26_previousTreatmentDate;
	}

	public String getPv2_27_expectedDischargeDisposition() {
		return pv2_27_expectedDischargeDisposition;
	}

	public String getPv2_28_signatureOnFileDate() {
		return pv2_28_signatureOnFileDate;
	}

	public String getPv2_29_firstSimilarIllnessDate() {
		return pv2_29_firstSimilarIllnessDate;
	}

	public String getPv2_30_patientChargeAdjustmentCode() {
		return pv2_30_patientChargeAdjustmentCode;
	}

	public String getPv2_31_recurringServiceCode() {
		return pv2_31_recurringServiceCode;
	}

	public String getPv2_32_billingMediaCode() {
		return pv2_32_billingMediaCode;
	}

	public TS_v2 getTs_pv2_33_expectedSurgeryDateAndTime() {
		return ts_pv2_33_expectedSurgeryDateAndTime;
	}

	public String getPv2_34_militaryPartnershipCode() {
		return pv2_34_militaryPartnershipCode;
	}

	public String getPv2_35_militaryNonAvailabilityCode() {
		return pv2_35_militaryNonAvailabilityCode;
	}

	public String getPv2_36_newbornBabyIndicator() {
		return pv2_36_newbornBabyIndicator;
	}

	public String getPv2_37_babyDetainedIndicator() {
		return pv2_37_babyDetainedIndicator;
	}

	@Override
	public String toString() {
		return "JsonPV2_v23 [pl_pv2_1_priorPendingLocation=" + pl_pv2_1_priorPendingLocation
				+ ", ce_pv2_2_accommodationCode=" + ce_pv2_2_accommodationCode + ", ce_pv2_3_admitReason="
				+ ce_pv2_3_admitReason + ", ce_pv2_4_transferReason=" + ce_pv2_4_transferReason
				+ ", pv2_5_patientValuables=" + Arrays.toString(pv2_5_patientValuables)
				+ ", pv2_6_patientValuablesLocation=" + pv2_6_patientValuablesLocation + ", pv2_7_visitUserCode="
				+ pv2_7_visitUserCode + ", ts_pv2_8_expectedAdmitDate=" + ts_pv2_8_expectedAdmitDate
				+ ", ts_pv2_9_expectedDischargeDate=" + ts_pv2_9_expectedDischargeDate
				+ ", pv2_10_estimatedLengthOfInpatientStay=" + pv2_10_estimatedLengthOfInpatientStay
				+ ", pv2_11_actualLengthOfInpatientStay=" + pv2_11_actualLengthOfInpatientStay
				+ ", pv2_12_visitDescription=" + pv2_12_visitDescription + ", xcn_pv2_13_referralSourceCode="
				+ xcn_pv2_13_referralSourceCode + ", pv2_14_previousServiceDate=" + pv2_14_previousServiceDate
				+ ", pv2_15_employmentIllnessRelatedIndicator=" + pv2_15_employmentIllnessRelatedIndicator
				+ ", pv2_16_purgeStatusCode=" + pv2_16_purgeStatusCode + ", pv2_17_purgeStatusDate="
				+ pv2_17_purgeStatusDate + ", pv2_18_specialProgramCode=" + pv2_18_specialProgramCode
				+ ", pv2_19_retentionIndicator=" + pv2_19_retentionIndicator
				+ ", pv2_20_expectedNumberOfInsurancePlans=" + pv2_20_expectedNumberOfInsurancePlans
				+ ", pv2_21_visitPublicityCode=" + pv2_21_visitPublicityCode + ", pv2_22_visitProtectionIndicator="
				+ pv2_22_visitProtectionIndicator + ", xon_pv2_23_clinicOrganizationName="
				+ Arrays.toString(xon_pv2_23_clinicOrganizationName) + ", pv2_24_patientStatusCode="
				+ pv2_24_patientStatusCode + ", pv2_25_visitPriorityCode=" + pv2_25_visitPriorityCode
				+ ", pv2_26_previousTreatmentDate=" + pv2_26_previousTreatmentDate
				+ ", pv2_27_expectedDischargeDisposition=" + pv2_27_expectedDischargeDisposition
				+ ", pv2_28_signatureOnFileDate=" + pv2_28_signatureOnFileDate + ", pv2_29_firstSimilarIllnessDate="
				+ pv2_29_firstSimilarIllnessDate + ", pv2_30_patientChargeAdjustmentCode="
				+ pv2_30_patientChargeAdjustmentCode + ", pv2_31_recurringServiceCode=" + pv2_31_recurringServiceCode
				+ ", pv2_32_billingMediaCode=" + pv2_32_billingMediaCode + ", ts_pv2_33_expectedSurgeryDateAndTime="
				+ ts_pv2_33_expectedSurgeryDateAndTime + ", pv2_34_militaryPartnershipCode="
				+ pv2_34_militaryPartnershipCode + ", pv2_35_militaryNonAvailabilityCode="
				+ pv2_35_militaryNonAvailabilityCode + ", pv2_36_newbornBabyIndicator=" + pv2_36_newbornBabyIndicator
				+ ", pv2_37_babyDetainedIndicator=" + pv2_37_babyDetainedIndicator + "]";
	}
}
