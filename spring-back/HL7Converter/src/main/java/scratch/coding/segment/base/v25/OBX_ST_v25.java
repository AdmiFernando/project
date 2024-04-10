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
//import scratch.coding.models.base.ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v25.EI_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//
//
//@Table(name="OBX_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class OBX_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="OBX_ID")
//	private Long id;
//	@Column(name="OBX_1_v25")
//	@JsonProperty("obx_1_setID")
//	private String obx_1_setID;
//	@Column(name="OBX_2_v25")
//	@JsonProperty("obx_2_valueType")
//	private String obx_2_valueType;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBX_3_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obx_3_observationIdentifier")
//	private CE_ST obx_3_observationIdentifier;
//	@Column(name="OBX_4_v25")
//	@JsonProperty("obx_4_observationSubID")
//	private String obx_4_observationSubID;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_ST_5_v25")
//	@JsonProperty("obx_5_observationValue")
//	private List<ST> obx_5_observationValue;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBX_6_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obx_6_units")
//	private CE_ST obx_6_units;
//	@Column(name="OBX_7_v25")
//	@JsonProperty("obx_7_referencesRange")
//	private String obx_7_referencesRange;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_ST_8_v25")
//	@JsonProperty("obx_8_abnormalFlags")
//	private List<ST> obx_8_abnormalFlags;
//	@Column(name="OBX_9_v25")
//	@JsonProperty("obx_9_probability")
//	private String obx_9_probability;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_ST_10_v25")
//	@JsonProperty("obx_10_natureofAbnormalTest")
//	private List<ST> obx_10_natureofAbnormalTest;
//	@Column(name="OBX_11_v25")
//	@JsonProperty("obx_11_observationResultStatus")
//	private String obx_11_observationResultStatus;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBX_12_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obx_12_effectiveDateofReferenceRange")
//	private TS_ST obx_12_effectiveDateofReferenceRange;
//	@Column(name="OBX_13_v25")
//	@JsonProperty("obx_13_userDefinedAccessChecks")
//	private String obx_13_userDefinedAccessChecks;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBX_14_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obx_14_dateTimeoftheObservation")
//	private TS_ST obx_14_dateTimeoftheObservation;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_OBX_15_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("obx_15_producersID")
//	private CE_ST obx_15_producersID;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_XCN_16_v25")
//	@JsonProperty("obx_16_responsibleObserver")
//	private List<XCN_ST_v25> obx_16_responsibleObserver;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_CE_17_v25")
//	@JsonProperty("obx_17_observationMethod")
//	private List<CE_ST> obx_17_observationMethod;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_EI_18_v25")
//	@JsonProperty("obx_18_equipmentInstanceIdentifier")
//	private List<EI_ST_v25> obx_18_equipmentInstanceIdentifier;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_OBX_19_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("obx_19_dateTimeoftheAnalysis")
//	private TS_ST obx_19_dateTimeoftheAnalysis;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OBX_NTE_v25")
//	@JsonProperty("nte")
//	private List<NTE_ST_v25> nte;
//	private OBX_ST_v25(OBXBuilder builder) {
//		this.obx_1_setID = builder.obx_1_setID;
//		this.obx_2_valueType = builder.obx_2_valueType;
//		this.obx_3_observationIdentifier = builder.obx_3_observationIdentifier;
//		this.obx_4_observationSubID = builder.obx_4_observationSubID;
//		this.obx_5_observationValue = builder.obx_5_observationValue;
//		this.obx_6_units = builder.obx_6_units;
//		this.obx_7_referencesRange = builder.obx_7_referencesRange;
//		this.obx_8_abnormalFlags = builder.obx_8_abnormalFlags;
//		this.obx_9_probability = builder.obx_9_probability;
//		this.obx_10_natureofAbnormalTest = builder.obx_10_natureofAbnormalTest;
//		this.obx_11_observationResultStatus = builder.obx_11_observationResultStatus;
//		this.obx_12_effectiveDateofReferenceRange = builder.obx_12_effectiveDateofReferenceRange;
//		this.obx_13_userDefinedAccessChecks = builder.obx_13_userDefinedAccessChecks;
//		this.obx_14_dateTimeoftheObservation = builder.obx_14_dateTimeoftheObservation;
//		this.obx_15_producersID = builder.obx_15_producersID;
//		this.obx_16_responsibleObserver = builder.obx_16_responsibleObserver;
//		this.obx_17_observationMethod = builder.obx_17_observationMethod;
//		this.obx_18_equipmentInstanceIdentifier = builder.obx_18_equipmentInstanceIdentifier;
//		this.obx_19_dateTimeoftheAnalysis = builder.obx_19_dateTimeoftheAnalysis;
//		this.nte = builder.nte;
//	}
//	public static class OBXBuilder{
//		private String obx_1_setID;
//		private String obx_2_valueType;
//		private CE_ST obx_3_observationIdentifier;
//		private String obx_4_observationSubID;
//		private List<ST> obx_5_observationValue;
//		private CE_ST obx_6_units;
//		private String obx_7_referencesRange;
//		private List<ST> obx_8_abnormalFlags;
//		private String obx_9_probability;
//		private List<ST> obx_10_natureofAbnormalTest;
//		private String obx_11_observationResultStatus;
//		private TS_ST obx_12_effectiveDateofReferenceRange;
//		private String obx_13_userDefinedAccessChecks;
//		private TS_ST obx_14_dateTimeoftheObservation;
//		private CE_ST obx_15_producersID;
//		private List<XCN_ST_v25> obx_16_responsibleObserver;
//		private List<CE_ST> obx_17_observationMethod;
//		private List<EI_ST_v25> obx_18_equipmentInstanceIdentifier;
//		private TS_ST obx_19_dateTimeoftheAnalysis;
//		private List<NTE_ST_v25> nte;
//		public OBXBuilder(String obx_1_setID, String obx_2_valueType, CE_ST obx_3_observationIdentifier,
//				List<ST> obx_5_observationValue, CE_ST obx_6_units,
//				String obx_7_referencesRange, String obx_11_observationResultStatus) {
//			super();
//			this.obx_1_setID = obx_1_setID;
//			this.obx_2_valueType = obx_2_valueType;
//			this.obx_3_observationIdentifier = obx_3_observationIdentifier;
//			this.obx_4_observationSubID = "";
//			this.obx_5_observationValue = obx_5_observationValue;
//			this.obx_6_units = obx_6_units;
//			this.obx_7_referencesRange = obx_7_referencesRange;
//			this.obx_8_abnormalFlags = new ArrayList<>();
//			this.obx_9_probability = "";
//			this.obx_10_natureofAbnormalTest = new ArrayList<>();
//			this.obx_11_observationResultStatus = obx_11_observationResultStatus;
//			this.obx_12_effectiveDateofReferenceRange = new TS_ST();
//			this.obx_13_userDefinedAccessChecks = "";
//			this.obx_14_dateTimeoftheObservation = new TS_ST();
//			this.obx_15_producersID = new CE_ST();
//			this.obx_16_responsibleObserver =new ArrayList<>();
//			this.obx_17_observationMethod = new ArrayList<>();
//			this.obx_18_equipmentInstanceIdentifier = new ArrayList<>();
//			this.obx_19_dateTimeoftheAnalysis = new TS_ST();
//		}
//		public OBXBuilder obx_4_observationSubID(String obx_4_observationSubID) {
//			this.obx_4_observationSubID = obx_4_observationSubID;
//			return this;
//		}
//		public OBXBuilder obx_8_abnormalFlags(List<ST> obx_8_abnormalFlags) {
//			this.obx_8_abnormalFlags = obx_8_abnormalFlags;
//			return this;
//		}
//		public OBXBuilder obx_9_probability(String obx_9_probability) {
//			this.obx_9_probability = obx_9_probability;
//			return this;
//		}
//		public OBXBuilder obx_10_natureofAbnormalTest(List<ST> obx_10_natureofAbnormalTest) {
//			this.obx_10_natureofAbnormalTest = obx_10_natureofAbnormalTest;
//			return this;
//		}
//		public OBXBuilder obx_12_effectiveDateofReferenceRange(TS_ST obx_12_effectiveDateofReferenceRange) {
//			this.obx_12_effectiveDateofReferenceRange = obx_12_effectiveDateofReferenceRange;
//			return this;
//		}
//		public OBXBuilder obx_13_userDefinedAccessChecks(String obx_13_userDefinedAccessChecks) {
//			this.obx_13_userDefinedAccessChecks = obx_13_userDefinedAccessChecks;
//			return this;
//		}
//		public OBXBuilder obx_14_dateTimeoftheObservation(TS_ST obx_14_dateTimeoftheObservation) {
//			this.obx_14_dateTimeoftheObservation = obx_14_dateTimeoftheObservation;
//			return this;
//		}
//		public OBXBuilder obx_15_producersID(CE_ST obx_15_producersID) {
//			this.obx_15_producersID = obx_15_producersID;
//			return this;
//		}
//		public OBXBuilder obx_16_responsibleObserver(List<XCN_ST_v25> obx_16_responsibleObserver) {
//			this.obx_16_responsibleObserver = obx_16_responsibleObserver;
//			return this;
//		}
//		public OBXBuilder obx_17_observationMethod(List<CE_ST> obx_17_observationMethod) {
//			this.obx_17_observationMethod = obx_17_observationMethod;
//			return this;
//		}
//		public OBXBuilder obx_18_equipmentInstanceIdentifier(List<EI_ST_v25> obx_18_equipmentInstanceIdentifier) {
//			this.obx_18_equipmentInstanceIdentifier = obx_18_equipmentInstanceIdentifier;
//			return this;
//		}
//		public OBXBuilder obx_19_dateTimeoftheAnalysis(TS_ST obx_19_dateTimeoftheAnalysis) {
//			this.obx_19_dateTimeoftheAnalysis = obx_19_dateTimeoftheAnalysis;
//			return this;
//		}
//		public OBXBuilder nte(List<NTE_ST_v25> nte) {
//			this.nte = nte;
//			return this;
//		}
//		public OBX_ST_v25 build() {
//			return new OBX_ST_v25(this);
//		}
//	}
//	public OBX_ST_v25() {
//		super();
//		this.obx_1_setID = "";
//		this.obx_2_valueType = "";
//		this.obx_3_observationIdentifier = new CE_ST();
//		this.obx_4_observationSubID = "";
//		this.obx_5_observationValue = new ArrayList<>();
//		this.obx_6_units = new CE_ST();
//		this.obx_7_referencesRange = "";
//		this.obx_8_abnormalFlags = new ArrayList<>();
//		this.obx_9_probability = "";
//		this.obx_10_natureofAbnormalTest = new ArrayList<>();
//		this.obx_11_observationResultStatus = "";
//		this.obx_12_effectiveDateofReferenceRange = new TS_ST();
//		this.obx_13_userDefinedAccessChecks = "";
//		this.obx_14_dateTimeoftheObservation = new TS_ST();
//		this.obx_15_producersID = new CE_ST();
//		this.obx_16_responsibleObserver = new ArrayList<>();
//		this.obx_17_observationMethod = new ArrayList<>();
//		this.obx_18_equipmentInstanceIdentifier = new ArrayList<>();
//		this.obx_19_dateTimeoftheAnalysis = new TS_ST();
//	}
//	public String getObx_1_setID() {
//		return obx_1_setID;
//	}
//	public String getObx_2_valueType() {
//		return obx_2_valueType;
//	}
//	public CE_ST getObx_3_observationIdentifier() {
//		return obx_3_observationIdentifier;
//	}
//	public String getObx_4_observationSubID() {
//		return obx_4_observationSubID;
//	}
//	public List<ST> getObx_5_observationValue() {
//		return obx_5_observationValue;
//	}
//	public CE_ST getObx_6_units() {
//		return obx_6_units;
//	}
//	public String getObx_7_referencesRange() {
//		return obx_7_referencesRange;
//	}
//	public List<ST> getObx_8_abnormalFlags() {
//		return obx_8_abnormalFlags;
//	}
//	public String getObx_9_probability() {
//		return obx_9_probability;
//	}
//	public List<ST> getObx_10_natureofAbnormalTest() {
//		return obx_10_natureofAbnormalTest;
//	}
//	public String getObx_11_observationResultStatus() {
//		return obx_11_observationResultStatus;
//	}
//	public TS_ST getObx_12_effectiveDateofReferenceRange() {
//		return obx_12_effectiveDateofReferenceRange;
//	}
//	public String getObx_13_userDefinedAccessChecks() {
//		return obx_13_userDefinedAccessChecks;
//	}
//	public TS_ST getObx_14_dateTimeoftheObservation() {
//		return obx_14_dateTimeoftheObservation;
//	}
//	public CE_ST getObx_15_producersID() {
//		return obx_15_producersID;
//	}
//	public List<XCN_ST_v25> getObx_16_responsibleObserver() {
//		return obx_16_responsibleObserver;
//	}
//	public List<CE_ST> getObx_17_observationMethod() {
//		return obx_17_observationMethod;
//	}
//	public List<EI_ST_v25> getObx_18_equipmentInstanceIdentifier() {
//		return obx_18_equipmentInstanceIdentifier;
//	}
//	public TS_ST getObx_19_dateTimeoftheAnalysis() {
//		return obx_19_dateTimeoftheAnalysis;
//	}
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
//	 * @param nte the nte to set
//	 * @JsonProperty("nte")
//	 */
//	public void setNte(List<NTE_ST_v25> nte) {
//		this.nte = nte;
//	}
//	@Override
//	public String toString() {
//		return "OBX_ST_v25 [id=" + id + ", obx_1_setID=" + obx_1_setID + ", obx_2_valueType=" + obx_2_valueType
//				+ ", obx_3_observationIdentifier=" + obx_3_observationIdentifier + ", obx_4_observationSubID="
//				+ obx_4_observationSubID + ", obx_5_observationValue=" + obx_5_observationValue + ", obx_6_units="
//				+ obx_6_units + ", obx_7_referencesRange=" + obx_7_referencesRange + ", obx_8_abnormalFlags="
//				+ obx_8_abnormalFlags + ", obx_9_probability=" + obx_9_probability + ", obx_10_natureofAbnormalTest="
//				+ obx_10_natureofAbnormalTest + ", obx_11_observationResultStatus=" + obx_11_observationResultStatus
//				+ ", obx_12_effectiveDateofReferenceRange=" + obx_12_effectiveDateofReferenceRange
//				+ ", obx_13_userDefinedAccessChecks=" + obx_13_userDefinedAccessChecks
//				+ ", obx_14_dateTimeoftheObservation=" + obx_14_dateTimeoftheObservation + ", obx_15_producersID="
//				+ obx_15_producersID + ", obx_16_responsibleObserver=" + obx_16_responsibleObserver
//				+ ", obx_17_observationMethod=" + obx_17_observationMethod + ", obx_18_equipmentInstanceIdentifier="
//				+ obx_18_equipmentInstanceIdentifier + ", obx_19_dateTimeoftheAnalysis=" + obx_19_dateTimeoftheAnalysis
//				+ ", nte=" + nte + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, nte, obx_10_natureofAbnormalTest, obx_11_observationResultStatus,
//				obx_12_effectiveDateofReferenceRange, obx_13_userDefinedAccessChecks, obx_14_dateTimeoftheObservation,
//				obx_15_producersID, obx_16_responsibleObserver, obx_17_observationMethod,
//				obx_18_equipmentInstanceIdentifier, obx_19_dateTimeoftheAnalysis, obx_1_setID, obx_2_valueType,
//				obx_3_observationIdentifier, obx_4_observationSubID, obx_5_observationValue, obx_6_units,
//				obx_7_referencesRange, obx_8_abnormalFlags, obx_9_probability);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		OBX_ST_v25 other = (OBX_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(nte, other.nte)
//				&& Objects.equals(obx_10_natureofAbnormalTest, other.obx_10_natureofAbnormalTest)
//				&& Objects.equals(obx_11_observationResultStatus, other.obx_11_observationResultStatus)
//				&& Objects.equals(obx_12_effectiveDateofReferenceRange, other.obx_12_effectiveDateofReferenceRange)
//				&& Objects.equals(obx_13_userDefinedAccessChecks, other.obx_13_userDefinedAccessChecks)
//				&& Objects.equals(obx_14_dateTimeoftheObservation, other.obx_14_dateTimeoftheObservation)
//				&& Objects.equals(obx_15_producersID, other.obx_15_producersID)
//				&& Objects.equals(obx_16_responsibleObserver, other.obx_16_responsibleObserver)
//				&& Objects.equals(obx_17_observationMethod, other.obx_17_observationMethod)
//				&& Objects.equals(obx_18_equipmentInstanceIdentifier, other.obx_18_equipmentInstanceIdentifier)
//				&& Objects.equals(obx_19_dateTimeoftheAnalysis, other.obx_19_dateTimeoftheAnalysis)
//				&& Objects.equals(obx_1_setID, other.obx_1_setID)
//				&& Objects.equals(obx_2_valueType, other.obx_2_valueType)
//				&& Objects.equals(obx_3_observationIdentifier, other.obx_3_observationIdentifier)
//				&& Objects.equals(obx_4_observationSubID, other.obx_4_observationSubID)
//				&& Objects.equals(obx_5_observationValue, other.obx_5_observationValue)
//				&& Objects.equals(obx_6_units, other.obx_6_units)
//				&& Objects.equals(obx_7_referencesRange, other.obx_7_referencesRange)
//				&& Objects.equals(obx_8_abnormalFlags, other.obx_8_abnormalFlags)
//				&& Objects.equals(obx_9_probability, other.obx_9_probability);
//	}
//	
//	
//}
