package scratch.coding.generator.segment.v23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import ca.uhn.hl7v2.model.v23.segment.MSA;
import scratch.coding.segment.v23.JsonIN1_v23;
import scratch.coding.segment.v23.JsonMSA_v23;
import scratch.coding.services.CommonService;
public class MSASegment_v23 {
	public void msa(MSA msa, JsonMSA_v23 customMSA) throws DataTypeException {
		msa.getMsa1_AcknowledgementCode().setValue(customMSA.getMsa_1_acknowledgementCode());
		msa.getMsa2_MessageControlID().setValue(customMSA.getMsa_2_messageControlID());
		msa.getMsa3_TextMessage().setValue(customMSA.getMsa_3_textMessage());
		msa.getMsa4_ExpectedSequenceNumber().setValue(customMSA.getMsa_4_expectedSequenceNumber());
		msa.getMsa5_DelayedAcknowledgementType().setValue(customMSA.getMsa_5_delayedAcknowledgementType());
		CommonService.setCE_v2(msa.getMsa6_ErrorCondition(), customMSA.getCe_msa_6_errorCondition());
	}
}
