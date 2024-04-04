package scratch.coding.generic;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.model.DataTypeException;
import scratch.coding.models.AuthorityAndFacility;
import scratch.coding.models.DateAndTime;
import scratch.coding.models.IdentifierAndCoding;
import scratch.coding.models.MessageType;
import scratch.coding.models.ProcessingID;
import scratch.coding.segment.v23.CustomNTE;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericMSH {
	@JsonProperty("fieldSeparator")
	private String fieldSeparator;
	@JsonProperty("encodingCharacters")
	private String encodingCharacters;
	@JsonProperty("sendingApplication")
	private AuthorityAndFacility sendingApplication;
	@JsonProperty("sendingFacility")
	private AuthorityAndFacility sendingFacility;
	@JsonProperty("receivingApplication")
	private AuthorityAndFacility receivingApplication;
	@JsonProperty("receivingFacility")
	private AuthorityAndFacility receivingFacility;
	@JsonProperty("dateTimeOfMessage")
	private DateAndTime dateTimeOfMessage;
	@JsonProperty("security")
	private String security;
	@JsonProperty("messageType")
	private MessageType messageType;
	@JsonProperty("messageControlId")
	private String messageControlId;
	@JsonProperty("processingId")
	private ProcessingID processingId;
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
	private IdentifierAndCoding principalLanguageOfMessage;
	@JsonProperty("nte")
	private CustomNTE[] nte;
	public GenericMSH() {
		super();
	}
	/**
	 * @return the fieldSeparator
	 */
	public String getFieldSeparator() {
		return fieldSeparator;
	}
	/**
	 * @param fieldSeparator the fieldSeparator to set
	 * @throws DataTypeException 
	 */
	public void setFieldSeparator(String fieldSeparator) throws DataTypeException {
		this.fieldSeparator = fieldSeparator;
	}
	/**
	 * @return the encodingCharacters
	 */
	public String getEncodingCharacters() {
		return encodingCharacters;
	}
	/**
	 * @param encodingCharacters the encodingCharacters to set
	 * @throws DataTypeException 
	 */
	public void setEncodingCharacters(String encodingCharacters) throws DataTypeException {
		this.encodingCharacters = encodingCharacters;
	}
	/**
	 * @return the sendingApplication
	 */
	public AuthorityAndFacility getSendingApplication()  {
		return sendingApplication;
	}
	/**
	 * @param sendingApplication the sendingApplication to set
	 * @throws DataTypeException 
	 */
	public void setSendingApplication(AuthorityAndFacility sendingApplication) throws DataTypeException {
		this.sendingApplication = sendingApplication;
	}
	/**
	 * @return the sendingFacility
	 */
	public AuthorityAndFacility getSendingFacility() {
		return sendingFacility;
	}
	/**
	 * @param sendingFacility the sendingFacility to set
	 * @throws DataTypeException 
	 */
	public void setSendingFacility(AuthorityAndFacility sendingFacility) throws DataTypeException {
		this.sendingFacility = sendingFacility;
	}
	/**
	 * @return the receivingApplication
	 */
	public AuthorityAndFacility getReceivingApplication() {
		return receivingApplication;
	}
	/**
	 * @param receivingApplication the receivingApplication to set
	 * @throws DataTypeException 
	 */
	public void setReceivingApplication(AuthorityAndFacility receivingApplication) throws DataTypeException {
		this.receivingApplication = receivingApplication;
	}
	/**
	 * @return the receivingFacility
	 */
	public AuthorityAndFacility getReceivingFacility() {
		return receivingFacility;
	}
	/**
	 * @param receivingFacility the receivingFacility to set
	 * @throws DataTypeException 
	 */
	public void setReceivingFacility(AuthorityAndFacility receivingFacility) throws DataTypeException {
		this.receivingFacility = receivingFacility;
	}
	/**
	 * @return the dateTimeOfMessage
	 */
	public DateAndTime getDateTimeOfMessage() {
		return dateTimeOfMessage;
	}
	/**
	 * @param dateTimeOfMessage the dateTimeOfMessage to set
	 * @throws DataTypeException 
	 */
	public void setDateTimeOfMessage(DateAndTime dateTimeOfMessage) throws DataTypeException {
		this.dateTimeOfMessage = dateTimeOfMessage;
	}
	/**
	 * @return the security
	 */
	public String getSecurity() {
		return security;
	}
	/**
	 * @param security the security to set
	 * @throws DataTypeException 
	 */
	public void setSecurity(String security) throws DataTypeException {
		this.security = security;
	}
	/**
	 * @return the messageType
	 */
	public MessageType getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 * @throws DataTypeException 
	 */
	public void setMessageType(MessageType messageType) throws DataTypeException {
		this.messageType = messageType;
	}
	/**
	 * @return the messageControlId
	 */
	public String getMessageControlId() {
		return messageControlId;
	}
	/**
	 * @param messageControlId the messageControlId to set
	 * @throws DataTypeException 
	 */
	public void setMessageControlId(String messageControlId) throws DataTypeException {
		this.messageControlId = messageControlId;
	}
	/**
	 * @return the processingId
	 */
	public ProcessingID getProcessingId() {
		return processingId;
	}
	/**
	 * @param processingId the processingId to set
	 * @throws DataTypeException 
	 */
	public void setProcessingId(ProcessingID processingId) throws DataTypeException {
		this.processingId = processingId;
	}
	/**
	 * @return the versionId
	 */
	public String getVersionId() {
		return versionId;
	}
	/**
	 * @param versionId the versionId to set
	 * @throws DataTypeException 
	 */
	public void setVersionId(String versionId) throws DataTypeException {
		this.versionId = versionId;
	}
	/**
	 * @return the sequenceNumber
	 */
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	/**
	 * @param sequenceNumber the sequenceNumber to set
	 * @throws DataTypeException 
	 */
	public void setSequenceNumber(String sequenceNumber) throws DataTypeException {
		this.sequenceNumber = sequenceNumber;
	}
	/**
	 * @return the continuationPointer
	 */
	public String getContinuationPointer() {
		return continuationPointer;
	}
	/**
	 * @param continuationPointer the continuationPointer to set
	 * @throws DataTypeException 
	 */
	public void setContinuationPointer(String continuationPointer) throws DataTypeException {
		this.continuationPointer = continuationPointer;
	}
	/**
	 * @return the acceptAcknowledgementType
	 */
	public String getAcceptAcknowledgementType() {
		return acceptAcknowledgementType;
	}
	/**
	 * @param acceptAcknowledgementType the acceptAcknowledgementType to set
	 * @throws DataTypeException 
	 */
	public void setAcceptAcknowledgementType(String acceptAcknowledgementType) throws DataTypeException {
		this.acceptAcknowledgementType = acceptAcknowledgementType;
	}
	/**
	 * @return the applicationAcknowledgementType
	 */
	public String getApplicationAcknowledgementType() {
		return applicationAcknowledgementType;
	}
	/**
	 * @param applicationAcknowledgementType the applicationAcknowledgementType to set
	 * @throws DataTypeException 
	 */
	public void setApplicationAcknowledgementType(String applicationAcknowledgementType) throws DataTypeException {
		this.applicationAcknowledgementType = applicationAcknowledgementType;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 * @throws DataTypeException 
	 */
	public void setCountryCode(String countryCode) throws DataTypeException {
		this.countryCode = countryCode;
	}
	/**
	 * @return the characterSet
	 */
	public String getCharacterSet() {
		return characterSet;
	}
	/**
	 * @param characterSet the characterSet to set
	 * @throws DataTypeException 
	 */
	public void setCharacterSet(String characterSet) throws DataTypeException {
		this.characterSet = characterSet;
	}
	/**
	 * @return the principalLanguageOfMessage
	 */
	public IdentifierAndCoding getPrincipalLanguageOfMessage() {
		return principalLanguageOfMessage;
	}
	/**
	 * @param principalLanguageOfMessage the principalLanguageOfMessage to set
	 * @throws DataTypeException 
	 */
	public void setPrincipalLanguageOfMessage(IdentifierAndCoding principalLanguageOfMessage) throws DataTypeException {
		this.principalLanguageOfMessage = principalLanguageOfMessage;
	}
	/**
	 * @return the nte
	 */
	public CustomNTE[] getNte() {
		return nte;
	}
	/**
	 * @param nte the nte to set
	 */
	public void setNte(CustomNTE[] nte) {
		this.nte = nte;
	}
	@Override
	public String toString() {
		return "GenericMSH [fieldSeparator=" + fieldSeparator + ", encodingCharacters=" + encodingCharacters
				+ ", sendingApplication=" + sendingApplication + ", sendingFacility=" + sendingFacility
				+ ", receivingApplication=" + receivingApplication + ", receivingFacility=" + receivingFacility
				+ ", dateTimeOfMessage=" + dateTimeOfMessage + ", security=" + security + ", messageType=" + messageType
				+ ", messageControlId=" + messageControlId + ", processingId=" + processingId + ", versionId="
				+ versionId + ", sequenceNumber=" + sequenceNumber + ", continuationPointer=" + continuationPointer
				+ ", acceptAcknowledgementType=" + acceptAcknowledgementType + ", applicationAcknowledgementType="
				+ applicationAcknowledgementType + ", countryCode=" + countryCode + ", characterSet=" + characterSet
				+ ", principalLanguageOfMessage=" + principalLanguageOfMessage + ", nte=" + Arrays.toString(nte) + "]";
	}
	
	
}
