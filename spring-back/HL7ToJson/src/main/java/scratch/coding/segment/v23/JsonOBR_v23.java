package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_EIP_v23;
import scratch.coding.models.v23.CM_MOC_v23;
import scratch.coding.models.v23.CM_NDL_v23;
import scratch.coding.models.v23.CM_PRL_v23;
import scratch.coding.models.v23.CM_SPS_v23;
import scratch.coding.models.v23.CQ_v23;
import scratch.coding.models.v23.TQ_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XTN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonOBR_v23 {
	@JsonProperty("obr_1_setId")
	private String obr_1_setId;
	@JsonProperty("ei_obr_2_placeOrderNumber")
	private EI_v2[] ei_obr_2_placeOrderNumber;
	@JsonProperty("ei_obr_3_fillerOderNumber")
	private EI_v2 ei_obr_3_fillerOderNumber;
	@JsonProperty("ce_obr_4_universalServiceIdentifier")
	private CE_v2 ce_obr_4_universalServiceIdentifier;
	@JsonProperty("obr_5_priority")
	private String obr_5_priority;
	@JsonProperty("ts_obr_6_requestedDateTime")
	private TS_v2 ts_obr_6_requestedDateTime;
	@JsonProperty("ts_obr_7_observationDateTime")
	private TS_v2 ts_obr_7_observationDateTime;
	@JsonProperty("ts_obr_8_observationEndDateTime")
	private TS_v2 ts_obr_8_observationEndDateTime;
	@JsonProperty("cq_obr_9_collectionVolume")
	private CQ_v23 cq_obr_9_collectionVolume;
	@JsonProperty("xcn_obr_10_collectorIdentifier")
	private XCN_v23[] xcn_obr_10_collectorIdentifier;
	@JsonProperty("obr_11_specimenActionCode")
	private String obr_11_specimenActionCode;
	@JsonProperty("ce_obr_12_dangerCode")
	private CE_v2 ce_obr_12_dangerCode;
	@JsonProperty("obr_13_relevantClinicalInformation")
	private String obr_13_relevantClinicalInformation;
	@JsonProperty("ts_obr_14_specimenReceivedDateTime")
	private TS_v2 ts_obr_14_specimenReceivedDateTime;
	@JsonProperty("cm_sps_obr_15_specimenSource")
	private CM_SPS_v23 cm_sps_obr_15_specimenSource;
	@JsonProperty("xcn_obr_16_orderingProvider")
	private XCN_v23[] xcn_obr_16_orderingProvider;
	@JsonProperty("xtn_obr_17_orderCallbackPhoneNumber")
	private XTN_v23[] xtn_obr_17_orderCallbackPhoneNumber;
	@JsonProperty("obr_18_placerField1")
	private String obr_18_placerField1;
	@JsonProperty("obr_19_placerField2")
	private String obr_19_placerField2;
	@JsonProperty("obr_20_fillerField1")
	private String obr_20_fillerField1;
	@JsonProperty("obr_21_fillerField2")
	private String obr_21_fillerField2;
	@JsonProperty("ts_obr_22_resultsRptStatusChngDateTime")
	private TS_v2 ts_obr_22_resultsRptStatusChngDateTime;
	@JsonProperty("cm_moc_obr_23_chargeToPractice")
	private CM_MOC_v23 cm_moc_obr_23_chargeToPractice;
	@JsonProperty("obr_24_diagnosticServiceSectionId")
	private String obr_24_diagnosticServiceSectionId;
	@JsonProperty("obr_25_resultStatus")
	private String obr_25_resultStatus;
	@JsonProperty("cm_prl_obr_26_parentResult")
	private CM_PRL_v23 cm_prl_obr_26_parentResult;
	@JsonProperty("tq_obr_27_quantityTiming")
	private TQ_v23 tq_obr_27_quantityTiming;
	@JsonProperty("xcn_obr_28_resultCopiesTo")
	private XCN_v23[] xcn_obr_28_resultCopiesTo;
	@JsonProperty("cm_eip_obr_29_parentNumber")
	private CM_EIP_v23 cm_eip_obr_29_parentNumber;
	@JsonProperty("obr_30_transportationMode")
	private String obr_30_ransportationMode;
	@JsonProperty("ce_obr_31_reasonForStudy")
	private CE_v2[] ce_obr_31_reasonForStudy;
	@JsonProperty("cm_ndl_obr_32_principalResultInterpreter")
	private CM_NDL_v23 cm_ndl_obr_32_principalResultInterpreter;
	@JsonProperty("cm_ndl_obr_33_assistantResultInterpreter")
	private CM_NDL_v23[] cm_ndl_obr_33_assistantResultInterpreter;
	@JsonProperty("cm_ndl_obr_34_technician")
	private CM_NDL_v23[] cm_ndl_obr_34_technician;
	@JsonProperty("cm_ndl_obr_35_transcriptionist")
	private CM_NDL_v23[] cm_ndl_obr_35_transcriptionist;
	@JsonProperty("ts_obr_36_scheduledDateTime")
	private TS_v2 ts_obr_36_scheduledDateTime;
	@JsonProperty("obr_37_numberOfSampleContainers")
	private String obr_37_numberOfSampleContainers;
	@JsonProperty("ce_obr_38_transportLogisticsOfCollectedSample")
	private CE_v2[] ce_obr_38_transportLogisticsOfCollectedSample;
	@JsonProperty("ce_obr_39_collectorsComment")
	private CE_v2[] ce_obr_39_collectorsComment;
	@JsonProperty("ce_obr_40_transportArrangementResponsibility")
	private CE_v2 ce_obr_40_transportArrangementResponsibility;
	@JsonProperty("obr_41_transportArranged")
	private String obr_41_transportArranged;
	@JsonProperty("obr_42_escortRequired")
	private String obr_42_escortRequired;
	@JsonProperty("ce_obr_43_plannedPatientTransportComment")
	private CE_v2[] ce_obr_43_plannedPatientTransportComment;
	@JsonProperty("obx")
	private JsonOBX_v23[] obx;
	@JsonProperty("nte")
	private JsonNTE_v23[] nte;
	@JsonProperty("dg1")
	private JsonDG1_v23[] dg1;
	public JsonOBR_v23(OBRBuilder builder) {
		super();
		this.obr_1_setId = builder.obr_1_setId;
		this.ei_obr_2_placeOrderNumber = builder.ei_obr_2_placeOrderNumber;
		this.ei_obr_3_fillerOderNumber = builder.ei_obr_3_fillerOderNumber;
		this.ce_obr_4_universalServiceIdentifier = builder.ce_obr_4_universalServiceIdentifier;
		this.obr_5_priority = builder.obr_5_priority;
		this.ts_obr_6_requestedDateTime = builder.ts_obr_6_requestedDateTime;
		this.ts_obr_7_observationDateTime = builder.ts_obr_7_observationDateTime;
		this.ts_obr_8_observationEndDateTime = builder.ts_obr_8_observationEndDateTime;
		this.cq_obr_9_collectionVolume = builder.cq_obr_9_collectionVolume;
		this.xcn_obr_10_collectorIdentifier = builder.xcn_obr_10_collectorIdentifier;
		this.obr_11_specimenActionCode = builder.obr_11_specimenActionCode;
		this.ce_obr_12_dangerCode = builder.ce_obr_12_dangerCode;
		this.obr_13_relevantClinicalInformation = builder.obr_13_relevantClinicalInformation;
		this.ts_obr_14_specimenReceivedDateTime = builder.ts_obr_14_specimenReceivedDateTime;
		this.cm_sps_obr_15_specimenSource = builder.cm_sps_obr_15_specimenSource;
		this.xcn_obr_16_orderingProvider = builder.xcn_obr_16_orderingProvider;
		this.xtn_obr_17_orderCallbackPhoneNumber = builder.xtn_obr_17_orderCallbackPhoneNumber;
		this.obr_18_placerField1 = builder.obr_18_placerField1;
		this.obr_19_placerField2 = builder.obr_19_placerField2;
		this.obr_20_fillerField1 = builder.obr_20_fillerField1;
		this.obr_21_fillerField2 = builder.obr_21_fillerField2;
		this.ts_obr_22_resultsRptStatusChngDateTime = builder.ts_obr_22_resultsRptStatusChngDateTime;
		this.cm_moc_obr_23_chargeToPractice = builder.cm_moc_obr_23_chargeToPractice;
		this.obr_24_diagnosticServiceSectionId = builder.obr_24_diagnosticServiceSectionId;
		this.obr_25_resultStatus = builder.obr_25_resultStatus;
		this.cm_prl_obr_26_parentResult = builder.cm_prl_obr_26_parentResult;
		this.tq_obr_27_quantityTiming = builder.tq_obr_27_quantityTiming;
		this.xcn_obr_28_resultCopiesTo = builder.xcn_obr_28_resultCopiesTo;
		this.cm_eip_obr_29_parentNumber = builder.cm_eip_obr_29_parentNumber;
		this.obr_30_ransportationMode = builder.obr_30_ransportationMode;
		this.ce_obr_31_reasonForStudy = builder.ce_obr_31_reasonForStudy;
		this.cm_ndl_obr_32_principalResultInterpreter = builder.cm_ndl_obr_32_principalResultInterpreter;
		this.cm_ndl_obr_33_assistantResultInterpreter = builder.cm_ndl_obr_33_assistantResultInterpreter;
		this.cm_ndl_obr_34_technician = builder.cm_ndl_obr_34_technician;
		this.cm_ndl_obr_35_transcriptionist = builder.cm_ndl_obr_35_transcriptionist;
		this.ts_obr_36_scheduledDateTime = builder.ts_obr_36_scheduledDateTime;
		this.obr_37_numberOfSampleContainers = builder.obr_37_numberOfSampleContainers;
		this.ce_obr_38_transportLogisticsOfCollectedSample = builder.ce_obr_38_transportLogisticsOfCollectedSample;
		this.ce_obr_39_collectorsComment = builder.ce_obr_39_collectorsComment;
		this.ce_obr_40_transportArrangementResponsibility = builder.ce_obr_40_transportArrangementResponsibility;
		this.obr_41_transportArranged = builder.obr_41_transportArranged;
		this.obr_42_escortRequired = builder.obr_42_escortRequired;
		this.ce_obr_43_plannedPatientTransportComment = builder.ce_obr_43_plannedPatientTransportComment;
		this.obx = builder.obx;
		this.nte = builder.nte;
		this.dg1 = builder.dg1;
	}
	
	public JsonOBR_v23(String obr_1_setId, EI_v2[] ei_obr_2_placeOrderNumber, EI_v2 ei_obr_3_fillerOderNumber,
			CE_v2 ce_obr_4_universalServiceIdentifier, String obr_5_priority, TS_v2 ts_obr_6_requestedDateTime,
			TS_v2 ts_obr_7_observationDateTime, TS_v2 ts_obr_8_observationEndDateTime, CQ_v23 cq_obr_9_collectionVolume,
			XCN_v23[] xcn_obr_10_collectorIdentifier, String obr_11_specimenActionCode, CE_v2 ce_obr_12_dangerCode,
			String obr_13_relevantClinicalInformation, TS_v2 ts_obr_14_specimenReceivedDateTime,
			CM_SPS_v23 cm_sps_obr_15_specimenSource, XCN_v23[] xcn_obr_16_orderingProvider,
			XTN_v23[] xtn_obr_17_orderCallbackPhoneNumber, String obr_18_placerField1, String obr_19_placerField2,
			String obr_20_fillerField1, String obr_21_fillerField2, TS_v2 ts_obr_22_resultsRptStatusChngDateTime,
			CM_MOC_v23 cm_moc_obr_23_chargeToPractice, String obr_24_diagnosticServiceSectionId,
			String obr_25_resultStatus, CM_PRL_v23 cm_prl_obr_26_parentResult, TQ_v23 tq_obr_27_quantityTiming,
			XCN_v23[] xcn_obr_28_resultCopiesTo, CM_EIP_v23 cm_eip_obr_29_parentNumber, String obr_30_ransportationMode,
			CE_v2[] ce_obr_31_reasonForStudy, CM_NDL_v23 cm_ndl_obr_32_principalResultInterpreter,
			CM_NDL_v23[] cm_ndl_obr_33_assistantResultInterpreter, CM_NDL_v23[] cm_ndl_obr_34_technician,
			CM_NDL_v23[] cm_ndl_obr_35_transcriptionist, TS_v2 ts_obr_36_scheduledDateTime,
			String obr_37_numberOfSampleContainers, CE_v2[] ce_obr_38_transportLogisticsOfCollectedSample,
			CE_v2[] ce_obr_39_collectorsComment, CE_v2 ce_obr_40_transportArrangementResponsibility,
			String obr_41_transportArranged, String obr_42_escortRequired,
			CE_v2[] ce_obr_43_plannedPatientTransportComment, JsonOBX_v23[] obx, JsonNTE_v23[] nte, JsonDG1_v23[] dg1) {
		super();
		this.obr_1_setId = obr_1_setId;
		this.ei_obr_2_placeOrderNumber = ei_obr_2_placeOrderNumber;
		this.ei_obr_3_fillerOderNumber = ei_obr_3_fillerOderNumber;
		this.ce_obr_4_universalServiceIdentifier = ce_obr_4_universalServiceIdentifier;
		this.obr_5_priority = obr_5_priority;
		this.ts_obr_6_requestedDateTime = ts_obr_6_requestedDateTime;
		this.ts_obr_7_observationDateTime = ts_obr_7_observationDateTime;
		this.ts_obr_8_observationEndDateTime = ts_obr_8_observationEndDateTime;
		this.cq_obr_9_collectionVolume = cq_obr_9_collectionVolume;
		this.xcn_obr_10_collectorIdentifier = xcn_obr_10_collectorIdentifier;
		this.obr_11_specimenActionCode = obr_11_specimenActionCode;
		this.ce_obr_12_dangerCode = ce_obr_12_dangerCode;
		this.obr_13_relevantClinicalInformation = obr_13_relevantClinicalInformation;
		this.ts_obr_14_specimenReceivedDateTime = ts_obr_14_specimenReceivedDateTime;
		this.cm_sps_obr_15_specimenSource = cm_sps_obr_15_specimenSource;
		this.xcn_obr_16_orderingProvider = xcn_obr_16_orderingProvider;
		this.xtn_obr_17_orderCallbackPhoneNumber = xtn_obr_17_orderCallbackPhoneNumber;
		this.obr_18_placerField1 = obr_18_placerField1;
		this.obr_19_placerField2 = obr_19_placerField2;
		this.obr_20_fillerField1 = obr_20_fillerField1;
		this.obr_21_fillerField2 = obr_21_fillerField2;
		this.ts_obr_22_resultsRptStatusChngDateTime = ts_obr_22_resultsRptStatusChngDateTime;
		this.cm_moc_obr_23_chargeToPractice = cm_moc_obr_23_chargeToPractice;
		this.obr_24_diagnosticServiceSectionId = obr_24_diagnosticServiceSectionId;
		this.obr_25_resultStatus = obr_25_resultStatus;
		this.cm_prl_obr_26_parentResult = cm_prl_obr_26_parentResult;
		this.tq_obr_27_quantityTiming = tq_obr_27_quantityTiming;
		this.xcn_obr_28_resultCopiesTo = xcn_obr_28_resultCopiesTo;
		this.cm_eip_obr_29_parentNumber = cm_eip_obr_29_parentNumber;
		this.obr_30_ransportationMode = obr_30_ransportationMode;
		this.ce_obr_31_reasonForStudy = ce_obr_31_reasonForStudy;
		this.cm_ndl_obr_32_principalResultInterpreter = cm_ndl_obr_32_principalResultInterpreter;
		this.cm_ndl_obr_33_assistantResultInterpreter = cm_ndl_obr_33_assistantResultInterpreter;
		this.cm_ndl_obr_34_technician = cm_ndl_obr_34_technician;
		this.cm_ndl_obr_35_transcriptionist = cm_ndl_obr_35_transcriptionist;
		this.ts_obr_36_scheduledDateTime = ts_obr_36_scheduledDateTime;
		this.obr_37_numberOfSampleContainers = obr_37_numberOfSampleContainers;
		this.ce_obr_38_transportLogisticsOfCollectedSample = ce_obr_38_transportLogisticsOfCollectedSample;
		this.ce_obr_39_collectorsComment = ce_obr_39_collectorsComment;
		this.ce_obr_40_transportArrangementResponsibility = ce_obr_40_transportArrangementResponsibility;
		this.obr_41_transportArranged = obr_41_transportArranged;
		this.obr_42_escortRequired = obr_42_escortRequired;
		this.ce_obr_43_plannedPatientTransportComment = ce_obr_43_plannedPatientTransportComment;
		this.obx = obx;
		this.nte = nte;
		this.dg1 = dg1;
	}

	public JsonOBR_v23() {
		super();
		this.obr_1_setId = "";
		this.ei_obr_2_placeOrderNumber = new EI_v2[] {};
		this.ei_obr_3_fillerOderNumber = new EI_v2();
		this.ce_obr_4_universalServiceIdentifier = new CE_v2();
		this.obr_5_priority = "";
		this.ts_obr_6_requestedDateTime = new TS_v2();
		this.ts_obr_7_observationDateTime = new TS_v2();
		this.ts_obr_8_observationEndDateTime = new TS_v2();
		this.cq_obr_9_collectionVolume = new CQ_v23();
		this.xcn_obr_10_collectorIdentifier = new XCN_v23[] {};
		this.obr_11_specimenActionCode = "";
		this.ce_obr_12_dangerCode = new CE_v2();
		this.obr_13_relevantClinicalInformation = "";
		this.ts_obr_14_specimenReceivedDateTime = new TS_v2();
		this.cm_sps_obr_15_specimenSource = new CM_SPS_v23();
		this.xcn_obr_16_orderingProvider = new XCN_v23[] {};
		this.xtn_obr_17_orderCallbackPhoneNumber = new XTN_v23[] {};
		this.obr_18_placerField1 = "";
		this.obr_19_placerField2 = "";
		this.obr_20_fillerField1 = "";
		this.obr_21_fillerField2 = "";
		this.ts_obr_22_resultsRptStatusChngDateTime = new TS_v2();
		this.cm_moc_obr_23_chargeToPractice = new CM_MOC_v23();
		this.obr_24_diagnosticServiceSectionId = "";
		this.obr_25_resultStatus = "";
		this.cm_prl_obr_26_parentResult = new CM_PRL_v23();
		this.tq_obr_27_quantityTiming = new TQ_v23();
		this.xcn_obr_28_resultCopiesTo = new XCN_v23[] {};
		this.cm_eip_obr_29_parentNumber = new CM_EIP_v23();
		this.obr_30_ransportationMode = "";
		this.ce_obr_31_reasonForStudy = new CE_v2[] {};
		this.cm_ndl_obr_32_principalResultInterpreter = new CM_NDL_v23();
		this.cm_ndl_obr_33_assistantResultInterpreter = new CM_NDL_v23[] {};
		this.cm_ndl_obr_34_technician = new CM_NDL_v23[] {};
		this.cm_ndl_obr_35_transcriptionist = new CM_NDL_v23[] {};
		this.ts_obr_36_scheduledDateTime = new TS_v2();
		this.obr_37_numberOfSampleContainers = "";
		this.ce_obr_38_transportLogisticsOfCollectedSample = new CE_v2[] {};
		this.ce_obr_39_collectorsComment = new CE_v2[] {};
		this.ce_obr_40_transportArrangementResponsibility = new CE_v2();
		this.obr_41_transportArranged = "";
		this.obr_42_escortRequired = "";
		this.ce_obr_43_plannedPatientTransportComment = new CE_v2[] {};
		this.obx = new JsonOBX_v23[] {};
		this.nte = new JsonNTE_v23[] {};
		this.dg1 = new JsonDG1_v23[] {};
	}
	public static class OBRBuilder {
		private String obr_1_setId;
		private EI_v2[] ei_obr_2_placeOrderNumber;
		private EI_v2 ei_obr_3_fillerOderNumber;
		private CE_v2 ce_obr_4_universalServiceIdentifier;
		private String obr_5_priority;
		private TS_v2 ts_obr_6_requestedDateTime;
		private TS_v2 ts_obr_7_observationDateTime;
		private TS_v2 ts_obr_8_observationEndDateTime;
		private CQ_v23 cq_obr_9_collectionVolume;
		private XCN_v23[] xcn_obr_10_collectorIdentifier;
		private String obr_11_specimenActionCode;
		private CE_v2 ce_obr_12_dangerCode;
		private String obr_13_relevantClinicalInformation;
		private TS_v2 ts_obr_14_specimenReceivedDateTime;
		private CM_SPS_v23 cm_sps_obr_15_specimenSource;
		private XCN_v23[] xcn_obr_16_orderingProvider;
		private XTN_v23[] xtn_obr_17_orderCallbackPhoneNumber;
		private String obr_18_placerField1;
		private String obr_19_placerField2;
		private String obr_20_fillerField1;
		private String obr_21_fillerField2;
		private TS_v2 ts_obr_22_resultsRptStatusChngDateTime;
		private CM_MOC_v23 cm_moc_obr_23_chargeToPractice;
		private String obr_24_diagnosticServiceSectionId;
		private String obr_25_resultStatus;
		private CM_PRL_v23 cm_prl_obr_26_parentResult;
		private TQ_v23 tq_obr_27_quantityTiming;
		private XCN_v23[] xcn_obr_28_resultCopiesTo;
		private CM_EIP_v23 cm_eip_obr_29_parentNumber;
		private String obr_30_ransportationMode;
		private CE_v2[] ce_obr_31_reasonForStudy;
		private CM_NDL_v23 cm_ndl_obr_32_principalResultInterpreter;
		private CM_NDL_v23[] cm_ndl_obr_33_assistantResultInterpreter;
		private CM_NDL_v23[] cm_ndl_obr_34_technician;
		private CM_NDL_v23[] cm_ndl_obr_35_transcriptionist;
		private TS_v2 ts_obr_36_scheduledDateTime;
		private String obr_37_numberOfSampleContainers;
		private CE_v2[] ce_obr_38_transportLogisticsOfCollectedSample;
		private CE_v2[] ce_obr_39_collectorsComment;
		private CE_v2 ce_obr_40_transportArrangementResponsibility;
		private String obr_41_transportArranged;
		private String obr_42_escortRequired;
		private CE_v2[] ce_obr_43_plannedPatientTransportComment;
		private JsonOBX_v23[] obx;
		private JsonNTE_v23[] nte;
		private JsonDG1_v23[] dg1;
		public OBRBuilder(CE_v2 ce_obr_4_universalServiceIdentifier) {
			super();
			this.obr_1_setId = "";
			this.ei_obr_2_placeOrderNumber = new EI_v2[] {};
			this.ei_obr_3_fillerOderNumber = new EI_v2();
			this.ce_obr_4_universalServiceIdentifier = ce_obr_4_universalServiceIdentifier;
			this.obr_5_priority = "";
			this.ts_obr_6_requestedDateTime = new TS_v2();
			this.ts_obr_7_observationDateTime = new TS_v2();
			this.ts_obr_8_observationEndDateTime = new TS_v2();
			this.cq_obr_9_collectionVolume = new CQ_v23();
			this.xcn_obr_10_collectorIdentifier = new XCN_v23[] {};
			this.obr_11_specimenActionCode = "";
			this.ce_obr_12_dangerCode = new CE_v2();
			this.obr_13_relevantClinicalInformation = "";
			this.ts_obr_14_specimenReceivedDateTime = new TS_v2();
			this.cm_sps_obr_15_specimenSource = new CM_SPS_v23();
			this.xcn_obr_16_orderingProvider = new XCN_v23[] {};
			this.xtn_obr_17_orderCallbackPhoneNumber = new XTN_v23[] {};
			this.obr_18_placerField1 = "";
			this.obr_19_placerField2 = "";
			this.obr_20_fillerField1 = "";
			this.obr_21_fillerField2 = "";
			this.ts_obr_22_resultsRptStatusChngDateTime = new TS_v2();
			this.cm_moc_obr_23_chargeToPractice = new CM_MOC_v23();
			this.obr_24_diagnosticServiceSectionId = "";
			this.obr_25_resultStatus = "";
			this.cm_prl_obr_26_parentResult = new CM_PRL_v23();
			this.tq_obr_27_quantityTiming = new TQ_v23();
			this.xcn_obr_28_resultCopiesTo = new XCN_v23[] {};
			this.cm_eip_obr_29_parentNumber = new CM_EIP_v23();
			this.obr_30_ransportationMode = "";
			this.ce_obr_31_reasonForStudy = new CE_v2[] {};
			this.cm_ndl_obr_32_principalResultInterpreter = new CM_NDL_v23();
			this.cm_ndl_obr_33_assistantResultInterpreter = new CM_NDL_v23[] {};
			this.cm_ndl_obr_34_technician = new CM_NDL_v23[] {};
			this.cm_ndl_obr_35_transcriptionist = new CM_NDL_v23[] {};
			this.ts_obr_36_scheduledDateTime = new TS_v2();
			this.obr_37_numberOfSampleContainers = "";
			this.ce_obr_38_transportLogisticsOfCollectedSample = new CE_v2[] {};
			this.ce_obr_39_collectorsComment = new CE_v2[] {};
			this.ce_obr_40_transportArrangementResponsibility = new CE_v2();
			this.obr_41_transportArranged = "";
			this.obr_42_escortRequired = "";
			this.ce_obr_43_plannedPatientTransportComment = new CE_v2[] {};
		}
		public OBRBuilder obr_1_setId(String obr_1_setId) {
			this.obr_1_setId = obr_1_setId;
			return this;
		}
		public OBRBuilder ei_obr_2_placeOrderNumber(EI_v2[] ei_obr_2_placeOrderNumber) {
			this.ei_obr_2_placeOrderNumber = ei_obr_2_placeOrderNumber;
			return this;
		}
		public OBRBuilder setEi_obr_3_fillerOderNumber(EI_v2 ei_obr_3_fillerOderNumber) {
			this.ei_obr_3_fillerOderNumber = ei_obr_3_fillerOderNumber;
			return this;
		}
		public OBRBuilder setCe_obr_4_universalServiceIdentifier(CE_v2 ce_obr_4_universalServiceIdentifier) {
			this.ce_obr_4_universalServiceIdentifier = ce_obr_4_universalServiceIdentifier;
			return this;
		}
		public OBRBuilder setObr_5_priority(String obr_5_priority) {
			this.obr_5_priority = obr_5_priority;
			return this;
		}
		public OBRBuilder setTs_obr_6_requestedDateTime(TS_v2 ts_obr_6_requestedDateTime) {
			this.ts_obr_6_requestedDateTime = ts_obr_6_requestedDateTime;
			return this;
		}
		public OBRBuilder setTs_obr_7_observationDateTime(TS_v2 ts_obr_7_observationDateTime) {
			this.ts_obr_7_observationDateTime = ts_obr_7_observationDateTime;
			return this;
		}
		public OBRBuilder setTs_obr_8_observationEndDateTime(TS_v2 ts_obr_8_observationEndDateTime) {
			this.ts_obr_8_observationEndDateTime = ts_obr_8_observationEndDateTime;
			return this;
		}
		public OBRBuilder setCq_obr_9_collectionVolume(CQ_v23 cq_obr_9_collectionVolume) {
			this.cq_obr_9_collectionVolume = cq_obr_9_collectionVolume;
			return this;
		}
		public OBRBuilder setXcn_obr_10_collectorIdentifier(XCN_v23[] xcn_obr_10_collectorIdentifier) {
			this.xcn_obr_10_collectorIdentifier = xcn_obr_10_collectorIdentifier;
			return this;
		}
		public OBRBuilder setObr_11_specimenActionCode(String obr_11_specimenActionCode) {
			this.obr_11_specimenActionCode = obr_11_specimenActionCode;
			return this;
		}
		public OBRBuilder setCe_obr_12_dangerCode(CE_v2 ce_obr_12_dangerCode) {
			this.ce_obr_12_dangerCode = ce_obr_12_dangerCode;
			return this;
		}
		public OBRBuilder setObr_13_relevantClinicalInformation(String obr_13_relevantClinicalInformation) {
			this.obr_13_relevantClinicalInformation = obr_13_relevantClinicalInformation;
			return this;
		}
		public OBRBuilder setTs_obr_14_specimenReceivedDateTime(TS_v2 ts_obr_14_specimenReceivedDateTime) {
			this.ts_obr_14_specimenReceivedDateTime = ts_obr_14_specimenReceivedDateTime;
			return this;
		}
		public OBRBuilder setCm_sps_obr_15_specimenSource(CM_SPS_v23 cm_sps_obr_15_specimenSource) {
			this.cm_sps_obr_15_specimenSource = cm_sps_obr_15_specimenSource;
			return this;
		}
		public OBRBuilder setXcn_obr_16_orderingProvider(XCN_v23[] xcn_obr_16_orderingProvider) {
			this.xcn_obr_16_orderingProvider = xcn_obr_16_orderingProvider;
			return this;
		}
		public OBRBuilder setXtn_obr_17_orderCallbackPhoneNumber(XTN_v23[] xtn_obr_17_orderCallbackPhoneNumber) {
			this.xtn_obr_17_orderCallbackPhoneNumber = xtn_obr_17_orderCallbackPhoneNumber;
			return this;
		}
		public OBRBuilder setObr_18_placerField1(String obr_18_placerField1) {
			this.obr_18_placerField1 = obr_18_placerField1;
			return this;
		}
		public OBRBuilder setObr_19_placerField2(String obr_19_placerField2) {
			this.obr_19_placerField2 = obr_19_placerField2;
			return this;
		}
		public OBRBuilder setObr_20_fillerField1(String obr_20_fillerField1) {
			this.obr_20_fillerField1 = obr_20_fillerField1;
			return this;
		}
		public OBRBuilder setObr_21_fillerField2(String obr_21_fillerField2) {
			this.obr_21_fillerField2 = obr_21_fillerField2;
			return this;
		}
		public OBRBuilder setTs_obr_22_resultsRptStatusChngDateTime(TS_v2 ts_obr_22_resultsRptStatusChngDateTime) {
			this.ts_obr_22_resultsRptStatusChngDateTime = ts_obr_22_resultsRptStatusChngDateTime;
			return this;
		}
		public OBRBuilder setCm_moc_obr_23_chargeToPractice(CM_MOC_v23 cm_moc_obr_23_chargeToPractice) {
			this.cm_moc_obr_23_chargeToPractice = cm_moc_obr_23_chargeToPractice;
			return this;
		}
		public OBRBuilder setObr_24_diagnosticServiceSectionId(String obr_24_diagnosticServiceSectionId) {
			this.obr_24_diagnosticServiceSectionId = obr_24_diagnosticServiceSectionId;
			return this;
		}
		public OBRBuilder setObr_25_resultStatus(String obr_25_resultStatus) {
			this.obr_25_resultStatus = obr_25_resultStatus;
			return this;
		}
		public OBRBuilder setCm_prl_obr_26_parentResult(CM_PRL_v23 cm_prl_obr_26_parentResult) {
			this.cm_prl_obr_26_parentResult = cm_prl_obr_26_parentResult;
			return this;
		}
		public OBRBuilder setTq_obr_27_quantityTiming(TQ_v23 tq_obr_27_quantityTiming) {
			this.tq_obr_27_quantityTiming = tq_obr_27_quantityTiming;
			return this;
		}
		public OBRBuilder setXcn_obr_28_resultCopiesTo(XCN_v23[] xcn_obr_28_resultCopiesTo) {
			this.xcn_obr_28_resultCopiesTo = xcn_obr_28_resultCopiesTo;
			return this;
		}
		public OBRBuilder setCm_eip_obr_29_parentNumber(CM_EIP_v23 cm_eip_obr_29_parentNumber) {
			this.cm_eip_obr_29_parentNumber = cm_eip_obr_29_parentNumber;
			return this;
		}
		public OBRBuilder setObr_30_ransportationMode(String obr_30_ransportationMode) {
			this.obr_30_ransportationMode = obr_30_ransportationMode;
			return this;
		}
		public OBRBuilder setCe_obr_31_reasonForStudy(CE_v2[] ce_obr_31_reasonForStudy) {
			this.ce_obr_31_reasonForStudy = ce_obr_31_reasonForStudy;
			return this;
		}
		public OBRBuilder setCm_ndl_obr_32_principalResultInterpreter(CM_NDL_v23 cm_ndl_obr_32_principalResultInterpreter) {
			this.cm_ndl_obr_32_principalResultInterpreter = cm_ndl_obr_32_principalResultInterpreter;
			return this;
		}
		public OBRBuilder setCm_ndl_obr_33_assistantResultInterpreter(CM_NDL_v23[] cm_ndl_obr_33_assistantResultInterpreter) {
			this.cm_ndl_obr_33_assistantResultInterpreter = cm_ndl_obr_33_assistantResultInterpreter;
			return this;
		}
		public OBRBuilder setCm_ndl_obr_34_technician(CM_NDL_v23[] cm_ndl_obr_34_technician) {
			this.cm_ndl_obr_34_technician = cm_ndl_obr_34_technician;
			return this;
		}
		public OBRBuilder setCm_ndl_obr_35_transcriptionist(CM_NDL_v23[] cm_ndl_obr_35_transcriptionist) {
			this.cm_ndl_obr_35_transcriptionist = cm_ndl_obr_35_transcriptionist;
			return this;
		}
		public OBRBuilder setTs_obr_36_scheduledDateTime(TS_v2 ts_obr_36_scheduledDateTime) {
			this.ts_obr_36_scheduledDateTime = ts_obr_36_scheduledDateTime;
			return this;
		}
		public OBRBuilder setObr_37_numberOfSampleContainers(String obr_37_numberOfSampleContainers) {
			this.obr_37_numberOfSampleContainers = obr_37_numberOfSampleContainers;
			return this;
		}
		public OBRBuilder setCe_obr_38_transportLogisticsOfCollectedSample(CE_v2[] ce_obr_38_transportLogisticsOfCollectedSample) {
			this.ce_obr_38_transportLogisticsOfCollectedSample = ce_obr_38_transportLogisticsOfCollectedSample;
			return this;
		}
		public OBRBuilder setCe_obr_39_collectorsComment(CE_v2[] ce_obr_39_collectorsComment) {
			this.ce_obr_39_collectorsComment = ce_obr_39_collectorsComment;
			return this;
		}
		public OBRBuilder setCe_obr_40_transportArrangementResponsibility(CE_v2 ce_obr_40_transportArrangementResponsibility) {
			this.ce_obr_40_transportArrangementResponsibility = ce_obr_40_transportArrangementResponsibility;
			return this;
		}
		public OBRBuilder setObr_41_transportArranged(String obr_41_transportArranged) {
			this.obr_41_transportArranged = obr_41_transportArranged;
			return this;
		}
		public OBRBuilder setObr_42_escortRequired(String obr_42_escortRequired) {
			this.obr_42_escortRequired = obr_42_escortRequired;
			return this;
		}
		public OBRBuilder setCe_obr_43_plannedPatientTransportComment(CE_v2[] ce_obr_43_plannedPatientTransportComment) {
			this.ce_obr_43_plannedPatientTransportComment = ce_obr_43_plannedPatientTransportComment;
			return this;
		}
		public OBRBuilder setObx(JsonOBX_v23[] obx) {
			this.obx = obx;
			return this;
		}
		public OBRBuilder setNte(JsonNTE_v23[] nte) {
			this.nte = nte;
			return this;
		}
		public OBRBuilder setDg1(JsonDG1_v23[] dg1) {
			this.dg1 = dg1;
			return this;
		}
		public JsonOBR_v23 build() {
			return new JsonOBR_v23(this);
		}
	}
	public String getObr_1_setId() {
		return obr_1_setId;
	}
	public EI_v2[] getEi_obr_2_placeOrderNumber() {
		return ei_obr_2_placeOrderNumber;
	}
	public EI_v2 getEi_obr_3_fillerOderNumber() {
		return ei_obr_3_fillerOderNumber;
	}
	public CE_v2 getCe_obr_4_universalServiceIdentifier() {
		return ce_obr_4_universalServiceIdentifier;
	}
	public String getObr_5_priority() {
		return obr_5_priority;
	}
	public TS_v2 getTs_obr_6_requestedDateTime() {
		return ts_obr_6_requestedDateTime;
	}
	public TS_v2 getTs_obr_7_observationDateTime() {
		return ts_obr_7_observationDateTime;
	}
	public TS_v2 getTs_obr_8_observationEndDateTime() {
		return ts_obr_8_observationEndDateTime;
	}
	public CQ_v23 getCq_obr_9_collectionVolume() {
		return cq_obr_9_collectionVolume;
	}
	public XCN_v23[] getXcn_obr_10_collectorIdentifier() {
		return xcn_obr_10_collectorIdentifier;
	}
	public String getObr_11_specimenActionCode() {
		return obr_11_specimenActionCode;
	}
	public CE_v2 getCe_obr_12_dangerCode() {
		return ce_obr_12_dangerCode;
	}
	public String getObr_13_relevantClinicalInformation() {
		return obr_13_relevantClinicalInformation;
	}
	public TS_v2 getTs_obr_14_specimenReceivedDateTime() {
		return ts_obr_14_specimenReceivedDateTime;
	}
	public CM_SPS_v23 getCm_sps_obr_15_specimenSource() {
		return cm_sps_obr_15_specimenSource;
	}
	public XCN_v23[] getXcn_obr_16_orderingProvider() {
		return xcn_obr_16_orderingProvider;
	}
	public XTN_v23[] getXtn_obr_17_orderCallbackPhoneNumber() {
		return xtn_obr_17_orderCallbackPhoneNumber;
	}
	public String getObr_18_placerField1() {
		return obr_18_placerField1;
	}
	public String getObr_19_placerField2() {
		return obr_19_placerField2;
	}
	public String getObr_20_fillerField1() {
		return obr_20_fillerField1;
	}
	public String getObr_21_fillerField2() {
		return obr_21_fillerField2;
	}
	public TS_v2 getTs_obr_22_resultsRptStatusChngDateTime() {
		return ts_obr_22_resultsRptStatusChngDateTime;
	}
	public CM_MOC_v23 getCm_moc_obr_23_chargeToPractice() {
		return cm_moc_obr_23_chargeToPractice;
	}
	public String getObr_24_diagnosticServiceSectionId() {
		return obr_24_diagnosticServiceSectionId;
	}
	public String getObr_25_resultStatus() {
		return obr_25_resultStatus;
	}
	public CM_PRL_v23 getCm_prl_obr_26_parentResult() {
		return cm_prl_obr_26_parentResult;
	}
	public TQ_v23 getTq_obr_27_quantityTiming() {
		return tq_obr_27_quantityTiming;
	}
	public XCN_v23[] getXcn_obr_28_resultCopiesTo() {
		return xcn_obr_28_resultCopiesTo;
	}
	public CM_EIP_v23 getCm_eip_obr_29_parentNumber() {
		return cm_eip_obr_29_parentNumber;
	}
	public String getObr_30_ransportationMode() {
		return obr_30_ransportationMode;
	}
	public CE_v2[] getCe_obr_31_reasonForStudy() {
		return ce_obr_31_reasonForStudy;
	}
	public CM_NDL_v23 getCm_ndl_obr_32_principalResultInterpreter() {
		return cm_ndl_obr_32_principalResultInterpreter;
	}
	public CM_NDL_v23[] getCm_ndl_obr_33_assistantResultInterpreter() {
		return cm_ndl_obr_33_assistantResultInterpreter;
	}
	public CM_NDL_v23[] getCm_ndl_obr_34_technician() {
		return cm_ndl_obr_34_technician;
	}
	public CM_NDL_v23[] getCm_ndl_obr_35_transcriptionist() {
		return cm_ndl_obr_35_transcriptionist;
	}
	public TS_v2 getTs_obr_36_scheduledDateTime() {
		return ts_obr_36_scheduledDateTime;
	}
	public String getObr_37_numberOfSampleContainers() {
		return obr_37_numberOfSampleContainers;
	}
	public CE_v2[] getCe_obr_38_transportLogisticsOfCollectedSample() {
		return ce_obr_38_transportLogisticsOfCollectedSample;
	}
	public CE_v2[] getCe_obr_39_collectorsComment() {
		return ce_obr_39_collectorsComment;
	}
	public CE_v2 getCe_obr_40_transportArrangementResponsibility() {
		return ce_obr_40_transportArrangementResponsibility;
	}
	public String getObr_41_transportArranged() {
		return obr_41_transportArranged;
	}
	public String getObr_42_escortRequired() {
		return obr_42_escortRequired;
	}
	public CE_v2[] getCe_obr_43_plannedPatientTransportComment() {
		return ce_obr_43_plannedPatientTransportComment;
	}
	public JsonOBX_v23[] getObx() {
		return obx;
	}
	public JsonNTE_v23[] getNte() {
		return nte;
	}
	public JsonDG1_v23[] getDg1() {
		return dg1;
	}
	@Override
	public String toString() {
		return "JsonOBR_v23 [obr_1_setId=" + obr_1_setId + ", ei_obr_2_placeOrderNumber="
				+ Arrays.toString(ei_obr_2_placeOrderNumber) + ", ei_obr_3_fillerOderNumber="
				+ ei_obr_3_fillerOderNumber + ", ce_obr_4_universalServiceIdentifier="
				+ ce_obr_4_universalServiceIdentifier + ", obr_5_priority=" + obr_5_priority
				+ ", ts_obr_6_requestedDateTime=" + ts_obr_6_requestedDateTime + ", ts_obr_7_observationDateTime="
				+ ts_obr_7_observationDateTime + ", ts_obr_8_observationEndDateTime=" + ts_obr_8_observationEndDateTime
				+ ", cq_obr_9_collectionVolume=" + cq_obr_9_collectionVolume + ", xcn_obr_10_collectorIdentifier="
				+ Arrays.toString(xcn_obr_10_collectorIdentifier) + ", obr_11_specimenActionCode="
				+ obr_11_specimenActionCode + ", ce_obr_12_dangerCode=" + ce_obr_12_dangerCode
				+ ", obr_13_relevantClinicalInformation=" + obr_13_relevantClinicalInformation
				+ ", ts_obr_14_specimenReceivedDateTime=" + ts_obr_14_specimenReceivedDateTime
				+ ", cm_sps_obr_15_specimenSource=" + cm_sps_obr_15_specimenSource + ", xcn_obr_16_orderingProvider="
				+ Arrays.toString(xcn_obr_16_orderingProvider) + ", xtn_obr_17_orderCallbackPhoneNumber="
				+ Arrays.toString(xtn_obr_17_orderCallbackPhoneNumber) + ", obr_18_placerField1=" + obr_18_placerField1
				+ ", obr_19_placerField2=" + obr_19_placerField2 + ", obr_20_fillerField1=" + obr_20_fillerField1
				+ ", obr_21_fillerField2=" + obr_21_fillerField2 + ", ts_obr_22_resultsRptStatusChngDateTime="
				+ ts_obr_22_resultsRptStatusChngDateTime + ", cm_moc_obr_23_chargeToPractice="
				+ cm_moc_obr_23_chargeToPractice + ", obr_24_diagnosticServiceSectionId="
				+ obr_24_diagnosticServiceSectionId + ", obr_25_resultStatus=" + obr_25_resultStatus
				+ ", cm_prl_obr_26_parentResult=" + cm_prl_obr_26_parentResult + ", tq_obr_27_quantityTiming="
				+ tq_obr_27_quantityTiming + ", xcn_obr_28_resultCopiesTo=" + Arrays.toString(xcn_obr_28_resultCopiesTo)
				+ ", cm_eip_obr_29_parentNumber=" + cm_eip_obr_29_parentNumber + ", obr_30_ransportationMode="
				+ obr_30_ransportationMode + ", ce_obr_31_reasonForStudy=" + Arrays.toString(ce_obr_31_reasonForStudy)
				+ ", cm_ndl_obr_32_principalResultInterpreter=" + cm_ndl_obr_32_principalResultInterpreter
				+ ", cm_ndl_obr_33_assistantResultInterpreter="
				+ Arrays.toString(cm_ndl_obr_33_assistantResultInterpreter) + ", cm_ndl_obr_34_technician="
				+ Arrays.toString(cm_ndl_obr_34_technician) + ", cm_ndl_obr_35_transcriptionist="
				+ Arrays.toString(cm_ndl_obr_35_transcriptionist) + ", ts_obr_36_scheduledDateTime="
				+ ts_obr_36_scheduledDateTime + ", obr_37_numberOfSampleContainers=" + obr_37_numberOfSampleContainers
				+ ", ce_obr_38_transportLogisticsOfCollectedSample="
				+ Arrays.toString(ce_obr_38_transportLogisticsOfCollectedSample) + ", ce_obr_39_collectorsComment="
				+ Arrays.toString(ce_obr_39_collectorsComment) + ", ce_obr_40_transportArrangementResponsibility="
				+ ce_obr_40_transportArrangementResponsibility + ", obr_41_transportArranged="
				+ obr_41_transportArranged + ", obr_42_escortRequired=" + obr_42_escortRequired
				+ ", ce_obr_43_plannedPatientTransportComment="
				+ Arrays.toString(ce_obr_43_plannedPatientTransportComment) + ", obx=" + Arrays.toString(obx) + ", nte="
				+ Arrays.toString(nte) + ", dg1=" + Arrays.toString(dg1) + "]";
	}
	
}
