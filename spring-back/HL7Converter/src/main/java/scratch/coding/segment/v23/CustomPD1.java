package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.PD1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.services.CommonService;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomPD1 implements Serializable {
	
	@JsonProperty("pd1_1_livingDependency")
	private String pd1_1_livingDependency;
	@JsonProperty("pd1_2_livingArrangement")
	private String pd1_2_livingArrangement;
	@JsonProperty("xon_pd1_3_patientPrimaryFacility")
	private XON_v23[] xon_pd1_3_patientPrimaryFacility;
	@JsonProperty("xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo")
	private XCN_v23[] xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
	@JsonProperty("pd1_5_studenIndicator")
	private String pd1_5_studenIndicator;
	@JsonProperty("pd1_6_handicap")
	private String pd1_6_handicap;
	@JsonProperty("pd1_7_livingWill")
	private String pd1_7_livingWill;
	@JsonProperty("pd1_8_organDonor")
	private String pd1_8_organDonor;
	@JsonProperty("pd1_9_separateBill")
	private String pd1_9_separateBill;
	@JsonProperty("cx_pd1_10_duplicatePatient")
	private CX_v23[] cx_pd1_10_duplicatePatient;
	@JsonProperty("ce_pd1_11_publicityIndicator")
	private CE_v2 ce_pd1_11_publicityIndicator;
	@JsonProperty("pd1_12_protectionIndicator")
	private String pd1_12_protectionIndicator;
	
	private PD1 pd1;
	
	private CustomPD1(PD1 pd1) {
		super();
		this.pd1 =pd1;
	}
	public static CustomPD1 createPd11WithTypeAndVersion(PD1 pd1) throws HL7Exception, IOException {
		return new CustomPD1(pd1);
	}
	/**
	 *	@return the pd1_1_livingDependency
	 */
	
	@JsonProperty("pd1_1_livingDependency")
	public String getPd1_1_livingDependency() {
		return CommonService.getString(this.pd1.getPd11_LivingDependency().getValue());
	}
	public CustomPD1() {
		super();
	}
	/**
	 * @param pd1_1_livingDependency the pd1_1_livingDependency to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_1_livingDependency")
	public void setPd1_1_livingDependency(String pd1_1_livingDependency) throws DataTypeException {
		this.pd1.getPd11_LivingDependency().setValue(pd1_1_livingDependency);
		this.pd1_1_livingDependency = pd1_1_livingDependency;
	}
	/**
	 *	@return the pd1_2_livingArrangement
	 */
	
	@JsonProperty("pd1_2_livingArrangement")
	public String getPd1_2_livingArrangement() {
		return CommonService.getString(this.pd1.getPd12_LivingArrangement().getValue());
	}
	/**
	 * @param pd1_2_livingArrangement the pd1_2_livingArrangement to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_2_livingArrangement")
	public void setPd1_2_livingArrangement(String pd1_2_livingArrangement) throws DataTypeException {
		this.pd1.getPd12_LivingArrangement().setValue(pd1_2_livingArrangement);
		this.pd1_2_livingArrangement = pd1_2_livingArrangement;
	}
	/**
	 *	@return the xon_pd1_3_patientPrimaryFacility
	 */
	
	@JsonProperty("xon_pd1_3_patientPrimaryFacility")
	public XON_v23[] getXon_pd1_3_patientPrimaryFacility() {
		XON_v23[] patientPrimaryFacility = new XON_v23[this.pd1.getPd13_PatientPrimaryFacility().length];
		for(int i = 0; i < this.pd1.getPd13_PatientPrimaryFacility().length; i++) {
			patientPrimaryFacility[i]=CommonService.getXON_v23(this.pd1.getPd13_PatientPrimaryFacility(i));
		}
		return patientPrimaryFacility;
	}
	/**
	 * @param xon_pd1_3_patientPrimaryFacility the xon_pd1_3_patientPrimaryFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xon_pd1_3_patientPrimaryFacility")
	public void setXon_pd1_3_patientPrimaryFacility(XON_v23[] xon_pd1_3_patientPrimaryFacility) throws DataTypeException {
		for(int i = 0; i < xon_pd1_3_patientPrimaryFacility.length; i++) {
			CommonService.setXON_v23(this.pd1.getPd13_PatientPrimaryFacility(i), xon_pd1_3_patientPrimaryFacility[i]);
		}
		this.xon_pd1_3_patientPrimaryFacility = xon_pd1_3_patientPrimaryFacility;
	}
	/**
	 *	@return the xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo
	 */
	
	@JsonProperty("xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo")
	public XCN_v23[] getXcn_pd1_4_patientPrimaryCareProviderNameAndIdNo() {
		XCN_v23[] patientPrimaryCareProviderNameAndIdNo = new XCN_v23[this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo().length];
		for(int i = 0; i < this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo().length;i++) {
			patientPrimaryCareProviderNameAndIdNo[i] =CommonService.getXCN_v23(this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i));
		}
		return patientPrimaryCareProviderNameAndIdNo;
	}
	/**
	 * @param xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo the xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo")
	public void setXcn_pd1_4_patientPrimaryCareProviderNameAndIdNo(
			XCN_v23[] xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo) throws DataTypeException {
		for(int i = 0; i < xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo.length;i++) {
			CommonService.setXCN_v23(this.pd1.getPd14_PatientPrimaryCareProviderNameIDNo(i), xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo[i]);
		}
		this.xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo = xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
	}
	/**
	 *	@return the pd1_5_studenIndicator
	 */
	
	@JsonProperty("pd1_5_studenIndicator")
	public String getPd1_5_studenIndicator() {
		return CommonService.getString(this.pd1.getPd15_StudentIndicator().getValue());
	}
	/**
	 * @param pd1_5_studenIndicator the pd1_5_studenIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_5_studenIndicator")
	public void setPd1_5_studenIndicator(String pd1_5_studenIndicator) throws DataTypeException {
		this.pd1.getPd15_StudentIndicator().setValue(pd1_5_studenIndicator);
		this.pd1_5_studenIndicator = pd1_5_studenIndicator;
	}
	/**
	 *	@return the pd1_6_handicap
	 */
	
	@JsonProperty("pd1_6_handicap")
	public String getPd1_6_handicap() {
		return CommonService.getString(this.pd1.getPd16_Handicap().getValue());
	}
	/**
	 * @param pd1_6_handicap the pd1_6_handicap to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_6_handicap")
	public void setPd1_6_handicap(String pd1_6_handicap) throws DataTypeException {
		this.pd1.getPd16_Handicap().setValue(pd1_6_handicap);
		this.pd1_6_handicap = pd1_6_handicap;
	}
	/**
	 *	@return the pd1_7_livingWill
	 */
	
	@JsonProperty("pd1_7_livingWill")
	public String getPd1_7_livingWill() {
		return CommonService.getString(this.pd1.getPd17_LivingWill().getValue());
	}
	/**
	 * @param pd1_7_livingWill the pd1_7_livingWill to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_7_livingWill")
	public void setPd1_7_livingWill(String pd1_7_livingWill) throws DataTypeException {
		this.pd1.getPd17_LivingWill().setValue(pd1_7_livingWill);
		this.pd1_7_livingWill = pd1_7_livingWill;
	}
	/**
	 *	@return the pd1_8_organDonor
	 */
	
	@JsonProperty("pd1_8_organDonor")
	public String getPd1_8_organDonor() {
		return CommonService.getString(this.pd1.getPd18_OrganDonor().getValue());
	}
	/**
	 * @param pd1_8_organDonor the pd1_8_organDonor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_8_organDonor")
	public void setPd1_8_organDonor(String pd1_8_organDonor) throws DataTypeException {
		this.pd1.getPd18_OrganDonor().setValue(pd1_8_organDonor);
		this.pd1_8_organDonor = pd1_8_organDonor;
	}
	/**
	 *	@return the pd1_9_separateBill
	 */
	
	@JsonProperty("pd1_9_separateBill")
	public String getPd1_9_separateBill() {
		return CommonService.getString(this.pd1.getPd19_SeparateBill().getValue());
	}
	/**
	 * @param pd1_9_separateBill the pd1_9_separateBill to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_9_separateBill")
	public void setPd1_9_separateBill(String pd1_9_separateBill) throws DataTypeException {
		this.pd1.getPd19_SeparateBill().setValue(pd1_9_separateBill);
		this.pd1_9_separateBill = pd1_9_separateBill;
	}
	/**
	 *	@return the cx_pd1_10_duplicatePatient
	 */
	
	@JsonProperty("cx_pd1_10_duplicatePatient")
	public CX_v23[] getCx_pd1_10_duplicatePatient() {
		CX_v23[] duplicatePatient = new CX_v23[this.pd1.getPd110_DuplicatePatient().length];
		for(int i = 0; i < this.pd1.getPd110_DuplicatePatient().length; i++) {
			duplicatePatient[i]=CommonService.getCX_v23(this.pd1.getPd110_DuplicatePatient(i));
		}
		return duplicatePatient;
	}
	/**
	 * @param cx_pd1_10_duplicatePatient the cx_pd1_10_duplicatePatient to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_pd1_10_duplicatePatient")
	public void setCx_pd1_10_duplicatePatient(CX_v23[] cx_pd1_10_duplicatePatient) throws DataTypeException {
		for(int i = 0; i < cx_pd1_10_duplicatePatient.length; i++) {
			CommonService.setCX_v23(this.pd1.getPd110_DuplicatePatient(i), cx_pd1_10_duplicatePatient[i]);
		}
		this.cx_pd1_10_duplicatePatient = cx_pd1_10_duplicatePatient;
	}
	/**
	 *	@return the ce_pd1_11_publicityIndicator
	 */
	
	@JsonProperty("ce_pd1_11_publicityIndicator")
	public CE_v2 getCe_pd1_11_publicityIndicator() {
		return CommonService.getCE_v2(this.pd1.getPd111_PublicityIndicator());
	}
	/**
	 * @param ce_pd1_11_publicityIndicator the ce_pd1_11_publicityIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_pd1_11_publicityIndicator")
	public void setCe_pd1_11_publicityIndicator(CE_v2 ce_pd1_11_publicityIndicator) throws DataTypeException {
		CommonService.setCE_v2(this.pd1.getPd111_PublicityIndicator(), ce_pd1_11_publicityIndicator);
		this.ce_pd1_11_publicityIndicator = ce_pd1_11_publicityIndicator;
	}
	/**
	 *	@return the pd1_12_protectionIndicator
	 */
	
	@JsonProperty("pd1_12_protectionIndicator")
	public String getPd1_12_protectionIndicator() {
		return CommonService.getString(this.pd1.getPd112_ProtectionIndicator().getValue());
	}
	/**
	 * @param pd1_12_protectionIndicator the pd1_12_protectionIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pd1_12_protectionIndicator")
	public void setPd1_12_protectionIndicator(String pd1_12_protectionIndicator) throws DataTypeException {
		this.pd1.getPd112_ProtectionIndicator().setValue(pd1_12_protectionIndicator);
		this.pd1_12_protectionIndicator = pd1_12_protectionIndicator;
	}
	@Override
	public String toString() {
		return "CustomPD1 [pd1_1_livingDependency=" + pd1_1_livingDependency + ", pd1_2_livingArrangement="
				+ pd1_2_livingArrangement + ", xon_pd1_3_patientPrimaryFacility="
				+ Arrays.toString(xon_pd1_3_patientPrimaryFacility)
				+ ", xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo="
				+ Arrays.toString(xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo) + ", pd1_5_studenIndicator="
				+ pd1_5_studenIndicator + ", pd1_6_handicap=" + pd1_6_handicap + ", pd1_7_livingWill="
				+ pd1_7_livingWill + ", pd1_8_organDonor=" + pd1_8_organDonor + ", pd1_9_separateBill="
				+ pd1_9_separateBill + ", cx_pd1_10_duplicatePatient=" + Arrays.toString(cx_pd1_10_duplicatePatient)
				+ ", ce_pd1_11_publicityIndicator=" + ce_pd1_11_publicityIndicator + ", pd1_12_protectionIndicator="
				+ pd1_12_protectionIndicator +", pd1=" + pd1 + "]";
	}
	
}
