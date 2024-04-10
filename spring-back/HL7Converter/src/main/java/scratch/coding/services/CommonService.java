package scratch.coding.services;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v23.datatype.CM_AUI;
import ca.uhn.hl7v2.model.v23.datatype.CM_DLD;
import ca.uhn.hl7v2.model.v23.datatype.CM_EIP;
import ca.uhn.hl7v2.model.v23.datatype.CM_MOC;
import ca.uhn.hl7v2.model.v23.datatype.CM_MSG;
import ca.uhn.hl7v2.model.v23.datatype.CM_NDL;
import ca.uhn.hl7v2.model.v23.datatype.CM_OSD;
import ca.uhn.hl7v2.model.v23.datatype.CM_PRL;
import ca.uhn.hl7v2.model.v23.datatype.CM_RI;
import ca.uhn.hl7v2.model.v23.datatype.CM_SPS;
import ca.uhn.hl7v2.model.v23.datatype.CN;
import ca.uhn.hl7v2.model.v23.datatype.CP;
import ca.uhn.hl7v2.model.v23.datatype.FC;
import ca.uhn.hl7v2.model.v23.datatype.JCC;
import ca.uhn.hl7v2.model.v25.datatype.CE;
import ca.uhn.hl7v2.model.v25.datatype.CNE;
import ca.uhn.hl7v2.model.v25.datatype.CNN;
import ca.uhn.hl7v2.model.v25.datatype.CQ;
import ca.uhn.hl7v2.model.v25.datatype.CWE;
import ca.uhn.hl7v2.model.v25.datatype.CX;
import ca.uhn.hl7v2.model.v25.datatype.DLN;
import ca.uhn.hl7v2.model.v25.datatype.DR;
import ca.uhn.hl7v2.model.v25.datatype.EI;
import ca.uhn.hl7v2.model.v25.datatype.EIP;
import ca.uhn.hl7v2.model.v25.datatype.FN;
import ca.uhn.hl7v2.model.v25.datatype.FT;
import ca.uhn.hl7v2.model.v25.datatype.HD;
import ca.uhn.hl7v2.model.v25.datatype.ID;
import ca.uhn.hl7v2.model.v25.datatype.IS;
import ca.uhn.hl7v2.model.v25.datatype.MO;
import ca.uhn.hl7v2.model.v25.datatype.MOC;
import ca.uhn.hl7v2.model.v25.datatype.MSG;
import ca.uhn.hl7v2.model.v25.datatype.NDL;
import ca.uhn.hl7v2.model.v25.datatype.OSD;
import ca.uhn.hl7v2.model.v25.datatype.PL;
import ca.uhn.hl7v2.model.v25.datatype.PRL;
import ca.uhn.hl7v2.model.v25.datatype.PT;
import ca.uhn.hl7v2.model.v25.datatype.RI;
import ca.uhn.hl7v2.model.v25.datatype.SPS;
import ca.uhn.hl7v2.model.v25.datatype.TQ;
import ca.uhn.hl7v2.model.v25.datatype.TS;
import ca.uhn.hl7v2.model.v25.datatype.VID;
import ca.uhn.hl7v2.model.v25.datatype.XAD;
import ca.uhn.hl7v2.model.v25.datatype.XCN;
import ca.uhn.hl7v2.model.v25.datatype.XON;
import ca.uhn.hl7v2.model.v25.datatype.XPN;
import ca.uhn.hl7v2.model.v25.datatype.XTN;
import ca.uhn.hl7v2.parser.Parser;
import scratch.coding.hl7.v23.CustomORM_O01v23;
import scratch.coding.hl7.v25.CustomORU_R01v25;
import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.MO_v2;
import scratch.coding.models.PT_v2;
import scratch.coding.models.RI_v2;
import scratch.coding.models.TS_v2;
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.DLN_ST;
//import scratch.coding.models.base.DR_ST;
//import scratch.coding.models.base.HD_ST;
//import scratch.coding.models.base.MOC_ST;
//import scratch.coding.models.base.MO_ST;
//import scratch.coding.models.base.OSD_ST;
//import scratch.coding.models.base.PRL_ST;
//import scratch.coding.models.base.PT_ST;
//import scratch.coding.models.base.RI_ST;
//import scratch.coding.models.base.ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v23.CM_MSG_ST;
//import scratch.coding.models.base.v25.CNE_ST_v25;
//import scratch.coding.models.base.v25.CNN_ST_v25;
//import scratch.coding.models.base.v25.CQ_ST_v25;
//import scratch.coding.models.base.v25.CWE_ST_v25;
//import scratch.coding.models.base.v25.CX_ST_v25;
//import scratch.coding.models.base.v25.EIP_ST_v25;
//import scratch.coding.models.base.v25.EI_ST_v25;
//import scratch.coding.models.base.v25.FN_ST_v25;
//import scratch.coding.models.base.v25.MSG_ST_v25;
//import scratch.coding.models.base.v25.NDL_ST_v25;
//import scratch.coding.models.base.v25.PL_ST_v25;
//import scratch.coding.models.base.v25.SAD_ST_v25;
//import scratch.coding.models.base.v25.SPS_ST_v25;
//import scratch.coding.models.base.v25.TQ_ST_v25;
//import scratch.coding.models.base.v25.VID_ST_v25;
//import scratch.coding.models.base.v25.XAD_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XON_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//import scratch.coding.models.base.v25.XTN_ST_v25;
import scratch.coding.models.v23.CM_AUI_v23;
import scratch.coding.models.v23.CM_DLD_v23;
import scratch.coding.models.v23.CM_EIP_v23;
import scratch.coding.models.v23.CM_MOC_v23;
import scratch.coding.models.v23.CM_MSG_v23;
import scratch.coding.models.v23.CM_NDL_v23;
import scratch.coding.models.v23.CM_OSD_v23;
import scratch.coding.models.v23.CM_PRL_v23;
import scratch.coding.models.v23.CM_SPS_v23;
import scratch.coding.models.v23.CN_v23;
import scratch.coding.models.v23.CQ_v23;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.DLN_v23;
import scratch.coding.models.v23.FC_v23;
import scratch.coding.models.v23.JCC_v23;
import scratch.coding.models.v23.MO_v23;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.TQ_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XON_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;
import scratch.coding.models.v25.CNE_v25;
import scratch.coding.models.v25.CNN_v25;
import scratch.coding.models.v25.CQ_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.DLN_v25;
import scratch.coding.models.v25.EIP_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.MOC_v25;
import scratch.coding.models.v25.MSG_v25;
import scratch.coding.models.v25.NDL_v25;
import scratch.coding.models.v25.OSD_V25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.PRL_v25;
import scratch.coding.models.v25.SPS_v25;
import scratch.coding.models.v25.TQ_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//import scratch.coding.segment.base.v25.NTE_ST_v25;
//import scratch.coding.segment.base.v25.OBR_ST_v25;
//import scratch.coding.segment.base.v25.OBX_ST_v25;
//import scratch.coding.segment.base.v25.ORC_ST_v25;
//import scratch.coding.segment.base.v25.PID_ST_v25;
import scratch.coding.segment.v25.CustomNTE_v25;
import scratch.coding.segment.v25.CustomOBR_v25;
import scratch.coding.segment.v25.CustomOBX_v25;
import scratch.coding.segment.v25.CustomORC_v25;

