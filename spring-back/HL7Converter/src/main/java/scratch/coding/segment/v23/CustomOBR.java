package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_OBSERVATION;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_ORDER;
import ca.uhn.hl7v2.model.v23.segment.DG1;
import ca.uhn.hl7v2.model.v23.segment.NTE;
import ca.uhn.hl7v2.model.v23.segment.OBR;
import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_EIP_v23;
import scratch.coding.models.v23.CM_MOC_v23;
import scratch.coding.models.v23.CM_NDL_v23;
import scratch.coding.models.v23.CM_PRL_v23;
import scratch.coding.models.v23.CM_SPS_v23;
import scratch.coding.models.v23.CQ_v23;
import scratch.coding.models.v23.TQ_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XTN_v23;
import scratch.coding.segment.v25.CustomOBX_v25;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomOBR implements Serializable {
	@JsonProperty("obr_1_setId")
	private String obr_1_setId;
	@JsonProperty("ei_obr_2_placeOrderNumber")
	private EI_v2[] ei_obr_2_placeOrderNumber;
	@JsonProperty("ei_obr_3_fillerOderNumber")
	private EI_v2 ei_obr_3_fillerOderNumber;
	@JsonProperty("ce_obr_4_universalServiceIdentifier")
	private CE_v2 ce_obr_4_universalServiceIdentifier;
	@JsonProperty("obr_5_priority")
	private String obr_5_priority;
	@JsonProperty("ts_obr_6_requestedDateTime")
	private TS_v2 ts_obr_6_requestedDateTime;
	@JsonProperty("ts_obr_7_observationDateTime")
	private TS_v2 ts_obr_7_observationDateTime;
	@JsonProperty("ts_obr_8_observationEndDateTime")
	private TS_v2 ts_obr_8_observationEndDateTime;
	@JsonProperty("cq_obr_9_collectionVolume")
	private CQ_v23 cq_obr_9_collectionVolume;
	@JsonProperty("xcn_obr_10_collectorIdentifier")
	private XCN_v23[] xcn_obr_10_collectorIdentifier;
	@JsonProperty("obr_11_specimenActionCode")
	private String obr_11_specimenActionCode;
	@JsonProperty("ce_obr_12_dangerCode")
	private CE_v2 ce_obr_12_dangerCode;
	@JsonProperty("obr_13_relevantClinicalInformation")
	private String obr_13_relevantClinicalInformation;
	@JsonProperty("ts_obr_14_specimenReceivedDateTime")
	private TS_v2 ts_obr_14_specimenReceivedDateTime;
	@JsonProperty("cm_sps_obr_15_specimenSource")
	private CM_SPS_v23 cm_sps_obr_15_specimenSource;
	@JsonProperty("xcn_obr_16_orderingProvider")
	private XCN_v23[] xcn_obr_16_orderingProvider;
	@JsonProperty("xtn_obr_17_orderCallbackPhoneNumber")
	private XTN_v23[] xtn_obr_17_orderCallbackPhoneNumber;
	@JsonProperty("obr_18_placerField1")
	private String obr_18_placerField1;
	@JsonProperty("obr_19_placerField2")
	private String obr_19_placerField2;
	@JsonProperty("obr_20_fillerField1")
	private String obr_20_fillerField1;
	@JsonProperty("obr_21_fillerField2")
	private String obr_21_fillerField2;
	@JsonProperty("ts_obr_22_resultsRptStatusChngDateTime")
	private TS_v2 ts_obr_22_resultsRptStatusChngDateTime;
	@JsonProperty("cm_moc_obr_23_chargeToPractice")
	private CM_MOC_v23 cm_moc_obr_23_chargeToPractice;
	@JsonProperty("obr_24_diagnosticServiceSectionId")
	private String obr_24_diagnosticServiceSectionId;
	@JsonProperty("obr_25_resultStatus")
	private String obr_25_resultStatus;
	@JsonProperty("cm_prl_obr_26_parentResult")
	private CM_PRL_v23 cm_prl_obr_26_parentResult;
	@JsonProperty("tq_obr_27_quantityTiming")
	private TQ_v23 tq_obr_27_quantityTiming;
	@JsonProperty("xcn_obr_28_resultCopiesTo")
	private XCN_v23[] xcn_obr_28_resultCopiesTo;
	@JsonProperty("cm_eip_obr_29_parentNumber")
	private CM_EIP_v23 cm_eip_obr_29_parentNumber;
	@JsonProperty("obr_30_transportationMode")
	private String obr_30_ransportationMode;
	@JsonProperty("ce_obr_31_reasonForStudy")
	private CE_v2[] ce_obr_31_reasonForStudy;
	@JsonProperty("cm_ndl_obr_32_principalResultInterpreter")
	private CM_NDL_v23 cm_ndl_obr_32_principalResultInterpreter;
	@JsonProperty("cm_ndl_obr_33_assistantResultInterpreter")
	private CM_NDL_v23[] cm_ndl_obr_33_assistantResultInterpreter;
	@JsonProperty("cm_ndl_obr_34_technician")
	private CM_NDL_v23[] cm_ndl_obr_34_technician;
	@JsonProperty("cm_ndl_obr_35_transcriptionist")
	private CM_NDL_v23[] cm_ndl_obr_35_transcriptionist;
	@JsonProperty("ts_obr_36_scheduledDateTime")
	private TS_v2 ts_obr_36_scheduledDateTime;
	@JsonProperty("obr_37_numberOfSampleContainers")
	private String obr_37_numberOfSampleContainers;
	@JsonProperty("ce_obr_38_transportLogisticsOfCollectedSample")
	private CE_v2[] ce_obr_38_transportLogisticsOfCollectedSample;
	@JsonProperty("ce_obr_39_collectorsComment")
	private CE_v2[] ce_obr_39_collectorsComment;
	@JsonProperty("ce_obr_40_transportArrangementResponsibility")
	private CE_v2 ce_obr_40_transportArrangementResponsibility;
	@JsonProperty("obr_41_transportArranged")
	private String obr_41_transportArranged;
	@JsonProperty("obr_42_escortRequired")
	private String obr_42_escortRequired;
	@JsonProperty("ce_obr_43_plannedPatientTransportComment")
	private CE_v2[] ce_obr_43_plannedPatientTransportComment;
	@JsonProperty("obx")
	private CustomOBX[] obx;
	@JsonProperty("nte")
	private CustomNTE[] nte;
	@JsonProperty("dg1")
	private CustomDG1[] dg1;
	private OBR obr;
	
	
	private CustomOBR(OBR obr, CustomNTE[] nte, CustomOBX[] obx, CustomDG1[] dg1) {
		super();
		this.obx = obx;
		this.obr = obr;
		this.nte = nte;
		this.dg1 = dg1;
	}
	
	public static CustomOBR createDb1WithTypeAndVersion(ORM_O01_ORDER ormOrder) throws HL7Exception, IOException {
		CustomDG1[] dg1Array = new CustomDG1[ormOrder.getORDER_DETAIL().getDG1All().size()];
		int k = 0;
		for(DG1 dg1Object: ormOrder.getORDER_DETAIL().getDG1All()) {
			dg1Array[k] = CustomDG1.createDg1WithTypeAndVersion(dg1Object);
			k++;
		}
		CustomNTE[] nteArray = new CustomNTE[ormOrder.getORDER_DETAIL().getNTEAll().size()];
		int j = 0;
		for(NTE nteObject : ormOrder.getORDER_DETAIL().getNTEAll()) {
			nteArray[j] = CustomNTE.createNteWithTypeAndVersion(nteObject);
			j++;
		}
		CustomOBX[] obxArray = new CustomOBX[ormOrder.getORDER_DETAIL().getOBSERVATIONAll().size()];
		int i = 0;
		for (ORM_O01_OBSERVATION observation: ormOrder.getORDER_DETAIL().getOBSERVATIONAll()) {
			obxArray[i] = CustomOBX.createObxWithTypeAndVersion(observation);
			i++;
		}
		return new CustomOBR(ormOrder.getORDER_DETAIL().getOBR(),nteArray, obxArray, dg1Array);
	}

	public CustomOBR() {
		super();
	}

	/**
	 *	@return the obr_1_setId
	 */
	
	@JsonProperty("obr_1_setId")
	public String getObr_1_setId() {
		return CommonService.getString(this.obr.getObr1_SetIDObservationRequest().getValue());
	}

	/**
	 * @param obr_1_setId the obr_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_1_setId")
	public void setObr_1_setId(String obr_1_setId) throws DataTypeException {
		this.obr.getObr1_SetIDObservationRequest().setValue(obr_1_setId);
		this.obr_1_setId = obr_1_setId;
	}

	/**
	 *	@return the ei_obr_2_placeOrderNumber
	 */
	
	@JsonProperty("ei_obr_2_placeOrderNumber")
	public EI_v2[] getEi_obr_2_placeOrderNumber() {
		EI_v2[] placeOrderNumber = new EI_v2[this.obr.getObr2_PlacerOrderNumber().length];
		for(int i = 0; i<this.obr.getObr2_PlacerOrderNumber().length; i++) {
			placeOrderNumber[i] = CommonService.getEI_v2(this.obr.getObr2_PlacerOrderNumber(i));
		}
		return placeOrderNumber;
	}

	/**
	 * @param ei_obr_2_placeOrderNumber the ei_obr_2_placeOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ei_obr_2_placeOrderNumber")
	public void setEi_obr_2_placeOrderNumber(EI_v2[] ei_obr_2_placeOrderNumber) throws DataTypeException {
		for(int i = 0; i<ei_obr_2_placeOrderNumber.length; i++) {
			CommonService.setEI_v2(this.obr.getObr2_PlacerOrderNumber(i), ei_obr_2_placeOrderNumber[i]);
		}
		this.ei_obr_2_placeOrderNumber = ei_obr_2_placeOrderNumber;
	}

	/**
	 *	@return the ei_obr_3_fillerOderNumber
	 */
	
	@JsonProperty("ei_obr_3_fillerOderNumber")
	public EI_v2 getEi_obr_3_fillerOderNumber() {
		return CommonService.getEI_v2(this.obr.getObr3_FillerOrderNumber());
	}

	/**
	 * @param ei_obr_3_fillerOderNumber the ei_obr_3_fillerOderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ei_obr_3_fillerOderNumber")
	public void setEi_obr_3_fillerOderNumber(EI_v2 ei_obr_3_fillerOderNumber) throws DataTypeException {
		CommonService.setEI_v2(this.obr.getObr3_FillerOrderNumber(), ei_obr_3_fillerOderNumber);
		this.ei_obr_3_fillerOderNumber = ei_obr_3_fillerOderNumber;
	}

	/**
	 *	@return the ce_obr_4_universalServiceIdentifier
	 */
	
	@JsonProperty("ce_obr_4_universalServiceIdentifier")
	public CE_v2 getCe_obr_4_universalServiceIdentifier() {
		return CommonService.getCE_v2(this.obr.getObr4_UniversalServiceIdentifier());
	}

	/**
	 * @param ce_obr_4_universalServiceIdentifier the ce_obr_4_universalServiceIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_4_universalServiceIdentifier")
	public void setCe_obr_4_universalServiceIdentifier(CE_v2 ce_obr_4_universalServiceIdentifier) throws DataTypeException {
		CommonService.setCE_v2(this.obr.getObr4_UniversalServiceIdentifier(), ce_obr_4_universalServiceIdentifier);
		this.ce_obr_4_universalServiceIdentifier = ce_obr_4_universalServiceIdentifier;
	}

	/**
	 *	@return the obr_5_priority
	 */
	
	@JsonProperty("obr_5_priority")
	public String getObr_5_priority() {
		return CommonService.getString(this.obr.getObr5_Priority().getValue());
	}

	/**
	 * @param obr_5_priority the obr_5_priority to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_5_priority")
	public void setObr_5_priority(String obr_5_priority) throws DataTypeException {
		this.obr.getObr5_Priority().setValue(obr_5_priority);
		this.obr_5_priority = obr_5_priority;
	}

	/**
	 *	@return the ts_obr_6_requestedDateTime
	 */
	
	@JsonProperty("ts_obr_6_requestedDateTime")
	public TS_v2 getTs_obr_6_requestedDateTime() {
		return CommonService.getTS_v2(this.obr.getObr6_RequestedDateTime());
	}

	/**
	 * @param ts_obr_6_requestedDateTime the ts_obr_6_requestedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obr_6_requestedDateTime")
	public void setTs_obr_6_requestedDateTime(TS_v2 ts_obr_6_requestedDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.obr.getObr6_RequestedDateTime(), ts_obr_6_requestedDateTime);
		this.ts_obr_6_requestedDateTime = ts_obr_6_requestedDateTime;
	}

	/**
	 *	@return the ts_obr_7_observationDateTime
	 */
	
	@JsonProperty("ts_obr_7_observationDateTime")
	public TS_v2 getTs_obr_7_observationDateTime() {
		return CommonService.getTS_v2(this.obr.getObr7_ObservationDateTime());
	}

	/**
	 * @param ts_obr_7_observationDateTime the ts_obr_7_observationDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obr_7_observationDateTime")
	public void setTs_obr_7_observationDateTime(TS_v2 ts_obr_7_observationDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.obr.getObr7_ObservationDateTime(), ts_obr_7_observationDateTime);
		this.ts_obr_7_observationDateTime = ts_obr_7_observationDateTime;
	}

	/**
	 *	@return the ts_obr_8_observationEndDateTime
	 */
	
	@JsonProperty("ts_obr_8_observationEndDateTime")
	public TS_v2 getTs_obr_8_observationEndDateTime() {
		return CommonService.getTS_v2(this.obr.getObr8_ObservationEndDateTime());
	}

	/**
	 * @param ts_obr_8_observationEndDateTime the ts_obr_8_observationEndDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obr_8_observationEndDateTime")
	public void setTs_obr_8_observationEndDateTime(TS_v2 ts_obr_8_observationEndDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.obr.getObr8_ObservationEndDateTime(), ts_obr_8_observationEndDateTime);
		this.ts_obr_8_observationEndDateTime = ts_obr_8_observationEndDateTime;
	}

	/**
	 *	@return the cq_obr_9_collectionVolume
	 */
	
	@JsonProperty("cq_obr_9_collectionVolume")
	public CQ_v23 getCq_obr_9_collectionVolume() {
		return CommonService.getCQ_v23(this.obr.getObr9_CollectionVolume());
	}

	/**
	 * @param cq_obr_9_collectionVolume the cq_obr_9_collectionVolume to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cq_obr_9_collectionVolume")
	public void setCq_obr_9_collectionVolume(CQ_v23 cq_obr_9_collectionVolume) throws DataTypeException {
		CommonService.setCQ_v23(this.obr.getObr9_CollectionVolume(), cq_obr_9_collectionVolume);
		this.cq_obr_9_collectionVolume = cq_obr_9_collectionVolume;
	}

	/**
	 *	@return the xcn_obr_10_collectorIdentifier
	 */
	
	@JsonProperty("xcn_obr_10_collectorIdentifier")
	public XCN_v23[] getXcn_obr_10_collectorIdentifier() {
		XCN_v23[] collectorIdentifier = new XCN_v23[this.obr.getObr10_CollectorIdentifier().length];
		for(int i = 0; i< this.obr.getObr10_CollectorIdentifier().length; i++) {
			collectorIdentifier[i] = CommonService.getXCN_v23(this.obr.getObr10_CollectorIdentifier(i));
		}
		return collectorIdentifier;
	}

	/**
	 * @param xcn_obr_10_collectorIdentifier the xcn_obr_10_collectorIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_obr_10_collectorIdentifier")
	public void setXcn_obr_10_collectorIdentifier(XCN_v23[] xcn_obr_10_collectorIdentifier) throws DataTypeException {
		for(int i = 0; i< xcn_obr_10_collectorIdentifier.length; i++) {
			CommonService.setXCN_v23(this.obr.getObr10_CollectorIdentifier(i), xcn_obr_10_collectorIdentifier[i]);
		}
		this.xcn_obr_10_collectorIdentifier = xcn_obr_10_collectorIdentifier;
		
	}

	/**
	 *	@return the obr_11_specimenActionCode
	 */
	
	@JsonProperty("obr_11_specimenActionCode")
	public String getObr_11_specimenActionCode() {
		return CommonService.getString(this.obr.getObr11_SpecimenActionCode().getValue());
	}

	/**
	 * @param obr_11_specimenActionCode the obr_11_specimenActionCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_11_specimenActionCode")
	public void setObr_11_specimenActionCode(String obr_11_specimenActionCode) throws DataTypeException {
		this.obr.getObr11_SpecimenActionCode().setValue(obr_11_specimenActionCode);
		this.obr_11_specimenActionCode = obr_11_specimenActionCode;
	}

	/**
	 *	@return the ce_obr_12_dangerCode
	 */
	
	@JsonProperty("ce_obr_12_dangerCode")
	public CE_v2 getCe_obr_12_dangerCode() {
		return CommonService.getCE_v2(this.obr.getObr12_DangerCode());
	}

	/**
	 * @param ce_obr_12_dangerCode the ce_obr_12_dangerCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_12_dangerCode")
	public void setCe_obr_12_dangerCode(CE_v2 ce_obr_12_dangerCode) throws DataTypeException {
		CommonService.setCE_v2(this.obr.getObr12_DangerCode(), ce_obr_12_dangerCode);
		this.ce_obr_12_dangerCode = ce_obr_12_dangerCode;
	}

	/**
	 *	@return the obr_13_relevantClinicalInformation
	 */
	
	@JsonProperty("obr_13_relevantClinicalInformation")
	public String getObr_13_relevantClinicalInformation() {
		return CommonService.getString(this.obr.getObr13_RelevantClinicalInformation().getValue());
	}

	/**
	 * @param obr_13_relevantClinicalInformation the obr_13_relevantClinicalInformation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_13_relevantClinicalInformation")
	public void setObr_13_relevantClinicalInformation(String obr_13_relevantClinicalInformation) throws DataTypeException {
		this.obr.getObr13_RelevantClinicalInformation().setValue(obr_13_relevantClinicalInformation);
		this.obr_13_relevantClinicalInformation = obr_13_relevantClinicalInformation;
	}

	/**
	 *	@return the ts_obr_14_specimenReceivedDateTime
	 */
	
	@JsonProperty("ts_obr_14_specimenReceivedDateTime")
	public TS_v2 getTs_obr_14_specimenReceivedDateTime() {
		return CommonService.getTS_v2(this.obr.getObr14_SpecimenReceivedDateTime());
	}

	/**
	 * @param ts_obr_14_specimenReceivedDateTime the ts_obr_14_specimenReceivedDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obr_14_specimenReceivedDateTime")
	public void setTs_obr_14_specimenReceivedDateTime(TS_v2 ts_obr_14_specimenReceivedDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.obr.getObr14_SpecimenReceivedDateTime(), ts_obr_14_specimenReceivedDateTime);
		this.ts_obr_14_specimenReceivedDateTime = ts_obr_14_specimenReceivedDateTime;
	}

	/**
	 *	@return the cm_sps_obr_15_specimenSource
	 */
	
	@JsonProperty("cm_sps_obr_15_specimenSource")
	public CM_SPS_v23 getCm_sps_obr_15_specimenSource() {
		return CommonService.getCM_SPS_v23(this.obr.getObr15_SpecimenSource());
	}

	/**
	 * @param cm_sps_obr_15_specimenSource the cm_sps_obr_15_specimenSource to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_sps_obr_15_specimenSource")
	public void setCm_sps_obr_15_specimenSource(CM_SPS_v23 cm_sps_obr_15_specimenSource) throws DataTypeException {
		CommonService.setCM_SPS_v23(this.obr.getObr15_SpecimenSource(), cm_sps_obr_15_specimenSource);
		this.cm_sps_obr_15_specimenSource = cm_sps_obr_15_specimenSource;
	}

	/**
	 *	@return the xcn_obr_16_orderingProvider
	 */
	
	@JsonProperty("xcn_obr_16_orderingProvider")
	public XCN_v23[] getXcn_obr_16_orderingProvider() {
		XCN_v23[] orderingProvider = new XCN_v23[this.obr.getObr16_OrderingProvider().length];
		for(int i = 0; i<this.obr.getObr16_OrderingProvider().length;i++) {
			orderingProvider[i] = CommonService.getXCN_v23(this.obr.getObr16_OrderingProvider(i));
		}
		return orderingProvider;
	}

	/**
	 * @param xcn_obr_16_orderingProvider the xcn_obr_16_orderingProvider to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_obr_16_orderingProvider")
	public void setXcn_obr_16_orderingProvider(XCN_v23[] xcn_obr_16_orderingProvider) throws DataTypeException {
		for(int i = 0; i<xcn_obr_16_orderingProvider.length;i++) {
			CommonService.setXCN_v23(this.obr.getObr16_OrderingProvider(i), xcn_obr_16_orderingProvider[i]);
		}
		this.xcn_obr_16_orderingProvider = xcn_obr_16_orderingProvider;
	}

	/**
	 *	@return the xtn_obr_17_orderCallbackPhoneNumber
	 */
	
	@JsonProperty("xtn_obr_17_orderCallbackPhoneNumber")
	public XTN_v23[] getXtn_obr_17_orderCallbackPhoneNumber() {
		XTN_v23[] orderCallbackPhoneNumber =new XTN_v23[this.obr.getObr17_OrderCallbackPhoneNumber().length];
		for(int i =0;i<this.obr.getObr17_OrderCallbackPhoneNumber().length; i++) {
			orderCallbackPhoneNumber[i] = CommonService.getXTN_v23(this.obr.getObr17_OrderCallbackPhoneNumber(i));
		}
		return orderCallbackPhoneNumber;
	}

	/**
	 * @param xtn_obr_17_orderCallbackPhoneNumber the xtn_obr_17_orderCallbackPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_obr_17_orderCallbackPhoneNumber")
	public void setXtn_obr_17_orderCallbackPhoneNumber(XTN_v23[] xtn_obr_17_orderCallbackPhoneNumber) throws DataTypeException {
		for(int i =0;i<xtn_obr_17_orderCallbackPhoneNumber.length; i++) {
			CommonService.setXTN_v23(this.obr.getObr17_OrderCallbackPhoneNumber(i), xtn_obr_17_orderCallbackPhoneNumber[i]);
		}
		this.xtn_obr_17_orderCallbackPhoneNumber = xtn_obr_17_orderCallbackPhoneNumber;
	}

	/**
	 *	@return the obr_18_placerField1
	 */
	
	@JsonProperty("obr_18_placerField1")
	public String getObr_18_placerField1() {
		return CommonService.getString(this.obr.getObr18_PlacerField1().getValue());
	}

	/**
	 * @param obr_18_placerField1 the obr_18_placerField1 to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_18_placerField1")
	public void setObr_18_placerField1(String obr_18_placerField1) throws DataTypeException {
		this.obr.getObr18_PlacerField1().setValue(obr_18_placerField1);
		this.obr_18_placerField1 = obr_18_placerField1;
	}

	/**
	 *	@return the obr_19_placerField2
	 */
	
	@JsonProperty("obr_19_placerField2")
	public String getObr_19_placerField2() {
		return CommonService.getString(this.obr.getObr19_PlacerField2().getValue());
	}

	/**
	 * @param obr_19_placerField2 the obr_19_placerField2 to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_19_placerField2")
	public void setObr_19_placerField2(String obr_19_placerField2) throws DataTypeException {
		this.obr.getObr19_PlacerField2().setValue(obr_19_placerField2);
		this.obr_19_placerField2 = obr_19_placerField2;
	}

	/**
	 *	@return the obr_20_fillerField1
	 */
	
	@JsonProperty("obr_20_fillerField1")
	public String getObr_20_fillerField1() {
		return CommonService.getString(this.obr.getObr20_FillerField1().getValue());
	}

	/**
	 * @param obr_20_fillerField1 the obr_20_fillerField1 to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_20_fillerField1")
	public void setObr_20_fillerField1(String obr_20_fillerField1) throws DataTypeException {
		this.obr.getObr20_FillerField1().setValue(obr_20_fillerField1);
		this.obr_20_fillerField1 = obr_20_fillerField1;
	}

	/**
	 *	@return the obr_21_fillerField2
	 */
	
	@JsonProperty("obr_21_fillerField2")
	public String getObr_21_fillerField2() {
		return CommonService.getString(this.obr.getObr21_FillerField2().getValue());
	}

	/**
	 * @param obr_21_fillerField2 the obr_21_fillerField2 to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_21_fillerField2")
	public void setObr_21_fillerField2(String obr_21_fillerField2) throws DataTypeException {
		this.obr.getObr21_FillerField2().setValue(obr_21_fillerField2);
		this.obr_21_fillerField2 = obr_21_fillerField2;
	}

	/**
	 *	@return the ts_obr_22_resultsRptStatusChngDateTime
	 */
	
	@JsonProperty("ts_obr_22_resultsRptStatusChngDateTime")
	public TS_v2 getTs_obr_22_resultsRptStatusChngDateTime() {
		return CommonService.getTS_v2(this.obr.getObr22_ResultsRptStatusChngDateTime());
	}

	/**
	 * @param ts_obr_22_resultsRptStatusChngDateTime the ts_obr_22_resultsRptStatusChngDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obr_22_resultsRptStatusChngDateTime")
	public void setTs_obr_22_resultsRptStatusChngDateTime(TS_v2 ts_obr_22_resultsRptStatusChngDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.obr.getObr22_ResultsRptStatusChngDateTime(), ts_obr_22_resultsRptStatusChngDateTime);
		this.ts_obr_22_resultsRptStatusChngDateTime = ts_obr_22_resultsRptStatusChngDateTime;
	}

	/**
	 *	@return the cm_moc_obr_23_chargeToPractice
	 */
	
	@JsonProperty("cm_moc_obr_23_chargeToPractice")
	public CM_MOC_v23 getCm_moc_obr_23_chargeToPractice() {
		return CommonService.getCM_MOC_v23(this.obr.getObr23_ChargeToPractice());
	}

	/**
	 * @param cm_moc_obr_23_chargeToPractice the cm_moc_obr_23_chargeToPractice to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_moc_obr_23_chargeToPractice")
	public void setCm_moc_obr_23_chargeToPractice(CM_MOC_v23 cm_moc_obr_23_chargeToPractice) throws DataTypeException {
		CommonService.setCM_MOC_v23(this.obr.getObr23_ChargeToPractice(), cm_moc_obr_23_chargeToPractice);
		this.cm_moc_obr_23_chargeToPractice = cm_moc_obr_23_chargeToPractice;
	}

	/**
	 *	@return the obr_24_diagnosticServiceSectionId
	 */
	
	@JsonProperty("obr_24_diagnosticServiceSectionId")
	public String getObr_24_diagnosticServiceSectionId() {
		return CommonService.getString(this.obr.getObr24_DiagnosticServiceSectionID().getValue());
	}

	/**
	 * @param obr_24_diagnosticServiceSectionId the obr_24_diagnosticServiceSectionId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_24_diagnosticServiceSectionId")
	public void setObr_24_diagnosticServiceSectionId(String obr_24_diagnosticServiceSectionId) throws DataTypeException {
		this.obr.getObr24_DiagnosticServiceSectionID().setValue(obr_24_diagnosticServiceSectionId);
		this.obr_24_diagnosticServiceSectionId = obr_24_diagnosticServiceSectionId;
	}

	/**
	 *	@return the obr_25_resultStatus
	 */
	
	@JsonProperty("obr_25_resultStatus")
	public String getObr_25_resultStatus() {
		return CommonService.getString(this.obr.getObr25_ResultStatus().getValue());
	}

	/**
	 * @param obr_25_resultStatus the obr_25_resultStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_25_resultStatus")
	public void setObr_25_resultStatus(String obr_25_resultStatus) throws DataTypeException {
		this.obr.getObr25_ResultStatus().setValue(obr_25_resultStatus);
		this.obr_25_resultStatus = obr_25_resultStatus;
	}

	/**
	 *	@return the cm_prl_obr_26_parentResult
	 */
	
	@JsonProperty("cm_prl_obr_26_parentResult")
	public CM_PRL_v23 getCm_prl_obr_26_parentResult() {
		return CommonService.getCM_PRL_v23(this.obr.getObr26_ParentResult());
	}

	/**
	 * @param cm_prl_obr_26_parentResult the cm_prl_obr_26_parentResult to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_prl_obr_26_parentResult")
	public void setCm_prl_obr_26_parentResult(CM_PRL_v23 cm_prl_obr_26_parentResult) throws DataTypeException {
		CommonService.setCM_PRL_v23(this.obr.getObr26_ParentResult(), cm_prl_obr_26_parentResult);
		this.cm_prl_obr_26_parentResult = cm_prl_obr_26_parentResult;
	}

	/**
	 *	@return the tq_obr_27_quantityTiming
	 */
	
	@JsonProperty("tq_obr_27_quantityTiming")
	public TQ_v23 getTq_obr_27_quantityTiming() {
		return CommonService.getTQ_v23(this.obr.getObr27_QuantityTiming());
	}

	/**
	 * @param tq_obr_27_quantityTiming the tq_obr_27_quantityTiming to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("tq_obr_27_quantityTiming")
	public void setTq_obr_27_quantityTiming(TQ_v23 tq_obr_27_quantityTiming) throws DataTypeException {
		CommonService.setTQ_v23(this.obr.getObr27_QuantityTiming(), tq_obr_27_quantityTiming);
		this.tq_obr_27_quantityTiming = tq_obr_27_quantityTiming;
	}

	/**
	 *	@return the xcn_obr_28_resultCopiesTo
	 *	@JsonProperty("xcn_obr_28_resultCopiesTo")
	 */
	
	public XCN_v23[] getXcn_obr_28_resultCopiesTo() {
		XCN_v23[] resultCopiesTo = new XCN_v23[this.obr.getObr28_ResultCopiesTo().length];
		for(int i = 0; i<this.obr.getObr28_ResultCopiesTo().length; i++) {
			resultCopiesTo[i] = CommonService.getXCN_v23(this.obr.getObr28_ResultCopiesTo(i));
		}
		return resultCopiesTo;
	}

	/**
	 * @param xcn_obr_28_resultCopiesTo the xcn_obr_28_resultCopiesTo to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_obr_28_resultCopiesTo")
	public void setXcn_obr_28_resultCopiesTo(XCN_v23[] xcn_obr_28_resultCopiesTo) throws DataTypeException {
		for(int i = 0; i<xcn_obr_28_resultCopiesTo.length; i++) {
			CommonService.setXCN_v23(this.obr.getObr28_ResultCopiesTo(i), xcn_obr_28_resultCopiesTo[i]);
		}
		this.xcn_obr_28_resultCopiesTo = xcn_obr_28_resultCopiesTo;
	}

	/**
	 *	@return the cm_eip_obr_29_parentNumber
	 */
	
	@JsonProperty("cm_eip_obr_29_parentNumber")
	public CM_EIP_v23 getCm_eip_obr_29_parentNumber() {
		return CommonService.getCM_EIP_v23(this.obr.getObr29_ParentNumber());
	}

	/**
	 * @param cm_eip_obr_29_parentNumber the cm_eip_obr_29_parentNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_eip_obr_29_parentNumber")
	public void setCm_eip_obr_29_parentNumber(CM_EIP_v23 cm_eip_obr_29_parentNumber) throws DataTypeException {
		CommonService.setCM_EIP_v23(this.obr.getObr29_ParentNumber(), cm_eip_obr_29_parentNumber);
		this.cm_eip_obr_29_parentNumber = cm_eip_obr_29_parentNumber;
	}

	/**
	 *	@return the obr_30_ransportationMode
	 */
	
	@JsonProperty("obr_30_transportationMode")
	public String getObr_30_ransportationMode() {
		return CommonService.getString(this.obr.getObr30_TransportationMode().getValue());
	}

	/**
	 * @param obr_30_ransportationMode the obr_30_ransportationMode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_30_transportationMode")
	public void setObr_30_ransportationMode(String obr_30_ransportationMode) throws DataTypeException {
		this.obr.getObr30_TransportationMode().setValue(obr_30_ransportationMode);
		this.obr_30_ransportationMode = obr_30_ransportationMode;
	}

	/**
	 *	@return the ce_obr_31_reasonForStudy
	 */
	
	@JsonProperty("ce_obr_31_reasonForStudy")
	public CE_v2[] getCe_obr_31_reasonForStudy() {
		CE_v2[] reasonForStudy = new CE_v2[this.obr.getObr31_ReasonForStudy().length];
		for(int i = 0; i<this.obr.getObr31_ReasonForStudy().length; i++ ) {
			reasonForStudy[i]=CommonService.getCE_v2(this.obr.getObr31_ReasonForStudy(i));
		}
		return reasonForStudy;
	}

	/**
	 * @param ce_obr_31_reasonForStudy the ce_obr_31_reasonForStudy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_31_reasonForStudy")
	public void setCe_obr_31_reasonForStudy(CE_v2[] ce_obr_31_reasonForStudy) throws DataTypeException {
		for(int i = 0; i<ce_obr_31_reasonForStudy.length; i++ ) {
			CommonService.setCE_v2(this.obr.getObr31_ReasonForStudy(i), ce_obr_31_reasonForStudy[i]);
		}
		this.ce_obr_31_reasonForStudy = ce_obr_31_reasonForStudy;
	}

	/**
	 *	@return the cm_ndl_obr_32_principalResultInterpreter
	 */
	
	@JsonProperty("cm_ndl_obr_32_principalResultInterpreter")
	public CM_NDL_v23 getCm_ndl_obr_32_principalResultInterpreter() {
		return CommonService.getCM_NDL_v23(this.obr.getObr32_PrincipalResultInterpreter());
	}

	/**
	 * @param cm_ndl_obr_32_principalResultInterpreter the cm_ndl_obr_32_principalResultInterpreter to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_ndl_obr_32_principalResultInterpreter")
	public void setCm_ndl_obr_32_principalResultInterpreter(CM_NDL_v23 cm_ndl_obr_32_principalResultInterpreter) throws DataTypeException {
		CommonService.setCM_NDL_v23(this.obr.getObr32_PrincipalResultInterpreter(), cm_ndl_obr_32_principalResultInterpreter);
		this.cm_ndl_obr_32_principalResultInterpreter = cm_ndl_obr_32_principalResultInterpreter;
	}

	/**
	 *	@return the cm_ndl_obr_33_assistantResultInterpreter
	 */
	
	@JsonProperty("cm_ndl_obr_33_assistantResultInterpreter")
	public CM_NDL_v23[] getCm_ndl_obr_33_assistantResultInterpreter() {
		CM_NDL_v23[] assistantResultInterpreter = new CM_NDL_v23[this.obr.getObr33_AssistantResultInterpreter().length];
		for(int i = 0; i<this.obr.getObr33_AssistantResultInterpreter().length;i++) {
			assistantResultInterpreter[i] =CommonService.getCM_NDL_v23(this.obr.getObr33_AssistantResultInterpreter(i));
		}
		return assistantResultInterpreter;
	}

	/**
	 * @param cm_ndl_obr_33_assistantResultInterpreter the cm_ndl_obr_33_assistantResultInterpreter to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_ndl_obr_33_assistantResultInterpreter")
	public void setCm_ndl_obr_33_assistantResultInterpreter(CM_NDL_v23[] cm_ndl_obr_33_assistantResultInterpreter) throws DataTypeException {
		for(int i = 0; i<cm_ndl_obr_33_assistantResultInterpreter.length;i++) {
			CommonService.setCM_NDL_v23(this.obr.getObr33_AssistantResultInterpreter(i), cm_ndl_obr_33_assistantResultInterpreter[i]);
		}
		this.cm_ndl_obr_33_assistantResultInterpreter = cm_ndl_obr_33_assistantResultInterpreter;
	}

	/**
	 *	@return the cm_ndl_obr_34_technician
	 */
	
	@JsonProperty("cm_ndl_obr_34_technician")
	public CM_NDL_v23[] getCm_ndl_obr_34_technician() {
		CM_NDL_v23[] technician = new CM_NDL_v23[this.obr.getObr34_Technician().length];
		for(int i = 0; i<this.obr.getObr34_Technician().length;i++) {
			technician[i] =CommonService.getCM_NDL_v23(this.obr.getObr34_Technician(i));
		}
		return technician;
	}

	/**
	 * @param cm_ndl_obr_34_technician the cm_ndl_obr_34_technician to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_ndl_obr_34_technician")
	public void setCm_ndl_obr_34_technician(CM_NDL_v23[] cm_ndl_obr_34_technician) throws DataTypeException {
		for(int i = 0; i<cm_ndl_obr_34_technician.length;i++) {
			CommonService.setCM_NDL_v23(this.obr.getObr34_Technician(i), cm_ndl_obr_34_technician[i]);
		}
		this.cm_ndl_obr_34_technician = cm_ndl_obr_34_technician;
	}

	/**
	 *	@return the cm_ndl_obr_35_transcriptionist
	 */
	
	@JsonProperty("cm_ndl_obr_35_transcriptionist")
	public CM_NDL_v23[] getCm_ndl_obr_35_transcriptionist() {
		CM_NDL_v23[] transcriptionist = new CM_NDL_v23[this.obr.getObr35_Transcriptionist().length];
		for(int i = 0; i<this.obr.getObr35_Transcriptionist().length;i++) {
			transcriptionist[i] =CommonService.getCM_NDL_v23(this.obr.getObr35_Transcriptionist(i));
		}
		return transcriptionist;
	}

	/**
	 * @param cm_ndl_obr_35_transcriptionist the cm_ndl_obr_35_transcriptionist to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_ndl_obr_35_transcriptionist")
	public void setCm_ndl_obr_35_transcriptionist(CM_NDL_v23[] cm_ndl_obr_35_transcriptionist) throws DataTypeException {
		for(int i = 0; i<cm_ndl_obr_35_transcriptionist.length;i++) {
			CommonService.setCM_NDL_v23(this.obr.getObr35_Transcriptionist(i), cm_ndl_obr_35_transcriptionist[i]);
		}
		this.cm_ndl_obr_35_transcriptionist = cm_ndl_obr_35_transcriptionist;
	}

	/**
	 *	@return the ts_obr_36_scheduledDateTime
	 */
	
	@JsonProperty("ts_obr_36_scheduledDateTime")
	public TS_v2 getTs_obr_36_scheduledDateTime() {
		return CommonService.getTS_v2(this.obr.getObr36_ScheduledDateTime());
	}

	/**
	 * @param ts_obr_36_scheduledDateTime the ts_obr_36_scheduledDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obr_36_scheduledDateTime")
	public void setTs_obr_36_scheduledDateTime(TS_v2 ts_obr_36_scheduledDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.obr.getObr36_ScheduledDateTime(), ts_obr_36_scheduledDateTime);
		this.ts_obr_36_scheduledDateTime = ts_obr_36_scheduledDateTime;
	}

	/**
	 *	@return the obr_37_numberOfSampleContainers
	 */
	
	@JsonProperty("obr_37_numberOfSampleContainers")
	public String getObr_37_numberOfSampleContainers() {
		return CommonService.getString(this.obr.getObr37_NumberOfSampleContainers().getValue());
	}

	/**
	 * @param obr_37_numberOfSampleContainers the obr_37_numberOfSampleContainers to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_37_numberOfSampleContainers")
	public void setObr_37_numberOfSampleContainers(String obr_37_numberOfSampleContainers) throws DataTypeException {
		this.obr.getObr37_NumberOfSampleContainers().setValue(obr_37_numberOfSampleContainers);
		this.obr_37_numberOfSampleContainers = obr_37_numberOfSampleContainers;
	}

	/**
	 *	@return the ce_obr_38_transportLogisticsOfCollectedSample
	 */
	
	@JsonProperty("ce_obr_38_transportLogisticsOfCollectedSample")
	public CE_v2[] getCe_obr_38_transportLogisticsOfCollectedSample() {
		CE_v2[] transportLogisticsOfCollectedSample = new CE_v2[this.obr.getObr38_TransportLogisticsOfCollectedSample().length];
		for(int i = 0; i<this.obr.getObr38_TransportLogisticsOfCollectedSample().length; i++) {
			transportLogisticsOfCollectedSample[i] = CommonService.getCE_v2(this.obr.getObr38_TransportLogisticsOfCollectedSample(i));
		}
		return transportLogisticsOfCollectedSample;
	}

	/**
	 * @param ce_obr_38_transportLogisticsOfCollectedSample the ce_obr_38_transportLogisticsOfCollectedSample to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_38_transportLogisticsOfCollectedSample")
	public void setCe_obr_38_transportLogisticsOfCollectedSample(CE_v2[] ce_obr_38_transportLogisticsOfCollectedSample) throws DataTypeException {
		for(int i = 0; i<ce_obr_38_transportLogisticsOfCollectedSample.length; i++) {
			CommonService.setCE_v2(this.obr.getObr38_TransportLogisticsOfCollectedSample(i), ce_obr_38_transportLogisticsOfCollectedSample[i]);
		}
		this.ce_obr_38_transportLogisticsOfCollectedSample = ce_obr_38_transportLogisticsOfCollectedSample;
	}

	/**
	 *	@return the ce_obr_39_collectorsComment
	 */
	
	@JsonProperty("ce_obr_39_collectorsComment")
	public CE_v2[] getCe_obr_39_collectorsComment() {
		CE_v2[] collectorsComment = new CE_v2[this.obr.getObr39_CollectorSComment().length];
		for(int i = 0; i<this.obr.getObr39_CollectorSComment().length; i++) {
			collectorsComment[i] = CommonService.getCE_v2(this.obr.getObr39_CollectorSComment(i));
		}
		return collectorsComment;
	}

	/**
	 * @param ce_obr_39_collectorsComment the ce_obr_39_collectorsComment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_39_collectorsComment")
	public void setCe_obr_39_collectorsComment(CE_v2[] ce_obr_39_collectorsComment) throws DataTypeException {
		for(int i = 0; i<ce_obr_39_collectorsComment.length; i++) {
			CommonService.setCE_v2(this.obr.getObr39_CollectorSComment(i), ce_obr_39_collectorsComment[i]);
		}
		this.ce_obr_39_collectorsComment = ce_obr_39_collectorsComment;
	}

	/**
	 *	@return the ce_obr_40_transportArrangementResponsibility
	 */
	
	@JsonProperty("ce_obr_40_transportArrangementResponsibility")
	public CE_v2 getCe_obr_40_transportArrangementResponsibility() {
		return CommonService.getCE_v2(this.obr.getObr40_TransportArrangementResponsibility());
	}

	/**
	 * @param ce_obr_40_transportArrangementResponsibility the ce_obr_40_transportArrangementResponsibility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_40_transportArrangementResponsibility")
	public void setCe_obr_40_transportArrangementResponsibility(CE_v2 ce_obr_40_transportArrangementResponsibility) throws DataTypeException {
		CommonService.setCE_v2(this.obr.getObr40_TransportArrangementResponsibility(), ce_obr_40_transportArrangementResponsibility);
		this.ce_obr_40_transportArrangementResponsibility = ce_obr_40_transportArrangementResponsibility;
	}

	/**
	 *	@return the obr_41_transportArranged
	 */
	
	@JsonProperty("obr_41_transportArranged")
	public String getObr_41_transportArranged() {
		return CommonService.getString(this.obr.getObr41_TransportArranged().getValue());
	}

	/**
	 * @param obr_41_transportArranged the obr_41_transportArranged to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_41_transportArranged")
	public void setObr_41_transportArranged(String obr_41_transportArranged) throws DataTypeException {
		this.obr.getObr41_TransportArranged().setValue(obr_41_transportArranged);
		this.obr_41_transportArranged = obr_41_transportArranged;
	}

	/**
	 *	@return the obr_42_escortRequired
	 */
	
	@JsonProperty("obr_42_escortRequired")
	public String getObr_42_escortRequired() {
		return CommonService.getString(this.obr.getObr42_EscortRequired().getValue());
	}

	/**
	 * @param obr_42_escortRequired the obr_42_escortRequired to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obr_42_escortRequired")
	public void setObr_42_escortRequired(String obr_42_escortRequired) throws DataTypeException {
		this.obr.getObr42_EscortRequired().setValue(obr_42_escortRequired);
		this.obr_42_escortRequired = obr_42_escortRequired;
	}

	/**
	 *	@return the ce_obr_43_plannedPatientTransportComment
	 */
	
	@JsonProperty("ce_obr_43_plannedPatientTransportComment")
	public CE_v2[] getCe_obr_43_plannedPatientTransportComment() {
		CE_v2[] plannedPatientTransportComment = new CE_v2[this.obr.getObr43_PlannedPatientTransportComment().length];
		for(int i = 0; i <this.obr.getObr43_PlannedPatientTransportComment().length; i++) {
			plannedPatientTransportComment[i]=CommonService.getCE_v2(this.obr.getObr43_PlannedPatientTransportComment(i));
		}
		return plannedPatientTransportComment;
	}

	/**
	 * @param ce_obr_43_plannedPatientTransportComment the ce_obr_43_plannedPatientTransportComment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obr_43_plannedPatientTransportComment")
	public void setCe_obr_43_plannedPatientTransportComment(CE_v2[] ce_obr_43_plannedPatientTransportComment) throws DataTypeException {
		for(int i = 0; i <ce_obr_43_plannedPatientTransportComment.length; i++) {
			CommonService.setCE_v2(this.obr.getObr43_PlannedPatientTransportComment(i), ce_obr_43_plannedPatientTransportComment[i]);
		}
		this.ce_obr_43_plannedPatientTransportComment = ce_obr_43_plannedPatientTransportComment;
	}

	/**
	 *	@return the obx
	 *	@JsonProperty("obx")
	 */
	
	public CustomOBX[] getObx() {
		return obx==null?new CustomOBX[] {}:obx;
	}

	/**
	 * @param obx the obx to set
	 * @JsonProperty("obx")
	 */
	public void setObx(CustomOBX[] obx) {
		this.obx = obx;
	}

	/**
	 *	@return the nte
	 *	@JsonProperty("nte")
	 */
	
	public CustomNTE[] getNte() {
		return nte==null?new CustomNTE[] {}:nte;
	}

	/**
	 * @param nte the nte to set
	 * @JsonProperty("nte")
	 */
	public void setNte(CustomNTE[] nte) {
		this.nte = nte;
	}

	/**
	 *	@return the dg1
	 *	@JsonProperty("dg1")
	 */
	
	public CustomDG1[] getDg1() {
		return dg1==null?new CustomDG1[] {}:dg1;
	}

	/**
	 * @param dg1 the dg1 to set
	 * @JsonProperty("dg1")
	 */
	public void setDg1(CustomDG1[] dg1) {
		this.dg1 = dg1;
	}
}