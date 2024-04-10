package scratch.coding.generator.segment.v25;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.segment.OBR;
//import scratch.coding.segment.base.v25.OBR_ST_v25;
import scratch.coding.services.CommonService;
public class OBRSegment_v25 {

	
//	public static void setOBR(ORU_R01_ORDER_OBSERVATION order, OBR_ST_v25 obrSt) throws HL7Exception {
//		order.getOBR().getObr1_SetIDOBR().setValue(obrSt.getObr_1_setID());
//		CommonService.setEI(order.getOBR().getObr2_PlacerOrderNumber(), obrSt.getObr_2_placerOrderNumber());
//		CommonService.setEI(order.getOBR().getObr3_FillerOrderNumber(), obrSt.getObr_3_fillerOrderNumber());
//		CommonService.setCE(order.getOBR().getObr4_UniversalServiceIdentifier(), obrSt.getObr_4_universalServiceIdentifier());
//		order.getOBR().getObr5_PriorityOBR().setValue(obrSt.getObr_5_priority());
//		CommonService.setTS(order.getOBR().getObr6_RequestedDateTime(), obrSt.getObr_6_requestedDateTime());
//		CommonService.setTS(order.getOBR().getObr7_ObservationDateTime(), obrSt.getObr_7_observationDateTime());
//		CommonService.setTS(order.getOBR().getObr8_ObservationEndDateTime(), obrSt.getObr_8_observationEndDateTime());
//		CommonService.setCQ(order.getOBR().getObr9_CollectionVolume(), obrSt.getObr_9_collectionVolume());
//		setOBR10(order.getOBR(), obrSt);
//		order.getOBR().getObr11_SpecimenActionCode().setValue(obrSt.getObr_11_specimenActionCode());
//		CommonService.setCE(order.getOBR().getObr12_DangerCode(), obrSt.getObr_12_dangerCode());
//		order.getOBR().getObr13_RelevantClinicalInformation().setValue(obrSt.getObr_13_relevantClinicalInformation());
//		CommonService.setTS(order.getOBR().getObr14_SpecimenReceivedDateTime(), obrSt.getObr_14_specimenReceivedDateTime());
//		CommonService.setSPS(order.getOBR().getObr15_SpecimenSource(), obrSt.getObr_15_specimenSource());
//		setOBR16(order.getOBR(), obrSt);
//		setOBR17(order.getOBR(), obrSt);
//		order.getOBR().getObr18_PlacerField1().setValue(obrSt.getObr_18_placerField());
//		order.getOBR().getObr19_PlacerField2().setValue(obrSt.getObr_19_placerField());
//		order.getOBR().getObr20_FillerField1().setValue(obrSt.getObr_20_fillerField());
//		order.getOBR().getObr21_FillerField2().setValue(obrSt.getObr_21_fillerField());
//		CommonService.setTS(order.getOBR().getObr22_ResultsRptStatusChngDateTime(), obrSt.getObr_22_resultsRptStatusChng());
//		CommonService.setMOC(order.getOBR().getObr23_ChargeToPractice(), obrSt.getObr_23_chargetoPractice());
//		order.getOBR().getObr24_DiagnosticServSectID().setValue(obrSt.getObr_24_diagnosticServSectID());
//		order.getOBR().getObr25_ResultStatus().setValue(obrSt.getObr_25_resultStatus());
//		CommonService.setPRL(order.getOBR().getObr26_ParentResult(), obrSt.getObr_26_parentResult());
//		setOBR27(order.getOBR(), obrSt);
//		CommonService.setEIP(order.getOBR().getObr29_ParentNumber(), obrSt.getObr_29_parent());
//		order.getOBR().getObr30_TransportationMode().setValue(obrSt.getObr_30_transportationMode());
//		setOBR31(order.getOBR(), obrSt);
//		CommonService.setNDL(order.getOBR().getObr32_PrincipalResultInterpreter(), obrSt.getObr_32_principalResultInterpreter());
//		setOBR33(order.getOBR(), obrSt);
//		setOBR34(order.getOBR(), obrSt);
//		setOBR35(order.getOBR(), obrSt);
//		CommonService.setTS(order.getOBR().getObr36_ScheduledDateTime(), obrSt.getObr_36_scheduledDateTime());
//		order.getOBR().getObr37_NumberOfSampleContainers().setValue(obrSt.getObr_37_numberofSampleContainers());
//		setOBR38(order.getOBR(), obrSt);
//		setOBR39(order.getOBR(), obrSt);
//		CommonService.setCE(order.getOBR().getObr40_TransportArrangementResponsibility(), obrSt.getObr_40_transportArrangementResponsibility());
//		order.getOBR().getObr41_TransportArranged().setValue(obrSt.getObr_41_transportArranged());
//		order.getOBR().getObr42_EscortRequired().setValue(obrSt.getObr_42_escortRequired());
//		setOBR43(order.getOBR(), obrSt);
//		CommonService.setCE(order.getOBR().getObr44_ProcedureCode(), obrSt.getObr_44_procedureCode());
//		setOBR45(order.getOBR(), obrSt);
//		setOBR46(order.getOBR(), obrSt);
//		setOBR47(order.getOBR(), obrSt);
//		CommonService.setCWE(order.getOBR().getObr48_MedicallyNecessaryDuplicateProcedureReason(), obrSt.getObr_48_medicallyNecessaryDuplicateProcedureReason());
//		order.getOBR().getObr49_ResultHandling().setValue(obrSt.getObr_49_resultHandling());
//		setNTE(order, obrSt);
//		setOBX(order, obrSt);
//		
//	}
//
//	public static void setOBX(ORU_R01_ORDER_OBSERVATION order, OBR_ST_v25 obrSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i =0;i<obrSt.getObx().size();i++) {
//			OBXSegment_v25.setOBX(order.getOBSERVATION(i), obrSt.getObx().get(i));
//		}
//	}
//
//	public static void setNTE(ORU_R01_ORDER_OBSERVATION order, OBR_ST_v25 obrSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i = 0; i< obrSt.getNte().size(); i++) {
//			NTESegment_v25.setNTE(order.getNTE(i), obrSt.getNte().get(i));
//		}
//	}
//
//	public static void setOBR47(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_47_fillerSupplementalServiceInformation().size();i++) {
//			CommonService.setCE(obr.getObr47_FillerSupplementalServiceInformation(i), obrSt.getObr_47_fillerSupplementalServiceInformation().get(i));
//		}
//	}
//
//	public static void setOBR46(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_46_placerSupplementalServiceInformation().size();i++) {
//			CommonService.setCE(obr.getObr46_PlacerSupplementalServiceInformation(i), obrSt.getObr_46_placerSupplementalServiceInformation().get(i));
//		}
//	}
//
//	public static void setOBR45(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_45_procedureCodeModifier().size();i++) {
//			CommonService.setCE(obr.getObr45_ProcedureCodeModifier(i), obrSt.getObr_45_procedureCodeModifier().get(i));
//		}
//	}
//
//	public static void setOBR43(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_43_plannedPatientTransportComment().size();i++) {
//			CommonService.setCE(obr.getObr43_PlannedPatientTransportComment(i), obrSt.getObr_43_plannedPatientTransportComment().get(i));
//		}
//	}
//
//	public static void setOBR39(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_39_collectorsComment().size();i++) {
//			CommonService.setCE(obr.getObr39_CollectorSComment(i), obrSt.getObr_39_collectorsComment().get(i));
//		}
//	}
//
//	public static void setOBR38(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_38_transportLogisticsofCollectedSample().size();i++) {
//			CommonService.setCE(obr.getObr38_TransportLogisticsOfCollectedSample(i), obrSt.getObr_38_transportLogisticsofCollectedSample().get(i));
//		}
//	}
//
//	public static void setOBR35(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_35_transcriptionist().size();i++) {
//			CommonService.setNDL(obr.getObr35_Transcriptionist(i), obrSt.getObr_35_transcriptionist().get(i));
//		}
//	}
//
//	public static void setOBR34(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_34_technician().size();i++) {
//			CommonService.setNDL(obr.getObr34_Technician(i), obrSt.getObr_34_technician().get(i));
//		}
//	}
//
//	public static void setOBR33(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_33_assistantResultInterpreter().size();i++) {
//			CommonService.setNDL(obr.getObr33_AssistantResultInterpreter(i), obrSt.getObr_33_assistantResultInterpreter().get(i));
//		}
//	}
//
//	public static void setOBR31(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_31_reasonforStudy().size();i++) {
//			CommonService.setCE(obr.getObr31_ReasonForStudy(i), obrSt.getObr_31_reasonforStudy().get(i));
//		}
//	}
//
//	public static void setOBR27(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_27_quantityTiming().size();i++) {
//			CommonService.setTQ(obr.getObr27_QuantityTiming(i), obrSt.getObr_27_quantityTiming().get(i));
//		}
//	}
//
//	public static void setOBR17(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_17_orderCallbackPhoneNumber().size();i++) {
//			CommonService.setXTN(obr.getObr17_OrderCallbackPhoneNumber(i), obrSt.getObr_17_orderCallbackPhoneNumber().get(i));
//		}
//	}
//
//	public static void setOBR16(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_16_orderingProvider().size();i++) {
//			CommonService.setXCN(obr.getObr16_OrderingProvider(i), obrSt.getObr_16_orderingProvider().get(i));
//		}
//	}
//
//	public static void setOBR10(OBR obr, OBR_ST_v25 obrSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<obrSt.getObr_10_collectorIdentifier().size();i++) {
//			CommonService.setXCN(obr.getObr10_CollectorIdentifier(i), obrSt.getObr_10_collectorIdentifier().get(i));
//		}
//	}
}
