package scratch.coding.generator.segment.v23;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import scratch.coding.segment.v23.JsonPV1_v23;
import scratch.coding.services.CommonService;

public class PV1Segment_v23 {

	public static void setPv1(ORM_O01 orm, JsonPV1_v23 jsonPv1) throws DataTypeException {
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv11_SetIDPatientVisit().setValue(jsonPv1.getPv1_1_setIdPatientVisit());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv12_PatientClass().setValue(jsonPv1.getPv1_2_patientClass());
		CommonService.setPL_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv13_AssignedPatientLocation(), jsonPv1.getPl_pv1_3_assignedPatientLocation());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv14_AdmissionType().setValue(jsonPv1.getPv1_4_admissionType());
		CommonService.setCX_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv15_PreadmitNumber(), jsonPv1.getCx_pv1_5_preadmitNumber());
		CommonService.setPL_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv16_PriorPatientLocation(), jsonPv1.getPl_pv1_6_priorPatientLocation());
		for(int i = 0; i <jsonPv1.getXcn_pv1_7_attendingDoctor().length; i++) {
			CommonService.setXCN_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv17_AttendingDoctor(i), jsonPv1.getXcn_pv1_7_attendingDoctor()[i]);
		}
		for(int i = 0; i<jsonPv1.getXcn_pv1_8_referingDoctor().length;i++) {
			CommonService.setXCN_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv18_ReferringDoctor(i),jsonPv1.getXcn_pv1_8_referingDoctor()[i]); 
		}
		for(int i = 0; i<jsonPv1.getXcn_pv1_9_consultingDoctor().length;i++) {
			CommonService.setXCN_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv19_ConsultingDoctor(i),jsonPv1.getXcn_pv1_9_consultingDoctor()[i]); 
		}
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv110_HospitalService().setValue(jsonPv1.getPv1_10_hospitalService());
		CommonService.setPL_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv111_TemporaryLocation(), jsonPv1.getPl_pv1_11_temporaryLocation());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv112_PreadmitTestIndicator().setValue(jsonPv1.getPv1_12_preadmitTestIndicator());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv113_ReadmissionIndicator().setValue(jsonPv1.getPv1_13_readMissionIndicator());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv114_AdmitSource().setValue(jsonPv1.getPv1_14_admitSource());
		for(int i = 0; i <jsonPv1.getPv1_15_ambulatoryStatus().length; i++) {			
			orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv115_AmbulatoryStatus(i).setValue(jsonPv1.getPv1_15_ambulatoryStatus()[i]);
		}
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv116_VIPIndicator().setValue(jsonPv1.getPv1_16_vipIndicator());
		for(int i = 0; i<jsonPv1.getXcn_pv1_17_admittingDoctor().length ;i++) {
			CommonService.setXCN_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv117_AdmittingDoctor(i),jsonPv1.getXcn_pv1_17_admittingDoctor()[i]); 
		}
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv118_PatientType().setValue(jsonPv1.getPv1_18_patientType());
		CommonService.setCX_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv119_VisitNumber(), jsonPv1.getCx_pv1_19_visitNumber());
		for(int i =0; i<jsonPv1.getFc_pv1_20_financialClass().length;i++) {
			CommonService.setFC_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv120_FinancialClass(i), jsonPv1.getFc_pv1_20_financialClass()[i]);
		}
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv121_ChargePriceIndicator().setValue(jsonPv1.getPv1_21_chargePriceIndicator());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv122_CourtesyCode().setValue(jsonPv1.getPv1_22_courtesyCode());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv123_CreditRating().setValue(jsonPv1.getPv1_23_creditRating());
		for(int i = 0; i < jsonPv1.getPv1_24_contractCode().length; i++) {
			orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv124_ContractCode(i).setValue(jsonPv1.getPv1_24_contractCode()[i]);
		}
		for(int i = 0; i < jsonPv1.getPv1_25_contractEffectiveDate().length; i++) {
			orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv125_ContractEffectiveDate(i).setValue(jsonPv1.getPv1_25_contractEffectiveDate()[i]);
		}
		for(int i = 0; i < jsonPv1.getPv1_26_contractAmount().length; i++) {
			orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv126_ContractAmount(i).setValue(jsonPv1.getPv1_26_contractAmount()[i]);
		}
		for(int i = 0; i < jsonPv1.getPv1_27_contractPeriod().length; i++) {
			orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv127_ContractPeriod(i).setValue(jsonPv1.getPv1_27_contractPeriod()[i]);
		}
		
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv128_InterestCode().setValue(jsonPv1.getPv1_28_interestCode());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv129_TransferToBadDebtCode().setValue(jsonPv1.getPv1_29_transferToBadDebtCode());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv130_TransferToBadDebtDate().setValue(jsonPv1.getPv1_30_transferToBadDebtDate());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv131_BadDebtAgencyCode().setValue(jsonPv1.getPv1_31_badDebtAgencyCode());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv132_BadDebtTransferAmount().setValue(jsonPv1.getPv1_32_badDebtTransferAmount());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv133_BadDebtRecoveryAmount().setValue(jsonPv1.getPv1_33_badDebtRecoveryAmount());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv134_DeleteAccountIndicator().setValue(jsonPv1.getPv1_34_deleteAccountIndicator());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv135_DeleteAccountDate().setValue(jsonPv1.getPv1_35_deleteAccountDate());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv136_DischargeDisposition().setValue(jsonPv1.getPv1_36_dischargeDisposition());
		CommonService.setCM_DLD_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv137_DischargedToLocation(), jsonPv1.getCm_dld_pv1_37_dischargedToLocation());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv138_DietType().setValue(jsonPv1.getPv1_38_dietType());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv139_ServicingFacility().setValue(jsonPv1.getPv1_39_servicingFacility());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv140_BedStatus().setValue(jsonPv1.getPv1_40_bedStatus());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv141_AccountStatus().setValue(jsonPv1.getPv1_41_accountStatus());
		CommonService.setPL_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv142_PendingLocation(), jsonPv1.getPl_pv1_42_pendingLocation());
		CommonService.setPL_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv143_PriorTemporaryLocation(), jsonPv1.getPl_pv1_43_priorTemporaryLocation());
		CommonService.setTS_v2(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv144_AdmitDateTime(), jsonPv1.getTs_pv1_44_admitDateTime());
		CommonService.setTS_v2(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv145_DischargeDateTime(), jsonPv1.getTs_pv1_45_dischargeDateTime());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv146_CurrentPatientBalance().setValue(jsonPv1.getPv1_46_currentPatientBalance());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv147_TotalCharges().setValue(jsonPv1.getPv1_47_totalCharges());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv148_TotalAdjustments().setValue(jsonPv1.getPv1_48_totalAdjustments());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv149_TotalPayments().setValue(jsonPv1.getPv1_49_totalPayments());
		CommonService.setCX_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv150_AlternateVisitID(), jsonPv1.getCx_pv1_50_alternateVisitId());
		orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv151_VisitIndicator().setValue(jsonPv1.getPv1_51_visitIndicator());
		for(int i = 0; i<jsonPv1.getXcn_pv1_52_otherHealthcareProvider().length ;i++) {
			CommonService.setXCN_v23(orm.getPATIENT().getPATIENT_VISIT().getPV1().getPv152_OtherHealthcareProvider(i),jsonPv1.getXcn_pv1_52_otherHealthcareProvider()[i]); 
		}		
	}
}
