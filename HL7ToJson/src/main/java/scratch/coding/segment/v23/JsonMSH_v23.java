package scratch.coding.segment.v23;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.PT_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CM_MSG_v23;


@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonMSH_v23 {
	
	
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
	private JsonNTE_v23[] nte_msh;
	
	public JsonMSH_v23(MSHBuilder builder) {
		super();
		this.msh_1_fieldSeparator = builder.msh_1_fieldSeparator;
		this.msh_2_encodingCharacters = builder.msh_2_encodingCharacters;
		this.hd_msh_3_sendingApplication = builder.hd_msh_3_sendingApplication;
		this.hd_msh_4_sendingFacility = builder.hd_msh_4_sendingFacility;
		this.hd_msh_5_receivingApplication = builder.hd_msh_5_receivingApplication;
		this.hd_msh_6_receivingFacility = builder.hd_msh_6_receivingFacility;
		this.ts_msh_7_dateTimeOfMessage = builder.ts_msh_7_dateTimeOfMessage;
		this.msh_8_security = builder.msh_8_security;
		this.cm_msh_9_messageType = builder.cm_msh_9_messageType;
		this.msh_10_messageControlId = builder.msh_10_messageControlId;
		this.pt_msh_11_processingId = builder.pt_msh_11_processingId;
		this.msh_12_versionId = builder.msh_12_versionId;
		this.msh_13_sequenceNumber = builder.msh_13_sequenceNumber;
		this.msh_14_continuationPointer = builder.msh_14_continuationPointer;
		this.msh_15_acceptAcknowledgementType = builder.msh_15_acceptAcknowledgementType;
		this.msh_16_applicationAcknowledgementType = builder.msh_16_applicationAcknowledgementType;
		this.msh_17_countryCode = builder.msh_17_countryCode;
		this.msh_18_characterSet = builder.msh_18_characterSet;
		this.ce_msh_19_principalLanguageOfMessage = builder.ce_msh_19_principalLanguageOfMessage;
		this.nte_msh = builder.nte_msh;
	}

	public JsonMSH_v23(String msh_1_fieldSeparator, String msh_2_encodingCharacters, HD_v2 hd_msh_3_sendingApplication,
			HD_v2 hd_msh_4_sendingFacility, HD_v2 hd_msh_5_receivingApplication, HD_v2 hd_msh_6_receivingFacility,
			TS_v2 ts_msh_7_dateTimeOfMessage, String msh_8_security, CM_MSG_v23 cm_msh_9_messageType,
			String msh_10_messageControlId, PT_v2 pt_msh_11_processingId, String msh_12_versionId,
			String msh_13_sequenceNumber, String msh_14_continuationPointer, String msh_15_acceptAcknowledgementType,
			String msh_16_applicationAcknowledgementType, String msh_17_countryCode, String msh_18_characterSet,
			CE_v2 ce_msh_19_principalLanguageOfMessage, JsonNTE_v23[] nte_msh) {
		super();
		this.msh_1_fieldSeparator = msh_1_fieldSeparator;
		this.msh_2_encodingCharacters = msh_2_encodingCharacters;
		this.hd_msh_3_sendingApplication = hd_msh_3_sendingApplication;
		this.hd_msh_4_sendingFacility = hd_msh_4_sendingFacility;
		this.hd_msh_5_receivingApplication = hd_msh_5_receivingApplication;
		this.hd_msh_6_receivingFacility = hd_msh_6_receivingFacility;
		this.ts_msh_7_dateTimeOfMessage = ts_msh_7_dateTimeOfMessage;
		this.msh_8_security = msh_8_security;
		this.cm_msh_9_messageType = cm_msh_9_messageType;
		this.msh_10_messageControlId = msh_10_messageControlId;
		this.pt_msh_11_processingId = pt_msh_11_processingId;
		this.msh_12_versionId = msh_12_versionId;
		this.msh_13_sequenceNumber = msh_13_sequenceNumber;
		this.msh_14_continuationPointer = msh_14_continuationPointer;
		this.msh_15_acceptAcknowledgementType = msh_15_acceptAcknowledgementType;
		this.msh_16_applicationAcknowledgementType = msh_16_applicationAcknowledgementType;
		this.msh_17_countryCode = msh_17_countryCode;
		this.msh_18_characterSet = msh_18_characterSet;
		this.ce_msh_19_principalLanguageOfMessage = ce_msh_19_principalLanguageOfMessage;
		this.nte_msh = nte_msh;
	}
	public JsonMSH_v23() {
		super();
		this.msh_1_fieldSeparator = "";
		this.msh_2_encodingCharacters = "";
		this.hd_msh_3_sendingApplication = new HD_v2();
		this.hd_msh_4_sendingFacility = new HD_v2();
		this.hd_msh_5_receivingApplication = new HD_v2();
		this.hd_msh_6_receivingFacility = new HD_v2();
		this.ts_msh_7_dateTimeOfMessage = new TS_v2();
		this.msh_8_security = "";
		this.cm_msh_9_messageType = new CM_MSG_v23();
		this.msh_10_messageControlId = "";
		this.pt_msh_11_processingId = new PT_v2();
		this.msh_12_versionId = "";
		this.msh_13_sequenceNumber = "";
		this.msh_14_continuationPointer = "";
		this.msh_15_acceptAcknowledgementType = "";
		this.msh_16_applicationAcknowledgementType = "";
		this.msh_17_countryCode = "";
		this.msh_18_characterSet = "";
		this.ce_msh_19_principalLanguageOfMessage = new CE_v2();
		this.nte_msh = new JsonNTE_v23[] {};
	}
	public static class MSHBuilder {
		private String msh_1_fieldSeparator;
		private String msh_2_encodingCharacters;
		private HD_v2 hd_msh_3_sendingApplication;
		private HD_v2 hd_msh_4_sendingFacility;
		private HD_v2 hd_msh_5_receivingApplication;
		private HD_v2 hd_msh_6_receivingFacility;
		private TS_v2 ts_msh_7_dateTimeOfMessage;
		private String msh_8_security;
		private CM_MSG_v23 cm_msh_9_messageType;
		private String msh_10_messageControlId;
		private PT_v2 pt_msh_11_processingId;
		private String msh_12_versionId;
		private String msh_13_sequenceNumber;
		private String msh_14_continuationPointer;
		private String msh_15_acceptAcknowledgementType;
		private String msh_16_applicationAcknowledgementType;
		private String msh_17_countryCode;
		private String msh_18_characterSet;
		private CE_v2 ce_msh_19_principalLanguageOfMessage;
		private JsonNTE_v23[] nte_msh;
		
		
		public MSHBuilder(String msh_1_fieldSeparator, String msh_2_encodingCharacters,
				CM_MSG_v23 cm_msh_9_messageType, String msh_10_messageControlId, PT_v2 pt_msh_11_processingId,
				String msh_12_versionId) {
			super();
			this.msh_1_fieldSeparator = msh_1_fieldSeparator;
			this.msh_2_encodingCharacters = msh_2_encodingCharacters;
			this.hd_msh_3_sendingApplication = new HD_v2();
			this.hd_msh_4_sendingFacility = new HD_v2();
			this.hd_msh_5_receivingApplication = new HD_v2();
			this.hd_msh_6_receivingFacility = new HD_v2();
			this.ts_msh_7_dateTimeOfMessage = new TS_v2();
			this.msh_8_security = "";
			this.cm_msh_9_messageType = cm_msh_9_messageType;
			this.msh_10_messageControlId = msh_10_messageControlId;
			this.pt_msh_11_processingId = pt_msh_11_processingId;
			this.msh_12_versionId = msh_12_versionId;
			this.msh_13_sequenceNumber = "";
			this.msh_14_continuationPointer = "";
			this.msh_15_acceptAcknowledgementType = "";
			this.msh_16_applicationAcknowledgementType = "";
			this.msh_17_countryCode = "";
			this.msh_18_characterSet = "";
			this.ce_msh_19_principalLanguageOfMessage = new CE_v2();
			this.nte_msh = new JsonNTE_v23[] {};
		}
		
		
		public MSHBuilder hd_msh_3_sendingApplication(HD_v2 hd_msh_3_sendingApplication) {
			this.hd_msh_3_sendingApplication = hd_msh_3_sendingApplication;
			return this;
		}


		public MSHBuilder hd_msh_4_sendingFacility(HD_v2 hd_msh_4_sendingFacility) {
			this.hd_msh_4_sendingFacility = hd_msh_4_sendingFacility;
			return this;
		}


		public MSHBuilder hd_msh_5_receivingApplication(HD_v2 hd_msh_5_receivingApplication) {
			this.hd_msh_5_receivingApplication = hd_msh_5_receivingApplication;
			return this;
		}


		public MSHBuilder hd_msh_6_receivingFacility(HD_v2 hd_msh_6_receivingFacility) {
			this.hd_msh_6_receivingFacility = hd_msh_6_receivingFacility;
			return this;
		}


		public MSHBuilder ts_msh_7_dateTimeOfMessage(TS_v2 ts_msh_7_dateTimeOfMessage) {
			this.ts_msh_7_dateTimeOfMessage = ts_msh_7_dateTimeOfMessage;
			return this;
		}


		public MSHBuilder msh_8_security(String msh_8_security) {
			this.msh_8_security = msh_8_security;
			return this;
		}


		public MSHBuilder msh_13_sequenceNumber(String msh_13_sequenceNumber) {
			this.msh_13_sequenceNumber = msh_13_sequenceNumber;
			return this;
		}


		public MSHBuilder msh_14_continuationPointer(String msh_14_continuationPointer) {
			this.msh_14_continuationPointer = msh_14_continuationPointer;
			return this;
		}


		public MSHBuilder msh_15_acceptAcknowledgementType(String msh_15_acceptAcknowledgementType) {
			this.msh_15_acceptAcknowledgementType = msh_15_acceptAcknowledgementType;
			return this;
		}


		public MSHBuilder msh_16_applicationAcknowledgementType(String msh_16_applicationAcknowledgementType) {
			this.msh_16_applicationAcknowledgementType = msh_16_applicationAcknowledgementType;
			return this;
		}


		public MSHBuilder msh_17_countryCode(String msh_17_countryCode) {
			this.msh_17_countryCode = msh_17_countryCode;
			return this;
		}


		public MSHBuilder msh_18_characterSet(String msh_18_characterSet) {
			this.msh_18_characterSet = msh_18_characterSet;
			return this;
		}


		public MSHBuilder ce_msh_19_principalLanguageOfMessage(CE_v2 ce_msh_19_principalLanguageOfMessage) {
			this.ce_msh_19_principalLanguageOfMessage = ce_msh_19_principalLanguageOfMessage;
			return this;
		}


		public MSHBuilder nte_msh(JsonNTE_v23[] nte_msh) {
			this.nte_msh = nte_msh;
			return this;
		}


		public JsonMSH_v23 build() {
			return new JsonMSH_v23(this);
		}
	}

	public String getMsh_1_fieldSeparator() {
		return msh_1_fieldSeparator;
	}

	public String getMsh_2_encodingCharacters() {
		return msh_2_encodingCharacters;
	}

	public HD_v2 getHd_msh_3_sendingApplication() {
		return hd_msh_3_sendingApplication;
	}

	public HD_v2 getHd_msh_4_sendingFacility() {
		return hd_msh_4_sendingFacility;
	}

	public HD_v2 getHd_msh_5_receivingApplication() {
		return hd_msh_5_receivingApplication;
	}

	public HD_v2 getHd_msh_6_receivingFacility() {
		return hd_msh_6_receivingFacility;
	}

	public TS_v2 getTs_msh_7_dateTimeOfMessage() {
		return ts_msh_7_dateTimeOfMessage;
	}

	public String getMsh_8_security() {
		return msh_8_security;
	}

	public CM_MSG_v23 getCm_msh_9_messageType() {
		return cm_msh_9_messageType;
	}

	public String getMsh_10_messageControlId() {
		return msh_10_messageControlId;
	}

	public PT_v2 getPt_msh_11_processingId() {
		return pt_msh_11_processingId;
	}

	public String getMsh_12_versionId() {
		return msh_12_versionId;
	}

	public String getMsh_13_sequenceNumber() {
		return msh_13_sequenceNumber;
	}

	public String getMsh_14_continuationPointer() {
		return msh_14_continuationPointer;
	}

	public String getMsh_15_acceptAcknowledgementType() {
		return msh_15_acceptAcknowledgementType;
	}

	public String getMsh_16_applicationAcknowledgementType() {
		return msh_16_applicationAcknowledgementType;
	}

	public String getMsh_17_countryCode() {
		return msh_17_countryCode;
	}

	public String getMsh_18_characterSet() {
		return msh_18_characterSet;
	}

	public CE_v2 getCe_msh_19_principalLanguageOfMessage() {
		return ce_msh_19_principalLanguageOfMessage;
	}

	public JsonNTE_v23[] getNte_msh() {
		return nte_msh;
	}

	@Override
	public String toString() {
		return "JsonMSH_v23 [msh_1_fieldSeparator=" + msh_1_fieldSeparator + ", msh_2_encodingCharacters="
				+ msh_2_encodingCharacters + ", hd_msh_3_sendingApplication=" + hd_msh_3_sendingApplication
				+ ", hd_msh_4_sendingFacility=" + hd_msh_4_sendingFacility + ", hd_msh_5_receivingApplication="
				+ hd_msh_5_receivingApplication + ", hd_msh_6_receivingFacility=" + hd_msh_6_receivingFacility
				+ ", ts_msh_7_dateTimeOfMessage=" + ts_msh_7_dateTimeOfMessage + ", msh_8_security=" + msh_8_security
				+ ", cm_msh_9_messageType=" + cm_msh_9_messageType + ", msh_10_messageControlId="
				+ msh_10_messageControlId + ", pt_msh_11_processingId=" + pt_msh_11_processingId + ", msh_12_versionId="
				+ msh_12_versionId + ", msh_13_sequenceNumber=" + msh_13_sequenceNumber
				+ ", msh_14_continuationPointer=" + msh_14_continuationPointer + ", msh_15_acceptAcknowledgementType="
				+ msh_15_acceptAcknowledgementType + ", msh_16_applicationAcknowledgementType="
				+ msh_16_applicationAcknowledgementType + ", msh_17_countryCode=" + msh_17_countryCode
				+ ", msh_18_characterSet=" + msh_18_characterSet + ", ce_msh_19_principalLanguageOfMessage="
				+ ce_msh_19_principalLanguageOfMessage + ", nte_msh=" + Arrays.toString(nte_msh) + "]";
	}

	
}
