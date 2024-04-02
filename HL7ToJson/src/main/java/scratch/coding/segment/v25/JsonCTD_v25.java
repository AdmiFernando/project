package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.v25.PLN_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XPN_v25;
import scratch.coding.models.v25.XTN_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonCTD_v25 {
	@JsonProperty("ctd_1_contactRole")
	private CE_v2[] ctd_1_contactRole;
	@JsonProperty("ctd_2_contactName")
	private XPN_v25[] ctd_2_contactName;
	@JsonProperty("ctd_3_contactAddress")
	private XAD_v25[] ctd_3_contactAddress;
	@JsonProperty("ctd_4_contactLocation")
	private PL_v25 ctd_4_contactLocation;
	@JsonProperty("ctd_5_contactCommunicationInformation")
	private XTN_v25[] ctd_5_contactCommunicationInformation;
	@JsonProperty("ctd_6_preferredMethodofContact")
	private CE_v2 ctd_6_preferredMethodofContact;
	@JsonProperty("ctd_7_contactIdentifiers")
	private PLN_v25[] ctd_7_contactIdentifiers;
	private JsonCTD_v25(CTDBuilder builder) {
		super();
		this.ctd_1_contactRole = builder.ctd_1_contactRole;
		this.ctd_2_contactName = builder.ctd_2_contactName;
		this.ctd_3_contactAddress = builder.ctd_3_contactAddress;
		this.ctd_4_contactLocation = builder.ctd_4_contactLocation;
		this.ctd_5_contactCommunicationInformation = builder.ctd_5_contactCommunicationInformation;
		this.ctd_6_preferredMethodofContact = builder.ctd_6_preferredMethodofContact;
		this.ctd_7_contactIdentifiers = builder.ctd_7_contactIdentifiers;
	}
	public JsonCTD_v25() {
		super();
		this.ctd_1_contactRole = new CE_v2[] {};
		this.ctd_2_contactName = new XPN_v25[] {};
		this.ctd_3_contactAddress = new XAD_v25[] {};
		this.ctd_4_contactLocation = new PL_v25();
		this.ctd_5_contactCommunicationInformation = new XTN_v25[] {};
		this.ctd_6_preferredMethodofContact = new CE_v2();
		this.ctd_7_contactIdentifiers = new PLN_v25[] {};
	}
	public static class CTDBuilder {
		private CE_v2[]	ctd_1_contactRole;
		private XPN_v25[] ctd_2_contactName;
		private XAD_v25[] ctd_3_contactAddress;
		private PL_v25 ctd_4_contactLocation;
		private XTN_v25[] ctd_5_contactCommunicationInformation;
		private CE_v2 ctd_6_preferredMethodofContact;
		private PLN_v25[] ctd_7_contactIdentifiers;
		public CTDBuilder() {
			super();
			this.ctd_1_contactRole = new CE_v2[] {};
			this.ctd_2_contactName = new XPN_v25[] {};
			this.ctd_3_contactAddress = new XAD_v25[] {};
			this.ctd_4_contactLocation = new PL_v25();
			this.ctd_5_contactCommunicationInformation = new XTN_v25[] {};
			this.ctd_6_preferredMethodofContact = new CE_v2();
			this.ctd_7_contactIdentifiers = new PLN_v25[] {};
		}
		public CTDBuilder ctd_1_contactRole(CE_v2[] ctd_1_contactRole) {
			this.ctd_1_contactRole = ctd_1_contactRole;
			return this;
		}
		public CTDBuilder ctd_2_contactName(XPN_v25[] ctd_2_contactName) {
			this.ctd_2_contactName = ctd_2_contactName;
			return this;
		}
		public CTDBuilder ctd_3_contactAddress(XAD_v25[] ctd_3_contactAddress) {
			this.ctd_3_contactAddress = ctd_3_contactAddress;
			return this;
		}
		public CTDBuilder ctd_4_contactLocation(PL_v25 ctd_4_contactLocation) {
			this.ctd_4_contactLocation = ctd_4_contactLocation;
			return this;
		}
		public CTDBuilder ctd_5_contactCommunicationInformation(XTN_v25[] ctd_5_contactCommunicationInformation) {
			this.ctd_5_contactCommunicationInformation = ctd_5_contactCommunicationInformation;
			return this;
		}
		public CTDBuilder ctd_6_preferredMethodofContact(CE_v2 ctd_6_preferredMethodofContact) {
			this.ctd_6_preferredMethodofContact = ctd_6_preferredMethodofContact;
			return this;
		}
		public CTDBuilder ctd_7_contactIdentifiers(PLN_v25[] ctd_7_contactIdentifiers) {
			this.ctd_7_contactIdentifiers = ctd_7_contactIdentifiers;
			return this;
		}	
		public JsonCTD_v25 build() {
			return new JsonCTD_v25(this);
		}
	}
	public CE_v2[] getCtd_1_contactRole() {
		return ctd_1_contactRole;
	}
	public XPN_v25[] getCtd_2_contactName() {
		return ctd_2_contactName;
	}
	public XAD_v25[] getCtd_3_contactAddress() {
		return ctd_3_contactAddress;
	}
	public PL_v25 getCtd_4_contactLocation() {
		return ctd_4_contactLocation;
	}
	public XTN_v25[] getCtd_5_contactCommunicationInformation() {
		return ctd_5_contactCommunicationInformation;
	}
	public CE_v2 getCtd_6_preferredMethodofContact() {
		return ctd_6_preferredMethodofContact;
	}
	public PLN_v25[] getCtd_7_contactIdentifiers() {
		return ctd_7_contactIdentifiers;
	}
	@Override
	public String toString() {
		return "JsonCTD_v25 [ctd_1_contactRole=" + Arrays.toString(ctd_1_contactRole) + ", ctd_2_contactName="
				+ Arrays.toString(ctd_2_contactName) + ", ctd_3_contactAddress=" + Arrays.toString(ctd_3_contactAddress)
				+ ", ctd_4_contactLocation=" + ctd_4_contactLocation + ", ctd_5_contactCommunicationInformation="
				+ Arrays.toString(ctd_5_contactCommunicationInformation) + ", ctd_6_preferredMethodofContact="
				+ ctd_6_preferredMethodofContact + ", ctd_7_contactIdentifiers="
				+ Arrays.toString(ctd_7_contactIdentifiers) + "]";
	}
}
