package scratch.coding.segment.v23;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import ca.uhn.hl7v2.model.v23.segment.MSH;
import ca.uhn.hl7v2.model.v23.segment.NTE;
import scratch.coding.models.CE_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.PT_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_MSG_v23;
import scratch.coding.segment.v23.JsonNTE_v23;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
@Component
public class CustomMSH {
	
	@JsonProperty("msh_1_fieldSeparator")
	private String msh_1_fieldSeparator;
	@JsonProperty("msh_2_encodingCharacters")
	private String msh_2_encodingCharacters;
	@JsonProperty("hd_msh_3_sendingApplication")
	private HD_v2 hd_msh_3_sendingApplication;
	@JsonProperty("hd_msh_4_sendingFacility")
	private HD_v2 hd_msh_4_sendingFacility;
	@JsonProperty("hd_msh_5_receivingApplication")
	private HD_v2 hd_msh_5_receivingApplication;
	@JsonProperty("hd_msh_6_receivingFacility")
	private HD_v2 hd_msh_6_receivingFacility;
	@JsonProperty("ts_msh_7_dateTimeOfMessage")
	private TS_v2 ts_msh_7_dateTimeOfMessage;
	@JsonProperty("msh_8_security")
	private String msh_8_security;
	@JsonProperty("cm_msh_9_messageType")
	private CM_MSG_v23 cm_msh_9_messageType;
	@JsonProperty("msh_10_messageControlId")
	private String msh_10_messageControlId;
	@JsonProperty("pt_msh_11_processingId")
	private PT_v2 pt_msh_11_processingId;
	@JsonProperty("msh_12_versionId")
	private String msh_12_versionId;
	@JsonProperty("msh_13_sequenceNumber")
	private String msh_13_sequenceNumber;
	@JsonProperty("msh_14_continuationPointer")
	private String msh_14_continuationPointer;
	@JsonProperty("msh_15_acceptAcknowledgementType")
	private String msh_15_acceptAcknowledgementType;
	@JsonProperty("msh_16_applicationAcknowledgementType")
	private String msh_16_applicationAcknowledgementType;
	@JsonProperty("msh_17_countryCode")
	private String msh_17_countryCode;
	@JsonProperty("msh_18_characterSet")
	private String msh_18_characterSet;
	@JsonProperty("ce_msh_19_principalLanguageOfMessage")
	private CE_v2 ce_msh_19_principalLanguageOfMessage;
	@JsonProperty("nte_msh")
	private CustomNTE[] nte_msh;
	
	
	private MSH msh;

	private CustomMSH(MSH msh, CustomNTE[] nte) {
		super();
		this.msh =msh;
//		setNte(nte);
	}
	private CustomMSH(MSH msh) {
		super();
		this.msh =msh;
	}
	
	public CustomMSH() {
		super();
	}
	public CustomMSH createMshWithMSH(MSH msh) throws HL7Exception, IOException {
		return new CustomMSH(msh);
	}

	public CustomMSH createMsh1WithTypeAndVersion(ORM_O01 orm) throws HL7Exception, IOException {
		MSH mshObjset = orm.getMSH();
		List<NTE> ntes = orm.getNTEAll();
		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
		int l = 0;
		for (NTE nt : ntes) {
			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
			l++;
		}
		return new CustomMSH(mshObjset, nteArray);
	}
	/**
	 *	@return the msh_1_fieldSeparator
	 */
	
	@JsonProperty("msh_1_fieldSeparator")
	public String getMsh_1_fieldSeparator() {
		return CommonService.getString(this.msh.getMsh1_FieldSeparator().getValue());
	}
	/**
	 * @param msh_1_fieldSeparator the msh_1_fieldSeparator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_1_fieldSeparator")
	public void setMsh_1_fieldSeparator(String msh_1_fieldSeparator) throws DataTypeException {
		this.msh.getMsh1_FieldSeparator().setValue(msh_1_fieldSeparator);
		this.msh_1_fieldSeparator = msh_1_fieldSeparator;
	}
	/**
	 *	@return the msh_2_encodingCharacters
	 */
	
