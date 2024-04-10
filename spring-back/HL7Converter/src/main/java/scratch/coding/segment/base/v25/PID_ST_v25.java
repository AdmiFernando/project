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
//import scratch.coding.hl7.base.v25.ORU_ST_v25;
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.DLN_ST;
//import scratch.coding.models.base.HD_ST;
//import scratch.coding.models.base.ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v25.CWE_ST_v25;
//import scratch.coding.models.base.v25.CX_ST_v25;
//import scratch.coding.models.base.v25.XAD_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//import scratch.coding.models.base.v25.XTN_ST_v25;
//@Table(name="PID_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class PID_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="PID_ID")
//	private Long id;
//	@Column(name="PID_1_v25")
//	@JsonProperty("pid_1_setID")
//	private String pid_1_setID;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CX_PID_2_v25", referencedColumnName = "CX_ID")
//	@JsonProperty("pid_2_patientID")
//	private CX_ST_v25 pid_2_patientID;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_CX_3_v25")
//	@JsonProperty("pid_3_patientIdentifierList")
//	private List<CX_ST_v25> pid_3_patientIdentifierList;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_CX_4_v25")
//	@JsonProperty("pid_4_alternatePatientID")
//	private List<CX_ST_v25> pid_4_alternatePatientID;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_XPN_5_v25")
//	@JsonProperty("pid_5_patientName")
//	private List<XPN_ST_v25> pid_5_patientName;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_XPN_6_v25")
//	@JsonProperty("pid_6_mothersMaidenName")
//	private List<XPN_ST_v25> pid_6_mothersMaidenName;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="TS_PID_7_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("pid_7_dateTimeofBirth")
//	private TS_ST pid_7_dateTimeofBirth;
//	@Column(name="PID_8_v25")
//	@JsonProperty("pid_8_administrativeSex")
//	private String pid_8_administrativeSex;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_XPN_9_v25")
//	@JsonProperty("pid_9_patientAlias")
//	private List<XPN_ST_v25> pid_9_patientAlias;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_CE_10_v25")
//	@JsonProperty("pid_10_race")
//	private List<CE_ST> pid_10_race;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_XAD_11_v25")
//	@JsonProperty("pid_11_patientAddress")
//	private List<XAD_ST_v25> pid_11_patientAddress;
//	@Column(name="PID_12_v25")
//	@JsonProperty("pid_12_countyCode")
//	private String pid_12_countyCode;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_XTN_13_v25")
//	@JsonProperty("pid_13_phoneNumberHome")
//	private List<XTN_ST_v25> pid_13_phoneNumberHome;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_XTN_14_v25")
//	@JsonProperty("pid_14_phoneNumberBusiness")
//	private List<XTN_ST_v25> pid_14_phoneNumberBusiness;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_15_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_15_primaryLanguage")
//	private CE_ST pid_15_primaryLanguage;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_16_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_16_maritalStatus")
//	private CE_ST pid_16_maritalStatus;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_17_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_17_religion")
//	private CE_ST pid_17_religion;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CX_PID_18_v25", referencedColumnName = "CX_ID")
//	@JsonProperty("pid_18_patientAccountNumber")
//	private CX_ST_v25 pid_18_patientAccountNumber;
//	@Column(name="PID_19_v25")
//	@JsonProperty("pid_19_ssn")
//	private String pid_19_ssn;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="DLN_PID_20_v25", referencedColumnName = "DLN_ID")
//	@JsonProperty("pid_20_driversLicenseNumber")
//	private DLN_ST pid_20_driversLicenseNumber;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_CX_21_v25")
//	@JsonProperty("pid_21_mothersIdentifier")
//	private List<CX_ST_v25> pid_21_mothersIdentifier;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_CE_22_v25")
//	@JsonProperty("pid_22_ethnicGroup")
//	private List<CE_ST> pid_22_ethnicGroup;
//	@Column(name="PID_23_v25")
//	@JsonProperty("pid_23_birthPlace")
//	private String pid_23_birthPlace;
//	@Column(name="PID_24_v25")
//	@JsonProperty("pid_24_multipleBirthIndicator")
//	private String pid_24_multipleBirthIndicator;
//	@Column(name="PID_25_v25")
//	@JsonProperty("pid_25_birthOrder")
//	private String pid_25_birthOrder;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_CE_26_v25")
//	@JsonProperty("pid_26_citizenship")
//	private List<CE_ST> pid_26_citizenship;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_27_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_27_veteransMilitaryStatus")
//	private CE_ST pid_27_veteransMilitaryStatus;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_28_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_28_nationality")
//	private CE_ST pid_28_nationality;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="TS_PID_29_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("pid_29_patientDeathDateandTime")
//	private TS_ST pid_29_patientDeathDateandTime;
//	@Column(name="PID_30_v25")
//	@JsonProperty("pid_30_patientDeathIndicator")
//	private String pid_30_patientDeathIndicator;
//	@Column(name="PID_31_v25")
//	@JsonProperty("pid_31_identityUnknownIndicator")
//	private String pid_31_identityUnknownIndicator;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_ST_32_v25")
//	@JsonProperty("pid_32_identityReliabilityCode")
//	private List<ST> pid_32_identityReliabilityCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="TS_PID_33_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("pid_33_lastUpdateDateTime")
//	private TS_ST pid_33_lastUpdateDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="HD_PID_34_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("pid_34_lastUpdateFacility")
//	private HD_ST pid_34_lastUpdateFacility;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_35_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_35_speciesCode")
//	private CE_ST pid_35_speciesCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_36_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_36_breedCode")
//	private CE_ST pid_36_breedCode;
//	@Column(name="PID_37_v25")
//	@JsonProperty("pid_37_strain")
//	private String pid_37_strain;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="CE_PID_38_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("pid_38_productionClassCode")
//	private CE_ST pid_38_productionClassCode;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name ="PID_CWE_39_v25")
//	@JsonProperty("pid_39_tribalCitizenship")
//	private List<CWE_ST_v25> pid_39_tribalCitizenship;
//		
//	public PID_ST_v25() {
//		super();
//		this.pid_1_setID = "";
//		this.pid_2_patientID = new CX_ST_v25();
//		this.pid_3_patientIdentifierList = new ArrayList<>();
//		this.pid_4_alternatePatientID = new ArrayList<>();
//		this.pid_5_patientName = new ArrayList<>();
//		this.pid_6_mothersMaidenName = new ArrayList<>();
//		this.pid_7_dateTimeofBirth = new TS_ST();
//		this.pid_8_administrativeSex = "";
//		this.pid_9_patientAlias = new ArrayList<>();
//		this.pid_10_race = new ArrayList<>();
//		this.pid_11_patientAddress = new ArrayList<>();
//		this.pid_12_countyCode = "";
//		this.pid_13_phoneNumberHome = new ArrayList<>();
//		this.pid_14_phoneNumberBusiness = new ArrayList<>();
//		this.pid_15_primaryLanguage = new CE_ST();
//		this.pid_16_maritalStatus = new CE_ST();
//		this.pid_17_religion = new CE_ST();
//		this.pid_18_patientAccountNumber = new CX_ST_v25();
//		this.pid_19_ssn = "";
//		this.pid_20_driversLicenseNumber = new DLN_ST();
//		this.pid_21_mothersIdentifier = new ArrayList<>();
//		this.pid_22_ethnicGroup = new ArrayList<>();
//		this.pid_23_birthPlace = "";
//		this.pid_24_multipleBirthIndicator = "";
//		this.pid_25_birthOrder = "";
//		this.pid_26_citizenship = new ArrayList<>();
//		this.pid_27_veteransMilitaryStatus = new CE_ST();
//		this.pid_28_nationality = new CE_ST();
//		this.pid_29_patientDeathDateandTime = new TS_ST();
//		this.pid_30_patientDeathIndicator = "";
//		this.pid_31_identityUnknownIndicator = "";
//		this.pid_32_identityReliabilityCode = new ArrayList<>();
//		this.pid_33_lastUpdateDateTime = new TS_ST();
//		this.pid_34_lastUpdateFacility = new HD_ST();
//		this.pid_35_speciesCode = new CE_ST();
//		this.pid_36_breedCode = new CE_ST();
//		this.pid_37_strain = "";
//		this.pid_38_productionClassCode = new CE_ST();
//		this.pid_39_tribalCitizenship = new ArrayList<>();
//		
//	}
//	private PID_ST_v25(PIDBuilder builder) {
//		this.pid_1_setID = builder.pid_1_setID;
//		this.pid_2_patientID = builder.pid_2_patientID;
//		this.pid_3_patientIdentifierList = builder.pid_3_patientIdentifierList;
//		this.pid_4_alternatePatientID = builder.pid_4_alternatePatientID;
//		this.pid_5_patientName = builder.pid_5_patientName;
//		this.pid_6_mothersMaidenName = builder.pid_6_mothersMaidenName;
//		this.pid_7_dateTimeofBirth = builder.pid_7_dateTimeofBirth;
//		this.pid_8_administrativeSex = builder.pid_8_administrativeSex;
//		this.pid_9_patientAlias = builder.pid_9_patientAlias;
//		this.pid_10_race = builder.pid_10_race;
//		this.pid_11_patientAddress = builder.pid_11_patientAddress;
//		this.pid_12_countyCode = builder.pid_12_countyCode;
//		this.pid_13_phoneNumberHome = builder.pid_13_phoneNumberHome;
//		this.pid_14_phoneNumberBusiness = builder.pid_14_phoneNumberBusiness;
//		this.pid_15_primaryLanguage = builder.pid_15_primaryLanguage;
//		this.pid_16_maritalStatus = builder.pid_16_maritalStatus;
//		this.pid_17_religion = builder.pid_17_religion;
//		this.pid_18_patientAccountNumber = builder.pid_18_patientAccountNumber;
//		this.pid_19_ssn = builder.pid_19_ssn;
//		this.pid_20_driversLicenseNumber = builder.pid_20_driversLicenseNumber;
//		this.pid_21_mothersIdentifier = builder.pid_21_mothersIdentifier;
//		this.pid_22_ethnicGroup = builder.pid_22_ethnicGroup;
//		this.pid_23_birthPlace = builder.pid_23_birthPlace;
//		this.pid_24_multipleBirthIndicator = builder.pid_24_multipleBirthIndicator;
//		this.pid_25_birthOrder = builder.pid_25_birthOrder;
//		this.pid_26_citizenship = builder.pid_26_citizenship;
//		this.pid_27_veteransMilitaryStatus = builder.pid_27_veteransMilitaryStatus;
//		this.pid_28_nationality = builder.pid_28_nationality;
//		this.pid_29_patientDeathDateandTime = builder.pid_29_patientDeathDateandTime;
//		this.pid_30_patientDeathIndicator = builder.pid_30_patientDeathIndicator;
//		this.pid_31_identityUnknownIndicator = builder.pid_31_identityUnknownIndicator;
//		this.pid_32_identityReliabilityCode = builder.pid_32_identityReliabilityCode;
//		this.pid_33_lastUpdateDateTime = builder.pid_33_lastUpdateDateTime;
//		this.pid_34_lastUpdateFacility = builder.pid_34_lastUpdateFacility;
//		this.pid_35_speciesCode = builder.pid_35_speciesCode;
//		this.pid_36_breedCode = builder.pid_36_breedCode;
//		this.pid_37_strain = builder.pid_37_strain;
//		this.pid_38_productionClassCode = builder.pid_38_productionClassCode;
//		this.pid_39_tribalCitizenship = builder.pid_39_tribalCitizenship;
//	}
//	public static class PIDBuilder{
//		private String pid_1_setID;
//		private CX_ST_v25 pid_2_patientID;
//		private List<CX_ST_v25> pid_3_patientIdentifierList;
//		private List<CX_ST_v25> pid_4_alternatePatientID;
//		private List<XPN_ST_v25> pid_5_patientName;
//		private List<XPN_ST_v25> pid_6_mothersMaidenName;
//		private TS_ST pid_7_dateTimeofBirth;
//		private String pid_8_administrativeSex;
//		private List<XPN_ST_v25> pid_9_patientAlias;
//		private List<CE_ST> pid_10_race;
//		private List<XAD_ST_v25> pid_11_patientAddress;
//		private String pid_12_countyCode;
//		private List<XTN_ST_v25> pid_13_phoneNumberHome;
//		private List<XTN_ST_v25> pid_14_phoneNumberBusiness;
//		private CE_ST pid_15_primaryLanguage;
//		private CE_ST pid_16_maritalStatus;
//		private CE_ST pid_17_religion;
//		private CX_ST_v25 pid_18_patientAccountNumber;
//		private String pid_19_ssn;
//		private DLN_ST pid_20_driversLicenseNumber;
//		private List<CX_ST_v25> pid_21_mothersIdentifier;
//		private List<CE_ST> pid_22_ethnicGroup;
//		private String pid_23_birthPlace;
//		private String pid_24_multipleBirthIndicator;
//		private String pid_25_birthOrder;
//		private List<CE_ST> pid_26_citizenship;
//		private CE_ST pid_27_veteransMilitaryStatus;
//		private CE_ST pid_28_nationality;
//		private TS_ST pid_29_patientDeathDateandTime;
//		private String pid_30_patientDeathIndicator;
//		private String pid_31_identityUnknownIndicator;
//		private List<ST> pid_32_identityReliabilityCode;
//		private TS_ST pid_33_lastUpdateDateTime;
//		private HD_ST pid_34_lastUpdateFacility;
//		private CE_ST pid_35_speciesCode;
//		private CE_ST pid_36_breedCode;
//		private String pid_37_strain;
//		private CE_ST pid_38_productionClassCode;
//		private List<CWE_ST_v25> pid_39_tribalCitizenship;
//		public PIDBuilder(List<CX_ST_v25> pid_3_patientIdentifierList, List<XPN_ST_v25> pid_5_patientName, TS_ST pid_7_dateTimeofBirth, 
//				String pid_8_administrativeSex) {
//			super();
//			this.pid_1_setID = "";
//			this.pid_2_patientID = new CX_ST_v25();
//			this.pid_3_patientIdentifierList = pid_3_patientIdentifierList;
//			this.pid_4_alternatePatientID = new  ArrayList<>();
//			this.pid_5_patientName = pid_5_patientName;
//			this.pid_6_mothersMaidenName = new  ArrayList<>(); 
//			this.pid_7_dateTimeofBirth = pid_7_dateTimeofBirth;
//			this.pid_8_administrativeSex = pid_8_administrativeSex;
//			this.pid_9_patientAlias = new  ArrayList<>();
//			this.pid_10_race = new  ArrayList<>();
//			this.pid_11_patientAddress = new  ArrayList<>();
//			this.pid_12_countyCode = "";
//			this.pid_13_phoneNumberHome = new  ArrayList<>();
//			this.pid_14_phoneNumberBusiness = new  ArrayList<>();
//			this.pid_15_primaryLanguage = new CE_ST();
//			this.pid_16_maritalStatus = new CE_ST();
//			this.pid_17_religion = new CE_ST();
//			this.pid_18_patientAccountNumber = new CX_ST_v25();
//			this.pid_19_ssn = "";
//			this.pid_20_driversLicenseNumber = new DLN_ST();
//			this.pid_21_mothersIdentifier = new ArrayList<>();
//			this.pid_22_ethnicGroup = new ArrayList<>();
//			this.pid_23_birthPlace = "";
//			this.pid_24_multipleBirthIndicator = "";
//			this.pid_25_birthOrder = "";
//			this.pid_26_citizenship = new  ArrayList<>();
//			this.pid_27_veteransMilitaryStatus = new CE_ST();
//			this.pid_28_nationality = new CE_ST();
//			this.pid_29_patientDeathDateandTime = new TS_ST();
//			this.pid_30_patientDeathIndicator = "";
//			this.pid_31_identityUnknownIndicator = "";
//			this.pid_32_identityReliabilityCode =new  ArrayList<>();
//			this.pid_33_lastUpdateDateTime = new TS_ST();
//			this.pid_34_lastUpdateFacility = new HD_ST();
//			this.pid_35_speciesCode = new CE_ST();
//			this.pid_36_breedCode = new CE_ST();
//			this.pid_37_strain = "";
//			this.pid_38_productionClassCode = new CE_ST();
//			this.pid_39_tribalCitizenship = new  ArrayList<>();
//		}
//		public PIDBuilder pid_1_setID(String pid_1_setID) {
//			this.pid_1_setID = pid_1_setID;
//			return this;
//		}
//		public PIDBuilder pid_2_patientID(CX_ST_v25 pid_2_patientID) {
//			this.pid_2_patientID = pid_2_patientID;
//			return this;
//		}
//		public PIDBuilder pid_4_alternatePatientID(List<CX_ST_v25> pid_4_alternatePatientID) {
//			this.pid_4_alternatePatientID = pid_4_alternatePatientID;
//			return this;
//		}
//		public PIDBuilder pid_6_mothersMaidenName(List<XPN_ST_v25> pid_6_mothersMaidenName) {
//			this.pid_6_mothersMaidenName = pid_6_mothersMaidenName;
//			return this;
//		}
//		public PIDBuilder pid_9_patientAlias(List<XPN_ST_v25> pid_9_patientAlias) {
//			this.pid_9_patientAlias = pid_9_patientAlias;
//			return this;
//		}
//		public PIDBuilder pid_10_race(List<CE_ST> pid_10_race) {
//			this.pid_10_race = pid_10_race;
//			return this;
//		}
//		public PIDBuilder pid_11_patientAddress(List<XAD_ST_v25> pid_11_patientAddress) {
//			this.pid_11_patientAddress = pid_11_patientAddress;
//			return this;
//		}
//		public PIDBuilder pid_12_countyCode(String pid_12_countyCode) {
//			this.pid_12_countyCode = pid_12_countyCode;
//			return this;
//		}
//		public PIDBuilder pid_13_phoneNumberHome(List<XTN_ST_v25> pid_13_phoneNumberHome) {
//			this.pid_13_phoneNumberHome = pid_13_phoneNumberHome;
//			return this;
//		}
//		public PIDBuilder pid_14_phoneNumberBusiness(List<XTN_ST_v25> pid_14_phoneNumberBusiness) {
//			this.pid_14_phoneNumberBusiness = pid_14_phoneNumberBusiness;
//			return this;
//		}
//		public PIDBuilder pid_15_primaryLanguage(CE_ST pid_15_primaryLanguage) {
//			this.pid_15_primaryLanguage = pid_15_primaryLanguage;
//			return this;
//		}
//		public PIDBuilder pid_16_maritalStatus(CE_ST pid_16_maritalStatus) {
//			this.pid_16_maritalStatus = pid_16_maritalStatus;
//			return this;
//		}
//		public PIDBuilder pid_17_religion(CE_ST pid_17_religion) {
//			this.pid_17_religion = pid_17_religion;
//			return this;
//		}
//		public PIDBuilder pid_18_patientAccountNumber(CX_ST_v25 pid_18_patientAccountNumber) {
//			this.pid_18_patientAccountNumber = pid_18_patientAccountNumber;
//			return this;
//		}
//		public PIDBuilder pid_19_ssn(String pid_19_ssn) {
//			this.pid_19_ssn = pid_19_ssn;
//			return this;
//		}
//		public PIDBuilder pid_20_driversLicenseNumber(DLN_ST pid_20_driversLicenseNumber) {
//			this.pid_20_driversLicenseNumber = pid_20_driversLicenseNumber;
//			return this;
//		}
//		public PIDBuilder pid_21_mothersIdentifier(List<CX_ST_v25> pid_21_mothersIdentifier) {
//			this.pid_21_mothersIdentifier = pid_21_mothersIdentifier;
//			return this;
//		}
//		public PIDBuilder pid_22_ethnicGroup(List<CE_ST> pid_22_ethnicGroup) {
//			this.pid_22_ethnicGroup = pid_22_ethnicGroup;
//			return this;
//		}
//		public PIDBuilder pid_23_birthPlace(String pid_23_birthPlace) {
//			this.pid_23_birthPlace = pid_23_birthPlace;
//			return this;
//		}
//		public PIDBuilder pid_24_multipleBirthIndicator(String pid_24_multipleBirthIndicator) {
//			this.pid_24_multipleBirthIndicator = pid_24_multipleBirthIndicator;
//			return this;
//		}
//		public PIDBuilder pid_25_birthOrder(String pid_25_birthOrder) {
//			this.pid_25_birthOrder = pid_25_birthOrder;
//			return this;
//		}
//		public PIDBuilder pid_26_citizenship(List<CE_ST> pid_26_citizenship) {
//			this.pid_26_citizenship = pid_26_citizenship;
//			return this;
//		}
//		public PIDBuilder pid_27_veteransMilitaryStatus(CE_ST pid_27_veteransMilitaryStatus) {
//			this.pid_27_veteransMilitaryStatus = pid_27_veteransMilitaryStatus;
//			return this;
//		}
//		public PIDBuilder pid_28_nationality(CE_ST pid_28_nationality) {
//			this.pid_28_nationality = pid_28_nationality;
//			return this;
//		}
//		public PIDBuilder pid_29_patientDeathDateandTime(TS_ST pid_29_patientDeathDateandTime) {
//			this.pid_29_patientDeathDateandTime = pid_29_patientDeathDateandTime;
//			return this;
//		}
//		public PIDBuilder pid_30_patientDeathIndicator(String pid_30_patientDeathIndicator) {
//			this.pid_30_patientDeathIndicator = pid_30_patientDeathIndicator;
//			return this;
//		}
//		public PIDBuilder pid_31_identityUnknownIndicator(String pid_31_identityUnknownIndicator) {
//			this.pid_31_identityUnknownIndicator = pid_31_identityUnknownIndicator;
//			return this;
//		}
//		public PIDBuilder pid_32_identityReliabilityCode(List<ST> pid_32_identityReliabilityCode) {
//			this.pid_32_identityReliabilityCode = pid_32_identityReliabilityCode;
//			return this;
//		}
//		public PIDBuilder pid_33_lastUpdateDateTime(TS_ST pid_33_lastUpdateDateTime) {
//			this.pid_33_lastUpdateDateTime = pid_33_lastUpdateDateTime;
//			return this;
//		}
//		public PIDBuilder pid_34_lastUpdateFacility(HD_ST pid_34_lastUpdateFacility) {
//			this.pid_34_lastUpdateFacility = pid_34_lastUpdateFacility;
//			return this;
//		}
//		public PIDBuilder pid_35_speciesCode(CE_ST pid_35_speciesCode) {
//			this.pid_35_speciesCode = pid_35_speciesCode;
//			return this;
//		}
//		public PIDBuilder pid_36_breedCode(CE_ST pid_36_breedCode) {
//			this.pid_36_breedCode = pid_36_breedCode;
//			return this;
//		}
//		public PIDBuilder pid_37_strain(String pid_37_strain) {
//			this.pid_37_strain = pid_37_strain;
//			return this;
//		}
//		public PIDBuilder pid_38_productionClassCode(CE_ST pid_38_productionClassCode) {
//			this.pid_38_productionClassCode = pid_38_productionClassCode;
//			return this;
//		}
//		public PIDBuilder pid_39_tribalCitizenship(List<CWE_ST_v25> pid_39_tribalCitizenship) {
//			this.pid_39_tribalCitizenship = pid_39_tribalCitizenship;
//			return this;
//		}
//		public PID_ST_v25 build() {
//			return new PID_ST_v25(this);
//		}
//	}
//	public String getPid_1_setID() {
//		return pid_1_setID;
//	}
//	public CX_ST_v25 getPid_2_patientID() {
//		return pid_2_patientID;
//	}
//	public List<CX_ST_v25> getPid_3_patientIdentifierList() {
//		return pid_3_patientIdentifierList;
//	}
//	public List<CX_ST_v25> getPid_4_alternatePatientID() {
//		return pid_4_alternatePatientID;
//	}
//	public List<XPN_ST_v25> getPid_5_patientName() {
//		return pid_5_patientName;
//	}
//	public List<XPN_ST_v25> getPid_6_mothersMaidenName() {
//		return pid_6_mothersMaidenName;
//	}
//	public TS_ST getPid_7_dateTimeofBirth() {
//		return pid_7_dateTimeofBirth;
//	}
//	public String getPid_8_administrativeSex() {
//		return pid_8_administrativeSex;
//	}
//	public List<XPN_ST_v25> getPid_9_patientAlias() {
//		return pid_9_patientAlias;
//	}
//	public List<CE_ST> getPid_10_race() {
//		return pid_10_race;
//	}
//	public List<XAD_ST_v25> getPid_11_patientAddress() {
//		return pid_11_patientAddress;
//	}
//	public String getPid_12_countyCode() {
//		return pid_12_countyCode;
//	}
//	public List<XTN_ST_v25> getPid_13_phoneNumberHome() {
//		return pid_13_phoneNumberHome;
//	}
//	public List<XTN_ST_v25> getPid_14_phoneNumberBusiness() {
//		return pid_14_phoneNumberBusiness;
//	}
//	public CE_ST getPid_15_primaryLanguage() {
//		return pid_15_primaryLanguage;
//	}
//	public CE_ST getPid_16_maritalStatus() {
//		return pid_16_maritalStatus;
//	}
//	public CE_ST getPid_17_religion() {
//		return pid_17_religion;
//	}
//	public CX_ST_v25 getPid_18_patientAccountNumber() {
//		return pid_18_patientAccountNumber;
//	}
//	public String getPid_19_ssn() {
//		return pid_19_ssn;
//	}
//	public DLN_ST getPid_20_driversLicenseNumber() {
//		return pid_20_driversLicenseNumber;
//	}
//	public List<CX_ST_v25> getPid_21_mothersIdentifier() {
//		return pid_21_mothersIdentifier;
//	}
//	public List<CE_ST> getPid_22_ethnicGroup() {
//		return pid_22_ethnicGroup;
//	}
//	public String getPid_23_birthPlace() {
//		return pid_23_birthPlace;
//	}
//	public String getPid_24_multipleBirthIndicator() {
//		return pid_24_multipleBirthIndicator;
//	}
//	public String getPid_25_birthOrder() {
//		return pid_25_birthOrder;
//	}
//	public List<CE_ST> getPid_26_citizenship() {
//		return pid_26_citizenship;
//	}
//	public CE_ST getPid_27_veteransMilitaryStatus() {
//		return pid_27_veteransMilitaryStatus;
//	}
//	public CE_ST getPid_28_nationality() {
//		return pid_28_nationality;
//	}
//	public TS_ST getPid_29_patientDeathDateandTime() {
//		return pid_29_patientDeathDateandTime;
//	}
//	public String getPid_30_patientDeathIndicator() {
//		return pid_30_patientDeathIndicator;
//	}
//	public String getPid_31_identityUnknownIndicator() {
//		return pid_31_identityUnknownIndicator;
//	}
//	public List<ST> getPid_32_identityReliabilityCode() {
//		return pid_32_identityReliabilityCode;
//	}
//	public TS_ST getPid_33_lastUpdateDateTime() {
//		return pid_33_lastUpdateDateTime;
//	}
//	public HD_ST getPid_34_lastUpdateFacility() {
//		return pid_34_lastUpdateFacility;
//	}
//	public CE_ST getPid_35_speciesCode() {
//		return pid_35_speciesCode;
//	}
//	public CE_ST getPid_36_breedCode() {
//		return pid_36_breedCode;
//	}
//	public String getPid_37_strain() {
//		return pid_37_strain;
//	}
//	public CE_ST getPid_38_productionClassCode() {
//		return pid_38_productionClassCode;
//	}
//	public List<CWE_ST_v25> getPid_39_tribalCitizenship() {
//		return pid_39_tribalCitizenship;
//	}
//	@Override
//	public String toString() {
//		return "PID_ST_v25 [id=" + id + ", pid_1_setID=" + pid_1_setID + ", pid_2_patientID=" + pid_2_patientID
//				+ ", pid_3_patientIdentifierList=" + pid_3_patientIdentifierList + ", pid_4_alternatePatientID="
//				+ pid_4_alternatePatientID + ", pid_5_patientName=" + pid_5_patientName + ", pid_6_mothersMaidenName="
//				+ pid_6_mothersMaidenName + ", pid_7_dateTimeofBirth=" + pid_7_dateTimeofBirth
//				+ ", pid_8_administrativeSex=" + pid_8_administrativeSex + ", pid_9_patientAlias=" + pid_9_patientAlias
//				+ ", pid_10_race=" + pid_10_race + ", pid_11_patientAddress=" + pid_11_patientAddress
//				+ ", pid_12_countyCode=" + pid_12_countyCode + ", pid_13_phoneNumberHome=" + pid_13_phoneNumberHome
//				+ ", pid_14_phoneNumberBusiness=" + pid_14_phoneNumberBusiness + ", pid_15_primaryLanguage="
//				+ pid_15_primaryLanguage + ", pid_16_maritalStatus=" + pid_16_maritalStatus + ", pid_17_religion="
//				+ pid_17_religion + ", pid_18_patientAccountNumber=" + pid_18_patientAccountNumber + ", pid_19_ssn="
//				+ pid_19_ssn + ", pid_20_driversLicenseNumber=" + pid_20_driversLicenseNumber
//				+ ", pid_21_mothersIdentifier=" + pid_21_mothersIdentifier + ", pid_22_ethnicGroup="
//				+ pid_22_ethnicGroup + ", pid_23_birthPlace=" + pid_23_birthPlace + ", pid_24_multipleBirthIndicator="
//				+ pid_24_multipleBirthIndicator + ", pid_25_birthOrder=" + pid_25_birthOrder + ", pid_26_citizenship="
//				+ pid_26_citizenship + ", pid_27_veteransMilitaryStatus=" + pid_27_veteransMilitaryStatus
//				+ ", pid_28_nationality=" + pid_28_nationality + ", pid_29_patientDeathDateandTime="
//				+ pid_29_patientDeathDateandTime + ", pid_30_patientDeathIndicator=" + pid_30_patientDeathIndicator
//				+ ", pid_31_identityUnknownIndicator=" + pid_31_identityUnknownIndicator
//				+ ", pid_32_identityReliabilityCode=" + pid_32_identityReliabilityCode + ", pid_33_lastUpdateDateTime="
//				+ pid_33_lastUpdateDateTime + ", pid_34_lastUpdateFacility=" + pid_34_lastUpdateFacility
//				+ ", pid_35_speciesCode=" + pid_35_speciesCode + ", pid_36_breedCode=" + pid_36_breedCode
//				+ ", pid_37_strain=" + pid_37_strain + ", pid_38_productionClassCode=" + pid_38_productionClassCode
//				+ ", pid_39_tribalCitizenship=" + pid_39_tribalCitizenship + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, pid_10_race, pid_11_patientAddress, pid_12_countyCode, pid_13_phoneNumberHome,
//				pid_14_phoneNumberBusiness, pid_15_primaryLanguage, pid_16_maritalStatus, pid_17_religion,
//				pid_18_patientAccountNumber, pid_19_ssn, pid_1_setID, pid_20_driversLicenseNumber,
//				pid_21_mothersIdentifier, pid_22_ethnicGroup, pid_23_birthPlace, pid_24_multipleBirthIndicator,
//				pid_25_birthOrder, pid_26_citizenship, pid_27_veteransMilitaryStatus, pid_28_nationality,
//				pid_29_patientDeathDateandTime, pid_2_patientID, pid_30_patientDeathIndicator,
//				pid_31_identityUnknownIndicator, pid_32_identityReliabilityCode, pid_33_lastUpdateDateTime,
//				pid_34_lastUpdateFacility, pid_35_speciesCode, pid_36_breedCode, pid_37_strain,
//				pid_38_productionClassCode, pid_39_tribalCitizenship, pid_3_patientIdentifierList,
//				pid_4_alternatePatientID, pid_5_patientName, pid_6_mothersMaidenName, pid_7_dateTimeofBirth,
//				pid_8_administrativeSex, pid_9_patientAlias);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		PID_ST_v25 other = (PID_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(pid_10_race, other.pid_10_race)
//				&& Objects.equals(pid_11_patientAddress, other.pid_11_patientAddress)
//				&& Objects.equals(pid_12_countyCode, other.pid_12_countyCode)
//				&& Objects.equals(pid_13_phoneNumberHome, other.pid_13_phoneNumberHome)
//				&& Objects.equals(pid_14_phoneNumberBusiness, other.pid_14_phoneNumberBusiness)
//				&& Objects.equals(pid_15_primaryLanguage, other.pid_15_primaryLanguage)
//				&& Objects.equals(pid_16_maritalStatus, other.pid_16_maritalStatus)
//				&& Objects.equals(pid_17_religion, other.pid_17_religion)
//				&& Objects.equals(pid_18_patientAccountNumber, other.pid_18_patientAccountNumber)
//				&& Objects.equals(pid_19_ssn, other.pid_19_ssn) && Objects.equals(pid_1_setID, other.pid_1_setID)
//				&& Objects.equals(pid_20_driversLicenseNumber, other.pid_20_driversLicenseNumber)
//				&& Objects.equals(pid_21_mothersIdentifier, other.pid_21_mothersIdentifier)
//				&& Objects.equals(pid_22_ethnicGroup, other.pid_22_ethnicGroup)
//				&& Objects.equals(pid_23_birthPlace, other.pid_23_birthPlace)
//				&& Objects.equals(pid_24_multipleBirthIndicator, other.pid_24_multipleBirthIndicator)
//				&& Objects.equals(pid_25_birthOrder, other.pid_25_birthOrder)
//				&& Objects.equals(pid_26_citizenship, other.pid_26_citizenship)
//				&& Objects.equals(pid_27_veteransMilitaryStatus, other.pid_27_veteransMilitaryStatus)
//				&& Objects.equals(pid_28_nationality, other.pid_28_nationality)
//				&& Objects.equals(pid_29_patientDeathDateandTime, other.pid_29_patientDeathDateandTime)
//				&& Objects.equals(pid_2_patientID, other.pid_2_patientID)
//				&& Objects.equals(pid_30_patientDeathIndicator, other.pid_30_patientDeathIndicator)
//				&& Objects.equals(pid_31_identityUnknownIndicator, other.pid_31_identityUnknownIndicator)
//				&& Objects.equals(pid_32_identityReliabilityCode, other.pid_32_identityReliabilityCode)
//				&& Objects.equals(pid_33_lastUpdateDateTime, other.pid_33_lastUpdateDateTime)
//				&& Objects.equals(pid_34_lastUpdateFacility, other.pid_34_lastUpdateFacility)
//				&& Objects.equals(pid_35_speciesCode, other.pid_35_speciesCode)
//				&& Objects.equals(pid_36_breedCode, other.pid_36_breedCode)
//				&& Objects.equals(pid_37_strain, other.pid_37_strain)
//				&& Objects.equals(pid_38_productionClassCode, other.pid_38_productionClassCode)
//				&& Objects.equals(pid_39_tribalCitizenship, other.pid_39_tribalCitizenship)
//				&& Objects.equals(pid_3_patientIdentifierList, other.pid_3_patientIdentifierList)
//				&& Objects.equals(pid_4_alternatePatientID, other.pid_4_alternatePatientID)
//				&& Objects.equals(pid_5_patientName, other.pid_5_patientName)
//				&& Objects.equals(pid_6_mothersMaidenName, other.pid_6_mothersMaidenName)
//				&& Objects.equals(pid_7_dateTimeofBirth, other.pid_7_dateTimeofBirth)
//				&& Objects.equals(pid_8_administrativeSex, other.pid_8_administrativeSex)
//				&& Objects.equals(pid_9_patientAlias, other.pid_9_patientAlias);
//	}
//
//}
