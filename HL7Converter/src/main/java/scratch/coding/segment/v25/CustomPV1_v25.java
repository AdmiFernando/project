package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.PD1;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.FC_v23;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.DLD_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.XCN_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPV1_v25 {
	@JsonProperty("pv1_1_setID")
	private String pv1_1_setID;
	@JsonProperty("pv1_2_patientClass")
	private String pv1_2_patientClass;
	@JsonProperty("pv1_3_assignedPatientLocation")
	private PL_v25 pv1_3_assignedPatientLocation;
	@JsonProperty("pv1_4_admissionType")
	private String pv1_4_admissionType;
	@JsonProperty("pv1_5_preadmitNumber")
	private CX_v25 pv1_5_preadmitNumber;
	@JsonProperty("pv1_6_priorPatientLocation")
	private PL_v25 pv1_6_priorPatientLocation;
	@JsonProperty("pv1_7_attendingDoctor")
	private XCN_v25[] pv1_7_attendingDoctor;
	@JsonProperty("pv1_8_referringDoctor")
	private XCN_v25[] pv1_8_referringDoctor;
	@JsonProperty("pv1_9_consultingDoctor")
	private XCN_v25[] pv1_9_consultingDoctor;
	@JsonProperty("pv1_10_hospitalService")
	private String pv1_10_hospitalService;
	@JsonProperty("pv1_11_temporaryLocation")
	private PL_v25 pv1_11_temporaryLocation;
	@JsonProperty("pv1_12_preadmitTestIndicator")
	private String pv1_12_preadmitTestIndicator;
	@JsonProperty("pv1_13_reAdmissionIndicator")
	private String pv1_13_reAdmissionIndicator;
	@JsonProperty("pv1_14_admitSource")
	private String pv1_14_admitSource;
	@JsonProperty("pv1_15_ambulatoryStatus")
	private String[] pv1_15_ambulatoryStatus;
	@JsonProperty("pv1_16_VIPIndicator")
	private String pv1_16_VIPIndicator;
	@JsonProperty("pv1_17_admittingDoctor")
	private XCN_v25[] pv1_17_admittingDoctor;	
	@JsonProperty("pv1_18_patientType")
	private String pv1_18_patientType;
	@JsonProperty("pv1_19_visitNumber")
	private CX_v25 pv1_19_visitNumber;
	@JsonProperty("pv1_20_financialClass")
	private FC_v23[] pv1_20_financialClass;
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
	@JsonProperty("pv1_29_transfertoBadDebtCode")
	private String pv1_29_transfertoBadDebtCode;
	@JsonProperty("pv1_30_transfertoBadDebtDate")
	private String pv1_30_transfertoBadDebtDate;
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
	@JsonProperty("pv1_37_dischargedtoLocation")
	private DLD_v25 pv1_37_dischargedtoLocation;
	@JsonProperty("pv1_38_dietType")
	private CE_v2 pv1_38_dietType;
	@JsonProperty("pv1_39_servicingFacility")
	private String pv1_39_servicingFacility;
	@JsonProperty("pv1_40_bedStatus")
	private String pv1_40_bedStatus;
	@JsonProperty("pv1_41_accountStatus")
	private String pv1_41_accountStatus;
	@JsonProperty("pv1_42_pendingLocation")
	private PL_v25 pv1_42_pendingLocation;
	@JsonProperty("pv1_43_priorTemporaryLocation")
	private PL_v25 pv1_43_priorTemporaryLocation;
	@JsonProperty("pv1_44_admitDateTime")
	private TS_v2 pv1_44_admitDateTime;
	@JsonProperty("pv1_45_dischargeDateTime")
	private TS_v2[] pv1_45_dischargeDateTime;
	@JsonProperty("pv1_46_currentPatientBalance")
	private String pv1_46_currentPatientBalance;
	@JsonProperty("pv1_47_totalCharges")
	private String pv1_47_totalCharges;
	@JsonProperty("pv1_48_totalAdjustments")
	private String pv1_48_totalAdjustments;
	@JsonProperty("pv1_49_totalPayments")
	private String pv1_49_totalPayments;
	@JsonProperty("pv1_50_alternateVisit")
	private CX_v25 pv1_50_alternateVisit;
	@JsonProperty("pv1_51_visitIndicator")
	private String pv1_51_visitIndicator;
	@JsonProperty("pv1_52_otherHealthcareProvider")
	private XCN_v25[] pv1_52_otherHealthcareProvider;
	
	private PV1 pv1;
	
	private CustomPV1_v25(PV1 pv1, CustomNTE_v25[] nte) {
		super();
		this.pv1 =pv1;
//		setNte(nte);
	}
	private CustomPV1_v25(PV1 pv1) {
		super();
		this.pv1 = pv1;
	}
	
	public CustomPV1_v25() {
		super();
	}
	public static CustomPV1_v25 createPD1WithPD1(PV1 pv1) throws HL7Exception, IOException {
		return new CustomPV1_v25(pv1);
	}

	public static CustomPV1_v25 createPD1WithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		PV1 pv1 = oru.getPATIENT_RESULT().getPATIENT().getVISIT().getPV1();
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
		return new CustomPV1_v25(pv1);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the pv1_1_setID
	 */
	
	@JsonProperty("pv1_1_setID")
	public String getPv1_1_setID() {
		return this.pv1.getPv11_SetIDPV1().getValue();
	}
	/**
	 * @param pv1_1_setID the pv1_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_1_setID")
	public void setPv1_1_setID(String pv1_1_setID) throws DataTypeException {
		this.pv1.getPv11_SetIDPV1().setValue(pv1_1_setID);
		this.pv1_1_setID = pv1_1_setID;
	}
	/**
	 * @return the pv1_2_patientClass
	 */
	
	@JsonProperty("pv1_2_patientClass")
	public String getPv1_2_patientClass() {
		return this.pv1.getPv12_PatientClass().getValue();
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
	 * @return the pv1_3_assignedPatientLocation
	 */
	
	@JsonProperty("pv1_3_assignedPatientLocation")
	public PL_v25 getPv1_3_assignedPatientLocation() {
		return new PL_v25(
				this.pv1.getPv13_AssignedPatientLocation().getPl1_PointOfCare().getValue(),
				this.pv1.getPv13_AssignedPatientLocation().getPl2_Room().getValue(), 
				this.pv1.getPv13_AssignedPatientLocation().getPl3_Bed().getValue(), 
				new HD_v2(
						this.pv1.getPv13_AssignedPatientLocation().getPl4_Facility().getHd1_NamespaceID().getValue(), 
						this.pv1.getPv13_AssignedPatientLocation().getPl4_Facility().getHd2_UniversalID().getValue(), 
						this.pv1.getPv13_AssignedPatientLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv13_AssignedPatientLocation().getPl5_LocationStatus().getValue(), 
				this.pv1.getPv13_AssignedPatientLocation().getPl6_PersonLocationType().getValue(), 
				this.pv1.getPv13_AssignedPatientLocation().getPl7_Building().getValue(), 
				this.pv1.getPv13_AssignedPatientLocation().getPl8_Floor().getValue(), 
				this.pv1.getPv13_AssignedPatientLocation().getPl9_LocationDescription().getValue(), 
				new EI_v2(
						this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(), 
						this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(), 
						this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()), 
				new HD_v2(
						this.pv1.getPv13_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.pv1.getPv13_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(), 
						this.pv1.getPv13_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param pv1_3_assignedPatientLocation the pv1_3_assignedPatientLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_3_assignedPatientLocation")
	public void setPv1_3_assignedPatientLocation(PL_v25 pv1_3_assignedPatientLocation) throws DataTypeException {
		this.pv1.getPv13_AssignedPatientLocation().getPl1_PointOfCare().setValue(pv1_3_assignedPatientLocation.getPl_1_pointOfCare());
		this.pv1.getPv13_AssignedPatientLocation().getPl2_Room().setValue(pv1_3_assignedPatientLocation.getPl_2_room()); 
		this.pv1.getPv13_AssignedPatientLocation().getPl3_Bed().setValue(pv1_3_assignedPatientLocation.getPl_3_bed());
		this.pv1.getPv13_AssignedPatientLocation().getPl4_Facility().getHd1_NamespaceID().setValue(pv1_3_assignedPatientLocation.getPl_4_facility().getHd_1_namespaceId());
		this.pv1.getPv13_AssignedPatientLocation().getPl4_Facility().getHd2_UniversalID().setValue(pv1_3_assignedPatientLocation.getPl_4_facility().getHd_2_universalId());
		this.pv1.getPv13_AssignedPatientLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(pv1_3_assignedPatientLocation.getPl_4_facility().getHd_3_universalIdType());
		this.pv1.getPv13_AssignedPatientLocation().getPl5_LocationStatus().setValue(pv1_3_assignedPatientLocation.getPl_5_locationStatus());
		this.pv1.getPv13_AssignedPatientLocation().getPl6_PersonLocationType().setValue(pv1_3_assignedPatientLocation.getPl_6_personLocationType());
		this.pv1.getPv13_AssignedPatientLocation().getPl7_Building().setValue(pv1_3_assignedPatientLocation.getPl_7_building());
		this.pv1.getPv13_AssignedPatientLocation().getPl8_Floor().setValue(pv1_3_assignedPatientLocation.getPl_8_floor());
		this.pv1.getPv13_AssignedPatientLocation().getPl9_LocationDescription().setValue(pv1_3_assignedPatientLocation.getPl_9_locationDescription());
		this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(pv1_3_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(pv1_3_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId()); 
		this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(pv1_3_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.pv1.getPv13_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(pv1_3_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.pv1.getPv13_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(pv1_3_assignedPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.pv1.getPv13_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(pv1_3_assignedPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.pv1.getPv13_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(pv1_3_assignedPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.pv1_3_assignedPatientLocation = pv1_3_assignedPatientLocation;
	}
	/**
	 * @return the pv1_4_admissionType
	 */
	
	@JsonProperty("pv1_4_admissionType")
	public String getPv1_4_admissionType() {
		return this.pv1.getPv14_AdmissionType().getValue();
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
	 * @return the pv1_5_preadmitNumber
	 */
	
	@JsonProperty("pv1_5_preadmitNumber")
	public CX_v25 getPv1_5_preadmitNumber() {
		return new CX_v25(
				this.pv1.getPv15_PreadmitNumber().getCx1_IDNumber().getValue(), 
				this.pv1.getPv15_PreadmitNumber().getCx2_CheckDigit().getValue(),
				this.pv1.getPv15_PreadmitNumber().getCx3_CheckDigitScheme().getValue(), 
				new HD_v2(
						this.pv1.getPv15_PreadmitNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv15_PreadmitNumber().getCx5_IdentifierTypeCode().getValue(), 
				new HD_v2(
						this.pv1.getPv15_PreadmitNumber().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv15_PreadmitNumber().getCx7_EffectiveDate().getValue(), 
				this.pv1.getPv15_PreadmitNumber().getCx8_ExpirationDate().getValue(), 
				new CWE_v25(
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()), 
				new CWE_v25(
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(), 
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param pv1_5_preadmitNumber the pv1_5_preadmitNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_5_preadmitNumber")
	public void setPv1_5_preadmitNumber(CX_v25 pv1_5_preadmitNumber) throws DataTypeException {
		this.pv1.getPv15_PreadmitNumber().getCx1_IDNumber().setValue(pv1_5_preadmitNumber.getCx_1_idNumber()); 
		this.pv1.getPv15_PreadmitNumber().getCx2_CheckDigit().setValue(pv1_5_preadmitNumber.getCx_2_checkDigit());
		this.pv1.getPv15_PreadmitNumber().getCx3_CheckDigitScheme().setValue(pv1_5_preadmitNumber.getCx_3_checkDigitScheme());
		this.pv1.getPv15_PreadmitNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_5_preadmitNumber.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.pv1.getPv15_PreadmitNumber().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pv1_5_preadmitNumber.getCx_4_assigningAuthority().getHd_2_universalId());
		this.pv1.getPv15_PreadmitNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_5_preadmitNumber.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.pv1.getPv15_PreadmitNumber().getCx5_IdentifierTypeCode().setValue(pv1_5_preadmitNumber.getCx_5_identifierTypeCode());
		this.pv1.getPv15_PreadmitNumber().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pv1_5_preadmitNumber.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.pv1.getPv15_PreadmitNumber().getCx6_AssigningFacility().getHd2_UniversalID().setValue(pv1_5_preadmitNumber.getCx_6_assigningFacility().getHd_2_universalId());
		this.pv1.getPv15_PreadmitNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_5_preadmitNumber.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.pv1.getPv15_PreadmitNumber().getCx7_EffectiveDate().setValue(pv1_5_preadmitNumber.getCx_7_effectiveDate());
		this.pv1.getPv15_PreadmitNumber().getCx8_ExpirationDate().setValue(pv1_5_preadmitNumber.getCx_8_expirationDate());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.pv1.getPv15_PreadmitNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_5_preadmitNumber.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_2_text()); 
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.pv1.getPv15_PreadmitNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_5_preadmitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.pv1_5_preadmitNumber = pv1_5_preadmitNumber;
	}
	/**
	 * @return the pv1_6_priorPatientLocation
	 */
	
	@JsonProperty("pv1_6_priorPatientLocation")
	public PL_v25 getPv1_6_priorPatientLocation() {
		return new PL_v25(
				this.pv1.getPv16_PriorPatientLocation().getPl1_PointOfCare().getValue(),
				this.pv1.getPv16_PriorPatientLocation().getPl2_Room().getValue(),
				this.pv1.getPv16_PriorPatientLocation().getPl3_Bed().getValue(),
				new HD_v2(
						this.pv1.getPv16_PriorPatientLocation().getPl4_Facility().getHd1_NamespaceID().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl4_Facility().getHd2_UniversalID().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()),
				this.pv1.getPv16_PriorPatientLocation().getPl5_LocationStatus().getValue(),
				this.pv1.getPv16_PriorPatientLocation().getPl6_PersonLocationType().getValue(),
				this.pv1.getPv16_PriorPatientLocation().getPl7_Building().getValue(), 
				this.pv1.getPv16_PriorPatientLocation().getPl8_Floor().getValue(),
				this.pv1.getPv16_PriorPatientLocation().getPl9_LocationDescription().getValue(), 
				new EI_v2(
						this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()),
				new HD_v2(
						this.pv1.getPv16_PriorPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(),
						this.pv1.getPv16_PriorPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param pv1_6_priorPatientLocation the pv1_6_priorPatientLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_6_priorPatientLocation")
	public void setPv1_6_priorPatientLocation(PL_v25 pv1_6_priorPatientLocation) throws DataTypeException {
		this.pv1.getPv16_PriorPatientLocation().getPl1_PointOfCare().setValue(pv1_6_priorPatientLocation.getPl_1_pointOfCare());
		this.pv1.getPv16_PriorPatientLocation().getPl2_Room().setValue(pv1_6_priorPatientLocation.getPl_2_room());
		this.pv1.getPv16_PriorPatientLocation().getPl3_Bed().setValue(pv1_6_priorPatientLocation.getPl_3_bed());
		this.pv1.getPv16_PriorPatientLocation().getPl4_Facility().getHd1_NamespaceID().setValue(pv1_6_priorPatientLocation.getPl_4_facility().getHd_1_namespaceId());
		this.pv1.getPv16_PriorPatientLocation().getPl4_Facility().getHd2_UniversalID().setValue(pv1_6_priorPatientLocation.getPl_4_facility().getHd_2_universalId());
		this.pv1.getPv16_PriorPatientLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(pv1_6_priorPatientLocation.getPl_4_facility().getHd_3_universalIdType());
		this.pv1.getPv16_PriorPatientLocation().getPl5_LocationStatus().setValue(pv1_6_priorPatientLocation.getPl_5_locationStatus());
		this.pv1.getPv16_PriorPatientLocation().getPl6_PersonLocationType().setValue(pv1_6_priorPatientLocation.getPl_6_personLocationType());
		this.pv1.getPv16_PriorPatientLocation().getPl7_Building().setValue(pv1_6_priorPatientLocation.getPl_7_building()); 
		this.pv1.getPv16_PriorPatientLocation().getPl8_Floor().setValue(pv1_6_priorPatientLocation.getPl_8_floor());
		this.pv1.getPv16_PriorPatientLocation().getPl9_LocationDescription().setValue(pv1_6_priorPatientLocation.getPl_9_locationDescription());
		this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(pv1_6_priorPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(pv1_6_priorPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId());
		this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(pv1_6_priorPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.pv1.getPv16_PriorPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(pv1_6_priorPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.pv1.getPv16_PriorPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(pv1_6_priorPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.pv1.getPv16_PriorPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(pv1_6_priorPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.pv1.getPv16_PriorPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(pv1_6_priorPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.pv1_6_priorPatientLocation = pv1_6_priorPatientLocation;
	}
	/**
	 * @return the pv1_7_attendingDoctor
	 */
	
	@JsonProperty("pv1_7_attendingDoctor")
	public XCN_v25[] getPv1_7_attendingDoctor() {
		XCN_v25[] attendingDoctor = new XCN_v25[this.pv1.getPv17_AttendingDoctor().length];
		for(int i =0; i< this.pv1.getPv17_AttendingDoctor().length; i++) {
			attendingDoctor[i] = new XCN_v25(
					this.pv1.getPv17_AttendingDoctor(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pv1.getPv17_AttendingDoctor(i).getXcn3_GivenName().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn6_PrefixEgDR().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn7_DegreeEgMD().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pv1.getPv17_AttendingDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv17_AttendingDoctor(i).getXcn10_NameTypeCode().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn12_CheckDigitScheme().getValue(),
					this.pv1.getPv17_AttendingDoctor(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv1.getPv17_AttendingDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv17_AttendingDoctor(i).getXcn15_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pv1.getPv17_AttendingDoctor(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pv1.getPv17_AttendingDoctor(i).getXcn19_EffectiveDate().getTs1_Time().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.pv1.getPv17_AttendingDoctor(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pv1.getPv17_AttendingDoctor(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return attendingDoctor;
	}
	/**
	 * @param pv1_7_attendingDoctor the pv1_7_attendingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_7_attendingDoctor")
	public void setPv1_7_attendingDoctor(XCN_v25[] pv1_7_attendingDoctor) throws DataTypeException {
		for(int i =0; i< pv1_7_attendingDoctor.length; i++) {
			this.pv1.getPv17_AttendingDoctor(i).getXcn1_IDNumber().setValue(pv1_7_attendingDoctor[i].getXcn_1_idNumber());
			this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn1_Surname().setValue(pv1_7_attendingDoctor[i].getXcn_2_familyName().getFn_1_surname());
			this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pv1_7_attendingDoctor[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pv1_7_attendingDoctor[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pv1_7_attendingDoctor[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pv1.getPv17_AttendingDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pv1_7_attendingDoctor[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pv1.getPv17_AttendingDoctor(i).getXcn3_GivenName().setValue(pv1_7_attendingDoctor[i].getXcn_3_givenName());
			this.pv1.getPv17_AttendingDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pv1_7_attendingDoctor[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pv1.getPv17_AttendingDoctor(i).getXcn5_SuffixEgJRorIII().setValue(pv1_7_attendingDoctor[i].getXcn_5_suffixegJrOrIii());
			this.pv1.getPv17_AttendingDoctor(i).getXcn6_PrefixEgDR().setValue(pv1_7_attendingDoctor[i].getXcn_6_prefixegDr());
			this.pv1.getPv17_AttendingDoctor(i).getXcn7_DegreeEgMD().setValue(pv1_7_attendingDoctor[i].getXcn_7_degreeegMd());
			this.pv1.getPv17_AttendingDoctor(i).getXcn8_SourceTable().setValue(pv1_7_attendingDoctor[i].getXcn_8_sourceTable());
			this.pv1.getPv17_AttendingDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_7_attendingDoctor[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pv1_7_attendingDoctor[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_7_attendingDoctor[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pv1.getPv17_AttendingDoctor(i).getXcn10_NameTypeCode().setValue(pv1_7_attendingDoctor[i].getXcn_10_nameTypeCode());
			this.pv1.getPv17_AttendingDoctor(i).getXcn11_IdentifierCheckDigit().setValue(pv1_7_attendingDoctor[i].getXcn_11_identifierCheckDigit());
			this.pv1.getPv17_AttendingDoctor(i).getXcn12_CheckDigitScheme().setValue(pv1_7_attendingDoctor[i].getXcn_12_checkDigitScheme());
			this.pv1.getPv17_AttendingDoctor(i).getXcn13_IdentifierTypeCode().setValue(pv1_7_attendingDoctor[i].getXcn_13_identifierTypeCode());
			this.pv1.getPv17_AttendingDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pv1_7_attendingDoctor[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pv1_7_attendingDoctor[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_7_attendingDoctor[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pv1.getPv17_AttendingDoctor(i).getXcn15_NameRepresentationCode().setValue(pv1_7_attendingDoctor[i].getXcn_15_nameRepresentationCode());
			this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe1_Identifier().setValue(pv1_7_attendingDoctor[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe2_Text().setValue(pv1_7_attendingDoctor[i].getXcn_16_nameContext().getCe_2_text());
			this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pv1_7_attendingDoctor[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pv1_7_attendingDoctor[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pv1_7_attendingDoctor[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pv1.getPv17_AttendingDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pv1_7_attendingDoctor[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pv1_7_attendingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pv1_7_attendingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pv1_7_attendingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pv1.getPv17_AttendingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pv1_7_attendingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv17_AttendingDoctor(i).getXcn18_NameAssemblyOrder().setValue(pv1_7_attendingDoctor[i].getXcn_18_nameAssemblyOrder());
			this.pv1.getPv17_AttendingDoctor(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pv1_7_attendingDoctor[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pv1.getPv17_AttendingDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_7_attendingDoctor[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv17_AttendingDoctor(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pv1_7_attendingDoctor[i].getXcn_20_expirationDate().getTs_1_time());
			this.pv1.getPv17_AttendingDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pv1_7_attendingDoctor[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv17_AttendingDoctor(i).getXcn21_ProfessionalSuffix().setValue(pv1_7_attendingDoctor[i].getXcn_21_professionalSuffix());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_7_attendingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv17_AttendingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_7_attendingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pv1_7_attendingDoctor = pv1_7_attendingDoctor;
	}
	/**
	 * @return the pv1_8_referringDoctor
	 */
	
	@JsonProperty("pv1_8_referringDoctor")
	public XCN_v25[] getPv1_8_referringDoctor() {
		XCN_v25[] referringDoctor = new XCN_v25[this.pv1.getPv18_ReferringDoctor().length];
		for(int i =0; i< this.pv1.getPv18_ReferringDoctor().length; i++) {
			referringDoctor[i] = new XCN_v25(
					this.pv1.getPv18_ReferringDoctor(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pv1.getPv18_ReferringDoctor(i).getXcn3_GivenName().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn6_PrefixEgDR().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn7_DegreeEgMD().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pv1.getPv18_ReferringDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv18_ReferringDoctor(i).getXcn10_NameTypeCode().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn12_CheckDigitScheme().getValue(),
					this.pv1.getPv18_ReferringDoctor(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv1.getPv18_ReferringDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv18_ReferringDoctor(i).getXcn15_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pv1.getPv18_ReferringDoctor(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pv1.getPv18_ReferringDoctor(i).getXcn19_EffectiveDate().getTs1_Time().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.pv1.getPv18_ReferringDoctor(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pv1.getPv18_ReferringDoctor(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return referringDoctor;
	}
	/**
	 * @param pv1_8_referringDoctor the pv1_8_referringDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_8_referringDoctor")
	public void setPv1_8_referringDoctor(XCN_v25[] pv1_8_referringDoctor) throws DataTypeException {
		for(int i =0; i< pv1_8_referringDoctor.length; i++) {
			this.pv1.getPv18_ReferringDoctor(i).getXcn1_IDNumber().setValue(pv1_8_referringDoctor[i].getXcn_1_idNumber());
			this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn1_Surname().setValue(pv1_8_referringDoctor[i].getXcn_2_familyName().getFn_1_surname());
			this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pv1_8_referringDoctor[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pv1_8_referringDoctor[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pv1_8_referringDoctor[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pv1.getPv18_ReferringDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pv1_8_referringDoctor[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pv1.getPv18_ReferringDoctor(i).getXcn3_GivenName().setValue(pv1_8_referringDoctor[i].getXcn_3_givenName());
			this.pv1.getPv18_ReferringDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pv1_8_referringDoctor[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pv1.getPv18_ReferringDoctor(i).getXcn5_SuffixEgJRorIII().setValue(pv1_8_referringDoctor[i].getXcn_5_suffixegJrOrIii());
			this.pv1.getPv18_ReferringDoctor(i).getXcn6_PrefixEgDR().setValue(pv1_8_referringDoctor[i].getXcn_6_prefixegDr());
			this.pv1.getPv18_ReferringDoctor(i).getXcn7_DegreeEgMD().setValue(pv1_8_referringDoctor[i].getXcn_7_degreeegMd());
			this.pv1.getPv18_ReferringDoctor(i).getXcn8_SourceTable().setValue(pv1_8_referringDoctor[i].getXcn_8_sourceTable());
			this.pv1.getPv18_ReferringDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_8_referringDoctor[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pv1_8_referringDoctor[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_8_referringDoctor[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pv1.getPv18_ReferringDoctor(i).getXcn10_NameTypeCode().setValue(pv1_8_referringDoctor[i].getXcn_10_nameTypeCode());
			this.pv1.getPv18_ReferringDoctor(i).getXcn11_IdentifierCheckDigit().setValue(pv1_8_referringDoctor[i].getXcn_11_identifierCheckDigit());
			this.pv1.getPv18_ReferringDoctor(i).getXcn12_CheckDigitScheme().setValue(pv1_8_referringDoctor[i].getXcn_12_checkDigitScheme());
			this.pv1.getPv18_ReferringDoctor(i).getXcn13_IdentifierTypeCode().setValue(pv1_8_referringDoctor[i].getXcn_13_identifierTypeCode());
			this.pv1.getPv18_ReferringDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pv1_8_referringDoctor[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pv1_8_referringDoctor[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_8_referringDoctor[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pv1.getPv18_ReferringDoctor(i).getXcn15_NameRepresentationCode().setValue(pv1_8_referringDoctor[i].getXcn_15_nameRepresentationCode());
			this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe1_Identifier().setValue(pv1_8_referringDoctor[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe2_Text().setValue(pv1_8_referringDoctor[i].getXcn_16_nameContext().getCe_2_text());
			this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pv1_8_referringDoctor[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pv1_8_referringDoctor[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pv1_8_referringDoctor[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pv1.getPv18_ReferringDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pv1_8_referringDoctor[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pv1_8_referringDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pv1_8_referringDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pv1_8_referringDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pv1.getPv18_ReferringDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pv1_8_referringDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv18_ReferringDoctor(i).getXcn18_NameAssemblyOrder().setValue(pv1_8_referringDoctor[i].getXcn_18_nameAssemblyOrder());
			this.pv1.getPv18_ReferringDoctor(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pv1_8_referringDoctor[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pv1.getPv18_ReferringDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_8_referringDoctor[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv18_ReferringDoctor(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pv1_8_referringDoctor[i].getXcn_20_expirationDate().getTs_1_time());
			this.pv1.getPv18_ReferringDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pv1_8_referringDoctor[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv18_ReferringDoctor(i).getXcn21_ProfessionalSuffix().setValue(pv1_8_referringDoctor[i].getXcn_21_professionalSuffix());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_8_referringDoctor[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv18_ReferringDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_8_referringDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pv1_8_referringDoctor = pv1_8_referringDoctor;
	}
	/**
	 * @return the pv1_9_consultingDoctor
	 */
	
	@JsonProperty("pv1_9_consultingDoctor")
	public XCN_v25[] getPv1_9_consultingDoctor() {
		XCN_v25[] consultingDoctor = new XCN_v25[this.pv1.getPv117_AdmittingDoctor().length];
		for(int i =0; i< this.pv1.getPv117_AdmittingDoctor().length; i++) {
			consultingDoctor[i] = new XCN_v25(
					this.pv1.getPv117_AdmittingDoctor(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn3_GivenName().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn6_PrefixEgDR().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn7_DegreeEgMD().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn10_NameTypeCode().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn12_CheckDigitScheme().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn15_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs1_Time().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return consultingDoctor;
	}
	/**
	 * @param pv1_9_consultingDoctor the pv1_9_consultingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_9_consultingDoctor")
	public void setPv1_9_consultingDoctor(XCN_v25[] pv1_9_consultingDoctor) throws DataTypeException {
		for(int i =0; i< pv1_9_consultingDoctor.length; i++) {
			this.pv1.getPv117_AdmittingDoctor(i).getXcn1_IDNumber().setValue(pv1_9_consultingDoctor[i].getXcn_1_idNumber());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn1_Surname().setValue(pv1_9_consultingDoctor[i].getXcn_2_familyName().getFn_1_surname());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pv1_9_consultingDoctor[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pv1_9_consultingDoctor[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pv1_9_consultingDoctor[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pv1_9_consultingDoctor[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn3_GivenName().setValue(pv1_9_consultingDoctor[i].getXcn_3_givenName());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pv1_9_consultingDoctor[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn5_SuffixEgJRorIII().setValue(pv1_9_consultingDoctor[i].getXcn_5_suffixegJrOrIii());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn6_PrefixEgDR().setValue(pv1_9_consultingDoctor[i].getXcn_6_prefixegDr());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn7_DegreeEgMD().setValue(pv1_9_consultingDoctor[i].getXcn_7_degreeegMd());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn8_SourceTable().setValue(pv1_9_consultingDoctor[i].getXcn_8_sourceTable());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_9_consultingDoctor[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pv1_9_consultingDoctor[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_9_consultingDoctor[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn10_NameTypeCode().setValue(pv1_9_consultingDoctor[i].getXcn_10_nameTypeCode());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn11_IdentifierCheckDigit().setValue(pv1_9_consultingDoctor[i].getXcn_11_identifierCheckDigit());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn12_CheckDigitScheme().setValue(pv1_9_consultingDoctor[i].getXcn_12_checkDigitScheme());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn13_IdentifierTypeCode().setValue(pv1_9_consultingDoctor[i].getXcn_13_identifierTypeCode());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pv1_9_consultingDoctor[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pv1_9_consultingDoctor[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_9_consultingDoctor[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn15_NameRepresentationCode().setValue(pv1_9_consultingDoctor[i].getXcn_15_nameRepresentationCode());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe1_Identifier().setValue(pv1_9_consultingDoctor[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe2_Text().setValue(pv1_9_consultingDoctor[i].getXcn_16_nameContext().getCe_2_text());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pv1_9_consultingDoctor[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pv1_9_consultingDoctor[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pv1_9_consultingDoctor[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pv1_9_consultingDoctor[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pv1_9_consultingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pv1_9_consultingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pv1_9_consultingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pv1_9_consultingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn18_NameAssemblyOrder().setValue(pv1_9_consultingDoctor[i].getXcn_18_nameAssemblyOrder());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pv1_9_consultingDoctor[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_9_consultingDoctor[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pv1_9_consultingDoctor[i].getXcn_20_expirationDate().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pv1_9_consultingDoctor[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn21_ProfessionalSuffix().setValue(pv1_9_consultingDoctor[i].getXcn_21_professionalSuffix());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_9_consultingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_9_consultingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pv1_9_consultingDoctor = pv1_9_consultingDoctor;
	}
	/**
	 * @return the pv1_10_hospitalService
	 */
	
	@JsonProperty("pv1_10_hospitalService")
	public String getPv1_10_hospitalService() {
		return this.pv1.getPv110_HospitalService().getValue();
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
	 * @return the pv1_11_temporaryLocation
	 */
	
	@JsonProperty("pv1_11_temporaryLocation")
	public PL_v25 getPv1_11_temporaryLocation() {
		return new PL_v25(
				this.pv1.getPv111_TemporaryLocation().getPl1_PointOfCare().getValue(),
				this.pv1.getPv111_TemporaryLocation().getPl2_Room().getValue(),
				this.pv1.getPv111_TemporaryLocation().getPl3_Bed().getValue(),
				new HD_v2(
						this.pv1.getPv111_TemporaryLocation().getPl4_Facility().getHd1_NamespaceID().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl4_Facility().getHd2_UniversalID().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()),
				this.pv1.getPv111_TemporaryLocation().getPl5_LocationStatus().getValue(),
				this.pv1.getPv111_TemporaryLocation().getPl6_PersonLocationType().getValue(),
				this.pv1.getPv111_TemporaryLocation().getPl7_Building().getValue(), 
				this.pv1.getPv111_TemporaryLocation().getPl8_Floor().getValue(),
				this.pv1.getPv111_TemporaryLocation().getPl9_LocationDescription().getValue(), 
				new EI_v2(
						this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()),
				new HD_v2(
						this.pv1.getPv111_TemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(),
						this.pv1.getPv111_TemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param pv1_11_temporaryLocation the pv1_11_temporaryLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_11_temporaryLocation")
	public void setPv1_11_temporaryLocation(PL_v25 pv1_11_temporaryLocation) throws DataTypeException {
		this.pv1.getPv111_TemporaryLocation().getPl1_PointOfCare().setValue(pv1_11_temporaryLocation.getPl_1_pointOfCare());
		this.pv1.getPv111_TemporaryLocation().getPl2_Room().setValue(pv1_11_temporaryLocation.getPl_2_room());
		this.pv1.getPv111_TemporaryLocation().getPl3_Bed().setValue(pv1_11_temporaryLocation.getPl_3_bed());
		this.pv1.getPv111_TemporaryLocation().getPl4_Facility().getHd1_NamespaceID().setValue(pv1_11_temporaryLocation.getPl_4_facility().getHd_1_namespaceId());
		this.pv1.getPv111_TemporaryLocation().getPl4_Facility().getHd2_UniversalID().setValue(pv1_11_temporaryLocation.getPl_4_facility().getHd_2_universalId());
		this.pv1.getPv111_TemporaryLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(pv1_11_temporaryLocation.getPl_4_facility().getHd_3_universalIdType());
		this.pv1.getPv111_TemporaryLocation().getPl5_LocationStatus().setValue(pv1_11_temporaryLocation.getPl_5_locationStatus());
		this.pv1.getPv111_TemporaryLocation().getPl6_PersonLocationType().setValue(pv1_11_temporaryLocation.getPl_6_personLocationType());
		this.pv1.getPv111_TemporaryLocation().getPl7_Building().setValue(pv1_11_temporaryLocation.getPl_7_building()); 
		this.pv1.getPv111_TemporaryLocation().getPl8_Floor().setValue(pv1_11_temporaryLocation.getPl_8_floor());
		this.pv1.getPv111_TemporaryLocation().getPl9_LocationDescription().setValue(pv1_11_temporaryLocation.getPl_9_locationDescription());
		this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(pv1_11_temporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(pv1_11_temporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId());
		this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(pv1_11_temporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.pv1.getPv111_TemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(pv1_11_temporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.pv1.getPv111_TemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(pv1_11_temporaryLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.pv1.getPv111_TemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(pv1_11_temporaryLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.pv1.getPv111_TemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(pv1_11_temporaryLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.pv1_11_temporaryLocation = pv1_11_temporaryLocation;
	}
	/**
	 * @return the pv1_12_preadmitTestIndicator
	 */
	
	@JsonProperty("pv1_12_preadmitTestIndicator")
	public String getPv1_12_preadmitTestIndicator() {
		return this.pv1.getPv112_PreadmitTestIndicator().getValue();
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
	 * @return the pv1_13_reAdmissionIndicator
	 */
	
	@JsonProperty("pv1_13_reAdmissionIndicator")
	public String getPv1_13_reAdmissionIndicator() {
		return this.pv1.getPv113_ReAdmissionIndicator().getValue();
	}
	/**
	 * @param pv1_13_reAdmissionIndicator the pv1_13_reAdmissionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_13_reAdmissionIndicator")
	public void setPv1_13_reAdmissionIndicator(String pv1_13_reAdmissionIndicator) throws DataTypeException {
		this.pv1.getPv113_ReAdmissionIndicator().setValue(pv1_13_reAdmissionIndicator);
		this.pv1_13_reAdmissionIndicator = pv1_13_reAdmissionIndicator;
	}
	/**
	 * @return the pv1_14_admitSource
	 */
	
	@JsonProperty("pv1_14_admitSource")
	public String getPv1_14_admitSource() {
		return this.pv1.getPv114_AdmitSource().getValue();
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
	 * @return the pv1_15_ambulatoryStatus
	 */
	
	@JsonProperty("pv1_15_ambulatoryStatus")
	public String[] getPv1_15_ambulatoryStatus() {
		String[] ambulatoryStatus = new String[this.pv1.getPv115_AmbulatoryStatus().length];
		for(int i = 0; i < this.pv1.getPv115_AmbulatoryStatus().length;i++) {
			ambulatoryStatus[i] = this.pv1.getPv115_AmbulatoryStatus(i).getValue();
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
	 * @return the pv1_16_VIPIndicator
	 */
	
	@JsonProperty("pv1_16_VIPIndicator")
	public String getPv1_16_VIPIndicator() {
		return this.pv1.getPv116_VIPIndicator().getValue();
	}
	/**
	 * @param pv1_16_VIPIndicator the pv1_16_VIPIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_16_VIPIndicator")
	public void setPv1_16_VIPIndicator(String pv1_16_VIPIndicator) throws DataTypeException {
		this.pv1.getPv116_VIPIndicator().setValue(pv1_16_VIPIndicator);
		this.pv1_16_VIPIndicator = pv1_16_VIPIndicator;
	}
	/**
	 * @return the pv1_17_admittingDoctor
	 */
	
	@JsonProperty("pv1_17_admittingDoctor")
	public XCN_v25[] getPv1_17_admittingDoctor() {
		XCN_v25[] admittingDoctor = new XCN_v25[this.pv1.getPv117_AdmittingDoctor().length];
		for(int i =0; i< this.pv1.getPv117_AdmittingDoctor().length; i++) {
			admittingDoctor[i] = new XCN_v25(
					this.pv1.getPv117_AdmittingDoctor(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn3_GivenName().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn6_PrefixEgDR().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn7_DegreeEgMD().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn10_NameTypeCode().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn12_CheckDigitScheme().getValue(),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn15_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs1_Time().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pv1.getPv117_AdmittingDoctor(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return admittingDoctor;
	}
	/**
	 * @param pv1_17_admittingDoctor the pv1_17_admittingDoctor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_17_admittingDoctor")
	public void setPv1_17_admittingDoctor(XCN_v25[] pv1_17_admittingDoctor) throws DataTypeException {
		for(int i =0; i< pv1_17_admittingDoctor.length; i++) {
			this.pv1.getPv117_AdmittingDoctor(i).getXcn1_IDNumber().setValue(pv1_17_admittingDoctor[i].getXcn_1_idNumber());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn1_Surname().setValue(pv1_17_admittingDoctor[i].getXcn_2_familyName().getFn_1_surname());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pv1_17_admittingDoctor[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pv1_17_admittingDoctor[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pv1_17_admittingDoctor[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pv1_17_admittingDoctor[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn3_GivenName().setValue(pv1_17_admittingDoctor[i].getXcn_3_givenName());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pv1_17_admittingDoctor[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn5_SuffixEgJRorIII().setValue(pv1_17_admittingDoctor[i].getXcn_5_suffixegJrOrIii());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn6_PrefixEgDR().setValue(pv1_17_admittingDoctor[i].getXcn_6_prefixegDr());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn7_DegreeEgMD().setValue(pv1_17_admittingDoctor[i].getXcn_7_degreeegMd());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn8_SourceTable().setValue(pv1_17_admittingDoctor[i].getXcn_8_sourceTable());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_17_admittingDoctor[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pv1_17_admittingDoctor[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_17_admittingDoctor[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn10_NameTypeCode().setValue(pv1_17_admittingDoctor[i].getXcn_10_nameTypeCode());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn11_IdentifierCheckDigit().setValue(pv1_17_admittingDoctor[i].getXcn_11_identifierCheckDigit());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn12_CheckDigitScheme().setValue(pv1_17_admittingDoctor[i].getXcn_12_checkDigitScheme());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn13_IdentifierTypeCode().setValue(pv1_17_admittingDoctor[i].getXcn_13_identifierTypeCode());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pv1_17_admittingDoctor[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pv1_17_admittingDoctor[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_17_admittingDoctor[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn15_NameRepresentationCode().setValue(pv1_17_admittingDoctor[i].getXcn_15_nameRepresentationCode());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe1_Identifier().setValue(pv1_17_admittingDoctor[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe2_Text().setValue(pv1_17_admittingDoctor[i].getXcn_16_nameContext().getCe_2_text());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pv1_17_admittingDoctor[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pv1_17_admittingDoctor[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pv1_17_admittingDoctor[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pv1_17_admittingDoctor[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pv1_17_admittingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pv1_17_admittingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pv1_17_admittingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pv1_17_admittingDoctor[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn18_NameAssemblyOrder().setValue(pv1_17_admittingDoctor[i].getXcn_18_nameAssemblyOrder());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pv1_17_admittingDoctor[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_17_admittingDoctor[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pv1_17_admittingDoctor[i].getXcn_20_expirationDate().getTs_1_time());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pv1_17_admittingDoctor[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn21_ProfessionalSuffix().setValue(pv1_17_admittingDoctor[i].getXcn_21_professionalSuffix());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_17_admittingDoctor[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv117_AdmittingDoctor(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_17_admittingDoctor[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pv1_17_admittingDoctor = pv1_17_admittingDoctor;
	}
	/**
	 * @return the pv1_18_patientType
	 */
	
	@JsonProperty("pv1_18_patientType")
	public String getPv1_18_patientType() {
		return this.pv1.getPv118_PatientType().getValue();
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
	 * @return the pv1_19_visitNumber
	 */
	@JsonProperty("pv1_19_visitNumber")
	public CX_v25 getPv1_19_visitNumber() {
		return new CX_v25(
				this.pv1.getPv119_VisitNumber().getCx1_IDNumber().getValue(), 
				this.pv1.getPv119_VisitNumber().getCx2_CheckDigit().getValue(),
				this.pv1.getPv119_VisitNumber().getCx3_CheckDigitScheme().getValue(), 
				new HD_v2(
						this.pv1.getPv119_VisitNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv119_VisitNumber().getCx5_IdentifierTypeCode().getValue(), 
				new HD_v2(
						this.pv1.getPv119_VisitNumber().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv119_VisitNumber().getCx7_EffectiveDate().getValue(), 
				this.pv1.getPv119_VisitNumber().getCx8_ExpirationDate().getValue(), 
				new CWE_v25(
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()), 
				new CWE_v25(
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(), 
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param pv1_19_visitNumber the pv1_19_visitNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_19_visitNumber")
	public void setPv1_19_visitNumber(CX_v25 pv1_19_visitNumber) throws DataTypeException {
		this.pv1.getPv119_VisitNumber().getCx1_IDNumber().setValue(pv1_19_visitNumber.getCx_1_idNumber()); 
		this.pv1.getPv119_VisitNumber().getCx2_CheckDigit().setValue(pv1_19_visitNumber.getCx_2_checkDigit());
		this.pv1.getPv119_VisitNumber().getCx3_CheckDigitScheme().setValue(pv1_19_visitNumber.getCx_3_checkDigitScheme());
		this.pv1.getPv119_VisitNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_19_visitNumber.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.pv1.getPv119_VisitNumber().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pv1_19_visitNumber.getCx_4_assigningAuthority().getHd_2_universalId());
		this.pv1.getPv119_VisitNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_19_visitNumber.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.pv1.getPv119_VisitNumber().getCx5_IdentifierTypeCode().setValue(pv1_19_visitNumber.getCx_5_identifierTypeCode());
		this.pv1.getPv119_VisitNumber().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pv1_19_visitNumber.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.pv1.getPv119_VisitNumber().getCx6_AssigningFacility().getHd2_UniversalID().setValue(pv1_19_visitNumber.getCx_6_assigningFacility().getHd_2_universalId());
		this.pv1.getPv119_VisitNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_19_visitNumber.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.pv1.getPv119_VisitNumber().getCx7_EffectiveDate().setValue(pv1_19_visitNumber.getCx_7_effectiveDate());
		this.pv1.getPv119_VisitNumber().getCx8_ExpirationDate().setValue(pv1_19_visitNumber.getCx_8_expirationDate());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.pv1.getPv119_VisitNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_19_visitNumber.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_2_text()); 
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.pv1.getPv119_VisitNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_19_visitNumber.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.pv1_19_visitNumber = pv1_19_visitNumber;
	}
	/**
	 * @return the pv1_20_financialClass
	 */
	
	@JsonProperty("pv1_20_financialClass")
	public FC_v23[] getPv1_20_financialClass() {
		FC_v23[] financialClass = new FC_v23[this.pv1.getPv120_FinancialClass().length];
		for(int i = 0; i < this.pv1.getPv120_FinancialClass().length; i++) {
			financialClass[i] = new FC_v23(
					this.pv1.getPv120_FinancialClass(i).getFc1_FinancialClassCode().getValue(),
					new TS_v2(
							this.pv1.getPv120_FinancialClass(i).getFc2_EffectiveDate().getTs1_Time().getValue(),
							this.pv1.getPv120_FinancialClass(i).getFc2_EffectiveDate().getTs2_DegreeOfPrecision().getValue()));
		}
		return financialClass;
	}
	
	/**
	 * @param pv1_20_financialClass the pv1_20_financialClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_20_financialClass")
	public void setPv1_20_financialClass(FC_v23[] pv1_20_financialClass) throws DataTypeException {
		for(int i = 0; i < this.pv1.getPv120_FinancialClass().length; i++) {
			this.pv1.getPv120_FinancialClass(i).getFc1_FinancialClassCode().setValue(pv1_20_financialClass[i].getFc_1_financialClass());
			this.pv1.getPv120_FinancialClass(i).getFc2_EffectiveDate().getTs1_Time().setValue(pv1_20_financialClass[i].getTs_fc_2_effectiveDate().getTs_1_time());
			this.pv1.getPv120_FinancialClass(i).getFc2_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_20_financialClass[i].getTs_fc_2_effectiveDate().getTs_2_degreeOfPrecision());
		}
		this.pv1_20_financialClass = pv1_20_financialClass;
	}
	/**
	 * @return the pv1_21_chargePriceIndicator
	 */
	
	@JsonProperty("pv1_21_chargePriceIndicator")
	public String getPv1_21_chargePriceIndicator() {
		return this.pv1.getPv121_ChargePriceIndicator().getValue();
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
	 * @return the pv1_22_courtesyCode
	 */
	@JsonProperty("pv1_22_courtesyCode")
	public String getPv1_22_courtesyCode() {
		return this.pv1.getPv122_CourtesyCode().getValue();
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
	 * @return the pv1_23_creditRating
	 */
	
	@JsonProperty("pv1_23_creditRating")
	public String getPv1_23_creditRating() {
		return this.pv1.getPv123_CreditRating().getValue();
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
	 * @return the pv1_24_contractCode
	 */
	
	@JsonProperty("pv1_24_contractCode")
	public String[] getPv1_24_contractCode() {
		String[] contractCode = new String[this.pv1.getPv124_ContractCode().length];
		for(int i = 0; i <this.pv1.getPv124_ContractCode().length; i++) {
			contractCode[i] = this.pv1.getPv124_ContractCode(i).getValue();
		}
		return contractCode;
	}
	/**
	 * @param pv1_24_contractCode the pv1_24_contractCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_24_contractCode")
	public void setPv1_24_contractCode(String[] pv1_24_contractCode) throws DataTypeException {
		for(int i = 0; i <pv1_24_contractCode.length; i++) {
			this.pv1.getPv124_ContractCode(i).setValue(pv1_24_contractCode[i]);
		}
		this.pv1_24_contractCode = pv1_24_contractCode;
	}
	/**
	 * @return the pv1_25_contractEffectiveDate
	 */
	
	@JsonProperty("pv1_25_contractEffectiveDate")
	public String[] getPv1_25_contractEffectiveDate() {
		String[] contractEffectiveDate = new String[this.pv1.getPv125_ContractEffectiveDate().length];
		for(int i = 0; i < this.pv1.getPv125_ContractEffectiveDate().length; i++) {
			contractEffectiveDate[i] = this.pv1.getPv125_ContractEffectiveDate(i).getValue();
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
			this.pv1.getPv125_ContractEffectiveDate(i).setValue(pv1_25_contractEffectiveDate[i]);
		}
		this.pv1_25_contractEffectiveDate = pv1_25_contractEffectiveDate;
	}
	/**
	 * @return the pv1_26_contractAmount
	 */
	
	@JsonProperty("pv1_26_contractAmount")
	public String[] getPv1_26_contractAmount() {
		String[] contractAmount = new String[this.pv1.getPv126_ContractAmount().length];
		for(int i = 0; i< this.pv1.getPv126_ContractAmount().length;i++) {
			contractAmount[i] =  this.pv1.getPv126_ContractAmount(i).getValue();
		}
		return contractAmount;
	}
	/**
	 * @param pv1_26_contractAmount the pv1_26_contractAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_26_contractAmount")
	public void setPv1_26_contractAmount(String[] pv1_26_contractAmount) throws DataTypeException {
		for(int i = 0; i< pv1_26_contractAmount.length;i++) {
			this.pv1.getPv126_ContractAmount(i).setValue(pv1_26_contractAmount[i]);
		}
		this.pv1_26_contractAmount = pv1_26_contractAmount;
	}
	/**
	 * @return the pv1_27_contractPeriod
	 */
	
	@JsonProperty("pv1_27_contractPeriod")
	public String[] getPv1_27_contractPeriod() {
		String[] contractPeriod = new String[this.pv1.getPv127_ContractPeriod().length];
		for(int i = 0; i < this.pv1.getPv127_ContractPeriod().length; i++) {
			contractPeriod[i] = this.pv1.getPv127_ContractPeriod(i).getValue();
		}
		return contractPeriod;
	}
	/**
	 * @param pv1_27_contractPeriod the pv1_27_contractPeriod to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_27_contractPeriod")
	public void setPv1_27_contractPeriod(String[] pv1_27_contractPeriod) throws DataTypeException {
		for(int i = 0; i < pv1_27_contractPeriod.length; i++) {
			this.pv1.getPv127_ContractPeriod(i).setValue(pv1_27_contractPeriod[i]);
		}
		this.pv1_27_contractPeriod = pv1_27_contractPeriod;
	}
	/**
	 * @return the pv1_28_interestCode
	 */
	
	@JsonProperty("pv1_28_interestCode")
	public String getPv1_28_interestCode() {
		return this.pv1.getPv128_InterestCode().getValue();
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
	 * @return the pv1_29_transfertoBadDebtCode
	 */
	
	@JsonProperty("pv1_29_transfertoBadDebtCode")
	public String getPv1_29_transfertoBadDebtCode() {
		this.pv1.getPv129_TransferToBadDebtCode().getValue();
		return pv1_29_transfertoBadDebtCode;
	}
	/**
	 * @param pv1_29_transfertoBadDebtCode the pv1_29_transfertoBadDebtCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_29_transfertoBadDebtCode")
	public void setPv1_29_transfertoBadDebtCode(String pv1_29_transfertoBadDebtCode) throws DataTypeException {
		this.pv1.getPv129_TransferToBadDebtCode().setValue(pv1_29_transfertoBadDebtCode);
		this.pv1_29_transfertoBadDebtCode = pv1_29_transfertoBadDebtCode;
	}
	/**
	 * @return the pv1_30_transfertoBadDebtDate
	 */
	
	@JsonProperty("pv1_30_transfertoBadDebtDate")
	public String getPv1_30_transfertoBadDebtDate() {
		return this.pv1.getPv130_TransferToBadDebtDate().getValue();
	}
	/**
	 * @param pv1_30_transfertoBadDebtDate the pv1_30_transfertoBadDebtDate to set
	 * @JsonProperty("pv1_30_transfertoBadDebtDate")
	 * @throws DataTypeException 
	 */
	public void setPv1_30_transfertoBadDebtDate(String pv1_30_transfertoBadDebtDate) throws DataTypeException {
		this.pv1.getPv130_TransferToBadDebtDate().setValue(pv1_30_transfertoBadDebtDate);
		this.pv1_30_transfertoBadDebtDate = pv1_30_transfertoBadDebtDate;
	}
	/**
	 * @return the pv1_31_badDebtAgencyCode
	 */
	
	@JsonProperty("pv1_31_badDebtAgencyCode")
	public String getPv1_31_badDebtAgencyCode() {
		return this.pv1.getPv131_BadDebtAgencyCode().getValue();
	}
	/**
	 * @param pv1_31_badDebtAgencyCode the pv1_31_badDebtAgencyCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_31_badDebtAgencyCode")
	public void setPv1_31_badDebtAgencyCode(String pv1_31_badDebtAgencyCode) throws DataTypeException {
		this.pv1.getPv130_TransferToBadDebtDate().setValue(pv1_31_badDebtAgencyCode);
		this.pv1_31_badDebtAgencyCode = pv1_31_badDebtAgencyCode;
	}
	/**
	 * @return the pv1_32_badDebtTransferAmount
	 */
	
	@JsonProperty("pv1_32_badDebtTransferAmount")
	public String getPv1_32_badDebtTransferAmount() {
		return this.pv1.getPv132_BadDebtTransferAmount().getValue();
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
	 * @return the pv1_33_badDebtRecoveryAmount
	 */
	
	@JsonProperty("pv1_33_badDebtRecoveryAmount")
	public String getPv1_33_badDebtRecoveryAmount() {
		return this.pv1.getPv133_BadDebtRecoveryAmount().getValue();
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
	 * @return the pv1_34_deleteAccountIndicator
	 */
	
	@JsonProperty("pv1_34_deleteAccountIndicator")
	public String getPv1_34_deleteAccountIndicator() {
		return this.pv1.getPv134_DeleteAccountIndicator().getValue();
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
	 * @return the pv1_35_deleteAccountDate
	 */
	
	@JsonProperty("pv1_35_deleteAccountDate")
	public String getPv1_35_deleteAccountDate() {
		return this.pv1.getPv135_DeleteAccountDate().getValue();
	}
	/**
	 * @param pv1_35_deleteAccountDate the pv1_35_deleteAccountDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_35_deleteAccountDate")
	public void setPv1_35_deleteAccountDate(String pv1_35_deleteAccountDate) throws DataTypeException {
		this.pv1.getPv134_DeleteAccountIndicator().setValue(pv1_35_deleteAccountDate);
		this.pv1_35_deleteAccountDate = pv1_35_deleteAccountDate;
	}
	/**
	 * @return the pv1_36_dischargeDisposition
	 */
	
	@JsonProperty("pv1_36_dischargeDisposition")
	public String getPv1_36_dischargeDisposition() {
		return this.pv1.getPv136_DischargeDisposition().getValue();
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
	 * @return the pv1_37_dischargedtoLocation
	 */
	
	@JsonProperty("pv1_37_dischargedtoLocation")
	public DLD_v25 getPv1_37_dischargedtoLocation() {
		return new DLD_v25(
				this.pv1.getPv137_DischargedToLocation().getDld1_DischargeLocation().getValue(),
				new TS_v2(
						this.pv1.getPv137_DischargedToLocation().getDld2_EffectiveDate().getTs1_Time().getValue(),
						this.pv1.getPv137_DischargedToLocation().getDld2_EffectiveDate().getTs2_DegreeOfPrecision().getValue()));
	}
	/**
	 * @param pv1_37_dischargedtoLocation the pv1_37_dischargedtoLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_37_dischargedtoLocation")
	public void setPv1_37_dischargedtoLocation(DLD_v25 pv1_37_dischargedtoLocation) throws DataTypeException {
		this.pv1.getPv137_DischargedToLocation().getDld1_DischargeLocation().setValue(pv1_37_dischargedtoLocation.getDld_1_dischargeLocation());
		this.pv1.getPv137_DischargedToLocation().getDld2_EffectiveDate().getTs1_Time().setValue(pv1_37_dischargedtoLocation.getDld_2_effectiveDate().getTs_1_time());
		this.pv1.getPv137_DischargedToLocation().getDld2_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_37_dischargedtoLocation.getDld_2_effectiveDate().getTs_2_degreeOfPrecision());
		this.pv1_37_dischargedtoLocation = pv1_37_dischargedtoLocation;
	}
	/**
	 * @return the pv1_38_dietType
	 */
	
	@JsonProperty("pv1_38_dietType")
	public CE_v2 getPv1_38_dietType() {
		return new CE_v2(
				this.pv1.getPv138_DietType().getCe1_Identifier().getValue(),
				this.pv1.getPv138_DietType().getCe2_Text().getValue(),
				this.pv1.getPv138_DietType().getCe3_NameOfCodingSystem().getValue(), 
				this.pv1.getPv138_DietType().getCe4_AlternateIdentifier().getValue(), 
				this.pv1.getPv138_DietType().getCe5_AlternateText().getValue(), 
				this.pv1.getPv138_DietType().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pv1_38_dietType the pv1_38_dietType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_38_dietType")
	public void setPv1_38_dietType(CE_v2 pv1_38_dietType) throws DataTypeException {
		this.pv1.getPv138_DietType().getCe1_Identifier().setValue(pv1_38_dietType.getCe_1_identifier());
		this.pv1.getPv138_DietType().getCe2_Text().setValue(pv1_38_dietType.getCe_2_text());
		this.pv1.getPv138_DietType().getCe3_NameOfCodingSystem().setValue(pv1_38_dietType.getCe_3_nameOfCodingSystem());
		this.pv1.getPv138_DietType().getCe4_AlternateIdentifier().setValue(pv1_38_dietType.getCe_4_alternateIdentifier());
		this.pv1.getPv138_DietType().getCe5_AlternateText().setValue(pv1_38_dietType.getCe_5_alternateText());
		this.pv1.getPv138_DietType().getCe6_NameOfAlternateCodingSystem().setValue(pv1_38_dietType.getCe_6_nameOfAlternateCodingSystem());
		this.pv1_38_dietType = pv1_38_dietType;
	}
	/**
	 * @return the pv1_39_servicingFacility
	 */
	
	@JsonProperty("pv1_39_servicingFacility")
	public String getPv1_39_servicingFacility() {
		return this.pv1.getPv139_ServicingFacility().getValue();
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
	 * @return the pv1_40_bedStatus
	 */
	
	@JsonProperty("pv1_40_bedStatus")
	public String getPv1_40_bedStatus() {
		return this.pv1.getPv140_BedStatus().getValue();
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
	 * @return the pv1_41_accountStatus
	 */
	
	@JsonProperty("pv1_41_accountStatus")
	public String getPv1_41_accountStatus() {
		return this.pv1.getPv141_AccountStatus().getValue();
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
	 * @return the pv1_42_pendingLocation
	 */
	
	@JsonProperty("pv1_42_pendingLocation")
	public PL_v25 getPv1_42_pendingLocation() {
		return new PL_v25(
				this.pv1.getPv142_PendingLocation().getPl1_PointOfCare().getValue(),
				this.pv1.getPv142_PendingLocation().getPl2_Room().getValue(), 
				this.pv1.getPv142_PendingLocation().getPl3_Bed().getValue(), 
				new HD_v2(
						this.pv1.getPv142_PendingLocation().getPl4_Facility().getHd1_NamespaceID().getValue(), 
						this.pv1.getPv142_PendingLocation().getPl4_Facility().getHd2_UniversalID().getValue(), 
						this.pv1.getPv142_PendingLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv142_PendingLocation().getPl5_LocationStatus().getValue(), 
				this.pv1.getPv142_PendingLocation().getPl6_PersonLocationType().getValue(), 
				this.pv1.getPv142_PendingLocation().getPl7_Building().getValue(), 
				this.pv1.getPv142_PendingLocation().getPl8_Floor().getValue(), 
				this.pv1.getPv142_PendingLocation().getPl9_LocationDescription().getValue(), 
				new EI_v2(
						this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(), 
						this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(), 
						this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()), 
				new HD_v2(
						this.pv1.getPv142_PendingLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.pv1.getPv142_PendingLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(), 
						this.pv1.getPv142_PendingLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param pv1_42_pendingLocation the pv1_42_pendingLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_42_pendingLocation")
	public void setPv1_42_pendingLocation(PL_v25 pv1_42_pendingLocation) throws DataTypeException {
		this.pv1.getPv142_PendingLocation().getPl1_PointOfCare().setValue(pv1_42_pendingLocation.getPl_1_pointOfCare());
		this.pv1.getPv142_PendingLocation().getPl2_Room().setValue(pv1_42_pendingLocation.getPl_2_room()); 
		this.pv1.getPv142_PendingLocation().getPl3_Bed().setValue(pv1_42_pendingLocation.getPl_3_bed());
		this.pv1.getPv142_PendingLocation().getPl4_Facility().getHd1_NamespaceID().setValue(pv1_42_pendingLocation.getPl_4_facility().getHd_1_namespaceId());
		this.pv1.getPv142_PendingLocation().getPl4_Facility().getHd2_UniversalID().setValue(pv1_42_pendingLocation.getPl_4_facility().getHd_2_universalId());
		this.pv1.getPv142_PendingLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(pv1_42_pendingLocation.getPl_4_facility().getHd_3_universalIdType());
		this.pv1.getPv142_PendingLocation().getPl5_LocationStatus().setValue(pv1_42_pendingLocation.getPl_5_locationStatus());
		this.pv1.getPv142_PendingLocation().getPl6_PersonLocationType().setValue(pv1_42_pendingLocation.getPl_6_personLocationType());
		this.pv1.getPv142_PendingLocation().getPl7_Building().setValue(pv1_42_pendingLocation.getPl_7_building());
		this.pv1.getPv142_PendingLocation().getPl8_Floor().setValue(pv1_42_pendingLocation.getPl_8_floor());
		this.pv1.getPv142_PendingLocation().getPl9_LocationDescription().setValue(pv1_42_pendingLocation.getPl_9_locationDescription());
		this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(pv1_42_pendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(pv1_42_pendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId()); 
		this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(pv1_42_pendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.pv1.getPv142_PendingLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(pv1_42_pendingLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.pv1.getPv142_PendingLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(pv1_42_pendingLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.pv1.getPv142_PendingLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(pv1_42_pendingLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.pv1.getPv142_PendingLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(pv1_42_pendingLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		
		this.pv1_42_pendingLocation = pv1_42_pendingLocation;
	}
	/**
	 * @return the pv1_43_priorTemporaryLocation
	 *	@JsonProperty("pv1_43_priorTemporaryLocation")
	 */
	
	public PL_v25 getPv1_43_priorTemporaryLocation() {
		return new PL_v25(
				this.pv1.getPv143_PriorTemporaryLocation().getPl1_PointOfCare().getValue(),
				this.pv1.getPv143_PriorTemporaryLocation().getPl2_Room().getValue(), 
				this.pv1.getPv143_PriorTemporaryLocation().getPl3_Bed().getValue(), 
				new HD_v2(
						this.pv1.getPv143_PriorTemporaryLocation().getPl4_Facility().getHd1_NamespaceID().getValue(), 
						this.pv1.getPv143_PriorTemporaryLocation().getPl4_Facility().getHd2_UniversalID().getValue(), 
						this.pv1.getPv143_PriorTemporaryLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()), 
				this.pv1.getPv143_PriorTemporaryLocation().getPl5_LocationStatus().getValue(), 
				this.pv1.getPv143_PriorTemporaryLocation().getPl6_PersonLocationType().getValue(), 
				this.pv1.getPv143_PriorTemporaryLocation().getPl7_Building().getValue(), 
				this.pv1.getPv143_PriorTemporaryLocation().getPl8_Floor().getValue(), 
				this.pv1.getPv143_PriorTemporaryLocation().getPl9_LocationDescription().getValue(), 
				new EI_v2(
						this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(), 
						this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(), 
						this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()), 
				new HD_v2(
						this.pv1.getPv143_PriorTemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.pv1.getPv143_PriorTemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(), 
						this.pv1.getPv143_PriorTemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param pv1_43_priorTemporaryLocation the pv1_43_priorTemporaryLocation to set
	 * @JsonProperty("pv1_43_priorTemporaryLocation")
	 * @throws DataTypeException 
	 */
	public void setPv1_43_priorTemporaryLocation(PL_v25 pv1_43_priorTemporaryLocation) throws DataTypeException {
		this.pv1.getPv143_PriorTemporaryLocation().getPl1_PointOfCare().setValue(pv1_43_priorTemporaryLocation.getPl_1_pointOfCare());
		this.pv1.getPv143_PriorTemporaryLocation().getPl2_Room().setValue(pv1_43_priorTemporaryLocation.getPl_2_room()); 
		this.pv1.getPv143_PriorTemporaryLocation().getPl3_Bed().setValue(pv1_43_priorTemporaryLocation.getPl_3_bed());
		this.pv1.getPv143_PriorTemporaryLocation().getPl4_Facility().getHd1_NamespaceID().setValue(pv1_43_priorTemporaryLocation.getPl_4_facility().getHd_1_namespaceId());
		this.pv1.getPv143_PriorTemporaryLocation().getPl4_Facility().getHd2_UniversalID().setValue(pv1_43_priorTemporaryLocation.getPl_4_facility().getHd_2_universalId());
		this.pv1.getPv143_PriorTemporaryLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(pv1_43_priorTemporaryLocation.getPl_4_facility().getHd_3_universalIdType());
		this.pv1.getPv143_PriorTemporaryLocation().getPl5_LocationStatus().setValue(pv1_43_priorTemporaryLocation.getPl_5_locationStatus());
		this.pv1.getPv143_PriorTemporaryLocation().getPl6_PersonLocationType().setValue(pv1_43_priorTemporaryLocation.getPl_6_personLocationType());
		this.pv1.getPv143_PriorTemporaryLocation().getPl7_Building().setValue(pv1_43_priorTemporaryLocation.getPl_7_building());
		this.pv1.getPv143_PriorTemporaryLocation().getPl8_Floor().setValue(pv1_43_priorTemporaryLocation.getPl_8_floor());
		this.pv1.getPv143_PriorTemporaryLocation().getPl9_LocationDescription().setValue(pv1_43_priorTemporaryLocation.getPl_9_locationDescription());
		this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(pv1_43_priorTemporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(pv1_43_priorTemporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId()); 
		this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(pv1_43_priorTemporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.pv1.getPv143_PriorTemporaryLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(pv1_43_priorTemporaryLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.pv1.getPv143_PriorTemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(pv1_43_priorTemporaryLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.pv1.getPv143_PriorTemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(pv1_43_priorTemporaryLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.pv1.getPv143_PriorTemporaryLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(pv1_43_priorTemporaryLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.pv1_43_priorTemporaryLocation = pv1_43_priorTemporaryLocation;
	}
	/**
	 * @return the pv1_44_admitDateTime
	 *	@JsonProperty("pv1_44_admitDateTime")
	 */
	
	public TS_v2 getPv1_44_admitDateTime() {
		return new TS_v2(
				this.pv1.getPv144_AdmitDateTime().getTs1_Time().getValue(),
				this.pv1.getPv144_AdmitDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pv1_44_admitDateTime the pv1_44_admitDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_44_admitDateTime")
	public void setPv1_44_admitDateTime(TS_v2 pv1_44_admitDateTime) throws DataTypeException {
		this.pv1.getPv144_AdmitDateTime().getTs1_Time().setValue(pv1_44_admitDateTime.getTs_1_time());
		this.pv1.getPv144_AdmitDateTime().getTs2_DegreeOfPrecision().setValue(pv1_44_admitDateTime.getTs_2_degreeOfPrecision());
		this.pv1_44_admitDateTime = pv1_44_admitDateTime;
	}
	/**
	 * @return the pv1_45_dischargeDateTime
	 */
	
	@JsonProperty("pv1_45_dischargeDateTime")
	public TS_v2[] getPv1_45_dischargeDateTime() {
		TS_v2[] dischargeDateTime = new TS_v2[this.pv1.getPv145_DischargeDateTime().length];
		for(int i = 0;  i < this.pv1.getPv145_DischargeDateTime().length;i++) {
			dischargeDateTime[i] = new TS_v2(
					this.pv1.getPv145_DischargeDateTime(i).getTs1_Time().getValue(),
					this.pv1.getPv145_DischargeDateTime(i).getTs2_DegreeOfPrecision().getValue());
		}
		return dischargeDateTime;
	}
	/**
	 * @param pv1_45_dischargeDateTime the pv1_45_dischargeDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_45_dischargeDateTime")
	public void setPv1_45_dischargeDateTime(TS_v2[] pv1_45_dischargeDateTime) throws DataTypeException {
		for(int i = 0;  i < pv1_45_dischargeDateTime.length;i++) {
			this.pv1.getPv145_DischargeDateTime(i).getTs1_Time().setValue(pv1_45_dischargeDateTime[i].getTs_1_time());
			this.pv1.getPv145_DischargeDateTime(i).getTs2_DegreeOfPrecision().setValue(pv1_45_dischargeDateTime[i].getTs_2_degreeOfPrecision());
		}
		this.pv1_45_dischargeDateTime = pv1_45_dischargeDateTime;
	}
	/**
	 * @return the pv1_46_currentPatientBalance
	 */
	
	@JsonProperty("pv1_46_currentPatientBalance")
	public String getPv1_46_currentPatientBalance() {
		return this.pv1.getPv146_CurrentPatientBalance().getValue();
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
	 * @return the pv1_47_totalCharges
	 *	@JsonProperty("pv1_47_totalCharges")
	 */
	
	public String getPv1_47_totalCharges() {
		return this.pv1.getPv147_TotalCharges().getValue();
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
	 * @return the pv1_48_totalAdjustments
	 */
	
	@JsonProperty("pv1_48_totalAdjustments")
	public String getPv1_48_totalAdjustments() {
		return this.pv1.getPv148_TotalAdjustments().getValue();
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
	 * @return the pv1_49_totalPayments
	 */
	
	@JsonProperty("pv1_49_totalPayments")
	public String getPv1_49_totalPayments() {
		return this.pv1.getPv149_TotalPayments().getValue();
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
	 * @return the pv1_50_alternateVisit
	 */
	
	@JsonProperty("pv1_50_alternateVisit")
	public CX_v25 getPv1_50_alternateVisit() {
		return new CX_v25(
				this.pv1.getPv150_AlternateVisitID().getCx1_IDNumber().getValue(),
				this.pv1.getPv150_AlternateVisitID().getCx2_CheckDigit().getValue(),
				this.pv1.getPv150_AlternateVisitID().getCx3_CheckDigitScheme().getValue(),
				new HD_v2(
						this.pv1.getPv150_AlternateVisitID().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(), 
						this.pv1.getPv150_AlternateVisitID().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
				this.pv1.getPv150_AlternateVisitID().getCx5_IdentifierTypeCode().getValue(),
				new HD_v2(
						this.pv1.getPv150_AlternateVisitID().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
				this.pv1.getPv150_AlternateVisitID().getCx7_EffectiveDate().getValue(),
				this.pv1.getPv150_AlternateVisitID().getCx8_ExpirationDate().getValue(),
				new CWE_v25(
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(), 
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(), 
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param pv1_50_alternateVisit the pv1_50_alternateVisit to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_50_alternateVisit")
	public void setPv1_50_alternateVisit(CX_v25 pv1_50_alternateVisit) throws DataTypeException {
		this.pv1.getPv150_AlternateVisitID().getCx1_IDNumber().setValue(pv1_50_alternateVisit.getCx_1_idNumber());
		this.pv1.getPv150_AlternateVisitID().getCx2_CheckDigit().setValue(pv1_50_alternateVisit.getCx_2_checkDigit());
		this.pv1.getPv150_AlternateVisitID().getCx3_CheckDigitScheme().setValue(pv1_50_alternateVisit.getCx_3_checkDigitScheme());
		this.pv1.getPv150_AlternateVisitID().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_50_alternateVisit.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.pv1.getPv150_AlternateVisitID().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pv1_50_alternateVisit.getCx_4_assigningAuthority().getHd_2_universalId());
		this.pv1.getPv150_AlternateVisitID().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_50_alternateVisit.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.pv1.getPv150_AlternateVisitID().getCx5_IdentifierTypeCode().setValue(pv1_50_alternateVisit.getCx_5_identifierTypeCode());
		this.pv1.getPv150_AlternateVisitID().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pv1_50_alternateVisit.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.pv1.getPv150_AlternateVisitID().getCx6_AssigningFacility().getHd2_UniversalID().setValue(pv1_50_alternateVisit.getCx_6_assigningFacility().getHd_2_universalId());
		this.pv1.getPv150_AlternateVisitID().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_50_alternateVisit.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.pv1.getPv150_AlternateVisitID().getCx7_EffectiveDate().setValue(pv1_50_alternateVisit.getCx_7_effectiveDate());
		this.pv1.getPv150_AlternateVisitID().getCx8_ExpirationDate().setValue(pv1_50_alternateVisit.getCx_8_expirationDate());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.pv1.getPv150_AlternateVisitID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_50_alternateVisit.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.pv1.getPv150_AlternateVisitID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_50_alternateVisit.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.pv1_50_alternateVisit = pv1_50_alternateVisit;
	}
	/**
	 * @return the pv1_51_visitIndicator
	 */
	
	@JsonProperty("pv1_51_visitIndicator")
	public String getPv1_51_visitIndicator() {
		return this.pv1.getPv151_VisitIndicator().getValue();
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
	 * @return the pv1_52_otherHealthcareProvider
	 */
	@JsonProperty("pv1_52_otherHealthcareProvider")
	public XCN_v25[] getPv1_52_otherHealthcareProvider() {
		XCN_v25[] otherHealthcareProvider = new XCN_v25[this.pv1.getPv152_OtherHealthcareProvider().length];
		for(int i =0; i< this.pv1.getPv152_OtherHealthcareProvider().length; i++) {
			otherHealthcareProvider[i] = new XCN_v25(
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn3_GivenName().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn6_PrefixEgDR().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn7_DegreeEgMD().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn10_NameTypeCode().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn12_CheckDigitScheme().getValue(),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn15_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn19_EffectiveDate().getTs1_Time().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pv1.getPv152_OtherHealthcareProvider(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return otherHealthcareProvider;
	}
	/**
	 * @param pv1_52_otherHealthcareProvider the pv1_52_otherHealthcareProvider to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pv1_52_otherHealthcareProvider")
	public void setPv1_52_otherHealthcareProvider(XCN_v25[] pv1_52_otherHealthcareProvider) throws DataTypeException {
		for(int i =0; i< pv1_52_otherHealthcareProvider.length; i++) {
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn1_IDNumber().setValue(pv1_52_otherHealthcareProvider[i].getXcn_1_idNumber());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn1_Surname().setValue(pv1_52_otherHealthcareProvider[i].getXcn_2_familyName().getFn_1_surname());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pv1_52_otherHealthcareProvider[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pv1_52_otherHealthcareProvider[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pv1_52_otherHealthcareProvider[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pv1_52_otherHealthcareProvider[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn3_GivenName().setValue(pv1_52_otherHealthcareProvider[i].getXcn_3_givenName());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pv1_52_otherHealthcareProvider[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn5_SuffixEgJRorIII().setValue(pv1_52_otherHealthcareProvider[i].getXcn_5_suffixegJrOrIii());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn6_PrefixEgDR().setValue(pv1_52_otherHealthcareProvider[i].getXcn_6_prefixegDr());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn7_DegreeEgMD().setValue(pv1_52_otherHealthcareProvider[i].getXcn_7_degreeegMd());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn8_SourceTable().setValue(pv1_52_otherHealthcareProvider[i].getXcn_8_sourceTable());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pv1_52_otherHealthcareProvider[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn10_NameTypeCode().setValue(pv1_52_otherHealthcareProvider[i].getXcn_10_nameTypeCode());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn11_IdentifierCheckDigit().setValue(pv1_52_otherHealthcareProvider[i].getXcn_11_identifierCheckDigit());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn12_CheckDigitScheme().setValue(pv1_52_otherHealthcareProvider[i].getXcn_12_checkDigitScheme());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn13_IdentifierTypeCode().setValue(pv1_52_otherHealthcareProvider[i].getXcn_13_identifierTypeCode());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pv1_52_otherHealthcareProvider[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn15_NameRepresentationCode().setValue(pv1_52_otherHealthcareProvider[i].getXcn_15_nameRepresentationCode());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe1_Identifier().setValue(pv1_52_otherHealthcareProvider[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe2_Text().setValue(pv1_52_otherHealthcareProvider[i].getXcn_16_nameContext().getCe_2_text());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pv1_52_otherHealthcareProvider[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pv1_52_otherHealthcareProvider[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pv1_52_otherHealthcareProvider[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pv1_52_otherHealthcareProvider[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pv1_52_otherHealthcareProvider[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pv1_52_otherHealthcareProvider[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pv1_52_otherHealthcareProvider[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pv1_52_otherHealthcareProvider[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn18_NameAssemblyOrder().setValue(pv1_52_otherHealthcareProvider[i].getXcn_18_nameAssemblyOrder());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pv1_52_otherHealthcareProvider[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pv1_52_otherHealthcareProvider[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pv1_52_otherHealthcareProvider[i].getXcn_20_expirationDate().getTs_1_time());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pv1_52_otherHealthcareProvider[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn21_ProfessionalSuffix().setValue(pv1_52_otherHealthcareProvider[i].getXcn_21_professionalSuffix());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pv1_52_otherHealthcareProvider[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pv1.getPv152_OtherHealthcareProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pv1_52_otherHealthcareProvider[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pv1_52_otherHealthcareProvider = pv1_52_otherHealthcareProvider;
	}
	@Override
	public String toString() {
		return "CustomPV1_v25 [pv1_1_setID=" + pv1_1_setID + ", pv1_2_patientClass=" + pv1_2_patientClass
				+ ", pv1_3_assignedPatientLocation=" + pv1_3_assignedPatientLocation + ", pv1_4_admissionType="
				+ pv1_4_admissionType + ", pv1_5_preadmitNumber=" + pv1_5_preadmitNumber
				+ ", pv1_6_priorPatientLocation=" + pv1_6_priorPatientLocation + ", pv1_7_attendingDoctor="
				+ Arrays.toString(pv1_7_attendingDoctor) + ", pv1_8_referringDoctor="
				+ Arrays.toString(pv1_8_referringDoctor) + ", pv1_9_consultingDoctor="
				+ Arrays.toString(pv1_9_consultingDoctor) + ", pv1_10_hospitalService=" + pv1_10_hospitalService
				+ ", pv1_11_temporaryLocation=" + pv1_11_temporaryLocation + ", pv1_12_preadmitTestIndicator="
				+ pv1_12_preadmitTestIndicator + ", pv1_13_reAdmissionIndicator=" + pv1_13_reAdmissionIndicator
				+ ", pv1_14_admitSource=" + pv1_14_admitSource + ", pv1_15_ambulatoryStatus="
				+ Arrays.toString(pv1_15_ambulatoryStatus) + ", pv1_16_VIPIndicator=" + pv1_16_VIPIndicator
				+ ", pv1_17_admittingDoctor=" + Arrays.toString(pv1_17_admittingDoctor) + ", pv1_18_patientType="
				+ pv1_18_patientType + ", pv1_19_visitNumber=" + pv1_19_visitNumber + ", pv1_20_financialClass="
				+ Arrays.toString(pv1_20_financialClass) + ", pv1_21_chargePriceIndicator="
				+ pv1_21_chargePriceIndicator + ", pv1_22_courtesyCode=" + pv1_22_courtesyCode
				+ ", pv1_23_creditRating=" + pv1_23_creditRating + ", pv1_24_contractCode="
				+ Arrays.toString(pv1_24_contractCode) + ", pv1_25_contractEffectiveDate="
				+ Arrays.toString(pv1_25_contractEffectiveDate) + ", pv1_26_contractAmount="
				+ Arrays.toString(pv1_26_contractAmount) + ", pv1_27_contractPeriod="
				+ Arrays.toString(pv1_27_contractPeriod) + ", pv1_28_interestCode=" + pv1_28_interestCode
				+ ", pv1_29_transfertoBadDebtCode=" + pv1_29_transfertoBadDebtCode + ", pv1_30_transfertoBadDebtDate="
				+ pv1_30_transfertoBadDebtDate + ", pv1_31_badDebtAgencyCode=" + pv1_31_badDebtAgencyCode
				+ ", pv1_32_badDebtTransferAmount=" + pv1_32_badDebtTransferAmount + ", pv1_33_badDebtRecoveryAmount="
				+ pv1_33_badDebtRecoveryAmount + ", pv1_34_deleteAccountIndicator=" + pv1_34_deleteAccountIndicator
				+ ", pv1_35_deleteAccountDate=" + pv1_35_deleteAccountDate + ", pv1_36_dischargeDisposition="
				+ pv1_36_dischargeDisposition + ", pv1_37_dischargedtoLocation=" + pv1_37_dischargedtoLocation
				+ ", pv1_38_dietType=" + pv1_38_dietType + ", pv1_39_servicingFacility=" + pv1_39_servicingFacility
				+ ", pv1_40_bedStatus=" + pv1_40_bedStatus + ", pv1_41_accountStatus=" + pv1_41_accountStatus
				+ ", pv1_42_pendingLocation=" + pv1_42_pendingLocation + ", pv1_43_priorTemporaryLocation="
				+ pv1_43_priorTemporaryLocation + ", pv1_44_admitDateTime=" + pv1_44_admitDateTime
				+ ", pv1_45_dischargeDateTime=" + Arrays.toString(pv1_45_dischargeDateTime)
				+ ", pv1_46_currentPatientBalance=" + pv1_46_currentPatientBalance + ", pv1_47_totalCharges="
				+ pv1_47_totalCharges + ", pv1_48_totalAdjustments=" + pv1_48_totalAdjustments
				+ ", pv1_49_totalPayments=" + pv1_49_totalPayments + ", pv1_50_alternateVisit=" + pv1_50_alternateVisit
				+ ", pv1_51_visitIndicator=" + pv1_51_visitIndicator + ", pv1_52_otherHealthcareProvider="
				+ Arrays.toString(pv1_52_otherHealthcareProvider) + "]";
	}
	
}
