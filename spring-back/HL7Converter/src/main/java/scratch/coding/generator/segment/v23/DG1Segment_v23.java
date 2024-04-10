package scratch.coding.generator.segment.v23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.segment.DG1;
import scratch.coding.segment.v23.JsonDG1_v23;
import scratch.coding.services.CommonService;
public class DG1Segment_v23 {

	
	public void setDG1(DG1 dg1, JsonDG1_v23 customDG1) throws HL7Exception {
		dg1.getDg11_SetIDDiagnosis().setValue(customDG1.getDg1_1_setId());
		dg1.getDg12_DiagnosisCodingMethod().setValue(customDG1.getDg1_2_diagnosisCodingMethod());
		CommonService.setCE_v2(dg1.getDg13_DiagnosisCode(), customDG1.getCe_dg1_3_diagnosisCode());
		dg1.getDg14_DiagnosisDescription().setValue(customDG1.getDg1_4_diagnosisDescription());
		CommonService.setTS_v2(dg1.getDg15_DiagnosisDateTime(), customDG1.getTs_dg1_5_diagnosisDateTime());
		dg1.getDg16_DiagnosisType().setValue(customDG1.getDg1_6_diagnosisType());
		CommonService.setCE_v2(dg1.getDg17_MajorDiagnosticCategory(),customDG1.getCe_dg1_7_majorDiagnosticCategory());
		CommonService.setCE_v2(dg1.getDg18_DiagnosticRelatedGroup(), customDG1.getCe_dg1_8_diagnosticRelatedGroup());
		dg1.getDg19_DRGApprovalIndicator().setValue(customDG1.getDg1_9_drgApprovalIndicator());
		dg1.getDg110_DRGGrouperReviewCode().setValue(customDG1.getDg1_10_drgGrouperReviewCode());
		CommonService.setCE_v2(dg1.getDg111_OutlierType(), customDG1.getCe_dg1_11_outlierType());
		dg1.getDg112_OutlierDays().setValue(customDG1.getDg1_12_outlierDays());
		CommonService.setCP_v2(dg1.getDg113_OutlierCost(), customDG1.getCp_dg1_13_outlierCost());
		dg1.getDg114_GrouperVersionAndType().setValue(customDG1.getDg1_14_grouperVersionAndType());
		dg1.getDg115_DiagnosisPriority().setValue(customDG1.getDg1_15_diagnosisPriority());
		for(int i =0; i < customDG1.getXcn_dg1_16_diagnosingClinician().length;i++) {
			CommonService.setXCN_v23(dg1.getDg116_DiagnosingClinician(i), customDG1.getXcn_dg1_16_diagnosingClinician()[i]);
		}
		dg1.getDg117_DiagnosisClassification().setValue(customDG1.getDg1_17_diagnosisClassification());
		dg1.getDg118_ConfidentialIndicator().setValue(customDG1.getDg1_18_confidentialIndicator());
		CommonService.setTS_v2(dg1.getDg119_AttestationDateTime(), customDG1.getTs_dg1_19_attestationDateTime());
		
		
	}
	
}
