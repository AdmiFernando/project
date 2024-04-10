package scratch.coding.segment.v251;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v251.segment.MSH;
import scratch.coding.generic.GenericMSH;
import scratch.coding.models.AuthorityAndFacility;
import scratch.coding.models.DateAndTime;
import scratch.coding.models.IdentifierAndCoding;
import scratch.coding.models.MessageType;
import scratch.coding.models.ProcessingID;
import scratch.coding.segment.v23.CustomNTE;

public class CustomMSH extends GenericMSH {
	
	@JsonProperty("AlternateCharacterSetHandlingScheme")
	private String AlternateCharacterSetHandlingScheme;
	@JsonProperty("MessageProfileIdentifier")
	private String MessageProfileIdentifier;
	private CustomNTE[] nte;
	private MSH msh;
	

	private CustomMSH(MSH msh, CustomNTE[] nte) {
		super();
		this.msh =msh;
		this.nte = nte;
	}
	private CustomMSH(MSH msh) {
		super();
		this.msh =msh;
	}
	public static CustomMSH createMshWithMSH(MSH msh) throws HL7Exception, IOException {
		return new CustomMSH(msh);
	}
	@Override
	public String getFieldSeparator() {
		// TODO Auto-generated method stub
		return msh.getFieldSeparator().getValue();
	}
	@Override
	public void setFieldSeparator(String fieldSeparator) throws DataTypeException {
		msh.getFieldSeparator().setValue(fieldSeparator);
		super.setFieldSeparator(fieldSeparator);
	}
	@Override
	public String getEncodingCharacters() {
		// TODO Auto-generated method stub
		return msh.getEncodingCharacters().getValue();
	}
	@Override
	public void setEncodingCharacters(String encodingCharacters) throws DataTypeException {
		msh.getEncodingCharacters().setValue(encodingCharacters);
		super.setEncodingCharacters(msh.getEncodingCharacters().getValue());
	}
	@Override
	public AuthorityAndFacility getSendingApplication() {
		return new AuthorityAndFacility(msh.getSendingApplication().getName(),
				msh.getSendingApplication().getNamespaceID().getValue(),
				msh.getSendingApplication().getUniversalID().getValue(),
				msh.getSendingApplication().getUniversalIDType().getValue());
	}
	@Override
	public void setSendingApplication(AuthorityAndFacility sendingApplication) throws DataTypeException {
		msh.getSendingApplication().getNamespaceID().setValue(sendingApplication.getNameSpaceId());
		msh.getSendingApplication().getUniversalID().setValue(sendingApplication.getUniversalID());
		msh.getSendingApplication().getUniversalIDType().setValue(sendingApplication.getUniversalIDType());
		super.setSendingApplication(sendingApplication);
	}
	@Override
	public AuthorityAndFacility getSendingFacility() {
		return new AuthorityAndFacility(msh.getSendingFacility().getName(),
				msh.getSendingFacility().getNamespaceID().getValue(),
				msh.getSendingFacility().getUniversalID().getValue(),
				msh.getSendingFacility().getUniversalIDType().getValue());
	}
	@Override
	public void setSendingFacility(AuthorityAndFacility sendingFacility) throws DataTypeException {
		msh.getSendingFacility().getNamespaceID().setValue(sendingFacility.getNameSpaceId());
		msh.getSendingFacility().getUniversalID().setValue(sendingFacility.getUniversalID());
		msh.getSendingFacility().getUniversalIDType().setValue(sendingFacility.getUniversalIDType());
		super.setSendingFacility(sendingFacility);
	}
	@Override
	public AuthorityAndFacility getReceivingApplication() {
		return new AuthorityAndFacility(msh.getReceivingApplication().getName(),
				msh.getReceivingApplication().getNamespaceID().getValue(),
				msh.getReceivingApplication().getUniversalID().getValue(),
				msh.getReceivingApplication().getUniversalIDType().getValue());
	}
	@Override
	public void setReceivingApplication(AuthorityAndFacility receivingApplication) throws DataTypeException {
		msh.getReceivingApplication().getNamespaceID().setValue(receivingApplication.getNameSpaceId());
		msh.getReceivingApplication().getUniversalID().setValue(receivingApplication.getUniversalID());
		msh.getReceivingApplication().getUniversalIDType().setValue(receivingApplication.getUniversalIDType());
		super.setSendingFacility(receivingApplication);
	}
	@Override
	public AuthorityAndFacility getReceivingFacility() {
		return new AuthorityAndFacility(msh.getReceivingFacility().getName(),
				msh.getReceivingFacility().getNamespaceID().getValue(),
				msh.getReceivingFacility().getUniversalID().getValue(),
				msh.getReceivingFacility().getUniversalIDType().getValue());
	}
	@Override
	public void setReceivingFacility(AuthorityAndFacility receivingFacility) throws DataTypeException {
		msh.getReceivingFacility().getNamespaceID().setValue(receivingFacility.getNameSpaceId());
		msh.getReceivingFacility().getUniversalID().setValue(receivingFacility.getUniversalID());
		msh.getReceivingFacility().getUniversalIDType().setValue(receivingFacility.getUniversalIDType());
		super.setReceivingFacility(receivingFacility);
	}
	@Override
	public DateAndTime getDateTimeOfMessage() {
		return new DateAndTime(
				msh.getDateTimeOfMessage().getName(), 
				msh.getDateTimeOfMessage().getTime().getValue(),
				msh.getDateTimeOfMessage().getDegreeOfPrecision().getValue());
				
	}
	@Override
	public void setDateTimeOfMessage(DateAndTime dateTimeOfMessage) throws DataTypeException { 
		msh.getDateTimeOfMessage().getTime().setValue(dateTimeOfMessage.getTimeOfAnEvent());
		msh.getDateTimeOfMessage().getDegreeOfPrecision().setValue(dateTimeOfMessage.getDegreeOfPrecision());
		super.setDateTimeOfMessage(dateTimeOfMessage);
	}
	@Override
	public String getSecurity() {
		// TODO Auto-generated method stub
		return msh.getSecurity().getValue();
	}
	@Override
	public void setSecurity(String security) throws DataTypeException {
		msh.getSecurity().setValue(security);
		super.setSecurity(security);
	}
	@Override
	public MessageType getMessageType() {
		return new MessageType(
				msh.getMessageType().getName(),
				msh.getMessageType().getMessageCode().getValue(),
				msh.getMessageType().getTriggerEvent().getValue());
	}
	@Override
	public void setMessageType(MessageType messageType) throws DataTypeException {
		msh.getMessageType().getMessageCode().setValue(messageType.getMessageType());
		msh.getMessageType().getTriggerEvent().setValue(messageType.getTriggerEvent());
		super.setMessageType(messageType);
	}
	@Override
	public String getMessageControlId() {
		// TODO Auto-generated method stub
		return msh.getMessageControlID().getValue();
	}
	@Override
	public void setMessageControlId(String messageControlId) throws DataTypeException {
		msh.getMessageControlID().setValue(messageControlId);
		super.setMessageControlId(messageControlId);
	}
	@Override
	public ProcessingID getProcessingId() {
		return new ProcessingID(
				msh.getProcessingID().getName(),
				msh.getProcessingID().getProcessingID().getValue(),
				msh.getProcessingID().getProcessingMode().getValue());
	}
	@Override
	public void setProcessingId(ProcessingID processingId) throws DataTypeException {
		msh.getProcessingID().getProcessingID().setValue(processingId.getProcessingID());
		msh.getProcessingID().getProcessingMode().setValue(processingId.getProcessingMode());
		super.setProcessingId(processingId);
	}
	@Override
	public String getVersionId() {
		return msh.getVersionID().getVersionID().getValue();
	}
	@Override
	public void setVersionId(String versionId) throws DataTypeException {
		msh.getVersionID().getVersionID().setValue(versionId);
		super.setVersionId(versionId);
	}
	@Override
	public String getSequenceNumber() {
		// TODO Auto-generated method stub
		return msh.getSequenceNumber().getValue();
	}
	@Override
	public void setSequenceNumber(String sequenceNumber) throws DataTypeException {
		msh.getSequenceNumber().setValue(sequenceNumber);
		super.setSequenceNumber(sequenceNumber);
	}
	@Override
	public String getContinuationPointer() {
		
		return msh.getContinuationPointer().getValue();
	}
	@Override
	public void setContinuationPointer(String continuationPointer) throws DataTypeException {
		msh.getContinuationPointer().setValue(continuationPointer);
		super.setContinuationPointer(continuationPointer);
	}
	@Override
	public String getAcceptAcknowledgementType() {
		return msh.getAcceptAcknowledgmentType().getValue();
	}
	@Override
	public void setAcceptAcknowledgementType(String acceptAcknowledgementType) throws DataTypeException {
		msh.getAcceptAcknowledgmentType().setValue(acceptAcknowledgementType);
		super.setAcceptAcknowledgementType(acceptAcknowledgementType);
	}
	@Override
	public String getApplicationAcknowledgementType() {
		// TODO Auto-generated method stub
		return msh.getApplicationAcknowledgmentType().getValue();
	}
	@Override
	public void setApplicationAcknowledgementType(String applicationAcknowledgementType) throws DataTypeException {
		msh.getApplicationAcknowledgmentType().setValue(applicationAcknowledgementType);
		super.setApplicationAcknowledgementType(applicationAcknowledgementType);
	}
	@Override
	public String getCountryCode() {
		return msh.getCountryCode().getValue();
	}
	@Override
	public void setCountryCode(String countryCode) throws DataTypeException {
		msh.getCountryCode().setValue(countryCode);
		super.setCountryCode(countryCode);
	}
	
	
	/**
	 * @return the characterSet
	 */
	public String[] getCharacterSet251() {
		String[] characters = new String[msh.getCharacterSet().length];
		for(int i = 0; i < msh.getCharacterSet().length; i++) {
			characters[i]= msh.getCharacterSet()[i].getValue();
		}
		
		return characters;
	}
	@Override
	public IdentifierAndCoding getPrincipalLanguageOfMessage() {
		// TODO Auto-generated method stub
		return new IdentifierAndCoding(
				msh.getPrincipalLanguageOfMessage().getIdentifier().getValue(),
				msh.getPrincipalLanguageOfMessage().getName(),
				msh.getPrincipalLanguageOfMessage().getAlternateIdentifier().getValue(),
				msh.getPrincipalLanguageOfMessage().getAlternateText().getValue(),
				msh.getPrincipalLanguageOfMessage().getNameOfAlternateCodingSystem().getValue(),
				msh.getPrincipalLanguageOfMessage().getNameOfCodingSystem().getValue(),
				msh.getPrincipalLanguageOfMessage().getText().getValue());
	}
	@Override
	public void setPrincipalLanguageOfMessage(IdentifierAndCoding principalLanguageOfMessage) throws DataTypeException {
		msh.getPrincipalLanguageOfMessage().getIdentifier().setValue(principalLanguageOfMessage.getIdentifier());
		msh.getPrincipalLanguageOfMessage().getAlternateIdentifier().setValue(principalLanguageOfMessage.getAlternateIdentifier());
		msh.getPrincipalLanguageOfMessage().getAlternateText().setValue(principalLanguageOfMessage.getAlternateText());
		msh.getPrincipalLanguageOfMessage().getNameOfAlternateCodingSystem().setValue(principalLanguageOfMessage.getNameOfAlternateCodingSystem());
		msh.getPrincipalLanguageOfMessage().getNameOfCodingSystem().setValue(principalLanguageOfMessage.getNameOfCodingSystem());
		msh.getPrincipalLanguageOfMessage().getText().setValue(principalLanguageOfMessage.getText());
		super.setPrincipalLanguageOfMessage(principalLanguageOfMessage);
	}
	
	
	/**
	 * @return the alternateCharacterSetHandlingScheme
	 */
	public String getAlternateCharacterSetHandlingScheme() {
		
		return msh.getAlternateCharacterSetHandlingScheme().getValue();
	}
	/**
	 * @param alternateCharacterSetHandlingScheme the alternateCharacterSetHandlingScheme to set
	 * @throws DataTypeException 
	 */
	public void setAlternateCharacterSetHandlingScheme(String alternateCharacterSetHandlingScheme) throws DataTypeException {
		msh.getAlternateCharacterSetHandlingScheme().setValue(alternateCharacterSetHandlingScheme);
		AlternateCharacterSetHandlingScheme = alternateCharacterSetHandlingScheme;
	}
	@Override
	public CustomNTE[] getNte() {
		// TODO Auto-generated method stub
		return super.getNte();
	}
	@Override
	public void setNte(CustomNTE[] nte) {
		// TODO Auto-generated method stub
		super.setNte(nte);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
