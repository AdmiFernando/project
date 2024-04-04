package scratch.coding.segment.v23;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.MSA;
import scratch.coding.models.CE_v2;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomMSA {
	@JsonProperty("msa_1_acknowledgementCode")
	private String msa_1_acknowledgementCode;
	@JsonProperty("msa_2_messageControlID")
	private String msa_2_messageControlID;
	@JsonProperty("msa_3_textMessage")
	private String msa_3_textMessage;
	@JsonProperty("msa_4_expectedSequenceNumber")
	private String msa_4_expectedSequenceNumber;
	@JsonProperty("msa_5_delayedAcknowledgementType")
	private String msa_5_delayedAcknowledgementType;
	@JsonProperty("ce_msa_6_errorCondition")
	private CE_v2 ce_msa_6_errorCondition;
	
	private MSA msa;
	
	private CustomMSA(MSA msa) {
		this.msa = msa;
	}

	/**
	 *	@return the msa_1_acknowledgementCode
	 */
	
	@JsonProperty("msa_1_acknowledgementCode")
	public String getMsa_1_acknowledgementCode() {
		return CommonService.getString(this.msa.getMsa1_AcknowledgementCode().getValue());
	}

	/**
	 * @param msa_1_acknowledgementCode the msa_1_acknowledgementCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msa_1_acknowledgementCode")
	public void setMsa_1_acknowledgementCode(String msa_1_acknowledgementCode) throws DataTypeException {
		this.msa.getMsa1_AcknowledgementCode().setValue(msa_1_acknowledgementCode);
		this.msa_1_acknowledgementCode = msa_1_acknowledgementCode;
	}

	/**
	 *	@return the msa_2_messageControlID
	 */
	
	@JsonProperty("msa_2_messageControlID")
	public String getMsa_2_messageControlID() {
		return CommonService.getString(this.msa.getMsa2_MessageControlID().getValue());
	}

	/**
	 * @param msa_2_messageControlID the msa_2_messageControlID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msa_2_messageControlID")
	public void setMsa_2_messageControlID(String msa_2_messageControlID) throws DataTypeException {
		this.msa.getMsa2_MessageControlID().setValue(msa_2_messageControlID);
		this.msa_2_messageControlID = msa_2_messageControlID;
	}

	/**
	 *	@return the msa_3_textMessage
	 */
	
	@JsonProperty("msa_3_textMessage")
	public String getMsa_3_textMessage() {
		return CommonService.getString(this.msa.getMsa3_TextMessage().getValue());
	}

	/**
	 * @param msa_3_textMessage the msa_3_textMessage to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msa_3_textMessage")
	public void setMsa_3_textMessage(String msa_3_textMessage) throws DataTypeException {
		this.msa.getMsa3_TextMessage().setValue(msa_3_textMessage);
		this.msa_3_textMessage = msa_3_textMessage;
	}

	/**
	 *	@return the msa_4_expectedSequenceNumber
	 */
	
	@JsonProperty("msa_4_expectedSequenceNumber")
	public String getMsa_4_expectedSequenceNumber() {
		return CommonService.getString(this.msa.getMsa4_ExpectedSequenceNumber().getValue());
	}

	/**
	 * @param msa_4_expectedSequenceNumber the msa_4_expectedSequenceNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msa_4_expectedSequenceNumber")
	public void setMsa_4_expectedSequenceNumber(String msa_4_expectedSequenceNumber) throws DataTypeException {
		this.msa.getMsa4_ExpectedSequenceNumber().setValue(msa_4_expectedSequenceNumber);
		this.msa_4_expectedSequenceNumber = msa_4_expectedSequenceNumber;
	}

	/**
	 *	@return the msa_5_delayedAcknowledgementType
	 */
	
	@JsonProperty("msa_5_delayedAcknowledgementType")
	public String getMsa_5_delayedAcknowledgementType() {
		return CommonService.getString(this.msa.getMsa5_DelayedAcknowledgementType().getValue());
	}

	/**
	 * @param msa_5_delayedAcknowledgementType the msa_5_delayedAcknowledgementType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("msa_5_delayedAcknowledgementType")
	public void setMsa_5_delayedAcknowledgementType(String msa_5_delayedAcknowledgementType) throws DataTypeException {
		this.msa.getMsa5_DelayedAcknowledgementType().setValue(msa_5_delayedAcknowledgementType);
		this.msa_5_delayedAcknowledgementType = msa_5_delayedAcknowledgementType;
	}

	/**
	 *	@return the ce_msa_6_errorCondition
	 */
	
	@JsonProperty("ce_msa_6_errorCondition")
	public CE_v2 getCe_msa_6_errorCondition() {
		return CommonService.getCE_v2(this.msa.getMsa6_ErrorCondition());
	}

	/**
	 * @param ce_msa_6_errorCondition the ce_msa_6_errorCondition to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_msa_6_errorCondition")
	public void setCe_msa_6_errorCondition(CE_v2 ce_msa_6_errorCondition) throws DataTypeException {
		CommonService.setCE_v2(this.msa.getMsa6_ErrorCondition(), ce_msa_6_errorCondition);
		this.ce_msa_6_errorCondition = ce_msa_6_errorCondition;
	}

	@Override
	public String toString() {
		return "CustomMSA [msa_1_acknowledgementCode=" + msa_1_acknowledgementCode + ", msa_2_messageControlID="
				+ msa_2_messageControlID + ", msa_3_textMessage=" + msa_3_textMessage
				+ ", msa_4_expectedSequenceNumber=" + msa_4_expectedSequenceNumber
				+ ", msa_5_delayedAcknowledgementType=" + msa_5_delayedAcknowledgementType
				+ ", ce_msa_6_errorCondition=" + ce_msa_6_errorCondition + ", msa=" + msa + "]";
	}

	/**
	 * @param msa2
	 * @return
	 */
	public static CustomMSA createMSA(MSA msa2) {
		// TODO Auto-generated method stub
		return new CustomMSA(msa2);
	}

	
	
	
}
