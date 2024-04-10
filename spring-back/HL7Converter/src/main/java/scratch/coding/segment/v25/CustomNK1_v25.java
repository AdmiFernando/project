package scratch.coding.segment.v25;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.FT1;
import ca.uhn.hl7v2.model.v25.segment.NK1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.JCC_v25;
import scratch.coding.models.v25.SAD_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XON_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomNK1_v25 {
	@JsonProperty("nk1_1_setID")
	private String nk1_1_setID;
	@JsonProperty("nk1_2_nkName")
	private XPN_v25[] nk1_2_nkName;
	@JsonProperty("nk1_3_relationship")
	private CE_v2 nk1_3_relationship;
	@JsonProperty("nk1_4_address")
	private XAD_v25[] nk1_4_address;
	@JsonProperty("nk1_5_phoneNumber")
	private XTN_v25[] nk1_5_phoneNumber;
	@JsonProperty("nk1_6_businessPhoneNumber")
	private XTN_v25[] nk1_6_businessPhoneNumber;
	@JsonProperty("nk1_7_contactRole")
	private CE_v2 nk1_7_contactRole;
	@JsonProperty("nk1_8_startDate")
	private String nk1_8_startDate;
	@JsonProperty("nk1_9_endDate")
	private String nk1_9_endDate;
	@JsonProperty("nk1_10_nextofKinAssociatedPartiesJobTitle")
	private String nk1_10_nextofKinAssociatedPartiesJobTitle;
	@JsonProperty("nk1_11_nextofKinAssociatedPartiesJobCodeClass")
	private JCC_v25 nk1_11_nextofKinAssociatedPartiesJobCodeClass;
	@JsonProperty("nk1_12_nextofKinAssociatedPartiesEmployeeNumber")
	private CX_v25 nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
	@JsonProperty("nk1_13_organizationName")
	private XON_v25[] nk1_13_organizationName;
	@JsonProperty("nk1_14_maritalStatus")
	private CE_v2 nk1_14_maritalStatus;
	@JsonProperty("nk1_15_administrativeSex")
	private String nk1_15_administrativeSex;
	@JsonProperty("nk1_16_dateTimeofBirth")
	private TS_v2 nk1_16_dateTimeofBirth;
	@JsonProperty("nk1_17_livingDependency")
	private String[] nk1_17_livingDependency;
	@JsonProperty("nk1_18_ambulatoryStatus")
	private String[] nk1_18_ambulatoryStatus;
	@JsonProperty("nk1_19_citizenship")
	private CE_v2[] nk1_19_citizenship;
	@JsonProperty("nk1_20_primaryLanguage")
	private CE_v2 nk1_20_primaryLanguage;
	@JsonProperty("nk1_21_livingArrangement")
	private String nk1_21_livingArrangement;
	@JsonProperty("nk1_22_publicityCode")
	private CE_v2 nk1_22_publicityCode;
	@JsonProperty("nk1_23_protectionIndicator")
	private String nk1_23_protectionIndicator;
	@JsonProperty("nk1_24_studentIndicator")
	private String nk1_24_studentIndicator;
	@JsonProperty("nk1_25_religion")
	private CE_v2 nk1_25_religion;
	@JsonProperty("nk1_26_mothersMaidenName")
	private XPN_v25[] nk1_26_mothersMaidenName;
	@JsonProperty("nk1_27_nationality")
	private CE_v2 nk1_27_nationality;
	@JsonProperty("nk1_28_contactReason")
	private CE_v2[] nk1_28_contactReason;
	@JsonProperty("nk1_29_contactReason")
	private CE_v2[] nk1_29_contactReason;
	@JsonProperty("nk1_30_contactPersonsName")
	private XPN_v25[] nk1_30_contactPersonsName;
	@JsonProperty("nk1_31_contactPersonsTelephoneNumber")
	private XTN_v25 nk1_31_contactPersonsTelephoneNumber;
	@JsonProperty("nk1_32_contactPersonsAddress")
	private XAD_v25 nk1_32_contactPersonsAddress;
	@JsonProperty("nk1_33_nextofKinAssociatedPartysIdentifiers")
	private CX_v25 nk1_33_nextofKinAssociatedPartysIdentifiers;
	@JsonProperty("nk1_34_jobStatus")
	private String nk1_34_jobStatus;
	@JsonProperty("nk1_35_race")
	private CE_v2 nk1_35_race;
	@JsonProperty("nk1_36_handicap")
	private String nk1_36_handicap;
	@JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	private String nk1_37_contactPersonSocialSecurityNumber;
	@JsonProperty("nk1_38_nextofKinBirthPlace")
	private String nk1_38_nextofKinBirthPlace;
	@JsonProperty("nk1_39_vipIndicator")
	private String nk1_39_vipIndicator;
	
	private NK1 nk1;
	
	private CustomNK1_v25(NK1 nk1, CustomNTE_v25[] nte) {
		super();
		this.nk1 =nk1;
//		setNte(nte);
	}
	private CustomNK1_v25(NK1 nk1) {
		super();
		this.nk1 = nk1;
	}
	
	public CustomNK1_v25() {
		super();
	}
	public static CustomNK1_v25 createNK1WithNK1(NK1 nk1) throws HL7Exception, IOException {
		return new CustomNK1_v25(nk1);
	}

	public static CustomNK1_v25 createDSCWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		NK1 nk1 = oru.getPATIENT_RESULT().getPATIENT().getNK1();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the nk1_1_setID
	 */
	
	@JsonProperty("nk1_1_setID")
	public String getNk1_1_setID() {
		return this.nk1.getNk11_SetIDNK1().getValue()==null?"":this.nk1.getNk11_SetIDNK1().getValue();
	}
	/**
	 * @param nk1_1_setID the nk1_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_1_setID")
	public void setNk1_1_setID(String nk1_1_setID) throws DataTypeException {
		this.nk1.getNk11_SetIDNK1().setValue(nk1_1_setID);
		this.nk1_1_setID = nk1_1_setID;
	}
	/**
	 * @return the nk1_2_nkName
	 */
	
	@JsonProperty("nk1_2_nkName")
	public XPN_v25[] getNk1_2_nkName() {
		XPN_v25[] nkName = new XPN_v25[this.nk1.getNk126_MotherSMaidenName().length];
		for(int i = 0; i<this.nk1.getNk126_MotherSMaidenName().length-1;i++) {
			nkName[i] = new XPN_v25(
					new FN_v25(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn2_GivenName().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn2_GivenName().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn5_PrefixEgDR().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn5_PrefixEgDR().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn6_DegreeEgMD().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn6_DegreeEgMD().getValue(), 
					this.nk1.getNk126_MotherSMaidenName(i).getXpn7_NameTypeCode().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn7_NameTypeCode().getValue(), 
					this.nk1.getNk126_MotherSMaidenName(i).getXpn8_NameRepresentationCode().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn8_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().getValue(), 
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(), 
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().getValue(), 
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().getValue());
		}
		return nkName;
	}
	/**
	 * @param nk1_2_nkName the nk1_2_nkName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_2_nkName")
	public void setNk1_2_nkName(XPN_v25[] nk1_2_nkName) throws DataTypeException {
		for(int i = 0; i<nk1_2_nkName.length-1;i++) {
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().setValue(nk1_2_nkName[i].getXpn_1_familyName().getFn_1_surname());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(nk1_2_nkName[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(nk1_2_nkName[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(nk1_2_nkName[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(nk1_2_nkName[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn2_GivenName().setValue(nk1_2_nkName[i].getXpn_2_givenName());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(nk1_2_nkName[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().setValue(nk1_2_nkName[i].getXpn_4_suffixEGJrOrIii());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn5_PrefixEgDR().setValue(nk1_2_nkName[i].getXpn_5_prefixEGDr());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn6_DegreeEgMD().setValue(nk1_2_nkName[i].getXpn_6_degreeEGMd());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn7_NameTypeCode().setValue(nk1_2_nkName[i].getXpn_7_nameTypeCode());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn8_NameRepresentationCode().setValue(nk1_2_nkName[i].getXpn_8_nameRepresentationCode());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().setValue(nk1_2_nkName[i].getXpn_9_nameContext().getCe_1_identifier());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().setValue(nk1_2_nkName[i].getXpn_9_nameContext().getCe_2_text());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(nk1_2_nkName[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(nk1_2_nkName[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().setValue(nk1_2_nkName[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(nk1_2_nkName[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(nk1_2_nkName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(nk1_2_nkName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(nk1_2_nkName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(nk1_2_nkName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().setValue(nk1_2_nkName[i].getXpn_11_nameAssemblyOrder());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().setValue(nk1_2_nkName[i].getXpn_12_effectiveDate().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(nk1_2_nkName[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().setValue(nk1_2_nkName[i].getXpn_13_expirationDate().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(nk1_2_nkName[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().setValue(nk1_2_nkName[i].getXpn_14_professionalSuffix());
		}
		this.nk1_2_nkName = nk1_2_nkName;
	}
	/**
	 * @return the nk1_3_relationship
	 */
	
	@JsonProperty("nk1_3_relationship")
	public CE_v2 getNk1_3_relationship() {
		return new CE_v2(
				this.nk1.getNk13_Relationship().getCe1_Identifier().getValue()==null?"":this.nk1.getNk13_Relationship().getCe1_Identifier().getValue(),
				this.nk1.getNk13_Relationship().getCe2_Text().getValue()==null?"":this.nk1.getNk13_Relationship().getCe2_Text().getValue(),
				this.nk1.getNk13_Relationship().getCe3_NameOfCodingSystem().getValue()==null?"":this.nk1.getNk13_Relationship().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk13_Relationship().getCe4_AlternateIdentifier().getValue()==null?"":this.nk1.getNk13_Relationship().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk13_Relationship().getCe5_AlternateText().getValue()==null?"":this.nk1.getNk13_Relationship().getCe5_AlternateText().getValue(),
				this.nk1.getNk13_Relationship().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.nk1.getNk13_Relationship().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_3_relationship the nk1_3_relationship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_3_relationship")
	public void setNk1_3_relationship(CE_v2 nk1_3_relationship) throws DataTypeException {
		this.nk1.getNk13_Relationship().getCe1_Identifier().setValue(nk1_3_relationship.getCe_1_identifier());
		this.nk1.getNk13_Relationship().getCe2_Text().setValue(nk1_3_relationship.getCe_2_text());
		this.nk1.getNk13_Relationship().getCe3_NameOfCodingSystem().setValue(nk1_3_relationship.getCe_3_nameOfCodingSystem());
		this.nk1.getNk13_Relationship().getCe4_AlternateIdentifier().setValue(nk1_3_relationship.getCe_4_alternateIdentifier());
		this.nk1.getNk13_Relationship().getCe5_AlternateText().setValue(nk1_3_relationship.getCe_5_alternateText());
		this.nk1.getNk13_Relationship().getCe6_NameOfAlternateCodingSystem().setValue(nk1_3_relationship.getCe_6_nameOfAlternateCodingSystem());
		this.nk1_3_relationship = nk1_3_relationship;
	}
	/**
	 * @return the nk1_4_address
	 */
	
	@JsonProperty("nk1_4_address")
	public XAD_v25[] getNk1_4_address() {
		XAD_v25[] address = new XAD_v25[this.nk1.getNk14_Address().length];
		for(int i = 0; i< this.nk1.getNk14_Address().length-1; i++) {
			address[i] = new XAD_v25(
					new SAD_v25(
							this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue()==null?"":this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue(),
							this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad2_StreetName().getValue()==null?"":this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad2_StreetName().getValue(),
							this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()==null?"":this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()),
					this.nk1.getNk14_Address(i).getXad2_OtherDesignation().getValue()==null?"":this.nk1.getNk14_Address(i).getXad2_OtherDesignation().getValue(),
					this.nk1.getNk14_Address(i).getXad3_City().getValue()==null?"":this.nk1.getNk14_Address(i).getXad3_City().getValue(),
					this.nk1.getNk14_Address(i).getXad4_StateOrProvince().getValue()==null?"":this.nk1.getNk14_Address(i).getXad4_StateOrProvince().getValue(),
					this.nk1.getNk14_Address(i).getXad5_ZipOrPostalCode().getValue()==null?"":this.nk1.getNk14_Address(i).getXad5_ZipOrPostalCode().getValue(),
					this.nk1.getNk14_Address(i).getXad6_Country().getValue()==null?"":this.nk1.getNk14_Address(i).getXad6_Country().getValue(),
					this.nk1.getNk14_Address(i).getXad7_AddressType().getValue()==null?"":this.nk1.getNk14_Address(i).getXad7_AddressType().getValue(),
					this.nk1.getNk14_Address(i).getXad8_OtherGeographicDesignation().getValue()==null?"":this.nk1.getNk14_Address(i).getXad8_OtherGeographicDesignation().getValue(),
					this.nk1.getNk14_Address(i).getXad9_CountyParishCode().getValue()==null?"":this.nk1.getNk14_Address(i).getXad9_CountyParishCode().getValue(),
					this.nk1.getNk14_Address(i).getXad10_CensusTract().getValue()==null?"":this.nk1.getNk14_Address(i).getXad10_CensusTract().getValue(),
					this.nk1.getNk14_Address(i).getXad11_AddressRepresentationCode().getValue()==null?"":this.nk1.getNk14_Address(i).getXad11_AddressRepresentationCode().getValue(),
					new DR_v2(
							new TS_v2(
									this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					new TS_v2(
							this.nk1.getNk14_Address(i).getXad13_EffectiveDate().getTs1_Time().getValue()==null?"":this.nk1.getNk14_Address(i).getXad13_EffectiveDate().getTs1_Time().getValue(),
							this.nk1.getNk14_Address(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk14_Address(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.nk1.getNk14_Address(i).getXad14_ExpirationDate().getTs1_Time().getValue()==null?"":this.nk1.getNk14_Address(i).getXad14_ExpirationDate().getTs1_Time().getValue(), 
							this.nk1.getNk14_Address(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk14_Address(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()));
		}
		return nk1_4_address;
	}
	/**
	 * @param nk1_4_address the nk1_4_address to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_4_address")
	public void setNk1_4_address(XAD_v25[] nk1_4_address) throws DataTypeException {
		for(int i = 0; i< nk1_4_address.length-1; i++) {
			this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().setValue(nk1_4_address[i].getXad_1_streetAddress().getSad_1_streetOrMailingAddress());
			this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad2_StreetName().setValue(nk1_4_address[i].getXad_1_streetAddress().getSad_2_streetName());
			this.nk1.getNk14_Address(i).getXad1_StreetAddress().getSad3_DwellingNumber().setValue(nk1_4_address[i].getXad_1_streetAddress().getSad_3_dwellingNumber());
			this.nk1.getNk14_Address(i).getXad2_OtherDesignation().setValue(nk1_4_address[i].getXad_2_otherDesignation());
			this.nk1.getNk14_Address(i).getXad3_City().setValue(nk1_4_address[i].getXad_3_city());
			this.nk1.getNk14_Address(i).getXad4_StateOrProvince().setValue(nk1_4_address[i].getXad_4_stateOrProvince());
			this.nk1.getNk14_Address(i).getXad5_ZipOrPostalCode().setValue(nk1_4_address[i].getXad_5_zipOrPostalCode());
			this.nk1.getNk14_Address(i).getXad6_Country().setValue(nk1_4_address[i].getXad_6_country());
			this.nk1.getNk14_Address(i).getXad7_AddressType().setValue(nk1_4_address[i].getXad_7_addressType());
			this.nk1.getNk14_Address(i).getXad8_OtherGeographicDesignation().setValue(nk1_4_address[i].getXad_8_otherGeographicDesignation());
			this.nk1.getNk14_Address(i).getXad9_CountyParishCode().setValue(nk1_4_address[i].getXad_9_countyParishCode());
			this.nk1.getNk14_Address(i).getXad10_CensusTract().setValue(nk1_4_address[i].getXad_10_censusTract());
			this.nk1.getNk14_Address(i).getXad11_AddressRepresentationCode().setValue(nk1_4_address[i].getXad_11_addressRepresentationCode());
			this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(nk1_4_address[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(nk1_4_address[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(nk1_4_address[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.nk1.getNk14_Address(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(nk1_4_address[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk14_Address(i).getXad13_EffectiveDate().getTs1_Time().setValue(nk1_4_address[i].getXad_13_effectiveDate().getTs_1_time());
			this.nk1.getNk14_Address(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().setValue(nk1_4_address[i].getXad_13_effectiveDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk14_Address(i).getXad14_ExpirationDate().getTs1_Time().setValue(nk1_4_address[i].getXad_14_expirationDate().getTs_1_time()); 
			this.nk1.getNk14_Address(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().setValue(nk1_4_address[i].getXad_14_expirationDate().getTs_2_degreeOfPrecision());
		}
		this.nk1_4_address = nk1_4_address;
	}
	/**
	 * @return the nk1_5_phoneNumber
	 *	@JsonProperty("nk1_5_phoneNumber")
	 */
	
	public XTN_v25[] getNk1_5_phoneNumber() {
		XTN_v25[] phoneNumber = new XTN_v25[this.nk1.getNk15_PhoneNumber().length];
		for(int i = 0; i < this.nk1.getNk15_PhoneNumber().length-1;i++) {
			phoneNumber[i] = new XTN_v25(
					this.nk1.getNk15_PhoneNumber(i).getXtn1_TelephoneNumber().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn4_EmailAddress().getValue(), 
					this.nk1.getNk15_PhoneNumber(i).getXtn5_CountryCode().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn6_AreaCityCode().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn7_LocalNumber().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn8_Extension().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn9_AnyText().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn10_ExtensionPrefix().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn11_SpeedDialCode().getValue(),
					this.nk1.getNk15_PhoneNumber(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return phoneNumber;
	}
	/**
	 * @param nk1_5_phoneNumber the nk1_5_phoneNumber to set
	 * @JsonProperty("nk1_5_phoneNumber")
	 * @throws DataTypeException 
	 */
	public void setNk1_5_phoneNumber(XTN_v25[] nk1_5_phoneNumber) throws DataTypeException {
		for(int i = 0; i < nk1_5_phoneNumber.length-1;i++) {
			this.nk1.getNk15_PhoneNumber(i).getXtn1_TelephoneNumber().setValue(nk1_5_phoneNumber[i].getXtn_1_telephoneNumber());
			this.nk1.getNk15_PhoneNumber(i).getXtn2_TelecommunicationUseCode().setValue(nk1_5_phoneNumber[i].getXtn_2_telecommunicationUseCode());
			this.nk1.getNk15_PhoneNumber(i).getXtn3_TelecommunicationEquipmentType().setValue(nk1_5_phoneNumber[i].getXtn_3_telecommunicationEquipmentType());
			this.nk1.getNk15_PhoneNumber(i).getXtn4_EmailAddress().setValue(nk1_5_phoneNumber[i].getXtn_4_emailAddress());
			this.nk1.getNk15_PhoneNumber(i).getXtn5_CountryCode().setValue(nk1_5_phoneNumber[i].getXtn_5_countryCode());
			this.nk1.getNk15_PhoneNumber(i).getXtn6_AreaCityCode().setValue(nk1_5_phoneNumber[i].getXtn_6_areaCityCode());
			this.nk1.getNk15_PhoneNumber(i).getXtn7_LocalNumber().setValue(nk1_5_phoneNumber[i].getXtn_7_localNumber());
			this.nk1.getNk15_PhoneNumber(i).getXtn8_Extension().setValue(nk1_5_phoneNumber[i].getXtn_8_extension());
			this.nk1.getNk15_PhoneNumber(i).getXtn9_AnyText().setValue(nk1_5_phoneNumber[i].getXtn_9_anyText());
			this.nk1.getNk15_PhoneNumber(i).getXtn10_ExtensionPrefix().setValue(nk1_5_phoneNumber[i].getXtn_10_extensionPrefix());
			this.nk1.getNk15_PhoneNumber(i).getXtn11_SpeedDialCode().setValue(nk1_5_phoneNumber[i].getXtn_11_SpeedDialCode());
			this.nk1.getNk15_PhoneNumber(i).getXtn12_UnformattedTelephoneNumber().setValue(nk1_5_phoneNumber[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.nk1_5_phoneNumber = nk1_5_phoneNumber;
	}
	/**
	 * @return the nk1_6_businessPhoneNumber
	 *	@JsonProperty("nk1_6_businessPhoneNumber")
	 */
	
	public XTN_v25[] getNk1_6_businessPhoneNumber() {
		XTN_v25[] businessPhoneNumber = new XTN_v25[this.nk1.getNk16_BusinessPhoneNumber().length];
		for(int i = 0; i < this.nk1.getNk16_BusinessPhoneNumber().length-1;i++) {
			businessPhoneNumber[i] = new XTN_v25(
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn1_TelephoneNumber().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn4_EmailAddress().getValue(), 
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn5_CountryCode().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn6_AreaCityCode().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn7_LocalNumber().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn8_Extension().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn9_AnyText().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn10_ExtensionPrefix().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn11_SpeedDialCode().getValue(),
					this.nk1.getNk16_BusinessPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return businessPhoneNumber;
	}
	/**
	 * @param nk1_6_businessPhoneNumber the nk1_6_businessPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_6_businessPhoneNumber")
	public void setNk1_6_businessPhoneNumber(XTN_v25[] nk1_6_businessPhoneNumber) throws DataTypeException {
		for(int i = 0; i < nk1_6_businessPhoneNumber.length-1;i++) {
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn1_TelephoneNumber().setValue(nk1_6_businessPhoneNumber[i].getXtn_1_telephoneNumber());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn2_TelecommunicationUseCode().setValue(nk1_6_businessPhoneNumber[i].getXtn_2_telecommunicationUseCode());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().setValue(nk1_6_businessPhoneNumber[i].getXtn_3_telecommunicationEquipmentType());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn4_EmailAddress().setValue(nk1_6_businessPhoneNumber[i].getXtn_4_emailAddress());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn5_CountryCode().setValue(nk1_6_businessPhoneNumber[i].getXtn_5_countryCode());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn6_AreaCityCode().setValue(nk1_6_businessPhoneNumber[i].getXtn_6_areaCityCode());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn7_LocalNumber().setValue(nk1_6_businessPhoneNumber[i].getXtn_7_localNumber());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn8_Extension().setValue(nk1_6_businessPhoneNumber[i].getXtn_8_extension());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn9_AnyText().setValue(nk1_6_businessPhoneNumber[i].getXtn_9_anyText());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn10_ExtensionPrefix().setValue(nk1_6_businessPhoneNumber[i].getXtn_10_extensionPrefix());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn11_SpeedDialCode().setValue(nk1_6_businessPhoneNumber[i].getXtn_11_SpeedDialCode());
			this.nk1.getNk16_BusinessPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().setValue(nk1_6_businessPhoneNumber[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.nk1_6_businessPhoneNumber = nk1_6_businessPhoneNumber;
	}
	/**
	 * @return the nk1_7_contactRole
	 */
	
	@JsonProperty("nk1_7_contactRole")
	public CE_v2 getNk1_7_contactRole() {
		return new CE_v2(
				this.nk1.getNk17_ContactRole().getCe1_Identifier().getValue()==null?"":this.nk1.getNk17_ContactRole().getCe1_Identifier().getValue(),
				this.nk1.getNk17_ContactRole().getCe2_Text().getValue()==null?"":this.nk1.getNk17_ContactRole().getCe2_Text().getValue(),
				this.nk1.getNk17_ContactRole().getCe3_NameOfCodingSystem().getValue()==null?"":this.nk1.getNk17_ContactRole().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk17_ContactRole().getCe4_AlternateIdentifier().getValue()==null?"":this.nk1.getNk17_ContactRole().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk17_ContactRole().getCe5_AlternateText().getValue()==null?"":this.nk1.getNk17_ContactRole().getCe5_AlternateText().getValue(),
				this.nk1.getNk17_ContactRole().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.nk1.getNk17_ContactRole().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_7_contactRole the nk1_7_contactRole to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_7_contactRole")
	public void setNk1_7_contactRole(CE_v2 nk1_7_contactRole) throws DataTypeException {
		this.nk1.getNk17_ContactRole().getCe1_Identifier().setValue(nk1_7_contactRole.getCe_1_identifier());
		this.nk1.getNk17_ContactRole().getCe2_Text().setValue(nk1_7_contactRole.getCe_2_text());
		this.nk1.getNk17_ContactRole().getCe3_NameOfCodingSystem().setValue(nk1_7_contactRole.getCe_3_nameOfCodingSystem());
		this.nk1.getNk17_ContactRole().getCe4_AlternateIdentifier().setValue(nk1_7_contactRole.getCe_4_alternateIdentifier());
		this.nk1.getNk17_ContactRole().getCe5_AlternateText().setValue(nk1_7_contactRole.getCe_5_alternateText());
		this.nk1.getNk17_ContactRole().getCe6_NameOfAlternateCodingSystem().setValue(nk1_7_contactRole.getCe_6_nameOfAlternateCodingSystem());
		this.nk1_7_contactRole = nk1_7_contactRole;
	}
	/**
	 * @return the nk1_8_startDate
	 */
	
	@JsonProperty("nk1_8_startDate")
	public String getNk1_8_startDate() {
		return this.nk1.getNk18_StartDate().getValue();
	}
	/**
	 * @param nk1_8_startDate the nk1_8_startDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_8_startDate")
	public void setNk1_8_startDate(String nk1_8_startDate) throws DataTypeException {
		this.nk1.getNk18_StartDate().setValue(nk1_8_startDate);
		this.nk1_8_startDate = nk1_8_startDate;
	}
	/**
	 * @return the nk1_9_endDate
	 */
	
	@JsonProperty("nk1_9_endDate")
	public String getNk1_9_endDate() {
		return this.nk1.getNk19_EndDate().getValue();
	}
	/**
	 * @param nk1_9_endDate the nk1_9_endDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_9_endDate")
	public void setNk1_9_endDate(String nk1_9_endDate) throws DataTypeException {
		this.nk1.getNk19_EndDate().setValue(nk1_9_endDate);
		this.nk1_9_endDate = nk1_9_endDate;
	}
	/**
	 * @return the nk1_10_nextofKinAssociatedPartiesJobTitle
	 */
	
	@JsonProperty("nk1_10_nextofKinAssociatedPartiesJobTitle")
	public String getNk1_10_nextofKinAssociatedPartiesJobTitle() {
		return this.nk1.getNk110_NextOfKinAssociatedPartiesJobTitle().getValue();
	}
	/**
	 * @param nk1_10_nextofKinAssociatedPartiesJobTitle the nk1_10_nextofKinAssociatedPartiesJobTitle to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_10_nextofKinAssociatedPartiesJobTitle")
	public void setNk1_10_nextofKinAssociatedPartiesJobTitle(String nk1_10_nextofKinAssociatedPartiesJobTitle) throws DataTypeException {
		this.nk1.getNk110_NextOfKinAssociatedPartiesJobTitle().setValue(nk1_10_nextofKinAssociatedPartiesJobTitle);
		this.nk1_10_nextofKinAssociatedPartiesJobTitle = nk1_10_nextofKinAssociatedPartiesJobTitle;
	}
	/**
	 * @return the nk1_11_nextofKinAssociatedPartiesJobCodeClass
	 */
	
	@JsonProperty("nk1_11_nextofKinAssociatedPartiesJobCodeClass")
	public JCC_v25 getNk1_11_nextofKinAssociatedPartiesJobCodeClass() {
		return new JCC_v25(
				this.nk1.getNk111_NextOfKinAssociatedPartiesJobCodeClass().getJcc1_JobCode().getValue(),
				this.nk1.getNk111_NextOfKinAssociatedPartiesJobCodeClass().getJcc2_JobClass().getValue(),
				this.nk1.getNk111_NextOfKinAssociatedPartiesJobCodeClass().getJcc3_JobDescriptionText().getValue());
	}
	/**
	 * @param nk1_11_nextofKinAssociatedPartiesJobCodeClass the nk1_11_nextofKinAssociatedPartiesJobCodeClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_11_nextofKinAssociatedPartiesJobCodeClass")
	public void setNk1_11_nextofKinAssociatedPartiesJobCodeClass(JCC_v25 nk1_11_nextofKinAssociatedPartiesJobCodeClass) throws DataTypeException {
		this.nk1.getNk111_NextOfKinAssociatedPartiesJobCodeClass().getJcc1_JobCode().setValue(nk1_11_nextofKinAssociatedPartiesJobCodeClass.getJcc_1_jobCode());
		this.nk1.getNk111_NextOfKinAssociatedPartiesJobCodeClass().getJcc2_JobClass().setValue(nk1_11_nextofKinAssociatedPartiesJobCodeClass.getJcc_2_jobClass());
		this.nk1.getNk111_NextOfKinAssociatedPartiesJobCodeClass().getJcc3_JobDescriptionText().setValue(nk1_11_nextofKinAssociatedPartiesJobCodeClass.getJcc_3_jobDescriptionText());
		this.nk1_11_nextofKinAssociatedPartiesJobCodeClass = nk1_11_nextofKinAssociatedPartiesJobCodeClass;
	}
	/**
	 * @return the nk1_12_nextofKinAssociatedPartiesEmployeeNumber
	 */
	
	@JsonProperty("nk1_12_nextofKinAssociatedPartiesEmployeeNumber")
	public CX_v25 getNk1_12_nextofKinAssociatedPartiesEmployeeNumber() {
		return new CX_v25(
				this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx1_IDNumber().getValue(),
				this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx2_CheckDigit().getValue(),
				this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx3_CheckDigitScheme().getValue(),
				new HD_v2(
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
				this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx5_IdentifierTypeCode().getValue(),
				new HD_v2(
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
				this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx7_EffectiveDate().getValue(),
				this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx8_ExpirationDate().getValue(),
				new CWE_v25(
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param nk1_12_nextofKinAssociatedPartiesEmployeeNumber the nk1_12_nextofKinAssociatedPartiesEmployeeNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_12_nextofKinAssociatedPartiesEmployeeNumber")
	public void setNk1_12_nextofKinAssociatedPartiesEmployeeNumber(CX_v25 nk1_12_nextofKinAssociatedPartiesEmployeeNumber) throws DataTypeException {
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx1_IDNumber().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_1_idNumber());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx2_CheckDigit().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_2_checkDigit());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx3_CheckDigitScheme().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_3_checkDigitScheme());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_4_assigningAuthority().getHd_2_universalId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx5_IdentifierTypeCode().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_5_identifierTypeCode());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx6_AssigningFacility().getHd2_UniversalID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_6_assigningFacility().getHd_2_universalId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx7_EffectiveDate().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_7_effectiveDate());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx8_ExpirationDate().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_8_expirationDate());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(nk1_12_nextofKinAssociatedPartiesEmployeeNumber.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.nk1_12_nextofKinAssociatedPartiesEmployeeNumber = nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
	}
	/**
	 * @return the nk1_13_organizationName
	 */
	
	@JsonProperty("nk1_13_organizationName")
	public XON_v25[] getNk1_13_organizationName() {
		XON_v25[] organizationName = new XON_v25[this.nk1.getNk113_OrganizationNameNK1().length];
		for(int i = 0; i < this.nk1.getNk113_OrganizationNameNK1().length-1; i++) {
			organizationName[i] = new XON_v25(
					this.nk1.getNk113_OrganizationNameNK1(i).getXon1_OrganizationName().getValue(), 
					this.nk1.getNk113_OrganizationNameNK1(i).getXon2_OrganizationNameTypeCode().getValue(), 
					this.nk1.getNk113_OrganizationNameNK1(i).getXon3_IDNumber().getValue(), 
					this.nk1.getNk113_OrganizationNameNK1(i).getXon4_CheckDigit().getValue(),
					this.nk1.getNk113_OrganizationNameNK1(i).getXon5_CheckDigitScheme().getValue(),
					new HD_v2(
							this.nk1.getNk113_OrganizationNameNK1(i).getXon6_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.nk1.getNk113_OrganizationNameNK1(i).getXon6_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.nk1.getNk113_OrganizationNameNK1(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.nk1.getNk113_OrganizationNameNK1(i).getXon7_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.nk1.getNk113_OrganizationNameNK1(i).getXon8_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.nk1.getNk113_OrganizationNameNK1(i).getXon8_AssigningFacility().getHd2_UniversalID().getValue(),
							this.nk1.getNk113_OrganizationNameNK1(i).getXon8_AssigningFacility().getHd3_UniversalIDType().getValue()), 
					this.nk1.getNk113_OrganizationNameNK1(i).getXon9_NameRepresentationCode().getValue(),
					this.nk1.getNk113_OrganizationNameNK1(i).getXon10_OrganizationIdentifier().getValue());
		}
		return nk1_13_organizationName;
	}
	/**
	 * @param nk1_13_organizationName the nk1_13_organizationName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_13_organizationName")
	public void setNk1_13_organizationName(XON_v25[] nk1_13_organizationName) throws DataTypeException {
		for(int i = 0; i < nk1_13_organizationName.length-1; i++) {
			this.nk1.getNk113_OrganizationNameNK1(i).getXon1_OrganizationName().setValue(nk1_13_organizationName[i].getXon_1_organizationName());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon2_OrganizationNameTypeCode().setValue(nk1_13_organizationName[i].getXon_2_organizationNameTypeCode()); 
			this.nk1.getNk113_OrganizationNameNK1(i).getXon3_IDNumber().setValue(nk1_13_organizationName[i].getXon_3_idNumber());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon4_CheckDigit().setValue(nk1_13_organizationName[i].getXon_4_checkDigit());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon5_CheckDigitScheme().setValue(nk1_13_organizationName[i].getXon_5_checkDigitScheme());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon6_AssigningAuthority().getHd1_NamespaceID().setValue(nk1_13_organizationName[i].getXon_6_assigningAuthority().getHd_1_namespaceId());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon6_AssigningAuthority().getHd2_UniversalID().setValue(nk1_13_organizationName[i].getXon_6_assigningAuthority().getHd_2_universalId());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().setValue(nk1_13_organizationName[i].getXon_6_assigningAuthority().getHd_3_universalIdType());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon7_IdentifierTypeCode().setValue(nk1_13_organizationName[i].getXon_7_identifierTypeCode());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon8_AssigningFacility().getHd1_NamespaceID().setValue(nk1_13_organizationName[i].getXon_8_assigningFacility().getHd_1_namespaceId());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon8_AssigningFacility().getHd2_UniversalID().setValue(nk1_13_organizationName[i].getXon_8_assigningFacility().getHd_2_universalId());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon8_AssigningFacility().getHd3_UniversalIDType().setValue(nk1_13_organizationName[i].getXon_8_assigningFacility().getHd_3_universalIdType());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon9_NameRepresentationCode().setValue(nk1_13_organizationName[i].getXon_9_nameRepresentationCode());
			this.nk1.getNk113_OrganizationNameNK1(i).getXon10_OrganizationIdentifier().setValue(nk1_13_organizationName[i].getXon_10_organizationIdentifier());
		}
		this.nk1_13_organizationName = nk1_13_organizationName;
	}
	/**
	 * @return the nk1_14_maritalStatus
	 */
	@JsonProperty("nk1_14_maritalStatus")
	public CE_v2 getNk1_14_maritalStatus() {
		return new CE_v2(
				this.nk1.getNk114_MaritalStatus().getCe1_Identifier().getValue(),
				this.nk1.getNk114_MaritalStatus().getCe2_Text().getValue(),
				this.nk1.getNk114_MaritalStatus().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk114_MaritalStatus().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk114_MaritalStatus().getCe5_AlternateText().getValue(),
				this.nk1.getNk114_MaritalStatus().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_14_maritalStatus the nk1_14_maritalStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_14_maritalStatus")
	public void setNk1_14_maritalStatus(CE_v2 nk1_14_maritalStatus) throws DataTypeException {
		this.nk1.getNk114_MaritalStatus().getCe1_Identifier().setValue(nk1_14_maritalStatus.getCe_1_identifier());
		this.nk1.getNk114_MaritalStatus().getCe2_Text().setValue(nk1_14_maritalStatus.getCe_2_text());
		this.nk1.getNk114_MaritalStatus().getCe3_NameOfCodingSystem().setValue(nk1_14_maritalStatus.getCe_3_nameOfCodingSystem());
		this.nk1.getNk114_MaritalStatus().getCe4_AlternateIdentifier().setValue(nk1_14_maritalStatus.getCe_4_alternateIdentifier());
		this.nk1.getNk114_MaritalStatus().getCe5_AlternateText().setValue(nk1_14_maritalStatus.getCe_5_alternateText());
		this.nk1.getNk114_MaritalStatus().getCe6_NameOfAlternateCodingSystem().setValue(nk1_14_maritalStatus.getCe_6_nameOfAlternateCodingSystem());
	}
	/**
	 * @return the nk1_15_administrativeSex
	 */
	
	@JsonProperty("nk1_15_administrativeSex")
	public String getNk1_15_administrativeSex() {
		return this.nk1.getNk115_AdministrativeSex().getValue();
	}
	/**
	 * @param nk1_15_administrativeSex the nk1_15_administrativeSex to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_15_administrativeSex")
	public void setNk1_15_administrativeSex(String nk1_15_administrativeSex) throws DataTypeException {
		this.nk1.getNk115_AdministrativeSex().setValue(nk1_15_administrativeSex);
		this.nk1_15_administrativeSex = nk1_15_administrativeSex;
	}
	/**
	 * @return the nk1_16_dateTimeofBirth
	 */
	
	@JsonProperty("nk1_16_dateTimeofBirth")
	public TS_v2 getNk1_16_dateTimeofBirth() {
		return new TS_v2(
				this.nk1.getNk116_DateTimeOfBirth().getTs1_Time().getValue(),
				this.nk1.getNk116_DateTimeOfBirth().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param nk1_16_dateTimeofBirth the nk1_16_dateTimeofBirth to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_16_dateTimeofBirth")
	public void setNk1_16_dateTimeofBirth(TS_v2 nk1_16_dateTimeofBirth) throws DataTypeException {
		this.nk1.getNk116_DateTimeOfBirth().getTs1_Time().setValue(nk1_16_dateTimeofBirth.getTs_1_time());
		this.nk1.getNk116_DateTimeOfBirth().getTs2_DegreeOfPrecision().setValue(nk1_16_dateTimeofBirth.getTs_2_degreeOfPrecision());
		this.nk1_16_dateTimeofBirth = nk1_16_dateTimeofBirth;
	}
	/**
	 * @return the nk1_17_livingDependency
	 */
	
	@JsonProperty("nk1_17_livingDependency")
	public String[] getNk1_17_livingDependency() {
		String[] livingDependency = new String[this.nk1.getNk117_LivingDependency().length];
		for(int i = 0; i<this.nk1.getNk117_LivingDependency().length-1;i++) {
			livingDependency[i] = this.nk1.getNk117_LivingDependency(i).getValue();
		}
		return livingDependency;
	}
	/**
	 * @param nk1_17_livingDependency the nk1_17_livingDependency to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_17_livingDependency")
	public void setNk1_17_livingDependency(String[] nk1_17_livingDependency) throws DataTypeException {
		for(int i = 0; i<nk1_17_livingDependency.length-1;i++) {
			this.nk1.getNk117_LivingDependency(i).setValue(nk1_17_livingDependency[i]);
		}
		this.nk1_17_livingDependency = nk1_17_livingDependency;
	}
	/**
	 * @return the nk1_18_ambulatoryStatus
	 */
	
	@JsonProperty("nk1_18_ambulatoryStatus")
	public String[] getNk1_18_ambulatoryStatus() {
		String[] ambulatoryStatus = new String[this.nk1.getNk118_AmbulatoryStatus().length];
		for(int i = 0; i<this.nk1.getNk118_AmbulatoryStatus().length-1;i++) {
			ambulatoryStatus[i] = this.nk1.getNk118_AmbulatoryStatus(i).getValue();
		}
		return ambulatoryStatus;
	}
	/**
	 * @param nk1_18_ambulatoryStatus the nk1_18_ambulatoryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_18_ambulatoryStatus")
	public void setNk1_18_ambulatoryStatus(String[] nk1_18_ambulatoryStatus) throws DataTypeException {
		for(int i = 0; i<nk1_18_ambulatoryStatus.length-1;i++) {
			this.nk1.getNk118_AmbulatoryStatus(i).setValue(nk1_18_ambulatoryStatus[i]);
		}
		this.nk1_18_ambulatoryStatus = nk1_18_ambulatoryStatus;
	}
	/**
	 * @return the nk1_19_citizenship
	 */
	
	@JsonProperty("nk1_19_citizenship")
	public CE_v2[] getNk1_19_citizenship() {
		CE_v2[] citizenship = new CE_v2[this.nk1.getNk119_Citizenship().length];
		for(int i = 0; i <this.nk1.getNk119_Citizenship().length-1;i++) {
			citizenship[i] = new CE_v2(
					this.nk1.getNk119_Citizenship(i).getCe1_Identifier().getValue(),
					this.nk1.getNk119_Citizenship(i).getCe2_Text().getValue(),
					this.nk1.getNk119_Citizenship(i).getCe3_NameOfCodingSystem().getValue(),
					this.nk1.getNk119_Citizenship(i).getCe4_AlternateIdentifier().getValue(),
					this.nk1.getNk119_Citizenship(i).getCe5_AlternateText().getValue(),
					this.nk1.getNk119_Citizenship(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return citizenship;
	}
	/**
	 * @param nk1_19_citizenship the nk1_19_citizenship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_19_citizenship")
	public void setNk1_19_citizenship(CE_v2[] nk1_19_citizenship) throws DataTypeException {
		for(int i = 0; i <nk1_19_citizenship.length-1;i++) {
			this.nk1.getNk119_Citizenship(i).getCe1_Identifier().setValue(nk1_19_citizenship[i].getCe_1_identifier());
			this.nk1.getNk119_Citizenship(i).getCe2_Text().setValue(nk1_19_citizenship[i].getCe_2_text());
			this.nk1.getNk119_Citizenship(i).getCe3_NameOfCodingSystem().setValue(nk1_19_citizenship[i].getCe_3_nameOfCodingSystem());
			this.nk1.getNk119_Citizenship(i).getCe4_AlternateIdentifier().setValue(nk1_19_citizenship[i].getCe_4_alternateIdentifier());
			this.nk1.getNk119_Citizenship(i).getCe5_AlternateText().setValue(nk1_19_citizenship[i].getCe_5_alternateText());
			this.nk1.getNk119_Citizenship(i).getCe6_NameOfAlternateCodingSystem().setValue(nk1_19_citizenship[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.nk1_19_citizenship = nk1_19_citizenship;
	}
	
	/**
	 * @return the nk1_20_primaryLanguage
	 */
	
	@JsonProperty("nk1_20_primaryLanguage")
	public CE_v2 getNk1_20_primaryLanguage() {
		return new CE_v2(
				this.nk1.getNk120_PrimaryLanguage().getCe1_Identifier().getValue(),
				this.nk1.getNk120_PrimaryLanguage().getCe2_Text().getValue(),
				this.nk1.getNk120_PrimaryLanguage().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk120_PrimaryLanguage().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk120_PrimaryLanguage().getCe5_AlternateText().getValue(),
				this.nk1.getNk120_PrimaryLanguage().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_20_primaryLanguage the nk1_20_primaryLanguage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_20_primaryLanguage")
	public void setNk1_20_primaryLanguage(CE_v2 nk1_20_primaryLanguage) throws DataTypeException {
		this.nk1.getNk120_PrimaryLanguage().getCe1_Identifier().setValue(nk1_20_primaryLanguage.getCe_1_identifier());
		this.nk1.getNk120_PrimaryLanguage().getCe2_Text().setValue(nk1_20_primaryLanguage.getCe_2_text());
		this.nk1.getNk120_PrimaryLanguage().getCe3_NameOfCodingSystem().setValue(nk1_20_primaryLanguage.getCe_3_nameOfCodingSystem());
		this.nk1.getNk120_PrimaryLanguage().getCe4_AlternateIdentifier().setValue(nk1_20_primaryLanguage.getCe_4_alternateIdentifier());
		this.nk1.getNk120_PrimaryLanguage().getCe5_AlternateText().setValue(nk1_20_primaryLanguage.getCe_5_alternateText());
		this.nk1.getNk120_PrimaryLanguage().getCe6_NameOfAlternateCodingSystem().setValue(nk1_20_primaryLanguage.getCe_6_nameOfAlternateCodingSystem());
		this.nk1_20_primaryLanguage = nk1_20_primaryLanguage;
	}
	/**
	 * @return the nk1_21_livingArrangement
	 */
	
	@JsonProperty("nk1_21_livingArrangement")
	public String getNk1_21_livingArrangement() {
		return this.nk1.getNk121_LivingArrangement().getValue();
	}
	/**
	 * @param nk1_21_livingArrangement the nk1_21_livingArrangement to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_21_livingArrangement")
	public void setNk1_21_livingArrangement(String nk1_21_livingArrangement) throws DataTypeException {
		this.nk1.getNk121_LivingArrangement().setValue(nk1_21_livingArrangement);
		this.nk1_21_livingArrangement = nk1_21_livingArrangement;
	}
	/**
	 * @return the nk1_22_publicityCode
	 */
	
	@JsonProperty("nk1_22_publicityCode")
	public CE_v2 getNk1_22_publicityCode() {
		return new CE_v2(
				this.nk1.getNk122_PublicityCode().getCe1_Identifier().getValue(),
				this.nk1.getNk122_PublicityCode().getCe2_Text().getValue(),
				this.nk1.getNk122_PublicityCode().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk122_PublicityCode().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk122_PublicityCode().getCe5_AlternateText().getValue(),
				this.nk1.getNk122_PublicityCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_22_publicityCode the nk1_22_publicityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_22_publicityCode")
	public void setNk1_22_publicityCode(CE_v2 nk1_22_publicityCode) throws DataTypeException {
		this.nk1.getNk122_PublicityCode().getCe1_Identifier().setValue(nk1_22_publicityCode.getCe_1_identifier());
		this.nk1.getNk122_PublicityCode().getCe2_Text().setValue(nk1_22_publicityCode.getCe_2_text());
		this.nk1.getNk122_PublicityCode().getCe3_NameOfCodingSystem().setValue(nk1_22_publicityCode.getCe_3_nameOfCodingSystem());
		this.nk1.getNk122_PublicityCode().getCe4_AlternateIdentifier().setValue(nk1_22_publicityCode.getCe_4_alternateIdentifier());
		this.nk1.getNk122_PublicityCode().getCe5_AlternateText().setValue(nk1_22_publicityCode.getCe_5_alternateText());
		this.nk1.getNk122_PublicityCode().getCe6_NameOfAlternateCodingSystem().setValue(nk1_22_publicityCode.getCe_6_nameOfAlternateCodingSystem());
		this.nk1_22_publicityCode = nk1_22_publicityCode;
	}
	/**
	 * @return the nk1_23_protectionIndicator
	 */
	
	@JsonProperty("nk1_23_protectionIndicator")
	public String getNk1_23_protectionIndicator() {
		return this.nk1.getNk123_ProtectionIndicator().getValue();
	}
	/**
	 * @param nk1_23_protectionIndicator the nk1_23_protectionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_23_protectionIndicator")
	public void setNk1_23_protectionIndicator(String nk1_23_protectionIndicator) throws DataTypeException {
		this.nk1.getNk123_ProtectionIndicator().setValue(nk1_23_protectionIndicator);
		this.nk1_23_protectionIndicator = nk1_23_protectionIndicator;
	}
	/**
	 * @return the nk1_24_studentIndicator
	 */
	
	@JsonProperty("nk1_24_studentIndicator")
	public String getNk1_24_studentIndicator() {
		return this.nk1.getNk124_StudentIndicator().getValue();
	}
	/**
	 * @param nk1_24_studentIndicator the nk1_24_studentIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_24_studentIndicator")
	public void setNk1_24_studentIndicator(String nk1_24_studentIndicator) throws DataTypeException {
		this.nk1.getNk124_StudentIndicator().setValue(nk1_24_studentIndicator);
		this.nk1_24_studentIndicator = nk1_24_studentIndicator;
	}
	/**
	 * @return the nk1_25_religion
	 */
	
	@JsonProperty("nk1_25_religion")
	public CE_v2 getNk1_25_religion() {
		return new CE_v2(
				this.nk1.getNk125_Religion().getCe1_Identifier().getValue(),
				this.nk1.getNk125_Religion().getCe2_Text().getValue(),
				this.nk1.getNk125_Religion().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk125_Religion().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk125_Religion().getCe5_AlternateText().getValue(),
				this.nk1.getNk125_Religion().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_25_religion the nk1_25_religion to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_25_religion")
	public void setNk1_25_religion(CE_v2 nk1_25_religion) throws DataTypeException {
		this.nk1.getNk125_Religion().getCe1_Identifier().setValue(nk1_25_religion.getCe_1_identifier());
		this.nk1.getNk125_Religion().getCe2_Text().setValue(nk1_25_religion.getCe_2_text());
		this.nk1.getNk125_Religion().getCe3_NameOfCodingSystem().setValue(nk1_25_religion.getCe_3_nameOfCodingSystem());
		this.nk1.getNk125_Religion().getCe4_AlternateIdentifier().setValue(nk1_25_religion.getCe_4_alternateIdentifier());
		this.nk1.getNk125_Religion().getCe5_AlternateText().setValue(nk1_25_religion.getCe_5_alternateText());
		this.nk1.getNk125_Religion().getCe6_NameOfAlternateCodingSystem().setValue(nk1_25_religion.getCe_6_nameOfAlternateCodingSystem());
		this.nk1_25_religion = nk1_25_religion;
	}
	/**
	 * @return the nk1_26_mothersMaidenName
	 */
	
	@JsonProperty("nk1_26_mothersMaidenName")
	public XPN_v25[] getNk1_26_mothersMaidenName() {
		XPN_v25[] mothersMaidenName = new XPN_v25[this.nk1.getNk126_MotherSMaidenName().length];
		for(int i = 0; i<this.nk1.getNk126_MotherSMaidenName().length-1;i++) {
			mothersMaidenName[i] = new XPN_v25(
					new FN_v25(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn2_GivenName().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn2_GivenName().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn5_PrefixEgDR().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn5_PrefixEgDR().getValue(),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn6_DegreeEgMD().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn6_DegreeEgMD().getValue(), 
					this.nk1.getNk126_MotherSMaidenName(i).getXpn7_NameTypeCode().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn7_NameTypeCode().getValue(), 
					this.nk1.getNk126_MotherSMaidenName(i).getXpn8_NameRepresentationCode().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn8_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().getValue(), 
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(), 
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().getValue(), 
							this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.nk1.getNk126_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().getValue()==null?"":this.nk1.getNk126_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().getValue());
		}
			return mothersMaidenName;
	}
	/**
	 * @param nk1_26_mothersMaidenName the nk1_26_mothersMaidenName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_26_mothersMaidenName")
	public void setNk1_26_mothersMaidenName(XPN_v25[] nk1_26_mothersMaidenName) throws DataTypeException {
		for(int i = 0; i<nk1_26_mothersMaidenName.length-1;i++) {
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn1_Surname().setValue(nk1_26_mothersMaidenName[i].getXpn_1_familyName().getFn_1_surname());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(nk1_26_mothersMaidenName[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(nk1_26_mothersMaidenName[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(nk1_26_mothersMaidenName[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(nk1_26_mothersMaidenName[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn2_GivenName().setValue(nk1_26_mothersMaidenName[i].getXpn_2_givenName());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(nk1_26_mothersMaidenName[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn4_SuffixEgJRorIII().setValue(nk1_26_mothersMaidenName[i].getXpn_4_suffixEGJrOrIii());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn5_PrefixEgDR().setValue(nk1_26_mothersMaidenName[i].getXpn_5_prefixEGDr());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn6_DegreeEgMD().setValue(nk1_26_mothersMaidenName[i].getXpn_6_degreeEGMd());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn7_NameTypeCode().setValue(nk1_26_mothersMaidenName[i].getXpn_7_nameTypeCode());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn8_NameRepresentationCode().setValue(nk1_26_mothersMaidenName[i].getXpn_8_nameRepresentationCode());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe1_Identifier().setValue(nk1_26_mothersMaidenName[i].getXpn_9_nameContext().getCe_1_identifier());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe2_Text().setValue(nk1_26_mothersMaidenName[i].getXpn_9_nameContext().getCe_2_text());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(nk1_26_mothersMaidenName[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(nk1_26_mothersMaidenName[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe5_AlternateText().setValue(nk1_26_mothersMaidenName[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(nk1_26_mothersMaidenName[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(nk1_26_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(nk1_26_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(nk1_26_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(nk1_26_mothersMaidenName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn11_NameAssemblyOrder().setValue(nk1_26_mothersMaidenName[i].getXpn_11_nameAssemblyOrder());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs1_Time().setValue(nk1_26_mothersMaidenName[i].getXpn_12_effectiveDate().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(nk1_26_mothersMaidenName[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs1_Time().setValue(nk1_26_mothersMaidenName[i].getXpn_13_expirationDate().getTs_1_time());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(nk1_26_mothersMaidenName[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk126_MotherSMaidenName(i).getXpn14_ProfessionalSuffix().setValue(nk1_26_mothersMaidenName[i].getXpn_14_professionalSuffix());
		}
		this.nk1_26_mothersMaidenName = nk1_26_mothersMaidenName;
	}
	/**
	 * @return the nk1_27_nationality
	 */
	
	@JsonProperty("nk1_27_nationality")
	public CE_v2 getNk1_27_nationality() {
		return new CE_v2(
				this.nk1.getNk127_Nationality().getCe1_Identifier().getValue(),
				this.nk1.getNk127_Nationality().getCe2_Text().getValue(),
				this.nk1.getNk127_Nationality().getCe3_NameOfCodingSystem().getValue(),
				this.nk1.getNk127_Nationality().getCe4_AlternateIdentifier().getValue(),
				this.nk1.getNk127_Nationality().getCe5_AlternateText().getValue(),
				this.nk1.getNk127_Nationality().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param nk1_27_nationality the nk1_27_nationality to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_27_nationality")
	public void setNk1_27_nationality(CE_v2 nk1_27_nationality) throws DataTypeException {
		this.nk1.getNk127_Nationality().getCe1_Identifier().setValue(nk1_25_religion.getCe_1_identifier());
		this.nk1.getNk127_Nationality().getCe2_Text().setValue(nk1_25_religion.getCe_2_text());
		this.nk1.getNk127_Nationality().getCe3_NameOfCodingSystem().setValue(nk1_25_religion.getCe_3_nameOfCodingSystem());
		this.nk1.getNk127_Nationality().getCe4_AlternateIdentifier().setValue(nk1_25_religion.getCe_4_alternateIdentifier());
		this.nk1.getNk127_Nationality().getCe5_AlternateText().setValue(nk1_25_religion.getCe_5_alternateText());
		this.nk1.getNk127_Nationality().getCe6_NameOfAlternateCodingSystem().setValue(nk1_25_religion.getCe_6_nameOfAlternateCodingSystem());
		this.nk1_27_nationality = nk1_27_nationality;
	}
	/**
	 * @return the nk1_29_contactReason
	 */
	
	@JsonProperty("nk1_29_contactReason")
	public CE_v2[] getnk1_29_contactReason() {
		CE_v2[] ethnicGroup = new CE_v2[this.nk1.getNk128_EthnicGroup().length];
		for(int i = 0; i <this.nk1.getNk128_EthnicGroup().length-1;i++) {
			ethnicGroup[i] = new CE_v2(
					this.nk1.getNk128_EthnicGroup(i).getCe1_Identifier().getValue(),
					this.nk1.getNk128_EthnicGroup(i).getCe2_Text().getValue(),
					this.nk1.getNk128_EthnicGroup(i).getCe3_NameOfCodingSystem().getValue(),
					this.nk1.getNk128_EthnicGroup(i).getCe4_AlternateIdentifier().getValue(),
					this.nk1.getNk128_EthnicGroup(i).getCe5_AlternateText().getValue(),
					this.nk1.getNk128_EthnicGroup(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return ethnicGroup;
	}
	/**
	 * @param nk1_29_contactReason the nk1_29_contactReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_29_contactReason")
	public void setnk1_29_contactReason(CE_v2[] nk1_29_contactReason) throws DataTypeException {
		for(int i = 0; i <nk1_29_contactReason.length-1;i++) {
			this.nk1.getNk128_EthnicGroup(i).getCe1_Identifier().setValue(nk1_29_contactReason[i].getCe_1_identifier());
			this.nk1.getNk128_EthnicGroup(i).getCe2_Text().setValue(nk1_29_contactReason[i].getCe_2_text());
			this.nk1.getNk128_EthnicGroup(i).getCe3_NameOfCodingSystem().setValue(nk1_29_contactReason[i].getCe_3_nameOfCodingSystem());
			this.nk1.getNk128_EthnicGroup(i).getCe4_AlternateIdentifier().setValue(nk1_29_contactReason[i].getCe_4_alternateIdentifier());
			this.nk1.getNk128_EthnicGroup(i).getCe5_AlternateText().setValue(nk1_29_contactReason[i].getCe_5_alternateText());
			this.nk1.getNk128_EthnicGroup(i).getCe6_NameOfAlternateCodingSystem().setValue(nk1_29_contactReason[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.nk1_29_contactReason = nk1_29_contactReason;
	}
	/**
	 * @return the nk1_29_contactReason
	 */
	
	@JsonProperty("nk1_29_contactReason")
	public CE_v2[] getNk1_29_contactReason() {
		CE_v2[] contactReason = new CE_v2[this.nk1.getNk129_ContactReason().length];
		for(int i = 0; i <this.nk1.getNk129_ContactReason().length-1;i++) {
			contactReason[i] = new CE_v2(
					this.nk1.getNk129_ContactReason(i).getCe1_Identifier().getValue(),
					this.nk1.getNk129_ContactReason(i).getCe2_Text().getValue(),
					this.nk1.getNk129_ContactReason(i).getCe3_NameOfCodingSystem().getValue(),
					this.nk1.getNk129_ContactReason(i).getCe4_AlternateIdentifier().getValue(),
					this.nk1.getNk129_ContactReason(i).getCe5_AlternateText().getValue(),
					this.nk1.getNk129_ContactReason(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return contactReason;
	}
	/**
	 * @param nk1_29_contactReason the nk1_29_contactReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_29_contactReason")
	public void setNk1_29_contactReason(CE_v2[] nk1_29_contactReason) throws DataTypeException {
		for(int i = 0; i <nk1_29_contactReason.length-1;i++) {
			this.nk1.getNk129_ContactReason(i).getCe1_Identifier().setValue(nk1_29_contactReason[i].getCe_1_identifier());
			this.nk1.getNk129_ContactReason(i).getCe2_Text().setValue(nk1_29_contactReason[i].getCe_2_text());
			this.nk1.getNk129_ContactReason(i).getCe3_NameOfCodingSystem().setValue(nk1_29_contactReason[i].getCe_3_nameOfCodingSystem());
			this.nk1.getNk129_ContactReason(i).getCe4_AlternateIdentifier().setValue(nk1_29_contactReason[i].getCe_4_alternateIdentifier());
			this.nk1.getNk129_ContactReason(i).getCe5_AlternateText().setValue(nk1_29_contactReason[i].getCe_5_alternateText());
			this.nk1.getNk129_ContactReason(i).getCe6_NameOfAlternateCodingSystem().setValue(nk1_29_contactReason[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.nk1_29_contactReason = nk1_29_contactReason;
	}
	/**
	 * @return the nk1_30_contactPersonsName
	 *	@JsonProperty("nk1_30_contactPersonsName")
	 */
	
	public XPN_v25[] getNk1_30_contactPersonsName() {
		XPN_v25[] contactPersonsName = new XPN_v25[this.nk1.getNk130_ContactPersonSName().length];
		for(int i = 0; i<this.nk1.getNk130_ContactPersonSName().length-1;i++) {
			contactPersonsName[i] = new XPN_v25(
					new FN_v25(
							this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn1_Surname().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.nk1.getNk130_ContactPersonSName(i).getXpn2_GivenName().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn2_GivenName().getValue(),
					this.nk1.getNk130_ContactPersonSName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.nk1.getNk130_ContactPersonSName(i).getXpn4_SuffixEgJRorIII().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn4_SuffixEgJRorIII().getValue(),
					this.nk1.getNk130_ContactPersonSName(i).getXpn5_PrefixEgDR().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn5_PrefixEgDR().getValue(),
					this.nk1.getNk130_ContactPersonSName(i).getXpn6_DegreeEgMD().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn6_DegreeEgMD().getValue(), 
					this.nk1.getNk130_ContactPersonSName(i).getXpn7_NameTypeCode().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn7_NameTypeCode().getValue(), 
					this.nk1.getNk130_ContactPersonSName(i).getXpn8_NameRepresentationCode().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn8_NameRepresentationCode().getValue(), 
					new CE_v2(
							this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe1_Identifier().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe2_Text().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe2_Text().getValue(), 
							this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(), 
							this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe5_AlternateText().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe5_AlternateText().getValue(), 
							this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.nk1.getNk130_ContactPersonSName(i).getXpn11_NameAssemblyOrder().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.nk1.getNk130_ContactPersonSName(i).getXpn12_EffectiveDate().getTs1_Time().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.nk1.getNk130_ContactPersonSName(i).getXpn13_ExpirationDate().getTs1_Time().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.nk1.getNk130_ContactPersonSName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.nk1.getNk130_ContactPersonSName(i).getXpn14_ProfessionalSuffix().getValue()==null?"":this.nk1.getNk130_ContactPersonSName(i).getXpn14_ProfessionalSuffix().getValue());
		}
			return contactPersonsName;
	}
	/**
	 * @param nk1_30_contactPersonsName the nk1_30_contactPersonsName to set
	 * @JsonProperty("nk1_30_contactPersonsName")
	 * @throws DataTypeException 
	 */
	public void setNk1_30_contactPersonsName(XPN_v25[] nk1_30_contactPersonsName) throws DataTypeException {
		for(int i = 0; i<nk1_30_contactPersonsName.length-1;i++) {
			this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn1_Surname().setValue(nk1_30_contactPersonsName[i].getXpn_1_familyName().getFn_1_surname());
			this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(nk1_30_contactPersonsName[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(nk1_30_contactPersonsName[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(nk1_30_contactPersonsName[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.nk1.getNk130_ContactPersonSName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(nk1_30_contactPersonsName[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.nk1.getNk130_ContactPersonSName(i).getXpn2_GivenName().setValue(nk1_30_contactPersonsName[i].getXpn_2_givenName());
			this.nk1.getNk130_ContactPersonSName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(nk1_30_contactPersonsName[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.nk1.getNk130_ContactPersonSName(i).getXpn4_SuffixEgJRorIII().setValue(nk1_30_contactPersonsName[i].getXpn_4_suffixEGJrOrIii());
			this.nk1.getNk130_ContactPersonSName(i).getXpn5_PrefixEgDR().setValue(nk1_30_contactPersonsName[i].getXpn_5_prefixEGDr());
			this.nk1.getNk130_ContactPersonSName(i).getXpn6_DegreeEgMD().setValue(nk1_30_contactPersonsName[i].getXpn_6_degreeEGMd());
			this.nk1.getNk130_ContactPersonSName(i).getXpn7_NameTypeCode().setValue(nk1_30_contactPersonsName[i].getXpn_7_nameTypeCode());
			this.nk1.getNk130_ContactPersonSName(i).getXpn8_NameRepresentationCode().setValue(nk1_30_contactPersonsName[i].getXpn_8_nameRepresentationCode());
			this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe1_Identifier().setValue(nk1_30_contactPersonsName[i].getXpn_9_nameContext().getCe_1_identifier());
			this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe2_Text().setValue(nk1_30_contactPersonsName[i].getXpn_9_nameContext().getCe_2_text());
			this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(nk1_30_contactPersonsName[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(nk1_30_contactPersonsName[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe5_AlternateText().setValue(nk1_30_contactPersonsName[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.nk1.getNk130_ContactPersonSName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(nk1_30_contactPersonsName[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(nk1_30_contactPersonsName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(nk1_30_contactPersonsName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(nk1_30_contactPersonsName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.nk1.getNk130_ContactPersonSName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(nk1_30_contactPersonsName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.nk1.getNk130_ContactPersonSName(i).getXpn11_NameAssemblyOrder().setValue(nk1_30_contactPersonsName[i].getXpn_11_nameAssemblyOrder());
			this.nk1.getNk130_ContactPersonSName(i).getXpn12_EffectiveDate().getTs1_Time().setValue(nk1_30_contactPersonsName[i].getXpn_12_effectiveDate().getTs_1_time());
			this.nk1.getNk130_ContactPersonSName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(nk1_30_contactPersonsName[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk130_ContactPersonSName(i).getXpn13_ExpirationDate().getTs1_Time().setValue(nk1_30_contactPersonsName[i].getXpn_13_expirationDate().getTs_1_time());
			this.nk1.getNk130_ContactPersonSName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(nk1_30_contactPersonsName[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.nk1.getNk130_ContactPersonSName(i).getXpn14_ProfessionalSuffix().setValue(nk1_30_contactPersonsName[i].getXpn_14_professionalSuffix());
		}
		this.nk1_30_contactPersonsName = nk1_30_contactPersonsName;
	}
	/**
	 * @return the nk1_31_contactPersonsTelephoneNumber
	 *	@JsonProperty("nk1_31_contactPersonsTelephoneNumber")
	 */
	
	public XTN_v25 getNk1_31_contactPersonsTelephoneNumber() {
		return nk1_31_contactPersonsTelephoneNumber;
	}
	/**
	 * @param nk1_31_contactPersonsTelephoneNumber the nk1_31_contactPersonsTelephoneNumber to set
	 * @JsonProperty("nk1_31_contactPersonsTelephoneNumber")
	 */
	public void setNk1_31_contactPersonsTelephoneNumber(XTN_v25 nk1_31_contactPersonsTelephoneNumber) {
		this.nk1_31_contactPersonsTelephoneNumber = nk1_31_contactPersonsTelephoneNumber;
	}
	/**
	 * @return the nk1_32_contactPersonsAddress
	 *	@JsonProperty("nk1_32_contactPersonsAddress")
	 */
	
	public XAD_v25 getNk1_32_contactPersonsAddress() {
		return nk1_32_contactPersonsAddress;
	}
	/**
	 * @param nk1_32_contactPersonsAddress the nk1_32_contactPersonsAddress to set
	 * @JsonProperty("nk1_32_contactPersonsAddress")
	 */
	public void setNk1_32_contactPersonsAddress(XAD_v25 nk1_32_contactPersonsAddress) {
		this.nk1_32_contactPersonsAddress = nk1_32_contactPersonsAddress;
	}
	/**
	 * @return the nk1_33_nextofKinAssociatedPartysIdentifiers
	 *	@JsonProperty("nk1_33_nextofKinAssociatedPartysIdentifiers")
	 */
	
	public CX_v25 getNk1_33_nextofKinAssociatedPartysIdentifiers() {
		return nk1_33_nextofKinAssociatedPartysIdentifiers;
	}
	/**
	 * @param nk1_33_nextofKinAssociatedPartysIdentifiers the nk1_33_nextofKinAssociatedPartysIdentifiers to set
	 * @JsonProperty("nk1_33_nextofKinAssociatedPartysIdentifiers")
	 */
	public void setNk1_33_nextofKinAssociatedPartysIdentifiers(CX_v25 nk1_33_nextofKinAssociatedPartysIdentifiers) {
		this.nk1_33_nextofKinAssociatedPartysIdentifiers = nk1_33_nextofKinAssociatedPartysIdentifiers;
	}
	/**
	 * @return the nk1_34_jobStatus
	 *	@JsonProperty("nk1_34_jobStatus")
	 */
	
	public String getNk1_34_jobStatus() {
		return nk1_34_jobStatus;
	}
	/**
	 * @param nk1_34_jobStatus the nk1_34_jobStatus to set
	 * @JsonProperty("nk1_34_jobStatus")
	 */
	public void setNk1_34_jobStatus(String nk1_34_jobStatus) {
		this.nk1_34_jobStatus = nk1_34_jobStatus;
	}
	/**
	 * @return the nk1_35_race
	 *	@JsonProperty("nk1_35_race")
	 */
	
	public CE_v2 getNk1_35_race() {
		return nk1_35_race;
	}
	/**
	 * @param nk1_35_race the nk1_35_race to set
	 * @JsonProperty("nk1_35_race")
	 */
	public void setNk1_35_race(CE_v2 nk1_35_race) {
		this.nk1_35_race = nk1_35_race;
	}
	/**
	 * @return the nk1_36_handicap
	 *	@JsonProperty("nk1_36_handicap")
	 */
	
	public String getNk1_36_handicap() {
		return nk1_36_handicap;
	}
	/**
	 * @param nk1_36_handicap the nk1_36_handicap to set
	 * @JsonProperty("nk1_36_handicap")
	 */
	public void setNk1_36_handicap(String nk1_36_handicap) {
		this.nk1_36_handicap = nk1_36_handicap;
	}
	/**
	 * @return the nk1_37_contactPersonSocialSecurityNumber
	 *	@JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	 */
	
	public String getNk1_37_contactPersonSocialSecurityNumber() {
		return nk1_37_contactPersonSocialSecurityNumber;
	}
	/**
	 * @param nk1_37_contactPersonSocialSecurityNumber the nk1_37_contactPersonSocialSecurityNumber to set
	 * @JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	 */
	public void setNk1_37_contactPersonSocialSecurityNumber(String nk1_37_contactPersonSocialSecurityNumber) {
		this.nk1_37_contactPersonSocialSecurityNumber = nk1_37_contactPersonSocialSecurityNumber;
	}
	/**
	 * @return the nk1_38_nextofKinBirthPlace
	 *	@JsonProperty("nk1_38_nextofKinBirthPlace")
	 */
	
	public String getNk1_38_nextofKinBirthPlace() {
		return nk1_38_nextofKinBirthPlace;
	}
	/**
	 * @param nk1_38_nextofKinBirthPlace the nk1_38_nextofKinBirthPlace to set
	 * @JsonProperty("nk1_38_nextofKinBirthPlace")
	 */
	public void setNk1_38_nextofKinBirthPlace(String nk1_38_nextofKinBirthPlace) {
		this.nk1_38_nextofKinBirthPlace = nk1_38_nextofKinBirthPlace;
	}
	/**
	 * @return the nk1_39_vipIndicator
	 *	@JsonProperty("nk1_39_vipIndicator")
	 */
	
	public String getNk1_39_vipIndicator() {
		return nk1_39_vipIndicator;
	}
	/**
	 * @param nk1_39_vipIndicator the nk1_39_vipIndicator to set
	 * @JsonProperty("nk1_39_vipIndicator")
	 */
	public void setNk1_39_vipIndicator(String nk1_39_vipIndicator) {
		this.nk1_39_vipIndicator = nk1_39_vipIndicator;
	}
	/**
	 * @return the nk1
	 *	@JsonProperty("nk1")
	 */
	
	public NK1 getNk1() {
		return nk1;
	}
	/**
	 * @param nk1 the nk1 to set
	 * @JsonProperty("nk1")
	 */
	public void setNk1(NK1 nk1) {
		this.nk1 = nk1;
	}
	
}
