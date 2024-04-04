package scratch.coding.generator.segment.v25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v25.segment.OBX;
//import scratch.coding.segment.base.v25.OBX_ST_v25;
import scratch.coding.services.CommonService;

public class OBXSegment_v25 {
	
//	public static void setOBX(ORU_R01_OBSERVATION observation, OBX_ST_v25 obxSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		observation.getOBX().getObx1_SetIDOBX().setValue(obxSt.getObx_1_setID());
//		observation.getOBX().getObx2_ValueType().setValue(obxSt.getObx_2_valueType());
//		CommonService.setCE(observation.getOBX().getObx3_ObservationIdentifier(), obxSt.getObx_3_observationIdentifier());
//		observation.getOBX().getObx4_ObservationSubID().setValue(obxSt.getObx_4_observationSubID());
//		setOBX5(observation.getOBX(),obxSt );
//		CommonService.setCE(observation.getOBX().getObx6_Units(), obxSt.getObx_6_units());
//		observation.getOBX().getObx7_ReferencesRange().setValue(obxSt.getObx_7_referencesRange());
//		setOBX8(observation.getOBX(), obxSt);
//		observation.getOBX().getObx9_Probability().setValue(obxSt.getObx_9_probability());
//		setOBX10(observation.getOBX(), obxSt);
//		observation.getOBX().getObx11_ObservationResultStatus().setValue(obxSt.getObx_11_observationResultStatus());
//		CommonService.setTS(observation.getOBX().getObx12_EffectiveDateOfReferenceRange(), obxSt.getObx_12_effectiveDateofReferenceRange());
//		observation.getOBX().getObx13_UserDefinedAccessChecks().setValue(obxSt.getObx_13_userDefinedAccessChecks());
//		CommonService.setTS(observation.getOBX().getObx14_DateTimeOfTheObservation(), obxSt.getObx_14_dateTimeoftheObservation());
//		CommonService.setCE(observation.getOBX().getObx15_ProducerSID(), obxSt.getObx_15_producersID());
//		setOBX16(observation.getOBX(), obxSt);
//		setOBX17(observation.getOBX(), obxSt);
//		setOBX18(observation.getOBX(), obxSt);
//		CommonService.setTS(observation.getOBX().getObx19_DateTimeOfTheAnalysis(), obxSt.getObx_19_dateTimeoftheAnalysis());
//		setNET(observation, obxSt);
//		
//	}
//	private static void setNET(ORU_R01_OBSERVATION observation, OBX_ST_v25 obxSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getNte().size();i++) {
//			NTESegment_v25.setNTE(observation.getNTE(i), obxSt.getNte().get(i));
//		}
//	}
//	private static void setOBX18(OBX obx, OBX_ST_v25 obxSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getObx_18_equipmentInstanceIdentifier().size();i++) {
//			CommonService.setEI(obx.getObx18_EquipmentInstanceIdentifier(i), obxSt.getObx_18_equipmentInstanceIdentifier().get(i));
//		}
//	}
//	private static void setOBX17(OBX obx, OBX_ST_v25 obxSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getObx_17_observationMethod().size();i++) {
//			CommonService.setCE(obx.getObx17_ObservationMethod(i), obxSt.getObx_17_observationMethod().get(i));
//		}
//	}
//	private static void setOBX16(OBX obx, OBX_ST_v25 obxSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getObx_16_responsibleObserver().size();i++) {
//			CommonService.setXCN(obx.getObx16_ResponsibleObserver(i), obxSt.getObx_16_responsibleObserver().get(i));
//		}
//	}
//	private static void setOBX10(OBX obx, OBX_ST_v25 obxSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getObx_10_natureofAbnormalTest().size();i++) {
//			CommonService.setST(obx.getObx10_NatureOfAbnormalTest(i), obxSt.getObx_10_natureofAbnormalTest().get(i));
//		}
//	}
//	private static void setOBX8(OBX obx, OBX_ST_v25 obxSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getObx_8_abnormalFlags().size();i++) {
//			CommonService.setST(obx.getObx8_AbnormalFlags(i), obxSt.getObx_8_abnormalFlags().get(i));
//		}
//	}
//	private static void setOBX5(OBX obx, OBX_ST_v25 obxSt) throws HL7Exception {
//		// TODO Auto-generated method stub
//		for(int i =0; i< obxSt.getObx_5_observationValue().size();i++) {
//			CommonService.setST(obx.getObx5_ObservationValue(i), obxSt.getObx_5_observationValue().get(i));
//		}
//	}

}
