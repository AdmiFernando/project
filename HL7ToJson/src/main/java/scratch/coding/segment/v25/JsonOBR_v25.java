package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CQ_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.EIP_v25;
import scratch.coding.models.v25.MOC_v25;
import scratch.coding.models.v25.NDL_v25;
import scratch.coding.models.v25.PRL_v25;
import scratch.coding.models.v25.SPS_v25;
import scratch.coding.models.v25.TQ_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XTN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonOBR_v25 {
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
	private JsonNTE_v25[] nte;
	public JsonOBR_v25() {
		super();
		this.obr_1_setID = "";
		this.obr_2_placerOrderNumber = new EI_v2();
		this.obr_3_fillerOrderNumber = new EI_v2();
		this.obr_4_universalServiceIdentifier = new CE_v2();
		this.obr_5_priority = "";
		this.obr_6_requestedDateTime = new TS_v2();
		this.obr_7_observationDateTime = new TS_v2();
		this.obr_8_observationEndDateTime = new TS_v2();
		this.obr_9_collectionVolume = new CQ_v25();
		this.obr_10_collectorIdentifier = new XCN_v25[] {};
		this.obr_11_specimenActionCode = "";
		this.obr_12_dangerCode = new CE_v2();
		this.obr_13_relevantClinicalInformation = "";
		this.obr_14_specimenReceivedDateTime = new TS_v2();
		this.obr_15_specimenSource = new SPS_v25();
		this.obr_16_orderingProvider = new XCN_v25[] {};
		this.obr_17_orderCallbackPhoneNumber = new XTN_v25[] {};
		this.obr_18_placerField = "";
		this.obr_19_placerField = "";
		this.obr_20_fillerField = "";
		this.obr_21_fillerField = "";
		this.obr_22_resultsRptStatusChng = new TS_v2();
		this.obr_23_chargetoPractice = new MOC_v25();
		this.obr_24_diagnosticServSectID = "";
		this.obr_25_resultStatus = "";
		this.obr_26_parentResult = new PRL_v25();
		this.obr_27_quantityTiming = new TQ_v25[] {};
		this.obr_28_resultCopiesTo = new XCN_v25[] {};
		this.obr_29_parent = new EIP_v25();
		this.obr_30_transportationMode = "";
		this.obr_31_reasonforStudy = new CE_v2[] {};
		this.obr_32_principalResultInterpreter = new NDL_v25();
		this.obr_33_assistantResultInterpreter = new NDL_v25[] {};
		this.obr_34_technician = new NDL_v25[] {};
		this.obr_35_transcriptionist = new NDL_v25[] {};
		this.obr_36_scheduledDateTime = new TS_v2();
		this.obr_37_numberofSampleContainers = "";
		this.obr_38_transportLogisticsofCollectedSample = new CE_v2[] {};
		this.obr_39_collectorsComment = new CE_v2[] {};
		this.obr_40_transportArrangementResponsibility = new CE_v2();
		this.obr_41_transportArranged = "";
		this.obr_42_escortRequired = "";
		this.obr_43_plannedPatientTransportComment = new CE_v2[] {};
		this.obr_44_procedureCode = new CE_v2();
		this.obr_45_procedureCodeModifier = new CE_v2[] {};
		this.obr_46_placerSupplementalServiceInformation = new CE_v2[] {};
		this.obr_47_fillerSupplementalServiceInformation = new CE_v2[] {};
		this.obr_48_medicallyNecessaryDuplicateProcedureReason = new CWE_v25();
		this.obr_49_resultHandling = "";
	}
	public JsonOBR_v25(OBRBuilder builder) {
		super();
		this.obr_1_setID = builder.obr_1_setID;
		this.obr_2_placerOrderNumber = builder.obr_2_placerOrderNumber;
		this.obr_3_fillerOrderNumber = builder.obr_3_fillerOrderNumber;
		this.obr_4_universalServiceIdentifier = builder.obr_4_universalServiceIdentifier;
		this.obr_5_priority = builder.obr_5_priority;
		this.obr_6_requestedDateTime = builder.obr_6_requestedDateTime;
		this.obr_7_observationDateTime = builder.obr_7_observationDateTime;
		this.obr_8_observationEndDateTime = builder.obr_8_observationEndDateTime;
		this.obr_9_collectionVolume = builder.obr_9_collectionVolume;
		this.obr_10_collectorIdentifier = builder.obr_10_collectorIdentifier;
		this.obr_11_specimenActionCode = builder.obr_11_specimenActionCode;
		this.obr_12_dangerCode = builder.obr_12_dangerCode;
		this.obr_13_relevantClinicalInformation = builder.obr_13_relevantClinicalInformation;
		this.obr_14_specimenReceivedDateTime = builder.obr_14_specimenReceivedDateTime;
		this.obr_15_specimenSource = builder.obr_15_specimenSource;
		this.obr_16_orderingProvider = builder.obr_16_orderingProvider;
		this.obr_17_orderCallbackPhoneNumber = builder.obr_17_orderCallbackPhoneNumber;
		this.obr_18_placerField = builder.obr_18_placerField;
		this.obr_19_placerField = builder.obr_19_placerField;
		this.obr_20_fillerField = builder.obr_20_fillerField;
		this.obr_21_fillerField = builder.obr_21_fillerField;
		this.obr_22_resultsRptStatusChng = builder.obr_22_resultsRptStatusChng;
		this.obr_23_chargetoPractice = builder.obr_23_chargetoPractice;
		this.obr_24_diagnosticServSectID = builder.obr_24_diagnosticServSectID;
		this.obr_25_resultStatus = builder.obr_25_resultStatus;
		this.obr_26_parentResult = builder.obr_26_parentResult;
		this.obr_27_quantityTiming = builder.obr_27_quantityTiming;
		this.obr_28_resultCopiesTo = builder.obr_28_resultCopiesTo;
		this.obr_29_parent = builder.obr_29_parent;
		this.obr_30_transportationMode = builder.obr_30_transportationMode;
		this.obr_31_reasonforStudy = builder.obr_31_reasonforStudy;
		this.obr_32_principalResultInterpreter = builder.obr_32_principalResultInterpreter;
		this.obr_33_assistantResultInterpreter = builder.obr_33_assistantResultInterpreter;
		this.obr_34_technician = builder.obr_34_technician;
		this.obr_35_transcriptionist = builder.obr_35_transcriptionist;
		this.obr_36_scheduledDateTime = builder.obr_36_scheduledDateTime;
		this.obr_37_numberofSampleContainers = builder.obr_37_numberofSampleContainers;
		this.obr_38_transportLogisticsofCollectedSample = builder.obr_38_transportLogisticsofCollectedSample;
		this.obr_39_collectorsComment = builder.obr_39_collectorsComment;
		this.obr_40_transportArrangementResponsibility = builder.obr_40_transportArrangementResponsibility;
		this.obr_41_transportArranged = builder.obr_41_transportArranged;
		this.obr_42_escortRequired = builder.obr_42_escortRequired;
		this.obr_43_plannedPatientTransportComment = builder.obr_43_plannedPatientTransportComment;
		this.obr_44_procedureCode = builder.obr_44_procedureCode;
		this.obr_45_procedureCodeModifier = builder.obr_45_procedureCodeModifier;
		this.obr_46_placerSupplementalServiceInformation = builder.obr_46_placerSupplementalServiceInformation;
		this.obr_47_fillerSupplementalServiceInformation = builder.obr_47_fillerSupplementalServiceInformation;
		this.obr_48_medicallyNecessaryDuplicateProcedureReason = builder.obr_48_medicallyNecessaryDuplicateProcedureReason;
		this.obr_49_resultHandling = builder.obr_49_resultHandling;
		this.nte = builder.nte;
	}
	public static class OBRBuilder {
		private String obr_1_setID;
		private EI_v2 obr_2_placerOrderNumber;
		private EI_v2 obr_3_fillerOrderNumber;
		private CE_v2 obr_4_universalServiceIdentifier;
		private String obr_5_priority;
		private TS_v2 obr_6_requestedDateTime;
		private TS_v2 obr_7_observationDateTime;
		private TS_v2 obr_8_observationEndDateTime;
		private CQ_v25 obr_9_collectionVolume;
		private XCN_v25[] obr_10_collectorIdentifier;
		private String obr_11_specimenActionCode;
		private CE_v2 obr_12_dangerCode;
		private String obr_13_relevantClinicalInformation;
		private TS_v2 obr_14_specimenReceivedDateTime;
		private SPS_v25 obr_15_specimenSource;
		private XCN_v25[] obr_16_orderingProvider;
		private XTN_v25[]  obr_17_orderCallbackPhoneNumber;
		private String obr_18_placerField;
		private String obr_19_placerField;
		private String obr_20_fillerField;
		private String obr_21_fillerField;
		private TS_v2 obr_22_resultsRptStatusChng;
		private MOC_v25 obr_23_chargetoPractice;
		private String obr_24_diagnosticServSectID;
		private String obr_25_resultStatus;
		private PRL_v25 obr_26_parentResult;
		private TQ_v25[] obr_27_quantityTiming;
		private XCN_v25[] obr_28_resultCopiesTo;
		private EIP_v25 obr_29_parent;
		private String obr_30_transportationMode;
		private CE_v2[] obr_31_reasonforStudy;
		private NDL_v25 obr_32_principalResultInterpreter;
		private NDL_v25[] obr_33_assistantResultInterpreter;
		private NDL_v25[] obr_34_technician;
		private NDL_v25[] obr_35_transcriptionist;
		private TS_v2 obr_36_scheduledDateTime;
		private String obr_37_numberofSampleContainers;
		private CE_v2[] obr_38_transportLogisticsofCollectedSample;
		private CE_v2[] obr_39_collectorsComment;
		private CE_v2 obr_40_transportArrangementResponsibility;
		private String obr_41_transportArranged;
		private String obr_42_escortRequired;
		private CE_v2[] obr_43_plannedPatientTransportComment;
		private CE_v2 obr_44_procedureCode;
		private CE_v2[] obr_45_procedureCodeModifier;
		private CE_v2[] obr_46_placerSupplementalServiceInformation;
		private CE_v2[] obr_47_fillerSupplementalServiceInformation;
		private CWE_v25 obr_48_medicallyNecessaryDuplicateProcedureReason;
		private String obr_49_resultHandling;
		private JsonNTE_v25[] nte;
		public OBRBuilder(String obr_1_setID, EI_v2 obr_3_fillerOrderNumber,
				CE_v2 obr_4_universalServiceIdentifier,
				TS_v2 obr_7_observationDateTime, TS_v2 obr_22_resultsRptStatusChng, String obr_25_resultStatus, 
				NDL_v25[] obr_34_technician) {
			super();
			this.obr_1_setID = obr_1_setID;
			this.obr_2_placerOrderNumber = new EI_v2();
			this.obr_3_fillerOrderNumber = obr_3_fillerOrderNumber;
			this.obr_4_universalServiceIdentifier = obr_4_universalServiceIdentifier;
			this.obr_5_priority = "";
			this.obr_6_requestedDateTime = new TS_v2();
			this.obr_7_observationDateTime = obr_7_observationDateTime;
			this.obr_8_observationEndDateTime = new TS_v2();
			this.obr_9_collectionVolume = new CQ_v25();
			this.obr_10_collectorIdentifier = new XCN_v25[] {};
			this.obr_11_specimenActionCode = "";
			this.obr_12_dangerCode = new CE_v2();
			this.obr_13_relevantClinicalInformation = "";
			this.obr_14_specimenReceivedDateTime = new TS_v2();
			this.obr_15_specimenSource = new SPS_v25();
			this.obr_16_orderingProvider = new XCN_v25[] {};
			this.obr_17_orderCallbackPhoneNumber = new XTN_v25[] {};
			this.obr_18_placerField = "";
			this.obr_19_placerField = "";
			this.obr_20_fillerField = "";
			this.obr_21_fillerField = "";
			this.obr_22_resultsRptStatusChng = obr_22_resultsRptStatusChng;
			this.obr_23_chargetoPractice = new MOC_v25();
			this.obr_24_diagnosticServSectID = "";
			this.obr_25_resultStatus = obr_25_resultStatus;
			this.obr_26_parentResult = new PRL_v25();
			this.obr_27_quantityTiming = new TQ_v25[] {};
			this.obr_28_resultCopiesTo = new XCN_v25[] {};
			this.obr_29_parent = new EIP_v25();
			this.obr_30_transportationMode = "";
			this.obr_31_reasonforStudy = new CE_v2[] {};
			this.obr_32_principalResultInterpreter = new NDL_v25();
			this.obr_33_assistantResultInterpreter = new NDL_v25[] {};
			this.obr_34_technician = obr_34_technician;
			this.obr_35_transcriptionist = new NDL_v25[] {};
			this.obr_36_scheduledDateTime = new TS_v2();
			this.obr_37_numberofSampleContainers = "";
			this.obr_38_transportLogisticsofCollectedSample = new CE_v2[] {};
			this.obr_39_collectorsComment = new CE_v2[] {};
			this.obr_40_transportArrangementResponsibility = new CE_v2();
			this.obr_41_transportArranged = "";
			this.obr_42_escortRequired = "";
			this.obr_43_plannedPatientTransportComment = new CE_v2[] {};
			this.obr_44_procedureCode = new CE_v2();
			this.obr_45_procedureCodeModifier = new CE_v2[] {};
			this.obr_46_placerSupplementalServiceInformation = new CE_v2[] {};
			this.obr_47_fillerSupplementalServiceInformation = new CE_v2[] {};
			this.obr_48_medicallyNecessaryDuplicateProcedureReason = new CWE_v25();
			this.obr_49_resultHandling = "";
			this.nte = new JsonNTE_v25[] {};
		}
		
		public OBRBuilder obr_2_placerOrderNumber(EI_v2 obr_2_placerOrderNumber) {
			this.obr_2_placerOrderNumber = obr_2_placerOrderNumber;
			return this;
		}
		
		public OBRBuilder obr_5_priority(String obr_5_priority) {
			this.obr_5_priority = obr_5_priority;
			return this;
		}
		public OBRBuilder obr_6_requestedDateTime(TS_v2 obr_6_requestedDateTime) {
			this.obr_6_requestedDateTime = obr_6_requestedDateTime;
			return this;
		}
		public OBRBuilder obr_8_observationEndDateTime(TS_v2 obr_8_observationEndDateTime) {
			this.obr_8_observationEndDateTime = obr_8_observationEndDateTime;
			return this;
		}
		public OBRBuilder obr_9_collectionVolume(CQ_v25 obr_9_collectionVolume) {
			this.obr_9_collectionVolume = obr_9_collectionVolume;
			return this;
		}
		public OBRBuilder obr_10_collectorIdentifier(XCN_v25[] obr_10_collectorIdentifier) {
			this.obr_10_collectorIdentifier = obr_10_collectorIdentifier;
			return this;
		}
		public OBRBuilder obr_11_specimenActionCode(String obr_11_specimenActionCode) {
			this.obr_11_specimenActionCode = obr_11_specimenActionCode;
			return this;
		}
		public OBRBuilder obr_12_dangerCode(CE_v2 obr_12_dangerCode) {
			this.obr_12_dangerCode = obr_12_dangerCode;
			return this;
		}
		public OBRBuilder obr_13_relevantClinicalInformation(String obr_13_relevantClinicalInformation) {
			this.obr_13_relevantClinicalInformation = obr_13_relevantClinicalInformation;
			return this;
		}
		public OBRBuilder obr_14_specimenReceivedDateTime(TS_v2 obr_14_specimenReceivedDateTime) {
			this.obr_14_specimenReceivedDateTime = obr_14_specimenReceivedDateTime;
			return this;
		}
		public OBRBuilder obr_15_specimenSource(SPS_v25 obr_15_specimenSource) {
			this.obr_15_specimenSource = obr_15_specimenSource;
			return this;
		}
		public OBRBuilder obr_16_orderingProvider(XCN_v25[] obr_16_orderingProvider) {
			this.obr_16_orderingProvider = obr_16_orderingProvider;
			return this;
		}
		public OBRBuilder obr_17_orderCallbackPhoneNumber(XTN_v25[] obr_17_orderCallbackPhoneNumber) {
			this.obr_17_orderCallbackPhoneNumber = obr_17_orderCallbackPhoneNumber;
			return this;
		}
		public OBRBuilder obr_18_placerField(String obr_18_placerField) {
			this.obr_18_placerField = obr_18_placerField;
			return this;
		}
		public OBRBuilder obr_19_placerField(String obr_19_placerField) {
			this.obr_19_placerField = obr_19_placerField;
			return this;
		}
		public OBRBuilder obr_20_fillerField(String obr_20_fillerField) {
			this.obr_20_fillerField = obr_20_fillerField;
			return this;
		}
		public OBRBuilder obr_21_fillerField(String obr_21_fillerField) {
			this.obr_21_fillerField = obr_21_fillerField;
			return this;
		}
		public OBRBuilder obr_23_chargetoPractice(MOC_v25 obr_23_chargetoPractice) {
			this.obr_23_chargetoPractice = obr_23_chargetoPractice;
			return this;
		}
		public OBRBuilder obr_24_diagnosticServSectID(String obr_24_diagnosticServSectID) {
			this.obr_24_diagnosticServSectID = obr_24_diagnosticServSectID;
			return this;
		}
		public OBRBuilder obr_26_parentResult(PRL_v25 obr_26_parentResult) {
			this.obr_26_parentResult = obr_26_parentResult;
			return this;
		}
		public OBRBuilder obr_27_quantityTiming(TQ_v25[] obr_27_quantityTiming) {
			this.obr_27_quantityTiming = obr_27_quantityTiming;
			return this;
		}
		public OBRBuilder obr_28_resultCopiesTo(XCN_v25[] obr_28_resultCopiesTo) {
			this.obr_28_resultCopiesTo = obr_28_resultCopiesTo;
			return this;
		}
		public OBRBuilder obr_29_parent(EIP_v25 obr_29_parent) {
			this.obr_29_parent = obr_29_parent;
			return this;
		}
		public OBRBuilder obr_30_transportationMode(String obr_30_transportationMode) {
			this.obr_30_transportationMode = obr_30_transportationMode;
			return this;
		}
		public OBRBuilder obr_31_reasonforStudy(CE_v2[] obr_31_reasonforStudy) {
			this.obr_31_reasonforStudy = obr_31_reasonforStudy;
			return this;
		}
		public OBRBuilder obr_32_principalResultInterpreter(NDL_v25 obr_32_principalResultInterpreter) {
			this.obr_32_principalResultInterpreter = obr_32_principalResultInterpreter;
			return this;
		}
		public OBRBuilder obr_33_assistantResultInterpreter(NDL_v25[] obr_33_assistantResultInterpreter) {
			this.obr_33_assistantResultInterpreter = obr_33_assistantResultInterpreter;
			return this;
		}
		public OBRBuilder obr_35_transcriptionist(NDL_v25[] obr_35_transcriptionist) {
			this.obr_35_transcriptionist = obr_35_transcriptionist;
			return this;
		}
		public OBRBuilder obr_36_scheduledDateTime(TS_v2 obr_36_scheduledDateTime) {
			this.obr_36_scheduledDateTime = obr_36_scheduledDateTime;
			return this;
		}
		public OBRBuilder obr_37_numberofSampleContainers(String obr_37_numberofSampleContainers) {
			this.obr_37_numberofSampleContainers = obr_37_numberofSampleContainers;
			return this;
		}
		public OBRBuilder obr_38_transportLogisticsofCollectedSample(CE_v2[] obr_38_transportLogisticsofCollectedSample) {
			this.obr_38_transportLogisticsofCollectedSample = obr_38_transportLogisticsofCollectedSample;
			return this;
		}
		public OBRBuilder obr_39_collectorsComment(CE_v2[] obr_39_collectorsComment) {
			this.obr_39_collectorsComment = obr_39_collectorsComment;
			return this;
		}
		public OBRBuilder obr_40_transportArrangementResponsibility(CE_v2 obr_40_transportArrangementResponsibility) {
			this.obr_40_transportArrangementResponsibility = obr_40_transportArrangementResponsibility;
			return this;
		}
		public OBRBuilder obr_41_transportArranged(String obr_41_transportArranged) {
			this.obr_41_transportArranged = obr_41_transportArranged;
			return this;
		}
		public OBRBuilder obr_42_escortRequired(String obr_42_escortRequired) {
			this.obr_42_escortRequired = obr_42_escortRequired;
			return this;
		}
		public OBRBuilder obr_43_plannedPatientTransportComment(CE_v2[] obr_43_plannedPatientTransportComment) {
			this.obr_43_plannedPatientTransportComment = obr_43_plannedPatientTransportComment;
			return this;
		}
		public OBRBuilder obr_44_procedureCode(CE_v2 obr_44_procedureCode) {
			this.obr_44_procedureCode = obr_44_procedureCode;
			return this;
		}
		public OBRBuilder obr_45_procedureCodeModifier(CE_v2[] obr_45_procedureCodeModifier) {
			this.obr_45_procedureCodeModifier = obr_45_procedureCodeModifier;
			return this;
		}
		public OBRBuilder obr_46_placerSupplementalServiceInformation(CE_v2[] obr_46_placerSupplementalServiceInformation) {
			this.obr_46_placerSupplementalServiceInformation = obr_46_placerSupplementalServiceInformation;
			return this;
		}
		public OBRBuilder obr_47_fillerSupplementalServiceInformation(CE_v2[] obr_47_fillerSupplementalServiceInformation) {
			this.obr_47_fillerSupplementalServiceInformation = obr_47_fillerSupplementalServiceInformation;
			return this;
		}
		public OBRBuilder obr_48_medicallyNecessaryDuplicateProcedureReason(
				CWE_v25 obr_48_medicallyNecessaryDuplicateProcedureReason) {
			this.obr_48_medicallyNecessaryDuplicateProcedureReason = obr_48_medicallyNecessaryDuplicateProcedureReason;
			return this;
		}
		public OBRBuilder nte(JsonNTE_v25[] nte) {
			this.nte = nte;
			return this;
		}
		public OBRBuilder obr_49_resultHandling(String obr_49_resultHandling) {
			this.obr_49_resultHandling = obr_49_resultHandling;
			return this;
		}
		public JsonOBR_v25 build() {
			return new JsonOBR_v25(this);
		}
	}
	public String getObr_1_setID() {
		return obr_1_setID;
	}
	public EI_v2 getObr_2_placerOrderNumber() {
		return obr_2_placerOrderNumber;
	}
	public EI_v2 getObr_3_fillerOrderNumber() {
		return obr_3_fillerOrderNumber;
	}
	public CE_v2 getObr_4_universalServiceIdentifier() {
		return obr_4_universalServiceIdentifier;
	}
	public String getObr_5_priority() {
		return obr_5_priority;
	}
	public TS_v2 getObr_6_requestedDateTime() {
		return obr_6_requestedDateTime;
	}
	public TS_v2 getObr_7_observationDateTime() {
		return obr_7_observationDateTime;
	}
	public TS_v2 getObr_8_observationEndDateTime() {
		return obr_8_observationEndDateTime;
	}
	public CQ_v25 getObr_9_collectionVolume() {
		return obr_9_collectionVolume;
	}
	public XCN_v25[] getObr_10_collectorIdentifier() {
		return obr_10_collectorIdentifier;
	}
	public String getObr_11_specimenActionCode() {
		return obr_11_specimenActionCode;
	}
	public CE_v2 getObr_12_dangerCode() {
		return obr_12_dangerCode;
	}
	public String getObr_13_relevantClinicalInformation() {
		return obr_13_relevantClinicalInformation;
	}
	public TS_v2 getObr_14_specimenReceivedDateTime() {
		return obr_14_specimenReceivedDateTime;
	}
	public SPS_v25 getObr_15_specimenSource() {
		return obr_15_specimenSource;
	}
	public XCN_v25[] getObr_16_orderingProvider() {
		return obr_16_orderingProvider;
	}
	public XTN_v25[] getObr_17_orderCallbackPhoneNumber() {
		return obr_17_orderCallbackPhoneNumber;
	}
	public String getObr_18_placerField() {
		return obr_18_placerField;
	}
	public String getObr_19_placerField() {
		return obr_19_placerField;
	}
	public String getObr_20_fillerField() {
		return obr_20_fillerField;
	}
	public String getObr_21_fillerField() {
		return obr_21_fillerField;
	}
	public TS_v2 getObr_22_resultsRptStatusChng() {
		return obr_22_resultsRptStatusChng;
	}
	public MOC_v25 getObr_23_chargetoPractice() {
		return obr_23_chargetoPractice;
	}
	public String getObr_24_diagnosticServSectID() {
		return obr_24_diagnosticServSectID;
	}
	public String getObr_25_resultStatus() {
		return obr_25_resultStatus;
	}
	public PRL_v25 getObr_26_parentResult() {
		return obr_26_parentResult;
	}
	public TQ_v25[] getObr_27_quantityTiming() {
		return obr_27_quantityTiming;
	}
	public XCN_v25[] getObr_28_resultCopiesTo() {
		return obr_28_resultCopiesTo;
	}
	public EIP_v25 getObr_29_parent() {
		return obr_29_parent;
	}
	public String getObr_30_transportationMode() {
		return obr_30_transportationMode;
	}
	public CE_v2[] getObr_31_reasonforStudy() {
		return obr_31_reasonforStudy;
	}
	public NDL_v25 getObr_32_principalResultInterpreter() {
		return obr_32_principalResultInterpreter;
	}
	public NDL_v25[] getObr_33_assistantResultInterpreter() {
		return obr_33_assistantResultInterpreter;
	}
	public NDL_v25[] getObr_34_technician() {
		return obr_34_technician;
	}
	public NDL_v25[] getObr_35_transcriptionist() {
		return obr_35_transcriptionist;
	}
	public TS_v2 getObr_36_scheduledDateTime() {
		return obr_36_scheduledDateTime;
	}
	public String getObr_37_numberofSampleContainers() {
		return obr_37_numberofSampleContainers;
	}
	public CE_v2[] getObr_38_transportLogisticsofCollectedSample() {
		return obr_38_transportLogisticsofCollectedSample;
	}
	public CE_v2[] getObr_39_collectorsComment() {
		return obr_39_collectorsComment;
	}
	public CE_v2 getObr_40_transportArrangementResponsibility() {
		return obr_40_transportArrangementResponsibility;
	}
	public String getObr_41_transportArranged() {
		return obr_41_transportArranged;
	}
	public String getObr_42_escortRequired() {
		return obr_42_escortRequired;
	}
	public CE_v2[] getObr_43_plannedPatientTransportComment() {
		return obr_43_plannedPatientTransportComment;
	}
	public CE_v2 getObr_44_procedureCode() {
		return obr_44_procedureCode;
	}
	public CE_v2[] getObr_45_procedureCodeModifier() {
		return obr_45_procedureCodeModifier;
	}
	public CE_v2[] getObr_46_placerSupplementalServiceInformation() {
		return obr_46_placerSupplementalServiceInformation;
	}
	public CE_v2[] getObr_47_fillerSupplementalServiceInformation() {
		return obr_47_fillerSupplementalServiceInformation;
	}
	public CWE_v25 getObr_48_medicallyNecessaryDuplicateProcedureReason() {
		return obr_48_medicallyNecessaryDuplicateProcedureReason;
	}
	public String getObr_49_resultHandling() {
		return obr_49_resultHandling;
	}
	@Override
	public String toString() {
		return "JsonOBR_v25 [obr_1_setID=" + obr_1_setID + ", obr_2_placerOrderNumber=" + obr_2_placerOrderNumber
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
				+ ", nte=" + Arrays.toString(nte) + "]";
	}
}
