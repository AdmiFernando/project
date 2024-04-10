package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_ORDER;
import ca.uhn.hl7v2.model.v23.segment.ORC;
import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_EIP_v23;
import scratch.coding.models.v23.PL_v23;
import scratch.coding.models.v23.TQ_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XTN_v23;
import scratch.coding.services.CommonService;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomORC implements Serializable {
	@JsonProperty("orc_1_orderControl")
	private String orc_1_orderControl;
	@JsonProperty("ei_orc_2_placerOrderNumber")
	private EI_v2[] ei_orc_2_placerOrderNumber;
	@JsonProperty("ei_orc_3_fillerOrderNumber")
	private EI_v2 ei_orc_3_fillerOrderNumber;
	@JsonProperty("ei_orc_4_placerGroupNumber")
	private EI_v2 ei_orc_4_placerGroupNumber;
	@JsonProperty("orc_5_orderStatus")
	private String orc_5_orderStatus;
	@JsonProperty("orc_6_responseFlag")
	private String orc_6_responseFlag;
	@JsonProperty("tq_orc_7_quantityTiming")
	private TQ_v23 tq_orc_7_quantityTiming;
	@JsonProperty("cm_eip_orc_8_parentOrder")
	private CM_EIP_v23 cm_eip_orc_8_parentOrder;
	@JsonProperty("ts_orc_9_dateTimeOfTransaction")
	private TS_v2 ts_orc_9_dateTimeOfTransaction;
	@JsonProperty("xcn_orc_10_enteredBy")
	private XCN_v23 xcn_orc_10_enteredBy;
	@JsonProperty("xcn_orc_11_verifiedBy")
	private XCN_v23 xcn_orc_11_verifiedBy;
	@JsonProperty("xcn_orc_12_orderingProvider")
	private XCN_v23[] xcn_orc_12_orderingProvider;
	@JsonProperty("pl_orc_13_entererSLocation")
	private PL_v23 pl_orc_13_entererSLocation;
	@JsonProperty("xtn_orc_14_callBackPhoneNumber")
	private XTN_v23[] xtn_orc_14_callBackPhoneNumber;
	@JsonProperty("ts_orc_15_orderEffectiveDateTime")
	private TS_v2 ts_orc_15_orderEffectiveDateTime;
	@JsonProperty("ce_orc_16_orderControlCodeReason")
	private CE_v2 ce_orc_16_orderControlCodeReason;
	@JsonProperty("ce_orc_17_enteringOrganization")
	private CE_v2 ce_orc_17_enteringOrganization;
	@JsonProperty("ce_orc_18_enteringDevice")
	private CE_v2 ce_orc_18_enteringDevice;
	@JsonProperty("xcn_orc_19_actionBy")
	private XCN_v23 xcn_orc_19_actionBy;
	@JsonProperty("obr_orc")
	private CustomOBR obr_orc;
	
	private ORC orc;
	
	private CustomORC(ORC orc, CustomOBR obr_orc) {
		super();
		this.orc =orc;
		this.obr_orc = obr_orc;
	}
	public static CustomORC createOrc(ORM_O01_ORDER orc) throws HL7Exception, IOException {
		return new CustomORC(orc.getORC(), CustomOBR.createDb1WithTypeAndVersion(orc));
	}
	/**
	 *	@return the orc_1_orderControl
	 */
	
	@JsonProperty("orc_1_orderControl")
	public String getOrc_1_orderControl() {
		return CommonService.getString(this.orc.getOrc1_OrderControl().getValue());
	}
	/**
	 * @param orc_1_orderControl the orc_1_orderControl to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_1_orderControl")
	public void setOrc_1_orderControl(String orc_1_orderControl) throws DataTypeException {
		this.orc.getOrc1_OrderControl().setValue(orc_1_orderControl);
		this.orc_1_orderControl = orc_1_orderControl;
	}
	/**
	 *	@return the ei_orc_2_placerOrderNumber
	 */
	
	@JsonProperty("ei_orc_2_placerOrderNumber")
	public EI_v2[] getEi_orc_2_placerOrderNumber() {
		EI_v2[] placerOrderNumber = new EI_v2[this.orc.getOrc2_PlacerOrderNumber().length];
		for(int i = 0;i<this.orc.getOrc2_PlacerOrderNumber().length;i++) {
			placerOrderNumber[i]=CommonService.getEI_v2(this.orc.getOrc2_PlacerOrderNumber(i));
		}
		return placerOrderNumber;
	}
	/**
	 * @param ei_orc_2_placerOrderNumber the ei_orc_2_placerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ei_orc_2_placerOrderNumber")
	public void setEi_orc_2_placerOrderNumber(EI_v2[] ei_orc_2_placerOrderNumber) throws DataTypeException {
		for(int i = 0;i<ei_orc_2_placerOrderNumber.length;i++) {
			CommonService.setEI_v2(this.orc.getOrc2_PlacerOrderNumber(i), ei_orc_2_placerOrderNumber[i]);
		}
		this.ei_orc_2_placerOrderNumber = ei_orc_2_placerOrderNumber;
	}
	/**
	 *	@return the ei_orc_3_fillerOrderNumber
	 */
	
	@JsonProperty("ei_orc_3_fillerOrderNumber")
	public EI_v2 getEi_orc_3_fillerOrderNumber() {
		return CommonService.getEI_v2(this.orc.getOrc3_FillerOrderNumber());
	}
	/**
	 * @param ei_orc_3_fillerOrderNumber the ei_orc_3_fillerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ei_orc_3_fillerOrderNumber")
	public void setEi_orc_3_fillerOrderNumber(EI_v2 ei_orc_3_fillerOrderNumber) throws DataTypeException {
		CommonService.setEI_v2(this.orc.getOrc3_FillerOrderNumber(), ei_orc_3_fillerOrderNumber);
		this.ei_orc_3_fillerOrderNumber = ei_orc_3_fillerOrderNumber;
	}
	/**
	 *	@return the ei_orc_4_placerGroupNumber
	 */
	
	@JsonProperty("ei_orc_4_placerGroupNumber")
	public EI_v2 getEi_orc_4_placerGroupNumber() {
		return CommonService.getEI_v2(this.orc.getOrc4_PlacerGroupNumber());
	}
	/**
	 * @param ei_orc_4_placerGroupNumber the ei_orc_4_placerGroupNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ei_orc_4_placerGroupNumber")
	public void setEi_orc_4_placerGroupNumber(EI_v2 ei_orc_4_placerGroupNumber) throws DataTypeException {
		CommonService.setEI_v2(this.orc.getOrc4_PlacerGroupNumber(), ei_orc_4_placerGroupNumber);
		this.ei_orc_4_placerGroupNumber = ei_orc_4_placerGroupNumber;
	}
	/**
	 *	@return the orc_5_orderStatus
	 */
	
	@JsonProperty("orc_5_orderStatus")
	public String getOrc_5_orderStatus() {
		return CommonService.getString(this.orc.getOrc5_OrderStatus().getValue());
	}
	/**
	 * @param orc_5_orderStatus the orc_5_orderStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_5_orderStatus")
	public void setOrc_5_orderStatus(String orc_5_orderStatus) throws DataTypeException {
		this.orc.getOrc5_OrderStatus().setValue(orc_5_orderStatus);
		this.orc_5_orderStatus = orc_5_orderStatus;
	}
	/**
	 *	@return the orc_6_responseFlag
	 */
	
	@JsonProperty("orc_6_responseFlag")
	public String getOrc_6_responseFlag() {
		return CommonService.getString(this.orc.getOrc6_ResponseFlag().getValue());
	}
	/**
	 * @param orc_6_responseFlag the orc_6_responseFlag to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_6_responseFlag")
	public void setOrc_6_responseFlag(String orc_6_responseFlag) throws DataTypeException {
		this.orc.getOrc6_ResponseFlag().setValue(orc_6_responseFlag);
		this.orc_6_responseFlag = orc_6_responseFlag;
	}
	/**
	 *	@return the tq_orc_7_quantityTiming
	 */
	
	@JsonProperty("tq_orc_7_quantityTiming")
	public TQ_v23 getTq_orc_7_quantityTiming() {
		return CommonService.getTQ_v23(this.orc.getOrc7_QuantityTiming());
	}
	/**
	 * @param tq_orc_7_quantityTiming the tq_orc_7_quantityTiming to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("tq_orc_7_quantityTiming")
	public void setTq_orc_7_quantityTiming(TQ_v23 tq_orc_7_quantityTiming) throws DataTypeException {
		CommonService.setTQ_v23(this.orc.getOrc7_QuantityTiming(), tq_orc_7_quantityTiming);
		this.tq_orc_7_quantityTiming = tq_orc_7_quantityTiming;
	}
	/**
	 *	@return the cm_eip_orc_8_parentOrder
	 */
	
	@JsonProperty("cm_eip_orc_8_parentOrder")
	public CM_EIP_v23 getCm_eip_orc_8_parentOrder() {
		return CommonService.getCM_EIP_v23(this.orc.getOrc8_ParentOrder());
	}
	/**
	 * @param cm_eip_orc_8_parentOrder the cm_eip_orc_8_parentOrder to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_eip_orc_8_parentOrder")
	public void setCm_eip_orc_8_parentOrder(CM_EIP_v23 cm_eip_orc_8_parentOrder) throws DataTypeException {
		CommonService.setCM_EIP_v23(this.orc.getOrc8_ParentOrder(), cm_eip_orc_8_parentOrder);
		this.cm_eip_orc_8_parentOrder = cm_eip_orc_8_parentOrder;
	}
	/**
	 *	@return the ts_orc_9_dateTimeOfTransaction
	 */
	
	@JsonProperty("ts_orc_9_dateTimeOfTransaction")
	public TS_v2 getTs_orc_9_dateTimeOfTransaction() {
		return CommonService.getTS_v2(this.orc.getOrc9_DateTimeOfTransaction());
	}
	/**
	 * @param ts_orc_9_dateTimeOfTransaction the ts_orc_9_dateTimeOfTransaction to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_orc_9_dateTimeOfTransaction")
	public void setTs_orc_9_dateTimeOfTransaction(TS_v2 ts_orc_9_dateTimeOfTransaction) throws DataTypeException {
		CommonService.setTS_v2(this.orc.getOrc9_DateTimeOfTransaction(), ts_orc_9_dateTimeOfTransaction);
		this.ts_orc_9_dateTimeOfTransaction = ts_orc_9_dateTimeOfTransaction;
	}
	/**
	 *	@return the xcn_orc_10_enteredBy
	 */
	
	@JsonProperty("xcn_orc_10_enteredBy")
	public XCN_v23 getXcn_orc_10_enteredBy() {
		return CommonService.getXCN_v23(this.orc.getOrc10_EnteredBy());
	}
	/**
	 * @param xcn_orc_10_enteredBy the xcn_orc_10_enteredBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_orc_10_enteredBy")
	public void setXcn_orc_10_enteredBy(XCN_v23 xcn_orc_10_enteredBy) throws DataTypeException {
		CommonService.setXCN_v23(this.orc.getOrc10_EnteredBy(), xcn_orc_10_enteredBy);
		this.xcn_orc_10_enteredBy = xcn_orc_10_enteredBy;
	}
	/**
	 *	@return the xcn_orc_11_verifiedBy
	 */
	
	@JsonProperty("xcn_orc_11_verifiedBy")
	public XCN_v23 getXcn_orc_11_verifiedBy() {
		return CommonService.getXCN_v23(this.orc.getOrc11_VerifiedBy());
	}
	/**
	 * @param xcn_orc_11_verifiedBy the xcn_orc_11_verifiedBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_orc_11_verifiedBy")
	public void setXcn_orc_11_verifiedBy(XCN_v23 xcn_orc_11_verifiedBy) throws DataTypeException {
		CommonService.setXCN_v23(this.orc.getOrc11_VerifiedBy(), xcn_orc_11_verifiedBy);
		this.xcn_orc_11_verifiedBy = xcn_orc_11_verifiedBy;
	}
	/**
	 *	@return the xcn_orc_12_orderingProvider
	 */
	
	@JsonProperty("xcn_orc_12_orderingProvider")
	public XCN_v23[] getXcn_orc_12_orderingProvider() {
		XCN_v23[] orderingProvider = new XCN_v23[this.orc.getOrc12_OrderingProvider().length];
		for(int i = 0; i<this.orc.getOrc12_OrderingProvider().length;i++) {
			orderingProvider[i]=CommonService.getXCN_v23(this.orc.getOrc12_OrderingProvider(i));
		}
		return orderingProvider;
	}
	/**
	 * @param xcn_orc_12_orderingProvider the xcn_orc_12_orderingProvider to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_orc_12_orderingProvider")
	public void setXcn_orc_12_orderingProvider(XCN_v23[] xcn_orc_12_orderingProvider) throws DataTypeException {
		for(int i = 0; i<xcn_orc_12_orderingProvider.length;i++) {
			CommonService.setXCN_v23(this.orc.getOrc12_OrderingProvider(i), xcn_orc_12_orderingProvider[i]);
		}
		this.xcn_orc_12_orderingProvider = xcn_orc_12_orderingProvider;
	}
	/**
	 *	@return the pl_orc_13_entererSLocation
	 */
	
	@JsonProperty("pl_orc_13_entererSLocation")
	public PL_v23 getPl_orc_13_entererSLocation() {
		return CommonService.getPL_v23(this.orc.getOrc13_EntererSLocation());
	}
	/**
	 * @param pl_orc_13_entererSLocation the pl_orc_13_entererSLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pl_orc_13_entererSLocation")
	public void setPl_orc_13_entererSLocation(PL_v23 pl_orc_13_entererSLocation) throws DataTypeException {
		CommonService.setPL_v23(this.orc.getOrc13_EntererSLocation(), pl_orc_13_entererSLocation);
		this.pl_orc_13_entererSLocation = pl_orc_13_entererSLocation;
	}
	/**
	 *	@return the xtn_orc_14_callBackPhoneNumber
	 */
	
	@JsonProperty("xtn_orc_14_callBackPhoneNumber")
	public XTN_v23[] getXtn_orc_14_callBackPhoneNumber() {
		XTN_v23[] callBackPhoneNumber = new XTN_v23[this.orc.getOrc14_CallBackPhoneNumber().length];
		for(int i = 0; i < this.orc.getOrc14_CallBackPhoneNumber().length;i++) {
			callBackPhoneNumber[i]=CommonService.getXTN_v23(this.orc.getOrc14_CallBackPhoneNumber(i));
		}
		return callBackPhoneNumber;
	}
	/**
	 * @param xtn_orc_14_callBackPhoneNumber the xtn_orc_14_callBackPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xtn_orc_14_callBackPhoneNumber")
	public void setXtn_orc_14_callBackPhoneNumber(XTN_v23[] xtn_orc_14_callBackPhoneNumber) throws DataTypeException {
		for(int i = 0; i < xtn_orc_14_callBackPhoneNumber.length;i++) {
			CommonService.setXTN_v23(this.orc.getOrc14_CallBackPhoneNumber(i), xtn_orc_14_callBackPhoneNumber[i]);
		}
		this.xtn_orc_14_callBackPhoneNumber = xtn_orc_14_callBackPhoneNumber;
	}
	/**
	 *	@return the ts_orc_15_orderEffectiveDateTime
	 */
	
	@JsonProperty("ts_orc_15_orderEffectiveDateTime")
	public TS_v2 getTs_orc_15_orderEffectiveDateTime() {
		return CommonService.getTS_v2(this.orc.getOrc15_OrderEffectiveDateTime());
	}
	/**
	 * @param ts_orc_15_orderEffectiveDateTime the ts_orc_15_orderEffectiveDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_orc_15_orderEffectiveDateTime")
	public void setTs_orc_15_orderEffectiveDateTime(TS_v2 ts_orc_15_orderEffectiveDateTime) throws DataTypeException {
		CommonService.setTS_v2(this.orc.getOrc15_OrderEffectiveDateTime(), ts_orc_15_orderEffectiveDateTime);
		this.ts_orc_15_orderEffectiveDateTime = ts_orc_15_orderEffectiveDateTime;
	}
	/**
	 *	@return the ce_orc_16_orderControlCodeReason
	 */
	
	@JsonProperty("ce_orc_16_orderControlCodeReason")
	public CE_v2 getCe_orc_16_orderControlCodeReason() {
		return CommonService.getCE_v2(this.orc.getOrc16_OrderControlCodeReason());
	}
	/**
	 * @param ce_orc_16_orderControlCodeReason the ce_orc_16_orderControlCodeReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_orc_16_orderControlCodeReason")
	public void setCe_orc_16_orderControlCodeReason(CE_v2 ce_orc_16_orderControlCodeReason) throws DataTypeException {
		CommonService.setCE_v2(this.orc.getOrc16_OrderControlCodeReason(), ce_orc_16_orderControlCodeReason);
		this.ce_orc_16_orderControlCodeReason = ce_orc_16_orderControlCodeReason;
	}
	/**
	 *	@return the ce_orc_17_enteringOrganization
	 */
	
	@JsonProperty("ce_orc_17_enteringOrganization")
	public CE_v2 getCe_orc_17_enteringOrganization() {
		return CommonService.getCE_v2(this.orc.getOrc17_EnteringOrganization());
	}
	/**
	 * @param ce_orc_17_enteringOrganization the ce_orc_17_enteringOrganization to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_orc_17_enteringOrganization")
	public void setCe_orc_17_enteringOrganization(CE_v2 ce_orc_17_enteringOrganization) throws DataTypeException {
		CommonService.setCE_v2(this.orc.getOrc17_EnteringOrganization(), ce_orc_17_enteringOrganization);
		this.ce_orc_17_enteringOrganization = ce_orc_17_enteringOrganization;
	}
	/**
	 *	@return the ce_orc_18_enteringDevice
	 */
	
	@JsonProperty("ce_orc_18_enteringDevice")
	public CE_v2 getCe_orc_18_enteringDevice() {
		return CommonService.getCE_v2(this.orc.getOrc18_EnteringDevice());
	}
	/**
	 * @param ce_orc_18_enteringDevice the ce_orc_18_enteringDevice to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_orc_18_enteringDevice")
	public void setCe_orc_18_enteringDevice(CE_v2 ce_orc_18_enteringDevice) throws DataTypeException {
		CommonService.setCE_v2(this.orc.getOrc18_EnteringDevice(), ce_orc_18_enteringDevice);
		this.ce_orc_18_enteringDevice = ce_orc_18_enteringDevice;
	}
	/**
	 *	@return the xcn_orc_19_actionBy
	 */
	
	@JsonProperty("xcn_orc_19_actionBy")
	public XCN_v23 getXcn_orc_19_actionBy() {
		return CommonService.getXCN_v23(this.orc.getOrc19_ActionBy());
	}
	/**
	 * @param xcn_orc_19_actionBy the xcn_orc_19_actionBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_orc_19_actionBy")
	public void setXcn_orc_19_actionBy(XCN_v23 xcn_orc_19_actionBy) throws DataTypeException {
		CommonService.setXCN_v23(this.orc.getOrc19_ActionBy(), xcn_orc_19_actionBy);
		this.xcn_orc_19_actionBy = xcn_orc_19_actionBy;
	}
	/**
	 *	@return the orc_obr
	 */
	
	@JsonProperty("obr_orc")
	public CustomOBR getOrc_obr() {
		return obr_orc==null?new CustomOBR():obr_orc;
	}
	/**
	 * @param orc_obr the orc_obr to set
	 */
	@JsonProperty("obr_orc")
	public void setOrc_obr(CustomOBR obr_orc) {
		this.obr_orc = obr_orc;
	}
	
	
}
