package scratch.coding.segment.v23;


import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.FC_v23;
import scratch.coding.models.v23.JCC_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;


@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonGT1_v23 {
	@JsonProperty("gt1_1_setId")
	private String gt1_1_setId;
	@JsonProperty("cx_gt1_2_guarantorNumber")
	private CX_v23[] cx_gt1_2_guarantorNumber;
	@JsonProperty("xpn_gt1_3_guarantorName")
	private XPN_v23[] xpn_gt1_3_guarantorName;
	@JsonProperty("xpn_gt1_4_guarantorSpouseName")
	private XPN_v23[] xpn_gt1_4_guarantorSpouseName;
	@JsonProperty("xad_gt1_5_guarantorAddress")
	private XAD_v23[] xad_gt1_5_guarantorAddress;
	@JsonProperty("xtn_gt1_6_guarantorPhoneNumberHome")
	private XTN_v23[] xtn_gt1_6_guarantorPhoneNumberHome;
	@JsonProperty("xtn_gt1_7_guarantorPhoneNumberBusiness")
	private XTN_v23[] xtn_gt1_7_guarantorPhoneNumberBusiness;
	@JsonProperty("ts_gt1_8_guarantorDateTimeOfBirth")
	private TS_v2 ts_gt1_8_guarantorDateTimeOfBirth;
	@JsonProperty("gt1_9_guarantorSex")
	private String gt1_9_guarantorSex;
	@JsonProperty("gt1_10_guarantorType")
	private String gt1_10_guarantorType;
	@JsonProperty("gt1_11_guarantorRelationship")
	private String gt1_11_guarantorRelationship;
	@JsonProperty("gt1_12_guarantorSSN")
	private String gt1_12_guarantorSSN;
	@JsonProperty("gt1_13_guarantorDateBegin")
	private String gt1_13_guarantorDateBegin;
	@JsonProperty("gt1_14_guarantorDateEnd")
	private String gt1_14_guarantorDateEnd;
	@JsonProperty("gt1_15_guarantorPriority")
	private String gt1_15_guarantorPriority;
	@JsonProperty("xpn_gt1_16_guarantorEmployerName")
	private XPN_v23[] xpn_gt1_16_guarantorEmployerName;
	@JsonProperty("xad_gt1_17_guarantorEmployerAddress")
	private XAD_v23[] xad_gt1_17_guarantorEmployerAddress;
	@JsonProperty("xtn_gt1_18_guarantorEmployerPhoneNumber")
	private XTN_v23[] xtn_gt1_18_guarantorEmployerPhoneNumber;
	@JsonProperty("cx_gt1_19_guarantorEmployeeIdNumber")
	private CX_v23[] cx_gt1_19_guarantorEmployeeIdNumber;
	@JsonProperty("gt1_20_guarantorEmploymentStatus")
	private String gt1_20_guarantorEmploymentStatus;
	@JsonProperty("xon_gt1_21_guarantorOrganization")
	private XON_v23[] xon_gt1_21_guarantorOrganization;
	@JsonProperty("gt1_22_guarantorBillingHoldFlag")
	private String gt1_22_guarantorBillingHoldFlag;
	@JsonProperty("ce_gt1_23_guarantorCreditRatingCode")
	private CE_v2 ce_gt1_23_guarantorCreditRatingCode;
	@JsonProperty("ts_gt1_24_guarantorDeathDateAndTime")
	private TS_v2 ts_gt1_24_guarantorDeathDateAndTime;
	@JsonProperty("gt1_25_guarantorDeathFlag")
	private String gt1_25_guarantorDeathFlag;
	@JsonProperty("ce_gt1_26_guarantorChargeAdjustmentCode")
	private CE_v2 ce_gt1_26_guarantorChargeAdjustmentCode;
	@JsonProperty("cp_gt1_27_guarantorHouseHoldAnnualIncome")
	private CP_v2 cp_gt1_27_guarantorHouseHoldAnnualIncome;
	@JsonProperty("gt1_28_guarantorHouseholdSize")
	private String gt1_28_guarantorHouseholdSize;
	@JsonProperty("cx_gt1_29_guarantorEmployerIdNumber")
	private CX_v23[] cx_gt1_29_guarantorEmployerIdNumber;
	@JsonProperty("gt1_30_guarantorMaritalStatusCode")
	private String gt1_30_guarantorMaritalStatusCode;
	@JsonProperty("gt1_31_guarantorHireEffectiveDate")
	private String gt1_31_guarantorHireEffectiveDate;
	@JsonProperty("gt1_32_employmentStopDate")
	private String gt1_32_employmentStopDate;
	@JsonProperty("gt1_33_livingDependency")
	private String gt1_33_livingDependency;
	@JsonProperty("gt1_34_ambulatoryStatusCode")
	private String gt1_34_ambulatoryStatusCode;
	@JsonProperty("gt1_35_citizenship")
	private String gt1_35_citizenship;
	@JsonProperty("ce_gt1_36_primaryLanguage")
	private CE_v2 ce_gt1_36_primaryLanguage;
	@JsonProperty("gt1_37_livingArrangement")
	private String gt1_37_livingArrangement;
	@JsonProperty("ce_gt1_38_publicityIndicator")
	private CE_v2 ce_gt1_38_publicityIndicator;
	@JsonProperty("gt1_39_protectionIndicator")
	private String gt1_39_protectionIndicator;
	@JsonProperty("gt1_40_studentIndicator")
	private String gt1_40_studentIndicator;
	@JsonProperty("gt1_41_religion")
	private String gt1_41_religion;
	@JsonProperty("xpn_gt1_42_mothersMaidenName")
	private XPN_v23 xpn_gt1_42_mothersMaidenName;
	@JsonProperty("ce_gt1_43_nationalityCode")
	private CE_v2 ce_gt1_43_nationalityCode;
	@JsonProperty("gt1_44_ethnicGroup")
	private String gt1_44_ethnicGroup;
	@JsonProperty("xpn_gt1_45_contactPersonsName")
	private XPN_v23[] xpn_gt1_45_contactPersonsName;
	@JsonProperty("xtn_gt1_46_contactPersonsTelephoneNumber")
	private XTN_v23[] xtn_gt1_46_contactPersonsTelephoneNumber;
	@JsonProperty("ce_gt1_47_contactReason")
	private CE_v2 ce_gt1_47_contactReason;
	@JsonProperty("gt1_48_contactRelationshipCode")
	private String gt1_48_contactRelationshipCode;
	@JsonProperty("gt1_49_jobTitle")
	private String gt1_49_jobTitle;
	@JsonProperty("jcc_gt1_50_jobCodeClass")
	private JCC_v23 jcc_gt1_50_jobCodeClass;
	@JsonProperty("xon_gt1_51_guarantorEmployersOrganizationName")
	private XON_v23[] xon_gt1_51_guarantorEmployersOrganizationName;
	@JsonProperty("gt1_52_handicap")
	private String gt1_52_handicap;
	@JsonProperty("gt1_53_jobStatus")
	private String gt1_53_jobStatus;
	@JsonProperty("fc_gt1_54_guarantorFinancialClass")
	private FC_v23 fc_gt1_54_guarantorFinancialClass;
	@JsonProperty("gt1_55_guarantorRace")
	private String gt1_55_guarantorRace;
	public JsonGT1_v23(GT1Builder builder) {
		super();
		this.gt1_1_setId = builder.gt1_1_setId;
		this.cx_gt1_2_guarantorNumber = builder.cx_gt1_2_guarantorNumber;
		this.xpn_gt1_3_guarantorName = builder.xpn_gt1_3_guarantorName;
		this.xpn_gt1_4_guarantorSpouseName = builder.xpn_gt1_4_guarantorSpouseName;
		this.xad_gt1_5_guarantorAddress = builder.xad_gt1_5_guarantorAddress;
		this.xtn_gt1_6_guarantorPhoneNumberHome = builder.xtn_gt1_6_guarantorPhoneNumberHome;
		this.xtn_gt1_7_guarantorPhoneNumberBusiness = builder.xtn_gt1_7_guarantorPhoneNumberBusiness;
		this.ts_gt1_8_guarantorDateTimeOfBirth = builder.ts_gt1_8_guarantorDateTimeOfBirth;
		this.gt1_9_guarantorSex = builder.gt1_9_guarantorSex;
		this.gt1_10_guarantorType = builder.gt1_10_guarantorType;
		this.gt1_11_guarantorRelationship = builder.gt1_11_guarantorRelationship;
		this.gt1_12_guarantorSSN = builder.gt1_12_guarantorSSN;
		this.gt1_13_guarantorDateBegin = builder.gt1_13_guarantorDateBegin;
		this.gt1_14_guarantorDateEnd = builder.gt1_14_guarantorDateEnd;
		this.gt1_15_guarantorPriority = builder.gt1_15_guarantorPriority;
		this.xpn_gt1_16_guarantorEmployerName = builder.xpn_gt1_16_guarantorEmployerName;
		this.xad_gt1_17_guarantorEmployerAddress = builder.xad_gt1_17_guarantorEmployerAddress;
		this.xtn_gt1_18_guarantorEmployerPhoneNumber = builder.xtn_gt1_18_guarantorEmployerPhoneNumber;
		this.cx_gt1_19_guarantorEmployeeIdNumber = builder.cx_gt1_19_guarantorEmployeeIdNumber;
		this.gt1_20_guarantorEmploymentStatus = builder.gt1_20_guarantorEmploymentStatus;
		this.xon_gt1_21_guarantorOrganization = builder.xon_gt1_21_guarantorOrganization;
		this.gt1_22_guarantorBillingHoldFlag = builder.gt1_22_guarantorBillingHoldFlag;
		this.ce_gt1_23_guarantorCreditRatingCode = builder.ce_gt1_23_guarantorCreditRatingCode;
		this.ts_gt1_24_guarantorDeathDateAndTime = builder.ts_gt1_24_guarantorDeathDateAndTime;
		this.gt1_25_guarantorDeathFlag = builder.gt1_25_guarantorDeathFlag;
		this.ce_gt1_26_guarantorChargeAdjustmentCode = builder.ce_gt1_26_guarantorChargeAdjustmentCode;
		this.cp_gt1_27_guarantorHouseHoldAnnualIncome = builder.cp_gt1_27_guarantorHouseHoldAnnualIncome;
		this.gt1_28_guarantorHouseholdSize = builder.gt1_28_guarantorHouseholdSize;
		this.cx_gt1_29_guarantorEmployerIdNumber = builder.cx_gt1_29_guarantorEmployerIdNumber;
		this.gt1_30_guarantorMaritalStatusCode = builder.gt1_30_guarantorMaritalStatusCode;
		this.gt1_31_guarantorHireEffectiveDate = builder.gt1_31_guarantorHireEffectiveDate;
		this.gt1_32_employmentStopDate = builder.gt1_32_employmentStopDate;
		this.gt1_33_livingDependency = builder.gt1_33_livingDependency;
		this.gt1_34_ambulatoryStatusCode = builder.gt1_34_ambulatoryStatusCode;
		this.gt1_35_citizenship = builder.gt1_35_citizenship;
		this.ce_gt1_36_primaryLanguage = builder.ce_gt1_36_primaryLanguage;
		this.gt1_37_livingArrangement = builder.gt1_37_livingArrangement;
		this.ce_gt1_38_publicityIndicator = builder.ce_gt1_38_publicityIndicator;
		this.gt1_39_protectionIndicator = builder.gt1_39_protectionIndicator;
		this.gt1_40_studentIndicator = builder.gt1_40_studentIndicator;
		this.gt1_41_religion = builder.gt1_41_religion;
		this.xpn_gt1_42_mothersMaidenName = builder.xpn_gt1_42_mothersMaidenName;
		this.ce_gt1_43_nationalityCode = builder.ce_gt1_43_nationalityCode;
		this.gt1_44_ethnicGroup = builder.gt1_44_ethnicGroup;
		this.xpn_gt1_45_contactPersonsName = builder.xpn_gt1_45_contactPersonsName;
		this.xtn_gt1_46_contactPersonsTelephoneNumber = builder.xtn_gt1_46_contactPersonsTelephoneNumber;
		this.ce_gt1_47_contactReason = builder.ce_gt1_47_contactReason;
		this.gt1_48_contactRelationshipCode = builder.gt1_48_contactRelationshipCode;
		this.gt1_49_jobTitle = builder.gt1_49_jobTitle;
		this.jcc_gt1_50_jobCodeClass = builder.jcc_gt1_50_jobCodeClass;
		this.xon_gt1_51_guarantorEmployersOrganizationName = builder.xon_gt1_51_guarantorEmployersOrganizationName;
		this.gt1_52_handicap = builder.gt1_52_handicap;
		this.gt1_53_jobStatus = builder.gt1_53_jobStatus;
		this.fc_gt1_54_guarantorFinancialClass = builder.fc_gt1_54_guarantorFinancialClass;
		this.gt1_55_guarantorRace = builder.gt1_55_guarantorRace;
	}
	
	public JsonGT1_v23(String gt1_1_setId, CX_v23[] cx_gt1_2_guarantorNumber, XPN_v23[] xpn_gt1_3_guarantorName,
			XPN_v23[] xpn_gt1_4_guarantorSpouseName, XAD_v23[] xad_gt1_5_guarantorAddress,
			XTN_v23[] xtn_gt1_6_guarantorPhoneNumberHome, XTN_v23[] xtn_gt1_7_guarantorPhoneNumberBusiness,
			TS_v2 ts_gt1_8_guarantorDateTimeOfBirth, String gt1_9_guarantorSex, String gt1_10_guarantorType,
			String gt1_11_guarantorRelationship, String gt1_12_guarantorSSN, String gt1_13_guarantorDateBegin,
			String gt1_14_guarantorDateEnd, String gt1_15_guarantorPriority, XPN_v23[] xpn_gt1_16_guarantorEmployerName,
			XAD_v23[] xad_gt1_17_guarantorEmployerAddress, XTN_v23[] xtn_gt1_18_guarantorEmployerPhoneNumber,
			CX_v23[] cx_gt1_19_guarantorEmployeeIdNumber, String gt1_20_guarantorEmploymentStatus,
			XON_v23[] xon_gt1_21_guarantorOrganization, String gt1_22_guarantorBillingHoldFlag,
			CE_v2 ce_gt1_23_guarantorCreditRatingCode, TS_v2 ts_gt1_24_guarantorDeathDateAndTime,
			String gt1_25_guarantorDeathFlag, CE_v2 ce_gt1_26_guarantorChargeAdjustmentCode,
			CP_v2 cp_gt1_27_guarantorHouseHoldAnnualIncome, String gt1_28_guarantorHouseholdSize,
			CX_v23[] cx_gt1_29_guarantorEmployerIdNumber, String gt1_30_guarantorMaritalStatusCode,
			String gt1_31_guarantorHireEffectiveDate, String gt1_32_employmentStopDate, String gt1_33_livingDependency,
			String gt1_34_ambulatoryStatusCode, String gt1_35_citizenship, CE_v2 ce_gt1_36_primaryLanguage,
			String gt1_37_livingArrangement, CE_v2 ce_gt1_38_publicityIndicator, String gt1_39_protectionIndicator,
			String gt1_40_studentIndicator, String gt1_41_religion, XPN_v23 xpn_gt1_42_mothersMaidenName,
			CE_v2 ce_gt1_43_nationalityCode, String gt1_44_ethnicGroup, XPN_v23[] xpn_gt1_45_contactPersonsName,
			XTN_v23[] xtn_gt1_46_contactPersonsTelephoneNumber, CE_v2 ce_gt1_47_contactReason,
			String gt1_48_contactRelationshipCode, String gt1_49_jobTitle, JCC_v23 jcc_gt1_50_jobCodeClass,
			XON_v23[] xon_gt1_51_guarantorEmployersOrganizationName, String gt1_52_handicap, String gt1_53_jobStatus,
			FC_v23 fc_gt1_54_guarantorFinancialClass, String gt1_55_guarantorRace) {
		super();
		this.gt1_1_setId = gt1_1_setId;
		this.cx_gt1_2_guarantorNumber = cx_gt1_2_guarantorNumber;
		this.xpn_gt1_3_guarantorName = xpn_gt1_3_guarantorName;
		this.xpn_gt1_4_guarantorSpouseName = xpn_gt1_4_guarantorSpouseName;
		this.xad_gt1_5_guarantorAddress = xad_gt1_5_guarantorAddress;
		this.xtn_gt1_6_guarantorPhoneNumberHome = xtn_gt1_6_guarantorPhoneNumberHome;
		this.xtn_gt1_7_guarantorPhoneNumberBusiness = xtn_gt1_7_guarantorPhoneNumberBusiness;
		this.ts_gt1_8_guarantorDateTimeOfBirth = ts_gt1_8_guarantorDateTimeOfBirth;
		this.gt1_9_guarantorSex = gt1_9_guarantorSex;
		this.gt1_10_guarantorType = gt1_10_guarantorType;
		this.gt1_11_guarantorRelationship = gt1_11_guarantorRelationship;
		this.gt1_12_guarantorSSN = gt1_12_guarantorSSN;
		this.gt1_13_guarantorDateBegin = gt1_13_guarantorDateBegin;
		this.gt1_14_guarantorDateEnd = gt1_14_guarantorDateEnd;
		this.gt1_15_guarantorPriority = gt1_15_guarantorPriority;
		this.xpn_gt1_16_guarantorEmployerName = xpn_gt1_16_guarantorEmployerName;
		this.xad_gt1_17_guarantorEmployerAddress = xad_gt1_17_guarantorEmployerAddress;
		this.xtn_gt1_18_guarantorEmployerPhoneNumber = xtn_gt1_18_guarantorEmployerPhoneNumber;
		this.cx_gt1_19_guarantorEmployeeIdNumber = cx_gt1_19_guarantorEmployeeIdNumber;
		this.gt1_20_guarantorEmploymentStatus = gt1_20_guarantorEmploymentStatus;
		this.xon_gt1_21_guarantorOrganization = xon_gt1_21_guarantorOrganization;
		this.gt1_22_guarantorBillingHoldFlag = gt1_22_guarantorBillingHoldFlag;
		this.ce_gt1_23_guarantorCreditRatingCode = ce_gt1_23_guarantorCreditRatingCode;
		this.ts_gt1_24_guarantorDeathDateAndTime = ts_gt1_24_guarantorDeathDateAndTime;
		this.gt1_25_guarantorDeathFlag = gt1_25_guarantorDeathFlag;
		this.ce_gt1_26_guarantorChargeAdjustmentCode = ce_gt1_26_guarantorChargeAdjustmentCode;
		this.cp_gt1_27_guarantorHouseHoldAnnualIncome = cp_gt1_27_guarantorHouseHoldAnnualIncome;
		this.gt1_28_guarantorHouseholdSize = gt1_28_guarantorHouseholdSize;
		this.cx_gt1_29_guarantorEmployerIdNumber = cx_gt1_29_guarantorEmployerIdNumber;
		this.gt1_30_guarantorMaritalStatusCode = gt1_30_guarantorMaritalStatusCode;
		this.gt1_31_guarantorHireEffectiveDate = gt1_31_guarantorHireEffectiveDate;
		this.gt1_32_employmentStopDate = gt1_32_employmentStopDate;
		this.gt1_33_livingDependency = gt1_33_livingDependency;
		this.gt1_34_ambulatoryStatusCode = gt1_34_ambulatoryStatusCode;
		this.gt1_35_citizenship = gt1_35_citizenship;
		this.ce_gt1_36_primaryLanguage = ce_gt1_36_primaryLanguage;
		this.gt1_37_livingArrangement = gt1_37_livingArrangement;
		this.ce_gt1_38_publicityIndicator = ce_gt1_38_publicityIndicator;
		this.gt1_39_protectionIndicator = gt1_39_protectionIndicator;
		this.gt1_40_studentIndicator = gt1_40_studentIndicator;
		this.gt1_41_religion = gt1_41_religion;
		this.xpn_gt1_42_mothersMaidenName = xpn_gt1_42_mothersMaidenName;
		this.ce_gt1_43_nationalityCode = ce_gt1_43_nationalityCode;
		this.gt1_44_ethnicGroup = gt1_44_ethnicGroup;
		this.xpn_gt1_45_contactPersonsName = xpn_gt1_45_contactPersonsName;
		this.xtn_gt1_46_contactPersonsTelephoneNumber = xtn_gt1_46_contactPersonsTelephoneNumber;
		this.ce_gt1_47_contactReason = ce_gt1_47_contactReason;
		this.gt1_48_contactRelationshipCode = gt1_48_contactRelationshipCode;
		this.gt1_49_jobTitle = gt1_49_jobTitle;
		this.jcc_gt1_50_jobCodeClass = jcc_gt1_50_jobCodeClass;
		this.xon_gt1_51_guarantorEmployersOrganizationName = xon_gt1_51_guarantorEmployersOrganizationName;
		this.gt1_52_handicap = gt1_52_handicap;
		this.gt1_53_jobStatus = gt1_53_jobStatus;
		this.fc_gt1_54_guarantorFinancialClass = fc_gt1_54_guarantorFinancialClass;
		this.gt1_55_guarantorRace = gt1_55_guarantorRace;
	}
	public JsonGT1_v23() {
		super();
		this.gt1_1_setId = "";
		this.cx_gt1_2_guarantorNumber = new CX_v23[] {};
		this.xpn_gt1_3_guarantorName = new XPN_v23[] {};
		this.xpn_gt1_4_guarantorSpouseName = new XPN_v23[] {};
		this.xad_gt1_5_guarantorAddress = new XAD_v23[] {};
		this.xtn_gt1_6_guarantorPhoneNumberHome = new XTN_v23[] {};
		this.xtn_gt1_7_guarantorPhoneNumberBusiness = new XTN_v23[] {};
		this.ts_gt1_8_guarantorDateTimeOfBirth = new TS_v2();
		this.gt1_9_guarantorSex = "";
		this.gt1_10_guarantorType = "";
		this.gt1_11_guarantorRelationship = "";
		this.gt1_12_guarantorSSN = "";
		this.gt1_13_guarantorDateBegin = "";
		this.gt1_14_guarantorDateEnd = "";
		this.gt1_15_guarantorPriority = "";
		this.xpn_gt1_16_guarantorEmployerName = new XPN_v23[] {};
		this.xad_gt1_17_guarantorEmployerAddress = new XAD_v23[] {};
		this.xtn_gt1_18_guarantorEmployerPhoneNumber = new XTN_v23[] {};
		this.cx_gt1_19_guarantorEmployeeIdNumber = new CX_v23[] {};
		this.gt1_20_guarantorEmploymentStatus = "";
		this.xon_gt1_21_guarantorOrganization = new XON_v23[] {};
		this.gt1_22_guarantorBillingHoldFlag = "";
		this.ce_gt1_23_guarantorCreditRatingCode = new CE_v2();
		this.ts_gt1_24_guarantorDeathDateAndTime = new TS_v2();
		this.gt1_25_guarantorDeathFlag = "";
		this.ce_gt1_26_guarantorChargeAdjustmentCode = new CE_v2();
		this.cp_gt1_27_guarantorHouseHoldAnnualIncome = new CP_v2();
		this.gt1_28_guarantorHouseholdSize = "";
		this.cx_gt1_29_guarantorEmployerIdNumber = new CX_v23[] {};
		this.gt1_30_guarantorMaritalStatusCode = "";
		this.gt1_31_guarantorHireEffectiveDate = "";
		this.gt1_32_employmentStopDate = "";
		this.gt1_33_livingDependency = "";
		this.gt1_34_ambulatoryStatusCode = "";
		this.gt1_35_citizenship = "";
		this.ce_gt1_36_primaryLanguage = new CE_v2();
		this.gt1_37_livingArrangement = "";
		this.ce_gt1_38_publicityIndicator = new CE_v2();
		this.gt1_39_protectionIndicator = "";
		this.gt1_40_studentIndicator = "";
		this.gt1_41_religion = "";
		this.xpn_gt1_42_mothersMaidenName = new XPN_v23();
		this.ce_gt1_43_nationalityCode = new CE_v2();
		this.gt1_44_ethnicGroup = "";
		this.xpn_gt1_45_contactPersonsName = new XPN_v23[] {};
		this.xtn_gt1_46_contactPersonsTelephoneNumber = new XTN_v23[] {};
		this.ce_gt1_47_contactReason = new CE_v2();
		this.gt1_48_contactRelationshipCode = "";
		this.gt1_49_jobTitle = "";
		this.jcc_gt1_50_jobCodeClass = new JCC_v23();
		this.xon_gt1_51_guarantorEmployersOrganizationName = new XON_v23[] {};
		this.gt1_52_handicap = "";
		this.gt1_53_jobStatus = "";
		this.fc_gt1_54_guarantorFinancialClass = new FC_v23();
		this.gt1_55_guarantorRace = "";
	}
	public static class GT1Builder {
		private String gt1_1_setId;
		private CX_v23[] cx_gt1_2_guarantorNumber;
		private XPN_v23[] xpn_gt1_3_guarantorName;
		private XPN_v23[] xpn_gt1_4_guarantorSpouseName;
		private XAD_v23[] xad_gt1_5_guarantorAddress;
		private XTN_v23[] xtn_gt1_6_guarantorPhoneNumberHome;
		private XTN_v23[] xtn_gt1_7_guarantorPhoneNumberBusiness;
		private TS_v2 ts_gt1_8_guarantorDateTimeOfBirth;
		private String gt1_9_guarantorSex;
		private String gt1_10_guarantorType;
		private String gt1_11_guarantorRelationship;
		private String gt1_12_guarantorSSN;
		private String gt1_13_guarantorDateBegin;
		private String gt1_14_guarantorDateEnd;
		private String gt1_15_guarantorPriority;
		private XPN_v23[] xpn_gt1_16_guarantorEmployerName;
		private XAD_v23[] xad_gt1_17_guarantorEmployerAddress;
		private XTN_v23[] xtn_gt1_18_guarantorEmployerPhoneNumber;
		private CX_v23[] cx_gt1_19_guarantorEmployeeIdNumber;
		private String gt1_20_guarantorEmploymentStatus;
		private XON_v23[] xon_gt1_21_guarantorOrganization;
		private String gt1_22_guarantorBillingHoldFlag;
		private CE_v2 ce_gt1_23_guarantorCreditRatingCode;
		private TS_v2 ts_gt1_24_guarantorDeathDateAndTime;
		private String gt1_25_guarantorDeathFlag;
		private CE_v2 ce_gt1_26_guarantorChargeAdjustmentCode;
		private CP_v2 cp_gt1_27_guarantorHouseHoldAnnualIncome;
		private String gt1_28_guarantorHouseholdSize;
		private CX_v23[] cx_gt1_29_guarantorEmployerIdNumber;
		private String gt1_30_guarantorMaritalStatusCode;
		private String gt1_31_guarantorHireEffectiveDate;
		private String gt1_32_employmentStopDate;
		private String gt1_33_livingDependency;
		private String gt1_34_ambulatoryStatusCode;
		private String gt1_35_citizenship;
		private CE_v2 ce_gt1_36_primaryLanguage;
		private String gt1_37_livingArrangement;
		private CE_v2 ce_gt1_38_publicityIndicator;
		private String gt1_39_protectionIndicator;
		private String gt1_40_studentIndicator;
		private String gt1_41_religion;
		private XPN_v23 xpn_gt1_42_mothersMaidenName;
		private CE_v2 ce_gt1_43_nationalityCode;
		private String gt1_44_ethnicGroup;
		private XPN_v23[] xpn_gt1_45_contactPersonsName;
		private XTN_v23[] xtn_gt1_46_contactPersonsTelephoneNumber;
		private CE_v2 ce_gt1_47_contactReason;
		private String gt1_48_contactRelationshipCode;
		private String gt1_49_jobTitle;
		private JCC_v23 jcc_gt1_50_jobCodeClass;
		private XON_v23[] xon_gt1_51_guarantorEmployersOrganizationName;
		private String gt1_52_handicap;
		private String gt1_53_jobStatus;
		private FC_v23 fc_gt1_54_guarantorFinancialClass;
		private String gt1_55_guarantorRace;
		public GT1Builder(String gt1_1_setId, XPN_v23[] xpn_gt1_3_guarantorName) {
			super();
			this.gt1_1_setId = gt1_1_setId;
			this.cx_gt1_2_guarantorNumber = new CX_v23[] {};
			this.xpn_gt1_3_guarantorName = new XPN_v23[] {};
			this.xpn_gt1_4_guarantorSpouseName = new XPN_v23[] {};
			this.xad_gt1_5_guarantorAddress = new XAD_v23[] {};
			this.xtn_gt1_6_guarantorPhoneNumberHome = new XTN_v23[] {};
			this.xtn_gt1_7_guarantorPhoneNumberBusiness = new XTN_v23[] {};
			this.ts_gt1_8_guarantorDateTimeOfBirth = new TS_v2();
			this.gt1_9_guarantorSex = "";
			this.gt1_10_guarantorType = "";
			this.gt1_11_guarantorRelationship = "";
			this.gt1_12_guarantorSSN = "";
			this.gt1_13_guarantorDateBegin = "";
			this.gt1_14_guarantorDateEnd = "";
			this.gt1_15_guarantorPriority = "";
			this.xpn_gt1_16_guarantorEmployerName = new XPN_v23[] {};
			this.xad_gt1_17_guarantorEmployerAddress = new XAD_v23[] {};
			this.xtn_gt1_18_guarantorEmployerPhoneNumber = new XTN_v23[] {};
			this.cx_gt1_19_guarantorEmployeeIdNumber = new CX_v23[] {};
			this.gt1_20_guarantorEmploymentStatus = "";
			this.xon_gt1_21_guarantorOrganization = new XON_v23[] {};
			this.gt1_22_guarantorBillingHoldFlag = "";
			this.ce_gt1_23_guarantorCreditRatingCode = new CE_v2();
			this.ts_gt1_24_guarantorDeathDateAndTime = new TS_v2();
			this.gt1_25_guarantorDeathFlag = "";
			this.ce_gt1_26_guarantorChargeAdjustmentCode = new CE_v2();
			this.cp_gt1_27_guarantorHouseHoldAnnualIncome = new CP_v2();
			this.gt1_28_guarantorHouseholdSize = "";
			this.cx_gt1_29_guarantorEmployerIdNumber = new CX_v23[] {};
			this.gt1_30_guarantorMaritalStatusCode = "";
			this.gt1_31_guarantorHireEffectiveDate = "";
			this.gt1_32_employmentStopDate = "";
			this.gt1_33_livingDependency = "";
			this.gt1_34_ambulatoryStatusCode = "";
			this.gt1_35_citizenship = "";
			this.ce_gt1_36_primaryLanguage = new CE_v2();
			this.gt1_37_livingArrangement = "";
			this.ce_gt1_38_publicityIndicator = new CE_v2();
			this.gt1_39_protectionIndicator = "";
			this.gt1_40_studentIndicator = "";
			this.gt1_41_religion = "";
			this.xpn_gt1_42_mothersMaidenName = new XPN_v23();
			this.ce_gt1_43_nationalityCode = new CE_v2();
			this.gt1_44_ethnicGroup = "";
			this.xpn_gt1_45_contactPersonsName = new XPN_v23[] {};
			this.xtn_gt1_46_contactPersonsTelephoneNumber = new XTN_v23[] {};
			this.ce_gt1_47_contactReason = new CE_v2();
			this.gt1_48_contactRelationshipCode = "";
			this.gt1_49_jobTitle = "";
			this.jcc_gt1_50_jobCodeClass = new JCC_v23();
			this.xon_gt1_51_guarantorEmployersOrganizationName = new XON_v23[] {};
			this.gt1_52_handicap = "";
			this.gt1_53_jobStatus = "";
			this.fc_gt1_54_guarantorFinancialClass = new FC_v23();
			this.gt1_55_guarantorRace = "";
		}
		public GT1Builder gt1_1_setId(String gt1_1_setId) {
			this.gt1_1_setId = gt1_1_setId;
			return this;
		}
		public GT1Builder cx_gt1_2_guarantorNumber(CX_v23[] cx_gt1_2_guarantorNumber) {
			this.cx_gt1_2_guarantorNumber = cx_gt1_2_guarantorNumber;
			return this;
		}
		public GT1Builder xpn_gt1_3_guarantorName(XPN_v23[] xpn_gt1_3_guarantorName) {
			this.xpn_gt1_3_guarantorName = xpn_gt1_3_guarantorName;
			return this;
		}
		public GT1Builder xpn_gt1_4_guarantorSpouseName(XPN_v23[] xpn_gt1_4_guarantorSpouseName) {
			this.xpn_gt1_4_guarantorSpouseName = xpn_gt1_4_guarantorSpouseName;
			return this;
		}
		public GT1Builder xad_gt1_5_guarantorAddress(XAD_v23[] xad_gt1_5_guarantorAddress) {
			this.xad_gt1_5_guarantorAddress = xad_gt1_5_guarantorAddress;
			return this;
		}
		public GT1Builder xtn_gt1_6_guarantorPhoneNumberHome(XTN_v23[] xtn_gt1_6_guarantorPhoneNumberHome) {
			this.xtn_gt1_6_guarantorPhoneNumberHome = xtn_gt1_6_guarantorPhoneNumberHome;
			return this;
		}
		public GT1Builder xtn_gt1_7_guarantorPhoneNumberBusiness(XTN_v23[] xtn_gt1_7_guarantorPhoneNumberBusiness) {
			this.xtn_gt1_7_guarantorPhoneNumberBusiness = xtn_gt1_7_guarantorPhoneNumberBusiness;
			return this;
		}
		public GT1Builder ts_gt1_8_guarantorDateTimeOfBirth(TS_v2 ts_gt1_8_guarantorDateTimeOfBirth) {
			this.ts_gt1_8_guarantorDateTimeOfBirth = ts_gt1_8_guarantorDateTimeOfBirth;
			return this;
		}
		public GT1Builder gt1_9_guarantorSex(String gt1_9_guarantorSex) {
			this.gt1_9_guarantorSex = gt1_9_guarantorSex;
			return this;
		}
		public GT1Builder gt1_10_guarantorType(String gt1_10_guarantorType) {
			this.gt1_10_guarantorType = gt1_10_guarantorType;
			return this;
		}
		public GT1Builder gt1_11_guarantorRelationship(String gt1_11_guarantorRelationship) {
			this.gt1_11_guarantorRelationship = gt1_11_guarantorRelationship;
			return this;
		}
		public GT1Builder gt1_12_guarantorSSN(String gt1_12_guarantorSSN) {
			this.gt1_12_guarantorSSN = gt1_12_guarantorSSN;
			return this;
		}
		public GT1Builder gt1_13_guarantorDateBegin(String gt1_13_guarantorDateBegin) {
			this.gt1_13_guarantorDateBegin = gt1_13_guarantorDateBegin;
			return this;
		}
		public GT1Builder gt1_14_guarantorDateEnd(String gt1_14_guarantorDateEnd) {
			this.gt1_14_guarantorDateEnd = gt1_14_guarantorDateEnd;
			return this;
		}
		public GT1Builder gt1_15_guarantorPriority(String gt1_15_guarantorPriority) {
			this.gt1_15_guarantorPriority = gt1_15_guarantorPriority;
			return this;
		}
		public GT1Builder xpn_gt1_16_guarantorEmployerName(XPN_v23[] xpn_gt1_16_guarantorEmployerName) {
			this.xpn_gt1_16_guarantorEmployerName = xpn_gt1_16_guarantorEmployerName;
			return this;
		}
		public GT1Builder xad_gt1_17_guarantorEmployerAddress(XAD_v23[] xad_gt1_17_guarantorEmployerAddress) {
			this.xad_gt1_17_guarantorEmployerAddress = xad_gt1_17_guarantorEmployerAddress;
			return this;
		}
		public GT1Builder xtn_gt1_18_guarantorEmployerPhoneNumber(XTN_v23[] xtn_gt1_18_guarantorEmployerPhoneNumber) {
			this.xtn_gt1_18_guarantorEmployerPhoneNumber = xtn_gt1_18_guarantorEmployerPhoneNumber;
			return this;
		}
		public GT1Builder cx_gt1_19_guarantorEmployeeIdNumber(CX_v23[] cx_gt1_19_guarantorEmployeeIdNumber) {
			this.cx_gt1_19_guarantorEmployeeIdNumber = cx_gt1_19_guarantorEmployeeIdNumber;
			return this;
		}
		public GT1Builder gt1_20_guarantorEmploymentStatus(String gt1_20_guarantorEmploymentStatus) {
			this.gt1_20_guarantorEmploymentStatus = gt1_20_guarantorEmploymentStatus;
			return this;
		}
		public GT1Builder xon_gt1_21_guarantorOrganization(XON_v23[] xon_gt1_21_guarantorOrganization) {
			this.xon_gt1_21_guarantorOrganization = xon_gt1_21_guarantorOrganization;
			return this;
		}
		public GT1Builder gt1_22_guarantorBillingHoldFlag(String gt1_22_guarantorBillingHoldFlag) {
			this.gt1_22_guarantorBillingHoldFlag = gt1_22_guarantorBillingHoldFlag;
			return this;
		}
		public GT1Builder ce_gt1_23_guarantorCreditRatingCode(CE_v2 ce_gt1_23_guarantorCreditRatingCode) {
			this.ce_gt1_23_guarantorCreditRatingCode = ce_gt1_23_guarantorCreditRatingCode;
			return this;
		}
		public GT1Builder ts_gt1_24_guarantorDeathDateAndTime(TS_v2 ts_gt1_24_guarantorDeathDateAndTime) {
			this.ts_gt1_24_guarantorDeathDateAndTime = ts_gt1_24_guarantorDeathDateAndTime;
			return this;
		}
		public GT1Builder gt1_25_guarantorDeathFlag(String gt1_25_guarantorDeathFlag) {
			this.gt1_25_guarantorDeathFlag = gt1_25_guarantorDeathFlag;
			return this;
		}
		public GT1Builder ce_gt1_26_guarantorChargeAdjustmentCode(CE_v2 ce_gt1_26_guarantorChargeAdjustmentCode) {
			this.ce_gt1_26_guarantorChargeAdjustmentCode = ce_gt1_26_guarantorChargeAdjustmentCode;
			return this;
		}
		public GT1Builder cp_gt1_27_guarantorHouseHoldAnnualIncome(CP_v2 cp_gt1_27_guarantorHouseHoldAnnualIncome) {
			this.cp_gt1_27_guarantorHouseHoldAnnualIncome = cp_gt1_27_guarantorHouseHoldAnnualIncome;
			return this;
		}
		public GT1Builder gt1_28_guarantorHouseholdSize(String gt1_28_guarantorHouseholdSize) {
			this.gt1_28_guarantorHouseholdSize = gt1_28_guarantorHouseholdSize;
			return this;
		}
		public GT1Builder cx_gt1_29_guarantorEmployerIdNumber(CX_v23[] cx_gt1_29_guarantorEmployerIdNumber) {
			this.cx_gt1_29_guarantorEmployerIdNumber = cx_gt1_29_guarantorEmployerIdNumber;
			return this;
		}
		public GT1Builder gt1_30_guarantorMaritalStatusCode(String gt1_30_guarantorMaritalStatusCode) {
			this.gt1_30_guarantorMaritalStatusCode = gt1_30_guarantorMaritalStatusCode;
			return this;
		}
		public GT1Builder gt1_31_guarantorHireEffectiveDate(String gt1_31_guarantorHireEffectiveDate) {
			this.gt1_31_guarantorHireEffectiveDate = gt1_31_guarantorHireEffectiveDate;
			return this;
		}
		public GT1Builder gt1_32_employmentStopDate(String gt1_32_employmentStopDate) {
			this.gt1_32_employmentStopDate = gt1_32_employmentStopDate;
			return this;
		}
		public GT1Builder gt1_33_livingDependency(String gt1_33_livingDependency) {
			this.gt1_33_livingDependency = gt1_33_livingDependency;
			return this;
		}
		public GT1Builder gt1_34_ambulatoryStatusCode(String gt1_34_ambulatoryStatusCode) {
			this.gt1_34_ambulatoryStatusCode = gt1_34_ambulatoryStatusCode;
			return this;
		}
		public GT1Builder gt1_35_citizenship(String gt1_35_citizenship) {
			this.gt1_35_citizenship = gt1_35_citizenship;
			return this;
		}
		public GT1Builder ce_gt1_36_primaryLanguage(CE_v2 ce_gt1_36_primaryLanguage) {
			this.ce_gt1_36_primaryLanguage = ce_gt1_36_primaryLanguage;
			return this;
		}
		public GT1Builder gt1_37_livingArrangement(String gt1_37_livingArrangement) {
			this.gt1_37_livingArrangement = gt1_37_livingArrangement;
			return this;
		}
		public GT1Builder ce_gt1_38_publicityIndicator(CE_v2 ce_gt1_38_publicityIndicator) {
			this.ce_gt1_38_publicityIndicator = ce_gt1_38_publicityIndicator;
			return this;
		}
		public GT1Builder gt1_39_protectionIndicator(String gt1_39_protectionIndicator) {
			this.gt1_39_protectionIndicator = gt1_39_protectionIndicator;
			return this;
		}
		public GT1Builder gt1_40_studentIndicator(String gt1_40_studentIndicator) {
			this.gt1_40_studentIndicator = gt1_40_studentIndicator;
			return this;
		}
		public GT1Builder gt1_41_religion(String gt1_41_religion) {
			this.gt1_41_religion = gt1_41_religion;
			return this;
		}
		public GT1Builder xpn_gt1_42_mothersMaidenName(XPN_v23 xpn_gt1_42_mothersMaidenName) {
			this.xpn_gt1_42_mothersMaidenName = xpn_gt1_42_mothersMaidenName;
			return this;
		}
		public GT1Builder ce_gt1_43_nationalityCode(CE_v2 ce_gt1_43_nationalityCode) {
			this.ce_gt1_43_nationalityCode = ce_gt1_43_nationalityCode;
			return this;
		}
		public GT1Builder gt1_44_ethnicGroup(String gt1_44_ethnicGroup) {
			this.gt1_44_ethnicGroup = gt1_44_ethnicGroup;
			return this;
		}
		public GT1Builder xpn_gt1_45_contactPersonsName(XPN_v23[] xpn_gt1_45_contactPersonsName) {
			this.xpn_gt1_45_contactPersonsName = xpn_gt1_45_contactPersonsName;
			return this;
		}
		public GT1Builder xtn_gt1_46_contactPersonsTelephoneNumber(XTN_v23[] xtn_gt1_46_contactPersonsTelephoneNumber) {
			this.xtn_gt1_46_contactPersonsTelephoneNumber = xtn_gt1_46_contactPersonsTelephoneNumber;
			return this;
		}
		public GT1Builder ce_gt1_47_contactReason(CE_v2 ce_gt1_47_contactReason) {
			this.ce_gt1_47_contactReason = ce_gt1_47_contactReason;
			return this;
		}
		public GT1Builder gt1_48_contactRelationshipCode(String gt1_48_contactRelationshipCode) {
			this.gt1_48_contactRelationshipCode = gt1_48_contactRelationshipCode;
			return this;
		}
		public GT1Builder gt1_49_jobTitle(String gt1_49_jobTitle) {
			this.gt1_49_jobTitle = gt1_49_jobTitle;
			return this;
		}
		public GT1Builder jcc_gt1_50_jobCodeClass(JCC_v23 jcc_gt1_50_jobCodeClass) {
			this.jcc_gt1_50_jobCodeClass = jcc_gt1_50_jobCodeClass;
			return this;
		}
		public GT1Builder xon_gt1_51_guarantorEmployersOrganizationName(XON_v23[] xon_gt1_51_guarantorEmployersOrganizationName) {
			this.xon_gt1_51_guarantorEmployersOrganizationName = xon_gt1_51_guarantorEmployersOrganizationName;
			return this;
		}
		public GT1Builder gt1_52_handicap(String gt1_52_handicap) {
			this.gt1_52_handicap = gt1_52_handicap;
			return this;
		}
		public GT1Builder gt1_53_jobStatus(String gt1_53_jobStatus) {
			this.gt1_53_jobStatus = gt1_53_jobStatus;
			return this;
		}
		public GT1Builder fc_gt1_54_guarantorFinancialClass(FC_v23 fc_gt1_54_guarantorFinancialClass) {
			this.fc_gt1_54_guarantorFinancialClass = fc_gt1_54_guarantorFinancialClass;
			return this;
		}
		public GT1Builder gt1_55_guarantorRace(String gt1_55_guarantorRace) {
			this.gt1_55_guarantorRace = gt1_55_guarantorRace;
			return this;
		}
		public JsonGT1_v23 build() {
			return new JsonGT1_v23(this);
		}
	}
	public String getGt1_1_setId() {
		return gt1_1_setId;
	}
	public CX_v23[] getCx_gt1_2_guarantorNumber() {
		return cx_gt1_2_guarantorNumber;
	}
	public XPN_v23[] getXpn_gt1_3_guarantorName() {
		return xpn_gt1_3_guarantorName;
	}
	public XPN_v23[] getXpn_gt1_4_guarantorSpouseName() {
		return xpn_gt1_4_guarantorSpouseName;
	}
	public XAD_v23[] getXad_gt1_5_guarantorAddress() {
		return xad_gt1_5_guarantorAddress;
	}
	public XTN_v23[] getXtn_gt1_6_guarantorPhoneNumberHome() {
		return xtn_gt1_6_guarantorPhoneNumberHome;
	}
	public XTN_v23[] getXtn_gt1_7_guarantorPhoneNumberBusiness() {
		return xtn_gt1_7_guarantorPhoneNumberBusiness;
	}
	public TS_v2 getTs_gt1_8_guarantorDateTimeOfBirth() {
		return ts_gt1_8_guarantorDateTimeOfBirth;
	}
	public String getGt1_9_guarantorSex() {
		return gt1_9_guarantorSex;
	}
	public String getGt1_10_guarantorType() {
		return gt1_10_guarantorType;
	}
	public String getGt1_11_guarantorRelationship() {
		return gt1_11_guarantorRelationship;
	}
	public String getGt1_12_guarantorSSN() {
		return gt1_12_guarantorSSN;
	}
	public String getGt1_13_guarantorDateBegin() {
		return gt1_13_guarantorDateBegin;
	}
	public String getGt1_14_guarantorDateEnd() {
		return gt1_14_guarantorDateEnd;
	}
	public String getGt1_15_guarantorPriority() {
		return gt1_15_guarantorPriority;
	}
	public XPN_v23[] getXpn_gt1_16_guarantorEmployerName() {
		return xpn_gt1_16_guarantorEmployerName;
	}
	public XAD_v23[] getXad_gt1_17_guarantorEmployerAddress() {
		return xad_gt1_17_guarantorEmployerAddress;
	}
	public XTN_v23[] getXtn_gt1_18_guarantorEmployerPhoneNumber() {
		return xtn_gt1_18_guarantorEmployerPhoneNumber;
	}
	public CX_v23[] getCx_gt1_19_guarantorEmployeeIdNumber() {
		return cx_gt1_19_guarantorEmployeeIdNumber;
	}
	public String getGt1_20_guarantorEmploymentStatus() {
		return gt1_20_guarantorEmploymentStatus;
	}
	public XON_v23[] getXon_gt1_21_guarantorOrganization() {
		return xon_gt1_21_guarantorOrganization;
	}
	public String getGt1_22_guarantorBillingHoldFlag() {
		return gt1_22_guarantorBillingHoldFlag;
	}
	public CE_v2 getCe_gt1_23_guarantorCreditRatingCode() {
		return ce_gt1_23_guarantorCreditRatingCode;
	}
	public TS_v2 getTs_gt1_24_guarantorDeathDateAndTime() {
		return ts_gt1_24_guarantorDeathDateAndTime;
	}
	public String getGt1_25_guarantorDeathFlag() {
		return gt1_25_guarantorDeathFlag;
	}
	public CE_v2 getCe_gt1_26_guarantorChargeAdjustmentCode() {
		return ce_gt1_26_guarantorChargeAdjustmentCode;
	}
	public CP_v2 getCp_gt1_27_guarantorHouseHoldAnnualIncome() {
		return cp_gt1_27_guarantorHouseHoldAnnualIncome;
	}
	public String getGt1_28_guarantorHouseholdSize() {
		return gt1_28_guarantorHouseholdSize;
	}
	public CX_v23[] getCx_gt1_29_guarantorEmployerIdNumber() {
		return cx_gt1_29_guarantorEmployerIdNumber;
	}
	public String getGt1_30_guarantorMaritalStatusCode() {
		return gt1_30_guarantorMaritalStatusCode;
	}
	public String getGt1_31_guarantorHireEffectiveDate() {
		return gt1_31_guarantorHireEffectiveDate;
	}
	public String getGt1_32_employmentStopDate() {
		return gt1_32_employmentStopDate;
	}
	public String getGt1_33_livingDependency() {
		return gt1_33_livingDependency;
	}
	public String getGt1_34_ambulatoryStatusCode() {
		return gt1_34_ambulatoryStatusCode;
	}
	public String getGt1_35_citizenship() {
		return gt1_35_citizenship;
	}
	public CE_v2 getCe_gt1_36_primaryLanguage() {
		return ce_gt1_36_primaryLanguage;
	}
	public String getGt1_37_livingArrangement() {
		return gt1_37_livingArrangement;
	}
	public CE_v2 getCe_gt1_38_publicityIndicator() {
		return ce_gt1_38_publicityIndicator;
	}
	public String getGt1_39_protectionIndicator() {
		return gt1_39_protectionIndicator;
	}
	public String getGt1_40_studentIndicator() {
		return gt1_40_studentIndicator;
	}
	public String getGt1_41_religion() {
		return gt1_41_religion;
	}
	public XPN_v23 getXpn_gt1_42_mothersMaidenName() {
		return xpn_gt1_42_mothersMaidenName;
	}
	public CE_v2 getCe_gt1_43_nationalityCode() {
		return ce_gt1_43_nationalityCode;
	}
	public String getGt1_44_ethnicGroup() {
		return gt1_44_ethnicGroup;
	}
	public XPN_v23[] getXpn_gt1_45_contactPersonsName() {
		return xpn_gt1_45_contactPersonsName;
	}
	public XTN_v23[] getXtn_gt1_46_contactPersonsTelephoneNumber() {
		return xtn_gt1_46_contactPersonsTelephoneNumber;
	}
	public CE_v2 getCe_gt1_47_contactReason() {
		return ce_gt1_47_contactReason;
	}
	public String getGt1_48_contactRelationshipCode() {
		return gt1_48_contactRelationshipCode;
	}
	public String getGt1_49_jobTitle() {
		return gt1_49_jobTitle;
	}
	public JCC_v23 getJcc_gt1_50_jobCodeClass() {
		return jcc_gt1_50_jobCodeClass;
	}
	public XON_v23[] getXon_gt1_51_guarantorEmployersOrganizationName() {
		return xon_gt1_51_guarantorEmployersOrganizationName;
	}
	public String getGt1_52_handicap() {
		return gt1_52_handicap;
	}
	public String getGt1_53_jobStatus() {
		return gt1_53_jobStatus;
	}
	public FC_v23 getFc_gt1_54_guarantorFinancialClass() {
		return fc_gt1_54_guarantorFinancialClass;
	}
	public String getGt1_55_guarantorRace() {
		return gt1_55_guarantorRace;
	}
	@Override
	public String toString() {
		return "JsonGT1_v23 [gt1_1_setId=" + gt1_1_setId + ", cx_gt1_2_guarantorNumber="
				+ Arrays.toString(cx_gt1_2_guarantorNumber) + ", xpn_gt1_3_guarantorName="
				+ Arrays.toString(xpn_gt1_3_guarantorName) + ", xpn_gt1_4_guarantorSpouseName="
				+ Arrays.toString(xpn_gt1_4_guarantorSpouseName) + ", xad_gt1_5_guarantorAddress="
				+ Arrays.toString(xad_gt1_5_guarantorAddress) + ", xtn_gt1_6_guarantorPhoneNumberHome="
				+ Arrays.toString(xtn_gt1_6_guarantorPhoneNumberHome) + ", xtn_gt1_7_guarantorPhoneNumberBusiness="
				+ Arrays.toString(xtn_gt1_7_guarantorPhoneNumberBusiness) + ", ts_gt1_8_guarantorDateTimeOfBirth="
				+ ts_gt1_8_guarantorDateTimeOfBirth + ", gt1_9_guarantorSex=" + gt1_9_guarantorSex
				+ ", gt1_10_guarantorType=" + gt1_10_guarantorType + ", gt1_11_guarantorRelationship="
				+ gt1_11_guarantorRelationship + ", gt1_12_guarantorSSN=" + gt1_12_guarantorSSN
				+ ", gt1_13_guarantorDateBegin=" + gt1_13_guarantorDateBegin + ", gt1_14_guarantorDateEnd="
				+ gt1_14_guarantorDateEnd + ", gt1_15_guarantorPriority=" + gt1_15_guarantorPriority
				+ ", xpn_gt1_16_guarantorEmployerName=" + Arrays.toString(xpn_gt1_16_guarantorEmployerName)
				+ ", xad_gt1_17_guarantorEmployerAddress=" + Arrays.toString(xad_gt1_17_guarantorEmployerAddress)
				+ ", xtn_gt1_18_guarantorEmployerPhoneNumber="
				+ Arrays.toString(xtn_gt1_18_guarantorEmployerPhoneNumber) + ", cx_gt1_19_guarantorEmployeeIdNumber="
				+ Arrays.toString(cx_gt1_19_guarantorEmployeeIdNumber) + ", gt1_20_guarantorEmploymentStatus="
				+ gt1_20_guarantorEmploymentStatus + ", xon_gt1_21_guarantorOrganization="
				+ Arrays.toString(xon_gt1_21_guarantorOrganization) + ", gt1_22_guarantorBillingHoldFlag="
				+ gt1_22_guarantorBillingHoldFlag + ", ce_gt1_23_guarantorCreditRatingCode="
				+ ce_gt1_23_guarantorCreditRatingCode + ", ts_gt1_24_guarantorDeathDateAndTime="
				+ ts_gt1_24_guarantorDeathDateAndTime + ", gt1_25_guarantorDeathFlag=" + gt1_25_guarantorDeathFlag
				+ ", ce_gt1_26_guarantorChargeAdjustmentCode=" + ce_gt1_26_guarantorChargeAdjustmentCode
				+ ", cp_gt1_27_guarantorHouseHoldAnnualIncome=" + cp_gt1_27_guarantorHouseHoldAnnualIncome
				+ ", gt1_28_guarantorHouseholdSize=" + gt1_28_guarantorHouseholdSize
				+ ", cx_gt1_29_guarantorEmployerIdNumber=" + Arrays.toString(cx_gt1_29_guarantorEmployerIdNumber)
				+ ", gt1_30_guarantorMaritalStatusCode=" + gt1_30_guarantorMaritalStatusCode
				+ ", gt1_31_guarantorHireEffectiveDate=" + gt1_31_guarantorHireEffectiveDate
				+ ", gt1_32_employmentStopDate=" + gt1_32_employmentStopDate + ", gt1_33_livingDependency="
				+ gt1_33_livingDependency + ", gt1_34_ambulatoryStatusCode=" + gt1_34_ambulatoryStatusCode
				+ ", gt1_35_citizenship=" + gt1_35_citizenship + ", ce_gt1_36_primaryLanguage="
				+ ce_gt1_36_primaryLanguage + ", gt1_37_livingArrangement=" + gt1_37_livingArrangement
				+ ", ce_gt1_38_publicityIndicator=" + ce_gt1_38_publicityIndicator + ", gt1_39_protectionIndicator="
				+ gt1_39_protectionIndicator + ", gt1_40_studentIndicator=" + gt1_40_studentIndicator
				+ ", gt1_41_religion=" + gt1_41_religion + ", xpn_gt1_42_mothersMaidenName="
				+ xpn_gt1_42_mothersMaidenName + ", ce_gt1_43_nationalityCode=" + ce_gt1_43_nationalityCode
				+ ", gt1_44_ethnicGroup=" + gt1_44_ethnicGroup + ", xpn_gt1_45_contactPersonsName="
				+ Arrays.toString(xpn_gt1_45_contactPersonsName) + ", xtn_gt1_46_contactPersonsTelephoneNumber="
				+ Arrays.toString(xtn_gt1_46_contactPersonsTelephoneNumber) + ", ce_gt1_47_contactReason="
				+ ce_gt1_47_contactReason + ", gt1_48_contactRelationshipCode=" + gt1_48_contactRelationshipCode
				+ ", gt1_49_jobTitle=" + gt1_49_jobTitle + ", jcc_gt1_50_jobCodeClass=" + jcc_gt1_50_jobCodeClass
				+ ", xon_gt1_51_guarantorEmployersOrganizationName="
				+ Arrays.toString(xon_gt1_51_guarantorEmployersOrganizationName) + ", gt1_52_handicap="
				+ gt1_52_handicap + ", gt1_53_jobStatus=" + gt1_53_jobStatus + ", fc_gt1_54_guarantorFinancialClass="
				+ fc_gt1_54_guarantorFinancialClass + ", gt1_55_guarantorRace=" + gt1_55_guarantorRace + "]";
	}
	
}
