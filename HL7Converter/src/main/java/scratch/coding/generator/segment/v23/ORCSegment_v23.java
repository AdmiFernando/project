package scratch.coding.generator.segment.v23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_ORDER;
import scratch.coding.segment.v23.JsonORC_v23;
import scratch.coding.services.CommonService;
@Service
public class ORCSegment_v23 {
	
	
	
	public static void setORC(ORM_O01_ORDER order, JsonORC_v23 customORC) throws HL7Exception {
		
		order.getORC().getOrc1_OrderControl().setValue(customORC.getOrc_1_orderControl());
		for(int i = 0; i< customORC.getEi_orc_2_placerOrderNumber().length; i++) {
			 CommonService.setEI_v2(order.getORC().getOrc2_PlacerOrderNumber(i), customORC.getEi_orc_2_placerOrderNumber()[i]);
		}
		CommonService.setEI_v2(order.getORC().getOrc3_FillerOrderNumber(), customORC.getEi_orc_3_fillerOrderNumber());
		CommonService.setEI_v2(order.getORC().getOrc4_PlacerGroupNumber(), customORC.getEi_orc_4_placerGroupNumber());
		order.getORC().getOrc5_OrderStatus().setValue(customORC.getOrc_5_orderStatus());
		order.getORC().getOrc6_ResponseFlag().setValue(customORC.getOrc_6_responseFlag());
		CommonService.setTQ_v23(order.getORC().getOrc7_QuantityTiming(), customORC.getTq_orc_7_quantityTiming());
		CommonService.setCM_EIP_v23(order.getORC().getOrc8_ParentOrder(), customORC.getCm_eip_orc_8_parentOrder());
		CommonService.setTS_v2(order.getORC().getOrc9_DateTimeOfTransaction(), customORC.getTs_orc_9_dateTimeOfTransaction());
		CommonService.setXCN_v23(order.getORC().getOrc10_EnteredBy(), customORC.getXcn_orc_10_enteredBy());
		CommonService.setXCN_v23(order.getORC().getOrc11_VerifiedBy(), customORC.getXcn_orc_11_verifiedBy());
		for(int i = 0; i<customORC.getXcn_orc_12_orderingProvider().length; i++) {
			CommonService.setXCN_v23(order.getORC().getOrc12_OrderingProvider(i), customORC.getXcn_orc_12_orderingProvider()[i]);
		}
		CommonService.setPL_v23(order.getORC().getOrc13_EntererSLocation(), customORC.getPl_orc_13_entererSLocation());
		for(int i = 0; i < customORC.getXtn_orc_14_callBackPhoneNumber().length;i++) {
			CommonService.setXTN_v23(order.getORC().getOrc14_CallBackPhoneNumber(i), customORC.getXtn_orc_14_callBackPhoneNumber()[i]);
		}
		CommonService.setTS_v2(order.getORC().getOrc15_OrderEffectiveDateTime(), customORC.getTs_orc_15_orderEffectiveDateTime());
		CommonService.setCE_v2(order.getORC().getOrc16_OrderControlCodeReason(), customORC.getCe_orc_16_orderControlCodeReason());
		CommonService.setCE_v2(order.getORC().getOrc17_EnteringOrganization(), customORC.getCe_orc_17_enteringOrganization());
		CommonService.setCE_v2(order.getORC().getOrc18_EnteringDevice(), customORC.getCe_orc_18_enteringDevice());
		CommonService.setXCN_v23(order.getORC().getOrc19_ActionBy(), customORC.getXcn_orc_19_actionBy());
		OBRSegment_v23.setOBR(order.getORDER_DETAIL(), customORC.getObr_orc());
	}
}