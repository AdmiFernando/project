package scratch.coding.generator.segment.v23;


import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import scratch.coding.segment.v23.JsonIN1_v23;
import scratch.coding.services.CommonService;
public class IN1Segment_v23 {

	
	public void setIN1(ORM_O01 orm, JsonIN1_v23 customIN1) throws DataTypeException {
		orm.getPATIENT().getINSURANCE().getIN1().getIn11_SetIDInsurance().setValue(customIN1.getIn1_1_setId());
		CommonService.setCE_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn12_InsurancePlanID(), customIN1.getCe_in1_2_insurancePlanId()); 
		CommonService.setCX_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn13_InsuranceCompanyID(), customIN1.getCx_in1_3_insuranceCompanyId());
		CommonService.setXON_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn14_InsuranceCompanyName(), customIN1.getXon_in1_4_insuranceCompanyName());
		CommonService.setXAD_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn15_InsuranceCompanyAddress(), customIN1.getXad_in1_5_insuranceCompanyAddress());
		CommonService.setXPN_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn16_InsuranceCoContactPpers(), customIN1.getXpn_in1_6_insuranceCompanyContactPerson());
		for(int i = 0; i <customIN1.getXtn_in1_7_insuranceCompanyPhoneNumber().length; i++) {
			CommonService.setXTN_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn17_InsuranceCoPhoneNumber(i), customIN1.getXtn_in1_7_insuranceCompanyPhoneNumber()[i]);			
		}
		orm.getPATIENT().getINSURANCE().getIN1().getIn18_GroupNumber().setValue(customIN1.getIn1_8_groupNumber());
		CommonService.setXON_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn19_GroupName(), customIN1.getXon_in1_9_groupName());
		CommonService.setCX_23(orm.getPATIENT().getINSURANCE().getIN1().getIn110_InsuredSGroupEmployerID(), customIN1.getCx_in1_10_insuredsGroupEmployerId()); 
		CommonService.setXON_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn111_InsuredSGroupEmpName(), customIN1.getXon_in1_11_insuredsGroupEmployeeName());
		orm.getPATIENT().getINSURANCE().getIN1().getIn112_PlanEffectiveDate().setValue(customIN1.getIn1_12_planEffectiveDate());
		orm.getPATIENT().getINSURANCE().getIN1().getIn113_PlanExpirationDate().setValue(customIN1.getIn1_13_planExpirationDate());
		CommonService.setCM_AUI_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn114_AuthorizationInformation(), customIN1.getCm_aui_in1_14_authorizationInformation());
		orm.getPATIENT().getINSURANCE().getIN1().getIn115_PlanType().setValue(customIN1.getIn1_15_planType());
		CommonService.setXPN_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn116_NameOfInsured(), customIN1.getXpn_in1_16_nameOfInsured());
		orm.getPATIENT().getINSURANCE().getIN1().getIn117_InsuredSRelationshipToPatient().setValue(customIN1.getIn1_17_insuredsRelationshipToPatient());
		CommonService.setTS_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn118_InsuredSDateOfBirth(), customIN1.getTs_in1_18_insuredsDateOfBirth());
		CommonService.setXAD_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn119_InsuredSAddress(), customIN1.getXad_in1_19_insuredsAddress());
		orm.getPATIENT().getINSURANCE().getIN1().getIn120_AssignmentOfBenefits().setValue(customIN1.getIn1_20_assignmentOfBenefits());
		orm.getPATIENT().getINSURANCE().getIN1().getIn121_CoordinationOfBenefits().setValue(customIN1.getIn1_21_coordinationOfBenefits());
		orm.getPATIENT().getINSURANCE().getIN1().getIn122_CoordOfBenPriority().setValue(customIN1.getIn1_22_coordinationOfBenefitsPriority());
		orm.getPATIENT().getINSURANCE().getIN1().getIn123_NoticeOfAdmissionCode().setValue(customIN1.getIn1_23_noticeOfAdmissionCode());
		orm.getPATIENT().getINSURANCE().getIN1().getIn124_NoticeOfAdmissionDate().setValue(customIN1.getIn1_24_noticeOfAdmissionDate());
		orm.getPATIENT().getINSURANCE().getIN1().getIn125_RptOfEigibilityCode().setValue(customIN1.getIn1_25_reportOfEligibilityCode());
		orm.getPATIENT().getINSURANCE().getIN1().getIn126_RptOfEligibilityDate().setValue(customIN1.getIn1_26_reportOfEligebilityDate());
		orm.getPATIENT().getINSURANCE().getIN1().getIn127_ReleaseInformationCode().setValue(customIN1.getIn1_27_releaseInformationCode());
		orm.getPATIENT().getINSURANCE().getIN1().getIn128_PreAdmitCert().setValue(customIN1.getIn1_28_preAdmitCert());
		CommonService.setTS_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn129_VerificationDateTime(), customIN1.getTs_in1_29_verificationDateTime());
		CommonService.setXPN_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn130_VerificationBy(), customIN1.getXpn_in1_30_verificationBy());
		orm.getPATIENT().getINSURANCE().getIN1().getIn131_TypeOfAgreementCode().setValue(customIN1.getIn1_31_typeOfAgreementCode());
		orm.getPATIENT().getINSURANCE().getIN1().getIn132_BillingStatus().setValue(customIN1.getIn1_32_billingStatus());
		orm.getPATIENT().getINSURANCE().getIN1().getIn133_LifetimeReserveDays().setValue(customIN1.getIn1_33_lifetimeReserveDays());
		orm.getPATIENT().getINSURANCE().getIN1().getIn134_DelayBeforeLifetimeReserveDays().setValue(customIN1.getIn1_34_delayBeforeLifetimeReserveDays());
		orm.getPATIENT().getINSURANCE().getIN1().getIn135_CompanyPlanCode().setValue(customIN1.getIn1_35_companyPlanCode());
		orm.getPATIENT().getINSURANCE().getIN1().getIn136_PolicyNumber().setValue(customIN1.getIn1_36_policyNumber());
		CommonService.setCP_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn137_PolicyDeductible(), customIN1.getCp_in1_37_policyDeductible());
		CommonService.setCP_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn138_PolicyLimitAmount(), customIN1.getCp_in1_38_policyLimitAmount());
		orm.getPATIENT().getINSURANCE().getIN1().getIn139_PolicyLimitDays().setValue(customIN1.getIn1_39_policyLimitDays());
	 	CommonService.setCP_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn140_RoomRateSemiPrivate(), customIN1.getCp_in1_40_roomRateSemiPrivate());
		CommonService.setCP_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn141_RoomRatePrivate(), customIN1.getCp_in1_41_roomRatePrivate());
		CommonService.setCE_v2(orm.getPATIENT().getINSURANCE().getIN1().getIn142_InsuredSEmploymentStatus(), customIN1.getCe_in1_42_insuredsEmploymentStatus());
		orm.getPATIENT().getINSURANCE().getIN1().getIn143_InsuredSSex().setValue(customIN1.getIn1_43_insuredsSex());
		CommonService.setXAD_v23(orm.getPATIENT().getINSURANCE().getIN1().getIn144_InsuredSEmployerAddress(), customIN1.getXad_in1_44_insuredsEmployerAddress());
		orm.getPATIENT().getINSURANCE().getIN1().getIn145_VerificationStatus().setValue(customIN1.getIn1_45_verificationStatus());
		orm.getPATIENT().getINSURANCE().getIN1().getIn146_PriorInsurancePlanID().setValue(customIN1.getIn1_46_priorInsurancePlanId());
		orm.getPATIENT().getINSURANCE().getIN1().getIn147_CoverageType().setValue(customIN1.getIn1_47_coverageType());
		orm.getPATIENT().getINSURANCE().getIN1().getIn148_Handicap().setValue(customIN1.getIn1_48_handicap());
	 	CommonService.setCX_23(orm.getPATIENT().getINSURANCE().getIN1().getIn149_InsuredSIDNumber(), customIN1.getCx_in1_49_insuredsIdNumber());
	}
}