package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORM_O01;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.SFT;
import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.PT_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.MSG_v25;
import scratch.coding.models.v25.VID_v25;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomMSH_v25 {
	
	@JsonProperty("msh_1_fieldSeparator")
	private String msh_1_fieldSeparator;
	@JsonProperty("msh_2_encodingCharacters")
	private String msh_2_encodingCharacters;
	@JsonProperty("msh_3_sendingApplication")
	private HD_v2 msh_3_sendingApplication;	
	@JsonProperty("msh_4_sendingFacility")
	private HD_v2 msh_4_sendingFacility;
	@JsonProperty("msh_5_receivingApplication")
	private HD_v2 msh_5_receivingApplication;
	@JsonProperty("msh_6_receivingFacility")
	private HD_v2 msh_6_receivingFacility;
	@JsonProperty("msh_7_dateTimeOfMessage")
	private TS_v2 msh_7_dateTimeOfMessage;
	@JsonProperty("msh_8_security")
	private String msh_8_security;
	@JsonProperty("msh_9_messageType")
	private MSG_v25 msh_9_messageType;
	@JsonProperty("msh_10_messageControlID")
	private String msh_10_messageControlID;
	@JsonProperty("msh_11_processingID")
	private PT_v2 msh_11_processingID;
	@JsonProperty("msh_12_versionID")
	private VID_v25 msh_12_versionID;
	@JsonProperty("msh_13_sequenceNumber")
	private String msh_13_sequenceNumber;
	@JsonProperty("msh_14_continuationPointer")
	private String msh_14_continuationPointer;
	@JsonProperty("msh_15_acceptAcknowledgmentType")
	private String msh_15_acceptAcknowledgmentType;
	@JsonProperty("msh_16_applicationAcknowledgmentType")
	private String msh_16_applicationAcknowledgmentType;
	@JsonProperty("msh_17_countryCode")
	private String msh_17_countryCode;
	@JsonProperty("msh_18_characterSet")
	private String[] msh_18_characterSet;
	@JsonProperty("msh_19_principalLanguageOfMessage")
	private CE_v2 msh_19_principalLanguageOfMessage;
	@JsonProperty("msh_20_alternateCharacterSetHandlingScheme")
	private String msh_20_alternateCharacterSetHandlingScheme;
	@JsonProperty("msh_21_messageProfileIdentifier")
	private EI_v2[] msh_21_messageProfileIdentifier;
	@JsonProperty("nte")
	private List<CustomNTE_v25> nte;
	
	@JsonProperty("sft")
	private List<CustomSFT_v25> sft;
	private MSH msh;

	/**
	 * 
	 * @param msh
	 * @param nte
	 */
	@SuppressWarnings("unchecked")
	private CustomMSH_v25(MSH msh, List<?> list) {
		super();
		 if(list != null && !list.isEmpty()){
		        if (list.get(0) instanceof CustomNTE_v25){
		        	this.nte = (List<CustomNTE_v25>) list;
		        } else if (list.get(0) instanceof CustomSFT_v25) {
		        	this.sft = (List<CustomSFT_v25>) list;
		        }
		    }
		this.msh =msh;
//		super.setNte(nte);
	}
	private CustomMSH_v25(MSH msh) {
		super();
		this.msh =msh;
	}
	
	public CustomMSH_v25() {
		super();
	}
	public static CustomMSH_v25 createMshWithMSH(MSH msh) throws HL7Exception, IOException {
		return new CustomMSH_v25(msh);
	}

	public static CustomMSH_v25 createMsh(ORM_O01 orm) throws HL7Exception, IOException {
		MSH mshObjset = orm.getMSH();
		List<NTE> ntes = orm.getNTEAll();
		List<CustomNTE_v25> nteArray = new ArrayList<>();
		int l = 0;
		for (NTE nt : ntes) {
			nteArray.add(CustomNTE_v25.createNteWithTypeAndVersion(nt));
			l++;
		}
		return new CustomMSH_v25(mshObjset, nteArray);
	}
	public static CustomMSH_v25 createMsh(ORU_R01 oru) throws HL7Exception, IOException {
		MSH mshObjset = oru.getMSH();
		List<SFT> sfts = oru.getSFTAll();
		List<CustomSFT_v25> sftArray = new ArrayList<>();
		int l = 0;
		for (SFT sft : sfts) {
			sftArray.add(CustomSFT_v25.createSFTWithSFT(sft));
			l++;
		}
		return new CustomMSH_v25(mshObjset, sftArray);
	}
	/**
	 * @return the msh_1_fieldSeparator
	 */
	@JsonProperty("msh_1_fieldSeparator")
	public String getMsh_1_fieldSeparator() {
		return msh.getMsh1_FieldSeparator().getValue()==null?"":msh.getMsh1_FieldSeparator().getValue();
	}
	/**
	 * @param msh_1_fieldSeparator the msh_1_fieldSeparator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_1_fieldSeparator")
	public void setMsh_1_fieldSeparator(String msh_1_fieldSeparator) throws DataTypeException {
		this.msh_1_fieldSeparator = msh_1_fieldSeparator;
		msh.getMsh1_FieldSeparator().setValue(msh_1_fieldSeparator);
	}
	/**
	 * @return the msh_2_encodingCharacters
	 */
	@JsonProperty("msh_2_encodingCharacters")
	public String getMsh_2_encodingCharacters() {
		return this.msh.getMsh2_EncodingCharacters().getValue()==null?"":this.msh.getMsh2_EncodingCharacters().getValue();
	}
	/**
	 * @param msh_2_encodingCharacters the msh_2_encodingCharacters to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_2_encodingCharacters")
	public void setMsh_2_encodingCharacters(String msh_2_encodingCharacters) throws DataTypeException {
		this.msh_2_encodingCharacters = msh_2_encodingCharacters;
		this.msh.getMsh2_EncodingCharacters().setValue(msh_2_encodingCharacters);
	}
	/**
	 * @return the msh_3_sendingApplication
	 */
	@JsonProperty("msh_3_sendingApplication")
	public HD_v2 getMsh_3_sendingApplication() {
		return new HD_v2(
				this.msh.getMsh3_SendingApplication().getHd1_NamespaceID().getValue()==null?"":this.msh.getMsh3_SendingApplication().getHd1_NamespaceID().getValue(),
				this.msh.getMsh3_SendingApplication().getHd2_UniversalID().getValue()==null?"":this.msh.getMsh3_SendingApplication().getHd2_UniversalID().getValue(),
				this.msh.getMsh3_SendingApplication().getHd3_UniversalIDType().getValue()==null?"":this.msh.getMsh3_SendingApplication().getHd3_UniversalIDType().getValue());
	}
	/**
	 * @param msh_3_sendingApplication the msh_3_sendingApplication to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_3_sendingApplication")
	public void setMsh_3_sendingApplication(HD_v2 msh_3_sendingApplication) throws DataTypeException {
		this.msh_3_sendingApplication = msh_3_sendingApplication;
		this.msh.getMsh3_SendingApplication().getHd1_NamespaceID().setValue(msh_3_sendingApplication.getHd_1_namespaceId());
		this.msh.getMsh3_SendingApplication().getHd2_UniversalID().setValue(msh_3_sendingApplication.getHd_2_universalId());
		this.msh.getMsh3_SendingApplication().getHd3_UniversalIDType().setValue(msh_3_sendingApplication.getHd_3_universalIdType());
	}
	/**
	 * @return the msh_4_sendingFacility
	 */
	@JsonProperty("msh_4_sendingFacility")
	public HD_v2 getMsh_4_sendingFacility() {
		return new HD_v2(
				this.msh.getMsh4_SendingFacility().getHd1_NamespaceID().getValue()==null?"":this.msh.getMsh4_SendingFacility().getHd1_NamespaceID().getValue(),
				this.msh.getMsh4_SendingFacility().getHd2_UniversalID().getValue()==null?"":this.msh.getMsh4_SendingFacility().getHd2_UniversalID().getValue(),
				this.msh.getMsh4_SendingFacility().getHd3_UniversalIDType().getValue()==null?"":this.msh.getMsh4_SendingFacility().getHd3_UniversalIDType().getValue());
	}
	/**
	 * @param msh_4_sendingFacility the msh_4_sendingFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_4_sendingFacility")
	public void setMsh_4_sendingFacility(HD_v2 msh_4_sendingFacility) throws DataTypeException {
		this.msh_4_sendingFacility = msh_4_sendingFacility;
		this.msh.getMsh4_SendingFacility().getHd1_NamespaceID().setValue(msh_4_sendingFacility.getHd_1_namespaceId());
		this.msh.getMsh4_SendingFacility().getHd2_UniversalID().setValue(msh_4_sendingFacility.getHd_2_universalId());
		this.msh.getMsh4_SendingFacility().getHd3_UniversalIDType().setValue(msh_4_sendingFacility.getHd_3_universalIdType());
	}
	/**
	 * @return the msh_5_receivingApplication
	 */
	@JsonProperty("msh_5_receivingApplication")
	public HD_v2 getMsh_5_receivingApplication() {
		return new HD_v2(
				this.msh.getMsh5_ReceivingApplication().getHd1_NamespaceID().getValue()==null?"":this.msh.getMsh5_ReceivingApplication().getHd1_NamespaceID().getValue(),
				this.msh.getMsh5_ReceivingApplication().getHd2_UniversalID().getValue()==null?"":this.msh.getMsh5_ReceivingApplication().getHd2_UniversalID().getValue(),
				this.msh.getMsh5_ReceivingApplication().getHd3_UniversalIDType().getValue()==null?"":this.msh.getMsh5_ReceivingApplication().getHd3_UniversalIDType().getValue());
	}
	/**
	 * @param msh_5_receivingApplication the msh_5_receivingApplication to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_5_receivingApplication")
	public void setMsh_5_receivingApplication(HD_v2 msh_5_receivingApplication) throws DataTypeException {
		this.msh_5_receivingApplication = msh_5_receivingApplication;
		this.msh.getMsh5_ReceivingApplication().getHd1_NamespaceID().setValue(msh_5_receivingApplication.getHd_1_namespaceId());
		this.msh.getMsh5_ReceivingApplication().getHd2_UniversalID().setValue(msh_5_receivingApplication.getHd_2_universalId());
		this.msh.getMsh5_ReceivingApplication().getHd3_UniversalIDType().setValue(msh_5_receivingApplication.getHd_3_universalIdType());
	}
	/**
	 * @return the msh_6_receivingFacility
	 */
	@JsonProperty("msh_6_receivingFacility")
	public HD_v2 getMsh_6_receivingFacility() {
		return new HD_v2(
				this.msh.getMsh6_ReceivingFacility().getHd1_NamespaceID().getValue()==null?"":this.msh.getMsh6_ReceivingFacility().getHd1_NamespaceID().getValue(),
				this.msh.getMsh6_ReceivingFacility().getHd2_UniversalID().getValue()==null?"":this.msh.getMsh6_ReceivingFacility().getHd2_UniversalID().getValue(),
				this.msh.getMsh6_ReceivingFacility().getHd3_UniversalIDType().getValue()==null?"":this.msh.getMsh6_ReceivingFacility().getHd3_UniversalIDType().getValue());
		
	}
	/**
	 * @param msh_6_receivingFacility the msh_6_receivingFacility to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_6_receivingFacility")
	public void setMsh_6_receivingFacility(HD_v2 msh_6_receivingFacility) throws DataTypeException {
		this.msh_6_receivingFacility = msh_6_receivingFacility;
		this.msh.getMsh6_ReceivingFacility().getHd1_NamespaceID().setValue(msh_6_receivingFacility.getHd_1_namespaceId());
		this.msh.getMsh6_ReceivingFacility().getHd2_UniversalID().setValue(msh_6_receivingFacility.getHd_2_universalId());
		this.msh.getMsh6_ReceivingFacility().getHd3_UniversalIDType().setValue(msh_6_receivingFacility.getHd_3_universalIdType());
	}
	/**
	 * @return the msh_7_dateTimeOfMessage
	 */
	@JsonProperty("msh_7_dateTimeOfMessage")
	public TS_v2 getMsh_7_dateTimeOfMessage() {
		return new TS_v2(
				this.msh.getMsh7_DateTimeOfMessage().getTs1_Time().getValue()==null?"":this.msh.getMsh7_DateTimeOfMessage().getTs1_Time().getValue(),
				this.msh.getMsh7_DateTimeOfMessage().getTs2_DegreeOfPrecision().getValue()==null?"":this.msh.getMsh7_DateTimeOfMessage().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param msh_7_dateTimeOfMessage the msh_7_dateTimeOfMessage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_7_dateTimeOfMessage")
	public void setMsh_7_dateTimeOfMessage(TS_v2 msh_7_dateTimeOfMessage) throws DataTypeException {
		this.msh_7_dateTimeOfMessage = msh_7_dateTimeOfMessage;
		this.msh.getMsh7_DateTimeOfMessage().getTs1_Time().setValue(msh_7_dateTimeOfMessage.getTs_1_time());
		this.msh.getMsh7_DateTimeOfMessage().getTs2_DegreeOfPrecision().setValue(msh_7_dateTimeOfMessage.getTs_2_degreeOfPrecision());
	}
	/**
	 * @return the msh_8_security
	 */
	@JsonProperty("msh_8_security")
	public String getMsh_8_security() {
		return this.msh.getMsh8_Security().getValue()==null?"":this.msh.getMsh8_Security().getValue(); 
	}
	/**
	 * @param msh_8_security the msh_8_security to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_8_security")
	public void setMsh_8_security(String msh_8_security) throws DataTypeException {
		this.msh.getMsh8_Security().setValue(msh_8_security);
	}
	/**
	 * @return the msh_9_messageType
	 */
	@JsonProperty("msh_9_messageType")
	public MSG_v25 getMsh_9_messageType() {
		return new MSG_v25(
				this.msh.getMsh9_MessageType().getMsg1_MessageCode().getValue()==null?"":this.msh.getMsh9_MessageType().getMsg1_MessageCode().getValue(),
				this.msh.getMsh9_MessageType().getMsg2_TriggerEvent().getValue()==null?"":this.msh.getMsh9_MessageType().getMsg2_TriggerEvent().getValue(), 
				this.msh.getMsh9_MessageType().getMsg3_MessageStructure().getValue()==null?"":this.msh.getMsh9_MessageType().getMsg3_MessageStructure().getValue());
	}
	/**
	 * @param msh_9_messageType the msh_9_messageType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_9_messageType")
	public void setMsh_9_messageType(MSG_v25 msh_9_messageType) throws DataTypeException {
		this.msh.getMsh9_MessageType().getMsg1_MessageCode().setValue(msh_9_messageType.getMsg_1_messageCode());
		this.msh.getMsh9_MessageType().getMsg2_TriggerEvent().setValue(msh_9_messageType.getMsg_2_triggerEvent()); 
		this.msh.getMsh9_MessageType().getMsg3_MessageStructure().setValue(msh_9_messageType.getMsg_3_messageStructure());
	}
	/**
	 * @return the msh_10_messageControlID
	 */
	@JsonProperty("msh_10_messageControlID")
	public String getMsh_10_messageControlID() {
		return this.msh.getMsh10_MessageControlID().getValue()==null?"":this.msh.getMsh10_MessageControlID().getValue();
	}
	/**
	 * @throws DataTypeException 
	 * @param msh_10_messageControlID the msh_10_messageControlID to set
	 * @throws   
	 */
	@JsonProperty("msh_10_messageControlID")
	public void setMsh_10_messageControlID(String msh_10_messageControlID) throws DataTypeException    {
		this.msh_10_messageControlID = msh_10_messageControlID;
		this.msh.getMsh10_MessageControlID().setValue(msh_10_messageControlID);
	}
	/**
	 * @return the msh_11_processingID
	 */
	@JsonProperty("msh_11_processingID")
	public PT_v2 getMsh_11_processingID() {
		return new PT_v2(
				this.msh.getMsh11_ProcessingID().getPt1_ProcessingID().getValue()==null?"":this.msh.getMsh11_ProcessingID().getPt1_ProcessingID().getValue(),
				this.msh.getMsh11_ProcessingID().getPt2_ProcessingMode().getValue()==null?"":this.msh.getMsh11_ProcessingID().getPt2_ProcessingMode().getValue());
	}
	/**
	 * @param msh_11_processingID the msh_11_processingID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_11_processingID")
	public void setMsh_11_processingID(PT_v2 msh_11_processingID) throws DataTypeException {
		this.msh_11_processingID = msh_11_processingID;
		this.msh.getMsh11_ProcessingID().getPt1_ProcessingID().setValue(msh_11_processingID.getPt_1_processingId());
		this.msh.getMsh11_ProcessingID().getPt2_ProcessingMode().setValue(msh_11_processingID.getPt_2_processingMode());
	}
	/**
	 * @return the msh_12_versionID
	 */
	@JsonProperty("msh_12_versionID")
	public VID_v25 getMsh_12_versionID() {
		return new VID_v25(
				this.msh.getMsh12_VersionID().getVid1_VersionID().getValue(),
				new CE_v2(
						this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe1_Identifier().getValue()==null?"":this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe1_Identifier().getValue(),
						this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe2_Text().getValue()==null?"":this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe2_Text().getValue(),
						this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe3_NameOfCodingSystem().getValue(),
						this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe4_AlternateIdentifier().getValue()==null?"":this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe4_AlternateIdentifier().getValue(),
						this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe5_AlternateText().getValue()==null?"":this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe5_AlternateText().getValue(),
						this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe6_NameOfAlternateCodingSystem().getValue()),
				new CE_v2(
						this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe1_Identifier().getValue()==null?"":this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe1_Identifier().getValue(),
						this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe2_Text().getValue()==null?"":this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe2_Text().getValue(),
						this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe3_NameOfCodingSystem().getValue()==null?"":this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe3_NameOfCodingSystem().getValue(),
						this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe4_AlternateIdentifier().getValue()==null?"":this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe4_AlternateIdentifier().getValue(),
						this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe5_AlternateText().getValue()==null?"":this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe5_AlternateText().getValue(),
						this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe6_NameOfAlternateCodingSystem().getValue()));
	}
	/**
	 * @param msh_12_versionID the msh_12_versionID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_12_versionID")
	public void setMsh_12_versionID(VID_v25 msh_12_versionID) throws DataTypeException {
		this.msh_12_versionID = msh_12_versionID;
		this.msh.getMsh12_VersionID().getVid1_VersionID().setValue(msh_12_versionID.getVid_1_versionId());
		this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe1_Identifier().setValue(msh_12_versionID.getVid_2_ce_internationalizationCode().getCe_1_identifier());
		this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe2_Text().setValue(msh_12_versionID.getVid_2_ce_internationalizationCode().getCe_2_text());
		this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe3_NameOfCodingSystem().setValue(msh_12_versionID.getVid_2_ce_internationalizationCode().getCe_3_nameOfCodingSystem());
		this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe4_AlternateIdentifier().setValue(msh_12_versionID.getVid_2_ce_internationalizationCode().getCe_4_alternateIdentifier());
		this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe5_AlternateText().setValue(msh_12_versionID.getVid_2_ce_internationalizationCode().getCe_5_alternateText());
		this.msh.getMsh12_VersionID().getVid2_InternationalizationCode().getCe6_NameOfAlternateCodingSystem().setValue(msh_12_versionID.getVid_2_ce_internationalizationCode().getCe_6_nameOfAlternateCodingSystem());
		this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe1_Identifier().setValue(msh_12_versionID.getVid_3_ce_internationalVersionId().getCe_1_identifier());
		this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe2_Text().setValue(msh_12_versionID.getVid_3_ce_internationalVersionId().getCe_2_text());
		this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe3_NameOfCodingSystem().setValue(msh_12_versionID.getVid_3_ce_internationalVersionId().getCe_3_nameOfCodingSystem());
		this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe4_AlternateIdentifier().setValue(msh_12_versionID.getVid_3_ce_internationalVersionId().getCe_4_alternateIdentifier());
		this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe5_AlternateText().setValue(msh_12_versionID.getVid_3_ce_internationalVersionId().getCe_5_alternateText());
		this.msh.getMsh12_VersionID().getVid3_InternationalVersionID().getCe6_NameOfAlternateCodingSystem().setValue(msh_12_versionID.getVid_3_ce_internationalVersionId().getCe_6_nameOfAlternateCodingSystem());
		
	}
	/**
	 * @return the msh_13_sequenceNumber
	 */
	@JsonProperty("msh_13_sequenceNumber")
	public String getMsh_13_sequenceNumber() {
		return this.msh.getMsh13_SequenceNumber().getValue()==null?"":this.msh.getMsh13_SequenceNumber().getValue();
	}
	/**
	 * @param msh_13_sequenceNumber the msh_13_sequenceNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_13_sequenceNumber")
	public void setMsh_13_sequenceNumber(String msh_13_sequenceNumber) throws DataTypeException {
		this.msh_13_sequenceNumber = msh_13_sequenceNumber;
		this.msh.getMsh13_SequenceNumber().setValue(msh_13_sequenceNumber);
	}
	/**
	 * @return the msh_14_continuationPointer
	 */
	@JsonProperty("msh_14_continuationPointer")
	public String getMsh_14_continuationPointer() {
		return this.msh.getMsh14_ContinuationPointer().getValue()==null?"":this.msh.getMsh14_ContinuationPointer().getValue();
	}
	/**
	 * @param msh_14_continuationPointer the msh_14_continuationPointer to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_14_continuationPointer")
	public void setMsh_14_continuationPointer(String msh_14_continuationPointer) throws DataTypeException {
		this.msh_14_continuationPointer = msh_14_continuationPointer;
		this.msh.getMsh14_ContinuationPointer().setValue(msh_14_continuationPointer);
	}
	/**
	 * @return the msh_15_acceptAcknowledgmentType
	 */
	@JsonProperty("msh_15_acceptAcknowledgmentType")
	public String getMsh_15_acceptAcknowledgmentType() {
		return this.msh.getMsh15_AcceptAcknowledgmentType().getValue()==null?"":this.msh.getMsh15_AcceptAcknowledgmentType().getValue();
	}
	/**
	 * @param msh_15_acceptAcknowledgmentType the msh_15_acceptAcknowledgmentType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_15_acceptAcknowledgmentType")
	public void setMsh_15_acceptAcknowledgmentType(String msh_15_acceptAcknowledgmentType) throws DataTypeException {
		this.msh_15_acceptAcknowledgmentType = msh_15_acceptAcknowledgmentType;
		this.msh.getMsh15_AcceptAcknowledgmentType().setValue(msh_15_acceptAcknowledgmentType);
	}
	/**
	 * @return the msh_16_applicationAcknowledgmentType
	 */
	@JsonProperty("msh_16_applicationAcknowledgmentType")
	public String getMsh_16_applicationAcknowledgmentType() {
		return this.msh.getMsh16_ApplicationAcknowledgmentType().getValue()==null?"":this.msh.getMsh16_ApplicationAcknowledgmentType().getValue();
	}
	/**
	 * @param msh_16_applicationAcknowledgmentType the msh_16_applicationAcknowledgmentType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_16_applicationAcknowledgmentType")
	public void setMsh_16_applicationAcknowledgmentType(String msh_16_applicationAcknowledgmentType) throws DataTypeException {
		this.msh_16_applicationAcknowledgmentType = msh_16_applicationAcknowledgmentType;
		this.msh.getMsh16_ApplicationAcknowledgmentType().setValue(msh_16_applicationAcknowledgmentType);
	}
	/**
	 * @return the msh_17_countryCode
	 */
	@JsonProperty("msh_17_countryCode")
	public String getMsh_17_countryCode() {
		return this.msh.getMsh17_CountryCode().getValue()==null?"":this.msh.getMsh17_CountryCode().getValue();
	}
	/**
	 * @param msh_17_countryCode the msh_17_countryCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_17_countryCode")
	public void setMsh_17_countryCode(String msh_17_countryCode) throws DataTypeException {
		this.msh_17_countryCode = msh_17_countryCode;
		this.msh.getMsh17_CountryCode().setValue(msh_17_countryCode);;
	}
	/**
	 * @return the msh_18_characterSet
	 */
	@JsonProperty("msh_18_characterSet")
	public String[] getMsh_18_characterSet() {
		String[] characterSet = new String[this.msh.getMsh18_CharacterSet().length];
		for(int i = 0; i<this.msh.getMsh18_CharacterSet().length ; i++) {
			characterSet[i] = this.msh.getMsh18_CharacterSet(i).getValue()==null?"":this.msh.getMsh18_CharacterSet(i).getValue();
		}
		return characterSet;
	}
	/**
	 * @param msh_18_characterSet the msh_18_characterSet to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_18_characterSet")
	public void setMsh_18_characterSet(String[] msh_18_characterSet) throws DataTypeException {
		for(int i = 0; i<msh_18_characterSet.length;i++) {
			this.msh.getMsh18_CharacterSet(i).setValue(msh_18_characterSet[i]);
		}
		this.msh_18_characterSet = msh_18_characterSet;
	}
	/**
	 * @return the msh_19_principalLanguageOfMessage
	 */
	@JsonProperty("msh_19_principalLanguageOfMessage")
	public CE_v2 getMsh_19_principalLanguageOfMessage() {
		return new CE_v2(
				this.msh.getMsh19_PrincipalLanguageOfMessage().getCe1_Identifier().getValue()==null?"":this.msh.getMsh19_PrincipalLanguageOfMessage().getCe1_Identifier().getValue(),
				this.msh.getMsh19_PrincipalLanguageOfMessage().getCe2_Text().getValue()==null?"":this.msh.getMsh19_PrincipalLanguageOfMessage().getCe2_Text().getValue(),
				this.msh.getMsh19_PrincipalLanguageOfMessage().getCe3_NameOfCodingSystem().getValue()==null?"":this.msh.getMsh19_PrincipalLanguageOfMessage().getCe3_NameOfCodingSystem().getValue(),
				this.msh.getMsh19_PrincipalLanguageOfMessage().getCe4_AlternateIdentifier().getValue()==null?"":this.msh.getMsh19_PrincipalLanguageOfMessage().getCe4_AlternateIdentifier().getValue(),
				this.msh.getMsh19_PrincipalLanguageOfMessage().getCe5_AlternateText().getValue()==null?"":this.msh.getMsh19_PrincipalLanguageOfMessage().getCe5_AlternateText().getValue(),
				this.msh.getMsh19_PrincipalLanguageOfMessage().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.msh.getMsh19_PrincipalLanguageOfMessage().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param msh_19_principalLanguageOfMessage the msh_19_principalLanguageOfMessage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_19_principalLanguageOfMessage")
	public void setMsh_19_principalLanguageOfMessage(CE_v2 msh_19_principalLanguageOfMessage) throws DataTypeException {
		this.msh_19_principalLanguageOfMessage = msh_19_principalLanguageOfMessage;
		this.msh.getMsh19_PrincipalLanguageOfMessage().getCe1_Identifier().setValue(msh_19_principalLanguageOfMessage.getCe_1_identifier());
		this.msh.getMsh19_PrincipalLanguageOfMessage().getCe2_Text().setValue(msh_19_principalLanguageOfMessage.getCe_2_text());
		this.msh.getMsh19_PrincipalLanguageOfMessage().getCe3_NameOfCodingSystem().setValue(msh_19_principalLanguageOfMessage.getCe_3_nameOfCodingSystem());
		this.msh.getMsh19_PrincipalLanguageOfMessage().getCe4_AlternateIdentifier().setValue(msh_19_principalLanguageOfMessage.getCe_4_alternateIdentifier());
		this.msh.getMsh19_PrincipalLanguageOfMessage().getCe5_AlternateText().setValue(msh_19_principalLanguageOfMessage.getCe_5_alternateText());
		this.msh.getMsh19_PrincipalLanguageOfMessage().getCe6_NameOfAlternateCodingSystem().setValue(msh_19_principalLanguageOfMessage.getCe_6_nameOfAlternateCodingSystem());
	}
	/**
	 * @return the msh_20_alternateCharacterSetHandlingScheme
	 */
	@JsonProperty("msh_20_alternateCharacterSetHandlingScheme")
	public String getMsh_20_alternateCharacterSetHandlingScheme() {
		return this.msh.getMsh20_AlternateCharacterSetHandlingScheme().getValue()==null?"":this.msh.getMsh20_AlternateCharacterSetHandlingScheme().getValue();
	}
	/**
	 * @param msh_20_alternateCharacterSetHandlingScheme the msh_20_alternateCharacterSetHandlingScheme to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_20_alternateCharacterSetHandlingScheme")
	public void setMsh_20_alternateCharacterSetHandlingScheme(String msh_20_alternateCharacterSetHandlingScheme) throws DataTypeException {
		this.msh_20_alternateCharacterSetHandlingScheme = msh_20_alternateCharacterSetHandlingScheme;
		this.msh.getMsh20_AlternateCharacterSetHandlingScheme().setValue(msh_20_alternateCharacterSetHandlingScheme);
	}
	/**
	 * @return the msh_21_messageProfileIdentifier
	 */
	@JsonProperty("msh_21_messageProfileIdentifier")
	public EI_v2[] getMsh_21_messageProfileIdentifier() {
		EI_v2[] messageProfileIdentifier = new EI_v2[this.msh.getMsh21_MessageProfileIdentifier().length];
		for(int i =0; i < this.msh.getMsh21_MessageProfileIdentifier().length; i++) {
			messageProfileIdentifier[i] = new EI_v2(
					this.msh.getMsh21_MessageProfileIdentifier(i).getEi1_EntityIdentifier().getValue()==null?"":this.msh.getMsh21_MessageProfileIdentifier(i).getEi1_EntityIdentifier().getValue(),
					this.msh.getMsh21_MessageProfileIdentifier(i).getEi2_NamespaceID().getValue()==null?"":this.msh.getMsh21_MessageProfileIdentifier(i).getEi2_NamespaceID().getValue(),
					this.msh.getMsh21_MessageProfileIdentifier(i).getEi3_UniversalID().getValue()==null?"":this.msh.getMsh21_MessageProfileIdentifier(i).getEi3_UniversalID().getValue(),
					this.msh.getMsh21_MessageProfileIdentifier(i).getEi4_UniversalIDType().getValue()==null?"":this.msh.getMsh21_MessageProfileIdentifier(i).getEi4_UniversalIDType().getValue());
		}
		return messageProfileIdentifier;
	}
	/**
	 * @param msh_21_messageProfileIdentifier the msh_21_messageProfileIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msh_21_messageProfileIdentifier")
	public void setMsh_21_messageProfileIdentifier(EI_v2[] msh_21_messageProfileIdentifier) throws DataTypeException {
		for(int i =0; i < msh_21_messageProfileIdentifier.length; i++) {
			this.msh.getMsh21_MessageProfileIdentifier(i).getEi1_EntityIdentifier().setValue(msh_21_messageProfileIdentifier[i].getEi_1_entityIdentifier());
			this.msh.getMsh21_MessageProfileIdentifier(i).getEi2_NamespaceID().setValue(msh_21_messageProfileIdentifier[i].getEi_2_namespaceId());
			this.msh.getMsh21_MessageProfileIdentifier(i).getEi3_UniversalID().setValue(msh_21_messageProfileIdentifier[i].getEi_3_universalId());
			this.msh.getMsh21_MessageProfileIdentifier(i).getEi4_UniversalIDType().setValue(msh_21_messageProfileIdentifier[i].getEi_4_universalIdType());
		}
		this.msh_21_messageProfileIdentifier = msh_21_messageProfileIdentifier;
	}
	/**
	 * @return the nte
	 */
	@JsonProperty("nte")
	public List<CustomNTE_v25> getNte() {
		return nte;
	}
	/**
	 * @param nte the nte to set
	 */
	@JsonProperty("nte")
	public void setNte(List<CustomNTE_v25> nte) {
		this.nte = nte;
	}
	@Override
	public String toString() {
		return "CustomMSH_v25 [msh_1_fieldSeparator=" + msh_1_fieldSeparator + ", msh_2_encodingCharacters="
				+ msh_2_encodingCharacters + ", msh_3_sendingApplication=" + msh_3_sendingApplication
				+ ", msh_4_sendingFacility=" + msh_4_sendingFacility + ", msh_5_receivingApplication="
				+ msh_5_receivingApplication + ", msh_6_receivingFacility=" + msh_6_receivingFacility
				+ ", msh_7_dateTimeOfMessage=" + msh_7_dateTimeOfMessage + ", msh_8_security=" + msh_8_security
				+ ", msh_9_messageType=" + msh_9_messageType + ", msh_10_messageControlID=" + msh_10_messageControlID
				+ ", msh_11_processingID=" + msh_11_processingID + ", msh_12_versionID=" + msh_12_versionID
				+ ", msh_13_sequenceNumber=" + msh_13_sequenceNumber + ", msh_14_continuationPointer="
				+ msh_14_continuationPointer + ", msh_15_acceptAcknowledgmentType=" + msh_15_acceptAcknowledgmentType
				+ ", msh_16_applicationAcknowledgmentType=" + msh_16_applicationAcknowledgmentType
				+ ", msh_17_countryCode=" + msh_17_countryCode + ", msh_18_characterSet=" + msh_18_characterSet
				+ ", msh_19_principalLanguageOfMessage=" + msh_19_principalLanguageOfMessage
				+ ", msh_20_alternateCharacterSetHandlingScheme=" + msh_20_alternateCharacterSetHandlingScheme
				+ ", msh_21_messageProfileIdentifier=" + msh_21_messageProfileIdentifier + ", nte="
				+ nte + ", msh=" + msh + "]";
	}
	
}
