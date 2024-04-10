package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CNE_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.EIP_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.TQ_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;
import scratch.coding.models.v25.XTN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonORC_v25 {
	
	@JsonProperty("orc_1_orderControl")
	private String orc_1_orderControl;
	@JsonProperty("orc_2_placerOrderNumber")
	private EI_v2 orc_2_placerOrderNumber;
	@JsonProperty("orc_3_fillerOrderNumber")
	private EI_v2 orc_3_fillerOrderNumber;
	@JsonProperty("orc_4_placerGroupNumber")
	private EI_v2 orc_4_placerGroupNumber;
	@JsonProperty("orc_5_orderStatus")
	private String orc_5_orderStatus;
	@JsonProperty("orc_6_responseFlag")
	private String orc_6_responseFlag;
	@JsonProperty("orc_7_quantityTiming")
	private TQ_v25[] orc_7_quantityTiming;
	@JsonProperty("orc_8_parentOrder")
	private EIP_v25 orc_8_parentOrder;
	@JsonProperty("orc_9_dateTimeofTransaction")
	private TS_v2 orc_9_dateTimeofTransaction;
	@JsonProperty("orc_10_enteredBy")
	private XCN_v25[] orc_10_enteredBy;
	@JsonProperty("orc_11_verifiedBy")
	private XCN_v25[] orc_11_verifiedBy;
	@JsonProperty("orc_12_orderingProvider")
	private XCN_v25[] orc_12_orderingProvider;
	@JsonProperty("orc_13_enterersLocation")
	private PL_v25 orc_13_enterersLocation;
	@JsonProperty("orc_14_callBackPhoneNumber")
	private XTN_v25[] orc_14_callBackPhoneNumber;
	@JsonProperty("orc_15_orderEffectiveDateTime")
	private TS_v2 orc_15_orderEffectiveDateTime;
	@JsonProperty("orc_16_orderControlCodeReason")
	private CE_v2 orc_16_orderControlCodeReason;
	@JsonProperty("orc_17_enteringOrganization")
	private CE_v2 orc_17_enteringOrganization;
	@JsonProperty("orc_18_enteringDevice")
	private CE_v2 orc_18_enteringDevice;
	@JsonProperty("orc_19_actionBy")
	private XCN_v25[] orc_19_actionBy;
	@JsonProperty("orc_20_advancedBeneficiaryNoticeCode")
	private CE_v2 orc_20_advancedBeneficiaryNoticeCode;
	@JsonProperty("orc_21_orderingFacilityName")
	private XON_v25[] orc_21_orderingFacilityName;
	@JsonProperty("orc_22_orderingFacilityAddress")
	private XAD_v25[] orc_22_orderingFacilityAddress;
	@JsonProperty("orc_23_orderingFacilityPhoneNumber")
	private XTN_v25[] orc_23_orderingFacilityPhoneNumber;
	@JsonProperty("orc_24_orderingProviderAddress")
	private XAD_v25[] orc_24_orderingProviderAddress;
	@JsonProperty("orc_25_orderStatusModifier")
	private CWE_v25 orc_25_orderStatusModifier;
	@JsonProperty("orc_26_advancedBeneficiaryNoticeOverrideReason")
	private CWE_v25 orc_26_advancedBeneficiaryNoticeOverrideReason;
	@JsonProperty("orc_27_fillersExpectedAvailabilityDateTime")
	private TS_v2 orc_27_fillersExpectedAvailabilityDateTime;
	@JsonProperty("orc_28_confidentialityCode")
	private CWE_v25 orc_28_confidentialityCode;
	@JsonProperty("orc_29_orderType")
	private CWE_v25 orc_29_orderType;
	@JsonProperty("orc_30_entererAuthorizationMode")
	private CNE_v25 orc_30_entererAuthorizationMode;
	private JsonORC_v25(ORCBuilder builder) {
		super();
		this.orc_1_orderControl = builder.orc_1_orderControl;
		this.orc_2_placerOrderNumber = builder.orc_2_placerOrderNumber;
		this.orc_3_fillerOrderNumber = builder.orc_3_fillerOrderNumber;
		this.orc_4_placerGroupNumber = builder.orc_4_placerGroupNumber;
		this.orc_5_orderStatus = builder.orc_5_orderStatus;
		this.orc_6_responseFlag = builder.orc_6_responseFlag;
		this.orc_7_quantityTiming = builder.orc_7_quantityTiming;
		this.orc_8_parentOrder = builder.orc_8_parentOrder;
		this.orc_9_dateTimeofTransaction = builder.orc_9_dateTimeofTransaction;
		this.orc_10_enteredBy = builder.orc_10_enteredBy;
		this.orc_11_verifiedBy = builder.orc_11_verifiedBy;
		this.orc_12_orderingProvider = builder.orc_12_orderingProvider;
		this.orc_13_enterersLocation = builder.orc_13_enterersLocation;
		this.orc_14_callBackPhoneNumber = builder.orc_14_callBackPhoneNumber;
		this.orc_15_orderEffectiveDateTime = builder.orc_15_orderEffectiveDateTime;
		this.orc_16_orderControlCodeReason = builder.orc_16_orderControlCodeReason;
		this.orc_17_enteringOrganization = builder.orc_17_enteringOrganization;
		this.orc_18_enteringDevice = builder.orc_18_enteringDevice;
		this.orc_19_actionBy = builder.orc_19_actionBy;
		this.orc_20_advancedBeneficiaryNoticeCode = builder.orc_20_advancedBeneficiaryNoticeCode;
		this.orc_21_orderingFacilityName = builder.orc_21_orderingFacilityName;
		this.orc_22_orderingFacilityAddress = builder.orc_22_orderingFacilityAddress;
		this.orc_23_orderingFacilityPhoneNumber = builder.orc_23_orderingFacilityPhoneNumber;
		this.orc_24_orderingProviderAddress = builder.orc_24_orderingProviderAddress;
		this.orc_25_orderStatusModifier = builder.orc_25_orderStatusModifier;
		this.orc_26_advancedBeneficiaryNoticeOverrideReason = builder.orc_26_advancedBeneficiaryNoticeOverrideReason;
		this.orc_27_fillersExpectedAvailabilityDateTime = builder.orc_27_fillersExpectedAvailabilityDateTime;
		this.orc_28_confidentialityCode = builder.orc_28_confidentialityCode;
		this.orc_29_orderType = builder.orc_29_orderType;
		this.orc_30_entererAuthorizationMode = builder.orc_30_entererAuthorizationMode;
	} 
	public static class ORCBuilder {
		private String orc_1_orderControl;
		private EI_v2 orc_2_placerOrderNumber;
		private EI_v2 orc_3_fillerOrderNumber;
		private EI_v2 orc_4_placerGroupNumber;
		private String orc_5_orderStatus;
		private String orc_6_responseFlag;
		private TQ_v25[] orc_7_quantityTiming;
		private EIP_v25 orc_8_parentOrder;
		private TS_v2 orc_9_dateTimeofTransaction;
		private XCN_v25[] orc_10_enteredBy;
		private XCN_v25[] orc_11_verifiedBy;
		private XCN_v25[] orc_12_orderingProvider;
		private PL_v25 orc_13_enterersLocation;
		private XTN_v25[] orc_14_callBackPhoneNumber;
		private TS_v2 orc_15_orderEffectiveDateTime;
		private CE_v2 orc_16_orderControlCodeReason;
		private CE_v2 orc_17_enteringOrganization;
		private CE_v2 orc_18_enteringDevice;
		private XCN_v25[] orc_19_actionBy;
		private CE_v2 orc_20_advancedBeneficiaryNoticeCode;
		private XON_v25[] orc_21_orderingFacilityName;
		private XAD_v25[] orc_22_orderingFacilityAddress;
		private XTN_v25[] orc_23_orderingFacilityPhoneNumber;
		private XAD_v25[] orc_24_orderingProviderAddress;
		private CWE_v25 orc_25_orderStatusModifier;
		private CWE_v25 orc_26_advancedBeneficiaryNoticeOverrideReason;
		private TS_v2 orc_27_fillersExpectedAvailabilityDateTime;
		private CWE_v25 orc_28_confidentialityCode;
		private CWE_v25 orc_29_orderType;
		private CNE_v25 orc_30_entererAuthorizationMode;
		public ORCBuilder(EI_v2 orc_3_fillerOrderNumber) {
			super();
			this.orc_1_orderControl = "";
			this.orc_2_placerOrderNumber = new EI_v2();
			this.orc_3_fillerOrderNumber = orc_3_fillerOrderNumber;
			this.orc_4_placerGroupNumber = new EI_v2();
			this.orc_5_orderStatus = "";
			this.orc_6_responseFlag = "";
			this.orc_7_quantityTiming = new TQ_v25[] {};
			this.orc_8_parentOrder = new EIP_v25();
			this.orc_9_dateTimeofTransaction = new TS_v2();
			this.orc_10_enteredBy = new XCN_v25[] {};
			this.orc_11_verifiedBy = new XCN_v25[] {};
			this.orc_12_orderingProvider = new XCN_v25[] {};
			this.orc_13_enterersLocation = new PL_v25();
			this.orc_14_callBackPhoneNumber = new XTN_v25[] {};
			this.orc_15_orderEffectiveDateTime = new TS_v2();
			this.orc_16_orderControlCodeReason = new CE_v2();
			this.orc_17_enteringOrganization = new CE_v2();
			this.orc_18_enteringDevice = new CE_v2();
			this.orc_19_actionBy = new XCN_v25[] {};
			this.orc_20_advancedBeneficiaryNoticeCode = new CE_v2();
			this.orc_21_orderingFacilityName = new XON_v25[] {};
			this.orc_22_orderingFacilityAddress = new XAD_v25[] {};
			this.orc_23_orderingFacilityPhoneNumber = new XTN_v25[] {};
			this.orc_24_orderingProviderAddress = new XAD_v25[] {};
			this.orc_25_orderStatusModifier = new CWE_v25();
			this.orc_26_advancedBeneficiaryNoticeOverrideReason = new CWE_v25();
			this.orc_27_fillersExpectedAvailabilityDateTime = new TS_v2();
			this.orc_28_confidentialityCode = new CWE_v25();
			this.orc_29_orderType = new CWE_v25();
			this.orc_30_entererAuthorizationMode = new CNE_v25();
		}
		public ORCBuilder orc_1_orderControl(String orc_1_orderControl) {
			this.orc_1_orderControl = orc_1_orderControl;
			return this;
		}
		public ORCBuilder orc_2_placerOrderNumber(EI_v2 orc_2_placerOrderNumber) {
			this.orc_2_placerOrderNumber = orc_2_placerOrderNumber;
			return this;
		}
		public ORCBuilder orc_4_placerGroupNumber(EI_v2 orc_4_placerGroupNumber) {
			this.orc_4_placerGroupNumber = orc_4_placerGroupNumber;
			return this;
		}
		public ORCBuilder orc_5_orderStatus(String orc_5_orderStatus) {
			this.orc_5_orderStatus = orc_5_orderStatus;
			return this;
		}
		public ORCBuilder orc_6_responseFlag(String orc_6_responseFlag) {
			this.orc_6_responseFlag = orc_6_responseFlag;
			return this;
		}
		public ORCBuilder orc_7_quantityTiming(TQ_v25[] orc_7_quantityTiming) {
			this.orc_7_quantityTiming = orc_7_quantityTiming;
			return this;
		}
		public ORCBuilder orc_8_parentOrder(EIP_v25 orc_8_parentOrder) {
			this.orc_8_parentOrder = orc_8_parentOrder;
			return this;
		}
		public ORCBuilder orc_9_dateTimeofTransaction(TS_v2 orc_9_dateTimeofTransaction) {
			this.orc_9_dateTimeofTransaction = orc_9_dateTimeofTransaction;
			return this;
		}
		public ORCBuilder orc_10_enteredBy(XCN_v25[] orc_10_enteredBy) {
			this.orc_10_enteredBy = orc_10_enteredBy;
			return this;
		}
		public ORCBuilder orc_11_verifiedBy(XCN_v25[] orc_11_verifiedBy) {
			this.orc_11_verifiedBy = orc_11_verifiedBy;
			return this;
		}
		public ORCBuilder orc_12_orderingProvider(XCN_v25[] orc_12_orderingProvider) {
			this.orc_12_orderingProvider = orc_12_orderingProvider;
			return this;
		}
		public ORCBuilder orc_13_enterersLocation(PL_v25 orc_13_enterersLocation) {
			this.orc_13_enterersLocation = orc_13_enterersLocation;
			return this;
		}
		public ORCBuilder orc_14_callBackPhoneNumber(XTN_v25[] orc_14_callBackPhoneNumber) {
			this.orc_14_callBackPhoneNumber = orc_14_callBackPhoneNumber;
			return this;
		}
		public ORCBuilder orc_15_orderEffectiveDateTime(TS_v2 orc_15_orderEffectiveDateTime) {
			this.orc_15_orderEffectiveDateTime = orc_15_orderEffectiveDateTime;
			return this;
		}
		public ORCBuilder orc_16_orderControlCodeReason(CE_v2 orc_16_orderControlCodeReason) {
			this.orc_16_orderControlCodeReason = orc_16_orderControlCodeReason;
			return this;
		}
		public ORCBuilder orc_17_enteringOrganization(CE_v2 orc_17_enteringOrganization) {
			this.orc_17_enteringOrganization = orc_17_enteringOrganization;
			return this;
		}
		public ORCBuilder orc_18_enteringDevice(CE_v2 orc_18_enteringDevice) {
			this.orc_18_enteringDevice = orc_18_enteringDevice;
			return this;
		}
		public ORCBuilder orc_19_actionBy(XCN_v25[] orc_19_actionBy) {
			this.orc_19_actionBy = orc_19_actionBy;
			return this;
		}
		public ORCBuilder orc_20_advancedBeneficiaryNoticeCode(CE_v2 orc_20_advancedBeneficiaryNoticeCode) {
			this.orc_20_advancedBeneficiaryNoticeCode = orc_20_advancedBeneficiaryNoticeCode;
			return this;
		}
		public ORCBuilder orc_21_orderingFacilityName(XON_v25[] orc_21_orderingFacilityName) {
			this.orc_21_orderingFacilityName = orc_21_orderingFacilityName;
			return this;
		}
		public ORCBuilder orc_22_orderingFacilityAddress(XAD_v25[] orc_22_orderingFacilityAddress) {
			this.orc_22_orderingFacilityAddress = orc_22_orderingFacilityAddress;
			return this;
		}
		public ORCBuilder orc_23_orderingFacilityPhoneNumber(XTN_v25[] orc_23_orderingFacilityPhoneNumber) {
			this.orc_23_orderingFacilityPhoneNumber = orc_23_orderingFacilityPhoneNumber;
			return this;
		}
		public ORCBuilder orc_24_orderingProviderAddress(XAD_v25[] orc_24_orderingProviderAddress) {
			this.orc_24_orderingProviderAddress = orc_24_orderingProviderAddress;
			return this;
		}
		public ORCBuilder orc_25_orderStatusModifier(CWE_v25 orc_25_orderStatusModifier) {
			this.orc_25_orderStatusModifier = orc_25_orderStatusModifier;
			return this;
		}
		public ORCBuilder orc_26_advancedBeneficiaryNoticeOverrideReason(CWE_v25 orc_26_advancedBeneficiaryNoticeOverrideReason) {
			this.orc_26_advancedBeneficiaryNoticeOverrideReason = orc_26_advancedBeneficiaryNoticeOverrideReason;
			return this;
		}
		public ORCBuilder orc_27_fillersExpectedAvailabilityDateTime(TS_v2 orc_27_fillersExpectedAvailabilityDateTime) {
			this.orc_27_fillersExpectedAvailabilityDateTime = orc_27_fillersExpectedAvailabilityDateTime;
			return this;
		}
		public ORCBuilder orc_28_confidentialityCode(CWE_v25 orc_28_confidentialityCode) {
			this.orc_28_confidentialityCode = orc_28_confidentialityCode;
			return this;
		}
		public ORCBuilder orc_29_orderType(CWE_v25 orc_29_orderType) {
			this.orc_29_orderType = orc_29_orderType;
			return this;
		}
		public ORCBuilder orc_30_entererAuthorizationMode(CNE_v25 orc_30_entererAuthorizationMode) {
			this.orc_30_entererAuthorizationMode = orc_30_entererAuthorizationMode;
			return this;
		}
		public JsonORC_v25 build() {
			return new JsonORC_v25(this);
		}
		
	}
	public JsonORC_v25() {
		super();
		this.orc_1_orderControl = "";
		this.orc_2_placerOrderNumber = new EI_v2();
		this.orc_3_fillerOrderNumber = new EI_v2();
		this.orc_4_placerGroupNumber = new EI_v2();
		this.orc_5_orderStatus = "";
		this.orc_6_responseFlag = "";
		this.orc_7_quantityTiming = new TQ_v25[] {};
		this.orc_8_parentOrder = new EIP_v25();
		this.orc_9_dateTimeofTransaction = new TS_v2();
		this.orc_10_enteredBy = new XCN_v25[] {};
		this.orc_11_verifiedBy = new XCN_v25[] {};
		this.orc_12_orderingProvider = new XCN_v25[] {};
		this.orc_13_enterersLocation = new PL_v25();
		this.orc_14_callBackPhoneNumber = new XTN_v25[] {};
		this.orc_15_orderEffectiveDateTime = new TS_v2();
		this.orc_16_orderControlCodeReason = new CE_v2();
		this.orc_17_enteringOrganization = new CE_v2();
		this.orc_18_enteringDevice = new CE_v2();
		this.orc_19_actionBy = new XCN_v25[] {};
		this.orc_20_advancedBeneficiaryNoticeCode = new CE_v2();
		this.orc_21_orderingFacilityName = new XON_v25[] {};
		this.orc_22_orderingFacilityAddress = new XAD_v25[] {};
		this.orc_23_orderingFacilityPhoneNumber = new XTN_v25[] {};
		this.orc_24_orderingProviderAddress = new XAD_v25[] {};
		this.orc_25_orderStatusModifier = new CWE_v25();
		this.orc_26_advancedBeneficiaryNoticeOverrideReason = new CWE_v25();
		this.orc_27_fillersExpectedAvailabilityDateTime = new TS_v2();
		this.orc_28_confidentialityCode = new CWE_v25();
		this.orc_29_orderType = new CWE_v25();
		this.orc_30_entererAuthorizationMode = new CNE_v25();
	}
	public String getOrc_1_orderControl() {
		return orc_1_orderControl;
	}
	public EI_v2 getOrc_2_placerOrderNumber() {
		return orc_2_placerOrderNumber;
	}
	public EI_v2 getOrc_3_fillerOrderNumber() {
		return orc_3_fillerOrderNumber;
	}
	public EI_v2 getOrc_4_placerGroupNumber() {
		return orc_4_placerGroupNumber;
	}
	public String getOrc_5_orderStatus() {
		return orc_5_orderStatus;
	}
	public String getOrc_6_responseFlag() {
		return orc_6_responseFlag;
	}
	public TQ_v25[] getOrc_7_quantityTiming() {
		return orc_7_quantityTiming;
	}
	public EIP_v25 getOrc_8_parentOrder() {
		return orc_8_parentOrder;
	}
	public TS_v2 getOrc_9_dateTimeofTransaction() {
		return orc_9_dateTimeofTransaction;
	}
	public XCN_v25[] getOrc_10_enteredBy() {
		return orc_10_enteredBy;
	}
	public XCN_v25[] getOrc_11_verifiedBy() {
		return orc_11_verifiedBy;
	}
	public XCN_v25[] getOrc_12_orderingProvider() {
		return orc_12_orderingProvider;
	}
	public PL_v25 getOrc_13_enterersLocation() {
		return orc_13_enterersLocation;
	}
	public XTN_v25[] getOrc_14_callBackPhoneNumber() {
		return orc_14_callBackPhoneNumber;
	}
	public TS_v2 getOrc_15_orderEffectiveDateTime() {
		return orc_15_orderEffectiveDateTime;
	}
	public CE_v2 getOrc_16_orderControlCodeReason() {
		return orc_16_orderControlCodeReason;
	}
	public CE_v2 getOrc_17_enteringOrganization() {
		return orc_17_enteringOrganization;
	}
	public CE_v2 getOrc_18_enteringDevice() {
		return orc_18_enteringDevice;
	}
	public XCN_v25[] getOrc_19_actionBy() {
		return orc_19_actionBy;
	}
	public CE_v2 getOrc_20_advancedBeneficiaryNoticeCode() {
		return orc_20_advancedBeneficiaryNoticeCode;
	}
	public XON_v25[] getOrc_21_orderingFacilityName() {
		return orc_21_orderingFacilityName;
	}
	public XAD_v25[] getOrc_22_orderingFacilityAddress() {
		return orc_22_orderingFacilityAddress;
	}
	public XTN_v25[] getOrc_23_orderingFacilityPhoneNumber() {
		return orc_23_orderingFacilityPhoneNumber;
	}
	public XAD_v25[] getOrc_24_orderingProviderAddress() {
		return orc_24_orderingProviderAddress;
	}
	public CWE_v25 getOrc_25_orderStatusModifier() {
		return orc_25_orderStatusModifier;
	}
	public CWE_v25 getOrc_26_advancedBeneficiaryNoticeOverrideReason() {
		return orc_26_advancedBeneficiaryNoticeOverrideReason;
	}
	public TS_v2 getOrc_27_fillersExpectedAvailabilityDateTime() {
		return orc_27_fillersExpectedAvailabilityDateTime;
	}
	public CWE_v25 getOrc_28_confidentialityCode() {
		return orc_28_confidentialityCode;
	}
	public CWE_v25 getOrc_29_orderType() {
		return orc_29_orderType;
	}
	public CNE_v25 getOrc_30_entererAuthorizationMode() {
		return orc_30_entererAuthorizationMode;
	}
	@Override
	public String toString() {
		return "JsonORC_v25 [orc_1_orderControl=" + orc_1_orderControl + ", orc_2_placerOrderNumber="
				+ orc_2_placerOrderNumber + ", orc_3_fillerOrderNumber=" + orc_3_fillerOrderNumber
				+ ", orc_4_placerGroupNumber=" + orc_4_placerGroupNumber + ", orc_5_orderStatus=" + orc_5_orderStatus
				+ ", orc_6_responseFlag=" + orc_6_responseFlag + ", orc_7_quantityTiming="
				+ Arrays.toString(orc_7_quantityTiming) + ", orc_8_parentOrder=" + orc_8_parentOrder
				+ ", orc_9_dateTimeofTransaction=" + orc_9_dateTimeofTransaction + ", orc_10_enteredBy="
				+ Arrays.toString(orc_10_enteredBy) + ", orc_11_verifiedBy=" + Arrays.toString(orc_11_verifiedBy)
				+ ", orc_12_orderingProvider=" + Arrays.toString(orc_12_orderingProvider) + ", orc_13_enterersLocation="
				+ orc_13_enterersLocation + ", orc_14_callBackPhoneNumber="
				+ Arrays.toString(orc_14_callBackPhoneNumber) + ", orc_15_orderEffectiveDateTime="
				+ orc_15_orderEffectiveDateTime + ", orc_16_orderControlCodeReason=" + orc_16_orderControlCodeReason
				+ ", orc_17_enteringOrganization=" + orc_17_enteringOrganization + ", orc_18_enteringDevice="
				+ orc_18_enteringDevice + ", orc_19_actionBy=" + Arrays.toString(orc_19_actionBy)
				+ ", orc_20_advancedBeneficiaryNoticeCode=" + orc_20_advancedBeneficiaryNoticeCode
				+ ", orc_21_orderingFacilityName=" + Arrays.toString(orc_21_orderingFacilityName)
				+ ", orc_22_orderingFacilityAddress=" + Arrays.toString(orc_22_orderingFacilityAddress)
				+ ", orc_23_orderingFacilityPhoneNumber=" + Arrays.toString(orc_23_orderingFacilityPhoneNumber)
				+ ", orc_24_orderingProviderAddress=" + Arrays.toString(orc_24_orderingProviderAddress)
				+ ", orc_25_orderStatusModifier=" + orc_25_orderStatusModifier
				+ ", orc_26_advancedBeneficiaryNoticeOverrideReason=" + orc_26_advancedBeneficiaryNoticeOverrideReason
				+ ", orc_27_fillersExpectedAvailabilityDateTime=" + orc_27_fillersExpectedAvailabilityDateTime
				+ ", orc_28_confidentialityCode=" + orc_28_confidentialityCode + ", orc_29_orderType="
				+ orc_29_orderType + ", orc_30_entererAuthorizationMode=" + orc_30_entererAuthorizationMode + "]";
	}
		
}
