package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.group.ORM_O01_PATIENT;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.PID;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.DLN_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.SAD_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPID_v25 {
	@JsonProperty("pid_1_setID")
	private String pid_1_setID;
	@JsonProperty("pid_2_patientID")
	private CX_v25 pid_2_patientID;
	@JsonProperty("pid_3_patientIdentifierList")
	private CX_v25[] pid_3_patientIdentifierList;
	@JsonProperty("pid_4_alternatePatientID")
	private CX_v25[] pid_4_alternatePatientID;
	@JsonProperty("pid_5_patientName")
	private XPN_v25[] pid_5_patientName;
	@JsonProperty("pid_6_mothersMaidenName")
	private XPN_v25[] pid_6_mothersMaidenName;
	@JsonProperty("pid_7_dateTimeofBirth")
	private TS_v2 pid_7_dateTimeofBirth;
	@JsonProperty("pid_8_administrativeSex")
	private String pid_8_administrativeSex;
	@JsonProperty("pid_9_patientAlias")
	private XPN_v25[] pid_9_patientAlias;
	@JsonProperty("pid_10_race")
	private CE_v2[] pid_10_race;
	@JsonProperty("pid_11_patientAddress")
	private XAD_v25[] pid_11_patientAddress;
	@JsonProperty("pid_12_countyCode")
	private String pid_12_countyCode;
	@JsonProperty("pid_13_phoneNumberHome")
	private XTN_v25[] pid_13_phoneNumberHome;
	@JsonProperty("pid_14_phoneNumberBusiness")
	private XTN_v25[] pid_14_phoneNumberBusiness;
	@JsonProperty("pid_15_primaryLanguage")
	private CE_v2 pid_15_primaryLanguage;
	@JsonProperty("pid_16_maritalStatus")
	private CE_v2 pid_16_maritalStatus;
	@JsonProperty("pid_17_religion")
	private CE_v2 pid_17_religion;
	@JsonProperty("pid_18_patientAccountNumber")
	private CX_v25 pid_18_patientAccountNumber;
	@JsonProperty("pid_19_ssn")
	private String pid_19_ssn;
	@JsonProperty("pid_20_driversLicenseNumber")
	private DLN_v25 pid_20_driversLicenseNumber;
	@JsonProperty("pid_21_mothersIdentifier")
	private CX_v25[] pid_21_mothersIdentifier;
	@JsonProperty("pid_22_ethnicGroup")
	private CE_v2[] pid_22_ethnicGroup;
	@JsonProperty("pid_23_birthPlace")
	private String pid_23_birthPlace;
	@JsonProperty("pid_24_multipleBirthIndicator")
	private String pid_24_multipleBirthIndicator;
	@JsonProperty("pid_25_birthOrder")
	private String pid_25_birthOrder;
	@JsonProperty("pid_26_citizenship")
	private CE_v2[] pid_26_citizenship;
	@JsonProperty("pid_27_veteransMilitaryStatus")
	private CE_v2 pid_27_veteransMilitaryStatus;
	@JsonProperty("pid_28_nationality")
	private CE_v2 pid_28_nationality;
	@JsonProperty("pid_29_patientDeathDateandTime")
	private TS_v2 pid_29_patientDeathDateandTime;
	@JsonProperty("pid_30_patientDeathIndicator")
	private String pid_30_patientDeathIndicator;
	@JsonProperty("pid_31_identityUnknownIndicator")
	private String pid_31_identityUnknownIndicator;
	@JsonProperty("pid_32_identityReliabilityCode")
	private String[] pid_32_identityReliabilityCode;
	@JsonProperty("pid_33_lastUpdateDateTime")
	private TS_v2 pid_33_lastUpdateDateTime;
	@JsonProperty("pid_34_lastUpdateFacility")
	private HD_v2 pid_34_lastUpdateFacility;
	@JsonProperty("pid_35_speciesCode")
	private CE_v2 pid_35_speciesCode;
	@JsonProperty("pid_36_breedCode")
	private CE_v2 pid_36_breedCode;
	@JsonProperty("pid_37_strain")
	private String pid_37_strain;
	@JsonProperty("pid_38_productionClassCode")
	private CE_v2 pid_38_productionClassCode;
	@JsonProperty("pid_39_tribalCitizenship")
	private CWE_v25[] pid_39_tribalCitizenship;
	@JsonProperty("nte")
	private List<CustomNTE_v25> nte;
	
	private PID pid;
	
	private CustomPID_v25(PID pid,List<CustomNTE_v25> nte) {
		super();
		this.pid = pid;
		this.nte = nte;
	}
	public static CustomPID_v25 createPid(ORM_O01_PATIENT patient) throws HL7Exception, IOException {
		PID pidObject = patient.getPID();
		return new CustomPID_v25(pidObject, getNTEAll(patient.getNTEAll()));
	}
	public static CustomPID_v25 createPid(ORU_R01 oru) throws HL7Exception, IOException {
		PID pidObject = oru.getPATIENT_RESULT().getPATIENT().getPID();
		return new CustomPID_v25(pidObject, getNTEAll(oru.getPATIENT_RESULT().getPATIENT().getNTEAll()));
	}
	private static List<CustomNTE_v25> getNTEAll(List<NTE> ntes) throws HL7Exception, IOException {
		List<CustomNTE_v25> nteArray = new ArrayList<>();
		for(NTE nteObject : ntes) {
			nteArray.add(CustomNTE_v25.createNteWithTypeAndVersion(nteObject));
		}
		return nteArray;
	}
	/**
	 * @return the pid_1_setID
	 */
	
	@JsonProperty("pid_1_setID")
	public String getPid_1_setID() {
		return this.pid.getPid1_SetIDPID().getValue()==null?"":this.pid.getPid1_SetIDPID().getValue();
	}
	/**
	 * @param pid_1_setID the pid_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_1_setID")
	public void setPid_1_setID(String pid_1_setID) throws DataTypeException {
		this.pid.getPid1_SetIDPID().setValue(pid_1_setID);
		this.pid_1_setID = pid_1_setID;
	}
	/**
	 * @return the pid_2_patientID
	 */
	
	@JsonProperty("pid_2_patientID")
	public CX_v25 getPid_2_patientID() {
		return new CX_v25(
				this.pid.getPid2_PatientID().getCx1_IDNumber().getValue()==null?"":this.pid.getPid2_PatientID().getCx1_IDNumber().getValue(),
				this.pid.getPid2_PatientID().getCx2_CheckDigit().getValue()==null?"":this.pid.getPid2_PatientID().getCx2_CheckDigit().getValue(),
				this.pid.getPid2_PatientID().getCx3_CheckDigitScheme().getValue()==null?"":this.pid.getPid2_PatientID().getCx3_CheckDigitScheme().getValue(),
				new HD_v2(
						this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
				this.pid.getPid2_PatientID().getCx5_IdentifierTypeCode().getValue()==null?"":this.pid.getPid2_PatientID().getCx5_IdentifierTypeCode().getValue(),
				new HD_v2(
						this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
				this.pid.getPid2_PatientID().getCx7_EffectiveDate().getValue()==null?"":this.pid.getPid2_PatientID().getCx7_EffectiveDate().getValue(),
				this.pid.getPid2_PatientID().getCx8_ExpirationDate().getValue()==null?"":this.pid.getPid2_PatientID().getCx8_ExpirationDate().getValue(),
				new CWE_v25(
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param pid_2_patientID the pid_2_patientID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_2_patientID")
	public void setPid_2_patientID(CX_v25 pid_2_patientID) throws DataTypeException {
		this.pid.getPid2_PatientID().getCx1_IDNumber().setValue(pid_2_patientID.getCx_1_idNumber());
		this.pid.getPid2_PatientID().getCx2_CheckDigit().setValue(pid_2_patientID.getCx_2_checkDigit());
		this.pid.getPid2_PatientID().getCx3_CheckDigitScheme().setValue(pid_2_patientID.getCx_3_checkDigitScheme());
		this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pid_2_patientID.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pid_2_patientID.getCx_4_assigningAuthority().getHd_2_universalId());
		this.pid.getPid2_PatientID().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pid_2_patientID.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.pid.getPid2_PatientID().getCx5_IdentifierTypeCode().setValue(pid_2_patientID.getCx_5_identifierTypeCode());
		this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pid_2_patientID.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd2_UniversalID().setValue(pid_2_patientID.getCx_6_assigningFacility().getHd_2_universalId());
		this.pid.getPid2_PatientID().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pid_2_patientID.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.pid.getPid2_PatientID().getCx7_EffectiveDate().setValue(pid_2_patientID.getCx_7_effectiveDate());
		this.pid.getPid2_PatientID().getCx8_ExpirationDate().setValue(pid_2_patientID.getCx_8_expirationDate());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.pid.getPid2_PatientID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pid_2_patientID.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.pid.getPid2_PatientID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pid_2_patientID.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.pid_2_patientID = pid_2_patientID;
	}
	/**
	 * @return the pid_3_patientIdentifierList
	 */
	
	@JsonProperty("pid_3_patientIdentifierList")
	public CX_v25[] getPid_3_patientIdentifierList() {
		CX_v25[] patientIdentifierList = new CX_v25[this.pid.getPid3_PatientIdentifierList().length];
		for(int i = 0;i < this.pid.getPid3_PatientIdentifierList().length;i++) {
			patientIdentifierList[i] = new CX_v25(
					this.pid.getPid3_PatientIdentifierList(i).getCx1_IDNumber().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx1_IDNumber().getValue(),
					this.pid.getPid3_PatientIdentifierList(i).getCx2_CheckDigit().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx2_CheckDigit().getValue(),
					this.pid.getPid3_PatientIdentifierList(i).getCx3_CheckDigitScheme().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx3_CheckDigitScheme().getValue(),
					new HD_v2(
							this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pid.getPid3_PatientIdentifierList(i).getCx5_IdentifierTypeCode().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx5_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pid.getPid3_PatientIdentifierList(i).getCx7_EffectiveDate().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx7_EffectiveDate().getValue(),
					this.pid.getPid3_PatientIdentifierList(i).getCx8_ExpirationDate().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx8_ExpirationDate().getValue(),
					new CWE_v25(
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return patientIdentifierList;
	}
	/**
	 * @param pid_3_patientIdentifierList the pid_3_patientIdentifierList to set
	 * @JsonProperty("pid_3_patientIdentifierList")
	 * @throws DataTypeException 
	 */
	public void setPid_3_patientIdentifierList(CX_v25[] pid_3_patientIdentifierList) throws DataTypeException {
		for(int i = 0; i < pid_3_patientIdentifierList.length;i++) {
			this.pid.getPid3_PatientIdentifierList(i).getCx1_IDNumber().setValue(pid_3_patientIdentifierList[i].getCx_1_idNumber());
			this.pid.getPid3_PatientIdentifierList(i).getCx2_CheckDigit().setValue(pid_3_patientIdentifierList[i].getCx_2_checkDigit());
			this.pid.getPid3_PatientIdentifierList(i).getCx3_CheckDigitScheme().setValue(pid_3_patientIdentifierList[i].getCx_3_checkDigitScheme());
			this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pid_3_patientIdentifierList[i].getCx_4_assigningAuthority().getHd_1_namespaceId());
			this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pid_3_patientIdentifierList[i].getCx_4_assigningAuthority().getHd_2_universalId());
			this.pid.getPid3_PatientIdentifierList(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pid_3_patientIdentifierList[i].getCx_4_assigningAuthority().getHd_3_universalIdType());
			this.pid.getPid3_PatientIdentifierList(i).getCx5_IdentifierTypeCode().setValue(pid_3_patientIdentifierList[i].getCx_5_identifierTypeCode());
			this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pid_3_patientIdentifierList[i].getCx_6_assigningFacility().getHd_1_namespaceId());
			this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd2_UniversalID().setValue(pid_3_patientIdentifierList[i].getCx_6_assigningFacility().getHd_2_universalId());
			this.pid.getPid3_PatientIdentifierList(i).getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pid_3_patientIdentifierList[i].getCx_6_assigningFacility().getHd_3_universalIdType());
			this.pid.getPid3_PatientIdentifierList(i).getCx7_EffectiveDate().setValue(pid_3_patientIdentifierList[i].getCx_7_effectiveDate());
			this.pid.getPid3_PatientIdentifierList(i).getCx8_ExpirationDate().setValue(pid_3_patientIdentifierList[i].getCx_8_expirationDate());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_1_identifier());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_2_text());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_5_alternateText());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid3_PatientIdentifierList(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pid_3_patientIdentifierList[i].getCx_9_assigningJurisdiction().getCwe_9_originalText());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid3_PatientIdentifierList(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pid_3_patientIdentifierList[i].getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pid_3_patientIdentifierList = pid_3_patientIdentifierList;
	}
	/**
	 * @return the pid_4_alternatePatientID
	 */
	
	@JsonProperty("pid_4_alternatePatientID")
	public CX_v25[] getPid_4_alternatePatientID() {
		CX_v25[] alternatePatientID = new CX_v25[this.pid.getPid4_AlternatePatientIDPID().length];
		for(int i = 0;i < this.pid.getPid4_AlternatePatientIDPID().length; i++ ) {
			alternatePatientID[i] = new CX_v25(
					this.pid.getPid4_AlternatePatientIDPID(i).getCx1_IDNumber().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx1_IDNumber().getValue(),
					this.pid.getPid4_AlternatePatientIDPID(i).getCx2_CheckDigit().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx2_CheckDigit().getValue(),
					this.pid.getPid4_AlternatePatientIDPID(i).getCx3_CheckDigitScheme().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx3_CheckDigitScheme().getValue(),
					new HD_v2(
							this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pid.getPid4_AlternatePatientIDPID(i).getCx5_IdentifierTypeCode().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx5_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pid.getPid4_AlternatePatientIDPID(i).getCx7_EffectiveDate().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx7_EffectiveDate().getValue(),
					this.pid.getPid4_AlternatePatientIDPID(i).getCx8_ExpirationDate().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx8_ExpirationDate().getValue(),
					new CWE_v25(
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return alternatePatientID;
	}
	/**
	 * @param pid_4_alternatePatientID the pid_4_alternatePatientID to set
	 * @JsonProperty("pid_4_alternatePatientID")
	 * @throws DataTypeException 
	 */
	public void setPid_4_alternatePatientID(CX_v25[] pid_4_alternatePatientID) throws DataTypeException {
		for(int i = 0; i < pid_4_alternatePatientID.length;i++) {
			this.pid.getPid4_AlternatePatientIDPID(i).getCx1_IDNumber().setValue(pid_4_alternatePatientID[i].getCx_1_idNumber());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx2_CheckDigit().setValue(pid_4_alternatePatientID[i].getCx_2_checkDigit());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx3_CheckDigitScheme().setValue(pid_4_alternatePatientID[i].getCx_3_checkDigitScheme());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pid_4_alternatePatientID[i].getCx_4_assigningAuthority().getHd_1_namespaceId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pid_4_alternatePatientID[i].getCx_4_assigningAuthority().getHd_2_universalId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pid_4_alternatePatientID[i].getCx_4_assigningAuthority().getHd_3_universalIdType());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx5_IdentifierTypeCode().setValue(pid_4_alternatePatientID[i].getCx_5_identifierTypeCode());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pid_4_alternatePatientID[i].getCx_6_assigningFacility().getHd_1_namespaceId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd2_UniversalID().setValue(pid_4_alternatePatientID[i].getCx_6_assigningFacility().getHd_2_universalId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pid_4_alternatePatientID[i].getCx_6_assigningFacility().getHd_3_universalIdType());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx7_EffectiveDate().setValue(pid_4_alternatePatientID[i].getCx_7_effectiveDate());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx8_ExpirationDate().setValue(pid_4_alternatePatientID[i].getCx_8_expirationDate());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_1_identifier());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_2_text());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_5_alternateText());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pid_4_alternatePatientID[i].getCx_9_assigningJurisdiction().getCwe_9_originalText());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid4_AlternatePatientIDPID(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pid_4_alternatePatientID[i].getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pid_4_alternatePatientID = pid_4_alternatePatientID;
	}
	/**
	 * @return the pid_5_patientName
	 */
	
	@JsonProperty("pid_5_patientName")
	public XPN_v25[] getPid_5_patientName() {
		XPN_v25[] patientName = new XPN_v25[this.pid.getPid5_PatientName().length];
		for(int i =0 ; i< this.pid.getPid5_PatientName().length;i++) {
			patientName[i] = new XPN_v25(
					new FN_v25(
							this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn1_Surname().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pid.getPid5_PatientName(i).getXpn2_GivenName().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn2_GivenName().getValue(),
					this.pid.getPid5_PatientName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pid.getPid5_PatientName(i).getXpn4_SuffixEgJRorIII().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn4_SuffixEgJRorIII().getValue(),
					this.pid.getPid5_PatientName(i).getXpn5_PrefixEgDR().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn5_PrefixEgDR().getValue(),
					this.pid.getPid5_PatientName(i).getXpn6_DegreeEgMD().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn6_DegreeEgMD().getValue(),
					this.pid.getPid5_PatientName(i).getXpn7_NameTypeCode().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn7_NameTypeCode().getValue(),
					this.pid.getPid5_PatientName(i).getXpn8_NameRepresentationCode().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn8_NameRepresentationCode().getValue(),
					new CE_v2(
							this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe1_Identifier().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe2_Text().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe2_Text().getValue(),
							this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe5_AlternateText().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe5_AlternateText().getValue(),
							this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pid.getPid5_PatientName(i).getXpn11_NameAssemblyOrder().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pid.getPid5_PatientName(i).getXpn12_EffectiveDate().getTs1_Time().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.pid.getPid5_PatientName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.pid.getPid5_PatientName(i).getXpn13_ExpirationDate().getTs1_Time().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.pid.getPid5_PatientName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pid.getPid5_PatientName(i).getXpn14_ProfessionalSuffix().getValue()==null?"":this.pid.getPid5_PatientName(i).getXpn14_ProfessionalSuffix().getValue());
		}
		return patientName;
	}
	/**
	 * @param pid_5_patientName the pid_5_patientName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_5_patientName")
	public void setPid_5_patientName(XPN_v25[] pid_5_patientName) throws DataTypeException {
		for(int i=0; i<pid_5_patientName.length; i++) {
			this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn1_Surname().setValue(pid_5_patientName[i].getXpn_1_familyName().getFn_1_surname());
			this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(pid_5_patientName[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(pid_5_patientName[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pid_5_patientName[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pid.getPid5_PatientName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pid_5_patientName[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pid.getPid5_PatientName(i).getXpn2_GivenName().setValue(pid_5_patientName[i].getXpn_2_givenName());
			this.pid.getPid5_PatientName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pid_5_patientName[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pid.getPid5_PatientName(i).getXpn4_SuffixEgJRorIII().setValue(pid_5_patientName[i].getXpn_4_suffixEGJrOrIii());
			this.pid.getPid5_PatientName(i).getXpn5_PrefixEgDR().setValue(pid_5_patientName[i].getXpn_5_prefixEGDr());
			this.pid.getPid5_PatientName(i).getXpn6_DegreeEgMD().setValue(pid_5_patientName[i].getXpn_6_degreeEGMd());
			this.pid.getPid5_PatientName(i).getXpn7_NameTypeCode().setValue(pid_5_patientName[i].getXpn_7_nameTypeCode());
			this.pid.getPid5_PatientName(i).getXpn8_NameRepresentationCode().setValue(pid_5_patientName[i].getXpn_8_nameRepresentationCode());
			this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe1_Identifier().setValue(pid_5_patientName[i].getXpn_9_nameContext().getCe_1_identifier());
			this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe2_Text().setValue(pid_5_patientName[i].getXpn_9_nameContext().getCe_2_text());
			this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(pid_5_patientName[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(pid_5_patientName[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe5_AlternateText().setValue(pid_5_patientName[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.pid.getPid5_PatientName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pid_5_patientName[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pid_5_patientName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pid_5_patientName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pid_5_patientName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pid.getPid5_PatientName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pid_5_patientName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid5_PatientName(i).getXpn11_NameAssemblyOrder().setValue(pid_5_patientName[i].getXpn_11_nameAssemblyOrder());
			this.pid.getPid5_PatientName(i).getXpn12_EffectiveDate().getTs1_Time().setValue(pid_5_patientName[i].getXpn_12_effectiveDate().getTs_1_time());
			this.pid.getPid5_PatientName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pid_5_patientName[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.pid.getPid5_PatientName(i).getXpn13_ExpirationDate().getTs1_Time().setValue(pid_5_patientName[i].getXpn_13_expirationDate().getTs_1_time());
			this.pid.getPid5_PatientName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pid_5_patientName[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.pid.getPid5_PatientName(i).getXpn14_ProfessionalSuffix().setValue(pid_5_patientName[i].getXpn_14_professionalSuffix());
		}
		this.pid_5_patientName = pid_5_patientName;
	}
	/**
	 * @return the pid_6_mothersMaidenName
	 */
	
	@JsonProperty("pid_6_mothersMaidenName")
	public XPN_v25[] getPid_6_mothersMaidenName() {
		XPN_v25[] mothersMaidenName = new XPN_v25[this.pid.getPid6_MotherSMaidenName().length];
		for(int i =0 ; i< this.pid.getPid6_MotherSMaidenName().length;i++) {
			mothersMaidenName[i] = new XPN_v25(
					new FN_v25(
							this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pid.getPid6_MotherSMaidenName(i).getXpn2_GivenName().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn2_GivenName().getValue(),
					this.pid.getPid6_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pid.getPid6_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().getValue(),
					this.pid.getPid6_MotherSMaidenName(i).getXpn5_PrefixEgDR().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn5_PrefixEgDR().getValue(),
					this.pid.getPid6_MotherSMaidenName(i).getXpn6_DegreeEgMD().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn6_DegreeEgMD().getValue(),
					this.pid.getPid6_MotherSMaidenName(i).getXpn7_NameTypeCode().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn7_NameTypeCode().getValue(),
					this.pid.getPid6_MotherSMaidenName(i).getXpn8_NameRepresentationCode().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn8_NameRepresentationCode().getValue(),
					new CE_v2(
							this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pid.getPid6_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pid.getPid6_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.pid.getPid6_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.pid.getPid6_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pid.getPid6_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().getValue()==null?"":this.pid.getPid6_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().getValue());
		}
		return mothersMaidenName;
	}
	/**
	 * @param pid_6_mothersMaidenName the pid_6_mothersMaidenName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_6_mothersMaidenName")
	public void setPid_6_mothersMaidenName(XPN_v25[] pid_6_mothersMaidenName) throws DataTypeException {
		for(int i=0; i<pid_6_mothersMaidenName.length; i++) {
			this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().setValue(pid_6_mothersMaidenName[i].getXpn_1_familyName().getFn_1_surname());
			this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(pid_6_mothersMaidenName[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(pid_6_mothersMaidenName[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pid_6_mothersMaidenName[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pid.getPid6_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pid_6_mothersMaidenName[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pid.getPid6_MotherSMaidenName(i).getXpn2_GivenName().setValue(pid_6_mothersMaidenName[i].getXpn_2_givenName());
			this.pid.getPid6_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pid_6_mothersMaidenName[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pid.getPid6_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().setValue(pid_6_mothersMaidenName[i].getXpn_4_suffixEGJrOrIii());
			this.pid.getPid6_MotherSMaidenName(i).getXpn5_PrefixEgDR().setValue(pid_6_mothersMaidenName[i].getXpn_5_prefixEGDr());
			this.pid.getPid6_MotherSMaidenName(i).getXpn6_DegreeEgMD().setValue(pid_6_mothersMaidenName[i].getXpn_6_degreeEGMd());
			this.pid.getPid6_MotherSMaidenName(i).getXpn7_NameTypeCode().setValue(pid_6_mothersMaidenName[i].getXpn_7_nameTypeCode());
			this.pid.getPid6_MotherSMaidenName(i).getXpn8_NameRepresentationCode().setValue(pid_6_mothersMaidenName[i].getXpn_8_nameRepresentationCode());
			this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().setValue(pid_6_mothersMaidenName[i].getXpn_9_nameContext().getCe_1_identifier());
			this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().setValue(pid_6_mothersMaidenName[i].getXpn_9_nameContext().getCe_2_text());
			this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(pid_6_mothersMaidenName[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(pid_6_mothersMaidenName[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().setValue(pid_6_mothersMaidenName[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.pid.getPid6_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pid_6_mothersMaidenName[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pid_6_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pid_6_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pid_6_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pid.getPid6_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pid_6_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid6_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().setValue(pid_6_mothersMaidenName[i].getXpn_11_nameAssemblyOrder());
			this.pid.getPid6_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().setValue(pid_6_mothersMaidenName[i].getXpn_12_effectiveDate().getTs_1_time());
			this.pid.getPid6_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pid_6_mothersMaidenName[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.pid.getPid6_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().setValue(pid_6_mothersMaidenName[i].getXpn_13_expirationDate().getTs_1_time());
			this.pid.getPid6_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pid_6_mothersMaidenName[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.pid.getPid6_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().setValue(pid_6_mothersMaidenName[i].getXpn_14_professionalSuffix());
		}
		this.pid_6_mothersMaidenName = pid_6_mothersMaidenName;
	}
	/**
	 * @return the pid_7_dateTimeofBirth
	 */
	
	@JsonProperty("pid_7_dateTimeofBirth")
	public TS_v2 getPid_7_dateTimeofBirth() {
		return new TS_v2(
				this.pid.getPid7_DateTimeOfBirth().getTs1_Time().getValue()==null?"":this.pid.getPid7_DateTimeOfBirth().getTs1_Time().getValue(),
				this.pid.getPid7_DateTimeOfBirth().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid7_DateTimeOfBirth().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pid_7_dateTimeofBirth the pid_7_dateTimeofBirth to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_7_dateTimeofBirth")
	public void setPid_7_dateTimeofBirth(TS_v2 pid_7_dateTimeofBirth) throws DataTypeException {
		this.pid.getPid7_DateTimeOfBirth().getTs1_Time().setValue(pid_7_dateTimeofBirth.getTs_1_time());
		this.pid.getPid7_DateTimeOfBirth().getTs2_DegreeOfPrecision().setValue(pid_7_dateTimeofBirth.getTs_2_degreeOfPrecision());
		this.pid_7_dateTimeofBirth = pid_7_dateTimeofBirth;
	}
	/**
	 * @return the pid_8_administrativeSex
	 */
	
	@JsonProperty("pid_8_administrativeSex")
	public String getPid_8_administrativeSex() {
		return this.pid.getPid8_AdministrativeSex().getValue()==null?"":this.pid.getPid8_AdministrativeSex().getValue();
	}
	/**
	 * @param pid_8_administrativeSex the pid_8_administrativeSex to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_8_administrativeSex")
	public void setPid_8_administrativeSex(String pid_8_administrativeSex) throws DataTypeException {
		this.pid_8_administrativeSex = pid_8_administrativeSex;
		this.pid.getPid8_AdministrativeSex().setValue(pid_8_administrativeSex);
	}
	/**
	 * @return the pid_9_patientAlias
	 */
	
	@JsonProperty("pid_9_patientAlias")
	public XPN_v25[] getPid_9_patientAlias() {
		XPN_v25[] patientAlias = new XPN_v25[this.pid.getPid9_PatientAlias().length];
		for(int i =0 ; i< this.pid.getPid9_PatientAlias().length;i++) {
			patientAlias[i] = new XPN_v25(
					new FN_v25(
							this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn1_Surname().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pid.getPid9_PatientAlias(i).getXpn2_GivenName().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn2_GivenName().getValue(),
					this.pid.getPid9_PatientAlias(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pid.getPid9_PatientAlias(i).getXpn4_SuffixEgJRorIII().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn4_SuffixEgJRorIII().getValue(),
					this.pid.getPid9_PatientAlias(i).getXpn5_PrefixEgDR().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn5_PrefixEgDR().getValue(),
					this.pid.getPid9_PatientAlias(i).getXpn6_DegreeEgMD().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn6_DegreeEgMD().getValue(),
					this.pid.getPid9_PatientAlias(i).getXpn7_NameTypeCode().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn7_NameTypeCode().getValue(),
					this.pid.getPid9_PatientAlias(i).getXpn8_NameRepresentationCode().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn8_NameRepresentationCode().getValue(),
					new CE_v2(
							this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe1_Identifier().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe2_Text().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe2_Text().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe5_AlternateText().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe5_AlternateText().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pid.getPid9_PatientAlias(i).getXpn11_NameAssemblyOrder().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pid.getPid9_PatientAlias(i).getXpn12_EffectiveDate().getTs1_Time().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.pid.getPid9_PatientAlias(i).getXpn13_ExpirationDate().getTs1_Time().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.pid.getPid9_PatientAlias(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pid.getPid9_PatientAlias(i).getXpn14_ProfessionalSuffix().getValue()==null?"":this.pid.getPid9_PatientAlias(i).getXpn14_ProfessionalSuffix().getValue());
		}
		return patientAlias;
	}
	/**
	 * @param pid_9_patientAlias the pid_9_patientAlias to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_9_patientAlias")
	public void setPid_9_patientAlias(XPN_v25[] pid_9_patientAlias) throws DataTypeException {
		for(int i=0; i<pid_9_patientAlias.length; i++) {
			this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn1_Surname().setValue(pid_9_patientAlias[i].getXpn_1_familyName().getFn_1_surname());
			this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(pid_9_patientAlias[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(pid_9_patientAlias[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pid_9_patientAlias[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pid.getPid9_PatientAlias(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pid_9_patientAlias[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pid.getPid9_PatientAlias(i).getXpn2_GivenName().setValue(pid_9_patientAlias[i].getXpn_2_givenName());
			this.pid.getPid9_PatientAlias(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pid_9_patientAlias[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pid.getPid9_PatientAlias(i).getXpn4_SuffixEgJRorIII().setValue(pid_9_patientAlias[i].getXpn_4_suffixEGJrOrIii());
			this.pid.getPid9_PatientAlias(i).getXpn5_PrefixEgDR().setValue(pid_9_patientAlias[i].getXpn_5_prefixEGDr());
			this.pid.getPid9_PatientAlias(i).getXpn6_DegreeEgMD().setValue(pid_9_patientAlias[i].getXpn_6_degreeEGMd());
			this.pid.getPid9_PatientAlias(i).getXpn7_NameTypeCode().setValue(pid_9_patientAlias[i].getXpn_7_nameTypeCode());
			this.pid.getPid9_PatientAlias(i).getXpn8_NameRepresentationCode().setValue(pid_9_patientAlias[i].getXpn_8_nameRepresentationCode());
			this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe1_Identifier().setValue(pid_9_patientAlias[i].getXpn_9_nameContext().getCe_1_identifier());
			this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe2_Text().setValue(pid_9_patientAlias[i].getXpn_9_nameContext().getCe_2_text());
			this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(pid_9_patientAlias[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(pid_9_patientAlias[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe5_AlternateText().setValue(pid_9_patientAlias[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.pid.getPid9_PatientAlias(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pid_9_patientAlias[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pid_9_patientAlias[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pid_9_patientAlias[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pid_9_patientAlias[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pid.getPid9_PatientAlias(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pid_9_patientAlias[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid9_PatientAlias(i).getXpn11_NameAssemblyOrder().setValue(pid_9_patientAlias[i].getXpn_11_nameAssemblyOrder());
			this.pid.getPid9_PatientAlias(i).getXpn12_EffectiveDate().getTs1_Time().setValue(pid_9_patientAlias[i].getXpn_12_effectiveDate().getTs_1_time());
			this.pid.getPid9_PatientAlias(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pid_9_patientAlias[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.pid.getPid9_PatientAlias(i).getXpn13_ExpirationDate().getTs1_Time().setValue(pid_9_patientAlias[i].getXpn_13_expirationDate().getTs_1_time());
			this.pid.getPid9_PatientAlias(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pid_9_patientAlias[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.pid.getPid9_PatientAlias(i).getXpn14_ProfessionalSuffix().setValue(pid_9_patientAlias[i].getXpn_14_professionalSuffix());
		}
		this.pid_9_patientAlias = pid_9_patientAlias;
	}
	/**
	 * @return the pid_10_race
	 */
	
	@JsonProperty("pid_10_race")
	public CE_v2[] getPid_10_race() {
		 CE_v2[] race = new CE_v2[this.pid.getPid10_Race().length];
		 for(int i = 0; i<this.pid.getPid10_Race().length;i++ ) {
			 race[i] = new CE_v2(
					 this.pid.getPid10_Race(i).getCe1_Identifier().getValue()==null?"":this.pid.getPid10_Race(i).getCe1_Identifier().getValue(),
					 this.pid.getPid10_Race(i).getCe2_Text().getValue()==null?"":this.pid.getPid10_Race(i).getCe2_Text().getValue(),
					 this.pid.getPid10_Race(i).getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid10_Race(i).getCe3_NameOfCodingSystem().getValue(),
					 this.pid.getPid10_Race(i).getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid10_Race(i).getCe4_AlternateIdentifier().getValue(),
					 this.pid.getPid10_Race(i).getCe5_AlternateText().getValue()==null?"":this.pid.getPid10_Race(i).getCe5_AlternateText().getValue(),
					 this.pid.getPid10_Race(i).getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid10_Race(i).getCe6_NameOfAlternateCodingSystem().getValue());
		 }
		return race;
	}
	/**
	 * @param pid_10_race the pid_10_race to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_10_race")
	public void setPid_10_race(CE_v2[] pid_10_race) throws DataTypeException {
		for(int i = 0; i<pid_10_race.length;i++ ) {
			this.pid.getPid10_Race(i).getCe1_Identifier().setValue(pid_10_race[i].getCe_1_identifier());
			this.pid.getPid10_Race(i).getCe2_Text().setValue(pid_10_race[i].getCe_2_text());
			this.pid.getPid10_Race(i).getCe3_NameOfCodingSystem().setValue(pid_10_race[i].getCe_3_nameOfCodingSystem());
			this.pid.getPid10_Race(i).getCe4_AlternateIdentifier().setValue(pid_10_race[i].getCe_4_alternateIdentifier());
			this.pid.getPid10_Race(i).getCe5_AlternateText().setValue(pid_10_race[i].getCe_5_alternateText());
			this.pid.getPid10_Race(i).getCe6_NameOfAlternateCodingSystem().setValue(pid_10_race[i].getCe_6_nameOfAlternateCodingSystem());
		 }
		this.pid_10_race = pid_10_race;
	}
	/**
	 * @return the pid_11_patientAddress
	 */
	
	@JsonProperty("pid_11_patientAddress")
	public XAD_v25[] getPid_11_patientAddress() {
		XAD_v25[] patientAddress = new XAD_v25[this.pid.getPid11_PatientAddress().length];
		for(int i = 0; i <this.pid.getPid11_PatientAddress().length; i++) {
			patientAddress[i] = new XAD_v25(
					new SAD_v25(
							this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue(),
							this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad2_StreetName().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad2_StreetName().getValue(),
							this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()),
					this.pid.getPid11_PatientAddress(i).getXad2_OtherDesignation().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad2_OtherDesignation().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad3_City().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad3_City().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad4_StateOrProvince().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad4_StateOrProvince().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad5_ZipOrPostalCode().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad5_ZipOrPostalCode().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad6_Country().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad6_Country().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad7_AddressType().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad7_AddressType().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad8_OtherGeographicDesignation().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad8_OtherGeographicDesignation().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad9_CountyParishCode().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad9_CountyParishCode().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad10_CensusTract().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad10_CensusTract().getValue(),
					this.pid.getPid11_PatientAddress(i).getXad11_AddressRepresentationCode().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad11_AddressRepresentationCode().getValue(),
					new DR_v2(
							new TS_v2(
									this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					new TS_v2(
							this.pid.getPid11_PatientAddress(i).getXad13_EffectiveDate().getTs1_Time().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad13_EffectiveDate().getTs1_Time().getValue(),
							this.pid.getPid11_PatientAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.pid.getPid11_PatientAddress(i).getXad14_ExpirationDate().getTs1_Time().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad14_ExpirationDate().getTs1_Time().getValue(),
							this.pid.getPid11_PatientAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid11_PatientAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()));
		}
		return patientAddress;
	}
	/**
	 * @param pid_11_patientAddress the pid_11_patientAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_11_patientAddress")
	public void setPid_11_patientAddress(XAD_v25[] pid_11_patientAddress) throws DataTypeException {
		for(int i = 0; i < pid_11_patientAddress.length; i++) {
			this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().setValue(pid_11_patientAddress[i].getXad_1_streetAddress().getSad_1_streetOrMailingAddress());
			this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad2_StreetName().setValue(pid_11_patientAddress[i].getXad_1_streetAddress().getSad_2_streetName());
			this.pid.getPid11_PatientAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().setValue(pid_11_patientAddress[i].getXad_1_streetAddress().getSad_3_dwellingNumber());
			this.pid.getPid11_PatientAddress(i).getXad2_OtherDesignation().setValue(pid_11_patientAddress[i].getXad_2_otherDesignation());
			this.pid.getPid11_PatientAddress(i).getXad3_City().setValue(pid_11_patientAddress[i].getXad_3_city());
			this.pid.getPid11_PatientAddress(i).getXad4_StateOrProvince().setValue(pid_11_patientAddress[i].getXad_4_stateOrProvince());
			this.pid.getPid11_PatientAddress(i).getXad5_ZipOrPostalCode().setValue(pid_11_patientAddress[i].getXad_5_zipOrPostalCode());
			this.pid.getPid11_PatientAddress(i).getXad6_Country().setValue(pid_11_patientAddress[i].getXad_6_country());
			this.pid.getPid11_PatientAddress(i).getXad7_AddressType().setValue(pid_11_patientAddress[i].getXad_7_addressType());
			this.pid.getPid11_PatientAddress(i).getXad8_OtherGeographicDesignation().setValue(pid_11_patientAddress[i].getXad_8_otherGeographicDesignation());
			this.pid.getPid11_PatientAddress(i).getXad9_CountyParishCode().setValue(pid_11_patientAddress[i].getXad_9_countyParishCode());
			this.pid.getPid11_PatientAddress(i).getXad10_CensusTract().setValue(pid_11_patientAddress[i].getXad_10_censusTract());
			this.pid.getPid11_PatientAddress(i).getXad11_AddressRepresentationCode().setValue(pid_11_patientAddress[i].getXad_11_addressRepresentationCode());
			this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pid_11_patientAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pid_11_patientAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pid_11_patientAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pid.getPid11_PatientAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pid_11_patientAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pid.getPid11_PatientAddress(i).getXad13_EffectiveDate().getTs1_Time().setValue(pid_11_patientAddress[i].getXad_13_effectiveDate().getTs_1_time());
			this.pid.getPid11_PatientAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pid_11_patientAddress[i].getXad_13_effectiveDate().getTs_2_degreeOfPrecision());
			this.pid.getPid11_PatientAddress(i).getXad14_ExpirationDate().getTs1_Time().setValue(pid_11_patientAddress[i].getXad_14_expirationDate().getTs_1_time());
			this.pid.getPid11_PatientAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pid_11_patientAddress[i].getXad_14_expirationDate().getTs_2_degreeOfPrecision());
		}
		this.pid_11_patientAddress = pid_11_patientAddress;
	}
	/**
	 * @return the pid_12_countyCode
	 */
	
	@JsonProperty("pid_12_countyCode")
	public String getPid_12_countyCode() {
		return this.pid.getPid12_CountyCode().getValue()==null?"":this.pid.getPid12_CountyCode().getValue();
	}
	/**
	 * @param pid_12_countyCode the pid_12_countyCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_12_countyCode")
	public void setPid_12_countyCode(String pid_12_countyCode) throws DataTypeException {
		this.pid_12_countyCode = pid_12_countyCode;
		this.pid.getPid12_CountyCode().setValue(pid_12_countyCode);
	}
	/**
	 * @return the pid_13_phoneNumberHome
	 */
	
	@JsonProperty("pid_13_phoneNumberHome")
	public XTN_v25[] getPid_13_phoneNumberHome() {
		XTN_v25[] phoneNumberHome  = new XTN_v25[this.pid.getPid13_PhoneNumberHome().length];
		for(int i = 0; i< this.pid.getPid13_PhoneNumberHome().length ; i++) {
			phoneNumberHome[i] = new XTN_v25(
					this.pid.getPid13_PhoneNumberHome(i).getXtn1_TelephoneNumber().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn1_TelephoneNumber().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn2_TelecommunicationUseCode().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn3_TelecommunicationEquipmentType().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn4_EmailAddress().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn4_EmailAddress().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn5_CountryCode().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn5_CountryCode().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn6_AreaCityCode().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn6_AreaCityCode().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn7_LocalNumber().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn7_LocalNumber().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn8_Extension().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn8_Extension().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn9_AnyText().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn9_AnyText().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn10_ExtensionPrefix().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn10_ExtensionPrefix().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn11_SpeedDialCode().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn11_SpeedDialCode().getValue(),
					this.pid.getPid13_PhoneNumberHome(i).getXtn12_UnformattedTelephoneNumber().getValue()==null?"":this.pid.getPid13_PhoneNumberHome(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return phoneNumberHome;
	}
	/**
	 * @param pid_13_phoneNumberHome the pid_13_phoneNumberHome to set
	 * @JsonProperty("pid_13_phoneNumberHome")
	 * @throws DataTypeException 
	 */
	public void setPid_13_phoneNumberHome(XTN_v25[] pid_13_phoneNumberHome) throws DataTypeException {
		for(int i = 0; i< pid_13_phoneNumberHome.length ; i++) {
			this.pid.getPid13_PhoneNumberHome(i).getXtn1_TelephoneNumber().setValue(pid_13_phoneNumberHome[i].getXtn_1_telephoneNumber());
			this.pid.getPid13_PhoneNumberHome(i).getXtn2_TelecommunicationUseCode().setValue(pid_13_phoneNumberHome[i].getXtn_2_telecommunicationUseCode());
			this.pid.getPid13_PhoneNumberHome(i).getXtn3_TelecommunicationEquipmentType().setValue(pid_13_phoneNumberHome[i].getXtn_3_telecommunicationEquipmentType());
			this.pid.getPid13_PhoneNumberHome(i).getXtn4_EmailAddress().setValue(pid_13_phoneNumberHome[i].getXtn_4_emailAddress());
			this.pid.getPid13_PhoneNumberHome(i).getXtn5_CountryCode().setValue(pid_13_phoneNumberHome[i].getXtn_5_countryCode());
			this.pid.getPid13_PhoneNumberHome(i).getXtn6_AreaCityCode().setValue(pid_13_phoneNumberHome[i].getXtn_6_areaCityCode());
			this.pid.getPid13_PhoneNumberHome(i).getXtn7_LocalNumber().setValue(pid_13_phoneNumberHome[i].getXtn_7_localNumber());
			this.pid.getPid13_PhoneNumberHome(i).getXtn8_Extension().setValue(pid_13_phoneNumberHome[i].getXtn_8_extension());
			this.pid.getPid13_PhoneNumberHome(i).getXtn9_AnyText().setValue(pid_13_phoneNumberHome[i].getXtn_9_anyText());
			this.pid.getPid13_PhoneNumberHome(i).getXtn10_ExtensionPrefix().setValue(pid_13_phoneNumberHome[i].getXtn_10_extensionPrefix());
			this.pid.getPid13_PhoneNumberHome(i).getXtn11_SpeedDialCode().setValue(pid_13_phoneNumberHome[i].getXtn_11_SpeedDialCode());
			this.pid.getPid13_PhoneNumberHome(i).getXtn12_UnformattedTelephoneNumber().setValue(pid_13_phoneNumberHome[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.pid_13_phoneNumberHome = pid_13_phoneNumberHome;
	}
	/**
	 * @return the pid_14_phoneNumberBusiness
	 *	@JsonProperty("pid_14_phoneNumberBusiness")
	 */
	
	public XTN_v25[] getPid_14_phoneNumberBusiness() {
		XTN_v25[] phoneNumberBusiness  = new XTN_v25[this.pid.getPid14_PhoneNumberBusiness().length];
		for(int i = 0; i< this.pid.getPid14_PhoneNumberBusiness().length ; i++) {
			phoneNumberBusiness[i] = new XTN_v25(
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn1_TelephoneNumber().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn1_TelephoneNumber().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn2_TelecommunicationUseCode().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn3_TelecommunicationEquipmentType().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn4_EmailAddress().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn4_EmailAddress().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn5_CountryCode().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn5_CountryCode().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn6_AreaCityCode().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn6_AreaCityCode().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn7_LocalNumber().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn7_LocalNumber().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn8_Extension().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn8_Extension().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn9_AnyText().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn9_AnyText().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn10_ExtensionPrefix().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn10_ExtensionPrefix().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn11_SpeedDialCode().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn11_SpeedDialCode().getValue(),
					this.pid.getPid14_PhoneNumberBusiness(i).getXtn12_UnformattedTelephoneNumber().getValue()==null?"":this.pid.getPid14_PhoneNumberBusiness(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return phoneNumberBusiness;
	}
	/**
	 * @param pid_14_phoneNumberBusiness the pid_14_phoneNumberBusiness to set
	 * @JsonProperty("pid_14_phoneNumberBusiness")
	 * @throws DataTypeException 
	 */
	public void setPid_14_phoneNumberBusiness(XTN_v25[] pid_14_phoneNumberBusiness) throws DataTypeException {
		for(int i = 0; i< pid_14_phoneNumberBusiness.length ; i++) {
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn1_TelephoneNumber().setValue(pid_14_phoneNumberBusiness[i].getXtn_1_telephoneNumber());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn2_TelecommunicationUseCode().setValue(pid_14_phoneNumberBusiness[i].getXtn_2_telecommunicationUseCode());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn3_TelecommunicationEquipmentType().setValue(pid_14_phoneNumberBusiness[i].getXtn_3_telecommunicationEquipmentType());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn4_EmailAddress().setValue(pid_14_phoneNumberBusiness[i].getXtn_4_emailAddress());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn5_CountryCode().setValue(pid_14_phoneNumberBusiness[i].getXtn_5_countryCode());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn6_AreaCityCode().setValue(pid_14_phoneNumberBusiness[i].getXtn_6_areaCityCode());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn7_LocalNumber().setValue(pid_14_phoneNumberBusiness[i].getXtn_7_localNumber());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn8_Extension().setValue(pid_14_phoneNumberBusiness[i].getXtn_8_extension());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn9_AnyText().setValue(pid_14_phoneNumberBusiness[i].getXtn_9_anyText());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn10_ExtensionPrefix().setValue(pid_14_phoneNumberBusiness[i].getXtn_10_extensionPrefix());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn11_SpeedDialCode().setValue(pid_14_phoneNumberBusiness[i].getXtn_11_SpeedDialCode());
			this.pid.getPid14_PhoneNumberBusiness(i).getXtn12_UnformattedTelephoneNumber().setValue(pid_14_phoneNumberBusiness[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.pid_14_phoneNumberBusiness = pid_14_phoneNumberBusiness;
	}
	/**
	 * @return the pid_15_primaryLanguage
	 */
	
	@JsonProperty("pid_15_primaryLanguage")
	public CE_v2 getPid_15_primaryLanguage() {
		return new CE_v2(
				this.pid.getPid15_PrimaryLanguage().getCe1_Identifier().getValue()==null?"":this.pid.getPid15_PrimaryLanguage().getCe1_Identifier().getValue(),
				this.pid.getPid15_PrimaryLanguage().getCe2_Text().getValue()==null?"":this.pid.getPid15_PrimaryLanguage().getCe2_Text().getValue(),
				this.pid.getPid15_PrimaryLanguage().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid15_PrimaryLanguage().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid15_PrimaryLanguage().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid15_PrimaryLanguage().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid15_PrimaryLanguage().getCe5_AlternateText().getValue()==null?"":this.pid.getPid15_PrimaryLanguage().getCe5_AlternateText().getValue(),
				this.pid.getPid15_PrimaryLanguage().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid15_PrimaryLanguage().getCe6_NameOfAlternateCodingSystem().getValue()); 
	}
	/**
	 * @param pid_15_primaryLanguage the pid_15_primaryLanguage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_15_primaryLanguage")
	public void setPid_15_primaryLanguage(CE_v2 pid_15_primaryLanguage) throws DataTypeException {
		this.pid.getPid15_PrimaryLanguage().getCe1_Identifier().setValue(pid_15_primaryLanguage.getCe_1_identifier());
		this.pid.getPid15_PrimaryLanguage().getCe2_Text().setValue(pid_15_primaryLanguage.getCe_2_text());
		this.pid.getPid15_PrimaryLanguage().getCe3_NameOfCodingSystem().setValue(pid_15_primaryLanguage.getCe_3_nameOfCodingSystem());
		this.pid.getPid15_PrimaryLanguage().getCe4_AlternateIdentifier().setValue(pid_15_primaryLanguage.getCe_4_alternateIdentifier());
		this.pid.getPid15_PrimaryLanguage().getCe5_AlternateText().setValue(pid_15_primaryLanguage.getCe_5_alternateText());
		this.pid.getPid15_PrimaryLanguage().getCe6_NameOfAlternateCodingSystem().setValue(pid_15_primaryLanguage.getCe_6_nameOfAlternateCodingSystem());
		this.pid_15_primaryLanguage = pid_15_primaryLanguage;
	}
	/**
	 * @return the pid_16_maritalStatus
	 */
	
	@JsonProperty("pid_16_maritalStatus")
	public CE_v2 getPid_16_maritalStatus() {
		return new CE_v2(
				this.pid.getPid16_MaritalStatus().getCe1_Identifier().getValue()==null?"":this.pid.getPid16_MaritalStatus().getCe1_Identifier().getValue(),
				this.pid.getPid16_MaritalStatus().getCe2_Text().getValue()==null?"":this.pid.getPid16_MaritalStatus().getCe2_Text().getValue(),
				this.pid.getPid16_MaritalStatus().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid16_MaritalStatus().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid16_MaritalStatus().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid16_MaritalStatus().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid16_MaritalStatus().getCe5_AlternateText().getValue()==null?"":this.pid.getPid16_MaritalStatus().getCe5_AlternateText().getValue(),
				this.pid.getPid16_MaritalStatus().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid16_MaritalStatus().getCe6_NameOfAlternateCodingSystem().getValue()); 
	}
	/**
	 * @param pid_16_maritalStatus the pid_16_maritalStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_16_maritalStatus")
	public void setPid_16_maritalStatus(CE_v2 pid_16_maritalStatus) throws DataTypeException {
		this.pid.getPid16_MaritalStatus().getCe1_Identifier().setValue(pid_16_maritalStatus.getCe_1_identifier());
		this.pid.getPid16_MaritalStatus().getCe2_Text().setValue(pid_16_maritalStatus.getCe_2_text());
		this.pid.getPid16_MaritalStatus().getCe3_NameOfCodingSystem().setValue(pid_16_maritalStatus.getCe_3_nameOfCodingSystem());
		this.pid.getPid16_MaritalStatus().getCe4_AlternateIdentifier().setValue(pid_16_maritalStatus.getCe_4_alternateIdentifier());
		this.pid.getPid16_MaritalStatus().getCe5_AlternateText().setValue(pid_16_maritalStatus.getCe_5_alternateText());
		this.pid.getPid16_MaritalStatus().getCe6_NameOfAlternateCodingSystem().setValue(pid_16_maritalStatus.getCe_6_nameOfAlternateCodingSystem());
		this.pid_16_maritalStatus = pid_16_maritalStatus;
	}
	/**
	 * @return the pid_17_religion
	 */
	
	@JsonProperty("pid_17_religion")
	public CE_v2 getPid_17_religion() {
		return new CE_v2(
				this.pid.getPid17_Religion().getCe1_Identifier().getValue()==null?"":this.pid.getPid17_Religion().getCe1_Identifier().getValue(),
				this.pid.getPid17_Religion().getCe2_Text().getValue()==null?"":this.pid.getPid17_Religion().getCe2_Text().getValue(),
				this.pid.getPid17_Religion().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid17_Religion().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid17_Religion().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid17_Religion().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid17_Religion().getCe5_AlternateText().getValue()==null?"":this.pid.getPid17_Religion().getCe5_AlternateText().getValue(),
				this.pid.getPid17_Religion().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid17_Religion().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pid_17_religion the pid_17_religion to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_17_religion")
	public void setPid_17_religion(CE_v2 pid_17_religion) throws DataTypeException {
		this.pid.getPid17_Religion().getCe1_Identifier().setValue(pid_17_religion.getCe_1_identifier());
		this.pid.getPid17_Religion().getCe2_Text().setValue(pid_17_religion.getCe_2_text());
		this.pid.getPid17_Religion().getCe3_NameOfCodingSystem().setValue(pid_17_religion.getCe_3_nameOfCodingSystem());
		this.pid.getPid17_Religion().getCe4_AlternateIdentifier().setValue(pid_17_religion.getCe_4_alternateIdentifier());
		this.pid.getPid17_Religion().getCe5_AlternateText().setValue(pid_17_religion.getCe_5_alternateText());
		this.pid.getPid17_Religion().getCe6_NameOfAlternateCodingSystem().setValue(pid_17_religion.getCe_6_nameOfAlternateCodingSystem());
		this.pid_17_religion = pid_17_religion;
	}
	/**
	 * @return the pid_18_patientAccountNumber
	 *	@JsonProperty("pid_18_patientAccountNumber")
	 */
	
	public CX_v25 getPid_18_patientAccountNumber() {
		return new CX_v25(
				this.pid.getPid18_PatientAccountNumber().getCx1_IDNumber().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx1_IDNumber().getValue(),
				this.pid.getPid18_PatientAccountNumber().getCx2_CheckDigit().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx2_CheckDigit().getValue(),
				this.pid.getPid18_PatientAccountNumber().getCx3_CheckDigitScheme().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx3_CheckDigitScheme().getValue(),
				new HD_v2(
						this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
				this.pid.getPid18_PatientAccountNumber().getCx5_IdentifierTypeCode().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx5_IdentifierTypeCode().getValue(),
				new HD_v2(
						this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
				this.pid.getPid18_PatientAccountNumber().getCx7_EffectiveDate().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx7_EffectiveDate().getValue(),
				this.pid.getPid18_PatientAccountNumber().getCx8_ExpirationDate().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx8_ExpirationDate().getValue(),
				new CWE_v25(
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param pid_18_patientAccountNumber the pid_18_patientAccountNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_18_patientAccountNumber")
	public void setPid_18_patientAccountNumber(CX_v25 pid_18_patientAccountNumber) throws DataTypeException {
		this.pid.getPid18_PatientAccountNumber().getCx1_IDNumber().setValue(pid_18_patientAccountNumber.getCx_1_idNumber());
		this.pid.getPid18_PatientAccountNumber().getCx2_CheckDigit().setValue(pid_18_patientAccountNumber.getCx_2_checkDigit());
		this.pid.getPid18_PatientAccountNumber().getCx3_CheckDigitScheme().setValue(pid_18_patientAccountNumber.getCx_3_checkDigitScheme());
		this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pid_18_patientAccountNumber.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pid_18_patientAccountNumber.getCx_4_assigningAuthority().getHd_2_universalId());
		this.pid.getPid18_PatientAccountNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pid_18_patientAccountNumber.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.pid.getPid18_PatientAccountNumber().getCx5_IdentifierTypeCode().setValue(pid_18_patientAccountNumber.getCx_5_identifierTypeCode());
		this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pid_18_patientAccountNumber.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd2_UniversalID().setValue(pid_18_patientAccountNumber.getCx_6_assigningFacility().getHd_2_universalId());
		this.pid.getPid18_PatientAccountNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pid_18_patientAccountNumber.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.pid.getPid18_PatientAccountNumber().getCx7_EffectiveDate().setValue(pid_18_patientAccountNumber.getCx_7_effectiveDate());
		this.pid.getPid18_PatientAccountNumber().getCx8_ExpirationDate().setValue(pid_18_patientAccountNumber.getCx_8_expirationDate());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.pid.getPid18_PatientAccountNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pid_18_patientAccountNumber.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.pid.getPid18_PatientAccountNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pid_18_patientAccountNumber.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.pid_18_patientAccountNumber = pid_18_patientAccountNumber;
	}
	/**
	 * @return the pid_19_ssn
	 */
	
	@JsonProperty("pid_19_ssn")
	public String getPid_19_ssn() {
		return this.pid.getPid19_SSNNumberPatient().getValue()==null?"":this.pid.getPid19_SSNNumberPatient().getValue();
	}
	/**
	 * @param pid_19_ssn the pid_19_ssn to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_19_ssn")
	public void setPid_19_ssn(String pid_19_ssn) throws DataTypeException {
		this.pid.getPid19_SSNNumberPatient().setValue(pid_19_ssn);
		this.pid_19_ssn = pid_19_ssn;
	}
	/**
	 * @return the pid_20_driversLicenseNumber
	 */
	
	@JsonProperty("pid_20_driversLicenseNumber")
	public DLN_v25 getPid_20_driversLicenseNumber() {
		return new DLN_v25(
				this.pid.getPid20_DriverSLicenseNumberPatient().getDln1_LicenseNumber().getValue()==null?"":this.pid.getPid20_DriverSLicenseNumberPatient().getDln1_LicenseNumber().getValue(),
				this.pid.getPid20_DriverSLicenseNumberPatient().getDln2_IssuingStateProvinceCountry().getValue()==null?"":this.pid.getPid20_DriverSLicenseNumberPatient().getDln2_IssuingStateProvinceCountry().getValue(), 
				this.pid.getPid20_DriverSLicenseNumberPatient().getDln3_ExpirationDate().getValue()==null?"":this.pid.getPid20_DriverSLicenseNumberPatient().getDln3_ExpirationDate().getValue());
	}
	/**
	 * @param pid_20_driversLicenseNumber the pid_20_driversLicenseNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_20_driversLicenseNumber")
	public void setPid_20_driversLicenseNumber(DLN_v25 pid_20_driversLicenseNumber) throws DataTypeException {
		this.pid.getPid20_DriverSLicenseNumberPatient().getDln1_LicenseNumber().setValue(pid_20_driversLicenseNumber.getDln_1_licenseNumber());
		this.pid.getPid20_DriverSLicenseNumberPatient().getDln2_IssuingStateProvinceCountry().setValue(pid_20_driversLicenseNumber.getDln_2_issuingStateProvinceCountry());
		this.pid.getPid20_DriverSLicenseNumberPatient().getDln3_ExpirationDate().setValue(pid_20_driversLicenseNumber.getDln_3_expirationDate());
		this.pid_20_driversLicenseNumber = pid_20_driversLicenseNumber;
	}
	/**
	 * @return the pid_21_mothersIdentifier
	 */
	
	@JsonProperty("pid_21_mothersIdentifier")
	public CX_v25[] getPid_21_mothersIdentifier() {
		CX_v25[] mothersIdentifier = new CX_v25[this.pid.getPid21_MotherSIdentifier().length];
		for(int i = 0; i< this.pid.getPid21_MotherSIdentifier().length; i++) {
			mothersIdentifier[i] = new CX_v25(
					this.pid.getPid21_MotherSIdentifier(i).getCx1_IDNumber().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx1_IDNumber().getValue(),
					this.pid.getPid21_MotherSIdentifier(i).getCx2_CheckDigit().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx2_CheckDigit().getValue(),
					this.pid.getPid21_MotherSIdentifier(i).getCx3_CheckDigitScheme().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx3_CheckDigitScheme().getValue(),
					new HD_v2(
							this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pid.getPid21_MotherSIdentifier(i).getCx5_IdentifierTypeCode().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx5_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pid.getPid21_MotherSIdentifier(i).getCx7_EffectiveDate().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx7_EffectiveDate().getValue(),
					this.pid.getPid21_MotherSIdentifier(i).getCx8_ExpirationDate().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx8_ExpirationDate().getValue(),
					new CWE_v25(
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return mothersIdentifier;
		 
	}
	/**
	 * @param pid_21_mothersIdentifier the pid_21_mothersIdentifier to set
	 * @JsonProperty("pid_21_mothersIdentifier")
	 * @throws DataTypeException 
	 */
	public void setPid_21_mothersIdentifier(CX_v25[] pid_21_mothersIdentifier) throws DataTypeException {
		for(int i=0;i<pid_21_mothersIdentifier.length;i++) {
			this.pid.getPid21_MotherSIdentifier(i).getCx1_IDNumber().setValue(pid_21_mothersIdentifier[i].getCx_1_idNumber());
			this.pid.getPid21_MotherSIdentifier(i).getCx2_CheckDigit().setValue(pid_21_mothersIdentifier[i].getCx_2_checkDigit());
			this.pid.getPid21_MotherSIdentifier(i).getCx3_CheckDigitScheme().setValue(pid_21_mothersIdentifier[i].getCx_3_checkDigitScheme());
			this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pid_21_mothersIdentifier[i].getCx_4_assigningAuthority().getHd_1_namespaceId());
			this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pid_21_mothersIdentifier[i].getCx_4_assigningAuthority().getHd_2_universalId());
			this.pid.getPid21_MotherSIdentifier(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pid_21_mothersIdentifier[i].getCx_4_assigningAuthority().getHd_3_universalIdType());
			this.pid.getPid21_MotherSIdentifier(i).getCx5_IdentifierTypeCode().setValue(pid_21_mothersIdentifier[i].getCx_5_identifierTypeCode());
			this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pid_21_mothersIdentifier[i].getCx_6_assigningFacility().getHd_1_namespaceId());
			this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd2_UniversalID().setValue(pid_21_mothersIdentifier[i].getCx_6_assigningFacility().getHd_2_universalId());
			this.pid.getPid21_MotherSIdentifier(i).getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pid_21_mothersIdentifier[i].getCx_6_assigningFacility().getHd_3_universalIdType());
			this.pid.getPid21_MotherSIdentifier(i).getCx7_EffectiveDate().setValue(pid_21_mothersIdentifier[i].getCx_7_effectiveDate());
			this.pid.getPid21_MotherSIdentifier(i).getCx8_ExpirationDate().setValue(pid_21_mothersIdentifier[i].getCx_8_expirationDate());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_1_identifier());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_2_text());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_5_alternateText());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid21_MotherSIdentifier(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pid_21_mothersIdentifier[i].getCx_9_assigningJurisdiction().getCwe_9_originalText());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid21_MotherSIdentifier(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pid_21_mothersIdentifier[i].getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pid_21_mothersIdentifier = pid_21_mothersIdentifier;
	}
	/**
	 * @return the pid_22_ethnicGroup
	 */
	
	@JsonProperty("pid_22_ethnicGroup")
	public CE_v2[] getPid_22_ethnicGroup() {
		CE_v2[] ethnicGroup = new CE_v2[this.pid.getPid22_EthnicGroup().length];
		for(int i = 0; i < this.pid.getPid22_EthnicGroup().length; i++) {
			ethnicGroup[i] = new CE_v2(
					this.pid.getPid22_EthnicGroup(i).getCe1_Identifier().getValue()==null?"":this.pid.getPid22_EthnicGroup(i).getCe1_Identifier().getValue(),
					this.pid.getPid22_EthnicGroup(i).getCe2_Text().getValue()==null?"":this.pid.getPid22_EthnicGroup(i).getCe2_Text().getValue(),
					this.pid.getPid22_EthnicGroup(i).getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid22_EthnicGroup(i).getCe3_NameOfCodingSystem().getValue(), 
					this.pid.getPid22_EthnicGroup(i).getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid22_EthnicGroup(i).getCe4_AlternateIdentifier().getValue(), 
					this.pid.getPid22_EthnicGroup(i).getCe5_AlternateText().getValue()==null?"":this.pid.getPid22_EthnicGroup(i).getCe5_AlternateText().getValue(), 
					this.pid.getPid22_EthnicGroup(i).getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid22_EthnicGroup(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return ethnicGroup;
	}
	/**
	 * @param pid_22_ethnicGroup the pid_22_ethnicGroup to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_22_ethnicGroup")
	public void setPid_22_ethnicGroup(CE_v2[] pid_22_ethnicGroup) throws DataTypeException {
		for(int i=0; i <pid_22_ethnicGroup.length;i++) {
			this.pid.getPid22_EthnicGroup(i).getCe1_Identifier().setValue(pid_22_ethnicGroup[i].getCe_1_identifier());
			this.pid.getPid22_EthnicGroup(i).getCe2_Text().setValue(pid_22_ethnicGroup[i].getCe_2_text());
			this.pid.getPid22_EthnicGroup(i).getCe3_NameOfCodingSystem().setValue(pid_22_ethnicGroup[i].getCe_3_nameOfCodingSystem());
			this.pid.getPid22_EthnicGroup(i).getCe4_AlternateIdentifier().setValue(pid_22_ethnicGroup[i].getCe_4_alternateIdentifier());
			this.pid.getPid22_EthnicGroup(i).getCe5_AlternateText().setValue(pid_22_ethnicGroup[i].getCe_5_alternateText()); 
			this.pid.getPid22_EthnicGroup(i).getCe6_NameOfAlternateCodingSystem().setValue(pid_22_ethnicGroup[i].getCe_6_nameOfAlternateCodingSystem());
		
		}
		this.pid_22_ethnicGroup = pid_22_ethnicGroup;
	}
	/**
	 * @return the pid_23_birthPlace
	 */
	
	@JsonProperty("pid_23_birthPlace")
	public String getPid_23_birthPlace() {
		return this.pid.getPid23_BirthPlace().getValue()==null?"":this.pid.getPid23_BirthPlace().getValue();
	}
	/**
	 * @param pid_23_birthPlace the pid_23_birthPlace to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_23_birthPlace")
	public void setPid_23_birthPlace(String pid_23_birthPlace) throws DataTypeException {
		this.pid.getPid23_BirthPlace().setValue(pid_23_birthPlace);
		this.pid_23_birthPlace = pid_23_birthPlace;
	}
	/**
	 * @return the pid_24_multipleBirthIndicator
	 */
	
	@JsonProperty("pid_24_multipleBirthIndicator")
	public String getPid_24_multipleBirthIndicator() {
		return this.pid.getPid24_MultipleBirthIndicator().getValue()==null?"":this.pid.getPid24_MultipleBirthIndicator().getValue();
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
	 * @return the pid_25_birthOrder
	 */
	
	@JsonProperty("pid_25_birthOrder")
	public String getPid_25_birthOrder() {
		return this.pid.getPid25_BirthOrder().getValue()==null?"":this.pid.getPid25_BirthOrder().getValue();
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
	 * @return the pid_26_citizenship
	 */
	
	@JsonProperty("pid_26_citizenship")
	public CE_v2[] getPid_26_citizenship() {
		CE_v2[] citizenship = new CE_v2[this.pid.getPid26_Citizenship().length];
		for(int i = 0; i <this.pid.getPid26_Citizenship().length; i++) {
			citizenship[i] = new CE_v2(
					this.pid.getPid26_Citizenship(i).getCe1_Identifier().getValue()==null?"":this.pid.getPid26_Citizenship(i).getCe1_Identifier().getValue(),
					this.pid.getPid26_Citizenship(i).getCe2_Text().getValue()==null?"":this.pid.getPid26_Citizenship(i).getCe2_Text().getValue(),
					this.pid.getPid26_Citizenship(i).getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid26_Citizenship(i).getCe3_NameOfCodingSystem().getValue(),
					this.pid.getPid26_Citizenship(i).getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid26_Citizenship(i).getCe4_AlternateIdentifier().getValue(),
					this.pid.getPid26_Citizenship(i).getCe5_AlternateText().getValue()==null?"":this.pid.getPid26_Citizenship(i).getCe5_AlternateText().getValue(),
					this.pid.getPid26_Citizenship(i).getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid26_Citizenship(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return citizenship;
	}
	/**
	 * @param pid_26_citizenship the pid_26_citizenship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_26_citizenship")
	public void setPid_26_citizenship(CE_v2[] pid_26_citizenship) throws DataTypeException {
		for(int i = 0; i <pid_26_citizenship.length; i++) {
			this.pid.getPid26_Citizenship(i).getCe1_Identifier().setValue(pid_26_citizenship[i].getCe_1_identifier());
			this.pid.getPid26_Citizenship(i).getCe2_Text().setValue(pid_26_citizenship[i].getCe_2_text());
			this.pid.getPid26_Citizenship(i).getCe3_NameOfCodingSystem().setValue(pid_26_citizenship[i].getCe_3_nameOfCodingSystem());
			this.pid.getPid26_Citizenship(i).getCe4_AlternateIdentifier().setValue(pid_26_citizenship[i].getCe_4_alternateIdentifier());
			this.pid.getPid26_Citizenship(i).getCe5_AlternateText().setValue(pid_26_citizenship[i].getCe_5_alternateText());
			this.pid.getPid26_Citizenship(i).getCe6_NameOfAlternateCodingSystem().setValue(pid_26_citizenship[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.pid_26_citizenship = pid_26_citizenship;
	}
	/**
	 * @return the pid_27_veteransMilitaryStatus
	 */
	
	@JsonProperty("pid_27_veteransMilitaryStatus")
	public CE_v2 getPid_27_veteransMilitaryStatus() {
		return new CE_v2(
				this.pid.getPid27_VeteransMilitaryStatus().getCe1_Identifier().getValue()==null?"":this.pid.getPid27_VeteransMilitaryStatus().getCe1_Identifier().getValue(),
				this.pid.getPid27_VeteransMilitaryStatus().getCe2_Text().getValue()==null?"":this.pid.getPid27_VeteransMilitaryStatus().getCe2_Text().getValue(),
				this.pid.getPid27_VeteransMilitaryStatus().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid27_VeteransMilitaryStatus().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid27_VeteransMilitaryStatus().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid27_VeteransMilitaryStatus().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid27_VeteransMilitaryStatus().getCe5_AlternateText().getValue()==null?"":this.pid.getPid27_VeteransMilitaryStatus().getCe5_AlternateText().getValue(),
				this.pid.getPid27_VeteransMilitaryStatus().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid27_VeteransMilitaryStatus().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pid_27_veteransMilitaryStatus the pid_27_veteransMilitaryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_27_veteransMilitaryStatus")
	public void setPid_27_veteransMilitaryStatus(CE_v2 pid_27_veteransMilitaryStatus) throws DataTypeException {
		this.pid.getPid27_VeteransMilitaryStatus().getCe1_Identifier().setValue(pid_27_veteransMilitaryStatus.getCe_1_identifier());
		this.pid.getPid27_VeteransMilitaryStatus().getCe2_Text().setValue(pid_27_veteransMilitaryStatus.getCe_2_text());
		this.pid.getPid27_VeteransMilitaryStatus().getCe3_NameOfCodingSystem().setValue(pid_27_veteransMilitaryStatus.getCe_3_nameOfCodingSystem());
		this.pid.getPid27_VeteransMilitaryStatus().getCe4_AlternateIdentifier().setValue(pid_27_veteransMilitaryStatus.getCe_4_alternateIdentifier());
		this.pid.getPid27_VeteransMilitaryStatus().getCe5_AlternateText().setValue(pid_27_veteransMilitaryStatus.getCe_5_alternateText());
		this.pid.getPid27_VeteransMilitaryStatus().getCe6_NameOfAlternateCodingSystem().setValue(pid_27_veteransMilitaryStatus.getCe_6_nameOfAlternateCodingSystem());
		this.pid_27_veteransMilitaryStatus = pid_27_veteransMilitaryStatus;
	}
	/**
	 * @return the pid_28_nationality
	 */
	
	@JsonProperty("pid_28_nationality")
	public CE_v2 getPid_28_nationality() {
		return new CE_v2(
				this.pid.getPid28_Nationality().getCe1_Identifier().getValue()==null?"":this.pid.getPid28_Nationality().getCe1_Identifier().getValue(),
				this.pid.getPid28_Nationality().getCe2_Text().getValue()==null?"":this.pid.getPid28_Nationality().getCe2_Text().getValue(),
				this.pid.getPid28_Nationality().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid28_Nationality().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid28_Nationality().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid28_Nationality().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid28_Nationality().getCe5_AlternateText().getValue()==null?"":this.pid.getPid28_Nationality().getCe5_AlternateText().getValue(),
				this.pid.getPid28_Nationality().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid28_Nationality().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pid_28_nationality the pid_28_nationality to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_28_nationality")
	public void setPid_28_nationality(CE_v2 pid_28_nationality) throws DataTypeException {
		this.pid.getPid28_Nationality().getCe1_Identifier().setValue(pid_28_nationality.getCe_1_identifier());
		this.pid.getPid28_Nationality().getCe2_Text().setValue(pid_28_nationality.getCe_2_text());
		this.pid.getPid28_Nationality().getCe3_NameOfCodingSystem().setValue(pid_28_nationality.getCe_3_nameOfCodingSystem());
		this.pid.getPid28_Nationality().getCe4_AlternateIdentifier().setValue(pid_28_nationality.getCe_4_alternateIdentifier());
		this.pid.getPid28_Nationality().getCe5_AlternateText().setValue(pid_28_nationality.getCe_5_alternateText());
		this.pid.getPid28_Nationality().getCe6_NameOfAlternateCodingSystem().setValue(pid_28_nationality.getCe_6_nameOfAlternateCodingSystem());
		this.pid_28_nationality = pid_28_nationality;
	}
	/**
	 * @return the pid_29_patientDeathDateandTime
	 */
	
	@JsonProperty("pid_29_patientDeathDateandTime")
	public TS_v2 getPid_29_patientDeathDateandTime() {
		return new TS_v2(
				this.pid.getPid29_PatientDeathDateAndTime().getTs1_Time().getValue()==null?"":this.pid.getPid29_PatientDeathDateAndTime().getTs1_Time().getValue(),
				this.pid.getPid29_PatientDeathDateAndTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid29_PatientDeathDateAndTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pid_29_patientDeathDateandTime the pid_29_patientDeathDateandTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_29_patientDeathDateandTime")
	public void setPid_29_patientDeathDateandTime(TS_v2 pid_29_patientDeathDateandTime) throws DataTypeException {
		this.pid.getPid29_PatientDeathDateAndTime().getTs1_Time().setValue(pid_29_patientDeathDateandTime.getTs_1_time());
		this.pid.getPid29_PatientDeathDateAndTime().getTs2_DegreeOfPrecision().setValue(pid_29_patientDeathDateandTime.getTs_2_degreeOfPrecision());
		this.pid_29_patientDeathDateandTime = pid_29_patientDeathDateandTime;
	}
	/**
	 * @return the pid_30_patientDeathIndicator
	 */
	
	@JsonProperty("pid_30_patientDeathIndicator")
	public String getPid_30_patientDeathIndicator() {
		return this.pid.getPid30_PatientDeathIndicator().getValue()==null?"":this.pid.getPid30_PatientDeathIndicator().getValue();
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
	 * @return the pid_31_identityUnknownIndicator
	 */
	
	@JsonProperty("pid_31_identityUnknownIndicator")
	public String getPid_31_identityUnknownIndicator() {
		return this.pid.getPid31_IdentityUnknownIndicator().getValue()==null?"":this.pid.getPid31_IdentityUnknownIndicator().getValue();
	}
	/**
	 * @param pid_31_identityUnknownIndicator the pid_31_identityUnknownIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_31_identityUnknownIndicator")
	public void setPid_31_identityUnknownIndicator(String pid_31_identityUnknownIndicator) throws DataTypeException {
		this.pid.getPid31_IdentityUnknownIndicator().setValue(pid_31_identityUnknownIndicator);
		this.pid_31_identityUnknownIndicator = pid_31_identityUnknownIndicator;
	}
	/**
	 * @return the pid_32_identityReliabilityCode
	 */
	
	@JsonProperty("pid_32_identityReliabilityCode")
	public String[] getPid_32_identityReliabilityCode() {
		String[] identityReliabilityCode = new String[this.pid.getPid32_IdentityReliabilityCode().length];
		for(int i = 0; i < this.pid.getPid32_IdentityReliabilityCode().length; i++) {
			identityReliabilityCode[i] = this.pid.getPid32_IdentityReliabilityCode(i).getValue()==null?"":this.pid.getPid32_IdentityReliabilityCode(i).getValue();
		}
		return identityReliabilityCode;
	}
	/**
	 * @param pid_32_identityReliabilityCode the pid_32_identityReliabilityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_32_identityReliabilityCode")
	public void setPid_32_identityReliabilityCode(String[] pid_32_identityReliabilityCode) throws DataTypeException {
		for(int i = 0; i < pid_32_identityReliabilityCode.length; i++) {
			this.pid.getPid32_IdentityReliabilityCode(i).setValue(pid_32_identityReliabilityCode[i]);
		}
		this.pid_32_identityReliabilityCode = pid_32_identityReliabilityCode;
	}
	/**
	 * @return the pid_33_lastUpdateDateTime
	 */
	
	@JsonProperty("pid_33_lastUpdateDateTime")
	public TS_v2 getPid_33_lastUpdateDateTime() {
		return new TS_v2(
				this.pid.getPid33_LastUpdateDateTime().getTs1_Time().getValue()==null?"":this.pid.getPid33_LastUpdateDateTime().getTs1_Time().getValue(),
				this.pid.getPid33_LastUpdateDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.pid.getPid33_LastUpdateDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param pid_33_lastUpdateDateTime the pid_33_lastUpdateDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_33_lastUpdateDateTime")
	public void setPid_33_lastUpdateDateTime(TS_v2 pid_33_lastUpdateDateTime) throws DataTypeException {
		this.pid.getPid33_LastUpdateDateTime().getTs1_Time().setValue(pid_33_lastUpdateDateTime.getTs_1_time());
		this.pid.getPid33_LastUpdateDateTime().getTs2_DegreeOfPrecision().setValue(pid_33_lastUpdateDateTime.getTs_2_degreeOfPrecision());
		this.pid_33_lastUpdateDateTime = pid_33_lastUpdateDateTime;
	}
	/**
	 * @return the pid_34_lastUpdateFacility
	 */
	
	@JsonProperty("pid_34_lastUpdateFacility")
	public HD_v2 getPid_34_lastUpdateFacility() {
		return new HD_v2(
				this.pid.getPid34_LastUpdateFacility().getHd1_NamespaceID().getValue()==null?"":this.pid.getPid34_LastUpdateFacility().getHd1_NamespaceID().getValue(),
				this.pid.getPid34_LastUpdateFacility().getHd2_UniversalID().getValue()==null?"":this.pid.getPid34_LastUpdateFacility().getHd2_UniversalID().getValue(),
				this.pid.getPid34_LastUpdateFacility().getHd3_UniversalIDType().getValue()==null?"":this.pid.getPid34_LastUpdateFacility().getHd3_UniversalIDType().getValue());
	}
	/**
	 * @param pid_34_lastUpdateFacility the pid_34_lastUpdateFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_34_lastUpdateFacility")
	public void setPid_34_lastUpdateFacility(HD_v2 pid_34_lastUpdateFacility) throws DataTypeException {
		this.pid.getPid34_LastUpdateFacility().getHd1_NamespaceID().setValue(pid_34_lastUpdateFacility.getHd_1_namespaceId());
		this.pid.getPid34_LastUpdateFacility().getHd2_UniversalID().setValue(pid_34_lastUpdateFacility.getHd_2_universalId());
		this.pid.getPid34_LastUpdateFacility().getHd3_UniversalIDType().setValue(pid_34_lastUpdateFacility.getHd_3_universalIdType());
		this.pid_34_lastUpdateFacility = pid_34_lastUpdateFacility;
	}
	/**
	 * @return the pid_35_speciesCode
	 */
	
	@JsonProperty("pid_35_speciesCode")
	public CE_v2 getPid_35_speciesCode() {
		return new CE_v2(
				this.pid.getPid35_SpeciesCode().getCe1_Identifier().getValue()==null?"":this.pid.getPid35_SpeciesCode().getCe1_Identifier().getValue(),
				this.pid.getPid35_SpeciesCode().getCe2_Text().getValue()==null?"":this.pid.getPid35_SpeciesCode().getCe2_Text().getValue(),
				this.pid.getPid35_SpeciesCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid35_SpeciesCode().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid35_SpeciesCode().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid35_SpeciesCode().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid35_SpeciesCode().getCe5_AlternateText().getValue()==null?"":this.pid.getPid35_SpeciesCode().getCe5_AlternateText().getValue(),
				this.pid.getPid35_SpeciesCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid35_SpeciesCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pid_35_speciesCode the pid_35_speciesCode to set
	 * @JsonProperty("pid_35_speciesCode")
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_35_speciesCode")
	public void setPid_35_speciesCode(CE_v2 pid_35_speciesCode) throws DataTypeException {
		this.pid.getPid35_SpeciesCode().getCe1_Identifier().setValue(pid_35_speciesCode.getCe_1_identifier());
		this.pid.getPid35_SpeciesCode().getCe2_Text().setValue(pid_35_speciesCode.getCe_2_text());
		this.pid.getPid35_SpeciesCode().getCe3_NameOfCodingSystem().setValue(pid_35_speciesCode.getCe_3_nameOfCodingSystem());
		this.pid.getPid35_SpeciesCode().getCe4_AlternateIdentifier().setValue(pid_35_speciesCode.getCe_4_alternateIdentifier());
		this.pid.getPid35_SpeciesCode().getCe5_AlternateText().setValue(pid_35_speciesCode.getCe_5_alternateText());
		this.pid.getPid35_SpeciesCode().getCe6_NameOfAlternateCodingSystem().setValue(pid_35_speciesCode.getCe_6_nameOfAlternateCodingSystem());
		this.pid_35_speciesCode = pid_35_speciesCode;
	}
	/**
	 * @return the pid_36_breedCode
	 *	@JsonProperty("pid_36_breedCode")
	 */
	@JsonProperty("pid_36_breedCode")
	public CE_v2 getPid_36_breedCode() {
		return new CE_v2(
				this.pid.getPid36_BreedCode().getCe1_Identifier().getValue()==null?"":this.pid.getPid36_BreedCode().getCe1_Identifier().getValue(),
				this.pid.getPid36_BreedCode().getCe2_Text().getValue()==null?"":this.pid.getPid36_BreedCode().getCe2_Text().getValue(),
				this.pid.getPid36_BreedCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid36_BreedCode().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid36_BreedCode().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid36_BreedCode().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid36_BreedCode().getCe5_AlternateText().getValue()==null?"":this.pid.getPid36_BreedCode().getCe5_AlternateText().getValue(),
				this.pid.getPid36_BreedCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid36_BreedCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pid_36_breedCode the pid_36_breedCode to set
	 * @JsonProperty("pid_36_breedCode")
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_36_breedCode")
	public void setPid_36_breedCode(CE_v2 pid_36_breedCode) throws DataTypeException {
		this.pid.getPid36_BreedCode().getCe1_Identifier().setValue(pid_36_breedCode.getCe_1_identifier());
		this.pid.getPid36_BreedCode().getCe2_Text().setValue(pid_36_breedCode.getCe_2_text());
		this.pid.getPid36_BreedCode().getCe3_NameOfCodingSystem().setValue(pid_36_breedCode.getCe_3_nameOfCodingSystem());
		this.pid.getPid36_BreedCode().getCe4_AlternateIdentifier().setValue(pid_36_breedCode.getCe_4_alternateIdentifier());
		this.pid.getPid36_BreedCode().getCe5_AlternateText().setValue(pid_36_breedCode.getCe_5_alternateText());
		this.pid.getPid36_BreedCode().getCe6_NameOfAlternateCodingSystem().setValue(pid_36_breedCode.getCe_6_nameOfAlternateCodingSystem());
		this.pid_36_breedCode = pid_36_breedCode;
	}
	/**
	 * @return the pid_37_strain
	 *	@JsonProperty("pid_37_strain")
	 */
	@JsonProperty("pid_37_strain")
	public String getPid_37_strain() {
		return this.pid.getPid37_Strain().getValue()==null?"":this.pid.getPid37_Strain().getValue();
	}
	/**
	 * @param pid_37_strain the pid_37_strain to set
	 * @JsonProperty("pid_37_strain")
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_37_strain")
	public void setPid_37_strain(String pid_37_strain) throws DataTypeException {
		this.pid.getPid37_Strain().setValue(pid_37_strain);
		this.pid_37_strain = pid_37_strain;
	}
	/**
	 * @return the pid_38_productionClassCode
	 *	@JsonProperty("pid_38_productionClassCode")
	 */
	@JsonProperty("pid_38_productionClassCode")
	public CE_v2 getPid_38_productionClassCode() {
		return new CE_v2(
				this.pid.getPid38_ProductionClassCode().getCe1_Identifier().getValue()==null?"":this.pid.getPid38_ProductionClassCode().getCe1_Identifier().getValue(),
				this.pid.getPid38_ProductionClassCode().getCe2_Text().getValue()==null?"":this.pid.getPid38_ProductionClassCode().getCe2_Text().getValue(),
				this.pid.getPid38_ProductionClassCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid38_ProductionClassCode().getCe3_NameOfCodingSystem().getValue(),
				this.pid.getPid38_ProductionClassCode().getCe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid38_ProductionClassCode().getCe4_AlternateIdentifier().getValue(),
				this.pid.getPid38_ProductionClassCode().getCe5_AlternateText().getValue()==null?"":this.pid.getPid38_ProductionClassCode().getCe5_AlternateText().getValue(),
				this.pid.getPid38_ProductionClassCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid38_ProductionClassCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pid_38_productionClassCode the pid_38_productionClassCode to set
	 * @JsonProperty("pid_38_productionClassCode")
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_38_productionClassCode")
	public void setPid_38_productionClassCode(CE_v2 pid_38_productionClassCode) throws DataTypeException {
		this.pid.getPid38_ProductionClassCode().getCe1_Identifier().setValue(pid_38_productionClassCode.getCe_1_identifier());
		this.pid.getPid38_ProductionClassCode().getCe2_Text().setValue(pid_38_productionClassCode.getCe_2_text());
		this.pid.getPid38_ProductionClassCode().getCe3_NameOfCodingSystem().setValue(pid_38_productionClassCode.getCe_3_nameOfCodingSystem());
		this.pid.getPid38_ProductionClassCode().getCe4_AlternateIdentifier().setValue(pid_38_productionClassCode.getCe_4_alternateIdentifier());
		this.pid.getPid38_ProductionClassCode().getCe5_AlternateText().setValue(pid_38_productionClassCode.getCe_5_alternateText());
		this.pid.getPid38_ProductionClassCode().getCe6_NameOfAlternateCodingSystem().setValue(pid_38_productionClassCode.getCe_6_nameOfAlternateCodingSystem());
		this.pid_38_productionClassCode = pid_38_productionClassCode;
	}
	/**
	 * @return the pid_39_tribalCitizenship
	 */
	
	@JsonProperty("pid_39_tribalCitizenship")
	public CWE_v25[] getPid_39_tribalCitizenship() {
		CWE_v25[] tribalCitizenship = new CWE_v25[this.pid.getPid39_TribalCitizenship().length];
		for( int i =0; i< this.pid.getPid39_TribalCitizenship().length-1; i++) {
			tribalCitizenship[i] = new CWE_v25(
					this.pid.getPid39_TribalCitizenship(i).getCwe1_Identifier().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe1_Identifier().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe2_Text().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe2_Text().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe3_NameOfCodingSystem().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe3_NameOfCodingSystem().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe4_AlternateIdentifier().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe4_AlternateIdentifier().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe5_AlternateText().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe5_AlternateText().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe7_CodingSystemVersionID().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe7_CodingSystemVersionID().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.pid.getPid39_TribalCitizenship(i).getCwe9_OriginalText().getValue()==null?"":this.pid.getPid39_TribalCitizenship(i).getCwe9_OriginalText().getValue());
		}
		return tribalCitizenship;
	}
	/**
	 * @param pid_39_tribalCitizenship the pid_39_tribalCitizenship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pid_39_tribalCitizenship")
	public void setPid_39_tribalCitizenship(CWE_v25[] pid_39_tribalCitizenship) throws DataTypeException {
		for( int i =0; i< pid_39_tribalCitizenship.length-1; i++) {
			this.pid.getPid39_TribalCitizenship(i).getCwe1_Identifier().setValue(pid_39_tribalCitizenship[i].getCwe_1_identifier());
			this.pid.getPid39_TribalCitizenship(i).getCwe2_Text().setValue(pid_39_tribalCitizenship[i].getCwe_2_text());
			this.pid.getPid39_TribalCitizenship(i).getCwe3_NameOfCodingSystem().setValue(pid_39_tribalCitizenship[i].getCwe_3_nameOfCodingSystem());
			this.pid.getPid39_TribalCitizenship(i).getCwe4_AlternateIdentifier().setValue(pid_39_tribalCitizenship[i].getCwe_4_alternateIdentifier());
			this.pid.getPid39_TribalCitizenship(i).getCwe5_AlternateText().setValue(pid_39_tribalCitizenship[i].getCwe_5_alternateText());
			this.pid.getPid39_TribalCitizenship(i).getCwe6_NameOfAlternateCodingSystem().setValue(pid_39_tribalCitizenship[i].getCwe_6_nameOfAlternateCodingSystem());
			this.pid.getPid39_TribalCitizenship(i).getCwe7_CodingSystemVersionID().setValue(pid_39_tribalCitizenship[i].getCwe_7_codingSystemVersionId());
			this.pid.getPid39_TribalCitizenship(i).getCwe8_AlternateCodingSystemVersionID().setValue(pid_39_tribalCitizenship[i].getCwe_8_alternateCodingSystemVersionId());
			this.pid.getPid39_TribalCitizenship(i).getCwe9_OriginalText().setValue(pid_39_tribalCitizenship[i].getCwe_9_originalText());
			
		}
		this.pid_39_tribalCitizenship = pid_39_tribalCitizenship;
	}
	/**
	 * @return the nte
	 *	@JsonProperty("nte")
	 */
	
	public List<CustomNTE_v25> getNte() {
		return nte;
	}
	/**
	 * @param nte the nte to set
	 * @JsonProperty("nte")
	 */
	public void setNte(List<CustomNTE_v25> nte) {
		this.nte = nte;
	}
	/**
	 * @return the pid
	 *	@JsonProperty("pid")
	 */
	
}
