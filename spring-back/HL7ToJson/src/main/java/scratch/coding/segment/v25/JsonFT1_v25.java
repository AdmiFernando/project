package scratch.coding.segment.v25;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CNE_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.XCN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonFT1_v25 {
	@JsonProperty("ft1_1_setID")
	private String ft1_1_setID;
	@JsonProperty("ft1_2_transactionID")
	private String ft1_2_transactionID;
	@JsonProperty("ft1_3_TransactionBatchID")
	private String ft1_3_TransactionBatchID;
	@JsonProperty("ft1_4_transactionDate")
	private DR_v2 ft1_4_transactionDate;
	@JsonProperty("ft1_5_transactionPostingDate")
	private TS_v2 ft1_5_transactionPostingDate;
	@JsonProperty("ft1_6_transactionType")
	private String ft1_6_transactionType;
	@JsonProperty("ft1_7_transactionCode")
	private CE_v2 ft1_7_transactionCode;
	@JsonProperty("ft1_8_transactionDescription")
	private String ft1_8_transactionDescription;
	@JsonProperty("ft1_9_transactionDescription")
	private String ft1_9_transactionDescription;
	@JsonProperty("ft1_10_transactionQuantity")
	private String ft1_10_transactionQuantity;
	@JsonProperty("ft1_11_transactionAmountExtended")
	private CP_v2 ft1_11_transactionAmountExtended;
	@JsonProperty("ft1_12_transactionAmountUnit")
	private CP_v2 ft1_12_transactionAmountUnit;
	@JsonProperty("ft1_13_departmentCode")
	private CE_v2 ft1_13_departmentCode;
	@JsonProperty("ft1_14_insurancePlanID")
	private CE_v2 ft1_14_insurancePlanID;
	@JsonProperty("ft1_15_insuranceAmount")
	private CP_v2 ft1_15_insuranceAmount;
	@JsonProperty("ft1_16_assignedPatientLocation")
	private PL_v25 ft1_16_assignedPatientLocation;
	@JsonProperty("ft1_17_feeSchedule")
	private String ft1_17_feeSchedule;
	@JsonProperty("ft1_18_patientType")
	private String ft1_18_patientType;
	@JsonProperty("ft1_19_diagnosisCode")
	private CE_v2[] ft1_19_diagnosisCode;
	@JsonProperty("ft1_20_performedByCode")
	private XCN_v25[] ft1_20_performedByCode;
	@JsonProperty("ft1_21_orderedByCode")
	private XCN_v25[] ft1_21_orderedByCode;
	@JsonProperty("ft1_22_unitCost")
	private CP_v2 ft1_22_unitCost;
	@JsonProperty("ft1_23_fillerOrderNumber")
	private EI_v2 ft1_23_fillerOrderNumber;
	@JsonProperty("ft1_24_enteredByCode")
	private XCN_v25[] ft1_24_enteredByCode;
	@JsonProperty("ft1_25_procedureCode")
	private CE_v2 ft1_25_procedureCode;
	@JsonProperty("ft1_26_procedureCodeModifier")
	private CE_v2[] ft1_26_procedureCodeModifier;
	@JsonProperty("ft1_27_advancedBeneficiaryNoticeCode")
	private CE_v2 ft1_27_advancedBeneficiaryNoticeCode;
	@JsonProperty("ft1_28_medicallyNecessaryDuplicateProcedureReason")
	private CWE_v25 ft1_28_medicallyNecessaryDuplicateProcedureReason;
	@JsonProperty("ft1_29_NDCCode")
	private CNE_v25 ft1_29_NDCCode;
	@JsonProperty("ft1_30_paymentReferenceID")
	private CX_v25 ft1_30_paymentReferenceID;
	@JsonProperty("ft1_31_transactionReferenceKey")
	private String[] ft1_31_transactionReferenceKey;
	public JsonFT1_v25() {
		super();
		this.ft1_1_setID = "";
		this.ft1_2_transactionID = "";
		this.ft1_3_TransactionBatchID = "";
		this.ft1_4_transactionDate = new DR_v2();
		this.ft1_5_transactionPostingDate = new TS_v2();
		this.ft1_6_transactionType = "";
		this.ft1_7_transactionCode = new CE_v2();
		this.ft1_8_transactionDescription = "";
		this.ft1_9_transactionDescription = "";
		this.ft1_10_transactionQuantity = "";
		this.ft1_11_transactionAmountExtended = new CP_v2();
		this.ft1_12_transactionAmountUnit = new CP_v2();
		this.ft1_13_departmentCode = new CE_v2();
		this.ft1_14_insurancePlanID = new CE_v2();
		this.ft1_15_insuranceAmount = new CP_v2();
		this.ft1_16_assignedPatientLocation = new PL_v25();
		this.ft1_17_feeSchedule = "";
		this.ft1_18_patientType = "";
		this.ft1_19_diagnosisCode = new CE_v2[] {};
		this.ft1_20_performedByCode = new XCN_v25[] {};
		this.ft1_21_orderedByCode = new XCN_v25[] {};
		this.ft1_22_unitCost = new CP_v2();
		this.ft1_23_fillerOrderNumber = new EI_v2();
		this.ft1_24_enteredByCode = new XCN_v25[] {};
		this.ft1_25_procedureCode = new CE_v2();
		this.ft1_26_procedureCodeModifier = new CE_v2[] {};
		this.ft1_27_advancedBeneficiaryNoticeCode = new CE_v2();
		this.ft1_28_medicallyNecessaryDuplicateProcedureReason = new CWE_v25();
		this.ft1_29_NDCCode = new CNE_v25();
		this.ft1_30_paymentReferenceID = new CX_v25();
		this.ft1_31_transactionReferenceKey = new String[] {};
	}
	private JsonFT1_v25(FT1Builder builder) {
		super();
		this.ft1_1_setID = builder.ft1_1_setID;
		this.ft1_2_transactionID = builder.ft1_2_transactionID;
		this.ft1_3_TransactionBatchID = builder.ft1_3_TransactionBatchID;
		this.ft1_4_transactionDate = builder.ft1_4_transactionDate;
		this.ft1_5_transactionPostingDate = builder.ft1_5_transactionPostingDate;
		this.ft1_6_transactionType = builder.ft1_6_transactionType;
		this.ft1_7_transactionCode = builder.ft1_7_transactionCode;
		this.ft1_8_transactionDescription = builder.ft1_8_transactionDescription;
		this.ft1_9_transactionDescription = builder.ft1_9_transactionDescription;
		this.ft1_10_transactionQuantity = builder.ft1_10_transactionQuantity;
		this.ft1_11_transactionAmountExtended = builder.ft1_11_transactionAmountExtended;
		this.ft1_12_transactionAmountUnit = builder.ft1_12_transactionAmountUnit;
		this.ft1_13_departmentCode = builder.ft1_13_departmentCode;
		this.ft1_14_insurancePlanID = builder.ft1_14_insurancePlanID;
		this.ft1_15_insuranceAmount = builder.ft1_15_insuranceAmount;
		this.ft1_16_assignedPatientLocation = builder.ft1_16_assignedPatientLocation;
		this.ft1_17_feeSchedule = builder.ft1_17_feeSchedule;
		this.ft1_18_patientType = builder.ft1_18_patientType;
		this.ft1_19_diagnosisCode = builder.ft1_19_diagnosisCode;
		this.ft1_20_performedByCode = builder.ft1_20_performedByCode;
		this.ft1_21_orderedByCode = builder.ft1_21_orderedByCode;
		this.ft1_22_unitCost = builder.ft1_22_unitCost;
		this.ft1_23_fillerOrderNumber = builder.ft1_23_fillerOrderNumber;
		this.ft1_24_enteredByCode = builder.ft1_24_enteredByCode;
		this.ft1_25_procedureCode = builder.ft1_25_procedureCode;
		this.ft1_26_procedureCodeModifier = builder.ft1_26_procedureCodeModifier;
		this.ft1_27_advancedBeneficiaryNoticeCode = builder.ft1_27_advancedBeneficiaryNoticeCode;
		this.ft1_28_medicallyNecessaryDuplicateProcedureReason = builder.ft1_28_medicallyNecessaryDuplicateProcedureReason;
		this.ft1_29_NDCCode = builder.ft1_29_NDCCode;
		this.ft1_30_paymentReferenceID = builder.ft1_30_paymentReferenceID;
		this.ft1_31_transactionReferenceKey = builder.ft1_31_transactionReferenceKey;
	}
	public static class FT1Builder {
		private String ft1_1_setID;
		private String ft1_2_transactionID;
		private String ft1_3_TransactionBatchID;
		private DR_v2 ft1_4_transactionDate;
		private TS_v2 ft1_5_transactionPostingDate;
		private String ft1_6_transactionType;
		private CE_v2 ft1_7_transactionCode;
		private String ft1_8_transactionDescription;
		private String ft1_9_transactionDescription;
		private String ft1_10_transactionQuantity;
		private CP_v2 ft1_11_transactionAmountExtended;
		private CP_v2 ft1_12_transactionAmountUnit;
		private CE_v2 ft1_13_departmentCode;
		private CE_v2 ft1_14_insurancePlanID;
		private CP_v2 ft1_15_insuranceAmount;
		private PL_v25 ft1_16_assignedPatientLocation;
		private String ft1_17_feeSchedule;
		private String ft1_18_patientType;
		private CE_v2[] ft1_19_diagnosisCode;
		private XCN_v25[] ft1_20_performedByCode;
		private XCN_v25[] ft1_21_orderedByCode;
		private CP_v2 ft1_22_unitCost;
		private EI_v2 ft1_23_fillerOrderNumber;
		private XCN_v25[] ft1_24_enteredByCode;
		private CE_v2 ft1_25_procedureCode;
		private CE_v2[] ft1_26_procedureCodeModifier;
		private CE_v2 ft1_27_advancedBeneficiaryNoticeCode;
		private CWE_v25 ft1_28_medicallyNecessaryDuplicateProcedureReason;
		private CNE_v25 ft1_29_NDCCode;
		private CX_v25 ft1_30_paymentReferenceID;
		private String[] ft1_31_transactionReferenceKey;
		public FT1Builder() {
			super();
			this.ft1_1_setID = "";
			this.ft1_2_transactionID = "";
			this.ft1_3_TransactionBatchID = "";
			this.ft1_4_transactionDate = new DR_v2();
			this.ft1_5_transactionPostingDate = new TS_v2();
			this.ft1_6_transactionType = "";
			this.ft1_7_transactionCode = new CE_v2();
			this.ft1_8_transactionDescription = "";
			this.ft1_9_transactionDescription = "";
			this.ft1_10_transactionQuantity = "";
			this.ft1_11_transactionAmountExtended = new CP_v2();
			this.ft1_12_transactionAmountUnit = new CP_v2();
			this.ft1_13_departmentCode = new CE_v2();
			this.ft1_14_insurancePlanID = new CE_v2();
			this.ft1_15_insuranceAmount = new CP_v2();
			this.ft1_16_assignedPatientLocation = new PL_v25();
			this.ft1_17_feeSchedule = "";
			this.ft1_18_patientType = "";
			this.ft1_19_diagnosisCode = new CE_v2[] {};
			this.ft1_20_performedByCode = new XCN_v25[] {};
			this.ft1_21_orderedByCode = new XCN_v25[] {};
			this.ft1_22_unitCost = new CP_v2();
			this.ft1_23_fillerOrderNumber = new EI_v2();
			this.ft1_24_enteredByCode = new XCN_v25[] {};
			this.ft1_25_procedureCode = new CE_v2();
			this.ft1_26_procedureCodeModifier = new CE_v2[] {};
			this.ft1_27_advancedBeneficiaryNoticeCode = new CE_v2();
			this.ft1_28_medicallyNecessaryDuplicateProcedureReason = new CWE_v25();
			this.ft1_29_NDCCode = new CNE_v25();
			this.ft1_30_paymentReferenceID = new CX_v25();
			this.ft1_31_transactionReferenceKey = new String[] {};
		}
		public FT1Builder sft1_1_setID(String ft1_1_setID) {
			this.ft1_1_setID = ft1_1_setID;
			return this;
		}
		public FT1Builder ft1_2_transactionID(String ft1_2_transactionID) {
			this.ft1_2_transactionID = ft1_2_transactionID;
			return this;
		}
		public FT1Builder ft1_3_TransactionBatchID(String ft1_3_TransactionBatchID) {
			this.ft1_3_TransactionBatchID = ft1_3_TransactionBatchID;
			return this;
		}
		public FT1Builder ft1_4_transactionDate(DR_v2 ft1_4_transactionDate) {
			this.ft1_4_transactionDate = ft1_4_transactionDate;
			return this;
		}
		public FT1Builder ft1_5_transactionPostingDate(TS_v2 ft1_5_transactionPostingDate) {
			this.ft1_5_transactionPostingDate = ft1_5_transactionPostingDate;
			return this;
		}
		public FT1Builder ft1_6_transactionType(String ft1_6_transactionType) {
			this.ft1_6_transactionType = ft1_6_transactionType;
			return this;
		}
		public FT1Builder ft1_7_transactionCode(CE_v2 ft1_7_transactionCode) {
			this.ft1_7_transactionCode = ft1_7_transactionCode;
			return this;
		}
		public FT1Builder ft1_8_transactionDescription(String ft1_8_transactionDescription) {
			this.ft1_8_transactionDescription = ft1_8_transactionDescription;
			return this;
		}
		public FT1Builder ft1_9_transactionDescription(String ft1_9_transactionDescription) {
			this.ft1_9_transactionDescription = ft1_9_transactionDescription;
			return this;
		}
		public FT1Builder ft1_10_transactionQuantity(String ft1_10_transactionQuantity) {
			this.ft1_10_transactionQuantity = ft1_10_transactionQuantity;
			return this;
		}
		public FT1Builder ft1_11_transactionAmountExtended(CP_v2 ft1_11_transactionAmountExtended) {
			this.ft1_11_transactionAmountExtended = ft1_11_transactionAmountExtended;
			return this;
		}
		public FT1Builder ft1_12_transactionAmountUnit(CP_v2 ft1_12_transactionAmountUnit) {
			this.ft1_12_transactionAmountUnit = ft1_12_transactionAmountUnit;
			return this;
		}
		public FT1Builder ft1_13_departmentCode(CE_v2 ft1_13_departmentCode) {
			this.ft1_13_departmentCode = ft1_13_departmentCode;
			return this;
		}
		public FT1Builder ft1_14_insurancePlanID(CE_v2 ft1_14_insurancePlanID) {
			this.ft1_14_insurancePlanID = ft1_14_insurancePlanID;
			return this;
		}
		public FT1Builder ft1_15_insuranceAmount(CP_v2 ft1_15_insuranceAmount) {
			this.ft1_15_insuranceAmount = ft1_15_insuranceAmount;
			return this;
		}
		public FT1Builder ft1_16_assignedPatientLocation(PL_v25 ft1_16_assignedPatientLocation) {
			this.ft1_16_assignedPatientLocation = ft1_16_assignedPatientLocation;
			return this;
		}
		public FT1Builder ft1_17_feeSchedule(String ft1_17_feeSchedule) {
			this.ft1_17_feeSchedule = ft1_17_feeSchedule;
			return this;
		}
		public FT1Builder ft1_18_patientType(String ft1_18_patientType) {
			this.ft1_18_patientType = ft1_18_patientType;
			return this;
		}
		public FT1Builder ft1_19_diagnosisCode(CE_v2[] ft1_19_diagnosisCode) {
			this.ft1_19_diagnosisCode = ft1_19_diagnosisCode;
			return this;
		}
		public FT1Builder ft1_20_performedByCode(XCN_v25[] ft1_20_performedByCode) {
			this.ft1_20_performedByCode = ft1_20_performedByCode;
			return this;
		}
		public FT1Builder ft1_21_orderedByCode(XCN_v25[] ft1_21_orderedByCode) {
			this.ft1_21_orderedByCode = ft1_21_orderedByCode;
			return this;
		}
		public FT1Builder ft1_22_unitCost(CP_v2 ft1_22_unitCost) {
			this.ft1_22_unitCost = ft1_22_unitCost;
			return this;
		}
		public FT1Builder ft1_23_fillerOrderNumber(EI_v2 ft1_23_fillerOrderNumber) {
			this.ft1_23_fillerOrderNumber = ft1_23_fillerOrderNumber;
			return this;
		}
		public FT1Builder ft1_24_enteredByCode(XCN_v25[] ft1_24_enteredByCode) {
			this.ft1_24_enteredByCode = ft1_24_enteredByCode;
			return this;
		}
		public FT1Builder ft1_25_procedureCode(CE_v2 ft1_25_procedureCode) {
			this.ft1_25_procedureCode = ft1_25_procedureCode;
			return this;
		}
		public FT1Builder ft1_26_procedureCodeModifier(CE_v2[] ft1_26_procedureCodeModifier) {
			this.ft1_26_procedureCodeModifier = ft1_26_procedureCodeModifier;
			return this;
		}
		public FT1Builder ft1_27_advancedBeneficiaryNoticeCode(CE_v2 ft1_27_advancedBeneficiaryNoticeCode) {
			this.ft1_27_advancedBeneficiaryNoticeCode = ft1_27_advancedBeneficiaryNoticeCode;
			return this;
		}
		public FT1Builder ft1_28_medicallyNecessaryDuplicateProcedureReason(
				CWE_v25 ft1_28_medicallyNecessaryDuplicateProcedureReason) {
			this.ft1_28_medicallyNecessaryDuplicateProcedureReason = ft1_28_medicallyNecessaryDuplicateProcedureReason;
			return this;
		}
		public FT1Builder ft1_29_NDCCode(CNE_v25 ft1_29_NDCCode) {
			this.ft1_29_NDCCode = ft1_29_NDCCode;
			return this;
		}
		public FT1Builder ft1_30_paymentReferenceID(CX_v25 ft1_30_paymentReferenceID) {
			this.ft1_30_paymentReferenceID = ft1_30_paymentReferenceID;
			return this;
		}
		public FT1Builder ft1_31_transactionReferenceKey(String[] ft1_31_transactionReferenceKey) {
			this.ft1_31_transactionReferenceKey = ft1_31_transactionReferenceKey;
			return this;
		}
		public JsonFT1_v25 build() {
			return new JsonFT1_v25(this);
		}
	}
	public String getFt1_1_setID() {
		return ft1_1_setID;
	}
	public String getFt1_2_transactionID() {
		return ft1_2_transactionID;
	}
	public String getFt1_3_TransactionBatchID() {
		return ft1_3_TransactionBatchID;
	}
	public DR_v2 getFt1_4_transactionDate() {
		return ft1_4_transactionDate;
	}
	public TS_v2 getFt1_5_transactionPostingDate() {
		return ft1_5_transactionPostingDate;
	}
	public String getFt1_6_transactionType() {
		return ft1_6_transactionType;
	}
	public CE_v2 getFt1_7_transactionCode() {
		return ft1_7_transactionCode;
	}
	public String getFt1_8_transactionDescription() {
		return ft1_8_transactionDescription;
	}
	public String getFt1_9_transactionDescription() {
		return ft1_9_transactionDescription;
	}
	public String getFt1_10_transactionQuantity() {
		return ft1_10_transactionQuantity;
	}
	public CP_v2 getFt1_11_transactionAmountExtended() {
		return ft1_11_transactionAmountExtended;
	}
	public CP_v2 getFt1_12_transactionAmountUnit() {
		return ft1_12_transactionAmountUnit;
	}
	public CE_v2 getFt1_13_departmentCode() {
		return ft1_13_departmentCode;
	}
	public CE_v2 getFt1_14_insurancePlanID() {
		return ft1_14_insurancePlanID;
	}
	public CP_v2 getFt1_15_insuranceAmount() {
		return ft1_15_insuranceAmount;
	}
	public PL_v25 getFt1_16_assignedPatientLocation() {
		return ft1_16_assignedPatientLocation;
	}
	public String getFt1_17_feeSchedule() {
		return ft1_17_feeSchedule;
	}
	public String getFt1_18_patientType() {
		return ft1_18_patientType;
	}
	public CE_v2[] getFt1_19_diagnosisCode() {
		return ft1_19_diagnosisCode;
	}
	public XCN_v25[] getFt1_20_performedByCode() {
		return ft1_20_performedByCode;
	}
	public XCN_v25[] getFt1_21_orderedByCode() {
		return ft1_21_orderedByCode;
	}
	public CP_v2 getFt1_22_unitCost() {
		return ft1_22_unitCost;
	}
	public EI_v2 getFt1_23_fillerOrderNumber() {
		return ft1_23_fillerOrderNumber;
	}
	public XCN_v25[] getFt1_24_enteredByCode() {
		return ft1_24_enteredByCode;
	}
	public CE_v2 getFt1_25_procedureCode() {
		return ft1_25_procedureCode;
	}
	public CE_v2[] getFt1_26_procedureCodeModifier() {
		return ft1_26_procedureCodeModifier;
	}
	public CE_v2 getFt1_27_advancedBeneficiaryNoticeCode() {
		return ft1_27_advancedBeneficiaryNoticeCode;
	}
	public CWE_v25 getFt1_28_medicallyNecessaryDuplicateProcedureReason() {
		return ft1_28_medicallyNecessaryDuplicateProcedureReason;
	}
	public CNE_v25 getFt1_29_NDCCode() {
		return ft1_29_NDCCode;
	}
	public CX_v25 getFt1_30_paymentReferenceID() {
		return ft1_30_paymentReferenceID;
	}
	public String[] getFt1_31_transactionReferenceKey() {
		return ft1_31_transactionReferenceKey;
	}
	@Override
	public String toString() {
		return "JsonFT1_v25 [ft1_1_setID=" + ft1_1_setID + ", ft1_2_transactionID=" + ft1_2_transactionID
				+ ", ft1_3_TransactionBatchID=" + ft1_3_TransactionBatchID + ", ft1_4_transactionDate="
				+ ft1_4_transactionDate + ", ft1_5_transactionPostingDate=" + ft1_5_transactionPostingDate
				+ ", ft1_6_transactionType=" + ft1_6_transactionType + ", ft1_7_transactionCode="
				+ ft1_7_transactionCode + ", ft1_8_transactionDescription=" + ft1_8_transactionDescription
				+ ", ft1_9_transactionDescription=" + ft1_9_transactionDescription + ", ft1_10_transactionQuantity="
				+ ft1_10_transactionQuantity + ", ft1_11_transactionAmountExtended=" + ft1_11_transactionAmountExtended
				+ ", ft1_12_transactionAmountUnit=" + ft1_12_transactionAmountUnit + ", ft1_13_departmentCode="
				+ ft1_13_departmentCode + ", ft1_14_insurancePlanID=" + ft1_14_insurancePlanID
				+ ", ft1_15_insuranceAmount=" + ft1_15_insuranceAmount + ", ft1_16_assignedPatientLocation="
				+ ft1_16_assignedPatientLocation + ", ft1_17_feeSchedule=" + ft1_17_feeSchedule
				+ ", ft1_18_patientType=" + ft1_18_patientType + ", ft1_19_diagnosisCode="
				+ Arrays.toString(ft1_19_diagnosisCode) + ", ft1_20_performedByCode="
				+ Arrays.toString(ft1_20_performedByCode) + ", ft1_21_orderedByCode="
				+ Arrays.toString(ft1_21_orderedByCode) + ", ft1_22_unitCost=" + ft1_22_unitCost
				+ ", ft1_23_fillerOrderNumber=" + ft1_23_fillerOrderNumber + ", ft1_24_enteredByCode="
				+ Arrays.toString(ft1_24_enteredByCode) + ", ft1_25_procedureCode=" + ft1_25_procedureCode
				+ ", ft1_26_procedureCodeModifier=" + Arrays.toString(ft1_26_procedureCodeModifier)
				+ ", ft1_27_advancedBeneficiaryNoticeCode=" + ft1_27_advancedBeneficiaryNoticeCode
				+ ", ft1_28_medicallyNecessaryDuplicateProcedureReason="
				+ ft1_28_medicallyNecessaryDuplicateProcedureReason + ", ft1_29_NDCCode=" + ft1_29_NDCCode
				+ ", ft1_30_paymentReferenceID=" + ft1_30_paymentReferenceID + ", ft1_31_transactionReferenceKey="
				+ Arrays.toString(ft1_31_transactionReferenceKey) + "]";
	}
	
}
