package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.XCN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonOBX_v25 {		
		
	@JsonProperty("obx_1_setID")
	private String obx_1_setID;
	@JsonProperty("obx_2_valueType")
	private String obx_2_valueType;
	@JsonProperty("obx_3_observationIdentifier")
	private CE_v2 obx_3_observationIdentifier;
	@JsonProperty("obx_4_observationSubID")
	private String obx_4_observationSubID;
	@JsonProperty("obx_5_observationValue")
	private String[] obx_5_observationValue;
	@JsonProperty("obx_6_units")
	private CE_v2 obx_6_units;
	@JsonProperty("obx_7_referencesRange")
	private String obx_7_referencesRange;
	@JsonProperty("obx_8_abnormalFlags")
	private String[] obx_8_abnormalFlags;
	@JsonProperty("obx_9_probability")
	private String obx_9_probability;
	@JsonProperty("obx_10_natureofAbnormalTest")
	private String[] obx_10_natureofAbnormalTest;
	@JsonProperty("obx_11_observationResultStatus")
	private String obx_11_observationResultStatus;
	@JsonProperty("obx_12_effectiveDateofReferenceRange")
	private TS_v2 obx_12_effectiveDateofReferenceRange;
	@JsonProperty("obx_13_userDefinedAccessChecks")
	private String obx_13_userDefinedAccessChecks;
	@JsonProperty("obx_14_dateTimeoftheObservation")
	private TS_v2 obx_14_dateTimeoftheObservation;
	@JsonProperty("obx_15_producersID")
	private CE_v2 obx_15_producersID;
	@JsonProperty("obx_16_responsibleObserver")
	private XCN_v25[] obx_16_responsibleObserver;
	@JsonProperty("obx_17_observationMethod")
	private CE_v2[] obx_17_observationMethod;
	@JsonProperty("obx_18_equipmentInstanceIdentifier")
	private EI_v2[] obx_18_equipmentInstanceIdentifier;
	@JsonProperty("obx_19_dateTimeoftheAnalysis")
	private TS_v2 obx_19_dateTimeoftheAnalysis;
	private JsonOBX_v25(OBXBuilder builder) {
		this.obx_1_setID = builder.obx_1_setID;
		this.obx_2_valueType = builder.obx_2_valueType;
		this.obx_3_observationIdentifier = builder.obx_3_observationIdentifier;
		this.obx_4_observationSubID = builder.obx_4_observationSubID;
		this.obx_5_observationValue = builder.obx_5_observationValue;
		this.obx_6_units = builder.obx_6_units;
		this.obx_7_referencesRange = builder.obx_7_referencesRange;
		this.obx_8_abnormalFlags = builder.obx_8_abnormalFlags;
		this.obx_9_probability = builder.obx_9_probability;
		this.obx_10_natureofAbnormalTest = builder.obx_10_natureofAbnormalTest;
		this.obx_11_observationResultStatus = builder.obx_11_observationResultStatus;
		this.obx_12_effectiveDateofReferenceRange = builder.obx_12_effectiveDateofReferenceRange;
		this.obx_13_userDefinedAccessChecks = builder.obx_13_userDefinedAccessChecks;
		this.obx_14_dateTimeoftheObservation = builder.obx_14_dateTimeoftheObservation;
		this.obx_15_producersID = builder.obx_15_producersID;
		this.obx_16_responsibleObserver = builder.obx_16_responsibleObserver;
		this.obx_17_observationMethod = builder.obx_17_observationMethod;
		this.obx_18_equipmentInstanceIdentifier = builder.obx_18_equipmentInstanceIdentifier;
		this.obx_19_dateTimeoftheAnalysis = builder.obx_19_dateTimeoftheAnalysis;
	}
	public static class OBXBuilder{
		private String obx_1_setID;
		private String obx_2_valueType;
		private CE_v2 obx_3_observationIdentifier;
		private String obx_4_observationSubID;
		private String[] obx_5_observationValue;
		private CE_v2 obx_6_units;
		private String obx_7_referencesRange;
		private String[] obx_8_abnormalFlags;
		private String obx_9_probability;
		private String[] obx_10_natureofAbnormalTest;
		private String obx_11_observationResultStatus;
		private TS_v2 obx_12_effectiveDateofReferenceRange;
		private String obx_13_userDefinedAccessChecks;
		private TS_v2 obx_14_dateTimeoftheObservation;
		private CE_v2 obx_15_producersID;
		private XCN_v25[] obx_16_responsibleObserver;
		private CE_v2[] obx_17_observationMethod;
		private EI_v2[] obx_18_equipmentInstanceIdentifier;
		private TS_v2 obx_19_dateTimeoftheAnalysis;
		public OBXBuilder(String obx_1_setID, String obx_2_valueType, CE_v2 obx_3_observationIdentifier,
				String[] obx_5_observationValue, CE_v2 obx_6_units,
				String obx_7_referencesRange, String obx_11_observationResultStatus) {
			super();
			this.obx_1_setID = obx_1_setID;
			this.obx_2_valueType = obx_2_valueType;
			this.obx_3_observationIdentifier = obx_3_observationIdentifier;
			this.obx_4_observationSubID = "";
			this.obx_5_observationValue = obx_5_observationValue;
			this.obx_6_units = obx_6_units;
			this.obx_7_referencesRange = obx_7_referencesRange;
			this.obx_8_abnormalFlags = new String[] {};
			this.obx_9_probability = "";
			this.obx_10_natureofAbnormalTest = new String[] {};
			this.obx_11_observationResultStatus = obx_11_observationResultStatus;
			this.obx_12_effectiveDateofReferenceRange = new TS_v2();
			this.obx_13_userDefinedAccessChecks = "";
			this.obx_14_dateTimeoftheObservation = new TS_v2();
			this.obx_15_producersID = new CE_v2();
			this.obx_16_responsibleObserver = new XCN_v25[] {};
			this.obx_17_observationMethod = new CE_v2[] {};
			this.obx_18_equipmentInstanceIdentifier = new EI_v2[] {};
			this.obx_19_dateTimeoftheAnalysis = new TS_v2();
		}
		public OBXBuilder obx_4_observationSubID(String obx_4_observationSubID) {
			this.obx_4_observationSubID = obx_4_observationSubID;
			return this;
		}
		public OBXBuilder obx_8_abnormalFlags(String[] obx_8_abnormalFlags) {
			this.obx_8_abnormalFlags = obx_8_abnormalFlags;
			return this;
		}
		public OBXBuilder obx_9_probability(String obx_9_probability) {
			this.obx_9_probability = obx_9_probability;
			return this;
		}
		public OBXBuilder obx_10_natureofAbnormalTest(String[] obx_10_natureofAbnormalTest) {
			this.obx_10_natureofAbnormalTest = obx_10_natureofAbnormalTest;
			return this;
		}
		public OBXBuilder obx_12_effectiveDateofReferenceRange(TS_v2 obx_12_effectiveDateofReferenceRange) {
			this.obx_12_effectiveDateofReferenceRange = obx_12_effectiveDateofReferenceRange;
			return this;
		}
		public OBXBuilder obx_13_userDefinedAccessChecks(String obx_13_userDefinedAccessChecks) {
			this.obx_13_userDefinedAccessChecks = obx_13_userDefinedAccessChecks;
			return this;
		}
		public OBXBuilder obx_14_dateTimeoftheObservation(TS_v2 obx_14_dateTimeoftheObservation) {
			this.obx_14_dateTimeoftheObservation = obx_14_dateTimeoftheObservation;
			return this;
		}
		public OBXBuilder obx_15_producersID(CE_v2 obx_15_producersID) {
			this.obx_15_producersID = obx_15_producersID;
			return this;
		}
		public OBXBuilder obx_16_responsibleObserver(XCN_v25[] obx_16_responsibleObserver) {
			this.obx_16_responsibleObserver = obx_16_responsibleObserver;
			return this;
		}
		public OBXBuilder obx_17_observationMethod(CE_v2[] obx_17_observationMethod) {
			this.obx_17_observationMethod = obx_17_observationMethod;
			return this;
		}
		public OBXBuilder obx_18_equipmentInstanceIdentifier(EI_v2[] obx_18_equipmentInstanceIdentifier) {
			this.obx_18_equipmentInstanceIdentifier = obx_18_equipmentInstanceIdentifier;
			return this;
		}
		public OBXBuilder obx_19_dateTimeoftheAnalysis(TS_v2 obx_19_dateTimeoftheAnalysis) {
			this.obx_19_dateTimeoftheAnalysis = obx_19_dateTimeoftheAnalysis;
			return this;
		}
		public JsonOBX_v25 build() {
			return new JsonOBX_v25(this);
		}
	}
	public JsonOBX_v25() {
		super();
		this.obx_1_setID = "";
		this.obx_2_valueType = "";
		this.obx_3_observationIdentifier = new CE_v2();
		this.obx_4_observationSubID = "";
		this.obx_5_observationValue = new String[] {};
		this.obx_6_units = new CE_v2();
		this.obx_7_referencesRange = "";
		this.obx_8_abnormalFlags = new String[] {};
		this.obx_9_probability = "";
		this.obx_10_natureofAbnormalTest = new String[] {};
		this.obx_11_observationResultStatus = "";
		this.obx_12_effectiveDateofReferenceRange = new TS_v2();
		this.obx_13_userDefinedAccessChecks = "";
		this.obx_14_dateTimeoftheObservation = new TS_v2();
		this.obx_15_producersID = new CE_v2();
		this.obx_16_responsibleObserver = new XCN_v25[] {};
		this.obx_17_observationMethod = new CE_v2[] {};
		this.obx_18_equipmentInstanceIdentifier = new EI_v2[] {};
		this.obx_19_dateTimeoftheAnalysis = new TS_v2();
	}
	public String getObx_1_setID() {
		return obx_1_setID;
	}
	public String getObx_2_valueType() {
		return obx_2_valueType;
	}
	public CE_v2 getObx_3_observationIdentifier() {
		return obx_3_observationIdentifier;
	}
	public String getObx_4_observationSubID() {
		return obx_4_observationSubID;
	}
	public String[] getObx_5_observationValue() {
		return obx_5_observationValue;
	}
	public CE_v2 getObx_6_units() {
		return obx_6_units;
	}
	public String getObx_7_referencesRange() {
		return obx_7_referencesRange;
	}
	public String[] getObx_8_abnormalFlags() {
		return obx_8_abnormalFlags;
	}
	public String getObx_9_probability() {
		return obx_9_probability;
	}
	public String[] getObx_10_natureofAbnormalTest() {
		return obx_10_natureofAbnormalTest;
	}
	public String getObx_11_observationResultStatus() {
		return obx_11_observationResultStatus;
	}
	public TS_v2 getObx_12_effectiveDateofReferenceRange() {
		return obx_12_effectiveDateofReferenceRange;
	}
	public String getObx_13_userDefinedAccessChecks() {
		return obx_13_userDefinedAccessChecks;
	}
	public TS_v2 getObx_14_dateTimeoftheObservation() {
		return obx_14_dateTimeoftheObservation;
	}
	public CE_v2 getObx_15_producersID() {
		return obx_15_producersID;
	}
	public XCN_v25[] getObx_16_responsibleObserver() {
		return obx_16_responsibleObserver;
	}
	public CE_v2[] getObx_17_observationMethod() {
		return obx_17_observationMethod;
	}
	public EI_v2[] getObx_18_equipmentInstanceIdentifier() {
		return obx_18_equipmentInstanceIdentifier;
	}
	public TS_v2 getObx_19_dateTimeoftheAnalysis() {
		return obx_19_dateTimeoftheAnalysis;
	}
	@Override
	public String toString() {
		return "JsonOBX_v25 [obx_1_setID=" + obx_1_setID + ", obx_2_valueType=" + obx_2_valueType
				+ ", obx_3_observationIdentifier=" + obx_3_observationIdentifier + ", obx_4_observationSubID="
				+ obx_4_observationSubID + ", obx_5_observationValue=" + Arrays.toString(obx_5_observationValue)
				+ ", obx_6_units=" + obx_6_units + ", obx_7_referencesRange=" + obx_7_referencesRange
				+ ", obx_8_abnormalFlags=" + Arrays.toString(obx_8_abnormalFlags) + ", obx_9_probability="
				+ obx_9_probability + ", obx_10_natureofAbnormalTest=" + Arrays.toString(obx_10_natureofAbnormalTest)
				+ ", obx_11_observationResultStatus=" + obx_11_observationResultStatus
				+ ", obx_12_effectiveDateofReferenceRange=" + obx_12_effectiveDateofReferenceRange
				+ ", obx_13_userDefinedAccessChecks=" + obx_13_userDefinedAccessChecks
				+ ", obx_14_dateTimeoftheObservation=" + obx_14_dateTimeoftheObservation + ", obx_15_producersID="
				+ obx_15_producersID + ", obx_16_responsibleObserver=" + Arrays.toString(obx_16_responsibleObserver)
				+ ", obx_17_observationMethod=" + Arrays.toString(obx_17_observationMethod)
				+ ", obx_18_equipmentInstanceIdentifier=" + Arrays.toString(obx_18_equipmentInstanceIdentifier)
				+ ", obx_19_dateTimeoftheAnalysis=" + obx_19_dateTimeoftheAnalysis + "]";
	}
	
}
