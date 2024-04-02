package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.DG1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.services.CommonService;


@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomDG1 implements Serializable {
	@JsonProperty("dg1_1_setId")
	private String dg1_1_setId;
	@JsonProperty("dg1_2_diagnosisCodingMethod")
	private String dg1_2_diagnosisCodingMethod;
	@JsonProperty("ce_dg1_3_diagnosisCode")
	private CE_v2 ce_dg1_3_diagnosisCode;
	@JsonProperty("dg1_4_diagnosisDescription")
	private String dg1_4_diagnosisDescription;
	@JsonProperty("ts_dg1_5_diagnosisDateTime")
	private TS_v2 ts_dg1_5_diagnosisDateTime;
	@JsonProperty("dg1_6_diagnosisType")
	private String dg1_6_diagnosisType;
	@JsonProperty("ce_dg1_7_majorDiagnosticCategory")
	private CE_v2 ce_dg1_7_majorDiagnosticCategory;
	@JsonProperty("ce_dg1_8_diagnosticRelatedGroup")
	private CE_v2 ce_dg1_8_diagnosticRelatedGroup;
	@JsonProperty("dg1_9_drgApprovalIndicator")
	private String dg1_9_drgApprovalIndicator;
	@JsonProperty("dg1_10_drgGrouperReviewCode")
	private String dg1_10_drgGrouperReviewCode;
	@JsonProperty("ce_dg1_11_outlierType")
	private CE_v2 ce_dg1_11_outlierType;
	@JsonProperty("dg1_12_outlierDays")
	private String dg1_12_outlierDays;
	@JsonProperty("cp_dg1_13_outlierCost")
	private CP_v2 cp_dg1_13_outlierCost;
	@JsonProperty("dg1_14_grouperVersionAndType")
	private String dg1_14_grouperVersionAndType;
	@JsonProperty("dg1_15_diagnosisPriority")
	private String dg1_15_diagnosisPriority;
	@JsonProperty("xcn_dg1_16_diagnosingClinician")
	private XCN_v23[] xcn_dg1_16_diagnosingClinician;
	@JsonProperty("dg1_17_diagnosisClassification")
	private String dg1_17_diagnosisClassification;
	@JsonProperty("dg1_18_confidentialIndicator")
	private String dg1_18_confidentialIndicator;
	@JsonProperty("ts_dg1_19_attestationDateTime")
	private TS_v2 ts_dg1_19_attestationDateTime;
	
	private DG1 dg1;
	
	private CustomDG1(DG1 dg1) {
		super();
		this.dg1 =dg1;
	}
	public static CustomDG1 createDg1WithTypeAndVersion(DG1 dg1) throws HL7Exception, IOException {
		return new CustomDG1(dg1);
	}
	/**
	 *	@return the dg1_1_setId
	 */
	
	@JsonProperty("dg1_1_setId")
	public String getDg1_1_setId() {
		return this.dg1.getDg11_SetIDDiagnosis().getValue()==null?"":this.dg1.getDg11_SetIDDiagnosis().getValue();
	}
	/**
	 * @param dg1_1_setId the dg1_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_1_setId")
	public void setDg1_1_setId(String dg1_1_setId) throws DataTypeException {
		this.dg1.getDg11_SetIDDiagnosis().setValue(dg1_1_setId);
		this.dg1_1_setId = dg1_1_setId;
	}
	/**
	 *	@return the dg1_2_diagnosisCodingMethod
	 */
	
	@JsonProperty("dg1_2_diagnosisCodingMethod")
	public String getDg1_2_diagnosisCodingMethod() {
		return this.dg1.getDg12_DiagnosisCodingMethod().getValue()==null?"":this.dg1.getDg12_DiagnosisCodingMethod().getValue();
	}
	/**
	 * @param dg1_2_diagnosisCodingMethod the dg1_2_diagnosisCodingMethod to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_2_diagnosisCodingMethod")
	public void setDg1_2_diagnosisCodingMethod(String dg1_2_diagnosisCodingMethod) throws DataTypeException {
		this.dg1.getDg12_DiagnosisCodingMethod().setValue(dg1_2_diagnosisCodingMethod);
		this.dg1_2_diagnosisCodingMethod = dg1_2_diagnosisCodingMethod;
	}
	/**
	 *	@return the ce_dg1_3_diagnosisCode
	 *	@JsonProperty("ce_dg1_3_diagnosisCode")
	 */
	
	public CE_v2 getCe_dg1_3_diagnosisCode() {
		return CommonService.getCE_v2(this.dg1.getDg13_DiagnosisCode());
	}
	/**
	 * @param ce_dg1_3_diagnosisCode the ce_dg1_3_diagnosisCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_dg1_3_diagnosisCode")
	public void setCe_dg1_3_diagnosisCode(CE_v2 ce_dg1_3_diagnosisCode) throws DataTypeException {
		CommonService.setCE_v2(this.dg1.getDg13_DiagnosisCode(), ce_dg1_3_diagnosisCode);
		this.ce_dg1_3_diagnosisCode = ce_dg1_3_diagnosisCode;
	}
	/**
	 *	@return the dg1_4_diagnosisDescription
	 */
	
	@JsonProperty("dg1_4_diagnosisDescription")
	public String getDg1_4_diagnosisDescription() {
		return this.dg1.getDg14_DiagnosisDescription().getValue()==null?"":this.dg1.getDg14_DiagnosisDescription().getValue();
	}
	/**
	 * @param dg1_4_diagnosisDescription the dg1_4_diagnosisDescription to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_4_diagnosisDescription")
	public void setDg1_4_diagnosisDescription(String dg1_4_diagnosisDescription) throws DataTypeException {
		this.dg1.getDg14_DiagnosisDescription().setValue(dg1_4_diagnosisDescription);
		this.dg1_4_diagnosisDescription = dg1_4_diagnosisDescription;
	}
	/**
	 *	@return the ts_dg1_5_diagnosisDateTime
	 */
	
	@JsonProperty("ts_dg1_5_diagnosisDateTime")
	public TS_v2 getTs_dg1_5_diagnosisDateTime() {
		return CommonService.getTS_v2(this.dg1.getDg15_DiagnosisDateTime());
	}
	/**
	 * @param ts_dg1_5_diagnosisDateTime the ts_dg1_5_diagnosisDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_dg1_5_diagnosisDateTime")
	public void setTs_dg1_5_diagnosisDateTime(TS_v2 ts_dg1_5_diagnosisDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.dg1.getDg15_DiagnosisDateTime(), ts_dg1_5_diagnosisDateTime);
		this.ts_dg1_5_diagnosisDateTime = ts_dg1_5_diagnosisDateTime;
	}
	/**
	 *	@return the dg1_6_diagnosisType
	 */
	
	@JsonProperty("dg1_6_diagnosisType")
	public String getDg1_6_diagnosisType() {
		return this.dg1.getDg16_DiagnosisType().getValue()==null?"":this.dg1.getDg16_DiagnosisType().getValue();
	}
	/**
	 * @param dg1_6_diagnosisType the dg1_6_diagnosisType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_6_diagnosisType")
	public void setDg1_6_diagnosisType(String dg1_6_diagnosisType) throws DataTypeException {
		this.dg1.getDg16_DiagnosisType().setValue(dg1_6_diagnosisType);
		this.dg1_6_diagnosisType = dg1_6_diagnosisType;
	}
	/**
	 *	@return the ce_dg1_7_majorDiagnosticCategory
	 */
	
	@JsonProperty("ce_dg1_7_majorDiagnosticCategory")
	public CE_v2 getCe_dg1_7_majorDiagnosticCategory() {
		return CommonService.getCE_v2(this.dg1.getDg17_MajorDiagnosticCategory());
	}
	/**
	 * @param ce_dg1_7_majorDiagnosticCategory the ce_dg1_7_majorDiagnosticCategory to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_dg1_7_majorDiagnosticCategory")
	public void setCe_dg1_7_majorDiagnosticCategory(CE_v2 ce_dg1_7_majorDiagnosticCategory) throws DataTypeException {
		CommonService.setCE_v2(this.dg1.getDg17_MajorDiagnosticCategory(), ce_dg1_7_majorDiagnosticCategory);
		this.ce_dg1_7_majorDiagnosticCategory = ce_dg1_7_majorDiagnosticCategory;
	}
	/**
	 *	@return the ce_dg1_8_diagnosticRelatedGroup
	 */
	
	@JsonProperty("ce_dg1_8_diagnosticRelatedGroup")
	public CE_v2 getCe_dg1_8_diagnosticRelatedGroup() {
		return CommonService.getCE_v2(this.dg1.getDg18_DiagnosticRelatedGroup());
	}
	/**
	 * @param ce_dg1_8_diagnosticRelatedGroup the ce_dg1_8_diagnosticRelatedGroup to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_dg1_8_diagnosticRelatedGroup")
	public void setCe_dg1_8_diagnosticRelatedGroup(CE_v2 ce_dg1_8_diagnosticRelatedGroup) throws DataTypeException {
		CommonService.setCE_v2(this.dg1.getDg18_DiagnosticRelatedGroup(), ce_dg1_8_diagnosticRelatedGroup);
		this.ce_dg1_8_diagnosticRelatedGroup = ce_dg1_8_diagnosticRelatedGroup;
	}
	/**
	 *	@return the dg1_9_drgApprovalIndicator
	 */
	
	@JsonProperty("dg1_9_drgApprovalIndicator")
	public String getDg1_9_drgApprovalIndicator() {
		return this.dg1.getDg19_DRGApprovalIndicator().getValue()==null?"":this.dg1.getDg19_DRGApprovalIndicator().getValue();
	}
	/**
	 * @param dg1_9_drgApprovalIndicator the dg1_9_drgApprovalIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_9_drgApprovalIndicator")
	public void setDg1_9_drgApprovalIndicator(String dg1_9_drgApprovalIndicator) throws DataTypeException {
		this.dg1.getDg19_DRGApprovalIndicator().setValue(dg1_9_drgApprovalIndicator);
		this.dg1_9_drgApprovalIndicator = dg1_9_drgApprovalIndicator;
	}
	/**
	 *	@return the dg1_10_drgGrouperReviewCode
	 */
	
	@JsonProperty("dg1_10_drgGrouperReviewCode")
	public String getDg1_10_drgGrouperReviewCode() {
		return this.dg1.getDg110_DRGGrouperReviewCode().getValue()==null?"":this.dg1.getDg110_DRGGrouperReviewCode().getValue();
	}
	/**
	 * @param dg1_10_drgGrouperReviewCode the dg1_10_drgGrouperReviewCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_10_drgGrouperReviewCode")
	public void setDg1_10_drgGrouperReviewCode(String dg1_10_drgGrouperReviewCode) throws DataTypeException {
		this.dg1.getDg110_DRGGrouperReviewCode().setValue(dg1_10_drgGrouperReviewCode);
		this.dg1_10_drgGrouperReviewCode = dg1_10_drgGrouperReviewCode;
	}
	/**
	 *	@return the ce_dg1_11_outlierType
	 */
	
	@JsonProperty("ce_dg1_11_outlierType")
	public CE_v2 getCe_dg1_11_outlierType() {
		return CommonService.getCE_v2(this.dg1.getDg111_OutlierType());
	}
	/**
	 * @param ce_dg1_11_outlierType the ce_dg1_11_outlierType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_dg1_11_outlierType")
	public void setCe_dg1_11_outlierType(CE_v2 ce_dg1_11_outlierType) throws DataTypeException {
		CommonService.setCE_v2(this.dg1.getDg111_OutlierType(), ce_dg1_11_outlierType);
		this.ce_dg1_11_outlierType = ce_dg1_11_outlierType;
	}
	/**
	 *	@return the dg1_12_outlierDays
	 */
	
	@JsonProperty("dg1_12_outlierDays")
	public String getDg1_12_outlierDays() {
		return this.dg1.getDg112_OutlierDays().getValue()==null?"":this.dg1.getDg112_OutlierDays().getValue();
	}
	/**
	 * @param dg1_12_outlierDays the dg1_12_outlierDays to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_12_outlierDays")
	public void setDg1_12_outlierDays(String dg1_12_outlierDays) throws DataTypeException {
		this.dg1.getDg112_OutlierDays().setValue(dg1_12_outlierDays);
		this.dg1_12_outlierDays = dg1_12_outlierDays;
	}
	/**
	 *	@return the cp_dg1_13_outlierCost
	 */
	
	@JsonProperty("cp_dg1_13_outlierCost")
	public CP_v2 getCp_dg1_13_outlierCost() {
		return CommonService.getCP_v2(this.dg1.getDg113_OutlierCost());
	}
	/**
	 * @param cp_dg1_13_outlierCost the cp_dg1_13_outlierCost to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_dg1_13_outlierCost")
	public void setCp_dg1_13_outlierCost(CP_v2 cp_dg1_13_outlierCost) throws DataTypeException {
		CommonService.setCP_v2(this.dg1.getDg113_OutlierCost(), cp_dg1_13_outlierCost);
		this.cp_dg1_13_outlierCost = cp_dg1_13_outlierCost;
	}
	/**
	 *	@return the dg1_14_grouperVersionAndType
	 */
	
	@JsonProperty("dg1_14_grouperVersionAndType")
	public String getDg1_14_grouperVersionAndType() {
		return this.dg1.getDg114_GrouperVersionAndType().getValue()==null?"":this.dg1.getDg114_GrouperVersionAndType().getValue();
	}
	/**
	 * @param dg1_14_grouperVersionAndType the dg1_14_grouperVersionAndType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_14_grouperVersionAndType")
	public void setDg1_14_grouperVersionAndType(String dg1_14_grouperVersionAndType) throws DataTypeException {
		this.dg1.getDg114_GrouperVersionAndType().setValue(dg1_14_grouperVersionAndType);
		this.dg1_14_grouperVersionAndType = dg1_14_grouperVersionAndType;
	}
	/**
	 *	@return the dg1_15_diagnosisPriority
	 */
	
	@JsonProperty("dg1_15_diagnosisPriority")
	public String getDg1_15_diagnosisPriority() {
		return this.dg1.getDg115_DiagnosisPriority().getValue()==null?"":this.dg1.getDg115_DiagnosisPriority().getValue();
	}
	/**
	 * @param dg1_15_diagnosisPriority the dg1_15_diagnosisPriority to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_15_diagnosisPriority")
	public void setDg1_15_diagnosisPriority(String dg1_15_diagnosisPriority) throws DataTypeException {
		this.dg1.getDg115_DiagnosisPriority().setValue(dg1_15_diagnosisPriority);
		this.dg1_15_diagnosisPriority = dg1_15_diagnosisPriority;
	}
	/**
	 *	@return the xcn_dg1_16_diagnosingClinician
	 */
	
	@JsonProperty("xcn_dg1_16_diagnosingClinician")
	public XCN_v23[] getXcn_dg1_16_diagnosingClinician() {
		XCN_v23[] diagnosingClinician = new XCN_v23[this.dg1.getDg116_DiagnosingClinician().length];
		for(int i = 0; i<this.dg1.getDg116_DiagnosingClinician().length; i++) {
			diagnosingClinician[i] = CommonService.getXCN_v23(this.dg1.getDg116_DiagnosingClinician(i));
		}
		return diagnosingClinician;
	}
	/**
	 * @param xcn_dg1_16_diagnosingClinician the xcn_dg1_16_diagnosingClinician to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_dg1_16_diagnosingClinician")
	public void setXcn_dg1_16_diagnosingClinician(XCN_v23[] xcn_dg1_16_diagnosingClinician) throws DataTypeException {
		for(int i = 0; i<xcn_dg1_16_diagnosingClinician.length; i++) {
			CommonService.setXCN_v23(this.dg1.getDg116_DiagnosingClinician(i), xcn_dg1_16_diagnosingClinician[i]);
		}
		this.xcn_dg1_16_diagnosingClinician = xcn_dg1_16_diagnosingClinician;
	}
	/**
	 *	@return the dg1_17_diagnosisClassification
	 */
	
	@JsonProperty("dg1_17_diagnosisClassification")
	public String getDg1_17_diagnosisClassification() {
		return this.dg1.getDg117_DiagnosisClassification().getValue()==null?"":this.dg1.getDg117_DiagnosisClassification().getValue();
	}
	/**
	 * @param dg1_17_diagnosisClassification the dg1_17_diagnosisClassification to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_17_diagnosisClassification")
	public void setDg1_17_diagnosisClassification(String dg1_17_diagnosisClassification) throws DataTypeException {
		this.dg1.getDg117_DiagnosisClassification().setValue(dg1_17_diagnosisClassification);
		this.dg1_17_diagnosisClassification = dg1_17_diagnosisClassification;
	}
	/**
	 *	@return the dg1_18_confidentialIndicator
	 */
	
	@JsonProperty("dg1_18_confidentialIndicator")
	public String getDg1_18_confidentialIndicator() {
		return this.dg1.getDg118_ConfidentialIndicator().getValue()==null?"":this.dg1.getDg118_ConfidentialIndicator().getValue();
	}
	/**
	 * @param dg1_18_confidentialIndicator the dg1_18_confidentialIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dg1_18_confidentialIndicator")
	public void setDg1_18_confidentialIndicator(String dg1_18_confidentialIndicator) throws DataTypeException {
		this.dg1.getDg118_ConfidentialIndicator().setValue(dg1_18_confidentialIndicator);
		this.dg1_18_confidentialIndicator = dg1_18_confidentialIndicator;
	}
	/**
	 *	@return the ts_dg1_19_attestationDateTime
	 */
	
	@JsonProperty("ts_dg1_19_attestationDateTime")
	public TS_v2 getTs_dg1_19_attestationDateTime() {
		return CommonService.getTS_v2(this.dg1.getDg119_AttestationDateTime());
	}
	/**
	 * @param ts_dg1_19_attestationDateTime the ts_dg1_19_attestationDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_dg1_19_attestationDateTime")
	public void setTs_dg1_19_attestationDateTime(TS_v2 ts_dg1_19_attestationDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.dg1.getDg119_AttestationDateTime(), ts_dg1_19_attestationDateTime);
		this.ts_dg1_19_attestationDateTime = ts_dg1_19_attestationDateTime;
	}
	@Override
	public String toString() {
		return "CustomDG1 [dg1_1_setId=" + dg1_1_setId + ", dg1_2_diagnosisCodingMethod=" + dg1_2_diagnosisCodingMethod
				+ ", ce_dg1_3_diagnosisCode=" + ce_dg1_3_diagnosisCode + ", dg1_4_diagnosisDescription="
				+ dg1_4_diagnosisDescription + ", ts_dg1_5_diagnosisDateTime=" + ts_dg1_5_diagnosisDateTime
				+ ", dg1_6_diagnosisType=" + dg1_6_diagnosisType + ", ce_dg1_7_majorDiagnosticCategory="
				+ ce_dg1_7_majorDiagnosticCategory + ", ce_dg1_8_diagnosticRelatedGroup="
				+ ce_dg1_8_diagnosticRelatedGroup + ", dg1_9_drgApprovalIndicator=" + dg1_9_drgApprovalIndicator
				+ ", dg1_10_drgGrouperReviewCode=" + dg1_10_drgGrouperReviewCode + ", ce_dg1_11_outlierType="
				+ ce_dg1_11_outlierType + ", dg1_12_outlierDays=" + dg1_12_outlierDays + ", cp_dg1_13_outlierCost="
				+ cp_dg1_13_outlierCost + ", dg1_14_grouperVersionAndType=" + dg1_14_grouperVersionAndType
				+ ", dg1_15_diagnosisPriority=" + dg1_15_diagnosisPriority + ", xcn_dg1_16_diagnosingClinician="
				+ Arrays.toString(xcn_dg1_16_diagnosingClinician) + ", dg1_17_diagnosisClassification="
				+ dg1_17_diagnosisClassification + ", dg1_18_confidentialIndicator=" + dg1_18_confidentialIndicator
				+ ", ts_dg1_19_attestationDateTime=" + ts_dg1_19_attestationDateTime + ", dg1="
				+ dg1 + "]";
	}
	
	
}
