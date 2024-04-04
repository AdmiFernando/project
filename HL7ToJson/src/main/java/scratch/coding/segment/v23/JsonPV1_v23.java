package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_DLD_v23;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.FC_v23;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.XCN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPV1_v23 {
	@JsonProperty("pv1_1_setIdPatientVisit")
	private String pv1_1_setIdPatientVisit;
	@JsonProperty("pv1_2_patientClass")
	private String pv1_2_patientClass;
	@JsonProperty("pl_pv1_3_assignedPatientLocation")
	private PL_v23 pl_pv1_3_assignedPatientLocation;
	@JsonProperty("pv1_4_admissionType")
	private String pv1_4_admissionType;
	@JsonProperty("cx_pv1_5_preadmitNumber")
	private CX_v23 cx_pv1_5_preadmitNumber;
	@JsonProperty("pl_pv1_6_priorPatientLocation")
	private PL_v23 pl_pv1_6_priorPatientLocation;
	@JsonProperty("xcn_pv1_7_attendingDoctor")
	private XCN_v23[] xcn_pv1_7_attendingDoctor;
	@JsonProperty("xcn_pv1_8_referingDoctor")
	private XCN_v23[] xcn_pv1_8_referingDoctor;
	@JsonProperty("xcn_pv1_9_consultingDoctor")
	private XCN_v23[] xcn_pv1_9_consultingDoctor;
	@JsonProperty("pv1_10_hospitalService")
	private String pv1_10_hospitalService;
	@JsonProperty("pl_pv1_11_temporaryLocation")
	private PL_v23 pl_pv1_11_temporaryLocation;
	@JsonProperty("pv1_12_preadmitTestIndicator")
	private String pv1_12_preadmitTestIndicator;
	@JsonProperty("pv1_13_readMissionIndicator")
	private String pv1_13_readMissionIndicator;
	@JsonProperty("pv1_14_admitSource")
	private String pv1_14_admitSource;
	@JsonProperty("pv1_15_ambulatoryStatus")
	private String[] pv1_15_ambulatoryStatus;
	@JsonProperty("pv1_16_vipIndicator")
	private String pv1_16_vipIndicator;
	@JsonProperty("xcn_pv1_17_admittingDoctor")
	private XCN_v23[] xcn_pv1_17_admittingDoctor;
	@JsonProperty("pv1_18_patientType")
	private String pv1_18_patientType;
	@JsonProperty("cx_pv1_19_visitNumber")
	private CX_v23 cx_pv1_19_visitNumber;
	@JsonProperty("fc_pv1_20_financialClass")
	private FC_v23[] fc_pv1_20_financialClass;
	@JsonProperty("pv1_21_chargePriceIndicator")
	private String pv1_21_chargePriceIndicator;
	@JsonProperty("pv1_22_courtesyCode")
	private String pv1_22_courtesyCode;
	@JsonProperty("pv1_23_creditRating")
	private String pv1_23_creditRating;
	@JsonProperty("pv1_24_contractCode")
	private String[] pv1_24_contractCode;
	@JsonProperty("pv1_25_contractEffectiveDate")
	private String[] pv1_25_contractEffectiveDate;
	@JsonProperty("pv1_26_contractAmount")
	private String[] pv1_26_contractAmount;
	@JsonProperty("pv1_27_contractPeriod")
	private String[] pv1_27_contractPeriod;
	@JsonProperty("pv1_28_interestCode")
	private String pv1_28_interestCode;
	@JsonProperty("pv1_29_transferToBadDebtCode")
	private String pv1_29_transferToBadDebtCode;
	@JsonProperty("pv1_30_transferToBadDebtDate")
	private String pv1_30_transferToBadDebtDate;
	@JsonProperty("pv1_31_badDebtAgencyCode")
	private String pv1_31_badDebtAgencyCode;
	@JsonProperty("pv1_32_badDebtTransferAmount")
	private String pv1_32_badDebtTransferAmount;
	@JsonProperty("pv1_33_badDebtRecoveryAmount")
	private String pv1_33_badDebtRecoveryAmount;
	@JsonProperty("pv1_34_deleteAccountIndicator")
	private String pv1_34_deleteAccountIndicator;
	@JsonProperty("pv1_35_deleteAccountDate")
	private String pv1_35_deleteAccountDate;
	@JsonProperty("pv1_36_dischargeDisposition")
	private String pv1_36_dischargeDisposition;
	@JsonProperty("cm_dld_pv1_37_dischargedToLocation")
	private CM_DLD_v23 cm_dld_pv1_37_dischargedToLocation;
	@JsonProperty("pv1_38_dietType")
	private String pv1_38_dietType;
	@JsonProperty("pv1_39_servicingFacility")
	private String pv1_39_servicingFacility;
	@JsonProperty("pv1_40_bedStatus")
	private String pv1_40_bedStatus;
	@JsonProperty("pv1_41_accountStatus")
	private String pv1_41_accountStatus;
	@JsonProperty("pl_pv1_42_pendingLocation")
	private PL_v23 pl_pv1_42_pendingLocation;
	@JsonProperty("pl_pv1_43_priorTemporaryLocation")
	private PL_v23 pl_pv1_43_priorTemporaryLocation;
	@JsonProperty("ts_pv1_44_admitDateTime")
	private TS_v2 ts_pv1_44_admitDateTime;
	@JsonProperty("ts_pv1_45_dischargeDateTime")
	private TS_v2 ts_pv1_45_dischargeDateTime;
	@JsonProperty("pv1_46_currentPatientBalance")
	private String pv1_46_currentPatientBalance;
	@JsonProperty("pv1_47_totalCharges")
	private String pv1_47_totalCharges;
	@JsonProperty("pv1_48_totalAdjustments")
	private String pv1_48_totalAdjustments;
	@JsonProperty("pv1_49_totalPayments")
	private String pv1_49_totalPayments;
	@JsonProperty("cx_pv1_50_alternateVisitId")
	private CX_v23 cx_pv1_50_alternateVisitId;
	@JsonProperty("pv1_51_visitIndicator")
	private String pv1_51_visitIndicator;
	@JsonProperty("xcn_pv1_52_otherHealthcareProvider")
	private XCN_v23[] xcn_pv1_52_otherHealthcareProvider;
	public JsonPV1_v23() {
		super();
		this.pv1_1_setIdPatientVisit = "";
		this.pv1_2_patientClass = "";
		this.pl_pv1_3_assignedPatientLocation = new PL_v23();
		this.pv1_4_admissionType = "";
		this.cx_pv1_5_preadmitNumber = new CX_v23();
		this.pl_pv1_6_priorPatientLocation = new PL_v23();
		this.xcn_pv1_7_attendingDoctor = new XCN_v23[] {};
		this.xcn_pv1_8_referingDoctor = new XCN_v23[] {};
		this.xcn_pv1_9_consultingDoctor = new XCN_v23[] {};
		this.pv1_10_hospitalService = "";
		this.pl_pv1_11_temporaryLocation = new PL_v23();
		this.pv1_12_preadmitTestIndicator = "";
		this.pv1_13_readMissionIndicator = "";
		this.pv1_14_admitSource = "";
		this.pv1_15_ambulatoryStatus = new String[] {};
		this.pv1_16_vipIndicator = "";
		this.xcn_pv1_17_admittingDoctor = new XCN_v23[] {};
		this.pv1_18_patientType = "";
		this.cx_pv1_19_visitNumber = new CX_v23();
		this.fc_pv1_20_financialClass = new FC_v23[] {};
		this.pv1_21_chargePriceIndicator = "";
		this.pv1_22_courtesyCode = "";
		this.pv1_23_creditRating = "";
		this.pv1_24_contractCode = new String[] {};
		this.pv1_25_contractEffectiveDate = new String[] {};
		this.pv1_26_contractAmount = new String[] {};
		this.pv1_27_contractPeriod = new String[] {};
		this.pv1_28_interestCode = "";
		this.pv1_29_transferToBadDebtCode = "";
		this.pv1_30_transferToBadDebtDate = "";
		this.pv1_31_badDebtAgencyCode = "";
		this.pv1_32_badDebtTransferAmount = "";
		this.pv1_33_badDebtRecoveryAmount = "";
		this.pv1_34_deleteAccountIndicator = "";
		this.pv1_35_deleteAccountDate = "";
		this.pv1_36_dischargeDisposition = "";
		this.cm_dld_pv1_37_dischargedToLocation = new CM_DLD_v23();
		this.pv1_38_dietType = "";
		this.pv1_39_servicingFacility = "";
		this.pv1_40_bedStatus = "";
		this.pv1_41_accountStatus = "";
		this.pl_pv1_42_pendingLocation = new PL_v23();
		this.pl_pv1_43_priorTemporaryLocation = new PL_v23();
		this.ts_pv1_44_admitDateTime = new TS_v2();
		this.ts_pv1_45_dischargeDateTime = new TS_v2();
		this.pv1_46_currentPatientBalance = "";
		this.pv1_47_totalCharges = "";
		this.pv1_48_totalAdjustments = "";
		this.pv1_49_totalPayments = "";
		this.cx_pv1_50_alternateVisitId = new CX_v23();
		this.pv1_51_visitIndicator = "";
		this.xcn_pv1_52_otherHealthcareProvider = new XCN_v23[] {};
	}
	private JsonPV1_v23(PV1Builder builder) {
		super();
		this.pv1_1_setIdPatientVisit = builder.pv1_1_setIdPatientVisit;
		this.pv1_2_patientClass = builder.pv1_2_patientClass;
		this.pl_pv1_3_assignedPatientLocation = builder.pl_pv1_3_assignedPatientLocation;
		this.pv1_4_admissionType = builder.pv1_4_admissionType;
		this.cx_pv1_5_preadmitNumber = builder.cx_pv1_5_preadmitNumber;
		this.pl_pv1_6_priorPatientLocation = builder.pl_pv1_6_priorPatientLocation;
		this.xcn_pv1_7_attendingDoctor = builder.xcn_pv1_7_attendingDoctor;
		this.xcn_pv1_8_referingDoctor = builder.xcn_pv1_8_referingDoctor;
		this.xcn_pv1_9_consultingDoctor = builder.xcn_pv1_9_consultingDoctor;
		this.pv1_10_hospitalService = builder.pv1_10_hospitalService;
		this.pl_pv1_11_temporaryLocation = builder.pl_pv1_11_temporaryLocation;
		this.pv1_12_preadmitTestIndicator = builder.pv1_12_preadmitTestIndicator;
		this.pv1_13_readMissionIndicator = builder.pv1_13_readMissionIndicator;
		this.pv1_14_admitSource = builder.pv1_14_admitSource;
		this.pv1_15_ambulatoryStatus = builder.pv1_15_ambulatoryStatus;
		this.pv1_16_vipIndicator = builder.pv1_16_vipIndicator;
		this.xcn_pv1_17_admittingDoctor = builder.xcn_pv1_17_admittingDoctor;
		this.pv1_18_patientType = builder.pv1_18_patientType;
		this.cx_pv1_19_visitNumber = builder.cx_pv1_19_visitNumber;
		this.fc_pv1_20_financialClass = builder.fc_pv1_20_financialClass;
		this.pv1_21_chargePriceIndicator = builder.pv1_21_chargePriceIndicator;
		this.pv1_22_courtesyCode = builder.pv1_22_courtesyCode;
		this.pv1_23_creditRating = builder.pv1_23_creditRating;
		this.pv1_24_contractCode = builder.pv1_24_contractCode;
		this.pv1_25_contractEffectiveDate = builder.pv1_25_contractEffectiveDate;
		this.pv1_26_contractAmount = builder.pv1_26_contractAmount;
		this.pv1_27_contractPeriod = builder.pv1_27_contractPeriod;
		this.pv1_28_interestCode = builder.pv1_28_interestCode;
		this.pv1_29_transferToBadDebtCode = builder.pv1_29_transferToBadDebtCode;
		this.pv1_30_transferToBadDebtDate = builder.pv1_30_transferToBadDebtDate;
		this.pv1_31_badDebtAgencyCode = builder.pv1_31_badDebtAgencyCode;
		this.pv1_32_badDebtTransferAmount = builder.pv1_32_badDebtTransferAmount;
		this.pv1_33_badDebtRecoveryAmount = builder.pv1_33_badDebtRecoveryAmount;
		this.pv1_34_deleteAccountIndicator = builder.pv1_34_deleteAccountIndicator;
		this.pv1_35_deleteAccountDate = builder.pv1_35_deleteAccountDate;
		this.pv1_36_dischargeDisposition = builder.pv1_36_dischargeDisposition;
		this.cm_dld_pv1_37_dischargedToLocation = builder.cm_dld_pv1_37_dischargedToLocation;
		this.pv1_38_dietType = builder.pv1_38_dietType;
		this.pv1_39_servicingFacility = builder.pv1_39_servicingFacility;
		this.pv1_40_bedStatus = builder.pv1_40_bedStatus;
		this.pv1_41_accountStatus = builder.pv1_41_accountStatus;
		this.pl_pv1_42_pendingLocation = builder.pl_pv1_42_pendingLocation;
		this.pl_pv1_43_priorTemporaryLocation = builder.pl_pv1_43_priorTemporaryLocation;
		this.ts_pv1_44_admitDateTime = builder.ts_pv1_44_admitDateTime;
		this.ts_pv1_45_dischargeDateTime = builder.ts_pv1_45_dischargeDateTime;
		this.pv1_46_currentPatientBalance = builder.pv1_46_currentPatientBalance;
		this.pv1_47_totalCharges = builder.pv1_47_totalCharges;
		this.pv1_48_totalAdjustments = builder.pv1_48_totalAdjustments;
		this.pv1_49_totalPayments = builder.pv1_49_totalPayments;
		this.cx_pv1_50_alternateVisitId = builder.cx_pv1_50_alternateVisitId;
		this.pv1_51_visitIndicator = builder.pv1_51_visitIndicator;
		this.xcn_pv1_52_otherHealthcareProvider = builder.xcn_pv1_52_otherHealthcareProvider;
	}
	public static class PV1Builder {
		private String pv1_1_setIdPatientVisit;
		private String pv1_2_patientClass;
		private PL_v23 pl_pv1_3_assignedPatientLocation;
		private String pv1_4_admissionType;
		private CX_v23 cx_pv1_5_preadmitNumber;
		private PL_v23 pl_pv1_6_priorPatientLocation;
		private XCN_v23[] xcn_pv1_7_attendingDoctor;
		private XCN_v23[] xcn_pv1_8_referingDoctor;
		private XCN_v23[] xcn_pv1_9_consultingDoctor;
		private String pv1_10_hospitalService;
		private PL_v23 pl_pv1_11_temporaryLocation;
		private String pv1_12_preadmitTestIndicator;
		private String pv1_13_readMissionIndicator;
		private String pv1_14_admitSource;
		private String[] pv1_15_ambulatoryStatus;
		private String pv1_16_vipIndicator;
		private XCN_v23[] xcn_pv1_17_admittingDoctor;
		private String pv1_18_patientType;
		private CX_v23 cx_pv1_19_visitNumber;
		private FC_v23[] fc_pv1_20_financialClass;
		private String pv1_21_chargePriceIndicator;
		private String pv1_22_courtesyCode;
		private String pv1_23_creditRating;
		private String[] pv1_24_contractCode;
		private String[] pv1_25_contractEffectiveDate;
		private String[] pv1_26_contractAmount;
		private String[] pv1_27_contractPeriod;
		private String pv1_28_interestCode;
		private String pv1_29_transferToBadDebtCode;
		private String pv1_30_transferToBadDebtDate;
		private String pv1_31_badDebtAgencyCode;
		private String pv1_32_badDebtTransferAmount;
		private String pv1_33_badDebtRecoveryAmount;
		private String pv1_34_deleteAccountIndicator;
		private String pv1_35_deleteAccountDate;
		private String pv1_36_dischargeDisposition;
		private CM_DLD_v23 cm_dld_pv1_37_dischargedToLocation;
		private String pv1_38_dietType;
		private String pv1_39_servicingFacility;
		private String pv1_40_bedStatus;
		private String pv1_41_accountStatus;
		private PL_v23 pl_pv1_42_pendingLocation;
		private PL_v23 pl_pv1_43_priorTemporaryLocation;
		private TS_v2 ts_pv1_44_admitDateTime;
		private TS_v2 ts_pv1_45_dischargeDateTime;
		private String pv1_46_currentPatientBalance;
		private String pv1_47_totalCharges;
		private String pv1_48_totalAdjustments;
		private String pv1_49_totalPayments;
		private CX_v23 cx_pv1_50_alternateVisitId;
		private String pv1_51_visitIndicator;
		private XCN_v23[] xcn_pv1_52_otherHealthcareProvider;
		public PV1Builder(String pv1_2_patientClass) {
			super();
			this.pv1_1_setIdPatientVisit = "";
			this.pv1_2_patientClass = pv1_2_patientClass;
			this.pl_pv1_3_assignedPatientLocation = new PL_v23();
			this.pv1_4_admissionType = "";
			this.cx_pv1_5_preadmitNumber = new CX_v23();
			this.pl_pv1_6_priorPatientLocation = new PL_v23();
			this.xcn_pv1_7_attendingDoctor = new XCN_v23[] {};
			this.xcn_pv1_8_referingDoctor = new XCN_v23[] {};
			this.xcn_pv1_9_consultingDoctor = new XCN_v23[] {};
			this.pv1_10_hospitalService = "";
			this.pl_pv1_11_temporaryLocation = new PL_v23();
			this.pv1_12_preadmitTestIndicator = "";
			this.pv1_13_readMissionIndicator = "";
			this.pv1_14_admitSource = "";
			this.pv1_15_ambulatoryStatus = new String[] {};
			this.pv1_16_vipIndicator = "";
			this.xcn_pv1_17_admittingDoctor = new XCN_v23[] {};
			this.pv1_18_patientType = "";
			this.cx_pv1_19_visitNumber = new CX_v23();
			this.fc_pv1_20_financialClass = new FC_v23[] {};
			this.pv1_21_chargePriceIndicator = "";
			this.pv1_22_courtesyCode = "";
			this.pv1_23_creditRating = "";
			this.pv1_24_contractCode = new String[] {};
			this.pv1_25_contractEffectiveDate = new String[] {};
			this.pv1_26_contractAmount = new String[] {};
			this.pv1_27_contractPeriod = new String[] {};
			this.pv1_28_interestCode = "";
			this.pv1_29_transferToBadDebtCode = "";
			this.pv1_30_transferToBadDebtDate = "";
			this.pv1_31_badDebtAgencyCode = "";
			this.pv1_32_badDebtTransferAmount = "";
			this.pv1_33_badDebtRecoveryAmount = "";
			this.pv1_34_deleteAccountIndicator = "";
			this.pv1_35_deleteAccountDate = "";
			this.pv1_36_dischargeDisposition = "";
			this.cm_dld_pv1_37_dischargedToLocation = new CM_DLD_v23();
			this.pv1_38_dietType = "";
			this.pv1_39_servicingFacility = "";
			this.pv1_40_bedStatus = "";
			this.pv1_41_accountStatus = "";
			this.pl_pv1_42_pendingLocation = new PL_v23();
			this.pl_pv1_43_priorTemporaryLocation = new PL_v23();
			this.ts_pv1_44_admitDateTime = new TS_v2();
			this.ts_pv1_45_dischargeDateTime = new TS_v2();
			this.pv1_46_currentPatientBalance = "";
			this.pv1_47_totalCharges = "";
			this.pv1_48_totalAdjustments = "";
			this.pv1_49_totalPayments = "";
			this.cx_pv1_50_alternateVisitId = new CX_v23();
			this.pv1_51_visitIndicator = "";
			this.xcn_pv1_52_otherHealthcareProvider = new XCN_v23[] {};
		}
		public PV1Builder pv1_1_setIdPatientVisit(String pv1_1_setIdPatientVisit) {
			this.pv1_1_setIdPatientVisit = pv1_1_setIdPatientVisit;
			return this;
		}
		public PV1Builder pv1_2_patientClass(String pv1_2_patientClass) {
			this.pv1_2_patientClass = pv1_2_patientClass;
			return this;
		}
		public PV1Builder pl_pv1_3_assignedPatientLocation(PL_v23 pl_pv1_3_assignedPatientLocation) {
			this.pl_pv1_3_assignedPatientLocation = pl_pv1_3_assignedPatientLocation;
			return this;
		}
		public PV1Builder pv1_4_admissionType(String pv1_4_admissionType) {
			this.pv1_4_admissionType = pv1_4_admissionType;
			return this;
		}
		public PV1Builder cx_pv1_5_preadmitNumber(CX_v23 cx_pv1_5_preadmitNumber) {
			this.cx_pv1_5_preadmitNumber = cx_pv1_5_preadmitNumber;
			return this;
		}
		public PV1Builder pl_pv1_6_priorPatientLocation(PL_v23 pl_pv1_6_priorPatientLocation) {
			this.pl_pv1_6_priorPatientLocation = pl_pv1_6_priorPatientLocation;
			return this;
		}
		public PV1Builder xcn_pv1_7_attendingDoctor(XCN_v23[] xcn_pv1_7_attendingDoctor) {
			this.xcn_pv1_7_attendingDoctor = xcn_pv1_7_attendingDoctor;
			return this;
		}
		public PV1Builder xcn_pv1_8_referingDoctor(XCN_v23[] xcn_pv1_8_referingDoctor) {
			this.xcn_pv1_8_referingDoctor = xcn_pv1_8_referingDoctor;
			return this;
		}
		public PV1Builder xcn_pv1_9_consultingDoctor(XCN_v23[] xcn_pv1_9_consultingDoctor) {
			this.xcn_pv1_9_consultingDoctor = xcn_pv1_9_consultingDoctor;
			return this;
		}
		public PV1Builder pv1_10_hospitalService(String pv1_10_hospitalService) {
			this.pv1_10_hospitalService = pv1_10_hospitalService;
			return this;
		}
		public PV1Builder pl_pv1_11_temporaryLocation(PL_v23 pl_pv1_11_temporaryLocation) {
			this.pl_pv1_11_temporaryLocation = pl_pv1_11_temporaryLocation;
			return this;
		}
		public PV1Builder pv1_12_preadmitTestIndicator(String pv1_12_preadmitTestIndicator) {
			this.pv1_12_preadmitTestIndicator = pv1_12_preadmitTestIndicator;
			return this;
		}
		public PV1Builder pv1_13_readMissionIndicator(String pv1_13_readMissionIndicator) {
			this.pv1_13_readMissionIndicator = pv1_13_readMissionIndicator;
			return this;
		}
		public PV1Builder pv1_14_admitSource(String pv1_14_admitSource) {
			this.pv1_14_admitSource = pv1_14_admitSource;
			return this;
		}
		public PV1Builder pv1_15_ambulatoryStatus(String[] pv1_15_ambulatoryStatus) {
			this.pv1_15_ambulatoryStatus = pv1_15_ambulatoryStatus;
			return this;
		}
		public PV1Builder pv1_16_vipIndicator(String pv1_16_vipIndicator) {
			this.pv1_16_vipIndicator = pv1_16_vipIndicator;
			return this;
		}
		public PV1Builder xcn_pv1_17_admittingDoctor(XCN_v23[] xcn_pv1_17_admittingDoctor) {
			this.xcn_pv1_17_admittingDoctor = xcn_pv1_17_admittingDoctor;
			return this;
		}
		public PV1Builder pv1_18_patientType(String pv1_18_patientType) {
			this.pv1_18_patientType = pv1_18_patientType;
			return this;
		}
		public PV1Builder cx_pv1_19_visitNumber(CX_v23 cx_pv1_19_visitNumber) {
			this.cx_pv1_19_visitNumber = cx_pv1_19_visitNumber;
			return this;
		}
		public PV1Builder fc_pv1_20_financialClass(FC_v23[] fc_pv1_20_financialClass) {
			this.fc_pv1_20_financialClass = fc_pv1_20_financialClass;
			return this;
		}
		public PV1Builder pv1_21_chargePriceIndicator(String pv1_21_chargePriceIndicator) {
			this.pv1_21_chargePriceIndicator = pv1_21_chargePriceIndicator;
			return this;
		}
		public PV1Builder pv1_22_courtesyCode(String pv1_22_courtesyCode) {
			this.pv1_22_courtesyCode = pv1_22_courtesyCode;
			return this;
		}
		public PV1Builder pv1_23_creditRating(String pv1_23_creditRating) {
			this.pv1_23_creditRating = pv1_23_creditRating;
			return this;
		}
		public PV1Builder pv1_24_contractCode(String[] pv1_24_contractCode) {
			this.pv1_24_contractCode = pv1_24_contractCode;
			return this;
		}
		public PV1Builder pv1_25_contractEffectiveDate(String[] pv1_25_contractEffectiveDate) {
			this.pv1_25_contractEffectiveDate = pv1_25_contractEffectiveDate;
			return this;
		}
		public PV1Builder pv1_26_contractAmount(String[] pv1_26_contractAmount) {
			this.pv1_26_contractAmount = pv1_26_contractAmount;
			return this;
		}
		public PV1Builder pv1_27_contractPeriod(String[] pv1_27_contractPeriod) {
			this.pv1_27_contractPeriod = pv1_27_contractPeriod;
			return this;
		}
		public PV1Builder pv1_28_interestCode(String pv1_28_interestCode) {
			this.pv1_28_interestCode = pv1_28_interestCode;
			return this;
		}
		public PV1Builder pv1_29_transferToBadDebtCode(String pv1_29_transferToBadDebtCode) {
			this.pv1_29_transferToBadDebtCode = pv1_29_transferToBadDebtCode;
			return this;
		}
		public PV1Builder pv1_30_transferToBadDebtDate(String pv1_30_transferToBadDebtDate) {
			this.pv1_30_transferToBadDebtDate = pv1_30_transferToBadDebtDate;
			return this;
		}
		public PV1Builder pv1_31_badDebtAgencyCode(String pv1_31_badDebtAgencyCode) {
			this.pv1_31_badDebtAgencyCode = pv1_31_badDebtAgencyCode;
			return this;
		}
		public PV1Builder pv1_32_badDebtTransferAmount(String pv1_32_badDebtTransferAmount) {
			this.pv1_32_badDebtTransferAmount = pv1_32_badDebtTransferAmount;
			return this;
		}
		public PV1Builder pv1_33_badDebtRecoveryAmount(String pv1_33_badDebtRecoveryAmount) {
			this.pv1_33_badDebtRecoveryAmount = pv1_33_badDebtRecoveryAmount;
			return this;
		}
		public PV1Builder pv1_34_deleteAccountIndicator(String pv1_34_deleteAccountIndicator) {
			this.pv1_34_deleteAccountIndicator = pv1_34_deleteAccountIndicator;
			return this;
		}
		public PV1Builder pv1_35_deleteAccountDate(String pv1_35_deleteAccountDate) {
			this.pv1_35_deleteAccountDate = pv1_35_deleteAccountDate;
			return this;
		}
		public PV1Builder pv1_36_dischargeDisposition(String pv1_36_dischargeDisposition) {
			this.pv1_36_dischargeDisposition = pv1_36_dischargeDisposition;
			return this;
		}
		public PV1Builder cm_dld_pv1_37_dischargedToLocation(CM_DLD_v23 cm_dld_pv1_37_dischargedToLocation) {
			this.cm_dld_pv1_37_dischargedToLocation = cm_dld_pv1_37_dischargedToLocation;
			return this;
		}
		public PV1Builder pv1_38_dietType(String pv1_38_dietType) {
			this.pv1_38_dietType = pv1_38_dietType;
			return this;
		}
		public PV1Builder pv1_39_servicingFacility(String pv1_39_servicingFacility) {
			this.pv1_39_servicingFacility = pv1_39_servicingFacility;
			return this;
		}
		public PV1Builder pv1_40_bedStatus(String pv1_40_bedStatus) {
			this.pv1_40_bedStatus = pv1_40_bedStatus;
			return this;
		}
		public PV1Builder pv1_41_accountStatus(String pv1_41_accountStatus) {
			this.pv1_41_accountStatus = pv1_41_accountStatus;
			return this;
		}
		public PV1Builder pl_pv1_42_pendingLocation(PL_v23 pl_pv1_42_pendingLocation) {
			this.pl_pv1_42_pendingLocation = pl_pv1_42_pendingLocation;
			return this;
		}
		public PV1Builder pl_pv1_43_priorTemporaryLocation(PL_v23 pl_pv1_43_priorTemporaryLocation) {
			this.pl_pv1_43_priorTemporaryLocation = pl_pv1_43_priorTemporaryLocation;
			return this;
		}
		public PV1Builder ts_pv1_44_admitDateTime(TS_v2 ts_pv1_44_admitDateTime) {
			this.ts_pv1_44_admitDateTime = ts_pv1_44_admitDateTime;
			return this;
		}
		public PV1Builder ts_pv1_45_dischargeDateTime(TS_v2 ts_pv1_45_dischargeDateTime) {
			this.ts_pv1_45_dischargeDateTime = ts_pv1_45_dischargeDateTime;
			return this;
		}
		public PV1Builder pv1_46_currentPatientBalance(String pv1_46_currentPatientBalance) {
			this.pv1_46_currentPatientBalance = pv1_46_currentPatientBalance;
			return this;
		}
		public PV1Builder pv1_47_totalCharges(String pv1_47_totalCharges) {
			this.pv1_47_totalCharges = pv1_47_totalCharges;
			return this;
		}
		public PV1Builder pv1_48_totalAdjustments(String pv1_48_totalAdjustments) {
			this.pv1_48_totalAdjustments = pv1_48_totalAdjustments;
			return this;
		}
		public PV1Builder pv1_49_totalPayments(String pv1_49_totalPayments) {
			this.pv1_49_totalPayments = pv1_49_totalPayments;
			return this;
		}
		public PV1Builder cx_pv1_50_alternateVisitId(CX_v23 cx_pv1_50_alternateVisitId) {
			this.cx_pv1_50_alternateVisitId = cx_pv1_50_alternateVisitId;
			return this;
		}
		public PV1Builder pv1_51_visitIndicator(String pv1_51_visitIndicator) {
			this.pv1_51_visitIndicator = pv1_51_visitIndicator;
			return this;
		}
		public PV1Builder xcn_pv1_52_otherHealthcareProvider(XCN_v23[] xcn_pv1_52_otherHealthcareProvider) {
			this.xcn_pv1_52_otherHealthcareProvider = xcn_pv1_52_otherHealthcareProvider;
			return this;
		}
		public JsonPV1_v23 build() {
			return new JsonPV1_v23(this);
		}
	}
	public String getPv1_1_setIdPatientVisit() {
		return pv1_1_setIdPatientVisit;
	}
	public String getPv1_2_patientClass() {
		return pv1_2_patientClass;
	}
	public PL_v23 getPl_pv1_3_assignedPatientLocation() {
		return pl_pv1_3_assignedPatientLocation;
	}
	public String getPv1_4_admissionType() {
		return pv1_4_admissionType;
	}
	public CX_v23 getCx_pv1_5_preadmitNumber() {
		return cx_pv1_5_preadmitNumber;
	}
	public PL_v23 getPl_pv1_6_priorPatientLocation() {
		return pl_pv1_6_priorPatientLocation;
	}
	public XCN_v23[] getXcn_pv1_7_attendingDoctor() {
		return xcn_pv1_7_attendingDoctor;
	}
	public XCN_v23[] getXcn_pv1_8_referingDoctor() {
		return xcn_pv1_8_referingDoctor;
	}
	public XCN_v23[] getXcn_pv1_9_consultingDoctor() {
		return xcn_pv1_9_consultingDoctor;
	}
	public String getPv1_10_hospitalService() {
		return pv1_10_hospitalService;
	}
	public PL_v23 getPl_pv1_11_temporaryLocation() {
		return pl_pv1_11_temporaryLocation;
	}
	public String getPv1_12_preadmitTestIndicator() {
		return pv1_12_preadmitTestIndicator;
	}
	public String getPv1_13_readMissionIndicator() {
		return pv1_13_readMissionIndicator;
	}
	public String getPv1_14_admitSource() {
		return pv1_14_admitSource;
	}
	public String[] getPv1_15_ambulatoryStatus() {
		return pv1_15_ambulatoryStatus;
	}
	public String getPv1_16_vipIndicator() {
		return pv1_16_vipIndicator;
	}
	public XCN_v23[] getXcn_pv1_17_admittingDoctor() {
		return xcn_pv1_17_admittingDoctor;
	}
	public String getPv1_18_patientType() {
		return pv1_18_patientType;
	}
	public CX_v23 getCx_pv1_19_visitNumber() {
		return cx_pv1_19_visitNumber;
	}
	public FC_v23[] getFc_pv1_20_financialClass() {
		return fc_pv1_20_financialClass;
	}
	public String getPv1_21_chargePriceIndicator() {
		return pv1_21_chargePriceIndicator;
	}
	public String getPv1_22_courtesyCode() {
		return pv1_22_courtesyCode;
	}
	public String getPv1_23_creditRating() {
		return pv1_23_creditRating;
	}
	public String[] getPv1_24_contractCode() {
		return pv1_24_contractCode;
	}
	public String[] getPv1_25_contractEffectiveDate() {
		return pv1_25_contractEffectiveDate;
	}
	public String[] getPv1_26_contractAmount() {
		return pv1_26_contractAmount;
	}
	public String[] getPv1_27_contractPeriod() {
		return pv1_27_contractPeriod;
	}
	public String getPv1_28_interestCode() {
		return pv1_28_interestCode;
	}
	public String getPv1_29_transferToBadDebtCode() {
		return pv1_29_transferToBadDebtCode;
	}
	public String getPv1_30_transferToBadDebtDate() {
		return pv1_30_transferToBadDebtDate;
	}
	public String getPv1_31_badDebtAgencyCode() {
		return pv1_31_badDebtAgencyCode;
	}
	public String getPv1_32_badDebtTransferAmount() {
		return pv1_32_badDebtTransferAmount;
	}
	public String getPv1_33_badDebtRecoveryAmount() {
		return pv1_33_badDebtRecoveryAmount;
	}
	public String getPv1_34_deleteAccountIndicator() {
		return pv1_34_deleteAccountIndicator;
	}
	public String getPv1_35_deleteAccountDate() {
		return pv1_35_deleteAccountDate;
	}
	public String getPv1_36_dischargeDisposition() {
		return pv1_36_dischargeDisposition;
	}
	public CM_DLD_v23 getCm_dld_pv1_37_dischargedToLocation() {
		return cm_dld_pv1_37_dischargedToLocation;
	}
	public String getPv1_38_dietType() {
		return pv1_38_dietType;
	}
	public String getPv1_39_servicingFacility() {
		return pv1_39_servicingFacility;
	}
	public String getPv1_40_bedStatus() {
		return pv1_40_bedStatus;
	}
	public String getPv1_41_accountStatus() {
		return pv1_41_accountStatus;
	}
	public PL_v23 getPl_pv1_42_pendingLocation() {
		return pl_pv1_42_pendingLocation;
	}
	public PL_v23 getPl_pv1_43_priorTemporaryLocation() {
		return pl_pv1_43_priorTemporaryLocation;
	}
	public TS_v2 getTs_pv1_44_admitDateTime() {
		return ts_pv1_44_admitDateTime;
	}
	public TS_v2 getTs_pv1_45_dischargeDateTime() {
		return ts_pv1_45_dischargeDateTime;
	}
	public String getPv1_46_currentPatientBalance() {
		return pv1_46_currentPatientBalance;
	}
	public String getPv1_47_totalCharges() {
		return pv1_47_totalCharges;
	}
	public String getPv1_48_totalAdjustments() {
		return pv1_48_totalAdjustments;
	}
	public String getPv1_49_totalPayments() {
		return pv1_49_totalPayments;
	}
	public CX_v23 getCx_pv1_50_alternateVisitId() {
		return cx_pv1_50_alternateVisitId;
	}
	public String getPv1_51_visitIndicator() {
		return pv1_51_visitIndicator;
	}
	public XCN_v23[] getXcn_pv1_52_otherHealthcareProvider() {
		return xcn_pv1_52_otherHealthcareProvider;
	}
	@Override
	public String toString() {
		return "JsonPV1_v23 [pv1_1_setIdPatientVisit=" + pv1_1_setIdPatientVisit + ", pv1_2_patientClass="
				+ pv1_2_patientClass + ", pl_pv1_3_assignedPatientLocation=" + pl_pv1_3_assignedPatientLocation
				+ ", pv1_4_admissionType=" + pv1_4_admissionType + ", cx_pv1_5_preadmitNumber="
				+ cx_pv1_5_preadmitNumber + ", pl_pv1_6_priorPatientLocation=" + pl_pv1_6_priorPatientLocation
				+ ", xcn_pv1_7_attendingDoctor=" + Arrays.toString(xcn_pv1_7_attendingDoctor)
				+ ", xcn_pv1_8_referingDoctor=" + Arrays.toString(xcn_pv1_8_referingDoctor)
				+ ", xcn_pv1_9_consultingDoctor=" + Arrays.toString(xcn_pv1_9_consultingDoctor)
				+ ", pv1_10_hospitalService=" + pv1_10_hospitalService + ", pl_pv1_11_temporaryLocation="
				+ pl_pv1_11_temporaryLocation + ", pv1_12_preadmitTestIndicator=" + pv1_12_preadmitTestIndicator
				+ ", pv1_13_readMissionIndicator=" + pv1_13_readMissionIndicator + ", pv1_14_admitSource="
				+ pv1_14_admitSource + ", pv1_15_ambulatoryStatus=" + Arrays.toString(pv1_15_ambulatoryStatus)
				+ ", pv1_16_vipIndicator=" + pv1_16_vipIndicator + ", xcn_pv1_17_admittingDoctor="
				+ Arrays.toString(xcn_pv1_17_admittingDoctor) + ", pv1_18_patientType=" + pv1_18_patientType
				+ ", cx_pv1_19_visitNumber=" + cx_pv1_19_visitNumber + ", fc_pv1_20_financialClass="
				+ Arrays.toString(fc_pv1_20_financialClass) + ", pv1_21_chargePriceIndicator="
				+ pv1_21_chargePriceIndicator + ", pv1_22_courtesyCode=" + pv1_22_courtesyCode
				+ ", pv1_23_creditRating=" + pv1_23_creditRating + ", pv1_24_contractCode="
				+ Arrays.toString(pv1_24_contractCode) + ", pv1_25_contractEffectiveDate="
				+ Arrays.toString(pv1_25_contractEffectiveDate) + ", pv1_26_contractAmount="
				+ Arrays.toString(pv1_26_contractAmount) + ", pv1_27_contractPeriod="
				+ Arrays.toString(pv1_27_contractPeriod) + ", pv1_28_interestCode=" + pv1_28_interestCode
				+ ", pv1_29_transferToBadDebtCode=" + pv1_29_transferToBadDebtCode + ", pv1_30_transferToBadDebtDate="
				+ pv1_30_transferToBadDebtDate + ", pv1_31_badDebtAgencyCode=" + pv1_31_badDebtAgencyCode
				+ ", pv1_32_badDebtTransferAmount=" + pv1_32_badDebtTransferAmount + ", pv1_33_badDebtRecoveryAmount="
				+ pv1_33_badDebtRecoveryAmount + ", pv1_34_deleteAccountIndicator=" + pv1_34_deleteAccountIndicator
				+ ", pv1_35_deleteAccountDate=" + pv1_35_deleteAccountDate + ", pv1_36_dischargeDisposition="
				+ pv1_36_dischargeDisposition + ", cm_dld_pv1_37_dischargedToLocation="
				+ cm_dld_pv1_37_dischargedToLocation + ", pv1_38_dietType=" + pv1_38_dietType
				+ ", pv1_39_servicingFacility=" + pv1_39_servicingFacility + ", pv1_40_bedStatus=" + pv1_40_bedStatus
				+ ", pv1_41_accountStatus=" + pv1_41_accountStatus + ", pl_pv1_42_pendingLocation="
				+ pl_pv1_42_pendingLocation + ", pl_pv1_43_priorTemporaryLocation=" + pl_pv1_43_priorTemporaryLocation
				+ ", ts_pv1_44_admitDateTime=" + ts_pv1_44_admitDateTime + ", ts_pv1_45_dischargeDateTime="
				+ ts_pv1_45_dischargeDateTime + ", pv1_46_currentPatientBalance=" + pv1_46_currentPatientBalance
				+ ", pv1_47_totalCharges=" + pv1_47_totalCharges + ", pv1_48_totalAdjustments="
				+ pv1_48_totalAdjustments + ", pv1_49_totalPayments=" + pv1_49_totalPayments
				+ ", cx_pv1_50_alternateVisitId=" + cx_pv1_50_alternateVisitId + ", pv1_51_visitIndicator="
				+ pv1_51_visitIndicator + ", xcn_pv1_52_otherHealthcareProvider="
				+ Arrays.toString(xcn_pv1_52_otherHealthcareProvider) + "]";
	}
	
}
