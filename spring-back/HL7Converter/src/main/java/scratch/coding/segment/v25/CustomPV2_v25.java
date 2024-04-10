package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.model.v25.segment.PV2;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPV2_v25 {
	@JsonProperty("pv2_1_priorPendingLocation")
	private PL_v25 pv2_1_priorPendingLocation;
	@JsonProperty("pv2_2_accommodationCode")
	private CE_v2 pv2_2_accommodationCode;
	@JsonProperty("pv2_3_admitReason")
	private CE_v2 pv2_3_admitReason;
	@JsonProperty("pv2_4transferReason")
	private CE_v2 pv2_4transferReason;
	@JsonProperty("pv2_5_patientValuables")
	private String[] pv2_5_patientValuables;
	@JsonProperty("pv2_6_patientValuablesLocation")
	private String pv2_6_patientValuablesLocation;
	@JsonProperty("pv2_7_visitUserCode")
	private String[] pv2_7_visitUserCode;
	@JsonProperty("pv2_8_expectedAdmitDateTime")
	private TS_v2 pv2_8_expectedAdmitDateTime;
	@JsonProperty("pv2_9_expectedDischargeDateTime")
	private TS_v2 pv2_9_expectedDischargeDateTime;
	@JsonProperty("pv2_10_estimatedLengthofInpatientStay")
	private String pv2_10_estimatedLengthofInpatientStay;
	@JsonProperty("pv2_11_actualLengthofInpatientStay")
	private String pv2_11_actualLengthofInpatientStay;
	@JsonProperty("pv2_12_visitDescription")
	private String pv2_12_visitDescription;
	@JsonProperty("pv2_13_referralSourceCode")
	private XCN_v25[] pv2_13_referralSourceCode;
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
	@JsonProperty("pv2_20_expectedNumberofInsurancePlans")
	private String pv2_20_expectedNumberofInsurancePlans;
	@JsonProperty("pv2_21_visitPublicityCode")
	private String pv2_21_visitPublicityCode;
	@JsonProperty("pv2_22_visitProtectionIndicator")
	private String pv2_22_visitProtectionIndicator;
	@JsonProperty("pv2_23_clinicOrganizationName")
	private XON_v25[] pv2_23_clinicOrganizationName;
	@JsonProperty("pv2_24_patientStatusCode")
	private String pv2_24_patientStatusCode;
	@JsonProperty("pv2_25_visitPriorityCode")
	private String pv2_25_visitPriorityCode;
	@JsonProperty("pv2_26_previousTreatmentDate")
	private String pv2_26_previousTreatmentDate;
	@JsonProperty("pv2_27_expectedDischargeDisposition")
	private String pv2_27_expectedDischargeDisposition;
	@JsonProperty("pv2_28_signatureonFileDate")
	private String pv2_28_signatureonFileDate;
	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	private String pv2_29_firstSimilarIllnessDate;
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	private CE_v2 pv2_30_patientChargeAdjustmentCode;
	@JsonProperty("pv2_31_recurringServiceCode")
	private String pv2_31_recurringServiceCode;
	@JsonProperty("pv2_32_billingMediaCode")
	private String pv2_32_billingMediaCode;
	@JsonProperty("pv2_33_expectedSurgeryDateandTime")
	private TS_v2 pv2_33_expectedSurgeryDateandTime;
	@JsonProperty("pv2_34_militaryPartnershipCode")
	private String pv2_34_militaryPartnershipCode;
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	private String pv2_35_militaryNonAvailabilityCode;
	@JsonProperty("pv2_36_newbornBabyIndicator")
	private String pv2_36_newbornBabyIndicator;
	@JsonProperty("pv2_37_babyDetainedIndicator")
	private String pv2_37_babyDetainedIndicator;
	@JsonProperty("pv2_38_modeofArrivalCode")
	private CE_v2 pv2_38_modeofArrivalCode;
	@JsonProperty("pv2_39_recreationalDrugUseCode")
	private CE_v2[] pv2_39_recreationalDrugUseCode;
	@JsonProperty("pv2_40_admissionLevelofCareCode")
	private CE_v2 pv2_40_admissionLevelofCareCode;
	@JsonProperty("pv2_41_precautionCode")
	private CE_v2[] pv2_41_precautionCode;
	@JsonProperty("pv2_42_patientConditionCode")
	private CE_v2 pv2_42_patientConditionCode;
	@JsonProperty("pv2_43_livingWillCode")
	private String pv2_43_livingWillCode;
	@JsonProperty("pv2_44_organDonorCode")
	private String pv2_44_organDonorCode;
	@JsonProperty("pv2_45_advanceDirectiveCode")
	private CE_v2[] pv2_45_advanceDirectiveCode;
	@JsonProperty("pv2_46_patientStatusEffectiveDate")
	private String pv2_46_patientStatusEffectiveDate;
	@JsonProperty("pv2_47_expectedLOAReturnDateTime")
	private TS_v2 pv2_47_expectedLOAReturnDateTime;
	@JsonProperty("pv2_48_expectedPreadmissionTestingDateTime")
	private TS_v2 pv2_48_expectedPreadmissionTestingDateTime;
	@JsonProperty("pv2_49_notifyClergyCode")
	private String[] pv2_49_notifyClergyCode;
	
	private PV2 pv2;
	
	private CustomPV2_v25(PV2 pv2, CustomNTE_v25[] nte) {
		super();
		this.pv2 =pv2;
//		setNte(nte);
	}
	private CustomPV2_v25(PV2 pv2) {
		super();
		this.pv2 = pv2;
	}
	
	public CustomPV2_v25() {
		super();
	}
	public static CustomPV2_v25 createPD1WithPD1(PV2 pv2) throws HL7Exception, IOException {
		return new CustomPV2_v25(pv2);
	}

	public static CustomPV2_v25 createPD1WithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		PV2 pv2 = oru.getPATIENT_RESULT().getPATIENT().getVISIT().getPV2();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		
		
		
//		for (ORM_O01_OBSERVATION observation: ormOrder.getORDER_DETAIL().getOBSERVATIONAll()) {
//			obxArray[i] = CustomOBX.createObxWithTypeAndVersion(observation);
//			i++;
//		}
		return new CustomPV2_v25(pv2);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the pv2_1_priorPendingLocation
	 */
	
	@JsonProperty("pv2_1_priorPendingLocation")
	public PL_v25 getPv2_1_priorPendingLocation() {
		return new PL_v25(
				this.pv2.getPv21_PriorPendingLocation().getPl1_PointOfCare().getValue(),
				this.pv2.getPv21_PriorPendingLocation().getPl2_Room().getValue(),
				this.pv2.getPv21_PriorPendingLocation().getPl3_Bed().getValue(),
				new HD_v2(
						this.pv2.getPv21_PriorPendingLocation().getPl4_Facility().getHd1_NamespaceID().getValue(),
						this.pv2.getPv21_PriorPendingLocation().getPl4_Facility().getHd2_UniversalID().getValue(), 
						this.pv2.getPv21_PriorPendingLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()), 
				this.pv2.getPv21_PriorPendingLocation().getPl5_LocationStatus().getValue(), 
				this.pv2.getPv21_PriorPendingLocation().getPl6_PersonLocationType().getValue(), 
				this.pv2.getPv21_PriorPendingLocation().getPl7_Building().getValue(), 
				this.pv2.getPv21_PriorPendingLocation().getPl8_Floor().getValue(), 
				this.pv2.getPv21_PriorPendingLocation().getPl9_LocationDescription().getValue(), 
				new EI_v2(
						this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(), 
						this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(), 
						this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()), 
				new HD_v2(
						this.pv2.getPv21_PriorPendingLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.pv2.getPv21_PriorPendingLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(),
						this.pv2.getPv21_PriorPendingLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param pv2_1_priorPendingLocation the pv2_1_priorPendingLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_1_priorPendingLocation")
	public void setPv2_1_priorPendingLocation(PL_v25 pv2_1_priorPendingLocation) throws DataTypeException {
		this.pv2.getPv21_PriorPendingLocation().getPl1_PointOfCare().setValue(pv2_1_priorPendingLocation.getPl_1_pointOfCare());
		this.pv2.getPv21_PriorPendingLocation().getPl2_Room().setValue(pv2_1_priorPendingLocation.getPl_2_room());
		this.pv2.getPv21_PriorPendingLocation().getPl3_Bed().setValue(pv2_1_priorPendingLocation.getPl_3_bed());
		this.pv2.getPv21_PriorPendingLocation().getPl4_Facility().getHd1_NamespaceID().setValue(pv2_1_priorPendingLocation.getPl_4_facility().getHd_1_namespaceId());
		this.pv2.getPv21_PriorPendingLocation().getPl4_Facility().getHd2_UniversalID().setValue(pv2_1_priorPendingLocation.getPl_4_facility().getHd_2_universalId());
		this.pv2.getPv21_PriorPendingLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(pv2_1_priorPendingLocation.getPl_4_facility().getHd_3_universalIdType());
		this.pv2.getPv21_PriorPendingLocation().getPl5_LocationStatus().setValue(pv2_1_priorPendingLocation.getPl_5_locationStatus());
		this.pv2.getPv21_PriorPendingLocation().getPl6_PersonLocationType().setValue(pv2_1_priorPendingLocation.getPl_6_personLocationType());
		this.pv2.getPv21_PriorPendingLocation().getPl7_Building().setValue(pv2_1_priorPendingLocation.getPl_7_building()); 
		this.pv2.getPv21_PriorPendingLocation().getPl8_Floor().setValue(pv2_1_priorPendingLocation.getPl_8_floor());
		this.pv2.getPv21_PriorPendingLocation().getPl9_LocationDescription().setValue(pv2_1_priorPendingLocation.getPl_9_locationDescription());
		this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(pv2_1_priorPendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(pv2_1_priorPendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId());
		this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(pv2_1_priorPendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.pv2.getPv21_PriorPendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(pv2_1_priorPendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType()); 
		this.pv2.getPv21_PriorPendingLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(pv2_1_priorPendingLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.pv2.getPv21_PriorPendingLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(pv2_1_priorPendingLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.pv2.getPv21_PriorPendingLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(pv2_1_priorPendingLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.pv2_1_priorPendingLocation = pv2_1_priorPendingLocation;
	}
	/**
	 * @return the pv2_2_accommodationCode
	 */
	
	@JsonProperty("pv2_2_accommodationCode")
	public CE_v2 getPv2_2_accommodationCode() {
		return new CE_v2(
				this.pv2.getPv22_AccommodationCode().getCe1_Identifier().getValue(),
				this.pv2.getPv22_AccommodationCode().getCe2_Text().getValue(),
				this.pv2.getPv22_AccommodationCode().getCe3_NameOfCodingSystem().getValue(),
				this.pv2.getPv22_AccommodationCode().getCe4_AlternateIdentifier().getValue(),
				this.pv2.getPv22_AccommodationCode().getCe5_AlternateText().getValue(), 
				this.pv2.getPv22_AccommodationCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_2_accommodationCode the pv2_2_accommodationCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_2_accommodationCode")
	public void setPv2_2_accommodationCode(CE_v2 pv2_2_accommodationCode) throws DataTypeException {
		this.pv2.getPv22_AccommodationCode().getCe1_Identifier().setValue(pv2_2_accommodationCode.getCe_1_identifier());
		this.pv2.getPv22_AccommodationCode().getCe2_Text().setValue(pv2_2_accommodationCode.getCe_2_text());
		this.pv2.getPv22_AccommodationCode().getCe3_NameOfCodingSystem().setValue(pv2_2_accommodationCode.getCe_3_nameOfCodingSystem());
		this.pv2.getPv22_AccommodationCode().getCe4_AlternateIdentifier().setValue(pv2_2_accommodationCode.getCe_4_alternateIdentifier());
		this.pv2.getPv22_AccommodationCode().getCe5_AlternateText().setValue(pv2_2_accommodationCode.getCe_5_alternateText());
		this.pv2.getPv22_AccommodationCode().getCe6_NameOfAlternateCodingSystem().setValue(pv2_2_accommodationCode.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_2_accommodationCode = pv2_2_accommodationCode;
	}
	/**
	 * @return the pv2_3_admitReason
	 */
	@JsonProperty("pv2_3_admitReason")
	public CE_v2 getPv2_3_admitReason() {
		return new CE_v2(
				this.pv2.getPv23_AdmitReason().getCe1_Identifier().getValue(),
				this.pv2.getPv23_AdmitReason().getCe2_Text().getValue(),
				this.pv2.getPv23_AdmitReason().getCe3_NameOfCodingSystem().getValue(),
				this.pv2.getPv23_AdmitReason().getCe4_AlternateIdentifier().getValue(),
				this.pv2.getPv23_AdmitReason().getCe5_AlternateText().getValue(), 
				this.pv2.getPv23_AdmitReason().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_3_admitReason the pv2_3_admitReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_3_admitReason")
	public void setPv2_3_admitReason(CE_v2 pv2_3_admitReason) throws DataTypeException {
		this.pv2.getPv23_AdmitReason().getCe1_Identifier().setValue(pv2_3_admitReason.getCe_1_identifier());
		this.pv2.getPv23_AdmitReason().getCe2_Text().setValue(pv2_3_admitReason.getCe_2_text());
		this.pv2.getPv23_AdmitReason().getCe3_NameOfCodingSystem().setValue(pv2_3_admitReason.getCe_3_nameOfCodingSystem());
		this.pv2.getPv23_AdmitReason().getCe4_AlternateIdentifier().setValue(pv2_3_admitReason.getCe_4_alternateIdentifier());
		this.pv2.getPv23_AdmitReason().getCe5_AlternateText().setValue(pv2_3_admitReason.getCe_5_alternateText());
		this.pv2.getPv23_AdmitReason().getCe6_NameOfAlternateCodingSystem().setValue(pv2_3_admitReason.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_3_admitReason = pv2_3_admitReason;
	}
	/**
	 * @return the pv2_4transferReason
	 */
	
	@JsonProperty("pv2_4transferReason")
	public CE_v2 getPv2_4transferReason() {
		return new CE_v2(
				this.pv2.getPv24_TransferReason().getCe1_Identifier().getValue(),
				this.pv2.getPv24_TransferReason().getCe2_Text().getValue(),
				this.pv2.getPv24_TransferReason().getCe3_NameOfCodingSystem().getValue(),
				this.pv2.getPv24_TransferReason().getCe4_AlternateIdentifier().getValue(),
				this.pv2.getPv24_TransferReason().getCe5_AlternateText().getValue(), 
				this.pv2.getPv24_TransferReason().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_4transferReason the pv2_4transferReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_4transferReason")
	public void setPv2_4transferReason(CE_v2 pv2_4transferReason) throws DataTypeException {
		this.pv2.getPv24_TransferReason().getCe1_Identifier().setValue(pv2_4transferReason.getCe_1_identifier());
		this.pv2.getPv24_TransferReason().getCe2_Text().setValue(pv2_4transferReason.getCe_2_text());
		this.pv2.getPv24_TransferReason().getCe3_NameOfCodingSystem().setValue(pv2_4transferReason.getCe_3_nameOfCodingSystem());
		this.pv2.getPv24_TransferReason().getCe4_AlternateIdentifier().setValue(pv2_4transferReason.getCe_4_alternateIdentifier());
		this.pv2.getPv24_TransferReason().getCe5_AlternateText().setValue(pv2_4transferReason.getCe_5_alternateText());
		this.pv2.getPv24_TransferReason().getCe6_NameOfAlternateCodingSystem().setValue(pv2_4transferReason.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_4transferReason = pv2_4transferReason;
	}
	/**
	 * @return the pv2_5_patientValuables
	 */
	
	@JsonProperty("pv2_5_patientValuables")
	public String[] getPv2_5_patientValuables() {
		String[] patientValuables  = new String[this.pv2.getPv25_PatientValuables().length];
		for(int i = 0; i < this.pv2.getPv25_PatientValuables().length;i++) {
			patientValuables[i] = this.pv2.getPv25_PatientValuables(i).getValue();  
		}
		return patientValuables;
	}
	/**
	 * @param pv2_5_patientValuables the pv2_5_patientValuables to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_5_patientValuables")
	public void setPv2_5_patientValuables(String[] pv2_5_patientValuables) throws DataTypeException {
		for(int i = 0; i < pv2_5_patientValuables.length;i++) {
			this.pv2.getPv25_PatientValuables(i).setValue(pv2_5_patientValuables[i]);  
		}
		this.pv2_5_patientValuables = pv2_5_patientValuables;
	}
	/**
	 * @return the pv2_6_patientValuablesLocation
	 */
	
	@JsonProperty("pv2_6_patientValuablesLocation")
	public String getPv2_6_patientValuablesLocation() {
		return this.pv2.getPv26_PatientValuablesLocation().getValue();
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
	 * @return the pv2_7_visitUserCode
	 */
	
	@JsonProperty("pv2_7_visitUserCode")
	public String[] getPv2_7_visitUserCode() {
		String[] visitUserCode = new String[this.pv2.getPv27_VisitUserCode().length];
		for(int i = 0; i < this.pv2.getPv27_VisitUserCode().length; i++) {
			visitUserCode[i] = this.pv2.getPv27_VisitUserCode(i).getValue();
		}
		return visitUserCode;
	}
	/**
	 * @param pv2_7_visitUserCode the pv2_7_visitUserCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_7_visitUserCode")
	public void setPv2_7_visitUserCode(String[] pv2_7_visitUserCode) throws DataTypeException {
		for(int i = 0; i < pv2_7_visitUserCode.length; i++) {
			this.pv2.getPv27_VisitUserCode(i).setValue(pv2_7_visitUserCode[i]);
		}
		this.pv2_7_visitUserCode = pv2_7_visitUserCode;
	}
	/**
	 * @return the pv2_8_expectedAdmitDateTime
	 */
	
	@JsonProperty("pv2_8_expectedAdmitDateTime")
	public TS_v2 getPv2_8_expectedAdmitDateTime() {
		return new TS_v2(
				this.pv2.getPv28_ExpectedAdmitDateTime().getTs1_Time().getValue(),
				this.pv2.getPv28_ExpectedAdmitDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pv2_8_expectedAdmitDateTime the pv2_8_expectedAdmitDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_8_expectedAdmitDateTime")
	public void setPv2_8_expectedAdmitDateTime(TS_v2 pv2_8_expectedAdmitDateTime) throws DataTypeException {
		this.pv2.getPv28_ExpectedAdmitDateTime().getTs1_Time().setValue(pv2_8_expectedAdmitDateTime.getTs_1_time());
		this.pv2.getPv28_ExpectedAdmitDateTime().getTs2_DegreeOfPrecision().setValue(pv2_8_expectedAdmitDateTime.getTs_2_degreeOfPrecision());
		this.pv2_8_expectedAdmitDateTime = pv2_8_expectedAdmitDateTime;
	}
	/**
	 * @return the pv2_9_expectedDischargeDateTime
	 */
	
	@JsonProperty("pv2_9_expectedDischargeDateTime")
	public TS_v2 getPv2_9_expectedDischargeDateTime() {
		return new TS_v2(
				this.pv2.getPv29_ExpectedDischargeDateTime().getTs1_Time().getValue(),
				this.pv2.getPv29_ExpectedDischargeDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pv2_9_expectedDischargeDateTime the pv2_9_expectedDischargeDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_9_expectedDischargeDateTime")
	public void setPv2_9_expectedDischargeDateTime(TS_v2 pv2_9_expectedDischargeDateTime) throws DataTypeException {
		this.pv2.getPv29_ExpectedDischargeDateTime().getTs1_Time().setValue(pv2_9_expectedDischargeDateTime.getTs_1_time());
		this.pv2.getPv29_ExpectedDischargeDateTime().getTs2_DegreeOfPrecision().setValue(pv2_9_expectedDischargeDateTime.getTs_2_degreeOfPrecision());
		this.pv2_9_expectedDischargeDateTime = pv2_9_expectedDischargeDateTime;
	}
	/**
	 * @return the pv2_10_estimatedLengthofInpatientStay
	 */
	
	@JsonProperty("pv2_10_estimatedLengthofInpatientStay")
	public String getPv2_10_estimatedLengthofInpatientStay() {
		return this.pv2.getPv210_EstimatedLengthOfInpatientStay().getValue();
	}
	/**
	 * @param pv2_10_estimatedLengthofInpatientStay the pv2_10_estimatedLengthofInpatientStay to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_10_estimatedLengthofInpatientStay")
	public void setPv2_10_estimatedLengthofInpatientStay(String pv2_10_estimatedLengthofInpatientStay) throws DataTypeException {
		this.pv2.getPv210_EstimatedLengthOfInpatientStay().setValue(pv2_10_estimatedLengthofInpatientStay);
		this.pv2_10_estimatedLengthofInpatientStay = pv2_10_estimatedLengthofInpatientStay;
	}
	/**
	 * @return the pv2_11_actualLengthofInpatientStay
	 */
	
	@JsonProperty("pv2_11_actualLengthofInpatientStay")
	public String getPv2_11_actualLengthofInpatientStay() {
		return this.pv2.getPv211_ActualLengthOfInpatientStay().getValue();
	}
	/**
	 * @param pv2_11_actualLengthofInpatientStay the pv2_11_actualLengthofInpatientStay to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_11_actualLengthofInpatientStay")
	public void setPv2_11_actualLengthofInpatientStay(String pv2_11_actualLengthofInpatientStay) throws DataTypeException {
		this.pv2.getPv211_ActualLengthOfInpatientStay().setValue(pv2_11_actualLengthofInpatientStay);
		this.pv2_11_actualLengthofInpatientStay = pv2_11_actualLengthofInpatientStay;
	}
	/**
	 * @return the pv2_12_visitDescription
	 */
	
	@JsonProperty("pv2_12_visitDescription")
	public String getPv2_12_visitDescription() {
		return this.pv2.getPv212_VisitDescription().getValue();
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
	 * @return the pv2_13_referralSourceCode
	 */
	
	@JsonProperty("pv2_13_referralSourceCode")
	public XCN_v25[] getPv2_13_referralSourceCode() {
		XCN_v25[] referralSourceCode = new XCN_v25[this.pv2.getPv213_ReferralSourceCode().length];
		for(int i =0; i< this.pv2.getPv213_ReferralSourceCode().length; i++) {
			referralSourceCode[i] = new XCN_v25(
					this.pv2.getPv213_ReferralSourceCode(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn3_GivenName().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn6_PrefixEgDR().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn7_DegreeEgMD().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn10_NameTypeCode().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn12_CheckDigitScheme().getValue(),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn15_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pv2.getPv213_ReferralSourceCode(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return referralSourceCode;
	}
	/**
	 * @param pv2_13_referralSourceCode the pv2_13_referralSourceCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_13_referralSourceCode")
	public void setPv2_13_referralSourceCode(XCN_v25[] pv2_13_referralSourceCode) throws DataTypeException {
		for(int i =0; i< pv2_13_referralSourceCode.length; i++) {
			this.pv2.getPv213_ReferralSourceCode(i).getXcn1_IDNumber().setValue(pv2_13_referralSourceCode[i].getXcn_1_idNumber());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn1_Surname().setValue(pv2_13_referralSourceCode[i].getXcn_2_familyName().getFn_1_surname());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pv2_13_referralSourceCode[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pv2_13_referralSourceCode[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pv2_13_referralSourceCode[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pv2_13_referralSourceCode[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn3_GivenName().setValue(pv2_13_referralSourceCode[i].getXcn_3_givenName());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pv2_13_referralSourceCode[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn5_SuffixEgJRorIII().setValue(pv2_13_referralSourceCode[i].getXcn_5_suffixegJrOrIii());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn6_PrefixEgDR().setValue(pv2_13_referralSourceCode[i].getXcn_6_prefixegDr());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn7_DegreeEgMD().setValue(pv2_13_referralSourceCode[i].getXcn_7_degreeegMd());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn8_SourceTable().setValue(pv2_13_referralSourceCode[i].getXcn_8_sourceTable());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pv2_13_referralSourceCode[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pv2_13_referralSourceCode[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pv2_13_referralSourceCode[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn10_NameTypeCode().setValue(pv2_13_referralSourceCode[i].getXcn_10_nameTypeCode());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn11_IdentifierCheckDigit().setValue(pv2_13_referralSourceCode[i].getXcn_11_identifierCheckDigit());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn12_CheckDigitScheme().setValue(pv2_13_referralSourceCode[i].getXcn_12_checkDigitScheme());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn13_IdentifierTypeCode().setValue(pv2_13_referralSourceCode[i].getXcn_13_identifierTypeCode());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pv2_13_referralSourceCode[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pv2_13_referralSourceCode[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pv2_13_referralSourceCode[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn15_NameRepresentationCode().setValue(pv2_13_referralSourceCode[i].getXcn_15_nameRepresentationCode());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe1_Identifier().setValue(pv2_13_referralSourceCode[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe2_Text().setValue(pv2_13_referralSourceCode[i].getXcn_16_nameContext().getCe_2_text());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pv2_13_referralSourceCode[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pv2_13_referralSourceCode[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pv2_13_referralSourceCode[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pv2_13_referralSourceCode[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pv2_13_referralSourceCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pv2_13_referralSourceCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pv2_13_referralSourceCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pv2_13_referralSourceCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn18_NameAssemblyOrder().setValue(pv2_13_referralSourceCode[i].getXcn_18_nameAssemblyOrder());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pv2_13_referralSourceCode[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv2_13_referralSourceCode[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pv2_13_referralSourceCode[i].getXcn_20_expirationDate().getTs_1_time());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pv2_13_referralSourceCode[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn21_ProfessionalSuffix().setValue(pv2_13_referralSourceCode[i].getXcn_21_professionalSuffix());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv2_13_referralSourceCode[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pv2.getPv213_ReferralSourceCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv2_13_referralSourceCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pv2_13_referralSourceCode = pv2_13_referralSourceCode;
	}
	/**
	 * @return the pv2_14_previousServiceDate
	 */
	
	@JsonProperty("pv2_14_previousServiceDate")
	public String getPv2_14_previousServiceDate() {
		return this.pv2.getPv214_PreviousServiceDate().getValue();
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
	 * @return the pv2_15_employmentIllnessRelatedIndicator
	 */
	
	@JsonProperty("pv2_15_employmentIllnessRelatedIndicator")
	public String getPv2_15_employmentIllnessRelatedIndicator() {
		return this.pv2.getPv215_EmploymentIllnessRelatedIndicator().getValue();
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
	 * @return the pv2_16_purgeStatusCode
	 */
	
	@JsonProperty("pv2_16_purgeStatusCode")
	public String getPv2_16_purgeStatusCode() {
		return this.pv2.getPv216_PurgeStatusCode().getValue();
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
	 * @return the pv2_17_purgeStatusDate
	 */
	
	@JsonProperty("pv2_17_purgeStatusDate")
	public String getPv2_17_purgeStatusDate() {
		return this.pv2.getPv217_PurgeStatusDate().getValue();
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
	 * @return the pv2_18_specialProgramCode
	 */
	
	@JsonProperty("pv2_18_specialProgramCode")
	public String getPv2_18_specialProgramCode() {
		return this.pv2.getPv218_SpecialProgramCode().getValue();
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
	 * @return the pv2_19_retentionIndicator
	 */
	
	@JsonProperty("pv2_19_retentionIndicator")
	public String getPv2_19_retentionIndicator() {
		return this.pv2.getPv219_RetentionIndicator().getValue();
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
	 * @return the pv2_20_expectedNumberofInsurancePlans
	 */
	
	@JsonProperty("pv2_20_expectedNumberofInsurancePlans")
	public String getPv2_20_expectedNumberofInsurancePlans() {
		return this.pv2.getPv220_ExpectedNumberOfInsurancePlans().getValue();
	}
	/**
	 * @param pv2_20_expectedNumberofInsurancePlans the pv2_20_expectedNumberofInsurancePlans to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_20_expectedNumberofInsurancePlans")
	public void setPv2_20_expectedNumberofInsurancePlans(String pv2_20_expectedNumberofInsurancePlans) throws DataTypeException {
		this.pv2.getPv220_ExpectedNumberOfInsurancePlans().setValue(pv2_20_expectedNumberofInsurancePlans);
		this.pv2_20_expectedNumberofInsurancePlans = pv2_20_expectedNumberofInsurancePlans;
	}
	/**
	 * @return the pv2_21_visitPublicityCode
	 */
	
	@JsonProperty("pv2_21_visitPublicityCode")
	public String getPv2_21_visitPublicityCode() {
		return this.pv2.getPv221_VisitPublicityCode().getValue();
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
	 * @return the pv2_22_visitProtectionIndicator
	 */
	
	@JsonProperty("pv2_22_visitProtectionIndicator")
	public String getPv2_22_visitProtectionIndicator() {
		return this.pv2.getPv222_VisitProtectionIndicator().getValue();
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
	 * @return the pv2_23_clinicOrganizationName
	 */
	
	@JsonProperty("pv2_23_clinicOrganizationName")
	public XON_v25[] getPv2_23_clinicOrganizationName() {
		XON_v25[] clinicOrganizationName = new XON_v25[this.pv2.getPv223_ClinicOrganizationName().length];
		for(int i = 0; i<this.pv2.getPv223_ClinicOrganizationName().length;i++) {
			clinicOrganizationName[i] = new XON_v25(
					this.pv2.getPv223_ClinicOrganizationName(i).getXon1_OrganizationName().getValue(),
					this.pv2.getPv223_ClinicOrganizationName(i).getXon2_OrganizationNameTypeCode().getValue(),
					this.pv2.getPv223_ClinicOrganizationName(i).getXon3_IDNumber().getValue(),
					this.pv2.getPv223_ClinicOrganizationName(i).getXon4_CheckDigit().getValue(), 
					this.pv2.getPv223_ClinicOrganizationName(i).getXon5_CheckDigitScheme().getValue(),
					new HD_v2(
							this.pv2.getPv223_ClinicOrganizationName(i).getXon6_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pv2.getPv223_ClinicOrganizationName(i).getXon6_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.pv2.getPv223_ClinicOrganizationName(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv2.getPv223_ClinicOrganizationName(i).getXon7_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv2.getPv223_ClinicOrganizationName(i).getXon8_AssigningFacility().getHd1_NamespaceID().getValue(), 
							this.pv2.getPv223_ClinicOrganizationName(i).getXon8_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv2.getPv223_ClinicOrganizationName(i).getXon8_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv2.getPv223_ClinicOrganizationName(i).getXon9_NameRepresentationCode().getValue(), 
					this.pv2.getPv223_ClinicOrganizationName(i).getXon10_OrganizationIdentifier().getValue());
		}
		return clinicOrganizationName;
	}
	/**
	 * @param pv2_23_clinicOrganizationName the pv2_23_clinicOrganizationName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_23_clinicOrganizationName")
	public void setPv2_23_clinicOrganizationName(XON_v25[] pv2_23_clinicOrganizationName) throws DataTypeException {
		for(int i = 0; i<this.pv2.getPv223_ClinicOrganizationName().length;i++) {
			this.pv2.getPv223_ClinicOrganizationName(i).getXon1_OrganizationName().setValue(pv2_23_clinicOrganizationName[i].getXon_1_organizationName());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon2_OrganizationNameTypeCode().setValue(pv2_23_clinicOrganizationName[i].getXon_2_organizationNameTypeCode());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon3_IDNumber().setValue(pv2_23_clinicOrganizationName[i].getXon_3_idNumber());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon4_CheckDigit().setValue(pv2_23_clinicOrganizationName[i].getXon_4_checkDigit());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon5_CheckDigitScheme().setValue(pv2_23_clinicOrganizationName[i].getXon_5_checkDigitScheme());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon6_AssigningAuthority().getHd1_NamespaceID().setValue(pv2_23_clinicOrganizationName[i].getXon_6_assigningAuthority().getHd_1_namespaceId());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon6_AssigningAuthority().getHd2_UniversalID().setValue(pv2_23_clinicOrganizationName[i].getXon_6_assigningAuthority().getHd_2_universalId());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().setValue(pv2_23_clinicOrganizationName[i].getXon_6_assigningAuthority().getHd_3_universalIdType());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon7_IdentifierTypeCode().setValue(pv2_23_clinicOrganizationName[i].getXon_7_identifierTypeCode());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon8_AssigningFacility().getHd1_NamespaceID().setValue(pv2_23_clinicOrganizationName[i].getXon_8_assigningFacility().getHd_1_namespaceId());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon8_AssigningFacility().getHd2_UniversalID().setValue(pv2_23_clinicOrganizationName[i].getXon_8_assigningFacility().getHd_2_universalId());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon8_AssigningFacility().getHd3_UniversalIDType().setValue(pv2_23_clinicOrganizationName[i].getXon_8_assigningFacility().getHd_3_universalIdType());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon9_NameRepresentationCode().setValue(pv2_23_clinicOrganizationName[i].getXon_9_nameRepresentationCode());
			this.pv2.getPv223_ClinicOrganizationName(i).getXon10_OrganizationIdentifier().setValue(pv2_23_clinicOrganizationName[i].getXon_10_organizationIdentifier());
		}
		this.pv2_23_clinicOrganizationName = pv2_23_clinicOrganizationName;
	}
	/**
	 * @return the pv2_24_patientStatusCode
	 */
	
	@JsonProperty("pv2_24_patientStatusCode")
	public String getPv2_24_patientStatusCode() {
		return this.pv2.getPv224_PatientStatusCode().getValue();
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
	 * @return the pv2_25_visitPriorityCode
	 */
	
	@JsonProperty("pv2_25_visitPriorityCode")
	public String getPv2_25_visitPriorityCode() {
		return this.pv2.getPv225_VisitPriorityCode().getValue();
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
	 * @return the pv2_26_previousTreatmentDate
	 */
	
	@JsonProperty("pv2_26_previousTreatmentDate")
	public String getPv2_26_previousTreatmentDate() {
		return this.pv2.getPv226_PreviousTreatmentDate().getValue();
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
	 * @return the pv2_27_expectedDischargeDisposition
	 */
	
	@JsonProperty("pv2_27_expectedDischargeDisposition")
	public String getPv2_27_expectedDischargeDisposition() {
		return this.pv2.getPv227_ExpectedDischargeDisposition().getValue();
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
	 * @return the pv2_28_signatureonFileDate
	 */
	
	@JsonProperty("pv2_28_signatureonFileDate")
	public String getPv2_28_signatureonFileDate() {
		return this.pv2.getPv228_SignatureOnFileDate().getValue();
	}
	/**
	 * @param pv2_28_signatureonFileDate the pv2_28_signatureonFileDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_28_signatureonFileDate")
	public void setPv2_28_signatureonFileDate(String pv2_28_signatureonFileDate) throws DataTypeException {
		this.pv2.getPv228_SignatureOnFileDate().setValue(pv2_28_signatureonFileDate);
		this.pv2_28_signatureonFileDate = pv2_28_signatureonFileDate;
	}
	/**
	 * @return the pv2_29_firstSimilarIllnessDate
	 */
	
	@JsonProperty("pv2_29_firstSimilarIllnessDate")
	public String getPv2_29_firstSimilarIllnessDate() {
		return this.pv2.getPv229_FirstSimilarIllnessDate().getValue();
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
	 * @return the pv2_30_patientChargeAdjustmentCode
	 */
	
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	public CE_v2 getPv2_30_patientChargeAdjustmentCode() {
		return new CE_v2(
				this.pv2.getPv230_PatientChargeAdjustmentCode().getCe1_Identifier().getValue(),
				this.pv2.getPv230_PatientChargeAdjustmentCode().getCe2_Text().getValue(),
				this.pv2.getPv230_PatientChargeAdjustmentCode().getCe3_NameOfCodingSystem().getValue(),
				this.pv2.getPv230_PatientChargeAdjustmentCode().getCe4_AlternateIdentifier().getValue(),
				this.pv2.getPv230_PatientChargeAdjustmentCode().getCe5_AlternateText().getValue(),
				this.pv2.getPv230_PatientChargeAdjustmentCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_30_patientChargeAdjustmentCode the pv2_30_patientChargeAdjustmentCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_30_patientChargeAdjustmentCode")
	public void setPv2_30_patientChargeAdjustmentCode(CE_v2 pv2_30_patientChargeAdjustmentCode) throws DataTypeException {
		this.pv2.getPv230_PatientChargeAdjustmentCode().getCe1_Identifier().setValue(pv2_30_patientChargeAdjustmentCode.getCe_1_identifier());
		this.pv2.getPv230_PatientChargeAdjustmentCode().getCe2_Text().setValue(pv2_30_patientChargeAdjustmentCode.getCe_2_text());
		this.pv2.getPv230_PatientChargeAdjustmentCode().getCe3_NameOfCodingSystem().setValue(pv2_30_patientChargeAdjustmentCode.getCe_3_nameOfCodingSystem());
		this.pv2.getPv230_PatientChargeAdjustmentCode().getCe4_AlternateIdentifier().setValue(pv2_30_patientChargeAdjustmentCode.getCe_4_alternateIdentifier());
		this.pv2.getPv230_PatientChargeAdjustmentCode().getCe5_AlternateText().setValue(pv2_30_patientChargeAdjustmentCode.getCe_5_alternateText());
		this.pv2.getPv230_PatientChargeAdjustmentCode().getCe6_NameOfAlternateCodingSystem().setValue(pv2_30_patientChargeAdjustmentCode.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_30_patientChargeAdjustmentCode = pv2_30_patientChargeAdjustmentCode;
	}
	/**
	 * @return the pv2_31_recurringServiceCode
	 */
	
	@JsonProperty("pv2_31_recurringServiceCode")
	public String getPv2_31_recurringServiceCode() {
		return this.pv2.getPv231_RecurringServiceCode().getValue();
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
	 * @return the pv2_32_billingMediaCode
	 */
	
	@JsonProperty("pv2_32_billingMediaCode")
	public String getPv2_32_billingMediaCode() {
		return this.pv2.getPv232_BillingMediaCode().getValue();
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
	 * @return the pv2_33_expectedSurgeryDateandTime
	 */
	
	@JsonProperty("pv2_33_expectedSurgeryDateandTime")
	public TS_v2 getPv2_33_expectedSurgeryDateandTime() {
		return new TS_v2(
				this.pv2.getPv233_ExpectedSurgeryDateAndTime().getTs1_Time().getValue(), 
				this.pv2.getPv233_ExpectedSurgeryDateAndTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pv2_33_expectedSurgeryDateandTime the pv2_33_expectedSurgeryDateandTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_33_expectedSurgeryDateandTime")
	public void setPv2_33_expectedSurgeryDateandTime(TS_v2 pv2_33_expectedSurgeryDateandTime) throws DataTypeException {
		this.pv2.getPv233_ExpectedSurgeryDateAndTime().getTs1_Time().setValue(pv2_33_expectedSurgeryDateandTime.getTs_1_time());
		this.pv2.getPv233_ExpectedSurgeryDateAndTime().getTs2_DegreeOfPrecision().setValue(pv2_33_expectedSurgeryDateandTime.getTs_2_degreeOfPrecision());
		this.pv2_33_expectedSurgeryDateandTime = pv2_33_expectedSurgeryDateandTime;
	}
	/**
	 * @return the pv2_34_militaryPartnershipCode
	 */
	
	@JsonProperty("pv2_34_militaryPartnershipCode")
	public String getPv2_34_militaryPartnershipCode() {
		return this.pv2.getPv234_MilitaryPartnershipCode().getValue();
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
	 * @return the pv2_35_militaryNonAvailabilityCode
	 */
	
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	public String getPv2_35_militaryNonAvailabilityCode() {
		return this.pv2.getPv235_MilitaryNonAvailabilityCode().getValue();
	}
	/**
	 * @param pv2_35_militaryNonAvailabilityCode the pv2_35_militaryNonAvailabilityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_35_militaryNonAvailabilityCode")
	public void setPv2_35_militaryNonAvailabilityCode(String pv2_35_militaryNonAvailabilityCode) throws DataTypeException {
		this.pv2.getPv235_MilitaryNonAvailabilityCode().setValue(pv2_35_militaryNonAvailabilityCode);
		this.pv2_35_militaryNonAvailabilityCode = pv2_35_militaryNonAvailabilityCode;
	}
	/**
	 * @return the pv2_36_newbornBabyIndicator
	 */
	
	@JsonProperty("pv2_36_newbornBabyIndicator")
	public String getPv2_36_newbornBabyIndicator() {
		return this.pv2.getPv236_NewbornBabyIndicator().getValue();
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
	 * @return the pv2_37_babyDetainedIndicator
	 */
	
	@JsonProperty("pv2_37_babyDetainedIndicator")
	public String getPv2_37_babyDetainedIndicator() {
		return this.pv2.getPv237_BabyDetainedIndicator().getValue();
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
	/**
	 * @return the pv2_38_modeofArrivalCode
	 */
	
	@JsonProperty("pv2_38_modeofArrivalCode")
	public CE_v2 getPv2_38_modeofArrivalCode() {
		return new CE_v2(
				this.pv2.getPv238_ModeOfArrivalCode().getCe1_Identifier().getValue(),
				this.pv2.getPv238_ModeOfArrivalCode().getCe2_Text().getValue(),
				this.pv2.getPv238_ModeOfArrivalCode().getCe3_NameOfCodingSystem().getValue(),
				this.pv2.getPv238_ModeOfArrivalCode().getCe4_AlternateIdentifier().getValue(),
				this.pv2.getPv238_ModeOfArrivalCode().getCe5_AlternateText().getValue(),
				this.pv2.getPv238_ModeOfArrivalCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_38_modeofArrivalCode the pv2_38_modeofArrivalCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_38_modeofArrivalCode")
	public void setPv2_38_modeofArrivalCode(CE_v2 pv2_38_modeofArrivalCode) throws DataTypeException {
		this.pv2.getPv238_ModeOfArrivalCode().getCe1_Identifier().setValue(pv2_38_modeofArrivalCode.getCe_1_identifier());
		this.pv2.getPv238_ModeOfArrivalCode().getCe2_Text().setValue(pv2_38_modeofArrivalCode.getCe_2_text());
		this.pv2.getPv238_ModeOfArrivalCode().getCe3_NameOfCodingSystem().setValue(pv2_38_modeofArrivalCode.getCe_3_nameOfCodingSystem());
		this.pv2.getPv238_ModeOfArrivalCode().getCe4_AlternateIdentifier().setValue(pv2_38_modeofArrivalCode.getCe_4_alternateIdentifier());
		this.pv2.getPv238_ModeOfArrivalCode().getCe5_AlternateText().setValue(pv2_38_modeofArrivalCode.getCe_5_alternateText());
		this.pv2.getPv238_ModeOfArrivalCode().getCe6_NameOfAlternateCodingSystem().setValue(pv2_38_modeofArrivalCode.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_38_modeofArrivalCode = pv2_38_modeofArrivalCode;
	}
	/**
	 * @return the pv2_39_recreationalDrugUseCode
	 */
	
	@JsonProperty("pv2_39_recreationalDrugUseCode")
	public CE_v2[] getPv2_39_recreationalDrugUseCode() {
		CE_v2[] recreationalDrugUseCode = new CE_v2[this.pv2.getPv239_RecreationalDrugUseCode().length];
		for(int i = 0; i < this.pv2.getPv239_RecreationalDrugUseCode().length; i++) {
			recreationalDrugUseCode[i] = new CE_v2(
					this.pv2.getPv239_RecreationalDrugUseCode(i).getCe1_Identifier().getValue(),
					this.pv2.getPv239_RecreationalDrugUseCode(i).getCe2_Text().getValue(),
					this.pv2.getPv239_RecreationalDrugUseCode(i).getCe3_NameOfCodingSystem().getValue(),
					this.pv2.getPv239_RecreationalDrugUseCode(i).getCe4_AlternateIdentifier().getValue(),
					this.pv2.getPv239_RecreationalDrugUseCode(i).getCe5_AlternateText().getValue(),
					this.pv2.getPv239_RecreationalDrugUseCode(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return recreationalDrugUseCode;
	}
	/**
	 * @param pv2_39_recreationalDrugUseCode the pv2_39_recreationalDrugUseCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_39_recreationalDrugUseCode")
	public void setPv2_39_recreationalDrugUseCode(CE_v2[] pv2_39_recreationalDrugUseCode) throws DataTypeException {
		for(int i = 0; i < pv2_39_recreationalDrugUseCode.length; i++) {
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe1_Identifier().setValue(pv2_39_recreationalDrugUseCode[i].getCe_1_identifier());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe2_Text().setValue(pv2_39_recreationalDrugUseCode[i].getCe_2_text());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe3_NameOfCodingSystem().setValue(pv2_39_recreationalDrugUseCode[i].getCe_3_nameOfCodingSystem());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe4_AlternateIdentifier().setValue(pv2_39_recreationalDrugUseCode[i].getCe_4_alternateIdentifier());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe5_AlternateText().setValue(pv2_39_recreationalDrugUseCode[i].getCe_5_alternateText());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe6_NameOfAlternateCodingSystem().setValue(pv2_39_recreationalDrugUseCode[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.pv2_39_recreationalDrugUseCode = pv2_39_recreationalDrugUseCode;
	}
	/**
	 * @return the pv2_40_admissionLevelofCareCode
	 */
	
	@JsonProperty("pv2_40_admissionLevelofCareCode")
	public CE_v2 getPv2_40_admissionLevelofCareCode() {
		return new CE_v2(
				this.pv2.getPv240_AdmissionLevelOfCareCode().getCe1_Identifier().getValue(), 
				this.pv2.getPv240_AdmissionLevelOfCareCode().getCe2_Text().getValue(), 
				this.pv2.getPv240_AdmissionLevelOfCareCode().getCe3_NameOfCodingSystem().getValue(), 
				this.pv2.getPv240_AdmissionLevelOfCareCode().getCe4_AlternateIdentifier().getValue(), 
				this.pv2.getPv240_AdmissionLevelOfCareCode().getCe5_AlternateText().getValue(), 
				this.pv2.getPv240_AdmissionLevelOfCareCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_40_admissionLevelofCareCode the pv2_40_admissionLevelofCareCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_40_admissionLevelofCareCode")
	public void setPv2_40_admissionLevelofCareCode(CE_v2 pv2_40_admissionLevelofCareCode) throws DataTypeException {
		this.pv2.getPv240_AdmissionLevelOfCareCode().getCe1_Identifier().setValue(pv2_40_admissionLevelofCareCode.getCe_1_identifier());
		this.pv2.getPv240_AdmissionLevelOfCareCode().getCe2_Text().setValue(pv2_40_admissionLevelofCareCode.getCe_2_text()); 
		this.pv2.getPv240_AdmissionLevelOfCareCode().getCe3_NameOfCodingSystem().setValue(pv2_40_admissionLevelofCareCode.getCe_3_nameOfCodingSystem());
		this.pv2.getPv240_AdmissionLevelOfCareCode().getCe4_AlternateIdentifier().setValue(pv2_40_admissionLevelofCareCode.getCe_4_alternateIdentifier());
		this.pv2.getPv240_AdmissionLevelOfCareCode().getCe5_AlternateText().setValue(pv2_40_admissionLevelofCareCode.getCe_5_alternateText());
		this.pv2.getPv240_AdmissionLevelOfCareCode().getCe6_NameOfAlternateCodingSystem().setValue(pv2_40_admissionLevelofCareCode.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_40_admissionLevelofCareCode = pv2_40_admissionLevelofCareCode;
	}
	/**
	 * @return the pv2_41_precautionCode
	 */
	
	@JsonProperty("pv2_41_precautionCode")
	public CE_v2[] getPv2_41_precautionCode() {
		CE_v2[] precautionCode = new CE_v2[this.pv2.getPv241_PrecautionCode().length];
		for(int i = 0; i < this.pv2.getPv241_PrecautionCode().length; i++) {
			precautionCode[i] = new CE_v2(
					this.pv2.getPv241_PrecautionCode(i).getCe1_Identifier().getValue(),
					this.pv2.getPv241_PrecautionCode(i).getCe2_Text().getValue(),
					this.pv2.getPv241_PrecautionCode(i).getCe3_NameOfCodingSystem().getValue(),
					this.pv2.getPv241_PrecautionCode(i).getCe4_AlternateIdentifier().getValue(),
					this.pv2.getPv241_PrecautionCode(i).getCe5_AlternateText().getValue(),
					this.pv2.getPv241_PrecautionCode(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return precautionCode;
	}
	/**
	 * @param pv2_41_precautionCode the pv2_41_precautionCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_41_precautionCode")
	public void setPv2_41_precautionCode(CE_v2[] pv2_41_precautionCode) throws DataTypeException {
		for(int i = 0; i < pv2_41_precautionCode.length; i++) {
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe1_Identifier().setValue(pv2_41_precautionCode[i].getCe_1_identifier());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe2_Text().setValue(pv2_41_precautionCode[i].getCe_2_text());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe3_NameOfCodingSystem().setValue(pv2_41_precautionCode[i].getCe_3_nameOfCodingSystem());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe4_AlternateIdentifier().setValue(pv2_41_precautionCode[i].getCe_4_alternateIdentifier());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe5_AlternateText().setValue(pv2_41_precautionCode[i].getCe_5_alternateText());
			this.pv2.getPv239_RecreationalDrugUseCode(i).getCe6_NameOfAlternateCodingSystem().setValue(pv2_41_precautionCode[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.pv2_41_precautionCode = pv2_41_precautionCode;
	}
	/**
	 * @return the pv2_42_patientConditionCode
	 */
	
	@JsonProperty("pv2_42_patientConditionCode")
	public CE_v2 getPv2_42_patientConditionCode() {
		return new CE_v2(
				this.pv2.getPv242_PatientConditionCode().getCe1_Identifier().getValue(), 
				this.pv2.getPv242_PatientConditionCode().getCe2_Text().getValue(), 
				this.pv2.getPv242_PatientConditionCode().getCe3_NameOfCodingSystem().getValue(), 
				this.pv2.getPv242_PatientConditionCode().getCe4_AlternateIdentifier().getValue(), 
				this.pv2.getPv242_PatientConditionCode().getCe5_AlternateText().getValue(), 
				this.pv2.getPv242_PatientConditionCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv2_42_patientConditionCode the pv2_42_patientConditionCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_42_patientConditionCode")
	public void setPv2_42_patientConditionCode(CE_v2 pv2_42_patientConditionCode) throws DataTypeException {
		this.pv2.getPv242_PatientConditionCode().getCe1_Identifier().setValue(pv2_40_admissionLevelofCareCode.getCe_1_identifier());
		this.pv2.getPv242_PatientConditionCode().getCe2_Text().setValue(pv2_40_admissionLevelofCareCode.getCe_2_text()); 
		this.pv2.getPv242_PatientConditionCode().getCe3_NameOfCodingSystem().setValue(pv2_40_admissionLevelofCareCode.getCe_3_nameOfCodingSystem());
		this.pv2.getPv242_PatientConditionCode().getCe4_AlternateIdentifier().setValue(pv2_40_admissionLevelofCareCode.getCe_4_alternateIdentifier());
		this.pv2.getPv242_PatientConditionCode().getCe5_AlternateText().setValue(pv2_40_admissionLevelofCareCode.getCe_5_alternateText());
		this.pv2.getPv242_PatientConditionCode().getCe6_NameOfAlternateCodingSystem().setValue(pv2_40_admissionLevelofCareCode.getCe_6_nameOfAlternateCodingSystem());
		this.pv2_42_patientConditionCode = pv2_42_patientConditionCode;
	}
	/**
	 * @return the pv2_43_livingWillCode
	 */
	
	@JsonProperty("pv2_43_livingWillCode")
	public String getPv2_43_livingWillCode() {
		return this.pv2.getPv243_LivingWillCode().getValue();
	}
	/**
	 * @param pv2_43_livingWillCode the pv2_43_livingWillCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_43_livingWillCode")
	public void setPv2_43_livingWillCode(String pv2_43_livingWillCode) throws DataTypeException {
		this.pv2.getPv243_LivingWillCode().setValue(pv2_43_livingWillCode);
		this.pv2_43_livingWillCode = pv2_43_livingWillCode;
	}
	/**
	 * @return the pv2_44_organDonorCode
	 */
	
	@JsonProperty("pv2_44_organDonorCode")
	public String getPv2_44_organDonorCode() {
		return this.pv2.getPv244_OrganDonorCode().getValue();
	}
	/**
	 * @param pv2_44_organDonorCode the pv2_44_organDonorCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_44_organDonorCode")
	public void setPv2_44_organDonorCode(String pv2_44_organDonorCode) throws DataTypeException {
		this.pv2.getPv244_OrganDonorCode().setValue(pv2_44_organDonorCode);
		this.pv2_44_organDonorCode = pv2_44_organDonorCode;
	}
	/**
	 * @return the pv2_45_advanceDirectiveCode
	 */
	
	@JsonProperty("pv2_45_advanceDirectiveCode")
	public CE_v2[] getPv2_45_advanceDirectiveCode() {
		CE_v2[] advanceDirectiveCode = new CE_v2[this.pv2.getPv245_AdvanceDirectiveCode().length];
		for(int i = 0; i < this.pv2.getPv245_AdvanceDirectiveCode().length; i++) {
			advanceDirectiveCode[i] = new CE_v2(
					this.pv2.getPv245_AdvanceDirectiveCode(i).getCe1_Identifier().getValue(),
					this.pv2.getPv245_AdvanceDirectiveCode(i).getCe2_Text().getValue(),
					this.pv2.getPv245_AdvanceDirectiveCode(i).getCe3_NameOfCodingSystem().getValue(),
					this.pv2.getPv245_AdvanceDirectiveCode(i).getCe4_AlternateIdentifier().getValue(),
					this.pv2.getPv245_AdvanceDirectiveCode(i).getCe5_AlternateText().getValue(),
					this.pv2.getPv245_AdvanceDirectiveCode(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return advanceDirectiveCode;
	}
	/**
	 * @param pv2_45_advanceDirectiveCode the pv2_45_advanceDirectiveCode to set
	 * @JsonProperty("pv2_45_advanceDirectiveCode")
	 * @throws DataTypeException 
	 */
	public void setPv2_45_advanceDirectiveCode(CE_v2[] pv2_45_advanceDirectiveCode) throws DataTypeException {
		for(int i = 0; i < pv2_45_advanceDirectiveCode.length; i++) {
			this.pv2.getPv245_AdvanceDirectiveCode(i).getCe1_Identifier().setValue(pv2_45_advanceDirectiveCode[i].getCe_1_identifier());
			this.pv2.getPv245_AdvanceDirectiveCode(i).getCe2_Text().setValue(pv2_45_advanceDirectiveCode[i].getCe_2_text());
			this.pv2.getPv245_AdvanceDirectiveCode(i).getCe3_NameOfCodingSystem().setValue(pv2_45_advanceDirectiveCode[i].getCe_3_nameOfCodingSystem());
			this.pv2.getPv245_AdvanceDirectiveCode(i).getCe4_AlternateIdentifier().setValue(pv2_45_advanceDirectiveCode[i].getCe_4_alternateIdentifier());
			this.pv2.getPv245_AdvanceDirectiveCode(i).getCe5_AlternateText().setValue(pv2_45_advanceDirectiveCode[i].getCe_5_alternateText());
			this.pv2.getPv245_AdvanceDirectiveCode(i).getCe6_NameOfAlternateCodingSystem().setValue(pv2_45_advanceDirectiveCode[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.pv2_45_advanceDirectiveCode = pv2_45_advanceDirectiveCode;
	}
	/**
	 * @return the pv2_46_patientStatusEffectiveDate
	 */
	
	@JsonProperty("pv2_46_patientStatusEffectiveDate")
	public String getPv2_46_patientStatusEffectiveDate() {
		return this.pv2.getPv246_PatientStatusEffectiveDate().getValue();
	}
	/**
	 * @param pv2_46_patientStatusEffectiveDate the pv2_46_patientStatusEffectiveDate to set
	 * @JsonProperty("pv2_46_patientStatusEffectiveDate")
	 * @throws DataTypeException 
	 */
	public void setPv2_46_patientStatusEffectiveDate(String pv2_46_patientStatusEffectiveDate) throws DataTypeException {
		this.pv2.getPv246_PatientStatusEffectiveDate().setValue(pv2_46_patientStatusEffectiveDate);
		this.pv2_46_patientStatusEffectiveDate = pv2_46_patientStatusEffectiveDate;
	}
	/**
	 * @return the pv2_47_expectedLOAReturnDateTime
	 */
	
	@JsonProperty("pv2_47_expectedLOAReturnDateTime")
	public TS_v2 getPv2_47_expectedLOAReturnDateTime() {
		return new TS_v2(
				this.pv2.getPv247_ExpectedLOAReturnDateTime().getTs1_Time().getValue(), 
				this.pv2.getPv247_ExpectedLOAReturnDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pv2_47_expectedLOAReturnDateTime the pv2_47_expectedLOAReturnDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_47_expectedLOAReturnDateTime")
	public void setPv2_47_expectedLOAReturnDateTime(TS_v2 pv2_47_expectedLOAReturnDateTime) throws DataTypeException {
		this.pv2.getPv247_ExpectedLOAReturnDateTime().getTs1_Time().setValue(pv2_47_expectedLOAReturnDateTime.getTs_1_time());
		this.pv2.getPv247_ExpectedLOAReturnDateTime().getTs2_DegreeOfPrecision().setValue(pv2_47_expectedLOAReturnDateTime.getTs_2_degreeOfPrecision());
		this.pv2_47_expectedLOAReturnDateTime = pv2_47_expectedLOAReturnDateTime;
	}
	/**
	 * @return the pv2_48_expectedPreadmissionTestingDateTime
	 */
	
	@JsonProperty("pv2_48_expectedPreadmissionTestingDateTime")
	public TS_v2 getPv2_48_expectedPreadmissionTestingDateTime() {
		return new TS_v2(
				this.pv2.getPv248_ExpectedPreAdmissionTestingDateTime().getTs1_Time().getValue(), 
				this.pv2.getPv248_ExpectedPreAdmissionTestingDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pv2_48_expectedPreadmissionTestingDateTime the pv2_48_expectedPreadmissionTestingDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_48_expectedPreadmissionTestingDateTime")
	public void setPv2_48_expectedPreadmissionTestingDateTime(TS_v2 pv2_48_expectedPreadmissionTestingDateTime) throws DataTypeException {
		this.pv2.getPv248_ExpectedPreAdmissionTestingDateTime().getTs1_Time().setValue(pv2_48_expectedPreadmissionTestingDateTime.getTs_1_time());
		this.pv2.getPv248_ExpectedPreAdmissionTestingDateTime().getTs2_DegreeOfPrecision().setValue(pv2_48_expectedPreadmissionTestingDateTime.getTs_2_degreeOfPrecision());
		this.pv2_48_expectedPreadmissionTestingDateTime = pv2_48_expectedPreadmissionTestingDateTime;
	}
	/**
	 * @return the pv2_49_notifyClergyCode
	 */
	
	@JsonProperty("pv2_49_notifyClergyCode")
	public String[] getPv2_49_notifyClergyCode() {
		String[] notifyClergyCode = new String[this.pv2.getPv249_NotifyClergyCode().length];
		for(int i = 0; i < this.pv2.getPv249_NotifyClergyCode().length; i++) {
			notifyClergyCode[i] = this.pv2.getPv249_NotifyClergyCode()[i].getValue();
		}
		return notifyClergyCode;
	}
	/**
	 * @param pv2_49_notifyClergyCode the pv2_49_notifyClergyCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv2_49_notifyClergyCode")
	public void setPv2_49_notifyClergyCode(String[] pv2_49_notifyClergyCode) throws DataTypeException {
		for(int i = 0; i < pv2_49_notifyClergyCode.length; i++) {
			this.pv2.getPv249_NotifyClergyCode()[i].setValue(pv2_49_notifyClergyCode[i]);
		}
		this.pv2_49_notifyClergyCode = pv2_49_notifyClergyCode;
	}
	@Override
	public String toString() {
		return "CustomPV2_v25 [pv2_1_priorPendingLocation=" + pv2_1_priorPendingLocation + ", pv2_2_accommodationCode="
				+ pv2_2_accommodationCode + ", pv2_3_admitReason=" + pv2_3_admitReason + ", pv2_4transferReason="
				+ pv2_4transferReason + ", pv2_5_patientValuables=" + Arrays.toString(pv2_5_patientValuables)
				+ ", pv2_6_patientValuablesLocation=" + pv2_6_patientValuablesLocation + ", pv2_7_visitUserCode="
				+ Arrays.toString(pv2_7_visitUserCode) + ", pv2_8_expectedAdmitDateTime=" + pv2_8_expectedAdmitDateTime
				+ ", pv2_9_expectedDischargeDateTime=" + pv2_9_expectedDischargeDateTime
				+ ", pv2_10_estimatedLengthofInpatientStay=" + pv2_10_estimatedLengthofInpatientStay
				+ ", pv2_11_actualLengthofInpatientStay=" + pv2_11_actualLengthofInpatientStay
				+ ", pv2_12_visitDescription=" + pv2_12_visitDescription + ", pv2_13_referralSourceCode="
				+ Arrays.toString(pv2_13_referralSourceCode) + ", pv2_14_previousServiceDate="
				+ pv2_14_previousServiceDate + ", pv2_15_employmentIllnessRelatedIndicator="
				+ pv2_15_employmentIllnessRelatedIndicator + ", pv2_16_purgeStatusCode=" + pv2_16_purgeStatusCode
				+ ", pv2_17_purgeStatusDate=" + pv2_17_purgeStatusDate + ", pv2_18_specialProgramCode="
				+ pv2_18_specialProgramCode + ", pv2_19_retentionIndicator=" + pv2_19_retentionIndicator
				+ ", pv2_20_expectedNumberofInsurancePlans=" + pv2_20_expectedNumberofInsurancePlans
				+ ", pv2_21_visitPublicityCode=" + pv2_21_visitPublicityCode + ", pv2_22_visitProtectionIndicator="
				+ pv2_22_visitProtectionIndicator + ", pv2_23_clinicOrganizationName="
				+ Arrays.toString(pv2_23_clinicOrganizationName) + ", pv2_24_patientStatusCode="
				+ pv2_24_patientStatusCode + ", pv2_25_visitPriorityCode=" + pv2_25_visitPriorityCode
				+ ", pv2_26_previousTreatmentDate=" + pv2_26_previousTreatmentDate
				+ ", pv2_27_expectedDischargeDisposition=" + pv2_27_expectedDischargeDisposition
				+ ", pv2_28_signatureonFileDate=" + pv2_28_signatureonFileDate + ", pv2_29_firstSimilarIllnessDate="
				+ pv2_29_firstSimilarIllnessDate + ", pv2_30_patientChargeAdjustmentCode="
				+ pv2_30_patientChargeAdjustmentCode + ", pv2_31_recurringServiceCode=" + pv2_31_recurringServiceCode
				+ ", pv2_32_billingMediaCode=" + pv2_32_billingMediaCode + ", pv2_33_expectedSurgeryDateandTime="
				+ pv2_33_expectedSurgeryDateandTime + ", pv2_34_militaryPartnershipCode="
				+ pv2_34_militaryPartnershipCode + ", pv2_35_militaryNonAvailabilityCode="
				+ pv2_35_militaryNonAvailabilityCode + ", pv2_36_newbornBabyIndicator=" + pv2_36_newbornBabyIndicator
				+ ", pv2_37_babyDetainedIndicator=" + pv2_37_babyDetainedIndicator + ", pv2_38_modeofArrivalCode="
				+ pv2_38_modeofArrivalCode + ", pv2_39_recreationalDrugUseCode="
				+ Arrays.toString(pv2_39_recreationalDrugUseCode) + ", pv2_40_admissionLevelofCareCode="
				+ pv2_40_admissionLevelofCareCode + ", pv2_41_precautionCode=" + Arrays.toString(pv2_41_precautionCode)
				+ ", pv2_42_patientConditionCode=" + pv2_42_patientConditionCode + ", pv2_43_livingWillCode="
				+ pv2_43_livingWillCode + ", pv2_44_organDonorCode=" + pv2_44_organDonorCode
				+ ", pv2_45_advanceDirectiveCode=" + Arrays.toString(pv2_45_advanceDirectiveCode)
				+ ", pv2_46_patientStatusEffectiveDate=" + pv2_46_patientStatusEffectiveDate
				+ ", pv2_47_expectedLOAReturnDateTime=" + pv2_47_expectedLOAReturnDateTime
				+ ", pv2_48_expectedPreadmissionTestingDateTime=" + pv2_48_expectedPreadmissionTestingDateTime
				+ ", pv2_49_notifyClergyCode=" + Arrays.toString(pv2_49_notifyClergyCode) + "]";
	}
}
