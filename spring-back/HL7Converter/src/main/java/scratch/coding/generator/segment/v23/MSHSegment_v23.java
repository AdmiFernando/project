package scratch.coding.generator.segment.v23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import ca.uhn.hl7v2.model.v23.segment.MSH;
import scratch.coding.models.CE_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.segment.v23.JsonMSH_v23;
import scratch.coding.segment.v23.JsonNTE_v23;
import scratch.coding.services.CommonService;
public class MSHSegment_v23 {

	/**
	 * @param orm
	 * @param customMSH
	 * @throws DataTypeException
	 */

	public static void getMSH(ORM_O01 orm, JsonMSH_v23 customMSH) throws DataTypeException {
		MSH msh = orm.getMSH();
		msh.getMsh1_FieldSeparator().setValue(customMSH.getMsh_1_fieldSeparator());
		msh.getMsh2_EncodingCharacters().setValue(customMSH.getMsh_2_encodingCharacters());
		CommonService.setHD_v2(msh.getMsh3_SendingApplication(), customMSH.getHd_msh_3_sendingApplication());
		CommonService.setHD_v2(msh.getMsh4_SendingFacility(), customMSH.getHd_msh_4_sendingFacility());
		CommonService.setHD_v2(msh.getMsh5_ReceivingApplication(), customMSH.getHd_msh_5_receivingApplication());
		CommonService.setHD_v2(msh.getMsh6_ReceivingFacility(), customMSH.getHd_msh_6_receivingFacility());
		CommonService.setTS_v2(msh.getMsh7_DateTimeOfMessage(), customMSH.getTs_msh_7_dateTimeOfMessage());
		msh.getMsh8_Security().setValue(customMSH.getMsh_8_security());
		CommonService.setCM_MSG_v23(msh.getMsh9_MessageType(), customMSH.getCm_msh_9_messageType());
		msh.getMsh10_MessageControlID().setValue(customMSH.getMsh_10_messageControlId());
		CommonService.setPT_v2(msh.getMsh11_ProcessingID(), customMSH.getPt_msh_11_processingId());
		msh.getMsh12_VersionID().setValue(customMSH.getMsh_12_versionId());
		msh.getMsh13_SequenceNumber().setValue(customMSH.getMsh_13_sequenceNumber());
		msh.getMsh14_ContinuationPointer().setValue(customMSH.getMsh_14_continuationPointer());
		msh.getMsh15_AcceptAcknowledgementType().setValue(customMSH.getMsh_15_acceptAcknowledgementType());
		msh.getMsh16_ApplicationAcknowledgementType().setValue(customMSH.getMsh_16_applicationAcknowledgementType());
		msh.getMsh17_CountryCode().setValue(customMSH.getMsh_17_countryCode());
		msh.getMsh18_CharacterSet().setValue(customMSH.getMsh_18_characterSet());
		CommonService.setCE_v2(msh.getMsh19_PrincipalLanguageOfMessage(), customMSH.getCe_msh_19_principalLanguageOfMessage());
		setNTE(orm, customMSH.getNte_msh());
	}
	private static void setNTE(ORM_O01 orm, JsonNTE_v23[] customNTE) throws DataTypeException {
		int i = 0;
		while(i<=customNTE.length-1) {
			NTESegment_v23.setNTE(orm.getNTE(i), customNTE[i]);
			i++;
		}
	}
}
