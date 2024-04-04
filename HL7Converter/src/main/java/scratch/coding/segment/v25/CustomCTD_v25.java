package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.CTD;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.PLN_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.SAD_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomCTD_v25 {
	@JsonProperty("ctd_1_contactRole")
	private CE_v2[] ctd_1_contactRole;
	@JsonProperty("ctd_2_contactName")
	private XPN_v25[] ctd_2_contactName;
	@JsonProperty("ctd_3_contactAddress")
	private XAD_v25[] ctd_3_contactAddress;
	@JsonProperty("ctd_4_contactLocation")
	private PL_v25 ctd_4_contactLocation;
	@JsonProperty("ctd_5_contactCommunicationInformation")
	private XTN_v25[] ctd_5_contactCommunicationInformation;
	@JsonProperty("ctd_6_preferredMethodofContact")
	private CE_v2 ctd_6_preferredMethodofContact;
	@JsonProperty("ctd_7_contactIdentifiers")
	private PLN_v25[] ctd_7_contactIdentifiers;
	
	private CTD ctd;
	
	private CustomCTD_v25(CTD ctd, CustomNTE_v25[] nte) {
		super();
		this.ctd =ctd;
//		setNte(nte);
	}
	private CustomCTD_v25(CTD ctd) {
		super();
		this.ctd =ctd;
	}
	
	public CustomCTD_v25() {
		super();
	}
	public static CustomCTD_v25 createCTDWithCTD(CTD ctd) throws HL7Exception, IOException {
		return new CustomCTD_v25(ctd);
	}

	public static CustomCTD_v25 createCTDWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		CTD ctd = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getCTD();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		return new CustomCTD_v25(ctd);
	}
	/**
	 * @return the ctd_1_contactRole
	 */
	
	@JsonProperty("ctd_1_contactRole")
	public CE_v2[] getCtd_1_contactRole() {
		CE_v2[] contactRole = new CE_v2[this.ctd.getCtd1_ContactRole().length];
		for(int i =0; i< this.ctd.getCtd1_ContactRole().length-1;i++) {
			contactRole[i] = new CE_v2(
					this.ctd.getCtd1_ContactRole(i).getCe1_Identifier().getValue(),
					this.ctd.getCtd1_ContactRole(i).getCe2_Text().getValue(),
					this.ctd.getCtd1_ContactRole(i).getCe3_NameOfCodingSystem().getValue(),
					this.ctd.getCtd1_ContactRole(i).getCe4_AlternateIdentifier().getValue(),
					this.ctd.getCtd1_ContactRole(i).getCe5_AlternateText().getValue(),
					this.ctd.getCtd1_ContactRole(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return contactRole;
	}
	/**
	 * @param ctd_1_contactRole the ctd_1_contactRole to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ctd_1_contactRole")
	public void setCtd_1_contactRole(CE_v2[] ctd_1_contactRole) throws DataTypeException {
		for(int i=0;i< ctd_1_contactRole.length-1;i++) {
			this.ctd.getCtd1_ContactRole(i).getCe1_Identifier().setValue(ctd_1_contactRole[i].getCe_1_identifier());
			this.ctd.getCtd1_ContactRole(i).getCe2_Text().setValue(ctd_1_contactRole[i].getCe_2_text());
			this.ctd.getCtd1_ContactRole(i).getCe3_NameOfCodingSystem().setValue(ctd_1_contactRole[i].getCe_3_nameOfCodingSystem());
			this.ctd.getCtd1_ContactRole(i).getCe4_AlternateIdentifier().setValue(ctd_1_contactRole[i].getCe_4_alternateIdentifier());
			this.ctd.getCtd1_ContactRole(i).getCe5_AlternateText().setValue(ctd_1_contactRole[i].getCe_5_alternateText());
			this.ctd.getCtd1_ContactRole(i).getCe6_NameOfAlternateCodingSystem().setValue(ctd_1_contactRole[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.ctd_1_contactRole = ctd_1_contactRole;
	}
	/**
	 * @return the ctd_2_contactName
	 */
	
	@JsonProperty("ctd_2_contactName")
	public XPN_v25[] getCtd_2_contactName() {
		XPN_v25[] contactName = new XPN_v25[this.ctd.getCtd2_ContactName().length];
		for(int i = 0; i<this.ctd.getCtd2_ContactName().length-1;i++) {
			contactName[i] = new XPN_v25(
					new FN_v25(
							this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn1_Surname().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn3_OwnSurname().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.ctd.getCtd2_ContactName(i).getXpn2_GivenName().getValue(),
					this.ctd.getCtd2_ContactName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.ctd.getCtd2_ContactName(i).getXpn4_SuffixEgJRorIII().getValue(), 
					this.ctd.getCtd2_ContactName(i).getXpn5_PrefixEgDR().getValue(),
					this.ctd.getCtd2_ContactName(i).getXpn6_DegreeEgMD().getValue(), 
					this.ctd.getCtd2_ContactName(i).getXpn7_NameTypeCode().getValue(),
					this.ctd.getCtd2_ContactName(i).getXpn8_NameRepresentationCode().getValue(),
					new CE_v2(
							this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe1_Identifier().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe2_Text().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe5_AlternateText().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTime().getValue(),
									this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.ctd.getCtd2_ContactName(i).getXpn11_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.ctd.getCtd2_ContactName(i).getXpn12_EffectiveDate().getTs1_Time().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.ctd.getCtd2_ContactName(i).getXpn13_ExpirationDate().getTs1_Time().getValue(),
							this.ctd.getCtd2_ContactName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.ctd.getCtd2_ContactName(i).getXpn14_ProfessionalSuffix().getValue());
		}
		return ctd_2_contactName;
	}
	/**
	 * @param ctd_2_contactName the ctd_2_contactName to set
	 * @JsonProperty("ctd_2_contactName")
	 * @throws DataTypeException 
	 */
	public void setCtd_2_contactName(XPN_v25[] ctd_2_contactName) throws DataTypeException {
		for(int i = 0; i<ctd_2_contactName.length-1;i++) {
			this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn1_Surname().setValue(ctd_2_contactName[i].getXpn_1_familyName().getFn_1_surname());
			this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(ctd_2_contactName[i].getXpn_1_familyName().getFn_2_ownSurnamePrefix());
			this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn3_OwnSurname().setValue(ctd_2_contactName[i].getXpn_1_familyName().getFn_3_ownSurname());
			this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(ctd_2_contactName[i].getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.ctd.getCtd2_ContactName(i).getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(ctd_2_contactName[i].getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
			this.ctd.getCtd2_ContactName(i).getXpn2_GivenName().setValue(ctd_2_contactName[i].getXpn_2_givenName());
			this.ctd.getCtd2_ContactName(i).getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(ctd_2_contactName[i].getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
			this.ctd.getCtd2_ContactName(i).getXpn4_SuffixEgJRorIII().setValue(ctd_2_contactName[i].getXpn_4_suffixEGJrOrIii());
			this.ctd.getCtd2_ContactName(i).getXpn5_PrefixEgDR().setValue(ctd_2_contactName[i].getXpn_5_prefixEGDr());
			this.ctd.getCtd2_ContactName(i).getXpn6_DegreeEgMD().setValue(ctd_2_contactName[i].getXpn_6_degreeEGMd());
			this.ctd.getCtd2_ContactName(i).getXpn7_NameTypeCode().setValue(ctd_2_contactName[i].getXpn_7_nameTypeCode());
			this.ctd.getCtd2_ContactName(i).getXpn8_NameRepresentationCode().setValue(ctd_2_contactName[i].getXpn_8_nameRepresentationCode());
			this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe1_Identifier().setValue(ctd_2_contactName[i].getXpn_9_nameContext().getCe_1_identifier());
			this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe2_Text().setValue(ctd_2_contactName[i].getXpn_9_nameContext().getCe_2_text());
			this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe3_NameOfCodingSystem().setValue(ctd_2_contactName[i].getXpn_9_nameContext().getCe_3_nameOfCodingSystem());
			this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe4_AlternateIdentifier().setValue(ctd_2_contactName[i].getXpn_9_nameContext().getCe_4_alternateIdentifier());
			this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe5_AlternateText().setValue(ctd_2_contactName[i].getXpn_9_nameContext().getCe_5_alternateText());
			this.ctd.getCtd2_ContactName(i).getXpn9_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(ctd_2_contactName[i].getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(ctd_2_contactName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(ctd_2_contactName[i].getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTime().setValue(ctd_2_contactName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.ctd.getCtd2_ContactName(i).getXpn10_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(ctd_2_contactName[i].getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.ctd.getCtd2_ContactName(i).getXpn11_NameAssemblyOrder().setValue(ctd_2_contactName[i].getXpn_11_nameAssemblyOrder());
			this.ctd.getCtd2_ContactName(i).getXpn12_EffectiveDate().getTs1_Time().setValue(ctd_2_contactName[i].getXpn_12_effectiveDate().getTs_1_time());
			this.ctd.getCtd2_ContactName(i).getXpn12_EffectiveDate().getTs2_DegreeOfPrecision().setValue(ctd_2_contactName[i].getXpn_12_effectiveDate().getTs_2_degreeOfPrecision());
			this.ctd.getCtd2_ContactName(i).getXpn13_ExpirationDate().getTs1_Time().setValue(ctd_2_contactName[i].getXpn_13_expirationDate().getTs_1_time());
			this.ctd.getCtd2_ContactName(i).getXpn13_ExpirationDate().getTs2_DegreeOfPrecision().setValue(ctd_2_contactName[i].getXpn_13_expirationDate().getTs_2_degreeOfPrecision());
			this.ctd.getCtd2_ContactName(i).getXpn14_ProfessionalSuffix().setValue(ctd_2_contactName[i].getXpn_14_professionalSuffix());
		}
		this.ctd_2_contactName = ctd_2_contactName;
	}
	/**
	 * @return the ctd_3_contactAddress
	 */
	
	@JsonProperty("ctd_3_contactAddress")
	public XAD_v25[] getCtd_3_contactAddress() {
		XAD_v25[] contactAddress = new XAD_v25[this.ctd.getCtd3_ContactAddress().length];
		for(int i =0; i< this.ctd.getCtd3_ContactAddress().length-1;i++) {
			contactAddress[i] = new XAD_v25(
					new SAD_v25(
							this.ctd.getCtd3_ContactAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue(),
							this.ctd.getCtd3_ContactAddress(i).getXad1_StreetAddress().getSad2_StreetName().getValue(),
							this.ctd.getCtd3_ContactAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()),
					this.ctd.getCtd3_ContactAddress(i).getXad2_OtherDesignation().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad3_City().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad4_StateOrProvince().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad5_ZipOrPostalCode().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad6_Country().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad7_AddressType().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad8_OtherGeographicDesignation().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad9_CountyParishCode().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad10_CensusTract().getValue(),
					this.ctd.getCtd3_ContactAddress(i).getXad11_AddressRepresentationCode().getValue(),
					new DR_v2(
							new TS_v2(
									this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					new TS_v2(
							this.ctd.getCtd3_ContactAddress(i).getXad13_EffectiveDate().getTs1_Time().getValue(),
							this.ctd.getCtd3_ContactAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.ctd.getCtd3_ContactAddress(i).getXad14_ExpirationDate().getTs1_Time().getValue(),
							this.ctd.getCtd3_ContactAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()));
		}
		return ctd_3_contactAddress;
	}
	/**
	 * @param ctd_3_contactAddress the ctd_3_contactAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ctd_3_contactAddress")
	public void setCtd_3_contactAddress(XAD_v25[] ctd_3_contactAddress) throws DataTypeException {
		for(int i =0; i< ctd_3_contactAddress.length-1;i++) {
			this.ctd.getCtd3_ContactAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().setValue(ctd_3_contactAddress[i].getXad_1_streetAddress().getSad_1_streetOrMailingAddress());
			this.ctd.getCtd3_ContactAddress(i).getXad1_StreetAddress().getSad2_StreetName().setValue(ctd_3_contactAddress[i].getXad_1_streetAddress().getSad_2_streetName());
			this.ctd.getCtd3_ContactAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().setValue(ctd_3_contactAddress[i].getXad_1_streetAddress().getSad_3_dwellingNumber());
			this.ctd.getCtd3_ContactAddress(i).getXad2_OtherDesignation().setValue(ctd_3_contactAddress[i].getXad_2_otherDesignation());
			this.ctd.getCtd3_ContactAddress(i).getXad3_City().setValue(ctd_3_contactAddress[i].getXad_3_city());
			this.ctd.getCtd3_ContactAddress(i).getXad4_StateOrProvince().setValue(ctd_3_contactAddress[i].getXad_4_stateOrProvince());
			this.ctd.getCtd3_ContactAddress(i).getXad5_ZipOrPostalCode().setValue(ctd_3_contactAddress[i].getXad_5_zipOrPostalCode());
			this.ctd.getCtd3_ContactAddress(i).getXad6_Country().setValue(ctd_3_contactAddress[i].getXad_6_country());
			this.ctd.getCtd3_ContactAddress(i).getXad7_AddressType().setValue(ctd_3_contactAddress[i].getXad_7_addressType());
			this.ctd.getCtd3_ContactAddress(i).getXad8_OtherGeographicDesignation().setValue(ctd_3_contactAddress[i].getXad_8_otherGeographicDesignation());
			this.ctd.getCtd3_ContactAddress(i).getXad9_CountyParishCode().setValue(ctd_3_contactAddress[i].getXad_9_countyParishCode());
			this.ctd.getCtd3_ContactAddress(i).getXad10_CensusTract().setValue(ctd_3_contactAddress[i].getXad_10_censusTract());
			this.ctd.getCtd3_ContactAddress(i).getXad11_AddressRepresentationCode().setValue(ctd_3_contactAddress[i].getXad_11_addressRepresentationCode());
			this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(ctd_3_contactAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(ctd_3_contactAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime() .getTs_2_degreeOfPrecision());
			this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(ctd_3_contactAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.ctd.getCtd3_ContactAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(ctd_3_contactAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.ctd.getCtd3_ContactAddress(i).getXad13_EffectiveDate().getTs1_Time().setValue(ctd_3_contactAddress[i].getXad_13_effectiveDate().getTs_1_time());
			this.ctd.getCtd3_ContactAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().setValue(ctd_3_contactAddress[i].getXad_13_effectiveDate().getTs_2_degreeOfPrecision());
			this.ctd.getCtd3_ContactAddress(i).getXad14_ExpirationDate().getTs1_Time().setValue(ctd_3_contactAddress[i].getXad_14_expirationDate().getTs_1_time());
			this.ctd.getCtd3_ContactAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().setValue(ctd_3_contactAddress[i].getXad_14_expirationDate().getTs_2_degreeOfPrecision());
		}
		this.ctd_3_contactAddress = ctd_3_contactAddress;
	}
	/**
	 * @return the ctd_4_contactLocation
	 *	@JsonProperty("ctd_4_contactLocation")
	 */
	
	public PL_v25 getCtd_4_contactLocation() {		
		return new PL_v25(
				this.ctd.getCtd4_ContactLocation().getPl1_PointOfCare().getValue(),
				this.ctd.getCtd4_ContactLocation().getPl2_Room().getValue(),
				this.ctd.getCtd4_ContactLocation().getPl3_Bed().getValue(),
				new HD_v2(
						this.ctd.getCtd4_ContactLocation().getPl4_Facility().getHd1_NamespaceID().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl4_Facility().getHd2_UniversalID().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()),
				this.ctd.getCtd4_ContactLocation().getPl5_LocationStatus().getValue(),
				this.ctd.getCtd4_ContactLocation().getPl6_PersonLocationType().getValue(),
				this.ctd.getCtd4_ContactLocation().getPl7_Building().getValue(),
				this.ctd.getCtd4_ContactLocation().getPl8_Floor().getValue(),
				this.ctd.getCtd4_ContactLocation().getPl9_LocationDescription().getValue(),
				new EI_v2(
						this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()),
				new HD_v2(
						this.ctd.getCtd4_ContactLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(),
						this.ctd.getCtd4_ContactLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param ctd_4_contactLocation the ctd_4_contactLocation to set
	 * @JsonProperty("ctd_4_contactLocation")
	 * @throws DataTypeException 
	 */
	public void setCtd_4_contactLocation(PL_v25 ctd_4_contactLocation) throws DataTypeException {
		this.ctd.getCtd4_ContactLocation().getPl1_PointOfCare().setValue(ctd_4_contactLocation.getPl_1_pointOfCare());
		this.ctd.getCtd4_ContactLocation().getPl2_Room().setValue(ctd_4_contactLocation.getPl_2_room());
		this.ctd.getCtd4_ContactLocation().getPl3_Bed().setValue(ctd_4_contactLocation.getPl_3_bed());
		this.ctd.getCtd4_ContactLocation().getPl4_Facility().getHd1_NamespaceID().setValue(ctd_4_contactLocation.getPl_4_facility().getHd_1_namespaceId());
		this.ctd.getCtd4_ContactLocation().getPl4_Facility().getHd2_UniversalID().setValue(ctd_4_contactLocation.getPl_4_facility().getHd_2_universalId());
		this.ctd.getCtd4_ContactLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(ctd_4_contactLocation.getPl_4_facility().getHd_3_universalIdType());
		this.ctd.getCtd4_ContactLocation().getPl5_LocationStatus().setValue(ctd_4_contactLocation.getPl_5_locationStatus());
		this.ctd.getCtd4_ContactLocation().getPl6_PersonLocationType().setValue(ctd_4_contactLocation.getPl_6_personLocationType());
		this.ctd.getCtd4_ContactLocation().getPl7_Building().setValue(ctd_4_contactLocation.getPl_7_building());
		this.ctd.getCtd4_ContactLocation().getPl8_Floor().setValue(ctd_4_contactLocation.getPl_8_floor());
		this.ctd.getCtd4_ContactLocation().getPl9_LocationDescription().setValue(ctd_4_contactLocation.getPl_9_locationDescription());
		this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(ctd_4_contactLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(ctd_4_contactLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId());
		this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(ctd_4_contactLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.ctd.getCtd4_ContactLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(ctd_4_contactLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.ctd.getCtd4_ContactLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(ctd_4_contactLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.ctd.getCtd4_ContactLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(ctd_4_contactLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.ctd.getCtd4_ContactLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(ctd_4_contactLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.ctd_4_contactLocation = ctd_4_contactLocation;
	}
	/**
	 * @return the ctd_5_contactCommunicationInformation
	 */
	
	@JsonProperty("ctd_5_contactCommunicationInformation")
	public XTN_v25[] getCtd_5_contactCommunicationInformation() {
		XTN_v25[] contactCommunicationInformation = new XTN_v25[this.ctd.getCtd5_ContactCommunicationInformation().length];
		for(int i =0; i<this.ctd.getCtd5_ContactCommunicationInformation().length-1;i++) {
			contactCommunicationInformation[i] = new XTN_v25(
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn1_TelephoneNumber().getValue(),
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn4_EmailAddress().getValue(),
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn5_CountryCode().getValue(),
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn6_AreaCityCode().getValue(), 
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn7_LocalNumber().getValue(), 
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn8_Extension().getValue(), 
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn9_AnyText().getValue(), 
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn10_ExtensionPrefix().getValue(), 
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn11_SpeedDialCode().getValue(), 
					this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		
		return contactCommunicationInformation;
	}
	/**
	 * @param ctd_5_contactCommunicationInformation the ctd_5_contactCommunicationInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ctd_5_contactCommunicationInformation")
	public void setCtd_5_contactCommunicationInformation(XTN_v25[] ctd_5_contactCommunicationInformation) throws DataTypeException {
		for(int i =0; i<ctd_5_contactCommunicationInformation.length-1;i++) {
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn1_TelephoneNumber().setValue(ctd_5_contactCommunicationInformation[i].getXtn_1_telephoneNumber());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn2_TelecommunicationUseCode().setValue(ctd_5_contactCommunicationInformation[i].getXtn_2_telecommunicationUseCode());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn3_TelecommunicationEquipmentType().setValue(ctd_5_contactCommunicationInformation[i].getXtn_3_telecommunicationEquipmentType());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn4_EmailAddress().setValue(ctd_5_contactCommunicationInformation[i].getXtn_4_emailAddress());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn5_CountryCode().setValue(ctd_5_contactCommunicationInformation[i].getXtn_5_countryCode());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn6_AreaCityCode().setValue(ctd_5_contactCommunicationInformation[i].getXtn_6_areaCityCode());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn7_LocalNumber().setValue(ctd_5_contactCommunicationInformation[i].getXtn_7_localNumber());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn8_Extension().setValue(ctd_5_contactCommunicationInformation[i].getXtn_8_extension());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn9_AnyText().setValue(ctd_5_contactCommunicationInformation[i].getXtn_9_anyText());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn10_ExtensionPrefix().setValue(ctd_5_contactCommunicationInformation[i].getXtn_10_extensionPrefix()); 
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn11_SpeedDialCode().setValue(ctd_5_contactCommunicationInformation[i].getXtn_11_SpeedDialCode());
			this.ctd.getCtd5_ContactCommunicationInformation(i).getXtn12_UnformattedTelephoneNumber().setValue(ctd_5_contactCommunicationInformation[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.ctd_5_contactCommunicationInformation = ctd_5_contactCommunicationInformation;
	}
	/**
	 * @return the ctd_6_preferredMethodofContact
	 */
	
	@JsonProperty("ctd_6_preferredMethodofContact")
	public CE_v2 getCtd_6_preferredMethodofContact() {
		
		return new CE_v2(
				this.ctd.getCtd6_PreferredMethodOfContact().getCe1_Identifier().getValue(),
				this.ctd.getCtd6_PreferredMethodOfContact().getCe2_Text().getValue(), 
				this.ctd.getCtd6_PreferredMethodOfContact().getCe3_NameOfCodingSystem().getValue(), 
				this.ctd.getCtd6_PreferredMethodOfContact().getCe4_AlternateIdentifier().getValue(), 
				this.ctd.getCtd6_PreferredMethodOfContact().getCe5_AlternateText().getValue(), 
				this.ctd.getCtd6_PreferredMethodOfContact().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param ctd_6_preferredMethodofContact the ctd_6_preferredMethodofContact to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ctd_6_preferredMethodofContact")
	public void setCtd_6_preferredMethodofContact(CE_v2 ctd_6_preferredMethodofContact) throws DataTypeException {
		this.ctd.getCtd6_PreferredMethodOfContact().getCe1_Identifier().setValue(ctd_6_preferredMethodofContact.getCe_1_identifier());
		this.ctd.getCtd6_PreferredMethodOfContact().getCe2_Text().setValue(ctd_6_preferredMethodofContact.getCe_2_text());
		this.ctd.getCtd6_PreferredMethodOfContact().getCe3_NameOfCodingSystem().setValue(ctd_6_preferredMethodofContact.getCe_3_nameOfCodingSystem());
		this.ctd.getCtd6_PreferredMethodOfContact().getCe4_AlternateIdentifier().setValue(ctd_6_preferredMethodofContact.getCe_4_alternateIdentifier());
		this.ctd.getCtd6_PreferredMethodOfContact().getCe5_AlternateText().setValue(ctd_6_preferredMethodofContact.getCe_5_alternateText());
		this.ctd.getCtd6_PreferredMethodOfContact().getCe6_NameOfAlternateCodingSystem().setValue(ctd_6_preferredMethodofContact.getCe_6_nameOfAlternateCodingSystem());
		this.ctd_6_preferredMethodofContact = ctd_6_preferredMethodofContact;
	}
	/**
	 * @return the ctd_7_contactIdentifiers
	 */
	
	@JsonProperty("ctd_7_contactIdentifiers")
	public PLN_v25[] getCtd_7_contactIdentifiers() {
		PLN_v25[] contactIdentifiers = new PLN_v25[this.ctd.getCtd7_ContactIdentifiers().length];
		for(int i = 0; i<this.ctd.getCtd7_ContactIdentifiers().length-1;i++) {
			contactIdentifiers[i] = new PLN_v25(
					this.ctd.getCtd7_ContactIdentifiers(i).getPln1_IDNumber().getValue(),
					this.ctd.getCtd7_ContactIdentifiers(i).getPln2_TypeOfIDNumber().getValue(),
					this.ctd.getCtd7_ContactIdentifiers(i).getPln3_StateOtherQualifyingInformation().getValue(),
					this.ctd.getCtd7_ContactIdentifiers(i).getPln4_ExpirationDate().getValue());
		}
		return contactIdentifiers;
	}
	/**
	 * @param ctd_7_contactIdentifiers the ctd_7_contactIdentifiers to set
	 * @JsonProperty("ctd_7_contactIdentifiers")
	 * @throws DataTypeException 
	 */
	public void setCtd_7_contactIdentifiers(PLN_v25[] ctd_7_contactIdentifiers) throws DataTypeException {
		for(int i = 0; i<this.ctd.getCtd7_ContactIdentifiers().length-1;i++) {
			this.ctd.getCtd7_ContactIdentifiers(i).getPln1_IDNumber().setValue(ctd_7_contactIdentifiers[i].getPnl_1_idNumber());
			this.ctd.getCtd7_ContactIdentifiers(i).getPln2_TypeOfIDNumber().setValue(ctd_7_contactIdentifiers[i].getPnl_2_typeOfIdNumber());
			this.ctd.getCtd7_ContactIdentifiers(i).getPln3_StateOtherQualifyingInformation().setValue(ctd_7_contactIdentifiers[i].getPnl_3_stateOtherQualifyingInformation());
			this.ctd.getCtd7_ContactIdentifiers(i).getPln4_ExpirationDate().setValue(ctd_7_contactIdentifiers[i].getPnl_4_expirationDate());
		}
		this.ctd_7_contactIdentifiers = ctd_7_contactIdentifiers;
	}
	@Override
	public String toString() {
		return "CustomCTD_v25 [ctd_1_contactRole=" + Arrays.toString(ctd_1_contactRole) + ", ctd_2_contactName="
				+ Arrays.toString(ctd_2_contactName) + ", ctd_3_contactAddress=" + Arrays.toString(ctd_3_contactAddress)
				+ ", ctd_4_contactLocation=" + ctd_4_contactLocation + ", ctd_5_contactCommunicationInformation="
				+ Arrays.toString(ctd_5_contactCommunicationInformation) + ", ctd_6_preferredMethodofContact="
				+ ctd_6_preferredMethodofContact + ", ctd_7_contactIdentifiers="
				+ Arrays.toString(ctd_7_contactIdentifiers) + ", ctd=" + ctd + "]";
	}
	
}
