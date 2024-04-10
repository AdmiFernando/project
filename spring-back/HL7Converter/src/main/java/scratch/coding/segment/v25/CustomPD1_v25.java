package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.PD1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPD1_v25 {
	@JsonProperty("pd1_1_livingDependency")
	private String[] pd1_1_livingDependency;
	@JsonProperty("pd1_2_livingArrangement")
	private String pd1_2_livingArrangement;
	@JsonProperty("pd1_3_patientPrimaryFacility")
	private XON_v25[] pd1_3_patientPrimaryFacility;
	@JsonProperty("pd1_4_patientPrimaryCareProviderNameandIDNo")
	private XCN_v25[] pd1_4_patientPrimaryCareProviderNameandIDNo;
	@JsonProperty("pd1_5_studentIndicator")
	private String pd1_5_studentIndicator;
	@JsonProperty("pd1_6_handicap")
	private String pd1_6_handicap;
	@JsonProperty("pd1_7_livingWillCode")
	private String pd1_7_livingWillCode;
	@JsonProperty("pd1_8_organDonorCode")
	private String pd1_8_organDonorCode;
	@JsonProperty("pd1_9_separateBill")
	private String pd1_9_separateBill;
	@JsonProperty("pd1_10_duplicatePatient")
	private CX_v25[] pd1_10_duplicatePatient;
	@JsonProperty("pd1_11_publicityCode")
	private CE_v2 pd1_11_publicityCode;
	@JsonProperty("pd1_12_protectionIndicator")
	private String pd1_12_protectionIndicator;
	@JsonProperty("pd1_13_protectionIndicatorEffectiveDate")
	private String pd1_13_protectionIndicatorEffectiveDate;
	@JsonProperty("pd1_14_placeofWorship")
	private XON_v25[] pd1_14_placeofWorship;
	@JsonProperty("pd1_15_advanceDirectiveCode")
	private CE_v2[] pd1_15_advanceDirectiveCode;
	@JsonProperty("pd1_16_immunizationRegistryStatus")
	private String pd1_16_immunizationRegistryStatus;
	@JsonProperty("pd1_17_immunizationRegistryStatusEffectiveDate")
	private String pd1_17_immunizationRegistryStatusEffectiveDate;
	@JsonProperty("pd1_18_publicityCodeEffectiveDate")
	private String pd1_18_publicityCodeEffectiveDate;
	@JsonProperty("pd1_19_militaryBranch")
	private String pd1_19_militaryBranch;
	@JsonProperty("pd1_20_militaryRankGrade")
	private String pd1_20_militaryRankGrade;
	@JsonProperty("pd1_21_militaryStatus")
	private String pd1_21_militaryStatus;
	
	private PD1 pd1;
	
	private CustomPD1_v25(PD1 pd1, CustomNTE_v25[] nte) {
		super();
		this.pd1 =pd1;
//		setNte(nte);
	}
	private CustomPD1_v25(PD1 pd1) {
		super();
		this.pd1 = pd1;
	}
	
	public CustomPD1_v25() {
		super();
	}
	public static CustomPD1_v25 createPD1WithPD1(PD1 pd1) throws HL7Exception, IOException {
		return new CustomPD1_v25(pd1);
	}

	public static CustomPD1_v25 createPD1WithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		PD1 pd1 = oru.getPATIENT_RESULT().getPATIENT().getPD1();
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
		return new CustomPD1_v25(pd1);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the pd1_1_livingDependency
	 */
	
	@JsonProperty("pd1_1_livingDependency")
	public String[] getPd1_1_livingDependency() {
		String[] livingDependency = new String[this.pd1.getPd11_LivingDependency().length];
		for(int i = 0; i< this.pd1.getPd11_LivingDependency().length;i++) {
			livingDependency[i] = this.pd1.getPd11_LivingDependency(i).getValue();
		}
		return livingDependency;
	}
	/**
	 * @param pd1_1_livingDependency the pd1_1_livingDependency to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_1_livingDependency")
	public void setPd1_1_livingDependency(String[] pd1_1_livingDependency) throws DataTypeException {
		for(int i = 0; i< pd1_1_livingDependency.length;i++) {
			this.pd1.getPd11_LivingDependency(i).setValue(pd1_1_livingDependency[i]);
		}
		this.pd1_1_livingDependency = pd1_1_livingDependency;
	}
	/**
	 * @return the pd1_2_livingArrangement
	 */
	
	@JsonProperty("pd1_2_livingArrangement")
	public String getPd1_2_livingArrangement() {
		return this.pd1.getPd12_LivingArrangement().getValue();
	}
	/**
	 * @param pd1_2_livingArrangement the pd1_2_livingArrangement to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_2_livingArrangement")
	public void setPd1_2_livingArrangement(String pd1_2_livingArrangement) throws DataTypeException {
		this.pd1.getPd12_LivingArrangement().setValue(pd1_2_livingArrangement);
		this.pd1_2_livingArrangement = pd1_2_livingArrangement;
	}
	/**
	 * @return the pd1_3_patientPrimaryFacility
	 */
	
	@JsonProperty("pd1_3_patientPrimaryFacility")
	public XON_v25[] getPd1_3_patientPrimaryFacility() {
		XON_v25[] patientPrimaryFacility = new XON_v25[this.pd1.getPd13_PatientPrimaryFacility().length];
		for(int i = 0; i< this.pd1.getPd13_PatientPrimaryFacility().length;i++) {
			patientPrimaryFacility[i] = new XON_v25(
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon1_OrganizationName().getValue(),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon2_OrganizationNameTypeCode().getValue(),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon3_IDNumber().getValue(),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon4_CheckDigit().getValue(),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon5_CheckDigitScheme().getValue(),
					new HD_v2(
							this.pd1.getPd13_PatientPrimaryFacility(i).getXon6_AssigningAuthority().getHd1_NamespaceID().getValue(), 
							this.pd1.getPd13_PatientPrimaryFacility(i).getXon6_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pd1.getPd13_PatientPrimaryFacility(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon7_IdentifierTypeCode().getValue(), 
					new HD_v2(
							this.pd1.getPd13_PatientPrimaryFacility(i).getXon8_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pd1.getPd13_PatientPrimaryFacility(i).getXon8_AssigningFacility().getHd2_UniversalID().getValue(), 
							this.pd1.getPd13_PatientPrimaryFacility(i).getXon8_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon9_NameRepresentationCode().getValue(),
					this.pd1.getPd13_PatientPrimaryFacility(i).getXon10_OrganizationIdentifier().getValue());
		}
		return patientPrimaryFacility;
	}
	/**
	 * @param pd1_3_patientPrimaryFacility the pd1_3_patientPrimaryFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_3_patientPrimaryFacility")
	public void setPd1_3_patientPrimaryFacility(XON_v25[] pd1_3_patientPrimaryFacility) throws DataTypeException {
		for(int i = 0; i< this.pd1.getPd13_PatientPrimaryFacility().length;i++) {
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon1_OrganizationName().setValue(pd1_3_patientPrimaryFacility[i].getXon_1_organizationName());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon2_OrganizationNameTypeCode().setValue(pd1_3_patientPrimaryFacility[i].getXon_2_organizationNameTypeCode());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon3_IDNumber().setValue(pd1_3_patientPrimaryFacility[i].getXon_3_idNumber());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon4_CheckDigit().setValue(pd1_3_patientPrimaryFacility[i].getXon_4_checkDigit());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon5_CheckDigitScheme().setValue(pd1_3_patientPrimaryFacility[i].getXon_5_checkDigitScheme());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon6_AssigningAuthority().getHd1_NamespaceID().setValue(pd1_3_patientPrimaryFacility[i].getXon_6_assigningAuthority().getHd_1_namespaceId());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon6_AssigningAuthority().getHd2_UniversalID().setValue(pd1_3_patientPrimaryFacility[i].getXon_6_assigningAuthority().getHd_2_universalId());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().setValue(pd1_3_patientPrimaryFacility[i].getXon_6_assigningAuthority().getHd_3_universalIdType());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon7_IdentifierTypeCode().setValue(pd1_3_patientPrimaryFacility[i].getXon_7_identifierTypeCode());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon8_AssigningFacility().getHd1_NamespaceID().setValue(pd1_3_patientPrimaryFacility[i].getXon_8_assigningFacility().getHd_1_namespaceId());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon8_AssigningFacility().getHd2_UniversalID().setValue(pd1_3_patientPrimaryFacility[i].getXon_8_assigningFacility().getHd_2_universalId());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon8_AssigningFacility().getHd3_UniversalIDType().setValue(pd1_3_patientPrimaryFacility[i].getXon_8_assigningFacility().getHd_3_universalIdType());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon9_NameRepresentationCode().setValue(pd1_3_patientPrimaryFacility[i].getXon_9_nameRepresentationCode());
			this.pd1.getPd13_PatientPrimaryFacility(i).getXon10_OrganizationIdentifier().setValue(pd1_3_patientPrimaryFacility[i].getXon_10_organizationIdentifier());
		}
		this.pd1_3_patientPrimaryFacility = pd1_3_patientPrimaryFacility;
	}
	/**
	 * @return the pd1_4_patientPrimaryCareProviderNameandIDNo
	 */
	
	@JsonProperty("pd1_4_patientPrimaryCareProviderNameandIDNo")
	public XCN_v25[] getPd1_4_patientPrimaryCareProviderNameandIDNo() {
		XCN_v25[] patientPrimaryCareProviderNameandIDNo = new XCN_v25[this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo().length];
		for(int i = 0; i<this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo().length;i++) {
			patientPrimaryCareProviderNameandIDNo[i] = new XCN_v25(
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn3_GivenName().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn6_PrefixEgDR().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn7_DegreeEgMD().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn10_NameTypeCode().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn12_CheckDigitScheme().getValue(),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return patientPrimaryCareProviderNameandIDNo;
	}
	/**
	 * @param pd1_4_patientPrimaryCareProviderNameandIDNo the pd1_4_patientPrimaryCareProviderNameandIDNo to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_4_patientPrimaryCareProviderNameandIDNo")
	public void setPd1_4_patientPrimaryCareProviderNameandIDNo(XCN_v25[] pd1_4_patientPrimaryCareProviderNameandIDNo) throws DataTypeException {
		for(int i = 0; i<pd1_4_patientPrimaryCareProviderNameandIDNo.length;i++) {
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn1_IDNumber().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_1_idNumber());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn1_Surname().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_2_familyName().getFn_1_surname());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn3_GivenName().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_3_givenName());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn5_SuffixEgJRorIII().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_5_suffixegJrOrIii());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn6_PrefixEgDR().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_6_prefixegDr());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn7_DegreeEgMD().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_7_degreeegMd());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn8_SourceTable().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_8_sourceTable());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn10_NameTypeCode().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_10_nameTypeCode());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn11_IdentifierCheckDigit().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_11_identifierCheckDigit());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn12_CheckDigitScheme().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_12_checkDigitScheme());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn13_IdentifierTypeCode().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_13_identifierTypeCode());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn15_NameRepresentationCode().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_15_nameRepresentationCode());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe1_Identifier().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_16_nameContext().getCe_1_identifier());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe2_Text().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_16_nameContext().getCe_2_text());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe5_AlternateText().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn18_NameAssemblyOrder().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_18_nameAssemblyOrder());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn19_EffectiveDate().getTs1_Time().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_19_effectiveDate().getTs_1_time());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn20_ExpirationDate().getTs1_Time().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_20_expirationDate().getTs_1_time());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn21_ProfessionalSuffix().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_21_professionalSuffix());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pd1_4_patientPrimaryCareProviderNameandIDNo[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.pd1_4_patientPrimaryCareProviderNameandIDNo = pd1_4_patientPrimaryCareProviderNameandIDNo;
	}
	/**
	 * @return the pd1_5_studentIndicator
	 */
	
	@JsonProperty("pd1_5_studentIndicator")
	public String getPd1_5_studentIndicator() {
		return this.pd1.getPd15_StudentIndicator().getValue();
	}
	/**
	 * @param pd1_5_studentIndicator the pd1_5_studentIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_5_studentIndicator")
	public void setPd1_5_studentIndicator(String pd1_5_studentIndicator) throws DataTypeException {
		this.pd1.getPd15_StudentIndicator().setValue(pd1_5_studentIndicator);
		this.pd1_5_studentIndicator = pd1_5_studentIndicator;
	}
	/**
	 * @return the pd1_6_handicap
	 */
	
	@JsonProperty("pd1_6_handicap")
	public String getPd1_6_handicap() {
		return this.pd1.getPd16_Handicap().getValue();
	}
	/**
	 * @param pd1_6_handicap the pd1_6_handicap to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_6_handicap")
	public void setPd1_6_handicap(String pd1_6_handicap) throws DataTypeException {
		this.pd1.getPd16_Handicap().setValue(pd1_6_handicap);
		this.pd1_6_handicap = pd1_6_handicap;
	}
	/**
	 * @return the pd1_7_livingWillCode
	 */
	
	@JsonProperty("pd1_7_livingWillCode")
	public String getPd1_7_livingWillCode() {
		return this.pd1.getPd17_LivingWillCode().getValue();
	}
	/**
	 * @param pd1_7_livingWillCode the pd1_7_livingWillCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_7_livingWillCode")
	public void setPd1_7_livingWillCode(String pd1_7_livingWillCode) throws DataTypeException {
		this.pd1.getPd17_LivingWillCode().setValue(pd1_7_livingWillCode);
		this.pd1_7_livingWillCode = pd1_7_livingWillCode;
	}
	/**
	 * @return the pd1_8_organDonorCode
	 */
	
	@JsonProperty("pd1_8_organDonorCode")
	public String getPd1_8_organDonorCode() {
		return this.pd1.getPd18_OrganDonorCode().getValue();
	}
	/**
	 * @param pd1_8_organDonorCode the pd1_8_organDonorCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_8_organDonorCode")
	public void setPd1_8_organDonorCode(String pd1_8_organDonorCode) throws DataTypeException {
		this.pd1.getPd18_OrganDonorCode().setValue(pd1_8_organDonorCode);
		this.pd1_8_organDonorCode = pd1_8_organDonorCode;
	}
	/**
	 * @return the pd1_9_separateBill
	 */
	
	@JsonProperty("pd1_9_separateBill")
	public String getPd1_9_separateBill() {
		return this.pd1.getPd19_SeparateBill().getValue();
	}
	/**
	 * @param pd1_9_separateBill the pd1_9_separateBill to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_9_separateBill")
	public void setPd1_9_separateBill(String pd1_9_separateBill) throws DataTypeException {
		this.pd1.getPd19_SeparateBill().setValue(pd1_9_separateBill);
		this.pd1_9_separateBill = pd1_9_separateBill;
	}
	/**
	 * @return the pd1_10_duplicatePatient
	 */
	
	@JsonProperty("pd1_10_duplicatePatient")
	public CX_v25[] getPd1_10_duplicatePatient() {
		CX_v25[] duplicatePatient = new CX_v25[this.pd1.getPd110_DuplicatePatient().length];
		for(int i = 0; i<this.pd1.getPd110_DuplicatePatient().length;i++) {
			duplicatePatient[i] = new CX_v25(
					this.pd1.getPd110_DuplicatePatient(i).getCx1_IDNumber().getValue(),
					this.pd1.getPd110_DuplicatePatient(i).getCx2_CheckDigit().getValue(),
					this.pd1.getPd110_DuplicatePatient(i).getCx3_CheckDigitScheme().getValue(),
					new HD_v2(
							this.pd1.getPd110_DuplicatePatient(i).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx4_AssigningAuthority().getHd2_UniversalID().getValue(), 
							this.pd1.getPd110_DuplicatePatient(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()), 
					this.pd1.getPd110_DuplicatePatient(i).getCx5_IdentifierTypeCode().getValue(), 
					new HD_v2(
							this.pd1.getPd110_DuplicatePatient(i).getCx6_AssigningFacility().getHd1_NamespaceID().getValue(), 
							this.pd1.getPd110_DuplicatePatient(i).getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()), 
					this.pd1.getPd110_DuplicatePatient(i).getCx7_EffectiveDate().getValue(),
					this.pd1.getPd110_DuplicatePatient(i).getCx8_ExpirationDate().getValue(),
					new CWE_v25(
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return duplicatePatient;
	}
	/**
	 * @param pd1_10_duplicatePatient the pd1_10_duplicatePatient to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_10_duplicatePatient")
	public void setPd1_10_duplicatePatient(CX_v25[] pd1_10_duplicatePatient) throws DataTypeException {
		for(int i = 0; i<this.pd1.getPd110_DuplicatePatient().length;i++) {
			this.pd1.getPd110_DuplicatePatient(i).getCx1_IDNumber().setValue(pd1_10_duplicatePatient[i].getCx_1_idNumber());
			this.pd1.getPd110_DuplicatePatient(i).getCx2_CheckDigit().setValue(pd1_10_duplicatePatient[i].getCx_2_checkDigit());
			this.pd1.getPd110_DuplicatePatient(i).getCx3_CheckDigitScheme().setValue(pd1_10_duplicatePatient[i].getCx_3_checkDigitScheme());
			this.pd1.getPd110_DuplicatePatient(i).getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(pd1_10_duplicatePatient[i].getCx_4_assigningAuthority().getHd_1_namespaceId());
			this.pd1.getPd110_DuplicatePatient(i).getCx4_AssigningAuthority().getHd2_UniversalID().setValue(pd1_10_duplicatePatient[i].getCx_4_assigningAuthority().getHd_2_universalId());
			this.pd1.getPd110_DuplicatePatient(i).getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(pd1_10_duplicatePatient[i].getCx_4_assigningAuthority().getHd_3_universalIdType());
			this.pd1.getPd110_DuplicatePatient(i).getCx5_IdentifierTypeCode().setValue(pd1_10_duplicatePatient[i].getCx_5_identifierTypeCode()); 
			this.pd1.getPd110_DuplicatePatient(i).getCx6_AssigningFacility().getHd1_NamespaceID().setValue(pd1_10_duplicatePatient[i].getCx_6_assigningFacility().getHd_1_namespaceId());
			this.pd1.getPd110_DuplicatePatient(i).getCx6_AssigningFacility().getHd2_UniversalID().setValue(pd1_10_duplicatePatient[i].getCx_6_assigningFacility().getHd_2_universalId());
			this.pd1.getPd110_DuplicatePatient(i).getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(pd1_10_duplicatePatient[i].getCx_6_assigningFacility().getHd_3_universalIdType());
			this.pd1.getPd110_DuplicatePatient(i).getCx7_EffectiveDate().setValue(pd1_10_duplicatePatient[i].getCx_7_effectiveDate());
			this.pd1.getPd110_DuplicatePatient(i).getCx8_ExpirationDate().setValue(pd1_10_duplicatePatient[i].getCx_8_expirationDate());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_1_identifier());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe2_Text().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_2_text());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_5_alternateText());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.pd1.getPd110_DuplicatePatient(i).getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(pd1_10_duplicatePatient[i].getCx_9_assigningJurisdiction().getCwe_9_originalText());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.pd1.getPd110_DuplicatePatient(i).getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(pd1_10_duplicatePatient[i].getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.pd1_10_duplicatePatient = pd1_10_duplicatePatient;
	}
	/**
	 * @return the pd1_11_publicityCode
	 */
	
	@JsonProperty("pd1_11_publicityCode")
	public CE_v2 getPd1_11_publicityCode() {
		return new CE_v2(
				this.pd1.getPd111_PublicityCode().getCe1_Identifier().getValue(),
				this.pd1.getPd111_PublicityCode().getCe2_Text().getValue(),
				this.pd1.getPd111_PublicityCode().getCe3_NameOfCodingSystem().getValue(),
				this.pd1.getPd111_PublicityCode().getCe4_AlternateIdentifier().getValue(),
				this.pd1.getPd111_PublicityCode().getCe5_AlternateText().getValue(),
				this.pd1.getPd111_PublicityCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param pd1_11_publicityCode the pd1_11_publicityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_11_publicityCode")
	public void setPd1_11_publicityCode(CE_v2 pd1_11_publicityCode) throws DataTypeException {
		this.pd1.getPd111_PublicityCode().getCe1_Identifier().setValue(pd1_11_publicityCode.getCe_1_identifier());
		this.pd1.getPd111_PublicityCode().getCe2_Text().setValue(pd1_11_publicityCode.getCe_2_text());
		this.pd1.getPd111_PublicityCode().getCe3_NameOfCodingSystem().setValue(pd1_11_publicityCode.getCe_3_nameOfCodingSystem());
		this.pd1.getPd111_PublicityCode().getCe4_AlternateIdentifier().setValue(pd1_11_publicityCode.getCe_4_alternateIdentifier());
		this.pd1.getPd111_PublicityCode().getCe5_AlternateText().setValue(pd1_11_publicityCode.getCe_5_alternateText());
		this.pd1.getPd111_PublicityCode().getCe6_NameOfAlternateCodingSystem().setValue(pd1_11_publicityCode.getCe_6_nameOfAlternateCodingSystem());
		this.pd1_11_publicityCode = pd1_11_publicityCode;
	}
	/**
	 * @return the pd1_12_protectionIndicator
	 */
	
	@JsonProperty("pd1_12_protectionIndicator")
	public String getPd1_12_protectionIndicator() {
		return this.pd1.getPd112_ProtectionIndicator().getValue();
	}
	/**
	 * @param pd1_12_protectionIndicator the pd1_12_protectionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_12_protectionIndicator")
	public void setPd1_12_protectionIndicator(String pd1_12_protectionIndicator) throws DataTypeException {
		this.pd1.getPd112_ProtectionIndicator().setValue(pd1_12_protectionIndicator);
		this.pd1_12_protectionIndicator = pd1_12_protectionIndicator;
	}
	/**
	 * @return the pd1_13_protectionIndicatorEffectiveDate
	 */
	
	@JsonProperty("pd1_13_protectionIndicatorEffectiveDate")
	public String getPd1_13_protectionIndicatorEffectiveDate() {
		return this.pd1.getPd113_ProtectionIndicatorEffectiveDate().getValue();
	}
	/**
	 * @param pd1_13_protectionIndicatorEffectiveDate the pd1_13_protectionIndicatorEffectiveDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_13_protectionIndicatorEffectiveDate")
	public void setPd1_13_protectionIndicatorEffectiveDate(String pd1_13_protectionIndicatorEffectiveDate) throws DataTypeException {
		this.pd1.getPd113_ProtectionIndicatorEffectiveDate().setValue(pd1_13_protectionIndicatorEffectiveDate);
		this.pd1_13_protectionIndicatorEffectiveDate = pd1_13_protectionIndicatorEffectiveDate;
	}
	/**
	 * @return the pd1_14_placeofWorship
	 */
	
	@JsonProperty("pd1_14_placeofWorship")
	public XON_v25[] getPd1_14_placeofWorship() {
		XON_v25[] placeofWorship = new XON_v25[this.pd1.getPd114_PlaceOfWorship().length];
		for(int i = 0; i<this.pd1.getPd114_PlaceOfWorship().length;i++) {
			placeofWorship[i] = new XON_v25(
					this.pd1.getPd114_PlaceOfWorship(i).getXon1_OrganizationName().getValue(),
					this.pd1.getPd114_PlaceOfWorship(i).getXon2_OrganizationNameTypeCode().getValue(), 
					this.pd1.getPd114_PlaceOfWorship(i).getXon3_IDNumber().getValue(), 
					this.pd1.getPd114_PlaceOfWorship(i).getXon4_CheckDigit().getValue(), 
					this.pd1.getPd114_PlaceOfWorship(i).getXon5_CheckDigitScheme().getValue(), 
					new HD_v2(
							this.pd1.getPd114_PlaceOfWorship(i).getXon6_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.pd1.getPd114_PlaceOfWorship(i).getXon6_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.pd1.getPd114_PlaceOfWorship(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().getValue()), 
					this.pd1.getPd114_PlaceOfWorship(i).getXon7_IdentifierTypeCode().getValue(), 
					new HD_v2(
							this.pd1.getPd114_PlaceOfWorship(i).getXon8_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.pd1.getPd114_PlaceOfWorship(i).getXon8_AssigningFacility().getHd2_UniversalID().getValue(),
							this.pd1.getPd114_PlaceOfWorship(i).getXon8_AssigningFacility().getHd3_UniversalIDType().getValue()), 
					this.pd1.getPd114_PlaceOfWorship(i).getXon9_NameRepresentationCode().getValue(), 
					this.pd1.getPd114_PlaceOfWorship(i).getXon10_OrganizationIdentifier().getValue());
		}
		return placeofWorship;
	}
	/**
	 * @param pd1_14_placeofWorship the pd1_14_placeofWorship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_14_placeofWorship")
	public void setPd1_14_placeofWorship(XON_v25[] pd1_14_placeofWorship) throws DataTypeException {
		for(int i = 0; i<pd1_14_placeofWorship.length;i++) {
			this.pd1.getPd114_PlaceOfWorship(i).getXon1_OrganizationName().setValue(pd1_14_placeofWorship[i].getXon_1_organizationName());
			this.pd1.getPd114_PlaceOfWorship(i).getXon2_OrganizationNameTypeCode().setValue(pd1_14_placeofWorship[i].getXon_2_organizationNameTypeCode());
			this.pd1.getPd114_PlaceOfWorship(i).getXon3_IDNumber().setValue(pd1_14_placeofWorship[i].getXon_3_idNumber());
			this.pd1.getPd114_PlaceOfWorship(i).getXon4_CheckDigit().setValue(pd1_14_placeofWorship[i].getXon_4_checkDigit()); 
			this.pd1.getPd114_PlaceOfWorship(i).getXon5_CheckDigitScheme().setValue(pd1_14_placeofWorship[i].getXon_5_checkDigitScheme());
			this.pd1.getPd114_PlaceOfWorship(i).getXon6_AssigningAuthority().getHd1_NamespaceID().setValue(pd1_14_placeofWorship[i].getXon_6_assigningAuthority().getHd_1_namespaceId());
			this.pd1.getPd114_PlaceOfWorship(i).getXon6_AssigningAuthority().getHd2_UniversalID().setValue(pd1_14_placeofWorship[i].getXon_6_assigningAuthority().getHd_2_universalId());
			this.pd1.getPd114_PlaceOfWorship(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().setValue(pd1_14_placeofWorship[i].getXon_6_assigningAuthority().getHd_3_universalIdType());
			this.pd1.getPd114_PlaceOfWorship(i).getXon7_IdentifierTypeCode().setValue(pd1_14_placeofWorship[i].getXon_7_identifierTypeCode());
			this.pd1.getPd114_PlaceOfWorship(i).getXon8_AssigningFacility().getHd1_NamespaceID().setValue(pd1_14_placeofWorship[i].getXon_8_assigningFacility().getHd_1_namespaceId());
			this.pd1.getPd114_PlaceOfWorship(i).getXon8_AssigningFacility().getHd2_UniversalID().setValue(pd1_14_placeofWorship[i].getXon_8_assigningFacility().getHd_2_universalId());
			this.pd1.getPd114_PlaceOfWorship(i).getXon8_AssigningFacility().getHd3_UniversalIDType().setValue(pd1_14_placeofWorship[i].getXon_8_assigningFacility().getHd_3_universalIdType());
			this.pd1.getPd114_PlaceOfWorship(i).getXon9_NameRepresentationCode().setValue(pd1_14_placeofWorship[i].getXon_9_nameRepresentationCode());
			this.pd1.getPd114_PlaceOfWorship(i).getXon10_OrganizationIdentifier().setValue(pd1_14_placeofWorship[i].getXon_10_organizationIdentifier());
		}
		this.pd1_14_placeofWorship = pd1_14_placeofWorship;
	}
	/**
	 * @return the pd1_15_advanceDirectiveCode
	 */
	
	@JsonProperty("pd1_15_advanceDirectiveCode")
	public CE_v2[] getPd1_15_advanceDirectiveCode() {
		CE_v2[] advanceDirectiveCode = new CE_v2[this.pd1.getPd115_AdvanceDirectiveCode().length];
		for(int i = 0; i<this.pd1.getPd115_AdvanceDirectiveCode().length;i++) {
			advanceDirectiveCode[i] = new CE_v2(
					this.pd1.getPd115_AdvanceDirectiveCode(i).getCe1_Identifier().getValue(), 
					this.pd1.getPd115_AdvanceDirectiveCode(i).getCe2_Text().getValue(),
					this.pd1.getPd115_AdvanceDirectiveCode(i).getCe3_NameOfCodingSystem().getValue(), 
					this.pd1.getPd115_AdvanceDirectiveCode(i).getCe4_AlternateIdentifier().getValue(), 
					this.pd1.getPd115_AdvanceDirectiveCode(i).getCe5_AlternateText().getValue(),
					this.pd1.getPd115_AdvanceDirectiveCode(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return advanceDirectiveCode;
	}
	/**
	 * @param pd1_15_advanceDirectiveCode the pd1_15_advanceDirectiveCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_15_advanceDirectiveCode")
	public void setPd1_15_advanceDirectiveCode(CE_v2[] pd1_15_advanceDirectiveCode) throws DataTypeException {
		for(int i = 0; i<this.pd1.getPd115_AdvanceDirectiveCode().length;i++) {
			this.pd1.getPd115_AdvanceDirectiveCode(i).getCe1_Identifier().setValue(pd1_15_advanceDirectiveCode[i].getCe_1_identifier()); 
			this.pd1.getPd115_AdvanceDirectiveCode(i).getCe2_Text().setValue(pd1_15_advanceDirectiveCode[i].getCe_2_text());
			this.pd1.getPd115_AdvanceDirectiveCode(i).getCe3_NameOfCodingSystem().setValue(pd1_15_advanceDirectiveCode[i].getCe_3_nameOfCodingSystem());
			this.pd1.getPd115_AdvanceDirectiveCode(i).getCe4_AlternateIdentifier().setValue(pd1_15_advanceDirectiveCode[i].getCe_4_alternateIdentifier()); 
			this.pd1.getPd115_AdvanceDirectiveCode(i).getCe5_AlternateText().setValue(pd1_15_advanceDirectiveCode[i].getCe_5_alternateText());
			this.pd1.getPd115_AdvanceDirectiveCode(i).getCe6_NameOfAlternateCodingSystem().setValue(pd1_15_advanceDirectiveCode[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.pd1_15_advanceDirectiveCode = pd1_15_advanceDirectiveCode;
	}
	/**
	 * @return the pd1_16_immunizationRegistryStatus
	 */
	
	@JsonProperty("pd1_16_immunizationRegistryStatus")
	public String getPd1_16_immunizationRegistryStatus() {
		return this.pd1.getPd116_ImmunizationRegistryStatus().getValue();
	}
	/**
	 * @param pd1_16_immunizationRegistryStatus the pd1_16_immunizationRegistryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_16_immunizationRegistryStatus")
	public void setPd1_16_immunizationRegistryStatus(String pd1_16_immunizationRegistryStatus) throws DataTypeException {
		this.pd1.getPd116_ImmunizationRegistryStatus().setValue(pd1_16_immunizationRegistryStatus);
		this.pd1_16_immunizationRegistryStatus = pd1_16_immunizationRegistryStatus;
	}
	/**
	 * @return the pd1_17_immunizationRegistryStatusEffectiveDate
	 */
	
	@JsonProperty("pd1_17_immunizationRegistryStatusEffectiveDate")
	public String getPd1_17_immunizationRegistryStatusEffectiveDate() {
		return pd1_17_immunizationRegistryStatusEffectiveDate;
	}
	/**
	 * @param pd1_17_immunizationRegistryStatusEffectiveDate the pd1_17_immunizationRegistryStatusEffectiveDate to set
	 */
	@JsonProperty("pd1_17_immunizationRegistryStatusEffectiveDate")
	public void setPd1_17_immunizationRegistryStatusEffectiveDate(String pd1_17_immunizationRegistryStatusEffectiveDate) {
		this.pd1_17_immunizationRegistryStatusEffectiveDate = pd1_17_immunizationRegistryStatusEffectiveDate;
	}
	/**
	 * @return the pd1_18_publicityCodeEffectiveDate
	 */
	
	@JsonProperty("pd1_18_publicityCodeEffectiveDate")
	public String getPd1_18_publicityCodeEffectiveDate() {
		return this.pd1.getPd118_PublicityCodeEffectiveDate().getValue();
	}
	/**
	 * @param pd1_18_publicityCodeEffectiveDate the pd1_18_publicityCodeEffectiveDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_18_publicityCodeEffectiveDate")
	public void setPd1_18_publicityCodeEffectiveDate(String pd1_18_publicityCodeEffectiveDate) throws DataTypeException {
		this.pd1.getPd118_PublicityCodeEffectiveDate().setValue(pd1_18_publicityCodeEffectiveDate);
		this.pd1_18_publicityCodeEffectiveDate = pd1_18_publicityCodeEffectiveDate;
	}
	/**
	 * @return the pd1_19_militaryBranch
	 */
	
	@JsonProperty("pd1_19_militaryBranch")
	public String getPd1_19_militaryBranch() {
		return this.pd1.getPd119_MilitaryBranch().getValue();
	}
	/**
	 * @param pd1_19_militaryBranch the pd1_19_militaryBranch to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_19_militaryBranch")
	public void setPd1_19_militaryBranch(String pd1_19_militaryBranch) throws DataTypeException {
		this.pd1.getPd119_MilitaryBranch().setValue(pd1_19_militaryBranch);
		this.pd1_19_militaryBranch = pd1_19_militaryBranch;
	}
	/**
	 * @return the pd1_20_militaryRankGrade
	 */
	
	@JsonProperty("pd1_20_militaryRankGrade")
	public String getPd1_20_militaryRankGrade() {
		return this.pd1.getPd120_MilitaryRankGrade().getValue();
	}
	/**
	 * @param pd1_20_militaryRankGrade the pd1_20_militaryRankGrade to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_20_militaryRankGrade")
	public void setPd1_20_militaryRankGrade(String pd1_20_militaryRankGrade) throws DataTypeException {
		this.pd1.getPd120_MilitaryRankGrade().setValue(pd1_20_militaryRankGrade);
		this.pd1_20_militaryRankGrade = pd1_20_militaryRankGrade;
	}
	/**
	 * @return the pd1_21_militaryStatus
	 */
	
	@JsonProperty("pd1_21_militaryStatus")
	public String getPd1_21_militaryStatus() {
		return this.pd1.getPd121_MilitaryStatus().getValue();
	}
	/**
	 * @param pd1_21_militaryStatus the pd1_21_militaryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_21_militaryStatus")
	public void setPd1_21_militaryStatus(String pd1_21_militaryStatus) throws DataTypeException {
		this.pd1.getPd121_MilitaryStatus().setValue(pd1_21_militaryStatus);
		this.pd1_21_militaryStatus = pd1_21_militaryStatus;
	}
	@Override
	public String toString() {
		return "CustomPD1_v25 [pd1_1_livingDependency=" + Arrays.toString(pd1_1_livingDependency)
				+ ", pd1_2_livingArrangement=" + pd1_2_livingArrangement + ", pd1_3_patientPrimaryFacility="
				+ Arrays.toString(pd1_3_patientPrimaryFacility) + ", pd1_4_patientPrimaryCareProviderNameandIDNo="
				+ Arrays.toString(pd1_4_patientPrimaryCareProviderNameandIDNo) + ", pd1_5_studentIndicator="
				+ pd1_5_studentIndicator + ", pd1_6_handicap=" + pd1_6_handicap + ", pd1_7_livingWillCode="
				+ pd1_7_livingWillCode + ", pd1_8_organDonorCode=" + pd1_8_organDonorCode + ", pd1_9_separateBill="
				+ pd1_9_separateBill + ", pd1_10_duplicatePatient=" + Arrays.toString(pd1_10_duplicatePatient)
				+ ", pd1_11_publicityCode=" + pd1_11_publicityCode + ", pd1_12_protectionIndicator="
				+ pd1_12_protectionIndicator + ", pd1_13_protectionIndicatorEffectiveDate="
				+ pd1_13_protectionIndicatorEffectiveDate + ", pd1_14_placeofWorship="
				+ Arrays.toString(pd1_14_placeofWorship) + ", pd1_15_advanceDirectiveCode="
				+ Arrays.toString(pd1_15_advanceDirectiveCode) + ", pd1_16_immunizationRegistryStatus="
				+ pd1_16_immunizationRegistryStatus + ", pd1_17_immunizationRegistryStatusEffectiveDate="
				+ pd1_17_immunizationRegistryStatusEffectiveDate + ", pd1_18_publicityCodeEffectiveDate="
				+ pd1_18_publicityCodeEffectiveDate + ", pd1_19_militaryBranch=" + pd1_19_militaryBranch
				+ ", pd1_20_militaryRankGrade=" + pd1_20_militaryRankGrade + ", pd1_21_militaryStatus="
				+ pd1_21_militaryStatus + ", pd1=" + pd1 + "]";
	}
	
	
}
