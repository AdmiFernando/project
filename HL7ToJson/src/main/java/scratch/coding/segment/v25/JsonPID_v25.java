package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.DLN_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPID_v25 {
	
		
	@JsonProperty("pid_1_setID")
	private String pid_1_setID;
	@JsonProperty("pid_2_patientID")
	private CX_v25 pid_2_patientID;
	@JsonProperty("pid_3_patientIdentifierList")
	private CX_v25[] pid_3_patientIdentifierList;
	@JsonProperty("pid_4_alternatePatientID")
	private CX_v25[] pid_4_alternatePatientID;
	@JsonProperty("pid_5_patientName")
	private XPN_v25 pid_5_patientName;
	@JsonProperty("pid_6_mothersMaidenName")
	private XPN_v25[] pid_6_mothersMaidenName;
	@JsonProperty("pid_7_dateTimeofBirth")
	private TS_v2 pid_7_dateTimeofBirth;
	@JsonProperty("pid_8_administrativeSex")
	private String pid_8_administrativeSex;
	@JsonProperty("pid_9_patientAlias")
	private XPN_v25[] pid_9_patientAlias;
	@JsonProperty("pid_10_race")
	private CE_v2[] pid_10_race;
	@JsonProperty("pid_11_patientAddress")
	private XAD_v25[] pid_11_patientAddress;
	@JsonProperty("pid_12_countyCode")
	private String pid_12_countyCode;
	@JsonProperty("pid_13_phoneNumberHome")
	private XTN_v25[] pid_13_phoneNumberHome;
	@JsonProperty("pid_14_phoneNumberBusiness")
	private XTN_v25[] pid_14_phoneNumberBusiness;
	@JsonProperty("pid_15_primaryLanguage")
	private CE_v2 pid_15_primaryLanguage;
	@JsonProperty("pid_16_maritalStatus")
	private CE_v2 pid_16_maritalStatus;
	@JsonProperty("pid_17_religion")
	private CE_v2 pid_17_religion;
	@JsonProperty("pid_18_patientAccountNumber")
	private CX_v25 pid_18_patientAccountNumber;
	@JsonProperty("pid_19_ssn")
	private String pid_19_ssn;
	@JsonProperty("pid_20_driversLicenseNumber")
	private DLN_v25 pid_20_driversLicenseNumber;
	@JsonProperty("pid_21_mothersIdentifier")
	private CX_v25 pid_21_mothersIdentifier;
	@JsonProperty("pid_22_ethnicGroup")
	private CE_v2 pid_22_ethnicGroup;
	@JsonProperty("pid_23_birthPlace")
	private String pid_23_birthPlace;
	@JsonProperty("pid_24_multipleBirthIndicator")
	private String pid_24_multipleBirthIndicator;
	@JsonProperty("pid_25_birthOrder")
	private String pid_25_birthOrder;
	@JsonProperty("pid_26_citizenship")
	private CE_v2[] pid_26_citizenship;
	@JsonProperty("pid_27_veteransMilitaryStatus")
	private CE_v2 pid_27_veteransMilitaryStatus;
	@JsonProperty("pid_28_nationality")
	private CE_v2 pid_28_nationality;
	@JsonProperty("pid_29_patientDeathDateandTime")
	private TS_v2 pid_29_patientDeathDateandTime;
	@JsonProperty("pid_30_patientDeathIndicator")
	private String pid_30_patientDeathIndicator;
	@JsonProperty("pid_31_identityUnknownIndicator")
	private String pid_31_identityUnknownIndicator;
	@JsonProperty("pid_32_identityReliabilityCode")
	private String[] pid_32_identityReliabilityCode;
	@JsonProperty("pid_33_lastUpdateDateTime")
	private TS_v2 pid_33_lastUpdateDateTime;
	@JsonProperty("pid_34_lastUpdateFacility")
	private HD_v2 pid_34_lastUpdateFacility;
	@JsonProperty("pid_35_speciesCode")
	private CE_v2 pid_35_speciesCode;
	@JsonProperty("pid_36_breedCode")
	private CE_v2 pid_36_breedCode;
	@JsonProperty("pid_37_strain")
	private String pid_37_strain;
	@JsonProperty("pid_38_productionClassCode")
	private CE_v2 pid_38_productionClassCode;
	@JsonProperty("pid_39_tribalCitizenship")
	private CWE_v25[] pid_39_tribalCitizenship;
	public JsonPID_v25() {
		super();
		this.pid_1_setID = "";
		this.pid_2_patientID = new CX_v25();
		this.pid_3_patientIdentifierList = new CX_v25[] {};
		this.pid_4_alternatePatientID = new CX_v25[] {};
		this.pid_5_patientName = new XPN_v25();
		this.pid_6_mothersMaidenName = new XPN_v25[] {};
		this.pid_7_dateTimeofBirth = new TS_v2();
		this.pid_8_administrativeSex = "";
		this.pid_9_patientAlias = new XPN_v25[] {};
		this.pid_10_race = new CE_v2[] {};
		this.pid_11_patientAddress = new XAD_v25[] {};
		this.pid_12_countyCode = "";
		this.pid_13_phoneNumberHome = new XTN_v25[] {};
		this.pid_14_phoneNumberBusiness = new XTN_v25[] {};
		this.pid_15_primaryLanguage = new CE_v2();
		this.pid_16_maritalStatus = new CE_v2();
		this.pid_17_religion = new CE_v2();
		this.pid_18_patientAccountNumber = new CX_v25();
		this.pid_19_ssn = "";
		this.pid_20_driversLicenseNumber = new DLN_v25();
		this.pid_21_mothersIdentifier = new CX_v25();
		this.pid_22_ethnicGroup = new CE_v2();
		this.pid_23_birthPlace = "";
		this.pid_24_multipleBirthIndicator = "";
		this.pid_25_birthOrder = "";
		this.pid_26_citizenship = new CE_v2[] {};
		this.pid_27_veteransMilitaryStatus = new CE_v2();
		this.pid_28_nationality = new CE_v2();
		this.pid_29_patientDeathDateandTime = new TS_v2();
		this.pid_30_patientDeathIndicator = "";
		this.pid_31_identityUnknownIndicator = "";
		this.pid_32_identityReliabilityCode = new String[] {};
		this.pid_33_lastUpdateDateTime = new TS_v2();
		this.pid_34_lastUpdateFacility = new HD_v2();
		this.pid_35_speciesCode = new CE_v2();
		this.pid_36_breedCode = new CE_v2();
		this.pid_37_strain = "";
		this.pid_38_productionClassCode = new CE_v2();
		this.pid_39_tribalCitizenship = new CWE_v25[] {};
		
	}
	private JsonPID_v25(PIDBuilder builder) {
		this.pid_1_setID = builder.pid_1_setID;
		this.pid_2_patientID = builder.pid_2_patientID;
		this.pid_3_patientIdentifierList = builder.pid_3_patientIdentifierList;
		this.pid_4_alternatePatientID = builder.pid_4_alternatePatientID;
		this.pid_5_patientName = builder.pid_5_patientName;
		this.pid_6_mothersMaidenName = builder.pid_6_mothersMaidenName;
		this.pid_7_dateTimeofBirth = builder.pid_7_dateTimeofBirth;
		this.pid_8_administrativeSex = builder.pid_8_administrativeSex;
		this.pid_9_patientAlias = builder.pid_9_patientAlias;
		this.pid_10_race = builder.pid_10_race;
		this.pid_11_patientAddress = builder.pid_11_patientAddress;
		this.pid_12_countyCode = builder.pid_12_countyCode;
		this.pid_13_phoneNumberHome = builder.pid_13_phoneNumberHome;
		this.pid_14_phoneNumberBusiness = builder.pid_14_phoneNumberBusiness;
		this.pid_15_primaryLanguage = builder.pid_15_primaryLanguage;
		this.pid_16_maritalStatus = builder.pid_16_maritalStatus;
		this.pid_17_religion = builder.pid_17_religion;
		this.pid_18_patientAccountNumber = builder.pid_18_patientAccountNumber;
		this.pid_19_ssn = builder.pid_19_ssn;
		this.pid_20_driversLicenseNumber = builder.pid_20_driversLicenseNumber;
		this.pid_21_mothersIdentifier = builder.pid_21_mothersIdentifier;
		this.pid_22_ethnicGroup = builder.pid_22_ethnicGroup;
		this.pid_23_birthPlace = builder.pid_23_birthPlace;
		this.pid_24_multipleBirthIndicator = builder.pid_24_multipleBirthIndicator;
		this.pid_25_birthOrder = builder.pid_25_birthOrder;
		this.pid_26_citizenship = builder.pid_26_citizenship;
		this.pid_27_veteransMilitaryStatus = builder.pid_27_veteransMilitaryStatus;
		this.pid_28_nationality = builder.pid_28_nationality;
		this.pid_29_patientDeathDateandTime = builder.pid_29_patientDeathDateandTime;
		this.pid_30_patientDeathIndicator = builder.pid_30_patientDeathIndicator;
		this.pid_31_identityUnknownIndicator = builder.pid_31_identityUnknownIndicator;
		this.pid_32_identityReliabilityCode = builder.pid_32_identityReliabilityCode;
		this.pid_33_lastUpdateDateTime = builder.pid_33_lastUpdateDateTime;
		this.pid_34_lastUpdateFacility = builder.pid_34_lastUpdateFacility;
		this.pid_35_speciesCode = builder.pid_35_speciesCode;
		this.pid_36_breedCode = builder.pid_36_breedCode;
		this.pid_37_strain = builder.pid_37_strain;
		this.pid_38_productionClassCode = builder.pid_38_productionClassCode;
		this.pid_39_tribalCitizenship = builder.pid_39_tribalCitizenship;
	}
	public static class PIDBuilder{
		private String pid_1_setID;
		private CX_v25 pid_2_patientID;
		private CX_v25[] pid_3_patientIdentifierList;
		private CX_v25[] pid_4_alternatePatientID;
		private XPN_v25 pid_5_patientName;
		private XPN_v25[] pid_6_mothersMaidenName;
		private TS_v2 pid_7_dateTimeofBirth;
		private String pid_8_administrativeSex;
		private XPN_v25[] pid_9_patientAlias;
		private CE_v2[] pid_10_race;
		private XAD_v25[] pid_11_patientAddress;
		private String pid_12_countyCode;
		private XTN_v25[] pid_13_phoneNumberHome;
		private XTN_v25[] pid_14_phoneNumberBusiness;
		private CE_v2 pid_15_primaryLanguage;
		private CE_v2 pid_16_maritalStatus;
		private CE_v2 pid_17_religion;
		private CX_v25 pid_18_patientAccountNumber;
		private String pid_19_ssn;
		private DLN_v25 pid_20_driversLicenseNumber;
		private CX_v25 pid_21_mothersIdentifier;
		private CE_v2 pid_22_ethnicGroup;
		private String pid_23_birthPlace;
		private String pid_24_multipleBirthIndicator;
		private String pid_25_birthOrder;
		private CE_v2[] pid_26_citizenship;
		private CE_v2 pid_27_veteransMilitaryStatus;
		private CE_v2 pid_28_nationality;
		private TS_v2 pid_29_patientDeathDateandTime;
		private String pid_30_patientDeathIndicator;
		private String pid_31_identityUnknownIndicator;
		private String[] pid_32_identityReliabilityCode;
		private TS_v2 pid_33_lastUpdateDateTime;
		private HD_v2 pid_34_lastUpdateFacility;
		private CE_v2 pid_35_speciesCode;
		private CE_v2 pid_36_breedCode;
		private String pid_37_strain;
		private CE_v2 pid_38_productionClassCode;
		private CWE_v25[] pid_39_tribalCitizenship;
		public PIDBuilder(CX_v25[] pid_3_patientIdentifierList, XPN_v25 pid_5_patientName, TS_v2 pid_7_dateTimeofBirth, 
				String pid_8_administrativeSex) {
			super();
			this.pid_1_setID = "";
			this.pid_2_patientID = new CX_v25();
			this.pid_3_patientIdentifierList = pid_3_patientIdentifierList;
			this.pid_4_alternatePatientID = new CX_v25[] {};
			this.pid_5_patientName = pid_5_patientName;
			this.pid_6_mothersMaidenName = new XPN_v25[] {};
			this.pid_7_dateTimeofBirth = pid_7_dateTimeofBirth;
			this.pid_8_administrativeSex = pid_8_administrativeSex;
			this.pid_9_patientAlias = new XPN_v25[] {};
			this.pid_10_race = new CE_v2[] {};
			this.pid_11_patientAddress = new XAD_v25[] {};
			this.pid_12_countyCode = "";
			this.pid_13_phoneNumberHome = new XTN_v25[] {};
			this.pid_14_phoneNumberBusiness = new XTN_v25[] {};
			this.pid_15_primaryLanguage = new CE_v2();
			this.pid_16_maritalStatus = new CE_v2();
			this.pid_17_religion = new CE_v2();
			this.pid_18_patientAccountNumber = new CX_v25();
			this.pid_19_ssn = "";
			this.pid_20_driversLicenseNumber = new DLN_v25();
			this.pid_21_mothersIdentifier = new CX_v25();
			this.pid_22_ethnicGroup = new CE_v2();
			this.pid_23_birthPlace = "";
			this.pid_24_multipleBirthIndicator = "";
			this.pid_25_birthOrder = "";
			this.pid_26_citizenship = new CE_v2[] {};
			this.pid_27_veteransMilitaryStatus = new CE_v2();
			this.pid_28_nationality = new CE_v2();
			this.pid_29_patientDeathDateandTime = new TS_v2();
			this.pid_30_patientDeathIndicator = "";
			this.pid_31_identityUnknownIndicator = "";
			this.pid_32_identityReliabilityCode = new String[] {};
			this.pid_33_lastUpdateDateTime = new TS_v2();
			this.pid_34_lastUpdateFacility = new HD_v2();
			this.pid_35_speciesCode = new CE_v2();
			this.pid_36_breedCode = new CE_v2();
			this.pid_37_strain = "";
			this.pid_38_productionClassCode = new CE_v2();
			this.pid_39_tribalCitizenship = new CWE_v25[] {};
		}
		public PIDBuilder pid_1_setID(String pid_1_setID) {
			this.pid_1_setID = pid_1_setID;
			return this;
		}
		public PIDBuilder pid_2_patientID(CX_v25 pid_2_patientID) {
			this.pid_2_patientID = pid_2_patientID;
			return this;
		}
		public PIDBuilder pid_4_alternatePatientID(CX_v25[] pid_4_alternatePatientID) {
			this.pid_4_alternatePatientID = pid_4_alternatePatientID;
			return this;
		}
		public PIDBuilder pid_6_mothersMaidenName(XPN_v25[] pid_6_mothersMaidenName) {
			this.pid_6_mothersMaidenName = pid_6_mothersMaidenName;
			return this;
		}
		public PIDBuilder pid_9_patientAlias(XPN_v25[] pid_9_patientAlias) {
			this.pid_9_patientAlias = pid_9_patientAlias;
			return this;
		}
		public PIDBuilder pid_10_race(CE_v2[] pid_10_race) {
			this.pid_10_race = pid_10_race;
			return this;
		}
		public PIDBuilder pid_11_patientAddress(XAD_v25[] pid_11_patientAddress) {
			this.pid_11_patientAddress = pid_11_patientAddress;
			return this;
		}
		public PIDBuilder pid_12_countyCode(String pid_12_countyCode) {
			this.pid_12_countyCode = pid_12_countyCode;
			return this;
		}
		public PIDBuilder pid_13_phoneNumberHome(XTN_v25[] pid_13_phoneNumberHome) {
			this.pid_13_phoneNumberHome = pid_13_phoneNumberHome;
			return this;
		}
		public PIDBuilder pid_14_phoneNumberBusiness(XTN_v25[] pid_14_phoneNumberBusiness) {
			this.pid_14_phoneNumberBusiness = pid_14_phoneNumberBusiness;
			return this;
		}
		public PIDBuilder pid_15_primaryLanguage(CE_v2 pid_15_primaryLanguage) {
			this.pid_15_primaryLanguage = pid_15_primaryLanguage;
			return this;
		}
		public PIDBuilder pid_16_maritalStatus(CE_v2 pid_16_maritalStatus) {
			this.pid_16_maritalStatus = pid_16_maritalStatus;
			return this;
		}
		public PIDBuilder pid_17_religion(CE_v2 pid_17_religion) {
			this.pid_17_religion = pid_17_religion;
			return this;
		}
		public PIDBuilder pid_18_patientAccountNumber(CX_v25 pid_18_patientAccountNumber) {
			this.pid_18_patientAccountNumber = pid_18_patientAccountNumber;
			return this;
		}
		public PIDBuilder pid_19_ssn(String pid_19_ssn) {
			this.pid_19_ssn = pid_19_ssn;
			return this;
		}
		public PIDBuilder pid_20_driversLicenseNumber(DLN_v25 pid_20_driversLicenseNumber) {
			this.pid_20_driversLicenseNumber = pid_20_driversLicenseNumber;
			return this;
		}
		public PIDBuilder pid_21_mothersIdentifier(CX_v25 pid_21_mothersIdentifier) {
			this.pid_21_mothersIdentifier = pid_21_mothersIdentifier;
			return this;
		}
		public PIDBuilder pid_22_ethnicGroup(CE_v2 pid_22_ethnicGroup) {
			this.pid_22_ethnicGroup = pid_22_ethnicGroup;
			return this;
		}
		public PIDBuilder pid_23_birthPlace(String pid_23_birthPlace) {
			this.pid_23_birthPlace = pid_23_birthPlace;
			return this;
		}
		public PIDBuilder pid_24_multipleBirthIndicator(String pid_24_multipleBirthIndicator) {
			this.pid_24_multipleBirthIndicator = pid_24_multipleBirthIndicator;
			return this;
		}
		public PIDBuilder pid_25_birthOrder(String pid_25_birthOrder) {
			this.pid_25_birthOrder = pid_25_birthOrder;
			return this;
		}
		public PIDBuilder pid_26_citizenship(CE_v2[] pid_26_citizenship) {
			this.pid_26_citizenship = pid_26_citizenship;
			return this;
		}
		public PIDBuilder pid_27_veteransMilitaryStatus(CE_v2 pid_27_veteransMilitaryStatus) {
			this.pid_27_veteransMilitaryStatus = pid_27_veteransMilitaryStatus;
			return this;
		}
		public PIDBuilder pid_28_nationality(CE_v2 pid_28_nationality) {
			this.pid_28_nationality = pid_28_nationality;
			return this;
		}
		public PIDBuilder pid_29_patientDeathDateandTime(TS_v2 pid_29_patientDeathDateandTime) {
			this.pid_29_patientDeathDateandTime = pid_29_patientDeathDateandTime;
			return this;
		}
		public PIDBuilder pid_30_patientDeathIndicator(String pid_30_patientDeathIndicator) {
			this.pid_30_patientDeathIndicator = pid_30_patientDeathIndicator;
			return this;
		}
		public PIDBuilder pid_31_identityUnknownIndicator(String pid_31_identityUnknownIndicator) {
			this.pid_31_identityUnknownIndicator = pid_31_identityUnknownIndicator;
			return this;
		}
		public PIDBuilder pid_32_identityReliabilityCode(String[] pid_32_identityReliabilityCode) {
			this.pid_32_identityReliabilityCode = pid_32_identityReliabilityCode;
			return this;
		}
		public PIDBuilder pid_33_lastUpdateDateTime(TS_v2 pid_33_lastUpdateDateTime) {
			this.pid_33_lastUpdateDateTime = pid_33_lastUpdateDateTime;
			return this;
		}
		public PIDBuilder pid_34_lastUpdateFacility(HD_v2 pid_34_lastUpdateFacility) {
			this.pid_34_lastUpdateFacility = pid_34_lastUpdateFacility;
			return this;
		}
		public PIDBuilder pid_35_speciesCode(CE_v2 pid_35_speciesCode) {
			this.pid_35_speciesCode = pid_35_speciesCode;
			return this;
		}
		public PIDBuilder pid_36_breedCode(CE_v2 pid_36_breedCode) {
			this.pid_36_breedCode = pid_36_breedCode;
			return this;
		}
		public PIDBuilder pid_37_strain(String pid_37_strain) {
			this.pid_37_strain = pid_37_strain;
			return this;
		}
		public PIDBuilder pid_38_productionClassCode(CE_v2 pid_38_productionClassCode) {
			this.pid_38_productionClassCode = pid_38_productionClassCode;
			return this;
		}
		public PIDBuilder pid_39_tribalCitizenship(CWE_v25[] pid_39_tribalCitizenship) {
			this.pid_39_tribalCitizenship = pid_39_tribalCitizenship;
			return this;
		}
		public JsonPID_v25 build() {
			return new JsonPID_v25(this);
		}
	}
	public String getPid_1_setID() {
		return pid_1_setID;
	}
	public CX_v25 getPid_2_patientID() {
		return pid_2_patientID;
	}
	public CX_v25[] getPid_3_patientIdentifierList() {
		return pid_3_patientIdentifierList;
	}
	public CX_v25[] getPid_4_alternatePatientID() {
		return pid_4_alternatePatientID;
	}
	public XPN_v25 getPid_5_patientName() {
		return pid_5_patientName;
	}
	public XPN_v25[] getPid_6_mothersMaidenName() {
		return pid_6_mothersMaidenName;
	}
	public TS_v2 getPid_7_dateTimeofBirth() {
		return pid_7_dateTimeofBirth;
	}
	public String getPid_8_administrativeSex() {
		return pid_8_administrativeSex;
	}
	public XPN_v25[] getPid_9_patientAlias() {
		return pid_9_patientAlias;
	}
	public CE_v2[] getPid_10_race() {
		return pid_10_race;
	}
	public XAD_v25[] getPid_11_patientAddress() {
		return pid_11_patientAddress;
	}
	public String getPid_12_countyCode() {
		return pid_12_countyCode;
	}
	public XTN_v25[] getPid_13_phoneNumberHome() {
		return pid_13_phoneNumberHome;
	}
	public XTN_v25[] getPid_14_phoneNumberBusiness() {
		return pid_14_phoneNumberBusiness;
	}
	public CE_v2 getPid_15_primaryLanguage() {
		return pid_15_primaryLanguage;
	}
	public CE_v2 getPid_16_maritalStatus() {
		return pid_16_maritalStatus;
	}
	public CE_v2 getPid_17_religion() {
		return pid_17_religion;
	}
	public CX_v25 getPid_18_patientAccountNumber() {
		return pid_18_patientAccountNumber;
	}
	public String getPid_19_ssn() {
		return pid_19_ssn;
	}
	public DLN_v25 getPid_20_driversLicenseNumber() {
		return pid_20_driversLicenseNumber;
	}
	public CX_v25 getPid_21_mothersIdentifier() {
		return pid_21_mothersIdentifier;
	}
	public CE_v2 getPid_22_ethnicGroup() {
		return pid_22_ethnicGroup;
	}
	public String getPid_23_birthPlace() {
		return pid_23_birthPlace;
	}
	public String getPid_24_multipleBirthIndicator() {
		return pid_24_multipleBirthIndicator;
	}
	public String getPid_25_birthOrder() {
		return pid_25_birthOrder;
	}
	public CE_v2[] getPid_26_citizenship() {
		return pid_26_citizenship;
	}
	public CE_v2 getPid_27_veteransMilitaryStatus() {
		return pid_27_veteransMilitaryStatus;
	}
	public CE_v2 getPid_28_nationality() {
		return pid_28_nationality;
	}
	public TS_v2 getPid_29_patientDeathDateandTime() {
		return pid_29_patientDeathDateandTime;
	}
	public String getPid_30_patientDeathIndicator() {
		return pid_30_patientDeathIndicator;
	}
	public String getPid_31_identityUnknownIndicator() {
		return pid_31_identityUnknownIndicator;
	}
	public String[] getPid_32_identityReliabilityCode() {
		return pid_32_identityReliabilityCode;
	}
	public TS_v2 getPid_33_lastUpdateDateTime() {
		return pid_33_lastUpdateDateTime;
	}
	public HD_v2 getPid_34_lastUpdateFacility() {
		return pid_34_lastUpdateFacility;
	}
	public CE_v2 getPid_35_speciesCode() {
		return pid_35_speciesCode;
	}
	public CE_v2 getPid_36_breedCode() {
		return pid_36_breedCode;
	}
	public String getPid_37_strain() {
		return pid_37_strain;
	}
	public CE_v2 getPid_38_productionClassCode() {
		return pid_38_productionClassCode;
	}
	public CWE_v25[] getPid_39_tribalCitizenship() {
		return pid_39_tribalCitizenship;
	}
	@Override
	public String toString() {
		return "JsonPID_v25 [pid_1_setID=" + pid_1_setID + ", pid_2_patientID=" + pid_2_patientID
				+ ", pid_3_patientIdentifierList=" + Arrays.toString(pid_3_patientIdentifierList)
				+ ", pid_4_alternatePatientID=" + Arrays.toString(pid_4_alternatePatientID) + ", pid_5_patientName="
				+ pid_5_patientName + ", pid_6_mothersMaidenName=" + Arrays.toString(pid_6_mothersMaidenName)
				+ ", pid_7_dateTimeofBirth=" + pid_7_dateTimeofBirth + ", pid_8_administrativeSex="
				+ pid_8_administrativeSex + ", pid_9_patientAlias=" + Arrays.toString(pid_9_patientAlias)
				+ ", pid_10_race=" + Arrays.toString(pid_10_race) + ", pid_11_patientAddress="
				+ Arrays.toString(pid_11_patientAddress) + ", pid_12_countyCode=" + pid_12_countyCode
				+ ", pid_13_phoneNumberHome=" + Arrays.toString(pid_13_phoneNumberHome)
				+ ", pid_14_phoneNumberBusiness=" + pid_14_phoneNumberBusiness + ", pid_15_primaryLanguage="
				+ pid_15_primaryLanguage + ", pid_16_maritalStatus=" + pid_16_maritalStatus + ", pid_17_religion="
				+ pid_17_religion + ", pid_18_patientAccountNumber=" + pid_18_patientAccountNumber + ", pid_19_ssn="
				+ pid_19_ssn + ", pid_20_driversLicenseNumber=" + pid_20_driversLicenseNumber
				+ ", pid_21_mothersIdentifier=" + pid_21_mothersIdentifier + ", pid_22_ethnicGroup="
				+ pid_22_ethnicGroup + ", pid_23_birthPlace=" + pid_23_birthPlace + ", pid_24_multipleBirthIndicator="
				+ pid_24_multipleBirthIndicator + ", pid_25_birthOrder=" + pid_25_birthOrder + ", pid_26_citizenship="
				+ pid_26_citizenship + ", pid_27_veteransMilitaryStatus=" + pid_27_veteransMilitaryStatus
				+ ", pid_28_nationality=" + pid_28_nationality + ", pid_29_patientDeathDateandTime="
				+ pid_29_patientDeathDateandTime + ", pid_30_patientDeathIndicator=" + pid_30_patientDeathIndicator
				+ ", pid_31_identityUnknownIndicator=" + pid_31_identityUnknownIndicator
				+ ", pid_32_identityReliabilityCode=" + pid_32_identityReliabilityCode + ", pid_33_lastUpdateDateTime="
				+ pid_33_lastUpdateDateTime + ", pid_34_lastUpdateFacility=" + pid_34_lastUpdateFacility
				+ ", pid_35_speciesCode=" + pid_35_speciesCode + ", pid_36_breedCode=" + pid_36_breedCode
				+ ", pid_37_strain=" + pid_37_strain + ", pid_38_productionClassCode=" + pid_38_productionClassCode
				+ ", pid_39_tribalCitizenship=" + pid_39_tribalCitizenship + "]";
	}
}
