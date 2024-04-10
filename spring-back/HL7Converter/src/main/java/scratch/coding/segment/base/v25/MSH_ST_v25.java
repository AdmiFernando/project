//package scratch.coding.segment.base.v25;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.hl7.base.v25.ORU_ST_v25;
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.HD_ST;
//import scratch.coding.models.base.PT_ST;
//import scratch.coding.models.base.ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v25.EI_ST_v25;
//import scratch.coding.models.base.v25.MSG_ST_v25;
//import scratch.coding.models.base.v25.VID_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//@Table(name="MSH_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class MSH_ST_v25 {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="MSH_ID")
//	private Long id;
//	@Column(name="MSH_1_v25")
//	@JsonProperty("msh_1_fieldSeparator")
//	private String msh_1_fieldSeparator;
//	@Column(name="MSH_2_v25")
//	@JsonProperty("msh_2_encodingCharacters")
//	private String msh_2_encodingCharacters;
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "HD_MSH_3_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_3_sendingApplication")
//	private HD_ST msh_3_sendingApplication;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_MSH_4_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_4_sendingFacility")
//	private HD_ST msh_4_sendingFacility;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_MSH_5_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_5_receivingApplication")
//	private HD_ST msh_5_receivingApplication;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_MSH_6_v25", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_6_receivingFacility")
//	private HD_ST msh_6_receivingFacility;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_MSH_7_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("msh_7_dateTimeOfMessage")
//	private TS_ST msh_7_dateTimeOfMessage;
//	@Column(name="MSH_8_v25")
//	@JsonProperty("msh_8_security")
//	private String msh_8_security;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSG_MSH_9_v25", referencedColumnName = "MSG_ID")
//	@JsonProperty("msh_9_messageType")
//	private MSG_ST_v25 msh_9_messageType;
//	@Column(name="MSH_10_v25")
//	@JsonProperty("msh_10_messageControlID")
//	private String msh_10_messageControlID;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PT_MSH_11_v25", referencedColumnName = "PT_ID")
//	@JsonProperty("msh_11_processingID")
//	private PT_ST msh_11_processingID;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "VID_MSH_12_v25", referencedColumnName = "VID_ID")
//	@JsonProperty("msh_12_versionID")
//	@JsonIgnoreProperties("msh_12_v25")
//	private VID_ST_v25 msh_12_versionID;
//	@Column(name="MSH_13_v25")
//	@JsonProperty("msh_13_sequenceNumber")
//	private String msh_13_sequenceNumber;
//	@Column(name="MSH_14_v25")
//	@JsonProperty("msh_14_continuationPointer")
//	private String msh_14_continuationPointer;
//	@Column(name="MSH_15_v25")
//	@JsonProperty("msh_15_acceptAcknowledgmentType")
//	private String msh_15_acceptAcknowledgmentType;
//	@Column(name="MSH_16_v25")
//	@JsonProperty("msh_16_applicationAcknowledgmentType")
//	private String msh_16_applicationAcknowledgmentType;
//	@Column(name="MSH_17_v25")
//	@JsonProperty("msh_17_countryCode")
//	private String msh_17_countryCode;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSH_ST_18_v25")
//	@JsonProperty("msh_18_characterSet")
//	private List<ST> msh_18_characterSet;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_MSH_19_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("msh_19_principalLanguageOfMessage")
//	private CE_ST msh_19_principalLanguageOfMessage;
//	@Column(name="MSH_20_v25")
//	@JsonProperty("msh_20_alternateCharacterSetHandlingScheme")
//	private String msh_20_alternateCharacterSetHandlingScheme;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSH_EI_21_v25")
//	@JsonProperty("msh_21_messageProfileIdentifier")
//	private List<EI_ST_v25> msh_21_messageProfileIdentifier;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSH_NTE_v25")
//	@JsonProperty("nte")
//	private List<NTE_ST_v25> nte;
//	
//	
//	
//	private MSH_ST_v25(MSHBuilder builder) {
//		this.msh_1_fieldSeparator =builder. msh_1_fieldSeparator;
//		this.msh_2_encodingCharacters = builder.msh_2_encodingCharacters;
//		this.msh_3_sendingApplication = builder.msh_3_sendingApplication;
//		this.msh_4_sendingFacility = builder.msh_4_sendingFacility;
//		this.msh_5_receivingApplication = builder.msh_5_receivingApplication;
//		this.msh_6_receivingFacility = builder.msh_6_receivingFacility;
//		this.msh_7_dateTimeOfMessage = builder.msh_7_dateTimeOfMessage;
//		this.msh_8_security = builder.msh_8_security;
//		this.msh_9_messageType = builder.msh_9_messageType;
//		this.msh_10_messageControlID = builder.msh_10_messageControlID;
//		this.msh_11_processingID = builder.msh_11_processingID;
//		this.msh_12_versionID = builder.msh_12_versionID;
//		this.msh_13_sequenceNumber = builder.msh_13_sequenceNumber;
//		this.msh_14_continuationPointer = builder.msh_14_continuationPointer;
//		this.msh_15_acceptAcknowledgmentType = builder.msh_15_acceptAcknowledgmentType;
//		this.msh_16_applicationAcknowledgmentType = builder.msh_16_applicationAcknowledgmentType;
//		this.msh_17_countryCode = builder.msh_17_countryCode;
//		this.msh_18_characterSet = builder.msh_18_characterSet;
//		this.msh_19_principalLanguageOfMessage = builder.msh_19_principalLanguageOfMessage;
//		this.msh_20_alternateCharacterSetHandlingScheme = builder.msh_20_alternateCharacterSetHandlingScheme;
//		this.msh_21_messageProfileIdentifier = builder.msh_21_messageProfileIdentifier;
//		this.nte = builder.nte;
//	}
//	public static class MSHBuilder {
//		private String msh_1_fieldSeparator;
//		private String msh_2_encodingCharacters;
//		private HD_ST msh_3_sendingApplication;	
//		private HD_ST msh_4_sendingFacility;
//		private HD_ST msh_5_receivingApplication;
//		private HD_ST msh_6_receivingFacility;
//		private TS_ST msh_7_dateTimeOfMessage;
//		private String msh_8_security;
//		private MSG_ST_v25 msh_9_messageType;
//		private String msh_10_messageControlID;
//		private PT_ST msh_11_processingID;
//		private VID_ST_v25 msh_12_versionID;
//		private String msh_13_sequenceNumber;
//		private String msh_14_continuationPointer;
//		private String msh_15_acceptAcknowledgmentType;
//		private String msh_16_applicationAcknowledgmentType;
//		private String msh_17_countryCode;
//		private List<ST> msh_18_characterSet;
//		private CE_ST msh_19_principalLanguageOfMessage;
//		private String msh_20_alternateCharacterSetHandlingScheme;
//		private List<EI_ST_v25> msh_21_messageProfileIdentifier;
//		private List<NTE_ST_v25> nte;
//		public MSHBuilder(String msh_1_fieldSeparator, String msh_2_encodingCharacters, HD_ST msh_3_sendingApplication,
//				HD_ST msh_4_sendingFacility, HD_ST msh_5_receivingApplication, HD_ST msh_6_receivingFacility,
//				TS_ST msh_7_dateTimeOfMessage, MSG_ST_v25 msh_9_messageType,
//				String msh_10_messageControlID, PT_ST msh_11_processingID, VID_ST_v25 msh_12_versionID,
//				String msh_15_acceptAcknowledgmentType,
//				String msh_16_applicationAcknowledgmentType) {
//			super();
//			this.msh_1_fieldSeparator = msh_1_fieldSeparator;
//			this.msh_2_encodingCharacters = msh_2_encodingCharacters;
//			this.msh_3_sendingApplication = msh_3_sendingApplication;
//			this.msh_4_sendingFacility = msh_4_sendingFacility;
//			this.msh_5_receivingApplication = msh_5_receivingApplication;
//			this.msh_6_receivingFacility = msh_6_receivingFacility;
//			this.msh_7_dateTimeOfMessage = msh_7_dateTimeOfMessage;
//			this.msh_8_security = "";
//			this.msh_9_messageType = msh_9_messageType;
//			this.msh_10_messageControlID = msh_10_messageControlID;
//			this.msh_11_processingID = msh_11_processingID;
//			this.msh_12_versionID = msh_12_versionID;
//			this.msh_13_sequenceNumber = "";
//			this.msh_14_continuationPointer = "";
//			this.msh_15_acceptAcknowledgmentType = msh_15_acceptAcknowledgmentType;
//			this.msh_16_applicationAcknowledgmentType = msh_16_applicationAcknowledgmentType;
//			this.msh_17_countryCode = "";
//			this.msh_18_characterSet = new ArrayList<>();
//			this.msh_19_principalLanguageOfMessage = new CE_ST();
//			this.msh_20_alternateCharacterSetHandlingScheme = "";
//			this.msh_21_messageProfileIdentifier = new ArrayList<>();
//			this.nte = new ArrayList<>();
//		}
//		
//		public MSHBuilder msh_8_security(String msh_8_security) {
//			this.msh_8_security = msh_8_security;
//			return this;
//		}
//		public MSHBuilder msh_13_sequenceNumber(String msh_13_sequenceNumber) {
//			this.msh_13_sequenceNumber = msh_13_sequenceNumber;
//			return this;
//		}
//		public MSHBuilder msh_14_continuationPointer(String msh_14_continuationPointer) {
//			this.msh_14_continuationPointer = msh_14_continuationPointer;
//			return this;
//		}
//		public MSHBuilder msh_16_applicationAcknowledgmentType(String msh_16_applicationAcknowledgmentType) {
//			this.msh_16_applicationAcknowledgmentType = msh_16_applicationAcknowledgmentType;
//			return this;
//		}
//		public MSHBuilder setMsh_17_countryCode(String msh_17_countryCode) {
//			this.msh_17_countryCode = msh_17_countryCode;
//			return this;
//		}
//		public MSHBuilder setMsh_18_characterSet(List<ST> msh_18_characterSet) {
//			this.msh_18_characterSet = msh_18_characterSet;
//			return this;
//		}
//		public MSHBuilder setMsh_19_principalLanguageOfMessage(CE_ST msh_19_principalLanguageOfMessage) {
//			this.msh_19_principalLanguageOfMessage = msh_19_principalLanguageOfMessage;
//			return this;
//		}
//		public MSHBuilder setMsh_20_alternateCharacterSetHandlingScheme(String msh_20_alternateCharacterSetHandlingScheme) {
//			this.msh_20_alternateCharacterSetHandlingScheme = msh_20_alternateCharacterSetHandlingScheme;
//			return this;
//		}
//		public MSHBuilder setMsh_21_messageProfileIdentifier(List<EI_ST_v25> msh_21_messageProfileIdentifier) {
//			this.msh_21_messageProfileIdentifier = msh_21_messageProfileIdentifier;
//			return this;
//		}
//		public MSHBuilder nte(List<NTE_ST_v25> nte ) {
//			this.nte  = nte;
//			return this;
//		}
//		public MSH_ST_v25 build() {
//			return new MSH_ST_v25(this);
//		}
//	}
//	public MSH_ST_v25() {
//		super();
//		this.msh_1_fieldSeparator = "";
//		this.msh_2_encodingCharacters = "";
//		this.msh_3_sendingApplication = new HD_ST();
//		this.msh_4_sendingFacility = new HD_ST();
//		this.msh_5_receivingApplication = new HD_ST();
//		this.msh_6_receivingFacility = new HD_ST();
//		this.msh_7_dateTimeOfMessage = new TS_ST();
//		this.msh_8_security = "";
//		this.msh_9_messageType = new MSG_ST_v25();
//		this.msh_10_messageControlID = "";
//		this.msh_11_processingID = new PT_ST();
//		this.msh_12_versionID = new VID_ST_v25();
//		this.msh_13_sequenceNumber = "";
//		this.msh_14_continuationPointer = "";
//		this.msh_15_acceptAcknowledgmentType = "";
//		this.msh_16_applicationAcknowledgmentType = "";
//		this.msh_17_countryCode = "";
//		this.msh_18_characterSet = new ArrayList<>();
//		this.msh_19_principalLanguageOfMessage = new CE_ST();
//		this.msh_20_alternateCharacterSetHandlingScheme = "";
//		this.msh_21_messageProfileIdentifier = new ArrayList<>();
//		this.nte = new ArrayList<>();
//	}
//	
//	public String getMsh_1_fieldSeparator() {
//		return msh_1_fieldSeparator;
//	}
//	public String getMsh_2_encodingCharacters() {
//		return msh_2_encodingCharacters;
//	}
//	public HD_ST getMsh_3_sendingApplication() {
//		return msh_3_sendingApplication;
//	}
//	public HD_ST getMsh_4_sendingFacility() {
//		return msh_4_sendingFacility;
//	}
//	public HD_ST getMsh_5_receivingApplication() {
//		return msh_5_receivingApplication;
//	}
//	public HD_ST getMsh_6_receivingFacility() {
//		return msh_6_receivingFacility;
//	}
//	public TS_ST getMsh_7_dateTimeOfMessage() {
//		return msh_7_dateTimeOfMessage;
//	}
//	public String getMsh_8_security() {
//		return msh_8_security;
//	}
//	public MSG_ST_v25 getMsh_9_messageType() {
//		return msh_9_messageType;
//	}
//	public String getMsh_10_messageControlID() {
//		return msh_10_messageControlID;
//	}
//	public PT_ST getMsh_11_processingID() {
//		return msh_11_processingID;
//	}
//	public VID_ST_v25 getMsh_12_versionID() {
//		return msh_12_versionID;
//	}
//	public String getMsh_13_sequenceNumber() {
//		return msh_13_sequenceNumber;
//	}
//	public String getMsh_14_continuationPointer() {
//		return msh_14_continuationPointer;
//	}
//	public String getMsh_15_acceptAcknowledgmentType() {
//		return msh_15_acceptAcknowledgmentType;
//	}
//	public String getMsh_16_applicationAcknowledgmentType() {
//		return msh_16_applicationAcknowledgmentType;
//	}
//	public String getMsh_17_countryCode() {
//		return msh_17_countryCode;
//	}
//	public List<ST> getMsh_18_characterSet() {
//		return msh_18_characterSet;
//	}
//	public CE_ST getMsh_19_principalLanguageOfMessage() {
//		return msh_19_principalLanguageOfMessage;
//	}
//	public String getMsh_20_alternateCharacterSetHandlingScheme() {
//		return msh_20_alternateCharacterSetHandlingScheme;
//	}
//	public List<EI_ST_v25> getMsh_21_messageProfileIdentifier() {
//		return msh_21_messageProfileIdentifier;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, msh_10_messageControlID, msh_11_processingID, msh_12_versionID, msh_13_sequenceNumber,
//				msh_14_continuationPointer, msh_15_acceptAcknowledgmentType, msh_16_applicationAcknowledgmentType,
//				msh_17_countryCode, msh_18_characterSet, msh_19_principalLanguageOfMessage, msh_1_fieldSeparator,
//				msh_20_alternateCharacterSetHandlingScheme, msh_21_messageProfileIdentifier, msh_2_encodingCharacters,
//				msh_3_sendingApplication, msh_4_sendingFacility, msh_5_receivingApplication, msh_6_receivingFacility,
//				msh_7_dateTimeOfMessage, msh_8_security, msh_9_messageType, nte);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MSH_ST_v25 other = (MSH_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(msh_10_messageControlID, other.msh_10_messageControlID)
//				&& Objects.equals(msh_11_processingID, other.msh_11_processingID)
//				&& Objects.equals(msh_12_versionID, other.msh_12_versionID)
//				&& Objects.equals(msh_13_sequenceNumber, other.msh_13_sequenceNumber)
//				&& Objects.equals(msh_14_continuationPointer, other.msh_14_continuationPointer)
//				&& Objects.equals(msh_15_acceptAcknowledgmentType, other.msh_15_acceptAcknowledgmentType)
//				&& Objects.equals(msh_16_applicationAcknowledgmentType, other.msh_16_applicationAcknowledgmentType)
//				&& Objects.equals(msh_17_countryCode, other.msh_17_countryCode)
//				&& Objects.equals(msh_18_characterSet, other.msh_18_characterSet)
//				&& Objects.equals(msh_19_principalLanguageOfMessage, other.msh_19_principalLanguageOfMessage)
//				&& Objects.equals(msh_1_fieldSeparator, other.msh_1_fieldSeparator)
//				&& Objects.equals(msh_20_alternateCharacterSetHandlingScheme,
//						other.msh_20_alternateCharacterSetHandlingScheme)
//				&& Objects.equals(msh_21_messageProfileIdentifier, other.msh_21_messageProfileIdentifier)
//				&& Objects.equals(msh_2_encodingCharacters, other.msh_2_encodingCharacters)
//				&& Objects.equals(msh_3_sendingApplication, other.msh_3_sendingApplication)
//				&& Objects.equals(msh_4_sendingFacility, other.msh_4_sendingFacility)
//				&& Objects.equals(msh_5_receivingApplication, other.msh_5_receivingApplication)
//				&& Objects.equals(msh_6_receivingFacility, other.msh_6_receivingFacility)
//				&& Objects.equals(msh_7_dateTimeOfMessage, other.msh_7_dateTimeOfMessage)
//				&& Objects.equals(msh_8_security, other.msh_8_security)
//				&& Objects.equals(msh_9_messageType, other.msh_9_messageType) && Objects.equals(nte, other.nte);
//	}
//
//
//}
//
