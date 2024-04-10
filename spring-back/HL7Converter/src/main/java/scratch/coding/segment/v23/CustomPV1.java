package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.PV1;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_DLD_v23;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.FC_v23;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.services.CommonService;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPV1 implements Serializable {
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
	private PV1 pv1;
	private CustomPV1(PV1 pv1) {
		super();
		this.pv1 =pv1;
	}
	public static CustomPV1 createPv11WithTypeAndVersion(PV1 pv1) throws HL7Exception, IOException {
		return new CustomPV1(pv1);
	}
	/**
	 *	@return the pv1_1_setIdPatientVisit
	 */
	
	public CustomPV1() {
		super();
	}
	@JsonProperty("pv1_1_setIdPatientVisit")
	public String getPv1_1_setIdPatientVisit() {
		return CommonService.getString(this.pv1.getPv11_SetIDPatientVisit().getValue());
	}
	/**
	 * @param pv1_1_setIdPatientVisit the pv1_1_setIdPatientVisit to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_1_setIdPatientVisit")
	public void setPv1_1_setIdPatientVisit(String pv1_1_setIdPatientVisit) throws DataTypeException {
		this.pv1.getPv11_SetIDPatientVisit().setValue(pv1_1_setIdPatientVisit);
		this.pv1_1_setIdPatientVisit = pv1_1_setIdPatientVisit;
	}
	/**
	 *	@return the pv1_2_patientClass
	 */
	
	@JsonProperty("pv1_2_patientClass")
	public String getPv1_2_patientClass() {
		return CommonService.getString(this.pv1.getPv12_PatientClass().getValue());
	}
	/**
	 * @param pv1_2_patientClass the pv1_2_patientClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_2_patientClass")
	public void setPv1_2_patientClass(String pv1_2_patientClass) throws DataTypeException {
		this.pv1.getPv12_PatientClass().setValue(pv1_2_patientClass);
		this.pv1_2_patientClass = pv1_2_patientClass;
	}
	/**
	 *	@return the pl_pv1_3_assignedPatientLocation
	 */
	
	@JsonProperty("pl_pv1_3_assignedPatientLocation")
	public PL_v23 getPl_pv1_3_assignedPatientLocation() {
		return CommonService.getPL_v23(this.pv1.getPv13_AssignedPatientLocation());
	}
	/**
	 * @param pl_pv1_3_assignedPatientLocation the pl_pv1_3_assignedPatientLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_pv1_3_assignedPatientLocation")
	public void setPl_pv1_3_assignedPatientLocation(PL_v23 pl_pv1_3_assignedPatientLocation) throws DataTypeException {
		CommonService.setPL_v23(this.pv1.getPv13_AssignedPatientLocation(), pl_pv1_3_assignedPatientLocation);
		this.pl_pv1_3_assignedPatientLocation = pl_pv1_3_assignedPatientLocation;
	}
	/**
	 *	@return the pv1_4_admissionType
	 */
	
	@JsonProperty("pv1_4_admissionType")
	public String getPv1_4_admissionType() {
		return CommonService.getString(this.pv1.getPv14_AdmissionType().getValue());
	}
	/**
	 * @param pv1_4_admissionType the pv1_4_admissionType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_4_admissionType")
	public void setPv1_4_admissionType(String pv1_4_admissionType) throws DataTypeException {
		this.pv1.getPv14_AdmissionType().setValue(pv1_4_admissionType);
		this.pv1_4_admissionType = pv1_4_admissionType;
	}
	/**
	 *	@return the cx_pv1_5_preadmitNumber
	 */
	
	@JsonProperty("cx_pv1_5_preadmitNumber")
	public CX_v23 getCx_pv1_5_preadmitNumber() {
		return CommonService.getCX_v23(this.pv1.getPv15_PreadmitNumber());
	}
	/**
	 * @param cx_pv1_5_preadmitNumber the cx_pv1_5_preadmitNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pv1_5_preadmitNumber")
	public void setCx_pv1_5_preadmitNumber(CX_v23 cx_pv1_5_preadmitNumber) throws DataTypeException {
		CommonService.setCX_v23(this.pv1.getPv15_PreadmitNumber(), cx_pv1_5_preadmitNumber);
		this.cx_pv1_5_preadmitNumber = cx_pv1_5_preadmitNumber;
	}
	/**
	 *	@return the pl_pv1_6_priorPatientLocation
	 */
	
	@JsonProperty("pl_pv1_6_priorPatientLocation")
	public PL_v23 getPl_pv1_6_priorPatientLocation() {
		return CommonService.getPL_v23(this.pv1.getPv16_PriorPatientLocation());
	}
	/**
	 * @param pl_pv1_6_priorPatientLocation the pl_pv1_6_priorPatientLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_pv1_6_priorPatientLocation")
	public void setPl_pv1_6_priorPatientLocation(PL_v23 pl_pv1_6_priorPatientLocation) throws DataTypeException {
		CommonService.setPL_v23(this.pv1.getPv16_PriorPatientLocation(), pl_pv1_6_priorPatientLocation);
		this.pl_pv1_6_priorPatientLocation = pl_pv1_6_priorPatientLocation;
	}
	/**
	 *	@return the xcn_pv1_7_attendingDoctor
	 */
	
	@JsonProperty("xcn_pv1_7_attendingDoctor")
	public XCN_v23[] getXcn_pv1_7_attendingDoctor() {
		XCN_v23[] attendingDoctor = new XCN_v23[this.pv1.getPv17_AttendingDoctor().length];
		for(int i =0; i<this.pv1.getPv17_AttendingDoctor().length; i++) {
			attendingDoctor[i] = CommonService.getXCN_v23(this.pv1.getPv17_AttendingDoctor(i));
		}
		return attendingDoctor;
	}
	/**
	 * @param xcn_pv1_7_attendingDoctor the xcn_pv1_7_attendingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pv1_7_attendingDoctor")
	public void setXcn_pv1_7_attendingDoctor(XCN_v23[] xcn_pv1_7_attendingDoctor) throws DataTypeException {
		for(int i =0; i<xcn_pv1_7_attendingDoctor.length; i++) {
			CommonService.setXCN_v23(this.pv1.getPv17_AttendingDoctor(i), xcn_pv1_7_attendingDoctor[i]);
		}
		this.xcn_pv1_7_attendingDoctor = xcn_pv1_7_attendingDoctor;
	}
	/**
	 *	@return the xcn_pv1_8_referingDoctor
	 */
	
	@JsonProperty("xcn_pv1_8_referingDoctor")
	public XCN_v23[] getXcn_pv1_8_referingDoctor() {
		XCN_v23[] referingDoctor = new XCN_v23[this.pv1.getPv18_ReferringDoctor().length];
		for(int i = 0; i < this.pv1.getPv18_ReferringDoctor().length; i++) {
			referingDoctor[i]=CommonService.getXCN_v23(this.pv1.getPv18_ReferringDoctor(i));
		}
		return referingDoctor;
	}
	/**
	 * @param xcn_pv1_8_referingDoctor the xcn_pv1_8_referingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pv1_8_referingDoctor")
	public void setXcn_pv1_8_referingDoctor(XCN_v23[] xcn_pv1_8_referingDoctor) throws DataTypeException {
		for(int i = 0; i < xcn_pv1_8_referingDoctor.length; i++) {
			CommonService.setXCN_v23(this.pv1.getPv18_ReferringDoctor(i), xcn_pv1_8_referingDoctor[i]);
		}
		this.xcn_pv1_8_referingDoctor = xcn_pv1_8_referingDoctor;
	}
	/**
	 *	@return the xcn_pv1_9_consultingDoctor
	 */
	
	@JsonProperty("xcn_pv1_9_consultingDoctor")
	public XCN_v23[] getXcn_pv1_9_consultingDoctor() {
		XCN_v23[] consultingDoctor = new XCN_v23[this.pv1.getPv19_ConsultingDoctor().length];
		for(int i = 0; i <this.pv1.getPv19_ConsultingDoctor().length;i++) {
			consultingDoctor[i]=CommonService.getXCN_v23(this.pv1.getPv19_ConsultingDoctor(i));
		}
		return consultingDoctor;
	}
	/**
	 * @param xcn_pv1_9_consultingDoctor the xcn_pv1_9_consultingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pv1_9_consultingDoctor")
	public void setXcn_pv1_9_consultingDoctor(XCN_v23[] xcn_pv1_9_consultingDoctor) throws DataTypeException {
		for(int i = 0; i <xcn_pv1_9_consultingDoctor.length;i++) {
			CommonService.setXCN_v23(this.pv1.getPv19_ConsultingDoctor(i), xcn_pv1_9_consultingDoctor[i]);
		}
		this.xcn_pv1_9_consultingDoctor = xcn_pv1_9_consultingDoctor;
	}
	/**
	 *	@return the pv1_10_hospitalService
	 */
	
	@JsonProperty("pv1_10_hospitalService")
	public String getPv1_10_hospitalService() {
		return CommonService.getString(this.pv1.getPv110_HospitalService().getValue());
	}
	/**
	 * @param pv1_10_hospitalService the pv1_10_hospitalService to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_10_hospitalService")
	public void setPv1_10_hospitalService(String pv1_10_hospitalService) throws DataTypeException {
		this.pv1.getPv110_HospitalService().setValue(pv1_10_hospitalService);
		this.pv1_10_hospitalService = pv1_10_hospitalService;
	}
	/**
	 *	@return the pl_pv1_11_temporaryLocation
	 */
	
	@JsonProperty("pl_pv1_11_temporaryLocation")
	public PL_v23 getPl_pv1_11_temporaryLocation() {
		return CommonService.getPL_v23(this.pv1.getPv111_TemporaryLocation());
	}
	/**
	 * @param pl_pv1_11_temporaryLocation the pl_pv1_11_temporaryLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_pv1_11_temporaryLocation")
	public void setPl_pv1_11_temporaryLocation(PL_v23 pl_pv1_11_temporaryLocation) throws DataTypeException {
		CommonService.setPL_v23(this.pv1.getPv111_TemporaryLocation(), pl_pv1_11_temporaryLocation);
		this.pl_pv1_11_temporaryLocation = pl_pv1_11_temporaryLocation;
	}
	/**
	 *	@return the pv1_12_preadmitTestIndicator
	 */
	
	@JsonProperty("pv1_12_preadmitTestIndicator")
	public String getPv1_12_preadmitTestIndicator() {
		return CommonService.getString(this.pv1.getPv112_PreadmitTestIndicator().getValue());
	}
	/**
	 * @param pv1_12_preadmitTestIndicator the pv1_12_preadmitTestIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_12_preadmitTestIndicator")
	public void setPv1_12_preadmitTestIndicator(String pv1_12_preadmitTestIndicator) throws DataTypeException {
		this.pv1.getPv112_PreadmitTestIndicator().setValue(pv1_12_preadmitTestIndicator);
		this.pv1_12_preadmitTestIndicator = pv1_12_preadmitTestIndicator;
	}
	/**
	 *	@return the pv1_13_readMissionIndicator
	 */
	
	@JsonProperty("pv1_13_readMissionIndicator")
	public String getPv1_13_readMissionIndicator() {
		return CommonService.getString(this.pv1.getPv113_ReadmissionIndicator().getValue());
	}
	/**
	 * @param pv1_13_readMissionIndicator the pv1_13_readMissionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_13_readMissionIndicator")
	public void setPv1_13_readMissionIndicator(String pv1_13_readMissionIndicator) throws DataTypeException {
		this.pv1.getPv113_ReadmissionIndicator().setValue(pv1_13_readMissionIndicator);
		this.pv1_13_readMissionIndicator = pv1_13_readMissionIndicator;
	}
	/**
	 *	@return the pv1_14_admitSource
	 */
	
	@JsonProperty("pv1_14_admitSource")
	public String getPv1_14_admitSource() {
		return CommonService.getString(this.pv1.getPv114_AdmitSource().getValue());
	}
	/**
	 * @param pv1_14_admitSource the pv1_14_admitSource to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_14_admitSource")
	public void setPv1_14_admitSource(String pv1_14_admitSource) throws DataTypeException {
		this.pv1.getPv114_AdmitSource().setValue(pv1_14_admitSource);
		this.pv1_14_admitSource = pv1_14_admitSource;
	}
	/**
	 *	@return the pv1_15_ambulatoryStatus
	 */
	
	@JsonProperty("pv1_15_ambulatoryStatus")
	public String[] getPv1_15_ambulatoryStatus() {
		String[] ambulatoryStatus = new String[this.pv1.getPv115_AmbulatoryStatus().length];
		for(int i = 0; i < this.pv1.getPv115_AmbulatoryStatus().length;i++) {
			ambulatoryStatus[i]=CommonService.getString(this.pv1.getPv115_AmbulatoryStatus(i).getValue());
		}
		return ambulatoryStatus;
	}
	/**
	 * @param pv1_15_ambulatoryStatus the pv1_15_ambulatoryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_15_ambulatoryStatus")
	public void setPv1_15_ambulatoryStatus(String[] pv1_15_ambulatoryStatus) throws DataTypeException {
		for(int i = 0; i < pv1_15_ambulatoryStatus.length;i++) {
			this.pv1.getPv115_AmbulatoryStatus(i).setValue(pv1_15_ambulatoryStatus[i]);
		}
		this.pv1_15_ambulatoryStatus = pv1_15_ambulatoryStatus;
	}
	/**
	 *	@return the pv1_16_vipIndicator
	 */
	
	@JsonProperty("pv1_16_vipIndicator")
	public String getPv1_16_vipIndicator() {
		return CommonService.getString(this.pv1.getPv116_VIPIndicator().getValue());
	}
	/**
	 * @param pv1_16_vipIndicator the pv1_16_vipIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_16_vipIndicator")
	public void setPv1_16_vipIndicator(String pv1_16_vipIndicator) throws DataTypeException {
		this.pv1.getPv116_VIPIndicator().setValue(pv1_16_vipIndicator);
		this.pv1_16_vipIndicator = pv1_16_vipIndicator;
	}
	/**
	 *	@return the xcn_pv1_17_admittingDoctor
	 */
	
	@JsonProperty("xcn_pv1_17_admittingDoctor")
	public XCN_v23[] getXcn_pv1_17_admittingDoctor() {
		XCN_v23[] admittingDoctor = new XCN_v23[this.pv1.getPv117_AdmittingDoctor().length];
		for(int i =0; i < this.pv1.getPv117_AdmittingDoctor().length;i++) {
			admittingDoctor[i]=CommonService.getXCN_v23(this.pv1.getPv117_AdmittingDoctor(i));
		}
		return admittingDoctor;
	}
	/**
	 * @param xcn_pv1_17_admittingDoctor the xcn_pv1_17_admittingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pv1_17_admittingDoctor")
	public void setXcn_pv1_17_admittingDoctor(XCN_v23[] xcn_pv1_17_admittingDoctor) throws DataTypeException {
		for(int i =0; i < xcn_pv1_17_admittingDoctor.length;i++) {
			CommonService.setXCN_v23(this.pv1.getPv117_AdmittingDoctor(i), xcn_pv1_17_admittingDoctor[i]);
		}
		this.xcn_pv1_17_admittingDoctor = xcn_pv1_17_admittingDoctor;
	}
	/**
	 *	@return the pv1_18_patientType
	 */
	
	@JsonProperty("pv1_18_patientType")
	public String getPv1_18_patientType() {
		return CommonService.getString(this.pv1.getPv118_PatientType().getValue());
	}
	/**
	 * @param pv1_18_patientType the pv1_18_patientType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_18_patientType")
	public void setPv1_18_patientType(String pv1_18_patientType) throws DataTypeException {
		this.pv1.getPv118_PatientType().setValue(pv1_18_patientType);
		this.pv1_18_patientType = pv1_18_patientType;
	}
	/**
	 *	@return the cx_pv1_19_visitNumber
	 */
	
	@JsonProperty("cx_pv1_19_visitNumber")
	public CX_v23 getCx_pv1_19_visitNumber() {
		return CommonService.getCX_v23(this.pv1.getPv119_VisitNumber());
	}
	/**
	 * @param cx_pv1_19_visitNumber the cx_pv1_19_visitNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pv1_19_visitNumber")
	public void setCx_pv1_19_visitNumber(CX_v23 cx_pv1_19_visitNumber) throws DataTypeException {
		CommonService.setCX_v23(this.pv1.getPv119_VisitNumber(), cx_pv1_19_visitNumber);
		this.cx_pv1_19_visitNumber = cx_pv1_19_visitNumber;
	}
	/**
	 *	@return the fc_pv1_20_financialClass
	 */
	
	@JsonProperty("fc_pv1_20_financialClass")
	public FC_v23[] getFc_pv1_20_financialClass() {
		FC_v23[] financialClass = new FC_v23[this.pv1.getPv120_FinancialClass().length];
		for(int i = 0; i <this.pv1.getPv120_FinancialClass().length; i++) {
			financialClass[i]=CommonService.getFC_v23(this.pv1.getPv120_FinancialClass(i));
		}
		return financialClass;
	}
	/**
	 * @param fc_pv1_20_financialClass the fc_pv1_20_financialClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("fc_pv1_20_financialClass")
	public void setFc_pv1_20_financialClass(FC_v23[] fc_pv1_20_financialClass) throws DataTypeException {
		for(int i = 0; i <fc_pv1_20_financialClass.length; i++) {
			CommonService.setFC_v23(this.pv1.getPv120_FinancialClass(i), fc_pv1_20_financialClass[i]);
		}
		this.fc_pv1_20_financialClass = fc_pv1_20_financialClass;
	}
	/**
	 *	@return the pv1_21_chargePriceIndicator
	 */
	
	@JsonProperty("pv1_21_chargePriceIndicator")
	public String getPv1_21_chargePriceIndicator() {
		return CommonService.getString(this.pv1.getPv121_ChargePriceIndicator().getValue());
	}
	/**
	 * @param pv1_21_chargePriceIndicator the pv1_21_chargePriceIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_21_chargePriceIndicator")
	public void setPv1_21_chargePriceIndicator(String pv1_21_chargePriceIndicator) throws DataTypeException {
		this.pv1.getPv121_ChargePriceIndicator().setValue(pv1_21_chargePriceIndicator);
		this.pv1_21_chargePriceIndicator = pv1_21_chargePriceIndicator;
	}
	/**
	 *	@return the pv1_22_courtesyCode
	 */
	
	@JsonProperty("pv1_22_courtesyCode")
	public String getPv1_22_courtesyCode() {
		return CommonService.getString(this.pv1.getPv122_CourtesyCode().getValue());
	}
	/**
	 * @param pv1_22_courtesyCode the pv1_22_courtesyCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_22_courtesyCode")
	public void setPv1_22_courtesyCode(String pv1_22_courtesyCode) throws DataTypeException {
		this.pv1.getPv122_CourtesyCode().setValue(pv1_22_courtesyCode);
		this.pv1_22_courtesyCode = pv1_22_courtesyCode;
	}
	/**
	 *	@return the pv1_23_creditRating
	 */
	
	@JsonProperty("pv1_23_creditRating")
	public String getPv1_23_creditRating() {
		return CommonService.getString(this.pv1.getPv123_CreditRating().getValue());
	}
	/**
	 * @param pv1_23_creditRating the pv1_23_creditRating to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_23_creditRating")
	public void setPv1_23_creditRating(String pv1_23_creditRating) throws DataTypeException {
		this.pv1.getPv123_CreditRating().setValue(pv1_23_creditRating);
		this.pv1_23_creditRating = pv1_23_creditRating;
	}
	/**
	 *	@return the pv1_24_contractCode
	 */
	
	@JsonProperty("pv1_24_contractCode")
	public String[] getPv1_24_contractCode() {
		String[] contractCode = new String[this.pv1.getPv124_ContractCode().length];
		for(int i =0; i<this.pv1.getPv124_ContractCode().length;i++) {
			contractCode[i]=CommonService.getString(this.pv1.getPv124_ContractCode(i).getValue());
		}
		return contractCode;
	}
	/**
	 * @param pv1_24_contractCode the pv1_24_contractCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_24_contractCode")
	public void setPv1_24_contractCode(String[] pv1_24_contractCode) throws DataTypeException {
		for(int i =0; i<pv1_24_contractCode.length;i++) {
			this.pv1.getPv124_ContractCode(i).setValue(pv1_24_contractCode[i]);
		}
		this.pv1_24_contractCode = pv1_24_contractCode;
	}
	/**
	 *	@return the pv1_25_contractEffectiveDate
	 */
	
	@JsonProperty("pv1_25_contractEffectiveDate")
	public String[] getPv1_25_contractEffectiveDate() {
		String[] contractEffectiveDate = new String[this.pv1.getPv125_ContractEffectiveDate().length];
		for(int i = 0; i < this.pv1.getPv125_ContractEffectiveDate().length; i++) {
			contractEffectiveDate[i]=CommonService.getString(this.pv1.getPv125_ContractEffectiveDate(i).getValue());
		}
		return contractEffectiveDate;
	}
	/**
	 * @param pv1_25_contractEffectiveDate the pv1_25_contractEffectiveDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_25_contractEffectiveDate")
	public void setPv1_25_contractEffectiveDate(String[] pv1_25_contractEffectiveDate) throws DataTypeException {
		for(int i = 0; i < pv1_25_contractEffectiveDate.length; i++) {
			this.pv1.getPv125_ContractEffectiveDate(i).setValue(pv1_25_contractEffectiveDate[i]);;
		}
		this.pv1_25_contractEffectiveDate = pv1_25_contractEffectiveDate;
	}
	/**
	 *	@return the pv1_26_contractAmount
	 */
	
	@JsonProperty("pv1_26_contractAmount")
	public String[] getPv1_26_contractAmount() {
		String[] contractAmount = new String[this.pv1.getPv126_ContractAmount().length];
		for(int i = 0; i < this.pv1.getPv126_ContractAmount().length; i++) {
			contractAmount[i]=CommonService.getString(this.pv1.getPv126_ContractAmount(i).getValue());
		}
		return contractAmount;
	}
	/**
	 * @param pv1_26_contractAmount the pv1_26_contractAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_26_contractAmount")
	public void setPv1_26_contractAmount(String[] pv1_26_contractAmount) throws DataTypeException {
		for(int i = 0; i < pv1_26_contractAmount.length; i++) {
			this.pv1.getPv126_ContractAmount(i).setValue(pv1_26_contractAmount[i]);;
		}
		this.pv1_26_contractAmount = pv1_26_contractAmount;
	}
	/**
	 *	@return the pv1_27_contractPeriod
	 */
	
	@JsonProperty("pv1_27_contractPeriod")
	public String[] getPv1_27_contractPeriod() {
		String[] contractPeriod = new String[this.pv1.getPv127_ContractPeriod().length];
		for(int i = 0; i<this.pv1.getPv127_ContractPeriod().length; i++) {
			contractPeriod[i]=CommonService.getString(this.pv1.getPv127_ContractPeriod(i).getValue());
		}
		return contractPeriod;
	}
	/**
	 * @param pv1_27_contractPeriod the pv1_27_contractPeriod to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_27_contractPeriod")
	public void setPv1_27_contractPeriod(String[] pv1_27_contractPeriod) throws DataTypeException {
		for(int i = 0; i<this.pv1.getPv127_ContractPeriod().length; i++) {
			this.pv1.getPv127_ContractPeriod(i).setValue(pv1_27_contractPeriod[i]);;
		}
		this.pv1_27_contractPeriod = pv1_27_contractPeriod;
	}
	/**
	 *	@return the pv1_28_interestCode
	 */
	
	@JsonProperty("pv1_28_interestCode")
	public String getPv1_28_interestCode() {
		return CommonService.getString(this.pv1.getPv128_InterestCode().getValue());
	}
	/**
	 * @param pv1_28_interestCode the pv1_28_interestCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_28_interestCode")
	public void setPv1_28_interestCode(String pv1_28_interestCode) throws DataTypeException {
		this.pv1.getPv128_InterestCode().setValue(pv1_28_interestCode);
		this.pv1_28_interestCode = pv1_28_interestCode;
	}
	/**
	 *	@return the pv1_29_transferToBadDebtCode
	 */
	
	@JsonProperty("pv1_29_transferToBadDebtCode")
	public String getPv1_29_transferToBadDebtCode() {
		return CommonService.getString(this.pv1.getPv129_TransferToBadDebtCode().getValue());
	}
	/**
	 * @param pv1_29_transferToBadDebtCode the pv1_29_transferToBadDebtCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_29_transferToBadDebtCode")
	public void setPv1_29_transferToBadDebtCode(String pv1_29_transferToBadDebtCode) throws DataTypeException {
		this.pv1.getPv129_TransferToBadDebtCode().setValue(pv1_29_transferToBadDebtCode);
		this.pv1_29_transferToBadDebtCode = pv1_29_transferToBadDebtCode;
	}
	/**
	 *	@return the pv1_30_transferToBadDebtDate
	 */
	
	@JsonProperty("pv1_30_transferToBadDebtDate")
	public String getPv1_30_transferToBadDebtDate() {
		return CommonService.getString(this.pv1.getPv130_TransferToBadDebtDate().getValue());
	}
	/**
	 * @param pv1_30_transferToBadDebtDate the pv1_30_transferToBadDebtDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_30_transferToBadDebtDate")
	public void setPv1_30_transferToBadDebtDate(String pv1_30_transferToBadDebtDate) throws DataTypeException {
		this.pv1.getPv130_TransferToBadDebtDate().setValue(pv1_30_transferToBadDebtDate);
		this.pv1_30_transferToBadDebtDate = pv1_30_transferToBadDebtDate;
	}
	/**
	 *	@return the pv1_31_badDebtAgencyCode
	 */
	
	@JsonProperty("pv1_31_badDebtAgencyCode")
	public String getPv1_31_badDebtAgencyCode() {
		return CommonService.getString(this.pv1.getPv131_BadDebtAgencyCode().getValue());
	}
	/**
	 * @param pv1_31_badDebtAgencyCode the pv1_31_badDebtAgencyCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_31_badDebtAgencyCode")
	public void setPv1_31_badDebtAgencyCode(String pv1_31_badDebtAgencyCode) throws DataTypeException {
		this.pv1.getPv131_BadDebtAgencyCode().setValue(pv1_31_badDebtAgencyCode);
		this.pv1_31_badDebtAgencyCode = pv1_31_badDebtAgencyCode;
	}
	/**
	 *	@return the pv1_32_badDebtTransferAmount
	 */
	
	@JsonProperty("pv1_32_badDebtTransferAmount")
	public String getPv1_32_badDebtTransferAmount() {
		return CommonService.getString(this.pv1.getPv132_BadDebtTransferAmount().getValue());
	}
	/**
	 * @param pv1_32_badDebtTransferAmount the pv1_32_badDebtTransferAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_32_badDebtTransferAmount")
	public void setPv1_32_badDebtTransferAmount(String pv1_32_badDebtTransferAmount) throws DataTypeException {
		this.pv1.getPv132_BadDebtTransferAmount().setValue(pv1_32_badDebtTransferAmount);
		this.pv1_32_badDebtTransferAmount = pv1_32_badDebtTransferAmount;
	}
	/**
	 *	@return the pv1_33_badDebtRecoveryAmount
	 */
	
	@JsonProperty("pv1_33_badDebtRecoveryAmount")
	public String getPv1_33_badDebtRecoveryAmount() {
		return CommonService.getString(this.pv1.getPv133_BadDebtRecoveryAmount().getValue());
	}
	/**
	 * @param pv1_33_badDebtRecoveryAmount the pv1_33_badDebtRecoveryAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_33_badDebtRecoveryAmount")
	public void setPv1_33_badDebtRecoveryAmount(String pv1_33_badDebtRecoveryAmount) throws DataTypeException {
		this.pv1.getPv133_BadDebtRecoveryAmount().setValue(pv1_33_badDebtRecoveryAmount);
		this.pv1_33_badDebtRecoveryAmount = pv1_33_badDebtRecoveryAmount;
	}
	/**
	 *	@return the pv1_34_deleteAccountIndicator
	 */
	
	@JsonProperty("pv1_34_deleteAccountIndicator")
	public String getPv1_34_deleteAccountIndicator() {
		return CommonService.getString(this.pv1.getPv134_DeleteAccountIndicator().getValue());
	}
	/**
	 * @param pv1_34_deleteAccountIndicator the pv1_34_deleteAccountIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_34_deleteAccountIndicator")
	public void setPv1_34_deleteAccountIndicator(String pv1_34_deleteAccountIndicator) throws DataTypeException {
		this.pv1.getPv134_DeleteAccountIndicator().setValue(pv1_34_deleteAccountIndicator);
		this.pv1_34_deleteAccountIndicator = pv1_34_deleteAccountIndicator;
	}
	/**
	 *	@return the pv1_35_deleteAccountDate
	 */
	
	@JsonProperty("pv1_35_deleteAccountDate")
	public String getPv1_35_deleteAccountDate() {
		return CommonService.getString(this.pv1.getPv135_DeleteAccountDate().getValue());
	}
	/**
	 * @param pv1_35_deleteAccountDate the pv1_35_deleteAccountDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_35_deleteAccountDate")
	public void setPv1_35_deleteAccountDate(String pv1_35_deleteAccountDate) throws DataTypeException {
		this.pv1.getPv135_DeleteAccountDate().setValue(pv1_35_deleteAccountDate);
		this.pv1_35_deleteAccountDate = pv1_35_deleteAccountDate;
	}
	/**
	 *	@return the pv1_36_dischargeDisposition
	 */
	
	@JsonProperty("pv1_36_dischargeDisposition")
	public String getPv1_36_dischargeDisposition() {
		return CommonService.getString(this.pv1.getPv136_DischargeDisposition().getValue());
	}
	/**
	 * @param pv1_36_dischargeDisposition the pv1_36_dischargeDisposition to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_36_dischargeDisposition")
	public void setPv1_36_dischargeDisposition(String pv1_36_dischargeDisposition) throws DataTypeException {
		this.pv1.getPv136_DischargeDisposition().setValue(pv1_36_dischargeDisposition);
		this.pv1_36_dischargeDisposition = pv1_36_dischargeDisposition;
	}
	/**
	 *	@return the cm_dld_pv1_37_dischargedToLocation
	 */
	
	@JsonProperty("cm_dld_pv1_37_dischargedToLocation")
	public CM_DLD_v23 getCm_dld_pv1_37_dischargedToLocation() {
		return CommonService.getCM_DLD_v23(this.pv1.getPv137_DischargedToLocation());
	}
	/**
	 * @param cm_dld_pv1_37_dischargedToLocation the cm_dld_pv1_37_dischargedToLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_dld_pv1_37_dischargedToLocation")
	public void setCm_dld_pv1_37_dischargedToLocation(CM_DLD_v23 cm_dld_pv1_37_dischargedToLocation) throws DataTypeException {
		CommonService.setCM_DLD_v23(this.pv1.getPv137_DischargedToLocation(), cm_dld_pv1_37_dischargedToLocation);
		this.cm_dld_pv1_37_dischargedToLocation = cm_dld_pv1_37_dischargedToLocation;
	}
	/**
	 *	@return the pv1_38_dietType
	 */
	
	@JsonProperty("pv1_38_dietType")
	public String getPv1_38_dietType() {
		return CommonService.getString(this.pv1.getPv138_DietType().getValue());
	}
	/**
	 * @param pv1_38_dietType the pv1_38_dietType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_38_dietType")
	public void setPv1_38_dietType(String pv1_38_dietType) throws DataTypeException {
		this.pv1.getPv138_DietType().setValue(pv1_38_dietType);
		this.pv1_38_dietType = pv1_38_dietType;
	}
	/**
	 *	@return the pv1_39_servicingFacility
	 */
	
	@JsonProperty("pv1_39_servicingFacility")
	public String getPv1_39_servicingFacility() {
		return CommonService.getString(this.pv1.getPv139_ServicingFacility().getValue());
	}
	/**
	 * @param pv1_39_servicingFacility the pv1_39_servicingFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_39_servicingFacility")
	public void setPv1_39_servicingFacility(String pv1_39_servicingFacility) throws DataTypeException {
		this.pv1.getPv139_ServicingFacility().setValue(pv1_39_servicingFacility);
		this.pv1_39_servicingFacility = pv1_39_servicingFacility;
	}
	/**
	 *	@return the pv1_40_bedStatus
	 */
	
	@JsonProperty("pv1_40_bedStatus")
	public String getPv1_40_bedStatus() {
		return CommonService.getString(this.pv1.getPv140_BedStatus().getValue());
	}
	/**
	 * @param pv1_40_bedStatus the pv1_40_bedStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_40_bedStatus")
	public void setPv1_40_bedStatus(String pv1_40_bedStatus) throws DataTypeException {
		this.pv1.getPv140_BedStatus().setValue(pv1_40_bedStatus);
		this.pv1_40_bedStatus = pv1_40_bedStatus;
	}
	/**
	 *	@return the pv1_41_accountStatus
	 */
	
	@JsonProperty("pv1_41_accountStatus")
	public String getPv1_41_accountStatus() {
		return CommonService.getString(this.pv1.getPv141_AccountStatus().getValue());
	}
	/**
	 * @param pv1_41_accountStatus the pv1_41_accountStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_41_accountStatus")
	public void setPv1_41_accountStatus(String pv1_41_accountStatus) throws DataTypeException {
		this.pv1.getPv141_AccountStatus().setValue(pv1_41_accountStatus);
		this.pv1_41_accountStatus = pv1_41_accountStatus;
	}
	/**
	 *	@return the pl_pv1_42_pendingLocation
	 */
	
	@JsonProperty("pl_pv1_42_pendingLocation")
	public PL_v23 getPl_pv1_42_pendingLocation() {
		return CommonService.getPL_v23(this.pv1.getPv142_PendingLocation());
	}
	/**
	 * @param pl_pv1_42_pendingLocation the pl_pv1_42_pendingLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_pv1_42_pendingLocation")
	public void setPl_pv1_42_pendingLocation(PL_v23 pl_pv1_42_pendingLocation) throws DataTypeException {
		CommonService.setPL_v23(this.pv1.getPv142_PendingLocation(), pl_pv1_42_pendingLocation);
		this.pl_pv1_42_pendingLocation = pl_pv1_42_pendingLocation;
	}
	/**
	 *	@return the pl_pv1_43_priorTemporaryLocation
	 */
	
	@JsonProperty("pl_pv1_43_priorTemporaryLocation")
	public PL_v23 getPl_pv1_43_priorTemporaryLocation() {
		return CommonService.getPL_v23(this.pv1.getPv143_PriorTemporaryLocation());
	}
	/**
	 * @param pl_pv1_43_priorTemporaryLocation the pl_pv1_43_priorTemporaryLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_pv1_43_priorTemporaryLocation")
	public void setPl_pv1_43_priorTemporaryLocation(PL_v23 pl_pv1_43_priorTemporaryLocation) throws DataTypeException {
		CommonService.setPL_v23(this.pv1.getPv143_PriorTemporaryLocation(), pl_pv1_43_priorTemporaryLocation);
		this.pl_pv1_43_priorTemporaryLocation = pl_pv1_43_priorTemporaryLocation;
	}
	/**
	 *	@return the ts_pv1_44_admitDateTime
	 */
	
	@JsonProperty("ts_pv1_44_admitDateTime")
	public TS_v2 getTs_pv1_44_admitDateTime() {
		return CommonService.getTS_v2(this.pv1.getPv144_AdmitDateTime());
	}
	/**
	 * @param ts_pv1_44_admitDateTime the ts_pv1_44_admitDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pv1_44_admitDateTime")
	public void setTs_pv1_44_admitDateTime(TS_v2 ts_pv1_44_admitDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.pv1.getPv144_AdmitDateTime(), ts_pv1_44_admitDateTime);
		this.ts_pv1_44_admitDateTime = ts_pv1_44_admitDateTime;
	}
	/**
	 *	@return the ts_pv1_45_dischargeDateTime
	 */
	
	@JsonProperty("ts_pv1_45_dischargeDateTime")
	public TS_v2 getTs_pv1_45_dischargeDateTime() {
		return CommonService.getTS_v2(this.pv1.getPv145_DischargeDateTime());
	}
	/**
	 * @param ts_pv1_45_dischargeDateTime the ts_pv1_45_dischargeDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pv1_45_dischargeDateTime")
	public void setTs_pv1_45_dischargeDateTime(TS_v2 ts_pv1_45_dischargeDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.pv1.getPv145_DischargeDateTime(), ts_pv1_45_dischargeDateTime);
		this.ts_pv1_45_dischargeDateTime = ts_pv1_45_dischargeDateTime;
	}
	/**
	 *	@return the pv1_46_currentPatientBalance
	 */
	
	@JsonProperty("pv1_46_currentPatientBalance")
	public String getPv1_46_currentPatientBalance() {
		return CommonService.getString(this.pv1.getPv146_CurrentPatientBalance().getValue());
	}
	/**
	 * @param pv1_46_currentPatientBalance the pv1_46_currentPatientBalance to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_46_currentPatientBalance")
	public void setPv1_46_currentPatientBalance(String pv1_46_currentPatientBalance) throws DataTypeException {
		this.pv1.getPv146_CurrentPatientBalance().setValue(pv1_46_currentPatientBalance);
		this.pv1_46_currentPatientBalance = pv1_46_currentPatientBalance;
	}
	/**
	 *	@return the pv1_47_totalCharges
	 */
	
	@JsonProperty("pv1_47_totalCharges")
	public String getPv1_47_totalCharges() {
		return CommonService.getString(this.pv1.getPv147_TotalCharges().getValue());
	}
	/**
	 * @param pv1_47_totalCharges the pv1_47_totalCharges to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_47_totalCharges")
	public void setPv1_47_totalCharges(String pv1_47_totalCharges) throws DataTypeException {
		this.pv1.getPv147_TotalCharges().setValue(pv1_47_totalCharges);
		this.pv1_47_totalCharges = pv1_47_totalCharges;
	}
	/**
	 *	@return the pv1_48_totalAdjustments
	 */
	
	@JsonProperty("pv1_48_totalAdjustments")
	public String getPv1_48_totalAdjustments() {
		return CommonService.getString(this.pv1.getPv148_TotalAdjustments().getValue());
	}
	/**
	 * @param pv1_48_totalAdjustments the pv1_48_totalAdjustments to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_48_totalAdjustments")
	public void setPv1_48_totalAdjustments(String pv1_48_totalAdjustments) throws DataTypeException {
		this.pv1.getPv148_TotalAdjustments().setValue(pv1_48_totalAdjustments);
		this.pv1_48_totalAdjustments = pv1_48_totalAdjustments;
	}
	/**
	 *	@return the pv1_49_totalPayments
	 */
	
	@JsonProperty("pv1_49_totalPayments")
	public String getPv1_49_totalPayments() {
		return CommonService.getString(this.pv1.getPv149_TotalPayments().getValue());
	}
	/**
	 * @param pv1_49_totalPayments the pv1_49_totalPayments to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_49_totalPayments")
	public void setPv1_49_totalPayments(String pv1_49_totalPayments) throws DataTypeException {
		this.pv1.getPv149_TotalPayments().setValue(pv1_49_totalPayments);
		this.pv1_49_totalPayments = pv1_49_totalPayments;
	}
	/**
	 *	@return the cx_pv1_50_alternateVisitId
	 */
	
	@JsonProperty("cx_pv1_50_alternateVisitId")
	public CX_v23 getCx_pv1_50_alternateVisitId() {
		return CommonService.getCX_v23(this.pv1.getPv150_AlternateVisitID());
	}
	/**
	 * @param cx_pv1_50_alternateVisitId the cx_pv1_50_alternateVisitId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pv1_50_alternateVisitId")
	public void setCx_pv1_50_alternateVisitId(CX_v23 cx_pv1_50_alternateVisitId) throws DataTypeException {
		CommonService.setCX_v23(this.pv1.getPv150_AlternateVisitID(), cx_pv1_50_alternateVisitId);
		this.cx_pv1_50_alternateVisitId = cx_pv1_50_alternateVisitId;
	}
	/**
	 *	@return the pv1_51_visitIndicator
	 */
	
	@JsonProperty("pv1_51_visitIndicator")
	public String getPv1_51_visitIndicator() {
		return CommonService.getString(this.pv1.getPv151_VisitIndicator().getValue());
	}
	/**
	 * @param pv1_51_visitIndicator the pv1_51_visitIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_51_visitIndicator")
	public void setPv1_51_visitIndicator(String pv1_51_visitIndicator) throws DataTypeException {
		this.pv1.getPv151_VisitIndicator().setValue(pv1_51_visitIndicator);
		this.pv1_51_visitIndicator = pv1_51_visitIndicator;
	}
	/**
	 *	@return the xcn_pv1_52_otherHealthcareProvider
	 */
	
	@JsonProperty("xcn_pv1_52_otherHealthcareProvider")
	public XCN_v23[] getXcn_pv1_52_otherHealthcareProvider() {
		XCN_v23[] otherHealthcareProvider = new XCN_v23[this.pv1.getPv152_OtherHealthcareProvider().length];
		for(int i = 0; i< this.pv1.getPv152_OtherHealthcareProvider().length; i++) {
			otherHealthcareProvider[i]=CommonService.getXCN_v23(this.pv1.getPv152_OtherHealthcareProvider(i));
		}
		return otherHealthcareProvider;
	}
	/**
	 * @param xcn_pv1_52_otherHealthcareProvider the xcn_pv1_52_otherHealthcareProvider to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pv1_52_otherHealthcareProvider")
	public void setXcn_pv1_52_otherHealthcareProvider(XCN_v23[] xcn_pv1_52_otherHealthcareProvider) throws DataTypeException {
		for(int i = 0; i< xcn_pv1_52_otherHealthcareProvider.length; i++) {
			CommonService.setXCN_v23(this.pv1.getPv152_OtherHealthcareProvider(i), xcn_pv1_52_otherHealthcareProvider[i]);
		}
		this.xcn_pv1_52_otherHealthcareProvider = xcn_pv1_52_otherHealthcareProvider;
	}
	@Override
	public String toString() {
		return "CustomPV1 [pv1_1_setIdPatientVisit=" + pv1_1_setIdPatientVisit + ", pv1_2_patientClass="
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
				+ Arrays.toString(xcn_pv1_52_otherHealthcareProvider) + ", pv1=" + pv1 + "]";
	}
	
}
