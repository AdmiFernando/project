package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.XCN_v23;
import scratch.coding.models.v23.XON_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPD1_v23 {
	
	@JsonProperty("pd1_1_livingDependency")
	private String pd1_1_livingDependency;
	@JsonProperty("pd1_2_livingArrangement")
	private String pd1_2_livingArrangement;
	@JsonProperty("xon_pd1_3_patientPrimaryFacility")
	private XON_v23[] xon_pd1_3_patientPrimaryFacility;
	@JsonProperty("xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo")
	private XCN_v23[] xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
	@JsonProperty("pd1_5_studenIndicator")
	private String pd1_5_studenIndicator;
	@JsonProperty("pd1_6_handicap")
	private String pd1_6_handicap;
	@JsonProperty("pd1_7_livingWill")
	private String pd1_7_livingWill;
	@JsonProperty("pd1_8_organDonor")
	private String pd1_8_organDonor;
	@JsonProperty("pd1_9_separateBill")
	private String pd1_9_separateBill;
	@JsonProperty("cx_pd1_10_duplicatePatient")
	private CX_v23[] cx_pd1_10_duplicatePatient;
	@JsonProperty("ce_pd1_11_publicityIndicator")
	private CE_v2 ce_pd1_11_publicityIndicator;
	@JsonProperty("pd1_12_protectionIndicator")
	private String pd1_12_protectionIndicator;
	private JsonPD1_v23(PD1Builder builder) {
		super();
		this.pd1_1_livingDependency = builder.pd1_1_livingDependency;
		this.pd1_2_livingArrangement = builder.pd1_2_livingArrangement;
		this.xon_pd1_3_patientPrimaryFacility = builder.xon_pd1_3_patientPrimaryFacility;
		this.xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo = builder.xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
		this.pd1_5_studenIndicator = builder.pd1_5_studenIndicator;
		this.pd1_6_handicap = builder.pd1_6_handicap;
		this.pd1_7_livingWill = builder.pd1_7_livingWill;
		this.pd1_8_organDonor = builder.pd1_8_organDonor;
		this.pd1_9_separateBill = builder.pd1_9_separateBill;
		this.cx_pd1_10_duplicatePatient = builder.cx_pd1_10_duplicatePatient;
		this.ce_pd1_11_publicityIndicator = builder.ce_pd1_11_publicityIndicator;
		this.pd1_12_protectionIndicator = builder.pd1_12_protectionIndicator;
	}
	public JsonPD1_v23() {
		super();
		this.pd1_1_livingDependency = "";
		this.pd1_2_livingArrangement = "";
		this.xon_pd1_3_patientPrimaryFacility = new XON_v23[] {};
		this.xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo = new XCN_v23[] {};
		this.pd1_5_studenIndicator = "";
		this.pd1_6_handicap = "";
		this.pd1_7_livingWill = "";
		this.pd1_8_organDonor = "";
		this.pd1_9_separateBill = "";
		this.cx_pd1_10_duplicatePatient = new CX_v23[] {};
		this.ce_pd1_11_publicityIndicator = new CE_v2();
		this.pd1_12_protectionIndicator = "";
	}
	public static class PD1Builder {
		private String pd1_1_livingDependency;
		private String pd1_2_livingArrangement;
		private XON_v23[] xon_pd1_3_patientPrimaryFacility;
		private XCN_v23[] xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
		private String pd1_5_studenIndicator;
		private String pd1_6_handicap;
		private String pd1_7_livingWill;
		private String pd1_8_organDonor;
		private String pd1_9_separateBill;
		private CX_v23[] cx_pd1_10_duplicatePatient;
		private CE_v2 ce_pd1_11_publicityIndicator;
		private String pd1_12_protectionIndicator;
		public PD1Builder() {
			super();
			this.pd1_1_livingDependency = "";
			this.pd1_2_livingArrangement = "";
			this.xon_pd1_3_patientPrimaryFacility = new XON_v23[] {};
			this.xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo = new XCN_v23[] {};
			this.pd1_5_studenIndicator = "";
			this.pd1_6_handicap = "";
			this.pd1_7_livingWill = "";
			this.pd1_8_organDonor = "";
			this.pd1_9_separateBill = "";
			this.cx_pd1_10_duplicatePatient = new CX_v23[] {};
			this.ce_pd1_11_publicityIndicator = new CE_v2();
			this.pd1_12_protectionIndicator = "";
		}
		public PD1Builder pd1_1_livingDependency(String pd1_1_livingDependency) {
			this.pd1_1_livingDependency = pd1_1_livingDependency;
			return this;
		}
		public PD1Builder pd1_2_livingArrangement(String pd1_2_livingArrangement) {
			this.pd1_2_livingArrangement = pd1_2_livingArrangement;
			return this;
		}
		public PD1Builder xon_pd1_3_patientPrimaryFacility(XON_v23[] xon_pd1_3_patientPrimaryFacility) {
			this.xon_pd1_3_patientPrimaryFacility = xon_pd1_3_patientPrimaryFacility;
			return this;
		}
		public PD1Builder xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo(
				XCN_v23[] xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo) {
			this.xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo = xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
			return this;
		}
		public PD1Builder pd1_5_studenIndicator(String pd1_5_studenIndicator) {
			this.pd1_5_studenIndicator = pd1_5_studenIndicator;
			return this;
		}
		public PD1Builder pd1_6_handicap(String pd1_6_handicap) {
			this.pd1_6_handicap = pd1_6_handicap;
			return this;
		}
		public PD1Builder pd1_7_livingWill(String pd1_7_livingWill) {
			this.pd1_7_livingWill = pd1_7_livingWill;
			return this;
		}
		public PD1Builder pd1_8_organDonor(String pd1_8_organDonor) {
			this.pd1_8_organDonor = pd1_8_organDonor;
			return this;
		}
		public PD1Builder pd1_9_separateBill(String pd1_9_separateBill) {
			this.pd1_9_separateBill = pd1_9_separateBill;
			return this;
		}
		public PD1Builder cx_pd1_10_duplicatePatient(CX_v23[] cx_pd1_10_duplicatePatient) {
			this.cx_pd1_10_duplicatePatient = cx_pd1_10_duplicatePatient;
			return this;
		}
		public PD1Builder ce_pd1_11_publicityIndicator(CE_v2 ce_pd1_11_publicityIndicator) {
			this.ce_pd1_11_publicityIndicator = ce_pd1_11_publicityIndicator;
			return this;
		}
		public PD1Builder setPd1_12_protectionIndicator(String pd1_12_protectionIndicator) {
			this.pd1_12_protectionIndicator = pd1_12_protectionIndicator;
			return this;
		}
		public JsonPD1_v23 build() {
			return new JsonPD1_v23(this);
		}
	}
	public String getPd1_1_livingDependency() {
		return pd1_1_livingDependency;
	}
	public String getPd1_2_livingArrangement() {
		return pd1_2_livingArrangement;
	}
	public XON_v23[] getXon_pd1_3_patientPrimaryFacility() {
		return xon_pd1_3_patientPrimaryFacility;
	}
	public XCN_v23[] getXcn_pd1_4_patientPrimaryCareProviderNameAndIdNo() {
		return xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo;
	}
	public String getPd1_5_studenIndicator() {
		return pd1_5_studenIndicator;
	}
	public String getPd1_6_handicap() {
		return pd1_6_handicap;
	}
	public String getPd1_7_livingWill() {
		return pd1_7_livingWill;
	}
	public String getPd1_8_organDonor() {
		return pd1_8_organDonor;
	}
	public String getPd1_9_separateBill() {
		return pd1_9_separateBill;
	}
	public CX_v23[] getCx_pd1_10_duplicatePatient() {
		return cx_pd1_10_duplicatePatient;
	}
	public CE_v2 getCe_pd1_11_publicityIndicator() {
		return ce_pd1_11_publicityIndicator;
	}
	public String getPd1_12_protectionIndicator() {
		return pd1_12_protectionIndicator;
	}
	@Override
	public String toString() {
		return "JsonPD1_v23 [pd1_1_livingDependency=" + pd1_1_livingDependency + ", pd1_2_livingArrangement="
				+ pd1_2_livingArrangement + ", xon_pd1_3_patientPrimaryFacility="
				+ Arrays.toString(xon_pd1_3_patientPrimaryFacility)
				+ ", xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo="
				+ Arrays.toString(xcn_pd1_4_patientPrimaryCareProviderNameAndIdNo) + ", pd1_5_studenIndicator="
				+ pd1_5_studenIndicator + ", pd1_6_handicap=" + pd1_6_handicap + ", pd1_7_livingWill="
				+ pd1_7_livingWill + ", pd1_8_organDonor=" + pd1_8_organDonor + ", pd1_9_separateBill="
				+ pd1_9_separateBill + ", cx_pd1_10_duplicatePatient=" + Arrays.toString(cx_pd1_10_duplicatePatient)
				+ ", ce_pd1_11_publicityIndicator=" + ce_pd1_11_publicityIndicator + ", pd1_12_protectionIndicator="
				+ pd1_12_protectionIndicator + "]";
	}
}
