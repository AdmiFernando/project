package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.NK1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.JCC_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomNK1 implements Serializable {
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
	
	private NK1 nk1;
	
	private CustomNK1(NK1 nk1) {
		super();
		this.nk1 =nk1;
	}
	public static CustomNK1 createNk1WithTypeAndVersion(NK1 nk1) throws HL7Exception, IOException {
		return new CustomNK1(nk1);
	}
	/**
	 *	@return the nk1_1_setId
	 */
	
	@JsonProperty("nk1_1_setId")
	public String getNk1_1_setId() {
		return CommonService.getString(this.nk1.getNk11_SetIDNextOfKin().getValue());
	}
	/**
	 * @param nk1_1_setId the nk1_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_1_setId")
	public void setNk1_1_setId(String nk1_1_setId) throws DataTypeException {
		this.nk1.getNk11_SetIDNextOfKin().setValue(nk1_1_setId);
		this.nk1_1_setId = nk1_1_setId;
	}
	/**
	 *	@return the xpn_nk1_2_nkName
	 */
	
	@JsonProperty("xpn_nk1_2_nkName")
	public XPN_v23[] getXpn_nk1_2_nkName() {
		XPN_v23[] nkName = new XPN_v23[this.nk1.getNk12_NKName().length];
		for(int i = 0; i< this.nk1.getNk12_NKName().length;i++) {
			nkName[i] = CommonService.getXPN_v23(this.nk1.getNk12_NKName(i));
		}
		return nkName;
	}
	/**
	 * @param xpn_nk1_2_nkName the xpn_nk1_2_nkName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_nk1_2_nkName")
	public void setXpn_nk1_2_nkName(XPN_v23[] xpn_nk1_2_nkName) throws DataTypeException {
		for(int i = 0; i< xpn_nk1_2_nkName.length;i++) {
			CommonService.setXPN_v23(this.nk1.getNk12_NKName(i), xpn_nk1_2_nkName[i]);
		}
		this.xpn_nk1_2_nkName = xpn_nk1_2_nkName;
	}
	/**
	 *	@return the ce_nk1_3_relationship
	 */
	
	@JsonProperty("ce_nk1_3_relationship")
	public CE_v2 getCe_nk1_3_relationship() {
		return CommonService.getCE_v2(this.nk1.getNk13_Relationship());
	}
	/**
	 * @param ce_nk1_3_relationship the ce_nk1_3_relationship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_nk1_3_relationship")
	public void setCe_nk1_3_relationship(CE_v2 ce_nk1_3_relationship) throws DataTypeException {
		CommonService.setCE_v2(this.nk1.getNk13_Relationship(), ce_nk1_3_relationship);
		this.ce_nk1_3_relationship = ce_nk1_3_relationship;
	}
	/**
	 *	@return the xad_nk1_4_address
	 */
	
	@JsonProperty("xad_nk1_4_address")
	public XAD_v23[] getXad_nk1_4_address() {
		XAD_v23[] address = new XAD_v23[this.nk1.getNk14_Address().length];
		for(int i = 0; i<this.nk1.getNk14_Address().length; i++) {
			address[i] = CommonService.getXAD_v23(this.nk1.getNk14_Address(i));
		}
		return xad_nk1_4_address;
	}
	/**
	 * @param xad_nk1_4_address the xad_nk1_4_address to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_nk1_4_address")
	public void setXad_nk1_4_address(XAD_v23[] xad_nk1_4_address) throws DataTypeException {
		for(int i = 0; i<xad_nk1_4_address.length; i++) {
			CommonService.setXAD_v23(this.nk1.getNk14_Address(i), xad_nk1_4_address[i]);
		}
		this.xad_nk1_4_address = xad_nk1_4_address;
	}
	/**
	 *	@return the xtn_nk1_5_phoneNumber
	 */
	
	@JsonProperty("xtn_nk1_5_phoneNumber")
	public XTN_v23[] getXtn_nk1_5_phoneNumber() {
		XTN_v23[] phoneNumber = new XTN_v23[this.nk1.getNk15_PhoneNumber().length];
		for(int i = 0; i< this.nk1.getNk15_PhoneNumber().length;i++) {
			phoneNumber[i] = CommonService.getXTN_v23(this.nk1.getNk15_PhoneNumber(i));
		}
		return phoneNumber;
	}
	/**
	 * @param xtn_nk1_5_phoneNumber the xtn_nk1_5_phoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_nk1_5_phoneNumber")
	public void setXtn_nk1_5_phoneNumber(XTN_v23[] xtn_nk1_5_phoneNumber) throws DataTypeException {
		for(int i = 0; i<xtn_nk1_5_phoneNumber.length;i++) {
			CommonService.setXTN_v23(this.nk1.getNk15_PhoneNumber(i), xtn_nk1_5_phoneNumber[i]);
		}
		this.xtn_nk1_5_phoneNumber = xtn_nk1_5_phoneNumber;
	}
	/**
	 *	@return the xtn_nk1_6_businessPhoneNumber
	 */
	
	@JsonProperty("xtn_nk1_6_businessPhoneNumber")
	public XTN_v23[] getXtn_nk1_6_businessPhoneNumber() {
		XTN_v23[] businessPhoneNumber = new XTN_v23[this.nk1.getNk16_BusinessPhoneNumber().length];
		for(int i = 0; i<this.nk1.getNk16_BusinessPhoneNumber().length; i++) {
			businessPhoneNumber[i]=CommonService.getXTN_v23(this.nk1.getNk16_BusinessPhoneNumber(i));
		}
		return businessPhoneNumber;
	}
	/**
	 * @param xtn_nk1_6_businessPhoneNumber the xtn_nk1_6_businessPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_nk1_6_businessPhoneNumber")
	public void setXtn_nk1_6_businessPhoneNumber(XTN_v23[] xtn_nk1_6_businessPhoneNumber) throws DataTypeException {
		for(int i = 0; i<xtn_nk1_6_businessPhoneNumber.length; i++) {
			CommonService.setXTN_v23(this.nk1.getNk16_BusinessPhoneNumber(i), xtn_nk1_6_businessPhoneNumber[i]);
		}
		this.xtn_nk1_6_businessPhoneNumber = xtn_nk1_6_businessPhoneNumber;
	}
	/**
	 *	@return the ce_nk1_7_contactRole
	 */
	
	@JsonProperty("ce_nk1_7_contactRole")
	public CE_v2 getCe_nk1_7_contactRole() {
		return CommonService.getCE_v2(this.nk1.getNk17_ContactRole());
	}
	/**
	 * @param ce_nk1_7_contactRole the ce_nk1_7_contactRole to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_nk1_7_contactRole")
	public void setCe_nk1_7_contactRole(CE_v2 ce_nk1_7_contactRole) throws DataTypeException {
		CommonService.setCE_v2(this.nk1.getNk17_ContactRole(), ce_nk1_7_contactRole);
		this.ce_nk1_7_contactRole = ce_nk1_7_contactRole;
	}
	/**
	 *	@return the nk1_8_startDate
	 */
	
	@JsonProperty("nk1_8_startDate")
	public String getNk1_8_startDate() {
		return CommonService.getString(this.nk1.getNk18_StartDate().getValue());
	}
	/**
	 * @param nk1_8_startDate the nk1_8_startDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_8_startDate")
	public void setNk1_8_startDate(String nk1_8_startDate) throws DataTypeException {
		this.nk1.getNk18_StartDate().setValue(nk1_8_startDate);
		this.nk1_8_startDate = nk1_8_startDate;
	}
	/**
	 *	@return the nk1_9_endDate
	 */
	
	@JsonProperty("nk1_9_endDate")
	public String getNk1_9_endDate() {
		return CommonService.getString(this.nk1.getNk19_EndDate().getValue());
	}
	/**
	 * @param nk1_9_endDate the nk1_9_endDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_9_endDate")
	public void setNk1_9_endDate(String nk1_9_endDate) throws DataTypeException {
		this.nk1.getNk19_EndDate().setValue(nk1_9_endDate);
		this.nk1_9_endDate = nk1_9_endDate;
	}
	/**
	 *	@return the nk1_10_nextOfKinAssociatedPartiesJodTitle
	 */
	
	@JsonProperty("nk1_10_nextOfKinAssociatedPartiesJodTitle")
	public String getNk1_10_nextOfKinAssociatedPartiesJodTitle() {
		return CommonService.getString(this.nk1.getNk110_NextOfKinAssociatedPartiesJobTitle().getValue());
	}
	/**
	 * @param nk1_10_nextOfKinAssociatedPartiesJodTitle the nk1_10_nextOfKinAssociatedPartiesJodTitle to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_10_nextOfKinAssociatedPartiesJodTitle")
	public void setNk1_10_nextOfKinAssociatedPartiesJodTitle(String nk1_10_nextOfKinAssociatedPartiesJodTitle) throws DataTypeException {
		this.nk1.getNk110_NextOfKinAssociatedPartiesJobTitle().setValue(nk1_10_nextOfKinAssociatedPartiesJodTitle);
		this.nk1_10_nextOfKinAssociatedPartiesJodTitle = nk1_10_nextOfKinAssociatedPartiesJodTitle;
	}
	/**
	 *	@return the jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass
	 */
	
	@JsonProperty("jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass")
	public JCC_v23 getJcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass() {
		return CommonService.getJCC_v23(this.nk1.getNk111_NextOfKinJobAssociatedPartiesCodeClass());
	}
	/**
	 * @param jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass the jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass")
	public void setJcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass(
			JCC_v23 jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass) throws DataTypeException {
		CommonService.setJCC_v23(this.nk1.getNk111_NextOfKinJobAssociatedPartiesCodeClass(), jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass);
		this.jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass = jcc_nk1_11_nextOfKinJobAssociatedPartiesCodeClass;
	}
	/**
	 *	@return the cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber
	 */
	
	@JsonProperty("cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber")
	public CX_v23 getCx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber() {
		return CommonService.getCX_v23(this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber());
	}
	/**
	 * @param cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber the cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber")
	public void setCx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber(
			CX_v23 cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber) throws DataTypeException {
		CommonService.setCX_v23(this.nk1.getNk112_NextOfKinAssociatedPartiesEmployeeNumber(), cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber);
		this.cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber = cx_nk1_12_nextOfKinAssociatedPartiesEmployeeNumber;
	}
	/**
	 *	@return the xon_nk1_13_organizationName
	 */
	
	@JsonProperty("xon_nk1_13_organizationName")
	public XON_v23[] getXon_nk1_13_organizationName() {
		XON_v23[] organizationName = new XON_v23[this.nk1.getNk113_OrganizationName().length];
		for(int i =0; i<this.nk1.getNk113_OrganizationName().length;i++) {
			organizationName[i] = CommonService.getXON_v23(this.nk1.getNk113_OrganizationName(i));
		}
		return organizationName;
	}
	/**
	 * @param xon_nk1_13_organizationName the xon_nk1_13_organizationName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_nk1_13_organizationName")
	public void setXon_nk1_13_organizationName(XON_v23[] xon_nk1_13_organizationName) throws DataTypeException {
		for(int i =0; i<xon_nk1_13_organizationName.length;i++) {
			CommonService.setXON_v23(this.nk1.getNk113_OrganizationName(i), xon_nk1_13_organizationName[i]);
		}
		this.xon_nk1_13_organizationName = xon_nk1_13_organizationName;
	}
	/**
	 *	@return the nk1_14_maritalStatus
	 */
	
	@JsonProperty("nk1_14_maritalStatus")
	public String[] getNk1_14_maritalStatus() {
		String[] maritalStatus = new String[this.nk1.getNk114_MaritalStatus().length];
		for(int i =0;i<this.nk1.getNk114_MaritalStatus().length;i++) {
			maritalStatus[i] = CommonService.getString(this.nk1.getNk114_MaritalStatus(i).getValue());
		}
		return maritalStatus;
	}
	/**
	 * @param nk1_14_maritalStatus the nk1_14_maritalStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_14_maritalStatus")
	public void setNk1_14_maritalStatus(String[] nk1_14_maritalStatus) throws DataTypeException {
		for(int i =0;i<nk1_14_maritalStatus.length;i++) {
			this.nk1.getNk114_MaritalStatus(i).setValue(nk1_14_maritalStatus[i]);
		}
		this.nk1_14_maritalStatus = nk1_14_maritalStatus;
	}
	/**
	 *	@return the nk1_15_sex
	 */
	
	@JsonProperty("nk1_15_sex")
	public String getNk1_15_sex() {
		return CommonService.getString(this.nk1.getNk115_Sex().getValue());
	}
	/**
	 * @param nk1_15_sex the nk1_15_sex to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_15_sex")
	public void setNk1_15_sex(String nk1_15_sex) throws DataTypeException {
		this.nk1.getNk115_Sex().setValue(nk1_15_sex);
		this.nk1_15_sex = nk1_15_sex;
	}
	/**
	 *	@return the ts_nk1_16_dateOfBirth
	 */
	
	@JsonProperty("ts_nk1_16_dateOfBirth")
	public TS_v2 getTs_nk1_16_dateOfBirth() {
		return CommonService.getTS_v2(this.nk1.getNk116_DateOfBirth());
	}
	/**
	 * @param ts_nk1_16_dateOfBirth the ts_nk1_16_dateOfBirth to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_nk1_16_dateOfBirth")
	public void setTs_nk1_16_dateOfBirth(TS_v2 ts_nk1_16_dateOfBirth) throws DataTypeException {
		CommonService.setTS_v2(this.nk1.getNk116_DateOfBirth(), ts_nk1_16_dateOfBirth);
		this.ts_nk1_16_dateOfBirth = ts_nk1_16_dateOfBirth;
	}
	/**
	 *	@return the nk1_17_livingDependency
	 */
	
	@JsonProperty("nk1_17_livingDependency")
	public String getNk1_17_livingDependency() {
		return CommonService.getString(this.nk1.getNk117_LivingDependency().getValue());
	}
	/**
	 * @param nk1_17_livingDependency the nk1_17_livingDependency to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_17_livingDependency")
	public void setNk1_17_livingDependency(String nk1_17_livingDependency) throws DataTypeException {
		this.nk1.getNk117_LivingDependency().setValue(nk1_17_livingDependency);
		this.nk1_17_livingDependency = nk1_17_livingDependency;
	}
	/**
	 *	@return the nk1_18_ambulatoryStatus
	 */
	
	@JsonProperty("nk1_18_ambulatoryStatus")
	public String getNk1_18_ambulatoryStatus() {
		return CommonService.getString(this.nk1.getNk118_AmbulatoryStatus().getValue());
	}
	/**
	 * @param nk1_18_ambulatoryStatus the nk1_18_ambulatoryStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_18_ambulatoryStatus")
	public void setNk1_18_ambulatoryStatus(String nk1_18_ambulatoryStatus) throws DataTypeException {
		this.nk1.getNk118_AmbulatoryStatus().setValue(nk1_18_ambulatoryStatus);
		this.nk1_18_ambulatoryStatus = nk1_18_ambulatoryStatus;
	}
	/**
	 *	@return the nk1_19_citizenship
	 */
	
	@JsonProperty("nk1_19_citizenship")
	public String getNk1_19_citizenship() {
		return CommonService.getString(this.nk1.getNk119_Citizenship().getValue());
	}
	/**
	 * @param nk1_19_citizenship the nk1_19_citizenship to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_19_citizenship")
	public void setNk1_19_citizenship(String nk1_19_citizenship) throws DataTypeException {
		this.nk1.getNk119_Citizenship().setValue(nk1_19_citizenship);
		this.nk1_19_citizenship = nk1_19_citizenship;
	}
	/**
	 *	@return the ce_nk1_20_primaryLanguage
	 */
	
	@JsonProperty("ce_nk1_20_primaryLanguage")
	public CE_v2 getCe_nk1_20_primaryLanguage() {
		return CommonService.getCE_v2(this.nk1.getNk120_PrimaryLanguage());
	}
	/**
	 * @param ce_nk1_20_primaryLanguage the ce_nk1_20_primaryLanguage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_nk1_20_primaryLanguage")
	public void setCe_nk1_20_primaryLanguage(CE_v2 ce_nk1_20_primaryLanguage) throws DataTypeException {
		CommonService.setCE_v2(this.nk1.getNk120_PrimaryLanguage(), ce_nk1_20_primaryLanguage);
		this.ce_nk1_20_primaryLanguage = ce_nk1_20_primaryLanguage;
	}
	/**
	 *	@return the nk1_21_livingArrangement
	 */
	
	@JsonProperty("nk1_21_livingArrangement")
	public String getNk1_21_livingArrangement() {
		return CommonService.getString(this.nk1.getNk121_LivingArrangement().getValue());
	}
	/**
	 * @param nk1_21_livingArrangement the nk1_21_livingArrangement to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_21_livingArrangement")
	public void setNk1_21_livingArrangement(String nk1_21_livingArrangement) throws DataTypeException {
		this.nk1.getNk121_LivingArrangement().setValue(nk1_21_livingArrangement);
		this.nk1_21_livingArrangement = nk1_21_livingArrangement;
	}
	/**
	 *	@return the ce_nk1_22_publicityIndicator
	 */
	
	@JsonProperty("ce_nk1_22_publicityIndicator")
	public CE_v2 getCe_nk1_22_publicityIndicator() {
		return CommonService.getCE_v2(this.nk1.getNk122_PublicityIndicator());
	}
	/**
	 * @param ce_nk1_22_publicityIndicator the ce_nk1_22_publicityIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_nk1_22_publicityIndicator")
	public void setCe_nk1_22_publicityIndicator(CE_v2 ce_nk1_22_publicityIndicator) throws DataTypeException {
		CommonService.setCE_v2(this.nk1.getNk122_PublicityIndicator(), ce_nk1_22_publicityIndicator);
		this.ce_nk1_22_publicityIndicator = ce_nk1_22_publicityIndicator;
	}
	/**
	 *	@return the nk1_23_protectionIndicator
	 */
	
	@JsonProperty("nk1_23_protectionIndicator")
	public String getNk1_23_protectionIndicator() {
		return CommonService.getString(this.nk1.getNk123_ProtectionIndicator().getValue());
	}
	/**
	 * @param nk1_23_protectionIndicator the nk1_23_protectionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_23_protectionIndicator")
	public void setNk1_23_protectionIndicator(String nk1_23_protectionIndicator) throws DataTypeException {
		this.nk1.getNk123_ProtectionIndicator().setValue(nk1_23_protectionIndicator);
		this.nk1_23_protectionIndicator = nk1_23_protectionIndicator;
	}
	/**
	 *	@return the nk1_24_studentIndicator
	 */
	
	@JsonProperty("nk1_24_studentIndicator")
	public String getNk1_24_studentIndicator() {
		return CommonService.getString(this.nk1.getNk124_StudentIndicator().getValue());
	}
	/**
	 * @param nk1_24_studentIndicator the nk1_24_studentIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_24_studentIndicator")
	public void setNk1_24_studentIndicator(String nk1_24_studentIndicator) throws DataTypeException {
		this.nk1.getNk124_StudentIndicator().setValue(nk1_24_studentIndicator);
		this.nk1_24_studentIndicator = nk1_24_studentIndicator;
	}
	/**
	 *	@return the nk1_25_religion
	 */
	
	@JsonProperty("nk1_25_religion")
	public String getNk1_25_religion() {
		return CommonService.getString(this.nk1.getNk125_Religion().getValue());
	}
	/**
	 * @param nk1_25_religion the nk1_25_religion to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_25_religion")
	public void setNk1_25_religion(String nk1_25_religion) throws DataTypeException {
		this.nk1.getNk125_Religion().setValue(nk1_25_religion);
		this.nk1_25_religion = nk1_25_religion;
	}
	/**
	 *	@return the xpn_nk1_26_mothersMaidenName
	 */
	
	@JsonProperty("xpn_nk1_26_mothersMaidenName")
	public XPN_v23 getXpn_nk1_26_mothersMaidenName() {
		return CommonService.getXPN_v23(this.nk1.getNk126_MotherSMaidenName());
	}
	/**
	 * @param xpn_nk1_26_mothersMaidenName the xpn_nk1_26_mothersMaidenName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_nk1_26_mothersMaidenName")
	public void setXpn_nk1_26_mothersMaidenName(XPN_v23 xpn_nk1_26_mothersMaidenName) throws DataTypeException {
		CommonService.setXPN_v23(this.nk1.getNk126_MotherSMaidenName(), xpn_nk1_26_mothersMaidenName);
		this.xpn_nk1_26_mothersMaidenName = xpn_nk1_26_mothersMaidenName;
	}
	/**
	 *	@return the ce_nk1_27_nationalityCode
	 */
	
	@JsonProperty("ce_nk1_27_nationalityCode")
	public CE_v2 getCe_nk1_27_nationalityCode() {
		return CommonService.getCE_v2(this.nk1.getNk127_NationalityCode());
	}
	/**
	 * @param ce_nk1_27_nationalityCode the ce_nk1_27_nationalityCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_nk1_27_nationalityCode")
	public void setCe_nk1_27_nationalityCode(CE_v2 ce_nk1_27_nationalityCode) throws DataTypeException {
		CommonService.setCE_v2(this.nk1.getNk127_NationalityCode(), ce_nk1_27_nationalityCode);
		this.ce_nk1_27_nationalityCode = ce_nk1_27_nationalityCode;
	}
	/**
	 *	@return the nk1_28_ethnicGroup
	 */
	
	@JsonProperty("nk1_28_ethnicGroup")
	public String getNk1_28_ethnicGroup() {
		return CommonService.getString(this.nk1.getNk128_EthnicGroup().getValue());
	}
	/**
	 * @param nk1_28_ethnicGroup the nk1_28_ethnicGroup to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_28_ethnicGroup")
	public void setNk1_28_ethnicGroup(String nk1_28_ethnicGroup) throws DataTypeException {
		this.nk1.getNk128_EthnicGroup().setValue(nk1_28_ethnicGroup);
		this.nk1_28_ethnicGroup = nk1_28_ethnicGroup;
	}
	/**
	 *	@return the ce_nk1_29_contactReason
	 */
	
	@JsonProperty("ce_nk1_29_contactReason")
	public CE_v2 getCe_nk1_29_contactReason() {
		return CommonService.getCE_v2(this.nk1.getNk129_ContactReason());
	}
	/**
	 * @param ce_nk1_29_contactReason the ce_nk1_29_contactReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_nk1_29_contactReason")
	public void setCe_nk1_29_contactReason(CE_v2 ce_nk1_29_contactReason) throws DataTypeException {
		CommonService.setCE_v2(this.nk1.getNk129_ContactReason(), ce_nk1_29_contactReason);
		this.ce_nk1_29_contactReason = ce_nk1_29_contactReason;
	}
	/**
	 *	@return the xpn_nk1_30_contactPersonsName
	 */
	
	@JsonProperty("xpn_nk1_30_contactPersonsName")
	public XPN_v23[] getXpn_nk1_30_contactPersonsName() {
		XPN_v23[] contactPersonsName = new XPN_v23[this.nk1.getNk130_ContactPersonSName().length];
		for(int i = 0; i< this.nk1.getNk130_ContactPersonSName().length; i++) {
			contactPersonsName[i] = CommonService.getXPN_v23(this.nk1.getNk130_ContactPersonSName(i));
		}
		return contactPersonsName;
	}
	/**
	 * @param xpn_nk1_30_contactPersonsName the xpn_nk1_30_contactPersonsName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xpn_nk1_30_contactPersonsName")
	public void setXpn_nk1_30_contactPersonsName(XPN_v23[] xpn_nk1_30_contactPersonsName) throws DataTypeException {
		for(int i = 0; i< xpn_nk1_30_contactPersonsName.length; i++) {
			CommonService.setXPN_v23(this.nk1.getNk130_ContactPersonSName(i), xpn_nk1_30_contactPersonsName[i]);
		}
		this.xpn_nk1_30_contactPersonsName = xpn_nk1_30_contactPersonsName;
	}
	/**
	 *	@return the xtn_nk1_31_contactPersonsTelephoneNumber
	 */
	
	@JsonProperty("xtn_nk1_31_contactPersonsTelephoneNumber")
	public XTN_v23[] getXtn_nk1_31_contactPersonsTelephoneNumber() {
		XTN_v23[] contactPersonsTelephoneNumber = new XTN_v23[this.nk1.getNk131_ContactPersonSTelephoneNumber().length];
		for(int i =0; i<this.nk1.getNk131_ContactPersonSTelephoneNumber().length;i++) {
			contactPersonsTelephoneNumber[i]=CommonService.getXTN_v23(this.nk1.getNk131_ContactPersonSTelephoneNumber(i));
		}
		return contactPersonsTelephoneNumber;
	}
	/**
	 * @param xtn_nk1_31_contactPersonsTelephoneNumber the xtn_nk1_31_contactPersonsTelephoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_nk1_31_contactPersonsTelephoneNumber")
	public void setXtn_nk1_31_contactPersonsTelephoneNumber(XTN_v23[] xtn_nk1_31_contactPersonsTelephoneNumber) throws DataTypeException {
		for(int i =0; i<xtn_nk1_31_contactPersonsTelephoneNumber.length;i++) {
			CommonService.setXTN_v23(this.nk1.getNk131_ContactPersonSTelephoneNumber(i), xtn_nk1_31_contactPersonsTelephoneNumber[i]);
		}
		this.xtn_nk1_31_contactPersonsTelephoneNumber = xtn_nk1_31_contactPersonsTelephoneNumber;
	}
	/**
	 *	@return the xad_nk1_32_contactPersonsAddress
	 */
	
	@JsonProperty("xad_nk1_32_contactPersonsAddress")
	public XAD_v23[] getXad_nk1_32_contactPersonsAddress() {
		XAD_v23[] contactPersonsAddress = new XAD_v23[this.nk1.getNk132_ContactPersonSAddress().length];
		for(int i = 0; i<this.nk1.getNk132_ContactPersonSAddress().length; i++) {
			contactPersonsAddress[i]=CommonService.getXAD_v23(this.nk1.getNk132_ContactPersonSAddress(i));
		}
		return contactPersonsAddress;
	}
	/**
	 * @param xad_nk1_32_contactPersonsAddress the xad_nk1_32_contactPersonsAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xad_nk1_32_contactPersonsAddress")
	public void setXad_nk1_32_contactPersonsAddress(XAD_v23[] xad_nk1_32_contactPersonsAddress) throws DataTypeException {
		for(int i = 0; i<xad_nk1_32_contactPersonsAddress.length; i++) {
			CommonService.setXAD_v23(this.nk1.getNk132_ContactPersonSAddress(i), xad_nk1_32_contactPersonsAddress[i]);
		}
		this.xad_nk1_32_contactPersonsAddress = xad_nk1_32_contactPersonsAddress;
	}
	/**
	 *	@return the cx_nk1_33_nextOfKinAssociatedPartyIdentifiers
	 */
	
	@JsonProperty("cx_nk1_33_nextOfKinAssociatedPartyIdentifiers")
	public CX_v23[] getCx_nk1_33_nextOfKinAssociatedPartyIdentifiers() {
		CX_v23[] nextOfKinAssociatedPartyIdentifiers = new CX_v23[this.nk1.getNk133_AssociatedPartySIdentifiers().length];
		for(int i = 0;i< this.nk1.getNk133_AssociatedPartySIdentifiers().length; i++) {
			nextOfKinAssociatedPartyIdentifiers[i] = CommonService.getCX_v23(this.nk1.getNk133_AssociatedPartySIdentifiers(i));
		}
		return nextOfKinAssociatedPartyIdentifiers;
	}
	/**
	 * @param cx_nk1_33_nextOfKinAssociatedPartyIdentifiers the cx_nk1_33_nextOfKinAssociatedPartyIdentifiers to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_nk1_33_nextOfKinAssociatedPartyIdentifiers")
	public void setCx_nk1_33_nextOfKinAssociatedPartyIdentifiers(CX_v23[] cx_nk1_33_nextOfKinAssociatedPartyIdentifiers) throws DataTypeException {
		for(int i = 0;i< cx_nk1_33_nextOfKinAssociatedPartyIdentifiers.length; i++) {
			CommonService.setCX_v23(this.nk1.getNk133_AssociatedPartySIdentifiers(i), cx_nk1_33_nextOfKinAssociatedPartyIdentifiers[i]);
		}
		this.cx_nk1_33_nextOfKinAssociatedPartyIdentifiers = cx_nk1_33_nextOfKinAssociatedPartyIdentifiers;
	}
	/**
	 *	@return the nk1_34_jobStatus
	 */
	
	@JsonProperty("nk1_34_jobStatus")
	public String getNk1_34_jobStatus() {
		return CommonService.getString(this.nk1.getNk134_JobStatus().getValue());
	}
	/**
	 * @param nk1_34_jobStatus the nk1_34_jobStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_34_jobStatus")
	public void setNk1_34_jobStatus(String nk1_34_jobStatus) throws DataTypeException {
		this.nk1.getNk134_JobStatus().setValue(nk1_34_jobStatus);
		this.nk1_34_jobStatus = nk1_34_jobStatus;
	}
	/**
	 *	@return the nk1_35_race
	 */
	
	@JsonProperty("nk1_35_race")
	public String getNk1_35_race() {
		return CommonService.getString(this.nk1.getNk135_Race().getValue());
	}
	/**
	 * @param nk1_35_race the nk1_35_race to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_35_race")
	public void setNk1_35_race(String nk1_35_race) throws DataTypeException {
		this.nk1.getNk135_Race().setValue(nk1_35_race);
		this.nk1_35_race = nk1_35_race;
	}
	/**
	 *	@return the nk1_36_handicap
	 */
	
	@JsonProperty("nk1_36_handicap")
	public String getNk1_36_handicap() {
		return CommonService.getString(this.nk1.getNk136_Handicap().getValue());
	}
	/**
	 * @param nk1_36_handicap the nk1_36_handicap to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_36_handicap")
	public void setNk1_36_handicap(String nk1_36_handicap) throws DataTypeException {
		this.nk1.getNk136_Handicap().setValue(nk1_36_handicap);
		this.nk1_36_handicap = nk1_36_handicap;
	}
	/**
	 *	@return the nk1_37_contactPersonSocialSecurityNumber
	 */
	
	@JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	public String getNk1_37_contactPersonSocialSecurityNumber() {
		return CommonService.getString(this.nk1.getNk137_ContactPersonSocialSecurityNumber().getValue());
	}
	/**
	 * @param nk1_37_contactPersonSocialSecurityNumber the nk1_37_contactPersonSocialSecurityNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nk1_37_contactPersonSocialSecurityNumber")
	public void setNk1_37_contactPersonSocialSecurityNumber(String nk1_37_contactPersonSocialSecurityNumber) throws DataTypeException {
		this.nk1.getNk137_ContactPersonSocialSecurityNumber().setValue(nk1_37_contactPersonSocialSecurityNumber);
		this.nk1_37_contactPersonSocialSecurityNumber = nk1_37_contactPersonSocialSecurityNumber;
	}
	@Override
	public String toString() {
		return "CustomNK1 [nk1_1_setId=" + nk1_1_setId + ", xpn_nk1_2_nkName=" + Arrays.toString(xpn_nk1_2_nkName)
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
				+ ", nk1_37_contactPersonSocialSecurityNumber=" + nk1_37_contactPersonSocialSecurityNumber +  ", nk1=" + nk1 + "]";
	}
	
	
}
