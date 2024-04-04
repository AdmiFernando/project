package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.JCC_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XON_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonNK1_v25 {
	@JsonProperty("nk1_1_setID")
	private String nk1_1_setID;
	@JsonProperty("nk1_2_nkName")
	private XPN_v25 nk1_2_nkName;
	@JsonProperty("nk1_3_relationship")
	private CE_v2 nk1_3_relationship;
	@JsonProperty("nk1_4_address")
	private XAD_v25 nk1_4_address;
	@JsonProperty("nk1_5_phoneNumber")
	private XTN_v25 nk1_5_phoneNumber;
	@JsonProperty("nk1_6_businessPhoneNumber")
	private XTN_v25 nk1_6_businessPhoneNumber;
	@JsonProperty("nk1_7_contactRole")
	private CE_v2 nk1_7_contactRole;
	@JsonProperty("nk1_8_startDate")
	private String nk1_8_startDate;
	@JsonProperty("nk1_9_endDate")
	private String nk1_9_endDate;
	@JsonProperty("nk1_10_nextofKinAssociatedPartiesJobTitle")
	private String nk1_10_nextofKinAssociatedPartiesJobTitle;
	@JsonProperty("nk1_11_nextofKinAssociatedPartiesJobCodeClass")
	private JCC_v25 nk1_11_nextofKinAssociatedPartiesJobCodeClass;
	@JsonProperty("nk1_12_nextofKinAssociatedPartiesEmployeeNumber")
	private String nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
	@JsonProperty("nk1_13_organizationName")
	private XON_v25 nk1_13_organizationName;
	@JsonProperty("nk1_14_maritalStatus")
	private CE_v2 nk1_14_maritalStatus;
	@JsonProperty("nk1_15_administrativeSex")
	private String nk1_15_administrativeSex;
	@JsonProperty("nk1_16_dateTimeofBirth")
	private String nk1_16_dateTimeofBirth;
	@JsonProperty("nk1_17_livingDependency")
	private String nk1_17_livingDependency;
	@JsonProperty("nk1_18_ambulatoryStatus")
	private String nk1_18_ambulatoryStatus;
	@JsonProperty("nk1_19_citizenship")
	private CE_v2 nk1_19_citizenship;
	@JsonProperty("nk1_20_primaryLanguage")
	private CE_v2 nk1_20_primaryLanguage;
	@JsonProperty("nk1_21_livingArrangement")
	private String nk1_21_livingArrangement;
	@JsonProperty("nk1_22_publicityCode")
	private CE_v2 nk1_22_publicityCode;
	@JsonProperty("nk1_23_protectionIndicator")
	private String nk1_23_protectionIndicator;
	@JsonProperty("nk1_24_studentIndicator")
	private String nk1_24_studentIndicator;
	@JsonProperty("nk1_25_religion")
	private CE_v2 nk1_25_religion;
	@JsonProperty("nk1_26_mothersMaidenName")
	private XPN_v25 nk1_26_mothersMaidenName;
	@JsonProperty("nk1_27_nationality")
	private CE_v2 nk1_27_nationality;
	@JsonProperty("nk1_28_ethnicGroup")
	private CE_v2 nk1_28_ethnicGroup;
	@JsonProperty("nk1_29_contactReason")
	private CE_v2 nk1_29_contactReason;
	@JsonProperty("nk1_30_contactPersonsName")
	private XPN_v25 nk1_30_contactPersonsName;
	@JsonProperty("nk1_31_contactPersonsTelephoneNumber")
	private XTN_v25 nk1_31_contactPersonsTelephoneNumber;
	@JsonProperty("nk1_32_contactPersonsAddress")
	private XAD_v25 nk1_32_contactPersonsAddress;
	@JsonProperty("nk1_33_nextofKinAssociatedPartysIdentifiers")
	private CX_v25 nk1_33_nextofKinAssociatedPartysIdentifiers;
	@JsonProperty("nk1_34_jobStatus")
	private String nk1_34_jobStatus;
	@JsonProperty("nk1_35_race")
	private CE_v2 nk1_35_race;
	@JsonProperty("nk1_36_handicap")
	private String nk1_36_handicap;
	@JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	private String nk1_37_contactPersonSocialSecurityNumber;
	@JsonProperty("nk1_38_nextofKinBirthPlace")
	private String nk1_38_nextofKinBirthPlace;
	@JsonProperty("nk1_39_vipIndicator")
	private String nk1_39_vipIndicator;
	public JsonNK1_v25() {
		super();
		this.nk1_1_setID = "";
		this.nk1_2_nkName = new XPN_v25();
		this.nk1_3_relationship = new CE_v2();
		this.nk1_4_address = new XAD_v25();
		this.nk1_5_phoneNumber = new XTN_v25();
		this.nk1_6_businessPhoneNumber = new XTN_v25();
		this.nk1_7_contactRole = new CE_v2();
		this.nk1_8_startDate = "";
		this.nk1_9_endDate = "";
		this.nk1_10_nextofKinAssociatedPartiesJobTitle = "";
		this.nk1_11_nextofKinAssociatedPartiesJobCodeClass = new JCC_v25();
		this.nk1_12_nextofKinAssociatedPartiesEmployeeNumber = "";
		this.nk1_13_organizationName = new XON_v25();
		this.nk1_14_maritalStatus = new CE_v2();
		this.nk1_15_administrativeSex = "";
		this.nk1_16_dateTimeofBirth = "";
		this.nk1_17_livingDependency = "";
		this.nk1_18_ambulatoryStatus = "";
		this.nk1_19_citizenship = new CE_v2();
		this.nk1_20_primaryLanguage = new CE_v2();
		this.nk1_21_livingArrangement = "";
		this.nk1_22_publicityCode = new CE_v2();
		this.nk1_23_protectionIndicator = "";
		this.nk1_24_studentIndicator = "";
		this.nk1_25_religion = new CE_v2();
		this.nk1_26_mothersMaidenName = new XPN_v25();
		this.nk1_27_nationality = new CE_v2();
		this.nk1_28_ethnicGroup = new CE_v2();
		this.nk1_29_contactReason = new CE_v2();
		this.nk1_30_contactPersonsName = new XPN_v25();
		this.nk1_31_contactPersonsTelephoneNumber = new XTN_v25();
		this.nk1_32_contactPersonsAddress = new XAD_v25();
		this.nk1_33_nextofKinAssociatedPartysIdentifiers = new CX_v25();
		this.nk1_34_jobStatus = "";
		this.nk1_35_race = new CE_v2();
		this.nk1_36_handicap = "";
		this.nk1_37_contactPersonSocialSecurityNumber = "";
		this.nk1_38_nextofKinBirthPlace = "";
		this.nk1_39_vipIndicator = "";
	}
	
	public JsonNK1_v25(NK1Builder builder) {
		super();
		this.nk1_1_setID = builder.nk1_1_setID;
		this.nk1_2_nkName = builder.nk1_2_nkName;
		this.nk1_3_relationship = builder.nk1_3_relationship;
		this.nk1_4_address = builder.nk1_4_address;
		this.nk1_5_phoneNumber = builder.nk1_5_phoneNumber;
		this.nk1_6_businessPhoneNumber = builder.nk1_6_businessPhoneNumber;
		this.nk1_7_contactRole = builder.nk1_7_contactRole;
		this.nk1_8_startDate = builder.nk1_8_startDate;
		this.nk1_9_endDate = builder.nk1_9_endDate;
		this.nk1_10_nextofKinAssociatedPartiesJobTitle = builder.nk1_10_nextofKinAssociatedPartiesJobTitle;
		this.nk1_11_nextofKinAssociatedPartiesJobCodeClass = builder.nk1_11_nextofKinAssociatedPartiesJobCodeClass;
		this.nk1_12_nextofKinAssociatedPartiesEmployeeNumber = builder.nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
		this.nk1_13_organizationName = builder.nk1_13_organizationName;
		this.nk1_14_maritalStatus = builder.nk1_14_maritalStatus;
		this.nk1_15_administrativeSex = builder.nk1_15_administrativeSex;
		this.nk1_16_dateTimeofBirth = builder.nk1_16_dateTimeofBirth;
		this.nk1_17_livingDependency = builder.nk1_17_livingDependency;
		this.nk1_18_ambulatoryStatus = builder.nk1_18_ambulatoryStatus;
		this.nk1_19_citizenship = builder.nk1_19_citizenship;
		this.nk1_20_primaryLanguage = builder.nk1_20_primaryLanguage;
		this.nk1_21_livingArrangement = builder.nk1_21_livingArrangement;
		this.nk1_22_publicityCode = builder.nk1_22_publicityCode;
		this.nk1_23_protectionIndicator = builder.nk1_23_protectionIndicator;
		this.nk1_24_studentIndicator = builder.nk1_24_studentIndicator;
		this.nk1_25_religion = builder.nk1_25_religion;
		this.nk1_26_mothersMaidenName = builder.nk1_26_mothersMaidenName;
		this.nk1_27_nationality = builder.nk1_27_nationality;
		this.nk1_28_ethnicGroup = builder.nk1_28_ethnicGroup;
		this.nk1_29_contactReason = builder.nk1_29_contactReason;
		this.nk1_30_contactPersonsName = builder.nk1_30_contactPersonsName;
		this.nk1_31_contactPersonsTelephoneNumber = builder.nk1_31_contactPersonsTelephoneNumber;
		this.nk1_32_contactPersonsAddress = builder.nk1_32_contactPersonsAddress;
		this.nk1_33_nextofKinAssociatedPartysIdentifiers = builder.nk1_33_nextofKinAssociatedPartysIdentifiers;
		this.nk1_34_jobStatus = builder.nk1_34_jobStatus;
		this.nk1_35_race = builder.nk1_35_race;
		this.nk1_36_handicap = builder.nk1_36_handicap;
		this.nk1_37_contactPersonSocialSecurityNumber = builder.nk1_37_contactPersonSocialSecurityNumber;
		this.nk1_38_nextofKinBirthPlace = builder.nk1_38_nextofKinBirthPlace;
		this.nk1_39_vipIndicator = builder.nk1_39_vipIndicator;
	}

	public static class NK1Builder {
		@JsonProperty("jobCode")
		private String nk1_1_setID;
		@JsonProperty("jobCode")
		private XPN_v25 nk1_2_nkName;
		@JsonProperty("jobCode")
		private CE_v2 nk1_3_relationship;
		@JsonProperty("jobCode")
		private XAD_v25 nk1_4_address;
		@JsonProperty("jobCode")
		private XTN_v25 nk1_5_phoneNumber;
		@JsonProperty("jobCode")
		private XTN_v25 nk1_6_businessPhoneNumber;
		private CE_v2 nk1_7_contactRole;
		private String nk1_8_startDate;
		private String nk1_9_endDate;
		private String nk1_10_nextofKinAssociatedPartiesJobTitle;
		private JCC_v25 nk1_11_nextofKinAssociatedPartiesJobCodeClass;
		private String nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
		private XON_v25 nk1_13_organizationName;
		private CE_v2 nk1_14_maritalStatus;
		private String nk1_15_administrativeSex;
		private String nk1_16_dateTimeofBirth;
		private String nk1_17_livingDependency;
		private String nk1_18_ambulatoryStatus;
		private CE_v2 nk1_19_citizenship;
		private CE_v2 nk1_20_primaryLanguage;
		private String nk1_21_livingArrangement;
		private CE_v2 nk1_22_publicityCode;
		private String nk1_23_protectionIndicator;
		private String nk1_24_studentIndicator;
		private CE_v2 nk1_25_religion;
		private XPN_v25 nk1_26_mothersMaidenName;
		private CE_v2 nk1_27_nationality;
		private CE_v2 nk1_28_ethnicGroup;
		private CE_v2 nk1_29_contactReason;
		private XPN_v25 nk1_30_contactPersonsName;
		private XTN_v25 nk1_31_contactPersonsTelephoneNumber;
		private XAD_v25 nk1_32_contactPersonsAddress;
		private CX_v25 nk1_33_nextofKinAssociatedPartysIdentifiers;
		private String nk1_34_jobStatus;
		private CE_v2 nk1_35_race;
		private String nk1_36_handicap;
		private String nk1_37_contactPersonSocialSecurityNumber;
		private String nk1_38_nextofKinBirthPlace;
		private String nk1_39_vipIndicator;
		public NK1Builder() {
			this.nk1_1_setID = "";
			this.nk1_2_nkName = new XPN_v25();
			this.nk1_3_relationship = new CE_v2();
			this.nk1_4_address = new XAD_v25();
			this.nk1_5_phoneNumber = new XTN_v25();
			this.nk1_6_businessPhoneNumber = new XTN_v25();
			this.nk1_7_contactRole = new CE_v2();
			this.nk1_8_startDate = "";
			this.nk1_9_endDate = "";
			this.nk1_10_nextofKinAssociatedPartiesJobTitle = "";
			this.nk1_11_nextofKinAssociatedPartiesJobCodeClass = new JCC_v25();
			this.nk1_12_nextofKinAssociatedPartiesEmployeeNumber = "";
			this.nk1_13_organizationName = new XON_v25();
			this.nk1_14_maritalStatus = new CE_v2();
			this.nk1_15_administrativeSex = "";
			this.nk1_16_dateTimeofBirth = "";
			this.nk1_17_livingDependency = "";
			this.nk1_18_ambulatoryStatus = "";
			this.nk1_19_citizenship = new CE_v2();
			this.nk1_20_primaryLanguage = new CE_v2();
			this.nk1_21_livingArrangement = "";
			this.nk1_22_publicityCode = new CE_v2();
			this.nk1_23_protectionIndicator = "";
			this.nk1_24_studentIndicator = "";
			this.nk1_25_religion = new CE_v2();
			this.nk1_26_mothersMaidenName = new XPN_v25();
			this.nk1_27_nationality = new CE_v2();
			this.nk1_28_ethnicGroup = new CE_v2();
			this.nk1_29_contactReason = new CE_v2();
			this.nk1_30_contactPersonsName = new XPN_v25();
			this.nk1_31_contactPersonsTelephoneNumber = new XTN_v25();
			this.nk1_32_contactPersonsAddress = new XAD_v25();
			this.nk1_33_nextofKinAssociatedPartysIdentifiers = new CX_v25();
			this.nk1_34_jobStatus = "";
			this.nk1_35_race = new CE_v2();
			this.nk1_36_handicap = "";
			this.nk1_37_contactPersonSocialSecurityNumber = "";
			this.nk1_38_nextofKinBirthPlace = "";
			this.nk1_39_vipIndicator = "";
		}
		public NK1Builder setNk1_1_setID(String nk1_1_setID) {
			this.nk1_1_setID = nk1_1_setID;
			return this;
		}
		public NK1Builder setNk1_2_nkName(XPN_v25 nk1_2_nkName) {
			this.nk1_2_nkName = nk1_2_nkName;
			return this;
		}
		public NK1Builder setNk1_3_relationship(CE_v2 nk1_3_relationship) {
			this.nk1_3_relationship = nk1_3_relationship;
			return this;
		}
		public NK1Builder setNk1_4_address(XAD_v25 nk1_4_address) {
			this.nk1_4_address = nk1_4_address;
			return this;
		}
		public NK1Builder setNk1_5_phoneNumber(XTN_v25 nk1_5_phoneNumber) {
			this.nk1_5_phoneNumber = nk1_5_phoneNumber;
			return this;
		}
		public NK1Builder setNk1_6_businessPhoneNumber(XTN_v25 nk1_6_businessPhoneNumber) {
			this.nk1_6_businessPhoneNumber = nk1_6_businessPhoneNumber;
			return this;
		}
		public NK1Builder setNk1_7_contactRole(CE_v2 nk1_7_contactRole) {
			this.nk1_7_contactRole = nk1_7_contactRole;
			return this;
		}
		public NK1Builder setNk1_8_startDate(String nk1_8_startDate) {
			this.nk1_8_startDate = nk1_8_startDate;
			return this;
		}
		public NK1Builder setNk1_9_endDate(String nk1_9_endDate) {
			this.nk1_9_endDate = nk1_9_endDate;
			return this;
		}
		public NK1Builder setNk1_10_nextofKinAssociatedPartiesJobTitle(String nk1_10_nextofKinAssociatedPartiesJobTitle) {
			this.nk1_10_nextofKinAssociatedPartiesJobTitle = nk1_10_nextofKinAssociatedPartiesJobTitle;
			return this;
		}
		public NK1Builder setNk1_11_nextofKinAssociatedPartiesJobCodeClass(JCC_v25 nk1_11_nextofKinAssociatedPartiesJobCodeClass) {
			this.nk1_11_nextofKinAssociatedPartiesJobCodeClass = nk1_11_nextofKinAssociatedPartiesJobCodeClass;
			return this;
		}
		public NK1Builder setNk1_12_nextofKinAssociatedPartiesEmployeeNumber(String nk1_12_nextofKinAssociatedPartiesEmployeeNumber) {
			this.nk1_12_nextofKinAssociatedPartiesEmployeeNumber = nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
			return this;
		}
		public NK1Builder setNk1_13_organizationName(XON_v25 nk1_13_organizationName) {
			this.nk1_13_organizationName = nk1_13_organizationName;
			return this;
		}
		public NK1Builder setNk1_14_maritalStatus(CE_v2 nk1_14_maritalStatus) {
			this.nk1_14_maritalStatus = nk1_14_maritalStatus;
			return this;
		}
		public NK1Builder setNk1_15_administrativeSex(String nk1_15_administrativeSex) {
			this.nk1_15_administrativeSex = nk1_15_administrativeSex;
			return this;
		}
		public NK1Builder setNk1_16_dateTimeofBirth(String nk1_16_dateTimeofBirth) {
			this.nk1_16_dateTimeofBirth = nk1_16_dateTimeofBirth;
			return this;
		}
		public NK1Builder setNk1_17_livingDependency(String nk1_17_livingDependency) {
			this.nk1_17_livingDependency = nk1_17_livingDependency;
			return this;
		}
		public NK1Builder setNk1_18_ambulatoryStatus(String nk1_18_ambulatoryStatus) {
			this.nk1_18_ambulatoryStatus = nk1_18_ambulatoryStatus;
			return this;
		}
		public NK1Builder setNk1_19_citizenship(CE_v2 nk1_19_citizenship) {
			this.nk1_19_citizenship = nk1_19_citizenship;
			return this;
		}
		public NK1Builder setNk1_20_primaryLanguage(CE_v2 nk1_20_primaryLanguage) {
			this.nk1_20_primaryLanguage = nk1_20_primaryLanguage;
			return this;
		}
		public NK1Builder setNk1_21_livingArrangement(String nk1_21_livingArrangement) {
			this.nk1_21_livingArrangement = nk1_21_livingArrangement;
			return this;
		}
		public NK1Builder setNk1_22_publicityCode(CE_v2 nk1_22_publicityCode) {
			this.nk1_22_publicityCode = nk1_22_publicityCode;
			return this;
		}
		public NK1Builder setNk1_23_protectionIndicator(String nk1_23_protectionIndicator) {
			this.nk1_23_protectionIndicator = nk1_23_protectionIndicator;
			return this;
		}
		public NK1Builder setNk1_24_studentIndicator(String nk1_24_studentIndicator) {
			this.nk1_24_studentIndicator = nk1_24_studentIndicator;
			return this;
		}
		public NK1Builder setNk1_25_religion(CE_v2 nk1_25_religion) {
			this.nk1_25_religion = nk1_25_religion;
			return this;
		}
		public NK1Builder setNk1_26_mothersMaidenName(XPN_v25 nk1_26_mothersMaidenName) {
			this.nk1_26_mothersMaidenName = nk1_26_mothersMaidenName;
			return this;
		}
		public NK1Builder setNk1_27_nationality(CE_v2 nk1_27_nationality) {
			this.nk1_27_nationality = nk1_27_nationality;
			return this;
		}
		public NK1Builder setNk1_28_ethnicGroup(CE_v2 nk1_28_ethnicGroup) {
			this.nk1_28_ethnicGroup = nk1_28_ethnicGroup;
			return this;
		}
		public NK1Builder setNk1_29_contactReason(CE_v2 nk1_29_contactReason) {
			this.nk1_29_contactReason = nk1_29_contactReason;
			return this;
		}
		public NK1Builder setNk1_30_contactPersonsName(XPN_v25 nk1_30_contactPersonsName) {
			this.nk1_30_contactPersonsName = nk1_30_contactPersonsName;
			return this;
		}
		public NK1Builder setNk1_31_contactPersonsTelephoneNumber(XTN_v25 nk1_31_contactPersonsTelephoneNumber) {
			this.nk1_31_contactPersonsTelephoneNumber = nk1_31_contactPersonsTelephoneNumber;
			return this;
		}
		public NK1Builder setNk1_32_contactPersonsAddress(XAD_v25 nk1_32_contactPersonsAddress) {
			this.nk1_32_contactPersonsAddress = nk1_32_contactPersonsAddress;
			return this;
		}
		public NK1Builder setNk1_33_nextofKinAssociatedPartysIdentifiers(CX_v25 nk1_33_nextofKinAssociatedPartysIdentifiers) {
			this.nk1_33_nextofKinAssociatedPartysIdentifiers = nk1_33_nextofKinAssociatedPartysIdentifiers;
			return this;
		}
		public NK1Builder setNk1_34_jobStatus(String nk1_34_jobStatus) {
			this.nk1_34_jobStatus = nk1_34_jobStatus;
			return this;
		}
		public NK1Builder setNk1_35_race(CE_v2 nk1_35_race) {
			this.nk1_35_race = nk1_35_race;
			return this;
		}
		public NK1Builder setNk1_36_handicap(String nk1_36_handicap) {
			this.nk1_36_handicap = nk1_36_handicap;
			return this;
		}
		public NK1Builder setNk1_37_contactPersonSocialSecurityNumber(String nk1_37_contactPersonSocialSecurityNumber) {
			this.nk1_37_contactPersonSocialSecurityNumber = nk1_37_contactPersonSocialSecurityNumber;
			return this;
		}
		public NK1Builder setNk1_38_nextofKinBirthPlace(String nk1_38_nextofKinBirthPlace) {
			this.nk1_38_nextofKinBirthPlace = nk1_38_nextofKinBirthPlace;
			return this;
		}
		public NK1Builder setNk1_39_vipIndicator(String nk1_39_vipIndicator) {
			this.nk1_39_vipIndicator = nk1_39_vipIndicator;
			return this;
		}
		public JsonNK1_v25 build() {
			return new JsonNK1_v25(this);
		}
	}

	public String getNk1_1_setID() {
		return nk1_1_setID;
	}

	public XPN_v25 getNk1_2_nkName() {
		return nk1_2_nkName;
	}

	public CE_v2 getNk1_3_relationship() {
		return nk1_3_relationship;
	}

	public XAD_v25 getNk1_4_address() {
		return nk1_4_address;
	}

	public XTN_v25 getNk1_5_phoneNumber() {
		return nk1_5_phoneNumber;
	}

	public XTN_v25 getNk1_6_businessPhoneNumber() {
		return nk1_6_businessPhoneNumber;
	}

	public CE_v2 getNk1_7_contactRole() {
		return nk1_7_contactRole;
	}

	public String getNk1_8_startDate() {
		return nk1_8_startDate;
	}

	public String getNk1_9_endDate() {
		return nk1_9_endDate;
	}

	public String getNk1_10_nextofKinAssociatedPartiesJobTitle() {
		return nk1_10_nextofKinAssociatedPartiesJobTitle;
	}

	public JCC_v25 getNk1_11_nextofKinAssociatedPartiesJobCodeClass() {
		return nk1_11_nextofKinAssociatedPartiesJobCodeClass;
	}

	public String getNk1_12_nextofKinAssociatedPartiesEmployeeNumber() {
		return nk1_12_nextofKinAssociatedPartiesEmployeeNumber;
	}

	public XON_v25 getNk1_13_organizationName() {
		return nk1_13_organizationName;
	}

	public CE_v2 getNk1_14_maritalStatus() {
		return nk1_14_maritalStatus;
	}

	public String getNk1_15_administrativeSex() {
		return nk1_15_administrativeSex;
	}

	public String getNk1_16_dateTimeofBirth() {
		return nk1_16_dateTimeofBirth;
	}

	public String getNk1_17_livingDependency() {
		return nk1_17_livingDependency;
	}

	public String getNk1_18_ambulatoryStatus() {
		return nk1_18_ambulatoryStatus;
	}

	public CE_v2 getNk1_19_citizenship() {
		return nk1_19_citizenship;
	}

	public CE_v2 getNk1_20_primaryLanguage() {
		return nk1_20_primaryLanguage;
	}

	public String getNk1_21_livingArrangement() {
		return nk1_21_livingArrangement;
	}

	public CE_v2 getNk1_22_publicityCode() {
		return nk1_22_publicityCode;
	}

	public String getNk1_23_protectionIndicator() {
		return nk1_23_protectionIndicator;
	}

	public String getNk1_24_studentIndicator() {
		return nk1_24_studentIndicator;
	}

	public CE_v2 getNk1_25_religion() {
		return nk1_25_religion;
	}

	public XPN_v25 getNk1_26_mothersMaidenName() {
		return nk1_26_mothersMaidenName;
	}

	public CE_v2 getNk1_27_nationality() {
		return nk1_27_nationality;
	}

	public CE_v2 getNk1_28_ethnicGroup() {
		return nk1_28_ethnicGroup;
	}

	public CE_v2 getNk1_29_contactReason() {
		return nk1_29_contactReason;
	}

	public XPN_v25 getNk1_30_contactPersonsName() {
		return nk1_30_contactPersonsName;
	}

	public XTN_v25 getNk1_31_contactPersonsTelephoneNumber() {
		return nk1_31_contactPersonsTelephoneNumber;
	}

	public XAD_v25 getNk1_32_contactPersonsAddress() {
		return nk1_32_contactPersonsAddress;
	}

	public CX_v25 getNk1_33_nextofKinAssociatedPartysIdentifiers() {
		return nk1_33_nextofKinAssociatedPartysIdentifiers;
	}

	public String getNk1_34_jobStatus() {
		return nk1_34_jobStatus;
	}

	public CE_v2 getNk1_35_race() {
		return nk1_35_race;
	}

	public String getNk1_36_handicap() {
		return nk1_36_handicap;
	}

	public String getNk1_37_contactPersonSocialSecurityNumber() {
		return nk1_37_contactPersonSocialSecurityNumber;
	}

	public String getNk1_38_nextofKinBirthPlace() {
		return nk1_38_nextofKinBirthPlace;
	}

	public String getNk1_39_vipIndicator() {
		return nk1_39_vipIndicator;
	}
	@Override
	public String toString() {
		return "JsonNK1_v25 [nk1_1_setID=" + nk1_1_setID + ", nk1_2_nkName=" + nk1_2_nkName + ", nk1_3_relationship="
				+ nk1_3_relationship + ", nk1_4_address=" + nk1_4_address + ", nk1_5_phoneNumber=" + nk1_5_phoneNumber
				+ ", nk1_6_businessPhoneNumber=" + nk1_6_businessPhoneNumber + ", nk1_7_contactRole="
				+ nk1_7_contactRole + ", nk1_8_startDate=" + nk1_8_startDate + ", nk1_9_endDate=" + nk1_9_endDate
				+ ", nk1_10_nextofKinAssociatedPartiesJobTitle=" + nk1_10_nextofKinAssociatedPartiesJobTitle
				+ ", nk1_11_nextofKinAssociatedPartiesJobCodeClass=" + nk1_11_nextofKinAssociatedPartiesJobCodeClass
				+ ", nk1_12_nextofKinAssociatedPartiesEmployeeNumber=" + nk1_12_nextofKinAssociatedPartiesEmployeeNumber
				+ ", nk1_13_organizationName=" + nk1_13_organizationName + ", nk1_14_maritalStatus="
				+ nk1_14_maritalStatus + ", nk1_15_administrativeSex=" + nk1_15_administrativeSex
				+ ", nk1_16_dateTimeofBirth=" + nk1_16_dateTimeofBirth + ", nk1_17_livingDependency="
				+ nk1_17_livingDependency + ", nk1_18_ambulatoryStatus=" + nk1_18_ambulatoryStatus
				+ ", nk1_19_citizenship=" + nk1_19_citizenship + ", nk1_20_primaryLanguage=" + nk1_20_primaryLanguage
				+ ", nk1_21_livingArrangement=" + nk1_21_livingArrangement + ", nk1_22_publicityCode="
				+ nk1_22_publicityCode + ", nk1_23_protectionIndicator=" + nk1_23_protectionIndicator
				+ ", nk1_24_studentIndicator=" + nk1_24_studentIndicator + ", nk1_25_religion=" + nk1_25_religion
				+ ", nk1_26_mothersMaidenName=" + nk1_26_mothersMaidenName + ", nk1_27_nationality="
				+ nk1_27_nationality + ", nk1_28_ethnicGroup=" + nk1_28_ethnicGroup + ", nk1_29_contactReason="
				+ nk1_29_contactReason + ", nk1_30_contactPersonsName=" + nk1_30_contactPersonsName
				+ ", nk1_31_contactPersonsTelephoneNumber=" + nk1_31_contactPersonsTelephoneNumber
				+ ", nk1_32_contactPersonsAddress=" + nk1_32_contactPersonsAddress
				+ ", nk1_33_nextofKinAssociatedPartysIdentifiers=" + nk1_33_nextofKinAssociatedPartysIdentifiers
				+ ", nk1_34_jobStatus=" + nk1_34_jobStatus + ", nk1_35_race=" + nk1_35_race + ", nk1_36_handicap="
				+ nk1_36_handicap + ", nk1_37_contactPersonSocialSecurityNumber="
				+ nk1_37_contactPersonSocialSecurityNumber + ", nk1_38_nextofKinBirthPlace="
				+ nk1_38_nextofKinBirthPlace + ", nk1_39_vipIndicator=" + nk1_39_vipIndicator + "]";
	}
}
