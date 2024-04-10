package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPV2_v25 {
	@JsonProperty("pv2_1_priorPendingLocation")
	private PL_v25 pv2_1_priorPendingLocation;
	@JsonProperty("pv2_2_accommodationCode")
	private CE_v2 pv2_2_accommodationCode;
	@JsonProperty("pv2_3_admitReason")
	private CE_v2 pv2_3_admitReason;
	@JsonProperty("pv2_4transferReason")
	private CE_v2 pv2_4transferReason;
	@JsonProperty("pv2_5_patientValuables")
	private String[] pv2_5_patientValuables;
	@JsonProperty("pv2_6_patientValuablesLocation")
	private String pv2_6_patientValuablesLocation;
	@JsonProperty("pv2_7_visitUserCode")
	private String[] pv2_7_visitUserCode;
	@JsonProperty("pv2_8_expectedAdmitDateTime")
	private TS_v2 pv2_8_expectedAdmitDateTime;
	@JsonProperty("pv2_9_expectedDischargeDateTime")
	private TS_v2 pv2_9_expectedDischargeDateTime;
	@JsonProperty("pv2_10_estimatedLengthofInpatientStay")
	private String pv2_10_estimatedLengthofInpatientStay;
	@JsonProperty("pv2_11_actualLengthofInpatientStay")
	private String pv2_11_actualLengthofInpatientStay;
	@JsonProperty("pv2_12_visitDescription")
	private String pv2_12_visitDescription;
	@JsonProperty("pv2_13_referralSourceCode")
	private XCN_v25[] pv2_13_referralSourceCode;
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
	@JsonProperty("pv2_20_expectedNumberofInsurancePlans")
	private String pv2_20_expectedNumberofInsurancePlans;
	@JsonProperty("pv2_21_visitPublicityCode")
	private String pv2_21_visitPublicityCode;
	@JsonProperty("pv2_22_visitProtectionIndicator")
	private String pv2_22_visitProtectionIndicator;
	@JsonProperty("pv2_23_clinicOrganizationName")
	private XON_v25[] pv2_23_clinicOrganizationName;
	@JsonProperty("pv2_24_patientStatusCode")
	private String pv2_24_patientStatusCode;
	@JsonProperty("pv2_25_visitPriorityCode")
	private String pv2_25_visitPriorityCode;
	@JsonProperty("pv2_26_previousTreatmentDate")
	private String pv2_26_previousTreatmentDate;
	@JsonProperty("pv2_27_expectedDischargeDisposition")
	private String pv2_27_expectedDischargeDisposition;
	@JsonProperty("pv2_28_signatureonFileDate")
	private String pv2_28_signatureonFileDate;
	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	private String pv2_29_firstSimilarIllnessDate;
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	private CE_v2 pv2_30_patientChargeAdjustmentCode;
	@JsonProperty("pv2_31_recurringServiceCode")
	private String pv2_31_recurringServiceCode;
	@JsonProperty("pv2_32_billingMediaCode")
	private String pv2_32_billingMediaCode;
	@JsonProperty("pv2_33_expectedSurgeryDateandTime")
	private TS_v2 pv2_33_expectedSurgeryDateandTime;
	@JsonProperty("pv2_34_militaryPartnershipCode")
	private String pv2_34_militaryPartnershipCode;
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	private String pv2_35_militaryNonAvailabilityCode;
	@JsonProperty("pv2_36_newbornBabyIndicator")
	private String pv2_36_newbornBabyIndicator;
	@JsonProperty("pv2_37_babyDetainedIndicator")
	private String pv2_37_babyDetainedIndicator;
	@JsonProperty("pv2_38_modeofArrivalCode")
	private CE_v2 pv2_38_modeofArrivalCode;
	@JsonProperty("pv2_39_recreationalDrugUseCode")
	private CE_v2[] pv2_39_recreationalDrugUseCode;
	@JsonProperty("pv2_40_admissionLevelofCareCode")
	private CE_v2 pv2_40_admissionLevelofCareCode;
	@JsonProperty("pv2_41_precautionCode")
	private CE_v2[] pv2_41_precautionCode;
	@JsonProperty("pv2_42_patientConditionCode")
	private CE_v2 pv2_42_patientConditionCode;
	@JsonProperty("pv2_43_livingWillCode")
	private String pv2_43_livingWillCode;
	@JsonProperty("pv2_44_organDonorCode")
	private String pv2_44_organDonorCode;
	@JsonProperty("pv2_45_advanceDirectiveCode")
	private CE_v2[] pv2_45_advanceDirectiveCode;
	@JsonProperty("pv2_46_patientStatusEffectiveDate")
	private String pv2_46_patientStatusEffectiveDate;
	@JsonProperty("pv2_47_expectedLOAReturnDateTime")
	private TS_v2 pv2_47_expectedLOAReturnDateTime;
	@JsonProperty("pv2_48_expectedPreadmissionTestingDateTime")
	private TS_v2 pv2_48_expectedPreadmissionTestingDateTime;
	@JsonProperty("pv2_49_notifyClergyCode")
	private String[] pv2_49_notifyClergyCode;
	public JsonPV2_v25(PV2Builder builder) {
		super();
		this.pv2_1_priorPendingLocation = builder.pv2_1_priorPendingLocation;
		this.pv2_2_accommodationCode = builder.pv2_2_accommodationCode;
		this.pv2_3_admitReason = builder.pv2_3_admitReason;
		this.pv2_4transferReason = builder.pv2_4transferReason;
		this.pv2_5_patientValuables = builder.pv2_5_patientValuables;
		this.pv2_6_patientValuablesLocation = builder.pv2_6_patientValuablesLocation;
		this.pv2_7_visitUserCode = builder.pv2_7_visitUserCode;
		this.pv2_8_expectedAdmitDateTime = builder.pv2_8_expectedAdmitDateTime;
		this.pv2_9_expectedDischargeDateTime = builder.pv2_9_expectedDischargeDateTime;
		this.pv2_10_estimatedLengthofInpatientStay = builder.pv2_10_estimatedLengthofInpatientStay;
		this.pv2_11_actualLengthofInpatientStay = builder.pv2_11_actualLengthofInpatientStay;
		this.pv2_12_visitDescription = builder.pv2_12_visitDescription;
		this.pv2_13_referralSourceCode = builder.pv2_13_referralSourceCode;
		this.pv2_14_previousServiceDate = builder.pv2_14_previousServiceDate;
		this.pv2_15_employmentIllnessRelatedIndicator = builder.pv2_15_employmentIllnessRelatedIndicator;
		this.pv2_16_purgeStatusCode = builder.pv2_16_purgeStatusCode;
		this.pv2_17_purgeStatusDate = builder.pv2_17_purgeStatusDate;
		this.pv2_18_specialProgramCode = builder.pv2_18_specialProgramCode;
		this.pv2_19_retentionIndicator = builder.pv2_19_retentionIndicator;
		this.pv2_20_expectedNumberofInsurancePlans = builder.pv2_20_expectedNumberofInsurancePlans;
		this.pv2_21_visitPublicityCode = builder.pv2_21_visitPublicityCode;
		this.pv2_22_visitProtectionIndicator = builder.pv2_22_visitProtectionIndicator;
		this.pv2_23_clinicOrganizationName = builder.pv2_23_clinicOrganizationName;
		this.pv2_24_patientStatusCode = builder.pv2_24_patientStatusCode;
		this.pv2_25_visitPriorityCode = builder.pv2_25_visitPriorityCode;
		this.pv2_26_previousTreatmentDate = builder.pv2_26_previousTreatmentDate;
		this.pv2_27_expectedDischargeDisposition = builder.pv2_27_expectedDischargeDisposition;
		this.pv2_28_signatureonFileDate = builder.pv2_28_signatureonFileDate;
		this.pv2_29_firstSimilarIllnessDate = builder.pv2_29_firstSimilarIllnessDate;
		this.pv2_30_patientChargeAdjustmentCode = builder.pv2_30_patientChargeAdjustmentCode;
		this.pv2_31_recurringServiceCode = builder.pv2_31_recurringServiceCode;
		this.pv2_32_billingMediaCode = builder.pv2_32_billingMediaCode;
		this.pv2_33_expectedSurgeryDateandTime = builder.pv2_33_expectedSurgeryDateandTime;
		this.pv2_34_militaryPartnershipCode = builder.pv2_34_militaryPartnershipCode;
		this.pv2_35_militaryNonAvailabilityCode = builder.pv2_35_militaryNonAvailabilityCode;
		this.pv2_36_newbornBabyIndicator = builder.pv2_36_newbornBabyIndicator;
		this.pv2_37_babyDetainedIndicator = builder.pv2_37_babyDetainedIndicator;
		this.pv2_38_modeofArrivalCode = builder.pv2_38_modeofArrivalCode;
		this.pv2_39_recreationalDrugUseCode = builder.pv2_39_recreationalDrugUseCode;
		this.pv2_40_admissionLevelofCareCode = builder.pv2_40_admissionLevelofCareCode;
		this.pv2_41_precautionCode = builder.pv2_41_precautionCode;
		this.pv2_42_patientConditionCode = builder.pv2_42_patientConditionCode;
		this.pv2_43_livingWillCode = builder.pv2_43_livingWillCode;
		this.pv2_44_organDonorCode = builder.pv2_44_organDonorCode;
		this.pv2_45_advanceDirectiveCode = builder.pv2_45_advanceDirectiveCode;
		this.pv2_46_patientStatusEffectiveDate = builder.pv2_46_patientStatusEffectiveDate;
		this.pv2_47_expectedLOAReturnDateTime = builder.pv2_47_expectedLOAReturnDateTime;
		this.pv2_48_expectedPreadmissionTestingDateTime = builder.pv2_48_expectedPreadmissionTestingDateTime;
		this.pv2_49_notifyClergyCode = builder.pv2_49_notifyClergyCode;
	} 
	public static class PV2Builder {
		private PL_v25 pv2_1_priorPendingLocation;
		private CE_v2 pv2_2_accommodationCode;
		private CE_v2 pv2_3_admitReason;
		private CE_v2 pv2_4transferReason;
		private String[] pv2_5_patientValuables;
		private String pv2_6_patientValuablesLocation;
		private String[] pv2_7_visitUserCode;
		private TS_v2 pv2_8_expectedAdmitDateTime;
		private TS_v2 pv2_9_expectedDischargeDateTime;
		private String pv2_10_estimatedLengthofInpatientStay;
		private String pv2_11_actualLengthofInpatientStay;
		private String pv2_12_visitDescription;
		private XCN_v25[] pv2_13_referralSourceCode;
		private String pv2_14_previousServiceDate;
		private String pv2_15_employmentIllnessRelatedIndicator;
		private String pv2_16_purgeStatusCode;
		private String pv2_17_purgeStatusDate;
		private String pv2_18_specialProgramCode;
		private String pv2_19_retentionIndicator;
		private String pv2_20_expectedNumberofInsurancePlans;
		private String pv2_21_visitPublicityCode;
		private String pv2_22_visitProtectionIndicator;
		private XON_v25[] pv2_23_clinicOrganizationName;
		private String pv2_24_patientStatusCode;
		private String pv2_25_visitPriorityCode;
		private String pv2_26_previousTreatmentDate;
		private String pv2_27_expectedDischargeDisposition;
		private String pv2_28_signatureonFileDate;
		private String pv2_29_firstSimilarIllnessDate;
		private CE_v2 pv2_30_patientChargeAdjustmentCode;
		private String pv2_31_recurringServiceCode;
		private String pv2_32_billingMediaCode;
		private TS_v2 pv2_33_expectedSurgeryDateandTime;
		private String pv2_34_militaryPartnershipCode;
		private String pv2_35_militaryNonAvailabilityCode;
		private String pv2_36_newbornBabyIndicator;
		private String pv2_37_babyDetainedIndicator;
		private CE_v2 pv2_38_modeofArrivalCode;
		private CE_v2[] pv2_39_recreationalDrugUseCode;
		private CE_v2 pv2_40_admissionLevelofCareCode;
		private CE_v2[] pv2_41_precautionCode;
		private CE_v2 pv2_42_patientConditionCode;
		private String pv2_43_livingWillCode;
		private String pv2_44_organDonorCode;
		private CE_v2[] pv2_45_advanceDirectiveCode;
		private String pv2_46_patientStatusEffectiveDate;
		private TS_v2 pv2_47_expectedLOAReturnDateTime;
		private TS_v2 pv2_48_expectedPreadmissionTestingDateTime;
		private String[] pv2_49_notifyClergyCode;
		public PV2Builder() {
			super();
			this.pv2_1_priorPendingLocation = new PL_v25();
			this.pv2_2_accommodationCode = new CE_v2();
			this.pv2_3_admitReason = new CE_v2();
			this.pv2_4transferReason = new CE_v2();
			this.pv2_5_patientValuables = new String[] {};
			this.pv2_6_patientValuablesLocation = "";
			this.pv2_7_visitUserCode = new String[] {};
			this.pv2_8_expectedAdmitDateTime = new TS_v2();
			this.pv2_9_expectedDischargeDateTime = new TS_v2();
			this.pv2_10_estimatedLengthofInpatientStay = "";
			this.pv2_11_actualLengthofInpatientStay = "";
			this.pv2_12_visitDescription = "";
			this.pv2_13_referralSourceCode = new XCN_v25[] {};
			this.pv2_14_previousServiceDate = "";
			this.pv2_15_employmentIllnessRelatedIndicator = "";
			this.pv2_16_purgeStatusCode = "";
			this.pv2_17_purgeStatusDate = "";
			this.pv2_18_specialProgramCode = "";
			this.pv2_19_retentionIndicator = "";
			this.pv2_20_expectedNumberofInsurancePlans = "";
			this.pv2_21_visitPublicityCode = "";
			this.pv2_22_visitProtectionIndicator = "";
			this.pv2_23_clinicOrganizationName = new XON_v25[] {};
			this.pv2_24_patientStatusCode = "";
			this.pv2_25_visitPriorityCode = "";
			this.pv2_26_previousTreatmentDate = "";
			this.pv2_27_expectedDischargeDisposition = "";
			this.pv2_28_signatureonFileDate = "";
			this.pv2_29_firstSimilarIllnessDate = "";
			this.pv2_30_patientChargeAdjustmentCode = new CE_v2();
			this.pv2_31_recurringServiceCode = "";
			this.pv2_32_billingMediaCode = "";
			this.pv2_33_expectedSurgeryDateandTime = new TS_v2();
			this.pv2_34_militaryPartnershipCode = "";
			this.pv2_35_militaryNonAvailabilityCode = "";
			this.pv2_36_newbornBabyIndicator = "";
			this.pv2_37_babyDetainedIndicator = "";
			this.pv2_38_modeofArrivalCode = new CE_v2();
			this.pv2_39_recreationalDrugUseCode = new CE_v2[] {};
			this.pv2_40_admissionLevelofCareCode = new CE_v2();
			this.pv2_41_precautionCode = new CE_v2[] {};
			this.pv2_42_patientConditionCode = new CE_v2();
			this.pv2_43_livingWillCode = "";
			this.pv2_44_organDonorCode = "";
			this.pv2_45_advanceDirectiveCode = new CE_v2[] {};
			this.pv2_46_patientStatusEffectiveDate = "";
			this.pv2_47_expectedLOAReturnDateTime = new TS_v2();
			this.pv2_48_expectedPreadmissionTestingDateTime = new TS_v2();
			this.pv2_49_notifyClergyCode = new String[] {};
		}
		public PV2Builder pv2_1_priorPendingLocation(PL_v25 pv2_1_priorPendingLocation) {
			this.pv2_1_priorPendingLocation = pv2_1_priorPendingLocation;
			return this;
		}
		public PV2Builder pv2_2_accommodationCode(CE_v2 pv2_2_accommodationCode) {
			this.pv2_2_accommodationCode = pv2_2_accommodationCode;
			return this;
		}
		public PV2Builder pv2_3_admitReason(CE_v2 pv2_3_admitReason) {
			this.pv2_3_admitReason = pv2_3_admitReason;
			return this;
		}
		public PV2Builder pv2_4transferReason(CE_v2 pv2_4transferReason) {
			this.pv2_4transferReason = pv2_4transferReason;
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
		public PV2Builder pv2_7_visitUserCode(String[] pv2_7_visitUserCode) {
			this.pv2_7_visitUserCode = pv2_7_visitUserCode;
			return this;
		}
		public PV2Builder pv2_8_expectedAdmitDateTime(TS_v2 pv2_8_expectedAdmitDateTime) {
			this.pv2_8_expectedAdmitDateTime = pv2_8_expectedAdmitDateTime;
			return this;
		}
		public PV2Builder pv2_9_expectedDischargeDateTime(TS_v2 pv2_9_expectedDischargeDateTime) {
			this.pv2_9_expectedDischargeDateTime = pv2_9_expectedDischargeDateTime;
			return this;
		}
		public PV2Builder pv2_10_estimatedLengthofInpatientStay(String pv2_10_estimatedLengthofInpatientStay) {
			this.pv2_10_estimatedLengthofInpatientStay = pv2_10_estimatedLengthofInpatientStay;
			return this;
		}
		public PV2Builder pv2_11_actualLengthofInpatientStay(String pv2_11_actualLengthofInpatientStay) {
			this.pv2_11_actualLengthofInpatientStay = pv2_11_actualLengthofInpatientStay;
			return this;
		}
		public PV2Builder pv2_12_visitDescription(String pv2_12_visitDescription) {
			this.pv2_12_visitDescription = pv2_12_visitDescription;
			return this;
		}
		public PV2Builder pv2_13_referralSourceCode(XCN_v25[] pv2_13_referralSourceCode) {
			this.pv2_13_referralSourceCode = pv2_13_referralSourceCode;
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
		public PV2Builder pv2_20_expectedNumberofInsurancePlans(String pv2_20_expectedNumberofInsurancePlans) {
			this.pv2_20_expectedNumberofInsurancePlans = pv2_20_expectedNumberofInsurancePlans;
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
		public PV2Builder pv2_23_clinicOrganizationName(XON_v25[] pv2_23_clinicOrganizationName) {
			this.pv2_23_clinicOrganizationName = pv2_23_clinicOrganizationName;
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
		public PV2Builder pv2_28_signatureonFileDate(String pv2_28_signatureonFileDate) {
			this.pv2_28_signatureonFileDate = pv2_28_signatureonFileDate;
			return this;
		}
		public PV2Builder pv2_29_firstSimilarIllnessDate(String pv2_29_firstSimilarIllnessDate) {
			this.pv2_29_firstSimilarIllnessDate = pv2_29_firstSimilarIllnessDate;
			return this;
		}
		public PV2Builder pv2_30_patientChargeAdjustmentCode(CE_v2 pv2_30_patientChargeAdjustmentCode) {
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
		public PV2Builder pv2_33_expectedSurgeryDateandTime(TS_v2 pv2_33_expectedSurgeryDateandTime) {
			this.pv2_33_expectedSurgeryDateandTime = pv2_33_expectedSurgeryDateandTime;
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
		public PV2Builder pv2_38_modeofArrivalCode(CE_v2 pv2_38_modeofArrivalCode) {
			this.pv2_38_modeofArrivalCode = pv2_38_modeofArrivalCode;
			return this;
		}
		public PV2Builder pv2_39_recreationalDrugUseCode(CE_v2[] pv2_39_recreationalDrugUseCode) {
			this.pv2_39_recreationalDrugUseCode = pv2_39_recreationalDrugUseCode;
			return this;
		}
		public PV2Builder pv2_40_admissionLevelofCareCode(CE_v2 pv2_40_admissionLevelofCareCode) {
			this.pv2_40_admissionLevelofCareCode = pv2_40_admissionLevelofCareCode;
			return this;
		}
		public PV2Builder pv2_41_precautionCode(CE_v2[] pv2_41_precautionCode) {
			this.pv2_41_precautionCode = pv2_41_precautionCode;
			return this;
		}
		public PV2Builder pv2_42_patientConditionCode(CE_v2 pv2_42_patientConditionCode) {
			this.pv2_42_patientConditionCode = pv2_42_patientConditionCode;
			return this;
		}
		public PV2Builder pv2_43_livingWillCode(String pv2_43_livingWillCode) {
			this.pv2_43_livingWillCode = pv2_43_livingWillCode;
			return this;
		}
		public PV2Builder pv2_44_organDonorCode(String pv2_44_organDonorCode) {
			this.pv2_44_organDonorCode = pv2_44_organDonorCode;
			return this;
		}
		public PV2Builder pv2_45_advanceDirectiveCode(CE_v2[] pv2_45_advanceDirectiveCode) {
			this.pv2_45_advanceDirectiveCode = pv2_45_advanceDirectiveCode;
			return this;
		}
		public PV2Builder pv2_46_patientStatusEffectiveDate(String pv2_46_patientStatusEffectiveDate) {
			this.pv2_46_patientStatusEffectiveDate = pv2_46_patientStatusEffectiveDate;
			return this;
		}
		public PV2Builder pv2_47_expectedLOAReturnDateTime(TS_v2 pv2_47_expectedLOAReturnDateTime) {
			this.pv2_47_expectedLOAReturnDateTime = pv2_47_expectedLOAReturnDateTime;
			return this;
		}
		public PV2Builder pv2_48_expectedPreadmissionTestingDateTime(TS_v2 pv2_48_expectedPreadmissionTestingDateTime) {
			this.pv2_48_expectedPreadmissionTestingDateTime = pv2_48_expectedPreadmissionTestingDateTime;
			return this;
		}
		public PV2Builder pv2_49_notifyClergyCode(String[] pv2_49_notifyClergyCode) {
			this.pv2_49_notifyClergyCode = pv2_49_notifyClergyCode;
			return this;
		}
		public JsonPV2_v25 build() {
			return new JsonPV2_v25(this);
		}
	}
	public PL_v25 getPv2_1_priorPendingLocation() {
		return pv2_1_priorPendingLocation;
	}
	public CE_v2 getPv2_2_accommodationCode() {
		return pv2_2_accommodationCode;
	}
	public CE_v2 getPv2_3_admitReason() {
		return pv2_3_admitReason;
	}
	public CE_v2 getPv2_4transferReason() {
		return pv2_4transferReason;
	}
	public String[] getPv2_5_patientValuables() {
		return pv2_5_patientValuables;
	}
	public String getPv2_6_patientValuablesLocation() {
		return pv2_6_patientValuablesLocation;
	}
	public String[] getPv2_7_visitUserCode() {
		return pv2_7_visitUserCode;
	}
	public TS_v2 getPv2_8_expectedAdmitDateTime() {
		return pv2_8_expectedAdmitDateTime;
	}
	public TS_v2 getPv2_9_expectedDischargeDateTime() {
		return pv2_9_expectedDischargeDateTime;
	}
	public String getPv2_10_estimatedLengthofInpatientStay() {
		return pv2_10_estimatedLengthofInpatientStay;
	}
	public String getPv2_11_actualLengthofInpatientStay() {
		return pv2_11_actualLengthofInpatientStay;
	}
	public String getPv2_12_visitDescription() {
		return pv2_12_visitDescription;
	}
	public XCN_v25[] getPv2_13_referralSourceCode() {
		return pv2_13_referralSourceCode;
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
	public String getPv2_20_expectedNumberofInsurancePlans() {
		return pv2_20_expectedNumberofInsurancePlans;
	}
	public String getPv2_21_visitPublicityCode() {
		return pv2_21_visitPublicityCode;
	}
	public String getPv2_22_visitProtectionIndicator() {
		return pv2_22_visitProtectionIndicator;
	}
	public XON_v25[] getPv2_23_clinicOrganizationName() {
		return pv2_23_clinicOrganizationName;
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
	public String getPv2_28_signatureonFileDate() {
		return pv2_28_signatureonFileDate;
	}
	public String getPv2_29_firstSimilarIllnessDate() {
		return pv2_29_firstSimilarIllnessDate;
	}
	public CE_v2 getPv2_30_patientChargeAdjustmentCode() {
		return pv2_30_patientChargeAdjustmentCode;
	}
	public String getPv2_31_recurringServiceCode() {
		return pv2_31_recurringServiceCode;
	}
	public String getPv2_32_billingMediaCode() {
		return pv2_32_billingMediaCode;
	}
	public TS_v2 getPv2_33_expectedSurgeryDateandTime() {
		return pv2_33_expectedSurgeryDateandTime;
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
	public CE_v2 getPv2_38_modeofArrivalCode() {
		return pv2_38_modeofArrivalCode;
	}
	public CE_v2[] getPv2_39_recreationalDrugUseCode() {
		return pv2_39_recreationalDrugUseCode;
	}
	public CE_v2 getPv2_40_admissionLevelofCareCode() {
		return pv2_40_admissionLevelofCareCode;
	}
	public CE_v2[] getPv2_41_precautionCode() {
		return pv2_41_precautionCode;
	}
	public CE_v2 getPv2_42_patientConditionCode() {
		return pv2_42_patientConditionCode;
	}
	public String getPv2_43_livingWillCode() {
		return pv2_43_livingWillCode;
	}
	public String getPv2_44_organDonorCode() {
		return pv2_44_organDonorCode;
	}
	public CE_v2[] getPv2_45_advanceDirectiveCode() {
		return pv2_45_advanceDirectiveCode;
	}
	public String getPv2_46_patientStatusEffectiveDate() {
		return pv2_46_patientStatusEffectiveDate;
	}
	public TS_v2 getPv2_47_expectedLOAReturnDateTime() {
		return pv2_47_expectedLOAReturnDateTime;
	}
	public TS_v2 getPv2_48_expectedPreadmissionTestingDateTime() {
		return pv2_48_expectedPreadmissionTestingDateTime;
	}
	public String[] getPv2_49_notifyClergyCode() {
		return pv2_49_notifyClergyCode;
	}
	@Override
	public String toString() {
		return "JsonPV2_v25 [pv2_1_priorPendingLocation=" + pv2_1_priorPendingLocation + ", pv2_2_accommodationCode="
				+ pv2_2_accommodationCode + ", pv2_3_admitReason=" + pv2_3_admitReason + ", pv2_4transferReason="
				+ pv2_4transferReason + ", pv2_5_patientValuables=" + Arrays.toString(pv2_5_patientValuables)
				+ ", pv2_6_patientValuablesLocation=" + pv2_6_patientValuablesLocation + ", pv2_7_visitUserCode="
				+ Arrays.toString(pv2_7_visitUserCode) + ", pv2_8_expectedAdmitDateTime=" + pv2_8_expectedAdmitDateTime
				+ ", pv2_9_expectedDischargeDateTime=" + pv2_9_expectedDischargeDateTime
				+ ", pv2_10_estimatedLengthofInpatientStay=" + pv2_10_estimatedLengthofInpatientStay
				+ ", pv2_11_actualLengthofInpatientStay=" + pv2_11_actualLengthofInpatientStay
				+ ", pv2_12_visitDescription=" + pv2_12_visitDescription + ", pv2_13_referralSourceCode="
				+ Arrays.toString(pv2_13_referralSourceCode) + ", pv2_14_previousServiceDate="
				+ pv2_14_previousServiceDate + ", pv2_15_employmentIllnessRelatedIndicator="
				+ pv2_15_employmentIllnessRelatedIndicator + ", pv2_16_purgeStatusCode=" + pv2_16_purgeStatusCode
				+ ", pv2_17_purgeStatusDate=" + pv2_17_purgeStatusDate + ", pv2_18_specialProgramCode="
				+ pv2_18_specialProgramCode + ", pv2_19_retentionIndicator=" + pv2_19_retentionIndicator
				+ ", pv2_20_expectedNumberofInsurancePlans=" + pv2_20_expectedNumberofInsurancePlans
				+ ", pv2_21_visitPublicityCode=" + pv2_21_visitPublicityCode + ", pv2_22_visitProtectionIndicator="
				+ pv2_22_visitProtectionIndicator + ", pv2_23_clinicOrganizationName="
				+ Arrays.toString(pv2_23_clinicOrganizationName) + ", pv2_24_patientStatusCode="
				+ pv2_24_patientStatusCode + ", pv2_25_visitPriorityCode=" + pv2_25_visitPriorityCode
				+ ", pv2_26_previousTreatmentDate=" + pv2_26_previousTreatmentDate
				+ ", pv2_27_expectedDischargeDisposition=" + pv2_27_expectedDischargeDisposition
				+ ", pv2_28_signatureonFileDate=" + pv2_28_signatureonFileDate + ", pv2_29_firstSimilarIllnessDate="
				+ pv2_29_firstSimilarIllnessDate + ", pv2_30_patientChargeAdjustmentCode="
				+ pv2_30_patientChargeAdjustmentCode + ", pv2_31_recurringServiceCode=" + pv2_31_recurringServiceCode
				+ ", pv2_32_billingMediaCode=" + pv2_32_billingMediaCode + ", pv2_33_expectedSurgeryDateandTime="
				+ pv2_33_expectedSurgeryDateandTime + ", pv2_34_militaryPartnershipCode="
				+ pv2_34_militaryPartnershipCode + ", pv2_35_militaryNonAvailabilityCode="
				+ pv2_35_militaryNonAvailabilityCode + ", pv2_36_newbornBabyIndicator=" + pv2_36_newbornBabyIndicator
				+ ", pv2_37_babyDetainedIndicator=" + pv2_37_babyDetainedIndicator + ", pv2_38_modeofArrivalCode="
				+ pv2_38_modeofArrivalCode + ", pv2_39_recreationalDrugUseCode="
				+ Arrays.toString(pv2_39_recreationalDrugUseCode) + ", pv2_40_admissionLevelofCareCode="
				+ pv2_40_admissionLevelofCareCode + ", pv2_41_precautionCode=" + Arrays.toString(pv2_41_precautionCode)
				+ ", pv2_42_patientConditionCode=" + pv2_42_patientConditionCode + ", pv2_43_livingWillCode="
				+ pv2_43_livingWillCode + ", pv2_44_organDonorCode=" + pv2_44_organDonorCode
				+ ", pv2_45_advanceDirectiveCode=" + Arrays.toString(pv2_45_advanceDirectiveCode)
				+ ", pv2_46_patientStatusEffectiveDate=" + pv2_46_patientStatusEffectiveDate
				+ ", pv2_47_expectedLOAReturnDateTime=" + pv2_47_expectedLOAReturnDateTime
				+ ", pv2_48_expectedPreadmissionTestingDateTime=" + pv2_48_expectedPreadmissionTestingDateTime
				+ ", pv2_49_notifyClergyCode=" + Arrays.toString(pv2_49_notifyClergyCode) + "]";
	}
}
