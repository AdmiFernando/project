package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.XON_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonSFT_v25 {
	@JsonProperty("sft_1_softwareVendorOrganization")
	private XON_v25 sft_1_softwareVendorOrganization;
	@JsonProperty("sft_2_softwareCertifiedVersionorReleaseNumber")
	private String sft_2_softwareCertifiedVersionorReleaseNumber;
	@JsonProperty("sft_3_softwareProductName")
	private String sft_3_softwareProductName;
	@JsonProperty("sft_4_softwareBinaryID")
	private String sft_4_softwareBinaryID;
	@JsonProperty("sft_5_softwareProductInformation")
	private String sft_5_softwareProductInformation;
	@JsonProperty("sft_6_softwareInstallDate")
	private TS_v2 sft_6_softwareInstallDate;
	public JsonSFT_v25() {
		super();
		this.sft_1_softwareVendorOrganization = new XON_v25();
		this.sft_2_softwareCertifiedVersionorReleaseNumber = "";
		this.sft_3_softwareProductName = "";
		this.sft_4_softwareBinaryID = "";
		this.sft_5_softwareProductInformation = "";
		this.sft_6_softwareInstallDate = new TS_v2();
	}
	public JsonSFT_v25(SFTBuilder builder) {
		super();
		this.sft_1_softwareVendorOrganization = builder.sft_1_softwareVendorOrganization;
		this.sft_2_softwareCertifiedVersionorReleaseNumber = builder.sft_2_softwareCertifiedVersionorReleaseNumber;
		this.sft_3_softwareProductName = builder.sft_3_softwareProductName;
		this.sft_4_softwareBinaryID = builder.sft_4_softwareBinaryID;
		this.sft_5_softwareProductInformation = builder.sft_5_softwareProductInformation;
		this.sft_6_softwareInstallDate = builder.sft_6_softwareInstallDate;
	}
	public static class SFTBuilder{
		private XON_v25 sft_1_softwareVendorOrganization;
		private String sft_2_softwareCertifiedVersionorReleaseNumber;
		private String sft_3_softwareProductName;
		private String sft_4_softwareBinaryID;
		private String sft_5_softwareProductInformation;
		private TS_v2 sft_6_softwareInstallDate;
		public SFTBuilder() {
			super();
			this.sft_1_softwareVendorOrganization = new XON_v25();
			this.sft_2_softwareCertifiedVersionorReleaseNumber = "";
			this.sft_3_softwareProductName = "";
			this.sft_4_softwareBinaryID = "";
			this.sft_5_softwareProductInformation = "";
			this.sft_6_softwareInstallDate = new TS_v2();
		}
		public SFTBuilder sft_1_softwareVendorOrganization(XON_v25 sft_1_softwareVendorOrganization) {
			this.sft_1_softwareVendorOrganization = sft_1_softwareVendorOrganization;
			return this;
		}
		public SFTBuilder sft_2_softwareCertifiedVersionorReleaseNumber(String sft_2_softwareCertifiedVersionorReleaseNumber) {
			this.sft_2_softwareCertifiedVersionorReleaseNumber = sft_2_softwareCertifiedVersionorReleaseNumber;
			return this;
		}
		public SFTBuilder sft_3_softwareProductName(String sft_3_softwareProductName) {
			this.sft_3_softwareProductName = sft_3_softwareProductName;
			return this;
		}
		public SFTBuilder sft_4_softwareBinaryID(String sft_4_softwareBinaryID) {
			this.sft_4_softwareBinaryID = sft_4_softwareBinaryID;
			return this;
		}
		public SFTBuilder sft_5_softwareProductInformation(String sft_5_softwareProductInformation) {
			this.sft_5_softwareProductInformation = sft_5_softwareProductInformation;
			return this;
		}
		public SFTBuilder sft_6_softwareInstallDate(TS_v2 sft_6_softwareInstallDate) {
			this.sft_6_softwareInstallDate = sft_6_softwareInstallDate;
			return this;
		}
		public JsonSFT_v25 build() {
			return new JsonSFT_v25(this);
		}
	}
	public XON_v25 getSft_1_softwareVendorOrganization() {
		return sft_1_softwareVendorOrganization;
	}
	public String getSft_2_softwareCertifiedVersionorReleaseNumber() {
		return sft_2_softwareCertifiedVersionorReleaseNumber;
	}
	public String getSft_3_softwareProductName() {
		return sft_3_softwareProductName;
	}
	public String getSft_4_softwareBinaryID() {
		return sft_4_softwareBinaryID;
	}
	public String getSft_5_softwareProductInformation() {
		return sft_5_softwareProductInformation;
	}
	public TS_v2 getSft_6_softwareInstallDate() {
		return sft_6_softwareInstallDate;
	}
	@Override
	public String toString() {
		return "JsonSFT_v25 [sft_1_softwareVendorOrganization=" + sft_1_softwareVendorOrganization
				+ ", sft_2_softwareCertifiedVersionorReleaseNumber=" + sft_2_softwareCertifiedVersionorReleaseNumber
				+ ", sft_3_softwareProductName=" + sft_3_softwareProductName + ", sft_4_softwareBinaryID="
				+ sft_4_softwareBinaryID + ", sft_5_softwareProductInformation=" + sft_5_softwareProductInformation
				+ ", sft_6_softwareInstallDate=" + sft_6_softwareInstallDate + "]";
	}
	
	
}
