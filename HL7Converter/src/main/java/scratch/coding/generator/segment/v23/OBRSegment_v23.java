package scratch.coding.generator.segment.v23;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_ORDER_DETAIL;
import scratch.coding.segment.v23.JsonOBR_v23;
import scratch.coding.services.CommonService;
public class OBRSegment_v23 {

	public static void setOBR(ORM_O01_ORDER_DETAIL order, JsonOBR_v23 customOBR) throws HL7Exception {
		order.getOBR().getObr1_SetIDObservationRequest().setValue(customOBR.getObr_1_setId());
		for(int i = 0; i<customOBR.getEi_obr_2_placeOrderNumber().length; i++) {
			CommonService.setEI_v2(order.getOBR().getObr2_PlacerOrderNumber(i), customOBR.getEi_obr_2_placeOrderNumber()[i]);
		}
		CommonService.setEI_v2(order.getOBR().getObr3_FillerOrderNumber(), customOBR.getEi_obr_3_fillerOderNumber());
		CommonService.setCE_v2(order.getOBR().getObr4_UniversalServiceIdentifier(), customOBR.getCe_obr_4_universalServiceIdentifier());
		order.getOBR().getObr5_Priority().setValue(customOBR.getObr_5_priority());
		CommonService.setTS_v2(order.getOBR().getObr6_RequestedDateTime(), customOBR.getTs_obr_6_requestedDateTime());
		CommonService.setTS_v2(order.getOBR().getObr7_ObservationDateTime(), customOBR.getTs_obr_7_observationDateTime());
		CommonService.setTS_v2(order.getOBR().getObr8_ObservationEndDateTime(), customOBR.getTs_obr_8_observationEndDateTime());
		CommonService.setCQ_v23(order.getOBR().getObr9_CollectionVolume(), customOBR.getCq_obr_9_collectionVolume());
		for(int i = 0; i<customOBR.getXcn_obr_10_collectorIdentifier().length;i++ ) {			
			CommonService.setXCN_v23(order.getOBR().getObr10_CollectorIdentifier(i), customOBR.getXcn_obr_10_collectorIdentifier()[i]);
		}
		order.getOBR().getObr11_SpecimenActionCode().setValue(customOBR.getObr_11_specimenActionCode());
		CommonService.setCE_v2(order.getOBR().getObr12_DangerCode(), customOBR.getCe_obr_12_dangerCode());
		order.getOBR().getObr13_RelevantClinicalInformation().setValue(customOBR.getObr_13_relevantClinicalInformation());
		CommonService.setTS_v2(order.getOBR().getObr14_SpecimenReceivedDateTime(), customOBR.getTs_obr_14_specimenReceivedDateTime());
		CommonService.setCM_SPS_v23(order.getOBR().getObr15_SpecimenSource(), customOBR.getCm_sps_obr_15_specimenSource());
		for(int i = 0; i < customOBR.getXcn_obr_16_orderingProvider().length; i++) {
			CommonService.setXCN_v23(order.getOBR().getObr16_OrderingProvider(i), customOBR.getXcn_obr_16_orderingProvider()[i]);
		}
		for(int i = 0; i <customOBR.getXtn_obr_17_orderCallbackPhoneNumber().length; i++) {
			CommonService.setXTN_v23(order.getOBR().getObr17_OrderCallbackPhoneNumber(i), customOBR.getXtn_obr_17_orderCallbackPhoneNumber()[i]);
		}
		order.getOBR().getObr18_PlacerField1().setValue(customOBR.getObr_18_placerField1());
		order.getOBR().getObr19_PlacerField2().setValue(customOBR.getObr_19_placerField2());
		order.getOBR().getObr20_FillerField1().setValue(customOBR.getObr_20_fillerField1());
		order.getOBR().getObr21_FillerField2().setValue(customOBR.getObr_21_fillerField2());
		CommonService.setTS_v2(order.getOBR().getObr22_ResultsRptStatusChngDateTime(), customOBR.getTs_obr_22_resultsRptStatusChngDateTime());
		CommonService.setCM_MOC_v23(order.getOBR().getObr23_ChargeToPractice(), customOBR.getCm_moc_obr_23_chargeToPractice());	
		order.getOBR().getObr24_DiagnosticServiceSectionID().setValue(customOBR.getObr_24_diagnosticServiceSectionId());
		order.getOBR().getObr25_ResultStatus().setValue(customOBR.getObr_25_resultStatus());
		CommonService.setCM_PRL_v23(order.getOBR().getObr26_ParentResult(), customOBR.getCm_prl_obr_26_parentResult());
		CommonService.setTQ_v23(order.getOBR().getObr27_QuantityTiming(), customOBR.getTq_obr_27_quantityTiming());
		for(int i = 0; i<customOBR.getXcn_obr_28_resultCopiesTo().length;i++) {
			CommonService.setXCN_v23(order.getOBR().getObr28_ResultCopiesTo(i), customOBR.getXcn_obr_28_resultCopiesTo()[i]);
		}
		CommonService.setCM_EIP_v23(order.getOBR().getObr29_ParentNumber(), customOBR.getCm_eip_obr_29_parentNumber());
		order.getOBR().getObr30_TransportationMode().setValue(customOBR.getObr_30_ransportationMode());
		for(int i = 0;i<customOBR.getCe_obr_31_reasonForStudy().length;i++) {
			CommonService.setCE_v2(order.getOBR().getObr31_ReasonForStudy(i), customOBR.getCe_obr_31_reasonForStudy()[i]);			
		}
		CommonService.setCM_NDL_v23(order.getOBR().getObr32_PrincipalResultInterpreter(), customOBR.getCm_ndl_obr_32_principalResultInterpreter());
		for(int i = 0; i <customOBR.getCm_ndl_obr_33_assistantResultInterpreter().length; i++) {
			CommonService.setCM_NDL_v23(order.getOBR().getObr33_AssistantResultInterpreter(i), customOBR.getCm_ndl_obr_33_assistantResultInterpreter()[i]);
		}
		for(int i = 0; i <customOBR.getCm_ndl_obr_34_technician().length; i++) {
			CommonService.setCM_NDL_v23(order.getOBR().getObr34_Technician(i), customOBR.getCm_ndl_obr_34_technician()[i]);
		}
		for(int i = 0; i <customOBR.getCm_ndl_obr_35_transcriptionist().length; i++) {
			CommonService.setCM_NDL_v23(order.getOBR().getObr35_Transcriptionist(i), customOBR.getCm_ndl_obr_35_transcriptionist()[i]);
		}
		CommonService.setTS_v2(order.getOBR().getObr36_ScheduledDateTime(), customOBR.getTs_obr_36_scheduledDateTime());
		order.getOBR().getObr37_NumberOfSampleContainers().setValue(customOBR.getObr_37_numberOfSampleContainers());
		for(int i = 0; i < customOBR.getCe_obr_38_transportLogisticsOfCollectedSample().length; i++) {
			CommonService.setCE_v2(order.getOBR().getObr38_TransportLogisticsOfCollectedSample(i), customOBR.getCe_obr_38_transportLogisticsOfCollectedSample()[i]);
		}
		for(int i = 0; i < customOBR.getCe_obr_39_collectorsComment().length;i++) {
			CommonService.setCE_v2(order.getOBR().getObr39_CollectorSComment(i), customOBR.getCe_obr_39_collectorsComment()[i]);
		}
		CommonService.setCE_v2(order.getOBR().getObr40_TransportArrangementResponsibility(), customOBR.getCe_obr_40_transportArrangementResponsibility());
		order.getOBR().getObr41_TransportArranged().setValue(customOBR.getObr_41_transportArranged());
		order.getOBR().getObr42_EscortRequired().setValue(customOBR.getObr_42_escortRequired());
		for(int i = 0; i < customOBR.getCe_obr_43_plannedPatientTransportComment().length;i++) {
			CommonService.setCE_v2(order.getOBR().getObr43_PlannedPatientTransportComment(i), customOBR.getCe_obr_43_plannedPatientTransportComment()[i]);
		}
		for(int i =0; i<customOBR.getObx().length; i++) {
			OBXsegment_v23.setOBX(order.getOBSERVATION(i), customOBR.getObx()[i]);
		}
	}
}
