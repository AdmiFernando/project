package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.XCN_v23;


@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonDG1_v23 {
	@JsonProperty("dg1_1_setId")
	private String dg1_1_setId;
	@JsonProperty("dg1_2_diagnosisCodingMethod")
	private String dg1_2_diagnosisCodingMethod;
	@JsonProperty("ce_dg1_3_diagnosisCode")
	private CE_v2 ce_dg1_3_diagnosisCode;
	@JsonProperty("dg1_4_diagnosisDescription")
	private String dg1_4_diagnosisDescription;
	@JsonProperty("ts_dg1_5_diagnosisDateTime")
	private TS_v2 ts_dg1_5_diagnosisDateTime;
	@JsonProperty("dg1_6_diagnosisType")
	private String dg1_6_diagnosisType;
	@JsonProperty("ce_dg1_7_majorDiagnosticCategory")
	private CE_v2 ce_dg1_7_majorDiagnosticCategory;
	@JsonProperty("ce_dg1_8_diagnosticRelatedGroup")
	private CE_v2 ce_dg1_8_diagnosticRelatedGroup;
	@JsonProperty("dg1_9_drgApprovalIndicator")
	private String dg1_9_drgApprovalIndicator;
	@JsonProperty("dg1_10_drgGrouperReviewCode")
	private String dg1_10_drgGrouperReviewCode;
	@JsonProperty("ce_dg1_11_outlierType")
	private CE_v2 ce_dg1_11_outlierType;
	@JsonProperty("dg1_12_outlierDays")
	private String dg1_12_outlierDays;
	@JsonProperty("cp_dg1_13_outlierCost")
	private CP_v2 cp_dg1_13_outlierCost;
	@JsonProperty("dg1_14_grouperVersionAndType")
	private String dg1_14_grouperVersionAndType;
	@JsonProperty("dg1_15_diagnosisPriority")
	private String dg1_15_diagnosisPriority;
	@JsonProperty("xcn_dg1_16_diagnosingClinician")
	private XCN_v23[] xcn_dg1_16_diagnosingClinician;
	@JsonProperty("dg1_17_diagnosisClassification")
	private String dg1_17_diagnosisClassification;
	@JsonProperty("dg1_18_confidentialIndicator")
	private String dg1_18_confidentialIndicator;
	@JsonProperty("ts_dg1_19_attestationDateTime")
	private TS_v2 ts_dg1_19_attestationDateTime;
	
	public JsonDG1_v23(String dg1_1_setId, String dg1_2_diagnosisCodingMethod, CE_v2 ce_dg1_3_diagnosisCode,
			String dg1_4_diagnosisDescription, TS_v2 ts_dg1_5_diagnosisDateTime, String dg1_6_diagnosisType,
			CE_v2 ce_dg1_7_majorDiagnosticCategory, CE_v2 ce_dg1_8_diagnosticRelatedGroup,
			String dg1_9_drgApprovalIndicator, String dg1_10_drgGrouperReviewCode, CE_v2 ce_dg1_11_outlierType,
			String dg1_12_outlierDays, CP_v2 cp_dg1_13_outlierCost, String dg1_14_grouperVersionAndType,
			String dg1_15_diagnosisPriority, XCN_v23[] xcn_dg1_16_diagnosingClinician,
			String dg1_17_diagnosisClassification, String dg1_18_confidentialIndicator,
			TS_v2 ts_dg1_19_attestationDateTime) {
		super();
		this.dg1_1_setId = dg1_1_setId;
		this.dg1_2_diagnosisCodingMethod = dg1_2_diagnosisCodingMethod;
		this.ce_dg1_3_diagnosisCode = ce_dg1_3_diagnosisCode;
		this.dg1_4_diagnosisDescription = dg1_4_diagnosisDescription;
		this.ts_dg1_5_diagnosisDateTime = ts_dg1_5_diagnosisDateTime;
		this.dg1_6_diagnosisType = dg1_6_diagnosisType;
		this.ce_dg1_7_majorDiagnosticCategory = ce_dg1_7_majorDiagnosticCategory;
		this.ce_dg1_8_diagnosticRelatedGroup = ce_dg1_8_diagnosticRelatedGroup;
		this.dg1_9_drgApprovalIndicator = dg1_9_drgApprovalIndicator;
		this.dg1_10_drgGrouperReviewCode = dg1_10_drgGrouperReviewCode;
		this.ce_dg1_11_outlierType = ce_dg1_11_outlierType;
		this.dg1_12_outlierDays = dg1_12_outlierDays;
		this.cp_dg1_13_outlierCost = cp_dg1_13_outlierCost;
		this.dg1_14_grouperVersionAndType = dg1_14_grouperVersionAndType;
		this.dg1_15_diagnosisPriority = dg1_15_diagnosisPriority;
		this.xcn_dg1_16_diagnosingClinician = xcn_dg1_16_diagnosingClinician;
		this.dg1_17_diagnosisClassification = dg1_17_diagnosisClassification;
		this.dg1_18_confidentialIndicator = dg1_18_confidentialIndicator;
		this.ts_dg1_19_attestationDateTime = ts_dg1_19_attestationDateTime;
	}
	public JsonDG1_v23() {
		super();
		this.dg1_1_setId = "";
		this.dg1_2_diagnosisCodingMethod = "";
		this.ce_dg1_3_diagnosisCode = new CE_v2();
		this.dg1_4_diagnosisDescription = "";
		this.ts_dg1_5_diagnosisDateTime = new TS_v2();
		this.dg1_6_diagnosisType = "";
		this.ce_dg1_7_majorDiagnosticCategory = new CE_v2();
		this.ce_dg1_8_diagnosticRelatedGroup = new CE_v2();
		this.dg1_9_drgApprovalIndicator =  "";
		this.dg1_10_drgGrouperReviewCode =  "";
		this.ce_dg1_11_outlierType = new CE_v2();
		this.dg1_12_outlierDays =  "";
		this.cp_dg1_13_outlierCost = new CP_v2();
		this.dg1_14_grouperVersionAndType =  "";
		this.dg1_15_diagnosisPriority =  "";
		this.xcn_dg1_16_diagnosingClinician = new XCN_v23[] {};
		this.dg1_17_diagnosisClassification =  "";
		this.dg1_18_confidentialIndicator =  "";
		this.ts_dg1_19_attestationDateTime =  new TS_v2();
	}
	private JsonDG1_v23(DG1Builder builder) {
		super();
		this.dg1_1_setId = builder.dg1_1_setId;
		this.dg1_2_diagnosisCodingMethod = builder.dg1_2_diagnosisCodingMethod;
		this.ce_dg1_3_diagnosisCode = builder.ce_dg1_3_diagnosisCode;
		this.dg1_4_diagnosisDescription = builder.dg1_4_diagnosisDescription;
		this.ts_dg1_5_diagnosisDateTime = builder.ts_dg1_5_diagnosisDateTime;
		this.dg1_6_diagnosisType = builder.dg1_6_diagnosisType;
		this.ce_dg1_7_majorDiagnosticCategory = builder.ce_dg1_7_majorDiagnosticCategory;
		this.ce_dg1_8_diagnosticRelatedGroup = builder.ce_dg1_8_diagnosticRelatedGroup;
		this.dg1_9_drgApprovalIndicator = builder.dg1_9_drgApprovalIndicator;
		this.dg1_10_drgGrouperReviewCode = builder.dg1_10_drgGrouperReviewCode;
		this.ce_dg1_11_outlierType = builder.ce_dg1_11_outlierType;
		this.dg1_12_outlierDays = builder.dg1_12_outlierDays;
		this.cp_dg1_13_outlierCost = builder.cp_dg1_13_outlierCost;
		this.dg1_14_grouperVersionAndType = builder.dg1_14_grouperVersionAndType;
		this.dg1_15_diagnosisPriority = builder.dg1_15_diagnosisPriority;
		this.xcn_dg1_16_diagnosingClinician = builder.xcn_dg1_16_diagnosingClinician;
		this.dg1_17_diagnosisClassification = builder.dg1_17_diagnosisClassification;
		this.dg1_18_confidentialIndicator = builder.dg1_18_confidentialIndicator;
		this.ts_dg1_19_attestationDateTime = builder.ts_dg1_19_attestationDateTime;
	}
	public static class DG1Builder {
		private String dg1_1_setId;
		private String dg1_2_diagnosisCodingMethod;
		private CE_v2 ce_dg1_3_diagnosisCode;
		private String dg1_4_diagnosisDescription;
		private TS_v2 ts_dg1_5_diagnosisDateTime;
		private String dg1_6_diagnosisType;
		private CE_v2 ce_dg1_7_majorDiagnosticCategory;
		private CE_v2 ce_dg1_8_diagnosticRelatedGroup;
		private String dg1_9_drgApprovalIndicator;
		private String dg1_10_drgGrouperReviewCode;
		private CE_v2 ce_dg1_11_outlierType;
		private String dg1_12_outlierDays;
		private CP_v2 cp_dg1_13_outlierCost;
		private String dg1_14_grouperVersionAndType;
		private String dg1_15_diagnosisPriority;
		private XCN_v23[] xcn_dg1_16_diagnosingClinician;
		private String dg1_17_diagnosisClassification;
		private String dg1_18_confidentialIndicator;
		private TS_v2 ts_dg1_19_attestationDateTime;
		public DG1Builder(String dg1_1_setId, String dg1_6_diagnosisType) {
			super();
			this.dg1_1_setId = dg1_1_setId;
			this.dg1_2_diagnosisCodingMethod = "";
			this.ce_dg1_3_diagnosisCode = new CE_v2();
			this.dg1_4_diagnosisDescription = "";
			this.ts_dg1_5_diagnosisDateTime = new TS_v2();
			this.dg1_6_diagnosisType = dg1_6_diagnosisType;
			this.ce_dg1_7_majorDiagnosticCategory = new CE_v2();
			this.ce_dg1_8_diagnosticRelatedGroup = new CE_v2();
			this.dg1_9_drgApprovalIndicator = "";
			this.dg1_10_drgGrouperReviewCode = "";
			this.ce_dg1_11_outlierType = new CE_v2();
			this.dg1_12_outlierDays = "";
			this.cp_dg1_13_outlierCost = new CP_v2();
			this.dg1_14_grouperVersionAndType = "";
			this.dg1_15_diagnosisPriority = "";
			this.xcn_dg1_16_diagnosingClinician = new XCN_v23[] {};
			this.dg1_17_diagnosisClassification = "";
			this.dg1_18_confidentialIndicator = "";
			this.ts_dg1_19_attestationDateTime = new TS_v2();
		}
		public DG1Builder dg1_2_diagnosisCodingMethod(String dg1_2_diagnosisCodingMethod) {
			this.dg1_2_diagnosisCodingMethod = dg1_2_diagnosisCodingMethod;
			return this;
			
		}
		public DG1Builder ce_dg1_3_diagnosisCode(CE_v2 ce_dg1_3_diagnosisCode) {
			this.ce_dg1_3_diagnosisCode = ce_dg1_3_diagnosisCode;
			return this;
		}
		public DG1Builder dg1_4_diagnosisDescription(String dg1_4_diagnosisDescription) {
			this.dg1_4_diagnosisDescription = dg1_4_diagnosisDescription;
			return this;
		}
		public DG1Builder ts_dg1_5_diagnosisDateTime(TS_v2 ts_dg1_5_diagnosisDateTime) {
			this.ts_dg1_5_diagnosisDateTime = ts_dg1_5_diagnosisDateTime;
			return this;
		}
		public DG1Builder ce_dg1_7_majorDiagnosticCategory(CE_v2 ce_dg1_7_majorDiagnosticCategory) {
			this.ce_dg1_7_majorDiagnosticCategory = ce_dg1_7_majorDiagnosticCategory;
			return this;
		}
		public DG1Builder ce_dg1_8_diagnosticRelatedGroup(CE_v2 ce_dg1_8_diagnosticRelatedGroup) {
			this.ce_dg1_8_diagnosticRelatedGroup = ce_dg1_8_diagnosticRelatedGroup;
			return this;
		}
		public DG1Builder dg1_9_drgApprovalIndicator(String dg1_9_drgApprovalIndicator) {
			this.dg1_9_drgApprovalIndicator = dg1_9_drgApprovalIndicator;
			return this;
		}
		public DG1Builder dg1_10_drgGrouperReviewCode(String dg1_10_drgGrouperReviewCode) {
			this.dg1_10_drgGrouperReviewCode = dg1_10_drgGrouperReviewCode;
			return this;
		}
		public DG1Builder ce_dg1_11_outlierType(CE_v2 ce_dg1_11_outlierType) {
			this.ce_dg1_11_outlierType = ce_dg1_11_outlierType;
			return this;
		}
		public DG1Builder dg1_12_outlierDays(String dg1_12_outlierDays) {
			this.dg1_12_outlierDays = dg1_12_outlierDays;
			return this;
		}
		public DG1Builder cp_dg1_13_outlierCost(CP_v2 cp_dg1_13_outlierCost) {
			this.cp_dg1_13_outlierCost = cp_dg1_13_outlierCost;
			return this;
		}
		public DG1Builder dg1_14_grouperVersionAndType(String dg1_14_grouperVersionAndType) {
			this.dg1_14_grouperVersionAndType = dg1_14_grouperVersionAndType;
			return this;
		}
		public DG1Builder dg1_15_diagnosisPriority(String dg1_15_diagnosisPriority) {
			this.dg1_15_diagnosisPriority = dg1_15_diagnosisPriority;
			return this;
		}
		public DG1Builder xcn_dg1_16_diagnosingClinician(XCN_v23[] xcn_dg1_16_diagnosingClinician) {
			this.xcn_dg1_16_diagnosingClinician = xcn_dg1_16_diagnosingClinician;
			return this;
		}
		public DG1Builder dg1_17_diagnosisClassification(String dg1_17_diagnosisClassification) {
			this.dg1_17_diagnosisClassification = dg1_17_diagnosisClassification;
			return this;
		}
		public DG1Builder dg1_18_confidentialIndicator(String dg1_18_confidentialIndicator) {
			this.dg1_18_confidentialIndicator = dg1_18_confidentialIndicator;
			return this;
		}
		public DG1Builder ts_dg1_19_attestationDateTime(TS_v2 ts_dg1_19_attestationDateTime) {
			this.ts_dg1_19_attestationDateTime = ts_dg1_19_attestationDateTime;
			return this;
		}
		public JsonDG1_v23 build() {
			return new JsonDG1_v23(this);
		}
	}
	public String getDg1_1_setId() {
		return dg1_1_setId;
	}
	public void setDg1_1_setId(String dg1_1_setId) {
		this.dg1_1_setId = dg1_1_setId;
	}
	public String getDg1_2_diagnosisCodingMethod() {
		return dg1_2_diagnosisCodingMethod;
	}
	public void setDg1_2_diagnosisCodingMethod(String dg1_2_diagnosisCodingMethod) {
		this.dg1_2_diagnosisCodingMethod = dg1_2_diagnosisCodingMethod;
	}
	public CE_v2 getCe_dg1_3_diagnosisCode() {
		return ce_dg1_3_diagnosisCode;
	}
	public void setCe_dg1_3_diagnosisCode(CE_v2 ce_dg1_3_diagnosisCode) {
		this.ce_dg1_3_diagnosisCode = ce_dg1_3_diagnosisCode;
	}
	public String getDg1_4_diagnosisDescription() {
		return dg1_4_diagnosisDescription;
	}
	public void setDg1_4_diagnosisDescription(String dg1_4_diagnosisDescription) {
		this.dg1_4_diagnosisDescription = dg1_4_diagnosisDescription;
	}
	public TS_v2 getTs_dg1_5_diagnosisDateTime() {
		return ts_dg1_5_diagnosisDateTime;
	}
	public void setTs_dg1_5_diagnosisDateTime(TS_v2 ts_dg1_5_diagnosisDateTime) {
		this.ts_dg1_5_diagnosisDateTime = ts_dg1_5_diagnosisDateTime;
	}
	public String getDg1_6_diagnosisType() {
		return dg1_6_diagnosisType;
	}
	public void setDg1_6_diagnosisType(String dg1_6_diagnosisType) {
		this.dg1_6_diagnosisType = dg1_6_diagnosisType;
	}
	public CE_v2 getCe_dg1_7_majorDiagnosticCategory() {
		return ce_dg1_7_majorDiagnosticCategory;
	}
	public void setCe_dg1_7_majorDiagnosticCategory(CE_v2 ce_dg1_7_majorDiagnosticCategory) {
		this.ce_dg1_7_majorDiagnosticCategory = ce_dg1_7_majorDiagnosticCategory;
	}
	public CE_v2 getCe_dg1_8_diagnosticRelatedGroup() {
		return ce_dg1_8_diagnosticRelatedGroup;
	}
	public void setCe_dg1_8_diagnosticRelatedGroup(CE_v2 ce_dg1_8_diagnosticRelatedGroup) {
		this.ce_dg1_8_diagnosticRelatedGroup = ce_dg1_8_diagnosticRelatedGroup;
	}
	public String getDg1_9_drgApprovalIndicator() {
		return dg1_9_drgApprovalIndicator;
	}
	public void setDg1_9_drgApprovalIndicator(String dg1_9_drgApprovalIndicator) {
		this.dg1_9_drgApprovalIndicator = dg1_9_drgApprovalIndicator;
	}
	public String getDg1_10_drgGrouperReviewCode() {
		return dg1_10_drgGrouperReviewCode;
	}
	public void setDg1_10_drgGrouperReviewCode(String dg1_10_drgGrouperReviewCode) {
		this.dg1_10_drgGrouperReviewCode = dg1_10_drgGrouperReviewCode;
	}
	public CE_v2 getCe_dg1_11_outlierType() {
		return ce_dg1_11_outlierType;
	}
	public void setCe_dg1_11_outlierType(CE_v2 ce_dg1_11_outlierType) {
		this.ce_dg1_11_outlierType = ce_dg1_11_outlierType;
	}
	public String getDg1_12_outlierDays() {
		return dg1_12_outlierDays;
	}
	public void setDg1_12_outlierDays(String dg1_12_outlierDays) {
		this.dg1_12_outlierDays = dg1_12_outlierDays;
	}
	public CP_v2 getCp_dg1_13_outlierCost() {
		return cp_dg1_13_outlierCost;
	}
	public void setCp_dg1_13_outlierCost(CP_v2 cp_dg1_13_outlierCost) {
		this.cp_dg1_13_outlierCost = cp_dg1_13_outlierCost;
	}
	public String getDg1_14_grouperVersionAndType() {
		return dg1_14_grouperVersionAndType;
	}
	public void setDg1_14_grouperVersionAndType(String dg1_14_grouperVersionAndType) {
		this.dg1_14_grouperVersionAndType = dg1_14_grouperVersionAndType;
	}
	public String getDg1_15_diagnosisPriority() {
		return dg1_15_diagnosisPriority;
	}
	public void setDg1_15_diagnosisPriority(String dg1_15_diagnosisPriority) {
		this.dg1_15_diagnosisPriority = dg1_15_diagnosisPriority;
	}
	public XCN_v23[] getXcn_dg1_16_diagnosingClinician() {
		return xcn_dg1_16_diagnosingClinician;
	}
	public void setXcn_dg1_16_diagnosingClinician(XCN_v23[] xcn_dg1_16_diagnosingClinician) {
		this.xcn_dg1_16_diagnosingClinician = xcn_dg1_16_diagnosingClinician;
	}
	public String getDg1_17_diagnosisClassification() {
		return dg1_17_diagnosisClassification;
	}
	public void setDg1_17_diagnosisClassification(String dg1_17_diagnosisClassification) {
		this.dg1_17_diagnosisClassification = dg1_17_diagnosisClassification;
	}
	public String getDg1_18_confidentialIndicator() {
		return dg1_18_confidentialIndicator;
	}
	public void setDg1_18_confidentialIndicator(String dg1_18_confidentialIndicator) {
		this.dg1_18_confidentialIndicator = dg1_18_confidentialIndicator;
	}
	public TS_v2 getTs_dg1_19_attestationDateTime() {
		return ts_dg1_19_attestationDateTime;
	}
	public void setTs_dg1_19_attestationDateTime(TS_v2 ts_dg1_19_attestationDateTime) {
		this.ts_dg1_19_attestationDateTime = ts_dg1_19_attestationDateTime;
	}
	@Override
	public String toString() {
		return "JsonDG1_v23 [dg1_1_setId=" + dg1_1_setId + ", dg1_2_diagnosisCodingMethod="
				+ dg1_2_diagnosisCodingMethod + ", ce_dg1_3_diagnosisCode=" + ce_dg1_3_diagnosisCode
				+ ", dg1_4_diagnosisDescription=" + dg1_4_diagnosisDescription + ", ts_dg1_5_diagnosisDateTime="
				+ ts_dg1_5_diagnosisDateTime + ", dg1_6_diagnosisType=" + dg1_6_diagnosisType
				+ ", ce_dg1_7_majorDiagnosticCategory=" + ce_dg1_7_majorDiagnosticCategory
				+ ", ce_dg1_8_diagnosticRelatedGroup=" + ce_dg1_8_diagnosticRelatedGroup
				+ ", dg1_9_drgApprovalIndicator=" + dg1_9_drgApprovalIndicator + ", dg1_10_drgGrouperReviewCode="
				+ dg1_10_drgGrouperReviewCode + ", ce_dg1_11_outlierType=" + ce_dg1_11_outlierType
				+ ", dg1_12_outlierDays=" + dg1_12_outlierDays + ", cp_dg1_13_outlierCost=" + cp_dg1_13_outlierCost
				+ ", dg1_14_grouperVersionAndType=" + dg1_14_grouperVersionAndType + ", dg1_15_diagnosisPriority="
				+ dg1_15_diagnosisPriority + ", xcn_dg1_16_diagnosingClinician="
				+ Arrays.toString(xcn_dg1_16_diagnosingClinician) + ", dg1_17_diagnosisClassification="
				+ dg1_17_diagnosisClassification + ", dg1_18_confidentialIndicator=" + dg1_18_confidentialIndicator
				+ ", ts_dg1_19_attestationDateTime=" + ts_dg1_19_attestationDateTime + "]";
	}
	
}
