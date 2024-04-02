package scratch.coding.generator.segment.v23;
//package scratch.coding.generator.segment.v23;
//
//
//import ca.uhn.hl7v2.model.DataTypeException;
//import ca.uhn.hl7v2.model.v23.message.ORM_O01;
//import ca.uhn.hl7v2.model.v23.segment.MSH;
//import scratch.coding.models.CE_v2;
//import scratch.coding.models.HD_v2;
//import scratch.coding.models.TS_v2;
//import scratch.coding.models_v23.CM_MSG_MessageType;
//import scratch.coding.models_v23.PT_ProcessingID;
//import scratch.coding.segment.v23.CustomMSH;
//import scratch.coding.segment.v23.JsonNTE_v23;
//
//
//public class MSHSegmentCustomHL7_23 {
//	/**
//	 * @param orm
//	 * @param customMSH
//	 * @throws DataTypeException
//	 */
//	public static void getMSH(ORM_O01 orm, CustomMSH customMSH) throws DataTypeException {
//		MSH msh = orm.getMSH();
//		msh.getFieldSeparator().setValue(customMSH.getFieldSeparator());
//		msh.getEncodingCharacters().setValue(customMSH.getEncodingCharacters());
//		setApplicationAndFacilities(customMSH, msh);
//		setDateTimeOfMessage(msh, customMSH.getDateTimeOfMessage());
//		msh.getSecurity().setValue(customMSH.getSecurity());
//		setMessageType(msh, customMSH.getMessageType());
//		msh.getMessageControlID().setValue(customMSH.getMessageControlId());
//		setProcessingID(msh, customMSH.getProcessingId());
//		msh.getVersionID().setValue(customMSH.getVersionId());
//		msh.getSequenceNumber().setValue(customMSH.getSequenceNumber());
//		msh.getContinuationPointer().setValue(customMSH.getContinuationPointer());
//		msh.getAcceptAcknowledgementType().setValue(customMSH.getAcceptAcknowledgementType());
//		msh.getApplicationAcknowledgementType().setValue(customMSH.getApplicationAcknowledgementType());
//		msh.getCountryCode().setValue(customMSH.getCountryCode());
//		msh.getCharacterSet().setValue(customMSH.getCharacterSet());
//		setPrincipalLanguage(msh, customMSH.getPrincipalLanguageOfMessage());
////		setNTE(orm, customMSH.getNte());
//	}
//	/**
//	 * @param json
//	 * @param msh
//	 * @throws DataTypeException
//	 */
////	private static void setApplicationAndFacilities(CustomMSH json, MSH msh) throws DataTypeException {
////		setSendingApplication(msh, json.getSendingApplication());
////		setSendingFacility(msh, json.getSendingFacility());
////		setReceivingApplication(msh, json.getReceivingApplication());
////		setReceivingFacility(msh, json.getReceivingFacility());
////	}
//	private static void setApplicationAndFacilities(CustomMSH json, MSH msh) throws DataTypeException {
//		setSendingApplication(msh, json.getSendingApplication());
//		setSendingFacility(msh, json.getSendingFacility());
//		setReceivingApplication(msh, json.getReceivingApplication());
//		setReceivingFacility(msh, json.getReceivingFacility());
//		
//		}
//	/**
//	 * @param msh
//	 * @param sendingApplication
//	 * @throws DataTypeException
//	 */
//	private static void setSendingApplication(MSH msh, HD_v2 sendingApplication) throws DataTypeException {
//		if(!sendingApplication.equals(null)) {
//			msh.getSendingApplication().getNamespaceID().setValue(sendingApplication.getNameSpaceId());
//			msh.getSendingApplication().getUniversalID().setValue(sendingApplication.getUniversalID());
//			msh.getSendingApplication().getUniversalIDType().setValue(sendingApplication.getUniversalIDType());
//		}
//	}
//	/**
//	 * @param msh
//	 * @param sendingApplication
//	 * @throws DataTypeException
//	 */
//	private static void setSendingFacility(MSH msh, HD_v2 sendingApplication) throws DataTypeException {
//		msh.getSendingFacility().getNamespaceID().setValue(sendingApplication.getNameSpaceId());
//		msh.getSendingFacility().getUniversalID().setValue(sendingApplication.getUniversalID());
//		msh.getSendingFacility().getUniversalIDType().setValue(sendingApplication.getUniversalIDType());
//	}
//	/**
//	 * @param msh
//	 * @param sendingApplication
//	 * @throws DataTypeException
//	 */
//	private static void setReceivingApplication(MSH msh, HD_v2 sendingApplication) throws DataTypeException {
//		msh.getReceivingApplication().getNamespaceID().setValue(sendingApplication.getNameSpaceId());
//		msh.getReceivingApplication().getUniversalID().setValue(sendingApplication.getUniversalID());
//		msh.getReceivingApplication().getUniversalIDType().setValue(sendingApplication.getUniversalIDType());
//	}
//	/**
//	 * @param msh
//	 * @param sendingApplication
//	 * @throws DataTypeException
//	 */
//	private static void setReceivingFacility(MSH msh, HD_v2 sendingApplication) throws DataTypeException {
//		msh.getReceivingFacility().getNamespaceID().setValue(sendingApplication.getNameSpaceId());
//		msh.getReceivingFacility().getUniversalID().setValue(sendingApplication.getUniversalID());
//		msh.getReceivingFacility().getUniversalIDType().setValue(sendingApplication.getUniversalIDType());
//	}
//	/**
//	 * @param msh
//	 * @param dateAndTime
//	 * @throws DataTypeException
//	 */
//	private static void setDateTimeOfMessage(MSH msh, TS_v2 dateAndTime) throws DataTypeException {
//		msh.getDateTimeOfMessage().getDegreeOfPrecision().setValue(dateAndTime.getDegreeOfPrecision());
//		msh.getDateTimeOfMessage().getTimeOfAnEvent().setValue(dateAndTime.getTimeOfAnEvent());
//	}
//	/**
//	 * @param msh
//	 * @param messageType
//	 * @throws DataTypeException
//	 */
//	private static void setMessageType(MSH msh, CM_MSG_MessageType messageType) throws DataTypeException {
//		msh.getMessageType().getMessageType().setValue(messageType.getMessageType());
//		msh.getMessageType().getTriggerEvent().setValue(messageType.getTriggerEvent());
//	}
//	/**
//	 * @param msh
//	 * @param processingID
//	 * @throws DataTypeException
//	 */
//	private static void setProcessingID(MSH msh, PT_ProcessingID processingID) throws DataTypeException {
//		msh.getProcessingID().getProcessingID().setValue(processingID.getProcessingID());
//		msh.getProcessingID().getProcessingMode().setValue(processingID.getProcessingMode());
//	}
//	/**
//	 * @param msh
//	 * @param principalLanguageOfMessage
//	 * @throws DataTypeException
//	 */
//	private static void setPrincipalLanguage(MSH msh, CE_v2 principalLanguageOfMessage) throws DataTypeException {
//		msh.getPrincipalLanguageOfMessage().getIdentifier().setValue(principalLanguageOfMessage.getIdentifier());
//		msh.getPrincipalLanguageOfMessage().getAlternateIdentifier().setValue(principalLanguageOfMessage.getAlternateIdentifier());
//		msh.getPrincipalLanguageOfMessage().getAlternateText().setValue(principalLanguageOfMessage.getAlternateText());
//		msh.getPrincipalLanguageOfMessage().getNameOfAlternateCodingSystem().setValue(principalLanguageOfMessage.getNameOfAlternateCodingSystem());
//		msh.getPrincipalLanguageOfMessage().getNameOfCodingSystem().setValue(principalLanguageOfMessage.getNameOfCodingSystem());
//		msh.getPrincipalLanguageOfMessage().getText().setValue(principalLanguageOfMessage.getText());
//	}
//	private static void setNTE(ORM_O01 orm, JsonNTE_v23[] customNTE) throws DataTypeException {
//		int i = 0;
//		while(i<=customNTE.length-1) {
//			NTESegment_v23.setNTE(orm.getNTE(i), customNTE[i]);
//			i++;
//		}
//	}
////	private static void setNTE(ORM_O01 orm, util.segment.CustomNTE[] customNTE) throws DataTypeException {
////		if(!customNTE.equals(null)) {
////		int i = 0;
////		while(i<=customNTE.length-1) {
////			NTESegment.setNTE(orm.getNTE(i), customNTE[i]);
////			i++;
////		}
////		}
////	}
//
//
//}
