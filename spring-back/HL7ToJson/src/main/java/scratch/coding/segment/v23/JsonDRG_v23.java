package scratch.coding.segment.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonDRG_v23 {
	@JsonProperty("ce_drg_1_diagnosticRelatedGroup")
	private CE_v2 ce_drg_1_diagnosticRelatedGroup;
	@JsonProperty("ts_drg_2_drgAssignedDateTime")
	private TS_v2 ts_drg_2_drgAssignedDateTime;
	@JsonProperty("drg_3_drgApprovalIndicator")
	private String drg_3_drgApprovalIndicator;
	@JsonProperty("drg_4_drgGrouperReviewCode")
	private String drg_4_drgGrouperReviewCode;
	@JsonProperty("ce_drg_5_outlierType")
	private CE_v2 ce_drg_5_outlierType;
	@JsonProperty("drg_6_outlierDays")
	private String drg_6_outlierDays;
	@JsonProperty("cp_drg_7_cpoutlierCost")
	private CP_v2 cp_drg_7_outlierCost;
	@JsonProperty("drg_8_drgPayor")
	private String drg_8_drgPayor;
	@JsonProperty("cp_drg_9_outlierReimbursement")
	private CP_v2 cp_drg_9_outlierReimbursement;
	@JsonProperty("drg_10_confidentialIndicator")
	private String drg_10_confidentialIndicator;
	
	public JsonDRG_v23(CE_v2 ce_drg_1_diagnosticRelatedGroup, TS_v2 ts_drg_2_drgAssignedDateTime,
			String drg_3_drgApprovalIndicator, String drg_4_drgGrouperReviewCode, CE_v2 ce_drg_5_outlierType,
			String drg_6_outlierDays, CP_v2 cp_drg_7_outlierCost, String drg_8_drgPayor,
			CP_v2 cp_drg_9_outlierReimbursement, String drg_10_confidentialIndicator) {
		super();
		this.ce_drg_1_diagnosticRelatedGroup = ce_drg_1_diagnosticRelatedGroup;
		this.ts_drg_2_drgAssignedDateTime = ts_drg_2_drgAssignedDateTime;
		this.drg_3_drgApprovalIndicator = drg_3_drgApprovalIndicator;
		this.drg_4_drgGrouperReviewCode = drg_4_drgGrouperReviewCode;
		this.ce_drg_5_outlierType = ce_drg_5_outlierType;
		this.drg_6_outlierDays = drg_6_outlierDays;
		this.cp_drg_7_outlierCost = cp_drg_7_outlierCost;
		this.drg_8_drgPayor = drg_8_drgPayor;
		this.cp_drg_9_outlierReimbursement = cp_drg_9_outlierReimbursement;
		this.drg_10_confidentialIndicator = drg_10_confidentialIndicator;
	}
	public JsonDRG_v23() {
		super();
		this.ce_drg_1_diagnosticRelatedGroup = new CE_v2();
		this.ts_drg_2_drgAssignedDateTime = new TS_v2();
		this.drg_3_drgApprovalIndicator = "";
		this.drg_4_drgGrouperReviewCode = "";
		this.ce_drg_5_outlierType = new CE_v2();
		this.drg_6_outlierDays = "";
		this.cp_drg_7_outlierCost = new CP_v2();
		this.drg_8_drgPayor = "";
		this.cp_drg_9_outlierReimbursement = new CP_v2();
		this.drg_10_confidentialIndicator = "";
	}
	public JsonDRG_v23(DRGBuilder builder) {
		super();
		this.ce_drg_1_diagnosticRelatedGroup = builder.ce_drg_1_diagnosticRelatedGroup;
		this.ts_drg_2_drgAssignedDateTime = builder.ts_drg_2_drgAssignedDateTime;
		this.drg_3_drgApprovalIndicator = builder.drg_3_drgApprovalIndicator;
		this.drg_4_drgGrouperReviewCode = builder.drg_4_drgGrouperReviewCode;
		this.ce_drg_5_outlierType = builder.ce_drg_5_outlierType;
		this.drg_6_outlierDays = builder.drg_6_outlierDays;
		this.cp_drg_7_outlierCost = builder.cp_drg_7_outlierCost;
		this.drg_8_drgPayor = builder.drg_8_drgPayor;
		this.cp_drg_9_outlierReimbursement = builder.cp_drg_9_outlierReimbursement;
		this.drg_10_confidentialIndicator = builder.drg_10_confidentialIndicator;
	}
	public static class DRGBuilder {
		private CE_v2 ce_drg_1_diagnosticRelatedGroup;
		private TS_v2 ts_drg_2_drgAssignedDateTime;
		private String drg_3_drgApprovalIndicator;
		private String drg_4_drgGrouperReviewCode;
		private CE_v2 ce_drg_5_outlierType;
		private String drg_6_outlierDays;
		private CP_v2 cp_drg_7_outlierCost;
		private String drg_8_drgPayor;
		private CP_v2 cp_drg_9_outlierReimbursement;
		private String drg_10_confidentialIndicator;
		public DRGBuilder() {
			super();
			this.ce_drg_1_diagnosticRelatedGroup = new CE_v2();
			this.ts_drg_2_drgAssignedDateTime = new TS_v2();
			this.drg_3_drgApprovalIndicator = "";
			this.drg_4_drgGrouperReviewCode = "";
			this.ce_drg_5_outlierType = new CE_v2();
			this.drg_6_outlierDays = "";
			this.cp_drg_7_outlierCost = new CP_v2();
			this.drg_8_drgPayor = "";
			this.cp_drg_9_outlierReimbursement = new CP_v2();
			this.drg_10_confidentialIndicator = "";
		}
		public DRGBuilder ce_drg_1_diagnosticRelatedGroup(CE_v2 ce_drg_1_diagnosticRelatedGroup) {
			this.ce_drg_1_diagnosticRelatedGroup = ce_drg_1_diagnosticRelatedGroup;
			return this;
		}
		public DRGBuilder ts_drg_2_drgAssignedDateTime(TS_v2 ts_drg_2_drgAssignedDateTime) {
			this.ts_drg_2_drgAssignedDateTime = ts_drg_2_drgAssignedDateTime;
			return this;
		}
		public DRGBuilder drg_3_drgApprovalIndicator(String drg_3_drgApprovalIndicator) {
			this.drg_3_drgApprovalIndicator = drg_3_drgApprovalIndicator;
			return this;
		}
		public DRGBuilder rg_4_drgGrouperReviewCode(String drg_4_drgGrouperReviewCode) {
			this.drg_4_drgGrouperReviewCode = drg_4_drgGrouperReviewCode;
			return this;
		}
		public DRGBuilder ce_drg_5_outlierType(CE_v2 ce_drg_5_outlierType) {
			this.ce_drg_5_outlierType = ce_drg_5_outlierType;
			return this;
		}
		public DRGBuilder drg_6_outlierDays(String drg_6_outlierDays) {
			this.drg_6_outlierDays = drg_6_outlierDays;
			return this;
		}
		public DRGBuilder cp_drg_7_outlierCost(CP_v2 cp_drg_7_outlierCost) {
			this.cp_drg_7_outlierCost = cp_drg_7_outlierCost;
			return this;
		}
		public DRGBuilder drg_8_drgPayor(String drg_8_drgPayor) {
			this.drg_8_drgPayor = drg_8_drgPayor;
			return this;
		}
		public DRGBuilder cp_drg_9_outlierReimbursement(CP_v2 cp_drg_9_outlierReimbursement) {
			this.cp_drg_9_outlierReimbursement = cp_drg_9_outlierReimbursement;
			return this;
		}
		public DRGBuilder drg_10_confidentialIndicator(String drg_10_confidentialIndicator) {
			this.drg_10_confidentialIndicator = drg_10_confidentialIndicator;
			return this;
		}
		public JsonDRG_v23 build() {
			return new JsonDRG_v23(this);
		}
	}
	public CE_v2 getCe_drg_1_diagnosticRelatedGroup() {
		return ce_drg_1_diagnosticRelatedGroup;
	}
	public TS_v2 getTs_drg_2_drgAssignedDateTime() {
		return ts_drg_2_drgAssignedDateTime;
	}
	public String getDrg_3_drgApprovalIndicator() {
		return drg_3_drgApprovalIndicator;
	}
	public String getDrg_4_drgGrouperReviewCode() {
		return drg_4_drgGrouperReviewCode;
	}
	public CE_v2 getCe_drg_5_outlierType() {
		return ce_drg_5_outlierType;
	}
	public String getDrg_6_outlierDays() {
		return drg_6_outlierDays;
	}
	public CP_v2 getCp_drg_7_outlierCost() {
		return cp_drg_7_outlierCost;
	}
	public String getDrg_8_drgPayor() {
		return drg_8_drgPayor;
	}
	public CP_v2 getCp_drg_9_outlierReimbursement() {
		return cp_drg_9_outlierReimbursement;
	}
	public String getDrg_10_confidentialIndicator() {
		return drg_10_confidentialIndicator;
	}
	@Override
	public String toString() {
		return "JsonDRG_v23 [ce_drg_1_diagnosticRelatedGroup=" + ce_drg_1_diagnosticRelatedGroup
				+ ", ts_drg_2_drgAssignedDateTime=" + ts_drg_2_drgAssignedDateTime + ", drg_3_drgApprovalIndicator="
				+ drg_3_drgApprovalIndicator + ", drg_4_drgGrouperReviewCode=" + drg_4_drgGrouperReviewCode
				+ ", ce_drg_5_outlierType=" + ce_drg_5_outlierType + ", drg_6_outlierDays=" + drg_6_outlierDays
				+ ", cp_drg_7_outlierCost=" + cp_drg_7_outlierCost + ", drg_8_drgPayor=" + drg_8_drgPayor
				+ ", cp_drg_9_outlierReimbursement=" + cp_drg_9_outlierReimbursement + ", drg_10_confidentialIndicator="
				+ drg_10_confidentialIndicator + "]";
	}
}
