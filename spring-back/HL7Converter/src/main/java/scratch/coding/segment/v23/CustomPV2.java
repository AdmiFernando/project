package scratch.coding.segment.v23;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.PV2;
import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPV2{
	@JsonProperty("pl_pv2_1_priorPendingLocation")
	private PL_v23 pl_pv2_1_priorPendingLocation;
	@JsonProperty("ce_pv2_2_accommodationCode")
	private CE_v2 ce_pv2_2_accommodationCode;
	@JsonProperty("ce_pv2_3_admitReason")
	private CE_v2 ce_pv2_3_admitReason;
	@JsonProperty("ce_pv2_4_transferReason")
	private CE_v2 ce_pv2_4_transferReason;
	@JsonProperty("pv2_5_patientValuables")
	private String[] pv2_5_patientValuables;
	@JsonProperty("pv2_6_patientValuablesLocation")
	private String pv2_6_patientValuablesLocation;
	@JsonProperty("pv2_7_visitUserCode")
	private String pv2_7_visitUserCode;
	@JsonProperty("ts_pv2_8_expectedAdmitDate")
	private TS_v2 ts_pv2_8_expectedAdmitDate;
	@JsonProperty("ts_pv2_9_expectedDischargeDate")
	private TS_v2 ts_pv2_9_expectedDischargeDate;
	@JsonProperty("pv2_10_estimatedLengthOfInpatientStay")
	private String pv2_10_estimatedLengthOfInpatientStay;
	@JsonProperty("pv2_11_actualLengthOfInpatientStay")
	private String pv2_11_actualLengthOfInpatientStay;
	@JsonProperty("pv2_12_visitDescription")
	private String pv2_12_visitDescription;
	@JsonProperty("xcn_pv2_13_referralSourceCode")
	private XCN_v23 xcn_pv2_13_referralSourceCode;
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
	@JsonProperty("pv2_20_expectedNumberOfInsurancePlans")
	private String pv2_20_expectedNumberOfInsurancePlans;
	@JsonProperty("pv2_21_visitPublicityCode")
	private String pv2_21_visitPublicityCode;
	@JsonProperty("pv2_22_visitProtectionIndicator")
	private String pv2_22_visitProtectionIndicator;
	@JsonProperty("xon_pv2_23_clinicOrganizationName")
	private XON_v23[] xon_pv2_23_clinicOrganizationName;
	@JsonProperty("pv2_24_patientStatusCode")
	private String pv2_24_patientStatusCode;
	@JsonProperty("pv2_25_visitPriorityCode")
	private String pv2_25_visitPriorityCode;
	@JsonProperty("pv2_26_previousTreatmentDate")
	private String pv2_26_previousTreatmentDate;
	@JsonProperty("pv2_27_expectedDischargeDisposition")
	private String pv2_27_expectedDischargeDisposition;
	@JsonProperty("pv2_28_signatureOnFileDate")
	private String pv2_28_signatureOnFileDate;
	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	private String pv2_29_firstSimilarIllnessDate;
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	private String pv2_30_patientChargeAdjustmentCode;
	@JsonProperty("pv2_31_recurringServiceCode")
	private String pv2_31_recurringServiceCode;
	@JsonProperty("pv2_32_billingMediaCode")
	private String pv2_32_billingMediaCode;
	@JsonProperty("ts_pv2_33_expectedSurgeryDateAndTime")
	private TS_v2 ts_pv2_33_expectedSurgeryDateAndTime;
	@JsonProperty("pv2_34_militaryPartnershipCode")
	private String pv2_34_militaryPartnershipCode;
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	private String pv2_35_militaryNonAvailabilityCode;
	@JsonProperty("pv2_36_newbornBabyIndicator")
	private String pv2_36_newbornBabyIndicator;
	@JsonProperty("pv2_37_babyDetainedIndicator")
	private String pv2_37_babyDetainedIndicator;

	private PV2 pv2;

	private CustomPV2(PV2 pv2) {
		super();
		this.pv2 =pv2;
	}
	public static CustomPV2 createPv21WithTypeAndVersion(PV2 pv2) throws HL7Exception, IOException {
		return new CustomPV2(pv2);
	}
	/**
	 *	@return the pl_pv2_1_priorPendingLocation
	 */

	@JsonProperty("pl_pv2_1_priorPendingLocation")
	public PL_v23 getPl_pv2_1_priorPendingLocation() {
		return CommonService.getPL_v23(this.pv2.getPv21_PriorPendingLocation());
	}
	public CustomPV2() {
		super();
	}
	/**
	 * @param pl_pv2_1_priorPendingLocation the pl_pv2_1_priorPendingLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_pv2_1_priorPendingLocation")
	public void setPl_pv2_1_priorPendingLocation(PL_v23 pl_pv2_1_priorPendingLocation) throws DataTypeException {
		CommonService.setPL_v23(this.pv2.getPv21_PriorPendingLocation(), pl_pv2_1_priorPendingLocation);
		this.pl_pv2_1_priorPendingLocation = pl_pv2_1_priorPendingLocation;
	}
	/**
	 *	@return the ce_pv2_2_accommodationCode
	 */

	@JsonProperty("ce_pv2_2_accommodationCode")
	public CE_v2 getCe_pv2_2_accommodationCode() {
		return CommonService.getCE_v2(this.pv2.getPv22_AccommodationCode());
	}
	/**
	 * @param ce_pv2_2_accommodationCode the ce_pv2_2_accommodationCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pv2_2_accommodationCode")
	public void setCe_pv2_2_accommodationCode(CE_v2 ce_pv2_2_accommodationCode) throws DataTypeException {
		CommonService.setCE_v2(this.pv2.getPv22_AccommodationCode(), ce_pv2_2_accommodationCode);
		this.ce_pv2_2_accommodationCode = ce_pv2_2_accommodationCode;
	}
	/**
	 *	@return the ce_pv2_3_admitReason
	 */

	@JsonProperty("ce_pv2_3_admitReason")
	public CE_v2 getCe_pv2_3_admitReason() {
		return CommonService.getCE_v2(this.pv2.getPv23_AdmitReason());
	}
	/**
	 * @param ce_pv2_3_admitReason the ce_pv2_3_admitReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pv2_3_admitReason")
	public void setCe_pv2_3_admitReason(CE_v2 ce_pv2_3_admitReason) throws DataTypeException {
		CommonService.setCE_v2(this.pv2.getPv23_AdmitReason(), ce_pv2_3_admitReason);
		this.ce_pv2_3_admitReason = ce_pv2_3_admitReason;
	}
	/**
	 *	@return the ce_pv2_4_transferReason
	 */

	@JsonProperty("ce_pv2_4_transferReason")
	public CE_v2 getCe_pv2_4_transferReason() {
		return CommonService.getCE_v2(this.pv2.getPv24_TransferReason());
	}
	/**
	 * @param ce_pv2_4_transferReason the ce_pv2_4_transferReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pv2_4_transferReason")
	public void setCe_pv2_4_transferReason(CE_v2 ce_pv2_4_transferReason) throws DataTypeException {
		CommonService.setCE_v2(this.pv2.getPv24_TransferReason(), ce_pv2_4_transferReason);
		this.ce_pv2_4_transferReason = ce_pv2_4_transferReason;
	}
	/**
	 *	@return the pv2_5_patientValuables
	 */

	@JsonProperty("pv2_5_patientValuables")
	public String[] getPv2_5_patientValuables() {
		String[] patientValuables = new String[this.pv2.getPv25_PatientValuables().length];
		for(int i = 0; i <this.pv2.getPv25_PatientValuables().length; i++) {
			patientValuables[i] = CommonService.getString(this.pv2.getPv25_PatientValuables(i).getValue());
		}
		return pv2_5_patientValuables==null?new String[] {}:pv2_5_patientValuables;
	}
	/**
	 * @param pv2_5_patientValuables the pv2_5_patientValuables to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_5_patientValuables")
	public void setPv2_5_patientValuables(String[] pv2_5_patientValuables) throws DataTypeException {
		for(int i = 0; i <pv2_5_patientValuables.length; i++) {
			this.pv2.getPv25_PatientValuables(i).setValue(pv2_5_patientValuables[i]);;
		}
		this.pv2_5_patientValuables = pv2_5_patientValuables;
	}
	/**
	 *	@return the pv2_6_patientValuablesLocation
	 */

	@JsonProperty("pv2_6_patientValuablesLocation")
	public String getPv2_6_patientValuablesLocation() {
		return CommonService.getString(this.pv2.getPv26_PatientValuablesLocation().getValue());
	}
	/**
	 * @param pv2_6_patientValuablesLocation the pv2_6_patientValuablesLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_6_patientValuablesLocation")
	public void setPv2_6_patientValuablesLocation(String pv2_6_patientValuablesLocation) throws DataTypeException {
		this.pv2.getPv26_PatientValuablesLocation().setValue(pv2_6_patientValuablesLocation);
		this.pv2_6_patientValuablesLocation = pv2_6_patientValuablesLocation;
	}
	/**
	 *	@return the pv2_7_visitUserCode
	 */

	@JsonProperty("pv2_7_visitUserCode")
	public String getPv2_7_visitUserCode() {
		return CommonService.getString(this.pv2.getPv27_VisitUserCode().getValue());
	}
	/**
	 * @param pv2_7_visitUserCode the pv2_7_visitUserCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_7_visitUserCode")
	public void setPv2_7_visitUserCode(String pv2_7_visitUserCode) throws DataTypeException {
		this.pv2.getPv27_VisitUserCode().setValue(pv2_7_visitUserCode);
		this.pv2_7_visitUserCode = pv2_7_visitUserCode;
	}
	/**
	 *	@return the ts_pv2_8_expectedAdmitDate
	 */

	@JsonProperty("ts_pv2_8_expectedAdmitDate")
	public TS_v2 getTs_pv2_8_expectedAdmitDate() {
		return CommonService.getTS_v2(this.pv2.getPv28_ExpectedAdmitDate());
	}
	/**
	 * @param ts_pv2_8_expectedAdmitDate the ts_pv2_8_expectedAdmitDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pv2_8_expectedAdmitDate")
	public void setTs_pv2_8_expectedAdmitDate(TS_v2 ts_pv2_8_expectedAdmitDate) throws DataTypeException {
		CommonService.setTS_v2(this.pv2.getPv28_ExpectedAdmitDate(), ts_pv2_8_expectedAdmitDate);
		this.ts_pv2_8_expectedAdmitDate = ts_pv2_8_expectedAdmitDate;
	}
	/**
	 *	@return the ts_pv2_9_expectedDischargeDate
	 */

	@JsonProperty("ts_pv2_9_expectedDischargeDate")
	public TS_v2 getTs_pv2_9_expectedDischargeDate() {
		return CommonService.getTS_v2(this.pv2.getPv29_ExpectedDischargeDate());
	}
	/**
	 * @param ts_pv2_9_expectedDischargeDate the ts_pv2_9_expectedDischargeDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pv2_9_expectedDischargeDate")
	public void setTs_pv2_9_expectedDischargeDate(TS_v2 ts_pv2_9_expectedDischargeDate) throws DataTypeException {
		CommonService.setTS_v2(this.pv2.getPv29_ExpectedDischargeDate(), ts_pv2_9_expectedDischargeDate);
		this.ts_pv2_9_expectedDischargeDate = ts_pv2_9_expectedDischargeDate;
	}
	/**
	 *	@return the pv2_10_estimatedLengthOfInpatientStay
	 */

	@JsonProperty("pv2_10_estimatedLengthOfInpatientStay")
	public String getPv2_10_estimatedLengthOfInpatientStay() {
		return CommonService.getString(this.pv2.getPv210_EstimatedLengthOfInpatientStay().getValue());
	}
	/**
	 * @param pv2_10_estimatedLengthOfInpatientStay the pv2_10_estimatedLengthOfInpatientStay to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_10_estimatedLengthOfInpatientStay")
	public void setPv2_10_estimatedLengthOfInpatientStay(String pv2_10_estimatedLengthOfInpatientStay) throws DataTypeException {
		this.pv2.getPv210_EstimatedLengthOfInpatientStay().setValue(pv2_10_estimatedLengthOfInpatientStay);
		this.pv2_10_estimatedLengthOfInpatientStay = pv2_10_estimatedLengthOfInpatientStay;
	}
	/**
	 *	@return the pv2_11_actualLengthOfInpatientStay
	 */

	@JsonProperty("pv2_11_actualLengthOfInpatientStay")
	public String getPv2_11_actualLengthOfInpatientStay() {
		return CommonService.getString(this.pv2.getPv211_ActualLengthOfInpatientStay().getValue());
	}
	/**
	 * @param pv2_11_actualLengthOfInpatientStay the pv2_11_actualLengthOfInpatientStay to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_11_actualLengthOfInpatientStay")
	public void setPv2_11_actualLengthOfInpatientStay(String pv2_11_actualLengthOfInpatientStay) throws DataTypeException {
		this.pv2.getPv211_ActualLengthOfInpatientStay().setValue(pv2_11_actualLengthOfInpatientStay);
		this.pv2_11_actualLengthOfInpatientStay = pv2_11_actualLengthOfInpatientStay;
	}
	/**
	 *	@return the pv2_12_visitDescription
	 */

	@JsonProperty("pv2_12_visitDescription")
	public String getPv2_12_visitDescription() {
		return CommonService.getString(this.pv2.getPv212_VisitDescription().getValue());
	}
	/**
	 * @param pv2_12_visitDescription the pv2_12_visitDescription to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_12_visitDescription")
	public void setPv2_12_visitDescription(String pv2_12_visitDescription) throws DataTypeException {
		this.pv2.getPv212_VisitDescription().setValue(pv2_12_visitDescription);
		this.pv2_12_visitDescription = pv2_12_visitDescription;
	}
	/**
	 *	@return the xcn_pv2_13_referralSourceCode
	 */

	@JsonProperty("xcn_pv2_13_referralSourceCode")
	public XCN_v23 getXcn_pv2_13_referralSourceCode() {
		return CommonService.getXCN_v23(this.pv2.getPv213_ReferralSourceCode());
	}
	/**
	 * @param xcn_pv2_13_referralSourceCode the xcn_pv2_13_referralSourceCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pv2_13_referralSourceCode")
	public void setXcn_pv2_13_referralSourceCode(XCN_v23 xcn_pv2_13_referralSourceCode) throws DataTypeException {
		CommonService.setXCN_v23(this.pv2.getPv213_ReferralSourceCode(), xcn_pv2_13_referralSourceCode);
		this.xcn_pv2_13_referralSourceCode = xcn_pv2_13_referralSourceCode;
	}
	/**
	 *	@return the pv2_14_previousServiceDate
	 */

	@JsonProperty("pv2_14_previousServiceDate")
	public String getPv2_14_previousServiceDate() {
		return CommonService.getString(this.pv2.getPv214_PreviousServiceDate().getValue());
	}
	/**
	 * @param pv2_14_previousServiceDate the pv2_14_previousServiceDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_14_previousServiceDate")
	public void setPv2_14_previousServiceDate(String pv2_14_previousServiceDate) throws DataTypeException {
		this.pv2.getPv214_PreviousServiceDate().setValue(pv2_14_previousServiceDate);
		this.pv2_14_previousServiceDate = pv2_14_previousServiceDate;
	}
	/**
	 *	@return the pv2_15_employmentIllnessRelatedIndicator
	 */

	@JsonProperty("pv2_15_employmentIllnessRelatedIndicator")
	public String getPv2_15_employmentIllnessRelatedIndicator() {
		return CommonService.getString(this.pv2.getPv215_EmploymentIllnessRelatedIndicator().getValue());
	}
	/**
	 * @param pv2_15_employmentIllnessRelatedIndicator the pv2_15_employmentIllnessRelatedIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_15_employmentIllnessRelatedIndicator")
	public void setPv2_15_employmentIllnessRelatedIndicator(String pv2_15_employmentIllnessRelatedIndicator) throws DataTypeException {
		this.pv2.getPv215_EmploymentIllnessRelatedIndicator().setValue(pv2_15_employmentIllnessRelatedIndicator);
		this.pv2_15_employmentIllnessRelatedIndicator = pv2_15_employmentIllnessRelatedIndicator;
	}
	/**
	 *	@return the pv2_16_purgeStatusCode
	 */

	@JsonProperty("pv2_16_purgeStatusCode")
	public String getPv2_16_purgeStatusCode() {
		return CommonService.getString(this.pv2.getPv216_PurgeStatusCode().getValue());
	}
	/**
	 * @param pv2_16_purgeStatusCode the pv2_16_purgeStatusCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_16_purgeStatusCode")
	public void setPv2_16_purgeStatusCode(String pv2_16_purgeStatusCode) throws DataTypeException {
		this.pv2.getPv216_PurgeStatusCode().setValue(pv2_16_purgeStatusCode);
		this.pv2_16_purgeStatusCode = pv2_16_purgeStatusCode;
	}
	/**
	 *	@return the pv2_17_purgeStatusDate
	 */

	@JsonProperty("pv2_17_purgeStatusDate")
	public String getPv2_17_purgeStatusDate() {
		return CommonService.getString(this.pv2.getPv217_PurgeStatusDate().getValue());
	}
	/**
	 * @param pv2_17_purgeStatusDate the pv2_17_purgeStatusDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_17_purgeStatusDate")
	public void setPv2_17_purgeStatusDate(String pv2_17_purgeStatusDate) throws DataTypeException {
		this.pv2.getPv217_PurgeStatusDate().setValue(pv2_17_purgeStatusDate);
		this.pv2_17_purgeStatusDate = pv2_17_purgeStatusDate;
	}
	/**
	 *	@return the pv2_18_specialProgramCode
	 */

	@JsonProperty("pv2_18_specialProgramCode")
	public String getPv2_18_specialProgramCode() {
		return CommonService.getString(this.pv2.getPv218_SpecialProgramCode().getValue());
	}
	/**
	 * @param pv2_18_specialProgramCode the pv2_18_specialProgramCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_18_specialProgramCode")
	public void setPv2_18_specialProgramCode(String pv2_18_specialProgramCode) throws DataTypeException {
		this.pv2.getPv218_SpecialProgramCode().setValue(pv2_18_specialProgramCode);
		this.pv2_18_specialProgramCode = pv2_18_specialProgramCode;
	}
	/**
	 *	@return the pv2_19_retentionIndicator
	 */

	@JsonProperty("pv2_19_retentionIndicator")
	public String getPv2_19_retentionIndicator() {
		return CommonService.getString(this.pv2.getPv219_RetentionIndicator().getValue());
	}
	/**
	 * @param pv2_19_retentionIndicator the pv2_19_retentionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_19_retentionIndicator")
	public void setPv2_19_retentionIndicator(String pv2_19_retentionIndicator) throws DataTypeException {
		this.pv2.getPv219_RetentionIndicator().setValue(pv2_19_retentionIndicator);
		this.pv2_19_retentionIndicator = pv2_19_retentionIndicator;
	}
	/**
	 *	@return the pv2_20_expectedNumberOfInsurancePlans
	 */

	@JsonProperty("pv2_20_expectedNumberOfInsurancePlans")
	public String getPv2_20_expectedNumberOfInsurancePlans() {
		return CommonService.getString(this.pv2.getPv220_ExpectedNumberOfInsurancePlans().getValue());
	}
	/**
	 * @param pv2_20_expectedNumberOfInsurancePlans the pv2_20_expectedNumberOfInsurancePlans to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_20_expectedNumberOfInsurancePlans")
	public void setPv2_20_expectedNumberOfInsurancePlans(String pv2_20_expectedNumberOfInsurancePlans) throws DataTypeException {
		this.pv2.getPv220_ExpectedNumberOfInsurancePlans().setValue(pv2_20_expectedNumberOfInsurancePlans);
		this.pv2_20_expectedNumberOfInsurancePlans = pv2_20_expectedNumberOfInsurancePlans;
	}
	/**
	 *	@return the pv2_21_visitPublicityCode
	 */

	@JsonProperty("pv2_21_visitPublicityCode")
	public String getPv2_21_visitPublicityCode() {
		return CommonService.getString(this.pv2.getPv221_VisitPublicityCode().getValue());
	}
	/**
	 * @param pv2_21_visitPublicityCode the pv2_21_visitPublicityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_21_visitPublicityCode")
	public void setPv2_21_visitPublicityCode(String pv2_21_visitPublicityCode) throws DataTypeException {
		this.pv2.getPv221_VisitPublicityCode().setValue(pv2_21_visitPublicityCode);
		this.pv2_21_visitPublicityCode = pv2_21_visitPublicityCode;
	}
	/**
	 *	@return the pv2_22_visitProtectionIndicator
	 */

	@JsonProperty("pv2_22_visitProtectionIndicator")
	public String getPv2_22_visitProtectionIndicator() {
		return CommonService.getString(this.pv2.getPv222_VisitProtectionIndicator().getValue());
	}
	/**
	 * @param pv2_22_visitProtectionIndicator the pv2_22_visitProtectionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_22_visitProtectionIndicator")
	public void setPv2_22_visitProtectionIndicator(String pv2_22_visitProtectionIndicator) throws DataTypeException {
		this.pv2.getPv222_VisitProtectionIndicator().setValue(pv2_22_visitProtectionIndicator);
		this.pv2_22_visitProtectionIndicator = pv2_22_visitProtectionIndicator;
	}
	/**
	 *	@return the xon_pv2_23_clinicOrganizationName
	 */

	@JsonProperty("xon_pv2_23_clinicOrganizationName")
	public XON_v23[] getXon_pv2_23_clinicOrganizationName() {
		XON_v23[] clinicOrganizationName = new XON_v23[this.pv2.getPv223_ClinicOrganizationName().length];
		for(int i = 0; i < this.pv2.getPv223_ClinicOrganizationName().length; i++) {
			clinicOrganizationName[i]=CommonService.getXON_v23(this.pv2.getPv223_ClinicOrganizationName(i));
		}
		return xon_pv2_23_clinicOrganizationName;
	}
	/**
	 * @param xon_pv2_23_clinicOrganizationName the xon_pv2_23_clinicOrganizationName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_pv2_23_clinicOrganizationName")
	public void setXon_pv2_23_clinicOrganizationName(XON_v23[] xon_pv2_23_clinicOrganizationName) throws DataTypeException {
		for(int i = 0; i < xon_pv2_23_clinicOrganizationName.length; i++) {
			CommonService.setXON_v23(this.pv2.getPv223_ClinicOrganizationName(i), xon_pv2_23_clinicOrganizationName[i]);
		}
		this.xon_pv2_23_clinicOrganizationName = xon_pv2_23_clinicOrganizationName;
	}
	/**
	 *	@return the pv2_24_patientStatusCode
	 */

	@JsonProperty("pv2_24_patientStatusCode")
	public String getPv2_24_patientStatusCode() {
		return CommonService.getString(this.pv2.getPv224_PatientStatusCode().getValue());
	}
	/**
	 * @param pv2_24_patientStatusCode the pv2_24_patientStatusCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_24_patientStatusCode")
	public void setPv2_24_patientStatusCode(String pv2_24_patientStatusCode) throws DataTypeException {
		this.pv2.getPv224_PatientStatusCode().setValue(pv2_24_patientStatusCode);
		this.pv2_24_patientStatusCode = pv2_24_patientStatusCode;
	}
	/**
	 *	@return the pv2_25_visitPriorityCode
	 */

	@JsonProperty("pv2_25_visitPriorityCode")
	public String getPv2_25_visitPriorityCode() {
		return CommonService.getString(this.pv2.getPv225_VisitPriorityCode().getValue());
	}
	/**
	 * @param pv2_25_visitPriorityCode the pv2_25_visitPriorityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_25_visitPriorityCode")
	public void setPv2_25_visitPriorityCode(String pv2_25_visitPriorityCode) throws DataTypeException {
		this.pv2.getPv225_VisitPriorityCode().setValue(pv2_25_visitPriorityCode);
		this.pv2_25_visitPriorityCode = pv2_25_visitPriorityCode;
	}
	/**
	 *	@return the pv2_26_previousTreatmentDate
	 */

	@JsonProperty("pv2_26_previousTreatmentDate")
	public String getPv2_26_previousTreatmentDate() {
		return CommonService.getString(this.pv2.getPv226_PreviousTreatmentDate().getValue());
	}
	/**
	 * @param pv2_26_previousTreatmentDate the pv2_26_previousTreatmentDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_26_previousTreatmentDate")
	public void setPv2_26_previousTreatmentDate(String pv2_26_previousTreatmentDate) throws DataTypeException {
		this.pv2.getPv226_PreviousTreatmentDate().setValue(pv2_26_previousTreatmentDate);
		this.pv2_26_previousTreatmentDate = pv2_26_previousTreatmentDate;
	}
	/**
	 *	@return the pv2_27_expectedDischargeDisposition
	 */

	@JsonProperty("pv2_27_expectedDischargeDisposition")
	public String getPv2_27_expectedDischargeDisposition() {
		return CommonService.getString(this.pv2.getPv227_ExpectedDischargeDisposition().getValue());
	}
	/**
	 * @param pv2_27_expectedDischargeDisposition the pv2_27_expectedDischargeDisposition to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_27_expectedDischargeDisposition")
	public void setPv2_27_expectedDischargeDisposition(String pv2_27_expectedDischargeDisposition) throws DataTypeException {
		this.pv2.getPv227_ExpectedDischargeDisposition().setValue(pv2_27_expectedDischargeDisposition);
		this.pv2_27_expectedDischargeDisposition = pv2_27_expectedDischargeDisposition;
	}
	/**
	 *	@return the pv2_28_signatureOnFileDate
	 */

	@JsonProperty("pv2_28_signatureOnFileDate")
	public String getPv2_28_signatureOnFileDate() {
		return CommonService.getString(this.pv2.getPv228_SignatureOnFileDate().getValue());
	}
	/**
	 * @param pv2_28_signatureOnFileDate the pv2_28_signatureOnFileDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_28_signatureOnFileDate")
	public void setPv2_28_signatureOnFileDate(String pv2_28_signatureOnFileDate) throws DataTypeException {
		this.pv2.getPv228_SignatureOnFileDate().setValue(pv2_28_signatureOnFileDate);
		this.pv2_28_signatureOnFileDate = pv2_28_signatureOnFileDate;
	}
	/**
	 *	@return the pv2_29_firstSimilarIllnessDate
	 */

	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	public String getPv2_29_firstSimilarIllnessDate() {
		return CommonService.getString(this.pv2.getPv229_FirstSimilarIllnessDate().getValue());
	}
	/**
	 * @param pv2_29_firstSimilarIllnessDate the pv2_29_firstSimilarIllnessDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	public void setPv2_29_firstSimilarIllnessDate(String pv2_29_firstSimilarIllnessDate) throws DataTypeException {
		this.pv2.getPv229_FirstSimilarIllnessDate().setValue(pv2_29_firstSimilarIllnessDate);
		this.pv2_29_firstSimilarIllnessDate = pv2_29_firstSimilarIllnessDate;
	}
	/**
	 *	@return the pv2_30_patientChargeAdjustmentCode
	 */

	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	public String getPv2_30_patientChargeAdjustmentCode() {
		return CommonService.getString(this.pv2.getPv230_PatientChargeAdjustmentCode().getValue());
	}
	/**
	 * @param pv2_30_patientChargeAdjustmentCode the pv2_30_patientChargeAdjustmentCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	public void setPv2_30_patientChargeAdjustmentCode(String pv2_30_patientChargeAdjustmentCode) throws DataTypeException {
		this.pv2.getPv230_PatientChargeAdjustmentCode().setValue(pv2_30_patientChargeAdjustmentCode);
		this.pv2_30_patientChargeAdjustmentCode = pv2_30_patientChargeAdjustmentCode;
	}
	/**
	 *	@return the pv2_31_recurringServiceCode
	 */

	@JsonProperty("pv2_31_recurringServiceCode")
	public String getPv2_31_recurringServiceCode() {
		return CommonService.getString(this.pv2.getPv231_RecurringServiceCode().getValue());
	}
	/**
	 * @param pv2_31_recurringServiceCode the pv2_31_recurringServiceCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_31_recurringServiceCode")
	public void setPv2_31_recurringServiceCode(String pv2_31_recurringServiceCode) throws DataTypeException {
		this.pv2.getPv231_RecurringServiceCode().setValue(pv2_31_recurringServiceCode);
		this.pv2_31_recurringServiceCode = pv2_31_recurringServiceCode;
	}
	/**
	 *	@return the pv2_32_billingMediaCode
	 */

	@JsonProperty("pv2_32_billingMediaCode")
	public String getPv2_32_billingMediaCode() {
		return CommonService.getString(this.pv2.getPv232_BillingMediaCode().getValue());
	}
	/**
	 * @param pv2_32_billingMediaCode the pv2_32_billingMediaCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_32_billingMediaCode")
	public void setPv2_32_billingMediaCode(String pv2_32_billingMediaCode) throws DataTypeException {
		this.pv2.getPv232_BillingMediaCode().setValue(pv2_32_billingMediaCode);
		this.pv2_32_billingMediaCode = pv2_32_billingMediaCode;
	}
	/**
	 *	@return the ts_pv2_33_expectedSurgeryDateAndTime
	 */

	@JsonProperty("ts_pv2_33_expectedSurgeryDateAndTime")
	public TS_v2 getTs_pv2_33_expectedSurgeryDateAndTime() {
		return CommonService.getTS_v2(this.pv2.getPv233_ExpectedSurgeryDateTime());
	}
	/**
	 * @param ts_pv2_33_expectedSurgeryDateAndTime the ts_pv2_33_expectedSurgeryDateAndTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_pv2_33_expectedSurgeryDateAndTime")
	public void setTs_pv2_33_expectedSurgeryDateAndTime(TS_v2 ts_pv2_33_expectedSurgeryDateAndTime) throws DataTypeException {
		CommonService.setTS_v2(this.pv2.getPv233_ExpectedSurgeryDateTime(), ts_pv2_33_expectedSurgeryDateAndTime);
		this.ts_pv2_33_expectedSurgeryDateAndTime = ts_pv2_33_expectedSurgeryDateAndTime;
	}
	/**
	 *	@return the pv2_34_militaryPartnershipCode
	 */

	@JsonProperty("pv2_34_militaryPartnershipCode")
	public String getPv2_34_militaryPartnershipCode() {
		return CommonService.getString(this.pv2.getPv234_MilitaryPartnershipCode().getValue());
	}
	/**
	 * @param pv2_34_militaryPartnershipCode the pv2_34_militaryPartnershipCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_34_militaryPartnershipCode")
	public void setPv2_34_militaryPartnershipCode(String pv2_34_militaryPartnershipCode) throws DataTypeException {
		this.pv2.getPv234_MilitaryPartnershipCode().setValue(pv2_34_militaryPartnershipCode);
		this.pv2_34_militaryPartnershipCode = pv2_34_militaryPartnershipCode;
	}
	/**
	 *	@return the pv2_35_militaryNonAvailabilityCode
	 */

	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	public String getPv2_35_militaryNonAvailabilityCode() {
		return CommonService.getString(this.pv2.getPv235_MilitaryNonAvailabiltiyCode().getValue());
	}
	/**
	 * @param pv2_35_militaryNonAvailabilityCode the pv2_35_militaryNonAvailabilityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	public void setPv2_35_militaryNonAvailabilityCode(String pv2_35_militaryNonAvailabilityCode) throws DataTypeException {
		this.pv2.getPv235_MilitaryNonAvailabiltiyCode().setValue(pv2_35_militaryNonAvailabilityCode);
		this.pv2_35_militaryNonAvailabilityCode = pv2_35_militaryNonAvailabilityCode;
	}
	/**
	 *	@return the pv2_36_newbornBabyIndicator
	 */

	@JsonProperty("pv2_36_newbornBabyIndicator")
	public String getPv2_36_newbornBabyIndicator() {
		return CommonService.getString(this.pv2.getPv236_NewbornBabyIndicator().getValue());
	}
	/**
	 * @param pv2_36_newbornBabyIndicator the pv2_36_newbornBabyIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_36_newbornBabyIndicator")
	public void setPv2_36_newbornBabyIndicator(String pv2_36_newbornBabyIndicator) throws DataTypeException {
		this.pv2.getPv236_NewbornBabyIndicator().setValue(pv2_36_newbornBabyIndicator);
		this.pv2_36_newbornBabyIndicator = pv2_36_newbornBabyIndicator;
	}
	/**
	 *	@return the pv2_37_babyDetainedIndicator
	 */

	@JsonProperty("pv2_37_babyDetainedIndicator")
	public String getPv2_37_babyDetainedIndicator() {
		return CommonService.getString(this.pv2.getPv237_BabyDetainedIndicator().getValue());
	}
	/**
	 * @param pv2_37_babyDetainedIndicator the pv2_37_babyDetainedIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_37_babyDetainedIndicator")
	public void setPv2_37_babyDetainedIndicator(String pv2_37_babyDetainedIndicator) throws DataTypeException {
		this.pv2.getPv237_BabyDetainedIndicator().setValue(pv2_37_babyDetainedIndicator);
		this.pv2_37_babyDetainedIndicator = pv2_37_babyDetainedIndicator;
	}
	@Override
	public String toString() {
		return "CustomPV2 [pl_pv2_1_priorPendingLocation=" + pl_pv2_1_priorPendingLocation
				+ ", ce_pv2_2_accommodationCode=" + ce_pv2_2_accommodationCode + ", ce_pv2_3_admitReason="
				+ ce_pv2_3_admitReason + ", ce_pv2_4_transferReason=" + ce_pv2_4_transferReason
				+ ", pv2_5_patientValuables=" + Arrays.toString(pv2_5_patientValuables)
				+ ", pv2_6_patientValuablesLocation=" + pv2_6_patientValuablesLocation + ", pv2_7_visitUserCode="
				+ pv2_7_visitUserCode + ", ts_pv2_8_expectedAdmitDate=" + ts_pv2_8_expectedAdmitDate
				+ ", ts_pv2_9_expectedDischargeDate=" + ts_pv2_9_expectedDischargeDate
				+ ", pv2_10_estimatedLengthOfInpatientStay=" + pv2_10_estimatedLengthOfInpatientStay
				+ ", pv2_11_actualLengthOfInpatientStay=" + pv2_11_actualLengthOfInpatientStay
				+ ", pv2_12_visitDescription=" + pv2_12_visitDescription + ", xcn_pv2_13_referralSourceCode="
				+ xcn_pv2_13_referralSourceCode + ", pv2_14_previousServiceDate=" + pv2_14_previousServiceDate
				+ ", pv2_15_employmentIllnessRelatedIndicator=" + pv2_15_employmentIllnessRelatedIndicator
				+ ", pv2_16_purgeStatusCode=" + pv2_16_purgeStatusCode + ", pv2_17_purgeStatusDate="
				+ pv2_17_purgeStatusDate + ", pv2_18_specialProgramCode=" + pv2_18_specialProgramCode
				+ ", pv2_19_retentionIndicator=" + pv2_19_retentionIndicator
				+ ", pv2_20_expectedNumberOfInsurancePlans=" + pv2_20_expectedNumberOfInsurancePlans
				+ ", pv2_21_visitPublicityCode=" + pv2_21_visitPublicityCode + ", pv2_22_visitProtectionIndicator="
				+ pv2_22_visitProtectionIndicator + ", xon_pv2_23_clinicOrganizationName="
				+ Arrays.toString(xon_pv2_23_clinicOrganizationName) + ", pv2_24_patientStatusCode="
				+ pv2_24_patientStatusCode + ", pv2_25_visitPriorityCode=" + pv2_25_visitPriorityCode
				+ ", pv2_26_previousTreatmentDate=" + pv2_26_previousTreatmentDate
				+ ", pv2_27_expectedDischargeDisposition=" + pv2_27_expectedDischargeDisposition
				+ ", pv2_28_signatureOnFileDate=" + pv2_28_signatureOnFileDate + ", pv2_29_firstSimilarIllnessDate="
				+ pv2_29_firstSimilarIllnessDate + ", pv2_30_patientChargeAdjustmentCode="
				+ pv2_30_patientChargeAdjustmentCode + ", pv2_31_recurringServiceCode=" + pv2_31_recurringServiceCode
				+ ", pv2_32_billingMediaCode=" + pv2_32_billingMediaCode + ", ts_pv2_33_expectedSurgeryDateAndTime="
				+ ts_pv2_33_expectedSurgeryDateAndTime + ", pv2_34_militaryPartnershipCode="
				+ pv2_34_militaryPartnershipCode + ", pv2_35_militaryNonAvailabilityCode="
				+ pv2_35_militaryNonAvailabilityCode + ", pv2_36_newbornBabyIndicator=" + pv2_36_newbornBabyIndicator
				+ ", pv2_37_babyDetainedIndicator=" + pv2_37_babyDetainedIndicator +  "]";
	}

}
