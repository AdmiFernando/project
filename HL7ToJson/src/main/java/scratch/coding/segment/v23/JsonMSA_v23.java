package scratch.coding.segment.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonMSA_v23 {
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
	public JsonMSA_v23(MSABuilder builder) {
		super();
		this.msa_1_acknowledgementCode = builder.msa_1_acknowledgementCode;
		this.msa_2_messageControlID = builder.msa_2_messageControlID;
		this.msa_3_textMessage = builder.msa_3_textMessage;
		this.msa_4_expectedSequenceNumber = builder.msa_4_expectedSequenceNumber;
		this.msa_5_delayedAcknowledgementType = builder.msa_5_delayedAcknowledgementType;
		this.ce_msa_6_errorCondition = builder.ce_msa_6_errorCondition;
	}
	
	public JsonMSA_v23(String msa_1_acknowledgementCode, String msa_2_messageControlID, String msa_3_textMessage,
			String msa_4_expectedSequenceNumber, String msa_5_delayedAcknowledgementType,
			CE_v2 ce_msa_6_errorCondition) {
		super();
		this.msa_1_acknowledgementCode = msa_1_acknowledgementCode;
		this.msa_2_messageControlID = msa_2_messageControlID;
		this.msa_3_textMessage = msa_3_textMessage;
		this.msa_4_expectedSequenceNumber = msa_4_expectedSequenceNumber;
		this.msa_5_delayedAcknowledgementType = msa_5_delayedAcknowledgementType;
		this.ce_msa_6_errorCondition = ce_msa_6_errorCondition;
	}
	public JsonMSA_v23() {
		super();
		this.msa_1_acknowledgementCode = "";
		this.msa_2_messageControlID = "";
		this.msa_3_textMessage = "";
		this.msa_4_expectedSequenceNumber = "";
		this.msa_5_delayedAcknowledgementType = "";
		this.ce_msa_6_errorCondition = new CE_v2();
	}
	public static class MSABuilder {
		private String msa_1_acknowledgementCode;
		private String msa_2_messageControlID;
		private String msa_3_textMessage;
		private String msa_4_expectedSequenceNumber;
		private String msa_5_delayedAcknowledgementType;
		private CE_v2 ce_msa_6_errorCondition;
		public MSABuilder(String msa_1_acknowledgementCode, String msa_2_messageControlID) {
			super();
			this.msa_1_acknowledgementCode = msa_1_acknowledgementCode;
			this.msa_2_messageControlID = msa_2_messageControlID;
			this.msa_3_textMessage = "";
			this.msa_4_expectedSequenceNumber = "";
			this.msa_5_delayedAcknowledgementType = "";
			this.ce_msa_6_errorCondition = new CE_v2();
		}
		public MSABuilder msa_1_acknowledgementCode(String msa_1_acknowledgementCode) {
			this.msa_1_acknowledgementCode = msa_1_acknowledgementCode;
			return this;
		}
		public MSABuilder msa_2_messageControlID(String msa_2_messageControlID) {
			this.msa_2_messageControlID = msa_2_messageControlID;
			return this;
		}
		public MSABuilder msa_3_textMessage(String msa_3_textMessage) {
			this.msa_3_textMessage = msa_3_textMessage;
			return this;
		}
		public MSABuilder msa_4_expectedSequenceNumber(String msa_4_expectedSequenceNumber) {
			this.msa_4_expectedSequenceNumber = msa_4_expectedSequenceNumber;
			return this;
		}
		public MSABuilder msa_5_delayedAcknowledgementType(String msa_5_delayedAcknowledgementType) {
			this.msa_5_delayedAcknowledgementType = msa_5_delayedAcknowledgementType;
			return this;
		}
		public MSABuilder ce_msa_6_errorCondition(CE_v2 ce_msa_6_errorCondition) {
			this.ce_msa_6_errorCondition = ce_msa_6_errorCondition;
			return this;
		}
		public JsonMSA_v23 build() {
			return new JsonMSA_v23(this);
		}
	}
	public String getMsa_1_acknowledgementCode() {
		return msa_1_acknowledgementCode;
	}
	public String getMsa_2_messageControlID() {
		return msa_2_messageControlID;
	}
	public String getMsa_3_textMessage() {
		return msa_3_textMessage;
	}
	public String getMsa_4_expectedSequenceNumber() {
		return msa_4_expectedSequenceNumber;
	}
	public String getMsa_5_delayedAcknowledgementType() {
		return msa_5_delayedAcknowledgementType;
	}
	public CE_v2 getCe_msa_6_errorCondition() {
		return ce_msa_6_errorCondition;
	}
	@Override
	public String toString() {
		return "JsonMSA_v23 [msa_1_acknowledgementCode=" + msa_1_acknowledgementCode + ", msa_2_messageControlID="
				+ msa_2_messageControlID + ", msa_3_textMessage=" + msa_3_textMessage
				+ ", msa_4_expectedSequenceNumber=" + msa_4_expectedSequenceNumber
				+ ", msa_5_delayedAcknowledgementType=" + msa_5_delayedAcknowledgementType
				+ ", ce_msa_6_errorCondition=" + ce_msa_6_errorCondition + "]";
	}
	
}
