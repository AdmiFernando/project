package scratch.coding.segment.base.v25;
//package scratch.coding.segment.base.v25;
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
//import scratch.coding.models.base.v25.PLN_ST_v25;
//import scratch.coding.models.base.v25.PL_ST_v25;
//import scratch.coding.models.base.v25.XAD_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//import scratch.coding.models.base.v25.XTN_ST_v25;
//import scratch.coding.models.v25.CE_v25;
//import scratch.coding.models.v25.PLN_v25;
//import scratch.coding.models.v25.PL_v25;
//import scratch.coding.models.v25.XAD_v25;
//import scratch.coding.models.v25.XPN_v25;
//import scratch.coding.models.v25.XTN_v25;
//
//@Table(name="CTD_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CTD_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CTD_ID")
//	private Long id;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_1_v25")
//	@JsonProperty("ctd_1_contactRole")
//	private List<CE_ST> ctd_1_contactRole;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_2_v25")
//	@JsonProperty("ctd_2_contactName")
//	private List<XPN_ST_v25> ctd_2_contactName;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_3_v25")
//	@JsonProperty("ctd_3_contactAddress")
//	private List<XAD_ST_v25> ctd_3_contactAddress;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_4_v25", referencedColumnName = "PL_ID")
//	@JsonProperty("ctd_4_contactLocation")
//	private PL_ST_v25 ctd_4_contactLocation;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_5_v25")
//	@JsonProperty("ctd_5_contactCommunicationInformation")
//	private List<XTN_ST_v25> ctd_5_contactCommunicationInformation;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_6_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("ctd_6_preferredMethodofContact")
//	private CE_ST ctd_6_preferredMethodofContact;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CTD_7_v25")
//	@JsonProperty("ctd_7_contactIdentifiers")
//	private List<PLN_ST_v25> ctd_7_contactIdentifiers;
//	private CTD_ST_v25(CTDBuilder builder) {
//		super();
//		this.ctd_1_contactRole = builder.ctd_1_contactRole;
//		this.ctd_2_contactName = builder.ctd_2_contactName;
//		this.ctd_3_contactAddress = builder.ctd_3_contactAddress;
//		this.ctd_4_contactLocation = builder.ctd_4_contactLocation;
//		this.ctd_5_contactCommunicationInformation = builder.ctd_5_contactCommunicationInformation;
//		this.ctd_6_preferredMethodofContact = builder.ctd_6_preferredMethodofContact;
//		this.ctd_7_contactIdentifiers = builder.ctd_7_contactIdentifiers;
//	}
//	public CTD_ST_v25() {
//		super();
//		this.ctd_1_contactRole = new ArrayList<>();
//		this.ctd_2_contactName = new ArrayList<>();
//		this.ctd_3_contactAddress = new ArrayList<>();
//		this.ctd_4_contactLocation = new PL_ST_v25();
//		this.ctd_5_contactCommunicationInformation = new ArrayList<>();
//		this.ctd_6_preferredMethodofContact = new CE_ST();
//		this.ctd_7_contactIdentifiers = new ArrayList<>();
//	}
//	public static class CTDBuilder {
//		private List<CE_ST>	ctd_1_contactRole;
//		private List<XPN_ST_v25> ctd_2_contactName;
//		private List<XAD_ST_v25> ctd_3_contactAddress;
//		private PL_ST_v25 ctd_4_contactLocation;
//		private List<XTN_ST_v25> ctd_5_contactCommunicationInformation;
//		private CE_ST ctd_6_preferredMethodofContact;
//		private List<PLN_ST_v25> ctd_7_contactIdentifiers;
//		public CTDBuilder() {
//			super();
//			this.ctd_1_contactRole = new ArrayList<>();
//			this.ctd_2_contactName = new ArrayList<>();
//			this.ctd_3_contactAddress = new ArrayList<>();
//			this.ctd_4_contactLocation = new PL_ST_v25();
//			this.ctd_5_contactCommunicationInformation = new ArrayList<>();
//			this.ctd_6_preferredMethodofContact = new CE_ST();
//			this.ctd_7_contactIdentifiers = new ArrayList<>();
//		}
//		public CTDBuilder ctd_1_contactRole(List<CE_ST> ctd_1_contactRole) {
//			this.ctd_1_contactRole = ctd_1_contactRole;
//			return this;
//		}
//		public CTDBuilder ctd_2_contactName(List<XPN_ST_v25> ctd_2_contactName) {
//			this.ctd_2_contactName = ctd_2_contactName;
//			return this;
//		}
//		public CTDBuilder ctd_3_contactAddress(List<XAD_ST_v25> ctd_3_contactAddress) {
//			this.ctd_3_contactAddress = ctd_3_contactAddress;
//			return this;
//		}
//		public CTDBuilder ctd_4_contactLocation(PL_ST_v25 ctd_4_contactLocation) {
//			this.ctd_4_contactLocation = ctd_4_contactLocation;
//			return this;
//		}
//		public CTDBuilder ctd_5_contactCommunicationInformation(List<XTN_ST_v25> ctd_5_contactCommunicationInformation) {
//			this.ctd_5_contactCommunicationInformation = ctd_5_contactCommunicationInformation;
//			return this;
//		}
//		public CTDBuilder ctd_6_preferredMethodofContact(CE_ST ctd_6_preferredMethodofContact) {
//			this.ctd_6_preferredMethodofContact = ctd_6_preferredMethodofContact;
//			return this;
//		}
//		public CTDBuilder ctd_7_contactIdentifiers(List<PLN_ST_v25> ctd_7_contactIdentifiers) {
//			this.ctd_7_contactIdentifiers = ctd_7_contactIdentifiers;
//			return this;
//		}	
//		public CTD_ST_v25 build() {
//			return new CTD_ST_v25(this);
//		}
//	}
//	public List<CE_ST> getCtd_1_contactRole() {
//		return ctd_1_contactRole;
//	}
//	public List<XPN_ST_v25> getCtd_2_contactName() {
//		return ctd_2_contactName;
//	}
//	public List<XAD_ST_v25> getCtd_3_contactAddress() {
//		return ctd_3_contactAddress;
//	}
//	public PL_ST_v25 getCtd_4_contactLocation() {
//		return ctd_4_contactLocation;
//	}
//	public List<XTN_ST_v25> getCtd_5_contactCommunicationInformation() {
//		return ctd_5_contactCommunicationInformation;
//	}
//	public CE_ST getCtd_6_preferredMethodofContact() {
//		return ctd_6_preferredMethodofContact;
//	}
//	public List<PLN_ST_v25> getCtd_7_contactIdentifiers() {
//		return ctd_7_contactIdentifiers;
//	}
//	@Override
//	public String toString() {
//		return "CTD_ST_v25 [id=" + id + ", ctd_1_contactRole=" + ctd_1_contactRole + ", ctd_2_contactName="
//				+ ctd_2_contactName + ", ctd_3_contactAddress=" + ctd_3_contactAddress + ", ctd_4_contactLocation="
//				+ ctd_4_contactLocation + ", ctd_5_contactCommunicationInformation="
//				+ ctd_5_contactCommunicationInformation + ", ctd_6_preferredMethodofContact="
//				+ ctd_6_preferredMethodofContact + ", ctd_7_contactIdentifiers=" + ctd_7_contactIdentifiers + "]";
//	}
//	
//}
