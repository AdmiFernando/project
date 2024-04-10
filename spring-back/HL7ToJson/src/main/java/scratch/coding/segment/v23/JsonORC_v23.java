package scratch.coding.segment.v23;


import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_EIP_v23;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.TQ_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XTN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonORC_v23 {
	@JsonProperty("orc_1_orderControl")
	private String orc_1_orderControl;
	@JsonProperty("ei_orc_2_placerOrderNumber")
	private EI_v2[] ei_orc_2_placerOrderNumber;
	@JsonProperty("ei_orc_3_fillerOrderNumber")
	private EI_v2 ei_orc_3_fillerOrderNumber;
	@JsonProperty("ei_orc_4_placerGroupNumber")
	private EI_v2 ei_orc_4_placerGroupNumber;
	@JsonProperty("orc_5_orderStatus")
	private String orc_5_orderStatus;
	@JsonProperty("orc_6_responseFlag")
	private String orc_6_responseFlag;
	@JsonProperty("tq_orc_7_quantityTiming")
	private TQ_v23 tq_orc_7_quantityTiming;
	@JsonProperty("cm_eip_orc_8_parentOrder")
	private CM_EIP_v23 cm_eip_orc_8_parentOrder;
	@JsonProperty("ts_orc_9_dateTimeOfTransaction")
	private TS_v2 ts_orc_9_dateTimeOfTransaction;
	@JsonProperty("xcn_orc_10_enteredBy")
	private XCN_v23 xcn_orc_10_enteredBy;
	@JsonProperty("xcn_orc_11_verifiedBy")
	private XCN_v23 xcn_orc_11_verifiedBy;
	@JsonProperty("xcn_orc_12_orderingProvider")
	private XCN_v23[] xcn_orc_12_orderingProvider;
	@JsonProperty("pl_orc_13_entererSLocation")
	private PL_v23 pl_orc_13_entererSLocation;
	@JsonProperty("xtn_orc_14_callBackPhoneNumber")
	private XTN_v23[] xtn_orc_14_callBackPhoneNumber;
	@JsonProperty("ts_orc_15_orderEffectiveDateTime")
	private TS_v2 ts_orc_15_orderEffectiveDateTime;
	@JsonProperty("ce_orc_16_orderControlCodeReason")
	private CE_v2 ce_orc_16_orderControlCodeReason;
	@JsonProperty("ce_orc_17_enteringOrganization")
	private CE_v2 ce_orc_17_enteringOrganization;
	@JsonProperty("ce_orc_18_enteringDevice")
	private CE_v2 ce_orc_18_enteringDevice;
	@JsonProperty("xcn_orc_19_actionBy")
	private XCN_v23 xcn_orc_19_actionBy;
	@JsonProperty("obr_orc")
	private JsonOBR_v23 obr_orc;
	public JsonORC_v23(ORCBuilder builder) {
		super();
		this.orc_1_orderControl = builder.orc_1_orderControl;
		this.ei_orc_2_placerOrderNumber = builder.ei_orc_2_placerOrderNumber;
		this.ei_orc_3_fillerOrderNumber = builder.ei_orc_3_fillerOrderNumber;
		this.ei_orc_4_placerGroupNumber = builder.ei_orc_4_placerGroupNumber;
		this.orc_5_orderStatus = builder.orc_5_orderStatus;
		this.orc_6_responseFlag = builder.orc_6_responseFlag;
		this.tq_orc_7_quantityTiming = builder.tq_orc_7_quantityTiming;
		this.cm_eip_orc_8_parentOrder = builder.cm_eip_orc_8_parentOrder;
		this.ts_orc_9_dateTimeOfTransaction = builder.ts_orc_9_dateTimeOfTransaction;
		this.xcn_orc_10_enteredBy = builder.xcn_orc_10_enteredBy;
		this.xcn_orc_11_verifiedBy = builder.xcn_orc_11_verifiedBy;
		this.xcn_orc_12_orderingProvider = builder.xcn_orc_12_orderingProvider;
		this.pl_orc_13_entererSLocation = builder.pl_orc_13_entererSLocation;
		this.xtn_orc_14_callBackPhoneNumber = builder.xtn_orc_14_callBackPhoneNumber;
		this.ts_orc_15_orderEffectiveDateTime = builder.ts_orc_15_orderEffectiveDateTime;
		this.ce_orc_16_orderControlCodeReason = builder.ce_orc_16_orderControlCodeReason;
		this.ce_orc_17_enteringOrganization = builder.ce_orc_17_enteringOrganization;
		this.ce_orc_18_enteringDevice = builder.ce_orc_18_enteringDevice;
		this.xcn_orc_19_actionBy = builder.xcn_orc_19_actionBy;
		this.obr_orc = builder.obr_orc;
	}
	
	public JsonORC_v23(String orc_1_orderControl, EI_v2[] ei_orc_2_placerOrderNumber, EI_v2 ei_orc_3_fillerOrderNumber,
			EI_v2 ei_orc_4_placerGroupNumber, String orc_5_orderStatus, String orc_6_responseFlag,
			TQ_v23 tq_orc_7_quantityTiming, CM_EIP_v23 cm_eip_orc_8_parentOrder, TS_v2 ts_orc_9_dateTimeOfTransaction,
			XCN_v23 xcn_orc_10_enteredBy, XCN_v23 xcn_orc_11_verifiedBy, XCN_v23[] xcn_orc_12_orderingProvider,
			PL_v23 pl_orc_13_entererSLocation, XTN_v23[] xtn_orc_14_callBackPhoneNumber,
			TS_v2 ts_orc_15_orderEffectiveDateTime, CE_v2 ce_orc_16_orderControlCodeReason,
			CE_v2 ce_orc_17_enteringOrganization, CE_v2 ce_orc_18_enteringDevice, XCN_v23 xcn_orc_19_actionBy,
			JsonOBR_v23 obr_orc) {
		super();
		this.orc_1_orderControl = orc_1_orderControl;
		this.ei_orc_2_placerOrderNumber = ei_orc_2_placerOrderNumber;
		this.ei_orc_3_fillerOrderNumber = ei_orc_3_fillerOrderNumber;
		this.ei_orc_4_placerGroupNumber = ei_orc_4_placerGroupNumber;
		this.orc_5_orderStatus = orc_5_orderStatus;
		this.orc_6_responseFlag = orc_6_responseFlag;
		this.tq_orc_7_quantityTiming = tq_orc_7_quantityTiming;
		this.cm_eip_orc_8_parentOrder = cm_eip_orc_8_parentOrder;
		this.ts_orc_9_dateTimeOfTransaction = ts_orc_9_dateTimeOfTransaction;
		this.xcn_orc_10_enteredBy = xcn_orc_10_enteredBy;
		this.xcn_orc_11_verifiedBy = xcn_orc_11_verifiedBy;
		this.xcn_orc_12_orderingProvider = xcn_orc_12_orderingProvider;
		this.pl_orc_13_entererSLocation = pl_orc_13_entererSLocation;
		this.xtn_orc_14_callBackPhoneNumber = xtn_orc_14_callBackPhoneNumber;
		this.ts_orc_15_orderEffectiveDateTime = ts_orc_15_orderEffectiveDateTime;
		this.ce_orc_16_orderControlCodeReason = ce_orc_16_orderControlCodeReason;
		this.ce_orc_17_enteringOrganization = ce_orc_17_enteringOrganization;
		this.ce_orc_18_enteringDevice = ce_orc_18_enteringDevice;
		this.xcn_orc_19_actionBy = xcn_orc_19_actionBy;
		this.obr_orc = obr_orc;
	}
	public JsonORC_v23() {
		super();
		this.orc_1_orderControl = "";
		this.ei_orc_2_placerOrderNumber = new EI_v2[] {};
		this.ei_orc_3_fillerOrderNumber = new EI_v2();
		this.ei_orc_4_placerGroupNumber = new EI_v2();
		this.orc_5_orderStatus = "";
		this.orc_6_responseFlag = "";
		this.tq_orc_7_quantityTiming = new TQ_v23();
		this.cm_eip_orc_8_parentOrder = new CM_EIP_v23();
		this.ts_orc_9_dateTimeOfTransaction = new TS_v2();
		this.xcn_orc_10_enteredBy = new XCN_v23();
		this.xcn_orc_11_verifiedBy = new XCN_v23();
		this.xcn_orc_12_orderingProvider = new XCN_v23[] {};
		this.pl_orc_13_entererSLocation = new PL_v23();
		this.xtn_orc_14_callBackPhoneNumber = new XTN_v23[] {};
		this.ts_orc_15_orderEffectiveDateTime = new TS_v2();
		this.ce_orc_16_orderControlCodeReason = new CE_v2();
		this.ce_orc_17_enteringOrganization = new CE_v2();
		this.ce_orc_18_enteringDevice = new CE_v2();
		this.xcn_orc_19_actionBy = new XCN_v23();
		this.obr_orc = new JsonOBR_v23();
	}
	public static class ORCBuilder {
		private String orc_1_orderControl;
		private EI_v2[] ei_orc_2_placerOrderNumber;
		private EI_v2 ei_orc_3_fillerOrderNumber;
		private EI_v2 ei_orc_4_placerGroupNumber;
		private String orc_5_orderStatus;
		private String orc_6_responseFlag;
		private TQ_v23 tq_orc_7_quantityTiming;
		private CM_EIP_v23 cm_eip_orc_8_parentOrder;
		private TS_v2 ts_orc_9_dateTimeOfTransaction;
		private XCN_v23 xcn_orc_10_enteredBy;
		private XCN_v23 xcn_orc_11_verifiedBy;
		private XCN_v23[] xcn_orc_12_orderingProvider;
		private PL_v23 pl_orc_13_entererSLocation;
		private XTN_v23[] xtn_orc_14_callBackPhoneNumber;
		private TS_v2 ts_orc_15_orderEffectiveDateTime;
		private CE_v2 ce_orc_16_orderControlCodeReason;
		private CE_v2 ce_orc_17_enteringOrganization;
		private CE_v2 ce_orc_18_enteringDevice;
		private XCN_v23 xcn_orc_19_actionBy;
		private JsonOBR_v23 obr_orc;
		public ORCBuilder(String orc_1_orderControl) {
			super();
			this.orc_1_orderControl = orc_1_orderControl;
			this.ei_orc_2_placerOrderNumber = new EI_v2[] {};
			this.ei_orc_3_fillerOrderNumber = new EI_v2();
			this.ei_orc_4_placerGroupNumber = new EI_v2();
			this.orc_5_orderStatus = "";
			this.orc_6_responseFlag = "";
			this.tq_orc_7_quantityTiming = new TQ_v23();
			this.cm_eip_orc_8_parentOrder = new CM_EIP_v23();
			this.ts_orc_9_dateTimeOfTransaction = new TS_v2();
			this.xcn_orc_10_enteredBy = new XCN_v23();
			this.xcn_orc_11_verifiedBy = new XCN_v23();
			this.xcn_orc_12_orderingProvider = new XCN_v23[] {};
			this.pl_orc_13_entererSLocation = new PL_v23();
			this.xtn_orc_14_callBackPhoneNumber = new XTN_v23[] {};
			this.ts_orc_15_orderEffectiveDateTime = new TS_v2();
			this.ce_orc_16_orderControlCodeReason = new CE_v2();
			this.ce_orc_17_enteringOrganization = new CE_v2();
			this.ce_orc_18_enteringDevice = new CE_v2();
			this.xcn_orc_19_actionBy = new XCN_v23();
			this.obr_orc = new JsonOBR_v23();
		}
		public ORCBuilder orc_1_orderControl(String orc_1_orderControl) {
			this.orc_1_orderControl = orc_1_orderControl;
			return this;
		}
		public ORCBuilder ei_orc_2_placerOrderNumber(EI_v2[] ei_orc_2_placerOrderNumber) {
			this.ei_orc_2_placerOrderNumber = ei_orc_2_placerOrderNumber;
			return this;
		}
		public ORCBuilder ei_orc_3_fillerOrderNumber(EI_v2 ei_orc_3_fillerOrderNumber) {
			this.ei_orc_3_fillerOrderNumber = ei_orc_3_fillerOrderNumber;
			return this;
		}
		public ORCBuilder ei_orc_4_placerGroupNumber(EI_v2 ei_orc_4_placerGroupNumber) {
			this.ei_orc_4_placerGroupNumber = ei_orc_4_placerGroupNumber;
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
		public ORCBuilder tq_orc_7_quantityTiming(TQ_v23 tq_orc_7_quantityTiming) {
			this.tq_orc_7_quantityTiming = tq_orc_7_quantityTiming;
			return this;
		}
		public ORCBuilder cm_eip_orc_8_parentOrder(CM_EIP_v23 cm_eip_orc_8_parentOrder) {
			this.cm_eip_orc_8_parentOrder = cm_eip_orc_8_parentOrder;
			return this;
		}
		public ORCBuilder ts_orc_9_dateTimeOfTransaction(TS_v2 ts_orc_9_dateTimeOfTransaction) {
			this.ts_orc_9_dateTimeOfTransaction = ts_orc_9_dateTimeOfTransaction;
			return this;
		}
		public ORCBuilder xcn_orc_10_enteredBy(XCN_v23 xcn_orc_10_enteredBy) {
			this.xcn_orc_10_enteredBy = xcn_orc_10_enteredBy;
			return this;
		}
		public ORCBuilder xcn_orc_11_verifiedBy(XCN_v23 xcn_orc_11_verifiedBy) {
			this.xcn_orc_11_verifiedBy = xcn_orc_11_verifiedBy;
			return this;
		}
		public ORCBuilder xcn_orc_12_orderingProvider(XCN_v23[] xcn_orc_12_orderingProvider) {
			this.xcn_orc_12_orderingProvider = xcn_orc_12_orderingProvider;
			return this;
		}
		public ORCBuilder pl_orc_13_entererSLocation(PL_v23 pl_orc_13_entererSLocation) {
			this.pl_orc_13_entererSLocation = pl_orc_13_entererSLocation;
			return this;
		}
		public ORCBuilder xtn_orc_14_callBackPhoneNumber(XTN_v23[] xtn_orc_14_callBackPhoneNumber) {
			this.xtn_orc_14_callBackPhoneNumber = xtn_orc_14_callBackPhoneNumber;
			return this;
		}
		public ORCBuilder ts_orc_15_orderEffectiveDateTime(TS_v2 ts_orc_15_orderEffectiveDateTime) {
			this.ts_orc_15_orderEffectiveDateTime = ts_orc_15_orderEffectiveDateTime;
			return this;
		}
		public ORCBuilder ce_orc_16_orderControlCodeReason(CE_v2 ce_orc_16_orderControlCodeReason) {
			this.ce_orc_16_orderControlCodeReason = ce_orc_16_orderControlCodeReason;
			return this;
		}
		public ORCBuilder ce_orc_17_enteringOrganization(CE_v2 ce_orc_17_enteringOrganization) {
			this.ce_orc_17_enteringOrganization = ce_orc_17_enteringOrganization;
			return this;
		}
		public ORCBuilder ce_orc_18_enteringDevice(CE_v2 ce_orc_18_enteringDevice) {
			this.ce_orc_18_enteringDevice = ce_orc_18_enteringDevice;
			return this;
		}
		public ORCBuilder xcn_orc_19_actionBy(XCN_v23 xcn_orc_19_actionBy) {
			this.xcn_orc_19_actionBy = xcn_orc_19_actionBy;
			return this;
		}
		public ORCBuilder obr_orc(JsonOBR_v23 obr_orc) {
			this.obr_orc = obr_orc;
			return this;
		}
		public JsonORC_v23 build() {
			return new JsonORC_v23(this);
		}
	}
	public String getOrc_1_orderControl() {
		return orc_1_orderControl;
	}
	public EI_v2[] getEi_orc_2_placerOrderNumber() {
		return ei_orc_2_placerOrderNumber;
	}
	public EI_v2 getEi_orc_3_fillerOrderNumber() {
		return ei_orc_3_fillerOrderNumber;
	}
	public EI_v2 getEi_orc_4_placerGroupNumber() {
		return ei_orc_4_placerGroupNumber;
	}
	public String getOrc_5_orderStatus() {
		return orc_5_orderStatus;
	}
	public String getOrc_6_responseFlag() {
		return orc_6_responseFlag;
	}
	public TQ_v23 getTq_orc_7_quantityTiming() {
		return tq_orc_7_quantityTiming;
	}
	public CM_EIP_v23 getCm_eip_orc_8_parentOrder() {
		return cm_eip_orc_8_parentOrder;
	}
	public TS_v2 getTs_orc_9_dateTimeOfTransaction() {
		return ts_orc_9_dateTimeOfTransaction;
	}
	public XCN_v23 getXcn_orc_10_enteredBy() {
		return xcn_orc_10_enteredBy;
	}
	public XCN_v23 getXcn_orc_11_verifiedBy() {
		return xcn_orc_11_verifiedBy;
	}
	public XCN_v23[] getXcn_orc_12_orderingProvider() {
		return xcn_orc_12_orderingProvider;
	}
	public PL_v23 getPl_orc_13_entererSLocation() {
		return pl_orc_13_entererSLocation;
	}
	public XTN_v23[] getXtn_orc_14_callBackPhoneNumber() {
		return xtn_orc_14_callBackPhoneNumber;
	}
	public TS_v2 getTs_orc_15_orderEffectiveDateTime() {
		return ts_orc_15_orderEffectiveDateTime;
	}
	public CE_v2 getCe_orc_16_orderControlCodeReason() {
		return ce_orc_16_orderControlCodeReason;
	}
	public CE_v2 getCe_orc_17_enteringOrganization() {
		return ce_orc_17_enteringOrganization;
	}
	public CE_v2 getCe_orc_18_enteringDevice() {
		return ce_orc_18_enteringDevice;
	}
	public XCN_v23 getXcn_orc_19_actionBy() {
		return xcn_orc_19_actionBy;
	}
	public JsonOBR_v23 getObr_orc() {
		return obr_orc;
	}
	@Override
	public String toString() {
		return "JsonORC_v23 [orc_1_orderControl=" + orc_1_orderControl + ", ei_orc_2_placerOrderNumber="
				+ Arrays.toString(ei_orc_2_placerOrderNumber) + ", ei_orc_3_fillerOrderNumber="
				+ ei_orc_3_fillerOrderNumber + ", ei_orc_4_placerGroupNumber=" + ei_orc_4_placerGroupNumber
				+ ", orc_5_orderStatus=" + orc_5_orderStatus + ", orc_6_responseFlag=" + orc_6_responseFlag
				+ ", tq_orc_7_quantityTiming=" + tq_orc_7_quantityTiming + ", cm_eip_orc_8_parentOrder="
				+ cm_eip_orc_8_parentOrder + ", ts_orc_9_dateTimeOfTransaction=" + ts_orc_9_dateTimeOfTransaction
				+ ", xcn_orc_10_enteredBy=" + xcn_orc_10_enteredBy + ", xcn_orc_11_verifiedBy=" + xcn_orc_11_verifiedBy
				+ ", xcn_orc_12_orderingProvider=" + Arrays.toString(xcn_orc_12_orderingProvider)
				+ ", pl_orc_13_entererSLocation=" + pl_orc_13_entererSLocation + ", xtn_orc_14_callBackPhoneNumber="
				+ Arrays.toString(xtn_orc_14_callBackPhoneNumber) + ", ts_orc_15_orderEffectiveDateTime="
				+ ts_orc_15_orderEffectiveDateTime + ", ce_orc_16_orderControlCodeReason="
				+ ce_orc_16_orderControlCodeReason + ", ce_orc_17_enteringOrganization="
				+ ce_orc_17_enteringOrganization + ", ce_orc_18_enteringDevice=" + ce_orc_18_enteringDevice
				+ ", xcn_orc_19_actionBy=" + xcn_orc_19_actionBy + ", obr_orc=" + obr_orc + "]";
	}
}