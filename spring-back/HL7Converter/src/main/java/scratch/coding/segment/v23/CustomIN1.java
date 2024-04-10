package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.IN1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_AUI_v23;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;
import scratch.coding.services.CommonService;


@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomIN1 implements Serializable {
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

	private IN1 in1;

	private CustomIN1(IN1 in1) {
		super();
		this.in1 =in1;
	}
	public static CustomIN1 createIn1WithTypeAndVersion(IN1 in1) throws HL7Exception, IOException {
		return new CustomIN1(in1);
	}
	/**
	 *	@return the in1_1_setId
	 */
	
	@JsonProperty("in1_1_setId")
	public String getIn1_1_setId() {
		return CommonService.getString(this.in1.getIn11_SetIDInsurance().getValue());
	}
	/**
	 * @param in1_1_setId the in1_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_1_setId")
	public void setIn1_1_setId(String in1_1_setId) throws DataTypeException {
		this.in1.getIn11_SetIDInsurance().setValue(in1_1_setId);
		this.in1_1_setId = in1_1_setId;
	}
	/**
	 *	@return the ce_in1_2_insurancePlanId
	 */
	
	@JsonProperty("ce_in1_2_insurancePlanId")
	public CE_v2 getCe_in1_2_insurancePlanId() {
		return CommonService.getCE_v2(this.in1.getIn12_InsurancePlanID());
	}
	/**
	 * @param ce_in1_2_insurancePlanId the ce_in1_2_insurancePlanId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_in1_2_insurancePlanId")
	public void setCe_in1_2_insurancePlanId(CE_v2 ce_in1_2_insurancePlanId) throws DataTypeException {
		CommonService.setCE_v2(this.in1.getIn12_InsurancePlanID(), ce_in1_2_insurancePlanId);
		this.ce_in1_2_insurancePlanId = ce_in1_2_insurancePlanId;
	}
	/**
	 *	@return the cx_in1_3_insuranceCompanyId
	 */
	
	@JsonProperty("cx_in1_3_insuranceCompanyId")
	public CX_v23 getCx_in1_3_insuranceCompanyId() {
		return CommonService.getCX_v23(this.in1.getIn13_InsuranceCompanyID());
	}
	/**
	 * @param cx_in1_3_insuranceCompanyId the cx_in1_3_insuranceCompanyId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_in1_3_insuranceCompanyId")
	public void setCx_in1_3_insuranceCompanyId(CX_v23 cx_in1_3_insuranceCompanyId) throws DataTypeException {
		CommonService.setCX_v23(this.in1.getIn13_InsuranceCompanyID(), cx_in1_3_insuranceCompanyId);
		this.cx_in1_3_insuranceCompanyId = cx_in1_3_insuranceCompanyId;
	}
	/**
	 *	@return the xon_in1_4_insuranceCompanyName
	 */
	
	@JsonProperty("xon_in1_4_insuranceCompanyName")
	public XON_v23 getXon_in1_4_insuranceCompanyName() {
		return CommonService.getXON_v23(this.in1.getIn14_InsuranceCompanyName());
	}
	/**
	 * @param xon_in1_4_insuranceCompanyName the xon_in1_4_insuranceCompanyName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_in1_4_insuranceCompanyName")
	public void setXon_in1_4_insuranceCompanyName(XON_v23 xon_in1_4_insuranceCompanyName) throws DataTypeException {
		CommonService.setXON_v23(this.in1.getIn14_InsuranceCompanyName(),xon_in1_4_insuranceCompanyName);
		this.xon_in1_4_insuranceCompanyName = xon_in1_4_insuranceCompanyName;
	}
	/**
	 *	@return the xad_in1_5_insuranceCompanyAddress
	 */
	
	@JsonProperty("xad_in1_5_insuranceCompanyAddress")
	public XAD_v23 getXad_in1_5_insuranceCompanyAddress() {
		return CommonService.getXAD_v23(this.in1.getIn15_InsuranceCompanyAddress());
	}
	/**
	 * @param xad_in1_5_insuranceCompanyAddress the xad_in1_5_insuranceCompanyAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_in1_5_insuranceCompanyAddress")
	public void setXad_in1_5_insuranceCompanyAddress(XAD_v23 xad_in1_5_insuranceCompanyAddress) throws DataTypeException {
		CommonService.setXAD_v23(this.in1.getIn15_InsuranceCompanyAddress(), xad_in1_5_insuranceCompanyAddress);
		this.xad_in1_5_insuranceCompanyAddress = xad_in1_5_insuranceCompanyAddress;
	}
	/**
	 *	@return the xpn_in1_6_insuranceCompanyContactPerson
	 */
	
	@JsonProperty("xpn_in1_6_insuranceCompanyContactPerson")
	public XPN_v23 getXpn_in1_6_insuranceCompanyContactPerson() {
		return CommonService.getXPN_v23(this.in1.getIn16_InsuranceCoContactPpers());
	}
	/**
	 * @param xpn_in1_6_insuranceCompanyContactPerson the xpn_in1_6_insuranceCompanyContactPerson to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_in1_6_insuranceCompanyContactPerson")
	public void setXpn_in1_6_insuranceCompanyContactPerson(XPN_v23 xpn_in1_6_insuranceCompanyContactPerson) throws DataTypeException {
		CommonService.setXPN_v23(this.in1.getIn16_InsuranceCoContactPpers(), xpn_in1_6_insuranceCompanyContactPerson);
		this.xpn_in1_6_insuranceCompanyContactPerson = xpn_in1_6_insuranceCompanyContactPerson;
	}
	/**
	 *	@return the xtn_in1_7_insuranceCompanyPhoneNumber
	 */
	
	@JsonProperty("xtn_in1_7_insuranceCompanyPhoneNumber")
	public XTN_v23[] getXtn_in1_7_insuranceCompanyPhoneNumber() {
		XTN_v23[] insuranceCompanyPhoneNumber = new XTN_v23[this.in1.getIn17_InsuranceCoPhoneNumber().length];
		for(int i = 0; i<this.in1.getIn17_InsuranceCoPhoneNumber().length; i++) {
			insuranceCompanyPhoneNumber[i]=CommonService.getXTN_v23(this.in1.getIn17_InsuranceCoPhoneNumber(i));
		}
		return xtn_in1_7_insuranceCompanyPhoneNumber;
	}
	/**
	 * @param xtn_in1_7_insuranceCompanyPhoneNumber the xtn_in1_7_insuranceCompanyPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_in1_7_insuranceCompanyPhoneNumber")
	public void setXtn_in1_7_insuranceCompanyPhoneNumber(XTN_v23[] xtn_in1_7_insuranceCompanyPhoneNumber) throws DataTypeException {
		for(int i = 0; i<xtn_in1_7_insuranceCompanyPhoneNumber.length; i++) {
			CommonService.setXTN_v23(this.in1.getIn17_InsuranceCoPhoneNumber(i), xtn_in1_7_insuranceCompanyPhoneNumber[i]);
		}
		this.xtn_in1_7_insuranceCompanyPhoneNumber = xtn_in1_7_insuranceCompanyPhoneNumber;
	}
	/**
	 *	@return the in1_8_groupNumber
	 */
	
	@JsonProperty("in1_8_groupNumber")
	public String getIn1_8_groupNumber() {
		return CommonService.getString(this.in1.getIn18_GroupNumber().getValue());
	}
	/**
	 * @param in1_8_groupNumber the in1_8_groupNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_8_groupNumber")
	public void setIn1_8_groupNumber(String in1_8_groupNumber) throws DataTypeException {
		this.in1.getIn18_GroupNumber().setValue(in1_8_groupNumber);
		this.in1_8_groupNumber = in1_8_groupNumber;
	}
	/**
	 *	@return the xon_in1_9_groupName
	 */
	
	@JsonProperty("xon_in1_9_groupName")
	public XON_v23 getXon_in1_9_groupName() {
		return CommonService.getXON_v23(this.in1.getIn19_GroupName());
	}
	/**
	 * @param xon_in1_9_groupName the xon_in1_9_groupName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_in1_9_groupName")
	public void setXon_in1_9_groupName(XON_v23 xon_in1_9_groupName) throws DataTypeException {
		CommonService.setXON_v23(this.in1.getIn19_GroupName(),xon_in1_9_groupName);
		this.xon_in1_9_groupName = xon_in1_9_groupName;
	}
	/**
	 *	@return the cx_in1_10_insuredsGroupEmployerId
	 */
	
	@JsonProperty("cx_in1_10_insuredsGroupEmployerId")
	public CX_v23 getCx_in1_10_insuredsGroupEmployerId() {
		return CommonService.getCX_v23(this.in1.getIn110_InsuredSGroupEmployerID());
	}
	/**
	 * @param cx_in1_10_insuredsGroupEmployerId the cx_in1_10_insuredsGroupEmployerId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_in1_10_insuredsGroupEmployerId")
	public void setCx_in1_10_insuredsGroupEmployerId(CX_v23 cx_in1_10_insuredsGroupEmployerId) throws DataTypeException {
		CommonService.setCX_v23(this.in1.getIn110_InsuredSGroupEmployerID(), cx_in1_10_insuredsGroupEmployerId);
		this.cx_in1_10_insuredsGroupEmployerId = cx_in1_10_insuredsGroupEmployerId;
	}
	/**
	 *	@return the xon_in1_11_insuredsGroupEmployeeName
	 */
	
	@JsonProperty("xon_in1_11_insuredsGroupEmployeeName")
	public XON_v23 getXon_in1_11_insuredsGroupEmployeeName() {
		return CommonService.getXON_v23(this.in1.getIn111_InsuredSGroupEmpName());
	}
	/**
	 * @param xon_in1_11_insuredsGroupEmployeeName the xon_in1_11_insuredsGroupEmployeeName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_in1_11_insuredsGroupEmployeeName")
	public void setXon_in1_11_insuredsGroupEmployeeName(XON_v23 xon_in1_11_insuredsGroupEmployeeName) throws DataTypeException {
		CommonService.setXON_v23(this.in1.getIn111_InsuredSGroupEmpName(), xon_in1_11_insuredsGroupEmployeeName);
		this.xon_in1_11_insuredsGroupEmployeeName = xon_in1_11_insuredsGroupEmployeeName;
	}
	/**
	 *	@return the in1_12_planEffectiveDate
	 */
	
	@JsonProperty("in1_12_planEffectiveDate")
	public String getIn1_12_planEffectiveDate() {
		return CommonService.getString(this.in1.getIn112_PlanEffectiveDate().getValue());
	}
	/**
	 * @param in1_12_planEffectiveDate the in1_12_planEffectiveDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_12_planEffectiveDate")
	public void setIn1_12_planEffectiveDate(String in1_12_planEffectiveDate) throws DataTypeException {
		this.in1.getIn112_PlanEffectiveDate().setValue(in1_12_planEffectiveDate);
		this.in1_12_planEffectiveDate = in1_12_planEffectiveDate;
	}
	/**
	 *	@return the in1_13_planExpirationDate
	 */
	
	@JsonProperty("in1_13_planExpirationDate")
	public String getIn1_13_planExpirationDate() {
		return CommonService.getString(this.in1.getIn113_PlanExpirationDate().getValue());
	}
	/**
	 * @param in1_13_planExpirationDate the in1_13_planExpirationDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_13_planExpirationDate")
	public void setIn1_13_planExpirationDate(String in1_13_planExpirationDate) throws DataTypeException {
		this.in1.getIn113_PlanExpirationDate().setValue(in1_13_planExpirationDate);
		this.in1_13_planExpirationDate = in1_13_planExpirationDate;
	}
	/**
	 *	@return the cm_aui_in1_14_authorizationInformation
	 */
	
	@JsonProperty("cm_aui_in1_14_authorizationInformation")
	public CM_AUI_v23 getCm_aui_in1_14_authorizationInformation() {
		return CommonService.getCM_AUI_v23(this.in1.getIn114_AuthorizationInformation());
	}
	/**
	 * @param cm_aui_in1_14_authorizationInformation the cm_aui_in1_14_authorizationInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_aui_in1_14_authorizationInformation")
	public void setCm_aui_in1_14_authorizationInformation(CM_AUI_v23 cm_aui_in1_14_authorizationInformation) throws DataTypeException {
		CommonService.setCM_AUI_v23(this.in1.getIn114_AuthorizationInformation(), cm_aui_in1_14_authorizationInformation );
		this.cm_aui_in1_14_authorizationInformation = cm_aui_in1_14_authorizationInformation;
	}
	/**
	 *	@return the in1_15_planType
	 */
	
	@JsonProperty("in1_15_planType")
	public String getIn1_15_planType() {
		return CommonService.getString(this.in1.getIn115_PlanType().getValue());
	}
	/**
	 * @param in1_15_planType the in1_15_planType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_15_planType")
	public void setIn1_15_planType(String in1_15_planType) throws DataTypeException {
		this.in1.getIn115_PlanType().setValue(in1_15_planType);
		this.in1_15_planType = in1_15_planType;
	}
	/**
	 *	@return the xpn_in1_16_nameOfInsured
	 */
	
	@JsonProperty("xpn_in1_16_nameOfInsured")
	public XPN_v23 getXpn_in1_16_nameOfInsured() {
		return CommonService.getXPN_v23(this.in1.getIn116_NameOfInsured());
	}
	/**
	 * @param xpn_in1_16_nameOfInsured the xpn_in1_16_nameOfInsured to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_in1_16_nameOfInsured")
	public void setXpn_in1_16_nameOfInsured(XPN_v23 xpn_in1_16_nameOfInsured) throws DataTypeException {
		CommonService.setXPN_v23(this.in1.getIn116_NameOfInsured(), xpn_in1_16_nameOfInsured);
		this.xpn_in1_16_nameOfInsured = xpn_in1_16_nameOfInsured;
	}
	/**
	 *	@return the in1_17_insuredsRelationshipToPatient
	 */
	
	@JsonProperty("in1_17_insuredsRelationshipToPatient")
	public String getIn1_17_insuredsRelationshipToPatient() {
		return CommonService.getString(this.in1.getIn117_InsuredSRelationshipToPatient().getValue());
	}
	/**
	 * @param in1_17_insuredsRelationshipToPatient the in1_17_insuredsRelationshipToPatient to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_17_insuredsRelationshipToPatient")
	public void setIn1_17_insuredsRelationshipToPatient(String in1_17_insuredsRelationshipToPatient) throws DataTypeException {
		this.in1.getIn117_InsuredSRelationshipToPatient().setValue(in1_17_insuredsRelationshipToPatient);
		this.in1_17_insuredsRelationshipToPatient = in1_17_insuredsRelationshipToPatient;
	}
	/**
	 *	@return the ts_in1_18_insuredsDateOfBirth
	 */
	
	@JsonProperty("ts_in1_18_insuredsDateOfBirth")
	public TS_v2 getTs_in1_18_insuredsDateOfBirth() {
		return CommonService.getTS_v2(this.in1.getIn118_InsuredSDateOfBirth());
	}
	/**
	 * @param ts_in1_18_insuredsDateOfBirth the ts_in1_18_insuredsDateOfBirth to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_in1_18_insuredsDateOfBirth")
	public void setTs_in1_18_insuredsDateOfBirth(TS_v2 ts_in1_18_insuredsDateOfBirth) throws DataTypeException {
		CommonService.setTS_v2(this.in1.getIn118_InsuredSDateOfBirth(), ts_in1_18_insuredsDateOfBirth);
		this.ts_in1_18_insuredsDateOfBirth = ts_in1_18_insuredsDateOfBirth;
	}
	/**
	 *	@return the xad_in1_19_insuredsAddress
	 */
	
	@JsonProperty("xad_in1_19_insuredsAddress")
	public XAD_v23 getXad_in1_19_insuredsAddress() {
		return CommonService.getXAD_v23(this.in1.getIn119_InsuredSAddress());
	}
	/**
	 * @param xad_in1_19_insuredsAddress the xad_in1_19_insuredsAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_in1_19_insuredsAddress")
	public void setXad_in1_19_insuredsAddress(XAD_v23 xad_in1_19_insuredsAddress) throws DataTypeException {
		CommonService.setXAD_v23(this.in1.getIn119_InsuredSAddress(), xad_in1_19_insuredsAddress);
		this.xad_in1_19_insuredsAddress = xad_in1_19_insuredsAddress;
	}
	/**
	 *	@return the in1_20_assignmentOfBenefits
	 */
	
	@JsonProperty("in1_20_assignmentOfBenefits")
	public String getIn1_20_assignmentOfBenefits() {
		return CommonService.getString(this.in1.getIn120_AssignmentOfBenefits().getValue());
	}
	/**
	 * @param in1_20_assignmentOfBenefits the in1_20_assignmentOfBenefits to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_20_assignmentOfBenefits")
	public void setIn1_20_assignmentOfBenefits(String in1_20_assignmentOfBenefits) throws DataTypeException {
		this.in1.getIn120_AssignmentOfBenefits().setValue(in1_20_assignmentOfBenefits);
		this.in1_20_assignmentOfBenefits = in1_20_assignmentOfBenefits;
	}
	/**
	 *	@return the in1_21_coordinationOfBenefits
	 */
	
	@JsonProperty("in1_21_coordinationOfBenefits")
	public String getIn1_21_coordinationOfBenefits() {
		return CommonService.getString(this.in1.getIn121_CoordinationOfBenefits().getValue());
	}
	/**
	 * @param in1_21_coordinationOfBenefits the in1_21_coordinationOfBenefits to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_21_coordinationOfBenefits")
	public void setIn1_21_coordinationOfBenefits(String in1_21_coordinationOfBenefits) throws DataTypeException {
		this.in1.getIn121_CoordinationOfBenefits().setValue(in1_21_coordinationOfBenefits);
		this.in1_21_coordinationOfBenefits = in1_21_coordinationOfBenefits;
	}
	/**
	 *	@return the in1_22_coordinationOfBenefitsPriority
	 */
	
	@JsonProperty("in1_22_coordinationOfBenefitsPriority")
	public String getIn1_22_coordinationOfBenefitsPriority() {
		return CommonService.getString(this.in1.getIn122_CoordOfBenPriority().getValue());
	}
	/**
	 * @param in1_22_coordinationOfBenefitsPriority the in1_22_coordinationOfBenefitsPriority to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_22_coordinationOfBenefitsPriority")
	public void setIn1_22_coordinationOfBenefitsPriority(String in1_22_coordinationOfBenefitsPriority) throws DataTypeException {
		this.in1.getIn122_CoordOfBenPriority().setValue(in1_22_coordinationOfBenefitsPriority);
		this.in1_22_coordinationOfBenefitsPriority = in1_22_coordinationOfBenefitsPriority;
	}
	/**
	 *	@return the in1_23_noticeOfAdmissionCode
	 */
	
	@JsonProperty("in1_23_noticeOfAdmissionCode")
	public String getIn1_23_noticeOfAdmissionCode() {
		return CommonService.getString(this.in1.getIn123_NoticeOfAdmissionCode().getValue());
	}
	/**
	 * @param in1_23_noticeOfAdmissionCode the in1_23_noticeOfAdmissionCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_23_noticeOfAdmissionCode")
	public void setIn1_23_noticeOfAdmissionCode(String in1_23_noticeOfAdmissionCode) throws DataTypeException {
		this.in1.getIn123_NoticeOfAdmissionCode().setValue(in1_23_noticeOfAdmissionCode);
		this.in1_23_noticeOfAdmissionCode = in1_23_noticeOfAdmissionCode;
	}
	/**
	 *	@return the in1_24_noticeOfAdmissionDate
	 */
	
	@JsonProperty("in1_24_noticeOfAdmissionDate")
	public String getIn1_24_noticeOfAdmissionDate() {
		return CommonService.getString(this.in1.getIn124_NoticeOfAdmissionDate().getValue());
	}
	/**
	 * @param in1_24_noticeOfAdmissionDate the in1_24_noticeOfAdmissionDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_24_noticeOfAdmissionDate")
	public void setIn1_24_noticeOfAdmissionDate(String in1_24_noticeOfAdmissionDate) throws DataTypeException {
		this.in1.getIn124_NoticeOfAdmissionDate().setValue(in1_24_noticeOfAdmissionDate);
		this.in1_24_noticeOfAdmissionDate = in1_24_noticeOfAdmissionDate;
	}
	/**
	 *	@return the in1_25_reportOfEligibilityCode
	 */
	
	@JsonProperty("in1_25_reportOfEligibilityCode")
	public String getIn1_25_reportOfEligibilityCode() {
		return CommonService.getString(this.in1.getIn125_RptOfEigibilityCode().getValue());
	}
	/**
	 * @param in1_25_reportOfEligibilityCode the in1_25_reportOfEligibilityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_25_reportOfEligibilityCode")
	public void setIn1_25_reportOfEligibilityCode(String in1_25_reportOfEligibilityCode) throws DataTypeException {
		this.in1.getIn125_RptOfEigibilityCode().setValue(in1_25_reportOfEligibilityCode);
		this.in1_25_reportOfEligibilityCode = in1_25_reportOfEligibilityCode;
	}
	/**
	 *	@return the in1_26_reportOfEligebilityDate
	 */
	
	@JsonProperty("in1_26_reportOfEligebilityDate")
	public String getIn1_26_reportOfEligebilityDate() {
		return CommonService.getString(this.in1.getIn126_RptOfEligibilityDate().getValue());
	}
	/**
	 * @param in1_26_reportOfEligebilityDate the in1_26_reportOfEligebilityDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_26_reportOfEligebilityDate")
	public void setIn1_26_reportOfEligebilityDate(String in1_26_reportOfEligebilityDate) throws DataTypeException {
		this.in1.getIn126_RptOfEligibilityDate().setValue(in1_26_reportOfEligebilityDate);
		this.in1_26_reportOfEligebilityDate = in1_26_reportOfEligebilityDate;
	}
	/**
	 *	@return the in1_27_releaseInformationCode
	 */
	
	@JsonProperty("in1_27_releaseInformationCode")
	public String getIn1_27_releaseInformationCode() {
		return CommonService.getString(this.in1.getIn127_ReleaseInformationCode().getValue());
	}
	/**
	 * @param in1_27_releaseInformationCode the in1_27_releaseInformationCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_27_releaseInformationCode")
	public void setIn1_27_releaseInformationCode(String in1_27_releaseInformationCode) throws DataTypeException {
		this.in1.getIn127_ReleaseInformationCode().setValue(in1_27_releaseInformationCode);
		this.in1_27_releaseInformationCode = in1_27_releaseInformationCode;
	}
	/**
	 *	@return the in1_28_preAdmitCert
	 */
	
	@JsonProperty("in1_28_preAdmitCert")
	public String getIn1_28_preAdmitCert() {
		return CommonService.getString(this.in1.getIn128_PreAdmitCert().getValue());
	}
	/**
	 * @param in1_28_preAdmitCert the in1_28_preAdmitCert to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_28_preAdmitCert")
	public void setIn1_28_preAdmitCert(String in1_28_preAdmitCert) throws DataTypeException {
		this.in1.getIn128_PreAdmitCert().setValue(in1_28_preAdmitCert);
		this.in1_28_preAdmitCert = in1_28_preAdmitCert;
	}
	/**
	 *	@return the ts_in1_29_verificationDateTime
	 */
	
	@JsonProperty("ts_in1_29_verificationDateTime")
	public TS_v2 getTs_in1_29_verificationDateTime() {
		return CommonService.getTS_v2(this.in1.getIn129_VerificationDateTime());
	}
	/**
	 * @param ts_in1_29_verificationDateTime the ts_in1_29_verificationDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_in1_29_verificationDateTime")
	public void setTs_in1_29_verificationDateTime(TS_v2 ts_in1_29_verificationDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.in1.getIn129_VerificationDateTime(), ts_in1_29_verificationDateTime);
		this.ts_in1_29_verificationDateTime = ts_in1_29_verificationDateTime;
	}
	/**
	 *	@return the xpn_in1_30_verificationBy
	 */
	
	@JsonProperty("xpn_in1_30_verificationBy")
	public XPN_v23 getXpn_in1_30_verificationBy() {
		return CommonService.getXPN_v23(this.in1.getIn130_VerificationBy());
	}
	/**
	 * @param xpn_in1_30_verificationBy the xpn_in1_30_verificationBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_in1_30_verificationBy")
	public void setXpn_in1_30_verificationBy(XPN_v23 xpn_in1_30_verificationBy) throws DataTypeException {
		CommonService.setXPN_v23(this.in1.getIn130_VerificationBy(), xpn_in1_30_verificationBy);
		this.xpn_in1_30_verificationBy = xpn_in1_30_verificationBy;
	}
	/**
	 *	@return the in1_31_typeOfAgreementCode
	 */
	
	@JsonProperty("in1_31_typeOfAgreementCode")
	public String getIn1_31_typeOfAgreementCode() {
		return CommonService.getString(this.in1.getIn131_TypeOfAgreementCode().getValue());
	}
	/**
	 * @param in1_31_typeOfAgreementCode the in1_31_typeOfAgreementCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_31_typeOfAgreementCode")
	public void setIn1_31_typeOfAgreementCode(String in1_31_typeOfAgreementCode) throws DataTypeException {
		this.in1.getIn131_TypeOfAgreementCode().setValue(in1_31_typeOfAgreementCode);
		this.in1_31_typeOfAgreementCode = in1_31_typeOfAgreementCode;
	}
	/**
	 *	@return the in1_32_billingStatus
	 */
	
	@JsonProperty("in1_32_billingStatus")
	public String getIn1_32_billingStatus() {
		return CommonService.getString(this.in1.getIn132_BillingStatus().getValue());
	}
	/**
	 * @param in1_32_billingStatus the in1_32_billingStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_32_billingStatus")
	public void setIn1_32_billingStatus(String in1_32_billingStatus) throws DataTypeException {
		this.in1.getIn132_BillingStatus().setValue(in1_32_billingStatus);
		this.in1_32_billingStatus = in1_32_billingStatus;
	}
	/**
	 *	@return the in1_33_lifetimeReserveDays
	 */
	
	@JsonProperty("in1_33_lifetimeReserveDays")
	public String getIn1_33_lifetimeReserveDays() {
		return CommonService.getString(this.in1.getIn133_LifetimeReserveDays().getValue());
	}
	/**
	 * @param in1_33_lifetimeReserveDays the in1_33_lifetimeReserveDays to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_33_lifetimeReserveDays")
	public void setIn1_33_lifetimeReserveDays(String in1_33_lifetimeReserveDays) throws DataTypeException {
		this.in1.getIn133_LifetimeReserveDays().setValue(in1_33_lifetimeReserveDays);
		this.in1_33_lifetimeReserveDays = in1_33_lifetimeReserveDays;
	}
	/**
	 *	@return the in1_34_delayBeforeLifetimeReserveDays
	 */
	
	@JsonProperty("in1_34_delayBeforeLifetimeReserveDays")
	public String getIn1_34_delayBeforeLifetimeReserveDays() {
		return CommonService.getString(this.in1.getIn134_DelayBeforeLifetimeReserveDays().getValue());
	}
	/**
	 * @param in1_34_delayBeforeLifetimeReserveDays the in1_34_delayBeforeLifetimeReserveDays to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_34_delayBeforeLifetimeReserveDays")
	public void setIn1_34_delayBeforeLifetimeReserveDays(String in1_34_delayBeforeLifetimeReserveDays) throws DataTypeException {
		this.in1.getIn134_DelayBeforeLifetimeReserveDays().setValue(in1_34_delayBeforeLifetimeReserveDays);
		this.in1_34_delayBeforeLifetimeReserveDays = in1_34_delayBeforeLifetimeReserveDays;
	}
	/**
	 *	@return the in1_35_companyPlanCode
	 */
	
	@JsonProperty("in1_35_companyPlanCode")
	public String getIn1_35_companyPlanCode() {
		return CommonService.getString(this.in1.getIn135_CompanyPlanCode().getValue());
	}
	/**
	 * @param in1_35_companyPlanCode the in1_35_companyPlanCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_35_companyPlanCode")
	public void setIn1_35_companyPlanCode(String in1_35_companyPlanCode) throws DataTypeException {
		this.in1.getIn135_CompanyPlanCode().setValue(in1_35_companyPlanCode);
		this.in1_35_companyPlanCode = in1_35_companyPlanCode;
	}
	/**
	 *	@return the in1_36_policyNumber
	 */
	
	@JsonProperty("in1_36_policyNumber")
	public String getIn1_36_policyNumber() {
		return CommonService.getString(this.in1.getIn136_PolicyNumber().getValue());
	}
	/**
	 * @param in1_36_policyNumber the in1_36_policyNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_36_policyNumber")
	public void setIn1_36_policyNumber(String in1_36_policyNumber) throws DataTypeException {
		this.in1.getIn136_PolicyNumber().setValue(in1_36_policyNumber);
		this.in1_36_policyNumber = in1_36_policyNumber;
	}
	/**
	 *	@return the cp_in1_37_policyDeductible
	 */
	
	@JsonProperty("cp_in1_37_policyDeductible")
	public CP_v2 getCp_in1_37_policyDeductible() {
		return CommonService.getCP_v2(this.in1.getIn137_PolicyDeductible());
	}
	/**
	 * @param cp_in1_37_policyDeductible the cp_in1_37_policyDeductible to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_in1_37_policyDeductible")
	public void setCp_in1_37_policyDeductible(CP_v2 cp_in1_37_policyDeductible) throws DataTypeException {
		CommonService.setCP_v2(this.in1.getIn137_PolicyDeductible(), cp_in1_37_policyDeductible);
		this.cp_in1_37_policyDeductible = cp_in1_37_policyDeductible;
	}
	/**
	 *	@return the cp_in1_38_policyLimitAmount
	 */
	
	@JsonProperty("cp_in1_38_policyLimitAmount")
	public CP_v2 getCp_in1_38_policyLimitAmount() {
		return CommonService.getCP_v2(this.in1.getIn138_PolicyLimitAmount());
	}
	/**
	 * @param cp_in1_38_policyLimitAmount the cp_in1_38_policyLimitAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_in1_38_policyLimitAmount")
	public void setCp_in1_38_policyLimitAmount(CP_v2 cp_in1_38_policyLimitAmount) throws DataTypeException {
		CommonService.setCP_v2(this.in1.getIn138_PolicyLimitAmount(), cp_in1_38_policyLimitAmount);
		this.cp_in1_38_policyLimitAmount = cp_in1_38_policyLimitAmount;
	}
	/**
	 *	@return the in1_39_policyLimitDays
	 */
	
	@JsonProperty("in1_39_policyLimitDays")
	public String getIn1_39_policyLimitDays() {
		return CommonService.getString(this.in1.getIn139_PolicyLimitDays().getValue());
	}
	/**
	 * @param in1_39_policyLimitDays the in1_39_policyLimitDays to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_39_policyLimitDays")
	public void setIn1_39_policyLimitDays(String in1_39_policyLimitDays) throws DataTypeException {
		this.in1.getIn139_PolicyLimitDays().setValue(in1_39_policyLimitDays);
		this.in1_39_policyLimitDays = in1_39_policyLimitDays;
	}
	/**
	 *	@return the cp_in1_40_roomRateSemiPrivate
	 */
	
	@JsonProperty("cp_in1_40_roomRateSemiPrivate")
	public CP_v2 getCp_in1_40_roomRateSemiPrivate() {
		return CommonService.getCP_v2(this.in1.getIn137_PolicyDeductible());
	}
	/**
	 * @param cp_in1_40_roomRateSemiPrivate the cp_in1_40_roomRateSemiPrivate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_in1_40_roomRateSemiPrivate")
	public void setCp_in1_40_roomRateSemiPrivate(CP_v2 cp_in1_40_roomRateSemiPrivate) throws DataTypeException {
		CommonService.setCP_v2(this.in1.getIn137_PolicyDeductible(), cp_in1_40_roomRateSemiPrivate);
		this.cp_in1_40_roomRateSemiPrivate = cp_in1_40_roomRateSemiPrivate;
	}
	/**
	 *	@return the cp_in1_41_roomRatePrivate
	 */
	
	@JsonProperty("cp_in1_41_roomRatePrivate")
	public CP_v2 getCp_in1_41_roomRatePrivate() {
		return CommonService.getCP_v2(this.in1.getIn141_RoomRatePrivate());
	}
	/**
	 * @param cp_in1_41_roomRatePrivate the cp_in1_41_roomRatePrivate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_in1_41_roomRatePrivate")
	public void setCp_in1_41_roomRatePrivate(CP_v2 cp_in1_41_roomRatePrivate) throws DataTypeException {
		CommonService.setCP_v2(this.in1.getIn141_RoomRatePrivate(), cp_in1_41_roomRatePrivate);
		this.cp_in1_41_roomRatePrivate = cp_in1_41_roomRatePrivate;
	}
	/**
	 *	@return the ce_in1_42_insuredsEmploymentStatus
	 */
	
	@JsonProperty("ce_in1_42_insuredsEmploymentStatus")
	public CE_v2 getCe_in1_42_insuredsEmploymentStatus() {
		return CommonService.getCE_v2(this.in1.getIn142_InsuredSEmploymentStatus());
	}
	/**
	 * @param ce_in1_42_insuredsEmploymentStatus the ce_in1_42_insuredsEmploymentStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_in1_42_insuredsEmploymentStatus")
	public void setCe_in1_42_insuredsEmploymentStatus(CE_v2 ce_in1_42_insuredsEmploymentStatus) throws DataTypeException {
		CommonService.setCE_v2(this.in1.getIn142_InsuredSEmploymentStatus(), ce_in1_42_insuredsEmploymentStatus);
		this.ce_in1_42_insuredsEmploymentStatus = ce_in1_42_insuredsEmploymentStatus;
	}
	/**
	 *	@return the in1_43_insuredsSex
	 */
	
	@JsonProperty("in1_43_insuredsSex")
	public String getIn1_43_insuredsSex() {
		return this.in1.getIn143_InsuredSSex().getValue();
	}
	/**
	 * @param in1_43_insuredsSex the in1_43_insuredsSex to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_43_insuredsSex")
	public void setIn1_43_insuredsSex(String in1_43_insuredsSex) throws DataTypeException {
		this.in1.getIn143_InsuredSSex().setValue(in1_43_insuredsSex);
		this.in1_43_insuredsSex = in1_43_insuredsSex;
	}
	/**
	 *	@return the xad_in1_44_insuredsEmployerAddress
	 */
	
	@JsonProperty("xad_in1_44_insuredsEmployerAddress")
	public XAD_v23 getXad_in1_44_insuredsEmployerAddress() {
		return CommonService.getXAD_v23(this.in1.getIn144_InsuredSEmployerAddress());
	}
	/**
	 * @param xad_in1_44_insuredsEmployerAddress the xad_in1_44_insuredsEmployerAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_in1_44_insuredsEmployerAddress")
	public void setXad_in1_44_insuredsEmployerAddress(XAD_v23 xad_in1_44_insuredsEmployerAddress) throws DataTypeException {
		CommonService.setXAD_v23(this.in1.getIn144_InsuredSEmployerAddress(), xad_in1_44_insuredsEmployerAddress);
		this.xad_in1_44_insuredsEmployerAddress = xad_in1_44_insuredsEmployerAddress;
	}
	/**
	 *	@return the in1_45_verificationStatus
	 */
	
	@JsonProperty("in1_45_verificationStatus")
	public String getIn1_45_verificationStatus() {
		return CommonService.getString(this.in1.getIn145_VerificationStatus().getValue());
	}
	/**
	 * @param in1_45_verificationStatus the in1_45_verificationStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_45_verificationStatus")
	public void setIn1_45_verificationStatus(String in1_45_verificationStatus) throws DataTypeException {
		this.in1.getIn145_VerificationStatus().setValue(in1_45_verificationStatus);
		this.in1_45_verificationStatus = in1_45_verificationStatus;
	}
	/**
	 *	@return the in1_46_priorInsurancePlanId
	 */
	
	@JsonProperty("in1_46_priorInsurancePlanId")
	public String getIn1_46_priorInsurancePlanId() {
		return CommonService.getString(this.in1.getIn146_PriorInsurancePlanID().getValue());
	}
	/**
	 * @param in1_46_priorInsurancePlanId the in1_46_priorInsurancePlanId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_46_priorInsurancePlanId")
	public void setIn1_46_priorInsurancePlanId(String in1_46_priorInsurancePlanId) throws DataTypeException {
		this.in1.getIn146_PriorInsurancePlanID().setValue(in1_46_priorInsurancePlanId);
		this.in1_46_priorInsurancePlanId = in1_46_priorInsurancePlanId;
	}
	/**
	 *	@return the in1_47_coverageType
	 */
	
	@JsonProperty("in1_47_coverageType")
	public String getIn1_47_coverageType() {
		return CommonService.getString(this.in1.getIn147_CoverageType().getValue());
	}
	/**
	 * @param in1_47_coverageType the in1_47_coverageType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_47_coverageType")
	public void setIn1_47_coverageType(String in1_47_coverageType) throws DataTypeException {
		this.in1.getIn147_CoverageType().setValue(in1_47_coverageType);
		this.in1_47_coverageType = in1_47_coverageType;
	}
	/**
	 *	@return the in1_48_handicap
	 */
	
	@JsonProperty("in1_48_handicap")
	public String getIn1_48_handicap() {
		return CommonService.getString(this.in1.getIn148_Handicap().getValue());
	}
	/**
	 * @param in1_48_handicap the in1_48_handicap to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("in1_48_handicap")
	public void setIn1_48_handicap(String in1_48_handicap) throws DataTypeException {
		this.in1.getIn148_Handicap().setValue(in1_48_handicap);
		this.in1_48_handicap = in1_48_handicap;
	}
	/**
	 *	@return the cx_in1_49_insuredsIdNumber
	 */
	
	@JsonProperty("cx_in1_49_insuredsIdNumber")
	public CX_v23 getCx_in1_49_insuredsIdNumber() {
		return CommonService.getCX_v23(this.in1.getIn149_InsuredSIDNumber());
	}
	/**
	 * @param cx_in1_49_insuredsIdNumber the cx_in1_49_insuredsIdNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_in1_49_insuredsIdNumber")
	public void setCx_in1_49_insuredsIdNumber(CX_v23 cx_in1_49_insuredsIdNumber) throws DataTypeException {
		CommonService.setCX_v23(this.in1.getIn149_InsuredSIDNumber(), cx_in1_49_insuredsIdNumber);
		this.cx_in1_49_insuredsIdNumber = cx_in1_49_insuredsIdNumber;
	}	
}
