package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.GT1;
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
import scratch.coding.services.CommonService;


@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomGT1 implements Serializable {
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
	
	private GT1 gt1;
	
	private CustomGT1(GT1 gt1) {
		super();
		this.gt1 =gt1;
	}
	public CustomGT1() {
		super();
	}
	public static CustomGT1 createMshWithMSH(GT1 gt1) throws HL7Exception, IOException {
		return new CustomGT1(gt1);
	}
	/**
	 *	@return the gt1_1_setId
	 */
	
	@JsonProperty("gt1_1_setId")
	public String getGt1_1_setId() {
		return this.gt1.getGt11_SetIDGuarantor().getValue()==null?"":this.gt1.getGt11_SetIDGuarantor().getValue();
	}
	/**
	 * @param gt1_1_setId the gt1_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_1_setId")
	public void setGt1_1_setId(String gt1_1_setId) throws DataTypeException {
		this.gt1.getGt11_SetIDGuarantor().setValue(gt1_1_setId);
		this.gt1_1_setId = gt1_1_setId;
	}
	/**
	 *	@return the cx_gt1_2_guarantorNumber
	 */
	
	@JsonProperty("cx_gt1_2_guarantorNumber")
	public CX_v23[] getCx_gt1_2_guarantorNumber() {
		CX_v23[] guarantorNumber = new CX_v23[this.gt1.getGt12_GuarantorNumber().length];
		for(int i =0; i<this.gt1.getGt12_GuarantorNumber().length; i++ ) {
			guarantorNumber[i] = CommonService.getCX_v23(this.gt1.getGt12_GuarantorNumber(i));
		}
		return guarantorNumber;
	}
	/**
	 * @param cx_gt1_2_guarantorNumber the cx_gt1_2_guarantorNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_gt1_2_guarantorNumber")
	public void setCx_gt1_2_guarantorNumber(CX_v23[] cx_gt1_2_guarantorNumber) throws DataTypeException {
		for(int i =0; i<cx_gt1_2_guarantorNumber.length; i++ ) {
			CommonService.setCX_v23(this.gt1.getGt12_GuarantorNumber(i), cx_gt1_2_guarantorNumber[i]);
		}
		this.cx_gt1_2_guarantorNumber = cx_gt1_2_guarantorNumber;
	}
	/**
	 *	@return the xpn_gt1_3_guarantorName
	 */
	
	@JsonProperty("xpn_gt1_3_guarantorName")
	public XPN_v23[] getXpn_gt1_3_guarantorName() {
		XPN_v23[] guarantorName = new XPN_v23[this.gt1.getGt13_GuarantorName().length];
		for(int i = 0; i<this.gt1.getGt13_GuarantorName().length;i++) {
			guarantorName[i] =CommonService.getXPN_v23(this.gt1.getGt13_GuarantorName(i));
		}
		return guarantorName;
	}
	/**
	 * @param xpn_gt1_3_guarantorName the xpn_gt1_3_guarantorName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_gt1_3_guarantorName")
	public void setXpn_gt1_3_guarantorName(XPN_v23[] xpn_gt1_3_guarantorName) throws DataTypeException {
		for(int i = 0; i<xpn_gt1_3_guarantorName.length;i++) {
			CommonService.setXPN_v23(this.gt1.getGt13_GuarantorName(i), xpn_gt1_3_guarantorName[i]);
		}
		this.xpn_gt1_3_guarantorName = xpn_gt1_3_guarantorName;
	}
	/**
	 *	@return the xpn_gt1_4_guarantorSpouseName
	 */
	
	@JsonProperty("xpn_gt1_4_guarantorSpouseName")
	public XPN_v23[] getXpn_gt1_4_guarantorSpouseName() {
		XPN_v23[] guarantorSpouseName = new XPN_v23[this.gt1.getGt14_GuarantorSpouseName().length];
		for( int i =0; i< this.gt1.getGt14_GuarantorSpouseName().length; i++) {
			guarantorSpouseName[i] =CommonService.getXPN_v23(this.gt1.getGt14_GuarantorSpouseName(i));
		}
		return guarantorSpouseName ;
	}
	/**
	 * @param xpn_gt1_4_guarantorSpouseName the xpn_gt1_4_guarantorSpouseName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_gt1_4_guarantorSpouseName")
	public void setXpn_gt1_4_guarantorSpouseName(XPN_v23[] xpn_gt1_4_guarantorSpouseName) throws DataTypeException {
		for(int i = 0; i<xpn_gt1_4_guarantorSpouseName.length;i++) {
			CommonService.setXPN_v23(this.gt1.getGt14_GuarantorSpouseName(i), xpn_gt1_4_guarantorSpouseName[i]);
		}
		this.xpn_gt1_4_guarantorSpouseName = xpn_gt1_4_guarantorSpouseName;
	}
	/**
	 *	@return the xad_gt1_5_guarantorAddress
	 */
	
	@JsonProperty("xad_gt1_5_guarantorAddress")
	public XAD_v23[] getXad_gt1_5_guarantorAddress() {
		XAD_v23[] guarantorAddress = new XAD_v23[this.gt1.getGt15_GuarantorAddress().length];
		for(int i = 0; i<this.gt1.getGt15_GuarantorAddress().length; i++) {
			guarantorAddress[i] = CommonService.getXAD_v23(this.gt1.getGt15_GuarantorAddress(i));
		}
		return guarantorAddress;
	}
	/**
	 * @param xad_gt1_5_guarantorAddress the xad_gt1_5_guarantorAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_gt1_5_guarantorAddress")
	public void setXad_gt1_5_guarantorAddress(XAD_v23[] xad_gt1_5_guarantorAddress) throws DataTypeException {
		for(int i = 0; i<xad_gt1_5_guarantorAddress.length; i++) {
			CommonService.setXAD_v23(this.gt1.getGt15_GuarantorAddress(i), xad_gt1_5_guarantorAddress[i]);
		}
		this.xad_gt1_5_guarantorAddress = xad_gt1_5_guarantorAddress;
	}
	/**
	 *	@return the xtn_gt1_6_guarantorPhoneNumberHome
	 */
	
	@JsonProperty("xtn_gt1_6_guarantorPhoneNumberHome")
	public XTN_v23[] getXtn_gt1_6_guarantorPhoneNumberHome() {
		XTN_v23[] guarantorPhoneNumberHome = new XTN_v23[this.gt1.getGt16_GuarantorPhNumHome().length];
		for(int i = 0; i< this.gt1.getGt16_GuarantorPhNumHome().length; i++) {
			guarantorPhoneNumberHome[i] = CommonService.getXTN_v23(this.gt1.getGt16_GuarantorPhNumHome(i));
		}
		return guarantorPhoneNumberHome;
	}
	/**
	 * @param xtn_gt1_6_guarantorPhoneNumberHome the xtn_gt1_6_guarantorPhoneNumberHome to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_gt1_6_guarantorPhoneNumberHome")
	public void setXtn_gt1_6_guarantorPhoneNumberHome(XTN_v23[] xtn_gt1_6_guarantorPhoneNumberHome) throws DataTypeException {
		for(int i = 0; i <xtn_gt1_6_guarantorPhoneNumberHome.length;i++) {
			CommonService.setXTN_v23(this.gt1.getGt16_GuarantorPhNumHome(i), xtn_gt1_6_guarantorPhoneNumberHome[i]);
		}
		this.xtn_gt1_6_guarantorPhoneNumberHome = xtn_gt1_6_guarantorPhoneNumberHome;
	}
	/**
	 *	@return the xtn_gt1_7_guarantorPhoneNumberBusiness
	 */
	
	@JsonProperty("xtn_gt1_7_guarantorPhoneNumberBusiness")
	public XTN_v23[] getXtn_gt1_7_guarantorPhoneNumberBusiness() {
		XTN_v23[] guarantorPhoneNumberBusiness = new XTN_v23[this.gt1.getGt17_GuarantorPhNumBusiness().length];
		for(int i = 0; i< this.gt1.getGt17_GuarantorPhNumBusiness().length; i++) {
			guarantorPhoneNumberBusiness[i] = CommonService.getXTN_v23(this.gt1.getGt17_GuarantorPhNumBusiness(i));
		}
		return guarantorPhoneNumberBusiness;
	}
	/**
	 * @param xtn_gt1_7_guarantorPhoneNumberBusiness the xtn_gt1_7_guarantorPhoneNumberBusiness to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_gt1_7_guarantorPhoneNumberBusiness")
	public void setXtn_gt1_7_guarantorPhoneNumberBusiness(XTN_v23[] xtn_gt1_7_guarantorPhoneNumberBusiness) throws DataTypeException {
		for(int i = 0; i <xtn_gt1_7_guarantorPhoneNumberBusiness.length;i++) {
			CommonService.setXTN_v23(this.gt1.getGt17_GuarantorPhNumBusiness(i), xtn_gt1_7_guarantorPhoneNumberBusiness[i]);
		}
		this.xtn_gt1_7_guarantorPhoneNumberBusiness = xtn_gt1_7_guarantorPhoneNumberBusiness;
	}
	/**
	 *	@return the ts_gt1_8_guarantorDateTimeOfBirth
	 */
	
	@JsonProperty("ts_gt1_8_guarantorDateTimeOfBirth")
	public TS_v2 getTs_gt1_8_guarantorDateTimeOfBirth() {
		return CommonService.getTS_v2(this.gt1.getGt18_GuarantorDateTimeOfBirth());
	}
	/**
	 * @param ts_gt1_8_guarantorDateTimeOfBirth the ts_gt1_8_guarantorDateTimeOfBirth to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_gt1_8_guarantorDateTimeOfBirth")
	public void setTs_gt1_8_guarantorDateTimeOfBirth(TS_v2 ts_gt1_8_guarantorDateTimeOfBirth) throws DataTypeException {
		CommonService.setTS_v2(this.gt1.getGt18_GuarantorDateTimeOfBirth(), ts_gt1_8_guarantorDateTimeOfBirth);
		this.ts_gt1_8_guarantorDateTimeOfBirth = ts_gt1_8_guarantorDateTimeOfBirth;
	}
	/**
	 *	@return the gt1_9_guarantorSex
	 */
	
	@JsonProperty("gt1_9_guarantorSex")
	public String getGt1_9_guarantorSex() {
		return this.gt1.getGt19_GuarantorSex().getValue()==null?"":this.gt1.getGt19_GuarantorSex().getValue();
	}
	/**
	 * @param gt1_9_guarantorSex the gt1_9_guarantorSex to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_9_guarantorSex")
	public void setGt1_9_guarantorSex(String gt1_9_guarantorSex) throws DataTypeException {
		this.gt1.getGt19_GuarantorSex().setValue(gt1_9_guarantorSex);
		this.gt1_9_guarantorSex = gt1_9_guarantorSex;
	}
	/**
	 *	@return the gt1_10_guarantorType
	 */
	
	@JsonProperty("gt1_10_guarantorType")
	public String getGt1_10_guarantorType() {
		return this.gt1.getGt110_GuarantorType().getValue()==null?"":this.gt1.getGt110_GuarantorType().getValue();
	}
	/**
	 * @param gt1_10_guarantorType the gt1_10_guarantorType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_10_guarantorType")
	public void setGt1_10_guarantorType(String gt1_10_guarantorType) throws DataTypeException {
		this.gt1.getGt110_GuarantorType().setValue(gt1_10_guarantorType);
		this.gt1_10_guarantorType = gt1_10_guarantorType;
	}
	/**
	 *	@return the gt1_11_guarantorRelationship
	 */
	
	@JsonProperty("gt1_11_guarantorRelationship")
	public String getGt1_11_guarantorRelationship() {
		return this.gt1.getGt111_GuarantorRelationship().getValue()==null?"":this.gt1.getGt111_GuarantorRelationship().getValue();
	}
	/**
	 * @param gt1_11_guarantorRelationship the gt1_11_guarantorRelationship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_11_guarantorRelationship")
	public void setGt1_11_guarantorRelationship(String gt1_11_guarantorRelationship) throws DataTypeException {
		this.gt1.getGt111_GuarantorRelationship().setValue(gt1_11_guarantorRelationship);
		this.gt1_11_guarantorRelationship = gt1_11_guarantorRelationship;
	}
	/**
	 *	@return the gt1_12_guarantorSSN
	 */
	
	@JsonProperty("gt1_12_guarantorSSN")
	public String getGt1_12_guarantorSSN() {
		return this.gt1.getGt112_GuarantorSSN().getValue()==null?"":this.gt1.getGt112_GuarantorSSN().getValue();
	}
	/**
	 * @param gt1_12_guarantorSSN the gt1_12_guarantorSSN to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_12_guarantorSSN")
	public void setGt1_12_guarantorSSN(String gt1_12_guarantorSSN) throws DataTypeException {
		this.gt1.getGt112_GuarantorSSN().setValue(gt1_12_guarantorSSN);
		this.gt1_12_guarantorSSN = gt1_12_guarantorSSN;
	}
	/**
	 *	@return the gt1_13_guarantorDateBegin
	 */
	
	@JsonProperty("gt1_13_guarantorDateBegin")
	public String getGt1_13_guarantorDateBegin() {
		return this.gt1.getGt113_GuarantorDateBegin().getValue()==null?"":this.gt1.getGt113_GuarantorDateBegin().getValue();
	}
	/**
	 * @param gt1_13_guarantorDateBegin the gt1_13_guarantorDateBegin to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_13_guarantorDateBegin")
	public void setGt1_13_guarantorDateBegin(String gt1_13_guarantorDateBegin) throws DataTypeException {
		this.gt1.getGt113_GuarantorDateBegin().setValue(gt1_13_guarantorDateBegin);
		this.gt1_13_guarantorDateBegin = gt1_13_guarantorDateBegin;
	}
	/**
	 *	@return the gt1_14_guarantorDateEnd
	 */
	
	@JsonProperty("gt1_14_guarantorDateEnd")
	public String getGt1_14_guarantorDateEnd() {
		return this.gt1.getGt114_GuarantorDateEnd().getValue()==null?"":this.gt1.getGt114_GuarantorDateEnd().getValue();
	}
	/**
	 * @param gt1_14_guarantorDateEnd the gt1_14_guarantorDateEnd to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_14_guarantorDateEnd")
	public void setGt1_14_guarantorDateEnd(String gt1_14_guarantorDateEnd) throws DataTypeException {
		this.gt1.getGt114_GuarantorDateEnd().setValue(gt1_14_guarantorDateEnd);
		this.gt1_14_guarantorDateEnd = gt1_14_guarantorDateEnd;
	}
	/**
	 *	@return the gt1_15_guarantorPriority
	 */
	
	@JsonProperty("gt1_15_guarantorPriority")
	public String getGt1_15_guarantorPriority() {
		return this.gt1.getGt115_GuarantorPriority().getValue()==null?"":this.gt1.getGt115_GuarantorPriority().getValue();
	}
	/**
	 * @param gt1_15_guarantorPriority the gt1_15_guarantorPriority to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_15_guarantorPriority")
	public void setGt1_15_guarantorPriority(String gt1_15_guarantorPriority) throws DataTypeException {
		this.gt1.getGt115_GuarantorPriority().setValue(gt1_15_guarantorPriority);
		this.gt1_15_guarantorPriority = gt1_15_guarantorPriority;
	}
	/**
	 *	@return the xpn_gt1_16_guarantorEmployerName
	 */
	
	@JsonProperty("xpn_gt1_16_guarantorEmployerName")
	public XPN_v23[] getXpn_gt1_16_guarantorEmployerName() {
		XPN_v23[] guarantorEmployerName = new XPN_v23[this.gt1.getGt116_GuarantorEmployerName().length];
		for(int i =0; i< this.gt1.getGt116_GuarantorEmployerName().length;i++) {
			guarantorEmployerName[i] = CommonService.getXPN_v23(this.gt1.getGt116_GuarantorEmployerName(i)); 
		}
		return guarantorEmployerName;
	}
	/**
	 * @param xpn_gt1_16_guarantorEmployerName the xpn_gt1_16_guarantorEmployerName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_gt1_16_guarantorEmployerName")
	public void setXpn_gt1_16_guarantorEmployerName(XPN_v23[] xpn_gt1_16_guarantorEmployerName) throws DataTypeException {
		for(int i =0; i< xpn_gt1_16_guarantorEmployerName.length;i++) {
			CommonService.setXPN_v23(this.gt1.getGt116_GuarantorEmployerName(i), xpn_gt1_16_guarantorEmployerName[i]);
		}
		this.xpn_gt1_16_guarantorEmployerName = xpn_gt1_16_guarantorEmployerName;
	}
	/**
	 *	@return the xad_gt1_17_guarantorEmployerAddress
	 */
	@JsonProperty("xad_gt1_17_guarantorEmployerAddress")
	public XAD_v23[] getXad_gt1_17_guarantorEmployerAddress() {
		XAD_v23[] guarantorEmployerAddress =  new XAD_v23[this.gt1.getGt117_GuarantorEmployerAddress().length];
		for(int i =0;i<this.gt1.getGt117_GuarantorEmployerAddress().length;i++) {
			guarantorEmployerAddress[i] = CommonService.getXAD_v23(this.gt1.getGt117_GuarantorEmployerAddress(i));
		}
		return guarantorEmployerAddress;
	}
	/**
	 * @param xad_gt1_17_guarantorEmployerAddress the xad_gt1_17_guarantorEmployerAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_gt1_17_guarantorEmployerAddress")
	public void setXad_gt1_17_guarantorEmployerAddress(XAD_v23[] xad_gt1_17_guarantorEmployerAddress) throws DataTypeException {
		for(int i =0;i<xad_gt1_17_guarantorEmployerAddress.length;i++) {
			CommonService.setXAD_v23(this.gt1.getGt117_GuarantorEmployerAddress(i), xad_gt1_17_guarantorEmployerAddress[i]);
		}
		this.xad_gt1_17_guarantorEmployerAddress = xad_gt1_17_guarantorEmployerAddress;
	}
	/**
	 *	@return the xtn_gt1_18_guarantorEmployerPhoneNumber
	 */
	
	@JsonProperty("xtn_gt1_18_guarantorEmployerPhoneNumber")
	public XTN_v23[] getXtn_gt1_18_guarantorEmployerPhoneNumber() {
		XTN_v23[] guarantorEmployerPhoneNumber = new XTN_v23[this.gt1.getGt118_GuarantorEmployPhoneNumber().length];
		for(int i =0; i<this.gt1.getGt118_GuarantorEmployPhoneNumber().length;i++) {
			guarantorEmployerPhoneNumber[i] = CommonService.getXTN_v23(this.gt1.getGt118_GuarantorEmployPhoneNumber(i));
		}
		return guarantorEmployerPhoneNumber;
	}
	/**
	 * @param xtn_gt1_18_guarantorEmployerPhoneNumber the xtn_gt1_18_guarantorEmployerPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_gt1_18_guarantorEmployerPhoneNumber")
	public void setXtn_gt1_18_guarantorEmployerPhoneNumber(XTN_v23[] xtn_gt1_18_guarantorEmployerPhoneNumber) throws DataTypeException {
		for(int i =0; i<xtn_gt1_18_guarantorEmployerPhoneNumber.length;i++) {
			CommonService.setXTN_v23(this.gt1.getGt118_GuarantorEmployPhoneNumber(i), xtn_gt1_18_guarantorEmployerPhoneNumber[i]);
		}
		this.xtn_gt1_18_guarantorEmployerPhoneNumber = xtn_gt1_18_guarantorEmployerPhoneNumber;
	}
	/**
	 *	@return the cx_gt1_19_guarantorEmployeeIdNumber
	 */
	
	@JsonProperty("cx_gt1_19_guarantorEmployeeIdNumber")
	public CX_v23[] getCx_gt1_19_guarantorEmployeeIdNumber() {
		CX_v23[] guarantorEmployeeIdNumber = new CX_v23[this.gt1.getGt119_GuarantorEmployeeIDNumber().length];
		for(int i = 0; i < this.gt1.getGt119_GuarantorEmployeeIDNumber().length; i++) {
			guarantorEmployeeIdNumber[i]=CommonService.getCX_v23(this.gt1.getGt119_GuarantorEmployeeIDNumber(i));
		}
		return guarantorEmployeeIdNumber;
	}
	/**
	 * @param cx_gt1_19_guarantorEmployeeIdNumber the cx_gt1_19_guarantorEmployeeIdNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_gt1_19_guarantorEmployeeIdNumber")
	public void setCx_gt1_19_guarantorEmployeeIdNumber(CX_v23[] cx_gt1_19_guarantorEmployeeIdNumber) throws DataTypeException {
		for(int i = 0; i < cx_gt1_19_guarantorEmployeeIdNumber.length; i++) {
			CommonService.setCX_23(this.gt1.getGt119_GuarantorEmployeeIDNumber(i), cx_gt1_19_guarantorEmployeeIdNumber[i]);
		}
		this.cx_gt1_19_guarantorEmployeeIdNumber = cx_gt1_19_guarantorEmployeeIdNumber;
	}
	/**
	 *	@return the gt1_20_guarantorEmploymentStatus
	 */
	
	@JsonProperty("gt1_20_guarantorEmploymentStatus")
	public String getGt1_20_guarantorEmploymentStatus() {
		return this.gt1.getGt120_GuarantorEmploymentStatus().getValue()==null?"":this.gt1.getGt120_GuarantorEmploymentStatus().getValue();
	}
	/**
	 * @param gt1_20_guarantorEmploymentStatus the gt1_20_guarantorEmploymentStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_20_guarantorEmploymentStatus")
	public void setGt1_20_guarantorEmploymentStatus(String gt1_20_guarantorEmploymentStatus) throws DataTypeException {
		this.gt1.getGt120_GuarantorEmploymentStatus().setValue(gt1_20_guarantorEmploymentStatus);
		this.gt1_20_guarantorEmploymentStatus = gt1_20_guarantorEmploymentStatus;
	}
	/**
	 *	@return the xon_gt1_21_guarantorOrganization
	 */
	
	@JsonProperty("xon_gt1_21_guarantorOrganization")
	public XON_v23[] getXon_gt1_21_guarantorOrganization() {
		XON_v23[] guarantorOrganization = new XON_v23[this.gt1.getGt121_GuarantorOrganization().length];
		for(int i = 0; i < this.gt1.getGt121_GuarantorOrganization().length; i++) {
			guarantorOrganization[i] = CommonService.getXON_v23(this.gt1.getGt121_GuarantorOrganization(i));
		}
		return guarantorOrganization;
	}
	/**
	 * @param xon_gt1_21_guarantorOrganization the xon_gt1_21_guarantorOrganization to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_gt1_21_guarantorOrganization")
	public void setXon_gt1_21_guarantorOrganization(XON_v23[] xon_gt1_21_guarantorOrganization) throws DataTypeException {
		for(int i = 0; i < xon_gt1_21_guarantorOrganization.length; i++) {
			CommonService.setXON_v23(this.gt1.getGt121_GuarantorOrganization(i), xon_gt1_21_guarantorOrganization[i]);
		}
		this.xon_gt1_21_guarantorOrganization = xon_gt1_21_guarantorOrganization;
	}
	/**
	 *	@return the gt1_22_guarantorBillingHoldFlag
	 */
	
	@JsonProperty("gt1_22_guarantorBillingHoldFlag")
	public String getGt1_22_guarantorBillingHoldFlag() {
		return this.gt1.getGt122_GuarantorBillingHoldFlag().getValue()==null?"":this.gt1.getGt122_GuarantorBillingHoldFlag().getValue();
	}
	/**
	 * @param gt1_22_guarantorBillingHoldFlag the gt1_22_guarantorBillingHoldFlag to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_22_guarantorBillingHoldFlag")
	public void setGt1_22_guarantorBillingHoldFlag(String gt1_22_guarantorBillingHoldFlag) throws DataTypeException {
		this.gt1.getGt122_GuarantorBillingHoldFlag().setValue(gt1_22_guarantorBillingHoldFlag);
		this.gt1_22_guarantorBillingHoldFlag = gt1_22_guarantorBillingHoldFlag;
	}
	/**
	 *	@return the ce_gt1_23_guarantorCreditRatingCode
	 */
	
	@JsonProperty("ce_gt1_23_guarantorCreditRatingCode")
	public CE_v2 getCe_gt1_23_guarantorCreditRatingCode() {
		return CommonService.getCE_v2(this.gt1.getGt123_GuarantorCreditRatingCode());
	}
	/**
	 * @param ce_gt1_23_guarantorCreditRatingCode the ce_gt1_23_guarantorCreditRatingCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_gt1_23_guarantorCreditRatingCode")
	public void setCe_gt1_23_guarantorCreditRatingCode(CE_v2 ce_gt1_23_guarantorCreditRatingCode) throws DataTypeException {
		CommonService.setCE_v2(this.gt1.getGt123_GuarantorCreditRatingCode(), ce_gt1_23_guarantorCreditRatingCode);
		this.ce_gt1_23_guarantorCreditRatingCode = ce_gt1_23_guarantorCreditRatingCode;
	}
	/**
	 *	@return the ts_gt1_24_guarantorDeathDateAndTime
	 */
	
	@JsonProperty("ts_gt1_24_guarantorDeathDateAndTime")
	public TS_v2 getTs_gt1_24_guarantorDeathDateAndTime() {
		return CommonService.getTS_v2(this.gt1.getGt124_GuarantorDeathDateAndTime());
	}
	/**
	 * @param ts_gt1_24_guarantorDeathDateAndTime the ts_gt1_24_guarantorDeathDateAndTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_gt1_24_guarantorDeathDateAndTime")
	public void setTs_gt1_24_guarantorDeathDateAndTime(TS_v2 ts_gt1_24_guarantorDeathDateAndTime) throws DataTypeException {
		CommonService.setTS_v2(this.gt1.getGt124_GuarantorDeathDateAndTime(), ts_gt1_24_guarantorDeathDateAndTime);
		this.ts_gt1_24_guarantorDeathDateAndTime = ts_gt1_24_guarantorDeathDateAndTime;
	}
	/**
	 *	@return the gt1_25_guarantorDeathFlag
	 */
	
	@JsonProperty("gt1_25_guarantorDeathFlag")
	public String getGt1_25_guarantorDeathFlag() {
		return this.gt1.getGt125_GuarantorDeathFlag().getValue()==null?"":this.gt1.getGt125_GuarantorDeathFlag().getValue();
	}
	/**
	 * @param gt1_25_guarantorDeathFlag the gt1_25_guarantorDeathFlag to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_25_guarantorDeathFlag")
	public void setGt1_25_guarantorDeathFlag(String gt1_25_guarantorDeathFlag) throws DataTypeException {
		this.gt1.getGt125_GuarantorDeathFlag().setValue(gt1_25_guarantorDeathFlag);
		this.gt1_25_guarantorDeathFlag = gt1_25_guarantorDeathFlag;
	}
	/**
	 *	@return the ce_gt1_26_guarantorChargeAdjustmentCode
	 */
	
	@JsonProperty("ce_gt1_26_guarantorChargeAdjustmentCode")
	public CE_v2 getCe_gt1_26_guarantorChargeAdjustmentCode() {
		return CommonService.getCE_v2(this.gt1.getGt126_GuarantorChargeAdjustmentCode());
	}
	/**
	 * @param ce_gt1_26_guarantorChargeAdjustmentCode the ce_gt1_26_guarantorChargeAdjustmentCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_gt1_26_guarantorChargeAdjustmentCode")
	public void setCe_gt1_26_guarantorChargeAdjustmentCode(CE_v2 ce_gt1_26_guarantorChargeAdjustmentCode) throws DataTypeException {
		CommonService.setCE_v2(this.gt1.getGt126_GuarantorChargeAdjustmentCode(), ce_gt1_26_guarantorChargeAdjustmentCode);
		this.ce_gt1_26_guarantorChargeAdjustmentCode = ce_gt1_26_guarantorChargeAdjustmentCode;
	}
	/**
	 *	@return the cp_gt1_27_guarantorHouseHoldAnnualIncome
	 */
	
	@JsonProperty("cp_gt1_27_guarantorHouseHoldAnnualIncome")
	public CP_v2 getCp_gt1_27_guarantorHouseHoldAnnualIncome() {
		return CommonService.getCP_v2(this.gt1.getGt127_GuarantorHouseholdAnnualIncome());
	}
	/**
	 * @param cp_gt1_27_guarantorHouseHoldAnnualIncome the cp_gt1_27_guarantorHouseHoldAnnualIncome to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_gt1_27_guarantorHouseHoldAnnualIncome")
	public void setCp_gt1_27_guarantorHouseHoldAnnualIncome(CP_v2 cp_gt1_27_guarantorHouseHoldAnnualIncome) throws DataTypeException {
		CommonService.setCP_v2(this.gt1.getGt127_GuarantorHouseholdAnnualIncome(), cp_gt1_27_guarantorHouseHoldAnnualIncome);
		this.cp_gt1_27_guarantorHouseHoldAnnualIncome = cp_gt1_27_guarantorHouseHoldAnnualIncome;
	}
	/**
	 *	@return the gt1_28_guarantorHouseholdSize
	 */
	
	@JsonProperty("gt1_28_guarantorHouseholdSize")
	public String getGt1_28_guarantorHouseholdSize() {
		return this.gt1.getGt128_GuarantorHouseholdSize().getValue()==null?"":this.gt1.getGt128_GuarantorHouseholdSize().getValue();
	}
	/**
	 * @param gt1_28_guarantorHouseholdSize the gt1_28_guarantorHouseholdSize to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_28_guarantorHouseholdSize")
	public void setGt1_28_guarantorHouseholdSize(String gt1_28_guarantorHouseholdSize) throws DataTypeException {
		this.gt1.getGt128_GuarantorHouseholdSize().setValue(gt1_28_guarantorHouseholdSize);
		this.gt1_28_guarantorHouseholdSize = gt1_28_guarantorHouseholdSize;
	}
	/**
	 *	@return the cx_gt1_29_guarantorEmployerIdNumber
	 */
	
	@JsonProperty("cx_gt1_29_guarantorEmployerIdNumber")
	public CX_v23[] getCx_gt1_29_guarantorEmployerIdNumber() {
		CX_v23[] guarantorEmployerIdNumber = new CX_v23[this.gt1.getGt129_GuarantorEmployerIDNumber().length];
		for(int i = 0; i < this.gt1.getGt129_GuarantorEmployerIDNumber().length; i++) {
			guarantorEmployerIdNumber[i] = CommonService.getCX_v23(this.gt1.getGt129_GuarantorEmployerIDNumber(i));
		}
		return guarantorEmployerIdNumber;
	}
	/**
	 * @param cx_gt1_29_guarantorEmployerIdNumber the cx_gt1_29_guarantorEmployerIdNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_gt1_29_guarantorEmployerIdNumber")
	public void setCx_gt1_29_guarantorEmployerIdNumber(CX_v23[] cx_gt1_29_guarantorEmployerIdNumber) throws DataTypeException {
		for(int i = 0; i < cx_gt1_29_guarantorEmployerIdNumber.length; i++) {
			CommonService.setCX_v23(this.gt1.getGt129_GuarantorEmployerIDNumber(i), cx_gt1_29_guarantorEmployerIdNumber[i]);
		}
		this.cx_gt1_29_guarantorEmployerIdNumber = cx_gt1_29_guarantorEmployerIdNumber;
	}
	/**
	 *	@return the gt1_30_guarantorMaritalStatusCode
	 */
	
	@JsonProperty("gt1_30_guarantorMaritalStatusCode")
	public String getGt1_30_guarantorMaritalStatusCode() {
		return CommonService.getString(this.gt1.getGt130_GuarantorMaritalStatusCode().getValue());
	}
	/**
	 * @param gt1_30_guarantorMaritalStatusCode the gt1_30_guarantorMaritalStatusCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_30_guarantorMaritalStatusCode")
	public void setGt1_30_guarantorMaritalStatusCode(String gt1_30_guarantorMaritalStatusCode) throws DataTypeException {
		this.gt1.getGt130_GuarantorMaritalStatusCode().setValue(gt1_30_guarantorMaritalStatusCode);
		this.gt1_30_guarantorMaritalStatusCode = gt1_30_guarantorMaritalStatusCode;
	}
	/**
	 *	@return the gt1_31_guarantorHireEffectiveDate
	 */
	
	@JsonProperty("gt1_31_guarantorHireEffectiveDate")
	public String getGt1_31_guarantorHireEffectiveDate() {
		return CommonService.getString(this.gt1.getGt131_GuarantorHireEffectiveDate().getValue());
	}
	/**
	 * @param gt1_31_guarantorHireEffectiveDate the gt1_31_guarantorHireEffectiveDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_31_guarantorHireEffectiveDate")
	public void setGt1_31_guarantorHireEffectiveDate(String gt1_31_guarantorHireEffectiveDate) throws DataTypeException {
		this.gt1.getGt131_GuarantorHireEffectiveDate().setValue(gt1_31_guarantorHireEffectiveDate);
		this.gt1_31_guarantorHireEffectiveDate = gt1_31_guarantorHireEffectiveDate;
	}
	/**
	 *	@return the gt1_32_employmentStopDate
	 */
	
	@JsonProperty("gt1_32_employmentStopDate")
	public String getGt1_32_employmentStopDate() {
		return CommonService.getString(this.gt1.getGt132_EmploymentStopDate().getValue());
	}
	/**
	 * @param gt1_32_employmentStopDate the gt1_32_employmentStopDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_32_employmentStopDate")
	public void setGt1_32_employmentStopDate(String gt1_32_employmentStopDate) throws DataTypeException {
		this.gt1.getGt132_EmploymentStopDate().setValue(gt1_32_employmentStopDate);
		this.gt1_32_employmentStopDate = gt1_32_employmentStopDate;
	}
	/**
	 *	@return the gt1_33_livingDependency
	 */
	
	@JsonProperty("gt1_33_livingDependency")
	public String getGt1_33_livingDependency() {
		return CommonService.getString(this.gt1.getGt133_LivingDependency().getValue());
	}
	/**
	 * @param gt1_33_livingDependency the gt1_33_livingDependency to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_33_livingDependency")
	public void setGt1_33_livingDependency(String gt1_33_livingDependency) throws DataTypeException {
		this.gt1.getGt133_LivingDependency().setValue(gt1_33_livingDependency);
		this.gt1_33_livingDependency = gt1_33_livingDependency;
	}
	/**
	 *	@return the gt1_34_ambulatoryStatusCode
	 */
	
	@JsonProperty("gt1_34_ambulatoryStatusCode")
	public String getGt1_34_ambulatoryStatusCode() {
		return CommonService.getString(this.gt1.getGt134_AmbulatoryStatus().getValue());
	}
	/**
	 * @param gt1_34_ambulatoryStatusCode the gt1_34_ambulatoryStatusCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_34_ambulatoryStatusCode")
	public void setGt1_34_ambulatoryStatusCode(String gt1_34_ambulatoryStatusCode) throws DataTypeException {
		this.gt1.getGt134_AmbulatoryStatus().setValue(gt1_34_ambulatoryStatusCode);
		this.gt1_34_ambulatoryStatusCode = gt1_34_ambulatoryStatusCode;
	}
	/**
	 *	@return the gt1_35_citizenship
	 */
	
	@JsonProperty("gt1_35_citizenship")
	public String getGt1_35_citizenship() {
		return CommonService.getString(this.gt1.getGt135_Citizenship().getValue());
	}
	/**
	 * @param gt1_35_citizenship the gt1_35_citizenship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_35_citizenship")
	public void setGt1_35_citizenship(String gt1_35_citizenship) throws DataTypeException {
		this.gt1.getGt135_Citizenship().setValue(gt1_35_citizenship);
		this.gt1_35_citizenship = gt1_35_citizenship;
	}
	/**
	 *	@return the ce_gt1_36_primaryLanguage
	 */
	
	@JsonProperty("ce_gt1_36_primaryLanguage")
	public CE_v2 getCe_gt1_36_primaryLanguage() {
		return CommonService.getCE_v2(this.gt1.getGt136_PrimaryLanguage());
	}
	/**
	 * @param ce_gt1_36_primaryLanguage the ce_gt1_36_primaryLanguage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_gt1_36_primaryLanguage")
	public void setCe_gt1_36_primaryLanguage(CE_v2 ce_gt1_36_primaryLanguage) throws DataTypeException {
		CommonService.setCE_v2(this.gt1.getGt136_PrimaryLanguage(), ce_gt1_36_primaryLanguage);
		this.ce_gt1_36_primaryLanguage = ce_gt1_36_primaryLanguage;
	}
	/**
	 *	@return the gt1_37_livingArrangement
	 */
	
	@JsonProperty("gt1_37_livingArrangement")
	public String getGt1_37_livingArrangement() {
		return CommonService.getString(this.gt1.getGt137_LivingArrangement().getValue());
	}
	/**
	 * @param gt1_37_livingArrangement the gt1_37_livingArrangement to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_37_livingArrangement")
	public void setGt1_37_livingArrangement(String gt1_37_livingArrangement) throws DataTypeException {
		this.gt1.getGt137_LivingArrangement().setValue(gt1_37_livingArrangement);
		this.gt1_37_livingArrangement = gt1_37_livingArrangement;
	}
	/**
	 *	@return the ce_gt1_38_publicityIndicator
	 */
	
	@JsonProperty("ce_gt1_38_publicityIndicator")
	public CE_v2 getCe_gt1_38_publicityIndicator() {
		return CommonService.getCE_v2(this.gt1.getGt138_PublicityIndicator());
	}
	/**
	 * @param ce_gt1_38_publicityIndicator the ce_gt1_38_publicityIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_gt1_38_publicityIndicator")
	public void setCe_gt1_38_publicityIndicator(CE_v2 ce_gt1_38_publicityIndicator) throws DataTypeException {
		CommonService.setCE_v2(this.gt1.getGt138_PublicityIndicator(), ce_gt1_38_publicityIndicator);
		this.ce_gt1_38_publicityIndicator = ce_gt1_38_publicityIndicator;
	}
	/**
	 *	@return the gt1_39_protectionIndicator
	 */
	
	@JsonProperty("gt1_39_protectionIndicator")
	public String getGt1_39_protectionIndicator() {
		return CommonService.getString(this.gt1.getGt139_ProtectionIndicator().getValue());	
	}
	/**
	 * @param gt1_39_protectionIndicator the gt1_39_protectionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_39_protectionIndicator")
	public void setGt1_39_protectionIndicator(String gt1_39_protectionIndicator) throws DataTypeException {
		this.gt1.getGt139_ProtectionIndicator().setValue(gt1_39_protectionIndicator);
		this.gt1_39_protectionIndicator = gt1_39_protectionIndicator;
	}
	/**
	 *	@return the gt1_40_studentIndicator
	 */
	
	@JsonProperty("gt1_40_studentIndicator")
	public String getGt1_40_studentIndicator() {
		return CommonService.getString(this.gt1.getGt140_StudentIndicator().getValue());
	}
	/**
	 * @param gt1_40_studentIndicator the gt1_40_studentIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_40_studentIndicator")
	public void setGt1_40_studentIndicator(String gt1_40_studentIndicator) throws DataTypeException {
		this.gt1.getGt140_StudentIndicator().setValue(gt1_40_studentIndicator);
		this.gt1_40_studentIndicator = gt1_40_studentIndicator;
	}
	/**
	 *	@return the gt1_41_religion
	 */
	
	@JsonProperty("gt1_41_religion")
	public String getGt1_41_religion() {
		return CommonService.getString(this.gt1.getGt141_Religion().getValue());
	}
	/**
	 * @param gt1_41_religion the gt1_41_religion to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_41_religion")
	public void setGt1_41_religion(String gt1_41_religion) throws DataTypeException {
		this.gt1.getGt141_Religion().setValue(gt1_41_religion);
		this.gt1_41_religion = gt1_41_religion;
	}
	/**
	 *	@return the xpn_gt1_42_mothersMaidenName
	 */
	
	@JsonProperty("xpn_gt1_42_mothersMaidenName")
	public XPN_v23 getXpn_gt1_42_mothersMaidenName() {
		return CommonService.getXPN_v23(this.gt1.getGt142_MotherSMaidenName());
	}
	/**
	 * @param xpn_gt1_42_mothersMaidenName the xpn_gt1_42_mothersMaidenName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_gt1_42_mothersMaidenName")
	public void setXpn_gt1_42_mothersMaidenName(XPN_v23 xpn_gt1_42_mothersMaidenName) throws DataTypeException {
		CommonService.setXPN_v23(this.gt1.getGt142_MotherSMaidenName(), xpn_gt1_42_mothersMaidenName);
		this.xpn_gt1_42_mothersMaidenName = xpn_gt1_42_mothersMaidenName;
	}
	/**
	 *	@return the ce_gt1_43_nationalityCode
	 */
	
	@JsonProperty("ce_gt1_43_nationalityCode")
	public CE_v2 getCe_gt1_43_nationalityCode() {
		return CommonService.getCE_v2(this.gt1.getGt143_NationalityCode());
	}
	/**
	 * @param ce_gt1_43_nationalityCode the ce_gt1_43_nationalityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_gt1_43_nationalityCode")
	public void setCe_gt1_43_nationalityCode(CE_v2 ce_gt1_43_nationalityCode) throws DataTypeException {
		CommonService.setCE_v2(this.gt1.getGt143_NationalityCode(), ce_gt1_43_nationalityCode);
		this.ce_gt1_43_nationalityCode = ce_gt1_43_nationalityCode;
	}
	/**
	 *	@return the gt1_44_ethnicGroup
	 */
	
	@JsonProperty("gt1_44_ethnicGroup")
	public String getGt1_44_ethnicGroup() {
		return CommonService.getString(this.gt1.getGt144_EthnicGroup().getValue());
	}
	/**
	 * @param gt1_44_ethnicGroup the gt1_44_ethnicGroup to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_44_ethnicGroup")
	public void setGt1_44_ethnicGroup(String gt1_44_ethnicGroup) throws DataTypeException {
		this.gt1.getGt144_EthnicGroup().setValue(gt1_44_ethnicGroup);
		this.gt1_44_ethnicGroup = gt1_44_ethnicGroup;
	}
	/**
	 *	@return the xpn_gt1_45_contactPersonsName
	 */
	
	@JsonProperty("xpn_gt1_45_contactPersonsName")
	public XPN_v23[] getXpn_gt1_45_contactPersonsName() {
		XPN_v23[] contactPersonsName = new XPN_v23[this.gt1.getGt145_ContactPersonSName().length];
		for(int i = 0; i < this.gt1.getGt145_ContactPersonSName().length; i++) {
			contactPersonsName[i] = CommonService.getXPN_v23(this.gt1.getGt145_ContactPersonSName(i));
		}
		return contactPersonsName;
	}
	/**
	 * @param xpn_gt1_45_contactPersonsName the xpn_gt1_45_contactPersonsName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_gt1_45_contactPersonsName")
	public void setXpn_gt1_45_contactPersonsName(XPN_v23[] xpn_gt1_45_contactPersonsName) throws DataTypeException {
		for(int i = 0; i < xpn_gt1_45_contactPersonsName.length; i++) {
			CommonService.setXPN_v23(this.gt1.getGt145_ContactPersonSName(i), xpn_gt1_45_contactPersonsName[i]);
		}
		this.xpn_gt1_45_contactPersonsName = xpn_gt1_45_contactPersonsName;
	}
	/**
	 *	@return the xtn_gt1_46_contactPersonsTelephoneNumber
	 */
	
	@JsonProperty("xtn_gt1_46_contactPersonsTelephoneNumber")
	public XTN_v23[] getXtn_gt1_46_contactPersonsTelephoneNumber() {
		XTN_v23[] contactPersonsTelephoneNumber = new XTN_v23[this.gt1.getGt146_ContactPersonSTelephoneNumber().length];
		for(int i = 0; i< this.gt1.getGt146_ContactPersonSTelephoneNumber().length; i++) {
			contactPersonsTelephoneNumber[i] = CommonService.getXTN_v23(this.gt1.getGt146_ContactPersonSTelephoneNumber(i));
		}
		return contactPersonsTelephoneNumber;
	}
	/**
	 * @param xtn_gt1_46_contactPersonsTelephoneNumber the xtn_gt1_46_contactPersonsTelephoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_gt1_46_contactPersonsTelephoneNumber")
	public void setXtn_gt1_46_contactPersonsTelephoneNumber(XTN_v23[] xtn_gt1_46_contactPersonsTelephoneNumber) throws DataTypeException {
		for(int i = 0; i<xtn_gt1_46_contactPersonsTelephoneNumber.length; i++) {
			CommonService.setXTN_v23(this.gt1.getGt146_ContactPersonSTelephoneNumber(i), xtn_gt1_46_contactPersonsTelephoneNumber[i]);
		}
		this.xtn_gt1_46_contactPersonsTelephoneNumber = xtn_gt1_46_contactPersonsTelephoneNumber;
	}
	/**
	 *	@return the ce_gt1_47_contactReason
	 */
	
	@JsonProperty("ce_gt1_47_contactReason")
	public CE_v2 getCe_gt1_47_contactReason() {
		return CommonService.getCE_v2(this.gt1.getGt147_ContactReason());
	}
	/**
	 * @param ce_gt1_47_contactReason the ce_gt1_47_contactReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_gt1_47_contactReason")
	public void setCe_gt1_47_contactReason(CE_v2 ce_gt1_47_contactReason) throws DataTypeException {
		CommonService.setCE_v2(this.gt1.getGt147_ContactReason(), ce_gt1_47_contactReason);
		this.ce_gt1_47_contactReason = ce_gt1_47_contactReason;
	}
	/**
	 *	@return the gt1_48_contactRelationshipCode
	 */
	
	@JsonProperty("gt1_48_contactRelationshipCode")
	public String getGt1_48_contactRelationshipCode() {
		return CommonService.getString(this.gt1.getGt148_ContactRelationshipCode().getValue());
	}
	/**
	 * @param gt1_48_contactRelationshipCode the gt1_48_contactRelationshipCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_48_contactRelationshipCode")
	public void setGt1_48_contactRelationshipCode(String gt1_48_contactRelationshipCode) throws DataTypeException {
		this.gt1.getGt148_ContactRelationshipCode().setValue(gt1_48_contactRelationshipCode);
		this.gt1_48_contactRelationshipCode = gt1_48_contactRelationshipCode;
	}
	/**
	 *	@return the gt1_49_jobTitle
	 */
	
	@JsonProperty("gt1_49_jobTitle")
	public String getGt1_49_jobTitle() {
		return CommonService.getString(this.gt1.getGt149_JobTitle().getValue());
	}
	/**
	 * @param gt1_49_jobTitle the gt1_49_jobTitle to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_49_jobTitle")
	public void setGt1_49_jobTitle(String gt1_49_jobTitle) throws DataTypeException {
		this.gt1.getGt149_JobTitle().setValue(gt1_49_jobTitle);
		this.gt1_49_jobTitle = gt1_49_jobTitle;
	}
	/**
	 *	@return the jcc_gt1_50_jobCodeClass
	 */
	
	@JsonProperty("jcc_gt1_50_jobCodeClass")
	public JCC_v23 getJcc_gt1_50_jobCodeClass() {
		return CommonService.getJCC_v23(this.gt1.getGt150_JobCodeClass());
	}
	/**
	 * @param jcc_gt1_50_jobCodeClass the jcc_gt1_50_jobCodeClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("jcc_gt1_50_jobCodeClass")
	public void setJcc_gt1_50_jobCodeClass(JCC_v23 jcc_gt1_50_jobCodeClass) throws DataTypeException {
		CommonService.setJCC_v23(this.gt1.getGt150_JobCodeClass(), jcc_gt1_50_jobCodeClass);
		this.jcc_gt1_50_jobCodeClass = jcc_gt1_50_jobCodeClass;
	}
	/**
	 *	@return the xon_gt1_51_guarantorEmployersOrganizationName
	 */
	
	@JsonProperty("xon_gt1_51_guarantorEmployersOrganizationName")
	public XON_v23[] getXon_gt1_51_guarantorEmployersOrganizationName() {
		XON_v23[] guarantorEmployersOrganizationName = new XON_v23[this.gt1.getGt151_GuarantorEmployerSOrganizationName().length];
		for(int i = 0; i < this.gt1.getGt151_GuarantorEmployerSOrganizationName().length; i++) {
			guarantorEmployersOrganizationName[i] = CommonService.getXON_v23(this.gt1.getGt151_GuarantorEmployerSOrganizationName(i));
		}
		return guarantorEmployersOrganizationName;
	}
	/**
	 * @param xon_gt1_51_guarantorEmployersOrganizationName the xon_gt1_51_guarantorEmployersOrganizationName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_gt1_51_guarantorEmployersOrganizationName")
	public void setXon_gt1_51_guarantorEmployersOrganizationName(XON_v23[] xon_gt1_51_guarantorEmployersOrganizationName) throws DataTypeException {
		for(int i = 0; i <xon_gt1_51_guarantorEmployersOrganizationName.length; i++) {
			CommonService.setXON_v23(this.gt1.getGt151_GuarantorEmployerSOrganizationName(i), xon_gt1_51_guarantorEmployersOrganizationName[i]);
		}
		this.xon_gt1_51_guarantorEmployersOrganizationName = xon_gt1_51_guarantorEmployersOrganizationName;
	}
	/**
	 *	@return the gt1_52_handicap
	 */
	
	@JsonProperty("gt1_52_handicap")
	public String getGt1_52_handicap() {
		return CommonService.getString(this.gt1.getGt152_Handicap().getValue());
	}
	/**
	 * @param gt1_52_handicap the gt1_52_handicap to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_52_handicap")
	public void setGt1_52_handicap(String gt1_52_handicap) throws DataTypeException {
		this.gt1.getGt152_Handicap().setValue(gt1_52_handicap);
		this.gt1_52_handicap = gt1_52_handicap;
	}
	/**
	 *	@return the gt1_53_jobStatus
	 */
	
	@JsonProperty("gt1_53_jobStatus")
	public String getGt1_53_jobStatus() {
		return CommonService.getString(this.gt1.getGt153_JobStatus().getValue());
	}
	/**
	 * @param gt1_53_jobStatus the gt1_53_jobStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_53_jobStatus")
	public void setGt1_53_jobStatus(String gt1_53_jobStatus) throws DataTypeException {
		this.gt1.getGt153_JobStatus().setValue(gt1_53_jobStatus);
		this.gt1_53_jobStatus = gt1_53_jobStatus;
	}
	/**
	 *	@return the fc_gt1_54_guarantorFinancialClass
	 */
	
	@JsonProperty("fc_gt1_54_guarantorFinancialClass")
	public FC_v23 getFc_gt1_54_guarantorFinancialClass() {
		return CommonService.getFC_v23(this.gt1.getGt154_GuarantorFinancialClass());
	}
	/**
	 * @param fc_gt1_54_guarantorFinancialClass the fc_gt1_54_guarantorFinancialClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("fc_gt1_54_guarantorFinancialClass")
	public void setFc_gt1_54_guarantorFinancialClass(FC_v23 fc_gt1_54_guarantorFinancialClass) throws DataTypeException {
		CommonService.setFC_v23(this.gt1.getGt154_GuarantorFinancialClass(), fc_gt1_54_guarantorFinancialClass);
		this.fc_gt1_54_guarantorFinancialClass = fc_gt1_54_guarantorFinancialClass;
	}
	/**
	 *	@return the gt1_55_guarantorRace
	 */
	
	@JsonProperty("gt1_55_guarantorRace")
	public String getGt1_55_guarantorRace() {
		return CommonService.getString(this.gt1.getGt155_GuarantorRace().getValue());
	}
	/**
	 * @param gt1_55_guarantorRace the gt1_55_guarantorRace to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("gt1_55_guarantorRace")
	public void setGt1_55_guarantorRace(String gt1_55_guarantorRace) throws DataTypeException {
		this.gt1.getGt155_GuarantorRace().setValue(gt1_55_guarantorRace);
		this.gt1_55_guarantorRace = gt1_55_guarantorRace;
	}
	
}
