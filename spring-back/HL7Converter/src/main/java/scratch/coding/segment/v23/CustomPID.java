package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_PATIENT;
import ca.uhn.hl7v2.model.v23.segment.NTE;
import ca.uhn.hl7v2.model.v23.segment.PID;
import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.DLN_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPID implements Serializable {
	@JsonProperty("pid_1_setIdpatientId")
	private String pid_1_setIdpatientId;
	@JsonProperty("cx_pid_2_externalPatientId")
	private CX_v23 cx_pid_2_externalPatientId;
	@JsonProperty("cx_pid_3_internalPatientId")
	private CX_v23[] cx_pid_3_internalPatientId;
	@JsonProperty("cx_pid_4_alternatePatientId")
	private CX_v23 cx_pid_4_alternatePatientId;
	@JsonProperty("xpn_pid_5_patientName")
	private XPN_v23[] xpn_pid_5_patientName;
	@JsonProperty("xpn_pid_6_mothersMaidenName")
	private XPN_v23 xpn_pid_6_mothersMaidenName;
	@JsonProperty("ts_pid_7_dateTimeOfBirth")
	private TS_v2 ts_pid_7_dateTimeOfBirth;
	@JsonProperty("pid_8_sex")
	private String pid_8_sex;
	@JsonProperty("xpn_pid_9_patienAlias")
	private XPN_v23[] xpn_pid_9_patienAlias;
	@JsonProperty("pid_10_race")
	private String pid_10_race;
	@JsonProperty("xad_pid_11_patientAddress")
	private XAD_v23[] xad_pid_11_patientAddress;
	@JsonProperty("pid_12_countryCode")
	private String pid_12_countryCode;
	@JsonProperty("xtn_pid_13_phoneNumberHome")
	private XTN_v23[] xtn_pid_13_phoneNumberHome;
	@JsonProperty("xtn_pid_14_phoneNumberBusiness")
	private XTN_v23[] xtn_pid_14_phoneNumberBusiness;
	@JsonProperty("ce_pid_15_primaryLanguage")
	private CE_v2 ce_pid_15_primaryLanguage;
	@JsonProperty("pid_16_maritalStatus")
	private String[] pid_16_maritalStatus;
	@JsonProperty("pid_17_religion")
	private String pid_17_religion;
	@JsonProperty("cx_pid_18_patientAccountNumber")
	private CX_v23 cx_pid_18_patientAccountNumber;
	@JsonProperty("pid_19_patientSsnNumber")
	private String pid_19_patientSsnNumber;
	@JsonProperty("dln_pid_20_patientDriverLicense")
	private DLN_v23 dln_pid_20_patientDriverLicense;
	@JsonProperty("cx_pid_21_mothersIdentifier")
	private CX_v23 cx_pid_21_mothersIdentifier;
	@JsonProperty("pid_22_ethnicGroup")
	private String pid_22_ethnicGroup;
	@JsonProperty("pid_23_birthPlace")
	private String pid_23_birthPlace;
	@JsonProperty("pid_24_multipleBirthIndicator")
	private String pid_24_multipleBirthIndicator;
	@JsonProperty("pid_25_birthOrder")
	private String pid_25_birthOrder;
	@JsonProperty("pid_26_citizenship")
	private String pid_26_citizenship;
	@JsonProperty("ce_pid_27_veteransMilitaryStatus")
	private CE_v2 ce_pid_27_veteransMilitaryStatus;
	@JsonProperty("ce_pid_28_nationality")
	private CE_v2 ce_pid_28_nationality;
	@JsonProperty("ts_pid_29_patientDeathDateTime")
	private TS_v2 ts_pid_29_patientDeathDateTime;
	@JsonProperty("pid_30_patientDeathIndicator")
	private String pid_30_patientDeathIndicator;
	@JsonProperty("pd1_pid")
	private CustomPD1 pd1_pid;
	@JsonProperty("nte_pid")
	private CustomNTE[] nte_pid;
	@JsonProperty("pv1_pid")
	private CustomPV1 pv1_pid;
	@JsonProperty("pv2_pid")	  
	private CustomPV2 pv2_pid;
	
	private PID pid;

	private CustomPID(PID pid,CustomPD1 pd1_pid,CustomNTE[] nte_pid, CustomPV1 pv1, CustomPV2 pv2) {
		super();
		this.pid = pid;
		this.pd1_pid = pd1_pid;
		this.nte_pid = nte_pid;
		this.pv1_pid = pv1;
		this.pv2_pid = pv2;
	}
	public static CustomPID createPidWithTypeAndVersion(ORM_O01_PATIENT patient) throws HL7Exception, IOException {
		PID pidObject = patient.getPID();
		CustomPD1 pd1Object = CustomPD1.createPd11WithTypeAndVersion(patient.getPD1());
		CustomPV1 pv1Object = CustomPV1.createPv11WithTypeAndVersion(patient.getPATIENT_VISIT().getPV1());
		CustomPV2 pv2Object = CustomPV2.createPv21WithTypeAndVersion(patient.getPATIENT_VISIT().getPV2());		
		
		return new CustomPID(pidObject, pd1Object, getNTEAll(patient), pv1Object, pv2Object);
	}
	private static CustomNTE[] getNTEAll(ORM_O01_PATIENT patient) throws HL7Exception, IOException {
		CustomNTE[] nteArray = new CustomNTE[patient.getNTEAll().size()];
		int i = 0;
		for(NTE nteObject : patient.getNTEAll()) {
			nteArray[i] = CustomNTE.createNteWithTypeAndVersion(nteObject);
			i++;
		}
		return nteArray;
	}
	/**
	 *	@return the pid_1_setIdpatientId
	 */
	
	@JsonProperty("pid_1_setIdpatientId")
	public String getPid_1_setIdpatientId() {
		return CommonService.getString(this.pid.getPid1_SetIDPatientID().getValue());
	}
	public CustomPID() {
		super();
	}
	/**
	 * @param pid_1_setIdpatientId the pid_1_setIdpatientId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_1_setIdpatientId")
	public void setPid_1_setIdpatientId(String pid_1_setIdpatientId) throws DataTypeException {
		this.pid.getPid1_SetIDPatientID().setValue(pid_1_setIdpatientId);
		this.pid_1_setIdpatientId = pid_1_setIdpatientId;
	}
	/**
	 *	@return the cx_pid_2_externalPatientId
	 */
	
	@JsonProperty("cx_pid_2_externalPatientId")
	public CX_v23 getCx_pid_2_externalPatientId() {
		return CommonService.getCX_v23(this.pid.getPid2_PatientIDExternalID());
	}
	/**
	 * @param cx_pid_2_externalPatientId the cx_pid_2_externalPatientId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pid_2_externalPatientId")
	public void setCx_pid_2_externalPatientId(CX_v23 cx_pid_2_externalPatientId) throws DataTypeException {
		CommonService.setCX_v23(this.pid.getPid2_PatientIDExternalID(), cx_pid_2_externalPatientId);
		this.cx_pid_2_externalPatientId = cx_pid_2_externalPatientId;
	}
	/**
	 *	@return the cx_pid_3_internalPatientId
	 */
	
	@JsonProperty("cx_pid_3_internalPatientId")
	public CX_v23[] getCx_pid_3_internalPatientId() {
		CX_v23[] internalPatientId = new CX_v23[this.pid.getPid3_PatientIDInternalID().length];
		for(int i = 0; i < this.pid.getPid3_PatientIDInternalID().length;i++) {
			internalPatientId[i]=CommonService.getCX_v23(this.pid.getPid3_PatientIDInternalID(i));
		}
		return internalPatientId;
	}
	/**
	 * @param cx_pid_3_internalPatientId the cx_pid_3_internalPatientId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pid_3_internalPatientId")
	public void setCx_pid_3_internalPatientId(CX_v23[] cx_pid_3_internalPatientId) throws DataTypeException {
		for(int i = 0; i < cx_pid_3_internalPatientId.length;i++) {
			CommonService.setCX_v23(this.pid.getPid3_PatientIDInternalID(i), cx_pid_3_internalPatientId[i]);
		}
		this.cx_pid_3_internalPatientId = cx_pid_3_internalPatientId;
	}
	/**
	 *	@return the cx_pid_4_alternatePatientId
	 */
	
	@JsonProperty("cx_pid_4_alternatePatientId")
	public CX_v23 getCx_pid_4_alternatePatientId() {
		return CommonService.getCX_v23(this.pid.getPid4_AlternatePatientID());
	}
	/**
	 * @param cx_pid_4_alternatePatientId the cx_pid_4_alternatePatientId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pid_4_alternatePatientId")
	public void setCx_pid_4_alternatePatientId(CX_v23 cx_pid_4_alternatePatientId) throws DataTypeException {
		CommonService.setCX_v23(this.pid.getPid4_AlternatePatientID(), cx_pid_4_alternatePatientId);
		this.cx_pid_4_alternatePatientId = cx_pid_4_alternatePatientId;
	}
	/**
	 *	@return the xpn_pid_5_patientName
	 */
	
	@JsonProperty("xpn_pid_5_patientName")
	public XPN_v23[] getXpn_pid_5_patientName() {
		XPN_v23[] patientName = new XPN_v23[this.pid.getPid5_PatientName().length];
		for(int i = 0; i < this.pid.getPid5_PatientName().length; i++) {
			patientName[i]=CommonService.getXPN_v23(this.pid.getPid5_PatientName(i));
		}
		return patientName;
	}
	/**
	 * @param xpn_pid_5_patientName the xpn_pid_5_patientName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_pid_5_patientName")
	public void setXpn_pid_5_patientName(XPN_v23[] xpn_pid_5_patientName) throws DataTypeException {
		for(int i = 0; i < xpn_pid_5_patientName.length; i++) {
			CommonService.setXPN_v23(this.pid.getPid5_PatientName(i), xpn_pid_5_patientName[i]);
		}
		this.xpn_pid_5_patientName = xpn_pid_5_patientName;
	}
	/**
	 *	@return the xpn_pid_6_mothersMaidenName
	 */
	
	@JsonProperty("xpn_pid_6_mothersMaidenName")
	public XPN_v23 getXpn_pid_6_mothersMaidenName() {
		return CommonService.getXPN_v23(this.pid.getPid6_MotherSMaidenName());
	}
	/**
	 * @param xpn_pid_6_mothersMaidenName the xpn_pid_6_mothersMaidenName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_pid_6_mothersMaidenName")
	public void setXpn_pid_6_mothersMaidenName(XPN_v23 xpn_pid_6_mothersMaidenName) throws DataTypeException {
		CommonService.setXPN_v23(this.pid.getPid6_MotherSMaidenName(), xpn_pid_6_mothersMaidenName);
		this.xpn_pid_6_mothersMaidenName = xpn_pid_6_mothersMaidenName;
	}
	/**
	 *	@return the ts_pid_7_dateTimeOfBirth
	 */
	
	@JsonProperty("ts_pid_7_dateTimeOfBirth")
	public TS_v2 getTs_pid_7_dateTimeOfBirth() {
		return CommonService.getTS_v2(this.pid.getPid7_DateOfBirth());
	}
	/**
	 * @param ts_pid_7_dateTimeOfBirth the ts_pid_7_dateTimeOfBirth to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pid_7_dateTimeOfBirth")
	public void setTs_pid_7_dateTimeOfBirth(TS_v2 ts_pid_7_dateTimeOfBirth) throws DataTypeException {
		CommonService.setTS_v2(this.pid.getPid7_DateOfBirth(), ts_pid_7_dateTimeOfBirth);
		this.ts_pid_7_dateTimeOfBirth = ts_pid_7_dateTimeOfBirth;
	}
	/**
	 *	@return the pid_8_sex
	 */
	
	@JsonProperty("pid_8_sex")
	public String getPid_8_sex() {
		return CommonService.getString(this.pid.getPid8_Sex().getValue());
	}
	/**
	 * @param pid_8_sex the pid_8_sex to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_8_sex")
	public void setPid_8_sex(String pid_8_sex) throws DataTypeException {
		this.pid.getPid8_Sex().setValue(pid_8_sex);
		this.pid_8_sex = pid_8_sex;
	}
	/**
	 *	@return the xpn_pid_9_patienAlias
	 */
	
	@JsonProperty("xpn_pid_9_patienAlias")
	public XPN_v23[] getXpn_pid_9_patienAlias() {
		XPN_v23[] patienAlias = new XPN_v23[this.pid.getPid9_PatientAlias().length];
		for(int i = 0; i < this.pid.getPid9_PatientAlias().length;i++) {
			patienAlias[i]=CommonService.getXPN_v23(this.pid.getPid9_PatientAlias(i));
		}
		return patienAlias;
	}
	/**
	 * @param xpn_pid_9_patienAlias the xpn_pid_9_patienAlias to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_pid_9_patienAlias")
	public void setXpn_pid_9_patienAlias(XPN_v23[] xpn_pid_9_patienAlias) throws DataTypeException {
		for(int i = 0; i < xpn_pid_9_patienAlias.length;i++) {
			CommonService.setXPN_v23(this.pid.getPid9_PatientAlias(i), xpn_pid_9_patienAlias[i]);
		}
		this.xpn_pid_9_patienAlias = xpn_pid_9_patienAlias;
	}
	/**
	 *	@return the pid_10_race
	 */
	
	@JsonProperty("pid_10_race")
	public String getPid_10_race() {
		return CommonService.getString(this.pid.getPid10_Race().getValue());
	}
	/**
	 * @param pid_10_race the pid_10_race to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_10_race")
	public void setPid_10_race(String pid_10_race) throws DataTypeException {
		this.pid.getPid10_Race().setValue(pid_10_race);
		this.pid_10_race = pid_10_race;
	}
	/**
	 *	@return the xad_pid_11_patientAddress
	 */
	
	@JsonProperty("xad_pid_11_patientAddress")
	public XAD_v23[] getXad_pid_11_patientAddress() {
		XAD_v23[] patientAddress = new XAD_v23[this.pid.getPid11_PatientAddress().length];
		for(int i = 0;i < this.pid.getPid11_PatientAddress().length; i++) {
			patientAddress[i]=CommonService.getXAD_v23(this.pid.getPid11_PatientAddress(i));
		}
		return patientAddress;
	}
	/**
	 * @param xad_pid_11_patientAddress the xad_pid_11_patientAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_pid_11_patientAddress")
	public void setXad_pid_11_patientAddress(XAD_v23[] xad_pid_11_patientAddress) throws DataTypeException {
		for(int i = 0;i < xad_pid_11_patientAddress.length; i++) {
			CommonService.setXAD_v23(this.pid.getPid11_PatientAddress(i), xad_pid_11_patientAddress[i]);
		}
		this.xad_pid_11_patientAddress = xad_pid_11_patientAddress;
	}
	/**
	 *	@return the pid_12_countryCode
	 */
	
	@JsonProperty("pid_12_countryCode")
	public String getPid_12_countryCode() {
		return CommonService.getString(this.pid.getPid12_CountyCode().getValue());
	}
	/**
	 * @param pid_12_countryCode the pid_12_countryCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_12_countryCode")
	public void setPid_12_countryCode(String pid_12_countryCode) throws DataTypeException {
		this.pid.getPid12_CountyCode().setValue(pid_12_countryCode);
		this.pid_12_countryCode = pid_12_countryCode;
	}
	/**
	 *	@return the xtn_pid_13_phoneNumberHome
	 */
	
	@JsonProperty("xtn_pid_13_phoneNumberHome")
	public XTN_v23[] getXtn_pid_13_phoneNumberHome() {
		XTN_v23[] phoneNumberHome = new XTN_v23[this.pid.getPid13_PhoneNumberHome().length];
		for(int i = 0; i < this.pid.getPid13_PhoneNumberHome().length; i++) {
			phoneNumberHome[i]=CommonService.getXTN_v23(this.pid.getPid13_PhoneNumberHome(i));
		}
		return phoneNumberHome;
	}
	/**
	 * @param xtn_pid_13_phoneNumberHome the xtn_pid_13_phoneNumberHome to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_pid_13_phoneNumberHome")
	public void setXtn_pid_13_phoneNumberHome(XTN_v23[] xtn_pid_13_phoneNumberHome) throws DataTypeException {
		for(int i = 0; i < xtn_pid_13_phoneNumberHome.length; i++) {
			CommonService.setXTN_v23(this.pid.getPid13_PhoneNumberHome(i), xtn_pid_13_phoneNumberHome[i]);
		}
		this.xtn_pid_13_phoneNumberHome = xtn_pid_13_phoneNumberHome;
	}
	/**
	 *	@return the xtn_pid_14_phoneNumberBusiness
	 */
	
	@JsonProperty("xtn_pid_14_phoneNumberBusiness")
	public XTN_v23[] getXtn_pid_14_phoneNumberBusiness() {
		XTN_v23[] phoneNumberBusiness = new XTN_v23[this.pid.getPid14_PhoneNumberBusiness().length];
		for(int i = 0; i < this.pid.getPid14_PhoneNumberBusiness().length; i++) {
			phoneNumberBusiness[i]=CommonService.getXTN_v23(this.pid.getPid14_PhoneNumberBusiness(i));
		}
		return phoneNumberBusiness;
	}
	/**
	 * @param xtn_pid_14_phoneNumberBusiness the xtn_pid_14_phoneNumberBusiness to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_pid_14_phoneNumberBusiness")
	public void setXtn_pid_14_phoneNumberBusiness(XTN_v23[] xtn_pid_14_phoneNumberBusiness) throws DataTypeException {
		for(int i = 0; i < xtn_pid_14_phoneNumberBusiness.length; i++) {
			CommonService.setXTN_v23(this.pid.getPid14_PhoneNumberBusiness(i), xtn_pid_14_phoneNumberBusiness[i]);
		}
		this.xtn_pid_14_phoneNumberBusiness = xtn_pid_14_phoneNumberBusiness;
	}
	/**
	 *	@return the ce_pid_15_primaryLanguage
	 */
	
	@JsonProperty("ce_pid_15_primaryLanguage")
	public CE_v2 getCe_pid_15_primaryLanguage() {
		return CommonService.getCE_v2(this.pid.getPid15_PrimaryLanguage());
	}
	/**
	 * @param ce_pid_15_primaryLanguage the ce_pid_15_primaryLanguage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pid_15_primaryLanguage")
	public void setCe_pid_15_primaryLanguage(CE_v2 ce_pid_15_primaryLanguage) throws DataTypeException {
		CommonService.setCE_v2(this.pid.getPid15_PrimaryLanguage(), ce_pid_15_primaryLanguage);
		this.ce_pid_15_primaryLanguage = ce_pid_15_primaryLanguage;
	}
	/**
	 *	@return the pid_16_maritalStatus
	 */
	
	@JsonProperty("pid_16_maritalStatus")
	public String[] getPid_16_maritalStatus() {
		String[] maritalStatus = new String[this.pid.getPid16_MaritalStatus().length];
		for(int i = 0; i< this.pid.getPid16_MaritalStatus().length; i++) {
			maritalStatus[i]=CommonService.getString(this.pid.getPid16_MaritalStatus(i).getValue());
		}
		return maritalStatus;
	}
	/**
	 * @param pid_16_maritalStatus the pid_16_maritalStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_16_maritalStatus")
	public void setPid_16_maritalStatus(String[] pid_16_maritalStatus) throws DataTypeException {
		for(int i = 0; i<pid_16_maritalStatus.length; i++) {
			this.pid.getPid16_MaritalStatus(i).setValue(pid_16_maritalStatus[i]);
		}
		this.pid_16_maritalStatus = pid_16_maritalStatus;
	}
	/**
	 *	@return the pid_17_religion
	 */
	
	@JsonProperty("pid_17_religion")
	public String getPid_17_religion() {
		return CommonService.getString(this.pid.getPid17_Religion().getValue());
	}
	/**
	 * @param pid_17_religion the pid_17_religion to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_17_religion")
	public void setPid_17_religion(String pid_17_religion) throws DataTypeException {
		this.pid.getPid17_Religion().setValue(pid_17_religion);
		this.pid_17_religion = pid_17_religion;
	}
	/**
	 *	@return the cx_pid_18_patientAccountNumber
	 */
	
	@JsonProperty("cx_pid_18_patientAccountNumber")
	public CX_v23 getCx_pid_18_patientAccountNumber() {
		return CommonService.getCX_v23(this.pid.getPid18_PatientAccountNumber());
	}
	/**
	 * @param cx_pid_18_patientAccountNumber the cx_pid_18_patientAccountNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pid_18_patientAccountNumber")
	public void setCx_pid_18_patientAccountNumber(CX_v23 cx_pid_18_patientAccountNumber) throws DataTypeException {
		CommonService.setCX_v23(this.pid.getPid18_PatientAccountNumber(), cx_pid_18_patientAccountNumber);
		this.cx_pid_18_patientAccountNumber = cx_pid_18_patientAccountNumber;
	}
	/**
	 *	@return the pid_19_patientSsnNumber
	 */
	
	@JsonProperty("pid_19_patientSsnNumber")
	public String getPid_19_patientSsnNumber() {
		return CommonService.getString(this.pid.getPid19_SSNNumberPatient().getValue());
	}
	/**
	 * @param pid_19_patientSsnNumber the pid_19_patientSsnNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_19_patientSsnNumber")
	public void setPid_19_patientSsnNumber(String pid_19_patientSsnNumber) throws DataTypeException {
		this.pid.getPid19_SSNNumberPatient().setValue(pid_19_patientSsnNumber);
		this.pid_19_patientSsnNumber = pid_19_patientSsnNumber;
	}
	/**
	 *	@return the dln_pid_20_patientDriverLicense
	 */
	
	@JsonProperty("dln_pid_20_patientDriverLicense")
	public DLN_v23 getDln_pid_20_patientDriverLicense() {
		return CommonService.getDLN_v23(this.pid.getPid20_DriverSLicenseNumber());
	}
	/**
	 * @param dln_pid_20_patientDriverLicense the dln_pid_20_patientDriverLicense to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dln_pid_20_patientDriverLicense")
	public void setDln_pid_20_patientDriverLicense(DLN_v23 dln_pid_20_patientDriverLicense) throws DataTypeException {
		CommonService.setDLN_v23(this.pid.getPid20_DriverSLicenseNumber(), dln_pid_20_patientDriverLicense);
		this.dln_pid_20_patientDriverLicense = dln_pid_20_patientDriverLicense;
	}
	/**
	 *	@return the cx_pid_21_mothersIdentifier
	 */
	
	@JsonProperty("cx_pid_21_mothersIdentifier")
	public CX_v23 getCx_pid_21_mothersIdentifier() {
		return CommonService.getCX_v23(this.pid.getPid21_MotherSIdentifier());
	}
	/**
	 * @param cx_pid_21_mothersIdentifier the cx_pid_21_mothersIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pid_21_mothersIdentifier")
	public void setCx_pid_21_mothersIdentifier(CX_v23 cx_pid_21_mothersIdentifier) throws DataTypeException {
		CommonService.setCX_v23(this.pid.getPid21_MotherSIdentifier(), cx_pid_21_mothersIdentifier);
		this.cx_pid_21_mothersIdentifier = cx_pid_21_mothersIdentifier;
	}
	/**
	 *	@return the pid_22_ethnicGroup
	 */
	
	@JsonProperty("pid_22_ethnicGroup")
	public String getPid_22_ethnicGroup() {
		return CommonService.getString(this.pid.getPid22_EthnicGroup().getValue());
	}
	/**
	 * @param pid_22_ethnicGroup the pid_22_ethnicGroup to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_22_ethnicGroup")
	public void setPid_22_ethnicGroup(String pid_22_ethnicGroup) throws DataTypeException {
		this.pid.getPid22_EthnicGroup().setValue(pid_22_ethnicGroup);
		this.pid_22_ethnicGroup = pid_22_ethnicGroup;
	}
	/**
	 *	@return the pid_23_birthPlace
	 */
	
	@JsonProperty("pid_23_birthPlace")
	public String getPid_23_birthPlace() {
		return CommonService.getString(this.pid.getPid22_EthnicGroup().getValue());
	}
	/**
	 * @param pid_23_birthPlace the pid_23_birthPlace to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_23_birthPlace")
	public void setPid_23_birthPlace(String pid_23_birthPlace) throws DataTypeException {
		this.pid.getPid22_EthnicGroup().setValue(pid_23_birthPlace);
		this.pid_23_birthPlace = pid_23_birthPlace;
	}
	/**
	 *	@return the pid_24_multipleBirthIndicator
	 */
	
	@JsonProperty("pid_24_multipleBirthIndicator")
	public String getPid_24_multipleBirthIndicator() {
		return CommonService.getString(this.pid.getPid24_MultipleBirthIndicator().getValue());
	}
	/**
	 * @param pid_24_multipleBirthIndicator the pid_24_multipleBirthIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_24_multipleBirthIndicator")
	public void setPid_24_multipleBirthIndicator(String pid_24_multipleBirthIndicator) throws DataTypeException {
		this.pid.getPid24_MultipleBirthIndicator().setValue(pid_24_multipleBirthIndicator);
		this.pid_24_multipleBirthIndicator = pid_24_multipleBirthIndicator;
	}
	/**
	 *	@return the pid_25_birthOrder
	 */
	
	@JsonProperty("pid_25_birthOrder")
	public String getPid_25_birthOrder() {
		return CommonService.getString(this.pid.getPid25_BirthOrder().getValue());
	}
	/**
	 * @param pid_25_birthOrder the pid_25_birthOrder to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_25_birthOrder")
	public void setPid_25_birthOrder(String pid_25_birthOrder) throws DataTypeException {
		this.pid.getPid25_BirthOrder().setValue(pid_25_birthOrder);
		this.pid_25_birthOrder = pid_25_birthOrder;
	}
	/**
	 *	@return the pid_26_citizenship
	 */
	
	@JsonProperty("pid_26_citizenship")
	public String getPid_26_citizenship() {
		return CommonService.getString(this.pid.getPid26_Citizenship().getValue());
	}
	/**
	 * @param pid_26_citizenship the pid_26_citizenship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_26_citizenship")
	public void setPid_26_citizenship(String pid_26_citizenship) throws DataTypeException {
		this.pid.getPid26_Citizenship().setValue(pid_26_citizenship);
		this.pid_26_citizenship = pid_26_citizenship;
	}
	/**
	 *	@return the ce_pid_27_veteransMilitaryStatus
	 */
	
	@JsonProperty("ce_pid_27_veteransMilitaryStatus")
	public CE_v2 getCe_pid_27_veteransMilitaryStatus() {
		return CommonService.getCE_v2(this.pid.getPid27_VeteransMilitaryStatus());
	}
	/**
	 * @param ce_pid_27_veteransMilitaryStatus the ce_pid_27_veteransMilitaryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pid_27_veteransMilitaryStatus")
	public void setCe_pid_27_veteransMilitaryStatus(CE_v2 ce_pid_27_veteransMilitaryStatus) throws DataTypeException {
		CommonService.setCE_v2(this.pid.getPid27_VeteransMilitaryStatus(), ce_pid_27_veteransMilitaryStatus);
		this.ce_pid_27_veteransMilitaryStatus = ce_pid_27_veteransMilitaryStatus;
	}
	/**
	 *	@return the ce_pid_28_nationality
	 */
	
	@JsonProperty("ce_pid_28_nationality")
	public CE_v2 getCe_pid_28_nationality() {
		return CommonService.getCE_v2(this.pid.getPid28_NationalityCode());
	}
	/**
	 * @param ce_pid_28_nationality the ce_pid_28_nationality to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pid_28_nationality")
	public void setCe_pid_28_nationality(CE_v2 ce_pid_28_nationality) throws DataTypeException {
		CommonService.setCE_v2(this.pid.getPid28_NationalityCode(), ce_pid_28_nationality);
		this.ce_pid_28_nationality = ce_pid_28_nationality;
	}
	/**
	 *	@return the ts_pid_29_patientDeathDateTime
	 */
	
	@JsonProperty("ts_pid_29_patientDeathDateTime")
	public TS_v2 getTs_pid_29_patientDeathDateTime() {
		return CommonService.getTS_v2(this.pid.getPid29_PatientDeathDateAndTime());
	}
	/**
	 * @param ts_pid_29_patientDeathDateTime the ts_pid_29_patientDeathDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pid_29_patientDeathDateTime")
	public void setTs_pid_29_patientDeathDateTime(TS_v2 ts_pid_29_patientDeathDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.pid.getPid29_PatientDeathDateAndTime(), ts_pid_29_patientDeathDateTime);
		this.ts_pid_29_patientDeathDateTime = ts_pid_29_patientDeathDateTime;
	}
	/**
	 *	@return the pid_30_patientDeathIndicator
	 */
	
	@JsonProperty("pid_30_patientDeathIndicator")
	public String getPid_30_patientDeathIndicator() {
		return CommonService.getString(this.pid.getPid30_PatientDeathIndicator().getValue());
	}
	/**
	 * @param pid_30_patientDeathIndicator the pid_30_patientDeathIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_30_patientDeathIndicator")
	public void setPid_30_patientDeathIndicator(String pid_30_patientDeathIndicator) throws DataTypeException {
		this.pid.getPid30_PatientDeathIndicator().setValue(pid_30_patientDeathIndicator);
		this.pid_30_patientDeathIndicator = pid_30_patientDeathIndicator;
	}
	/**
	 *	@return the pd1_pid
	 */
	
	@JsonProperty("pd1_pid")
	public CustomPD1 getPd1_pid() {
		return pd1_pid==null?new CustomPD1():pd1_pid ;
	}
	/**
	 * @param pd1_pid the pd1_pid to set
	 */
	@JsonProperty("pd1_pid")
	public void setPd1_pid(CustomPD1 pd1_pid) {
		this.pd1_pid = pd1_pid;
	}
	/**
	 *	@return the nte_pid
	 */
	
	@JsonProperty("nte_pid")
	public CustomNTE[] getNte_pid() {
		return nte_pid==null? new CustomNTE[] {}:nte_pid;
	}
	/**
	 * @param nte_pid the nte_pid to set
	 */
	@JsonProperty("nte_pid")
	public void setNte_pid(CustomNTE[] nte_pid) {
		this.nte_pid = nte_pid;
	}
	/**
	 *	@return the pv1_pid
	 */
	
	@JsonProperty("pv1_pid")
	public CustomPV1 getPv1_pid() {
		return pv1_pid==null? new CustomPV1(): pv1_pid;
	}
	/**
	 * @param pv1_pid the pv1_pid to set
	 */
	@JsonProperty("pv1_pid")
	public void setPv1_pid(CustomPV1 pv1_pid) {
		this.pv1_pid = pv1_pid;
	}
	/**
	 *	@return the pv2_pid
	 */
	
	@JsonProperty("pv2_pid")
	public CustomPV2 getPv2_pid() {
		return pv2_pid==null?new CustomPV2():pv2_pid;
	}
	/**
	 * @param pv2_pid the pv2_pid to set
	 */
	@JsonProperty("pv2_pid")
	public void setPv2_pid(CustomPV2 pv2_pid) {
		this.pv2_pid = pv2_pid;
	}
	@Override
	public String toString() {
		return "CustomPID [pid_1_setIdpatientId=" + pid_1_setIdpatientId + ", cx_pid_2_externalPatientId="
				+ cx_pid_2_externalPatientId + ", cx_pid_3_internalPatientId="
				+ Arrays.toString(cx_pid_3_internalPatientId) + ", cx_pid_4_alternatePatientId="
				+ cx_pid_4_alternatePatientId + ", xpn_pid_5_patientName=" + Arrays.toString(xpn_pid_5_patientName)
				+ ", xpn_pid_6_mothersMaidenName=" + xpn_pid_6_mothersMaidenName + ", ts_pid_7_dateTimeOfBirth="
				+ ts_pid_7_dateTimeOfBirth + ", pid_8_sex=" + pid_8_sex + ", xpn_pid_9_patienAlias="
				+ Arrays.toString(xpn_pid_9_patienAlias) + ", pid_10_race=" + pid_10_race
				+ ", xad_pid_11_patientAddress=" + Arrays.toString(xad_pid_11_patientAddress) + ", pid_12_countryCode="
				+ pid_12_countryCode + ", xtn_pid_13_phoneNumberHome=" + Arrays.toString(xtn_pid_13_phoneNumberHome)
				+ ", xtn_pid_14_phoneNumberBusiness=" + Arrays.toString(xtn_pid_14_phoneNumberBusiness)
				+ ", ce_pid_15_primaryLanguage=" + ce_pid_15_primaryLanguage + ", pid_16_maritalStatus="
				+ Arrays.toString(pid_16_maritalStatus) + ", pid_17_religion=" + pid_17_religion
				+ ", cx_pid_18_patientAccountNumber=" + cx_pid_18_patientAccountNumber + ", pid_19_patientSsnNumber="
				+ pid_19_patientSsnNumber + ", dln_pid_20_patientDriverLicense=" + dln_pid_20_patientDriverLicense
				+ ", cx_pid_21_mothersIdentifier=" + cx_pid_21_mothersIdentifier + ", pid_22_ethnicGroup="
				+ pid_22_ethnicGroup + ", pid_23_birthPlace=" + pid_23_birthPlace + ", pid_24_multipleBirthIndicator="
				+ pid_24_multipleBirthIndicator + ", pid_25_birthOrder=" + pid_25_birthOrder + ", pid_26_citizenship="
				+ pid_26_citizenship + ", ce_pid_27_veteransMilitaryStatus=" + ce_pid_27_veteransMilitaryStatus
				+ ", ce_pid_28_nationality=" + ce_pid_28_nationality + ", ts_pid_29_patientDeathDateTime="
				+ ts_pid_29_patientDeathDateTime + ", pid_30_patientDeathIndicator=" + pid_30_patientDeathIndicator
				+ ", pd1_pid=" + pd1_pid + ", nte_pid=" + Arrays.toString(nte_pid) + ", pv1_pid=" + pv1_pid
				+ ", pv2_pid=" + pv2_pid + ", pid=" + pid + "]";
	}
	
	
}
