package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.XCN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonOBX_v23 {
	@JsonProperty("obx_1_setId")
	private String obx_1_setId;
	@JsonProperty("obx_2_valueType")
	private String obx_2_valueType;
	@JsonProperty("ce_obx_3_observationIdentifier")
	private CE_v2 ce_obx_3_observationIdentifier;
	@JsonProperty("obx_4_observationSubId")
	private String obx_4_observationSubId;
	@JsonProperty("obx_5_observationValue")
	private String[] obx_5_observationValue;
	@JsonProperty("ce_obx_6_units")
	private CE_v2 ce_obx_6_units;
	@JsonProperty("obx_7_referencesRange")
	private String obx_7_referencesRange;
	@JsonProperty("obx_8_abmornalFlags")
	private String[] obx_8_abmornalFlags;
	@JsonProperty("obx_9_probability")
	private String obx_9_probability;
	@JsonProperty("obx_10_natureOfAbnormalTest")
	private String obx_10_natureOfAbnormalTest;
	@JsonProperty("obx_11_observResultStatus")
	private String obx_11_observResultStatus;
	@JsonProperty("ts_obx_12_dateLastObsNormalValues")
	private TS_v2 ts_obx_12_dateLastObsNormalValues;
	@JsonProperty("obx_13_userDefinedAccessChecks")
	private String obx_13_userDefinedAccessChecks;
	@JsonProperty("ts_obx_14_dateTimeOfTheObservation")
	private TS_v2 ts_obx_14_dateTimeOfTheObservation;
	@JsonProperty("ce_obx_15_producersId")
	private CE_v2 ce_obx_15_producersId;
	@JsonProperty("xcn_obx_16_responsibleObserver")
	private XCN_v23 xcn_obx_16_responsibleObserver;
	@JsonProperty("ce_obx_17_observationMethod")
	private CE_v2[] ce_obx_17_observationMethod;
	@JsonProperty("nte_obx")
	private JsonNTE_v23[] nte_obx;
	public JsonOBX_v23(OBXBuilder builder) {
		super();
		this.obx_1_setId = builder.obx_1_setId;
		this.obx_2_valueType = builder.obx_2_valueType;
		this.ce_obx_3_observationIdentifier = builder.ce_obx_3_observationIdentifier;
		this.obx_4_observationSubId = builder.obx_4_observationSubId;
		this.obx_5_observationValue = builder.obx_5_observationValue;
		this.ce_obx_6_units = builder.ce_obx_6_units;
		this.obx_7_referencesRange = builder.obx_7_referencesRange;
		this.obx_8_abmornalFlags = builder.obx_8_abmornalFlags;
		this.obx_9_probability = builder.obx_9_probability;
		this.obx_10_natureOfAbnormalTest = builder.obx_10_natureOfAbnormalTest;
		this.obx_11_observResultStatus = builder.obx_11_observResultStatus;
		this.ts_obx_12_dateLastObsNormalValues = builder.ts_obx_12_dateLastObsNormalValues;
		this.obx_13_userDefinedAccessChecks = builder.obx_13_userDefinedAccessChecks;
		this.ts_obx_14_dateTimeOfTheObservation = builder.ts_obx_14_dateTimeOfTheObservation;
		this.ce_obx_15_producersId = builder.ce_obx_15_producersId;
		this.xcn_obx_16_responsibleObserver = builder.xcn_obx_16_responsibleObserver;
		this.ce_obx_17_observationMethod = builder.ce_obx_17_observationMethod;
		this.nte_obx = builder.nte_obx;
	}
	
	public JsonOBX_v23(String obx_1_setId, String obx_2_valueType, CE_v2 ce_obx_3_observationIdentifier,
			String obx_4_observationSubId, String[] obx_5_observationValue, CE_v2 ce_obx_6_units,
			String obx_7_referencesRange, String[] obx_8_abmornalFlags, String obx_9_probability,
			String obx_10_natureOfAbnormalTest, String obx_11_observResultStatus,
			TS_v2 ts_obx_12_dateLastObsNormalValues, String obx_13_userDefinedAccessChecks,
			TS_v2 ts_obx_14_dateTimeOfTheObservation, CE_v2 ce_obx_15_producersId,
			XCN_v23 xcn_obx_16_responsibleObserver, CE_v2[] ce_obx_17_observationMethod, JsonNTE_v23[] nte_obx) {
		super();
		this.obx_1_setId = obx_1_setId;
		this.obx_2_valueType = obx_2_valueType;
		this.ce_obx_3_observationIdentifier = ce_obx_3_observationIdentifier;
		this.obx_4_observationSubId = obx_4_observationSubId;
		this.obx_5_observationValue = obx_5_observationValue;
		this.ce_obx_6_units = ce_obx_6_units;
		this.obx_7_referencesRange = obx_7_referencesRange;
		this.obx_8_abmornalFlags = obx_8_abmornalFlags;
		this.obx_9_probability = obx_9_probability;
		this.obx_10_natureOfAbnormalTest = obx_10_natureOfAbnormalTest;
		this.obx_11_observResultStatus = obx_11_observResultStatus;
		this.ts_obx_12_dateLastObsNormalValues = ts_obx_12_dateLastObsNormalValues;
		this.obx_13_userDefinedAccessChecks = obx_13_userDefinedAccessChecks;
		this.ts_obx_14_dateTimeOfTheObservation = ts_obx_14_dateTimeOfTheObservation;
		this.ce_obx_15_producersId = ce_obx_15_producersId;
		this.xcn_obx_16_responsibleObserver = xcn_obx_16_responsibleObserver;
		this.ce_obx_17_observationMethod = ce_obx_17_observationMethod;
		this.nte_obx = nte_obx;
	}
	public JsonOBX_v23() {
		super();
		this.obx_1_setId = "";
		this.obx_2_valueType = "";
		this.ce_obx_3_observationIdentifier = new CE_v2();
		this.obx_4_observationSubId = "";
		this.obx_5_observationValue = new String[] {};
		this.ce_obx_6_units = new CE_v2();
		this.obx_7_referencesRange = "";
		this.obx_8_abmornalFlags = new String[] {};
		this.obx_9_probability = "";
		this.obx_10_natureOfAbnormalTest = "";
		this.obx_11_observResultStatus = "";
		this.ts_obx_12_dateLastObsNormalValues = new TS_v2();
		this.obx_13_userDefinedAccessChecks = "";
		this.ts_obx_14_dateTimeOfTheObservation = new TS_v2();
		this.ce_obx_15_producersId = new CE_v2();
		this.xcn_obx_16_responsibleObserver = new XCN_v23();
		this.ce_obx_17_observationMethod = new CE_v2[] {};
		this.nte_obx = new JsonNTE_v23[] {};
	}
	public static class OBXBuilder {
		private String obx_1_setId;
		private String obx_2_valueType;
		private CE_v2 ce_obx_3_observationIdentifier;
		private String obx_4_observationSubId;
		private String[] obx_5_observationValue;
		private CE_v2 ce_obx_6_units;
		private String obx_7_referencesRange;
		private String[] obx_8_abmornalFlags;
		private String obx_9_probability;
		private String obx_10_natureOfAbnormalTest;
		private String obx_11_observResultStatus;
		private TS_v2 ts_obx_12_dateLastObsNormalValues;
		private String obx_13_userDefinedAccessChecks;
		private TS_v2 ts_obx_14_dateTimeOfTheObservation;
		private CE_v2 ce_obx_15_producersId;
		private XCN_v23 xcn_obx_16_responsibleObserver;
		private CE_v2[] ce_obx_17_observationMethod;
		private JsonNTE_v23[] nte_obx;
		public OBXBuilder(CE_v2 ce_obx_3_observationIdentifier, String obx_11_observResultStatus) {
			super();
			this.obx_1_setId = "";
			this.obx_2_valueType = "";
			this.ce_obx_3_observationIdentifier = ce_obx_3_observationIdentifier;
			this.obx_4_observationSubId = "";
			this.obx_5_observationValue = new String[] {};
			this.ce_obx_6_units = new CE_v2();
			this.obx_7_referencesRange = "";
			this.obx_8_abmornalFlags = new String[] {};
			this.obx_9_probability = "";
			this.obx_10_natureOfAbnormalTest = "";
			this.obx_11_observResultStatus = "";
			this.ts_obx_12_dateLastObsNormalValues = new TS_v2();
			this.obx_13_userDefinedAccessChecks = "";
			this.ts_obx_14_dateTimeOfTheObservation = new TS_v2();
			this.ce_obx_15_producersId = new CE_v2();
			this.xcn_obx_16_responsibleObserver = new XCN_v23();
			this.ce_obx_17_observationMethod = new CE_v2[] {};
			this.nte_obx = new JsonNTE_v23[] {};
		}
		public OBXBuilder obx_1_setId(String obx_1_setId) {
			this.obx_1_setId = obx_1_setId;
			return this;
		}
		public OBXBuilder obx_2_valueType(String obx_2_valueType) {
			this.obx_2_valueType = obx_2_valueType;
			return this;
		}
		public OBXBuilder ce_obx_3_observationIdentifier(CE_v2 ce_obx_3_observationIdentifier) {
			this.ce_obx_3_observationIdentifier = ce_obx_3_observationIdentifier;
			return this;
		}
		public OBXBuilder obx_4_observationSubId(String obx_4_observationSubId) {
			this.obx_4_observationSubId = obx_4_observationSubId;
			return this;
		}
		public OBXBuilder obx_5_observationValue(String[] obx_5_observationValue) {
			this.obx_5_observationValue = obx_5_observationValue;
			return this;
		}
		public OBXBuilder ce_obx_6_units(CE_v2 ce_obx_6_units) {
			this.ce_obx_6_units = ce_obx_6_units;
			return this;
		}
		public OBXBuilder obx_7_referencesRange(String obx_7_referencesRange) {
			this.obx_7_referencesRange = obx_7_referencesRange;
			return this;
		}
		public OBXBuilder obx_8_abmornalFlags(String[] obx_8_abmornalFlags) {
			this.obx_8_abmornalFlags = obx_8_abmornalFlags;
			return this;
		}
		public OBXBuilder obx_9_probability(String obx_9_probability) {
			this.obx_9_probability = obx_9_probability;
			return this;
		}
		public OBXBuilder obx_10_natureOfAbnormalTest(String obx_10_natureOfAbnormalTest) {
			this.obx_10_natureOfAbnormalTest = obx_10_natureOfAbnormalTest;
			return this;
		}
		public OBXBuilder obx_11_observResultStatus(String obx_11_observResultStatus) {
			this.obx_11_observResultStatus = obx_11_observResultStatus;
			return this;
		}
		public OBXBuilder ts_obx_12_dateLastObsNormalValues(TS_v2 ts_obx_12_dateLastObsNormalValues) {
			this.ts_obx_12_dateLastObsNormalValues = ts_obx_12_dateLastObsNormalValues;
			return this;
		}
		public OBXBuilder obx_13_userDefinedAccessChecks(String obx_13_userDefinedAccessChecks) {
			this.obx_13_userDefinedAccessChecks = obx_13_userDefinedAccessChecks;
			return this;
		}
		public OBXBuilder ts_obx_14_dateTimeOfTheObservation(TS_v2 ts_obx_14_dateTimeOfTheObservation) {
			this.ts_obx_14_dateTimeOfTheObservation = ts_obx_14_dateTimeOfTheObservation;
			return this;
		}
		public OBXBuilder ce_obx_15_producersId(CE_v2 ce_obx_15_producersId) {
			this.ce_obx_15_producersId = ce_obx_15_producersId;
			return this;
		}
		public OBXBuilder xcn_obx_16_responsibleObserver(XCN_v23 xcn_obx_16_responsibleObserver) {
			this.xcn_obx_16_responsibleObserver = xcn_obx_16_responsibleObserver;
			return this;
		}
		public OBXBuilder ce_obx_17_observationMethod(CE_v2[] ce_obx_17_observationMethod) {
			this.ce_obx_17_observationMethod = ce_obx_17_observationMethod;
			return this;
		}
		public OBXBuilder nte_obr(JsonNTE_v23[] nte_obx) {
			this.nte_obx = nte_obx;
			return this;
		}
		public JsonOBX_v23 build() {
			return new JsonOBX_v23(this);
		}
	}
	public String getObx_1_setId() {
		return obx_1_setId;
	}
	public String getObx_2_valueType() {
		return obx_2_valueType;
	}
	public CE_v2 getCe_obx_3_observationIdentifier() {
		return ce_obx_3_observationIdentifier;
	}
	public String getObx_4_observationSubId() {
		return obx_4_observationSubId;
	}
	public String[] getObx_5_observationValue() {
		return obx_5_observationValue;
	}
	public CE_v2 getCe_obx_6_units() {
		return ce_obx_6_units;
	}
	public String getObx_7_referencesRange() {
		return obx_7_referencesRange;
	}
	public String[] getObx_8_abmornalFlags() {
		return obx_8_abmornalFlags;
	}
	public String getObx_9_probability() {
		return obx_9_probability;
	}
	public String getObx_10_natureOfAbnormalTest() {
		return obx_10_natureOfAbnormalTest;
	}
	public String getObx_11_observResultStatus() {
		return obx_11_observResultStatus;
	}
	public TS_v2 getTs_obx_12_dateLastObsNormalValues() {
		return ts_obx_12_dateLastObsNormalValues;
	}
	public String getObx_13_userDefinedAccessChecks() {
		return obx_13_userDefinedAccessChecks;
	}
	public TS_v2 getTs_obx_14_dateTimeOfTheObservation() {
		return ts_obx_14_dateTimeOfTheObservation;
	}
	public CE_v2 getCe_obx_15_producersId() {
		return ce_obx_15_producersId;
	}
	public XCN_v23 getXcn_obx_16_responsibleObserver() {
		return xcn_obx_16_responsibleObserver;
	}
	public CE_v2[] getCe_obx_17_observationMethod() {
		return ce_obx_17_observationMethod;
	}
	public JsonNTE_v23[] getNte_obx() {
		return nte_obx;
	}
	@Override
	public String toString() {
		return "JsonOBX_v23 [obx_1_setId=" + obx_1_setId + ", obx_2_valueType=" + obx_2_valueType
				+ ", ce_obx_3_observationIdentifier=" + ce_obx_3_observationIdentifier + ", obx_4_observationSubId="
				+ obx_4_observationSubId + ", obx_5_observationValue=" + Arrays.toString(obx_5_observationValue)
				+ ", ce_obx_6_units=" + ce_obx_6_units + ", obx_7_referencesRange=" + obx_7_referencesRange
				+ ", obx_8_abmornalFlags=" + Arrays.toString(obx_8_abmornalFlags) + ", obx_9_probability="
				+ obx_9_probability + ", obx_10_natureOfAbnormalTest=" + obx_10_natureOfAbnormalTest
				+ ", obx_11_observResultStatus=" + obx_11_observResultStatus + ", ts_obx_12_dateLastObsNormalValues="
				+ ts_obx_12_dateLastObsNormalValues + ", obx_13_userDefinedAccessChecks="
				+ obx_13_userDefinedAccessChecks + ", ts_obx_14_dateTimeOfTheObservation="
				+ ts_obx_14_dateTimeOfTheObservation + ", ce_obx_15_producersId=" + ce_obx_15_producersId
				+ ", xcn_obx_16_responsibleObserver=" + xcn_obx_16_responsibleObserver
				+ ", ce_obx_17_observationMethod=" + Arrays.toString(ce_obx_17_observationMethod) + ", nte_obx="
				+ Arrays.toString(nte_obx) + "]";
	}
}
