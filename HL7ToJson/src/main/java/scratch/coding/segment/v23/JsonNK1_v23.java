package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.JCC_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonNK1_v23{
	@JsonProperty("nk1_1_setId")
	private String nk1_1_setId;
	@JsonProperty("xpn_nk1_2_nkName")
	private XPN_v23[] xpn_nk1_2_nkName;
	@JsonProperty("ce_nk1_3_relationship")
	private CE_v2 ce_nk1_3_relationship;
	@JsonProperty("xad_nk1_4_address")
	private XAD_v23[] xad_nk1_4_address;
	@JsonProperty("xtn_nk1_5_phoneNumber")
	private XTN_v23[] xtn_nk1_5_phoneNumber;
	@JsonProperty("xtn_nk1_6_businessPhoneNumber")
	private XTN_v23[] xtn_nk1_6_businessPhoneNumber;
	@JsonProperty("ce_nk1_7_contactRole")
	private CE_v2 ce_nk1_7_contactRole;
	@JsonProperty("nk1_8_startDate")
	private String nk1_8_startDate;
	@JsonProperty("nk1_9_endDate")
	private String nk1_9_endDate;
	@JsonProperty("nk1_10_nextOfKinAssociatedPartiesJodTitle")
	private String nk1_10_nextOfKinAssociatedPartiesJodTitle;
	@JsonProperty("jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass")
	private JCC_v23 jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
	@JsonProperty("cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber")
	private CX_v23 cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
	@JsonProperty("xon_nk1_13_organizationName")
	private XON_v23[] xon_nk1_13_organizationName;
	@JsonProperty("nk1_14_maritalStatus")
	private String[] nk1_14_maritalStatus;
	@JsonProperty("nk1_15_sex")
	private String nk1_15_sex;
	@JsonProperty("ts_nk1_16_dateOfBirth")
	private TS_v2 ts_nk1_16_dateOfBirth;
	@JsonProperty("nk1_17_livingDependency")
	private String nk1_17_livingDependency;
	@JsonProperty("nk1_18_ambulatoryStatus")
	private String nk1_18_ambulatoryStatus;
	@JsonProperty("nk1_19_citizenship")
	private String nk1_19_citizenship;
	@JsonProperty("ce_nk1_20_primaryLanguage")
	private CE_v2 ce_nk1_20_primaryLanguage;
	@JsonProperty("nk1_21_livingArrangement")
	private String nk1_21_livingArrangement;
	@JsonProperty("ce_nk1_22_publicityIndicator")
	private CE_v2 ce_nk1_22_publicityIndicator;
	@JsonProperty("nk1_23_protectionIndicator")
	private String nk1_23_protectionIndicator;
	@JsonProperty("nk1_24_studentIndicator")
	private String nk1_24_studentIndicator;
	@JsonProperty("nk1_25_religion")
	private String nk1_25_religion;
	@JsonProperty("xpn_nk1_26_mothersMaidenName")
	private XPN_v23 xpn_nk1_26_mothersMaidenName;
	@JsonProperty("ce_nk1_27_nationalityCode")
	private CE_v2 ce_nk1_27_nationalityCode;
	@JsonProperty("nk1_28_ethnicGroup")
	private String nk1_28_ethnicGroup;
	@JsonProperty("ce_nk1_29_contactReason")
	private CE_v2 ce_nk1_29_contactReason;
	@JsonProperty("xpn_nk1_30_contactPersonsName")
	private XPN_v23[] xpn_nk1_30_contactPersonsName;
	@JsonProperty("xtn_nk1_31_contactPersonsTelephoneNumber")
	private XTN_v23[] xtn_nk1_31_contactPersonsTelephoneNumber;
	@JsonProperty("xad_nk1_32_contactPersonsAddress")
	private XAD_v23[] xad_nk1_32_contactPersonsAddress;
	@JsonProperty("cx_nk1_33_nextOfKinAssociatedPartyIdentifiers")
	private CX_v23[] cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
	@JsonProperty("nk1_34_jobStatus")
	private String nk1_34_jobStatus;
	@JsonProperty("nk1_35_race")
	private String nk1_35_race;
	@JsonProperty("nk1_36_handicap")
	private String nk1_36_handicap;
	@JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	private String nk1_37_contactPersonSocialSecurityNumber;
	public JsonNK1_v23(NK1Builder builder) {
		super();
		this.nk1_1_setId = builder.nk1_1_setId;
		this.xpn_nk1_2_nkName = builder.xpn_nk1_2_nkName;
		this.ce_nk1_3_relationship = builder.ce_nk1_3_relationship;
		this.xad_nk1_4_address = builder.xad_nk1_4_address;
		this.xtn_nk1_5_phoneNumber = builder.xtn_nk1_5_phoneNumber;
		this.xtn_nk1_6_businessPhoneNumber = builder.xtn_nk1_6_businessPhoneNumber;
		this.ce_nk1_7_contactRole = builder.ce_nk1_7_contactRole;
		this.nk1_8_startDate = builder.nk1_8_startDate;
		this.nk1_9_endDate = builder.nk1_9_endDate;
		this.nk1_10_nextOfKinAssociatedPartiesJodTitle = builder.nk1_10_nextOfKinAssociatedPartiesJodTitle;
		this.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass = builder.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
		this.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber = builder.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
		this.xon_nk1_13_organizationName = builder.xon_nk1_13_organizationName;
		this.nk1_14_maritalStatus = builder.nk1_14_maritalStatus;
		this.nk1_15_sex = builder.nk1_15_sex;
		this.ts_nk1_16_dateOfBirth = builder.ts_nk1_16_dateOfBirth;
		this.nk1_17_livingDependency = builder.nk1_17_livingDependency;
		this.nk1_18_ambulatoryStatus = builder.nk1_18_ambulatoryStatus;
		this.nk1_19_citizenship = builder.nk1_19_citizenship;
		this.ce_nk1_20_primaryLanguage = builder.ce_nk1_20_primaryLanguage;
		this.nk1_21_livingArrangement = builder.nk1_21_livingArrangement;
		this.ce_nk1_22_publicityIndicator = builder.ce_nk1_22_publicityIndicator;
		this.nk1_23_protectionIndicator = builder.nk1_23_protectionIndicator;
		this.nk1_24_studentIndicator = builder.nk1_24_studentIndicator;
		this.nk1_25_religion = builder.nk1_25_religion;
		this.xpn_nk1_26_mothersMaidenName = builder.xpn_nk1_26_mothersMaidenName;
		this.ce_nk1_27_nationalityCode = builder.ce_nk1_27_nationalityCode;
		this.nk1_28_ethnicGroup = builder.nk1_28_ethnicGroup;
		this.ce_nk1_29_contactReason = builder.ce_nk1_29_contactReason;
		this.xpn_nk1_30_contactPersonsName = builder.xpn_nk1_30_contactPersonsName;
		this.xtn_nk1_31_contactPersonsTelephoneNumber = builder.xtn_nk1_31_contactPersonsTelephoneNumber;
		this.xad_nk1_32_contactPersonsAddress = builder.xad_nk1_32_contactPersonsAddress;
		this.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers = builder.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
		this.nk1_34_jobStatus = builder.nk1_34_jobStatus;
		this.nk1_35_race = builder.nk1_35_race;
		this.nk1_36_handicap = builder.nk1_36_handicap;
		this.nk1_37_contactPersonSocialSecurityNumber = builder.nk1_37_contactPersonSocialSecurityNumber;
	}
	
	public JsonNK1_v23(String nk1_1_setId, XPN_v23[] xpn_nk1_2_nkName, CE_v2 ce_nk1_3_relationship,
			XAD_v23[] xad_nk1_4_address, XTN_v23[] xtn_nk1_5_phoneNumber, XTN_v23[] xtn_nk1_6_businessPhoneNumber,
			CE_v2 ce_nk1_7_contactRole, String nk1_8_startDate, String nk1_9_endDate,
			String nk1_10_nextOfKinAssociatedPartiesJodTitle, JCC_v23 jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass,
			CX_v23 cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber, XON_v23[] xon_nk1_13_organizationName,
			String[] nk1_14_maritalStatus, String nk1_15_sex, TS_v2 ts_nk1_16_dateOfBirth,
			String nk1_17_livingDependency, String nk1_18_ambulatoryStatus, String nk1_19_citizenship,
			CE_v2 ce_nk1_20_primaryLanguage, String nk1_21_livingArrangement, CE_v2 ce_nk1_22_publicityIndicator,
			String nk1_23_protectionIndicator, String nk1_24_studentIndicator, String nk1_25_religion,
			XPN_v23 xpn_nk1_26_mothersMaidenName, CE_v2 ce_nk1_27_nationalityCode, String nk1_28_ethnicGroup,
			CE_v2 ce_nk1_29_contactReason, XPN_v23[] xpn_nk1_30_contactPersonsName,
			XTN_v23[] xtn_nk1_31_contactPersonsTelephoneNumber, XAD_v23[] xad_nk1_32_contactPersonsAddress,
			CX_v23[] cx_nk1_33_nextOfKinAssociatedPartyIdentifiers, String nk1_34_jobStatus, String nk1_35_race,
			String nk1_36_handicap, String nk1_37_contactPersonSocialSecurityNumber) {
		super();
		this.nk1_1_setId = nk1_1_setId;
		this.xpn_nk1_2_nkName = xpn_nk1_2_nkName;
		this.ce_nk1_3_relationship = ce_nk1_3_relationship;
		this.xad_nk1_4_address = xad_nk1_4_address;
		this.xtn_nk1_5_phoneNumber = xtn_nk1_5_phoneNumber;
		this.xtn_nk1_6_businessPhoneNumber = xtn_nk1_6_businessPhoneNumber;
		this.ce_nk1_7_contactRole = ce_nk1_7_contactRole;
		this.nk1_8_startDate = nk1_8_startDate;
		this.nk1_9_endDate = nk1_9_endDate;
		this.nk1_10_nextOfKinAssociatedPartiesJodTitle = nk1_10_nextOfKinAssociatedPartiesJodTitle;
		this.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass = jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
		this.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber = cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
		this.xon_nk1_13_organizationName = xon_nk1_13_organizationName;
		this.nk1_14_maritalStatus = nk1_14_maritalStatus;
		this.nk1_15_sex = nk1_15_sex;
		this.ts_nk1_16_dateOfBirth = ts_nk1_16_dateOfBirth;
		this.nk1_17_livingDependency = nk1_17_livingDependency;
		this.nk1_18_ambulatoryStatus = nk1_18_ambulatoryStatus;
		this.nk1_19_citizenship = nk1_19_citizenship;
		this.ce_nk1_20_primaryLanguage = ce_nk1_20_primaryLanguage;
		this.nk1_21_livingArrangement = nk1_21_livingArrangement;
		this.ce_nk1_22_publicityIndicator = ce_nk1_22_publicityIndicator;
		this.nk1_23_protectionIndicator = nk1_23_protectionIndicator;
		this.nk1_24_studentIndicator = nk1_24_studentIndicator;
		this.nk1_25_religion = nk1_25_religion;
		this.xpn_nk1_26_mothersMaidenName = xpn_nk1_26_mothersMaidenName;
		this.ce_nk1_27_nationalityCode = ce_nk1_27_nationalityCode;
		this.nk1_28_ethnicGroup = nk1_28_ethnicGroup;
		this.ce_nk1_29_contactReason = ce_nk1_29_contactReason;
		this.xpn_nk1_30_contactPersonsName = xpn_nk1_30_contactPersonsName;
		this.xtn_nk1_31_contactPersonsTelephoneNumber = xtn_nk1_31_contactPersonsTelephoneNumber;
		this.xad_nk1_32_contactPersonsAddress = xad_nk1_32_contactPersonsAddress;
		this.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers = cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
		this.nk1_34_jobStatus = nk1_34_jobStatus;
		this.nk1_35_race = nk1_35_race;
		this.nk1_36_handicap = nk1_36_handicap;
		this.nk1_37_contactPersonSocialSecurityNumber = nk1_37_contactPersonSocialSecurityNumber;
	}
	public JsonNK1_v23() {
		super();
		this.nk1_1_setId = "";
		this.xpn_nk1_2_nkName = new XPN_v23[] {};
		this.ce_nk1_3_relationship = new CE_v2();
		this.xad_nk1_4_address = new XAD_v23[] {};
		this.xtn_nk1_5_phoneNumber = new XTN_v23[] {};
		this.xtn_nk1_6_businessPhoneNumber = new XTN_v23[] {};
		this.ce_nk1_7_contactRole = new CE_v2();
		this.nk1_8_startDate = "";
		this.nk1_9_endDate = "";
		this.nk1_10_nextOfKinAssociatedPartiesJodTitle = "";
		this.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass = new JCC_v23();
		this.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber = new CX_v23();
		this.xon_nk1_13_organizationName = new XON_v23[] {};
		this.nk1_14_maritalStatus = new String[] {};
		this.nk1_15_sex = "";
		this.ts_nk1_16_dateOfBirth = new TS_v2();
		this.nk1_17_livingDependency = "";
		this.nk1_18_ambulatoryStatus = "";
		this.nk1_19_citizenship = "";
		this.ce_nk1_20_primaryLanguage = new CE_v2();
		this.nk1_21_livingArrangement = "";
		this.ce_nk1_22_publicityIndicator = new CE_v2();
		this.nk1_23_protectionIndicator = "";
		this.nk1_24_studentIndicator = "";
		this.nk1_25_religion = "";
		this.xpn_nk1_26_mothersMaidenName = new XPN_v23();
		this.ce_nk1_27_nationalityCode = new CE_v2();
		this.nk1_28_ethnicGroup = "";
		this.ce_nk1_29_contactReason = new CE_v2();
		this.xpn_nk1_30_contactPersonsName = new XPN_v23[] {};
		this.xtn_nk1_31_contactPersonsTelephoneNumber = new XTN_v23[] {};
		this.xad_nk1_32_contactPersonsAddress = new XAD_v23[] {};
		this.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers = new CX_v23[] {};
		this.nk1_34_jobStatus = "";
		this.nk1_35_race = "";
		this.nk1_36_handicap = "";
		this.nk1_37_contactPersonSocialSecurityNumber = "";
	}
	public static class NK1Builder {
		private String nk1_1_setId;
		private XPN_v23[] xpn_nk1_2_nkName;
		private CE_v2 ce_nk1_3_relationship;
		private XAD_v23[] xad_nk1_4_address;
		private XTN_v23[] xtn_nk1_5_phoneNumber;
		private XTN_v23[] xtn_nk1_6_businessPhoneNumber;
		private CE_v2 ce_nk1_7_contactRole;
		private String nk1_8_startDate;
		private String nk1_9_endDate;
		private String nk1_10_nextOfKinAssociatedPartiesJodTitle;
		private JCC_v23 jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
		private CX_v23 cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
		private XON_v23[] xon_nk1_13_organizationName;
		private String[] nk1_14_maritalStatus;
		private String nk1_15_sex;
		private TS_v2 ts_nk1_16_dateOfBirth;
		private String nk1_17_livingDependency;
		private String nk1_18_ambulatoryStatus;
		private String nk1_19_citizenship;
		private CE_v2 ce_nk1_20_primaryLanguage;
		private String nk1_21_livingArrangement;
		private CE_v2 ce_nk1_22_publicityIndicator;
		private String nk1_23_protectionIndicator;
		private String nk1_24_studentIndicator;
		private String nk1_25_religion;
		private XPN_v23 xpn_nk1_26_mothersMaidenName;
		private CE_v2 ce_nk1_27_nationalityCode;
		private String nk1_28_ethnicGroup;
		private CE_v2 ce_nk1_29_contactReason;
		private XPN_v23[] xpn_nk1_30_contactPersonsName;
		private XTN_v23[] xtn_nk1_31_contactPersonsTelephoneNumber;
		private XAD_v23[] xad_nk1_32_contactPersonsAddress;
		private CX_v23[] cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
		private String nk1_34_jobStatus;
		private String nk1_35_race;
		private String nk1_36_handicap;
		private String nk1_37_contactPersonSocialSecurityNumber;
		public NK1Builder(String nk1_1_setId) {
			super();
			this.nk1_1_setId = nk1_1_setId;
			this.xpn_nk1_2_nkName = new XPN_v23[] {};
			this.ce_nk1_3_relationship = new CE_v2();
			this.xad_nk1_4_address = new XAD_v23[] {};
			this.xtn_nk1_5_phoneNumber = new XTN_v23[] {};
			this.xtn_nk1_6_businessPhoneNumber = new XTN_v23[] {};
			this.ce_nk1_7_contactRole = new CE_v2();
			this.nk1_8_startDate = "";
			this.nk1_9_endDate = "";
			this.nk1_10_nextOfKinAssociatedPartiesJodTitle = "";
			this.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass = new JCC_v23();
			this.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber = new CX_v23();
			this.xon_nk1_13_organizationName = new XON_v23[] {};
			this.nk1_14_maritalStatus = new String[] {};
			this.nk1_15_sex = "";
			this.ts_nk1_16_dateOfBirth = new TS_v2();
			this.nk1_17_livingDependency = "";
			this.nk1_18_ambulatoryStatus = "";
			this.nk1_19_citizenship = "";
			this.ce_nk1_20_primaryLanguage = new CE_v2();
			this.nk1_21_livingArrangement = "";
			this.ce_nk1_22_publicityIndicator = new CE_v2();
			this.nk1_23_protectionIndicator = "";
			this.nk1_24_studentIndicator = "";
			this.nk1_25_religion = "";
			this.xpn_nk1_26_mothersMaidenName = new XPN_v23();
			this.ce_nk1_27_nationalityCode = new CE_v2();
			this.nk1_28_ethnicGroup = "";
			this.ce_nk1_29_contactReason = new CE_v2();
			this.xpn_nk1_30_contactPersonsName = new XPN_v23[] {};
			this.xtn_nk1_31_contactPersonsTelephoneNumber = new XTN_v23[] {};
			this.xad_nk1_32_contactPersonsAddress = new XAD_v23[] {};
			this.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers = new CX_v23[] {};
			this.nk1_34_jobStatus = "";
			this.nk1_35_race = "";
			this.nk1_36_handicap = "";
			this.nk1_37_contactPersonSocialSecurityNumber = "";
		}
		public NK1Builder nk1_1_setId(String nk1_1_setId) {
			this.nk1_1_setId = nk1_1_setId;
			return this;
		}
		public NK1Builder xpn_nk1_2_nkName(XPN_v23[] xpn_nk1_2_nkName) {
			this.xpn_nk1_2_nkName = xpn_nk1_2_nkName;
			return this;
		}
		public NK1Builder ce_nk1_3_relationship(CE_v2 ce_nk1_3_relationship) {
			this.ce_nk1_3_relationship = ce_nk1_3_relationship;
			return this;
		}
		public NK1Builder xad_nk1_4_address(XAD_v23[] xad_nk1_4_address) {
			this.xad_nk1_4_address = xad_nk1_4_address;
			return this;
		}
		public NK1Builder xtn_nk1_5_phoneNumber(XTN_v23[] xtn_nk1_5_phoneNumber) {
			this.xtn_nk1_5_phoneNumber = xtn_nk1_5_phoneNumber;
			return this;
		}
		public NK1Builder xtn_nk1_6_businessPhoneNumber(XTN_v23[] xtn_nk1_6_businessPhoneNumber) {
			this.xtn_nk1_6_businessPhoneNumber = xtn_nk1_6_businessPhoneNumber;
			return this;
		}
		public NK1Builder ce_nk1_7_contactRole(CE_v2 ce_nk1_7_contactRole) {
			this.ce_nk1_7_contactRole = ce_nk1_7_contactRole;
			return this;
		}
		public NK1Builder nk1_8_startDate(String nk1_8_startDate) {
			this.nk1_8_startDate = nk1_8_startDate;
			return this;
		}
		public NK1Builder nk1_9_endDate(String nk1_9_endDate) {
			this.nk1_9_endDate = nk1_9_endDate;
			return this;
		}
		public NK1Builder nk1_10_nextOfKinAssociatedPartiesJodTitle(String nk1_10_nextOfKinAssociatedPartiesJodTitle) {
			this.nk1_10_nextOfKinAssociatedPartiesJodTitle = nk1_10_nextOfKinAssociatedPartiesJodTitle;
			return this;
		}
		public NK1Builder jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass(
				JCC_v23 jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass) {
			this.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass = jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
			return this;
		}
		public NK1Builder cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber(
				CX_v23 cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber) {
			this.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber = cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
			return this;
		}
		public NK1Builder xon_nk1_13_organizationName(XON_v23[] xon_nk1_13_organizationName) {
			this.xon_nk1_13_organizationName = xon_nk1_13_organizationName;
			return this;
		}
		public NK1Builder nk1_14_maritalStatus(String[] nk1_14_maritalStatus) {
			this.nk1_14_maritalStatus = nk1_14_maritalStatus;
			return this;
		}
		public NK1Builder nk1_15_sex(String nk1_15_sex) {
			this.nk1_15_sex = nk1_15_sex;
			return this;
		}
		public NK1Builder ts_nk1_16_dateOfBirth(TS_v2 ts_nk1_16_dateOfBirth) {
			this.ts_nk1_16_dateOfBirth = ts_nk1_16_dateOfBirth;
			return this;
		}
		public NK1Builder nk1_17_livingDependency(String nk1_17_livingDependency) {
			this.nk1_17_livingDependency = nk1_17_livingDependency;
			return this;
		}
		public NK1Builder nk1_18_ambulatoryStatus(String nk1_18_ambulatoryStatus) {
			this.nk1_18_ambulatoryStatus = nk1_18_ambulatoryStatus;
			return this;
		}
		public NK1Builder nk1_19_citizenship(String nk1_19_citizenship) {
			this.nk1_19_citizenship = nk1_19_citizenship;
			return this;
		}
		public NK1Builder ce_nk1_20_primaryLanguage(CE_v2 ce_nk1_20_primaryLanguage) {
			this.ce_nk1_20_primaryLanguage = ce_nk1_20_primaryLanguage;
			return this;
		}
		public NK1Builder nk1_21_livingArrangement(String nk1_21_livingArrangement) {
			this.nk1_21_livingArrangement = nk1_21_livingArrangement;
			return this;
		}
		public NK1Builder ce_nk1_22_publicityIndicator(CE_v2 ce_nk1_22_publicityIndicator) {
			this.ce_nk1_22_publicityIndicator = ce_nk1_22_publicityIndicator;
			return this;
		}
		public NK1Builder nk1_23_protectionIndicator(String nk1_23_protectionIndicator) {
			this.nk1_23_protectionIndicator = nk1_23_protectionIndicator;
			return this;
		}
		public NK1Builder nk1_24_studentIndicator(String nk1_24_studentIndicator) {
			this.nk1_24_studentIndicator = nk1_24_studentIndicator;
			return this;
		}
		public NK1Builder nk1_25_religion(String nk1_25_religion) {
			this.nk1_25_religion = nk1_25_religion;
			return this;
		}
		public NK1Builder xpn_nk1_26_mothersMaidenName(XPN_v23 xpn_nk1_26_mothersMaidenName) {
			this.xpn_nk1_26_mothersMaidenName = xpn_nk1_26_mothersMaidenName;
			return this;
		}
		public NK1Builder ce_nk1_27_nationalityCode(CE_v2 ce_nk1_27_nationalityCode) {
			this.ce_nk1_27_nationalityCode = ce_nk1_27_nationalityCode;
			return this;
		}
		public NK1Builder nk1_28_ethnicGroup(String nk1_28_ethnicGroup) {
			this.nk1_28_ethnicGroup = nk1_28_ethnicGroup;
			return this;
		}
		public NK1Builder ce_nk1_29_contactReason(CE_v2 ce_nk1_29_contactReason) {
			this.ce_nk1_29_contactReason = ce_nk1_29_contactReason;
			return this;
		}
		public NK1Builder xpn_nk1_30_contactPersonsName(XPN_v23[] xpn_nk1_30_contactPersonsName) {
			this.xpn_nk1_30_contactPersonsName = xpn_nk1_30_contactPersonsName;
			return this;
		}
		public NK1Builder xtn_nk1_31_contactPersonsTelephoneNumber(XTN_v23[] xtn_nk1_31_contactPersonsTelephoneNumber) {
			this.xtn_nk1_31_contactPersonsTelephoneNumber = xtn_nk1_31_contactPersonsTelephoneNumber;
			return this;
		}
		public NK1Builder xad_nk1_32_contactPersonsAddress(XAD_v23[] xad_nk1_32_contactPersonsAddress) {
			this.xad_nk1_32_contactPersonsAddress = xad_nk1_32_contactPersonsAddress;
			return this;
		}
		public NK1Builder cx_nk1_33_nextOfKinAssociatedPartyIdentifiers(CX_v23[] cx_nk1_33_nextOfKinAssociatedPartyIdentifiers) {
			this.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers = cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
			return this;
		}
		public NK1Builder nk1_34_jobStatus(String nk1_34_jobStatus) {
			this.nk1_34_jobStatus = nk1_34_jobStatus;
			return this;
		}
		public NK1Builder nk1_35_race(String nk1_35_race) {
			this.nk1_35_race = nk1_35_race;
			return this;
		}
		public NK1Builder nk1_36_handicap(String nk1_36_handicap) {
			this.nk1_36_handicap = nk1_36_handicap;
			return this;
		}
		public NK1Builder nk1_37_contactPersonSocialSecurityNumber(String nk1_37_contactPersonSocialSecurityNumber) {
			this.nk1_37_contactPersonSocialSecurityNumber = nk1_37_contactPersonSocialSecurityNumber;
			return this;
		}
		public JsonNK1_v23 build() {
			return new JsonNK1_v23(this);
		}
	}
	public String getNk1_1_setId() {
		return nk1_1_setId;
	}
	public XPN_v23[] getXpn_nk1_2_nkName() {
		return xpn_nk1_2_nkName;
	}
	public CE_v2 getCe_nk1_3_relationship() {
		return ce_nk1_3_relationship;
	}
	public XAD_v23[] getXad_nk1_4_address() {
		return xad_nk1_4_address;
	}
	public XTN_v23[] getXtn_nk1_5_phoneNumber() {
		return xtn_nk1_5_phoneNumber;
	}
	public XTN_v23[] getXtn_nk1_6_businessPhoneNumber() {
		return xtn_nk1_6_businessPhoneNumber;
	}
	public CE_v2 getCe_nk1_7_contactRole() {
		return ce_nk1_7_contactRole;
	}
	public String getNk1_8_startDate() {
		return nk1_8_startDate;
	}
	public String getNk1_9_endDate() {
		return nk1_9_endDate;
	}
	public String getNk1_10_nextOfKinAssociatedPartiesJodTitle() {
		return nk1_10_nextOfKinAssociatedPartiesJodTitle;
	}
	public JCC_v23 getJcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass() {
		return jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
	}
	public CX_v23 getCx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber() {
		return cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
	}
	public XON_v23[] getXon_nk1_13_organizationName() {
		return xon_nk1_13_organizationName;
	}
	public String[] getNk1_14_maritalStatus() {
		return nk1_14_maritalStatus;
	}
	public String getNk1_15_sex() {
		return nk1_15_sex;
	}
	public TS_v2 getTs_nk1_16_dateOfBirth() {
		return ts_nk1_16_dateOfBirth;
	}
	public String getNk1_17_livingDependency() {
		return nk1_17_livingDependency;
	}
	public String getNk1_18_ambulatoryStatus() {
		return nk1_18_ambulatoryStatus;
	}
	public String getNk1_19_citizenship() {
		return nk1_19_citizenship;
	}
	public CE_v2 getCe_nk1_20_primaryLanguage() {
		return ce_nk1_20_primaryLanguage;
	}
	public String getNk1_21_livingArrangement() {
		return nk1_21_livingArrangement;
	}
	public CE_v2 getCe_nk1_22_publicityIndicator() {
		return ce_nk1_22_publicityIndicator;
	}
	public String getNk1_23_protectionIndicator() {
		return nk1_23_protectionIndicator;
	}
	public String getNk1_24_studentIndicator() {
		return nk1_24_studentIndicator;
	}
	public String getNk1_25_religion() {
		return nk1_25_religion;
	}
	public XPN_v23 getXpn_nk1_26_mothersMaidenName() {
		return xpn_nk1_26_mothersMaidenName;
	}
	public CE_v2 getCe_nk1_27_nationalityCode() {
		return ce_nk1_27_nationalityCode;
	}
	public String getNk1_28_ethnicGroup() {
		return nk1_28_ethnicGroup;
	}
	public CE_v2 getCe_nk1_29_contactReason() {
		return ce_nk1_29_contactReason;
	}
	public XPN_v23[] getXpn_nk1_30_contactPersonsName() {
		return xpn_nk1_30_contactPersonsName;
	}
	public XTN_v23[] getXtn_nk1_31_contactPersonsTelephoneNumber() {
		return xtn_nk1_31_contactPersonsTelephoneNumber;
	}
	public XAD_v23[] getXad_nk1_32_contactPersonsAddress() {
		return xad_nk1_32_contactPersonsAddress;
	}
	public CX_v23[] getCx_nk1_33_nextOfKinAssociatedPartyIdentifiers() {
		return cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
	}
	public String getNk1_34_jobStatus() {
		return nk1_34_jobStatus;
	}
	public String getNk1_35_race() {
		return nk1_35_race;
	}
	public String getNk1_36_handicap() {
		return nk1_36_handicap;
	}
	public String getNk1_37_contactPersonSocialSecurityNumber() {
		return nk1_37_contactPersonSocialSecurityNumber;
	}
	@Override
	public String toString() {
		return "JsonNK1_v23 [nk1_1_setId=" + nk1_1_setId + ", xpn_nk1_2_nkName=" + Arrays.toString(xpn_nk1_2_nkName)
				+ ", ce_nk1_3_relationship=" + ce_nk1_3_relationship + ", xad_nk1_4_address="
				+ Arrays.toString(xad_nk1_4_address) + ", xtn_nk1_5_phoneNumber="
				+ Arrays.toString(xtn_nk1_5_phoneNumber) + ", xtn_nk1_6_businessPhoneNumber="
				+ Arrays.toString(xtn_nk1_6_businessPhoneNumber) + ", ce_nk1_7_contactRole=" + ce_nk1_7_contactRole
				+ ", nk1_8_startDate=" + nk1_8_startDate + ", nk1_9_endDate=" + nk1_9_endDate
				+ ", nk1_10_nextOfKinAssociatedPartiesJodTitle=" + nk1_10_nextOfKinAssociatedPartiesJodTitle
				+ ", jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass="
				+ jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass
				+ ", cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber="
				+ cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber + ", xon_nk1_13_organizationName="
				+ Arrays.toString(xon_nk1_13_organizationName) + ", nk1_14_maritalStatus="
				+ Arrays.toString(nk1_14_maritalStatus) + ", nk1_15_sex=" + nk1_15_sex + ", ts_nk1_16_dateOfBirth="
				+ ts_nk1_16_dateOfBirth + ", nk1_17_livingDependency=" + nk1_17_livingDependency
				+ ", nk1_18_ambulatoryStatus=" + nk1_18_ambulatoryStatus + ", nk1_19_citizenship=" + nk1_19_citizenship
				+ ", ce_nk1_20_primaryLanguage=" + ce_nk1_20_primaryLanguage + ", nk1_21_livingArrangement="
				+ nk1_21_livingArrangement + ", ce_nk1_22_publicityIndicator=" + ce_nk1_22_publicityIndicator
				+ ", nk1_23_protectionIndicator=" + nk1_23_protectionIndicator + ", nk1_24_studentIndicator="
				+ nk1_24_studentIndicator + ", nk1_25_religion=" + nk1_25_religion + ", xpn_nk1_26_mothersMaidenName="
				+ xpn_nk1_26_mothersMaidenName + ", ce_nk1_27_nationalityCode=" + ce_nk1_27_nationalityCode
				+ ", nk1_28_ethnicGroup=" + nk1_28_ethnicGroup + ", ce_nk1_29_contactReason=" + ce_nk1_29_contactReason
				+ ", xpn_nk1_30_contactPersonsName=" + Arrays.toString(xpn_nk1_30_contactPersonsName)
				+ ", xtn_nk1_31_contactPersonsTelephoneNumber="
				+ Arrays.toString(xtn_nk1_31_contactPersonsTelephoneNumber) + ", xad_nk1_32_contactPersonsAddress="
				+ Arrays.toString(xad_nk1_32_contactPersonsAddress) + ", cx_nk1_33_nextOfKinAssociatedPartyIdentifiers="
				+ Arrays.toString(cx_nk1_33_nextOfKinAssociatedPartyIdentifiers) + ", nk1_34_jobStatus="
				+ nk1_34_jobStatus + ", nk1_35_race=" + nk1_35_race + ", nk1_36_handicap=" + nk1_36_handicap
				+ ", nk1_37_contactPersonSocialSecurityNumber=" + nk1_37_contactPersonSocialSecurityNumber + "]";
	}
}
