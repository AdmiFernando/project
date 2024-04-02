package scratch.coding.generator.segment.v23;


import java.io.IOException;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import scratch.coding.segment.v23.CustomPV1;
import scratch.coding.segment.v23.JsonPID_v23;
import scratch.coding.services.CommonService;
public class PIDSegment_v23 {
	
	
	
	/**
	 * @param orm
	 * @param customPID
	 * @throws HL7Exception 
	 * @throws IOException 
	 */
	public static void getPID(ORM_O01 orm, JsonPID_v23 customPID) throws HL7Exception, IOException {
		
		orm.getPATIENT().getPID().getPid1_SetIDPatientID().setValue(customPID.getPid_1_setIdpatientId());
		CommonService.setCX_23(orm.getPATIENT().getPID().getPid2_PatientIDExternalID(), customPID.getCx_pid_2_externalPatientId());
		for(int i = 0; i <customPID.getCx_pid_3_internalPatientId().length; i++) {		
			CommonService.setCX_23(orm.getPATIENT().getPID().getPid3_PatientIDInternalID(i), customPID.getCx_pid_3_internalPatientId()[i]);
		}
		CommonService.setCX_23(orm.getPATIENT().getPID().getPid4_AlternatePatientID(), customPID.getCx_pid_4_alternatePatientId());
		for(int i = 0; i < customPID.getXpn_pid_5_patientName().length;i++) {
			CommonService.setXPN_v23(orm.getPATIENT().getPID().getPid5_PatientName(i), customPID.getXpn_pid_5_patientName()[i]);			
		}
		CommonService.setXPN_v23(orm.getPATIENT().getPID().getPid6_MotherSMaidenName(), customPID.getXpn_pid_6_mothersMaidenName());
		CommonService.setTS_v2(orm.getPATIENT().getPID().getPid7_DateOfBirth(), customPID.getTs_pid_7_dateTimeOfBirth());
		orm.getPATIENT().getPID().getPid8_Sex().setValue(customPID.getPid_8_sex());
		for(int i = 0; i <customPID.getXpn_pid_9_patienAlias().length; i++) {
			CommonService.setXPN_v23(orm.getPATIENT().getPID().getPid9_PatientAlias(i), customPID.getXpn_pid_9_patienAlias()[i]);
		}
		orm.getPATIENT().getPID().getPid10_Race().setValue(customPID.getPid_10_race());
		for(int i = 0; i < customPID.getXad_pid_11_patientAddress().length; i++) {			
			CommonService.setXAD_v23(orm.getPATIENT().getPID().getPid11_PatientAddress(i), customPID.getXad_pid_11_patientAddress()[i]);
		}
		orm.getPATIENT().getPID().getPid12_CountyCode().setValue(customPID.getPid_12_countryCode());
		for(int i = 0; i <customPID.getXtn_pid_13_phoneNumberHome().length; i++) {
			CommonService.setXTN_v23(orm.getPATIENT().getPID().getPid13_PhoneNumberHome(i), customPID.getXtn_pid_13_phoneNumberHome()[i]);
		}
		for(int i = 0; i <customPID.getXtn_pid_14_phoneNumberBusiness().length; i++) {
			CommonService.setXTN_v23(orm.getPATIENT().getPID().getPid14_PhoneNumberBusiness(i), customPID.getXtn_pid_14_phoneNumberBusiness()[i]);
		}
		CommonService.setCE_v2(orm.getPATIENT().getPID().getPid15_PrimaryLanguage(), customPID.getCe_pid_15_primaryLanguage());
		for(int i = 0; i<customPID.getPid_16_maritalStatus().length; i++) {			
			orm.getPATIENT().getPID().getPid16_MaritalStatus(i).setValue(customPID.getPid_16_maritalStatus()[i]);
		}
		orm.getPATIENT().getPID().getPid17_Religion().setValue(customPID.getPid_17_religion());
		CommonService.setCX_v23(orm.getPATIENT().getPID().getPid18_PatientAccountNumber(), customPID.getCx_pid_18_patientAccountNumber());
		orm.getPATIENT().getPID().getPid19_SSNNumberPatient().setValue(customPID.getPid_19_patientSsnNumber());
		CommonService.setDLN_v23(orm.getPATIENT().getPID().getPid20_DriverSLicenseNumber(), customPID.getDln_pid_20_patientDriverLicense());
		CommonService.setCX_23(orm.getPATIENT().getPID().getPid21_MotherSIdentifier(), customPID.getCx_pid_21_mothersIdentifier());
		orm.getPATIENT().getPID().getPid22_EthnicGroup().setValue(customPID.getPid_22_ethnicGroup());
		orm.getPATIENT().getPID().getPid23_BirthPlace().setValue(customPID.getPid_23_birthPlace());
		orm.getPATIENT().getPID().getPid24_MultipleBirthIndicator().setValue(customPID.getPid_24_multipleBirthIndicator());
		orm.getPATIENT().getPID().getPid25_BirthOrder().setValue(customPID.getPid_25_birthOrder());
		orm.getPATIENT().getPID().getPid26_Citizenship().setValue(customPID.getPid_26_citizenship());
		CommonService.setCE_v2(orm.getPATIENT().getPID().getPid27_VeteransMilitaryStatus(), customPID.getCe_pid_27_veteransMilitaryStatus());
		CommonService.setCE_v2(orm.getPATIENT().getPID().getPid28_NationalityCode(), customPID.getCe_pid_28_nationality());
		CommonService.setTS_v2(orm.getPATIENT().getPID().getPid29_PatientDeathDateAndTime(), customPID.getTs_pid_29_patientDeathDateTime());
		orm.getPATIENT().getPID().getPid30_PatientDeathIndicator().setValue(customPID.getPid_30_patientDeathIndicator());
		for(int i = 0; i<customPID.getNte_pid().length; i++) {
			NTESegment_v23.setNTE(orm.getPATIENT().getNTE(i), customPID.getNte_pid()[i]);
		}
	}
}
