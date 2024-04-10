package scratch.coding.segment.v23;


import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_AUI_v23;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonIN1_v23 {
	@JsonProperty("in1_1_setId")
	private String in1_1_setId;
	@JsonProperty("ce_in1_2_insurancePlanId")
	private CE_v2 ce_in1_2_insurancePlanId;
	@JsonProperty("cx_in1_3_insuranceCompanyId")
	private CX_v23 cx_in1_3_insuranceCompanyId;
	@JsonProperty("xon_in1_4_insuranceCompanyName")
	private XON_v23 xon_in1_4_insuranceCompanyName;
	@JsonProperty("xad_in1_5_insuranceCompanyAddress")
	private XAD_v23 xad_in1_5_insuranceCompanyAddress;
	@JsonProperty("xpn_in1_6_insuranceCompanyContactPerson")
	private XPN_v23 xpn_in1_6_insuranceCompanyContactPerson;
	@JsonProperty("xtn_in1_7_insuranceCompanyPhoneNumber")
	private XTN_v23[] xtn_in1_7_insuranceCompanyPhoneNumber;
	@JsonProperty("in1_8_groupNumber")
	private String in1_8_groupNumber;
	@JsonProperty("xon_in1_9_groupName")
	private XON_v23 xon_in1_9_groupName;
	@JsonProperty("cx_in1_10_insuredsGroupEmployerId")
	private CX_v23 cx_in1_10_insuredsGroupEmployerId;
	@JsonProperty("xon_in1_11_insuredsGroupEmployeeName")
	private XON_v23 xon_in1_11_insuredsGroupEmployeeName;
	@JsonProperty("in1_12_planEffectiveDate")
	private String in1_12_planEffectiveDate;
	@JsonProperty("in1_13_planExpirationDate")
	private String in1_13_planExpirationDate;
	@JsonProperty("cm_aui_in1_14_authorizationInformation")
	private CM_AUI_v23 cm_aui_in1_14_authorizationInformation;
	@JsonProperty("in1_15_planType")
	private String in1_15_planType;
	@JsonProperty("xpn_in1_16_nameOfInsured")
	private XPN_v23 xpn_in1_16_nameOfInsured;
	@JsonProperty("in1_17_insuredsRelationshipToPatient")
	private String in1_17_insuredsRelationshipToPatient;
	@JsonProperty("ts_in1_18_insuredsDateOfBirth")
	private TS_v2 ts_in1_18_insuredsDateOfBirth;
	@JsonProperty("xad_in1_19_insuredsAddress")
	private XAD_v23 xad_in1_19_insuredsAddress;
	@JsonProperty("in1_20_assignmentOfBenefits")
	private String in1_20_assignmentOfBenefits;
	@JsonProperty("in1_21_coordinationOfBenefits")
	private String in1_21_coordinationOfBenefits;
	@JsonProperty("in1_22_coordinationOfBenefitsPriority")
	private String in1_22_coordinationOfBenefitsPriority;
	@JsonProperty("in1_23_noticeOfAdmissionCode")
	private String in1_23_noticeOfAdmissionCode;
	@JsonProperty("in1_24_noticeOfAdmissionDate")
	private String in1_24_noticeOfAdmissionDate;
	@JsonProperty("in1_25_reportOfEligibilityCode")
	private String in1_25_reportOfEligibilityCode;
	@JsonProperty("in1_26_reportOfEligebilityDate")
	private String in1_26_reportOfEligebilityDate;
	@JsonProperty("in1_27_releaseInformationCode")
	private String in1_27_releaseInformationCode;
	@JsonProperty("in1_28_preAdmitCert")
	private String in1_28_preAdmitCert;
	@JsonProperty("ts_in1_29_verificationDateTime")
	private TS_v2 ts_in1_29_verificationDateTime;
	@JsonProperty("xpn_in1_30_verificationBy")
	private XPN_v23 xpn_in1_30_verificationBy;
	@JsonProperty("in1_31_typeOfAgreementCode")
	private String in1_31_typeOfAgreementCode;
	@JsonProperty("in1_32_billingStatus")
	private String in1_32_billingStatus;
	@JsonProperty("in1_33_lifetimeReserveDays")
	private String in1_33_lifetimeReserveDays;
	@JsonProperty("in1_34_delayBeforeLifetimeReserveDays")
	private String in1_34_delayBeforeLifetimeReserveDays;
	@JsonProperty("in1_35_companyPlanCode")
	private String in1_35_companyPlanCode;
	@JsonProperty("in1_36_policyNumber")
	private String in1_36_policyNumber;
	@JsonProperty("cp_in1_37_policyDeductible")
	private CP_v2 cp_in1_37_policyDeductible;
	@JsonProperty("cp_in1_38_policyLimitAmount")
	private CP_v2 cp_in1_38_policyLimitAmount;
	@JsonProperty("in1_39_policyLimitDays")
	private String in1_39_policyLimitDays;
	@JsonProperty("cp_in1_40_roomRateSemiPrivate")
	private CP_v2 cp_in1_40_roomRateSemiPrivate;
	@JsonProperty("cp_in1_41_roomRatePrivate")
	private CP_v2 cp_in1_41_roomRatePrivate;
	@JsonProperty("ce_in1_42_insuredsEmploymentStatus")
	private CE_v2 ce_in1_42_insuredsEmploymentStatus;
	@JsonProperty("in1_43_insuredsSex")
	private String in1_43_insuredsSex;
	@JsonProperty("xad_in1_44_insuredsEmployerAddress")
	private XAD_v23 xad_in1_44_insuredsEmployerAddress;
	@JsonProperty("in1_45_verificationStatus")
	private String in1_45_verificationStatus;
	@JsonProperty("in1_46_priorInsurancePlanId")
	private String in1_46_priorInsurancePlanId;
	@JsonProperty("in1_47_coverageType")
	private String in1_47_coverageType;
	@JsonProperty("in1_48_handicap")
	private String in1_48_handicap;
	@JsonProperty("cx_in1_49_insuredsIdNumber")
	private CX_v23 cx_in1_49_insuredsIdNumber;
	public JsonIN1_v23(IN1Builder builder) {
		super();
		this.in1_1_setId = builder.in1_1_setId;
		this.ce_in1_2_insurancePlanId = builder.ce_in1_2_insurancePlanId;
		this.cx_in1_3_insuranceCompanyId = builder.cx_in1_3_insuranceCompanyId;
		this.xon_in1_4_insuranceCompanyName = builder.xon_in1_4_insuranceCompanyName;
		this.xad_in1_5_insuranceCompanyAddress = builder.xad_in1_5_insuranceCompanyAddress;
		this.xpn_in1_6_insuranceCompanyContactPerson = builder.xpn_in1_6_insuranceCompanyContactPerson;
		this.xtn_in1_7_insuranceCompanyPhoneNumber = builder.xtn_in1_7_insuranceCompanyPhoneNumber;
		this.in1_8_groupNumber = builder.in1_8_groupNumber;
		this.xon_in1_9_groupName = builder.xon_in1_9_groupName;
		this.cx_in1_10_insuredsGroupEmployerId = builder.cx_in1_10_insuredsGroupEmployerId;
		this.xon_in1_11_insuredsGroupEmployeeName = builder.xon_in1_11_insuredsGroupEmployeeName;
		this.in1_12_planEffectiveDate = builder.in1_12_planEffectiveDate;
		this.in1_13_planExpirationDate = builder.in1_13_planExpirationDate;
		this.cm_aui_in1_14_authorizationInformation = builder.cm_aui_in1_14_authorizationInformation;
		this.in1_15_planType = builder.in1_15_planType;
		this.xpn_in1_16_nameOfInsured = builder.xpn_in1_16_nameOfInsured;
		this.in1_17_insuredsRelationshipToPatient = builder.in1_17_insuredsRelationshipToPatient;
		this.ts_in1_18_insuredsDateOfBirth = builder.ts_in1_18_insuredsDateOfBirth;
		this.xad_in1_19_insuredsAddress = builder.xad_in1_19_insuredsAddress;
		this.in1_20_assignmentOfBenefits = builder.in1_20_assignmentOfBenefits;
		this.in1_21_coordinationOfBenefits = builder.in1_21_coordinationOfBenefits;
		this.in1_22_coordinationOfBenefitsPriority = builder.in1_22_coordinationOfBenefitsPriority;
		this.in1_23_noticeOfAdmissionCode = builder.in1_23_noticeOfAdmissionCode;
		this.in1_24_noticeOfAdmissionDate = builder.in1_24_noticeOfAdmissionDate;
		this.in1_25_reportOfEligibilityCode = builder.in1_25_reportOfEligibilityCode;
		this.in1_26_reportOfEligebilityDate = builder.in1_26_reportOfEligebilityDate;
		this.in1_27_releaseInformationCode = builder.in1_27_releaseInformationCode;
		this.in1_28_preAdmitCert = builder.in1_28_preAdmitCert;
		this.ts_in1_29_verificationDateTime = builder.ts_in1_29_verificationDateTime;
		this.xpn_in1_30_verificationBy = builder.xpn_in1_30_verificationBy;
		this.in1_31_typeOfAgreementCode = builder.in1_31_typeOfAgreementCode;
		this.in1_32_billingStatus = builder.in1_32_billingStatus;
		this.in1_33_lifetimeReserveDays = builder.in1_33_lifetimeReserveDays;
		this.in1_34_delayBeforeLifetimeReserveDays = builder.in1_34_delayBeforeLifetimeReserveDays;
		this.in1_35_companyPlanCode = builder.in1_35_companyPlanCode;
		this.in1_36_policyNumber = builder.in1_36_policyNumber;
		this.cp_in1_37_policyDeductible = builder.cp_in1_37_policyDeductible;
		this.cp_in1_38_policyLimitAmount = builder.cp_in1_38_policyLimitAmount;
		this.in1_39_policyLimitDays = builder.in1_39_policyLimitDays;
		this.cp_in1_40_roomRateSemiPrivate = builder.cp_in1_40_roomRateSemiPrivate;
		this.cp_in1_41_roomRatePrivate = builder.cp_in1_41_roomRatePrivate;
		this.ce_in1_42_insuredsEmploymentStatus = builder.ce_in1_42_insuredsEmploymentStatus;
		this.in1_43_insuredsSex = builder.in1_43_insuredsSex;
		this.xad_in1_44_insuredsEmployerAddress = builder.xad_in1_44_insuredsEmployerAddress;
		this.in1_45_verificationStatus = builder.in1_45_verificationStatus;
		this.in1_46_priorInsurancePlanId = builder.in1_46_priorInsurancePlanId;
		this.in1_47_coverageType = builder.in1_47_coverageType;
		this.in1_48_handicap = builder.in1_48_handicap;
		this.cx_in1_49_insuredsIdNumber = builder.cx_in1_49_insuredsIdNumber;
	}
	
	public JsonIN1_v23(String in1_1_setId, CE_v2 ce_in1_2_insurancePlanId, CX_v23 cx_in1_3_insuranceCompanyId,
			XON_v23 xon_in1_4_insuranceCompanyName, XAD_v23 xad_in1_5_insuranceCompanyAddress,
			XPN_v23 xpn_in1_6_insuranceCompanyContactPerson, XTN_v23[] xtn_in1_7_insuranceCompanyPhoneNumber,
			String in1_8_groupNumber, XON_v23 xon_in1_9_groupName, CX_v23 cx_in1_10_insuredsGroupEmployerId,
			XON_v23 xon_in1_11_insuredsGroupEmployeeName, String in1_12_planEffectiveDate,
			String in1_13_planExpirationDate, CM_AUI_v23 cm_aui_in1_14_authorizationInformation, String in1_15_planType,
			XPN_v23 xpn_in1_16_nameOfInsured, String in1_17_insuredsRelationshipToPatient,
			TS_v2 ts_in1_18_insuredsDateOfBirth, XAD_v23 xad_in1_19_insuredsAddress, String in1_20_assignmentOfBenefits,
			String in1_21_coordinationOfBenefits, String in1_22_coordinationOfBenefitsPriority,
			String in1_23_noticeOfAdmissionCode, String in1_24_noticeOfAdmissionDate,
			String in1_25_reportOfEligibilityCode, String in1_26_reportOfEligebilityDate,
			String in1_27_releaseInformationCode, String in1_28_preAdmitCert, TS_v2 ts_in1_29_verificationDateTime,
			XPN_v23 xpn_in1_30_verificationBy, String in1_31_typeOfAgreementCode, String in1_32_billingStatus,
			String in1_33_lifetimeReserveDays, String in1_34_delayBeforeLifetimeReserveDays,
			String in1_35_companyPlanCode, String in1_36_policyNumber, CP_v2 cp_in1_37_policyDeductible,
			CP_v2 cp_in1_38_policyLimitAmount, String in1_39_policyLimitDays, CP_v2 cp_in1_40_roomRateSemiPrivate,
			CP_v2 cp_in1_41_roomRatePrivate, CE_v2 ce_in1_42_insuredsEmploymentStatus, String in1_43_insuredsSex,
			XAD_v23 xad_in1_44_insuredsEmployerAddress, String in1_45_verificationStatus,
			String in1_46_priorInsurancePlanId, String in1_47_coverageType, String in1_48_handicap,
			CX_v23 cx_in1_49_insuredsIdNumber) {
		super();
		this.in1_1_setId = in1_1_setId;
		this.ce_in1_2_insurancePlanId = ce_in1_2_insurancePlanId;
		this.cx_in1_3_insuranceCompanyId = cx_in1_3_insuranceCompanyId;
		this.xon_in1_4_insuranceCompanyName = xon_in1_4_insuranceCompanyName;
		this.xad_in1_5_insuranceCompanyAddress = xad_in1_5_insuranceCompanyAddress;
		this.xpn_in1_6_insuranceCompanyContactPerson = xpn_in1_6_insuranceCompanyContactPerson;
		this.xtn_in1_7_insuranceCompanyPhoneNumber = xtn_in1_7_insuranceCompanyPhoneNumber;
		this.in1_8_groupNumber = in1_8_groupNumber;
		this.xon_in1_9_groupName = xon_in1_9_groupName;
		this.cx_in1_10_insuredsGroupEmployerId = cx_in1_10_insuredsGroupEmployerId;
		this.xon_in1_11_insuredsGroupEmployeeName = xon_in1_11_insuredsGroupEmployeeName;
		this.in1_12_planEffectiveDate = in1_12_planEffectiveDate;
		this.in1_13_planExpirationDate = in1_13_planExpirationDate;
		this.cm_aui_in1_14_authorizationInformation = cm_aui_in1_14_authorizationInformation;
		this.in1_15_planType = in1_15_planType;
		this.xpn_in1_16_nameOfInsured = xpn_in1_16_nameOfInsured;
		this.in1_17_insuredsRelationshipToPatient = in1_17_insuredsRelationshipToPatient;
		this.ts_in1_18_insuredsDateOfBirth = ts_in1_18_insuredsDateOfBirth;
		this.xad_in1_19_insuredsAddress = xad_in1_19_insuredsAddress;
		this.in1_20_assignmentOfBenefits = in1_20_assignmentOfBenefits;
		this.in1_21_coordinationOfBenefits = in1_21_coordinationOfBenefits;
		this.in1_22_coordinationOfBenefitsPriority = in1_22_coordinationOfBenefitsPriority;
		this.in1_23_noticeOfAdmissionCode = in1_23_noticeOfAdmissionCode;
		this.in1_24_noticeOfAdmissionDate = in1_24_noticeOfAdmissionDate;
		this.in1_25_reportOfEligibilityCode = in1_25_reportOfEligibilityCode;
		this.in1_26_reportOfEligebilityDate = in1_26_reportOfEligebilityDate;
		this.in1_27_releaseInformationCode = in1_27_releaseInformationCode;
		this.in1_28_preAdmitCert = in1_28_preAdmitCert;
		this.ts_in1_29_verificationDateTime = ts_in1_29_verificationDateTime;
		this.xpn_in1_30_verificationBy = xpn_in1_30_verificationBy;
		this.in1_31_typeOfAgreementCode = in1_31_typeOfAgreementCode;
		this.in1_32_billingStatus = in1_32_billingStatus;
		this.in1_33_lifetimeReserveDays = in1_33_lifetimeReserveDays;
		this.in1_34_delayBeforeLifetimeReserveDays = in1_34_delayBeforeLifetimeReserveDays;
		this.in1_35_companyPlanCode = in1_35_companyPlanCode;
		this.in1_36_policyNumber = in1_36_policyNumber;
		this.cp_in1_37_policyDeductible = cp_in1_37_policyDeductible;
		this.cp_in1_38_policyLimitAmount = cp_in1_38_policyLimitAmount;
		this.in1_39_policyLimitDays = in1_39_policyLimitDays;
		this.cp_in1_40_roomRateSemiPrivate = cp_in1_40_roomRateSemiPrivate;
		this.cp_in1_41_roomRatePrivate = cp_in1_41_roomRatePrivate;
		this.ce_in1_42_insuredsEmploymentStatus = ce_in1_42_insuredsEmploymentStatus;
		this.in1_43_insuredsSex = in1_43_insuredsSex;
		this.xad_in1_44_insuredsEmployerAddress = xad_in1_44_insuredsEmployerAddress;
		this.in1_45_verificationStatus = in1_45_verificationStatus;
		this.in1_46_priorInsurancePlanId = in1_46_priorInsurancePlanId;
		this.in1_47_coverageType = in1_47_coverageType;
		this.in1_48_handicap = in1_48_handicap;
		this.cx_in1_49_insuredsIdNumber = cx_in1_49_insuredsIdNumber;
	}

	public JsonIN1_v23() {
		super();
		this.in1_1_setId = "";
		this.ce_in1_2_insurancePlanId = new CE_v2();
		this.cx_in1_3_insuranceCompanyId = new CX_v23();
		this.xon_in1_4_insuranceCompanyName = new XON_v23();
		this.xad_in1_5_insuranceCompanyAddress = new XAD_v23();
		this.xpn_in1_6_insuranceCompanyContactPerson = new XPN_v23();
		this.xtn_in1_7_insuranceCompanyPhoneNumber = new XTN_v23[] {};
		this.in1_8_groupNumber = "";
		this.xon_in1_9_groupName = new XON_v23();
		this.cx_in1_10_insuredsGroupEmployerId = new CX_v23();
		this.xon_in1_11_insuredsGroupEmployeeName = new XON_v23();
		this.in1_12_planEffectiveDate = "";
		this.in1_13_planExpirationDate = "";
		this.cm_aui_in1_14_authorizationInformation = new CM_AUI_v23();
		this.in1_15_planType = "";
		this.xpn_in1_16_nameOfInsured = new XPN_v23();
		this.in1_17_insuredsRelationshipToPatient = "";
		this.ts_in1_18_insuredsDateOfBirth = new TS_v2();
		this.xad_in1_19_insuredsAddress = new XAD_v23();
		this.in1_20_assignmentOfBenefits = "";
		this.in1_21_coordinationOfBenefits = "";
		this.in1_22_coordinationOfBenefitsPriority = "";
		this.in1_23_noticeOfAdmissionCode = "";
		this.in1_24_noticeOfAdmissionDate = "";
		this.in1_25_reportOfEligibilityCode = "";
		this.in1_26_reportOfEligebilityDate = "";
		this.in1_27_releaseInformationCode = "";
		this.in1_28_preAdmitCert = "";
		this.ts_in1_29_verificationDateTime = new TS_v2();
		this.xpn_in1_30_verificationBy = new XPN_v23();
		this.in1_31_typeOfAgreementCode = "";
		this.in1_32_billingStatus = "";
		this.in1_33_lifetimeReserveDays = "";
		this.in1_34_delayBeforeLifetimeReserveDays = "";
		this.in1_35_companyPlanCode = "";
		this.in1_36_policyNumber = "";
		this.cp_in1_37_policyDeductible = new CP_v2();
		this.cp_in1_38_policyLimitAmount = new CP_v2();
		this.in1_39_policyLimitDays = "";
		this.cp_in1_40_roomRateSemiPrivate = new CP_v2();
		this.cp_in1_41_roomRatePrivate = new CP_v2();
		this.ce_in1_42_insuredsEmploymentStatus = new CE_v2();
		this.in1_43_insuredsSex = "";
		this.xad_in1_44_insuredsEmployerAddress = new XAD_v23();
		this.in1_45_verificationStatus = "";
		this.in1_46_priorInsurancePlanId = "";
		this.in1_47_coverageType = "";
		this.in1_48_handicap = "";
		this.cx_in1_49_insuredsIdNumber = new CX_v23();
	}
	public static class IN1Builder {
		private String in1_1_setId;
		private CE_v2 ce_in1_2_insurancePlanId;
		private CX_v23 cx_in1_3_insuranceCompanyId;
		private XON_v23 xon_in1_4_insuranceCompanyName;
		private XAD_v23 xad_in1_5_insuranceCompanyAddress;
		private XPN_v23 xpn_in1_6_insuranceCompanyContactPerson;
		private XTN_v23[] xtn_in1_7_insuranceCompanyPhoneNumber;
		private String in1_8_groupNumber;
		private XON_v23 xon_in1_9_groupName;
		private CX_v23 cx_in1_10_insuredsGroupEmployerId;
		private XON_v23 xon_in1_11_insuredsGroupEmployeeName;
		private String in1_12_planEffectiveDate;
		private String in1_13_planExpirationDate;
		private CM_AUI_v23 cm_aui_in1_14_authorizationInformation;
		private String in1_15_planType;
		private XPN_v23 xpn_in1_16_nameOfInsured;
		private String in1_17_insuredsRelationshipToPatient;
		private TS_v2 ts_in1_18_insuredsDateOfBirth;
		private XAD_v23 xad_in1_19_insuredsAddress;
		private String in1_20_assignmentOfBenefits;
		private String in1_21_coordinationOfBenefits;
		private String in1_22_coordinationOfBenefitsPriority;
		private String in1_23_noticeOfAdmissionCode;
		private String in1_24_noticeOfAdmissionDate;
		private String in1_25_reportOfEligibilityCode;
		private String in1_26_reportOfEligebilityDate;
		private String in1_27_releaseInformationCode;
		private String in1_28_preAdmitCert;
		private TS_v2 ts_in1_29_verificationDateTime;
		private XPN_v23 xpn_in1_30_verificationBy;
		private String in1_31_typeOfAgreementCode;
		private String in1_32_billingStatus;
		private String in1_33_lifetimeReserveDays;
		private String in1_34_delayBeforeLifetimeReserveDays;
		private String in1_35_companyPlanCode;
		private String in1_36_policyNumber;
		private CP_v2 cp_in1_37_policyDeductible;
		private CP_v2 cp_in1_38_policyLimitAmount;
		private String in1_39_policyLimitDays;
		private CP_v2 cp_in1_40_roomRateSemiPrivate;
		private CP_v2 cp_in1_41_roomRatePrivate;
		private CE_v2 ce_in1_42_insuredsEmploymentStatus;
		private String in1_43_insuredsSex;
		private XAD_v23 xad_in1_44_insuredsEmployerAddress;
		private String in1_45_verificationStatus;
		private String in1_46_priorInsurancePlanId;
		private String in1_47_coverageType;
		private String in1_48_handicap;
		private CX_v23 cx_in1_49_insuredsIdNumber;
		public IN1Builder(String in1_1_setId, CE_v2 ce_in1_2_insurancePlanId, CX_v23 cx_in1_3_insuranceCompanyId) {
			super();
			this.in1_1_setId = in1_1_setId;
			this.ce_in1_2_insurancePlanId = ce_in1_2_insurancePlanId;
			this.cx_in1_3_insuranceCompanyId = cx_in1_3_insuranceCompanyId;
			this.xon_in1_4_insuranceCompanyName = new XON_v23();
			this.xad_in1_5_insuranceCompanyAddress = new XAD_v23();
			this.xpn_in1_6_insuranceCompanyContactPerson = new XPN_v23();
			this.xtn_in1_7_insuranceCompanyPhoneNumber = new XTN_v23[] {};
			this.in1_8_groupNumber = "";
			this.xon_in1_9_groupName = new XON_v23();
			this.cx_in1_10_insuredsGroupEmployerId = new CX_v23();
			this.xon_in1_11_insuredsGroupEmployeeName = new XON_v23();
			this.in1_12_planEffectiveDate = "";
			this.in1_13_planExpirationDate = "";
			this.cm_aui_in1_14_authorizationInformation = new CM_AUI_v23();
			this.in1_15_planType = "";
			this.xpn_in1_16_nameOfInsured = new XPN_v23();
			this.in1_17_insuredsRelationshipToPatient = "";
			this.ts_in1_18_insuredsDateOfBirth = new TS_v2();
			this.xad_in1_19_insuredsAddress = new XAD_v23();
			this.in1_20_assignmentOfBenefits = "";
			this.in1_21_coordinationOfBenefits = "";
			this.in1_22_coordinationOfBenefitsPriority = "";
			this.in1_23_noticeOfAdmissionCode = "";
			this.in1_24_noticeOfAdmissionDate = "";
			this.in1_25_reportOfEligibilityCode = "";
			this.in1_26_reportOfEligebilityDate = "";
			this.in1_27_releaseInformationCode = "";
			this.in1_28_preAdmitCert = "";
			this.ts_in1_29_verificationDateTime = new TS_v2();
			this.xpn_in1_30_verificationBy = new XPN_v23();
			this.in1_31_typeOfAgreementCode = "";
			this.in1_32_billingStatus = "";
			this.in1_33_lifetimeReserveDays = "";
			this.in1_34_delayBeforeLifetimeReserveDays = "";
			this.in1_35_companyPlanCode = "";
			this.in1_36_policyNumber = "";
			this.cp_in1_37_policyDeductible = new CP_v2();
			this.cp_in1_38_policyLimitAmount = new CP_v2();
			this.in1_39_policyLimitDays = "";
			this.cp_in1_40_roomRateSemiPrivate = new CP_v2();
			this.cp_in1_41_roomRatePrivate = new CP_v2();
			this.ce_in1_42_insuredsEmploymentStatus = new CE_v2();
			this.in1_43_insuredsSex = "";
			this.xad_in1_44_insuredsEmployerAddress = new XAD_v23();
			this.in1_45_verificationStatus = "";
			this.in1_46_priorInsurancePlanId = "";
			this.in1_47_coverageType = "";
			this.in1_48_handicap = "";
			this.cx_in1_49_insuredsIdNumber =new CX_v23();
		}
		public IN1Builder in1_1_setId(String in1_1_setId) {
			this.in1_1_setId = in1_1_setId;
			return this;
		}
		public IN1Builder ce_in1_2_insurancePlanId(CE_v2 ce_in1_2_insurancePlanId) {
			this.ce_in1_2_insurancePlanId = ce_in1_2_insurancePlanId;
			return this;
		}
		public IN1Builder cx_in1_3_insuranceCompanyId(CX_v23 cx_in1_3_insuranceCompanyId) {
			this.cx_in1_3_insuranceCompanyId = cx_in1_3_insuranceCompanyId;
			return this;
		}
		public IN1Builder xon_in1_4_insuranceCompanyName(XON_v23 xon_in1_4_insuranceCompanyName) {
			this.xon_in1_4_insuranceCompanyName = xon_in1_4_insuranceCompanyName;
			return this;
		}
		public IN1Builder xad_in1_5_insuranceCompanyAddress(XAD_v23 xad_in1_5_insuranceCompanyAddress) {
			this.xad_in1_5_insuranceCompanyAddress = xad_in1_5_insuranceCompanyAddress;
			return this;
		}
		public IN1Builder xpn_in1_6_insuranceCompanyContactPerson(XPN_v23 xpn_in1_6_insuranceCompanyContactPerson) {
			this.xpn_in1_6_insuranceCompanyContactPerson = xpn_in1_6_insuranceCompanyContactPerson;
			return this;
		}
		public IN1Builder xtn_in1_7_insuranceCompanyPhoneNumber(XTN_v23[] xtn_in1_7_insuranceCompanyPhoneNumber) {
			this.xtn_in1_7_insuranceCompanyPhoneNumber = xtn_in1_7_insuranceCompanyPhoneNumber;
			return this;
		}
		public IN1Builder in1_8_groupNumber(String in1_8_groupNumber) {
			this.in1_8_groupNumber = in1_8_groupNumber;
			return this;
		}
		public IN1Builder xon_in1_9_groupName(XON_v23 xon_in1_9_groupName) {
			this.xon_in1_9_groupName = xon_in1_9_groupName;
			return this;
		}
		public IN1Builder cx_in1_10_insuredsGroupEmployerId(CX_v23 cx_in1_10_insuredsGroupEmployerId) {
			this.cx_in1_10_insuredsGroupEmployerId = cx_in1_10_insuredsGroupEmployerId;
			return this;
		}
		public IN1Builder xon_in1_11_insuredsGroupEmployeeName(XON_v23 xon_in1_11_insuredsGroupEmployeeName) {
			this.xon_in1_11_insuredsGroupEmployeeName = xon_in1_11_insuredsGroupEmployeeName;
			return this;
		}
		public IN1Builder in1_12_planEffectiveDate(String in1_12_planEffectiveDate) {
			this.in1_12_planEffectiveDate = in1_12_planEffectiveDate;
			return this;
		}
		public IN1Builder in1_13_planExpirationDate(String in1_13_planExpirationDate) {
			this.in1_13_planExpirationDate = in1_13_planExpirationDate;
			return this;
		}
		public IN1Builder setCm_aui_in1_14_authorizationInformation(CM_AUI_v23 cm_aui_in1_14_authorizationInformation) {
			this.cm_aui_in1_14_authorizationInformation = cm_aui_in1_14_authorizationInformation;
			return this;
		}
		public IN1Builder in1_15_planType(String in1_15_planType) {
			this.in1_15_planType = in1_15_planType;
			return this;
		}
		public IN1Builder xpn_in1_16_nameOfInsured(XPN_v23 xpn_in1_16_nameOfInsured) {
			this.xpn_in1_16_nameOfInsured = xpn_in1_16_nameOfInsured;
			return this;
		}
		public IN1Builder in1_17_insuredsRelationshipToPatient(String in1_17_insuredsRelationshipToPatient) {
			this.in1_17_insuredsRelationshipToPatient = in1_17_insuredsRelationshipToPatient;
			return this;
		}
		public IN1Builder ts_in1_18_insuredsDateOfBirth(TS_v2 ts_in1_18_insuredsDateOfBirth) {
			this.ts_in1_18_insuredsDateOfBirth = ts_in1_18_insuredsDateOfBirth;
			return this;
		}
		public IN1Builder xad_in1_19_insuredsAddress(XAD_v23 xad_in1_19_insuredsAddress) {
			this.xad_in1_19_insuredsAddress = xad_in1_19_insuredsAddress;
			return this;
		}
		public IN1Builder in1_20_assignmentOfBenefits(String in1_20_assignmentOfBenefits) {
			this.in1_20_assignmentOfBenefits = in1_20_assignmentOfBenefits;
			return this;
		}
		public IN1Builder in1_21_coordinationOfBenefits(String in1_21_coordinationOfBenefits) {
			this.in1_21_coordinationOfBenefits = in1_21_coordinationOfBenefits;
			return this;
		}
		public IN1Builder in1_22_coordinationOfBenefitsPriority(String in1_22_coordinationOfBenefitsPriority) {
			this.in1_22_coordinationOfBenefitsPriority = in1_22_coordinationOfBenefitsPriority;
			return this;
		}
		public IN1Builder in1_23_noticeOfAdmissionCode(String in1_23_noticeOfAdmissionCode) {
			this.in1_23_noticeOfAdmissionCode = in1_23_noticeOfAdmissionCode;
			return this;
		}
		public IN1Builder in1_24_noticeOfAdmissionDate(String in1_24_noticeOfAdmissionDate) {
			this.in1_24_noticeOfAdmissionDate = in1_24_noticeOfAdmissionDate;
			return this;
		}
		public IN1Builder in1_25_reportOfEligibilityCode(String in1_25_reportOfEligibilityCode) {
			this.in1_25_reportOfEligibilityCode = in1_25_reportOfEligibilityCode;
			return this;
		}
		public IN1Builder in1_26_reportOfEligebilityDate(String in1_26_reportOfEligebilityDate) {
			this.in1_26_reportOfEligebilityDate = in1_26_reportOfEligebilityDate;
			return this;
		}
		public IN1Builder in1_27_releaseInformationCode(String in1_27_releaseInformationCode) {
			this.in1_27_releaseInformationCode = in1_27_releaseInformationCode;
			return this;
		}
		public IN1Builder in1_28_preAdmitCert(String in1_28_preAdmitCert) {
			this.in1_28_preAdmitCert = in1_28_preAdmitCert;
			return this;
		}
		public IN1Builder ts_in1_29_verificationDateTime(TS_v2 ts_in1_29_verificationDateTime) {
			this.ts_in1_29_verificationDateTime = ts_in1_29_verificationDateTime;
			return this;
		}
		public IN1Builder xpn_in1_30_verificationBy(XPN_v23 xpn_in1_30_verificationBy) {
			this.xpn_in1_30_verificationBy = xpn_in1_30_verificationBy;
			return this;
		}
		public IN1Builder in1_31_typeOfAgreementCode(String in1_31_typeOfAgreementCode) {
			this.in1_31_typeOfAgreementCode = in1_31_typeOfAgreementCode;
			return this;
		}
		public IN1Builder in1_32_billingStatus(String in1_32_billingStatus) {
			this.in1_32_billingStatus = in1_32_billingStatus;
			return this;
		}
		public IN1Builder in1_33_lifetimeReserveDays(String in1_33_lifetimeReserveDays) {
			this.in1_33_lifetimeReserveDays = in1_33_lifetimeReserveDays;
			return this;
		}
		public IN1Builder in1_34_delayBeforeLifetimeReserveDays(String in1_34_delayBeforeLifetimeReserveDays) {
			this.in1_34_delayBeforeLifetimeReserveDays = in1_34_delayBeforeLifetimeReserveDays;
			return this;
		}
		public IN1Builder in1_35_companyPlanCode(String in1_35_companyPlanCode) {
			this.in1_35_companyPlanCode = in1_35_companyPlanCode;
			return this;
		}
		public IN1Builder in1_36_policyNumber(String in1_36_policyNumber) {
			this.in1_36_policyNumber = in1_36_policyNumber;
			return this;
		}
		public IN1Builder cp_in1_37_policyDeductible(CP_v2 cp_in1_37_policyDeductible) {
			this.cp_in1_37_policyDeductible = cp_in1_37_policyDeductible;
			return this;
		}
		public IN1Builder cp_in1_38_policyLimitAmount(CP_v2 cp_in1_38_policyLimitAmount) {
			this.cp_in1_38_policyLimitAmount = cp_in1_38_policyLimitAmount;
			return this;
		}
		public IN1Builder in1_39_policyLimitDays(String in1_39_policyLimitDays) {
			this.in1_39_policyLimitDays = in1_39_policyLimitDays;
			return this;
		}
		public IN1Builder cp_in1_40_roomRateSemiPrivate(CP_v2 cp_in1_40_roomRateSemiPrivate) {
			this.cp_in1_40_roomRateSemiPrivate = cp_in1_40_roomRateSemiPrivate;
			return this;
		}
		public IN1Builder cp_in1_41_roomRatePrivate(CP_v2 cp_in1_41_roomRatePrivate) {
			this.cp_in1_41_roomRatePrivate = cp_in1_41_roomRatePrivate;
			return this;
		}
		public IN1Builder ce_in1_42_insuredsEmploymentStatus(CE_v2 ce_in1_42_insuredsEmploymentStatus) {
			this.ce_in1_42_insuredsEmploymentStatus = ce_in1_42_insuredsEmploymentStatus;
			return this;
		}
		public IN1Builder in1_43_insuredsSex(String in1_43_insuredsSex) {
			this.in1_43_insuredsSex = in1_43_insuredsSex;
			return this;
		}
		public IN1Builder xad_in1_44_insuredsEmployerAddress(XAD_v23 xad_in1_44_insuredsEmployerAddress) {
			this.xad_in1_44_insuredsEmployerAddress = xad_in1_44_insuredsEmployerAddress;
			return this;
		}
		public IN1Builder in1_45_verificationStatus(String in1_45_verificationStatus) {
			this.in1_45_verificationStatus = in1_45_verificationStatus;
			return this;
		}
		public IN1Builder in1_46_priorInsurancePlanId(String in1_46_priorInsurancePlanId) {
			this.in1_46_priorInsurancePlanId = in1_46_priorInsurancePlanId;
			return this;
		}
		public IN1Builder in1_47_coverageType(String in1_47_coverageType) {
			this.in1_47_coverageType = in1_47_coverageType;
			return this;
		}
		public IN1Builder in1_48_handicap(String in1_48_handicap) {
			this.in1_48_handicap = in1_48_handicap;
			return this;
		}
		public IN1Builder cx_in1_49_insuredsIdNumber(CX_v23 cx_in1_49_insuredsIdNumber) {
			this.cx_in1_49_insuredsIdNumber = cx_in1_49_insuredsIdNumber;
			return this;
		}
		public JsonIN1_v23 build() {
			return new JsonIN1_v23(this);
		}
	}
	public String getIn1_1_setId() {
		return in1_1_setId;
	}
	public CE_v2 getCe_in1_2_insurancePlanId() {
		return ce_in1_2_insurancePlanId;
	}
	public CX_v23 getCx_in1_3_insuranceCompanyId() {
		return cx_in1_3_insuranceCompanyId;
	}
	public XON_v23 getXon_in1_4_insuranceCompanyName() {
		return xon_in1_4_insuranceCompanyName;
	}
	public XAD_v23 getXad_in1_5_insuranceCompanyAddress() {
		return xad_in1_5_insuranceCompanyAddress;
	}
	public XPN_v23 getXpn_in1_6_insuranceCompanyContactPerson() {
		return xpn_in1_6_insuranceCompanyContactPerson;
	}
	public XTN_v23[] getXtn_in1_7_insuranceCompanyPhoneNumber() {
		return xtn_in1_7_insuranceCompanyPhoneNumber;
	}
	public String getIn1_8_groupNumber() {
		return in1_8_groupNumber;
	}
	public XON_v23 getXon_in1_9_groupName() {
		return xon_in1_9_groupName;
	}
	public CX_v23 getCx_in1_10_insuredsGroupEmployerId() {
		return cx_in1_10_insuredsGroupEmployerId;
	}
	public XON_v23 getXon_in1_11_insuredsGroupEmployeeName() {
		return xon_in1_11_insuredsGroupEmployeeName;
	}
	public String getIn1_12_planEffectiveDate() {
		return in1_12_planEffectiveDate;
	}
	public String getIn1_13_planExpirationDate() {
		return in1_13_planExpirationDate;
	}
	public CM_AUI_v23 getCm_aui_in1_14_authorizationInformation() {
		return cm_aui_in1_14_authorizationInformation;
	}
	public String getIn1_15_planType() {
		return in1_15_planType;
	}
	public XPN_v23 getXpn_in1_16_nameOfInsured() {
		return xpn_in1_16_nameOfInsured;
	}
	public String getIn1_17_insuredsRelationshipToPatient() {
		return in1_17_insuredsRelationshipToPatient;
	}
	public TS_v2 getTs_in1_18_insuredsDateOfBirth() {
		return ts_in1_18_insuredsDateOfBirth;
	}
	public XAD_v23 getXad_in1_19_insuredsAddress() {
		return xad_in1_19_insuredsAddress;
	}
	public String getIn1_20_assignmentOfBenefits() {
		return in1_20_assignmentOfBenefits;
	}
	public String getIn1_21_coordinationOfBenefits() {
		return in1_21_coordinationOfBenefits;
	}
	public String getIn1_22_coordinationOfBenefitsPriority() {
		return in1_22_coordinationOfBenefitsPriority;
	}
	public String getIn1_23_noticeOfAdmissionCode() {
		return in1_23_noticeOfAdmissionCode;
	}
	public String getIn1_24_noticeOfAdmissionDate() {
		return in1_24_noticeOfAdmissionDate;
	}
	public String getIn1_25_reportOfEligibilityCode() {
		return in1_25_reportOfEligibilityCode;
	}
	public String getIn1_26_reportOfEligebilityDate() {
		return in1_26_reportOfEligebilityDate;
	}
	public String getIn1_27_releaseInformationCode() {
		return in1_27_releaseInformationCode;
	}
	public String getIn1_28_preAdmitCert() {
		return in1_28_preAdmitCert;
	}
	public TS_v2 getTs_in1_29_verificationDateTime() {
		return ts_in1_29_verificationDateTime;
	}
	public XPN_v23 getXpn_in1_30_verificationBy() {
		return xpn_in1_30_verificationBy;
	}
	public String getIn1_31_typeOfAgreementCode() {
		return in1_31_typeOfAgreementCode;
	}
	public String getIn1_32_billingStatus() {
		return in1_32_billingStatus;
	}
	public String getIn1_33_lifetimeReserveDays() {
		return in1_33_lifetimeReserveDays;
	}
	public String getIn1_34_delayBeforeLifetimeReserveDays() {
		return in1_34_delayBeforeLifetimeReserveDays;
	}
	public String getIn1_35_companyPlanCode() {
		return in1_35_companyPlanCode;
	}
	public String getIn1_36_policyNumber() {
		return in1_36_policyNumber;
	}
	public CP_v2 getCp_in1_37_policyDeductible() {
		return cp_in1_37_policyDeductible;
	}
	public CP_v2 getCp_in1_38_policyLimitAmount() {
		return cp_in1_38_policyLimitAmount;
	}
	public String getIn1_39_policyLimitDays() {
		return in1_39_policyLimitDays;
	}
	public CP_v2 getCp_in1_40_roomRateSemiPrivate() {
		return cp_in1_40_roomRateSemiPrivate;
	}
	public CP_v2 getCp_in1_41_roomRatePrivate() {
		return cp_in1_41_roomRatePrivate;
	}
	public CE_v2 getCe_in1_42_insuredsEmploymentStatus() {
		return ce_in1_42_insuredsEmploymentStatus;
	}
	public String getIn1_43_insuredsSex() {
		return in1_43_insuredsSex;
	}
	public XAD_v23 getXad_in1_44_insuredsEmployerAddress() {
		return xad_in1_44_insuredsEmployerAddress;
	}
	public String getIn1_45_verificationStatus() {
		return in1_45_verificationStatus;
	}
	public String getIn1_46_priorInsurancePlanId() {
		return in1_46_priorInsurancePlanId;
	}
	public String getIn1_47_coverageType() {
		return in1_47_coverageType;
	}
	public String getIn1_48_handicap() {
		return in1_48_handicap;
	}
	public CX_v23 getCx_in1_49_insuredsIdNumber() {
		return cx_in1_49_insuredsIdNumber;
	}
	@Override
	public String toString() {
		return "JsonIN1_v23 [in1_1_setId=" + in1_1_setId + ", ce_in1_2_insurancePlanId=" + ce_in1_2_insurancePlanId
				+ ", cx_in1_3_insuranceCompanyId=" + cx_in1_3_insuranceCompanyId + ", xon_in1_4_insuranceCompanyName="
				+ xon_in1_4_insuranceCompanyName + ", xad_in1_5_insuranceCompanyAddress="
				+ xad_in1_5_insuranceCompanyAddress + ", xpn_in1_6_insuranceCompanyContactPerson="
				+ xpn_in1_6_insuranceCompanyContactPerson + ", xtn_in1_7_insuranceCompanyPhoneNumber="
				+ Arrays.toString(xtn_in1_7_insuranceCompanyPhoneNumber) + ", in1_8_groupNumber=" + in1_8_groupNumber
				+ ", xon_in1_9_groupName=" + xon_in1_9_groupName + ", cx_in1_10_insuredsGroupEmployerId="
				+ cx_in1_10_insuredsGroupEmployerId + ", xon_in1_11_insuredsGroupEmployeeName="
				+ xon_in1_11_insuredsGroupEmployeeName + ", in1_12_planEffectiveDate=" + in1_12_planEffectiveDate
				+ ", in1_13_planExpirationDate=" + in1_13_planExpirationDate
				+ ", cm_aui_in1_14_authorizationInformation=" + cm_aui_in1_14_authorizationInformation
				+ ", in1_15_planType=" + in1_15_planType + ", xpn_in1_16_nameOfInsured=" + xpn_in1_16_nameOfInsured
				+ ", in1_17_insuredsRelationshipToPatient=" + in1_17_insuredsRelationshipToPatient
				+ ", ts_in1_18_insuredsDateOfBirth=" + ts_in1_18_insuredsDateOfBirth + ", xad_in1_19_insuredsAddress="
				+ xad_in1_19_insuredsAddress + ", in1_20_assignmentOfBenefits=" + in1_20_assignmentOfBenefits
				+ ", in1_21_coordinationOfBenefits=" + in1_21_coordinationOfBenefits
				+ ", in1_22_coordinationOfBenefitsPriority=" + in1_22_coordinationOfBenefitsPriority
				+ ", in1_23_noticeOfAdmissionCode=" + in1_23_noticeOfAdmissionCode + ", in1_24_noticeOfAdmissionDate="
				+ in1_24_noticeOfAdmissionDate + ", in1_25_reportOfEligibilityCode=" + in1_25_reportOfEligibilityCode
				+ ", in1_26_reportOfEligebilityDate=" + in1_26_reportOfEligebilityDate
				+ ", in1_27_releaseInformationCode=" + in1_27_releaseInformationCode + ", in1_28_preAdmitCert="
				+ in1_28_preAdmitCert + ", ts_in1_29_verificationDateTime=" + ts_in1_29_verificationDateTime
				+ ", xpn_in1_30_verificationBy=" + xpn_in1_30_verificationBy + ", in1_31_typeOfAgreementCode="
				+ in1_31_typeOfAgreementCode + ", in1_32_billingStatus=" + in1_32_billingStatus
				+ ", in1_33_lifetimeReserveDays=" + in1_33_lifetimeReserveDays
				+ ", in1_34_delayBeforeLifetimeReserveDays=" + in1_34_delayBeforeLifetimeReserveDays
				+ ", in1_35_companyPlanCode=" + in1_35_companyPlanCode + ", in1_36_policyNumber=" + in1_36_policyNumber
				+ ", cp_in1_37_policyDeductible=" + cp_in1_37_policyDeductible + ", cp_in1_38_policyLimitAmount="
				+ cp_in1_38_policyLimitAmount + ", in1_39_policyLimitDays=" + in1_39_policyLimitDays
				+ ", cp_in1_40_roomRateSemiPrivate=" + cp_in1_40_roomRateSemiPrivate + ", cp_in1_41_roomRatePrivate="
				+ cp_in1_41_roomRatePrivate + ", ce_in1_42_insuredsEmploymentStatus="
				+ ce_in1_42_insuredsEmploymentStatus + ", in1_43_insuredsSex=" + in1_43_insuredsSex
				+ ", xad_in1_44_insuredsEmployerAddress=" + xad_in1_44_insuredsEmployerAddress
				+ ", in1_45_verificationStatus=" + in1_45_verificationStatus + ", in1_46_priorInsurancePlanId="
				+ in1_46_priorInsurancePlanId + ", in1_47_coverageType=" + in1_47_coverageType + ", in1_48_handicap="
				+ in1_48_handicap + ", cx_in1_49_insuredsIdNumber=" + cx_in1_49_insuredsIdNumber + "]";
	}
	
}
