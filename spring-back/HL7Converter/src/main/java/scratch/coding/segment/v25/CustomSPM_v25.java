package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.SPM;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CQ_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.EIP_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomSPM_v25 {
	@JsonProperty("spm_1_setID")
	private String spm_1_setID;
	@JsonProperty("spm_2_specimenID")
	private EIP_v25 spm_2_specimenID;
	@JsonProperty("spm_3_specimenParentIDs")
	private EIP_v25[] spm_3_specimenParentIDs;
	@JsonProperty("spm_4_specimenType")
	private CWE_v25 spm_4_specimenType;
	@JsonProperty("spm_5_specimenTypeModifier")
	private CWE_v25[] spm_5_specimenTypeModifier;
	@JsonProperty("spm_6_specimenAdditives")
	private CWE_v25[] spm_6_specimenAdditives;
	@JsonProperty("spm_7_specimenCollectionMethod")
	private CWE_v25 spm_7_specimenCollectionMethod;
	@JsonProperty("spm_8_specimenSourceSite")
	private CWE_v25 spm_8_specimenSourceSite;
	@JsonProperty("spm_9_specimenSourceSiteModifier")
	private CWE_v25[] spm_9_specimenSourceSiteModifier;
	@JsonProperty("spm_10_specimenCollectionSite")
	private CWE_v25 spm_10_specimenCollectionSite;
	@JsonProperty("spm_11_specimenRole")
	private CWE_v25[] spm_11_specimenRole;
	@JsonProperty("spm_12_specimenCollectionAmount")
	private CQ_v25 spm_12_specimenCollectionAmount;
	@JsonProperty("spm_13_groupedSpecimenCount")
	private String spm_13_groupedSpecimenCount;
	@JsonProperty("spm_14_specimenDescription")
	private String[] spm_14_specimenDescription;
	@JsonProperty("spm_15_specimenHandlingCode")
	private CWE_v25[] spm_15_specimenHandlingCode;
	@JsonProperty("spm_16_specimenRiskCode")
	private CWE_v25[] spm_16_specimenRiskCode;
	@JsonProperty("spm_17_specimenCollectionDateTime")
	private DR_v2 spm_17_specimenCollectionDateTime;
	@JsonProperty("spm_18_specimenReceivedDateTime")
	private TS_v2 spm_18_specimenReceivedDateTime;
	@JsonProperty("spm_19_specimenExpirationDateTime")
	private TS_v2 spm_19_specimenExpirationDateTime;
	@JsonProperty("spm_20_specimenAvailability")
	private String spm_20_specimenAvailability;
	@JsonProperty("spm_21_specimenRejectReason")
	private CWE_v25[] spm_21_specimenRejectReason;
	@JsonProperty("spm_22_specimenQuality")
	private CWE_v25 spm_22_specimenQuality;
	@JsonProperty("spm_23_specimenAppropriateness")
	private CWE_v25 spm_23_specimenAppropriateness;
	@JsonProperty("spm_24_specimenCondition")
	private CWE_v25[] spm_24_specimenCondition;
	@JsonProperty("spm_25_specimenCurrentQuantity")
	private CQ_v25 spm_25_specimenCurrentQuantity;
	@JsonProperty("spm_26_numberofSpecimenContainers")
	private String spm_26_numberofSpecimenContainers;
	@JsonProperty("spm_27_containerType")
	private CWE_v25 spm_27_containerType;
	@JsonProperty("spm_28_containerCondition")
	private CWE_v25 spm_28_containerCondition;
	@JsonProperty("spm_29_specimenChildRole")
	private CWE_v25 spm_29_specimenChildRole;
	
	private SPM spm;
	
	private CustomSPM_v25(SPM spm, CustomNTE_v25[] nte) {
		super();
		this.spm =spm;
//		setNte(nte);
	}
	private CustomSPM_v25(SPM spm) {
		super();
		this.spm = spm;
	}
	
	public CustomSPM_v25() {
		super();
	}
	public static CustomSPM_v25 createPD1WithPD1(SPM spm) throws HL7Exception, IOException {
		return new CustomSPM_v25(spm);
	}

	public static CustomSPM_v25 createPD1WithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		SPM spm = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getSPECIMEN().getSPM();
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
		return new CustomSPM_v25(spm);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the spm_1_setID
	 */
	
	@JsonProperty("spm_1_setID")
	public String getSpm_1_setID() {
		return this.spm.getSpm1_SetIDSPM().getValue();
	}
	/**
	 * @param spm_1_setID the spm_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_1_setID")
	public void setSpm_1_setID(String spm_1_setID) throws DataTypeException {
		this.spm.getSpm1_SetIDSPM().setValue(spm_1_setID);
		this.spm_1_setID = spm_1_setID;
	}
	/**
	 * @return the spm_2_specimenID
	 */
	
	@JsonProperty("spm_2_specimenID")
	public EIP_v25 getSpm_2_specimenID() {
		return new EIP_v25(
				new EI_v2(
						this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
						this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().getValue(),
						this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().getValue(),
						this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().getValue()),
				new EI_v2(
						this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
						this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().getValue(),
						this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi3_UniversalID().getValue(),
						this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().getValue()));
	}
	/**
	 * @param spm_2_specimenID the spm_2_specimenID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_2_specimenID")
	public void setSpm_2_specimenID(EIP_v25 spm_2_specimenID) throws DataTypeException {
		this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().setValue(spm_2_specimenID.getEip_1_placerAssignedIdentifier().getEi_1_entityIdentifier());
		this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().setValue(spm_2_specimenID.getEip_1_placerAssignedIdentifier().getEi_2_namespaceId());
		this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().setValue(spm_2_specimenID.getEip_1_placerAssignedIdentifier().getEi_3_universalId());
		this.spm.getSpm2_SpecimenID().getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().setValue(spm_2_specimenID.getEip_1_placerAssignedIdentifier().getEi_4_universalIdType());
		this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().setValue(spm_2_specimenID.getEip_2_fillerAssignedIdentifier().getEi_1_entityIdentifier());
		this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().setValue(spm_2_specimenID.getEip_2_fillerAssignedIdentifier().getEi_2_namespaceId());
		this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi3_UniversalID().setValue(spm_2_specimenID.getEip_2_fillerAssignedIdentifier().getEi_3_universalId());
		this.spm.getSpm2_SpecimenID().getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().setValue(spm_2_specimenID.getEip_2_fillerAssignedIdentifier().getEi_4_universalIdType());
		this.spm_2_specimenID = spm_2_specimenID;
	}
	/**
	 * @return the spm_3_specimenParentIDs
	 */
	
	@JsonProperty("spm_3_specimenParentIDs")
	public EIP_v25[] getSpm_3_specimenParentIDs() {
		EIP_v25[] specimenParentIDs = new EIP_v25[this.spm.getSpm3_SpecimenParentIDs().length];
		for(int i = 0; i<this.spm.getSpm3_SpecimenParentIDs().length;i++) {
			specimenParentIDs[i] = new EIP_v25(
					new EI_v2(
							this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
							this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().getValue(),
							this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().getValue(),
							this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().getValue()),
					new EI_v2(
							this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
							this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().getValue(),
							this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi3_UniversalID().getValue(),
							this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().getValue()));
		}
		return specimenParentIDs;
	}
	/**
	 * @param spm_3_specimenParentIDs the spm_3_specimenParentIDs to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_3_specimenParentIDs")
	public void setSpm_3_specimenParentIDs(EIP_v25[] spm_3_specimenParentIDs) throws DataTypeException {
		for(int i = 0; i<spm_3_specimenParentIDs.length;i++) {
			this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().setValue(spm_3_specimenParentIDs[i].getEip_1_placerAssignedIdentifier().getEi_1_entityIdentifier());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().setValue(spm_3_specimenParentIDs[i].getEip_1_placerAssignedIdentifier().getEi_2_namespaceId());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().setValue(spm_3_specimenParentIDs[i].getEip_1_placerAssignedIdentifier().getEi_3_universalId());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().setValue(spm_3_specimenParentIDs[i].getEip_1_placerAssignedIdentifier().getEi_4_universalIdType());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().setValue(spm_3_specimenParentIDs[i].getEip_2_fillerAssignedIdentifier().getEi_1_entityIdentifier());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().setValue(spm_3_specimenParentIDs[i].getEip_2_fillerAssignedIdentifier().getEi_2_namespaceId());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi3_UniversalID().setValue(spm_3_specimenParentIDs[i].getEip_2_fillerAssignedIdentifier().getEi_3_universalId());
			this.spm.getSpm3_SpecimenParentIDs(i).getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().setValue(spm_3_specimenParentIDs[i].getEip_2_fillerAssignedIdentifier().getEi_4_universalIdType());
		}
		this.spm_3_specimenParentIDs = spm_3_specimenParentIDs;
	}
	/**
	 * @return the spm_4_specimenType
	 */
	
	@JsonProperty("spm_4_specimenType")
	public CWE_v25 getSpm_4_specimenType() {
		return new CWE_v25(
				this.spm.getSpm4_SpecimenType().getCwe1_Identifier().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe2_Text().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe5_AlternateText().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm4_SpecimenType().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_4_specimenType the spm_4_specimenType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_4_specimenType")
	public void setSpm_4_specimenType(CWE_v25 spm_4_specimenType) throws DataTypeException {
		this.spm.getSpm4_SpecimenType().getCwe1_Identifier().setValue(spm_4_specimenType.getCwe_1_identifier());
		this.spm.getSpm4_SpecimenType().getCwe2_Text().setValue(spm_4_specimenType.getCwe_2_text());
		this.spm.getSpm4_SpecimenType().getCwe3_NameOfCodingSystem().setValue(spm_4_specimenType.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm4_SpecimenType().getCwe4_AlternateIdentifier().setValue(spm_4_specimenType.getCwe_4_alternateIdentifier());
		this.spm.getSpm4_SpecimenType().getCwe5_AlternateText().setValue(spm_4_specimenType.getCwe_5_alternateText());
		this.spm.getSpm4_SpecimenType().getCwe6_NameOfAlternateCodingSystem().setValue(spm_4_specimenType.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm4_SpecimenType().getCwe7_CodingSystemVersionID().setValue(spm_4_specimenType.getCwe_7_codingSystemVersionId());
		this.spm.getSpm4_SpecimenType().getCwe8_AlternateCodingSystemVersionID().setValue(spm_4_specimenType.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm4_SpecimenType().getCwe9_OriginalText().setValue(spm_4_specimenType.getCwe_9_originalText());
		this.spm_4_specimenType = spm_4_specimenType;
	}
	/**
	 * @return the spm_5_specimenTypeModifier
	 */
	
	@JsonProperty("spm_5_specimenTypeModifier")
	public CWE_v25[] getSpm_5_specimenTypeModifier() {
		CWE_v25[] specimenTypeModifier = new CWE_v25[this.spm.getSpm5_SpecimenTypeModifier().length];
		for(int i = 0; i<this.spm.getSpm5_SpecimenTypeModifier().length;i++) {
			specimenTypeModifier[i] = new CWE_v25(
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe2_Text().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm5_SpecimenTypeModifier(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenTypeModifier;
	}
	/**
	 * @param spm_5_specimenTypeModifier the spm_5_specimenTypeModifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_5_specimenTypeModifier")
	public void setSpm_5_specimenTypeModifier(CWE_v25[] spm_5_specimenTypeModifier) throws DataTypeException {
		for(int i = 0; i<this.spm.getSpm5_SpecimenTypeModifier().length;i++) {
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe1_Identifier().setValue(spm_5_specimenTypeModifier[i].getCwe_1_identifier());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe2_Text().setValue(spm_5_specimenTypeModifier[i].getCwe_2_text());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe3_NameOfCodingSystem().setValue(spm_5_specimenTypeModifier[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe4_AlternateIdentifier().setValue(spm_5_specimenTypeModifier[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe5_AlternateText().setValue(spm_5_specimenTypeModifier[i].getCwe_5_alternateText());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_5_specimenTypeModifier[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe7_CodingSystemVersionID().setValue(spm_5_specimenTypeModifier[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_5_specimenTypeModifier[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm5_SpecimenTypeModifier(i).getCwe9_OriginalText().setValue(spm_5_specimenTypeModifier[i].getCwe_9_originalText());
		}
		this.spm_5_specimenTypeModifier = spm_5_specimenTypeModifier;
	}
	/**
	 * @return the spm_6_specimenAdditives
	 */
	
	@JsonProperty("spm_6_specimenAdditives")
	public CWE_v25[] getSpm_6_specimenAdditives() {
		CWE_v25[] specimenTypeModifier = new CWE_v25[this.spm.getSpm6_SpecimenAdditives().length];
		for(int i = 0; i<this.spm.getSpm6_SpecimenAdditives().length;i++) {
			specimenTypeModifier[i] = new CWE_v25(
					this.spm.getSpm6_SpecimenAdditives(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe2_Text().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm6_SpecimenAdditives(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenTypeModifier;
	}
	/**
	 * @param spm_6_specimenAdditives the spm_6_specimenAdditives to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_6_specimenAdditives")
	public void setSpm_6_specimenAdditives(CWE_v25[] spm_6_specimenAdditives) throws DataTypeException {
		for(int i = 0; i<this.spm.getSpm5_SpecimenTypeModifier().length;i++) {
			this.spm.getSpm6_SpecimenAdditives(i).getCwe1_Identifier().setValue(spm_6_specimenAdditives[i].getCwe_1_identifier());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe2_Text().setValue(spm_6_specimenAdditives[i].getCwe_2_text());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe3_NameOfCodingSystem().setValue(spm_6_specimenAdditives[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe4_AlternateIdentifier().setValue(spm_6_specimenAdditives[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe5_AlternateText().setValue(spm_6_specimenAdditives[i].getCwe_5_alternateText());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_6_specimenAdditives[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe7_CodingSystemVersionID().setValue(spm_6_specimenAdditives[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_6_specimenAdditives[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm6_SpecimenAdditives(i).getCwe9_OriginalText().setValue(spm_6_specimenAdditives[i].getCwe_9_originalText());
		}
		this.spm_6_specimenAdditives = spm_6_specimenAdditives;
	}
	/**
	 * @return the spm_7_specimenCollectionMethod
	 */
	
	@JsonProperty("spm_7_specimenCollectionMethod")
	public CWE_v25 getSpm_7_specimenCollectionMethod() {
		return new CWE_v25(
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe1_Identifier().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe2_Text().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe5_AlternateText().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm7_SpecimenCollectionMethod().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_7_specimenCollectionMethod the spm_7_specimenCollectionMethod to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_7_specimenCollectionMethod")
	public void setSpm_7_specimenCollectionMethod(CWE_v25 spm_7_specimenCollectionMethod) throws DataTypeException {
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe1_Identifier().setValue(spm_7_specimenCollectionMethod.getCwe_1_identifier());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe2_Text().setValue(spm_7_specimenCollectionMethod.getCwe_2_text());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe3_NameOfCodingSystem().setValue(spm_7_specimenCollectionMethod.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe4_AlternateIdentifier().setValue(spm_7_specimenCollectionMethod.getCwe_4_alternateIdentifier());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe5_AlternateText().setValue(spm_7_specimenCollectionMethod.getCwe_5_alternateText());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe6_NameOfAlternateCodingSystem().setValue(spm_7_specimenCollectionMethod.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe7_CodingSystemVersionID().setValue(spm_7_specimenCollectionMethod.getCwe_7_codingSystemVersionId());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe8_AlternateCodingSystemVersionID().setValue(spm_7_specimenCollectionMethod.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm7_SpecimenCollectionMethod().getCwe9_OriginalText().setValue(spm_7_specimenCollectionMethod.getCwe_9_originalText());
		this.spm_7_specimenCollectionMethod = spm_7_specimenCollectionMethod;
	}
	/**
	 * @return the spm_8_specimenSourceSite
	 */
	
	@JsonProperty("spm_8_specimenSourceSite")
	public CWE_v25 getSpm_8_specimenSourceSite() {
		return new CWE_v25(
				this.spm.getSpm8_SpecimenSourceSite().getCwe1_Identifier().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe2_Text().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe5_AlternateText().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm8_SpecimenSourceSite().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_8_specimenSourceSite the spm_8_specimenSourceSite to set
	 * @JsonProperty("spm_8_specimenSourceSite")
	 * @throws DataTypeException 
	 */
	public void setSpm_8_specimenSourceSite(CWE_v25 spm_8_specimenSourceSite) throws DataTypeException {
		this.spm.getSpm8_SpecimenSourceSite().getCwe1_Identifier().setValue(spm_8_specimenSourceSite.getCwe_1_identifier());
		this.spm.getSpm8_SpecimenSourceSite().getCwe2_Text().setValue(spm_8_specimenSourceSite.getCwe_2_text());
		this.spm.getSpm8_SpecimenSourceSite().getCwe3_NameOfCodingSystem().setValue(spm_8_specimenSourceSite.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm8_SpecimenSourceSite().getCwe4_AlternateIdentifier().setValue(spm_8_specimenSourceSite.getCwe_4_alternateIdentifier());
		this.spm.getSpm8_SpecimenSourceSite().getCwe5_AlternateText().setValue(spm_8_specimenSourceSite.getCwe_5_alternateText());
		this.spm.getSpm8_SpecimenSourceSite().getCwe6_NameOfAlternateCodingSystem().setValue(spm_8_specimenSourceSite.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm8_SpecimenSourceSite().getCwe7_CodingSystemVersionID().setValue(spm_8_specimenSourceSite.getCwe_7_codingSystemVersionId());
		this.spm.getSpm8_SpecimenSourceSite().getCwe8_AlternateCodingSystemVersionID().setValue(spm_8_specimenSourceSite.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm8_SpecimenSourceSite().getCwe9_OriginalText().setValue(spm_8_specimenSourceSite.getCwe_9_originalText());
		this.spm_8_specimenSourceSite = spm_8_specimenSourceSite;
	}
	/**
	 * @return the spm_9_specimenSourceSiteModifier
	 */
	
	@JsonProperty("spm_9_specimenSourceSiteModifier")
	public CWE_v25[] getSpm_9_specimenSourceSiteModifier() {
		CWE_v25[] specimenSourceSiteModifier = new CWE_v25[this.spm.getSpm9_SpecimenSourceSiteModifier().length];
		for(int i = 0; i<this.spm.getSpm9_SpecimenSourceSiteModifier().length;i++) {
			specimenSourceSiteModifier[i] = new CWE_v25(
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe2_Text().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenSourceSiteModifier;
	}
	/**
	 * @param spm_9_specimenSourceSiteModifier the spm_9_specimenSourceSiteModifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_9_specimenSourceSiteModifier")
	public void setSpm_9_specimenSourceSiteModifier(CWE_v25[] spm_9_specimenSourceSiteModifier) throws DataTypeException {
		for(int i = 0; i<spm_9_specimenSourceSiteModifier.length;i++) {
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe1_Identifier().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_1_identifier());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe2_Text().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_2_text());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe3_NameOfCodingSystem().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe4_AlternateIdentifier().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe5_AlternateText().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_5_alternateText());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe7_CodingSystemVersionID().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm9_SpecimenSourceSiteModifier(i).getCwe9_OriginalText().setValue(spm_9_specimenSourceSiteModifier[i].getCwe_9_originalText());
		}
		this.spm_9_specimenSourceSiteModifier = spm_9_specimenSourceSiteModifier;
	}
	/**
	 * @return the spm_10_specimenCollectionSite
	 */
	
	@JsonProperty("spm_10_specimenCollectionSite")
	public CWE_v25 getSpm_10_specimenCollectionSite() {
		return new CWE_v25(
				this.spm.getSpm10_SpecimenCollectionSite().getCwe1_Identifier().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe2_Text().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe5_AlternateText().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm10_SpecimenCollectionSite().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_10_specimenCollectionSite the spm_10_specimenCollectionSite to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_10_specimenCollectionSite")
	public void setSpm_10_specimenCollectionSite(CWE_v25 spm_10_specimenCollectionSite) throws DataTypeException {
		this.spm.getSpm10_SpecimenCollectionSite().getCwe1_Identifier().setValue(spm_10_specimenCollectionSite.getCwe_1_identifier());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe2_Text().setValue(spm_10_specimenCollectionSite.getCwe_2_text());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe3_NameOfCodingSystem().setValue(spm_10_specimenCollectionSite.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe4_AlternateIdentifier().setValue(spm_10_specimenCollectionSite.getCwe_4_alternateIdentifier());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe5_AlternateText().setValue(spm_10_specimenCollectionSite.getCwe_5_alternateText());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe6_NameOfAlternateCodingSystem().setValue(spm_10_specimenCollectionSite.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe7_CodingSystemVersionID().setValue(spm_10_specimenCollectionSite.getCwe_7_codingSystemVersionId());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe8_AlternateCodingSystemVersionID().setValue(spm_10_specimenCollectionSite.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm10_SpecimenCollectionSite().getCwe9_OriginalText().setValue(spm_10_specimenCollectionSite.getCwe_9_originalText());
		this.spm_10_specimenCollectionSite = spm_10_specimenCollectionSite;
	}
	/**
	 * @return the spm_11_specimenRole
	 */
	
	@JsonProperty("spm_11_specimenRole")
	public CWE_v25[] getSpm_11_specimenRole() {
		CWE_v25[] specimenRole = new CWE_v25[this.spm.getSpm11_SpecimenRole().length];
		for(int i = 0; i<this.spm.getSpm11_SpecimenRole().length;i++) {
			specimenRole[i] = new CWE_v25(
					this.spm.getSpm11_SpecimenRole(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe2_Text().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm11_SpecimenRole(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenRole;
	}
	/**
	 * @param spm_11_specimenRole the spm_11_specimenRole to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_11_specimenRole")
	public void setSpm_11_specimenRole(CWE_v25[] spm_11_specimenRole) throws DataTypeException {
		for(int i = 0; i<spm_11_specimenRole.length;i++) {
			this.spm.getSpm11_SpecimenRole(i).getCwe1_Identifier().setValue(spm_11_specimenRole[i].getCwe_1_identifier());
			this.spm.getSpm11_SpecimenRole(i).getCwe2_Text().setValue(spm_11_specimenRole[i].getCwe_2_text());
			this.spm.getSpm11_SpecimenRole(i).getCwe3_NameOfCodingSystem().setValue(spm_11_specimenRole[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm11_SpecimenRole(i).getCwe4_AlternateIdentifier().setValue(spm_11_specimenRole[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm11_SpecimenRole(i).getCwe5_AlternateText().setValue(spm_11_specimenRole[i].getCwe_5_alternateText());
			this.spm.getSpm11_SpecimenRole(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_11_specimenRole[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm11_SpecimenRole(i).getCwe7_CodingSystemVersionID().setValue(spm_11_specimenRole[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm11_SpecimenRole(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_11_specimenRole[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm11_SpecimenRole(i).getCwe9_OriginalText().setValue(spm_11_specimenRole[i].getCwe_9_originalText());
		}
		this.spm_11_specimenRole = spm_11_specimenRole;
	}
	/**
	 * @return the spm_12_specimenCollectionAmount
	 */
	
	@JsonProperty("spm_12_specimenCollectionAmount")
	public CQ_v25 getSpm_12_specimenCollectionAmount() {
		return new CQ_v25(
				this.spm.getSpm12_SpecimenCollectionAmount().getCq1_Quantity().getValue(), 
				new CE_v2(
						this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe1_Identifier().getValue(),
						this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe2_Text().getValue(),
						this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe3_NameOfCodingSystem().getValue(),
						this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe4_AlternateIdentifier().getValue(),
						this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe5_AlternateText().getValue(),
						this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe6_NameOfAlternateCodingSystem().getValue()));
	}
	/**
	 * @param spm_12_specimenCollectionAmount the spm_12_specimenCollectionAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_12_specimenCollectionAmount")
	public void setSpm_12_specimenCollectionAmount(CQ_v25 spm_12_specimenCollectionAmount) throws DataTypeException {
		this.spm.getSpm12_SpecimenCollectionAmount().getCq1_Quantity().setValue(spm_12_specimenCollectionAmount.getCq_1_quantity());
		this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe1_Identifier().setValue(spm_12_specimenCollectionAmount.getCq_2_units().getCe_1_identifier());
		this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe2_Text().setValue(spm_12_specimenCollectionAmount.getCq_2_units().getCe_2_text());
		this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe3_NameOfCodingSystem().setValue(spm_12_specimenCollectionAmount.getCq_2_units().getCe_3_nameOfCodingSystem());
		this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe4_AlternateIdentifier().setValue(spm_12_specimenCollectionAmount.getCq_2_units().getCe_4_alternateIdentifier());
		this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe5_AlternateText().setValue(spm_12_specimenCollectionAmount.getCq_2_units().getCe_5_alternateText());
		this.spm.getSpm12_SpecimenCollectionAmount().getCq2_Units().getCe6_NameOfAlternateCodingSystem().setValue(spm_12_specimenCollectionAmount.getCq_2_units().getCe_6_nameOfAlternateCodingSystem());
		this.spm_12_specimenCollectionAmount = spm_12_specimenCollectionAmount;
	}
	/**
	 * @return the spm_13_groupedSpecimenCount
	 */
	
	@JsonProperty("spm_13_groupedSpecimenCount")
	public String getSpm_13_groupedSpecimenCount() {
		return this.spm.getSpm13_GroupedSpecimenCount().getValue();
	}
	/**
	 * @param spm_13_groupedSpecimenCount the spm_13_groupedSpecimenCount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_13_groupedSpecimenCount")
	public void setSpm_13_groupedSpecimenCount(String spm_13_groupedSpecimenCount) throws DataTypeException {
		this.spm.getSpm13_GroupedSpecimenCount().setValue(spm_13_groupedSpecimenCount);
		this.spm_13_groupedSpecimenCount = spm_13_groupedSpecimenCount;
	}
	/**
	 * @return the spm_14_specimenDescription
	 */
	
	@JsonProperty("spm_14_specimenDescription")
	public String[] getSpm_14_specimenDescription() {
		String[] specimenDescription = new String[this.spm.getSpm14_SpecimenDescription().length];
		for(int i = 0; i< this.spm.getSpm14_SpecimenDescription().length; i++) {
			specimenDescription[i] = this.spm.getSpm14_SpecimenDescription(i).getValue();
		}
		return specimenDescription;
	}
	/**
	 * @param spm_14_specimenDescription the spm_14_specimenDescription to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_14_specimenDescription")
	public void setSpm_14_specimenDescription(String[] spm_14_specimenDescription) throws DataTypeException {
		for(int i = 0; i< spm_14_specimenDescription.length; i++) {
			this.spm.getSpm14_SpecimenDescription(i).setValue(spm_14_specimenDescription[i]);
		}
		this.spm_14_specimenDescription = spm_14_specimenDescription;
	}
	/**
	 * @return the spm_15_specimenHandlingCode
	 */
	@JsonProperty("spm_15_specimenHandlingCode")
	public CWE_v25[] getSpm_15_specimenHandlingCode() {
		CWE_v25[] specimenRole = new CWE_v25[this.spm.getSpm15_SpecimenHandlingCode().length];
		for(int i = 0; i<this.spm.getSpm15_SpecimenHandlingCode().length;i++) {
			specimenRole[i] = new CWE_v25(
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe2_Text().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm15_SpecimenHandlingCode(i).getCwe9_OriginalText().getValue()); 
		}
		return spm_15_specimenHandlingCode;
	}
	/**
	 * @param spm_15_specimenHandlingCode the spm_15_specimenHandlingCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_15_specimenHandlingCode")
	public void setSpm_15_specimenHandlingCode(CWE_v25[] spm_15_specimenHandlingCode) throws DataTypeException {
		for(int i = 0; i<spm_11_specimenRole.length;i++) {
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe1_Identifier().setValue(spm_11_specimenRole[i].getCwe_1_identifier());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe2_Text().setValue(spm_11_specimenRole[i].getCwe_2_text());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe3_NameOfCodingSystem().setValue(spm_11_specimenRole[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe4_AlternateIdentifier().setValue(spm_11_specimenRole[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe5_AlternateText().setValue(spm_11_specimenRole[i].getCwe_5_alternateText());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_11_specimenRole[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe7_CodingSystemVersionID().setValue(spm_11_specimenRole[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_11_specimenRole[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm15_SpecimenHandlingCode(i).getCwe9_OriginalText().setValue(spm_11_specimenRole[i].getCwe_9_originalText());
		}
		this.spm_15_specimenHandlingCode = spm_15_specimenHandlingCode;
	}
	/**
	 * @return the spm_16_specimenRiskCode
	 *	@JsonProperty("spm_16_specimenRiskCode")
	 */
	
	public CWE_v25[] getSpm_16_specimenRiskCode() {
		CWE_v25[] specimenRiskCode = new CWE_v25[this.spm.getSpm16_SpecimenRiskCode().length];
		for(int i = 0; i<this.spm.getSpm16_SpecimenRiskCode().length;i++) {
			specimenRiskCode[i] = new CWE_v25(
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe2_Text().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm16_SpecimenRiskCode(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenRiskCode;
	}
	/**
	 * @param spm_16_specimenRiskCode the spm_16_specimenRiskCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_16_specimenRiskCode")
	public void setSpm_16_specimenRiskCode(CWE_v25[] spm_16_specimenRiskCode) throws DataTypeException {
		for(int i = 0; i<spm_16_specimenRiskCode.length;i++) {
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe1_Identifier().setValue(spm_16_specimenRiskCode[i].getCwe_1_identifier());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe2_Text().setValue(spm_16_specimenRiskCode[i].getCwe_2_text());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe3_NameOfCodingSystem().setValue(spm_16_specimenRiskCode[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe4_AlternateIdentifier().setValue(spm_16_specimenRiskCode[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe5_AlternateText().setValue(spm_16_specimenRiskCode[i].getCwe_5_alternateText());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_16_specimenRiskCode[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe7_CodingSystemVersionID().setValue(spm_16_specimenRiskCode[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_16_specimenRiskCode[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm16_SpecimenRiskCode(i).getCwe9_OriginalText().setValue(spm_16_specimenRiskCode[i].getCwe_9_originalText());
		}
		this.spm_16_specimenRiskCode = spm_16_specimenRiskCode;
	}
	/**
	 * @return the spm_17_specimenCollectionDateTime
	 */
	
	@JsonProperty("spm_17_specimenCollectionDateTime")
	public DR_v2 getSpm_17_specimenCollectionDateTime() {
		return new DR_v2(
				new TS_v2(
						this.spm.getSpm17_SpecimenCollectionDateTime().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
						this.spm.getSpm17_SpecimenCollectionDateTime().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
				new TS_v2(
						this.spm.getSpm17_SpecimenCollectionDateTime().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
						this.spm.getSpm17_SpecimenCollectionDateTime().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()));
	}
	/**
	 * @param spm_17_specimenCollectionDateTime the spm_17_specimenCollectionDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_17_specimenCollectionDateTime")
	public void setSpm_17_specimenCollectionDateTime(DR_v2 spm_17_specimenCollectionDateTime) throws DataTypeException {
		this.spm.getSpm17_SpecimenCollectionDateTime().getDr1_RangeStartDateTime().getTs1_Time().setValue(spm_17_specimenCollectionDateTime.getTs_dr_1_rangeStartDateTime().getTs_1_time());
		this.spm.getSpm17_SpecimenCollectionDateTime().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(spm_17_specimenCollectionDateTime.getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
		this.spm.getSpm17_SpecimenCollectionDateTime().getDr2_RangeEndDateTime().getTs1_Time().setValue(spm_17_specimenCollectionDateTime.getTs_dr_2_rangeEndDateTime().getTs_1_time());
		this.spm.getSpm17_SpecimenCollectionDateTime().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(spm_17_specimenCollectionDateTime.getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
		this.spm_17_specimenCollectionDateTime = spm_17_specimenCollectionDateTime;
	}
	/**
	 * @return the spm_18_specimenReceivedDateTime
	 */
	
	@JsonProperty("spm_18_specimenReceivedDateTime")
	public TS_v2 getSpm_18_specimenReceivedDateTime() {
		return new TS_v2(
				this.spm.getSpm18_SpecimenReceivedDateTime().getTs1_Time().getValue(),
				this.spm.getSpm18_SpecimenReceivedDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param spm_18_specimenReceivedDateTime the spm_18_specimenReceivedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_18_specimenReceivedDateTime")
	public void setSpm_18_specimenReceivedDateTime(TS_v2 spm_18_specimenReceivedDateTime) throws DataTypeException {
		this.spm.getSpm18_SpecimenReceivedDateTime().getTs1_Time().setValue(spm_18_specimenReceivedDateTime.getTs_1_time());
		this.spm.getSpm18_SpecimenReceivedDateTime().getTs2_DegreeOfPrecision().setValue(spm_18_specimenReceivedDateTime.getTs_2_degreeOfPrecision());
		this.spm_18_specimenReceivedDateTime = spm_18_specimenReceivedDateTime;
	}
	/**
	 * @return the spm_19_specimenExpirationDateTime
	 */
	
	@JsonProperty("spm_19_specimenExpirationDateTime")
	public TS_v2 getSpm_19_specimenExpirationDateTime() {
		return new TS_v2(
				this.spm.getSpm19_SpecimenExpirationDateTime().getTs1_Time().getValue(),
				this.spm.getSpm19_SpecimenExpirationDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param spm_19_specimenExpirationDateTime the spm_19_specimenExpirationDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_19_specimenExpirationDateTime")
	public void setSpm_19_specimenExpirationDateTime(TS_v2 spm_19_specimenExpirationDateTime) throws DataTypeException {
		this.spm.getSpm19_SpecimenExpirationDateTime().getTs1_Time().setValue(spm_19_specimenExpirationDateTime.getTs_1_time());
		this.spm.getSpm19_SpecimenExpirationDateTime().getTs2_DegreeOfPrecision().setValue(spm_19_specimenExpirationDateTime.getTs_2_degreeOfPrecision());
		this.spm_19_specimenExpirationDateTime = spm_19_specimenExpirationDateTime;
	}
	/**
	 * @return the spm_20_specimenAvailability
	 */
	@JsonProperty("spm_20_specimenAvailability")
	public String getSpm_20_specimenAvailability() {
		return this.spm.getSpm20_SpecimenAvailability().getValue();
	}
	/**
	 * @param spm_20_specimenAvailability the spm_20_specimenAvailability to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_20_specimenAvailability")
	public void setSpm_20_specimenAvailability(String spm_20_specimenAvailability) throws DataTypeException {
		this.spm.getSpm20_SpecimenAvailability().setValue(spm_20_specimenAvailability);
		this.spm_20_specimenAvailability = spm_20_specimenAvailability;
	}
	/**
	 * @return the spm_21_specimenRejectReason
	 */
	@JsonProperty("spm_21_specimenRejectReason")
	public CWE_v25[] getSpm_21_specimenRejectReason() {
		CWE_v25[] specimenRejectReason = new CWE_v25[this.spm.getSpm21_SpecimenRejectReason().length];
		for(int i = 0; i<this.spm.getSpm21_SpecimenRejectReason().length;i++) {
			specimenRejectReason[i] = new CWE_v25(
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe2_Text().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm21_SpecimenRejectReason(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenRejectReason;
	}
	/**
	 * @param spm_21_specimenRejectReason the spm_21_specimenRejectReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_21_specimenRejectReason")
	public void setSpm_21_specimenRejectReason(CWE_v25[] spm_21_specimenRejectReason) throws DataTypeException {
		for(int i = 0; i<spm_21_specimenRejectReason.length;i++) {
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe1_Identifier().setValue(spm_21_specimenRejectReason[i].getCwe_1_identifier());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe2_Text().setValue(spm_21_specimenRejectReason[i].getCwe_2_text());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe3_NameOfCodingSystem().setValue(spm_21_specimenRejectReason[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe4_AlternateIdentifier().setValue(spm_21_specimenRejectReason[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe5_AlternateText().setValue(spm_21_specimenRejectReason[i].getCwe_5_alternateText());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_21_specimenRejectReason[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe7_CodingSystemVersionID().setValue(spm_21_specimenRejectReason[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_21_specimenRejectReason[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm21_SpecimenRejectReason(i).getCwe9_OriginalText().setValue(spm_21_specimenRejectReason[i].getCwe_9_originalText());
		}
		this.spm_21_specimenRejectReason = spm_21_specimenRejectReason;
	}
	/**
	 * @return the spm_22_specimenQuality
	 */
	
	@JsonProperty("spm_22_specimenQuality")
	public CWE_v25 getSpm_22_specimenQuality() {
		return new CWE_v25(
				this.spm.getSpm22_SpecimenQuality().getCwe1_Identifier().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe2_Text().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe5_AlternateText().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm22_SpecimenQuality().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_22_specimenQuality the spm_22_specimenQuality to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_22_specimenQuality")
	public void setSpm_22_specimenQuality(CWE_v25 spm_22_specimenQuality) throws DataTypeException {
		this.spm.getSpm22_SpecimenQuality().getCwe1_Identifier().setValue(spm_22_specimenQuality.getCwe_1_identifier());
		this.spm.getSpm22_SpecimenQuality().getCwe2_Text().setValue(spm_22_specimenQuality.getCwe_2_text());
		this.spm.getSpm22_SpecimenQuality().getCwe3_NameOfCodingSystem().setValue(spm_22_specimenQuality.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm22_SpecimenQuality().getCwe4_AlternateIdentifier().setValue(spm_22_specimenQuality.getCwe_4_alternateIdentifier());
		this.spm.getSpm22_SpecimenQuality().getCwe5_AlternateText().setValue(spm_22_specimenQuality.getCwe_5_alternateText());
		this.spm.getSpm22_SpecimenQuality().getCwe6_NameOfAlternateCodingSystem().setValue(spm_22_specimenQuality.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm22_SpecimenQuality().getCwe7_CodingSystemVersionID().setValue(spm_22_specimenQuality.getCwe_7_codingSystemVersionId());
		this.spm.getSpm22_SpecimenQuality().getCwe8_AlternateCodingSystemVersionID().setValue(spm_22_specimenQuality.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm22_SpecimenQuality().getCwe9_OriginalText().setValue(spm_22_specimenQuality.getCwe_9_originalText());
		this.spm_22_specimenQuality = spm_22_specimenQuality;
	}
	/**
	 * @return the spm_23_specimenAppropriateness
	 */
	
	@JsonProperty("spm_23_specimenAppropriateness")
	public CWE_v25 getSpm_23_specimenAppropriateness() {
		return new CWE_v25(
				this.spm.getSpm23_SpecimenAppropriateness().getCwe1_Identifier().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe2_Text().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe5_AlternateText().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm23_SpecimenAppropriateness().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_23_specimenAppropriateness the spm_23_specimenAppropriateness to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_23_specimenAppropriateness")
	public void setSpm_23_specimenAppropriateness(CWE_v25 spm_23_specimenAppropriateness) throws DataTypeException {
		this.spm.getSpm23_SpecimenAppropriateness().getCwe1_Identifier().setValue(spm_23_specimenAppropriateness.getCwe_1_identifier());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe2_Text().setValue(spm_23_specimenAppropriateness.getCwe_2_text());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe3_NameOfCodingSystem().setValue(spm_23_specimenAppropriateness.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe4_AlternateIdentifier().setValue(spm_23_specimenAppropriateness.getCwe_4_alternateIdentifier());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe5_AlternateText().setValue(spm_23_specimenAppropriateness.getCwe_5_alternateText());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe6_NameOfAlternateCodingSystem().setValue(spm_23_specimenAppropriateness.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe7_CodingSystemVersionID().setValue(spm_23_specimenAppropriateness.getCwe_7_codingSystemVersionId());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe8_AlternateCodingSystemVersionID().setValue(spm_23_specimenAppropriateness.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm23_SpecimenAppropriateness().getCwe9_OriginalText().setValue(spm_23_specimenAppropriateness.getCwe_9_originalText());
		this.spm_23_specimenAppropriateness = spm_23_specimenAppropriateness;
	}
	/**
	 * @return the spm_24_specimenCondition
	 */
	
	@JsonProperty("spm_24_specimenCondition")
	public CWE_v25[] getSpm_24_specimenCondition() {
		CWE_v25[] specimenCondition = new CWE_v25[this.spm.getSpm24_SpecimenCondition().length];
		for(int i = 0; i<this.spm.getSpm24_SpecimenCondition().length;i++) {
			specimenCondition[i] = new CWE_v25(
					this.spm.getSpm24_SpecimenCondition(i).getCwe1_Identifier().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe2_Text().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe3_NameOfCodingSystem().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe4_AlternateIdentifier().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe5_AlternateText().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe6_NameOfAlternateCodingSystem().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe7_CodingSystemVersionID().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe8_AlternateCodingSystemVersionID().getValue(),
					this.spm.getSpm24_SpecimenCondition(i).getCwe9_OriginalText().getValue()); 
		}
		return specimenCondition;
	}
	/**
	 * @param spm_24_specimenCondition the spm_24_specimenCondition to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_24_specimenCondition")
	public void setSpm_24_specimenCondition(CWE_v25[] spm_24_specimenCondition) throws DataTypeException {
		for(int i = 0; i<spm_24_specimenCondition.length;i++) {
			this.spm.getSpm24_SpecimenCondition(i).getCwe1_Identifier().setValue(spm_24_specimenCondition[i].getCwe_1_identifier());
			this.spm.getSpm24_SpecimenCondition(i).getCwe2_Text().setValue(spm_24_specimenCondition[i].getCwe_2_text());
			this.spm.getSpm24_SpecimenCondition(i).getCwe3_NameOfCodingSystem().setValue(spm_24_specimenCondition[i].getCwe_3_nameOfCodingSystem());
			this.spm.getSpm24_SpecimenCondition(i).getCwe4_AlternateIdentifier().setValue(spm_24_specimenCondition[i].getCwe_4_alternateIdentifier());
			this.spm.getSpm24_SpecimenCondition(i).getCwe5_AlternateText().setValue(spm_24_specimenCondition[i].getCwe_5_alternateText());
			this.spm.getSpm24_SpecimenCondition(i).getCwe6_NameOfAlternateCodingSystem().setValue(spm_24_specimenCondition[i].getCwe_6_nameOfAlternateCodingSystem());
			this.spm.getSpm24_SpecimenCondition(i).getCwe7_CodingSystemVersionID().setValue(spm_24_specimenCondition[i].getCwe_7_codingSystemVersionId());
			this.spm.getSpm24_SpecimenCondition(i).getCwe8_AlternateCodingSystemVersionID().setValue(spm_24_specimenCondition[i].getCwe_8_alternateCodingSystemVersionId());
			this.spm.getSpm24_SpecimenCondition(i).getCwe9_OriginalText().setValue(spm_24_specimenCondition[i].getCwe_9_originalText());
		}
		this.spm_24_specimenCondition = spm_24_specimenCondition;
	}
	/**
	 * @return the spm_25_specimenCurrentQuantity
	 */
	
	@JsonProperty("spm_25_specimenCurrentQuantity")
	public CQ_v25 getSpm_25_specimenCurrentQuantity() {
		return new CQ_v25(
				this.spm.getSpm25_SpecimenCurrentQuantity().getCq1_Quantity().getValue(), 
				new CE_v2(
						this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe1_Identifier().getValue(),
						this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe2_Text().getValue(),
						this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe3_NameOfCodingSystem().getValue(),
						this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe4_AlternateIdentifier().getValue(),
						this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe5_AlternateText().getValue(),
						this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe6_NameOfAlternateCodingSystem().getValue()));
	}
	/**
	 * @param spm_25_specimenCurrentQuantity the spm_25_specimenCurrentQuantity to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_25_specimenCurrentQuantity")
	public void setSpm_25_specimenCurrentQuantity(CQ_v25 spm_25_specimenCurrentQuantity) throws DataTypeException {
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq1_Quantity().setValue(spm_25_specimenCurrentQuantity.getCq_1_quantity());
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe1_Identifier().setValue(spm_25_specimenCurrentQuantity.getCq_2_units().getCe_1_identifier());
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe2_Text().setValue(spm_25_specimenCurrentQuantity.getCq_2_units().getCe_2_text());
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe3_NameOfCodingSystem().setValue(spm_25_specimenCurrentQuantity.getCq_2_units().getCe_3_nameOfCodingSystem());
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe4_AlternateIdentifier().setValue(spm_25_specimenCurrentQuantity.getCq_2_units().getCe_4_alternateIdentifier());
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe5_AlternateText().setValue(spm_25_specimenCurrentQuantity.getCq_2_units().getCe_5_alternateText());
		this.spm.getSpm25_SpecimenCurrentQuantity().getCq2_Units().getCe6_NameOfAlternateCodingSystem().setValue(spm_25_specimenCurrentQuantity.getCq_2_units().getCe_6_nameOfAlternateCodingSystem());
		this.spm_25_specimenCurrentQuantity = spm_25_specimenCurrentQuantity;
	}
	/**
	 * @return the spm_26_numberofSpecimenContainers
	 */
	
	@JsonProperty("spm_26_numberofSpecimenContainers")
	public String getSpm_26_numberofSpecimenContainers() {
		return this.spm.getSpm26_NumberOfSpecimenContainers().getValue();
	}
	/**
	 * @param spm_26_numberofSpecimenContainers the spm_26_numberofSpecimenContainers to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_26_numberofSpecimenContainers")
	public void setSpm_26_numberofSpecimenContainers(String spm_26_numberofSpecimenContainers) throws DataTypeException {
		this.spm.getSpm26_NumberOfSpecimenContainers().setValue(spm_26_numberofSpecimenContainers);
		this.spm_26_numberofSpecimenContainers = spm_26_numberofSpecimenContainers;
	}
	/**
	 * @return the spm_27_containerType
	 */
	@JsonProperty("spm_27_containerType")
	public CWE_v25 getSpm_27_containerType() {
		return new CWE_v25(
				this.spm.getSpm27_ContainerType().getCwe1_Identifier().getValue(),
				this.spm.getSpm27_ContainerType().getCwe2_Text().getValue(),
				this.spm.getSpm27_ContainerType().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm27_ContainerType().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm27_ContainerType().getCwe5_AlternateText().getValue(),
				this.spm.getSpm27_ContainerType().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm27_ContainerType().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm27_ContainerType().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm27_ContainerType().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_27_containerType the spm_27_containerType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_27_containerType")
	public void setSpm_27_containerType(CWE_v25 spm_27_containerType) throws DataTypeException {
		this.spm.getSpm27_ContainerType().getCwe1_Identifier().setValue(spm_27_containerType.getCwe_1_identifier());
		this.spm.getSpm27_ContainerType().getCwe2_Text().setValue(spm_27_containerType.getCwe_2_text());
		this.spm.getSpm27_ContainerType().getCwe3_NameOfCodingSystem().setValue(spm_27_containerType.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm27_ContainerType().getCwe4_AlternateIdentifier().setValue(spm_27_containerType.getCwe_4_alternateIdentifier());
		this.spm.getSpm27_ContainerType().getCwe5_AlternateText().setValue(spm_27_containerType.getCwe_5_alternateText());
		this.spm.getSpm27_ContainerType().getCwe6_NameOfAlternateCodingSystem().setValue(spm_27_containerType.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm27_ContainerType().getCwe7_CodingSystemVersionID().setValue(spm_27_containerType.getCwe_7_codingSystemVersionId());
		this.spm.getSpm27_ContainerType().getCwe8_AlternateCodingSystemVersionID().setValue(spm_27_containerType.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm27_ContainerType().getCwe9_OriginalText().setValue(spm_27_containerType.getCwe_9_originalText());
		this.spm_27_containerType = spm_27_containerType;
	}
	/**
	 * @return the spm_28_containerCondition
	 */
	
	@JsonProperty("spm_28_containerCondition")
	public CWE_v25 getSpm_28_containerCondition() {
		return new CWE_v25(
				this.spm.getSpm28_ContainerCondition().getCwe1_Identifier().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe2_Text().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe5_AlternateText().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm28_ContainerCondition().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_28_containerCondition the spm_28_containerCondition to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_28_containerCondition")
	public void setSpm_28_containerCondition(CWE_v25 spm_28_containerCondition) throws DataTypeException {
		this.spm.getSpm28_ContainerCondition().getCwe1_Identifier().setValue(spm_28_containerCondition.getCwe_1_identifier());
		this.spm.getSpm28_ContainerCondition().getCwe2_Text().setValue(spm_28_containerCondition.getCwe_2_text());
		this.spm.getSpm28_ContainerCondition().getCwe3_NameOfCodingSystem().setValue(spm_28_containerCondition.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm28_ContainerCondition().getCwe4_AlternateIdentifier().setValue(spm_28_containerCondition.getCwe_4_alternateIdentifier());
		this.spm.getSpm28_ContainerCondition().getCwe5_AlternateText().setValue(spm_28_containerCondition.getCwe_5_alternateText());
		this.spm.getSpm28_ContainerCondition().getCwe6_NameOfAlternateCodingSystem().setValue(spm_28_containerCondition.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm28_ContainerCondition().getCwe7_CodingSystemVersionID().setValue(spm_28_containerCondition.getCwe_7_codingSystemVersionId());
		this.spm.getSpm28_ContainerCondition().getCwe8_AlternateCodingSystemVersionID().setValue(spm_28_containerCondition.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm28_ContainerCondition().getCwe9_OriginalText().setValue(spm_28_containerCondition.getCwe_9_originalText());
		this.spm_28_containerCondition = spm_28_containerCondition;
	}
	/**
	 * @return the spm_29_specimenChildRole
	 */
	
	@JsonProperty("spm_29_specimenChildRole")
	public CWE_v25 getSpm_29_specimenChildRole() {
		return new CWE_v25(
				this.spm.getSpm29_SpecimenChildRole().getCwe1_Identifier().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe2_Text().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe3_NameOfCodingSystem().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe4_AlternateIdentifier().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe5_AlternateText().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe7_CodingSystemVersionID().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.spm.getSpm29_SpecimenChildRole().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param spm_29_specimenChildRole the spm_29_specimenChildRole to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("spm_29_specimenChildRole")
	public void setSpm_29_specimenChildRole(CWE_v25 spm_29_specimenChildRole) throws DataTypeException {
		this.spm.getSpm29_SpecimenChildRole().getCwe1_Identifier().setValue(spm_29_specimenChildRole.getCwe_1_identifier());
		this.spm.getSpm29_SpecimenChildRole().getCwe2_Text().setValue(spm_29_specimenChildRole.getCwe_2_text());
		this.spm.getSpm29_SpecimenChildRole().getCwe3_NameOfCodingSystem().setValue(spm_29_specimenChildRole.getCwe_3_nameOfCodingSystem());
		this.spm.getSpm29_SpecimenChildRole().getCwe4_AlternateIdentifier().setValue(spm_29_specimenChildRole.getCwe_4_alternateIdentifier());
		this.spm.getSpm29_SpecimenChildRole().getCwe5_AlternateText().setValue(spm_29_specimenChildRole.getCwe_5_alternateText());
		this.spm.getSpm29_SpecimenChildRole().getCwe6_NameOfAlternateCodingSystem().setValue(spm_29_specimenChildRole.getCwe_6_nameOfAlternateCodingSystem());
		this.spm.getSpm29_SpecimenChildRole().getCwe7_CodingSystemVersionID().setValue(spm_29_specimenChildRole.getCwe_7_codingSystemVersionId());
		this.spm.getSpm29_SpecimenChildRole().getCwe8_AlternateCodingSystemVersionID().setValue(spm_29_specimenChildRole.getCwe_8_alternateCodingSystemVersionId());
		this.spm.getSpm29_SpecimenChildRole().getCwe9_OriginalText().setValue(spm_29_specimenChildRole.getCwe_9_originalText());
		this.spm_29_specimenChildRole = spm_29_specimenChildRole;
	}
	@Override
	public String toString() {
		return "CustomSPM_v25 [spm_1_setID=" + spm_1_setID + ", spm_2_specimenID=" + spm_2_specimenID
				+ ", spm_3_specimenParentIDs=" + Arrays.toString(spm_3_specimenParentIDs) + ", spm_4_specimenType="
				+ spm_4_specimenType + ", spm_5_specimenTypeModifier=" + Arrays.toString(spm_5_specimenTypeModifier)
				+ ", spm_6_specimenAdditives=" + Arrays.toString(spm_6_specimenAdditives)
				+ ", spm_7_specimenCollectionMethod=" + spm_7_specimenCollectionMethod + ", spm_8_specimenSourceSite="
				+ spm_8_specimenSourceSite + ", spm_9_specimenSourceSiteModifier="
				+ Arrays.toString(spm_9_specimenSourceSiteModifier) + ", spm_10_specimenCollectionSite="
				+ spm_10_specimenCollectionSite + ", spm_11_specimenRole=" + Arrays.toString(spm_11_specimenRole)
				+ ", spm_12_specimenCollectionAmount=" + spm_12_specimenCollectionAmount
				+ ", spm_13_groupedSpecimenCount=" + spm_13_groupedSpecimenCount + ", spm_14_specimenDescription="
				+ Arrays.toString(spm_14_specimenDescription) + ", spm_15_specimenHandlingCode="
				+ Arrays.toString(spm_15_specimenHandlingCode) + ", spm_16_specimenRiskCode="
				+ Arrays.toString(spm_16_specimenRiskCode) + ", spm_17_specimenCollectionDateTime="
				+ spm_17_specimenCollectionDateTime + ", spm_18_specimenReceivedDateTime="
				+ spm_18_specimenReceivedDateTime + ", spm_19_specimenExpirationDateTime="
				+ spm_19_specimenExpirationDateTime + ", spm_20_specimenAvailability=" + spm_20_specimenAvailability
				+ ", spm_21_specimenRejectReason=" + Arrays.toString(spm_21_specimenRejectReason)
				+ ", spm_22_specimenQuality=" + spm_22_specimenQuality + ", spm_23_specimenAppropriateness="
				+ spm_23_specimenAppropriateness + ", spm_24_specimenCondition="
				+ Arrays.toString(spm_24_specimenCondition) + ", spm_25_specimenCurrentQuantity="
				+ spm_25_specimenCurrentQuantity + ", spm_26_numberofSpecimenContainers="
				+ spm_26_numberofSpecimenContainers + ", spm_27_containerType=" + spm_27_containerType
				+ ", spm_28_containerCondition=" + spm_28_containerCondition + ", spm_29_specimenChildRole="
				+ spm_29_specimenChildRole + "]";
	}
	
}
