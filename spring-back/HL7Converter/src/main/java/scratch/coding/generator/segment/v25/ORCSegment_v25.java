package scratch.coding.generator.segment.v25;



import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.segment.ORC;
//import scratch.coding.segment.base.v25.ORC_ST_v25;
import scratch.coding.services.CommonService;
public class ORCSegment_v25 {
	
	

//	public static void setORC(ORU_R01_ORDER_OBSERVATION order, ORC_ST_v25 orc_ST_v25) throws HL7Exception {
//		// TODO Auto-generated method stub
//		order.getORC().getOrc1_OrderControl().setValue(orc_ST_v25.getOrc_1_orderControl());
//		CommonService.setEI(order.getORC().getOrc2_PlacerOrderNumber(), orc_ST_v25.getOrc_2_placerOrderNumber());
//		CommonService.setEI(order.getORC().getOrc3_FillerOrderNumber(), orc_ST_v25.getOrc_3_fillerOrderNumber());
//		CommonService.setEI(order.getORC().getOrc4_PlacerGroupNumber(), orc_ST_v25.getOrc_4_placerGroupNumber());
//		order.getORC().getOrc5_OrderStatus().setValue(orc_ST_v25.getOrc_5_orderStatus());
//		order.getORC().getOrc6_ResponseFlag().setValue(orc_ST_v25.getOrc_6_responseFlag());
//		setORC7(order.getORC(), orc_ST_v25);
//		CommonService.setEIP(order.getORC().getOrc8_ParentOrder(), orc_ST_v25.getOrc_8_parentOrder());
//		CommonService.setTS(order.getORC().getOrc9_DateTimeOfTransaction(), orc_ST_v25.getOrc_9_dateTimeofTransaction());
//		setORC10(order.getORC(), orc_ST_v25); 
//		setORC11(order.getORC(), orc_ST_v25);
//		setORC12(order.getORC(), orc_ST_v25);
//		CommonService.setPL(order.getORC().getOrc13_EntererSLocation(), orc_ST_v25.getOrc_13_enterersLocation());
//		setORC14(order.getORC(),  orc_ST_v25);
//		CommonService.setTS(order.getORC().getOrc15_OrderEffectiveDateTime(), orc_ST_v25.getOrc_15_orderEffectiveDateTime());
//		CommonService.setCE(order.getORC().getOrc16_OrderControlCodeReason(), orc_ST_v25.getOrc_16_orderControlCodeReason());
//		CommonService.setCE(order.getORC().getOrc17_EnteringOrganization(), orc_ST_v25.getOrc_17_enteringOrganization());
//		CommonService.setCE(order.getORC().getOrc18_EnteringDevice(), orc_ST_v25.getOrc_18_enteringDevice());
//		setORC19(order.getORC(), orc_ST_v25);
//		CommonService.setCE(order.getORC().getOrc20_AdvancedBeneficiaryNoticeCode(), orc_ST_v25.getOrc_20_advancedBeneficiaryNoticeCode());
//		setORC21(order.getORC(), orc_ST_v25);
//		setORC22(order.getORC(), orc_ST_v25);
//		setORC23(order.getORC(), orc_ST_v25);
//		setORC24(order.getORC(), orc_ST_v25);
//		CommonService.setCWE(order.getORC().getOrc25_OrderStatusModifier(), orc_ST_v25.getOrc_25_orderStatusModifier());
//		CommonService.setCWE(order.getORC().getOrc26_AdvancedBeneficiaryNoticeOverrideReason(), orc_ST_v25.getOrc_26_advancedBeneficiaryNoticeOverrideReason());
//		CommonService.setTS(order.getORC().getOrc27_FillerSExpectedAvailabilityDateTime(), orc_ST_v25.getOrc_27_fillersExpectedAvailabilityDateTime());
//		CommonService.setCWE(order.getORC().getOrc28_ConfidentialityCode(), orc_ST_v25.getOrc_28_confidentialityCode());
//		CommonService.setCWE(order.getORC().getOrc29_OrderType(), orc_ST_v25.getOrc_29_orderType());
//		CommonService.setCNE(order.getORC().getOrc30_EntererAuthorizationMode(), orc_ST_v25.getOrc_30_entererAuthorizationMode());
//		OBRSegment_v25.setOBR(order, orc_ST_v25.getObr());
//		
//	}
//	public static void setORC14(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_7_quantityTiming().size();i++) {
//			CommonService.setTQ(orc.getOrc7_QuantityTiming(i), orc_ST_v25.getOrc_7_quantityTiming().get(i));
//		}
//	}
//
//	public static void setORC7(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_7_quantityTiming().size();i++) {
//			CommonService.setTQ(orc.getOrc7_QuantityTiming(i), orc_ST_v25.getOrc_7_quantityTiming().get(i));
//		}
//	}
//	
//	public static void setORC10(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_10_enteredBy().size();i++) {
//			CommonService.setXCN(orc.getOrc10_EnteredBy(i), orc_ST_v25.getOrc_10_enteredBy().get(i));
//		}
//	}
//	public static void setORC11(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_11_verifiedBy().size();i++) {
//			CommonService.setXCN(orc.getOrc11_VerifiedBy(i), orc_ST_v25.getOrc_11_verifiedBy().get(i));
//		}
//	}
//	public static void setORC12(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_12_orderingProvider().size();i++) {
//			CommonService.setXCN(orc.getOrc12_OrderingProvider(i), orc_ST_v25.getOrc_12_orderingProvider().get(i));
//		}
//		
//	}
//	public static void setORC19(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_19_actionBy().size();i++) {
//			CommonService.setXCN(orc.getOrc19_ActionBy(i), orc_ST_v25.getOrc_19_actionBy().get(i));
//		}
//	}
//	public static void setORC21(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_21_orderingFacilityName().size();i++) {
//			CommonService.setXCN(orc.getOrc21_OrderingFacilityName(i), orc_ST_v25.getOrc_21_orderingFacilityName().get(i));
//		}
//	}
//	public static void setORC22(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_22_orderingFacilityAddress().size();i++) {
//			CommonService.setXAD(orc.getOrc22_OrderingFacilityAddress(i), orc_ST_v25.getOrc_22_orderingFacilityAddress().get(i));
//		}
//	}
//	public static void setORC23(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_23_orderingFacilityPhoneNumber().size();i++) {
//			CommonService.setXTN(orc.getOrc23_OrderingFacilityPhoneNumber(i), orc_ST_v25.getOrc_23_orderingFacilityPhoneNumber().get(i));
//		}
//	}
//	public static void setORC24(ORC orc, ORC_ST_v25 orc_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i =0; i<orc_ST_v25.getOrc_24_orderingProviderAddress().size();i++) {
//			CommonService.setXAD(orc.getOrc24_OrderingProviderAddress(i), orc_ST_v25.getOrc_24_orderingProviderAddress().get(i));
//		}
//	}

}