	@JsonProperty("msh_2_encodingCharacters")
	public String getMsh_2_encodingCharacters() {
		return CommonService.getString(this.msh.getMsh2_EncodingCharacters().getValue());
	}
	/**
	 * @param msh_2_encodingCharacters the msh_2_encodingCharacters to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_2_encodingCharacters")
	public void setMsh_2_encodingCharacters(String msh_2_encodingCharacters) throws DataTypeException {
		this.msh.getMsh2_EncodingCharacters().setValue(msh_2_encodingCharacters);
		this.msh_2_encodingCharacters = msh_2_encodingCharacters;
	}
	/**
	 *	@return the hd_msh_3_sendingApplication
	 */
	
	@JsonProperty("hd_msh_3_sendingApplication")
	public HD_v2 getHd_msh_3_sendingApplication() {
		return CommonService.getHD_v2(this.msh.getMsh3_SendingApplication());
	}
	/**
	 * @param hd_msh_3_sendingApplication the hd_msh_3_sendingApplication to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("hd_msh_3_sendingApplication")
	public void setHd_msh_3_sendingApplication(HD_v2 hd_msh_3_sendingApplication) throws DataTypeException {
		CommonService.setHD_v2(this.msh.getMsh3_SendingApplication(),hd_msh_3_sendingApplication );
		this.hd_msh_3_sendingApplication = hd_msh_3_sendingApplication;
	}
	/**
	 *	@return the hd_msh_4_sendingFacility
	 */
	
	@JsonProperty("hd_msh_4_sendingFacility")
	public HD_v2 getHd_msh_4_sendingFacility() {
		return CommonService.getHD_v2(this.msh.getMsh4_SendingFacility());
	}
	/**
	 * @param hd_msh_4_sendingFacility the hd_msh_4_sendingFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("hd_msh_4_sendingFacility")
	public void setHd_msh_4_sendingFacility(HD_v2 hd_msh_4_sendingFacility) throws DataTypeException {
		CommonService.setHD_v2(this.msh.getMsh4_SendingFacility(),hd_msh_4_sendingFacility );
		this.hd_msh_4_sendingFacility = hd_msh_4_sendingFacility;
	}
	/**
	 *	@return the hd_msh_5_receivingApplication
	 */
	
	@JsonProperty("hd_msh_5_receivingApplication")
	public HD_v2 getHd_msh_5_receivingApplication() {
		return CommonService.getHD_v2(this.msh.getMsh5_ReceivingApplication());
	}
	/**
	 * @param hd_msh_5_receivingApplication the hd_msh_5_receivingApplication to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("hd_msh_5_receivingApplication")
	public void setHd_msh_5_receivingApplication(HD_v2 hd_msh_5_receivingApplication) throws DataTypeException {
		CommonService.setHD_v2(this.msh.getMsh5_ReceivingApplication(),hd_msh_5_receivingApplication );
		this.hd_msh_5_receivingApplication = hd_msh_5_receivingApplication;
	}
	/**
	 *	@return the hd_msh_6_receivingFacility
	 */
	
	@JsonProperty("hd_msh_6_receivingFacility")
	public HD_v2 getHd_msh_6_receivingFacility() {
		return CommonService.getHD_v2(this.msh.getMsh6_ReceivingFacility());
	}
	/**
	 * @param hd_msh_6_receivingFacility the hd_msh_6_receivingFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("hd_msh_6_receivingFacility")
	public void setHd_msh_6_receivingFacility(HD_v2 hd_msh_6_receivingFacility) throws DataTypeException {
		CommonService.setHD_v2(this.msh.getMsh6_ReceivingFacility(), hd_msh_6_receivingFacility);
		this.hd_msh_6_receivingFacility = hd_msh_6_receivingFacility;
	}
	/**
	 *	@return the ts_msh_7_dateTimeOfMessage
	 */
	
	@JsonProperty("ts_msh_7_dateTimeOfMessage")
	public TS_v2 getTs_msh_7_dateTimeOfMessage() {
		return CommonService.getTS_v2(this.msh.getMsh7_DateTimeOfMessage());
	}
	/**
	 * @param ts_msh_7_dateTimeOfMessage the ts_msh_7_dateTimeOfMessage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ts_msh_7_dateTimeOfMessage")
	public void setTs_msh_7_dateTimeOfMessage(TS_v2 ts_msh_7_dateTimeOfMessage) throws DataTypeException {
		CommonService.setTS_v2(this.msh.getMsh7_DateTimeOfMessage(), ts_msh_7_dateTimeOfMessage);
		this.ts_msh_7_dateTimeOfMessage = ts_msh_7_dateTimeOfMessage;
	}
	/**
	 *	@return the msh_8_security
	 */
	
