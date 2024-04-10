package scratch.coding.segment.v25;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.PV2;
import ca.uhn.hl7v2.model.v25.segment.SFT;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.XON_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomSFT_v25 {
	@JsonProperty("sft_1_softwareVendorOrganization")
	private XON_v25 sft_1_softwareVendorOrganization;
	@JsonProperty("sft_2_softwareCertifiedVersionorReleaseNumber")
	private String sft_2_softwareCertifiedVersionorReleaseNumber;
	@JsonProperty("sft_3_softwareProductName")
	private String sft_3_softwareProductName;
	@JsonProperty("sft_4_softwareBinaryID")
	private String sft_4_softwareBinaryID;
	@JsonProperty("sft_5_softwareProductInformation")
	private String sft_5_softwareProductInformation;
	@JsonProperty("sft_6_softwareInstallDate")
	private TS_v2 sft_6_softwareInstallDate;
	
	private SFT sft;
	
	private CustomSFT_v25(SFT sft, CustomNTE_v25[] nte) {
		super();
		this.sft =sft;
//		setNte(nte);
	}
	private CustomSFT_v25(SFT sft) {
		super();
		this.sft = sft;
	}
	
	public CustomSFT_v25() {
		super();
	}
	public static CustomSFT_v25 createSFTWithSFT(SFT sft) throws HL7Exception, IOException {
		return new CustomSFT_v25(sft);
	}

	public static CustomSFT_v25 createPD1WithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		SFT sft = oru.getSFT();
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
		return new CustomSFT_v25(sft);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the sft_1_softwareVendorOrganization
	 */
	
	@JsonProperty("sft_1_softwareVendorOrganization")
	public XON_v25 getSft_1_softwareVendorOrganization() {
			return new XON_v25(
					this.sft.getSft1_SoftwareVendorOrganization().getXon1_OrganizationName().getValue(),
					this.sft.getSft1_SoftwareVendorOrganization().getXon2_OrganizationNameTypeCode().getValue(),
					this.sft.getSft1_SoftwareVendorOrganization().getXon3_IDNumber().getValue(),
					this.sft.getSft1_SoftwareVendorOrganization().getXon4_CheckDigit().getValue(), 
					this.sft.getSft1_SoftwareVendorOrganization().getXon5_CheckDigitScheme().getValue(),
					new HD_v2(
							this.sft.getSft1_SoftwareVendorOrganization().getXon6_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.sft.getSft1_SoftwareVendorOrganization().getXon6_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.sft.getSft1_SoftwareVendorOrganization().getXon6_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.sft.getSft1_SoftwareVendorOrganization().getXon7_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.sft.getSft1_SoftwareVendorOrganization().getXon8_AssigningFacility().getHd1_NamespaceID().getValue(), 
							this.sft.getSft1_SoftwareVendorOrganization().getXon8_AssigningFacility().getHd2_UniversalID().getValue(),
							this.sft.getSft1_SoftwareVendorOrganization().getXon8_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.sft.getSft1_SoftwareVendorOrganization().getXon9_NameRepresentationCode().getValue(), 
					this.sft.getSft1_SoftwareVendorOrganization().getXon10_OrganizationIdentifier().getValue());
	}
	/**
	 * @param sft_1_softwareVendorOrganization the sft_1_softwareVendorOrganization to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("sft_1_softwareVendorOrganization")
	public void setSft_1_softwareVendorOrganization(XON_v25 sft_1_softwareVendorOrganization) throws DataTypeException {
		this.sft.getSft1_SoftwareVendorOrganization().getXon1_OrganizationName().setValue(sft_1_softwareVendorOrganization.getXon_1_organizationName());
		this.sft.getSft1_SoftwareVendorOrganization().getXon2_OrganizationNameTypeCode().setValue(sft_1_softwareVendorOrganization.getXon_2_organizationNameTypeCode());
		this.sft.getSft1_SoftwareVendorOrganization().getXon3_IDNumber().setValue(sft_1_softwareVendorOrganization.getXon_3_idNumber());
		this.sft.getSft1_SoftwareVendorOrganization().getXon4_CheckDigit().setValue(sft_1_softwareVendorOrganization.getXon_4_checkDigit());
		this.sft.getSft1_SoftwareVendorOrganization().getXon5_CheckDigitScheme().setValue(sft_1_softwareVendorOrganization.getXon_5_checkDigitScheme());
		this.sft.getSft1_SoftwareVendorOrganization().getXon6_AssigningAuthority().getHd1_NamespaceID().setValue(sft_1_softwareVendorOrganization.getXon_6_assigningAuthority().getHd_1_namespaceId());
		this.sft.getSft1_SoftwareVendorOrganization().getXon6_AssigningAuthority().getHd2_UniversalID().setValue(sft_1_softwareVendorOrganization.getXon_6_assigningAuthority().getHd_2_universalId());
		this.sft.getSft1_SoftwareVendorOrganization().getXon6_AssigningAuthority().getHd3_UniversalIDType().setValue(sft_1_softwareVendorOrganization.getXon_6_assigningAuthority().getHd_3_universalIdType());
		this.sft.getSft1_SoftwareVendorOrganization().getXon7_IdentifierTypeCode().setValue(sft_1_softwareVendorOrganization.getXon_7_identifierTypeCode());
		this.sft.getSft1_SoftwareVendorOrganization().getXon8_AssigningFacility().getHd1_NamespaceID().setValue(sft_1_softwareVendorOrganization.getXon_8_assigningFacility().getHd_1_namespaceId());
		this.sft.getSft1_SoftwareVendorOrganization().getXon8_AssigningFacility().getHd2_UniversalID().setValue(sft_1_softwareVendorOrganization.getXon_8_assigningFacility().getHd_2_universalId());
		this.sft.getSft1_SoftwareVendorOrganization().getXon8_AssigningFacility().getHd3_UniversalIDType().setValue(sft_1_softwareVendorOrganization.getXon_8_assigningFacility().getHd_3_universalIdType());
		this.sft.getSft1_SoftwareVendorOrganization().getXon9_NameRepresentationCode().setValue(sft_1_softwareVendorOrganization.getXon_9_nameRepresentationCode());
		this.sft.getSft1_SoftwareVendorOrganization().getXon10_OrganizationIdentifier().setValue(sft_1_softwareVendorOrganization.getXon_10_organizationIdentifier());
		this.sft_1_softwareVendorOrganization = sft_1_softwareVendorOrganization;
	}
	/**
	 * @return the sft_2_softwareCertifiedVersionorReleaseNumber
	 */
	
	@JsonProperty("sft_2_softwareCertifiedVersionorReleaseNumber")
	public String getSft_2_softwareCertifiedVersionorReleaseNumber() {
		return this.sft.getSft2_SoftwareCertifiedVersionOrReleaseNumber().getValue();
	}
	/**
	 * @param sft_2_softwareCertifiedVersionorReleaseNumber the sft_2_softwareCertifiedVersionorReleaseNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("sft_2_softwareCertifiedVersionorReleaseNumber")
	public void setSft_2_softwareCertifiedVersionorReleaseNumber(String sft_2_softwareCertifiedVersionorReleaseNumber) throws DataTypeException {
		this.sft.getSft2_SoftwareCertifiedVersionOrReleaseNumber().setValue(sft_2_softwareCertifiedVersionorReleaseNumber);
		this.sft_2_softwareCertifiedVersionorReleaseNumber = sft_2_softwareCertifiedVersionorReleaseNumber;
	}
	/**
	 * @return the sft_3_softwareProductName
	 */
	
	@JsonProperty("sft_3_softwareProductName")
	public String getSft_3_softwareProductName() {
		return this.sft.getSft3_SoftwareProductName().getValue();
	}
	/**
	 * @param sft_3_softwareProductName the sft_3_softwareProductName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("sft_3_softwareProductName")
	public void setSft_3_softwareProductName(String sft_3_softwareProductName) throws DataTypeException {
		this.sft.getSft3_SoftwareProductName().setValue(sft_3_softwareProductName);
		this.sft_3_softwareProductName = sft_3_softwareProductName;
	}
	/**
	 * @return the sft_4_softwareBinaryID
	 */
	
	@JsonProperty("sft_4_softwareBinaryID")
	public String getSft_4_softwareBinaryID() {
		return this.sft.getSft4_SoftwareBinaryID().getValue();
	}
	/**
	 * @param sft_4_softwareBinaryID the sft_4_softwareBinaryID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("sft_4_softwareBinaryID")
	public void setSft_4_softwareBinaryID(String sft_4_softwareBinaryID) throws DataTypeException {
		this.sft.getSft4_SoftwareBinaryID().setValue(sft_4_softwareBinaryID);
		this.sft_4_softwareBinaryID = sft_4_softwareBinaryID;
	}
	/**
	 * @return the sft_5_softwareProductInformation
	 */
	
	@JsonProperty("sft_5_softwareProductInformation")
	public String getSft_5_softwareProductInformation() {
		return this.sft.getSft5_SoftwareProductInformation().getValue();
	}
	/**
	 * @param sft_5_softwareProductInformation the sft_5_softwareProductInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("sft_5_softwareProductInformation")
	public void setSft_5_softwareProductInformation(String sft_5_softwareProductInformation) throws DataTypeException {
		this.sft.getSft5_SoftwareProductInformation().setValue(sft_5_softwareProductInformation);
		this.sft_5_softwareProductInformation = sft_5_softwareProductInformation;
	}
	/**
	 * @return the sft_6_softwareInstallDate
	 */
	
	@JsonProperty("sft_6_softwareInstallDate")
	public TS_v2 getSft_6_softwareInstallDate() {
		return new TS_v2(
				this.sft.getSft6_SoftwareInstallDate().getTs1_Time().getValue(),
				this.sft.getSft6_SoftwareInstallDate().getTs2_DegreeOfPrecision().getValue());
				
	}
	/**
	 * @param sft_6_softwareInstallDate the sft_6_softwareInstallDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("sft_6_softwareInstallDate")
	public void setSft_6_softwareInstallDate(TS_v2 sft_6_softwareInstallDate) throws DataTypeException {
		this.sft.getSft6_SoftwareInstallDate().getTs1_Time().setValue(sft_6_softwareInstallDate.getTs_1_time());
		this.sft.getSft6_SoftwareInstallDate().getTs2_DegreeOfPrecision().setValue(sft_6_softwareInstallDate.getTs_2_degreeOfPrecision());
		this.sft_6_softwareInstallDate = sft_6_softwareInstallDate;
	}
	@Override
	public String toString() {
		return "CustomSFT_v25 [sft_1_softwareVendorOrganization=" + sft_1_softwareVendorOrganization
				+ ", sft_2_softwareCertifiedVersionorReleaseNumber=" + sft_2_softwareCertifiedVersionorReleaseNumber
				+ ", sft_3_softwareProductName=" + sft_3_softwareProductName + ", sft_4_softwareBinaryID="
				+ sft_4_softwareBinaryID + ", sft_5_softwareProductInformation=" + sft_5_softwareProductInformation
				+ ", sft_6_softwareInstallDate=" + sft_6_softwareInstallDate + "]";
	}
	
}
