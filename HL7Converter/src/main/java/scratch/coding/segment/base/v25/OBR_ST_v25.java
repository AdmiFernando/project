//package scratch.coding.segment.base.v25;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.MOC_ST;
//import scratch.coding.models.base.PRL_ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v25.CQ_ST_v25;
//import scratch.coding.models.base.v25.CWE_ST_v25;
//import scratch.coding.models.base.v25.EIP_ST_v25;
//import scratch.coding.models.base.v25.EI_ST_v25;
//import scratch.coding.models.base.v25.NDL_ST_v25;
//import scratch.coding.models.base.v25.SPS_ST_v25;
//import scratch.coding.models.base.v25.TQ_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XTN_ST_v25;
//import scratch.coding.models.v25.CWE_v25;
//
//@Table(name="OBR_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class OBR_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="OBR_ID")
//	private Long id;
//	@Column(name="OBR_1_v25")
//	@JsonProperty("obr_1_setID")
//	private String obr_1_setID;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_OBR_2_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("obr_2_placerOrderNumber")
//	private EI_ST_v25 obr_2_placerOrderNumber;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_OBR_3_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("obr_3_fillerOrderNumber")
//	private EI_ST_v25 obr_3_fillerOrderNumber;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBR_4_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obr_4_universalServiceIdentifier")
//	private CE_ST obr_4_universalServiceIdentifier;
//	@Column(name="OBR_5_v25")
//	@JsonProperty("obr_5_priority")
//	private String obr_5_priority;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBR_6_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obr_6_requestedDateTime")
//	private TS_ST obr_6_requestedDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBR_7_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obr_7_observationDateTime")
//	private TS_ST obr_7_observationDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBR_8_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obr_8_observationEndDateTime")
//	private TS_ST obr_8_observationEndDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CQ_OBR_9_v25", referencedColumnName = "CQ_ID")
//	@JsonProperty("obr_9_collectionVolume")
//	private CQ_ST_v25 obr_9_collectionVolume;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_XCN_10_v25")
//	@JsonProperty("obr_10_collectorIdentifier")
//	private List<XCN_ST_v25> obr_10_collectorIdentifier;
//	@Column(name="OBR_11_v25")
//	@JsonProperty("obr_11_specimenActionCode")
//	private String obr_11_specimenActionCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBR_12_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obr_12_dangerCode")
//	private CE_ST obr_12_dangerCode;
//	@Column(name="OBR_13_v25")
//	@JsonProperty("obr_13_relevantClinicalInformation")
//	private String obr_13_relevantClinicalInformation;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBR_14_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obr_14_specimenReceivedDateTime")
//	private TS_ST obr_14_specimenReceivedDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "SPS_OBR_15_v25", referencedColumnName = "SPS_ID")
//	@JsonProperty("obr_15_specimenSource")
//	private SPS_ST_v25 obr_15_specimenSource;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_XCN_16_v25")
//	@JsonProperty("obr_16_orderingProvider")
//	private List<XCN_ST_v25> obr_16_orderingProvider;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_XTN_17_v25")
//	@JsonProperty("obr_17_orderCallbackPhoneNumber")
//	private List<XTN_ST_v25> obr_17_orderCallbackPhoneNumber;
//	@Column(name="OBR_18_v25")
//	@JsonProperty("obr_18_placerField")
//	private String obr_18_placerField;
//	@Column(name="OBR_19_v25")
//	@JsonProperty("obr_19_placerField")
//	private String obr_19_placerField;
//	@Column(name="OBR_20_v25")
//	@JsonProperty("obr_20_fillerField")
//	private String obr_20_fillerField;
//	@Column(name="OBR_21_v25")
//	@JsonProperty("obr_21_fillerField")
//	private String obr_21_fillerField;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBR_22_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obr_22_resultsRptStatusChng")
//	private TS_ST obr_22_resultsRptStatusChng;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MOC_OBR_23_v25", referencedColumnName = "MOC_ID")
//	@JsonProperty("obr_23_chargetoPractice")
//	private MOC_ST obr_23_chargetoPractice;
//	@Column(name="OBR_24_v25")
//	@JsonProperty("obr_24_diagnosticServSectID")
//	private String obr_24_diagnosticServSectID;
//	@Column(name="OBR_25_v25")
//	@JsonProperty("obr_25_resultStatus")
//	private String obr_25_resultStatus;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PRL_OBR_26_v25", referencedColumnName = "PRL_ID")
//	@JsonProperty("obr_26_parentResult")
//	private PRL_ST obr_26_parentResult;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_TQ_27_v25")
//	@JsonProperty("obr_27_quantityTiming")
//	private List<TQ_ST_v25> obr_27_quantityTiming;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_XCN_28_v25")
//	@JsonProperty("obr_28_resultCopiesTo")
//	private List<XCN_ST_v25> obr_28_resultCopiesTo;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EIP_OBR_29_v25", referencedColumnName = "EIP_ID")
//	@JsonProperty("obr_29_parent")
//	private EIP_ST_v25 obr_29_parent;
//	@Column(name="OBR_30_v25")
//	@JsonProperty("obr_30_transportationMode")
//	private String obr_30_transportationMode;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_31_v25")
//	@JsonProperty("obr_31_reasonforStudy")
//	private List<CE_ST> obr_31_reasonforStudy;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "NDL_OBR_32_v25", referencedColumnName = "NDL_ID")
//	@JsonProperty("obr_32_principalResultInterpreter")
//	private NDL_ST_v25 obr_32_principalResultInterpreter;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_NDL_33_v25")
//	@JsonProperty("obr_33_assistantResultInterpreter")
//	private List<NDL_ST_v25> obr_33_assistantResultInterpreter;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_NDL_34_v25")
//	@JsonProperty("obr_34_technician")
//	private List<NDL_ST_v25> obr_34_technician;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_NDL_35_v25")
//	@JsonProperty("obr_35_transcriptionist")
//	private List<NDL_ST_v25> obr_35_transcriptionist;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBR_36_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obr_36_scheduledDateTime")
//	private TS_ST obr_36_scheduledDateTime;
//	@Column(name="OBR_37_v25")
//	@JsonProperty("obr_37_numberofSampleContainers")
//	private String obr_37_numberofSampleContainers;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_38_v25")
//	@JsonProperty("obr_38_transportLogisticsofCollectedSample")
//	private List<CE_ST> obr_38_transportLogisticsofCollectedSample;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_33_v25")
//	@JsonProperty("obr_39_collectorsComment")
//	private List<CE_ST> obr_39_collectorsComment;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBR_40_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obr_40_transportArrangementResponsibility")
//	private CE_ST obr_40_transportArrangementResponsibility;
//	@Column(name="OBR_41_v25")
//	@JsonProperty("obr_41_transportArranged")
//	private String obr_41_transportArranged;
//	@Column(name="OBR_42_v25")
//	@JsonProperty("obr_42_escortRequired")
//	private String obr_42_escortRequired;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_43_v25")
//	@JsonProperty("obr_43_plannedPatientTransportComment")
//	private List<CE_ST> obr_43_plannedPatientTransportComment;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBR_44_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obr_44_procedureCode")
//	private CE_ST obr_44_procedureCode;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_45_v25")
//	@JsonProperty("obr_45_procedureCodeModifier")
//	private List<CE_ST> obr_45_procedureCodeModifier;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_46_v25")
//	@JsonProperty("obr_46_placerSupplementalServiceInformation")
//	private List<CE_ST> obr_46_placerSupplementalServiceInformation;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_CE_47_v25")
//	@JsonProperty("obr_47_fillerSupplementalServiceInformation")
//	private List<CE_ST> obr_47_fillerSupplementalServiceInformation;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_OBR_48_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("obr_48_medicallyNecessaryDuplicateProcedureReason")
//	private CWE_ST_v25 obr_48_medicallyNecessaryDuplicateProcedureReason;
//	@Column(name="OBR_49_v25")
//	@JsonProperty("obr_49_resultHandling")
//	private String obr_49_resultHandling;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_NTE_v25")
//	@JsonProperty("nte")
//	private List<NTE_ST_v25> nte;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBR_OBX_v25")
//	@JsonProperty("obx")
//	private List<OBX_ST_v25> obx;
//	public OBR_ST_v25() {
//		super();
//		this.obr_1_setID = "";
//		this.obr_2_placerOrderNumber = new EI_ST_v25();
//		this.obr_3_fillerOrderNumber = new EI_ST_v25();
//		this.obr_4_universalServiceIdentifier = new CE_ST();
//		this.obr_5_priority = "";
//		this.obr_6_requestedDateTime = new TS_ST();
//		this.obr_7_observationDateTime = new TS_ST();
//		this.obr_8_observationEndDateTime = new TS_ST();
//		this.obr_9_collectionVolume = new CQ_ST_v25();
//		this.obr_10_collectorIdentifier = new ArrayList<>();
//		this.obr_11_specimenActionCode = "";
//		this.obr_12_dangerCode = new CE_ST();
//		this.obr_13_relevantClinicalInformation = "";
//		this.obr_14_specimenReceivedDateTime = new TS_ST();
//		this.obr_15_specimenSource = new SPS_ST_v25();
//		this.obr_16_orderingProvider = new ArrayList<>();
//		this.obr_17_orderCallbackPhoneNumber = new ArrayList<>();
//		this.obr_18_placerField = "";
//		this.obr_19_placerField = "";
//		this.obr_20_fillerField = "";
//		this.obr_21_fillerField = "";
//		this.obr_22_resultsRptStatusChng = new TS_ST();
//		this.obr_23_chargetoPractice = new MOC_ST();
//		this.obr_24_diagnosticServSectID = "";
//		this.obr_25_resultStatus = "";
//		this.obr_26_parentResult = new PRL_ST();
//		this.obr_27_quantityTiming = new ArrayList<>();
//		this.obr_28_resultCopiesTo = new ArrayList<>();
//		this.obr_29_parent = new EIP_ST_v25();
//		this.obr_30_transportationMode = "";
//		this.obr_31_reasonforStudy = new ArrayList<>();
//		this.obr_32_principalResultInterpreter = new NDL_ST_v25();
//		this.obr_33_assistantResultInterpreter = new ArrayList<>();
//		this.obr_34_technician = new ArrayList<>();
//		this.obr_35_transcriptionist = new ArrayList<>();
//		this.obr_36_scheduledDateTime = new TS_ST();
//		this.obr_37_numberofSampleContainers = "";
//		this.obr_38_transportLogisticsofCollectedSample = new ArrayList<>();
//		this.obr_39_collectorsComment = new ArrayList<>();
//		this.obr_40_transportArrangementResponsibility = new CE_ST();
//		this.obr_41_transportArranged = "";
//		this.obr_42_escortRequired = "";
//		this.obr_43_plannedPatientTransportComment = new ArrayList<>();
//		this.obr_44_procedureCode = new CE_ST();
//		this.obr_45_procedureCodeModifier = new ArrayList<>();
//		this.obr_46_placerSupplementalServiceInformation = new ArrayList<>();
//		this.obr_47_fillerSupplementalServiceInformation = new ArrayList<>();
//		this.obr_48_medicallyNecessaryDuplicateProcedureReason = new CWE_ST_v25();
//		this.obr_49_resultHandling = "";
//	}
//	public OBR_ST_v25(OBRBuilder builder) {
//		super();
//		this.obr_1_setID = builder.obr_1_setID;
//		this.obr_2_placerOrderNumber = builder.obr_2_placerOrderNumber;
//		this.obr_3_fillerOrderNumber = builder.obr_3_fillerOrderNumber;
//		this.obr_4_universalServiceIdentifier = builder.obr_4_universalServiceIdentifier;
//		this.obr_5_priority = builder.obr_5_priority;
//		this.obr_6_requestedDateTime = builder.obr_6_requestedDateTime;
//		this.obr_7_observationDateTime = builder.obr_7_observationDateTime;
//		this.obr_8_observationEndDateTime = builder.obr_8_observationEndDateTime;
//		this.obr_9_collectionVolume = builder.obr_9_collectionVolume;
//		this.obr_10_collectorIdentifier = builder.obr_10_collectorIdentifier;
//		this.obr_11_specimenActionCode = builder.obr_11_specimenActionCode;
//		this.obr_12_dangerCode = builder.obr_12_dangerCode;
//		this.obr_13_relevantClinicalInformation = builder.obr_13_relevantClinicalInformation;
//		this.obr_14_specimenReceivedDateTime = builder.obr_14_specimenReceivedDateTime;
//		this.obr_15_specimenSource = builder.obr_15_specimenSource;
//		this.obr_16_orderingProvider = builder.obr_16_orderingProvider;
//		this.obr_17_orderCallbackPhoneNumber = builder.obr_17_orderCallbackPhoneNumber;
//		this.obr_18_placerField = builder.obr_18_placerField;
//		this.obr_19_placerField = builder.obr_19_placerField;
//		this.obr_20_fillerField = builder.obr_20_fillerField;
//		this.obr_21_fillerField = builder.obr_21_fillerField;
//		this.obr_22_resultsRptStatusChng = builder.obr_22_resultsRptStatusChng;
//		this.obr_23_chargetoPractice = builder.obr_23_chargetoPractice;
//		this.obr_24_diagnosticServSectID = builder.obr_24_diagnosticServSectID;
//		this.obr_25_resultStatus = builder.obr_25_resultStatus;
//		this.obr_26_parentResult = builder.obr_26_parentResult;
//		this.obr_27_quantityTiming = builder.obr_27_quantityTiming;
//		this.obr_28_resultCopiesTo = builder.obr_28_resultCopiesTo;
//		this.obr_29_parent = builder.obr_29_parent;
//		this.obr_30_transportationMode = builder.obr_30_transportationMode;
//		this.obr_31_reasonforStudy = builder.obr_31_reasonforStudy;
//		this.obr_32_principalResultInterpreter = builder.obr_32_principalResultInterpreter;
//		this.obr_33_assistantResultInterpreter = builder.obr_33_assistantResultInterpreter;
//		this.obr_34_technician = builder.obr_34_technician;
//		this.obr_35_transcriptionist = builder.obr_35_transcriptionist;
//		this.obr_36_scheduledDateTime = builder.obr_36_scheduledDateTime;
//		this.obr_37_numberofSampleContainers = builder.obr_37_numberofSampleContainers;
//		this.obr_38_transportLogisticsofCollectedSample = builder.obr_38_transportLogisticsofCollectedSample;
//		this.obr_39_collectorsComment = builder.obr_39_collectorsComment;
//		this.obr_40_transportArrangementResponsibility = builder.obr_40_transportArrangementResponsibility;
//		this.obr_41_transportArranged = builder.obr_41_transportArranged;
//		this.obr_42_escortRequired = builder.obr_42_escortRequired;
//		this.obr_43_plannedPatientTransportComment = builder.obr_43_plannedPatientTransportComment;
//		this.obr_44_procedureCode = builder.obr_44_procedureCode;
//		this.obr_45_procedureCodeModifier = builder.obr_45_procedureCodeModifier;
//		this.obr_46_placerSupplementalServiceInformation = builder.obr_46_placerSupplementalServiceInformation;
//		this.obr_47_fillerSupplementalServiceInformation = builder.obr_47_fillerSupplementalServiceInformation;
//		this.obr_48_medicallyNecessaryDuplicateProcedureReason = builder.obr_48_medicallyNecessaryDuplicateProcedureReason;
//		this.obr_49_resultHandling = builder.obr_49_resultHandling;
//		this.obx = builder.obx;
//		this.nte = builder.nte;
//	}
//	public static class OBRBuilder {
//		private String obr_1_setID;
//		private EI_ST_v25 obr_2_placerOrderNumber;
//		private EI_ST_v25 obr_3_fillerOrderNumber;
//		private CE_ST obr_4_universalServiceIdentifier;
//		private String obr_5_priority;
//		private TS_ST obr_6_requestedDateTime;
//		private TS_ST obr_7_observationDateTime;
//		private TS_ST obr_8_observationEndDateTime;
//		private CQ_ST_v25 obr_9_collectionVolume;
//		private List<XCN_ST_v25> obr_10_collectorIdentifier;
//		private String obr_11_specimenActionCode;
//		private CE_ST obr_12_dangerCode;
//		private String obr_13_relevantClinicalInformation;
//		private TS_ST obr_14_specimenReceivedDateTime;
//		private SPS_ST_v25 obr_15_specimenSource;
//		private List<XCN_ST_v25> obr_16_orderingProvider;
//		private List<XTN_ST_v25>  obr_17_orderCallbackPhoneNumber;
//		private String obr_18_placerField;
//		private String obr_19_placerField;
//		private String obr_20_fillerField;
//		private String obr_21_fillerField;
//		private TS_ST obr_22_resultsRptStatusChng;
//		private MOC_ST obr_23_chargetoPractice;
//		private String obr_24_diagnosticServSectID;
//		private String obr_25_resultStatus;
//		private PRL_ST obr_26_parentResult;
//		private List<TQ_ST_v25> obr_27_quantityTiming;
//		private List<XCN_ST_v25> obr_28_resultCopiesTo;
//		private EIP_ST_v25 obr_29_parent;
//		private String obr_30_transportationMode;
//		private List<CE_ST> obr_31_reasonforStudy;
//		private NDL_ST_v25 obr_32_principalResultInterpreter;
//		private List<NDL_ST_v25> obr_33_assistantResultInterpreter;
//		private List<NDL_ST_v25> obr_34_technician;
//		private List<NDL_ST_v25> obr_35_transcriptionist;
//		private TS_ST obr_36_scheduledDateTime;
//		private String obr_37_numberofSampleContainers;
//		private List<CE_ST> obr_38_transportLogisticsofCollectedSample;
//		private List<CE_ST> obr_39_collectorsComment;
//		private CE_ST obr_40_transportArrangementResponsibility;
//		private String obr_41_transportArranged;
//		private String obr_42_escortRequired;
//		private List<CE_ST> obr_43_plannedPatientTransportComment;
//		private CE_ST obr_44_procedureCode;
//		private List<CE_ST> obr_45_procedureCodeModifier;
//		private List<CE_ST> obr_46_placerSupplementalServiceInformation;
//		private List<CE_ST> obr_47_fillerSupplementalServiceInformation;
//		private CWE_ST_v25 obr_48_medicallyNecessaryDuplicateProcedureReason;
//		private String obr_49_resultHandling;
//		private List<NTE_ST_v25> nte;
//		private List<OBX_ST_v25> obx;
//		public OBRBuilder(String obr_1_setID, EI_ST_v25 obr_3_fillerOrderNumber,
//				CE_ST obr_4_universalServiceIdentifier,
//				TS_ST obr_7_observationDateTime, TS_ST obr_22_resultsRptStatusChng, String obr_25_resultStatus, 
//				List<NDL_ST_v25>obr_34_technician) {
//			super();
//			this.obr_1_setID = obr_1_setID;
//			this.obr_2_placerOrderNumber = new EI_ST_v25();
//			this.obr_3_fillerOrderNumber = obr_3_fillerOrderNumber;
//			this.obr_4_universalServiceIdentifier = obr_4_universalServiceIdentifier;
//			this.obr_5_priority = "";
//			this.obr_6_requestedDateTime = new TS_ST();
//			this.obr_7_observationDateTime = obr_7_observationDateTime;
//			this.obr_8_observationEndDateTime = new TS_ST();
//			this.obr_9_collectionVolume = new CQ_ST_v25();
//			this.obr_10_collectorIdentifier = new ArrayList<>();
//			this.obr_11_specimenActionCode = "";
//			this.obr_12_dangerCode = new CE_ST();
//			this.obr_13_relevantClinicalInformation = "";
//			this.obr_14_specimenReceivedDateTime = new TS_ST();
//			this.obr_15_specimenSource = new SPS_ST_v25();
//			this.obr_16_orderingProvider = new ArrayList<>();
//			this.obr_17_orderCallbackPhoneNumber = new ArrayList<>();
//			this.obr_18_placerField = "";
//			this.obr_19_placerField = "";
//			this.obr_20_fillerField = "";
//			this.obr_21_fillerField = "";
//			this.obr_22_resultsRptStatusChng = obr_22_resultsRptStatusChng;
//			this.obr_23_chargetoPractice = new MOC_ST();
//			this.obr_24_diagnosticServSectID = "";
//			this.obr_25_resultStatus = obr_25_resultStatus;
//			this.obr_26_parentResult = new PRL_ST();
//			this.obr_27_quantityTiming = new ArrayList<>();
//			this.obr_28_resultCopiesTo = new ArrayList<>();
//			this.obr_29_parent = new EIP_ST_v25();
//			this.obr_30_transportationMode = "";
//			this.obr_31_reasonforStudy =new ArrayList<>();
//			this.obr_32_principalResultInterpreter = new NDL_ST_v25();
//			this.obr_33_assistantResultInterpreter = new ArrayList<>();
//			this.obr_34_technician = obr_34_technician;
//			this.obr_35_transcriptionist = new ArrayList<>();
//			this.obr_36_scheduledDateTime = new TS_ST();
//			this.obr_37_numberofSampleContainers = "";
//			this.obr_38_transportLogisticsofCollectedSample = new ArrayList<>();
//			this.obr_39_collectorsComment = new ArrayList<>();
//			this.obr_40_transportArrangementResponsibility = new CE_ST();
//			this.obr_41_transportArranged = "";
//			this.obr_42_escortRequired = "";
//			this.obr_43_plannedPatientTransportComment =new ArrayList<>();
//			this.obr_44_procedureCode = new CE_ST();
//			this.obr_45_procedureCodeModifier = new ArrayList<>();
//			this.obr_46_placerSupplementalServiceInformation = new ArrayList<>();
//			this.obr_47_fillerSupplementalServiceInformation =new ArrayList<>();
//			this.obr_48_medicallyNecessaryDuplicateProcedureReason = new CWE_ST_v25();
//			this.obr_49_resultHandling = "";
//			this.nte =new ArrayList<>();
//		}
//		
//		public OBRBuilder obr_2_placerOrderNumber(EI_ST_v25 obr_2_placerOrderNumber) {
//			this.obr_2_placerOrderNumber = obr_2_placerOrderNumber;
//			return this;
//		}
//		
//		public OBRBuilder obr_5_priority(String obr_5_priority) {
//			this.obr_5_priority = obr_5_priority;
//			return this;
//		}
//		public OBRBuilder obr_6_requestedDateTime(TS_ST obr_6_requestedDateTime) {
//			this.obr_6_requestedDateTime = obr_6_requestedDateTime;
//			return this;
//		}
//		public OBRBuilder obr_8_observationEndDateTime(TS_ST obr_8_observationEndDateTime) {
//			this.obr_8_observationEndDateTime = obr_8_observationEndDateTime;
//			return this;
//		}
//		public OBRBuilder obr_9_collectionVolume(CQ_ST_v25 obr_9_collectionVolume) {
//			this.obr_9_collectionVolume = obr_9_collectionVolume;
//			return this;
//		}
//		public OBRBuilder obr_10_collectorIdentifier(List<XCN_ST_v25> obr_10_collectorIdentifier) {
//			this.obr_10_collectorIdentifier = obr_10_collectorIdentifier;
//			return this;
//		}
//		public OBRBuilder obr_11_specimenActionCode(String obr_11_specimenActionCode) {
//			this.obr_11_specimenActionCode = obr_11_specimenActionCode;
//			return this;
//		}
//		public OBRBuilder obr_12_dangerCode(CE_ST obr_12_dangerCode) {
//			this.obr_12_dangerCode = obr_12_dangerCode;
//			return this;
//		}
//		public OBRBuilder obr_13_relevantClinicalInformation(String obr_13_relevantClinicalInformation) {
//			this.obr_13_relevantClinicalInformation = obr_13_relevantClinicalInformation;
//			return this;
//		}
//		public OBRBuilder obr_14_specimenReceivedDateTime(TS_ST obr_14_specimenReceivedDateTime) {
//			this.obr_14_specimenReceivedDateTime = obr_14_specimenReceivedDateTime;
//			return this;
//		}
//		public OBRBuilder obr_15_specimenSource(SPS_ST_v25 obr_15_specimenSource) {
//			this.obr_15_specimenSource = obr_15_specimenSource;
//			return this;
//		}
//		public OBRBuilder obr_16_orderingProvider(List<XCN_ST_v25> obr_16_orderingProvider) {
//			this.obr_16_orderingProvider = obr_16_orderingProvider;
//			return this;
//		}
//		public OBRBuilder obr_17_orderCallbackPhoneNumber(List<XTN_ST_v25> obr_17_orderCallbackPhoneNumber) {
//			this.obr_17_orderCallbackPhoneNumber = obr_17_orderCallbackPhoneNumber;
//			return this;
//		}
//		public OBRBuilder obr_18_placerField(String obr_18_placerField) {
//			this.obr_18_placerField = obr_18_placerField;
//			return this;
//		}
//		public OBRBuilder obr_19_placerField(String obr_19_placerField) {
//			this.obr_19_placerField = obr_19_placerField;
//			return this;
//		}
//		public OBRBuilder obr_20_fillerField(String obr_20_fillerField) {
//			this.obr_20_fillerField = obr_20_fillerField;
//			return this;
//		}
//		public OBRBuilder obr_21_fillerField(String obr_21_fillerField) {
//			this.obr_21_fillerField = obr_21_fillerField;
//			return this;
//		}
//		public OBRBuilder obr_23_chargetoPractice(MOC_ST obr_23_chargetoPractice) {
//			this.obr_23_chargetoPractice = obr_23_chargetoPractice;
//			return this;
//		}
//		public OBRBuilder obr_24_diagnosticServSectID(String obr_24_diagnosticServSectID) {
//			this.obr_24_diagnosticServSectID = obr_24_diagnosticServSectID;
//			return this;
//		}
//		public OBRBuilder obr_26_parentResult(PRL_ST obr_26_parentResult) {
//			this.obr_26_parentResult = obr_26_parentResult;
//			return this;
//		}
//		public OBRBuilder obr_27_quantityTiming(List<TQ_ST_v25> obr_27_quantityTiming) {
//			this.obr_27_quantityTiming = obr_27_quantityTiming;
//			return this;
//		}
//		public OBRBuilder obr_28_resultCopiesTo(List<XCN_ST_v25> obr_28_resultCopiesTo) {
//			this.obr_28_resultCopiesTo = obr_28_resultCopiesTo;
//			return this;
//		}
//		public OBRBuilder obr_29_parent(EIP_ST_v25 obr_29_parent) {
//			this.obr_29_parent = obr_29_parent;
//			return this;
//		}
//		public OBRBuilder obr_30_transportationMode(String obr_30_transportationMode) {
//			this.obr_30_transportationMode = obr_30_transportationMode;
//			return this;
//		}
//		public OBRBuilder obr_31_reasonforStudy(List<CE_ST> obr_31_reasonforStudy) {
//			this.obr_31_reasonforStudy = obr_31_reasonforStudy;
//			return this;
//		}
//		public OBRBuilder obr_32_principalResultInterpreter(NDL_ST_v25 obr_32_principalResultInterpreter) {
//			this.obr_32_principalResultInterpreter = obr_32_principalResultInterpreter;
//			return this;
//		}
//		public OBRBuilder obr_33_assistantResultInterpreter(List<NDL_ST_v25> obr_33_assistantResultInterpreter) {
//			this.obr_33_assistantResultInterpreter = obr_33_assistantResultInterpreter;
//			return this;
//		}
//		public OBRBuilder obr_35_transcriptionist(List<NDL_ST_v25> obr_35_transcriptionist) {
//			this.obr_35_transcriptionist = obr_35_transcriptionist;
//			return this;
//		}
//		public OBRBuilder obr_36_scheduledDateTime(TS_ST obr_36_scheduledDateTime) {
//			this.obr_36_scheduledDateTime = obr_36_scheduledDateTime;
//			return this;
//		}
//		public OBRBuilder obr_37_numberofSampleContainers(String obr_37_numberofSampleContainers) {
//			this.obr_37_numberofSampleContainers = obr_37_numberofSampleContainers;
//			return this;
//		}
//		public OBRBuilder obr_38_transportLogisticsofCollectedSample(List<CE_ST> obr_38_transportLogisticsofCollectedSample) {
//			this.obr_38_transportLogisticsofCollectedSample = obr_38_transportLogisticsofCollectedSample;
//			return this;
//		}
//		public OBRBuilder obr_39_collectorsComment(List<CE_ST> obr_39_collectorsComment) {
//			this.obr_39_collectorsComment = obr_39_collectorsComment;
//			return this;
//		}
//		public OBRBuilder obr_40_transportArrangementResponsibility(CE_ST obr_40_transportArrangementResponsibility) {
//			this.obr_40_transportArrangementResponsibility = obr_40_transportArrangementResponsibility;
//			return this;
//		}
//		public OBRBuilder obr_41_transportArranged(String obr_41_transportArranged) {
//			this.obr_41_transportArranged = obr_41_transportArranged;
//			return this;
//		}
//		public OBRBuilder obr_42_escortRequired(String obr_42_escortRequired) {
//			this.obr_42_escortRequired = obr_42_escortRequired;
//			return this;
//		}
//		public OBRBuilder obr_43_plannedPatientTransportComment(List<CE_ST> obr_43_plannedPatientTransportComment) {
//			this.obr_43_plannedPatientTransportComment = obr_43_plannedPatientTransportComment;
//			return this;
//		}
//		public OBRBuilder obr_44_procedureCode(CE_ST obr_44_procedureCode) {
//			this.obr_44_procedureCode = obr_44_procedureCode;
//			return this;
//		}
//		public OBRBuilder obr_45_procedureCodeModifier(List<CE_ST> obr_45_procedureCodeModifier) {
//			this.obr_45_procedureCodeModifier = obr_45_procedureCodeModifier;
//			return this;
//		}
//		public OBRBuilder obr_46_placerSupplementalServiceInformation(List<CE_ST> obr_46_placerSupplementalServiceInformation) {
//			this.obr_46_placerSupplementalServiceInformation = obr_46_placerSupplementalServiceInformation;
//			return this;
//		}
//		public OBRBuilder obr_47_fillerSupplementalServiceInformation(List<CE_ST> obr_47_fillerSupplementalServiceInformation) {
//			this.obr_47_fillerSupplementalServiceInformation = obr_47_fillerSupplementalServiceInformation;
//			return this;
//		}
//		public OBRBuilder obr_48_medicallyNecessaryDuplicateProcedureReason(
//				CWE_ST_v25 obr_48_medicallyNecessaryDuplicateProcedureReason) {
//			this.obr_48_medicallyNecessaryDuplicateProcedureReason = obr_48_medicallyNecessaryDuplicateProcedureReason;
//			return this;
//		}
//		public OBRBuilder nte(List<NTE_ST_v25> nte) {
//			this.nte = nte;
//			return this;
//		}
//		public OBRBuilder obr_49_resultHandling(String obr_49_resultHandling) {
//			this.obr_49_resultHandling = obr_49_resultHandling;
//			return this;
//		}
//		public OBRBuilder obx(List<OBX_ST_v25> obx) {
//			this.obx = obx;
//			return this;
//		}
//		public OBR_ST_v25 build() {
//			return new OBR_ST_v25(this);
//		}
//	}
//	public String getObr_1_setID() {
//		return obr_1_setID;
//	}
//	public EI_ST_v25 getObr_2_placerOrderNumber() {
//		return obr_2_placerOrderNumber;
//	}
//	public EI_ST_v25 getObr_3_fillerOrderNumber() {
//		return obr_3_fillerOrderNumber;
//	}
//	public CE_ST getObr_4_universalServiceIdentifier() {
//		return obr_4_universalServiceIdentifier;
//	}
//	public String getObr_5_priority() {
//		return obr_5_priority;
//	}
//	public TS_ST getObr_6_requestedDateTime() {
//		return obr_6_requestedDateTime;
//	}
//	public TS_ST getObr_7_observationDateTime() {
//		return obr_7_observationDateTime;
//	}
//	public TS_ST getObr_8_observationEndDateTime() {
//		return obr_8_observationEndDateTime;
//	}
//	public CQ_ST_v25 getObr_9_collectionVolume() {
//		return obr_9_collectionVolume;
//	}
//	public List<XCN_ST_v25> getObr_10_collectorIdentifier() {
//		return obr_10_collectorIdentifier;
//	}
//	public String getObr_11_specimenActionCode() {
//		return obr_11_specimenActionCode;
//	}
//	public CE_ST getObr_12_dangerCode() {
//		return obr_12_dangerCode;
//	}
//	public String getObr_13_relevantClinicalInformation() {
//		return obr_13_relevantClinicalInformation;
//	}
//	public TS_ST getObr_14_specimenReceivedDateTime() {
//		return obr_14_specimenReceivedDateTime;
//	}
//	public SPS_ST_v25 getObr_15_specimenSource() {
//		return obr_15_specimenSource;
//	}
//	public List<XCN_ST_v25> getObr_16_orderingProvider() {
//		return obr_16_orderingProvider;
//	}
//	public List<XTN_ST_v25> getObr_17_orderCallbackPhoneNumber() {
//		return obr_17_orderCallbackPhoneNumber;
//	}
//	public String getObr_18_placerField() {
//		return obr_18_placerField;
//	}
//	public String getObr_19_placerField() {
//		return obr_19_placerField;
//	}
//	public String getObr_20_fillerField() {
//		return obr_20_fillerField;
//	}
//	public String getObr_21_fillerField() {
//		return obr_21_fillerField;
//	}
//	public TS_ST getObr_22_resultsRptStatusChng() {
//		return obr_22_resultsRptStatusChng;
//	}
//	public MOC_ST getObr_23_chargetoPractice() {
//		return obr_23_chargetoPractice;
//	}
//	public String getObr_24_diagnosticServSectID() {
//		return obr_24_diagnosticServSectID;
//	}
//	public String getObr_25_resultStatus() {
//		return obr_25_resultStatus;
//	}
//	public PRL_ST getObr_26_parentResult() {
//		return obr_26_parentResult;
//	}
//	public List<TQ_ST_v25> getObr_27_quantityTiming() {
//		return obr_27_quantityTiming;
//	}
//	public List<XCN_ST_v25> getObr_28_resultCopiesTo() {
//		return obr_28_resultCopiesTo;
//	}
//	public EIP_ST_v25 getObr_29_parent() {
//		return obr_29_parent;
//	}
//	public String getObr_30_transportationMode() {
//		return obr_30_transportationMode;
//	}
//	public List<CE_ST> getObr_31_reasonforStudy() {
//		return obr_31_reasonforStudy;
//	}
//	public NDL_ST_v25 getObr_32_principalResultInterpreter() {
//		return obr_32_principalResultInterpreter;
//	}
//	public List<NDL_ST_v25> getObr_33_assistantResultInterpreter() {
//		return obr_33_assistantResultInterpreter;
//	}
//	public List<NDL_ST_v25> getObr_34_technician() {
//		return obr_34_technician;
//	}
//	public List<NDL_ST_v25> getObr_35_transcriptionist() {
//		return obr_35_transcriptionist;
//	}
//	public TS_ST getObr_36_scheduledDateTime() {
//		return obr_36_scheduledDateTime;
//	}
//	public String getObr_37_numberofSampleContainers() {
//		return obr_37_numberofSampleContainers;
//	}
//	public List<CE_ST> getObr_38_transportLogisticsofCollectedSample() {
//		return obr_38_transportLogisticsofCollectedSample;
//	}
//	public List<CE_ST> getObr_39_collectorsComment() {
//		return obr_39_collectorsComment;
//	}
//	public CE_ST getObr_40_transportArrangementResponsibility() {
//		return obr_40_transportArrangementResponsibility;
//	}
//	public String getObr_41_transportArranged() {
//		return obr_41_transportArranged;
//	}
//	public String getObr_42_escortRequired() {
//		return obr_42_escortRequired;
//	}
//	public List<CE_ST> getObr_43_plannedPatientTransportComment() {
//		return obr_43_plannedPatientTransportComment;
//	}
//	public CE_ST getObr_44_procedureCode() {
//		return obr_44_procedureCode;
//	}
//	public List<CE_ST> getObr_45_procedureCodeModifier() {
//		return obr_45_procedureCodeModifier;
//	}
//	public List<CE_ST> getObr_46_placerSupplementalServiceInformation() {
//		return obr_46_placerSupplementalServiceInformation;
//	}
//	public List<CE_ST> getObr_47_fillerSupplementalServiceInformation() {
//		return obr_47_fillerSupplementalServiceInformation;
//	}
//	public CWE_ST_v25 getObr_48_medicallyNecessaryDuplicateProcedureReason() {
//		return obr_48_medicallyNecessaryDuplicateProcedureReason;
//	}
//	public String getObr_49_resultHandling() {
//		return obr_49_resultHandling;
//	}
//	
//	
//	/**
//	 * @return the nte
//	 *	@JsonProperty("nte")
//	 */
//	
//	public List<NTE_ST_v25> getNte() {
//		return nte;
//	}
//	/**
//	 * @return the obx
//	 *	@JsonProperty("obx")
//	 */
//	
//	public List<OBX_ST_v25> getObx() {
//		return obx;
//	}
//	/**
//	 * @param obx the obx to set
//	 * @JsonProperty("obx")
//	 */
//	public void setObx(List<OBX_ST_v25> obx) {
//		this.obx = obx;
//	}
//	@Override
//	public String toString() {
//		return "OBR_ST_v25 [id=" + id + ", obr_1_setID=" + obr_1_setID + ", obr_2_placerOrderNumber="
//				+ obr_2_placerOrderNumber + ", obr_3_fillerOrderNumber=" + obr_3_fillerOrderNumber
//				+ ", obr_4_universalServiceIdentifier=" + obr_4_universalServiceIdentifier + ", obr_5_priority="
//				+ obr_5_priority + ", obr_6_requestedDateTime=" + obr_6_requestedDateTime
//				+ ", obr_7_observationDateTime=" + obr_7_observationDateTime + ", obr_8_observationEndDateTime="
//				+ obr_8_observationEndDateTime + ", obr_9_collectionVolume=" + obr_9_collectionVolume
//				+ ", obr_10_collectorIdentifier=" + obr_10_collectorIdentifier + ", obr_11_specimenActionCode="
//				+ obr_11_specimenActionCode + ", obr_12_dangerCode=" + obr_12_dangerCode
//				+ ", obr_13_relevantClinicalInformation=" + obr_13_relevantClinicalInformation
//				+ ", obr_14_specimenReceivedDateTime=" + obr_14_specimenReceivedDateTime + ", obr_15_specimenSource="
//				+ obr_15_specimenSource + ", obr_16_orderingProvider=" + obr_16_orderingProvider
//				+ ", obr_17_orderCallbackPhoneNumber=" + obr_17_orderCallbackPhoneNumber + ", obr_18_placerField="
//				+ obr_18_placerField + ", obr_19_placerField=" + obr_19_placerField + ", obr_20_fillerField="
//				+ obr_20_fillerField + ", obr_21_fillerField=" + obr_21_fillerField + ", obr_22_resultsRptStatusChng="
//				+ obr_22_resultsRptStatusChng + ", obr_23_chargetoPractice=" + obr_23_chargetoPractice
//				+ ", obr_24_diagnosticServSectID=" + obr_24_diagnosticServSectID + ", obr_25_resultStatus="
//				+ obr_25_resultStatus + ", obr_26_parentResult=" + obr_26_parentResult + ", obr_27_quantityTiming="
//				+ obr_27_quantityTiming + ", obr_28_resultCopiesTo=" + obr_28_resultCopiesTo + ", obr_29_parent="
//				+ obr_29_parent + ", obr_30_transportationMode=" + obr_30_transportationMode
//				+ ", obr_31_reasonforStudy=" + obr_31_reasonforStudy + ", obr_32_principalResultInterpreter="
//				+ obr_32_principalResultInterpreter + ", obr_33_assistantResultInterpreter="
//				+ obr_33_assistantResultInterpreter + ", obr_34_technician=" + obr_34_technician
//				+ ", obr_35_transcriptionist=" + obr_35_transcriptionist + ", obr_36_scheduledDateTime="
//				+ obr_36_scheduledDateTime + ", obr_37_numberofSampleContainers=" + obr_37_numberofSampleContainers
//				+ ", obr_38_transportLogisticsofCollectedSample=" + obr_38_transportLogisticsofCollectedSample
//				+ ", obr_39_collectorsComment=" + obr_39_collectorsComment
//				+ ", obr_40_transportArrangementResponsibility=" + obr_40_transportArrangementResponsibility
//				+ ", obr_41_transportArranged=" + obr_41_transportArranged + ", obr_42_escortRequired="
//				+ obr_42_escortRequired + ", obr_43_plannedPatientTransportComment="
//				+ obr_43_plannedPatientTransportComment + ", obr_44_procedureCode=" + obr_44_procedureCode
//				+ ", obr_45_procedureCodeModifier=" + obr_45_procedureCodeModifier
//				+ ", obr_46_placerSupplementalServiceInformation=" + obr_46_placerSupplementalServiceInformation
//				+ ", obr_47_fillerSupplementalServiceInformation=" + obr_47_fillerSupplementalServiceInformation
//				+ ", obr_48_medicallyNecessaryDuplicateProcedureReason="
//				+ obr_48_medicallyNecessaryDuplicateProcedureReason + ", obr_49_resultHandling=" + obr_49_resultHandling
//				+ ", nte=" + nte + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, nte, obr_10_collectorIdentifier, obr_11_specimenActionCode, obr_12_dangerCode,
//				obr_13_relevantClinicalInformation, obr_14_specimenReceivedDateTime, obr_15_specimenSource,
//				obr_16_orderingProvider, obr_17_orderCallbackPhoneNumber, obr_18_placerField, obr_19_placerField,
//				obr_1_setID, obr_20_fillerField, obr_21_fillerField, obr_22_resultsRptStatusChng,
//				obr_23_chargetoPractice, obr_24_diagnosticServSectID, obr_25_resultStatus, obr_26_parentResult,
//				obr_27_quantityTiming, obr_28_resultCopiesTo, obr_29_parent, obr_2_placerOrderNumber,
//				obr_30_transportationMode, obr_31_reasonforStudy, obr_32_principalResultInterpreter,
//				obr_33_assistantResultInterpreter, obr_34_technician, obr_35_transcriptionist, obr_36_scheduledDateTime,
//				obr_37_numberofSampleContainers, obr_38_transportLogisticsofCollectedSample, obr_39_collectorsComment,
//				obr_3_fillerOrderNumber, obr_40_transportArrangementResponsibility, obr_41_transportArranged,
//				obr_42_escortRequired, obr_43_plannedPatientTransportComment, obr_44_procedureCode,
//				obr_45_procedureCodeModifier, obr_46_placerSupplementalServiceInformation,
//				obr_47_fillerSupplementalServiceInformation, obr_48_medicallyNecessaryDuplicateProcedureReason,
//				obr_49_resultHandling, obr_4_universalServiceIdentifier, obr_5_priority, obr_6_requestedDateTime,
//				obr_7_observationDateTime, obr_8_observationEndDateTime, obr_9_collectionVolume, obx);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		OBR_ST_v25 other = (OBR_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(nte, other.nte)
//				&& Objects.equals(obr_10_collectorIdentifier, other.obr_10_collectorIdentifier)
//				&& Objects.equals(obr_11_specimenActionCode, other.obr_11_specimenActionCode)
//				&& Objects.equals(obr_12_dangerCode, other.obr_12_dangerCode)
//				&& Objects.equals(obr_13_relevantClinicalInformation, other.obr_13_relevantClinicalInformation)
//				&& Objects.equals(obr_14_specimenReceivedDateTime, other.obr_14_specimenReceivedDateTime)
//				&& Objects.equals(obr_15_specimenSource, other.obr_15_specimenSource)
//				&& Objects.equals(obr_16_orderingProvider, other.obr_16_orderingProvider)
//				&& Objects.equals(obr_17_orderCallbackPhoneNumber, other.obr_17_orderCallbackPhoneNumber)
//				&& Objects.equals(obr_18_placerField, other.obr_18_placerField)
//				&& Objects.equals(obr_19_placerField, other.obr_19_placerField)
//				&& Objects.equals(obr_1_setID, other.obr_1_setID)
//				&& Objects.equals(obr_20_fillerField, other.obr_20_fillerField)
//				&& Objects.equals(obr_21_fillerField, other.obr_21_fillerField)
//				&& Objects.equals(obr_22_resultsRptStatusChng, other.obr_22_resultsRptStatusChng)
//				&& Objects.equals(obr_23_chargetoPractice, other.obr_23_chargetoPractice)
//				&& Objects.equals(obr_24_diagnosticServSectID, other.obr_24_diagnosticServSectID)
//				&& Objects.equals(obr_25_resultStatus, other.obr_25_resultStatus)
//				&& Objects.equals(obr_26_parentResult, other.obr_26_parentResult)
//				&& Objects.equals(obr_27_quantityTiming, other.obr_27_quantityTiming)
//				&& Objects.equals(obr_28_resultCopiesTo, other.obr_28_resultCopiesTo)
//				&& Objects.equals(obr_29_parent, other.obr_29_parent)
//				&& Objects.equals(obr_2_placerOrderNumber, other.obr_2_placerOrderNumber)
//				&& Objects.equals(obr_30_transportationMode, other.obr_30_transportationMode)
//				&& Objects.equals(obr_31_reasonforStudy, other.obr_31_reasonforStudy)
//				&& Objects.equals(obr_32_principalResultInterpreter, other.obr_32_principalResultInterpreter)
//				&& Objects.equals(obr_33_assistantResultInterpreter, other.obr_33_assistantResultInterpreter)
//				&& Objects.equals(obr_34_technician, other.obr_34_technician)
//				&& Objects.equals(obr_35_transcriptionist, other.obr_35_transcriptionist)
//				&& Objects.equals(obr_36_scheduledDateTime, other.obr_36_scheduledDateTime)
//				&& Objects.equals(obr_37_numberofSampleContainers, other.obr_37_numberofSampleContainers)
//				&& Objects.equals(obr_38_transportLogisticsofCollectedSample,
//						other.obr_38_transportLogisticsofCollectedSample)
//				&& Objects.equals(obr_39_collectorsComment, other.obr_39_collectorsComment)
//				&& Objects.equals(obr_3_fillerOrderNumber, other.obr_3_fillerOrderNumber)
//				&& Objects.equals(obr_40_transportArrangementResponsibility,
//						other.obr_40_transportArrangementResponsibility)
//				&& Objects.equals(obr_41_transportArranged, other.obr_41_transportArranged)
//				&& Objects.equals(obr_42_escortRequired, other.obr_42_escortRequired)
//				&& Objects.equals(obr_43_plannedPatientTransportComment, other.obr_43_plannedPatientTransportComment)
//				&& Objects.equals(obr_44_procedureCode, other.obr_44_procedureCode)
//				&& Objects.equals(obr_45_procedureCodeModifier, other.obr_45_procedureCodeModifier)
//				&& Objects.equals(obr_46_placerSupplementalServiceInformation,
//						other.obr_46_placerSupplementalServiceInformation)
//				&& Objects.equals(obr_47_fillerSupplementalServiceInformation,
//						other.obr_47_fillerSupplementalServiceInformation)
//				&& Objects.equals(obr_48_medicallyNecessaryDuplicateProcedureReason,
//						other.obr_48_medicallyNecessaryDuplicateProcedureReason)
//				&& Objects.equals(obr_49_resultHandling, other.obr_49_resultHandling)
//				&& Objects.equals(obr_4_universalServiceIdentifier, other.obr_4_universalServiceIdentifier)
//				&& Objects.equals(obr_5_priority, other.obr_5_priority)
//				&& Objects.equals(obr_6_requestedDateTime, other.obr_6_requestedDateTime)
//				&& Objects.equals(obr_7_observationDateTime, other.obr_7_observationDateTime)
//				&& Objects.equals(obr_8_observationEndDateTime, other.obr_8_observationEndDateTime)
//				&& Objects.equals(obr_9_collectionVolume, other.obr_9_collectionVolume)
//				&& Objects.equals(obx, other.obx);
//	}
//	
//}