	@JsonProperty("msh_8_security")
	public String getMsh_8_security() {
		return CommonService.getString(this.msh.getMsh8_Security().getValue());
	}
	/**
	 * @param msh_8_security the msh_8_security to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_8_security")
	public void setMsh_8_security(String msh_8_security) throws DataTypeException {
		this.msh.getMsh8_Security().setValue(msh_8_security);
		this.msh_8_security = msh_8_security;
	}
	/**
	 *	@return the cm_msh_9_messageType
	 */
	
	@JsonProperty("cm_msh_9_messageType")
	public CM_MSG_v23 getCm_msh_9_messageType() {
		return CommonService.getCM_MSG_v23(this.msh.getMsh9_MessageType());
	}
	/**
	 * @param cm_msh_9_messageType the cm_msh_9_messageType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cm_msh_9_messageType")
	public void setCm_msh_9_messageType(CM_MSG_v23 cm_msh_9_messageType) throws DataTypeException {
		 CommonService.setCM_MSG_v23(this.msh.getMsh9_MessageType(), cm_msh_9_messageType);
		this.cm_msh_9_messageType = cm_msh_9_messageType;
	}
	/**
	 *	@return the msh_10_messageControlId
	 */
	
	@JsonProperty("msh_10_messageControlId")
	public String getMsh_10_messageControlId() {
		return CommonService.getString(this.msh.getMsh10_MessageControlID().getValue());
	}
	/**
	 * @param msh_10_messageControlId the msh_10_messageControlId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_10_messageControlId")
	public void setMsh_10_messageControlId(String msh_10_messageControlId) throws DataTypeException {
		this.msh.getMsh10_MessageControlID().setValue(msh_10_messageControlId);
		this.msh_10_messageControlId = msh_10_messageControlId;
	}
	/**
	 *	@return the pt_msh_11_processingId
	 */
	
	@JsonProperty("pt_msh_11_processingId")
	public PT_v2 getPt_msh_11_processingId() {
		return CommonService.getPT_v2(this.msh.getMsh11_ProcessingID());
	}
	/**
	 * @param pt_msh_11_processingId the pt_msh_11_processingId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("pt_msh_11_processingId")
	public void setPt_msh_11_processingId(PT_v2 pt_msh_11_processingId) throws DataTypeException {
		CommonService.setPT_v2(this.msh.getMsh11_ProcessingID(), pt_msh_11_processingId);
		this.pt_msh_11_processingId = pt_msh_11_processingId;
	}
	/**
	 *	@return the msh_12_versionId
	 */
	
	@JsonProperty("msh_12_versionId")
	public String getMsh_12_versionId() {
		return CommonService.getString(this.msh.getMsh12_VersionID().getValue());
	}
	/**
	 * @param msh_12_versionId the msh_12_versionId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_12_versionId")
	public void setMsh_12_versionId(String msh_12_versionId) throws DataTypeException {
		this.msh.getMsh12_VersionID().setValue(msh_12_versionId);
		this.msh_12_versionId = msh_12_versionId;
	}
	/**
	 *	@return the msh_13_sequenceNumber
	 */
	
	@JsonProperty("msh_13_sequenceNumber")
	public String getMsh_13_sequenceNumber() {
		return CommonService.getString(this.msh.getMsh13_SequenceNumber().getValue());
	}
	/**
	 * @param msh_13_sequenceNumber the msh_13_sequenceNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_13_sequenceNumber")
	public void setMsh_13_sequenceNumber(String msh_13_sequenceNumber) throws DataTypeException {
		this.msh.getMsh13_SequenceNumber().setValue(msh_13_sequenceNumber);
		this.msh_13_sequenceNumber = msh_13_sequenceNumber;
	}
	/**
	 *	@return the msh_14_continuationPointer
	 */
	
	@JsonProperty("msh_14_continuationPointer")
	public String getMsh_14_continuationPointer() {
		return CommonService.getString(this.msh.getMsh14_ContinuationPointer().getValue());
	}
	/**
	 * @param msh_14_continuationPointer the msh_14_continuationPointer to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_14_continuationPointer")
	public void setMsh_14_continuationPointer(String msh_14_continuationPointer) throws DataTypeException {
		this.msh.getMsh14_ContinuationPointer().setValue(msh_14_continuationPointer);
		this.msh_14_continuationPointer = msh_14_continuationPointer;
	}
	/**
	 *	@return the msh_15_acceptAcknowledgementType
	 */
	
