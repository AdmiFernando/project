//package scratch.coding.segment.base.v23;
//
//import java.util.ArrayList;
//import java.util.List;
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
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.HD_ST;
//import scratch.coding.models.base.PT_ST;
//import scratch.coding.models.base.ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.models.base.v23.CM_MSG_ST;
//
//@Table(name="MSH_ST_v23")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class MSH_ST_v23 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="MSH_ID")
//	private Long id;
//	@Column(name="MSH_1_v23")
//	@JsonProperty("msh_1_fieldSeparator")
//	private String msh_1_fieldSeparator;
//	@Column(name="MSH_2_v23")
//	@JsonProperty("msh_2_encodingCharacters")
//	private String msh_2_encodingCharacters;		
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "HD_MSH_3_v23", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_3_sendingApplication")
//	private HD_ST msh_3_sendingApplication;		
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_MSH_4_v23", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_4_sendingFacility")
//	private HD_ST msh_4_sendingFacility;	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_MSH_5_v23", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_5_receivingApplication")
//	private HD_ST msh_5_receivingApplication;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "HD_MSH_6_v23", referencedColumnName = "HD_ID")
//	@JsonProperty("msh_6_receivingFacility")
//	private HD_ST msh_6_receivingFacility;	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_MSH_7_v23", referencedColumnName = "TS_ID")
//	@JsonProperty("msh_7_dateTimeOfMessage")
//	private TS_ST msh_7_dateTimeOfMessage;	
//	@Column(name="MSH_8_v23")
//	@JsonProperty("msh_8_security")
//	private String msh_8_security;		
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CM_MSG_MSH_9_v23", referencedColumnName = "CM_MSG_ST_ID")
//	@JsonProperty("msh_9_messageType")
//	private CM_MSG_ST msh_9_messageType;	
//	@Column(name="MSH_10_v23")
//	@JsonProperty("msh_10_messageControlID")
//	private String msh_10_messageControlID;	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PT_MSH_11_v23", referencedColumnName = "PT_ID")
//	@JsonProperty("msh_11_processingID")
//	private PT_ST msh_11_processingID;
//	@Column(name="MSH_12_v23")
//	@JsonProperty("msh_12_versionId")
//	private String msh_12_versionId;
//	@Column(name="MSH_13_v23")
//	@JsonProperty("msh_13_sequenceNumber")
//	private String msh_13_sequenceNumber;	
//	@Column(name="MSH_14_v23")
//	@JsonProperty("msh_14_continuationPointer")
//	private String msh_14_continuationPointer;	
//	@Column(name="MSH_15_v23")
//	@JsonProperty("msh_15_acceptAcknowledgmentType")
//	private String msh_15_acceptAcknowledgmentType;
//	@Column(name="MSH_16_v23")
//	@JsonProperty("msh_16_applicationAcknowledgmentType")
//	private String msh_16_applicationAcknowledgmentType;	
//	@Column(name="MSH_17_v23")
//	@JsonProperty("msh_17_countryCode")
//	private String msh_17_countryCode;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSH_ST_18_v23")
//	@JsonProperty("msh_18_characterSet")
//	private List<ST> msh_18_characterSet;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_MSH_19_v23", referencedColumnName = "CE_ID")
//	@JsonProperty("msh_19_principalLanguageOfMessage")
//	@JsonIgnoreProperties({"msh_19_v23"})
//	private CE_ST msh_19_principalLanguageOfMessage;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSH_NTE_v23")
//	@JsonProperty("nte")
//	@JsonIgnoreProperties("msh_nte_v23")
//	private List<NTE_ST_v23> nte;
//	
//	private MSH_ST_v23(MSHBuilder builder) {
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
//		this.msh_12_versionId = builder.msh_12_versionID;
//		this.msh_13_sequenceNumber = builder.msh_13_sequenceNumber;
//		this.msh_14_continuationPointer = builder.msh_14_continuationPointer;
//		this.msh_15_acceptAcknowledgmentType = builder.msh_15_acceptAcknowledgmentType;
//		this.msh_16_applicationAcknowledgmentType = builder.msh_16_applicationAcknowledgmentType;
//		this.msh_17_countryCode = builder.msh_17_countryCode;
//		this.msh_18_characterSet = builder.msh_18_characterSet;
//		this.msh_19_principalLanguageOfMessage = builder.msh_19_principalLanguageOfMessage;
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
//		private CM_MSG_ST msh_9_messageType;
//		private String msh_10_messageControlID;
//		private PT_ST msh_11_processingID;
//		private String msh_12_versionID;
//		private String msh_13_sequenceNumber;
//		private String msh_14_continuationPointer;
//		private String msh_15_acceptAcknowledgmentType;
//		private String msh_16_applicationAcknowledgmentType;
//		private String msh_17_countryCode;
//		private List<ST> msh_18_characterSet;
//		private CE_ST msh_19_principalLanguageOfMessage;
//		private List<NTE_ST_v23> nte;
//		public MSHBuilder(String msh_1_fieldSeparator, String msh_2_encodingCharacters,
//				HD_ST msh_4_sendingFacility, HD_ST msh_6_receivingFacility,
//				TS_ST msh_7_dateTimeOfMessage,String msh_8_security,  CM_MSG_ST msh_9_messageType,
//				String msh_10_messageControlID, PT_ST msh_11_processingID, String msh_12_versionID) {
//			super();
//			this.msh_1_fieldSeparator = msh_1_fieldSeparator;
//			this.msh_2_encodingCharacters = msh_2_encodingCharacters;
//			this.msh_3_sendingApplication = new HD_ST();
//			this.msh_4_sendingFacility = msh_4_sendingFacility;
//			this.msh_5_receivingApplication = new HD_ST();
//			this.msh_6_receivingFacility = msh_6_receivingFacility;
//			this.msh_7_dateTimeOfMessage = msh_7_dateTimeOfMessage;
//			this.msh_8_security = msh_8_security;
//			this.msh_9_messageType = msh_9_messageType;
//			this.msh_10_messageControlID = msh_10_messageControlID;
//			this.msh_11_processingID = msh_11_processingID;
//			this.msh_12_versionID = msh_12_versionID;
//			this.msh_13_sequenceNumber = "";
//			this.msh_14_continuationPointer = "";
//			this.msh_15_acceptAcknowledgmentType = "";
//			this.msh_16_applicationAcknowledgmentType = "";
//			this.msh_17_countryCode = "";
//			this.msh_18_characterSet = new ArrayList<>();
//			this.msh_19_principalLanguageOfMessage = new CE_ST();
//			this.nte = new ArrayList<>();
//		}
//		public MSHBuilder msh_3_sendingApplication(HD_ST msh_3_sendingApplication) {
//			this.msh_3_sendingApplication = msh_3_sendingApplication;
//			return this;
//		}
//		public MSHBuilder msh_5_receivingApplication(HD_ST msh_5_receivingApplication) {
//			this.msh_5_receivingApplication = msh_5_receivingApplication;
//			return this;
//		}
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
//		public MSHBuilder msh_15_acceptAcknowledgmentType(String msh_15_acceptAcknowledgmentType) {
//			this.msh_15_acceptAcknowledgmentType = msh_15_acceptAcknowledgmentType;
//			return this;
//		}
//		public MSHBuilder msh_16_applicationAcknowledgmentType(String msh_16_applicationAcknowledgmentType) {
//			this.msh_16_applicationAcknowledgmentType = msh_16_applicationAcknowledgmentType;
//			return this;
//		}
//		public MSHBuilder msh_17_countryCode(String msh_17_countryCode) {
//			this.msh_17_countryCode = msh_17_countryCode;
//			return this;
//		}
//		public MSHBuilder msh_18_characterSet(List<ST> msh_18_characterSet) {
//			this.msh_18_characterSet = msh_18_characterSet;
//			return this;
//		}
//		public MSHBuilder msh_19_principalLanguageOfMessage(CE_ST msh_19_principalLanguageOfMessage) {
//			this.msh_19_principalLanguageOfMessage = msh_19_principalLanguageOfMessage;
//			return this;
//		}
//		
//		public MSHBuilder nte(List<NTE_ST_v23> nte ) {
//			this.nte  = nte;
//			return this;
//		}
//		public MSH_ST_v23 build() {
//			return new MSH_ST_v23(this);
//		}
//	}
//	public MSH_ST_v23() {
//		super();
//		this.msh_1_fieldSeparator = "";
//		this.msh_2_encodingCharacters = "";
//		this.msh_3_sendingApplication = new HD_ST();
//		this.msh_4_sendingFacility = new HD_ST();
//		this.msh_5_receivingApplication = new HD_ST();
//		this.msh_6_receivingFacility = new HD_ST();
//		this.msh_7_dateTimeOfMessage = new TS_ST();
//		this.msh_8_security = "";
//		this.msh_9_messageType = new CM_MSG_ST();
//		this.msh_10_messageControlID = "";
//		this.msh_11_processingID = new PT_ST();
//		this.msh_12_versionId = "";
//		this.msh_13_sequenceNumber = "";
//		this.msh_14_continuationPointer = "";
//		this.msh_15_acceptAcknowledgmentType = "";
//		this.msh_16_applicationAcknowledgmentType = "";
//		this.msh_17_countryCode = "";
//		this.msh_18_characterSet = new ArrayList<>();
//		this.msh_19_principalLanguageOfMessage = new CE_ST();
//		this.nte = new ArrayList<>();
//	}
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * @return the msh_1_fieldSeparator
//	 *	@JsonProperty("msh_1_fieldSeparator")
//	 */
//	
//	public String getMsh_1_fieldSeparator() {
//		return msh_1_fieldSeparator;
//	}
//	/**
//	 * @return the msh_2_encodingCharacters
//	 *	@JsonProperty("msh_2_encodingCharacters")
//	 */
//	
//	public String getMsh_2_encodingCharacters() {
//		return msh_2_encodingCharacters;
//	}
//	/**
//	 * @return the msh_3_sendingApplication
//	 *	@JsonProperty("msh_3_sendingApplication")
//	 */
//	
//	public HD_ST getMsh_3_sendingApplication() {
//		return msh_3_sendingApplication;
//	}
//	/**
//	 * @return the msh_4_sendingFacility
//	 *	@JsonProperty("msh_4_sendingFacility")
//	 */
//	
//	public HD_ST getMsh_4_sendingFacility() {
//		return msh_4_sendingFacility;
//	}
//	/**
//	 * @return the msh_5_receivingApplication
//	 *	@JsonProperty("msh_5_receivingApplication")
//	 */
//	
//	public HD_ST getMsh_5_receivingApplication() {
//		return msh_5_receivingApplication;
//	}
//	/**
//	 * @return the msh_6_receivingFacility
//	 *	@JsonProperty("msh_6_receivingFacility")
//	 */
//	
//	public HD_ST getMsh_6_receivingFacility() {
//		return msh_6_receivingFacility;
//	}
//	/**
//	 * @return the msh_7_dateTimeOfMessage
//	 *	@JsonProperty("msh_7_dateTimeOfMessage")
//	 */
//	
//	public TS_ST getMsh_7_dateTimeOfMessage() {
//		return msh_7_dateTimeOfMessage;
//	}
//	/**
//	 * @return the msh_8_security
//	 *	@JsonProperty("msh_8_security")
//	 */
//	
//	public String getMsh_8_security() {
//		return msh_8_security;
//	}
//	/**
//	 * @return the msh_9_messageType
//	 *	@JsonProperty("msh_9_messageType")
//	 */
//	
//	public CM_MSG_ST getMsh_9_messageType() {
//		return msh_9_messageType;
//	}
//	/**
//	 * @return the msh_10_messageControlID
//	 *	@JsonProperty("msh_10_messageControlID")
//	 */
//	
//	public String getMsh_10_messageControlID() {
//		return msh_10_messageControlID;
//	}
//	/**
//	 * @return the msh_11_processingID
//	 *	@JsonProperty("msh_11_processingID")
//	 */
//	
//	public PT_ST getMsh_11_processingID() {
//		return msh_11_processingID;
//	}
//	/**
//	 * @return the msh_12_versionId
//	 *	@JsonProperty("msh_12_versionId")
//	 */
//	
//	public String getMsh_12_versionId() {
//		return msh_12_versionId;
//	}
//	/**
//	 * @return the msh_13_sequenceNumber
//	 *	@JsonProperty("msh_13_sequenceNumber")
//	 */
//	
//	public String getMsh_13_sequenceNumber() {
//		return msh_13_sequenceNumber;
//	}
//	/**
//	 * @return the msh_14_continuationPointer
//	 *	@JsonProperty("msh_14_continuationPointer")
//	 */
//	
//	public String getMsh_14_continuationPointer() {
//		return msh_14_continuationPointer;
//	}
//	/**
//	 * @return the msh_15_acceptAcknowledgmentType
//	 *	@JsonProperty("msh_15_acceptAcknowledgmentType")
//	 */
//	
//	public String getMsh_15_acceptAcknowledgmentType() {
//		return msh_15_acceptAcknowledgmentType;
//	}
//	/**
//	 * @return the msh_16_applicationAcknowledgmentType
//	 *	@JsonProperty("msh_16_applicationAcknowledgmentType")
//	 */
//	
//	public String getMsh_16_applicationAcknowledgmentType() {
//		return msh_16_applicationAcknowledgmentType;
//	}
//	/**
//	 * @return the msh_17_countryCode
//	 *	@JsonProperty("msh_17_countryCode")
//	 */
//	
//	public String getMsh_17_countryCode() {
//		return msh_17_countryCode;
//	}
//	/**
//	 * @return the msh_18_characterSet
//	 *	@JsonProperty("msh_18_characterSet")
//	 */
//	
//	public List<ST> getMsh_18_characterSet() {
//		return msh_18_characterSet;
//	}
//	/**
//	 * @return the msh_19_principalLanguageOfMessage
//	 *	@JsonProperty("msh_19_principalLanguageOfMessage")
//	 */
//	
//	public CE_ST getMsh_19_principalLanguageOfMessage() {
//		return msh_19_principalLanguageOfMessage;
//	}
//	/**
//	 * @return the nte
//	 *	@JsonProperty("nte")
//	 */
//	
//	public List<NTE_ST_v23> getNte() {
//		return nte;
//	}
//	@Override
//	public String toString() {
//		return "MSH_ST_v23 [id=" + id + ", msh_1_fieldSeparator=" + msh_1_fieldSeparator + ", msh_2_encodingCharacters="
//				+ msh_2_encodingCharacters + ", msh_3_sendingApplication=" + msh_3_sendingApplication
//				+ ", msh_4_sendingFacility=" + msh_4_sendingFacility + ", msh_5_receivingApplication="
//				+ msh_5_receivingApplication + ", msh_6_receivingFacility=" + msh_6_receivingFacility
//				+ ", msh_7_dateTimeOfMessage=" + msh_7_dateTimeOfMessage + ", msh_8_security=" + msh_8_security
//				+ ", msh_9_messageType=" + msh_9_messageType + ", msh_10_messageControlID=" + msh_10_messageControlID
//				+ ", msh_11_processingID=" + msh_11_processingID + ", msh_12_versionId=" + msh_12_versionId
//				+ ", msh_13_sequenceNumber=" + msh_13_sequenceNumber + ", msh_14_continuationPointer="
//				+ msh_14_continuationPointer + ", msh_15_acceptAcknowledgmentType=" + msh_15_acceptAcknowledgmentType
//				+ ", msh_16_applicationAcknowledgmentType=" + msh_16_applicationAcknowledgmentType
//				+ ", msh_17_countryCode=" + msh_17_countryCode + ", msh_18_characterSet=" + msh_18_characterSet
//				+ ", msh_19_principalLanguageOfMessage=" + msh_19_principalLanguageOfMessage + ", nte=" + nte + "]";
//	}
//	
//}
