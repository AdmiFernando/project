package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.PT_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.MSG_v25;
import scratch.coding.models.v25.VID_v25;
import scratch.coding.segment.v23.JsonNTE_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonMSH_v25 {
	
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
	private JsonNTE_v25[] nte;
	private JsonMSH_v25(MSHBuilder builder) {
		this.msh_1_fieldSeparator =builder. msh_1_fieldSeparator;
		this.msh_2_encodingCharacters = builder.msh_2_encodingCharacters;
		this.msh_3_sendingApplication = builder.msh_3_sendingApplication;
		this.msh_4_sendingFacility = builder.msh_4_sendingFacility;
		this.msh_5_receivingApplication = builder.msh_5_receivingApplication;
		this.msh_6_receivingFacility = builder.msh_6_receivingFacility;
		this.msh_7_dateTimeOfMessage = builder.msh_7_dateTimeOfMessage;
		this.msh_8_security = builder.msh_8_security;
		this.msh_9_messageType = builder.msh_9_messageType;
		this.msh_10_messageControlID = builder.msh_10_messageControlID;
		this.msh_11_processingID = builder.msh_11_processingID;
		this.msh_12_versionID = builder.msh_12_versionID;
		this.msh_13_sequenceNumber = builder.msh_13_sequenceNumber;
		this.msh_14_continuationPointer = builder.msh_14_continuationPointer;
		this.msh_15_acceptAcknowledgmentType = builder.msh_15_acceptAcknowledgmentType;
		this.msh_16_applicationAcknowledgmentType = builder.msh_16_applicationAcknowledgmentType;
		this.msh_17_countryCode = builder.msh_17_countryCode;
		this.msh_18_characterSet = builder.msh_18_characterSet;
		this.msh_19_principalLanguageOfMessage = builder.msh_19_principalLanguageOfMessage;
		this.msh_20_alternateCharacterSetHandlingScheme = builder.msh_20_alternateCharacterSetHandlingScheme;
		this.msh_21_messageProfileIdentifier = builder.msh_21_messageProfileIdentifier;
		this.nte = builder.nte;
	}
	public static class MSHBuilder {
		private String msh_1_fieldSeparator;
		private String msh_2_encodingCharacters;
		private HD_v2 msh_3_sendingApplication;	
		private HD_v2 msh_4_sendingFacility;
		private HD_v2 msh_5_receivingApplication;
		private HD_v2 msh_6_receivingFacility;
		private TS_v2 msh_7_dateTimeOfMessage;
		private String msh_8_security;
		private MSG_v25 msh_9_messageType;
		private String msh_10_messageControlID;
		private PT_v2 msh_11_processingID;
		private VID_v25 msh_12_versionID;
		private String msh_13_sequenceNumber;
		private String msh_14_continuationPointer;
		private String msh_15_acceptAcknowledgmentType;
		private String msh_16_applicationAcknowledgmentType;
		private String msh_17_countryCode;
		private String[] msh_18_characterSet;
		private CE_v2 msh_19_principalLanguageOfMessage;
		private String msh_20_alternateCharacterSetHandlingScheme;
		private EI_v2[] msh_21_messageProfileIdentifier;
		private JsonNTE_v25[] nte;
		public MSHBuilder(String msh_1_fieldSeparator, String msh_2_encodingCharacters, HD_v2 msh_3_sendingApplication,
				HD_v2 msh_4_sendingFacility, HD_v2 msh_5_receivingApplication, HD_v2 msh_6_receivingFacility,
				TS_v2 msh_7_dateTimeOfMessage, MSG_v25 msh_9_messageType,
				String msh_10_messageControlID, PT_v2 msh_11_processingID, VID_v25 msh_12_versionID,
				String msh_15_acceptAcknowledgmentType,
				String msh_16_applicationAcknowledgmentType) {
			super();
			this.msh_1_fieldSeparator = msh_1_fieldSeparator;
			this.msh_2_encodingCharacters = msh_2_encodingCharacters;
			this.msh_3_sendingApplication = msh_3_sendingApplication;
			this.msh_4_sendingFacility = msh_4_sendingFacility;
			this.msh_5_receivingApplication = msh_5_receivingApplication;
			this.msh_6_receivingFacility = msh_6_receivingFacility;
			this.msh_7_dateTimeOfMessage = msh_7_dateTimeOfMessage;
			this.msh_8_security = "";
			this.msh_9_messageType = msh_9_messageType;
			this.msh_10_messageControlID = msh_10_messageControlID;
			this.msh_11_processingID = msh_11_processingID;
			this.msh_12_versionID = msh_12_versionID;
			this.msh_13_sequenceNumber = "";
			this.msh_14_continuationPointer = "";
			this.msh_15_acceptAcknowledgmentType = msh_15_acceptAcknowledgmentType;
			this.msh_16_applicationAcknowledgmentType = msh_16_applicationAcknowledgmentType;
			this.msh_17_countryCode = "";
			this.msh_18_characterSet = new String[] {};
			this.msh_19_principalLanguageOfMessage = new CE_v2();
			this.msh_20_alternateCharacterSetHandlingScheme = "";
			this.msh_21_messageProfileIdentifier = new EI_v2[] {};
			this.nte = new JsonNTE_v25[] {};
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
		public MSHBuilder msh_16_applicationAcknowledgmentType(String msh_16_applicationAcknowledgmentType) {
			this.msh_16_applicationAcknowledgmentType = msh_16_applicationAcknowledgmentType;
			return this;
		}
		public MSHBuilder setMsh_17_countryCode(String msh_17_countryCode) {
			this.msh_17_countryCode = msh_17_countryCode;
			return this;
		}
		public MSHBuilder setMsh_18_characterSet(String[] msh_18_characterSet) {
			this.msh_18_characterSet = msh_18_characterSet;
			return this;
		}
		public MSHBuilder setMsh_19_principalLanguageOfMessage(CE_v2 msh_19_principalLanguageOfMessage) {
			this.msh_19_principalLanguageOfMessage = msh_19_principalLanguageOfMessage;
			return this;
		}
		public MSHBuilder setMsh_20_alternateCharacterSetHandlingScheme(String msh_20_alternateCharacterSetHandlingScheme) {
			this.msh_20_alternateCharacterSetHandlingScheme = msh_20_alternateCharacterSetHandlingScheme;
			return this;
		}
		public MSHBuilder setMsh_21_messageProfileIdentifier(EI_v2[] msh_21_messageProfileIdentifier) {
			this.msh_21_messageProfileIdentifier = msh_21_messageProfileIdentifier;
			return this;
		}
		public MSHBuilder nte(JsonNTE_v25[] nte ) {
			this.nte  = nte;
			return this;
		}
		public JsonMSH_v25 build() {
			return new JsonMSH_v25(this);
		}
	}
	public JsonMSH_v25() {
		super();
		this.msh_1_fieldSeparator = "";
		this.msh_2_encodingCharacters = "";
		this.msh_3_sendingApplication = new HD_v2();
		this.msh_4_sendingFacility = new HD_v2();
		this.msh_5_receivingApplication = new HD_v2();
		this.msh_6_receivingFacility = new HD_v2();
		this.msh_7_dateTimeOfMessage = new TS_v2();
		this.msh_8_security = "";
		this.msh_9_messageType = new MSG_v25();
		this.msh_10_messageControlID = "";
		this.msh_11_processingID = new PT_v2();
		this.msh_12_versionID = new VID_v25();
		this.msh_13_sequenceNumber = "";
		this.msh_14_continuationPointer = "";
		this.msh_15_acceptAcknowledgmentType = "";
		this.msh_16_applicationAcknowledgmentType = "";
		this.msh_17_countryCode = "";
		this.msh_18_characterSet = new String[] {};
		this.msh_19_principalLanguageOfMessage = new CE_v2();
		this.msh_20_alternateCharacterSetHandlingScheme = "";
		this.msh_21_messageProfileIdentifier = new EI_v2[] {};
	}
	
	public String getMsh_1_fieldSeparator() {
		return msh_1_fieldSeparator;
	}
	public String getMsh_2_encodingCharacters() {
		return msh_2_encodingCharacters;
	}
	public HD_v2 getMsh_3_sendingApplication() {
		return msh_3_sendingApplication;
	}
	public HD_v2 getMsh_4_sendingFacility() {
		return msh_4_sendingFacility;
	}
	public HD_v2 getMsh_5_receivingApplication() {
		return msh_5_receivingApplication;
	}
	public HD_v2 getMsh_6_receivingFacility() {
		return msh_6_receivingFacility;
	}
	public TS_v2 getMsh_7_dateTimeOfMessage() {
		return msh_7_dateTimeOfMessage;
	}
	public String getMsh_8_security() {
		return msh_8_security;
	}
	public MSG_v25 getMsh_9_messageType() {
		return msh_9_messageType;
	}
	public String getMsh_10_messageControlID() {
		return msh_10_messageControlID;
	}
	public PT_v2 getMsh_11_processingID() {
		return msh_11_processingID;
	}
	public VID_v25 getMsh_12_versionID() {
		return msh_12_versionID;
	}
	public String getMsh_13_sequenceNumber() {
		return msh_13_sequenceNumber;
	}
	public String getMsh_14_continuationPointer() {
		return msh_14_continuationPointer;
	}
	public String getMsh_15_acceptAcknowledgmentType() {
		return msh_15_acceptAcknowledgmentType;
	}
	public String getMsh_16_applicationAcknowledgmentType() {
		return msh_16_applicationAcknowledgmentType;
	}
	public String getMsh_17_countryCode() {
		return msh_17_countryCode;
	}
	public String[] getMsh_18_characterSet() {
		return msh_18_characterSet;
	}
	public CE_v2 getMsh_19_principalLanguageOfMessage() {
		return msh_19_principalLanguageOfMessage;
	}
	public String getMsh_20_alternateCharacterSetHandlingScheme() {
		return msh_20_alternateCharacterSetHandlingScheme;
	}
	public EI_v2[] getMsh_21_messageProfileIdentifier() {
		return msh_21_messageProfileIdentifier;
	}
 	@Override
	public String toString() {
		return "JsonMSH_v25 [msh_1_fieldSeparator=" + msh_1_fieldSeparator + ", msh_2_encodingCharacters="
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
				+ ", msh_21_messageProfileIdentifier=" + msh_21_messageProfileIdentifier + "]";
	}

}
