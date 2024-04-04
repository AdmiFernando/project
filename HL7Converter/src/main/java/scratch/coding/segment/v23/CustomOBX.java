package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_OBSERVATION;
import ca.uhn.hl7v2.model.v23.segment.NTE;
import ca.uhn.hl7v2.model.v23.segment.OBX;
import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.services.CommonService;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomOBX implements Serializable {
	@JsonProperty("obx_1_setId")
	private String obx_1_setId;
	@JsonProperty("obx_2_valueType")
	private String obx_2_valueType;
	@JsonProperty("ce_obx_3_observationIdentifier")
	private CE_v2 ce_obx_3_observationIdentifier;
	@JsonProperty("obx_4_observationSubId")
	private String obx_4_observationSubId;
	@JsonProperty("obx_5_observationValue")
	private String[] obx_5_observationValue;
	@JsonProperty("ce_obx_6_units")
	private CE_v2 ce_obx_6_units;
	@JsonProperty("obx_7_referencesRange")
	private String obx_7_referencesRange;
	@JsonProperty("obx_8_abmornalFlags")
	private String[] obx_8_abmornalFlags;
	@JsonProperty("obx_9_probability")
	private String obx_9_probability;
	@JsonProperty("obx_10_natureOfAbnormalTest")
	private String obx_10_natureOfAbnormalTest;
	@JsonProperty("obx_11_observResultStatus")
	private String obx_11_observResultStatus;
	@JsonProperty("ts_obx_12_dateLastObsNormalValues")
	private TS_v2 ts_obx_12_dateLastObsNormalValues;
	@JsonProperty("obx_13_userDefinedAccessChecks")
	private String obx_13_userDefinedAccessChecks;
	@JsonProperty("ts_obx_14_dateTimeOfTheObservation")
	private TS_v2 ts_obx_14_dateTimeOfTheObservation;
	@JsonProperty("ce_obx_15_producersId")
	private CE_v2 ce_obx_15_producersId;
	@JsonProperty("xcn_obx_16_responsibleObserver")
	private XCN_v23 xcn_obx_16_responsibleObserver;
	@JsonProperty("ce_obx_17_observationMethod")
	private CE_v2[] ce_obx_17_observationMethod;
	@JsonProperty("nte_obx")
	private CustomNTE[] nte_obx;
	
	private OBX obx;
	
	private CustomOBX(OBX obx, CustomNTE[] nte_obx) {
		super();
		this.obx =obx;
		this.nte_obx = nte_obx;
	}
	public static CustomOBX createObxWithTypeAndVersion(ORM_O01_OBSERVATION observation) throws HL7Exception, IOException {	
		OBX obxObject = observation.getOBX();
		CustomNTE[] nteArray = new CustomNTE[observation.getNTEAll().size()];
		int i = 0;
		for(NTE nteObject: observation.getNTEAll()) {
			nteArray[i] = CustomNTE.createNteWithTypeAndVersion(nteObject);
			i++;
		}
		return new CustomOBX(obxObject, nteArray);
	}
	/**
	 *	@return the obx_1_setId
	 */
	
	@JsonProperty("obx_1_setId")
	public String getObx_1_setId() {
		return CommonService.getString(this.obx.getObx1_SetIDOBX().getValue());
	}
	/**
	 * @param obx_1_setId the obx_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_1_setId")
	public void setObx_1_setId(String obx_1_setId) throws DataTypeException {
		this.obx.getObx1_SetIDOBX().setValue(obx_1_setId);
		this.obx_1_setId = obx_1_setId;
	}
	/**
	 *	@return the obx_2_valueType
	 */
	
	@JsonProperty("obx_2_valueType")
	public String getObx_2_valueType() {
		return CommonService.getString(this.obx.getObx2_ValueType().getValue());
	}
	/**
	 * @param obx_2_valueType the obx_2_valueType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_2_valueType")
	public void setObx_2_valueType(String obx_2_valueType) throws DataTypeException {
		this.obx.getObx2_ValueType().setValue(obx_2_valueType);
		this.obx_2_valueType = obx_2_valueType;
	}
	/**
	 *	@return the ce_obx_3_observationIdentifier
	 */
	
	@JsonProperty("ce_obx_3_observationIdentifier")
	public CE_v2 getCe_obx_3_observationIdentifier() {
		return CommonService.getCE_v2(this.obx.getObx3_ObservationIdentifier());
	}
	/**
	 * @param ce_obx_3_observationIdentifier the ce_obx_3_observationIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obx_3_observationIdentifier")
	public void setCe_obx_3_observationIdentifier(CE_v2 ce_obx_3_observationIdentifier) throws DataTypeException {
		CommonService.setCE_v2(this.obx.getObx3_ObservationIdentifier(), ce_obx_3_observationIdentifier);
		this.ce_obx_3_observationIdentifier = ce_obx_3_observationIdentifier;
	}
	/**
	 *	@return the obx_4_observationSubId
	 */
	
	@JsonProperty("obx_4_observationSubId")
	public String getObx_4_observationSubId() {
		return CommonService.getString(this.obx.getObx4_ObservationSubID().getValue());
	}
	/**
	 * @param obx_4_observationSubId the obx_4_observationSubId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_4_observationSubId")
	public void setObx_4_observationSubId(String obx_4_observationSubId) throws DataTypeException {
		this.obx.getObx4_ObservationSubID().setValue(obx_4_observationSubId);
		this.obx_4_observationSubId = obx_4_observationSubId;
	}
	/**
	 *	@return the obx_5_observationValue
	 * @throws HL7Exception 
	 */
	@JsonProperty("obx_5_observationValue")
	public String[] getObx_5_observationValue() throws HL7Exception {
		String[] observationValue = new String[this.obx.getObx5_ObservationValue().length];
		for(int i = 0; i <this.obx.getObx5_ObservationValue().length ; i++) {
			observationValue[i] = CommonService.getString(this.obx.getObx5_ObservationValue(i).encode());
		}
		return observationValue;
	}
	/**
	 * @param obx_5_observationValue the obx_5_observationValue to set
	 * @throws HL7Exception 
	 */
	@JsonProperty("obx_5_observationValue")
	public void setObx_5_observationValue(String[] obx_5_observationValue) throws HL7Exception {
		for(int i = 0; i <obx_5_observationValue.length ; i++) {
			 this.obx.getObx5_ObservationValue(i).parse(obx_5_observationValue[i]);;
		}
		this.obx_5_observationValue = obx_5_observationValue;
	}
	/**
	 *	@return the ce_obx_6_units
	 */
	
	@JsonProperty("ce_obx_6_units")
	public CE_v2 getCe_obx_6_units() {
		return CommonService.getCE_v2(this.obx.getObx6_Units());
	}
	/**
	 * @param ce_obx_6_units the ce_obx_6_units to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obx_6_units")
	public void setCe_obx_6_units(CE_v2 ce_obx_6_units) throws DataTypeException {
		CommonService.setCE_v2(this.obx.getObx6_Units(), ce_obx_6_units);
		this.ce_obx_6_units = ce_obx_6_units;
	}
	/**
	 *	@return the obx_7_referencesRange
	 */
	
	@JsonProperty("obx_7_referencesRange")
	public String getObx_7_referencesRange() {
		return CommonService.getString(this.obx.getObx7_ReferencesRange().getValue());
	}
	/**
	 * @param obx_7_referencesRange the obx_7_referencesRange to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_7_referencesRange")
	public void setObx_7_referencesRange(String obx_7_referencesRange) throws DataTypeException {
		this.obx.getObx7_ReferencesRange().setValue(obx_7_referencesRange);
		this.obx_7_referencesRange = obx_7_referencesRange;
	}
	/**
	 *	@return the obx_8_abmornalFlags
	 */
	
	@JsonProperty("obx_8_abmornalFlags")
	public String[] getObx_8_abmornalFlags() {
		String[] abmornalFlags =new String[this.obx.getObx8_AbnormalFlags().length];
		for(int i = 0; i < this.obx.getObx8_AbnormalFlags().length; i++) {
			abmornalFlags[i]=CommonService.getString(this.obx.getObx8_AbnormalFlags(i).getValue());
		}
		return abmornalFlags;
	}
	/**
	 * @param obx_8_abmornalFlags the obx_8_abmornalFlags to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_8_abmornalFlags")
	public void setObx_8_abmornalFlags(String[] obx_8_abmornalFlags) throws DataTypeException {
		for(int i = 0; i < this.obx.getObx8_AbnormalFlags().length; i++) {
			this.obx.getObx8_AbnormalFlags(i).setValue(obx_8_abmornalFlags[i]);
		}
		this.obx_8_abmornalFlags = obx_8_abmornalFlags;
	}
	/**
	 *	@return the obx_9_probability
	 */
	
	@JsonProperty("obx_9_probability")
	public String getObx_9_probability() {
		return CommonService.getString(this.obx.getObx9_Probability().getValue());
	}
	/**
	 * @param obx_9_probability the obx_9_probability to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_9_probability")
	public void setObx_9_probability(String obx_9_probability) throws DataTypeException {
		this.obx.getObx9_Probability().setValue(obx_9_probability);
		this.obx_9_probability = obx_9_probability;
	}
	/**
	 *	@return the obx_10_natureOfAbnormalTest
	 */
	
	@JsonProperty("obx_10_natureOfAbnormalTest")
	public String getObx_10_natureOfAbnormalTest() {
		return CommonService.getString(this.obx.getObx10_NatureOfAbnormalTest().getValue());
	}
	/**
	 * @param obx_10_natureOfAbnormalTest the obx_10_natureOfAbnormalTest to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_10_natureOfAbnormalTest")
	public void setObx_10_natureOfAbnormalTest(String obx_10_natureOfAbnormalTest) throws DataTypeException {
		this.obx.getObx10_NatureOfAbnormalTest().setValue(obx_10_natureOfAbnormalTest);
		this.obx_10_natureOfAbnormalTest = obx_10_natureOfAbnormalTest;
	}
	/**
	 *	@return the obx_11_observResultStatus
	 */
	
	@JsonProperty("obx_11_observResultStatus")
	public String getObx_11_observResultStatus() {
		return CommonService.getString(this.obx.getObx11_ObservResultStatus().getValue());
	}
	/**
	 * @param obx_11_observResultStatus the obx_11_observResultStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_11_observResultStatus")
	public void setObx_11_observResultStatus(String obx_11_observResultStatus) throws DataTypeException {
		this.obx.getObx11_ObservResultStatus().setValue(obx_11_observResultStatus);
		this.obx_11_observResultStatus = obx_11_observResultStatus;
	}
	/**
	 *	@return the ts_obx_12_dateLastObsNormalValues
	 */
	
	@JsonProperty("ts_obx_12_dateLastObsNormalValues")
	public TS_v2 getTs_obx_12_dateLastObsNormalValues() {
		return CommonService.getTS_v2(this.obx.getObx12_DateLastObsNormalValues());
	}
	/**
	 * @param ts_obx_12_dateLastObsNormalValues the ts_obx_12_dateLastObsNormalValues to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obx_12_dateLastObsNormalValues")
	public void setTs_obx_12_dateLastObsNormalValues(TS_v2 ts_obx_12_dateLastObsNormalValues) throws DataTypeException {
		CommonService.setTS_v2(this.obx.getObx12_DateLastObsNormalValues(), ts_obx_12_dateLastObsNormalValues);
		this.ts_obx_12_dateLastObsNormalValues = ts_obx_12_dateLastObsNormalValues;
	}
	/**
	 *	@return the obx_13_userDefinedAccessChecks
	 */
	
	@JsonProperty("obx_13_userDefinedAccessChecks")
	public String getObx_13_userDefinedAccessChecks() {
		return CommonService.getString(this.obx.getObx13_UserDefinedAccessChecks().getValue());
	}
	/**
	 * @param obx_13_userDefinedAccessChecks the obx_13_userDefinedAccessChecks to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_13_userDefinedAccessChecks")
	public void setObx_13_userDefinedAccessChecks(String obx_13_userDefinedAccessChecks) throws DataTypeException {
		this.obx.getObx13_UserDefinedAccessChecks().setValue(obx_13_userDefinedAccessChecks);
		this.obx_13_userDefinedAccessChecks = obx_13_userDefinedAccessChecks;
	}
	/**
	 *	@return the ts_obx_14_dateTimeOfTheObservation
	 */
	
	@JsonProperty("ts_obx_14_dateTimeOfTheObservation")
	public TS_v2 getTs_obx_14_dateTimeOfTheObservation() {
		return CommonService.getTS_v2(this.obx.getObx14_DateTimeOfTheObservation());
	}
	/**
	 * @param ts_obx_14_dateTimeOfTheObservation the ts_obx_14_dateTimeOfTheObservation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_obx_14_dateTimeOfTheObservation")
	public void setTs_obx_14_dateTimeOfTheObservation(TS_v2 ts_obx_14_dateTimeOfTheObservation) throws DataTypeException {
		CommonService.setTS_v2(this.obx.getObx14_DateTimeOfTheObservation(), ts_obx_14_dateTimeOfTheObservation);
		this.ts_obx_14_dateTimeOfTheObservation = ts_obx_14_dateTimeOfTheObservation;
	}
	/**
	 *	@return the ce_obx_15_producersId
	 */
	
	@JsonProperty("ce_obx_15_producersId")
	public CE_v2 getCe_obx_15_producersId() {
		return CommonService.getCE_v2(this.obx.getObx15_ProducerSID());
	}
	/**
	 * @param ce_obx_15_producersId the ce_obx_15_producersId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obx_15_producersId")
	public void setCe_obx_15_producersId(CE_v2 ce_obx_15_producersId) throws DataTypeException {
		CommonService.setCE_v2(this.obx.getObx15_ProducerSID(), ce_obx_15_producersId);
		this.ce_obx_15_producersId = ce_obx_15_producersId;
	}
	/**
	 *	@return the xcn_obx_16_responsibleObserver
	 */
	
	@JsonProperty("xcn_obx_16_responsibleObserver")
	public XCN_v23 getXcn_obx_16_responsibleObserver() {
		return CommonService.getXCN_v23(this.obx.getObx16_ResponsibleObserver());
	}
	/**
	 * @param xcn_obx_16_responsibleObserver the xcn_obx_16_responsibleObserver to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("xcn_obx_16_responsibleObserver")
	public void setXcn_obx_16_responsibleObserver(XCN_v23 xcn_obx_16_responsibleObserver) throws DataTypeException {
		CommonService.setXCN_v23(this.obx.getObx16_ResponsibleObserver(), xcn_obx_16_responsibleObserver);
		this.xcn_obx_16_responsibleObserver = xcn_obx_16_responsibleObserver;
	}
	/**
	 *	@return the ce_obx_17_observationMethod
	 */
	
	@JsonProperty("ce_obx_17_observationMethod")
	public CE_v2[] getCe_obx_17_observationMethod() {
		CE_v2[] observationMethod = new CE_v2[this.obx.getObx17_ObservationMethod().length];
		for(int i = 0; i< this.obx.getObx17_ObservationMethod().length; i++) {
			observationMethod[i]=CommonService.getCE_v2(this.obx.getObx17_ObservationMethod(i));
		}
		return observationMethod;
	}
	/**
	 * @param ce_obx_17_observationMethod the ce_obx_17_observationMethod to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_obx_17_observationMethod")
	public void setCe_obx_17_observationMethod(CE_v2[] ce_obx_17_observationMethod) throws DataTypeException {
		for(int i = 0; i< ce_obx_17_observationMethod.length; i++) {
			CommonService.setCE_v2(this.obx.getObx17_ObservationMethod(i), ce_obx_17_observationMethod[i]);
		}
		this.ce_obx_17_observationMethod = ce_obx_17_observationMethod;
	}
	/**
	 *	@return the nte
	 *	@JsonProperty("nte")
	 */
	
	public CustomNTE[] getNte() {
		return nte_obx==null?new CustomNTE[] {}:nte_obx;
	}
	/**
	 * @param nte the nte to set
	 * @JsonProperty("nte")
	 */
	public void setNte(CustomNTE[] nte_obx) {
		this.nte_obx = nte_obx;
	}
	/**
	 *	@return the obx
	 *	@JsonProperty("obx")
	 */
	
}
