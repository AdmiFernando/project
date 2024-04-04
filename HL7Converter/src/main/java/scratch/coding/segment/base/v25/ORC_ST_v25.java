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
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.hl7.base.v25.ORU_ST_v25;
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v25.CNE_ST_v25;
//import scratch.coding.models.base.v25.CWE_ST_v25;
//import scratch.coding.models.base.v25.EIP_ST_v25;
//import scratch.coding.models.base.v25.EI_ST_v25;
//import scratch.coding.models.base.v25.PL_ST_v25;
//import scratch.coding.models.base.v25.TQ_ST_v25;
//import scratch.coding.models.base.v25.XAD_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XON_ST_v25;
//import scratch.coding.models.base.v25.XTN_ST_v25;
//
//@Table(name="ORC_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class ORC_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="ORC_ID")
//	private Long id;
//	@Column(name="ORC_1_v25")
//	@JsonProperty("orc_1_orderControl")
//	private String orc_1_orderControl;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_ORC_2_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("orc_2_placerOrderNumber")
//	private EI_ST_v25 orc_2_placerOrderNumber;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_ORC_3_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("orc_3_fillerOrderNumber")
//	private EI_ST_v25 orc_3_fillerOrderNumber;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_ORC_4_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("orc_4_placerGroupNumber")
//	private EI_ST_v25 orc_4_placerGroupNumber;
//	@Column(name="ORC_5_v25")
//	@JsonProperty("orc_5_orderStatus")
//	private String orc_5_orderStatus;
//	@Column(name="ORC_6_v25")
//	@JsonProperty("orc_6_responseFlag")
//	private String orc_6_responseFlag;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_TQ_7_v25")
//	@JsonProperty("orc_7_quantityTiming")
//	private List<TQ_ST_v25> orc_7_quantityTiming;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EIP_ORC_8_v25", referencedColumnName = "EIP_ID")
//	@JsonProperty("orc_8_parentOrder")
//	private EIP_ST_v25 orc_8_parentOrder;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_ORC_9_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("orc_9_dateTimeofTransaction")
//	private TS_ST orc_9_dateTimeofTransaction;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XCN_10_v25")
//	@JsonProperty("orc_10_enteredBy")
//	private List<XCN_ST_v25> orc_10_enteredBy;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XCN_11_v25")
//	@JsonProperty("orc_11_verifiedBy")
//	private List<XCN_ST_v25> orc_11_verifiedBy;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XCN_12_v25")
//	@JsonProperty("orc_12_orderingProvider")
//	private List<XCN_ST_v25> orc_12_orderingProvider; 
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PL_ORC_13_v25", referencedColumnName = "PL_ID")
//	@JsonProperty("orc_13_enterersLocation")
//	private PL_ST_v25 orc_13_enterersLocation;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XTN_14_v25")
//	@JsonProperty("orc_14_callBackPhoneNumber")
//	private List<XTN_ST_v25> orc_14_callBackPhoneNumber;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_ORC_15_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("orc_15_orderEffectiveDateTime")
//	private TS_ST orc_15_orderEffectiveDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_ORC_16_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("orc_16_orderControlCodeReason")
//	private CE_ST orc_16_orderControlCodeReason;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_ORC_17_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("orc_17_enteringOrganization")
//	private CE_ST orc_17_enteringOrganization;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_ORC_18_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("orc_18_enteringDevice")
//	private CE_ST orc_18_enteringDevice; 
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XCN_19_v25")
//	@JsonProperty("orc_19_actionBy")
//	private List<XCN_ST_v25> orc_19_actionBy;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_ORC_20_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("orc_20_advancedBeneficiaryNoticeCode")
//	private CE_ST orc_20_advancedBeneficiaryNoticeCode; 
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XON_20_v25")
//	@JsonProperty("orc_21_orderingFacilityName")
//	private List<XON_ST_v25> orc_21_orderingFacilityName;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XAD_22_v25")
//	@JsonProperty("orc_22_orderingFacilityAddress")
//	private List<XAD_ST_v25> orc_22_orderingFacilityAddress;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XTN_23_v25")
//	@JsonProperty("orc_23_orderingFacilityPhoneNumber")
//	private List<XTN_ST_v25> orc_23_orderingFacilityPhoneNumber;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_XAD_24_v25")
//	@JsonProperty("orc_24_orderingProviderAddress")
//	private List<XAD_ST_v25> orc_24_orderingProviderAddress;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_ORC_25_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("orc_25_orderStatusModifier")
//	private CWE_ST_v25 orc_25_orderStatusModifier;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_ORC_26_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("orc_26_advancedBeneficiaryNoticeOverrideReason")
//	private CWE_ST_v25 orc_26_advancedBeneficiaryNoticeOverrideReason;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_ORC_27_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("orc_27_fillersExpectedAvailabilityDateTime")
//	private TS_ST orc_27_fillersExpectedAvailabilityDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_ORC_28_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("orc_28_confidentialityCode")
//	private CWE_ST_v25 orc_28_confidentialityCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_ORC_29_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("orc_29_orderType")
//	private CWE_ST_v25 orc_29_orderType; 
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CNE_ORC_30_v25", referencedColumnName = "CNE_ID")
//	@JsonProperty("orc_30_entererAuthorizationMode")
//	private CNE_ST_v25 orc_30_entererAuthorizationMode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORC_OBR_v25", referencedColumnName = "OBR_ID")
//	@JsonProperty("obr")
//	private OBR_ST_v25 obr;
//	
//	
//	private ORC_ST_v25(ORCBuilder builder) {
//		super();
//		this.orc_1_orderControl = builder.orc_1_orderControl;
//		this.orc_2_placerOrderNumber = builder.orc_2_placerOrderNumber;
//		this.orc_3_fillerOrderNumber = builder.orc_3_fillerOrderNumber;
//		this.orc_4_placerGroupNumber = builder.orc_4_placerGroupNumber;
//		this.orc_5_orderStatus = builder.orc_5_orderStatus;
//		this.orc_6_responseFlag = builder.orc_6_responseFlag;
//		this.orc_7_quantityTiming = builder.orc_7_quantityTiming;
//		this.orc_8_parentOrder = builder.orc_8_parentOrder;
//		this.orc_9_dateTimeofTransaction = builder.orc_9_dateTimeofTransaction;
//		this.orc_10_enteredBy = builder.orc_10_enteredBy;
//		this.orc_11_verifiedBy = builder.orc_11_verifiedBy;
//		this.orc_12_orderingProvider = builder.orc_12_orderingProvider;
//		this.orc_13_enterersLocation = builder.orc_13_enterersLocation;
//		this.orc_14_callBackPhoneNumber = builder.orc_14_callBackPhoneNumber;
//		this.orc_15_orderEffectiveDateTime = builder.orc_15_orderEffectiveDateTime;
//		this.orc_16_orderControlCodeReason = builder.orc_16_orderControlCodeReason;
//		this.orc_17_enteringOrganization = builder.orc_17_enteringOrganization;
//		this.orc_18_enteringDevice = builder.orc_18_enteringDevice;
//		this.orc_19_actionBy = builder.orc_19_actionBy;
//		this.orc_20_advancedBeneficiaryNoticeCode = builder.orc_20_advancedBeneficiaryNoticeCode;
//		this.orc_21_orderingFacilityName = builder.orc_21_orderingFacilityName;
//		this.orc_22_orderingFacilityAddress = builder.orc_22_orderingFacilityAddress;
//		this.orc_23_orderingFacilityPhoneNumber = builder.orc_23_orderingFacilityPhoneNumber;
//		this.orc_24_orderingProviderAddress = builder.orc_24_orderingProviderAddress;
//		this.orc_25_orderStatusModifier = builder.orc_25_orderStatusModifier;
//		this.orc_26_advancedBeneficiaryNoticeOverrideReason = builder.orc_26_advancedBeneficiaryNoticeOverrideReason;
//		this.orc_27_fillersExpectedAvailabilityDateTime = builder.orc_27_fillersExpectedAvailabilityDateTime;
//		this.orc_28_confidentialityCode = builder.orc_28_confidentialityCode;
//		this.orc_29_orderType = builder.orc_29_orderType;
//		this.orc_30_entererAuthorizationMode = builder.orc_30_entererAuthorizationMode;
//		this.obr = builder.obr;
//	} 
//	public static class ORCBuilder {
//		private String orc_1_orderControl;
//		private EI_ST_v25 orc_2_placerOrderNumber;
//		private EI_ST_v25 orc_3_fillerOrderNumber;
//		private EI_ST_v25 orc_4_placerGroupNumber;
//		private String orc_5_orderStatus;
//		private String orc_6_responseFlag;
//		private List<TQ_ST_v25> orc_7_quantityTiming;
//		private EIP_ST_v25 orc_8_parentOrder;
//		private TS_ST orc_9_dateTimeofTransaction;
//		private List<XCN_ST_v25> orc_10_enteredBy;
//		private List<XCN_ST_v25> orc_11_verifiedBy;
//		private List<XCN_ST_v25> orc_12_orderingProvider;
//		private PL_ST_v25 orc_13_enterersLocation;
//		private List<XTN_ST_v25> orc_14_callBackPhoneNumber;
//		private TS_ST orc_15_orderEffectiveDateTime;
//		private CE_ST orc_16_orderControlCodeReason;
//		private CE_ST orc_17_enteringOrganization;
//		private CE_ST orc_18_enteringDevice;
//		private List<XCN_ST_v25> orc_19_actionBy;
//		private CE_ST orc_20_advancedBeneficiaryNoticeCode;
//		private List<XON_ST_v25> orc_21_orderingFacilityName;
//		private List<XAD_ST_v25> orc_22_orderingFacilityAddress;
//		private List<XTN_ST_v25> orc_23_orderingFacilityPhoneNumber;
//		private List<XAD_ST_v25> orc_24_orderingProviderAddress;
//		private CWE_ST_v25 orc_25_orderStatusModifier;
//		private CWE_ST_v25 orc_26_advancedBeneficiaryNoticeOverrideReason;
//		private TS_ST orc_27_fillersExpectedAvailabilityDateTime;
//		private CWE_ST_v25 orc_28_confidentialityCode;
//		private CWE_ST_v25 orc_29_orderType;
//		private CNE_ST_v25 orc_30_entererAuthorizationMode;
//		private OBR_ST_v25 obr;
//		public ORCBuilder(EI_ST_v25 orc_3_fillerOrderNumber) {
//			super();
//			this.orc_1_orderControl = "";
//			this.orc_2_placerOrderNumber = new EI_ST_v25();
//			this.orc_3_fillerOrderNumber = orc_3_fillerOrderNumber;
//			this.orc_4_placerGroupNumber = new EI_ST_v25();
//			this.orc_5_orderStatus = "";
//			this.orc_6_responseFlag = "";
//			this.orc_7_quantityTiming = new ArrayList<>();
//			this.orc_8_parentOrder = new EIP_ST_v25();
//			this.orc_9_dateTimeofTransaction = new TS_ST();
//			this.orc_10_enteredBy = new ArrayList<>();
//			this.orc_11_verifiedBy = new ArrayList<>();
//			this.orc_12_orderingProvider = new ArrayList<>();
//			this.orc_13_enterersLocation = new PL_ST_v25();
//			this.orc_14_callBackPhoneNumber = new ArrayList<>();
//			this.orc_15_orderEffectiveDateTime = new TS_ST();
//			this.orc_16_orderControlCodeReason = new CE_ST();
//			this.orc_17_enteringOrganization = new CE_ST();
//			this.orc_18_enteringDevice = new CE_ST();
//			this.orc_19_actionBy = new ArrayList<>();
//			this.orc_20_advancedBeneficiaryNoticeCode = new CE_ST();
//			this.orc_21_orderingFacilityName = new ArrayList<>();
//			this.orc_22_orderingFacilityAddress = new ArrayList<>();
//			this.orc_23_orderingFacilityPhoneNumber = new ArrayList<>();
//			this.orc_24_orderingProviderAddress = new ArrayList<>();
//			this.orc_25_orderStatusModifier = new CWE_ST_v25();
//			this.orc_26_advancedBeneficiaryNoticeOverrideReason = new CWE_ST_v25();
//			this.orc_27_fillersExpectedAvailabilityDateTime = new TS_ST();
//			this.orc_28_confidentialityCode = new CWE_ST_v25();
//			this.orc_29_orderType = new CWE_ST_v25();
//			this.orc_30_entererAuthorizationMode = new CNE_ST_v25();
//			this.obr = new OBR_ST_v25();
//		}
//		public ORCBuilder orc_1_orderControl(String orc_1_orderControl) {
//			this.orc_1_orderControl = orc_1_orderControl;
//			return this;
//		}
//		public ORCBuilder orc_2_placerOrderNumber(EI_ST_v25 orc_2_placerOrderNumber) {
//			this.orc_2_placerOrderNumber = orc_2_placerOrderNumber;
//			return this;
//		}
//		public ORCBuilder orc_4_placerGroupNumber(EI_ST_v25 orc_4_placerGroupNumber) {
//			this.orc_4_placerGroupNumber = orc_4_placerGroupNumber;
//			return this;
//		}
//		public ORCBuilder orc_5_orderStatus(String orc_5_orderStatus) {
//			this.orc_5_orderStatus = orc_5_orderStatus;
//			return this;
//		}
//		public ORCBuilder orc_6_responseFlag(String orc_6_responseFlag) {
//			this.orc_6_responseFlag = orc_6_responseFlag;
//			return this;
//		}
//		public ORCBuilder orc_7_quantityTiming(List<TQ_ST_v25> orc_7_quantityTiming) {
//			this.orc_7_quantityTiming = orc_7_quantityTiming;
//			return this;
//		}
//		public ORCBuilder orc_8_parentOrder(EIP_ST_v25 orc_8_parentOrder) {
//			this.orc_8_parentOrder = orc_8_parentOrder;
//			return this;
//		}
//		public ORCBuilder orc_9_dateTimeofTransaction(TS_ST orc_9_dateTimeofTransaction) {
//			this.orc_9_dateTimeofTransaction = orc_9_dateTimeofTransaction;
//			return this;
//		}
//		public ORCBuilder orc_10_enteredBy(List<XCN_ST_v25> orc_10_enteredBy) {
//			this.orc_10_enteredBy = orc_10_enteredBy;
//			return this;
//		}
//		public ORCBuilder orc_11_verifiedBy(List<XCN_ST_v25> orc_11_verifiedBy) {
//			this.orc_11_verifiedBy = orc_11_verifiedBy;
//			return this;
//		}
//		public ORCBuilder orc_12_orderingProvider(List<XCN_ST_v25> orc_12_orderingProvider) {
//			this.orc_12_orderingProvider = orc_12_orderingProvider;
//			return this;
//		}
//		public ORCBuilder orc_13_enterersLocation(PL_ST_v25 orc_13_enterersLocation) {
//			this.orc_13_enterersLocation = orc_13_enterersLocation;
//			return this;
//		}
//		public ORCBuilder orc_14_callBackPhoneNumber(List<XTN_ST_v25> orc_14_callBackPhoneNumber) {
//			this.orc_14_callBackPhoneNumber = orc_14_callBackPhoneNumber;
//			return this;
//		}
//		public ORCBuilder orc_15_orderEffectiveDateTime(TS_ST orc_15_orderEffectiveDateTime) {
//			this.orc_15_orderEffectiveDateTime = orc_15_orderEffectiveDateTime;
//			return this;
//		}
//		public ORCBuilder orc_16_orderControlCodeReason(CE_ST orc_16_orderControlCodeReason) {
//			this.orc_16_orderControlCodeReason = orc_16_orderControlCodeReason;
//			return this;
//		}
//		public ORCBuilder orc_17_enteringOrganization(CE_ST orc_17_enteringOrganization) {
//			this.orc_17_enteringOrganization = orc_17_enteringOrganization;
//			return this;
//		}
//		public ORCBuilder orc_18_enteringDevice(CE_ST orc_18_enteringDevice) {
//			this.orc_18_enteringDevice = orc_18_enteringDevice;
//			return this;
//		}
//		public ORCBuilder orc_19_actionBy(List<XCN_ST_v25> orc_19_actionBy) {
//			this.orc_19_actionBy = orc_19_actionBy;
//			return this;
//		}
//		public ORCBuilder orc_20_advancedBeneficiaryNoticeCode(CE_ST orc_20_advancedBeneficiaryNoticeCode) {
//			this.orc_20_advancedBeneficiaryNoticeCode = orc_20_advancedBeneficiaryNoticeCode;
//			return this;
//		}
//		public ORCBuilder orc_21_orderingFacilityName(List<XON_ST_v25> orc_21_orderingFacilityName) {
//			this.orc_21_orderingFacilityName = orc_21_orderingFacilityName;
//			return this;
//		}
//		public ORCBuilder orc_22_orderingFacilityAddress(List<XAD_ST_v25> orc_22_orderingFacilityAddress) {
//			this.orc_22_orderingFacilityAddress = orc_22_orderingFacilityAddress;
//			return this;
//		}
//		public ORCBuilder orc_23_orderingFacilityPhoneNumber(List<XTN_ST_v25> orc_23_orderingFacilityPhoneNumber) {
//			this.orc_23_orderingFacilityPhoneNumber = orc_23_orderingFacilityPhoneNumber;
//			return this;
//		}
//		public ORCBuilder orc_24_orderingProviderAddress(List<XAD_ST_v25> orc_24_orderingProviderAddress) {
//			this.orc_24_orderingProviderAddress = orc_24_orderingProviderAddress;
//			return this;
//		}
//		public ORCBuilder orc_25_orderStatusModifier(CWE_ST_v25 orc_25_orderStatusModifier) {
//			this.orc_25_orderStatusModifier = orc_25_orderStatusModifier;
//			return this;
//		}
//		public ORCBuilder orc_26_advancedBeneficiaryNoticeOverrideReason(CWE_ST_v25 orc_26_advancedBeneficiaryNoticeOverrideReason) {
//			this.orc_26_advancedBeneficiaryNoticeOverrideReason = orc_26_advancedBeneficiaryNoticeOverrideReason;
//			return this;
//		}
//		public ORCBuilder orc_27_fillersExpectedAvailabilityDateTime(TS_ST orc_27_fillersExpectedAvailabilityDateTime) {
//			this.orc_27_fillersExpectedAvailabilityDateTime = orc_27_fillersExpectedAvailabilityDateTime;
//			return this;
//		}
//		public ORCBuilder orc_28_confidentialityCode(CWE_ST_v25 orc_28_confidentialityCode) {
//			this.orc_28_confidentialityCode = orc_28_confidentialityCode;
//			return this;
//		}
//		public ORCBuilder orc_29_orderType(CWE_ST_v25 orc_29_orderType) {
//			this.orc_29_orderType = orc_29_orderType;
//			return this;
//		}
//		public ORCBuilder orc_30_entererAuthorizationMode(CNE_ST_v25 orc_30_entererAuthorizationMode) {
//			this.orc_30_entererAuthorizationMode = orc_30_entererAuthorizationMode;
//			return this;
//		}
//		public ORCBuilder obr(OBR_ST_v25 obr) {
//			this.obr = obr;
//			return this;
//		}
//		public ORC_ST_v25 build() {
//			return new ORC_ST_v25(this);
//		}
//		
//	}
//	public ORC_ST_v25() {
//		super();
//		this.orc_1_orderControl = "";
//		this.orc_2_placerOrderNumber = new EI_ST_v25();
//		this.orc_3_fillerOrderNumber = new EI_ST_v25();
//		this.orc_4_placerGroupNumber = new EI_ST_v25();
//		this.orc_5_orderStatus = "";
//		this.orc_6_responseFlag = "";
//		this.orc_7_quantityTiming = new ArrayList<>();
//		this.orc_8_parentOrder = new EIP_ST_v25();
//		this.orc_9_dateTimeofTransaction = new TS_ST();
//		this.orc_10_enteredBy = new ArrayList<>();
//		this.orc_11_verifiedBy = new ArrayList<>();
//		this.orc_12_orderingProvider = new ArrayList<>();
//		this.orc_13_enterersLocation = new PL_ST_v25();
//		this.orc_14_callBackPhoneNumber = new ArrayList<>();
//		this.orc_15_orderEffectiveDateTime = new TS_ST();
//		this.orc_16_orderControlCodeReason = new CE_ST();
//		this.orc_17_enteringOrganization = new CE_ST();
//		this.orc_18_enteringDevice = new CE_ST();
//		this.orc_19_actionBy = new ArrayList<>();
//		this.orc_20_advancedBeneficiaryNoticeCode = new CE_ST();
//		this.orc_21_orderingFacilityName = new ArrayList<>();
//		this.orc_22_orderingFacilityAddress = new ArrayList<>();
//		this.orc_23_orderingFacilityPhoneNumber = new ArrayList<>();
//		this.orc_24_orderingProviderAddress = new ArrayList<>();
//		this.orc_25_orderStatusModifier = new CWE_ST_v25();
//		this.orc_26_advancedBeneficiaryNoticeOverrideReason = new CWE_ST_v25();
//		this.orc_27_fillersExpectedAvailabilityDateTime = new TS_ST();
//		this.orc_28_confidentialityCode = new CWE_ST_v25();
//		this.orc_29_orderType = new CWE_ST_v25();
//		this.orc_30_entererAuthorizationMode = new CNE_ST_v25();
//	}
//	public String getOrc_1_orderControl() {
//		return orc_1_orderControl;
//	}
//	public EI_ST_v25 getOrc_2_placerOrderNumber() {
//		return orc_2_placerOrderNumber;
//	}
//	public EI_ST_v25 getOrc_3_fillerOrderNumber() {
//		return orc_3_fillerOrderNumber;
//	}
//	public EI_ST_v25 getOrc_4_placerGroupNumber() {
//		return orc_4_placerGroupNumber;
//	}
//	public String getOrc_5_orderStatus() {
//		return orc_5_orderStatus;
//	}
//	public String getOrc_6_responseFlag() {
//		return orc_6_responseFlag;
//	}
//	public List<TQ_ST_v25> getOrc_7_quantityTiming() {
//		return orc_7_quantityTiming;
//	}
//	public EIP_ST_v25 getOrc_8_parentOrder() {
//		return orc_8_parentOrder;
//	}
//	public TS_ST getOrc_9_dateTimeofTransaction() {
//		return orc_9_dateTimeofTransaction;
//	}
//	public List<XCN_ST_v25> getOrc_10_enteredBy() {
//		return orc_10_enteredBy;
//	}
//	public List<XCN_ST_v25> getOrc_11_verifiedBy() {
//		return orc_11_verifiedBy;
//	}
//	public List<XCN_ST_v25> getOrc_12_orderingProvider() {
//		return orc_12_orderingProvider;
//	}
//	public PL_ST_v25 getOrc_13_enterersLocation() {
//		return orc_13_enterersLocation;
//	}
//	public List<XTN_ST_v25> getOrc_14_callBackPhoneNumber() {
//		return orc_14_callBackPhoneNumber;
//	}
//	public TS_ST getOrc_15_orderEffectiveDateTime() {
//		return orc_15_orderEffectiveDateTime;
//	}
//	public CE_ST getOrc_16_orderControlCodeReason() {
//		return orc_16_orderControlCodeReason;
//	}
//	public CE_ST getOrc_17_enteringOrganization() {
//		return orc_17_enteringOrganization;
//	}
//	public CE_ST getOrc_18_enteringDevice() {
//		return orc_18_enteringDevice;
//	}
//	public List<XCN_ST_v25> getOrc_19_actionBy() {
//		return orc_19_actionBy;
//	}
//	public CE_ST getOrc_20_advancedBeneficiaryNoticeCode() {
//		return orc_20_advancedBeneficiaryNoticeCode;
//	}
//	public List<XON_ST_v25> getOrc_21_orderingFacilityName() {
//		return orc_21_orderingFacilityName;
//	}
//	public List<XAD_ST_v25> getOrc_22_orderingFacilityAddress() {
//		return orc_22_orderingFacilityAddress;
//	}
//	public List<XTN_ST_v25> getOrc_23_orderingFacilityPhoneNumber() {
//		return orc_23_orderingFacilityPhoneNumber;
//	}
//	public List<XAD_ST_v25> getOrc_24_orderingProviderAddress() {
//		return orc_24_orderingProviderAddress;
//	}
//	public CWE_ST_v25 getOrc_25_orderStatusModifier() {
//		return orc_25_orderStatusModifier;
//	}
//	public CWE_ST_v25 getOrc_26_advancedBeneficiaryNoticeOverrideReason() {
//		return orc_26_advancedBeneficiaryNoticeOverrideReason;
//	}
//	public TS_ST getOrc_27_fillersExpectedAvailabilityDateTime() {
//		return orc_27_fillersExpectedAvailabilityDateTime;
//	}
//	public CWE_ST_v25 getOrc_28_confidentialityCode() {
//		return orc_28_confidentialityCode;
//	}
//	public CWE_ST_v25 getOrc_29_orderType() {
//		return orc_29_orderType;
//	}
//	public CNE_ST_v25 getOrc_30_entererAuthorizationMode() {
//		return orc_30_entererAuthorizationMode;
//	}
//	/**
//	 * @return the obr
//	 *	@JsonProperty("obr")
//	 */
//	
//	public OBR_ST_v25 getObr() {
//		return obr;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, obr, orc_10_enteredBy, orc_11_verifiedBy, orc_12_orderingProvider,
//				orc_13_enterersLocation, orc_14_callBackPhoneNumber, orc_15_orderEffectiveDateTime,
//				orc_16_orderControlCodeReason, orc_17_enteringOrganization, orc_18_enteringDevice, orc_19_actionBy,
//				orc_1_orderControl, orc_20_advancedBeneficiaryNoticeCode, orc_21_orderingFacilityName,
//				orc_22_orderingFacilityAddress, orc_23_orderingFacilityPhoneNumber, orc_24_orderingProviderAddress,
//				orc_25_orderStatusModifier, orc_26_advancedBeneficiaryNoticeOverrideReason,
//				orc_27_fillersExpectedAvailabilityDateTime, orc_28_confidentialityCode, orc_29_orderType,
//				orc_2_placerOrderNumber, orc_30_entererAuthorizationMode, orc_3_fillerOrderNumber,
//				orc_4_placerGroupNumber, orc_5_orderStatus, orc_6_responseFlag, orc_7_quantityTiming, orc_8_parentOrder,
//				orc_9_dateTimeofTransaction);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ORC_ST_v25 other = (ORC_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(obr, other.obr)
//				&& Objects.equals(orc_10_enteredBy, other.orc_10_enteredBy)
//				&& Objects.equals(orc_11_verifiedBy, other.orc_11_verifiedBy)
//				&& Objects.equals(orc_12_orderingProvider, other.orc_12_orderingProvider)
//				&& Objects.equals(orc_13_enterersLocation, other.orc_13_enterersLocation)
//				&& Objects.equals(orc_14_callBackPhoneNumber, other.orc_14_callBackPhoneNumber)
//				&& Objects.equals(orc_15_orderEffectiveDateTime, other.orc_15_orderEffectiveDateTime)
//				&& Objects.equals(orc_16_orderControlCodeReason, other.orc_16_orderControlCodeReason)
//				&& Objects.equals(orc_17_enteringOrganization, other.orc_17_enteringOrganization)
//				&& Objects.equals(orc_18_enteringDevice, other.orc_18_enteringDevice)
//				&& Objects.equals(orc_19_actionBy, other.orc_19_actionBy)
//				&& Objects.equals(orc_1_orderControl, other.orc_1_orderControl)
//				&& Objects.equals(orc_20_advancedBeneficiaryNoticeCode, other.orc_20_advancedBeneficiaryNoticeCode)
//				&& Objects.equals(orc_21_orderingFacilityName, other.orc_21_orderingFacilityName)
//				&& Objects.equals(orc_22_orderingFacilityAddress, other.orc_22_orderingFacilityAddress)
//				&& Objects.equals(orc_23_orderingFacilityPhoneNumber, other.orc_23_orderingFacilityPhoneNumber)
//				&& Objects.equals(orc_24_orderingProviderAddress, other.orc_24_orderingProviderAddress)
//				&& Objects.equals(orc_25_orderStatusModifier, other.orc_25_orderStatusModifier)
//				&& Objects.equals(orc_26_advancedBeneficiaryNoticeOverrideReason,
//						other.orc_26_advancedBeneficiaryNoticeOverrideReason)
//				&& Objects.equals(orc_27_fillersExpectedAvailabilityDateTime,
//						other.orc_27_fillersExpectedAvailabilityDateTime)
//				&& Objects.equals(orc_28_confidentialityCode, other.orc_28_confidentialityCode)
//				&& Objects.equals(orc_29_orderType, other.orc_29_orderType)
//				&& Objects.equals(orc_2_placerOrderNumber, other.orc_2_placerOrderNumber)
//				&& Objects.equals(orc_30_entererAuthorizationMode, other.orc_30_entererAuthorizationMode)
//				&& Objects.equals(orc_3_fillerOrderNumber, other.orc_3_fillerOrderNumber)
//				&& Objects.equals(orc_4_placerGroupNumber, other.orc_4_placerGroupNumber)
//				&& Objects.equals(orc_5_orderStatus, other.orc_5_orderStatus)
//				&& Objects.equals(orc_6_responseFlag, other.orc_6_responseFlag)
//				&& Objects.equals(orc_7_quantityTiming, other.orc_7_quantityTiming)
//				&& Objects.equals(orc_8_parentOrder, other.orc_8_parentOrder)
//				&& Objects.equals(orc_9_dateTimeofTransaction, other.orc_9_dateTimeofTransaction);
//	}
//
//	
//	
//		
//}