	@JsonProperty("msh_15_acceptAcknowledgementType")
	public String getMsh_15_acceptAcknowledgementType() {
		return CommonService.getString(this.msh.getMsh15_AcceptAcknowledgementType().getValue());
	}
	/**
	 * @param msh_15_acceptAcknowledgementType the msh_15_acceptAcknowledgementType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_15_acceptAcknowledgementType")
	public void setMsh_15_acceptAcknowledgementType(String msh_15_acceptAcknowledgementType) throws DataTypeException {
		this.msh.getMsh15_AcceptAcknowledgementType().setValue(msh_15_acceptAcknowledgementType);
		this.msh_15_acceptAcknowledgementType = msh_15_acceptAcknowledgementType;
	}
	/**
	 *	@return the msh_16_applicationAcknowledgementType
	 */
	
	@JsonProperty("msh_16_applicationAcknowledgementType")
	public String getMsh_16_applicationAcknowledgementType() {
		return CommonService.getString(this.msh.getMsh16_ApplicationAcknowledgementType().getValue());
	}
	/**
	 * @param msh_16_applicationAcknowledgementType the msh_16_applicationAcknowledgementType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_16_applicationAcknowledgementType")
	public void setMsh_16_applicationAcknowledgementType(String msh_16_applicationAcknowledgementType) throws DataTypeException {
		this.msh.getMsh16_ApplicationAcknowledgementType().setValue(msh_16_applicationAcknowledgementType);
		this.msh_16_applicationAcknowledgementType = msh_16_applicationAcknowledgementType;
	}
	/**
	 *	@return the msh_17_countryCode
	 */
	
	@JsonProperty("msh_17_countryCode")
	public String getMsh_17_countryCode() {
		return CommonService.getString(this.msh.getMsh17_CountryCode().getValue());
	}
	/**
	 * @param msh_17_countryCode the msh_17_countryCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_17_countryCode")
	public void setMsh_17_countryCode(String msh_17_countryCode) throws DataTypeException {
		this.msh.getMsh17_CountryCode().setValue(msh_17_countryCode);
		this.msh_17_countryCode = msh_17_countryCode;
	}
	/**
	 *	@return the msh_18_characterSet
	 */
	
	@JsonProperty("msh_18_characterSet")
	public String getMsh_18_characterSet() {
		return CommonService.getString(this.msh.getMsh18_CharacterSet().getValue());
	}
	/**
	 * @param msh_18_characterSet the msh_18_characterSet to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_18_characterSet")
	public void setMsh_18_characterSet(String msh_18_characterSet) throws DataTypeException {
		this.msh.getMsh18_CharacterSet().setValue(msh_18_characterSet);
		this.msh_18_characterSet = msh_18_characterSet;
	}
	/**
	 *	@return the ce_msh_19_principalLanguageOfMessage
	 */
	
	@JsonProperty("ce_msh_19_principalLanguageOfMessage")
	public CE_v2 getCe_msh_19_principalLanguageOfMessage() {
		return CommonService.getCE_v2(this.msh.getMsh19_PrincipalLanguageOfMessage());
	}
	/**
	 * @param ce_msh_19_principalLanguageOfMessage the ce_msh_19_principalLanguageOfMessage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_msh_19_principalLanguageOfMessage")
	public void setCe_msh_19_principalLanguageOfMessage(CE_v2 ce_msh_19_principalLanguageOfMessage) throws DataTypeException {
		CommonService.setCE_v2(this.msh.getMsh19_PrincipalLanguageOfMessage(), ce_msh_19_principalLanguageOfMessage);
		this.ce_msh_19_principalLanguageOfMessage = ce_msh_19_principalLanguageOfMessage;
	}
	/**
	 *	@return the nte_msh
	 */
	
	@JsonProperty("nte_msh")
	public CustomNTE[] getNte_msh() {
		return nte_msh==null?new CustomNTE[] {}:nte_msh;
	}
	/**
	 * @param nte_msh the nte_msh to set
	 */
	@JsonProperty("nte_msh")
	public void setNte_msh(CustomNTE[] nte_msh) {
		this.nte_msh = nte_msh;
	}

	
}
