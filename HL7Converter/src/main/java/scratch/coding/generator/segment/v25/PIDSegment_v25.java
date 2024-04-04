package scratch.coding.generator.segment.v25;


import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.PID;
//import scratch.coding.segment.base.v25.PID_ST_v25;
import scratch.coding.services.CommonService;
public class PIDSegment_v25 {

	
//	public static void setPID(PID pid, PID_ST_v25 pidSt) {
//		try {
//			pid.getPid1_SetIDPID().setValue(pidSt.getPid_1_setID());
//			CommonService.setCX(pid.getPid2_PatientID(), pidSt.getPid_2_patientID());
//			setPID3(pid, pidSt);
//			setPID4(pid, pidSt);
//			setPID5(pid, pidSt);
//			setPID6(pid, pidSt);
//			CommonService.setTS(pid.getPid7_DateTimeOfBirth(), pidSt.getPid_7_dateTimeofBirth());
//			pid.getPid8_AdministrativeSex().setValue(pidSt.getPid_8_administrativeSex());
//			setPID9(pid, pidSt);
//			setPID10(pid, pidSt);
//			setPID11(pid, pidSt);
//			pid.getPid12_CountyCode().setValue(pidSt.getPid_12_countyCode());
//			setPID13(pid, pidSt);
//			setPID14(pid, pidSt);
//			CommonService.setCE(pid.getPid15_PrimaryLanguage(), pidSt.getPid_15_primaryLanguage());
//			CommonService.setCE(pid.getPid16_MaritalStatus(), pidSt.getPid_16_maritalStatus());
//			CommonService.setCE(pid.getPid17_Religion(), pidSt.getPid_17_religion());
//			CommonService.setCX(pid.getPid18_PatientAccountNumber(), pidSt.getPid_18_patientAccountNumber());
//			pid.getPid19_SSNNumberPatient().setValue(pidSt.getPid_19_ssn());
//			CommonService.setDLN(pid.getPid20_DriverSLicenseNumberPatient(), pidSt.getPid_20_driversLicenseNumber());
//			setPID21(pid, pidSt);
//			setPID22(pid, pidSt);
//			pid.getPid23_BirthPlace().setValue(pidSt.getPid_23_birthPlace());
//			pid.getPid24_MultipleBirthIndicator().setValue(pidSt.getPid_24_multipleBirthIndicator());
//			pid.getPid25_BirthOrder().setValue(pidSt.getPid_25_birthOrder());
//			setPID26(pid, pidSt);
//			CommonService.setCE(pid.getPid27_VeteransMilitaryStatus(), pidSt.getPid_27_veteransMilitaryStatus());
//			CommonService.setCE(pid.getPid28_Nationality(), pidSt.getPid_28_nationality());
//			CommonService.setTS(pid.getPid29_PatientDeathDateAndTime(), pidSt.getPid_29_patientDeathDateandTime());
//			pid.getPid30_PatientDeathIndicator().setValue(pidSt.getPid_30_patientDeathIndicator());
//			pid.getPid31_IdentityUnknownIndicator().setValue(pidSt.getPid_31_identityUnknownIndicator());
//			setPID32(pid, pidSt);
//			CommonService.setTS(pid.getPid33_LastUpdateDateTime(), pidSt.getPid_33_lastUpdateDateTime());
//			CommonService.setHD(pid.getPid34_LastUpdateFacility(), pidSt.getPid_34_lastUpdateFacility());
//			CommonService.setCE(pid.getPid35_SpeciesCode(), pidSt.getPid_35_speciesCode());
//			CommonService.setCE(pid.getPid36_BreedCode(), pidSt.getPid_36_breedCode());
//			pid.getPid37_Strain().setValue(pidSt.getPid_37_strain());
//			CommonService.setCE(pid.getPid38_ProductionClassCode(), pidSt.getPid_38_productionClassCode());
//			setPID39(pid, pidSt);
//			
//		} catch (DataTypeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		
//	}
//
//	public static void setPID14(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_14_phoneNumberBusiness().size();i++) {
//			CommonService.setXTN(pid.getPid13_PhoneNumberHome(i), pidSt.getPid_14_phoneNumberBusiness().get(i));
//		}
//	}
//
//	public static void setPID3(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_3_patientIdentifierList().size();i++) {
//			CommonService.setCX(pid.getPid3_PatientIdentifierList(i), pidSt.getPid_3_patientIdentifierList().get(i));
//		}
//	}
//	public static void setPID4(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_4_alternatePatientID().size();i++) {
//			CommonService.setCX(pid.getPid4_AlternatePatientIDPID(i), pidSt.getPid_4_alternatePatientID().get(i));
//		}
//	}
//	public static void setPID5(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_5_patientName().size();i++) {
//			CommonService.setXPN(pid.getPid5_PatientName(i), pidSt.getPid_5_patientName().get(i));
//		}
//	}
//	public static void setPID6(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_6_mothersMaidenName().size();i++) {
//			CommonService.setXPN(pid.getPid6_MotherSMaidenName(i), pidSt.getPid_6_mothersMaidenName().get(i));
//		}
//	}
//	public static void setPID9(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_9_patientAlias().size();i++) {
//			CommonService.setXPN(pid.getPid9_PatientAlias(i), pidSt.getPid_9_patientAlias().get(i));
//		}
//	}
//	public static void setPID10(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		for(int i = 0; i< pidSt.getPid_10_race().size();i++) {
//			CommonService.setCE(pid.getPid10_Race(i), pidSt.getPid_10_race().get(i));
//		}
//	}
//	public static void setPID11(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_11_patientAddress().size();i++) {
//			CommonService.setXAD(pid.getPid11_PatientAddress(i), pidSt.getPid_11_patientAddress().get(i));
//		}
//	}
//	public static void setPID13(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_13_phoneNumberHome().size();i++) {
//			CommonService.setXTN(pid.getPid13_PhoneNumberHome(i), pidSt.getPid_13_phoneNumberHome().get(i));
//		}
//	}
//	public static void setPID21(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_21_mothersIdentifier().size();i++) {
//			CommonService.setCX(pid.getPid21_MotherSIdentifier(i), pidSt.getPid_21_mothersIdentifier().get(i));
//		}
//	}
//	
//	public static void setPID22(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_22_ethnicGroup().size();i++) {
//			CommonService.setCE(pid.getPid22_EthnicGroup(i), pidSt.getPid_22_ethnicGroup().get(i));
//		}
//	}
//	public static void setPID26(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_26_citizenship().size();i++) {
//			CommonService.setCE(pid.getPid26_Citizenship(i), pidSt.getPid_26_citizenship().get(i));
//		}
//	}
//	
//	public static void setPID32(PID pid, PID_ST_v25 pidSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_32_identityReliabilityCode().size();i++) {
//			CommonService.setST(pid.getPid32_IdentityReliabilityCode(i), pidSt.getPid_32_identityReliabilityCode().get(i));
//		}
//	}
//	
//	public static void setPID39(PID pid, PID_ST_v25 pidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< pidSt.getPid_39_tribalCitizenship().size();i++) {
//			CommonService.setCWE(pid.getPid39_TribalCitizenship(i), pidSt.getPid_39_tribalCitizenship().get(i));
//		}
//	}
}
