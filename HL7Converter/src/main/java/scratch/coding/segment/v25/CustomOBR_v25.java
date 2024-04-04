package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.NK1;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.MO_v2;
import scratch.coding.models.RI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CNN_v25;
import scratch.coding.models.v25.CQ_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.EIP_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.MOC_v25;
import scratch.coding.models.v25.NDL_v25;
import scratch.coding.models.v25.OSD_V25;
import scratch.coding.models.v25.PRL_v25;
import scratch.coding.models.v25.SPS_v25;
import scratch.coding.models.v25.TQ_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XTN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomOBR_v25 {
	@JsonProperty("obr_1_setID")
	private String obr_1_setID;
	@JsonProperty("obr_2_placerOrderNumber")
	private EI_v2 obr_2_placerOrderNumber;
	@JsonProperty("obr_3_fillerOrderNumber")
	private EI_v2 obr_3_fillerOrderNumber;
	@JsonProperty("obr_4_universalServiceIdentifier")
	private CE_v2 obr_4_universalServiceIdentifier;
	@JsonProperty("obr_5_priority")
	private String obr_5_priority;
	@JsonProperty("obr_6_requestedDateTime")
	private TS_v2 obr_6_requestedDateTime;
	@JsonProperty("obr_7_observationDateTime")
	private TS_v2 obr_7_observationDateTime;
	@JsonProperty("obr_8_observationEndDateTime")
	private TS_v2 obr_8_observationEndDateTime;
	@JsonProperty("obr_9_collectionVolume")
	private CQ_v25 obr_9_collectionVolume;
	@JsonProperty("obr_10_collectorIdentifier")
	private XCN_v25[] obr_10_collectorIdentifier;
	@JsonProperty("obr_11_specimenActionCode")
	private String obr_11_specimenActionCode;
	@JsonProperty("obr_12_dangerCode")
	private CE_v2 obr_12_dangerCode;
	@JsonProperty("obr_13_relevantClinicalInformation")
	private String obr_13_relevantClinicalInformation;
	@JsonProperty("obr_14_specimenReceivedDateTime")
	private TS_v2 obr_14_specimenReceivedDateTime;
	@JsonProperty("obr_15_specimenSource")
	private SPS_v25 obr_15_specimenSource;
	@JsonProperty("obr_16_orderingProvider")
	private XCN_v25[] obr_16_orderingProvider;
	@JsonProperty("obr_17_orderCallbackPhoneNumber")
	private XTN_v25[] obr_17_orderCallbackPhoneNumber;
	@JsonProperty("obr_18_placerField")
	private String obr_18_placerField;
	@JsonProperty("obr_19_placerField")
	private String obr_19_placerField;
	@JsonProperty("obr_20_fillerField")
	private String obr_20_fillerField;
	@JsonProperty("obr_21_fillerField")
	private String obr_21_fillerField;
	@JsonProperty("obr_22_resultsRptStatusChng")
	private TS_v2 obr_22_resultsRptStatusChng;
	@JsonProperty("obr_23_chargetoPractice")
	private MOC_v25 obr_23_chargetoPractice;
	@JsonProperty("obr_24_diagnosticServSectID")
	private String obr_24_diagnosticServSectID;
	@JsonProperty("obr_25_resultStatus")
	private String obr_25_resultStatus;
	@JsonProperty("obr_26_parentResult")
	private PRL_v25 obr_26_parentResult;
	@JsonProperty("obr_27_quantityTiming")
	private TQ_v25[] obr_27_quantityTiming;
	@JsonProperty("obr_28_resultCopiesTo")
	private XCN_v25[] obr_28_resultCopiesTo;
	@JsonProperty("obr_29_parent")
	private EIP_v25 obr_29_parent;
	@JsonProperty("obr_30_transportationMode")
	private String obr_30_transportationMode;
	@JsonProperty("obr_31_reasonforStudy")
	private CE_v2[] obr_31_reasonforStudy;
	@JsonProperty("obr_32_principalResultInterpreter")
	private NDL_v25 obr_32_principalResultInterpreter;
	@JsonProperty("obr_33_assistantResultInterpreter")
	private NDL_v25[] obr_33_assistantResultInterpreter;
	@JsonProperty("obr_34_technician")
	private NDL_v25[] obr_34_technician;
	@JsonProperty("obr_35_transcriptionist")
	private NDL_v25[] obr_35_transcriptionist;
	@JsonProperty("obr_36_scheduledDateTime")
	private TS_v2 obr_36_scheduledDateTime;
	@JsonProperty("obr_37_numberofSampleContainers")
	private String obr_37_numberofSampleContainers;
	@JsonProperty("obr_38_transportLogisticsofCollectedSample")
	private CE_v2[] obr_38_transportLogisticsofCollectedSample;
	@JsonProperty("obr_39_collectorsComment")
	private CE_v2[] obr_39_collectorsComment;
	@JsonProperty("obr_40_transportArrangementResponsibility")
	private CE_v2 obr_40_transportArrangementResponsibility;
	@JsonProperty("obr_41_transportArranged")
	private String obr_41_transportArranged;
	@JsonProperty("obr_42_escortRequired")
	private String obr_42_escortRequired;
	@JsonProperty("obr_43_plannedPatientTransportComment")
	private CE_v2[] obr_43_plannedPatientTransportComment;
	@JsonProperty("obr_44_procedureCode")
	private CE_v2 obr_44_procedureCode;
	@JsonProperty("obr_45_procedureCodeModifier")
	private CE_v2[] obr_45_procedureCodeModifier;
	@JsonProperty("obr_46_placerSupplementalServiceInformation")
	private CE_v2[] obr_46_placerSupplementalServiceInformation;
	@JsonProperty("obr_47_fillerSupplementalServiceInformation")
	private CE_v2[] obr_47_fillerSupplementalServiceInformation;
	@JsonProperty("obr_48_medicallyNecessaryDuplicateProcedureReason")
	private CWE_v25 obr_48_medicallyNecessaryDuplicateProcedureReason;
	@JsonProperty("obr_49_resultHandling")
	private String obr_49_resultHandling;
	@JsonProperty("nte")
	private List<CustomNTE_v25> nte;
	@JsonProperty("obx")
	private List<CustomOBX_v25> obx;
	private OBR obr;
	
	private CustomOBR_v25(OBR obr, List<CustomNTE_v25> nte, List<CustomOBX_v25> obx) {
		super();
		this.obr =obr;
		this.nte = nte;
		this.obx = obx;
	}
	private CustomOBR_v25(OBR obr) {
		super();
		this.obr = obr;
	}
	
	public CustomOBR_v25() {
		super();
	}
	public static CustomOBR_v25 createOBR(ORU_R01_ORDER_OBSERVATION observation) throws HL7Exception, IOException {
		OBR obr = observation.getOBR();
		List<CustomNTE_v25> nteArray = new ArrayList<>();
		for (NTE nt : observation.getNTEAll()) {
			nteArray.add(CustomNTE_v25.createNteWithTypeAndVersion(nt));
		}
		List<CustomOBX_v25> obxArray = new ArrayList<>();
		for(ORU_R01_OBSERVATION obs: observation.getOBSERVATIONAll()) {
			obxArray.add(CustomOBX_v25.createOBX(obs));
		}
		
		return new CustomOBR_v25(obr, nteArray, obxArray);
	}

	public static CustomOBR_v25 createOBRWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		OBR obr = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getOBR();
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
		return new CustomOBR_v25(obr);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the obr_1_setID
	 */
	
	@JsonProperty("obr_1_setID")
	public String getObr_1_setID() {
		return obr.getObr1_SetIDOBR().getValue()==null?"":obr.getObr1_SetIDOBR().getValue();
	}
	/**
	 * @param obr_1_setID the obr_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_1_setID")
	public void setObr_1_setID(String obr_1_setID) throws DataTypeException {
		obr.getObr1_SetIDOBR().setValue(obr_1_setID);
		this.obr_1_setID = obr_1_setID;
	}
	/**
	 * @return the obr_2_placerOrderNumber
	 */
	
	@JsonProperty("obr_2_placerOrderNumber")
	public EI_v2 getObr_2_placerOrderNumber() {
		return new EI_v2(
				this.obr.getObr2_PlacerOrderNumber().getEi1_EntityIdentifier().getValue()==null?"":this.obr.getObr2_PlacerOrderNumber().getEi1_EntityIdentifier().getValue(),
				this.obr.getObr2_PlacerOrderNumber().getEi2_NamespaceID().getValue()==null?"":this.obr.getObr2_PlacerOrderNumber().getEi2_NamespaceID().getValue(), 
				this.obr.getObr2_PlacerOrderNumber().getEi3_UniversalID().getValue()==null?"":this.obr.getObr2_PlacerOrderNumber().getEi3_UniversalID().getValue(), 
				this.obr.getObr2_PlacerOrderNumber().getEi4_UniversalIDType().getValue()==null?"":this.obr.getObr2_PlacerOrderNumber().getEi4_UniversalIDType().getValue());
	}
	/**
	 * @param obr_2_placerOrderNumber the obr_2_placerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_2_placerOrderNumber")
	public void setObr_2_placerOrderNumber(EI_v2 obr_2_placerOrderNumber) throws DataTypeException {
		this.obr.getObr2_PlacerOrderNumber().getEi1_EntityIdentifier().setValue(obr_2_placerOrderNumber.getEi_1_entityIdentifier());
		this.obr.getObr2_PlacerOrderNumber().getEi2_NamespaceID().setValue(obr_2_placerOrderNumber.getEi_2_namespaceId()); 
		this.obr.getObr2_PlacerOrderNumber().getEi3_UniversalID().setValue(obr_2_placerOrderNumber.getEi_3_universalId());
		this.obr.getObr2_PlacerOrderNumber().getEi4_UniversalIDType().setValue(obr_2_placerOrderNumber.getEi_4_universalIdType());
		this.obr_2_placerOrderNumber = obr_2_placerOrderNumber;
	}
	/**
	 * @return the obr_3_fillerOrderNumber
	 */
	
	@JsonProperty("obr_3_fillerOrderNumber")
	public EI_v2 getObr_3_fillerOrderNumber() {
		return new EI_v2(
				this.obr.getObr3_FillerOrderNumber().getEi1_EntityIdentifier().getValue()==null?"":this.obr.getObr3_FillerOrderNumber().getEi1_EntityIdentifier().getValue(),
				this.obr.getObr3_FillerOrderNumber().getEi2_NamespaceID().getValue()==null?"":this.obr.getObr3_FillerOrderNumber().getEi2_NamespaceID().getValue(), 
				this.obr.getObr3_FillerOrderNumber().getEi3_UniversalID().getValue()==null?"":this.obr.getObr3_FillerOrderNumber().getEi3_UniversalID().getValue(), 
				this.obr.getObr3_FillerOrderNumber().getEi4_UniversalIDType().getValue()==null?"":this.obr.getObr3_FillerOrderNumber().getEi4_UniversalIDType().getValue());
	}
	/**
	 * @param obr_3_fillerOrderNumber the obr_3_fillerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_3_fillerOrderNumber")
	public void setObr_3_fillerOrderNumber(EI_v2 obr_3_fillerOrderNumber) throws DataTypeException {
		this.obr.getObr3_FillerOrderNumber().getEi1_EntityIdentifier().setValue(obr_3_fillerOrderNumber.getEi_1_entityIdentifier());
		this.obr.getObr3_FillerOrderNumber().getEi2_NamespaceID().setValue(obr_3_fillerOrderNumber.getEi_2_namespaceId()); 
		this.obr.getObr3_FillerOrderNumber().getEi3_UniversalID().setValue(obr_3_fillerOrderNumber.getEi_3_universalId());
		this.obr.getObr3_FillerOrderNumber().getEi4_UniversalIDType().setValue(obr_3_fillerOrderNumber.getEi_4_universalIdType());
		this.obr_3_fillerOrderNumber = obr_3_fillerOrderNumber;
	}
	/**
	 * @return the obr_4_universalServiceIdentifier
	 */
	
	@JsonProperty("obr_4_universalServiceIdentifier")
	public CE_v2 getObr_4_universalServiceIdentifier() {
		return new CE_v2(
				this.obr.getObr4_UniversalServiceIdentifier().getCe1_Identifier().getValue()==null?"":this.obr.getObr4_UniversalServiceIdentifier().getCe1_Identifier().getValue(),
				this.obr.getObr4_UniversalServiceIdentifier().getCe2_Text().getValue()==null?"":this.obr.getObr4_UniversalServiceIdentifier().getCe2_Text().getValue(),
				this.obr.getObr4_UniversalServiceIdentifier().getCe3_NameOfCodingSystem().getValue()==null?"":this.obr.getObr4_UniversalServiceIdentifier().getCe3_NameOfCodingSystem().getValue(),
				this.obr.getObr4_UniversalServiceIdentifier().getCe4_AlternateIdentifier().getValue()==null?"":this.obr.getObr4_UniversalServiceIdentifier().getCe4_AlternateIdentifier().getValue(),
				this.obr.getObr4_UniversalServiceIdentifier().getCe5_AlternateText().getValue()==null?"":this.obr.getObr4_UniversalServiceIdentifier().getCe5_AlternateText().getValue(),
				this.obr.getObr4_UniversalServiceIdentifier().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.obr.getObr4_UniversalServiceIdentifier().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obr_4_universalServiceIdentifier the obr_4_universalServiceIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_4_universalServiceIdentifier")
	public void setObr_4_universalServiceIdentifier(CE_v2 obr_4_universalServiceIdentifier) throws DataTypeException {	
		this.obr.getObr4_UniversalServiceIdentifier().getCe1_Identifier().setValue(obr_4_universalServiceIdentifier.getCe_1_identifier());
		this.obr.getObr4_UniversalServiceIdentifier().getCe2_Text().setValue(obr_4_universalServiceIdentifier.getCe_2_text());
		this.obr.getObr4_UniversalServiceIdentifier().getCe3_NameOfCodingSystem().setValue(obr_4_universalServiceIdentifier.getCe_3_nameOfCodingSystem());
		this.obr.getObr4_UniversalServiceIdentifier().getCe4_AlternateIdentifier().setValue(obr_4_universalServiceIdentifier.getCe_4_alternateIdentifier());
		this.obr.getObr4_UniversalServiceIdentifier().getCe5_AlternateText().setValue(obr_4_universalServiceIdentifier.getCe_5_alternateText());
		this.obr.getObr4_UniversalServiceIdentifier().getCe6_NameOfAlternateCodingSystem().setValue(obr_4_universalServiceIdentifier.getCe_6_nameOfAlternateCodingSystem());
		this.obr_4_universalServiceIdentifier = obr_4_universalServiceIdentifier;
	}
	/**
	 * @return the obr_5_priority
	 */
	
	@JsonProperty("obr_5_priority")
	public String getObr_5_priority() {
		return this.obr.getObr5_PriorityOBR().getValue()==null?"":this.obr.getObr5_PriorityOBR().getValue();
	}
	/**
	 * @param obr_5_priority the obr_5_priority to  set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_5_priority")
	public void setObr_5_priority(String obr_5_priority) throws DataTypeException {
		this.obr.getObr5_PriorityOBR().setValue(obr_5_priority);
		this.obr_5_priority = obr_5_priority;
	}
	/**
	 * @return the obr_6_requestedDateTime
	 */
	
	@JsonProperty("obr_6_requestedDateTime")
	public TS_v2 getObr_6_requestedDateTime() {
		return new TS_v2(
				this.obr.getObr6_RequestedDateTime().getTs1_Time().getValue()==null?"":this.obr.getObr6_RequestedDateTime().getTs1_Time().getValue(),
				this.obr.getObr6_RequestedDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.obr.getObr6_RequestedDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obr_6_requestedDateTime the obr_6_requestedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_6_requestedDateTime")
	public void setObr_6_requestedDateTime(TS_v2 obr_6_requestedDateTime) throws DataTypeException {
		this.obr.getObr6_RequestedDateTime().getTs1_Time().setValue(obr_6_requestedDateTime.getTs_1_time());
		this.obr.getObr6_RequestedDateTime().getTs2_DegreeOfPrecision().setValue(obr_6_requestedDateTime.getTs_2_degreeOfPrecision());
		this.obr_6_requestedDateTime = obr_6_requestedDateTime;
	}
	/**
	 * @return the obr_7_observationDateTime
	 */
	
	@JsonProperty("obr_7_observationDateTime")
	public TS_v2 getObr_7_observationDateTime() {
		return new TS_v2(
				this.obr.getObr7_ObservationDateTime().getTs1_Time().getValue()==null?"":this.obr.getObr7_ObservationDateTime().getTs1_Time().getValue(),
				this.obr.getObr7_ObservationDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.obr.getObr7_ObservationDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obr_7_observationDateTime the obr_7_observationDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_7_observationDateTime")
	public void setObr_7_observationDateTime(TS_v2 obr_7_observationDateTime) throws DataTypeException {
		this.obr.getObr7_ObservationDateTime().getTs1_Time().setValue(obr_7_observationDateTime.getTs_1_time());
		this.obr.getObr7_ObservationDateTime().getTs2_DegreeOfPrecision().setValue(obr_7_observationDateTime.getTs_2_degreeOfPrecision());
		this.obr_7_observationDateTime=obr_7_observationDateTime;
	}
	/**
	 * @return the obr_8_observationEndDateTime
	 */
	
	@JsonProperty("obr_8_observationEndDateTime")
	public TS_v2 getObr_8_observationEndDateTime() {
		return new TS_v2(
				this.obr.getObr8_ObservationEndDateTime().getTs1_Time().getValue()==null?"":this.obr.getObr8_ObservationEndDateTime().getTs1_Time().getValue(),
				this.obr.getObr8_ObservationEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.obr.getObr8_ObservationEndDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obr_8_observationEndDateTime the obr_8_observationEndDateTime to set
	 * @JsonProperty("obr_8_observationEndDateTime")
	 * @throws DataTypeException 
	 */
	public void setObr_8_observationEndDateTime(TS_v2 obr_8_observationEndDateTime) throws DataTypeException {
		this.obr.getObr8_ObservationEndDateTime().getTs1_Time().setValue(obr_8_observationEndDateTime.getTs_1_time());
		this.obr.getObr8_ObservationEndDateTime().getTs2_DegreeOfPrecision().setValue(obr_8_observationEndDateTime.getTs_2_degreeOfPrecision());
		this.obr_8_observationEndDateTime = obr_8_observationEndDateTime;
	}
	/**
	 * @return the obr_9_collectionVolume
	 *	@JsonProperty("obr_9_collectionVolume")
	 */
	
	public CQ_v25 getObr_9_collectionVolume() {
		return new CQ_v25(
				this.obr.getObr9_CollectionVolume().getCq1_Quantity().getValue(),
				new CE_v2(
						this.obr.getObr9_CollectionVolume().getCq2_Units().getCe1_Identifier().getValue()==null?"":this.obr.getObr9_CollectionVolume().getCq2_Units().getCe1_Identifier().getValue(),
						this.obr.getObr9_CollectionVolume().getCq2_Units().getCe2_Text().getValue()==null?"":this.obr.getObr9_CollectionVolume().getCq2_Units().getCe2_Text().getValue(),
						this.obr.getObr9_CollectionVolume().getCq2_Units().getCe3_NameOfCodingSystem().getValue()==null?"":this.obr.getObr9_CollectionVolume().getCq2_Units().getCe3_NameOfCodingSystem().getValue(),
						this.obr.getObr9_CollectionVolume().getCq2_Units().getCe4_AlternateIdentifier().getValue()==null?"":this.obr.getObr9_CollectionVolume().getCq2_Units().getCe4_AlternateIdentifier().getValue(),
						this.obr.getObr9_CollectionVolume().getCq2_Units().getCe5_AlternateText().getValue()==null?"":this.obr.getObr9_CollectionVolume().getCq2_Units().getCe5_AlternateText().getValue(),
						this.obr.getObr9_CollectionVolume().getCq2_Units().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.obr.getObr9_CollectionVolume().getCq2_Units().getCe6_NameOfAlternateCodingSystem().getValue()));
	}
	/**
	 * @param obr_9_collectionVolume the obr_9_collectionVolume to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_9_collectionVolume")
	public void setObr_9_collectionVolume(CQ_v25 obr_9_collectionVolume) throws DataTypeException {
		this.obr.getObr9_CollectionVolume().getCq1_Quantity().setValue(obr_9_collectionVolume.getCq_1_quantity());
		this.obr.getObr9_CollectionVolume().getCq2_Units().getCe1_Identifier().setValue(obr_9_collectionVolume.getCq_2_units().getCe_1_identifier());
		this.obr.getObr9_CollectionVolume().getCq2_Units().getCe2_Text().setValue(obr_9_collectionVolume.getCq_2_units().getCe_2_text());
		this.obr.getObr9_CollectionVolume().getCq2_Units().getCe3_NameOfCodingSystem().setValue(obr_9_collectionVolume.getCq_2_units().getCe_3_nameOfCodingSystem());
		this.obr.getObr9_CollectionVolume().getCq2_Units().getCe4_AlternateIdentifier().setValue(obr_9_collectionVolume.getCq_2_units().getCe_4_alternateIdentifier());
		this.obr.getObr9_CollectionVolume().getCq2_Units().getCe5_AlternateText().setValue(obr_9_collectionVolume.getCq_2_units().getCe_5_alternateText());
		this.obr.getObr9_CollectionVolume().getCq2_Units().getCe6_NameOfAlternateCodingSystem().setValue(obr_9_collectionVolume.getCq_2_units().getCe_6_nameOfAlternateCodingSystem());
		this.obr_9_collectionVolume = obr_9_collectionVolume;
	}
	/**
	 * @return the obr_10_collectorIdentifier
	 */
	
	@JsonProperty("obr_10_collectorIdentifier")
	public XCN_v25[] getObr_10_collectorIdentifier() {
		XCN_v25[] collectorIdentifier = new XCN_v25[this.obr.getObr10_CollectorIdentifier().length];
		for(int i = 0; i<this.obr.getObr10_CollectorIdentifier().length;i++) {
			collectorIdentifier[i] = new XCN_v25(
					this.obr.getObr10_CollectorIdentifier(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.obr.getObr10_CollectorIdentifier(i).getXcn3_GivenName().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn6_PrefixEgDR().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn7_DegreeEgMD().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.obr.getObr10_CollectorIdentifier(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.obr.getObr10_CollectorIdentifier(i).getXcn10_NameTypeCode().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn12_CheckDigitScheme().getValue(),
					this.obr.getObr10_CollectorIdentifier(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.obr.getObr10_CollectorIdentifier(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.obr.getObr10_CollectorIdentifier(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.obr.getObr10_CollectorIdentifier(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.obr.getObr10_CollectorIdentifier(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.obr.getObr10_CollectorIdentifier(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.obr.getObr10_CollectorIdentifier(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return collectorIdentifier;
	}
	/**
	 * @param obr_10_collectorIdentifier the obr_10_collectorIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_10_collectorIdentifier")
	public void setObr_10_collectorIdentifier(XCN_v25[] obr_10_collectorIdentifier) throws DataTypeException {
		for(int i = 0; i<obr_10_collectorIdentifier.length;i++) {
			this.obr.getObr10_CollectorIdentifier(i).getXcn1_IDNumber().setValue(obr_10_collectorIdentifier[i].getXcn_1_idNumber());
			this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn1_Surname().setValue(obr_10_collectorIdentifier[i].getXcn_2_familyName().getFn_1_surname());
			this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(obr_10_collectorIdentifier[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(obr_10_collectorIdentifier[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(obr_10_collectorIdentifier[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.obr.getObr10_CollectorIdentifier(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(obr_10_collectorIdentifier[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.obr.getObr10_CollectorIdentifier(i).getXcn3_GivenName().setValue(obr_10_collectorIdentifier[i].getXcn_3_givenName());
			this.obr.getObr10_CollectorIdentifier(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_10_collectorIdentifier[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obr.getObr10_CollectorIdentifier(i).getXcn5_SuffixEgJRorIII().setValue(obr_10_collectorIdentifier[i].getXcn_5_suffixegJrOrIii());
			this.obr.getObr10_CollectorIdentifier(i).getXcn6_PrefixEgDR().setValue(obr_10_collectorIdentifier[i].getXcn_6_prefixegDr());
			this.obr.getObr10_CollectorIdentifier(i).getXcn7_DegreeEgMD().setValue(obr_10_collectorIdentifier[i].getXcn_7_degreeegMd());
			this.obr.getObr10_CollectorIdentifier(i).getXcn8_SourceTable().setValue(obr_10_collectorIdentifier[i].getXcn_8_sourceTable());
			this.obr.getObr10_CollectorIdentifier(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(obr_10_collectorIdentifier[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(obr_10_collectorIdentifier[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(obr_10_collectorIdentifier[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.obr.getObr10_CollectorIdentifier(i).getXcn10_NameTypeCode().setValue(obr_10_collectorIdentifier[i].getXcn_10_nameTypeCode());
			this.obr.getObr10_CollectorIdentifier(i).getXcn11_IdentifierCheckDigit().setValue(obr_10_collectorIdentifier[i].getXcn_11_identifierCheckDigit());
			this.obr.getObr10_CollectorIdentifier(i).getXcn12_CheckDigitScheme().setValue(obr_10_collectorIdentifier[i].getXcn_12_checkDigitScheme());
			this.obr.getObr10_CollectorIdentifier(i).getXcn13_IdentifierTypeCode().setValue(obr_10_collectorIdentifier[i].getXcn_13_identifierTypeCode());
			this.obr.getObr10_CollectorIdentifier(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(obr_10_collectorIdentifier[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(obr_10_collectorIdentifier[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(obr_10_collectorIdentifier[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.obr.getObr10_CollectorIdentifier(i).getXcn15_NameRepresentationCode().setValue(obr_10_collectorIdentifier[i].getXcn_15_nameRepresentationCode());
			this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe1_Identifier().setValue(obr_10_collectorIdentifier[i].getXcn_16_nameContext().getCe_1_identifier());
			this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe2_Text().setValue(obr_10_collectorIdentifier[i].getXcn_16_nameContext().getCe_2_text());
			this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(obr_10_collectorIdentifier[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(obr_10_collectorIdentifier[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe5_AlternateText().setValue(obr_10_collectorIdentifier[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.obr.getObr10_CollectorIdentifier(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(obr_10_collectorIdentifier[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(obr_10_collectorIdentifier[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(obr_10_collectorIdentifier[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(obr_10_collectorIdentifier[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.obr.getObr10_CollectorIdentifier(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(obr_10_collectorIdentifier[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr10_CollectorIdentifier(i).getXcn18_NameAssemblyOrder().setValue(obr_10_collectorIdentifier[i].getXcn_18_nameAssemblyOrder());
			this.obr.getObr10_CollectorIdentifier(i).getXcn19_EffectiveDate().getTs1_Time().setValue(obr_10_collectorIdentifier[i].getXcn_19_effectiveDate().getTs_1_time());
			this.obr.getObr10_CollectorIdentifier(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(obr_10_collectorIdentifier[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.obr.getObr10_CollectorIdentifier(i).getXcn20_ExpirationDate().getTs1_Time().setValue(obr_10_collectorIdentifier[i].getXcn_20_expirationDate().getTs_1_time());
			this.obr.getObr10_CollectorIdentifier(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(obr_10_collectorIdentifier[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.obr.getObr10_CollectorIdentifier(i).getXcn21_ProfessionalSuffix().setValue(obr_10_collectorIdentifier[i].getXcn_21_professionalSuffix());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obr.getObr10_CollectorIdentifier(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(obr_10_collectorIdentifier[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.obr_10_collectorIdentifier = obr_10_collectorIdentifier;
	}
	/**
	 * @return the obr_11_specimenActionCode
	 */
	
	@JsonProperty("obr_11_specimenActionCode")
	public String getObr_11_specimenActionCode() {
		return this.obr.getObr11_SpecimenActionCode().getValue();
	}
	/**
	 * @param obr_11_specimenActionCode the obr_11_specimenActionCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_11_specimenActionCode")
	public void setObr_11_specimenActionCode(String obr_11_specimenActionCode) throws DataTypeException {
		this.obr.getObr11_SpecimenActionCode().setValue(obr_11_specimenActionCode);
		this.obr_11_specimenActionCode = obr_11_specimenActionCode;
	}
	/**
	 * @return the obr_12_dangerCode
	 */
	
	@JsonProperty("obr_12_dangerCode")
	public CE_v2 getObr_12_dangerCode() {
		return new CE_v2(
				this.obr.getObr12_DangerCode().getCe1_Identifier().getValue(),
				this.obr.getObr12_DangerCode().getCe2_Text().getValue(),
				this.obr.getObr12_DangerCode().getCe3_NameOfCodingSystem().getValue(),
				this.obr.getObr12_DangerCode().getCe4_AlternateIdentifier().getValue(),
				this.obr.getObr12_DangerCode().getCe5_AlternateText().getValue(),
				this.obr.getObr12_DangerCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obr_12_dangerCode the obr_12_dangerCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_12_dangerCode")
	public void setObr_12_dangerCode(CE_v2 obr_12_dangerCode) throws DataTypeException {
		this.obr.getObr12_DangerCode().getCe1_Identifier().setValue(obr_12_dangerCode.getCe_1_identifier());
		this.obr.getObr12_DangerCode().getCe2_Text().setValue(obr_12_dangerCode.getCe_2_text());
		this.obr.getObr12_DangerCode().getCe3_NameOfCodingSystem().setValue(obr_12_dangerCode.getCe_3_nameOfCodingSystem());
		this.obr.getObr12_DangerCode().getCe4_AlternateIdentifier().setValue(obr_12_dangerCode.getCe_4_alternateIdentifier());
		this.obr.getObr12_DangerCode().getCe5_AlternateText().setValue(obr_12_dangerCode.getCe_5_alternateText());
		this.obr.getObr12_DangerCode().getCe6_NameOfAlternateCodingSystem().setValue(obr_12_dangerCode.getCe_6_nameOfAlternateCodingSystem());
		this.obr_12_dangerCode = obr_12_dangerCode;
	}
	/**
	 * @return the obr_13_relevantClinicalInformation
	 */
	
	@JsonProperty("obr_13_relevantClinicalInformation")
	public String getObr_13_relevantClinicalInformation() {
		return this.obr.getObr13_RelevantClinicalInformation().getValue();
	}
	/**
	 * @param obr_13_relevantClinicalInformation the obr_13_relevantClinicalInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_13_relevantClinicalInformation")
	public void setObr_13_relevantClinicalInformation(String obr_13_relevantClinicalInformation) throws DataTypeException {
		this.obr.getObr13_RelevantClinicalInformation().setValue(obr_13_relevantClinicalInformation);
		this.obr_13_relevantClinicalInformation = obr_13_relevantClinicalInformation;
	}
	/**
	 * @return the obr_14_specimenReceivedDateTime
	 */
	
	@JsonProperty("obr_14_specimenReceivedDateTime")
	public TS_v2 getObr_14_specimenReceivedDateTime() {
		return new TS_v2(
				this.obr.getObr14_SpecimenReceivedDateTime().getTs1_Time().getValue(), 
				this.obr.getObr14_SpecimenReceivedDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obr_14_specimenReceivedDateTime the obr_14_specimenReceivedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_14_specimenReceivedDateTime")
	public void setObr_14_specimenReceivedDateTime(TS_v2 obr_14_specimenReceivedDateTime) throws DataTypeException {
		this.obr.getObr14_SpecimenReceivedDateTime().getTs1_Time().setValue(obr_14_specimenReceivedDateTime.getTs_1_time());
		this.obr.getObr14_SpecimenReceivedDateTime().getTs2_DegreeOfPrecision().setValue(obr_14_specimenReceivedDateTime.getTs_2_degreeOfPrecision());
		this.obr_14_specimenReceivedDateTime = obr_14_specimenReceivedDateTime;
	}
	/**
	 * @return the obr_15_specimenSource
	 */
	
	@JsonProperty("obr_15_specimenSource")
	public SPS_v25 getObr_15_specimenSource() {
		return new SPS_v25(
				new CWE_v25(
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe1_Identifier().getValue(),
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe2_Text().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe5_AlternateText().getValue(),
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe1_Identifier().getValue(),
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe2_Text().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe5_AlternateText().getValue(),
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe9_OriginalText().getValue()),
				this.obr.getObr15_SpecimenSource().getSps3_SpecimenCollectionMethod().getValue(),
				new CWE_v25(
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe1_Identifier().getValue(),
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe2_Text().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe5_AlternateText().getValue(),
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe9_OriginalText().getValue()), 
				new CWE_v25(
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe1_Identifier().getValue(),
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe2_Text().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe5_AlternateText().getValue(),
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe1_Identifier().getValue(),
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe2_Text().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe5_AlternateText().getValue(),
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe9_OriginalText().getValue()), 
				new CWE_v25(
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe1_Identifier().getValue(),
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe2_Text().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe5_AlternateText().getValue(),
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param obr_15_specimenSource the obr_15_specimenSource to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_15_specimenSource")
	public void setObr_15_specimenSource(SPS_v25 obr_15_specimenSource) throws DataTypeException {
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe1_Identifier().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_1_identifier());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe2_Text().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_2_text());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe3_NameOfCodingSystem().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_3_nameOfCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe4_AlternateIdentifier().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_4_alternateIdentifier());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe5_AlternateText().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_5_alternateText());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe6_NameOfAlternateCodingSystem().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe7_CodingSystemVersionID().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_7_codingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe8_AlternateCodingSystemVersionID().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps1_SpecimenSourceNameOrCode().getCwe9_OriginalText().setValue(obr_15_specimenSource.getSps_1_specimenSourceNameOrCode().getCwe_9_originalText());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe1_Identifier().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_1_identifier());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe2_Text().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_2_text()); 
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe3_NameOfCodingSystem().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_3_nameOfCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe4_AlternateIdentifier().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_4_alternateIdentifier());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe5_AlternateText().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_5_alternateText());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe6_NameOfAlternateCodingSystem().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe7_CodingSystemVersionID().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_7_codingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe8_AlternateCodingSystemVersionID().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps2_Additives().getCwe9_OriginalText().setValue(obr_15_specimenSource.getSps_2_additives().getCwe_9_originalText());
		this.obr.getObr15_SpecimenSource().getSps3_SpecimenCollectionMethod().setValue(obr_15_specimenSource.getSps_3_specimenCollectionMethod());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe1_Identifier().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_1_identifier());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe2_Text().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_2_text());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe3_NameOfCodingSystem().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_3_nameOfCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe4_AlternateIdentifier().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_4_alternateIdentifier());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe5_AlternateText().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_5_alternateText());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe6_NameOfAlternateCodingSystem().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe7_CodingSystemVersionID().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_7_codingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe8_AlternateCodingSystemVersionID().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps4_BodySite().getCwe9_OriginalText().setValue(obr_15_specimenSource.getSps_4_bodySite().getCwe_9_originalText());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe1_Identifier().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_1_identifier());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe2_Text().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_2_text());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe3_NameOfCodingSystem().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_3_nameOfCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe4_AlternateIdentifier().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_4_alternateIdentifier());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe5_AlternateText().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_5_alternateText());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe6_NameOfAlternateCodingSystem().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe7_CodingSystemVersionID().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_7_codingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe8_AlternateCodingSystemVersionID().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps5_SiteModifier().getCwe9_OriginalText().setValue(obr_15_specimenSource.getSps_5_siteModifier().getCwe_9_originalText());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe1_Identifier().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_1_identifier());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe2_Text().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_2_text());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe3_NameOfCodingSystem().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_3_nameOfCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe4_AlternateIdentifier().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_4_alternateIdentifier());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe5_AlternateText().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_5_alternateText());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe6_NameOfAlternateCodingSystem().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe7_CodingSystemVersionID().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_7_codingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe8_AlternateCodingSystemVersionID().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps6_CollectionMethodModifierCode().getCwe9_OriginalText().setValue(obr_15_specimenSource.getSps_6_collectionMethodModifierCode().getCwe_9_originalText());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe1_Identifier().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_1_identifier());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe2_Text().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_2_text());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe3_NameOfCodingSystem().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_3_nameOfCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe4_AlternateIdentifier().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_4_alternateIdentifier());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe5_AlternateText().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_5_alternateText());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe6_NameOfAlternateCodingSystem().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe7_CodingSystemVersionID().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_7_codingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe8_AlternateCodingSystemVersionID().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr15_SpecimenSource().getSps7_SpecimenRole().getCwe9_OriginalText().setValue(obr_15_specimenSource.getSps_7_specimenRole().getCwe_9_originalText());
		this.obr_15_specimenSource = obr_15_specimenSource;
	}
	/**
	 * @return the obr_16_orderingProvider
	 */
	
	@JsonProperty("obr_16_orderingProvider")
	public XCN_v25[] getObr_16_orderingProvider() {
		XCN_v25[] orderingProvider = new XCN_v25[this.obr.getObr16_OrderingProvider().length];
		for(int i = 0; i<this.obr.getObr16_OrderingProvider().length;i++) {
			orderingProvider[i] = new XCN_v25(
					this.obr.getObr16_OrderingProvider(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.obr.getObr16_OrderingProvider(i).getXcn3_GivenName().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn6_PrefixEgDR().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn7_DegreeEgMD().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.obr.getObr16_OrderingProvider(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.obr.getObr16_OrderingProvider(i).getXcn10_NameTypeCode().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn12_CheckDigitScheme().getValue(),
					this.obr.getObr16_OrderingProvider(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.obr.getObr16_OrderingProvider(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.obr.getObr16_OrderingProvider(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.obr.getObr16_OrderingProvider(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.obr.getObr16_OrderingProvider(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.obr.getObr16_OrderingProvider(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.obr.getObr16_OrderingProvider(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return orderingProvider;
	}
	/**
	 * @param obr_16_orderingProvider the obr_16_orderingProvider to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_16_orderingProvider")
	public void setObr_16_orderingProvider(XCN_v25[] obr_16_orderingProvider) throws DataTypeException {
		for(int i = 0; i<obr_16_orderingProvider.length;i++) {
			this.obr.getObr16_OrderingProvider(i).getXcn1_IDNumber().setValue(obr_16_orderingProvider[i].getXcn_1_idNumber());
			this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn1_Surname().setValue(obr_16_orderingProvider[i].getXcn_2_familyName().getFn_1_surname());
			this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(obr_16_orderingProvider[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(obr_16_orderingProvider[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(obr_16_orderingProvider[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.obr.getObr16_OrderingProvider(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(obr_16_orderingProvider[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.obr.getObr16_OrderingProvider(i).getXcn3_GivenName().setValue(obr_16_orderingProvider[i].getXcn_3_givenName());
			this.obr.getObr16_OrderingProvider(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_16_orderingProvider[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obr.getObr16_OrderingProvider(i).getXcn5_SuffixEgJRorIII().setValue(obr_16_orderingProvider[i].getXcn_5_suffixegJrOrIii());
			this.obr.getObr16_OrderingProvider(i).getXcn6_PrefixEgDR().setValue(obr_16_orderingProvider[i].getXcn_6_prefixegDr());
			this.obr.getObr16_OrderingProvider(i).getXcn7_DegreeEgMD().setValue(obr_16_orderingProvider[i].getXcn_7_degreeegMd());
			this.obr.getObr16_OrderingProvider(i).getXcn8_SourceTable().setValue(obr_16_orderingProvider[i].getXcn_8_sourceTable());
			this.obr.getObr16_OrderingProvider(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(obr_16_orderingProvider[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.obr.getObr16_OrderingProvider(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(obr_16_orderingProvider[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.obr.getObr16_OrderingProvider(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(obr_16_orderingProvider[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.obr.getObr16_OrderingProvider(i).getXcn10_NameTypeCode().setValue(obr_16_orderingProvider[i].getXcn_10_nameTypeCode());
			this.obr.getObr16_OrderingProvider(i).getXcn11_IdentifierCheckDigit().setValue(obr_16_orderingProvider[i].getXcn_11_identifierCheckDigit());
			this.obr.getObr16_OrderingProvider(i).getXcn12_CheckDigitScheme().setValue(obr_16_orderingProvider[i].getXcn_12_checkDigitScheme());
			this.obr.getObr16_OrderingProvider(i).getXcn13_IdentifierTypeCode().setValue(obr_16_orderingProvider[i].getXcn_13_identifierTypeCode());
			this.obr.getObr16_OrderingProvider(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(obr_16_orderingProvider[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.obr.getObr16_OrderingProvider(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(obr_16_orderingProvider[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.obr.getObr16_OrderingProvider(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(obr_16_orderingProvider[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.obr.getObr16_OrderingProvider(i).getXcn15_NameRepresentationCode().setValue(obr_16_orderingProvider[i].getXcn_15_nameRepresentationCode());
			this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe1_Identifier().setValue(obr_16_orderingProvider[i].getXcn_16_nameContext().getCe_1_identifier());
			this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe2_Text().setValue(obr_16_orderingProvider[i].getXcn_16_nameContext().getCe_2_text());
			this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(obr_16_orderingProvider[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(obr_16_orderingProvider[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe5_AlternateText().setValue(obr_16_orderingProvider[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.obr.getObr16_OrderingProvider(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(obr_16_orderingProvider[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(obr_16_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(obr_16_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(obr_16_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.obr.getObr16_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(obr_16_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr16_OrderingProvider(i).getXcn18_NameAssemblyOrder().setValue(obr_16_orderingProvider[i].getXcn_18_nameAssemblyOrder());
			this.obr.getObr16_OrderingProvider(i).getXcn19_EffectiveDate().getTs1_Time().setValue(obr_16_orderingProvider[i].getXcn_19_effectiveDate().getTs_1_time());
			this.obr.getObr16_OrderingProvider(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(obr_16_orderingProvider[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.obr.getObr16_OrderingProvider(i).getXcn20_ExpirationDate().getTs1_Time().setValue(obr_16_orderingProvider[i].getXcn_20_expirationDate().getTs_1_time());
			this.obr.getObr16_OrderingProvider(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(obr_16_orderingProvider[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.obr.getObr16_OrderingProvider(i).getXcn21_ProfessionalSuffix().setValue(obr_16_orderingProvider[i].getXcn_21_professionalSuffix());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obr.getObr16_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obr.getObr16_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(obr_16_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.obr_16_orderingProvider = obr_16_orderingProvider;
	}
	/**
	 * @return the obr_17_orderCallbackPhoneNumber
	 */
	
	@JsonProperty("obr_17_orderCallbackPhoneNumber")
	public XTN_v25[] getObr_17_orderCallbackPhoneNumber() {
		
		XTN_v25[] orderCallbackPhoneNumber = new XTN_v25[this.obr.getObr17_OrderCallbackPhoneNumber().length];
		for(int i = 0; i<this.obr.getObr17_OrderCallbackPhoneNumber().length;i++) {
			orderCallbackPhoneNumber[i] = new XTN_v25(
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn1_TelephoneNumber().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn4_EmailAddress().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn5_CountryCode().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn6_AreaCityCode().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn7_LocalNumber().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn8_Extension().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn9_AnyText().getValue(), 
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn10_ExtensionPrefix().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn11_SpeedDialCode().getValue(),
					this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return orderCallbackPhoneNumber;
	}
	/**
	 * @param obr_17_orderCallbackPhoneNumber the obr_17_orderCallbackPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_17_orderCallbackPhoneNumber")
	public void setObr_17_orderCallbackPhoneNumber(XTN_v25[] obr_17_orderCallbackPhoneNumber) throws DataTypeException {
		for(int i = 0; i<obr_17_orderCallbackPhoneNumber.length;i++) {
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn1_TelephoneNumber().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_1_telephoneNumber());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn2_TelecommunicationUseCode().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_2_telecommunicationUseCode());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_3_telecommunicationEquipmentType());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn4_EmailAddress().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_4_emailAddress());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn5_CountryCode().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_5_countryCode());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn6_AreaCityCode().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_6_areaCityCode());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn7_LocalNumber().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_7_localNumber());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn8_Extension().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_8_extension());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn9_AnyText().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_9_anyText());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn10_ExtensionPrefix().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_10_extensionPrefix());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn11_SpeedDialCode().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_11_SpeedDialCode());
			this.obr.getObr17_OrderCallbackPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().setValue(obr_17_orderCallbackPhoneNumber[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.obr_17_orderCallbackPhoneNumber = obr_17_orderCallbackPhoneNumber;
	}
	/**
	 * @return the obr_18_placerField
	 */
	
	@JsonProperty("obr_18_placerField")
	public String getObr_18_placerField() {
		return this.obr.getObr18_PlacerField1().getValue();
	}
	/**
	 * @param obr_18_placerField the obr_18_placerField to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_18_placerField")
	public void setObr_18_placerField(String obr_18_placerField) throws DataTypeException {
		this.obr.getObr18_PlacerField1().setValue(obr_18_placerField);
		this.obr_18_placerField = obr_18_placerField;
	}
	/**
	 * @return the obr_19_placerField
	 */
	
	@JsonProperty("obr_19_placerField")
	public String getObr_19_placerField() {	
		return this.obr.getObr19_PlacerField2().getValue();
	}
	/**
	 * @param obr_19_placerField the obr_19_placerField to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_19_placerField")
	public void setObr_19_placerField(String obr_19_placerField) throws DataTypeException {
		this.obr.getObr19_PlacerField2().setValue(obr_19_placerField);
		this.obr_19_placerField = obr_19_placerField;
	}
	/**
	 * @return the obr_20_fillerField
	 */
	
	@JsonProperty("obr_20_fillerField")
	public String getObr_20_fillerField() {
		return this.obr.getObr20_FillerField1().getValue();
	}
	/**
	 * @param obr_20_fillerField the obr_20_fillerField to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_20_fillerField")
	public void setObr_20_fillerField(String obr_20_fillerField) throws DataTypeException {
		this.obr.getObr20_FillerField1().setValue(obr_20_fillerField);
		this.obr_20_fillerField = obr_20_fillerField;
	}
	/**
	 * @return the obr_21_fillerField
	 */
	
	@JsonProperty("obr_21_fillerField")
	public String getObr_21_fillerField() {
		return this.obr.getObr21_FillerField2().getValue();
	}
	/**
	 * @param obr_21_fillerField the obr_21_fillerField to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_21_fillerField")
	public void setObr_21_fillerField(String obr_21_fillerField) throws DataTypeException {
		this.obr.getObr21_FillerField2().setValue(obr_21_fillerField);
		this.obr_21_fillerField = obr_21_fillerField;
	}
	/**
	 * @return the obr_22_resultsRptStatusChng
	 */
	
	@JsonProperty("obr_22_resultsRptStatusChng")
	public TS_v2 getObr_22_resultsRptStatusChng() {
		return new TS_v2(
				this.obr.getObr22_ResultsRptStatusChngDateTime().getTs1_Time().getValue(),
				this.obr.getObr22_ResultsRptStatusChngDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obr_22_resultsRptStatusChng the obr_22_resultsRptStatusChng to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_22_resultsRptStatusChng")
	public void setObr_22_resultsRptStatusChng(TS_v2 obr_22_resultsRptStatusChng) throws DataTypeException {
		this.obr.getObr22_ResultsRptStatusChngDateTime().getTs1_Time().setValue(obr_22_resultsRptStatusChng.getTs_1_time());
		this.obr.getObr22_ResultsRptStatusChngDateTime().getTs2_DegreeOfPrecision().setValue(obr_22_resultsRptStatusChng.getTs_2_degreeOfPrecision());
		this.obr_22_resultsRptStatusChng = obr_22_resultsRptStatusChng;
	}
	/**
	 * @return the obr_23_chargetoPractice
	 */
	
	@JsonProperty("obr_23_chargetoPractice")
	public MOC_v25 getObr_23_chargetoPractice() {
		return new MOC_v25(
				new MO_v2(
						this.obr.getObr23_ChargeToPractice().getMoc1_MonetaryAmount().getMo1_Quantity().getValue(),
						this.obr.getObr23_ChargeToPractice().getMoc1_MonetaryAmount().getMo2_Denomination().getValue()),
				new CE_v2(
						this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe1_Identifier().getValue(),
						this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe2_Text().getValue(),
						this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe3_NameOfCodingSystem().getValue(),
						this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe4_AlternateIdentifier().getValue(),
						this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe5_AlternateText().getValue(),
						this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe6_NameOfAlternateCodingSystem().getValue()));
	}
	/**
	 * @param obr_23_chargetoPractice the obr_23_chargetoPractice to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_23_chargetoPractice")
	public void setObr_23_chargetoPractice(MOC_v25 obr_23_chargetoPractice) throws DataTypeException {
		this.obr.getObr23_ChargeToPractice().getMoc1_MonetaryAmount().getMo1_Quantity().setValue(obr_23_chargetoPractice.getMoc_1_monetaryAmount().getMo_1_quantity());
		this.obr.getObr23_ChargeToPractice().getMoc1_MonetaryAmount().getMo2_Denomination().setValue(obr_23_chargetoPractice.getMoc_1_monetaryAmount().getMo_2_denomination());
		this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe1_Identifier().setValue(obr_23_chargetoPractice.getMoc_2_chargeCode().getCe_1_identifier());
		this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe2_Text().setValue(obr_23_chargetoPractice.getMoc_2_chargeCode().getCe_2_text());
		this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe3_NameOfCodingSystem().setValue(obr_23_chargetoPractice.getMoc_2_chargeCode().getCe_3_nameOfCodingSystem());
		this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe4_AlternateIdentifier().setValue(obr_23_chargetoPractice.getMoc_2_chargeCode().getCe_4_alternateIdentifier());
		this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe5_AlternateText().setValue(obr_23_chargetoPractice.getMoc_2_chargeCode().getCe_5_alternateText());
		this.obr.getObr23_ChargeToPractice().getMoc2_ChargeCode().getCe6_NameOfAlternateCodingSystem().setValue(obr_23_chargetoPractice.getMoc_2_chargeCode().getCe_6_nameOfAlternateCodingSystem());
		this.obr_23_chargetoPractice = obr_23_chargetoPractice;
	}
	/**
	 * @return the obr_24_diagnosticServSectID
	 */
	
	@JsonProperty("obr_24_diagnosticServSectID")
	public String getObr_24_diagnosticServSectID() {
		return this.obr.getObr24_DiagnosticServSectID().getValue();
	}
	/**
	 * @param obr_24_diagnosticServSectID the obr_24_diagnosticServSectID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_24_diagnosticServSectID")
	public void setObr_24_diagnosticServSectID(String obr_24_diagnosticServSectID) throws DataTypeException {
		this.obr.getObr24_DiagnosticServSectID().setValue(obr_24_diagnosticServSectID);
		this.obr_24_diagnosticServSectID = obr_24_diagnosticServSectID;
	}
	/**
	 * @return the obr_25_resultStatus
	 */
	
	@JsonProperty("obr_25_resultStatus")
	public String getObr_25_resultStatus() {
		return this.obr.getObr25_ResultStatus().getValue();
	}
	/**
	 * @param obr_25_resultStatus the obr_25_resultStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_25_resultStatus")
	public void setObr_25_resultStatus(String obr_25_resultStatus) throws DataTypeException {
		this.obr.getObr25_ResultStatus().setValue(obr_25_resultStatus);
		this.obr_25_resultStatus = obr_25_resultStatus;
	}
	/**
	 * @return the obr_26_parentResult
	 */
	
	@JsonProperty("obr_26_parentResult")
	public PRL_v25 getObr_26_parentResult() {
		return new PRL_v25(
				new CE_v2(
						this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe1_Identifier().getValue(),
						this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe2_Text().getValue(),
						this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe3_NameOfCodingSystem().getValue(),
						this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe4_AlternateIdentifier().getValue(),
						this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe5_AlternateText().getValue(),
						this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe6_NameOfAlternateCodingSystem().getValue()),
				this.obr.getObr26_ParentResult().getPrl2_ParentObservationSubIdentifier().getValue(),
				this.obr.getObr26_ParentResult().getPrl3_ParentObservationValueDescriptor().getValue());
	}
	/**
	 * @param obr_26_parentResult the obr_26_parentResult to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_26_parentResult")
	public void setObr_26_parentResult(PRL_v25 obr_26_parentResult) throws DataTypeException {
		this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe1_Identifier().setValue(obr_26_parentResult.getPrl_1_parentObservationIdentifier().getCe_1_identifier());
		this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe2_Text().setValue(obr_26_parentResult.getPrl_1_parentObservationIdentifier().getCe_2_text());
		this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe3_NameOfCodingSystem().setValue(obr_26_parentResult.getPrl_1_parentObservationIdentifier().getCe_3_nameOfCodingSystem());
		this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe4_AlternateIdentifier().setValue(obr_26_parentResult.getPrl_1_parentObservationIdentifier().getCe_4_alternateIdentifier());
		this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe5_AlternateText().setValue(obr_26_parentResult.getPrl_1_parentObservationIdentifier().getCe_5_alternateText());
		this.obr.getObr26_ParentResult().getPrl1_ParentObservationIdentifier().getCe6_NameOfAlternateCodingSystem().setValue(obr_26_parentResult.getPrl_1_parentObservationIdentifier().getCe_6_nameOfAlternateCodingSystem());
		this.obr.getObr26_ParentResult().getPrl2_ParentObservationSubIdentifier().setValue(obr_26_parentResult.getPrl_2_parentObservationSubidentifier());
		this.obr.getObr26_ParentResult().getPrl3_ParentObservationValueDescriptor().setValue(obr_26_parentResult.getPrl_3_parentObservationValueDescriptor());
		this.obr_26_parentResult = obr_26_parentResult;
	}
	/**
	 * @return the obr_27_quantityTiming
	 */
	
	@JsonProperty("obr_27_quantityTiming")
	public TQ_v25[] getObr_27_quantityTiming() {
		TQ_v25[] quantityTiming = new TQ_v25[this.obr.getObr27_QuantityTiming().length];
		for(int i = 0; i<this.obr.getObr27_QuantityTiming().length; i++) {
			quantityTiming[i] =	new TQ_v25(
					new CQ_v25(
							this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq1_Quantity().getValue(),
							new CE_v2(
									this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe1_Identifier().getValue(),
									this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe2_Text().getValue(), 
									this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe3_NameOfCodingSystem().getValue(), 
									this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe4_AlternateIdentifier().getValue(), 
									this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe5_AlternateText().getValue(), 
									this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe6_NameOfAlternateCodingSystem().getValue())),
					new RI_v2(
							this.obr.getObr27_QuantityTiming(i).getTq2_Interval().getRi1_RepeatPattern().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq2_Interval().getRi2_ExplicitTimeInterval().getValue()), 
					this.obr.getObr27_QuantityTiming(i).getTq3_Duration().getValue(), 
					new TS_v2(
							this.obr.getObr27_QuantityTiming(i).getTq4_StartDateTime().getTs1_Time().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq4_StartDateTime().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.obr.getObr27_QuantityTiming(i).getTq5_EndDateTime().getTs1_Time().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq5_EndDateTime().getTs2_DegreeOfPrecision().getValue()), 
					this.obr.getObr27_QuantityTiming(i).getTq6_Priority().getValue(), 
					this.obr.getObr27_QuantityTiming(i).getTq7_Condition().getValue(), 
					this.obr.getObr27_QuantityTiming(i).getTq8_Text().getValue(), 
					this.obr.getObr27_QuantityTiming(i).getTq9_Conjunction().getValue(), 
					new OSD_V25(
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd1_SequenceResultsFlag().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd2_PlacerOrderNumberEntityIdentifier().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd3_PlacerOrderNumberNamespaceID().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd4_FillerOrderNumberEntityIdentifier().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd5_FillerOrderNumberNamespaceID().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd6_SequenceConditionValue().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd7_MaximumNumberOfRepeats().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd8_PlacerOrderNumberUniversalID().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd9_PlacerOrderNumberUniversalIDType().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd10_FillerOrderNumberUniversalID().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd11_FillerOrderNumberUniversalIDType().getValue()), 
					new CE_v2(
							this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe1_Identifier().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe2_Text().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe3_NameOfCodingSystem().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe4_AlternateIdentifier().getValue(),
							this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe5_AlternateText().getValue(), 
							this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe6_NameOfAlternateCodingSystem().getValue()), 
					this.obr.getObr27_QuantityTiming(i).getTq12_TotalOccurrences().getValue());
		}
		return quantityTiming;
	}
	/**
	 * @param obr_27_quantityTiming the obr_27_quantityTiming to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_27_quantityTiming")
	public void setObr_27_quantityTiming(TQ_v25[] obr_27_quantityTiming) throws DataTypeException {
		for(int i = 0; i<this.obr.getObr27_QuantityTiming().length; i++) {
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq1_Quantity().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_1_quantity());
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe1_Identifier().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_1_identifier());
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe2_Text().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_2_text());
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe3_NameOfCodingSystem().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_3_nameOfCodingSystem());
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe4_AlternateIdentifier().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_4_alternateIdentifier());
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe5_AlternateText().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_5_alternateText());
			this.obr.getObr27_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe6_NameOfAlternateCodingSystem().setValue(obr_27_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_6_nameOfAlternateCodingSystem());
			this.obr.getObr27_QuantityTiming(i).getTq2_Interval().getRi1_RepeatPattern().setValue(obr_27_quantityTiming[i].getTq_2_interval().getRi_1_repeatPattern());
			this.obr.getObr27_QuantityTiming(i).getTq2_Interval().getRi2_ExplicitTimeInterval().setValue(obr_27_quantityTiming[i].getTq_2_interval().getRi_2_explicitTimeInterval());
			this.obr.getObr27_QuantityTiming(i).getTq3_Duration().setValue(obr_27_quantityTiming[i].getTq_3_duration());
			this.obr.getObr27_QuantityTiming(i).getTq4_StartDateTime().getTs1_Time().setValue(obr_27_quantityTiming[i].getTq_4_startDateTime().getTs_1_time());
			this.obr.getObr27_QuantityTiming(i).getTq4_StartDateTime().getTs2_DegreeOfPrecision().setValue(obr_27_quantityTiming[i].getTq_4_startDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr27_QuantityTiming(i).getTq5_EndDateTime().getTs1_Time().setValue(obr_27_quantityTiming[i].getTq_5_endDateTime().getTs_1_time());
			this.obr.getObr27_QuantityTiming(i).getTq5_EndDateTime().getTs2_DegreeOfPrecision().setValue(obr_27_quantityTiming[i].getTq_5_endDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr27_QuantityTiming(i).getTq6_Priority().setValue(obr_27_quantityTiming[i].getTq_6_priority());
			this.obr.getObr27_QuantityTiming(i).getTq7_Condition().setValue(obr_27_quantityTiming[i].getTq_7_condition());
			this.obr.getObr27_QuantityTiming(i).getTq8_Text().setValue(obr_27_quantityTiming[i].getTq_8_text());
			this.obr.getObr27_QuantityTiming(i).getTq9_Conjunction().setValue(obr_27_quantityTiming[i].getTq_9_conjunction());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd1_SequenceResultsFlag().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_1_sequenceResultsFlag());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd2_PlacerOrderNumberEntityIdentifier().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_2_placerOrderNumber());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd3_PlacerOrderNumberNamespaceID().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_3_placerOrderNumberNamespaceId());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd4_FillerOrderNumberEntityIdentifier().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_4_fillerOrderNumber());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd5_FillerOrderNumberNamespaceID().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_5_fillerOrderNumber());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd6_SequenceConditionValue().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_6_sequenceConditionValue());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd7_MaximumNumberOfRepeats().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_7_maximumNumberOfRepeats());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd8_PlacerOrderNumberUniversalID().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_8_placerOrderNumber());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd9_PlacerOrderNumberUniversalIDType().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_9_placerOrderNumber());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd10_FillerOrderNumberUniversalID().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_10_fillerOrderNumberUniversalID());
			this.obr.getObr27_QuantityTiming(i).getTq10_OrderSequencing().getOsd11_FillerOrderNumberUniversalIDType().setValue(obr_27_quantityTiming[i].getTq_10_orderSequencing().getOsd_11_fillerOrderNumberUniversalIDType());
			this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe1_Identifier().setValue(obr_27_quantityTiming[i].getTq_11_occurrenceDuration().getCe_1_identifier());
			this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe2_Text().setValue(obr_27_quantityTiming[i].getTq_11_occurrenceDuration().getCe_2_text());
			this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe3_NameOfCodingSystem().setValue(obr_27_quantityTiming[i].getTq_11_occurrenceDuration().getCe_3_nameOfCodingSystem());
			this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe4_AlternateIdentifier().setValue(obr_27_quantityTiming[i].getTq_11_occurrenceDuration().getCe_4_alternateIdentifier());
			this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe5_AlternateText().setValue(obr_27_quantityTiming[i].getTq_11_occurrenceDuration().getCe_5_alternateText());
			this.obr.getObr27_QuantityTiming(i).getTq11_OccurrenceDuration().getCe6_NameOfAlternateCodingSystem().setValue(obr_27_quantityTiming[i].getTq_11_occurrenceDuration().getCe_6_nameOfAlternateCodingSystem());
			this.obr.getObr27_QuantityTiming(i).getTq12_TotalOccurrences().setValue(obr_27_quantityTiming[i].getTq_12_totalOccurrences());
		}
		this.obr_27_quantityTiming = obr_27_quantityTiming;
	}
	/**
	 * @return the obr_28_resultCopiesTo
	 */
	
	@JsonProperty("obr_28_resultCopiesTo")
	public XCN_v25[] getObr_28_resultCopiesTo() {
	XCN_v25[] orderingProvider = new XCN_v25[this.obr.getObr28_ResultCopiesTo().length];
	for(int i = 0; i<this.obr.getObr28_ResultCopiesTo().length;i++) {
		orderingProvider[i] = new XCN_v25(
				this.obr.getObr28_ResultCopiesTo(i).getXcn1_IDNumber().getValue(),
				new FN_v25(
						this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
				this.obr.getObr28_ResultCopiesTo(i).getXcn3_GivenName().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn5_SuffixEgJRorIII().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn6_PrefixEgDR().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn7_DegreeEgMD().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn8_SourceTable().getValue(),
				new HD_v2(
						this.obr.getObr28_ResultCopiesTo(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
				this.obr.getObr28_ResultCopiesTo(i).getXcn10_NameTypeCode().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn11_IdentifierCheckDigit().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn12_CheckDigitScheme().getValue(),
				this.obr.getObr28_ResultCopiesTo(i).getXcn13_IdentifierTypeCode().getValue(),
				new HD_v2(
						this.obr.getObr28_ResultCopiesTo(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
				this.obr.getObr28_ResultCopiesTo(i).getXcn15_NameRepresentationCode().getValue(),
				new CE_v2(
						this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe2_Text().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
				new DR_v2(
						new TS_v2(
								this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
								this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
						new TS_v2(
								this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
								this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
				this.obr.getObr28_ResultCopiesTo(i).getXcn18_NameAssemblyOrder().getValue(),
				new TS_v2(
						this.obr.getObr28_ResultCopiesTo(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
				new TS_v2(
						this.obr.getObr28_ResultCopiesTo(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
				this.obr.getObr28_ResultCopiesTo(i).getXcn21_ProfessionalSuffix().getValue(),
				new CWE_v25(
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
				new CWE_v25(
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
						this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
		return orderingProvider;
	}
	/**
	 * @param obr_28_resultCopiesTo the obr_28_resultCopiesTo to set
	 * @JsonProperty("obr_28_resultCopiesTo")
	 * @throws DataTypeException 
	 */
	public void setObr_28_resultCopiesTo(XCN_v25[] obr_28_resultCopiesTo) throws DataTypeException {
		for(int i = 0; i<obr_28_resultCopiesTo.length;i++) {
			this.obr.getObr28_ResultCopiesTo(i).getXcn1_IDNumber().setValue(obr_28_resultCopiesTo[i].getXcn_1_idNumber());
			this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn1_Surname().setValue(obr_28_resultCopiesTo[i].getXcn_2_familyName().getFn_1_surname());
			this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(obr_28_resultCopiesTo[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(obr_28_resultCopiesTo[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(obr_28_resultCopiesTo[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.obr.getObr28_ResultCopiesTo(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(obr_28_resultCopiesTo[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.obr.getObr28_ResultCopiesTo(i).getXcn3_GivenName().setValue(obr_28_resultCopiesTo[i].getXcn_3_givenName());
			this.obr.getObr28_ResultCopiesTo(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_28_resultCopiesTo[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obr.getObr28_ResultCopiesTo(i).getXcn5_SuffixEgJRorIII().setValue(obr_28_resultCopiesTo[i].getXcn_5_suffixegJrOrIii());
			this.obr.getObr28_ResultCopiesTo(i).getXcn6_PrefixEgDR().setValue(obr_28_resultCopiesTo[i].getXcn_6_prefixegDr());
			this.obr.getObr28_ResultCopiesTo(i).getXcn7_DegreeEgMD().setValue(obr_28_resultCopiesTo[i].getXcn_7_degreeegMd());
			this.obr.getObr28_ResultCopiesTo(i).getXcn8_SourceTable().setValue(obr_28_resultCopiesTo[i].getXcn_8_sourceTable());
			this.obr.getObr28_ResultCopiesTo(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(obr_28_resultCopiesTo[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(obr_28_resultCopiesTo[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(obr_28_resultCopiesTo[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.obr.getObr28_ResultCopiesTo(i).getXcn10_NameTypeCode().setValue(obr_28_resultCopiesTo[i].getXcn_10_nameTypeCode());
			this.obr.getObr28_ResultCopiesTo(i).getXcn11_IdentifierCheckDigit().setValue(obr_28_resultCopiesTo[i].getXcn_11_identifierCheckDigit());
			this.obr.getObr28_ResultCopiesTo(i).getXcn12_CheckDigitScheme().setValue(obr_28_resultCopiesTo[i].getXcn_12_checkDigitScheme());
			this.obr.getObr28_ResultCopiesTo(i).getXcn13_IdentifierTypeCode().setValue(obr_28_resultCopiesTo[i].getXcn_13_identifierTypeCode());
			this.obr.getObr28_ResultCopiesTo(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(obr_28_resultCopiesTo[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(obr_28_resultCopiesTo[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(obr_28_resultCopiesTo[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.obr.getObr28_ResultCopiesTo(i).getXcn15_NameRepresentationCode().setValue(obr_28_resultCopiesTo[i].getXcn_15_nameRepresentationCode());
			this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe1_Identifier().setValue(obr_28_resultCopiesTo[i].getXcn_16_nameContext().getCe_1_identifier());
			this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe2_Text().setValue(obr_28_resultCopiesTo[i].getXcn_16_nameContext().getCe_2_text());
			this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(obr_28_resultCopiesTo[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(obr_28_resultCopiesTo[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe5_AlternateText().setValue(obr_28_resultCopiesTo[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.obr.getObr28_ResultCopiesTo(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(obr_28_resultCopiesTo[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(obr_28_resultCopiesTo[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(obr_28_resultCopiesTo[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(obr_28_resultCopiesTo[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.obr.getObr28_ResultCopiesTo(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(obr_28_resultCopiesTo[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr28_ResultCopiesTo(i).getXcn18_NameAssemblyOrder().setValue(obr_28_resultCopiesTo[i].getXcn_18_nameAssemblyOrder());
			this.obr.getObr28_ResultCopiesTo(i).getXcn19_EffectiveDate().getTs1_Time().setValue(obr_28_resultCopiesTo[i].getXcn_19_effectiveDate().getTs_1_time());
			this.obr.getObr28_ResultCopiesTo(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(obr_28_resultCopiesTo[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.obr.getObr28_ResultCopiesTo(i).getXcn20_ExpirationDate().getTs1_Time().setValue(obr_28_resultCopiesTo[i].getXcn_20_expirationDate().getTs_1_time());
			this.obr.getObr28_ResultCopiesTo(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(obr_28_resultCopiesTo[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.obr.getObr28_ResultCopiesTo(i).getXcn21_ProfessionalSuffix().setValue(obr_28_resultCopiesTo[i].getXcn_21_professionalSuffix());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obr.getObr28_ResultCopiesTo(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(obr_28_resultCopiesTo[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.obr_28_resultCopiesTo = obr_28_resultCopiesTo;
	}
	/**
	 * @return the obr_29_parent
	 */
	
	@JsonProperty("obr_29_parent")
	public EIP_v25 getObr_29_parent() {
		return new EIP_v25(
				new EI_v2(
						this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().getValue(), 
						this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().getValue(), 
						this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().getValue(),
						this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().getValue()),
				new EI_v2(
						this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
						this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().getValue(),
						this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi3_UniversalID().getValue(),
						this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().getValue()));
	}
	/**
	 * @param obr_29_parent the obr_29_parent to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_29_parent")
	public void setObr_29_parent(EIP_v25 obr_29_parent) throws DataTypeException {
		this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().setValue(obr_29_parent.getEip_1_placerAssignedIdentifier().getEi_1_entityIdentifier()); 
		this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().setValue(obr_29_parent.getEip_1_placerAssignedIdentifier().getEi_2_namespaceId());
		this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().setValue(obr_29_parent.getEip_1_placerAssignedIdentifier().getEi_3_universalId());
		this.obr.getObr29_ParentNumber().getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().setValue(obr_29_parent.getEip_1_placerAssignedIdentifier().getEi_4_universalIdType());
		this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().setValue(obr_29_parent.getEip_2_fillerAssignedIdentifier().getEi_1_entityIdentifier());
		this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().setValue(obr_29_parent.getEip_2_fillerAssignedIdentifier().getEi_2_namespaceId());
		this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi3_UniversalID().setValue(obr_29_parent.getEip_2_fillerAssignedIdentifier().getEi_3_universalId());
		this.obr.getObr29_ParentNumber().getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().setValue(obr_29_parent.getEip_2_fillerAssignedIdentifier().getEi_4_universalIdType());
		this.obr_29_parent = obr_29_parent;
	}
	/**
	 * @return the obr_30_transportationMode
	 */
	
	@JsonProperty("obr_30_transportationMode")
	public String getObr_30_transportationMode() {
		return this.obr.getObr30_TransportationMode().getValue();
	}
	/**
	 * @param obr_30_transportationMode the obr_30_transportationMode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_30_transportationMode")
	public void setObr_30_transportationMode(String obr_30_transportationMode) throws DataTypeException {
		this.obr.getObr30_TransportationMode().setValue(obr_30_transportationMode);
		this.obr_30_transportationMode = obr_30_transportationMode;
	}
	/**
	 * @return the obr_31_reasonforStudy
	 */
	
	@JsonProperty("obr_31_reasonforStudy")
	public CE_v2[] getObr_31_reasonforStudy() {
		CE_v2[] reasonforStudy = new CE_v2[this.obr.getObr31_ReasonForStudy().length];
		for(int i =0; i <this.obr.getObr31_ReasonForStudy().length;i++) {
			reasonforStudy[i] = new CE_v2(
					this.obr.getObr31_ReasonForStudy(i).getCe1_Identifier().getValue(),
					this.obr.getObr31_ReasonForStudy(i).getCe2_Text().getValue(), 
					this.obr.getObr31_ReasonForStudy(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr31_ReasonForStudy(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr31_ReasonForStudy(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr31_ReasonForStudy(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return reasonforStudy;
	}
	/**
	 * @param obr_31_reasonforStudy the obr_31_reasonforStudy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_31_reasonforStudy")
	public void setObr_31_reasonforStudy(CE_v2[] obr_31_reasonforStudy) throws DataTypeException {
		for(int i =0; i <obr_31_reasonforStudy.length;i++) {
					this.obr.getObr31_ReasonForStudy(i).getCe1_Identifier().setValue(obr_31_reasonforStudy[i].getCe_1_identifier());
					this.obr.getObr31_ReasonForStudy(i).getCe2_Text().setValue(obr_31_reasonforStudy[i].getCe_2_text());
					this.obr.getObr31_ReasonForStudy(i).getCe3_NameOfCodingSystem().setValue(obr_31_reasonforStudy[i].getCe_3_nameOfCodingSystem());
					this.obr.getObr31_ReasonForStudy(i).getCe4_AlternateIdentifier().setValue(obr_31_reasonforStudy[i].getCe_4_alternateIdentifier());
					this.obr.getObr31_ReasonForStudy(i).getCe5_AlternateText().setValue(obr_31_reasonforStudy[i].getCe_5_alternateText());
					this.obr.getObr31_ReasonForStudy(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_31_reasonforStudy[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.obr_31_reasonforStudy = obr_31_reasonforStudy;
	}
	/**
	 * @return the obr_32_principalResultInterpreter
	 */
	
	@JsonProperty("obr_32_principalResultInterpreter")
	public NDL_v25 getObr_32_principalResultInterpreter() {
		return new NDL_v25(
				new CNN_v25(
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn1_IDNumber().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn2_FamilyName().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn3_GivenName().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().getValue(), 
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn6_PrefixEgDR().getValue(), 
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn7_DegreeEgMD().getValue(), 
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn8_SourceTable().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().getValue()),
				new TS_v2(
						this.obr.getObr32_PrincipalResultInterpreter().getNdl2_StartDateTime().getTs1_Time().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl2_StartDateTime().getTs2_DegreeOfPrecision().getValue()),
				new TS_v2(
						this.obr.getObr32_PrincipalResultInterpreter().getNdl3_EndDateTime().getTs1_Time().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl3_EndDateTime().getTs2_DegreeOfPrecision().getValue()),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl4_PointOfCare().getValue(),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl5_Room().getValue(),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl6_Bed().getValue(),
				new HD_v2(
						this.obr.getObr32_PrincipalResultInterpreter().getNdl7_Facility().getHd1_NamespaceID().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl7_Facility().getHd2_UniversalID().getValue(),
						this.obr.getObr32_PrincipalResultInterpreter().getNdl7_Facility().getHd3_UniversalIDType().getValue()),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl8_LocationStatus().getValue(),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl9_PatientLocationType().getValue(),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl10_Building().getValue(),
				this.obr.getObr32_PrincipalResultInterpreter().getNdl11_Floor().getValue());
	}
	/**
	 * @param obr_32_principalResultInterpreter the obr_32_principalResultInterpreter to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_32_principalResultInterpreter")
	public void setObr_32_principalResultInterpreter(NDL_v25 obr_32_principalResultInterpreter) throws DataTypeException {
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn1_IDNumber().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_1_idNumber());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn2_FamilyName().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_2_familyName());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn3_GivenName().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_3_givenName());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_5_suffix());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn6_PrefixEgDR().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_6_prefix());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn7_DegreeEgMD().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_7_degree());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn8_SourceTable().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_8_sourceTable());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_9_assigningAuthorityNamespaceId());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_10_assigningAuthorityUniversalId());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().setValue(obr_32_principalResultInterpreter.getNdl_1_name().getCnn_11_assigningAuthorityUniversalIdType());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl2_StartDateTime().getTs1_Time().setValue(obr_32_principalResultInterpreter.getNdl_2_startDateTime().getTs_1_time());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl2_StartDateTime().getTs2_DegreeOfPrecision().setValue(obr_32_principalResultInterpreter.getNdl_2_startDateTime().getTs_2_degreeOfPrecision());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl3_EndDateTime().getTs1_Time().setValue(obr_32_principalResultInterpreter.getNdl_3_endDateTime().getTs_1_time());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl3_EndDateTime().getTs2_DegreeOfPrecision().setValue(obr_32_principalResultInterpreter.getNdl_3_endDateTime().getTs_2_degreeOfPrecision());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl4_PointOfCare().setValue(obr_32_principalResultInterpreter.getNdl_4_pointOfCare());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl5_Room().setValue(obr_32_principalResultInterpreter.getNdl_5_room());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl6_Bed().setValue(obr_32_principalResultInterpreter.getNdl_6_bed());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl7_Facility().getHd1_NamespaceID().setValue(obr_32_principalResultInterpreter.getNdl_7_facility().getHd_1_namespaceId());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl7_Facility().getHd2_UniversalID().setValue(obr_32_principalResultInterpreter.getNdl_7_facility().getHd_2_universalId());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl7_Facility().getHd3_UniversalIDType().setValue(obr_32_principalResultInterpreter.getNdl_7_facility().getHd_3_universalIdType());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl8_LocationStatus().setValue(obr_32_principalResultInterpreter.getNdl_8_locationStatus());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl9_PatientLocationType().setValue(obr_32_principalResultInterpreter.getNdl_9_patientLocationType());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl10_Building().setValue(obr_32_principalResultInterpreter.getNdl_10_building());
		this.obr.getObr32_PrincipalResultInterpreter().getNdl11_Floor().setValue(obr_32_principalResultInterpreter.getNdl_11_floor());
		this.obr_32_principalResultInterpreter = obr_32_principalResultInterpreter;
	}
	/**
	 * @return the obr_33_assistantResultInterpreter
	 */
	
	@JsonProperty("obr_33_assistantResultInterpreter")
	public NDL_v25[] getObr_33_assistantResultInterpreter() {
		NDL_v25[] assistantResultInterpreter = new NDL_v25[this.obr.getObr33_AssistantResultInterpreter().length];
		for(int i = 0; i<this.obr.getObr33_AssistantResultInterpreter().length;i++) {
			assistantResultInterpreter[i] = new NDL_v25(
					new CNN_v25(
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn1_IDNumber().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn2_FamilyName().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn3_GivenName().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(), 
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn6_PrefixEgDR().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn7_DegreeEgMD().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn8_SourceTable().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().getValue()),
					new TS_v2(
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl2_StartDateTime().getTs1_Time().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl2_StartDateTime().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl3_EndDateTime().getTs1_Time().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl3_EndDateTime().getTs2_DegreeOfPrecision().getValue()),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl4_PointOfCare().getValue(),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl5_Room().getValue(),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl6_Bed().getValue(),
					new HD_v2(
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl7_Facility().getHd1_NamespaceID().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl7_Facility().getHd2_UniversalID().getValue(),
							this.obr.getObr33_AssistantResultInterpreter(i).getNdl7_Facility().getHd3_UniversalIDType().getValue()),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl8_LocationStatus().getValue(),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl9_PatientLocationType().getValue(),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl10_Building().getValue(),
					this.obr.getObr33_AssistantResultInterpreter(i).getNdl11_Floor().getValue());
		}
		return assistantResultInterpreter;
	}
	/**
	 * @param obr_33_assistantResultInterpreter the obr_33_assistantResultInterpreter to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_33_assistantResultInterpreter")
	public void setObr_33_assistantResultInterpreter(NDL_v25[] obr_33_assistantResultInterpreter) throws DataTypeException {
		for(int i = 0; i<obr_33_assistantResultInterpreter.length;i++) {
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn1_IDNumber().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_1_idNumber());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn2_FamilyName().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_2_familyName());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn3_GivenName().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_3_givenName());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_5_suffix());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn6_PrefixEgDR().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_6_prefix());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn7_DegreeEgMD().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_7_degree());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn8_SourceTable().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_8_sourceTable());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_9_assigningAuthorityNamespaceId());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_10_assigningAuthorityUniversalId());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().setValue(obr_33_assistantResultInterpreter[i].getNdl_1_name().getCnn_11_assigningAuthorityUniversalIdType());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl2_StartDateTime().getTs1_Time().setValue(obr_33_assistantResultInterpreter[i].getNdl_2_startDateTime().getTs_1_time());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl2_StartDateTime().getTs2_DegreeOfPrecision().setValue(obr_33_assistantResultInterpreter[i].getNdl_2_startDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl3_EndDateTime().getTs1_Time().setValue(obr_33_assistantResultInterpreter[i].getNdl_3_endDateTime().getTs_1_time());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl3_EndDateTime().getTs2_DegreeOfPrecision().setValue(obr_33_assistantResultInterpreter[i].getNdl_3_endDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl4_PointOfCare().setValue(obr_33_assistantResultInterpreter[i].getNdl_4_pointOfCare());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl5_Room().setValue(obr_33_assistantResultInterpreter[i].getNdl_5_room());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl6_Bed().setValue(obr_33_assistantResultInterpreter[i].getNdl_6_bed());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl7_Facility().getHd1_NamespaceID().setValue(obr_33_assistantResultInterpreter[i].getNdl_7_facility().getHd_1_namespaceId());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl7_Facility().getHd2_UniversalID().setValue(obr_33_assistantResultInterpreter[i].getNdl_7_facility().getHd_2_universalId());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl7_Facility().getHd3_UniversalIDType().setValue(obr_33_assistantResultInterpreter[i].getNdl_7_facility().getHd_3_universalIdType());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl8_LocationStatus().setValue(obr_33_assistantResultInterpreter[i].getNdl_8_locationStatus());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl9_PatientLocationType().setValue(obr_33_assistantResultInterpreter[i].getNdl_9_patientLocationType());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl10_Building().setValue(obr_33_assistantResultInterpreter[i].getNdl_10_building());
			this.obr.getObr33_AssistantResultInterpreter(i).getNdl11_Floor().setValue(obr_33_assistantResultInterpreter[i].getNdl_11_floor());
		}
		this.obr_33_assistantResultInterpreter = obr_33_assistantResultInterpreter;
	}
	/**
	 * @return the obr_34_technician
	 */
	
	@JsonProperty("obr_34_technician")
	public NDL_v25[] getObr_34_technician() {
		NDL_v25[] technician = new NDL_v25[this.obr.getObr34_Technician().length];
		for(int i = 0; i<this.obr.getObr34_Technician().length;i++) {
			technician[i] = new NDL_v25(
					new CNN_v25(
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn1_IDNumber().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn2_FamilyName().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn3_GivenName().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(), 
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn6_PrefixEgDR().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn7_DegreeEgMD().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn8_SourceTable().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().getValue(),
							this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().getValue()),
					new TS_v2(
							this.obr.getObr34_Technician(i).getNdl2_StartDateTime().getTs1_Time().getValue(),
							this.obr.getObr34_Technician(i).getNdl2_StartDateTime().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.obr.getObr34_Technician(i).getNdl3_EndDateTime().getTs1_Time().getValue(),
							this.obr.getObr34_Technician(i).getNdl3_EndDateTime().getTs2_DegreeOfPrecision().getValue()),
					this.obr.getObr34_Technician(i).getNdl4_PointOfCare().getValue(),
					this.obr.getObr34_Technician(i).getNdl5_Room().getValue(),
					this.obr.getObr34_Technician(i).getNdl6_Bed().getValue(),
					new HD_v2(
							this.obr.getObr34_Technician(i).getNdl7_Facility().getHd1_NamespaceID().getValue(),
							this.obr.getObr34_Technician(i).getNdl7_Facility().getHd2_UniversalID().getValue(),
							this.obr.getObr34_Technician(i).getNdl7_Facility().getHd3_UniversalIDType().getValue()),
					this.obr.getObr34_Technician(i).getNdl8_LocationStatus().getValue(),
					this.obr.getObr34_Technician(i).getNdl9_PatientLocationType().getValue(),
					this.obr.getObr34_Technician(i).getNdl10_Building().getValue(),
					this.obr.getObr34_Technician(i).getNdl11_Floor().getValue());
		}
		return technician;
	}
	/**
	 * @param obr_34_technician the obr_34_technician to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_34_technician")
	public void setObr_34_technician(NDL_v25[] obr_34_technician) throws DataTypeException {
		for(int i = 0; i<obr_34_technician.length;i++) {
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn1_IDNumber().setValue(obr_34_technician[i].getNdl_1_name().getCnn_1_idNumber());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn2_FamilyName().setValue(obr_34_technician[i].getNdl_1_name().getCnn_2_familyName());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn3_GivenName().setValue(obr_34_technician[i].getNdl_1_name().getCnn_3_givenName());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_34_technician[i].getNdl_1_name().getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().setValue(obr_34_technician[i].getNdl_1_name().getCnn_5_suffix());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn6_PrefixEgDR().setValue(obr_34_technician[i].getNdl_1_name().getCnn_6_prefix());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn7_DegreeEgMD().setValue(obr_34_technician[i].getNdl_1_name().getCnn_7_degree());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn8_SourceTable().setValue(obr_34_technician[i].getNdl_1_name().getCnn_8_sourceTable());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().setValue(obr_34_technician[i].getNdl_1_name().getCnn_9_assigningAuthorityNamespaceId());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().setValue(obr_34_technician[i].getNdl_1_name().getCnn_10_assigningAuthorityUniversalId());
			this.obr.getObr34_Technician(i).getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().setValue(obr_34_technician[i].getNdl_1_name().getCnn_11_assigningAuthorityUniversalIdType());
			this.obr.getObr34_Technician(i).getNdl2_StartDateTime().getTs1_Time().setValue(obr_34_technician[i].getNdl_2_startDateTime().getTs_1_time());
			this.obr.getObr34_Technician(i).getNdl2_StartDateTime().getTs2_DegreeOfPrecision().setValue(obr_34_technician[i].getNdl_2_startDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr34_Technician(i).getNdl3_EndDateTime().getTs1_Time().setValue(obr_34_technician[i].getNdl_3_endDateTime().getTs_1_time());
			this.obr.getObr34_Technician(i).getNdl3_EndDateTime().getTs2_DegreeOfPrecision().setValue(obr_34_technician[i].getNdl_3_endDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr34_Technician(i).getNdl4_PointOfCare().setValue(obr_34_technician[i].getNdl_4_pointOfCare());
			this.obr.getObr34_Technician(i).getNdl5_Room().setValue(obr_34_technician[i].getNdl_5_room());
			this.obr.getObr34_Technician(i).getNdl6_Bed().setValue(obr_34_technician[i].getNdl_6_bed());
			this.obr.getObr34_Technician(i).getNdl7_Facility().getHd1_NamespaceID().setValue(obr_34_technician[i].getNdl_7_facility().getHd_1_namespaceId());
			this.obr.getObr34_Technician(i).getNdl7_Facility().getHd2_UniversalID().setValue(obr_34_technician[i].getNdl_7_facility().getHd_2_universalId());
			this.obr.getObr34_Technician(i).getNdl7_Facility().getHd3_UniversalIDType().setValue(obr_34_technician[i].getNdl_7_facility().getHd_3_universalIdType());
			this.obr.getObr34_Technician(i).getNdl8_LocationStatus().setValue(obr_34_technician[i].getNdl_8_locationStatus());
			this.obr.getObr34_Technician(i).getNdl9_PatientLocationType().setValue(obr_34_technician[i].getNdl_9_patientLocationType());
			this.obr.getObr34_Technician(i).getNdl10_Building().setValue(obr_34_technician[i].getNdl_10_building());
			this.obr.getObr34_Technician(i).getNdl11_Floor().setValue(obr_34_technician[i].getNdl_11_floor());
		}
		this.obr_34_technician = obr_34_technician;
	}
	/**
	 * @return the obr_35_transcriptionist
	 */
	
	@JsonProperty("obr_35_transcriptionist")
	public NDL_v25[] getObr_35_transcriptionist() {
		NDL_v25[] transcriptionist = new NDL_v25[this.obr.getObr35_Transcriptionist().length];
		for(int i = 0; i<this.obr.getObr35_Transcriptionist().length;i++) {
			transcriptionist[i] = new NDL_v25(
					new CNN_v25(
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn1_IDNumber().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn2_FamilyName().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn3_GivenName().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(), 
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn6_PrefixEgDR().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn7_DegreeEgMD().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn8_SourceTable().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().getValue()),
					new TS_v2(
							this.obr.getObr35_Transcriptionist(i).getNdl2_StartDateTime().getTs1_Time().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl2_StartDateTime().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.obr.getObr35_Transcriptionist(i).getNdl3_EndDateTime().getTs1_Time().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl3_EndDateTime().getTs2_DegreeOfPrecision().getValue()),
					this.obr.getObr35_Transcriptionist(i).getNdl4_PointOfCare().getValue(),
					this.obr.getObr35_Transcriptionist(i).getNdl5_Room().getValue(),
					this.obr.getObr35_Transcriptionist(i).getNdl6_Bed().getValue(),
					new HD_v2(
							this.obr.getObr35_Transcriptionist(i).getNdl7_Facility().getHd1_NamespaceID().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl7_Facility().getHd2_UniversalID().getValue(),
							this.obr.getObr35_Transcriptionist(i).getNdl7_Facility().getHd3_UniversalIDType().getValue()),
					this.obr.getObr35_Transcriptionist(i).getNdl8_LocationStatus().getValue(),
					this.obr.getObr35_Transcriptionist(i).getNdl9_PatientLocationType().getValue(),
					this.obr.getObr35_Transcriptionist(i).getNdl10_Building().getValue(),
					this.obr.getObr35_Transcriptionist(i).getNdl11_Floor().getValue());
		}
		return transcriptionist;
	}
	/**
	 * @param obr_35_transcriptionist the obr_35_transcriptionist to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_35_transcriptionist")
	public void setObr_35_transcriptionist(NDL_v25[] obr_35_transcriptionist) throws DataTypeException {
		for(int i = 0; i<obr_35_transcriptionist.length;i++) {
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn1_IDNumber().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_1_idNumber());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn2_FamilyName().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_2_familyName());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn3_GivenName().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_3_givenName());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn5_SuffixEgJRorIII().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_5_suffix());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn6_PrefixEgDR().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_6_prefix());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn7_DegreeEgMD().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_7_degree());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn8_SourceTable().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_8_sourceTable());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn9_AssigningAuthorityNamespaceID().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_9_assigningAuthorityNamespaceId());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn10_AssigningAuthorityUniversalID().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_10_assigningAuthorityUniversalId());
			this.obr.getObr35_Transcriptionist(i).getNdl1_NameOfPerson().getCnn11_AssigningAuthorityUniversalIDType().setValue(obr_35_transcriptionist[i].getNdl_1_name().getCnn_11_assigningAuthorityUniversalIdType());
			this.obr.getObr35_Transcriptionist(i).getNdl2_StartDateTime().getTs1_Time().setValue(obr_35_transcriptionist[i].getNdl_2_startDateTime().getTs_1_time());
			this.obr.getObr35_Transcriptionist(i).getNdl2_StartDateTime().getTs2_DegreeOfPrecision().setValue(obr_35_transcriptionist[i].getNdl_2_startDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr35_Transcriptionist(i).getNdl3_EndDateTime().getTs1_Time().setValue(obr_35_transcriptionist[i].getNdl_3_endDateTime().getTs_1_time());
			this.obr.getObr35_Transcriptionist(i).getNdl3_EndDateTime().getTs2_DegreeOfPrecision().setValue(obr_35_transcriptionist[i].getNdl_3_endDateTime().getTs_2_degreeOfPrecision());
			this.obr.getObr35_Transcriptionist(i).getNdl4_PointOfCare().setValue(obr_35_transcriptionist[i].getNdl_4_pointOfCare());
			this.obr.getObr35_Transcriptionist(i).getNdl5_Room().setValue(obr_35_transcriptionist[i].getNdl_5_room());
			this.obr.getObr35_Transcriptionist(i).getNdl6_Bed().setValue(obr_35_transcriptionist[i].getNdl_6_bed());
			this.obr.getObr35_Transcriptionist(i).getNdl7_Facility().getHd1_NamespaceID().setValue(obr_35_transcriptionist[i].getNdl_7_facility().getHd_1_namespaceId());
			this.obr.getObr35_Transcriptionist(i).getNdl7_Facility().getHd2_UniversalID().setValue(obr_35_transcriptionist[i].getNdl_7_facility().getHd_2_universalId());
			this.obr.getObr35_Transcriptionist(i).getNdl7_Facility().getHd3_UniversalIDType().setValue(obr_35_transcriptionist[i].getNdl_7_facility().getHd_3_universalIdType());
			this.obr.getObr35_Transcriptionist(i).getNdl8_LocationStatus().setValue(obr_35_transcriptionist[i].getNdl_8_locationStatus());
			this.obr.getObr35_Transcriptionist(i).getNdl9_PatientLocationType().setValue(obr_35_transcriptionist[i].getNdl_9_patientLocationType());
			this.obr.getObr35_Transcriptionist(i).getNdl10_Building().setValue(obr_35_transcriptionist[i].getNdl_10_building());
			this.obr.getObr35_Transcriptionist(i).getNdl11_Floor().setValue(obr_35_transcriptionist[i].getNdl_11_floor());
		}
		this.obr_35_transcriptionist = obr_35_transcriptionist;
	}
	/**
	 * @return the obr_36_scheduledDateTime
	 */
	
	@JsonProperty("obr_36_scheduledDateTime")
	public TS_v2 getObr_36_scheduledDateTime() {
		return new TS_v2(
				this.obr.getObr36_ScheduledDateTime().getTs1_Time().getValue(),
				this.obr.getObr36_ScheduledDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obr_36_scheduledDateTime the obr_36_scheduledDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_36_scheduledDateTime")
	public void setObr_36_scheduledDateTime(TS_v2 obr_36_scheduledDateTime) throws DataTypeException {
		this.obr.getObr36_ScheduledDateTime().getTs1_Time().setValue(obr_36_scheduledDateTime.getTs_1_time());
		this.obr.getObr36_ScheduledDateTime().getTs2_DegreeOfPrecision().setValue(obr_36_scheduledDateTime.getTs_2_degreeOfPrecision());
		this.obr_36_scheduledDateTime = obr_36_scheduledDateTime;
	}
	/**
	 * @return the obr_37_numberofSampleContainers
	 */
	
	@JsonProperty("obr_37_numberofSampleContainers")
	public String getObr_37_numberofSampleContainers() {
		return this.obr.getObr37_NumberOfSampleContainers().getValue();
	}
	/**
	 * @param obr_37_numberofSampleContainers the obr_37_numberofSampleContainers to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_37_numberofSampleContainers")
	public void setObr_37_numberofSampleContainers(String obr_37_numberofSampleContainers) throws DataTypeException {
		this.obr.getObr37_NumberOfSampleContainers().setValue(obr_37_numberofSampleContainers);
		this.obr_37_numberofSampleContainers = obr_37_numberofSampleContainers;
	}
	/**
	 * @return the obr_38_transportLogisticsofCollectedSample
	 */
	
	@JsonProperty("obr_38_transportLogisticsofCollectedSample")
	public CE_v2[] getObr_38_transportLogisticsofCollectedSample() {
		CE_v2[] transportLogisticsofCollectedSample = new CE_v2[this.obr.getObr38_TransportLogisticsOfCollectedSample().length];
		for(int i = 0; i<this.obr.getObr38_TransportLogisticsOfCollectedSample().length;i++) {
			transportLogisticsofCollectedSample[i] = new CE_v2(
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe1_Identifier().getValue(), 
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe2_Text().getValue(),
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return transportLogisticsofCollectedSample;
	}
	/**
	 * @param obr_38_transportLogisticsofCollectedSample the obr_38_transportLogisticsofCollectedSample to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_38_transportLogisticsofCollectedSample")
	public void setObr_38_transportLogisticsofCollectedSample(CE_v2[] obr_38_transportLogisticsofCollectedSample) throws DataTypeException {
		for(int i = 0; i<obr_38_transportLogisticsofCollectedSample.length;i++) {
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe1_Identifier().setValue(obr_38_transportLogisticsofCollectedSample[i].getCe_1_identifier()); 
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe2_Text().setValue(obr_38_transportLogisticsofCollectedSample[i].getCe_2_text());
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe3_NameOfCodingSystem().setValue(obr_38_transportLogisticsofCollectedSample[i].getCe_3_nameOfCodingSystem()); 
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe4_AlternateIdentifier().setValue(obr_38_transportLogisticsofCollectedSample[i].getCe_4_alternateIdentifier());
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe5_AlternateText().setValue(obr_38_transportLogisticsofCollectedSample[i].getCe_5_alternateText());
					this.obr.getObr38_TransportLogisticsOfCollectedSample(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_38_transportLogisticsofCollectedSample[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.obr_38_transportLogisticsofCollectedSample = obr_38_transportLogisticsofCollectedSample;
	}
	/**
	 * @return the obr_39_collectorsComment
	 */
	
	@JsonProperty("obr_39_collectorsComment")
	public CE_v2[] getObr_39_collectorsComment() {
		CE_v2[] collectorsComment = new CE_v2[this.obr.getObr39_CollectorSComment().length];
		for(int i = 0; i<this.obr.getObr39_CollectorSComment().length;i++) {
			collectorsComment[i] = new CE_v2(
					this.obr.getObr39_CollectorSComment(i).getCe1_Identifier().getValue(),
					this.obr.getObr39_CollectorSComment(i).getCe2_Text().getValue(),
					this.obr.getObr39_CollectorSComment(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr39_CollectorSComment(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr39_CollectorSComment(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr39_CollectorSComment(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return collectorsComment;
	}
	/**
	 * @param obr_39_collectorsComment the obr_39_collectorsComment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_39_collectorsComment")
	public void setObr_39_collectorsComment(CE_v2[] obr_39_collectorsComment) throws DataTypeException {
		for(int i = 0; i<obr_39_collectorsComment.length;i++) {
			this.obr.getObr39_CollectorSComment(i).getCe1_Identifier().setValue(obr_39_collectorsComment[i].getCe_1_identifier()); 
			this.obr.getObr39_CollectorSComment(i).getCe2_Text().setValue(obr_39_collectorsComment[i].getCe_2_text());
			this.obr.getObr39_CollectorSComment(i).getCe3_NameOfCodingSystem().setValue(obr_39_collectorsComment[i].getCe_3_nameOfCodingSystem()); 
			this.obr.getObr39_CollectorSComment(i).getCe4_AlternateIdentifier().setValue(obr_39_collectorsComment[i].getCe_4_alternateIdentifier());
			this.obr.getObr39_CollectorSComment(i).getCe5_AlternateText().setValue(obr_39_collectorsComment[i].getCe_5_alternateText());
			this.obr.getObr39_CollectorSComment(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_39_collectorsComment[i].getCe_6_nameOfAlternateCodingSystem());
		}

		this.obr_39_collectorsComment = obr_39_collectorsComment;
	}
	/**
	 * @return the obr_40_transportArrangementResponsibility
	 */
	
	@JsonProperty("obr_40_transportArrangementResponsibility")
	public CE_v2 getObr_40_transportArrangementResponsibility() {
		return new CE_v2(
				this.obr.getObr40_TransportArrangementResponsibility().getCe1_Identifier().getValue(),
				this.obr.getObr40_TransportArrangementResponsibility().getCe2_Text().getValue(),
				this.obr.getObr40_TransportArrangementResponsibility().getCe3_NameOfCodingSystem().getValue(),
				this.obr.getObr40_TransportArrangementResponsibility().getCe4_AlternateIdentifier().getValue(),
				this.obr.getObr40_TransportArrangementResponsibility().getCe5_AlternateText().getValue(), 
				this.obr.getObr40_TransportArrangementResponsibility().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obr_40_transportArrangementResponsibility the obr_40_transportArrangementResponsibility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_40_transportArrangementResponsibility")
	public void setObr_40_transportArrangementResponsibility(CE_v2 obr_40_transportArrangementResponsibility) throws DataTypeException {
		this.obr.getObr40_TransportArrangementResponsibility().getCe1_Identifier().setValue(obr_40_transportArrangementResponsibility.getCe_1_identifier());
		this.obr.getObr40_TransportArrangementResponsibility().getCe2_Text().setValue(obr_40_transportArrangementResponsibility.getCe_2_text());
		this.obr.getObr40_TransportArrangementResponsibility().getCe3_NameOfCodingSystem().setValue(obr_40_transportArrangementResponsibility.getCe_3_nameOfCodingSystem());
		this.obr.getObr40_TransportArrangementResponsibility().getCe4_AlternateIdentifier().setValue(obr_40_transportArrangementResponsibility.getCe_4_alternateIdentifier());
		this.obr.getObr40_TransportArrangementResponsibility().getCe5_AlternateText().setValue(obr_40_transportArrangementResponsibility.getCe_5_alternateText());
		this.obr.getObr40_TransportArrangementResponsibility().getCe6_NameOfAlternateCodingSystem().setValue(obr_40_transportArrangementResponsibility.getCe_6_nameOfAlternateCodingSystem());
		this.obr_40_transportArrangementResponsibility = obr_40_transportArrangementResponsibility;
	}
	/**
	 * @return the obr_41_transportArranged
	 */
	
	@JsonProperty("obr_41_transportArranged")
	public String getObr_41_transportArranged() {
		return this.obr.getObr41_TransportArranged().getValue();
	}
	/**
	 * @param obr_41_transportArranged the obr_41_transportArranged to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_41_transportArranged")
	public void setObr_41_transportArranged(String obr_41_transportArranged) throws DataTypeException {
		this.obr.getObr41_TransportArranged().setValue(obr_41_transportArranged);
		this.obr_41_transportArranged = obr_41_transportArranged;
	}
	/**
	 * @return the obr_42_escortRequired
	 */
	
	@JsonProperty("obr_42_escortRequired")
	public String getObr_42_escortRequired() {
		return this.obr.getObr42_EscortRequired().getValue();
	}
	/**
	 * @param obr_42_escortRequired the obr_42_escortRequired to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_42_escortRequired")
	public void setObr_42_escortRequired(String obr_42_escortRequired) throws DataTypeException {
		this.obr.getObr42_EscortRequired().setValue(obr_42_escortRequired);
		this.obr_42_escortRequired = obr_42_escortRequired;
	}
	/**
	 * @return the obr_43_plannedPatientTransportComment
	 */
	
	@JsonProperty("obr_43_plannedPatientTransportComment")
	public CE_v2[] getObr_43_plannedPatientTransportComment() {
		CE_v2[] plannedPatientTransportComment = new CE_v2[this.obr.getObr43_PlannedPatientTransportComment().length];
		for(int i = 0; i<this.obr.getObr43_PlannedPatientTransportComment().length;i++) {
			plannedPatientTransportComment[i] = new CE_v2(
					this.obr.getObr43_PlannedPatientTransportComment(i).getCe1_Identifier().getValue(),
					this.obr.getObr43_PlannedPatientTransportComment(i).getCe2_Text().getValue(),
					this.obr.getObr43_PlannedPatientTransportComment(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr43_PlannedPatientTransportComment(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr43_PlannedPatientTransportComment(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr43_PlannedPatientTransportComment(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return plannedPatientTransportComment;
	}
	/**
	 * @param obr_43_plannedPatientTransportComment the obr_43_plannedPatientTransportComment to set
	 * @JsonProperty("obr_43_plannedPatientTransportComment")
	 * @throws DataTypeException 
	 */
	public void setObr_43_plannedPatientTransportComment(CE_v2[] obr_43_plannedPatientTransportComment) throws DataTypeException {
		for(int i = 0; i<obr_43_plannedPatientTransportComment.length;i++) {
			this.obr.getObr43_PlannedPatientTransportComment(i).getCe1_Identifier().setValue(obr_43_plannedPatientTransportComment[i].getCe_1_identifier()); 
			this.obr.getObr43_PlannedPatientTransportComment(i).getCe2_Text().setValue(obr_43_plannedPatientTransportComment[i].getCe_2_text());
			this.obr.getObr43_PlannedPatientTransportComment(i).getCe3_NameOfCodingSystem().setValue(obr_43_plannedPatientTransportComment[i].getCe_3_nameOfCodingSystem()); 
			this.obr.getObr43_PlannedPatientTransportComment(i).getCe4_AlternateIdentifier().setValue(obr_43_plannedPatientTransportComment[i].getCe_4_alternateIdentifier());
			this.obr.getObr43_PlannedPatientTransportComment(i).getCe5_AlternateText().setValue(obr_43_plannedPatientTransportComment[i].getCe_5_alternateText());
			this.obr.getObr43_PlannedPatientTransportComment(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_43_plannedPatientTransportComment[i].getCe_6_nameOfAlternateCodingSystem());
		}

		this.obr_43_plannedPatientTransportComment = obr_43_plannedPatientTransportComment;
	}
	/**
	 * @return the obr_44_procedureCode
	 *	@JsonProperty("obr_44_procedureCode")
	 */
	
	public CE_v2 getObr_44_procedureCode() {
		return new CE_v2(
				this.obr.getObr44_ProcedureCode().getCe1_Identifier().getValue(),
				this.obr.getObr44_ProcedureCode().getCe2_Text().getValue(),
				this.obr.getObr44_ProcedureCode().getCe3_NameOfCodingSystem().getValue(),
				this.obr.getObr44_ProcedureCode().getCe4_AlternateIdentifier().getValue(),
				this.obr.getObr44_ProcedureCode().getCe5_AlternateText().getValue(),
				this.obr.getObr44_ProcedureCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obr_44_procedureCode the obr_44_procedureCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_44_procedureCode")
	public void setObr_44_procedureCode(CE_v2 obr_44_procedureCode) throws DataTypeException {
		this.obr.getObr44_ProcedureCode().getCe1_Identifier().setValue(obr_44_procedureCode.getCe_1_identifier());
		this.obr.getObr44_ProcedureCode().getCe2_Text().setValue(obr_44_procedureCode.getCe_2_text());
		this.obr.getObr44_ProcedureCode().getCe3_NameOfCodingSystem().setValue(obr_44_procedureCode.getCe_3_nameOfCodingSystem());
		this.obr.getObr44_ProcedureCode().getCe4_AlternateIdentifier().setValue(obr_44_procedureCode.getCe_4_alternateIdentifier());
		this.obr.getObr44_ProcedureCode().getCe5_AlternateText().setValue(obr_44_procedureCode.getCe_5_alternateText());
		this.obr.getObr44_ProcedureCode().getCe6_NameOfAlternateCodingSystem().setValue(obr_44_procedureCode.getCe_6_nameOfAlternateCodingSystem());
		this.obr_44_procedureCode = obr_44_procedureCode;
	}
	/**
	 * @return the obr_45_procedureCodeModifier
	 */
	
	@JsonProperty("obr_45_procedureCodeModifier")
	public CE_v2[] getObr_45_procedureCodeModifier() {
		CE_v2[] procedureCodeModifier = new CE_v2[this.obr.getObr45_ProcedureCodeModifier().length];
		for(int i = 0; i<this.obr.getObr45_ProcedureCodeModifier().length;i++) {
			procedureCodeModifier[i] = new CE_v2(
					this.obr.getObr45_ProcedureCodeModifier(i).getCe1_Identifier().getValue(),
					this.obr.getObr45_ProcedureCodeModifier(i).getCe2_Text().getValue(),
					this.obr.getObr45_ProcedureCodeModifier(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr45_ProcedureCodeModifier(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr45_ProcedureCodeModifier(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr45_ProcedureCodeModifier(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return procedureCodeModifier;
	}
	/**
	 * @param obr_45_procedureCodeModifier the obr_45_procedureCodeModifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_45_procedureCodeModifier")
	public void setObr_45_procedureCodeModifier(CE_v2[] obr_45_procedureCodeModifier) throws DataTypeException {
		for(int i = 0; i<obr_45_procedureCodeModifier.length;i++) {
			this.obr.getObr45_ProcedureCodeModifier(i).getCe1_Identifier().setValue(obr_45_procedureCodeModifier[i].getCe_1_identifier()); 
			this.obr.getObr45_ProcedureCodeModifier(i).getCe2_Text().setValue(obr_45_procedureCodeModifier[i].getCe_2_text());
			this.obr.getObr45_ProcedureCodeModifier(i).getCe3_NameOfCodingSystem().setValue(obr_45_procedureCodeModifier[i].getCe_3_nameOfCodingSystem()); 
			this.obr.getObr45_ProcedureCodeModifier(i).getCe4_AlternateIdentifier().setValue(obr_45_procedureCodeModifier[i].getCe_4_alternateIdentifier());
			this.obr.getObr45_ProcedureCodeModifier(i).getCe5_AlternateText().setValue(obr_45_procedureCodeModifier[i].getCe_5_alternateText());
			this.obr.getObr45_ProcedureCodeModifier(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_45_procedureCodeModifier[i].getCe_6_nameOfAlternateCodingSystem());
		}

		this.obr_45_procedureCodeModifier = obr_45_procedureCodeModifier;
	}
	/**
	 * @return the obr_46_placerSupplementalServiceInformation
	 */
	
	@JsonProperty("obr_46_placerSupplementalServiceInformation")
	public CE_v2[] getObr_46_placerSupplementalServiceInformation() {
		CE_v2[] placerSupplementalServiceInformation = new CE_v2[this.obr.getObr46_PlacerSupplementalServiceInformation().length];
		for(int i = 0; i<this.obr.getObr46_PlacerSupplementalServiceInformation().length;i++) {
			placerSupplementalServiceInformation[i] = new CE_v2(
					this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe1_Identifier().getValue(),
					this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe2_Text().getValue(),
					this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return placerSupplementalServiceInformation;
	}
	/**
	 * @param obr_46_placerSupplementalServiceInformation the obr_46_placerSupplementalServiceInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_46_placerSupplementalServiceInformation")
	public void setObr_46_placerSupplementalServiceInformation(CE_v2[] obr_46_placerSupplementalServiceInformation) throws DataTypeException {
		for(int i = 0; i<obr_46_placerSupplementalServiceInformation.length;i++) {
			this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe1_Identifier().setValue(obr_46_placerSupplementalServiceInformation[i].getCe_1_identifier()); 
			this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe2_Text().setValue(obr_46_placerSupplementalServiceInformation[i].getCe_2_text());
			this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe3_NameOfCodingSystem().setValue(obr_46_placerSupplementalServiceInformation[i].getCe_3_nameOfCodingSystem()); 
			this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe4_AlternateIdentifier().setValue(obr_46_placerSupplementalServiceInformation[i].getCe_4_alternateIdentifier());
			this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe5_AlternateText().setValue(obr_46_placerSupplementalServiceInformation[i].getCe_5_alternateText());
			this.obr.getObr46_PlacerSupplementalServiceInformation(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_46_placerSupplementalServiceInformation[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.obr_46_placerSupplementalServiceInformation = obr_46_placerSupplementalServiceInformation;
	}
	/**
	 * @return the obr_47_fillerSupplementalServiceInformation
	 */
	
	@JsonProperty("obr_47_fillerSupplementalServiceInformation")
	public CE_v2[] getObr_47_fillerSupplementalServiceInformation() {
		CE_v2[] fillerSupplementalServiceInformation = new CE_v2[this.obr.getObr47_FillerSupplementalServiceInformation().length];
		for(int i = 0; i<this.obr.getObr47_FillerSupplementalServiceInformation().length;i++) {
			fillerSupplementalServiceInformation[i] = new CE_v2(
					this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe1_Identifier().getValue(),
					this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe2_Text().getValue(),
					this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe4_AlternateIdentifier().getValue(), 
					this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe5_AlternateText().getValue(), 
					this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return fillerSupplementalServiceInformation;
	}
	/**
	 * @param obr_47_fillerSupplementalServiceInformation the obr_47_fillerSupplementalServiceInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_47_fillerSupplementalServiceInformation")
	public void setObr_47_fillerSupplementalServiceInformation(CE_v2[] obr_47_fillerSupplementalServiceInformation) throws DataTypeException {
		for(int i = 0; i<obr_47_fillerSupplementalServiceInformation.length;i++) {
			this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe1_Identifier().setValue(obr_47_fillerSupplementalServiceInformation[i].getCe_1_identifier()); 
			this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe2_Text().setValue(obr_47_fillerSupplementalServiceInformation[i].getCe_2_text());
			this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe3_NameOfCodingSystem().setValue(obr_47_fillerSupplementalServiceInformation[i].getCe_3_nameOfCodingSystem()); 
			this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe4_AlternateIdentifier().setValue(obr_47_fillerSupplementalServiceInformation[i].getCe_4_alternateIdentifier());
			this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe5_AlternateText().setValue(obr_47_fillerSupplementalServiceInformation[i].getCe_5_alternateText());
			this.obr.getObr47_FillerSupplementalServiceInformation(i).getCe6_NameOfAlternateCodingSystem().setValue(obr_47_fillerSupplementalServiceInformation[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.obr_47_fillerSupplementalServiceInformation = obr_47_fillerSupplementalServiceInformation;
	}
	/**
	 * @return the obr_48_medicallyNecessaryDuplicateProcedureReason
	 */
	
	@JsonProperty("obr_48_medicallyNecessaryDuplicateProcedureReason")
	public CWE_v25 getObr_48_medicallyNecessaryDuplicateProcedureReason() {
		return new CWE_v25(
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe1_Identifier().getValue(),
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe2_Text().getValue(),
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe3_NameOfCodingSystem().getValue(),
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe4_AlternateIdentifier().getValue(),
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe5_AlternateText().getValue(), 
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe7_CodingSystemVersionID().getValue(), 
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe8_AlternateCodingSystemVersionID().getValue(), 
				this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param obr_48_medicallyNecessaryDuplicateProcedureReason the obr_48_medicallyNecessaryDuplicateProcedureReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_48_medicallyNecessaryDuplicateProcedureReason")
	public void setObr_48_medicallyNecessaryDuplicateProcedureReason(
			CWE_v25 obr_48_medicallyNecessaryDuplicateProcedureReason) throws DataTypeException {
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe1_Identifier().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_1_identifier());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe2_Text().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_2_text());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe3_NameOfCodingSystem().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_3_nameOfCodingSystem());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe4_AlternateIdentifier().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_4_alternateIdentifier());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe5_AlternateText().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_5_alternateText());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe6_NameOfAlternateCodingSystem().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_6_nameOfAlternateCodingSystem());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe7_CodingSystemVersionID().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_7_codingSystemVersionId());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe8_AlternateCodingSystemVersionID().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_8_alternateCodingSystemVersionId());
		this.obr.getObr48_MedicallyNecessaryDuplicateProcedureReason().getCwe9_OriginalText().setValue(obr_48_medicallyNecessaryDuplicateProcedureReason.getCwe_9_originalText());
		this.obr_48_medicallyNecessaryDuplicateProcedureReason = obr_48_medicallyNecessaryDuplicateProcedureReason;
	}
	/**
	 * @return the obr_49_resultHandling
	 */
	
	@JsonProperty("obr_49_resultHandling")
	public String getObr_49_resultHandling() {
		return this.obr.getObr49_ResultHandling().getValue();
	}
	/**
	 * @param obr_49_resultHandling the obr_49_resultHandling to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_49_resultHandling")
	public void setObr_49_resultHandling(String obr_49_resultHandling) throws DataTypeException {
		this.obr.getObr49_ResultHandling().setValue(obr_49_resultHandling);
		this.obr_49_resultHandling = obr_49_resultHandling;
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
	 * @return the obx
	 *	@JsonProperty("obx")
	 */
	
	public List<CustomOBX_v25> getObx() {
		return obx;
	}
	/**
	 * @param obx the obx to set
	 * @JsonProperty("obx")
	 */
	public void setObx(List<CustomOBX_v25> obx) {
		this.obx = obx;
	}
	@Override
	public String toString() {
		return "CustomOBR_v25 [obr_1_setID=" + obr_1_setID + ", obr_2_placerOrderNumber=" + obr_2_placerOrderNumber
				+ ", obr_3_fillerOrderNumber=" + obr_3_fillerOrderNumber + ", obr_4_universalServiceIdentifier="
				+ obr_4_universalServiceIdentifier + ", obr_5_priority=" + obr_5_priority + ", obr_6_requestedDateTime="
				+ obr_6_requestedDateTime + ", obr_7_observationDateTime=" + obr_7_observationDateTime
				+ ", obr_8_observationEndDateTime=" + obr_8_observationEndDateTime + ", obr_9_collectionVolume="
				+ obr_9_collectionVolume + ", obr_10_collectorIdentifier=" + Arrays.toString(obr_10_collectorIdentifier)
				+ ", obr_11_specimenActionCode=" + obr_11_specimenActionCode + ", obr_12_dangerCode="
				+ obr_12_dangerCode + ", obr_13_relevantClinicalInformation=" + obr_13_relevantClinicalInformation
				+ ", obr_14_specimenReceivedDateTime=" + obr_14_specimenReceivedDateTime + ", obr_15_specimenSource="
				+ obr_15_specimenSource + ", obr_16_orderingProvider=" + Arrays.toString(obr_16_orderingProvider)
				+ ", obr_17_orderCallbackPhoneNumber=" + Arrays.toString(obr_17_orderCallbackPhoneNumber)
				+ ", obr_18_placerField=" + obr_18_placerField + ", obr_19_placerField=" + obr_19_placerField
				+ ", obr_20_fillerField=" + obr_20_fillerField + ", obr_21_fillerField=" + obr_21_fillerField
				+ ", obr_22_resultsRptStatusChng=" + obr_22_resultsRptStatusChng + ", obr_23_chargetoPractice="
				+ obr_23_chargetoPractice + ", obr_24_diagnosticServSectID=" + obr_24_diagnosticServSectID
				+ ", obr_25_resultStatus=" + obr_25_resultStatus + ", obr_26_parentResult=" + obr_26_parentResult
				+ ", obr_27_quantityTiming=" + Arrays.toString(obr_27_quantityTiming) + ", obr_28_resultCopiesTo="
				+ Arrays.toString(obr_28_resultCopiesTo) + ", obr_29_parent=" + obr_29_parent
				+ ", obr_30_transportationMode=" + obr_30_transportationMode + ", obr_31_reasonforStudy="
				+ Arrays.toString(obr_31_reasonforStudy) + ", obr_32_principalResultInterpreter="
				+ obr_32_principalResultInterpreter + ", obr_33_assistantResultInterpreter="
				+ Arrays.toString(obr_33_assistantResultInterpreter) + ", obr_34_technician="
				+ Arrays.toString(obr_34_technician) + ", obr_35_transcriptionist="
				+ Arrays.toString(obr_35_transcriptionist) + ", obr_36_scheduledDateTime=" + obr_36_scheduledDateTime
				+ ", obr_37_numberofSampleContainers=" + obr_37_numberofSampleContainers
				+ ", obr_38_transportLogisticsofCollectedSample="
				+ Arrays.toString(obr_38_transportLogisticsofCollectedSample) + ", obr_39_collectorsComment="
				+ Arrays.toString(obr_39_collectorsComment) + ", obr_40_transportArrangementResponsibility="
				+ obr_40_transportArrangementResponsibility + ", obr_41_transportArranged=" + obr_41_transportArranged
				+ ", obr_42_escortRequired=" + obr_42_escortRequired + ", obr_43_plannedPatientTransportComment="
				+ Arrays.toString(obr_43_plannedPatientTransportComment) + ", obr_44_procedureCode="
				+ obr_44_procedureCode + ", obr_45_procedureCodeModifier="
				+ Arrays.toString(obr_45_procedureCodeModifier) + ", obr_46_placerSupplementalServiceInformation="
				+ Arrays.toString(obr_46_placerSupplementalServiceInformation)
				+ ", obr_47_fillerSupplementalServiceInformation="
				+ Arrays.toString(obr_47_fillerSupplementalServiceInformation)
				+ ", obr_48_medicallyNecessaryDuplicateProcedureReason="
				+ obr_48_medicallyNecessaryDuplicateProcedureReason + ", obr_49_resultHandling=" + obr_49_resultHandling
				+ ", obr=" + obr + "]";
	}
	
	
}
