package scratch.coding.generator.segment.v23;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_OBSERVATION;
import scratch.coding.segment.v23.JsonOBX_v23;
import scratch.coding.services.CommonService;
public class OBXsegment_v23 {
	public static void setOBX(ORM_O01_OBSERVATION order, JsonOBX_v23 customOBX) throws HL7Exception {
//		OBX obx = order.getOBX();
		order.getOBX().getObx1_SetIDOBX().setValue(customOBX.getObx_1_setId());
		order.getOBX().getObx2_ValueType().setValue(customOBX.getObx_2_valueType());
		CommonService.setCE_v2(order.getOBX().getObx3_ObservationIdentifier(), customOBX.getCe_obx_3_observationIdentifier());
		order.getOBX().getObx4_ObservationSubID().setValue(customOBX.getObx_4_observationSubId());
		for(int i = 0; i < customOBX.getObx_5_observationValue().length; i++) {
			order.getOBX().getObx5_ObservationValue(i).parse(customOBX.getObx_5_observationValue()[i]);
		}
		CommonService.setCE_v2(order.getOBX().getObx6_Units(), customOBX.getCe_obx_6_units());
		order.getOBX().getObx7_ReferencesRange().setValue(customOBX.getObx_7_referencesRange());
		for(int i = 0; i< customOBX.getObx_8_abmornalFlags().length; i++) {
			order.getOBX().getObx8_AbnormalFlags(i).setValue(customOBX.getObx_8_abmornalFlags()[i]);
		}
		order.getOBX().getObx9_Probability().setValue(customOBX.getObx_9_probability());
		order.getOBX().getObx10_NatureOfAbnormalTest().setValue(customOBX.getObx_10_natureOfAbnormalTest());
		order.getOBX().getObx11_ObservResultStatus().setValue(customOBX.getObx_11_observResultStatus());
		CommonService.setTS_v2(order.getOBX().getObx12_DateLastObsNormalValues(), customOBX.getTs_obx_12_dateLastObsNormalValues());
		order.getOBX().getObx13_UserDefinedAccessChecks().setValue(customOBX.getObx_13_userDefinedAccessChecks());
		CommonService.setTS_v2(order.getOBX().getObx14_DateTimeOfTheObservation(), customOBX.getTs_obx_14_dateTimeOfTheObservation());
		CommonService.setCE_v2(order.getOBX().getObx15_ProducerSID(), customOBX.getCe_obx_15_producersId());
		CommonService.setXCN_v23(order.getOBX().getObx16_ResponsibleObserver(), customOBX.getXcn_obx_16_responsibleObserver());
		for(int i = 0; i < customOBX.getCe_obx_17_observationMethod().length; i++) {
			CommonService.setCE_v2(order.getOBX().getObx17_ObservationMethod(i), customOBX.getCe_obx_17_observationMethod()[i]);
		}
		for(int i = 0;i<customOBX.getNte_obx().length; i++) {
			NTESegment_v23.setNTE(order.getNTE(i), customOBX.getNte_obx()[i]);
		}
	}
}