public class CommonService {
	
//	public static  List<ORC_ST_v25> getORC_ST_v25Array(CustomORU_R01v25 customObj) throws HL7Exception, IOException {
//		List<ORC_ST_v25> orcSts = new ArrayList<>();
//		for(CustomORC_v25 orc: customObj.getOrc()) {
//			orcSts.add(setORC_ST_v25(orc));
//		}
//		return orcSts;
//	}
//	public static ORC_ST_v25 setORC_ST_v25(CustomORC_v25 orc) throws HL7Exception, IOException {
//		return new ORC_ST_v25.ORCBuilder(setEI_ST_v25(orc.getOrc_3_fillerOrderNumber()))
//				.orc_1_orderControl(orc.getOrc_1_orderControl())
//				.orc_2_placerOrderNumber(setEI_ST_v25(orc.getOrc_2_placerOrderNumber()))
//				.orc_4_placerGroupNumber(setEI_ST_v25(orc.getOrc_4_placerGroupNumber()))
//				.orc_5_orderStatus(orc.getOrc_5_orderStatus())
//				.orc_6_responseFlag(orc.getOrc_6_responseFlag())
//				.orc_7_quantityTiming(setTQ_ST_v25Array(orc.getOrc_7_quantityTiming()))
//				.orc_8_parentOrder(setEIP_ST_v25(orc.getOrc_8_parentOrder()))
//				.orc_9_dateTimeofTransaction(setTS_ST(orc.getOrc_9_dateTimeofTransaction()))
//				.orc_10_enteredBy(setXCN_ST_v25Array(orc.getOrc_10_enteredBy()))
//				.orc_11_verifiedBy(setXCN_ST_v25Array(orc.getOrc_11_verifiedBy()))
//				.orc_12_orderingProvider(setXCN_ST_v25Array(orc.getOrc_12_orderingProvider()))
//				.orc_13_enterersLocation(setPL_ST_v25(orc.getOrc_13_enterersLocation()))
//				.orc_14_callBackPhoneNumber(setXTN_ST_v25Array(orc.getOrc_14_callBackPhoneNumber()))
//				.orc_15_orderEffectiveDateTime(setTS_ST(orc.getOrc_15_orderEffectiveDateTime()))
//				.orc_16_orderControlCodeReason(setCE_ST(orc.getOrc_16_orderControlCodeReason()))
//				.orc_17_enteringOrganization(setCE_ST(orc.getOrc_17_enteringOrganization()))
//				.orc_18_enteringDevice(setCE_ST(orc.getOrc_18_enteringDevice()))
//				.orc_19_actionBy(setXCN_ST_v25Array(orc.getOrc_19_actionBy()))
//				.orc_20_advancedBeneficiaryNoticeCode(setCE_ST(orc.getOrc_20_advancedBeneficiaryNoticeCode()))
//				.orc_21_orderingFacilityName(setXON_ST_v25Array(orc.getOrc_21_orderingFacilityName()))
//				.orc_22_orderingFacilityAddress(setXAD_ST_v25Array(orc.getOrc_22_orderingFacilityAddress()))
//				.orc_23_orderingFacilityPhoneNumber(setXTN_ST_v25Array(orc.getOrc_23_orderingFacilityPhoneNumber()))
//				.orc_24_orderingProviderAddress(setXAD_ST_v25Array(orc.getOrc_24_orderingProviderAddress()))
//				.orc_25_orderStatusModifier(setCWE_ST_v25(orc.getOrc_25_orderStatusModifier()))
//				.orc_26_advancedBeneficiaryNoticeOverrideReason(setCWE_ST_v25(orc.getOrc_26_advancedBeneficiaryNoticeOverrideReason()))
//				.orc_27_fillersExpectedAvailabilityDateTime(setTS_ST(orc.getOrc_27_fillersExpectedAvailabilityDateTime()))
//				.orc_28_confidentialityCode(setCWE_ST_v25(orc.getOrc_28_confidentialityCode()))
//				.orc_29_orderType(setCWE_ST_v25(orc.getOrc_29_orderType()))
//				.orc_30_entererAuthorizationMode(setCNE_ST_v25(orc.getOrc_30_entererAuthorizationMode()))
//				.obr(setOBR_ST_v25(orc.getObr()))
//				.build();
//	}
//	public static OBR_ST_v25 setOBR_ST_v25(CustomOBR_v25 obr) throws HL7Exception, IOException {
//		return new OBR_ST_v25.OBRBuilder(
//				obr.getObr_1_setID(),
//				setEI_ST_v25(obr.getObr_3_fillerOrderNumber()),
//				setCE_ST(obr.getObr_4_universalServiceIdentifier()),
//				setTS_ST(obr.getObr_7_observationDateTime()),
//				setTS_ST(obr.getObr_22_resultsRptStatusChng()), 
//				obr.getObr_25_resultStatus(), 
//				setNDL_ST_v25Array(obr.getObr_34_technician()))
//				.obr_2_placerOrderNumber(setEI_ST_v25(obr.getObr_2_placerOrderNumber()))
//				.obr_5_priority(obr.getObr_5_priority())
//				.obr_6_requestedDateTime(setTS_ST(obr.getObr_6_requestedDateTime()))
//				.obr_8_observationEndDateTime(setTS_ST(obr.getObr_8_observationEndDateTime()))
//				.obr_9_collectionVolume(setCQ_ST_v25(obr.getObr_9_collectionVolume()))
//				.obr_10_collectorIdentifier(setXCN_ST_v25Array(obr.getObr_10_collectorIdentifier()))
//				.obr_11_specimenActionCode(obr.getObr_11_specimenActionCode())
//				.obr_12_dangerCode(setCE_ST(obr.getObr_12_dangerCode()))
//				.obr_13_relevantClinicalInformation(obr.getObr_13_relevantClinicalInformation())
//				.obr_14_specimenReceivedDateTime(setTS_ST(obr.getObr_14_specimenReceivedDateTime()))
//				.obr_15_specimenSource(setSPS_ST_v25(obr.getObr_15_specimenSource()))
//				.obr_16_orderingProvider(setXCN_ST_v25Array(obr.getObr_16_orderingProvider()))
//				.obr_17_orderCallbackPhoneNumber(setXTN_ST_v25Array(obr.getObr_17_orderCallbackPhoneNumber()))
//				.obr_18_placerField(obr.getObr_18_placerField())
//				.obr_19_placerField(obr.getObr_19_placerField())
//				.obr_20_fillerField(obr.getObr_20_fillerField())
//				.obr_21_fillerField(obr.getObr_21_fillerField())
//				.obr_23_chargetoPractice(setMOC_ST(obr.getObr_23_chargetoPractice()))
//				.obr_24_diagnosticServSectID(obr.getObr_24_diagnosticServSectID())
//				.obr_26_parentResult(setPRL_ST(obr.getObr_26_parentResult()))
//				.obr_27_quantityTiming(setTQ_ST_v25Array(obr.getObr_27_quantityTiming()))
//				.obr_28_resultCopiesTo(setXCN_ST_v25Array(obr.getObr_28_resultCopiesTo()))
//				.obr_29_parent(setEIP_ST_v25(obr.getObr_29_parent()))
//				.obr_30_transportationMode(obr.getObr_30_transportationMode())
//				.obr_31_reasonforStudy(setCE_STArray(obr.getObr_31_reasonforStudy()))
//				.obr_32_principalResultInterpreter(setNDL_ST_v25(obr.getObr_32_principalResultInterpreter()))
//				.obr_33_assistantResultInterpreter(setNDL_ST_v25Array(obr.getObr_33_assistantResultInterpreter()))
//				.obr_35_transcriptionist(setNDL_ST_v25Array(obr.getObr_35_transcriptionist()))
//				.obr_36_scheduledDateTime(setTS_ST(obr.getObr_36_scheduledDateTime()))
//				.obr_37_numberofSampleContainers(obr.getObr_37_numberofSampleContainers())
//				.obr_38_transportLogisticsofCollectedSample(setCE_STArray(obr.getObr_38_transportLogisticsofCollectedSample()))
//				.obr_39_collectorsComment(setCE_STArray(obr.getObr_39_collectorsComment()))
//				.obr_40_transportArrangementResponsibility(setCE_ST(obr.getObr_40_transportArrangementResponsibility()))
//				.obr_41_transportArranged(obr.getObr_41_transportArranged())
//				.obr_42_escortRequired(obr.getObr_42_escortRequired())
//				.obr_43_plannedPatientTransportComment(setCE_STArray(obr.getObr_43_plannedPatientTransportComment()))
//				.obr_44_procedureCode(setCE_ST(obr.getObr_44_procedureCode()))
//				.obr_45_procedureCodeModifier(setCE_STArray(obr.getObr_45_procedureCodeModifier()))
//				.obr_46_placerSupplementalServiceInformation(setCE_STArray(obr.getObr_46_placerSupplementalServiceInformation()))
//				.obr_47_fillerSupplementalServiceInformation(setCE_STArray(obr.getObr_47_fillerSupplementalServiceInformation()))
//				.obr_48_medicallyNecessaryDuplicateProcedureReason(setCWE_ST_v25(obr.getObr_48_medicallyNecessaryDuplicateProcedureReason()))
//				.obr_49_resultHandling(obr.getObr_49_resultHandling())
//				.nte(setNTEArray(obr.getNte()))
//				.obx(setOBX_ST_v25Array(obr.getObx()))
//				.build();
//	}
//
//	public static List<OBX_ST_v25> setOBX_ST_v25Array(List<CustomOBX_v25> obxs) throws HL7Exception, IOException {
//		List<OBX_ST_v25> obxSts = new ArrayList<>();
//		if(null!=obxs) {
//			for(CustomOBX_v25 obx: obxs) {
//				obxSts.add(setOBX_ST_v25(obx));
//			}
//		}
//		return obxSts;
//	}
//	public static OBX_ST_v25 setOBX_ST_v25(CustomOBX_v25 obx) throws HL7Exception {
//		// TODO Auto-generated method stub
//		return new OBX_ST_v25.OBXBuilder(
//				obx.getObx_1_setID(),
//				obx.getObx_2_valueType(),
//				setCE_ST(obx.getObx_3_observationIdentifier()),
//				setSTArray(obx.getObx_5_observationValue()),
//				setCE_ST(obx.getObx_6_units()), 
//				obx.getObx_7_referencesRange(), 
//				obx.getObx_11_observationResultStatus())
//				.obx_4_observationSubID(obx.getObx_4_observationSubID())
//				.obx_8_abnormalFlags(setSTArray(obx.getObx_8_abnormalFlags()))
//				.obx_9_probability(obx.getObx_9_probability())
//				.obx_10_natureofAbnormalTest(setSTArray(obx.getObx_10_natureofAbnormalTest()))
//				.obx_12_effectiveDateofReferenceRange(setTS_ST(obx.getObx_12_effectiveDateofReferenceRange()))
//				.obx_13_userDefinedAccessChecks(obx.getObx_13_userDefinedAccessChecks())
//				.obx_14_dateTimeoftheObservation(setTS_ST(obx.getObx_14_dateTimeoftheObservation()))
//				.obx_15_producersID(setCE_ST(obx.getObx_15_producersID()))
//				.obx_16_responsibleObserver(setXCN_ST_v25Array(obx.getObx_16_responsibleObserver()))
//				.obx_17_observationMethod(setCE_STArray(obx.getObx_17_observationMethod()))
//				.obx_18_equipmentInstanceIdentifier(setEIArray(obx.getObx_18_equipmentInstanceIdentifier()))
//				.obx_19_dateTimeoftheAnalysis(setTS_ST(obx.getObx_19_dateTimeoftheAnalysis()))
//				.nte(setNTEArray(obx.getNte()))
//				.build();
//	}
//	public static List<NTE_ST_v25> setNTEArray(List<CustomNTE_v25> ntes) {
//		List<NTE_ST_v25> nteSts = new ArrayList<>();
//		if(null!=ntes) {
//			for(CustomNTE_v25 nte: ntes) {
//				nteSts.add(setNTE_ST_v25(nte));
//			}
//		}
//		return nteSts;
//	}
//	public static NTE_ST_v25 setNTE_ST_v25(CustomNTE_v25 nte) {
//		// TODO Auto-generated method stub
//		return new NTE_ST_v25.NTEBuilder(nte.getNte_2_sourceofComment())
//				.nte_1_setID(nte.getNte_1_setID())
//				.nte_3_comment(setSTArray(nte.getNte_3_comment()))
//				.nte_4_commentType(setCE_ST(nte.getNte_4_commentType()))
//				.build();
//	}
//	public static PRL_ST setPRL_ST(PRL_v25 prl) {
//		// TODO Auto-generated method stub
//		return new PRL_ST(
//				setCE_ST(prl.getPrl_1_parentObservationIdentifier()),
//				prl.getPrl_2_parentObservationSubidentifier(),
//				prl.getPrl_3_parentObservationValueDescriptor());
//	}
//	public static MOC_ST setMOC_ST(MOC_v25 moc) {
//		return new MOC_ST(
//				setMO_ST(moc.getMoc_1_monetaryAmount()), 
//				setCE_ST(moc.getMoc_2_chargeCode()));
//	}
//	public static MO_ST setMO_ST(MO_v2 mo) {
//		// TODO Auto-generated method stub
//		return new MO_ST(
//				mo.getMo_1_quantity(),
//				mo.getMo_2_denomination());
//	}
//	public static SPS_ST_v25 setSPS_ST_v25(SPS_v25 sps) {
//		return new SPS_ST_v25(
//				setCWE_ST_v25(sps.getSps_1_specimenSourceNameOrCode()),
//				setCWE_ST_v25(sps.getSps_2_additives()),
//				sps.getSps_3_specimenCollectionMethod(),
//				setCWE_ST_v25(sps.getSps_4_bodySite()),
//				setCWE_ST_v25(sps.getSps_5_siteModifier()),
//				setCWE_ST_v25(sps.getSps_6_collectionMethodModifierCode()),
//				setCWE_ST_v25(sps.getSps_7_specimenRole()));
//	}
//	public static List<NDL_ST_v25> setNDL_ST_v25Array(NDL_v25[] ndls) {
//		List<NDL_ST_v25> ndlSts = new ArrayList<>();
//		for(NDL_v25 ndl:ndls) {
//			ndlSts.add(setNDL_ST_v25(ndl));
//		}
//		return ndlSts;
//	}
//	public static NDL_ST_v25 setNDL_ST_v25(NDL_v25 ndl) {
//		return new NDL_ST_v25(
//				setCNN_ST_v25(ndl.getNdl_1_name()),
//				setTS_ST(ndl.getNdl_2_startDateTime()), 
//				setTS_ST(ndl.getNdl_3_endDateTime()),
//				ndl.getNdl_4_pointOfCare(),
//				ndl.getNdl_5_room(),
//				ndl.getNdl_6_bed(), 
//				setHD_ST(ndl.getNdl_7_facility()),
//				ndl.getNdl_8_locationStatus(), 
//				ndl.getNdl_9_patientLocationType(),
//				ndl.getNdl_10_building(),
//				ndl.getNdl_11_floor());
//	}
//	public static CNN_ST_v25 setCNN_ST_v25(CNN_v25 cnn) {
//		
//		return new CNN_ST_v25(
//				cnn.getCnn_1_idNumber(),
//				cnn.getCnn_2_familyName(),
//				cnn.getCnn_3_givenName(), 
//				cnn.getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof(),
//				cnn.getCnn_5_suffix(), 
//				cnn.getCnn_6_prefix(), 
//				cnn.getCnn_7_degree(), 
//				cnn.getCnn_8_sourceTable(),
//				cnn.getCnn_9_assigningAuthorityNamespaceId(), 
//				cnn.getCnn_10_assigningAuthorityUniversalId(),
//				cnn.getCnn_11_assigningAuthorityUniversalIdType());
//	}
//	public static CNE_ST_v25 setCNE_ST_v25(CNE_v25 cne) {
//		// TODO Auto-generated method stub
//		return new CNE_ST_v25(
//				cne.getCne_1_identifier(),
//				cne.getCne_2_text(),
//				cne.getCne_3_nameOfCodingSystem(),
//				cne.getCne_4_alternateIdentifier(),
//				cne.getCne_5_alternateText(),
//				cne.getCne_6_nameOfAlternateCodingSystem(),
//				cne.getCne_7_codingSystemVersionId(),
//				cne.getCne_8_alternateCodingSystemVersionId(),
//				cne.getCne_9_originalText());
//	}
//	public static List<XON_ST_v25> setXON_ST_v25Array(XON_v25[] xons) {
//		// TODO Auto-generated method stub
//		List<XON_ST_v25> xonSts = new ArrayList<>();
//		if(null!=xons) {
//			for(XON_v25 xon:xons) {
//				xonSts.add(setXON_ST_v25(xon));
//			}
//		}
//		return xonSts;
//	}
//	public static XON_ST_v25 setXON_ST_v25(XON_v25 xon) {
//		// TODO Auto-generated method stub
//		return new XON_ST_v25(
//				xon.getXon_1_organizationName(),
//				xon.getXon_2_organizationNameTypeCode(),
//				xon.getXon_3_idNumber(),
//				xon.getXon_4_checkDigit(),
//				xon.getXon_5_checkDigitScheme(),
//				setHD_ST(xon.getXon_6_assigningAuthority()),
//				xon.getXon_7_identifierTypeCode(),
//				setHD_ST(xon.getXon_8_assigningFacility()),
//				xon.getXon_9_nameRepresentationCode(),
//				xon.getXon_10_organizationIdentifier());
//	}
//	public static PL_ST_v25 setPL_ST_v25(PL_v25 pl) {
//		// TODO Auto-generated method stub
//		return new PL_ST_v25(
//				pl.getPl_1_pointOfCare(),
//				pl.getPl_2_room(),
//				pl.getPl_3_bed(),
//				setHD_ST(pl.getPl_4_facility()),
//				pl.getPl_5_locationStatus(),
//				pl.getPl_6_personLocationType(),
//				pl.getPl_7_building(),
//				pl.getPl_8_floor(),
//				pl.getPl_9_locationDescription(),
//				setEI_ST_v25(pl.getPl_10_comprehensiveLocationIdentifier()),
//				setHD_ST(pl.getPl_11_assigningAuthorityForLocation()));
//	}
//	public static List<XCN_ST_v25> setXCN_ST_v25Array(XCN_v25[] xcns) {
//		List<XCN_ST_v25> xcnSts = new ArrayList<>();
//		if(null!=xcns) {
//			for(XCN_v25 xcn: xcns) {
//				xcnSts.add(setXCN_ST_v25(xcn));
//			}
//		}
//		return xcnSts;
//	}
//	public static XCN_ST_v25 setXCN_ST_v25(XCN_v25 xcn) {
//		// TODO Auto-generated method stub
//		return new XCN_ST_v25(
//				xcn.getXcn_1_idNumber(),
//				setFN_ST_v25(xcn.getXcn_2_familyName()),
//				xcn.getXcn_3_givenName(),
//				xcn.getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof(),
//				xcn.getXcn_5_suffixegJrOrIii(),
//				xcn.getXcn_6_prefixegDr(),
//				xcn.getXcn_7_degreeegMd(),
//				xcn.getXcn_8_sourceTable(),
//				setHD_ST(xcn.getXcn_9_assigningAuthority()),
//				xcn.getXcn_10_nameTypeCode(),
//				xcn.getXcn_11_identifierCheckDigit(),
//				xcn.getXcn_12_checkDigitScheme(),
//				xcn.getXcn_13_identifierTypeCode(),
//				setHD_ST(xcn.getXcn_14_assigningFacility()),
//				xcn.getXcn_15_nameRepresentationCode(),
//				setCE_ST(xcn.getXcn_16_nameContext()),
//				setDR_ST(xcn.getXcn_17_nameValidityRange()),
//				xcn.getXcn_18_nameAssemblyOrder(),
//				setTS_ST(xcn.getXcn_19_effectiveDate()),
//				setTS_ST(xcn.getXcn_20_expirationDate()),
//				xcn.getXcn_21_professionalSuffix(),
//				setCWE_ST_v25(xcn.getXcn_22_assigningJurisdiction()),
//				setCWE_ST_v25(xcn.getXcn_23_assigningAgencyOrDepartment()));
//	}
//	public static DR_ST setDR_ST(DR_v2 dr) {
//		// TODO Auto-generated method stub
//		return new DR_ST(
//				setTS_ST(dr.getTs_dr_1_rangeStartDateTime()),
//				setTS_ST(dr.getTs_dr_2_rangeEndDateTime()));
//	}
//	public static FN_ST_v25 setFN_ST_v25(FN_v25 fn) {
//		// TODO Auto-generated method stub
//		return new FN_ST_v25(
//				fn.getFn_1_surname(),
//				fn.getFn_2_ownSurnamePrefix(),
//				fn.getFn_3_ownSurname(),
//				fn.getFn_4_surnamePrefixFromPartnerSpouse(),
//				fn.getFn_5_surnameFromPartnerSpouse());
//	}
//	public static EIP_ST_v25 setEIP_ST_v25(EIP_v25 eip) {
//		// TODO Auto-generated method stub
//		return new EIP_ST_v25(
//				setEI_ST_v25(eip.getEip_1_placerAssignedIdentifier()),
//				setEI_ST_v25(eip.getEip_2_fillerAssignedIdentifier()));
//	}
//	public static List<TQ_ST_v25> setTQ_ST_v25Array(TQ_v25[] tqs) {
//		// TODO Auto-generated method stub
//		List<TQ_ST_v25> tqSts = new ArrayList<>();
//		for(TQ_v25 tq: tqs) {
//			tqSts.add(setTQ_ST_v25(tq));
//		}
//		return tqSts;
//	}
//	
//	public static TQ_ST_v25 setTQ_ST_v25(TQ_v25 tq) {
//		// TODO Auto-generated method stub
//		return new TQ_ST_v25(
//				setCQ_ST_v25(tq.getTq_1_quantity()),
//				setRI_ST(tq.getTq_2_interval()),
//				tq.getTq_3_duration(),
//				setTS_ST(tq.getTq_4_startDateTime()),
//				setTS_ST(tq.getTq_5_endDateTime()), 
//				tq.getTq_6_priority(), 
//				tq.getTq_7_condition(), 
//				tq.getTq_8_text(),
//				tq.getTq_9_conjunction(),
//				setOSD_ST(tq.getTq_10_orderSequencing()),
//				setCE_ST(tq.getTq_11_occurrenceDuration()),
//				tq.getTq_12_totalOccurrences());
//	}
//	public static OSD_ST setOSD_ST(OSD_V25 osd) {
//		// TODO Auto-generated method stub
//		return new OSD_ST(
//				osd.getOsd_1_sequenceResultsFlag(),
//				osd.getOsd_2_placerOrderNumber(),
//				osd.getOsd_3_placerOrderNumberNamespaceId(),
//				osd.getOsd_4_fillerOrderNumber(),
//				osd.getOsd_5_fillerOrderNumber(),
//				osd.getOsd_6_sequenceConditionValue(),
//				osd.getOsd_7_maximumNumberOfRepeats(),
//				osd.getOsd_8_placerOrderNumber(),
//				osd.getOsd_9_placerOrderNumber(),
//				osd.getOsd_10_fillerOrderNumberUniversalID(),
//				osd.getOsd_11_fillerOrderNumberUniversalIDType());
//	}
//	public static RI_ST setRI_ST(RI_v2 ri) {
//		// TODO Auto-generated method stub
//		return new RI_ST(
//				ri.getRi_1_repeatPattern(),
//				ri.getRi_2_explicitTimeInterval());
//	}
//	public static CQ_ST_v25 setCQ_ST_v25(CQ_v25 cq) {
//		// TODO Auto-generated method stub
//		return new CQ_ST_v25(
//				cq.getCq_1_quantity(),
//				setCE_ST(cq.getCq_2_units()));
//	}
//	public static PID_ST_v25 getPID_ST_v25(CustomORU_R01v25 custom) {
//		return new PID_ST_v25.PIDBuilder(
//				setCX_ST_v25Array(custom.getPid().getPid_3_patientIdentifierList()),
//				setXPN_ST_v25Array(custom.getPid().getPid_5_patientName()),
//				setTS_ST(custom.getPid().getPid_7_dateTimeofBirth()),
//				custom.getPid().getPid_8_administrativeSex())
//				.pid_1_setID(custom.getPid().getPid_1_setID())
//				.pid_2_patientID(setCX_ST_v25(custom.getPid().getPid_2_patientID()))
//				.pid_4_alternatePatientID(setCX_ST_v25Array(custom.getPid().getPid_4_alternatePatientID()))
//				.pid_6_mothersMaidenName(setXPN_ST_v25Array(custom.getPid().getPid_6_mothersMaidenName()))
//				.pid_9_patientAlias(setXPN_ST_v25Array(custom.getPid().getPid_9_patientAlias()))
//				.pid_10_race(setCE_STArray(custom.getPid().getPid_10_race()))
//				.pid_11_patientAddress(setXAD_ST_v25Array(custom.getPid().getPid_11_patientAddress()))
//				.pid_12_countyCode(custom.getPid().getPid_12_countyCode())
//				.pid_13_phoneNumberHome(setXTN_ST_v25Array(custom.getPid().getPid_13_phoneNumberHome()))
//				.pid_14_phoneNumberBusiness(setXTN_ST_v25Array(custom.getPid().getPid_14_phoneNumberBusiness()))
//				.pid_15_primaryLanguage(setCE_ST(custom.getPid().getPid_15_primaryLanguage()))
//				.pid_16_maritalStatus(setCE_ST(custom.getPid().getPid_16_maritalStatus()))
//				.pid_17_religion(setCE_ST(custom.getPid().getPid_17_religion()))
//				.pid_18_patientAccountNumber(setCX_ST_v25(custom.getPid().getPid_18_patientAccountNumber()))
//				.pid_19_ssn(custom.getPid().getPid_19_ssn())
//				.pid_20_driversLicenseNumber(setDLN_ST(custom.getPid().getPid_20_driversLicenseNumber()))
//				.pid_21_mothersIdentifier(setCX_ST_v25Array(custom.getPid().getPid_21_mothersIdentifier()))
//				.pid_22_ethnicGroup(setCE_STArray(custom.getPid().getPid_22_ethnicGroup()))
//				.pid_23_birthPlace(custom.getPid().getPid_23_birthPlace())
//				.pid_24_multipleBirthIndicator(custom.getPid().getPid_24_multipleBirthIndicator())
//				.pid_25_birthOrder(custom.getPid().getPid_25_birthOrder())
//				.pid_26_citizenship(setCE_STArray(custom.getPid().getPid_26_citizenship()))
//				.pid_27_veteransMilitaryStatus(setCE_ST(custom.getPid().getPid_27_veteransMilitaryStatus()))
//				.pid_28_nationality(setCE_ST(custom.getPid().getPid_28_nationality()))
//				.pid_29_patientDeathDateandTime(setTS_ST(custom.getPid().getPid_29_patientDeathDateandTime()))
//				.pid_30_patientDeathIndicator(custom.getPid().getPid_30_patientDeathIndicator())
//				.pid_31_identityUnknownIndicator(custom.getPid().getPid_31_identityUnknownIndicator())
//				.pid_32_identityReliabilityCode(setSTArray(custom.getPid().getPid_32_identityReliabilityCode()))
//				.pid_33_lastUpdateDateTime(setTS_ST(custom.getPid().getPid_33_lastUpdateDateTime()))
//				.pid_34_lastUpdateFacility(setHD_ST(custom.getPid().getPid_34_lastUpdateFacility()))
//				.pid_35_speciesCode(setCE_ST(custom.getPid().getPid_35_speciesCode()))
//				.pid_36_breedCode(setCE_ST(custom.getPid().getPid_36_breedCode()))
//				.pid_37_strain(custom.getPid().getPid_37_strain())
//				.pid_38_productionClassCode(setCE_ST(custom.getPid().getPid_38_productionClassCode()))
//				.pid_39_tribalCitizenship(setCWE_ST_v25Array(custom.getPid().getPid_39_tribalCitizenship()))
//				.build();
//	}
//	public static List<CWE_ST_v25> setCWE_ST_v25Array(CWE_v25[] cwes){
//		List<CWE_ST_v25> cweSts= new ArrayList<>();
//		for(CWE_v25 cwe: cwes) {
//			cweSts.add(setCWE_ST_v25(cwe));
//		}
//		return cweSts;
//	}
//	public static CWE_ST_v25 setCWE_ST_v25(CWE_v25 cwe) {
//		return new CWE_ST_v25(
//				cwe.getCwe_1_identifier(),
//				cwe.getCwe_2_text(),
//				cwe.getCwe_3_nameOfCodingSystem(),
//				cwe.getCwe_4_alternateIdentifier(),
//				cwe.getCwe_5_alternateText(),
//				cwe.getCwe_6_nameOfAlternateCodingSystem(),
//				cwe.getCwe_7_codingSystemVersionId(),
//				cwe.getCwe_8_alternateCodingSystemVersionId(),
//				cwe.getCwe_9_originalText());
//	}
//	public static DLN_ST setDLN_ST(DLN_v25 dln) {
//		return new DLN_ST(
//				dln.getDln_1_licenseNumber(),
//				dln.getDln_2_issuingStateProvinceCountry(),
//				dln.getDln_3_expirationDate());
//	}
//	public static List<XTN_ST_v25> setXTN_ST_v25Array(XTN_v25[] xtns) {
//		List<XTN_ST_v25> xtnSts = new ArrayList<>();
//		for(XTN_v25 xtn: xtns) {
//			xtnSts.add(setXTN_ST_v25(xtn));
//		}
//		return xtnSts;
//	}
//	public static XTN_ST_v25 setXTN_ST_v25(XTN_v25 xtn) {
//		return new XTN_ST_v25(
//				xtn.getXtn_1_telephoneNumber(),
//				xtn.getXtn_2_telecommunicationUseCode(),
//				xtn.getXtn_3_telecommunicationEquipmentType(),
//				xtn.getXtn_4_emailAddress(),
//				xtn.getXtn_5_countryCode(),
//				xtn.getXtn_6_areaCityCode(),
//				xtn.getXtn_7_localNumber(), 
//				xtn.getXtn_8_extension(), 
//				xtn.getXtn_9_anyText(), 
//				xtn.getXtn_10_extensionPrefix(),
//				xtn.getXtn_11_SpeedDialCode(), 
//				xtn.getXtn_12_unformattedTelephoneNumber());
//	}
//	public static List<XPN_ST_v25> setXPN_ST_v25Array(XPN_v25[] xpns){
//		List<XPN_ST_v25> xpnSts = new ArrayList<>();
//		if(null!=xpns) {
//			for(XPN_v25 xpn:xpns) {
//				xpnSts.add(setXPN_ST_v25(xpn));
//			}
//		}
//		return xpnSts;
//	}
//	public static List<XAD_ST_v25> setXAD_ST_v25Array(XAD_v25[] xads) {
//		List<XAD_ST_v25> xadSts = new ArrayList<>();
//		if(null!=xads) {
//			for(XAD_v25 xad: xads) {
//				xadSts.add(setXAD_ST_v25(xad));
//			}
//		}
//		return xadSts;
//	}
//	public static XAD_ST_v25 setXAD_ST_v25(XAD_v25 xad) {
//		return new XAD_ST_v25(
//				new SAD_ST_v25(
//						xad.getXad_1_streetAddress().getSad_1_streetOrMailingAddress(),
//						xad.getXad_1_streetAddress().getSad_2_streetName(),
//						xad.getXad_1_streetAddress().getSad_3_dwellingNumber()),
//				xad.getXad_2_otherDesignation(),
//				xad.getXad_3_city(),
//				xad.getXad_4_stateOrProvince(),
//				xad.getXad_5_zipOrPostalCode(),
//				xad.getXad_6_country(),
//				xad.getXad_7_addressType(),
//				xad.getXad_8_otherGeographicDesignation(),
//				xad.getXad_9_countyParishCode(),
//				xad.getXad_10_censusTract(),
//				xad.getXad_11_addressRepresentationCode(),
//				new DR_ST(
//						new TS_ST(
//								xad.getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time(),
//								xad.getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision()),
//						new TS_ST(
//								xad.getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time(),
//								xad.getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision())),
//				new TS_ST(
//						xad.getXad_13_effectiveDate().getTs_1_time(),
//						xad.getXad_13_effectiveDate().getTs_2_degreeOfPrecision()),
//				new TS_ST(
//						xad.getXad_14_expirationDate().getTs_1_time(), 
//						xad.getXad_14_expirationDate().getTs_2_degreeOfPrecision()));
//	}
//	public static XPN_ST_v25 setXPN_ST_v25(XPN_v25 xpn) {
//		return new XPN_ST_v25(
//				new FN_ST_v25(
//						xpn.getXpn_1_familyName().getFn_1_surname(), 
//						xpn.getXpn_1_familyName().getFn_2_ownSurnamePrefix(), 
//						xpn.getXpn_1_familyName().getFn_3_ownSurname(), 
//						xpn.getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse(), 
//						xpn.getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse()),
//				xpn.getXpn_2_givenName(),
//				xpn.getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof(),
//				xpn.getXpn_4_suffixEGJrOrIii(),
//				xpn.getXpn_5_prefixEGDr(), 
//				xpn.getXpn_6_degreeEGMd(),
//				xpn.getXpn_7_nameTypeCode(),
//				xpn.getXpn_8_nameRepresentationCode(),
//				new CE_ST(
//						xpn.getXpn_9_nameContext().getCe_1_identifier(),
//						xpn.getXpn_9_nameContext().getCe_2_text(),
//						xpn.getXpn_9_nameContext().getCe_3_nameOfCodingSystem(),
//						xpn.getXpn_9_nameContext().getCe_4_alternateIdentifier(), 
//						xpn.getXpn_9_nameContext().getCe_5_alternateText(), 
//						xpn.getXpn_9_nameContext().getCe_6_nameOfAlternateCodingSystem()),
//				new DR_ST(
//						new TS_ST(
//								xpn.getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time(),
//								xpn.getXpn_10_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision()),
//						new TS_ST(
//								xpn.getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time(),
//								xpn.getXpn_10_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision())),
//				xpn.getXpn_11_nameAssemblyOrder(),
//				new TS_ST(
//						xpn.getXpn_12_effectiveDate().getTs_1_time(),
//						xpn.getXpn_12_effectiveDate().getTs_2_degreeOfPrecision()),
//				new TS_ST(
//						xpn.getXpn_13_expirationDate().getTs_1_time(),
//						xpn.getXpn_13_expirationDate().getTs_2_degreeOfPrecision()),
//				xpn.getXpn_14_professionalSuffix());
//	}
//	public static CX_ST_v25 setCX_ST_v25(CX_v25 cx) {
//		return new CX_ST_v25(
//				cx.getCx_1_idNumber(),
//				cx.getCx_2_checkDigit(), 
//				cx.getCx_3_checkDigitScheme(), 
//				new HD_ST(
//						cx.getCx_4_assigningAuthority().getHd_1_namespaceId(),
//						cx.getCx_4_assigningAuthority().getHd_2_universalId(),
//						cx.getCx_4_assigningAuthority().getHd_3_universalIdType()),
//				cx.getCx_5_identifierTypeCode(), 
//				new HD_ST(
//						cx.getCx_6_assigningFacility().getHd_1_namespaceId(), 
//						cx.getCx_6_assigningFacility().getHd_2_universalId(),
//						cx.getCx_6_assigningFacility().getHd_3_universalIdType()), 
//				cx.getCx_7_effectiveDate(), 
//				cx.getCx_8_expirationDate(), 
//				new CWE_ST_v25(
//						cx.getCx_9_assigningJurisdiction().getCwe_1_identifier(),
//						cx.getCx_9_assigningJurisdiction().getCwe_2_text(),
//						cx.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem(),
//						cx.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier(),
//						cx.getCx_9_assigningJurisdiction().getCwe_5_alternateText(),
//						cx.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem(),
//						cx.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId(),
//						cx.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId(),
//						cx.getCx_9_assigningJurisdiction().getCwe_9_originalText()), 
//				new CWE_ST_v25(
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_2_text(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId(),
//						cx.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText()));
//	}
//	public static List<CX_ST_v25> setCX_ST_v25Array(CX_v25[] cxs){
//		List<CX_ST_v25> cxSt = new ArrayList<>();
//		if(null!=cxs) {
//			for(CX_v25 cx: cxs) {
//				cxSt.add(setCX_ST_v25(cx));
//			}
//		}
//		return cxSt;
//
//	}
//	@SuppressWarnings("unused")
//	public static MSH_ST_v25 getMSH_v25(CustomORU_R01v25 custom) {
//		
//		
//		
//		MSH_ST_v25 msh = new MSH_ST_v25.MSHBuilder(
//				custom.getMsh().getMsh_1_fieldSeparator(),
//				custom.getMsh().getMsh_2_encodingCharacters(),
//				setHD_ST(custom.getMsh().getMsh_3_sendingApplication()),
//				setHD_ST(custom.getMsh().getMsh_4_sendingFacility()),
//				setHD_ST(custom.getMsh().getMsh_5_receivingApplication()),
//				setHD_ST(custom.getMsh().getMsh_6_receivingFacility()),
//				setTS_ST(custom.getMsh().getMsh_7_dateTimeOfMessage()),
//				setMSG_ST_v25(custom.getMsh().getMsh_9_messageType()),
//				custom.getMsh().getMsh_10_messageControlID(),
//				setPT_ST(custom.getMsh().getMsh_11_processingID()),
//				new VID_ST_v25(
//						custom.getMsh().getMsh_12_versionID().getVid_1_versionId(),
//						setCE_ST(custom.getMsh().getMsh_12_versionID().getVid_2_ce_internationalizationCode()),
//						setCE_ST(custom.getMsh().getMsh_12_versionID().getVid_3_ce_internationalVersionId()),
//						null),
//				custom.getMsh().getMsh_15_acceptAcknowledgmentType(),
//				custom.getMsh().getMsh_16_applicationAcknowledgmentType())
//				.setMsh_17_countryCode(custom.getMsh().getMsh_17_countryCode())
//				.setMsh_18_characterSet(setSTArray(custom.getMsh().getMsh_18_characterSet()))
//				.setMsh_19_principalLanguageOfMessage(setCE_ST(custom.getMsh().getMsh_19_principalLanguageOfMessage()))
//				.setMsh_20_alternateCharacterSetHandlingScheme(custom.getMsh().getMsh_20_alternateCharacterSetHandlingScheme())
//				.setMsh_21_messageProfileIdentifier(setEIArray(custom.getMsh().getMsh_21_messageProfileIdentifier()))
//				.build();
//		return msh;
//	}
//	public static String getPdfBase64(CustomORU_R01v25 st) throws HL7Exception {
//		String pdf = "";
//		
//		if(null!=st) {
//			for(CustomORC_v25 orc: st.getOrc()) {
//				for(CustomOBX_v25 obx: orc.getObr().getObx()) {
//					for(String charSet: obx.getObx_5_observationValue()) {
//						System.out.println(charSet);
//						if(charSet.contains("^AP^PDF^Base64^")){
//							pdf+=charSet.substring("^AP^PDF^Base64^".length());
//						}
//					}
//				}
//			}
//		}
//		return pdf;
//	}
//	
//	
//	public static List<ST> setSTArray(String[] st){
//		String stPdf = "^AP^PDF^Base64^";
//		List<ST> characterSets = new ArrayList<>();
//		if(null!=st) {
//			for(String charSet :st) {
//				if(charSet.contains(stPdf)){
//					characterSets.add(new ST(charSet.getBytes()));
//				}else {
//					characterSets.add(new ST(charSet));
//				}
//				
//			}
//		}
//		
//		return characterSets;
//	}
//	public static List<EI_ST_v25> setEIArray(EI_v2[] st){
//		List<EI_ST_v25> ei = new ArrayList<>();
//		if(null!=st) {
//			for(EI_v2 charSet :st) {
//				ei.add(new EI_ST_v25(
//						charSet.getEi_1_entityIdentifier(),
//						charSet.getEi_2_namespaceId(),
//						charSet.getEi_3_universalId(),
//						charSet.getEi_4_universalIdType()));
//			}
//		}
//		return ei;
//	}
//	
//	public static EI_ST_v25 setEI_ST_v25(EI_v2 ei) {
//		return new EI_ST_v25(
//				ei.getEi_1_entityIdentifier(),
//				ei.getEi_2_namespaceId(), 
//				ei.getEi_3_universalId(),
//				ei.getEi_4_universalIdType());
//	}
//	public static List<CE_ST> setCE_STArray(CE_v2[] ces){
//		List<CE_ST> ceSts = new ArrayList<>();
//		if(null!=ces) {
//			for(CE_v2 ce: ces) {
//				ceSts.add(setCE_ST(ce));
//			}
//		}
//		return ceSts;
//	}
//	public static CE_ST setCE_ST(CE_v2 ce) {
//		return new CE_ST(
//				ce.getCe_1_identifier(),
//				ce.getCe_2_text(),
//				ce.getCe_3_nameOfCodingSystem(),
//				ce.getCe_4_alternateIdentifier(),
//				ce.getCe_5_alternateText(),
//				ce.getCe_6_nameOfAlternateCodingSystem());
//	}
//
//	public static PT_ST setPT_ST(PT_v2 ptv25) {
//		PT_ST pt= new PT_ST(
//				ptv25.getPt_1_processingId(),
//				ptv25.getPt_2_processingMode());
//		return pt;
//	}
//
//	public static MSG_ST_v25 setMSG_ST_v25(MSG_v25 msg) {
//		MSG_ST_v25 messType = new MSG_ST_v25(
//				msg.getMsg_1_messageCode(),
//				msg.getMsg_2_triggerEvent(),
//				msg.getMsg_3_messageStructure());
//		return messType;
//	}
//
//	public static TS_ST setTS_ST(TS_v2 time) {
//		TS_ST date = new TS_ST(
//				time.getTs_1_time(),
//				time.getTs_2_degreeOfPrecision());
//		return date;
//	}
//	
//	
//	
//	public static MSH_ST_v23 getMSH_ORM_v23(CustomORM_O01v23 custom) {
//		HD_ST sendingFac = setHD_ST(custom.getMsh().getHd_msh_4_sendingFacility());
//		HD_ST receivingFa = setHD_ST(custom.getMsh().getHd_msh_6_receivingFacility());
//		TS_ST date = new TS_ST(
//				custom.getMsh().getTs_msh_7_dateTimeOfMessage().getTs_1_time(),
//				custom.getMsh().getTs_msh_7_dateTimeOfMessage().getTs_2_degreeOfPrecision());
//		CM_MSG_ST messType = new CM_MSG_ST(
//				custom.getMsh().getCm_msh_9_messageType().getCm_msg_1_messageType(),
//				custom.getMsh().getCm_msh_9_messageType().getCm_msg_2_triggerEvent(),
//				null);
//		PT_ST pt= new PT_ST(
//				custom.getMsh().getPt_msh_11_processingId().getPt_1_processingId(),
//				custom.getMsh().getPt_msh_11_processingId().getPt_2_processingMode());
//		return new MSH_ST_v23.MSHBuilder(
//				custom.getMsh().getMsh_1_fieldSeparator(),
//				custom.getMsh().getMsh_2_encodingCharacters(),
//				sendingFac,
//				receivingFa,
//				date,
//				custom.getMsh().getMsh_8_security(),
//				messType,
//				custom.getMsh().getMsh_10_messageControlId(),
//				pt,
//				custom.getMsh().getMsh_12_versionId())
//				.msh_3_sendingApplication(setHD_ST(custom.getMsh().getHd_msh_3_sendingApplication()))
//				.msh_5_receivingApplication(setHD_ST(custom.getMsh().getHd_msh_5_receivingApplication()))
//				.msh_13_sequenceNumber(custom.getMsh().getMsh_13_sequenceNumber())
//				.msh_14_continuationPointer(custom.getMsh().getMsh_14_continuationPointer())
//				.msh_15_acceptAcknowledgmentType(custom.getMsh().getMsh_15_acceptAcknowledgementType())
//				.msh_16_applicationAcknowledgmentType(custom.getMsh().getMsh_16_applicationAcknowledgementType())
//				.msh_17_countryCode(custom.getMsh().getMsh_17_countryCode())
////				.msh_18_characterSet()
//				.msh_19_principalLanguageOfMessage(new CE_ST(
//						custom.getMsh().getCe_msh_19_principalLanguageOfMessage().getCe_1_identifier(),
//						custom.getMsh().getCe_msh_19_principalLanguageOfMessage().getCe_2_text(),
//						custom.getMsh().getCe_msh_19_principalLanguageOfMessage().getCe_3_nameOfCodingSystem(),
//						custom.getMsh().getCe_msh_19_principalLanguageOfMessage().getCe_4_alternateIdentifier(),
//						custom.getMsh().getCe_msh_19_principalLanguageOfMessage().getCe_5_alternateText(),
//						custom.getMsh().getCe_msh_19_principalLanguageOfMessage().getCe_6_nameOfAlternateCodingSystem()))
//				.build();
//	}
//
//	public static HD_ST setHD_ST(HD_v2 custom) {
//		HD_ST sendingFac = new HD_ST(
//				custom.getHd_1_namespaceId(),
//				custom.getHd_2_universalId(),
//				custom.getHd_3_universalIdType());
//		return sendingFac;
//	}
//
//	public static Message getMessage(String lineC) throws IOException {
//		try(HapiContext context = new DefaultHapiContext();) {
//			lineC = lineC.replaceAll("\n", "\r");	
//			context.getExecutorService();
//			Parser parser = context.getGenericParser();
//			context.getParserConfiguration().setValidating(false);
//			return parser.parse(lineC);	
//		}catch(HL7Exception ex) {
//			ex.printStackTrace();
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		return null;
//	}
//	public static void setHD(HD hd,HD_ST hdST ) throws DataTypeException {
//		hd.getHd1_NamespaceID().setValue(hdST.getHd_1_namespaceId());
//		hd.getHd2_UniversalID().setValue(hdST.getHd_2_universalId());
//		hd.getHd3_UniversalIDType().setValue(hdST.getHd_3_universalIdType());
//	}
//	public static void setTS(TS ts, TS_ST tsSt) throws DataTypeException {
//		ts.getTs1_Time().setValue(tsSt.getTs_1_time());
//		ts.getTs2_DegreeOfPrecision().setValue(tsSt.getTs_2_degreeOfPrecision());
//	}
//	public static void setMSG(MSG msg, MSG_ST_v25 msgSt) throws DataTypeException {
//		msg.getMsg1_MessageCode().setValue(msgSt.getMsg_1_messageCode());
//		msg.getMsg2_TriggerEvent().setValue(msgSt.getMsg_2_triggerEvent());
//		msg.getMsg3_MessageStructure().setValue(msgSt.getMsg_3_messageStructure());
//	}
//	public static void setPT(PT pt, PT_ST ptSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		pt.getPt1_ProcessingID().setValue(ptSt.getPt_1_processingId());
//		pt.getPt2_ProcessingMode().setValue(ptSt.getPt_2_processingMode());
//	}
//	public static void setVID(VID vid, VID_ST_v25 vidSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		vid.getVid1_VersionID().setValue(vidSt.getVid_1_versionId());
//		setCE(vid.getVid2_InternationalizationCode(), vidSt.getVid_2_ce_internationalizationCode());
//		setCE(vid.getVid3_InternationalVersionID(), vidSt.getVid_3_ce_internationalVersionId());
//	}
//	public static void setCE(CE ce, CE_ST ceSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		if(null!=ceSt) {
//			ce.getCe1_Identifier().setValue(ceSt.getCe_1_identifier());
//			ce.getCe2_Text().setValue(ceSt.getCe_2_text());
//			ce.getCe3_NameOfCodingSystem().setValue(ceSt.getCe_3_nameOfCodingSystem());
//			ce.getCe4_AlternateIdentifier().setValue(ceSt.getCe_4_alternateIdentifier());
//			ce.getCe5_AlternateText().setValue(ceSt.getCe_5_alternateText());
//			ce.getCe6_NameOfAlternateCodingSystem().setValue(ceSt.getCe_6_nameOfAlternateCodingSystem());
//		}
//	}
//	public static void setID(ID[] ids, List<ST> sts) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i = 0; i<sts.size();i++) {
//			ids[i].setValue(sts.get(i).getSt_1());
//		}
//	}
//	public static void setEIArray(EI[] eis, List<EI_ST_v25> eiSts) throws DataTypeException {
//		// TODO Auto-generated method stub
//		for(int i=0 ; i<eiSts.size();i++) {
//			setEI(eis[i],eiSts.get(i));
//		}
//	}
//	public static void setEI(EI ei, EI_ST_v25 eiSt) throws DataTypeException {
//		ei.getEi1_EntityIdentifier().setValue(eiSt.getEi_1_entityIdentifier());
//		ei.getEi2_NamespaceID().setValue(eiSt.getEi_2_namespaceId());
//		ei.getEi3_UniversalID().setValue(eiSt.getEi_3_universalId());
//		ei.getEi4_UniversalIDType().setValue(eiSt.getEi_4_universalIdType());
//	}
//	public static void setCX(CX cx, CX_ST_v25 cxSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//			cx.getCx1_IDNumber().setValue(cxSt.getCx_1_idNumber());
//			cx.getCx2_CheckDigit().setValue(cxSt.getCx_2_checkDigit());
//			cx.getCx3_CheckDigitScheme().setValue(cxSt.getCx_3_checkDigitScheme());
//			setHD(cx.getCx4_AssigningAuthority(), cxSt.getCx_4_assigningAuthority());
//			cx.getCx5_IdentifierTypeCode().setValue(cxSt.getCx_5_identifierTypeCode());
//			setHD(cx.getCx6_AssigningFacility(), cxSt.getCx_6_assigningFacility());
//			cx.getCx7_EffectiveDate().setValue(cxSt.getCx_7_effectiveDate());
//			cx.getCx8_ExpirationDate().setValue(cxSt.getCx_8_expirationDate());
//			setCWE(cx.getCx10_AssigningAgencyOrDepartment(), cxSt.getCx_10_assigningAgencyOrDepartment());
//	}
//	public static void setCWE(CWE cwe, CWE_ST_v25 cweSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		cwe.getCwe1_Identifier().setValue(cweSt.getCwe_1_identifier());
//		cwe.getCwe2_Text().setValue(cweSt.getCwe_1_identifier());
//		cwe.getCwe3_NameOfCodingSystem().setValue(cweSt.getCwe_3_nameOfCodingSystem());
//		cwe.getCwe4_AlternateIdentifier().setValue(cweSt.getCwe_4_alternateIdentifier());
//		cwe.getCwe5_AlternateText().setValue(cweSt.getCwe_5_alternateText());
//		cwe.getCwe6_NameOfAlternateCodingSystem().setValue(cweSt.getCwe_6_nameOfAlternateCodingSystem());
//		cwe.getCwe7_CodingSystemVersionID().setValue(cweSt.getCwe_7_codingSystemVersionId());
//		cwe.getCwe8_AlternateCodingSystemVersionID().setValue(cweSt.getCwe_8_alternateCodingSystemVersionId());
//		cwe.getCwe9_OriginalText().setValue(cweSt.getCwe_9_originalText());
//		
//	}
//	public static void setXPN(XPN xpn, XPN_ST_v25 xpn_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		xpn.getXpn1_FamilyName().getFn1_Surname().setValue(xpn_ST_v25.getXpn_1_familyName().getFn_1_surname());
//		xpn.getXpn1_FamilyName().getFn2_OwnSurnamePrefix().setValue(xpn_ST_v25.getXpn_1_familyName().getFn_2_ownSurnamePrefix());
//		xpn.getXpn1_FamilyName().getFn3_OwnSurname().setValue(xpn_ST_v25.getXpn_1_familyName().getFn_3_ownSurname());
//		xpn.getXpn1_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(xpn_ST_v25.getXpn_1_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
//		xpn.getXpn1_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(xpn_ST_v25.getXpn_1_familyName().getFn_5_surnameFromPartnerSpouse());
//		xpn.getXpn2_GivenName().setValue(xpn_ST_v25.getXpn_2_givenName());
//		xpn.getXpn3_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(xpn_ST_v25.getXpn_3_secondAndFurtherGivenNamesOrInitialsThereof());
//		xpn.getXpn4_SuffixEgJRorIII().setValue(xpn_ST_v25.getXpn_4_suffixEGJrOrIii());
//		xpn.getXpn5_PrefixEgDR().setValue(xpn_ST_v25.getXpn_5_prefixEGDr());
//		xpn.getXpn6_DegreeEgMD().setValue(xpn_ST_v25.getXpn_6_degreeEGMd());
//		xpn.getXpn7_NameTypeCode().setValue(xpn_ST_v25.getXpn_7_nameTypeCode());
//		xpn.getXpn8_NameRepresentationCode().setValue(xpn_ST_v25.getXpn_8_nameRepresentationCode());
//		setCE(xpn.getXpn9_NameContext(), xpn_ST_v25.getXpn_9_nameContext());
//		setDR(xpn.getXpn10_NameValidityRange(), xpn_ST_v25.getXpn_10_nameValidityRange());
//		xpn.getXpn11_NameAssemblyOrder().setValue(xpn_ST_v25.getXpn_11_nameAssemblyOrder());
//		setTS(xpn.getXpn12_EffectiveDate(), xpn_ST_v25.getXpn_12_effectiveDate());
//		setTS(xpn.getXpn13_ExpirationDate(), xpn_ST_v25.getXpn_13_expirationDate());
//		xpn.getXpn14_ProfessionalSuffix().setValue(xpn_ST_v25.getXpn_14_professionalSuffix());		
//	}
//	public static void setDR(DR dr, DR_ST drSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setTS(dr.getDr1_RangeStartDateTime(), drSt.getDr_1_RangeStartDateTime());
//		setTS(dr.getDr2_RangeEndDateTime(), drSt.getDr_2_rangeEndDateTime());
//	}
//	public static void setXAD(XAD xad, XAD_ST_v25 xad_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		xad.getXad1_StreetAddress().getSad1_StreetOrMailingAddress().setValue(xad_ST_v25.getXad_1_streetAddress().getSad_1_streetOrMailingAddress());
//		xad.getXad1_StreetAddress().getSad2_StreetName().setValue(xad_ST_v25.getXad_1_streetAddress().getSad_2_streetName());
//		xad.getXad1_StreetAddress().getSad3_DwellingNumber().setValue(xad_ST_v25.getXad_1_streetAddress().getSad_3_dwellingNumber());
//		xad.getXad2_OtherDesignation().setValue(xad_ST_v25.getXad_2_otherDesignation());
//		xad.getXad3_City().setValue(xad_ST_v25.getXad_3_city());
//		xad.getXad4_StateOrProvince().setValue(xad_ST_v25.getXad_4_stateOrProvince());
//		xad.getXad5_ZipOrPostalCode().setValue(xad_ST_v25.getXad_5_zipOrPostalCode());
//		xad.getXad6_Country().setValue(xad_ST_v25.getXad_6_country());
//		xad.getXad7_AddressType().setValue(xad_ST_v25.getXad_7_addressType());
//		xad.getXad8_OtherGeographicDesignation().setValue(xad_ST_v25.getXad_8_otherGeographicDesignation());
//		xad.getXad9_CountyParishCode().setValue(xad_ST_v25.getXad_9_countyParishCode());
//		xad.getXad10_CensusTract().setValue(xad_ST_v25.getXad_10_censusTract());
//		xad.getXad11_AddressRepresentationCode().setValue(xad_ST_v25.getXad_11_addressRepresentationCode());
//		setDR(xad.getXad12_AddressValidityRange(), xad_ST_v25.getXad_12_addressValidityRange());
//		setTS(xad.getXad13_EffectiveDate(), xad_ST_v25.getXad_13_effectiveDate());
//		setTS(xad.getXad14_ExpirationDate(), xad_ST_v25.getXad_14_expirationDate());
//	}
//	public static void setXTN(XTN xtn, XTN_ST_v25 xtn_ST_v25) throws DataTypeException {
//		// TODO Auto-generated method stub
//		xtn.getXtn1_TelephoneNumber().setValue(xtn_ST_v25.getXtn_1_telephoneNumber());
//		xtn.getXtn2_TelecommunicationUseCode().setValue(xtn_ST_v25.getXtn_2_telecommunicationUseCode());
//		xtn.getXtn3_TelecommunicationEquipmentType().setValue(xtn_ST_v25.getXtn_3_telecommunicationEquipmentType());
//		xtn.getXtn4_EmailAddress().setValue(xtn_ST_v25.getXtn_4_emailAddress());
//		xtn.getXtn5_CountryCode().setValue(xtn_ST_v25.getXtn_5_countryCode());
//		xtn.getXtn6_AreaCityCode().setValue(xtn_ST_v25.getXtn_6_areaCityCode());
//		xtn.getXtn7_LocalNumber().setValue(xtn_ST_v25.getXtn_7_localNumber());
//		xtn.getXtn8_Extension().setValue(xtn_ST_v25.getXtn_8_extension());
//		xtn.getXtn9_AnyText().setValue(xtn_ST_v25.getXtn_9_anyText());
//		xtn.getXtn10_ExtensionPrefix().setValue(xtn_ST_v25.getXtn_10_extensionPrefix());
//		xtn.getXtn11_SpeedDialCode().setValue(xtn_ST_v25.getXtn_11_SpeedDialCode());
//		xtn.getXtn12_UnformattedTelephoneNumber().setValue(xtn_ST_v25.getXtn_12_unformattedTelephoneNumber());
//	}
//	public static void setDLN(DLN dln, DLN_ST dln_st) throws DataTypeException {
//		// TODO Auto-generated method stub
//		dln.getDln1_LicenseNumber().setValue(dln_st.getDln_1_licenseNumber());
//		dln.getDln2_IssuingStateProvinceCountry().setValue(dln_st.getDln_2_issuingStateProvinceCountry());
//		dln.getDln3_ExpirationDate().setValue(dln_st.getDln_3_expirationDate());
//	}
//	public static <T>void setST(T t, ST st) throws HL7Exception {
//		// TODO Auto-generated method stub
//		if(t instanceof IS)	((IS) t).setValue(st.getSt_1());
//		if(t instanceof FT) ((FT) t).setValue(st.getSt_1());
//		if(t instanceof Varies) {
//			if(null!=st.getSt_2()) {
//				((Varies) t).parse(new String(st.getSt_2()));
//			}else ((Varies) t).parse(st.getSt_1());
//		}
//	}
//	public static void setTQ(TQ tq, TQ_ST_v25 tqSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setCQ(tq.getTq1_Quantity(), tqSt.getTq_1_quantity());
//		setRI(tq.getTq2_Interval(), tqSt.getTq_2_interval());
//		tq.getTq3_Duration().setValue(tqSt.getTq_3_duration());
//		setTS(tq.getTq4_StartDateTime(), tqSt.getTq_4_startDateTime());
//		setTS(tq.getTq5_EndDateTime(), tqSt.getTq_5_endDateTime());
//		tq.getTq6_Priority().setValue(tqSt.getTq_6_priority());
//		tq.getTq7_Condition().setValue(tqSt.getTq_7_condition());
//		tq.getTq8_Text().setValue(tqSt.getTq_8_text());
//		tq.getTq9_Conjunction().setValue(tqSt.getTq_9_conjunction());
//		setOSD(tq.getTq10_OrderSequencing(), tqSt.getTq_10_orderSequencing());
//		setCE(tq.getTq11_OccurrenceDuration(), tqSt.getTq_11_occurrenceDuration());
//		tq.getTq12_TotalOccurrences().setValue(tqSt.getTq_12_totalOccurrences());
//	}
//	public static void setOSD(OSD osd, OSD_ST osdSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		osd.getOsd1_SequenceResultsFlag().setValue(osdSt.getOsd_1_sequenceResultsFlag());
//		osd.getOsd2_PlacerOrderNumberEntityIdentifier().setValue(osdSt.getOsd_2_placerOrderNumber());
//		osd.getOsd3_PlacerOrderNumberNamespaceID().setValue(osdSt.getOsd_3_placerOrderNumberNamespaceId());
//		osd.getOsd4_FillerOrderNumberEntityIdentifier().setValue(osdSt.getOsd_4_fillerOrderNumber());
//		osd.getOsd5_FillerOrderNumberNamespaceID().setValue(osdSt.getOsd_5_fillerOrderNumber());
//		osd.getOsd6_SequenceConditionValue().setValue(osdSt.getOsd_6_sequenceConditionValue());
//		osd.getOsd7_MaximumNumberOfRepeats().setValue(osdSt.getOsd_7_maximumNumberOfRepeats());
//		osd.getOsd8_PlacerOrderNumberUniversalID().setValue(osdSt.getOsd_8_placerOrderNumber());
//		osd.getOsd9_PlacerOrderNumberUniversalIDType().setValue(osdSt.getOsd_9_placerOrderNumber());
//		osd.getOsd10_FillerOrderNumberUniversalID().setValue(osdSt.getOsd_10_fillerOrderNumberUniversalID());
//		osd.getOsd11_FillerOrderNumberUniversalIDType().setValue(osdSt.getOsd_11_fillerOrderNumberUniversalIDType());
//	}
//	public static void setRI(RI ri, RI_ST riSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		ri.getRi1_RepeatPattern().setValue(riSt.getRi_1_repeatPattern());
//		ri.getRi2_ExplicitTimeInterval().setValue(riSt.getRi_2_explicitTimeInterval());
//	}
//	public static void setCQ(CQ cq, CQ_ST_v25 cqSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		cq.getCq1_Quantity().setValue(cqSt.getCq_1_quantity());
//		setCE(cq.getCq2_Units(), cqSt.getCq_2_units());
//	}
//	public static void setEIP(EIP eip, EIP_ST_v25 eipSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setEI(eip.getEip1_PlacerAssignedIdentifier(), eipSt.getEip_1_placerAssignedIdentifier());
//		setEI(eip.getEip2_FillerAssignedIdentifier(), eipSt.getEip_2_fillerAssignedIdentifier());		
//	}
//	public static void setXCN(XCN xcn, XCN_ST_v25 xcnSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		xcn.getXcn1_IDNumber().setValue(xcnSt.getXcn_1_idNumber());
//		setFN(xcn.getXcn2_FamilyName(), xcnSt.getXcn_2_familyName());
//		xcn.getXcn3_GivenName().setValue(xcnSt.getXcn_3_givenName());
//		xcn.getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(xcnSt.getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
//		xcn.getXcn5_SuffixEgJRorIII().setValue(xcnSt.getXcn_5_suffixegJrOrIii());
//		xcn.getXcn6_PrefixEgDR().setValue(xcnSt.getXcn_6_prefixegDr());
//		xcn.getXcn7_DegreeEgMD().setValue(xcnSt.getXcn_7_degreeegMd());
//		xcn.getXcn8_SourceTable().setValue(xcnSt.getXcn_8_sourceTable());
//		setHD(xcn.getXcn9_AssigningAuthority(), xcnSt.getXcn_9_assigningAuthority());
//		xcn.getXcn10_NameTypeCode().setValue(xcnSt.getXcn_10_nameTypeCode());
//		xcn.getXcn11_IdentifierCheckDigit().setValue(xcnSt.getXcn_11_identifierCheckDigit());
//		xcn.getXcn12_CheckDigitScheme().setValue(xcnSt.getXcn_12_checkDigitScheme());
//		xcn.getXcn13_IdentifierTypeCode().setValue(xcnSt.getXcn_13_identifierTypeCode());
//		setHD(xcn.getXcn14_AssigningFacility(), xcnSt.getXcn_14_assigningFacility());
//		xcn.getXcn15_NameRepresentationCode().setValue(xcnSt.getXcn_15_nameRepresentationCode());
//		setCE(xcn.getXcn16_NameContext(), xcnSt.getXcn_16_nameContext());
//		setDR(xcn.getXcn17_NameValidityRange(), xcnSt.getXcn_17_nameValidityRange());
//		xcn.getXcn18_NameAssemblyOrder().setValue(xcnSt.getXcn_18_nameAssemblyOrder());
//		setTS(xcn.getXcn19_EffectiveDate(), xcnSt.getXcn_19_effectiveDate());
//		setTS(xcn.getXcn20_ExpirationDate(), xcnSt.getXcn_20_expirationDate());
//		xcn.getXcn21_ProfessionalSuffix().setValue(xcnSt.getXcn_21_professionalSuffix());
//		setCWE(xcn.getXcn22_AssigningJurisdiction(), xcnSt.getXcn_22_assigningJurisdiction());
//		setCWE(xcn.getXcn23_AssigningAgencyOrDepartment(), xcnSt.getXcn_23_assigningAgencyOrDepartment());
//		
//	}
//	public static void setFN(FN fn, FN_ST_v25 fnSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		fn.getFn1_Surname().setValue(fnSt.getFn_1_surname());
//		fn.getFn2_OwnSurnamePrefix().setValue(fnSt.getFn_2_ownSurnamePrefix());
//		fn.getFn3_OwnSurname().setValue(fnSt.getFn_3_ownSurname());
//		fn.getFn4_SurnamePrefixFromPartnerSpouse().setValue(fnSt.getFn_4_surnamePrefixFromPartnerSpouse());
//		fn.getFn5_SurnameFromPartnerSpouse().setValue(fnSt.getFn_5_surnameFromPartnerSpouse());
//	}
//	public static void setPL(PL pl, PL_ST_v25 plSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		pl.getPl1_PointOfCare().setValue(plSt.getPl_1_pointOfCare());
//		pl.getPl2_Room().setValue(plSt.getPl_2_room());
//		pl.getPl3_Bed().setValue(plSt.getPl_3_bed());
//		setHD(pl.getPl4_Facility(),plSt.getPl_4_facility());
//		pl.getPl5_LocationStatus().setValue(plSt.getPl_5_locationStatus());
//		pl.getPl6_PersonLocationType().setValue(plSt.getPl_6_personLocationType());
//		pl.getPl7_Building().setValue(plSt.getPl_7_building());
//		pl.getPl8_Floor().setValue(plSt.getPl_9_locationDescription());
//		pl.getPl9_LocationDescription().setValue(plSt.getPl_9_locationDescription());
//		setEI(pl.getPl10_ComprehensiveLocationIdentifier(), plSt.getPl_10_comprehensiveLocationIdentifier());
//		setHD(pl.getPl11_AssigningAuthorityForLocation(), plSt.getPl_11_assigningAuthorityForLocation());
//	}
//	public static void setXCN(XON xon, XON_ST_v25 xonSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		xon.getXon1_OrganizationName().setValue(xonSt.getXon_1_organizationName());
//		xon.getXon2_OrganizationNameTypeCode().setValue(xonSt.getXon_2_organizationNameTypeCode());
//		xon.getXon3_IDNumber().setValue(xonSt.getXon_3_idNumber());
//		xon.getXon4_CheckDigit().setValue(xonSt.getXon_4_checkDigit());
//		xon.getXon5_CheckDigitScheme().setValue(xonSt.getXon_5_checkDigitScheme());
//		setHD(xon.getXon6_AssigningAuthority(), xonSt.getXon_6_assigningAuthority());
//		xon.getXon7_IdentifierTypeCode().setValue(xonSt.getXon_7_identifierTypeCode());
//		setHD(xon.getXon8_AssigningFacility(), xonSt.getXon_8_assigningFacility());
//		xon.getXon9_NameRepresentationCode().setValue(xonSt.getXon_9_nameRepresentationCode());
//		xon.getXon10_OrganizationIdentifier().setValue(xonSt.getXon_10_organizationIdentifier());
//	}
//	public static void setCNE(CNE cne, CNE_ST_v25 cneSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		cne.getCne1_Identifier().setValue(cneSt.getCne_1_identifier());
//		cne.getCne2_Text().setValue(cneSt.getCne_2_text());
//		cne.getCne3_NameOfCodingSystem().setValue(cneSt.getCne_3_nameOfCodingSystem());
//		cne.getCne4_AlternateIdentifier().setValue(cneSt.getCne_4_alternateIdentifier());
//		cne.getCne5_AlternateText().setValue(cneSt.getCne_5_alternateText());
//		cne.getCne6_NameOfAlternateCodingSystem().setValue(cneSt.getCne_6_nameOfAlternateCodingSystem());
//		cne.getCne7_CodingSystemVersionID().setValue(cneSt.getCne_7_codingSystemVersionId());
//		cne.getCne8_AlternateCodingSystemVersionID().setValue(cneSt.getCne_8_alternateCodingSystemVersionId());
//		cne.getCne9_OriginalText().setValue(cneSt.getCne_9_originalText());
//	}
//	public static void setSPS(SPS sps, SPS_ST_v25 spsSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setCWE(sps.getSps1_SpecimenSourceNameOrCode(), spsSt.getSps_1_specimenSourceNameOrCode());
//		setCWE(sps.getSps2_Additives(), spsSt.getSps_2_additives());
//		sps.getSps3_SpecimenCollectionMethod().setValue(spsSt.getSps_3_specimenCollectionMethod());
//		setCWE(sps.getSps4_BodySite(), spsSt.getSps_4_bodySite());
//		setCWE(sps.getSps5_SiteModifier(), spsSt.getSps_5_siteModifier());
//		setCWE(sps.getSps6_CollectionMethodModifierCode(), spsSt.getSps_6_collectionMethodModifierCode());
//		setCWE(sps.getSps7_SpecimenRole(), spsSt.getSps_7_specimenRole());
//	}
//	public static void setMOC(MOC moc, MOC_ST mocSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setMO(moc.getMoc1_MonetaryAmount(), mocSt.getMoc_1_monetaryAmount());
//		setCE(moc.getMoc2_ChargeCode(), mocSt.getMoc_2_chargeCode());
//	}
//	public static void setMO(MO mo, MO_ST moSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		mo.getMo1_Quantity().setValue(moSt.getMo_1_quantity());
//		mo.getMo2_Denomination().setValue(moSt.getMo_2_denomination());
//	}
//	public static void setPRL(PRL prl, PRL_ST prlSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setCE(prl.getPrl1_ParentObservationIdentifier(), prlSt.getPrl_1_parentObservationIdentifier());
//		prl.getPrl2_ParentObservationSubIdentifier().setValue(prlSt.getPrl_2_parentObservationSubidentifier());
//		prl.getPrl3_ParentObservationValueDescriptor().setValue(prlSt.getPrl_3_parentObservationValueDescriptor());
//	}
//	public static void setNDL(NDL ndl, NDL_ST_v25 ndlSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		setCNN(ndl.getNdl1_NameOfPerson(), ndlSt.getNdl_1_name());
//	}
//	public static void setCNN(CNN cnn, CNN_ST_v25 cnnSt) throws DataTypeException {
//		// TODO Auto-generated method stub
//		cnn.getCnn1_IDNumber().setValue(cnnSt.getCnn_1_idNumber());
//		cnn.getCnn2_FamilyName().setValue(cnnSt.getCnn_2_familyName());
//		cnn.getCnn3_GivenName().setValue(cnnSt.getCnn_3_givenName());
//		cnn.getCnn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(cnnSt.getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof());
//		cnn.getCnn5_SuffixEgJRorIII().setValue(cnnSt.getCnn_5_suffix());
//		cnn.getCnn6_PrefixEgDR().setValue(cnnSt.getCnn_6_prefix());
//		cnn.getCnn7_DegreeEgMD().setValue(cnnSt.getCnn_7_degree());
//		cnn.getCnn8_SourceTable().setValue(cnnSt.getCnn_8_sourceTable());
//		cnn.getCnn9_AssigningAuthorityNamespaceID().setValue(cnnSt.getCnn_9_assigningAuthorityNamespaceId());
//		cnn.getCnn10_AssigningAuthorityUniversalID().setValue(cnnSt.getCnn_10_assigningAuthorityUniversalId());
//		cnn.getCnn11_AssigningAuthorityUniversalIDType().setValue(cnnSt.getCnn_11_assigningAuthorityUniversalIdType());
//	}
	public static String dateParsing(String date) {	
		String[] dates = date.split("/");
		return dates[2]+dates[0]+dates[1];
	}
	public static Date dateFormatting(String dateString) throws ParseException {
		return new SimpleDateFormat("MM/dd/yyyy").parse(dateString.substring(4, 6)+"/"+dateString.substring(6, 8)+"/"+dateString.substring(0, 4));
	}

	/**
	 * @param al13_AllergyCodeMnemonicDescription
	 * @return
	 */
	public static CE_v2 getCE_v2(ca.uhn.hl7v2.model.v23.datatype.CE ce) {
		// TODO Auto-generated method stub
		return new CE_v2(
				ce.getCe1_Identifier().getValue()==null?"":ce.getCe1_Identifier().getValue(),
				ce.getCe2_Text().getValue()==null?"":ce.getCe2_Text().getValue(),
				ce.getCe3_NameOfCodingSystem().getValue()==null?"":ce.getCe3_NameOfCodingSystem().getValue(),
				ce.getCe4_AlternateIdentifier().getValue()==null?"":ce.getCe4_AlternateIdentifier().getValue(),
				ce.getCe5_AlternateText().getValue()==null?"":ce.getCe5_AlternateText().getValue(),
				ce.getCe6_NameOfAlternateCodingSystem().getValue()==null?"":ce.getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param al13_AllergyCodeMnemonicDescription
	 * @param ce_al1_3_allergyCodeMnomonicDescription
	 * @throws DataTypeException 
	 */
	public static void setCE_v2(ca.uhn.hl7v2.model.v23.datatype.CE ce,
			CE_v2 ce_v2) throws DataTypeException {
		ce.getCe1_Identifier().setValue(ce_v2.getCe_1_identifier());
		ce.getCe2_Text().setValue(ce_v2.getCe_2_text());
		ce.getCe3_NameOfCodingSystem().setValue(ce_v2.getCe_3_nameOfCodingSystem());
		ce.getCe4_AlternateIdentifier().setValue(ce_v2.getCe_4_alternateIdentifier());
		ce.getCe5_AlternateText().setValue(ce_v2.getCe_5_alternateText());
		ce.getCe6_NameOfAlternateCodingSystem().setValue(ce_v2.getCe_6_nameOfAlternateCodingSystem());
		// TODO Auto-generated method stub
	}
	/**
	 * @param db13_DisabledPersonIdentifier
	 * @return
	 */
	public static CX_v23 getCX_v23(ca.uhn.hl7v2.model.v23.datatype.CX cx) {
		// TODO Auto-generated method stub
		return new CX_v23(
				cx.getCx1_ID().getValue()==null?"":cx.getCx1_ID().getValue(), 
				cx.getCx2_CheckDigit().getValue()==null?"":cx.getCx2_CheckDigit().getValue(),
				cx.getCx3_CodeIdentifyingTheCheckDigitSchemeEmployed().getValue()==null?"":cx.getCx3_CodeIdentifyingTheCheckDigitSchemeEmployed().getValue(),
				getHD_v2(cx.getCx4_AssigningAuthority()),
				cx.getCx5_IdentifierTypeCode().getValue()==null?"":cx.getCx5_IdentifierTypeCode().getValue(),
				getHD_v2(cx.getCx6_AssigningFacility()));
	}
	/**
	 * @param cx4_AssigningAuthority
	 * @return
	 */
	public static HD_v2 getHD_v2(ca.uhn.hl7v2.model.v23.datatype.HD hd) {
		// TODO Auto-generated method stub
		return new HD_v2(
				hd.getHd1_NamespaceID().getValue()==null?"":hd.getHd1_NamespaceID().getValue(),
				hd.getHd2_UniversalID().getValue()==null?"":hd.getHd2_UniversalID().getValue(),
				hd.getHd3_UniversalIDType().getValue()==null?"":hd.getHd3_UniversalIDType().getValue());
	}
	/**
	 * @param db13_DisabledPersonIdentifier
	 * @param cx_v23
	 * @throws DataTypeException 
	 */
	public static void setCX_23(ca.uhn.hl7v2.model.v23.datatype.CX cx, CX_v23 cx_v23) throws DataTypeException {
		cx.getCx1_ID().setValue(cx_v23.getCx_1_id());
		cx.getCx2_CheckDigit().setValue(cx_v23.getCx_2_checkDigit());
		cx.getCx3_CodeIdentifyingTheCheckDigitSchemeEmployed().setValue(cx_v23.getCx_3_codeIdentifyingTheCheckDigitSchemeEmployed());
		setHD_v2(cx.getCx4_AssigningAuthority(), cx_v23.getHd_cx_4_assigningAuthority());
		cx.getCx5_IdentifierTypeCode().setValue(cx_v23.getCx_5_identifierTypeCode());
		setHD_v2(cx.getCx6_AssigningFacility(), cx_v23.getHd_cx_6_assigningFacility());
	}
	/**
	 * @param cx4_AssigningAuthority
	 * @param hd_cx_4_assigningAuthority
	 * @throws DataTypeException 
	 */
	public static void setHD_v2(ca.uhn.hl7v2.model.v23.datatype.HD hd, HD_v2 hd_v2) throws DataTypeException {
		// TODO Auto-generated method stub
		hd.getHd1_NamespaceID().setValue(hd_v2.getHd_1_namespaceId());
		hd.getHd2_UniversalID().setValue(hd_v2.getHd_2_universalId());
		hd.getHd3_UniversalIDType().setValue(hd_v2.getHd_3_universalIdType());
	}
	/**
	 * @param dg15_DiagnosisDateTime
	 * @return
	 */
	public static TS_v2 getTS_v2(ca.uhn.hl7v2.model.v23.datatype.TS ts) {
		// TODO Auto-generated method stub
		return new TS_v2(
				ts.getTs1_TimeOfAnEvent().getValue()==null?"":ts.getTs1_TimeOfAnEvent().getValue(),
				ts.getTs2_DegreeOfPrecision().getValue()==null?"":ts.getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param dg15_DiagnosisDateTime
	 * @param ts_dg1_5_diagnosisDateTime
	 * @throws DataTypeException 
	 */
	public static void setTS_v2(ca.uhn.hl7v2.model.v23.datatype.TS ts, TS_v2 ts_v2) throws DataTypeException {
		// TODO Auto-generated method stub
		ts.getTs1_TimeOfAnEvent().setValue(ts_v2.getTs_1_time());
		ts.getTs2_DegreeOfPrecision().setValue(ts_v2.getTs_2_degreeOfPrecision());
	}
	/**
	 * @param dg113_OutlierCost
	 * @return
	 */
	public static CP_v2 getCP_v2(CP cp) {
		return new CP_v2(
				getMO_v2(cp.getCp1_Price()),
				cp.getCp2_PriceType().getValue()==null?"":cp.getCp2_PriceType().getValue(),
				cp.getCp3_FromValue().getValue()==null?"":cp.getCp3_FromValue().getValue(),
				cp.getCp4_ToValue().getValue()==null?"":cp.getCp4_ToValue().getValue(),
				getCE_v2(cp.getCp5_RangeUnits()),
				cp.getCp6_RangeType().getValue()==null?"":cp.getCp6_RangeType().getValue());
	}
	/**
	 * @param cp1_Price
	 * @return
	 */
	public static MO_v2 getMO_v2(ca.uhn.hl7v2.model.v23.datatype.MO mo) {
		// TODO Auto-generated method stub
		return new MO_v2(
				mo.getMo1_Quantity().getValue()==null?"":mo.getMo1_Quantity().getValue(),
				mo.getMo2_Denomination().getValue()==null?"":mo.getMo2_Denomination().getValue());
	}
	/**
	 * @param dg113_OutlierCost
	 * @param cp_dg1_13_outlierCost
	 * @throws DataTypeException 
	 */
	public static void setCP_v2(CP cp, CP_v2 cp_v2) throws DataTypeException {
		// TODO Auto-generated method stub
		setMO_v2(cp.getCp1_Price(), cp_v2.getCp_1_price());
		cp.getCp2_PriceType().setValue(cp_v2.getCp_2_priceType());
		cp.getCp3_FromValue().setValue(cp_v2.getCp_3_fromValue());
		cp.getCp4_ToValue().setValue(cp_v2.getCp_4_toValue());
		setCE_v2(cp.getCp5_RangeUnits(), cp_v2.getCp_5_rangeUnits());
		cp.getCp6_RangeType().setValue(cp_v2.getCp_6_rangeType());
	}
	/**
	 * @param cp1_Price
	 * @param cp_1_price
	 * @throws DataTypeException 
	 */
	public static void setMO_v2(ca.uhn.hl7v2.model.v23.datatype.MO mo, MO_v2 mo_v2) throws DataTypeException {
		// TODO Auto-generated method stub
		mo.getMo1_Quantity().setValue(mo_v2.getMo_1_quantity());
		mo.getMo2_Denomination().setValue(mo_v2.getMo_2_denomination());
	}
	/**
	 * @param dg116_DiagnosingClinician
	 * @return
	 */
	public static XCN_v23 getXCN_v23(ca.uhn.hl7v2.model.v23.datatype.XCN xcn) {
		return new XCN_v23(
				xcn.getXcn1_IDNumber().getValue()==null?"":xcn.getXcn1_IDNumber().getValue(),
				xcn.getXcn2_FamilyName().getValue()==null?"":xcn.getXcn2_FamilyName().getValue(),
				xcn.getXcn3_GivenName().getValue()==null?"":xcn.getXcn3_GivenName().getValue(),
				xcn.getXcn4_MiddleInitialOrName().getValue()==null?"":xcn.getXcn4_MiddleInitialOrName().getValue(),
				xcn.getXcn5_SuffixEgJRorIII().getValue()==null?"":xcn.getXcn5_SuffixEgJRorIII().getValue(),
				xcn.getXcn6_PrefixEgDR().getValue()==null?"":xcn.getXcn6_PrefixEgDR().getValue(),
				xcn.getXcn7_DegreeEgMD().getValue()==null?"":xcn.getXcn7_DegreeEgMD().getValue(),
				xcn.getXcn8_SourceTable().getValue()==null?"":xcn.getXcn8_SourceTable().getValue(),
				getHD_v2(xcn.getXcn9_AssigningAuthority()),
				xcn.getXcn10_NameType().getValue()==null?"":xcn.getXcn10_NameType().getValue(),
				xcn.getXcn11_IdentifierCheckDigit().getValue()==null?"":xcn.getXcn11_IdentifierCheckDigit().getValue(),
				xcn.getXcn12_CodeIdentifyingTheCheckDigitSchemeEmployed().getValue()==null?"":xcn.getXcn12_CodeIdentifyingTheCheckDigitSchemeEmployed().getValue(),
				xcn.getXcn13_IdentifierTypeCode().getValue()==null?"":xcn.getXcn13_IdentifierTypeCode().getValue(),
				getHD_v2(xcn.getXcn14_AssigningFacilityID()));
	}
	/**
	 * @param dg16_DiagnosisType
	 * @param xcn_dg1_16_diagnosingClinician
	 */
	/**
	 * @param dg116_DiagnosingClinician
	 * @param xcn_v23
	 * @throws DataTypeException 
	 */
	public static void setXCN_v23(ca.uhn.hl7v2.model.v23.datatype.XCN xcn, XCN_v23 xcn_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		xcn.getXcn1_IDNumber().setValue(xcn_v23.getXcn_1_idNumber());
		xcn.getXcn2_FamilyName().setValue(xcn_v23.getXcn_2_familyName());
		xcn.getXcn3_GivenName().setValue(xcn_v23.getXcn_3_givenName());
		xcn.getXcn4_MiddleInitialOrName().setValue(xcn_v23.getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
		xcn.getXcn5_SuffixEgJRorIII().setValue(xcn_v23.getXcn_5_suffix());
		xcn.getXcn6_PrefixEgDR().setValue(xcn_v23.getXcn_6_prefix());
		xcn.getXcn7_DegreeEgMD().setValue(xcn_v23.getXcn_7_degree());
		xcn.getXcn8_SourceTable().setValue(xcn_v23.getXcn_8_sourceTable());
		setHD_v2(xcn.getXcn9_AssigningAuthority(), xcn_v23.getHd_xcn_9_assigningAuthority());
		xcn.getXcn10_NameType().setValue(xcn_v23.getXcn_10_nameTypeCode());
		xcn.getXcn11_IdentifierCheckDigit().setValue(xcn_v23.getXcn_11_identifierCheckDigit());
		xcn.getXcn12_CodeIdentifyingTheCheckDigitSchemeEmployed().setValue(xcn_v23.getXcn_12_codeIdentifyingTheCheckDigitSchemeEmployed());
		xcn.getXcn13_IdentifierTypeCode().setValue(xcn_v23.getXcn_13_identifierTypeCode());
		setHD_v2(xcn.getXcn14_AssigningFacilityID(), xcn_v23.getHd_xcn_14_assigningFacilityId());
	}
	/**
	 * @param evn5_OperatorID
	 * @return
	 */
	public static CN_v23 getCN_v23(CN cn) {
		// TODO Auto-generated method stub
		return new CN_v23(
				cn.getCn1_IDNumber().getValue()==null?"":cn.getCn1_IDNumber().getValue(),
				cn.getCn2_FamilyName().getValue()==null?"":cn.getCn2_FamilyName().getValue(),
				cn.getCn3_GivenName().getValue()==null?"":cn.getCn3_GivenName().getValue(),
				cn.getCn4_MiddleInitialOrName().getValue()==null?"":cn.getCn4_MiddleInitialOrName().getValue(),
				cn.getCn5_SuffixEgJRorIII().getValue()==null?"":cn.getCn5_SuffixEgJRorIII().getValue(),
				cn.getCn6_PrefixEgDR().getValue()==null?"":cn.getCn6_PrefixEgDR().getValue(),
				cn.getCn7_DegreeEgMD().getValue()==null?"":cn.getCn7_DegreeEgMD().getValue(),
				cn.getCn8_SourceTable().getValue()==null?"":cn.getCn8_SourceTable().getValue(),
				getHD_v2(cn.getCn9_AssigningAuthority()));
	}
	/**
	 * @param evn5_OperatorID
	 * @param cn_evn_5_operatorId
	 * @throws DataTypeException 
	 */
	public static void setCN_v23(CN cn, CN_v23 cn_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cn.getCn1_IDNumber().setValue(cn_v23.getCn_1_iDNumber());
		cn.getCn2_FamilyName().setValue(cn_v23.getCn_2_familyName());
		cn.getCn3_GivenName().setValue(cn_v23.getCn_3_givenName());
		cn.getCn4_MiddleInitialOrName().setValue(cn_v23.getCn_4_middleInitialOrName());
		cn.getCn5_SuffixEgJRorIII().setValue(cn_v23.getCn_5_suffix());
		cn.getCn6_PrefixEgDR().setValue(cn_v23.getCn_6_prefix());
		cn.getCn7_DegreeEgMD().setValue(cn_v23.getCn_7_degree());
		cn.getCn8_SourceTable().setValue(cn_v23.getCn_8_sourceTable());
		setHD_v2(cn.getCn9_AssigningAuthority(), cn_v23.getHd_cn_9_assigningAuthority());
	}
	/**
	 * @param gt12_GuarantorNumber
	 * @return
	 */
	public static CX_v23[] getCX_v23Array(ca.uhn.hl7v2.model.v23.datatype.CX[] cxs) {
		CX_v23[] cx_v23s = new CX_v23[cxs.length];
		for(int i =0; i<cxs.length; i++ ) {
			cx_v23s[i] = getCX_v23(cxs[i]);
		}
		return cx_v23s;
	}
	/**
	 * @param gt12_GuarantorNumber
	 * @param cx_gt1_2_guarantorNumber
	 */
	/**
	 * @param gt12_GuarantorNumber
	 * @param cx_v23
	 * @throws DataTypeException 
	 */
	public static void setCX_v23(ca.uhn.hl7v2.model.v23.datatype.CX cx, CX_v23 cx_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cx.getCx1_ID().setValue(cx_v23.getCx_1_id());
		cx.getCx2_CheckDigit().setValue(cx_v23.getCx_2_checkDigit());
		cx.getCx3_CodeIdentifyingTheCheckDigitSchemeEmployed().setValue(cx_v23.getCx_3_codeIdentifyingTheCheckDigitSchemeEmployed());
		setHD_v2(cx.getCx4_AssigningAuthority(), cx_v23.getHd_cx_4_assigningAuthority());
		cx.getCx5_IdentifierTypeCode().setValue(cx_v23.getCx_5_identifierTypeCode());
		setHD_v2(cx.getCx6_AssigningFacility(), cx_v23.getHd_cx_6_assigningFacility());
	}
	/**
	 * @param gt13_GuarantorName
	 * @return
	 */
	public static XPN_v23 getXPN_v23(ca.uhn.hl7v2.model.v23.datatype.XPN xpn) {
		// TODO Auto-generated method stub
		return new XPN_v23(
				xpn.getXpn1_FamilyName().getValue()==null?"":xpn.getXpn1_FamilyName().getValue(),
				xpn.getXpn2_GivenName().getValue()==null?"":xpn.getXpn2_GivenName().getValue(),
				xpn.getXpn3_MiddleInitialOrName().getValue()==null?"":xpn.getXpn3_MiddleInitialOrName().getValue(),
				xpn.getXpn4_SuffixEgJRorIII().getValue()==null?"":xpn.getXpn4_SuffixEgJRorIII().getValue(),
				xpn.getXpn5_PrefixEgDR().getValue()==null?"":xpn.getXpn5_PrefixEgDR().getValue(),
				xpn.getXpn6_DegreeEgMD().getValue()==null?"":xpn.getXpn6_DegreeEgMD().getValue(),
				xpn.getXpn7_NameTypeCode().getValue()==null?"":xpn.getXpn7_NameTypeCode().getValue(),
				xpn.getXpn8_NameRepresentationCode().getValue()==null?"":xpn.getXpn8_NameRepresentationCode().getValue());
	}
	/**
	 * @param gt13_GuarantorName
	 * @param xpn_v23
	 * @throws DataTypeException 
	 */
	public static void setXPN_v23(ca.uhn.hl7v2.model.v23.datatype.XPN xpn, XPN_v23 xpn_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		xpn.getXpn1_FamilyName().setValue(xpn_v23.getXpn_1_familyName());
		xpn.getXpn2_GivenName().setValue(xpn_v23.getXpn_2_givenName());
		xpn.getXpn3_MiddleInitialOrName().setValue(xpn_v23.getXpn_3_middleInitialOrName());
		xpn.getXpn4_SuffixEgJRorIII().setValue(xpn_v23.getXpn_4_suffix());
		xpn.getXpn5_PrefixEgDR().setValue(xpn_v23.getXpn_5_prefix());
		xpn.getXpn6_DegreeEgMD().setValue(xpn_v23.getXpn_6_degree());
		xpn.getXpn7_NameTypeCode().setValue(xpn_v23.getXpn_7_nameTypeCode());
		xpn.getXpn8_NameRepresentationCode().setValue(xpn_v23.getXpn_8_nameRepresentationCode());
	}
	/**
	 * @param gt15_GuarantorAddress
	 * @return
	 */
	public static XAD_v23 getXAD_v23(ca.uhn.hl7v2.model.v23.datatype.XAD xad) {
		// TODO Auto-generated method stub
		return new XAD_v23(
				xad.getXad1_StreetAddress().getValue()==null?"":xad.getXad1_StreetAddress().getValue(),
				xad.getXad2_OtherDesignation().getValue()==null?"":xad.getXad2_OtherDesignation().getValue(),
				xad.getXad3_City().getValue()==null?"":xad.getXad3_City().getValue(), 
				xad.getXad4_StateOrProvince().getValue()==null?"":xad.getXad4_StateOrProvince().getValue(),
				xad.getXad5_ZipOrPostalCode().getValue()==null?"":xad.getXad5_ZipOrPostalCode().getValue(),
				xad.getXad6_Country().getValue()==null?"":xad.getXad6_Country().getValue(),
				xad.getXad7_AddressType().getValue()==null?"":xad.getXad7_AddressType().getValue(),
				xad.getXad8_OtherGeographicDesignation().getValue()==null?"":xad.getXad8_OtherGeographicDesignation().getValue(),
				xad.getXad9_CountyParishCode().getValue()==null?"":xad.getXad9_CountyParishCode().getValue(),
				xad.getXad10_CensusTract().getValue()==null?"":xad.getXad10_CensusTract().getValue());
	}
	/**
	 * @param gt15_GuarantorAddress
	 * @param xad_v23
	 * @throws DataTypeException 
	 */
	public static void setXAD_v23(ca.uhn.hl7v2.model.v23.datatype.XAD xad, XAD_v23 xad_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		xad.getXad1_StreetAddress().setValue(xad_v23.getXad_1_streetAddress());
		xad.getXad2_OtherDesignation().setValue(xad_v23.getXad_2_otherDestination());
		xad.getXad3_City().setValue(xad_v23.getXad_3_city());
		xad.getXad4_StateOrProvince().setValue(xad_v23.getXad_4_stateOrProvince());
		xad.getXad5_ZipOrPostalCode().setValue(xad_v23.getXad_5_zipOrPostalCode());
		xad.getXad6_Country().setValue(xad_v23.getXad_6_country());
		xad.getXad7_AddressType().setValue(xad_v23.getXad_7_addressType());
		xad.getXad8_OtherGeographicDesignation().setValue(xad_v23.getXad_8_otherGeographicDestination());
		xad.getXad9_CountyParishCode().setValue(xad_v23.getXad_9_countryParishCode());
		xad.getXad10_CensusTract().setValue(xad_v23.getXad_10_censusTrack());
	}
	/**
	 * @param gt16_GuarantorPhNumHome
	 * @return
	 */
	public static XTN_v23 getXTN_v23(ca.uhn.hl7v2.model.v23.datatype.XTN xtn) {
		// TODO Auto-generated method stub
		return new XTN_v23(
				xtn.getXtn1_9999999X99999CAnyText().getValue()==null?"":xtn.getXtn1_9999999X99999CAnyText().getValue(),
				xtn.getXtn2_TelecommunicationUseCode().getValue()==null?"":xtn.getXtn2_TelecommunicationUseCode().getValue(),
				xtn.getXtn3_TelecommunicationEquipmentType().getValue()==null?"":xtn.getXtn3_TelecommunicationEquipmentType().getValue(),
				xtn.getXtn4_EmailAddress().getValue()==null?"":xtn.getXtn4_EmailAddress().getValue(),
				xtn.getXtn5_CountryCode().getValue()==null?"":xtn.getXtn5_CountryCode().getValue(),
				xtn.getXtn6_AreaCityCode().getValue()==null?"":xtn.getXtn6_AreaCityCode().getValue(),
				xtn.getXtn7_PhoneNumber().getValue()==null?"":xtn.getXtn7_PhoneNumber().getValue(),
				xtn.getXtn8_Extension().getValue()==null?"":xtn.getXtn8_Extension().getValue(),
				xtn.getXtn9_AnyText().getValue()==null?"":xtn.getXtn9_AnyText().getValue());
	}
	/**
	 * @param gt16_GuarantorPhNumHome
	 * @param xtn_gt1_6_guarantorPhoneNumberHome
	 * @throws DataTypeException 
	 */
	public static void setXTN_v23(ca.uhn.hl7v2.model.v23.datatype.XTN xtn, XTN_v23 xtn_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		xtn.getXtn1_9999999X99999CAnyText().setValue(xtn_v23.getXtn_1_telephoneNumber());
		xtn.getXtn2_TelecommunicationUseCode().setValue(xtn_v23.getXtn_2_telecomunicationUseCode());
		xtn.getXtn3_TelecommunicationEquipmentType().setValue(xtn_v23.getXtn_3_telecomunicationEquipmentType());
		xtn.getXtn4_EmailAddress().setValue(xtn_v23.getXtn_4_emailAddress());
		xtn.getXtn5_CountryCode().setValue(xtn_v23.getXtn_5_countryCode());
		xtn.getXtn6_AreaCityCode().setValue(xtn_v23.getXtn_6_areaCityCode());
		xtn.getXtn7_PhoneNumber().setValue(xtn_v23.getXtn_7_phoneNumber());
		xtn.getXtn8_Extension().setValue(xtn_v23.getXtn_8_extension());
		xtn.getXtn9_AnyText().setValue(xtn_v23.getXtn_9_anyText());
	}
	/**
	 * @param gt121_GuarantorOrganization
	 * @return
	 */
	public static XON_v23 getXON_v23(ca.uhn.hl7v2.model.v23.datatype.XON xon) {
		// TODO Auto-generated method stub
		return new XON_v23(
				xon.getXon1_OrganizationName().getValue()==null?"":xon.getXon1_OrganizationName().getValue(),
				xon.getXon2_OrganizationNameTypeCode().getValue()==null?"":xon.getXon2_OrganizationNameTypeCode().getValue(),
				xon.getXon3_IDNumber().getValue()==null?"":xon.getXon3_IDNumber().getValue(),
				xon.getXon4_CheckDigit().getValue()==null?"":xon.getXon4_CheckDigit().getValue(),
				xon.getXon5_CodeIdentifyingTheCheckDigitSchemeEmployed().getValue()==null?"":xon.getXon5_CodeIdentifyingTheCheckDigitSchemeEmployed().getValue(),
				getHD_v2(xon.getXon6_AssigningAuthority()),
				xon.getXon7_IdentifierTypeCode().getValue()==null?"":xon.getXon7_IdentifierTypeCode().getValue(),
				getHD_v2(xon.getXon8_AssigningFacilityID()));
	}
	/**
	 * @param gt121_GuarantorOrganization
	 * @param xon_v23
	 * @throws DataTypeException 
	 */
	public static void setXON_v23(ca.uhn.hl7v2.model.v23.datatype.XON xon, XON_v23 xon_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		xon.getXon1_OrganizationName().setValue(xon_v23.getXon_1_organizationName());
		xon.getXon2_OrganizationNameTypeCode().setValue(xon_v23.getXon_2_organizationNameTypeCode());
		xon.getXon3_IDNumber().setValue(xon_v23.getXon_3_idNumber());
		xon.getXon4_CheckDigit().setValue(xon_v23.getXon_4_checkDigit());
		xon.getXon5_CodeIdentifyingTheCheckDigitSchemeEmployed().setValue(xon_v23.getXon_5_codeIdentifyingTheCheckDigitSchemeEmployed());
		setHD_v2(xon.getXon6_AssigningAuthority(), xon_v23.getHd_xon_6_assigningFacility());
		xon.getXon7_IdentifierTypeCode().setValue(xon_v23.getXon_7_identifierTypeCode());
		setHD_v2(xon.getXon8_AssigningFacilityID(), xon_v23.getHd_xon_8_assigningAuthority());
	}
	/**
	 * @param gt150_JobCodeClass
	 * @return
	 */
	public static JCC_v23 getJCC_v23(JCC jcc) {
		// TODO Auto-generated method stub
		return new JCC_v23(
				getString(jcc.getJcc1_JobCode().getValue()),
				getString(jcc.getJcc2_JobClass().getValue()));
	}
	/**
	 * @param gt150_JobCodeClass
	 * @param jcc_gt1_50_jobCodeClass
	 * @throws DataTypeException 
	 */
	public static void setJCC_v23(JCC jcc, JCC_v23 jcc_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		jcc.getJcc1_JobCode().setValue(jcc_v23.getJcc_1_jobCode());
		jcc.getJcc2_JobClass().setValue(jcc_v23.getJcc_2_jobClass());
	}
	/**
	 * @param gt154_GuarantorFinancialClass
	 * @return
	 */
	public static FC_v23 getFC_v23(FC fc) {
		// TODO Auto-generated method stub
		return new FC_v23(
				getString(fc.getFc1_FinancialClass().getValue()),
				getTS_v2(fc.getFc2_EffectiveDate()));
	}
	/**
	 * @param gt154_GuarantorFinancialClass
	 * @param fc_gt1_54_guarantorFinancialClass
	 * @throws DataTypeException 
	 */
	public static void setFC_v23(FC fc, FC_v23 fc_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		fc.getFc1_FinancialClass().setValue(fc_v23.getFc_1_financialClass());
		setTS_v2(fc.getFc2_EffectiveDate(), fc_v23.getTs_fc_2_effectiveDate());
	}
	/**
	 * @param in114_AuthorizationInformation
	 * @return
	 */
	public static CM_AUI_v23 getCM_AUI_v23(CM_AUI cm_aui) {
		// TODO Auto-generated method stub
		return new CM_AUI_v23(
				getString(cm_aui.getCm_aui1_AuthorizationNumber().getValue()),
				getTS_v2(cm_aui.getCm_aui2_Date()),
				getString(cm_aui.getCm_aui3_Source().getValue()));
	}
	/**
	 * @param in114_AuthorizationInformation
	 * @param cm_aui_in1_14_authorizationInformation
	 * @return
	 * @throws DataTypeException 
	 */
	public static void setCM_AUI_v23(CM_AUI cm_aui, CM_AUI_v23 cm_aui_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cm_aui.getCm_aui1_AuthorizationNumber().setValue(cm_aui_v23.getCm_aui_1_authorizationNumber());
		setTS_v2(cm_aui.getCm_aui2_Date(), cm_aui_v23.getCm_aui_2_date());
		cm_aui.getCm_aui3_Source().setValue(cm_aui_v23.getCm_aui_3_source());
	}
	/**
	 * @param msh9_MessageType
	 * @return
	 */
	public static CM_MSG_v23 getCM_MSG_v23(CM_MSG cm_msg) {
		// TODO Auto-generated method stub
		return new CM_MSG_v23(
				getString(cm_msg.getCm_msg1_MessageType().getValue()),
				getString(cm_msg.getCm_msg2_TriggerEvent().getValue()));
	}
	public static void setCM_MSG_v23(CM_MSG cm_msg, CM_MSG_v23 cm_msg_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cm_msg.getCm_msg1_MessageType().setValue(cm_msg_v23.getCm_msg_1_messageType());
		cm_msg.getCm_msg2_TriggerEvent().setValue(cm_msg_v23.getCm_msg_2_triggerEvent());
	}
	/**
	 * @param msh11_ProcessingID
	 * @return
	 */
	public static PT_v2 getPT_v2(ca.uhn.hl7v2.model.v23.datatype.PT pt) {
		// TODO Auto-generated method stub
		return new PT_v2(
				getString(pt.getPt1_ProcessingID().getValue()),
				getString(pt.getPt2_ProcessingMode().getValue()));
	}
	public static void setPT_v2(ca.uhn.hl7v2.model.v23.datatype.PT pt, PT_v2 pt_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		pt.getPt1_ProcessingID().setValue(pt_v23.getPt_1_processingId());
		pt.getPt2_ProcessingMode().setValue(pt_v23.getPt_2_processingMode());
	}
	/**
	 * @param obr2_PlacerOrderNumber
	 * @return
	 */
	public static EI_v2 getEI_v2(ca.uhn.hl7v2.model.v23.datatype.EI ei) {
		// TODO Auto-generated method stub
		return new EI_v2(
				getString(ei.getEi1_EntityIdentifier().getValue()),
				getString(ei.getEi2_NamespaceID().getValue()),
				getString(ei.getEi3_UniversalID().getValue()),
				getString(ei.getEi4_UniversalIDType().getValue()));
	}
	/**
	 * @param obr2_PlacerOrderNumber
	 * @param ei_v2
	 * @throws DataTypeException 
	 */
	public static void setEI_v2(ca.uhn.hl7v2.model.v23.datatype.EI ei, EI_v2 ei_v2) throws DataTypeException {
		// TODO Auto-generated method stub
		ei.getEi1_EntityIdentifier().setValue(ei_v2.getEi_1_entityIdentifier());
		ei.getEi2_NamespaceID().setValue(ei_v2.getEi_2_namespaceId());
		ei.getEi3_UniversalID().setValue(ei_v2.getEi_3_universalId());
		ei.getEi4_UniversalIDType().setValue(ei_v2.getEi_4_universalIdType());
	}
	/**
	 * @param obr9_CollectionVolume
	 * @return
	 */
	public static CQ_v23 getCQ_v23(ca.uhn.hl7v2.model.v23.datatype.CQ cq) {
		// TODO Auto-generated method stub
		return new CQ_v23(
				getString(cq.getCq1_Quantity().getValue()), 
				getCE_v2(cq.getCq2_Units()));
	}
	/**
	 * @param obr9_CollectionVolume
	 * @param cq_obr_9_collectionVolume
	 * @throws DataTypeException 
	 */
	public static void setCQ_v23(ca.uhn.hl7v2.model.v23.datatype.CQ cq, CQ_v23 cq_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cq.getCq1_Quantity().setValue(cq_v23.getCq_1_Quantity()); 
		setCE_v2(cq.getCq2_Units(), cq_v23.getCq_2_Units());
	}
	/**
	 * @param obr15_SpecimenSource
	 * @return
	 */
	public static CM_SPS_v23 getCM_SPS_v23(CM_SPS cm_sps) {
		// TODO Auto-generated method stub
		return new CM_SPS_v23(
				getCE_v2(cm_sps.getCm_sps1_SpecimenSourceNameOrCode()),
				getString(cm_sps.getCm_sps2_Additives().getValue()),
				getString(cm_sps.getCm_sps3_Freetext().getValue()),
				getCE_v2(cm_sps.getCm_sps4_BodySite()),
				getCE_v2(cm_sps.getCm_sps5_SiteModifier()),
				getCE_v2(cm_sps.getCm_sps6_CollectionModifierMethodCode()));
	}
	/**
	 * @param obr15_SpecimenSource
	 * @param cm_sps_obr_15_specimenSource
	 * @throws DataTypeException 
	 */
	public static void setCM_SPS_v23(CM_SPS cm_sps, CM_SPS_v23 cm_sps_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		setCE_v2(cm_sps.getCm_sps1_SpecimenSourceNameOrCode(), cm_sps_v23.getCe_cm_sps_1_specimenSourceNameOrCode());
		cm_sps.getCm_sps2_Additives().setValue(cm_sps_v23.getCm_sps_2_additives());
		cm_sps.getCm_sps3_Freetext().setValue(cm_sps_v23.getCm_sps_3_freeText());
		setCE_v2(cm_sps.getCm_sps4_BodySite(), cm_sps_v23.getCe_cm_sps_4_bodySite());
		setCE_v2(cm_sps.getCm_sps5_SiteModifier(), cm_sps_v23.getCe_cm_sps_5_siteModifier());
		setCE_v2(cm_sps.getCm_sps6_CollectionModifierMethodCode(), cm_sps_v23.getCe_cm_sps_6_collectionModifierMethodCode());
	}
	/**
	 * @param obr23_ChargeToPractice
	 * @return
	 */
	public static CM_MOC_v23 getCM_MOC_v23(CM_MOC cm_moc) {
		// TODO Auto-generated method stub
		return new CM_MOC_v23(
				new MO_v23(
						getString(cm_moc.getCm_moc1_DollarAmount().getMo1_Quantity().getValue()),
						getString(cm_moc.getCm_moc1_DollarAmount().getMo2_Denomination().getValue())),
				new CE_v2(
						getString(cm_moc.getCm_moc2_ChargeCode().getCe1_Identifier().getValue()),
						getString(cm_moc.getCm_moc2_ChargeCode().getCe2_Text().getValue()),
						getString(cm_moc.getCm_moc2_ChargeCode().getCe3_NameOfCodingSystem().getValue()),
						getString(cm_moc.getCm_moc2_ChargeCode().getCe4_AlternateIdentifier().getValue()),
						getString(cm_moc.getCm_moc2_ChargeCode().getCe5_AlternateText().getValue()),
						getString(cm_moc.getCm_moc2_ChargeCode().getCe6_NameOfAlternateCodingSystem().getValue())));
	}
	/**
	 * @param obr23_ChargeToPractice
	 * @param cm_moc_obr_23_chargeToPractice
	 * @throws DataTypeException 
	 */
	public static void setCM_MOC_v23(CM_MOC cm_moc, CM_MOC_v23 cm_moc_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cm_moc.getCm_moc1_DollarAmount().getMo1_Quantity().setValue(cm_moc_v23.getMo_cm_moc_1_dollarAmount().getMo_1_quantity());
		cm_moc.getCm_moc1_DollarAmount().getMo2_Denomination().setValue(cm_moc_v23.getMo_cm_moc_1_dollarAmount().getMo_2_denomication());
		cm_moc.getCm_moc2_ChargeCode().getCe1_Identifier().setValue(cm_moc_v23.getCe_cm_moc_2_chargeCode().getCe_1_identifier());
		cm_moc.getCm_moc2_ChargeCode().getCe2_Text().setValue(cm_moc_v23.getCe_cm_moc_2_chargeCode().getCe_2_text());
		cm_moc.getCm_moc2_ChargeCode().getCe3_NameOfCodingSystem().setValue(cm_moc_v23.getCe_cm_moc_2_chargeCode().getCe_3_nameOfCodingSystem());
		cm_moc.getCm_moc2_ChargeCode().getCe4_AlternateIdentifier().setValue(cm_moc_v23.getCe_cm_moc_2_chargeCode().getCe_4_alternateIdentifier());
		cm_moc.getCm_moc2_ChargeCode().getCe5_AlternateText().setValue(cm_moc_v23.getCe_cm_moc_2_chargeCode().getCe_5_alternateText());
		cm_moc.getCm_moc2_ChargeCode().getCe6_NameOfAlternateCodingSystem().setValue(cm_moc_v23.getCe_cm_moc_2_chargeCode().getCe_6_nameOfAlternateCodingSystem());
	}
	/**
	 * @param obr26_ParentResult
	 * @return
	 */
	public static CM_PRL_v23 getCM_PRL_v23(CM_PRL cm_prl) {
		// TODO Auto-generated method stub
		return new CM_PRL_v23(
				getCE_v2(cm_prl.getCm_prl1_OBX3ObservationIdentifierOfParentResult()),
				getString(cm_prl.getCm_prl2_OBX4SubIDOfParentResult().getValue()),
				getString(cm_prl.getCm_prl3_PartOfOBX5ObservationResultFromParent().getValue()));
	}
	/**
	 * @param obr26_ParentResult
	 * @param cm_prl_obr_26_parentResult
	 * @throws DataTypeException 
	 */
	public static void setCM_PRL_v23(CM_PRL cm_prl, CM_PRL_v23 cm_prl_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		setCE_v2(cm_prl.getCm_prl1_OBX3ObservationIdentifierOfParentResult(), cm_prl_v23.getCe_obr_1_obx3ObservationIdentifierOfParentResult());
		cm_prl.getCm_prl2_OBX4SubIDOfParentResult().setValue(cm_prl_v23.getObr_2_obx4SubIdOfParentResult());
		cm_prl.getCm_prl3_PartOfOBX5ObservationResultFromParent().setValue(cm_prl_v23.getObr_3_partOfObx5ObservationResultFromParent());
	}
	/**
	 * @param obr27_QuantityTiming
	 * @return
	 */
	public static TQ_v23 getTQ_v23(ca.uhn.hl7v2.model.v23.datatype.TQ tq) {
		// TODO Auto-generated method stub
		return new TQ_v23(
				getCQ_v23(tq.getTq1_Quantity()),
				getRI_v2(tq.getTq2_Interval()), 
				getString(tq.getTq3_Duration().getValue()),
				getTS_v2(tq.getTq4_StartDateTime()),
				getTS_v2(tq.getTq5_EndDateTime()),
				getString(tq.getTq6_Priority().getValue()),
				getString(tq.getTq7_Condition().getValue()),
				getString(tq.getTq8_Text().getValue()),
				getString(tq.getTq9_Conjunction().getValue()),
				getCM_OSD_v23(tq.getTq10_OrderSequencing()));
	}
	/**
	 * @param tq10_OrderSequencing
	 * @return
	 */
	public static CM_OSD_v23 getCM_OSD_v23(CM_OSD cm_osd) {
		// TODO Auto-generated method stub
		return new CM_OSD_v23(
				getString(cm_osd.getCm_osd1_SequenceResultsFlag().getValue()),
				getString(cm_osd.getCm_osd2_PlacerOrderNumberEntityIdentifier().getValue()),
				getString(cm_osd.getCm_osd3_PlacerOrderNumberNamespaceID().getValue()),
				getString(cm_osd.getCm_osd4_FillerOrderNumberEntityIdentifier().getValue()),
				getString(cm_osd.getCm_osd5_FillerOrderNumberNamespaceID().getValue()),
				getString(cm_osd.getCm_osd6_SequenceConditionValue().getValue()),
				getString(cm_osd.getCm_osd7_MaximumNumberOfRepeats().getValue()),
				getString(cm_osd.getCm_osd8_PlacerOrderNumberUniversalID().getValue()),
				getString(cm_osd.getCm_osd9_PlacerOrderNumberUniversalIDType().getValue()),
				getString(cm_osd.getCm_osd10_FillerOrderNumberUniversalID().getValue()),
				getString(cm_osd.getCm_osd11_FillerOrderNumberUniversalIDType().getValue()));
	}
	/**
	 * @param tq2_Interval
	 * @return
	 */
	public static RI_v2 getRI_v2(CM_RI ri) {
		// TODO Auto-generated method stub
		return new RI_v2(
				getString(ri.getCm_ri1_RepeatPattern().getValue()),
				getString(ri.getCm_ri2_ExplicitTimeInterval().getValue()));
	}
	/**
	 * @param obr27_QuantityTiming
	 * @param tq_obr_27_quantityTiming
	 * @throws DataTypeException 
	 */
	public static void setTQ_v23(ca.uhn.hl7v2.model.v23.datatype.TQ tq, TQ_v23 tq_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		setCQ_v23(tq.getTq1_Quantity(), tq_v23.getCq_tq_1_quantity());
		setRI_v2(tq.getTq2_Interval(), tq_v23.getRi_tq_2_interval()); 
		tq.getTq3_Duration().setValue(tq_v23.getTq_3_duration());
		setTS_v2(tq.getTq4_StartDateTime(), tq_v23.getTs_tq_4_startDateTime());
		setTS_v2(tq.getTq5_EndDateTime(), tq_v23.getTs_tq_5_endDateTime());
		tq.getTq6_Priority().setValue(tq_v23.getTq_6_priority());
		tq.getTq7_Condition().setValue(tq_v23.getTq_7_condition());
		tq.getTq8_Text().setValue(tq_v23.getTq_8_text());
		tq.getTq9_Conjunction().setValue(tq_v23.getTq_9_conjunction());
		setCM_OSD_v23(tq.getTq10_OrderSequencing(), tq_v23.getCm_osd_tq_10_orderSequencing());
	}
	/**
	 * @param tq10_OrderSequencing
	 * @param cm_osd_tq_10_orderSequencing
	 * @throws DataTypeException 
	 */
	public static void setCM_OSD_v23(CM_OSD cm_osd, CM_OSD_v23 cm_osd_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cm_osd.getCm_osd1_SequenceResultsFlag().setValue(cm_osd_v23.getCm_osd_1_sequenceResultsflags());
		cm_osd.getCm_osd2_PlacerOrderNumberEntityIdentifier().setValue(cm_osd_v23.getCm_osd_2_placerOrderNumberEntityIdentifier());
		cm_osd.getCm_osd3_PlacerOrderNumberNamespaceID().setValue(cm_osd_v23.getCm_osd_3_fillerOrderNumberEntityIdentifier());
		cm_osd.getCm_osd4_FillerOrderNumberEntityIdentifier().setValue(cm_osd_v23.getCm_osd_4_fillerOrderNumberEntityIdentifier());
		cm_osd.getCm_osd5_FillerOrderNumberNamespaceID().setValue(cm_osd_v23.getCm_osd_5_fillerOrderNumberNamespaceID());
		cm_osd.getCm_osd6_SequenceConditionValue().setValue(cm_osd_v23.getCm_osd_6_sequenceConditionValue());
		cm_osd.getCm_osd7_MaximumNumberOfRepeats().setValue(cm_osd_v23.getCm_osd_7_maximumNumberOfRepeats());
		cm_osd.getCm_osd8_PlacerOrderNumberUniversalID().setValue(cm_osd_v23.getCm_osd_8_placerOrderNumberUniversalID());
		cm_osd.getCm_osd9_PlacerOrderNumberUniversalIDType().setValue(cm_osd_v23.getCm_osd_9_placerOrderNumberUniversalIDType());
		cm_osd.getCm_osd10_FillerOrderNumberUniversalID().setValue(cm_osd_v23.getCm_osd_10_fillerOrderNumberUniversalID());
		cm_osd.getCm_osd11_FillerOrderNumberUniversalIDType().setValue(cm_osd_v23.getCm_osd_11_fillerOrderNumberUniversalIDType());
	}
	/**
	 * @param tq2_Interval
	 * @param ri_tq_2_interval
	 * @throws DataTypeException 
	 */
	public static void setRI_v2(CM_RI ri, RI_v2 ri_v2) throws DataTypeException {
		// TODO Auto-generated method stub
		ri.getCm_ri1_RepeatPattern().setValue(ri_v2.getRi_1_repeatPattern());
		ri.getCm_ri2_ExplicitTimeInterval().setValue(ri_v2.getRi_2_explicitTimeInterval());
	}
	/**
	 * @param obr29_ParentNumber
	 * @return
	 */
	public static CM_EIP_v23 getCM_EIP_v23(CM_EIP cm_eip) {
		// TODO Auto-generated method stub
		return new CM_EIP_v23(
				getEI_v2(cm_eip.getCm_eip1_ParentSPlacerOrderNumber()),
				getEI_v2(cm_eip.getCm_eip2_ParentSFillerOrderNumber()));
	}
	/**
	 * @param obr29_ParentNumber
	 * @param cm_eip_obr_29_parentNumber
	 * @throws DataTypeException 
	 */
	public static void setCM_EIP_v23(CM_EIP cm_eip, CM_EIP_v23 cm_eip_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		setEI_v2(cm_eip.getCm_eip1_ParentSPlacerOrderNumber(), cm_eip_v23.getEi_cm_eip_1_parentsPlacerOrderNumber());
		setEI_v2(cm_eip.getCm_eip2_ParentSFillerOrderNumber(), cm_eip_v23.getEi_cm_eip_2_parentsFillerOrderNumber());
	}
	/**
	 * @param obr32_PrincipalResultInterpreter
	 * @return
	 */
	public static CM_NDL_v23 getCM_NDL_v23(CM_NDL cm_ndl) {
		// TODO Auto-generated method stub
		return new CM_NDL_v23(
				getCN_v23(cm_ndl.getCm_ndl1_OPName()),
				getTS_v2(cm_ndl.getCm_ndl2_StartDateTime()),
				getTS_v2(cm_ndl.getCm_ndl3_EndDateTime()),
				getString(cm_ndl.getCm_ndl4_PointOfCare().getValue()),
				getString(cm_ndl.getCm_ndl5_Room().getValue()),
				getString(cm_ndl.getCm_ndl6_Bed().getValue()),
				getHD_v2(cm_ndl.getCm_ndl7_Facility()),
				getString(cm_ndl.getCm_ndl8_LocationStatus().getValue()),
				getString(cm_ndl.getCm_ndl9_PersonLocationType().getValue()),
				getString(cm_ndl.getCm_ndl10_Building().getValue()),
				getString(cm_ndl.getCm_ndl11_Floor().getValue()));
	}
	/**
	 * @param obr32_PrincipalResultInterpreter
	 * @param cm_ndl_obr_32_principalResultInterpreter
	 * @throws DataTypeException 
	 */
	public static void setCM_NDL_v23(CM_NDL cm_ndl, CM_NDL_v23 cm_ndl_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		setCN_v23(cm_ndl.getCm_ndl1_OPName(), cm_ndl_v23.getCn_cm_ndl_1_OPName());
		setTS_v2(cm_ndl.getCm_ndl2_StartDateTime(), cm_ndl_v23.getTs_cm_ndl_2_startDatetime());
		setTS_v2(cm_ndl.getCm_ndl3_EndDateTime(), cm_ndl_v23.getTs_cm_ndl_3_endDatetime());
		cm_ndl.getCm_ndl4_PointOfCare().setValue(cm_ndl_v23.getCm_ndl_4_pointOfCare());
		cm_ndl.getCm_ndl5_Room().setValue(cm_ndl_v23.getCm_ndl_5_room());
		cm_ndl.getCm_ndl6_Bed().setValue(cm_ndl_v23.getCm_ndl_6_bed());
		setHD_v2(cm_ndl.getCm_ndl7_Facility(), cm_ndl_v23.get_hd_cm_ndl_7_facility());
		cm_ndl.getCm_ndl8_LocationStatus().setValue(cm_ndl_v23.getCm_ndl_8_locationStatus());
		cm_ndl.getCm_ndl9_PersonLocationType().setValue(cm_ndl_v23.getCm_ndl_9_personLocationType());
		cm_ndl.getCm_ndl10_Building().setValue(cm_ndl_v23.getCm_ndl_10_building());
		cm_ndl.getCm_ndl11_Floor().setValue(cm_ndl_v23.getCm_ndl_11_floor());
	}
	/**
	 * @param orc13_EntererSLocation
	 * @return
	 */
	public static PL_v23 getPL_v23(ca.uhn.hl7v2.model.v23.datatype.PL pl) {
		// TODO Auto-generated method stub
		return new PL_v23(
				getString(pl.getPl1_PointOfCare().getValue()),
				getString(pl.getPl2_Room().getValue()),
				getString(pl.getPl3_Bed().getValue()),
				getHD_v2(pl.getPl4_Facility()),
				getString(pl.getPl5_LocationStatus().getValue()),
				getString(pl.getPl6_PersonLocationType().getValue()),
				getString(pl.getPl7_Building().getValue()),
				getString(pl.getPl8_Floor().getValue()),
				getString(pl.getPl9_LocationType().getValue()));
	}
	public static void setPL_v23(ca.uhn.hl7v2.model.v23.datatype.PL pl, PL_v23 pl_v23) throws DataTypeException {
		pl.getPl1_PointOfCare().setValue(pl_v23.getPl_1_pointOfCare());
		pl.getPl2_Room().setValue(pl_v23.getPl_2_room());
		pl.getPl3_Bed().setValue(pl_v23.getPl_3_bed());
		setHD_v2(pl.getPl4_Facility(), pl_v23.getHd_pl_4_facility());
		pl.getPl5_LocationStatus().setValue(pl_v23.getPl_5_locationStatus());
		pl.getPl6_PersonLocationType().setValue(pl_v23.getPl_6_personLocationType());
		pl.getPl7_Building().setValue(pl_v23.getPl_7_building());
		pl.getPl8_Floor().setValue(pl_v23.getPl_8_floor());
		pl.getPl9_LocationType().setValue(pl_v23.getPl_9_locationType());
	}
	/**
	 * @param pid20_DriverSLicenseNumber
	 * @return
	 */
	public static DLN_v23 getDLN_v23(ca.uhn.hl7v2.model.v23.datatype.DLN dln) {
		// TODO Auto-generated method stub
		return new DLN_v23(
				getString(dln.getDln1_DriverSLicenseNumber().getValue()),
				getString(dln.getDln2_IssuingStateProvinceCountry().getValue()),
				getString(dln.getDln3_ExpirationDate().getValue()));
	}
	/**
	 * @param pid20_DriverSLicenseNumber
	 * @param dln_pid_20_patientDriverLicense
	 * @throws DataTypeException 
	 */
	public static void setDLN_v23(ca.uhn.hl7v2.model.v23.datatype.DLN dln, DLN_v23 dln_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		dln.getDln1_DriverSLicenseNumber().setValue(dln_v23.getDln_1_driversLicense());
		dln.getDln2_IssuingStateProvinceCountry().setValue(dln_v23.getDln_2_issuingStateOrProvince());
		dln.getDln3_ExpirationDate().setValue(dln_v23.getDln_3_expirationDate());
	}
	/**
	 * @param pv137_DischargedToLocation
	 * @return
	 */
	public static CM_DLD_v23 getCM_DLD_v23(CM_DLD cm_dld) {
		// TODO Auto-generated method stub
		return new CM_DLD_v23(
				getString(cm_dld.getCm_dld1_DischargeLocation().getValue()),
				getTS_v2(cm_dld.getCm_dld2_EffectiveDate()));
	}
	/**
	 * @param pv137_DischargedToLocation
	 * @param cm_dld_pv1_37_dischargedToLocation
	 * @throws DataTypeException 
	 */
	public static void setCM_DLD_v23(CM_DLD cm_dld, CM_DLD_v23 cm_dld_v23) throws DataTypeException {
		// TODO Auto-generated method stub
		cm_dld.getCm_dld1_DischargeLocation().setValue(cm_dld_v23.getCm_dld_1_dischargeLocation());
		setTS_v2(cm_dld.getCm_dld2_EffectiveDate(), cm_dld_v23.getTs_cm_dld_2_effectiveDate());
	}
	/**
	 * @param value
	 * @return
	 */
	public static String getString(String value) {
		// TODO Auto-generated method stub
		return value==null?"":value;
	}
}
