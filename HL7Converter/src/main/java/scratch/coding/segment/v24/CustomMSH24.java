package scratch.coding.segment.v24;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v24.datatype.ID;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.parser.Parser;
import scratch.coding.generator.AdtMessageFactory;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomMSH24 implements Serializable {
	@JsonProperty("segmentName")
	private String segmentName;
	@JsonProperty("encodingCharacters")
	private String encodingCharacters;
	@JsonProperty("separator")
	private String separator;
	@JsonProperty("sendingApplication")
	private String sendingApplication;
	@JsonProperty("sendingFacility")
	private String sendingFacility;
	@JsonProperty("receivingApplication")
	private String receivingApplication;
	@JsonProperty("receivingFacility")
	private String receivingFacility;
	@JsonProperty("dateTimeOfMessage")
	private String dateTimeOfMessage;
	@JsonProperty("security")
	private String security;
	@JsonProperty("messageType")
	private String messageType;
	@JsonProperty("messageControlId")
	private String messageControlId;
	@JsonProperty("processingId")
	private String processingId;
	@JsonProperty("versionId")
	private String versionId;
	@JsonProperty("sequenceNumber")
	private String sequenceNumber;
	@JsonProperty("continuationPointer")
	private String continuationPointer;
	@JsonProperty("acceptAcknowledgementType")
	private String acceptAcknowledgementType;
	@JsonProperty("applicationAcknowledgementType")
	private String applicationAcknowledgementType;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("characterSet")
	private String characterSet;
	@JsonProperty("principalLanguageOfMessage")
	private String principalLanguageOfMessage;
	
	private static ADT_A01 adt;
	private MSH msh;
	private static HapiContext context = new DefaultHapiContext();
	Parser pipeParser = context.getPipeParser();
	
	
	public CustomMSH24(MSH msh) {
		super();
		this.msh =msh;
	}
	public static CustomMSH24 createMsh1WithTypeAndVersion(MSH msh) throws HL7Exception, IOException {
		
		return new CustomMSH24(msh);
	}
	@JsonProperty("segmentName")
	public String getSegmentName() {
		return  msh.getName(); 
		
	}
	@JsonProperty("segmentName")
	public void setSegmentName(String segmentName) {
		this.segmentName = msh.getName();
	}
	@JsonProperty("encodingCharacters")
	public String getEncodingCharacters() {
		this.encodingCharacters =msh.getEncodingCharacters().getValue();
		return this.encodingCharacters;
	}
	@JsonProperty("encodingCharacters")
	public void setEncodingCharacters(String encodingCharacters) throws DataTypeException {
		msh.getEncodingCharacters().setValue(encodingCharacters);
		this.encodingCharacters = msh.getEncodingCharacters().getValue();
	}
	@JsonProperty("separator")
	public String getSeparator() {
		return msh.getFieldSeparator().getValue();
	}
	@JsonProperty("separator")
	public void setSeparator(String separator) throws DataTypeException {
		msh.getFieldSeparator().setValue(separator);
	}
	@JsonProperty("sendingApplication")
	public String getSendingApplication() throws HL7Exception {
		return msh.getSendingApplication().getNamespaceID().getValue();
	}
	@JsonProperty("sendingApplication")
	public void setSendingApplication(String sendingApplication) throws DataTypeException {
		msh.getSendingApplication().getNamespaceID().setValue(sendingApplication);
		this.sendingApplication = msh.getSendingApplication().getNamespaceID().getValue();
	}
	@JsonProperty("sendingFacility")
	public String getSendingFacility() {
		return msh.getSendingFacility().getNamespaceID().getValue();
	}
	@JsonProperty("sendingFacility")
	public void setSendingFacility(String sendingFacility) throws DataTypeException {
		msh.getSendingFacility().getNamespaceID().setValue(sendingFacility);
		this.sendingFacility = msh.getSendingFacility().getNamespaceID().getValue();
	}
	@JsonProperty("receivingApplication")
	public String getReceivingApplication() {
		return msh.getReceivingApplication().getNamespaceID().getValue();
	}
	@JsonProperty("receivingApplication")
	public void setReceivingApplication(String receivingApplication) throws DataTypeException {
		msh.getReceivingApplication().getNamespaceID().setValue(receivingApplication);
		this.receivingApplication = msh.getReceivingApplication().getNamespaceID().getValue();
	}
	@JsonProperty("receivingFacility")
	public String getReceivingFacility() {
		return msh.getReceivingFacility().getNamespaceID().getValue();
	}
	@JsonProperty("receivingFacility")
	public void setReceivingFacility(String receivingFacility) throws DataTypeException {
		msh.getReceivingFacility().getNamespaceID().setValue(receivingFacility);
		this.receivingFacility = msh.getReceivingFacility().getNamespaceID().getValue();
	}
	@JsonProperty("dateTimeOfMessage")
	public String getDateTimeOfMessage() {
		return msh.getDateTimeOfMessage().getTimeOfAnEvent().getValue();
	}
	@JsonProperty("dateTimeOfMessage")
	public void setDateTimeOfMessage(Calendar dateTimeOfMessage) throws DataTypeException {
		msh.getDateTimeOfMessage().getTimeOfAnEvent().setValue(dateTimeOfMessage);
		this.dateTimeOfMessage = msh.getDateTimeOfMessage().getTimeOfAnEvent().getValue();
	}
	@JsonProperty("security")
	public String getSecurity() {
		return msh.getSecurity().getValue();
	}
	@JsonProperty("security")
	public void setSecurity(String security) throws DataTypeException {
		msh.getSecurity().setValue(security);
		this.security = msh.getSecurity().getValue();
	}
	@JsonProperty("messageType")
	public String getMessageType() {
		return msh.getMessageType().getMessageType().getValue();
	}
	@JsonProperty("messageType")
	public void setMessageType(String messageType) throws DataTypeException {
		msh.getMessageType().getMessageType().setValue(messageType);
		this.messageType = msh.getMessageType().getMessageType().getValue();
	}
	@JsonProperty("messageControlId")
	public String getMessageControlId() {
		return msh.getMessageControlID().getValue();
	}
	@JsonProperty("messageControlId")
	public void setMessageControlId(String messageControlId) throws DataTypeException {
		msh.getMessageControlID().setValue(messageControlId);
		this.messageControlId = msh.getMessageControlID().getValue();
	}
	@JsonProperty("processingId")
	public String getProcessingId() {
		return msh.getProcessingID().getProcessingID().getValue();
	}
	@JsonProperty("processingId")
	public void setProcessingId(String processingId) throws DataTypeException {
		 msh.getProcessingID().getProcessingID().setValue(processingId);
		this.processingId = msh.getProcessingID().getProcessingID().getValue();
	}
	@JsonProperty("versionId")
	public String getVersionId() {
		return msh.getVersionID().getVersionID().getValue();
	}
	@JsonProperty("versionId")
	public void setVersionId(String versionId) throws DataTypeException {
		msh.getVersionID().getVersionID().setValue(versionId);
		this.versionId = msh.getVersionID().getVersionID().getValue();
	}
	@JsonProperty("sequenceNumber")
	public String getSequenceNumber() {
		return msh.getSequenceNumber().getValue();
	}
	@JsonProperty("sequenceNumber")
	public void setSequenceNumber(String sequenceNumber) throws DataTypeException {
		msh.getSequenceNumber().setValue(sequenceNumber);
		this.sequenceNumber = msh.getSequenceNumber().getValue();
	}
	@JsonProperty("continuationPointer")
	public String getContinuationPointer() {
		return msh.getContinuationPointer().getValue();
	}
	@JsonProperty("continuationPointer")
	public void setContinuationPointer(String continuationPointer) throws DataTypeException {
		msh.getContinuationPointer().setValue(continuationPointer);
		this.continuationPointer = msh.getContinuationPointer().getValue();
	}
	@JsonProperty("acceptAcknowledgementType")
	public String getAcceptAcknowledgementType() {
		return msh.getAcceptAcknowledgmentType().getValue();
	}
	@JsonProperty("acceptAcknowledgementType")
	public void setAcceptAcknowledgementType(String acceptAcknowledgementType) throws DataTypeException {
		msh.getAcceptAcknowledgmentType().setValue(acceptAcknowledgementType);
		this.acceptAcknowledgementType = msh.getAcceptAcknowledgmentType().getValue();
	}
	@JsonProperty("applicationAcknowledgementType")
	public String getApplicationAcknowledgementType() {
		return msh.getApplicationAcknowledgmentType().getValue();
	}
	@JsonProperty("applicationAcknowledgementType")
	public void setApplicationAcknowledgementType(String applicationAcknowledgementType) throws DataTypeException {
		msh.getApplicationAcknowledgmentType().setValue(applicationAcknowledgementType);
		this.applicationAcknowledgementType = msh.getApplicationAcknowledgmentType().getValue();
	}
	@JsonProperty("countryCode")
	public String getCountryCode() {
		return msh.getCountryCode().getValue();
	}
	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) throws DataTypeException {
		msh.getCountryCode().setValue(countryCode);
		this.countryCode = msh.getCountryCode().getValue();
	}
	@JsonProperty("characterSet")
	public ID[] getCharacterSet() {
		return msh.getCharacterSet();
	}
	@JsonProperty("characterSet")
	public void setCharacterSet(String characterSet) {
		this.characterSet = characterSet;
	}
	@JsonProperty("principalLanguageOfMessage")
	public String getPrincipalLanguageOfMessage() {
		return msh.getPrincipalLanguageOfMessage().getAlternateIdentifier().getValue();
	}
	@JsonProperty("principalLanguageOfMessage")
	public void setPrincipalLanguageOfMessage(String principalLanguageOfMessage) throws DataTypeException {
		msh.getPrincipalLanguageOfMessage().getAlternateIdentifier().setValue(principalLanguageOfMessage);
		this.principalLanguageOfMessage = msh.getPrincipalLanguageOfMessage().getAlternateIdentifier().getValue();
	}
}
