package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.DRG;
import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.services.CommonService;


@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomDRG implements Serializable {
	@JsonProperty("ce_drg_1_diagnosticRelatedGroup")
	private CE_v2 ce_drg_1_diagnosticRelatedGroup;
	@JsonProperty("ts_drg_2_drgAssignedDateTime")
	private TS_v2 ts_drg_2_drgAssignedDateTime;
	@JsonProperty("drg_3_drgApprovalIndicator")
	private String drg_3_drgApprovalIndicator;
	@JsonProperty("drg_4_drgGrouperReviewCode")
	private String drg_4_drgGrouperReviewCode;
	@JsonProperty("ce_drg_5_outlierType")
	private CE_v2 ce_drg_5_outlierType;
	@JsonProperty("drg_6_outlierDays")
	private String drg_6_outlierDays;
	@JsonProperty("cp_drg_7_cpoutlierCost")
	private CP_v2 cp_drg_7_outlierCost;
	@JsonProperty("drg_8_drgPayor")
	private String drg_8_drgPayor;
	@JsonProperty("cp_drg_9_outlierReimbursement")
	private CP_v2 cp_drg_9_outlierReimbursement;
	@JsonProperty("drg_10_confidentialIndicator")
	private String drg_10_confidentialIndicator;
	
	private DRG drg;
	
	private CustomDRG(DRG drg) {
		super();
		this.drg =drg;
	}
	public static CustomDRG createDrgWithTypeAndVersion(DRG drg) throws HL7Exception, IOException {
		return new CustomDRG(drg);
	}
	/**
	 *	@return the ce_drg_1_diagnosticRelatedGroup
	 */
	
	@JsonProperty("ce_drg_1_diagnosticRelatedGroup")
	public CE_v2 getCe_drg_1_diagnosticRelatedGroup() {
		return CommonService.getCE_v2(this.drg.getDrg1_DiagnosticRelatedGroup());
	}
	/**
	 * @param ce_drg_1_diagnosticRelatedGroup the ce_drg_1_diagnosticRelatedGroup to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_drg_1_diagnosticRelatedGroup")
	public void setCe_drg_1_diagnosticRelatedGroup(CE_v2 ce_drg_1_diagnosticRelatedGroup) throws DataTypeException {
		CommonService.setCE_v2(this.drg.getDrg1_DiagnosticRelatedGroup(), ce_drg_1_diagnosticRelatedGroup);
		this.ce_drg_1_diagnosticRelatedGroup = ce_drg_1_diagnosticRelatedGroup;
	}
	/**
	 *	@return the ts_drg_2_drgAssignedDateTime
	 */
	
	@JsonProperty("ts_drg_2_drgAssignedDateTime")
	public TS_v2 getTs_drg_2_drgAssignedDateTime() {
		return CommonService.getTS_v2(this.drg.getDrg2_DRGAssignedDateTime());
	}
	/**
	 * @param ts_drg_2_drgAssignedDateTime the ts_drg_2_drgAssignedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_drg_2_drgAssignedDateTime")
	public void setTs_drg_2_drgAssignedDateTime(TS_v2 ts_drg_2_drgAssignedDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.drg.getDrg2_DRGAssignedDateTime(), ts_drg_2_drgAssignedDateTime);
		this.ts_drg_2_drgAssignedDateTime = ts_drg_2_drgAssignedDateTime;
	}
	/**
	 *	@return the drg_3_drgApprovalIndicator
	 */
	
	@JsonProperty("drg_3_drgApprovalIndicator")
	public String getDrg_3_drgApprovalIndicator() {
		return this.drg.getDrg3_DRGApprovalIndicator().getValue()==null?"":this.drg.getDrg3_DRGApprovalIndicator().getValue();
	}
	/**
	 * @param drg_3_drgApprovalIndicator the drg_3_drgApprovalIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("drg_3_drgApprovalIndicator")
	public void setDrg_3_drgApprovalIndicator(String drg_3_drgApprovalIndicator) throws DataTypeException {
		this.drg.getDrg3_DRGApprovalIndicator().setValue(drg_3_drgApprovalIndicator);
		this.drg_3_drgApprovalIndicator = drg_3_drgApprovalIndicator;
	}
	/**
	 *	@return the drg_4_drgGrouperReviewCode
	 */
	
	@JsonProperty("drg_4_drgGrouperReviewCode")
	public String getDrg_4_drgGrouperReviewCode() {
		return this.drg.getDrg4_DRGGrouperReviewCode().getValue()==null?"":this.drg.getDrg4_DRGGrouperReviewCode().getValue();
	}
	/**
	 * @param drg_4_drgGrouperReviewCode the drg_4_drgGrouperReviewCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("drg_4_drgGrouperReviewCode")
	public void setDrg_4_drgGrouperReviewCode(String drg_4_drgGrouperReviewCode) throws DataTypeException {
		this.drg.getDrg4_DRGGrouperReviewCode().setValue(drg_4_drgGrouperReviewCode);
		this.drg_4_drgGrouperReviewCode = drg_4_drgGrouperReviewCode;
	}
	/**
	 *	@return the ce_drg_5_outlierType
	 */
	
	@JsonProperty("ce_drg_5_outlierType")
	public CE_v2 getCe_drg_5_outlierType() {
		return CommonService.getCE_v2(this.drg.getDrg5_OutlierType());
	}
	/**
	 * @param ce_drg_5_outlierType the ce_drg_5_outlierType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_drg_5_outlierType")
	public void setCe_drg_5_outlierType(CE_v2 ce_drg_5_outlierType) throws DataTypeException {
		CommonService.setCE_v2(this.drg.getDrg5_OutlierType(), ce_drg_5_outlierType);
		this.ce_drg_5_outlierType = ce_drg_5_outlierType;
	}
	/**
	 *	@return the drg_6_outlierDays
	 */
	
	@JsonProperty("drg_6_outlierDays")
	public String getDrg_6_outlierDays() {
		return this.drg.getDrg6_OutlierDays().getValue()==null?"":this.drg.getDrg6_OutlierDays().getValue();
	}
	/**
	 * @param drg_6_outlierDays the drg_6_outlierDays to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("drg_6_outlierDays")
	public void setDrg_6_outlierDays(String drg_6_outlierDays) throws DataTypeException {
		this.drg.getDrg6_OutlierDays().setValue(drg_6_outlierDays);
		this.drg_6_outlierDays = drg_6_outlierDays;
	}
	/**
	 *	@return the cp_drg_7_outlierCost
	 */
	
	@JsonProperty("cp_drg_7_outlierCost")
	public CP_v2 getCp_drg_7_outlierCost() {
		return CommonService.getCP_v2(this.drg.getDrg7_OutlierCost());
	}
	/**
	 * @param cp_drg_7_outlierCost the cp_drg_7_outlierCost to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_drg_7_outlierCost")
	public void setCp_drg_7_outlierCost(CP_v2 cp_drg_7_outlierCost) throws DataTypeException {
		CommonService.setCP_v2(this.drg.getDrg7_OutlierCost(), cp_drg_7_outlierCost);
		this.cp_drg_7_outlierCost = cp_drg_7_outlierCost;
	}
	/**
	 *	@return the drg_8_drgPayor
	 */
	
	@JsonProperty("drg_8_drgPayor")
	public String getDrg_8_drgPayor() {
		return this.drg.getDrg8_DRGPayor().getValue()==null?"":this.drg.getDrg8_DRGPayor().getValue();
	}
	/**
	 * @param drg_8_drgPayor the drg_8_drgPayor to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("drg_8_drgPayor")
	public void setDrg_8_drgPayor(String drg_8_drgPayor) throws DataTypeException {
		this.drg.getDrg8_DRGPayor().setValue(drg_8_drgPayor);
		this.drg_8_drgPayor = drg_8_drgPayor;
	}
	/**
	 *	@return the cp_drg_9_outlierReimbursement
	 */
	
	@JsonProperty("cp_drg_9_outlierReimbursement")
	public CP_v2 getCp_drg_9_outlierReimbursement() {
		return CommonService.getCP_v2(this.drg.getDrg9_OutlierReimbursement());
	}
	/**
	 * @param cp_drg_9_outlierReimbursement the cp_drg_9_outlierReimbursement to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cp_drg_9_outlierReimbursement")
	public void setCp_drg_9_outlierReimbursement(CP_v2 cp_drg_9_outlierReimbursement) throws DataTypeException {
		CommonService.setCP_v2(this.drg.getDrg9_OutlierReimbursement(), cp_drg_9_outlierReimbursement);
		this.cp_drg_9_outlierReimbursement = cp_drg_9_outlierReimbursement;
	}
	/**
	 *	@return the drg_10_confidentialIndicator
	 */
	
	@JsonProperty("drg_10_confidentialIndicator")
	public String getDrg_10_confidentialIndicator() {
		return this.drg.getDrg10_ConfidentialIndicator().getValue()==null?"":this.drg.getDrg10_ConfidentialIndicator().getValue();
	}
	/**
	 * @param drg_10_confidentialIndicator the drg_10_confidentialIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("drg_10_confidentialIndicator")
	public void setDrg_10_confidentialIndicator(String drg_10_confidentialIndicator) throws DataTypeException {
		this.drg.getDrg10_ConfidentialIndicator().setValue(drg_10_confidentialIndicator);
		this.drg_10_confidentialIndicator = drg_10_confidentialIndicator;
	}
	@Override
	public String toString() {
		return "CustomDRG [ce_drg_1_diagnosticRelatedGroup=" + ce_drg_1_diagnosticRelatedGroup
				+ ", ts_drg_2_drgAssignedDateTime=" + ts_drg_2_drgAssignedDateTime + ", drg_3_drgApprovalIndicator="
				+ drg_3_drgApprovalIndicator + ", drg_4_drgGrouperReviewCode=" + drg_4_drgGrouperReviewCode
				+ ", ce_drg_5_outlierType=" + ce_drg_5_outlierType + ", drg_6_outlierDays=" + drg_6_outlierDays
				+ ", cp_drg_7_outlierCost=" + cp_drg_7_outlierCost + ", drg_8_drgPayor=" + drg_8_drgPayor
				+ ", cp_drg_9_outlierReimbursement=" + cp_drg_9_outlierReimbursement + ", drg_10_confidentialIndicator="
				+ drg_10_confidentialIndicator + ", drg=" + drg + "]";
	}
	
}
