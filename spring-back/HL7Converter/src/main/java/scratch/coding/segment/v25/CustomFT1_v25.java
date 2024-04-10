package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.FT1;
import scratch.coding.models.CE_v2;
import scratch.coding.models.CP_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.MO_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CNE_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.CX_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.XCN_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomFT1_v25 {
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
	
	private FT1 ft1;
	
	private CustomFT1_v25(FT1 ft1, CustomNTE_v25[] nte) {
		super();
		this.ft1 =ft1;
//		setNte(nte);
	}
	private CustomFT1_v25(FT1 ft1) {
		super();
		this.ft1 = ft1;
	}
	
	public CustomFT1_v25() {
		super();
	}
	public static CustomFT1_v25 createDSCWithDSC(FT1 ft1) throws HL7Exception, IOException {
		return new CustomFT1_v25(ft1);
	}

	public static CustomFT1_v25 createDSCWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		FT1 ft1 = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getFT1();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		return new CustomFT1_v25(ft1);
	}
	/**
	 * @return the ft1_1_setID
	 */
	
	@JsonProperty("ft1_1_setID")
	public String getFt1_1_setID() {
		return this.ft1.getFt11_SetIDFT1().getValue()==null?"":this.ft1.getFt11_SetIDFT1().getValue();
	}
	/**
	 * @param ft1_1_setID the ft1_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_1_setID")
	public void setFt1_1_setID(String ft1_1_setID) throws DataTypeException {
		this.ft1.getFt11_SetIDFT1().setValue(ft1_1_setID);
		this.ft1_1_setID = ft1_1_setID;
	}
	/**
	 * @return the ft1_2_transactionID
	 */
	
	@JsonProperty("ft1_2_transactionID")
	public String getFt1_2_transactionID() {
		return this.ft1.getFt12_TransactionID().getValue()==null?"":this.ft1.getFt12_TransactionID().getValue();
	}
	/**
	 * @param ft1_2_transactionID the ft1_2_transactionID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_2_transactionID")
	public void setFt1_2_transactionID(String ft1_2_transactionID) throws DataTypeException {
		this.ft1.getFt12_TransactionID().setValue(ft1_2_transactionID);
		this.ft1_2_transactionID = ft1_2_transactionID;
	}
	/**
	 * @return the ft1_3_TransactionBatchID
	 */
	
	@JsonProperty("ft1_3_TransactionBatchID")
	public String getFt1_3_TransactionBatchID() {
		return this.ft1.getFt13_TransactionBatchID().getValue()==null?"":this.ft1.getFt13_TransactionBatchID().getValue();
	}
	/**
	 * @param ft1_3_TransactionBatchID the ft1_3_TransactionBatchID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_3_TransactionBatchID")
	public void setFt1_3_TransactionBatchID(String ft1_3_TransactionBatchID) throws DataTypeException {
		this.ft1.getFt13_TransactionBatchID().setValue(ft1_3_TransactionBatchID);
		this.ft1_3_TransactionBatchID = ft1_3_TransactionBatchID;
	}
	/**
	 * @return the ft1_4_transactionDate
	 */
	
	@JsonProperty("ft1_4_transactionDate")
	public DR_v2 getFt1_4_transactionDate() {
		return new DR_v2(
				new TS_v2(
						this.ft1.getFt14_TransactionDate().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt14_TransactionDate().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
						this.ft1.getFt14_TransactionDate().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt14_TransactionDate().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
				new TS_v2(
						this.ft1.getFt14_TransactionDate().getDr2_RangeEndDateTime().getTime().getValue()==null?"":this.ft1.getFt14_TransactionDate().getDr2_RangeEndDateTime().getTime().getValue(),
						this.ft1.getFt14_TransactionDate().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt14_TransactionDate().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()));
	}
	
	/**
	 * @param ft1_4_transactionDate the ft1_4_transactionDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_4_transactionDate")
	public void setFt1_4_transactionDate(DR_v2 ft1_4_transactionDate) throws DataTypeException {
		this.ft1.getFt14_TransactionDate().getDr1_RangeStartDateTime().getTs1_Time().setValue(ft1_4_transactionDate.getTs_dr_1_rangeStartDateTime().getTs_1_time()); 
		this.ft1.getFt14_TransactionDate().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(ft1_4_transactionDate.getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
		this.ft1.getFt14_TransactionDate().getDr2_RangeEndDateTime().getTime().setValue(ft1_4_transactionDate.getTs_dr_2_rangeEndDateTime().getTs_1_time());
		this.ft1.getFt14_TransactionDate().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(ft1_4_transactionDate.getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
		this.ft1_4_transactionDate = ft1_4_transactionDate;
	}
	/**
	 * @return the ft1_5_transactionPostingDate
	 */
	
	@JsonProperty("ft1_5_transactionPostingDate")
	public TS_v2 getFt1_5_transactionPostingDate() {
		return new TS_v2(
				this.ft1.getFt15_TransactionPostingDate().getTs1_Time().getValue()==null?"":this.ft1.getFt15_TransactionPostingDate().getTs1_Time().getValue(),
				this.ft1.getFt15_TransactionPostingDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt15_TransactionPostingDate().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param ft1_5_transactionPostingDate the ft1_5_transactionPostingDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_5_transactionPostingDate")
	public void setFt1_5_transactionPostingDate(TS_v2 ft1_5_transactionPostingDate) throws DataTypeException {
		this.ft1.getFt15_TransactionPostingDate().getTs1_Time().setValue(ft1_5_transactionPostingDate.getTs_1_time());
		this.ft1.getFt15_TransactionPostingDate().getTs2_DegreeOfPrecision().setValue(ft1_5_transactionPostingDate.getTs_2_degreeOfPrecision());
		this.ft1_5_transactionPostingDate = ft1_5_transactionPostingDate;
	}
	/**
	 * @return the ft1_6_transactionType
	 */
	
	@JsonProperty("ft1_6_transactionType")
	public String getFt1_6_transactionType() {
		this.ft1.getFt16_TransactionType().getValue();
		return this.ft1.getFt16_TransactionType().getValue();
	}
	/**
	 * @param ft1_6_transactionType the ft1_6_transactionType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_6_transactionType")
	public void setFt1_6_transactionType(String ft1_6_transactionType) throws DataTypeException {
		this.ft1.getFt16_TransactionType().setValue(ft1_6_transactionType);
		this.ft1_6_transactionType = ft1_6_transactionType;
	}
	/**
	 * @return the ft1_7_transactionCode
	 */
	
	@JsonProperty("ft1_7_transactionCode")
	public CE_v2 getFt1_7_transactionCode() {
		return new CE_v2(
				this.ft1.getFt17_TransactionCode().getCe1_Identifier().getValue()==null?"":this.ft1.getFt17_TransactionCode().getCe1_Identifier().getValue(),
				this.ft1.getFt17_TransactionCode().getCe2_Text().getValue()==null?"":this.ft1.getFt17_TransactionCode().getCe2_Text().getValue(),
				this.ft1.getFt17_TransactionCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt17_TransactionCode().getCe3_NameOfCodingSystem().getValue(),
				this.ft1.getFt17_TransactionCode().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt17_TransactionCode().getCe4_AlternateIdentifier().getValue(),
				this.ft1.getFt17_TransactionCode().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt17_TransactionCode().getCe5_AlternateText().getValue(),
				this.ft1.getFt17_TransactionCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt17_TransactionCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param ft1_7_transactionCode the ft1_7_transactionCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_7_transactionCode")
	public void setFt1_7_transactionCode(CE_v2 ft1_7_transactionCode) throws DataTypeException {
		this.ft1.getFt17_TransactionCode().getCe1_Identifier().setValue(ft1_7_transactionCode.getCe_1_identifier());
		this.ft1.getFt17_TransactionCode().getCe2_Text().setValue(ft1_7_transactionCode.getCe_2_text());
		this.ft1.getFt17_TransactionCode().getCe3_NameOfCodingSystem().setValue(ft1_7_transactionCode.getCe_3_nameOfCodingSystem());
		this.ft1.getFt17_TransactionCode().getCe4_AlternateIdentifier().setValue(ft1_7_transactionCode.getCe_4_alternateIdentifier());
		this.ft1.getFt17_TransactionCode().getCe5_AlternateText().setValue(ft1_7_transactionCode.getCe_5_alternateText());
		this.ft1.getFt17_TransactionCode().getCe6_NameOfAlternateCodingSystem().setValue(ft1_7_transactionCode.getCe_6_nameOfAlternateCodingSystem());
		this.ft1_7_transactionCode = ft1_7_transactionCode;
	}
	/**
	 * @return the ft1_8_transactionDescription
	 */
	
	@JsonProperty("ft1_8_transactionDescription")
	public String getFt1_8_transactionDescription() {
		return this.ft1.getFt18_TransactionDescription().getValue()==null?"":this.ft1.getFt18_TransactionDescription().getValue();
	}
	/**
	 * @param ft1_8_transactionDescription the ft1_8_transactionDescription to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_8_transactionDescription")
	public void setFt1_8_transactionDescription(String ft1_8_transactionDescription) throws DataTypeException {
		this.ft1.getFt18_TransactionDescription().setValue(ft1_8_transactionDescription);
		this.ft1_8_transactionDescription = ft1_8_transactionDescription;
	}
	/**
	 * @return the ft1_9_transactionDescription
	 */
	
	@JsonProperty("ft1_9_transactionDescription")
	public String getFt1_9_transactionDescription() {
		return this.ft1.getFt19_TransactionDescriptionAlt().getValue()==null?"":this.ft1.getFt19_TransactionDescriptionAlt().getValue();
	}
	/**
	 * @param ft1_9_transactionDescription the ft1_9_transactionDescription to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_9_transactionDescription")
	public void setFt1_9_transactionDescription(String ft1_9_transactionDescription) throws DataTypeException {
		this.ft1.getFt19_TransactionDescriptionAlt().setValue(ft1_9_transactionDescription);
		this.ft1_9_transactionDescription = ft1_9_transactionDescription;
	}
	/**
	 * @return the ft1_10_transactionQuantity
	 */
	
	@JsonProperty("ft1_10_transactionQuantity")
	public String getFt1_10_transactionQuantity() {
		return this.ft1.getFt110_TransactionQuantity().getValue()==null?"":this.ft1.getFt110_TransactionQuantity().getValue();
	}
	/**
	 * @param ft1_10_transactionQuantity the ft1_10_transactionQuantity to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_10_transactionQuantity")
	public void setFt1_10_transactionQuantity(String ft1_10_transactionQuantity) throws DataTypeException {
		this.ft1.getFt110_TransactionQuantity().setValue(ft1_10_transactionQuantity);
		this.ft1_10_transactionQuantity = ft1_10_transactionQuantity;
	}
	/**
	 * @return the ft1_11_transactionAmountExtended
	 */
	
	@JsonProperty("ft1_11_transactionAmountExtended")
	public CP_v2 getFt1_11_transactionAmountExtended() {
		return new CP_v2(
				new MO_v2(
						this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo1_Quantity().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo1_Quantity().getValue(), 
						this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo2_Denomination().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo2_Denomination().getValue()),
				this.ft1.getFt111_TransactionAmountExtended().getCp2_PriceType().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp2_PriceType().getValue(),
				this.ft1.getFt111_TransactionAmountExtended().getCp3_FromValue().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp3_FromValue().getValue(),
				this.ft1.getFt111_TransactionAmountExtended().getCp4_ToValue().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp4_ToValue().getValue(), 
				new CE_v2(
						this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe1_Identifier().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe1_Identifier().getValue(),
						this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe2_Text().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe2_Text().getValue(),
						this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue(),
						this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue(),
						this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe5_AlternateText().getValue(),
						this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()), 
				this.ft1.getFt111_TransactionAmountExtended().getCp6_RangeType().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp6_RangeType().getValue());
	}
	/**
	 * @param ft1_11_transactionAmountExtended the ft1_11_transactionAmountExtended to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_11_transactionAmountExtended")
	public void setFt1_11_transactionAmountExtended(CP_v2 ft1_11_transactionAmountExtended) throws DataTypeException {
		this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo1_Quantity().setValue(ft1_11_transactionAmountExtended.getCp_1_price().getMo_1_quantity()); 
		this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo2_Denomination().setValue(ft1_11_transactionAmountExtended.getCp_1_price().getMo_2_denomination());
		this.ft1.getFt111_TransactionAmountExtended().getCp2_PriceType().setValue(ft1_11_transactionAmountExtended.getCp_2_priceType());
		this.ft1.getFt111_TransactionAmountExtended().getCp3_FromValue().setValue(ft1_11_transactionAmountExtended.getCp_3_fromValue());
		this.ft1.getFt111_TransactionAmountExtended().getCp4_ToValue().setValue(ft1_11_transactionAmountExtended.getCp_4_toValue()); 
		this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe1_Identifier().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_1_identifier());
		this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe2_Text().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_2_text());
		this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe3_NameOfCodingSystem().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_3_nameOfCodingSystem());
		this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe4_AlternateIdentifier().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_4_alternateIdentifier());
		this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe5_AlternateText().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_5_alternateText());
		this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_6_nameOfAlternateCodingSystem()); 
		this.ft1.getFt111_TransactionAmountExtended().getCp6_RangeType().setValue(ft1_11_transactionAmountExtended.getCp_6_rangeType());
		this.ft1_11_transactionAmountExtended = ft1_11_transactionAmountExtended;
	}
	/**
	 * @return the ft1_12_transactionAmountUnit
	 *	@JsonProperty("ft1_12_transactionAmountUnit")
	 */
	
	public CP_v2 getFt1_12_transactionAmountUnit() {
		return new CP_v2(
				new MO_v2(
						this.ft1.getFt112_TransactionAmountUnit().getCp1_Price().getMo1_Quantity().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo1_Quantity().getValue(), 
						this.ft1.getFt112_TransactionAmountUnit().getCp1_Price().getMo2_Denomination().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp1_Price().getMo2_Denomination().getValue()),
				this.ft1.getFt112_TransactionAmountUnit().getCp2_PriceType().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp2_PriceType().getValue(),
				this.ft1.getFt112_TransactionAmountUnit().getCp3_FromValue().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp3_FromValue().getValue(),
				this.ft1.getFt112_TransactionAmountUnit().getCp4_ToValue().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp4_ToValue().getValue(), 
				new CE_v2(
						this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe1_Identifier().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe1_Identifier().getValue(),
						this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe2_Text().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe2_Text().getValue(),
						this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue(),
						this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue(),
						this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe5_AlternateText().getValue(),
						this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()), 
				this.ft1.getFt112_TransactionAmountUnit().getCp6_RangeType().getValue()==null?"":this.ft1.getFt111_TransactionAmountExtended().getCp6_RangeType().getValue());
	}
	/**
	 * @param ft1_12_transactionAmountUnit the ft1_12_transactionAmountUnit to set
	 * @JsonProperty("ft1_12_transactionAmountUnit")
	 * @throws DataTypeException 
	 */
	public void setFt1_12_transactionAmountUnit(CP_v2 ft1_12_transactionAmountUnit) throws DataTypeException {
		this.ft1.getFt112_TransactionAmountUnit().getCp1_Price().getMo1_Quantity().setValue(ft1_11_transactionAmountExtended.getCp_1_price().getMo_1_quantity()); 
		this.ft1.getFt112_TransactionAmountUnit().getCp1_Price().getMo2_Denomination().setValue(ft1_11_transactionAmountExtended.getCp_1_price().getMo_2_denomination());
		this.ft1.getFt112_TransactionAmountUnit().getCp2_PriceType().setValue(ft1_11_transactionAmountExtended.getCp_2_priceType());
		this.ft1.getFt112_TransactionAmountUnit().getCp3_FromValue().setValue(ft1_11_transactionAmountExtended.getCp_3_fromValue());
		this.ft1.getFt112_TransactionAmountUnit().getCp4_ToValue().setValue(ft1_11_transactionAmountExtended.getCp_4_toValue()); 
		this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe1_Identifier().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_1_identifier());
		this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe2_Text().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_2_text());
		this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe3_NameOfCodingSystem().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_3_nameOfCodingSystem());
		this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe4_AlternateIdentifier().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_4_alternateIdentifier());
		this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe5_AlternateText().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_5_alternateText());
		this.ft1.getFt112_TransactionAmountUnit().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_6_nameOfAlternateCodingSystem()); 
		this.ft1.getFt112_TransactionAmountUnit().getCp6_RangeType().setValue(ft1_11_transactionAmountExtended.getCp_6_rangeType());
		this.ft1_12_transactionAmountUnit = ft1_12_transactionAmountUnit;
	}
	/**
	 * @return the ft1_13_departmentCode
	 */
	
	@JsonProperty("ft1_13_departmentCode")
	public CE_v2 getFt1_13_departmentCode() {
		return new CE_v2(
				this.ft1.getFt113_DepartmentCode().getCe1_Identifier().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe1_Identifier().getValue(),
				this.ft1.getFt113_DepartmentCode().getCe2_Text().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe2_Text().getValue(),
				this.ft1.getFt113_DepartmentCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe3_NameOfCodingSystem().getValue(),
				this.ft1.getFt113_DepartmentCode().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe4_AlternateIdentifier().getValue(),
				this.ft1.getFt113_DepartmentCode().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe5_AlternateText().getValue(),
				this.ft1.getFt113_DepartmentCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param ft1_13_departmentCode the ft1_13_departmentCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_13_departmentCode")
	public void setFt1_13_departmentCode(CE_v2 ft1_13_departmentCode) throws DataTypeException {
		this.ft1.getFt113_DepartmentCode().getCe1_Identifier().setValue(ft1_13_departmentCode.getCe_1_identifier());
		this.ft1.getFt113_DepartmentCode().getCe2_Text().setValue(ft1_13_departmentCode.getCe_2_text());
		this.ft1.getFt113_DepartmentCode().getCe3_NameOfCodingSystem().setValue(ft1_13_departmentCode.getCe_3_nameOfCodingSystem());
		this.ft1.getFt113_DepartmentCode().getCe4_AlternateIdentifier().setValue(ft1_13_departmentCode.getCe_4_alternateIdentifier());
		this.ft1.getFt113_DepartmentCode().getCe5_AlternateText().setValue(ft1_13_departmentCode.getCe_5_alternateText());
		this.ft1.getFt113_DepartmentCode().getCe6_NameOfAlternateCodingSystem().setValue(ft1_13_departmentCode.getCe_6_nameOfAlternateCodingSystem());
		this.ft1_13_departmentCode = ft1_13_departmentCode;
	}
	/**
	 * @return the ft1_14_insurancePlanID
	 */
	
	@JsonProperty("ft1_14_insurancePlanID")
	public CE_v2 getFt1_14_insurancePlanID() {
		return new CE_v2(
				this.ft1.getFt114_InsurancePlanID().getCe1_Identifier().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe1_Identifier().getValue(),
				this.ft1.getFt114_InsurancePlanID().getCe2_Text().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe2_Text().getValue(),
				this.ft1.getFt114_InsurancePlanID().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe3_NameOfCodingSystem().getValue(),
				this.ft1.getFt114_InsurancePlanID().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe4_AlternateIdentifier().getValue(),
				this.ft1.getFt114_InsurancePlanID().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe5_AlternateText().getValue(),
				this.ft1.getFt114_InsurancePlanID().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt113_DepartmentCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param ft1_14_insurancePlanID the ft1_14_insurancePlanID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_14_insurancePlanID")
	public void setFt1_14_insurancePlanID(CE_v2 ft1_14_insurancePlanID) throws DataTypeException {
		this.ft1.getFt114_InsurancePlanID().getCe1_Identifier().setValue(ft1_14_insurancePlanID.getCe_1_identifier());
		this.ft1.getFt114_InsurancePlanID().getCe2_Text().setValue(ft1_14_insurancePlanID.getCe_2_text());
		this.ft1.getFt114_InsurancePlanID().getCe3_NameOfCodingSystem().setValue(ft1_14_insurancePlanID.getCe_3_nameOfCodingSystem());
		this.ft1.getFt114_InsurancePlanID().getCe4_AlternateIdentifier().setValue(ft1_14_insurancePlanID.getCe_4_alternateIdentifier());
		this.ft1.getFt114_InsurancePlanID().getCe5_AlternateText().setValue(ft1_14_insurancePlanID.getCe_5_alternateText());
		this.ft1.getFt114_InsurancePlanID().getCe6_NameOfAlternateCodingSystem().setValue(ft1_14_insurancePlanID.getCe_6_nameOfAlternateCodingSystem());
		this.ft1_14_insurancePlanID = ft1_14_insurancePlanID;
	}
	/**
	 * @return the ft1_15_insuranceAmount
	 */
	
	@JsonProperty("ft1_15_insuranceAmount")
	public CP_v2 getFt1_15_insuranceAmount() {
		return new CP_v2(
				new MO_v2(
						this.ft1.getFt115_InsuranceAmount().getCp1_Price().getMo1_Quantity().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp1_Price().getMo1_Quantity().getValue(), 
						this.ft1.getFt115_InsuranceAmount().getCp1_Price().getMo2_Denomination().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp1_Price().getMo2_Denomination().getValue()),
				this.ft1.getFt115_InsuranceAmount().getCp2_PriceType().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp2_PriceType().getValue(),
				this.ft1.getFt115_InsuranceAmount().getCp3_FromValue().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp3_FromValue().getValue(),
				this.ft1.getFt115_InsuranceAmount().getCp4_ToValue().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp4_ToValue().getValue(), 
				new CE_v2(
						this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe1_Identifier().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe1_Identifier().getValue(),
						this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe2_Text().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe2_Text().getValue(),
						this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue(),
						this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue(),
						this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe5_AlternateText().getValue(),
						this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()), 
				this.ft1.getFt115_InsuranceAmount().getCp6_RangeType().getValue()==null?"":this.ft1.getFt115_InsuranceAmount().getCp6_RangeType().getValue());
	}
	/**
	 * @param ft1_15_insuranceAmount the ft1_15_insuranceAmount to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_15_insuranceAmount")
	public void setFt1_15_insuranceAmount(CP_v2 ft1_15_insuranceAmount) throws DataTypeException {
		this.ft1.getFt115_InsuranceAmount().getCp1_Price().getMo1_Quantity().setValue(ft1_11_transactionAmountExtended.getCp_1_price().getMo_1_quantity()); 
		this.ft1.getFt115_InsuranceAmount().getCp1_Price().getMo2_Denomination().setValue(ft1_11_transactionAmountExtended.getCp_1_price().getMo_2_denomination());
		this.ft1.getFt115_InsuranceAmount().getCp2_PriceType().setValue(ft1_11_transactionAmountExtended.getCp_2_priceType());
		this.ft1.getFt115_InsuranceAmount().getCp3_FromValue().setValue(ft1_11_transactionAmountExtended.getCp_3_fromValue());
		this.ft1.getFt115_InsuranceAmount().getCp4_ToValue().setValue(ft1_11_transactionAmountExtended.getCp_4_toValue()); 
		this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe1_Identifier().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_1_identifier());
		this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe2_Text().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_2_text());
		this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe3_NameOfCodingSystem().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_3_nameOfCodingSystem());
		this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe4_AlternateIdentifier().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_4_alternateIdentifier());
		this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe5_AlternateText().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_5_alternateText());
		this.ft1.getFt115_InsuranceAmount().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().setValue(ft1_11_transactionAmountExtended.getCp_5_rangeUnits().getCe_6_nameOfAlternateCodingSystem()); 
		this.ft1.getFt115_InsuranceAmount().getCp6_RangeType().setValue(ft1_11_transactionAmountExtended.getCp_6_rangeType());
		this.ft1_15_insuranceAmount = ft1_15_insuranceAmount;
	}
	/**
	 * @return the ft1_16_assignedPatientLocation
	 */
	
	@JsonProperty("ft1_16_assignedPatientLocation")
	public PL_v25 getFt1_16_assignedPatientLocation() {
		return new PL_v25(
				this.ft1.getFt116_AssignedPatientLocation().getPl1_PointOfCare().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl1_PointOfCare().getValue(),
				this.ft1.getFt116_AssignedPatientLocation().getPl2_Room().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl2_Room().getValue(),
				this.ft1.getFt116_AssignedPatientLocation().getPl3_Bed().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl3_Bed().getValue(),
				new HD_v2(
						this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd1_NamespaceID().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd2_UniversalID().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()),
				this.ft1.getFt116_AssignedPatientLocation().getPl5_LocationStatus().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl5_LocationStatus().getValue(),
				this.ft1.getFt116_AssignedPatientLocation().getPl6_PersonLocationType().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl6_PersonLocationType().getValue(),
				this.ft1.getFt116_AssignedPatientLocation().getPl7_Building().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl7_Building().getValue(),
				this.ft1.getFt116_AssignedPatientLocation().getPl8_Floor().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl8_Floor().getValue(),
				this.ft1.getFt116_AssignedPatientLocation().getPl9_LocationDescription().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl9_LocationDescription().getValue(),
				new EI_v2(
						this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()),
				new HD_v2(
						this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(),
						this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param ft1_16_assignedPatientLocation the ft1_16_assignedPatientLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_16_assignedPatientLocation")
	public void setFt1_16_assignedPatientLocation(PL_v25 ft1_16_assignedPatientLocation) throws DataTypeException {
		this.ft1.getFt116_AssignedPatientLocation().getPl1_PointOfCare().setValue(ft1_16_assignedPatientLocation.getPl_1_pointOfCare());
		this.ft1.getFt116_AssignedPatientLocation().getPl2_Room().setValue(ft1_16_assignedPatientLocation.getPl_2_room());
		this.ft1.getFt116_AssignedPatientLocation().getPl3_Bed().setValue(ft1_16_assignedPatientLocation.getPl_3_bed());
		this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd1_NamespaceID().setValue(ft1_16_assignedPatientLocation.getPl_4_facility().getHd_1_namespaceId());
		this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd2_UniversalID().setValue(ft1_16_assignedPatientLocation.getPl_4_facility().getHd_2_universalId());
		this.ft1.getFt116_AssignedPatientLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(ft1_16_assignedPatientLocation.getPl_4_facility().getHd_3_universalIdType());
		this.ft1.getFt116_AssignedPatientLocation().getPl5_LocationStatus().setValue(ft1_16_assignedPatientLocation.getPl_5_locationStatus());
		this.ft1.getFt116_AssignedPatientLocation().getPl6_PersonLocationType().setValue(ft1_16_assignedPatientLocation.getPl_6_personLocationType());
		this.ft1.getFt116_AssignedPatientLocation().getPl7_Building().setValue(ft1_16_assignedPatientLocation.getPl_7_building());
		this.ft1.getFt116_AssignedPatientLocation().getPl8_Floor().setValue(ft1_16_assignedPatientLocation.getPl_8_floor());
		this.ft1.getFt116_AssignedPatientLocation().getPl9_LocationDescription().setValue(ft1_16_assignedPatientLocation.getPl_9_locationDescription());
		this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(ft1_16_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(ft1_16_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId());
		this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(ft1_16_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.ft1.getFt116_AssignedPatientLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(ft1_16_assignedPatientLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(ft1_16_assignedPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(ft1_16_assignedPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.ft1.getFt116_AssignedPatientLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(ft1_16_assignedPatientLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.ft1_16_assignedPatientLocation = ft1_16_assignedPatientLocation;
	}
	/**
	 * @return the ft1_17_feeSchedule
	 */
	
	@JsonProperty("ft1_17_feeSchedule")
	public String getFt1_17_feeSchedule() {
		return this.ft1.getFt117_FeeSchedule().getValue()==null?"":this.ft1.getFt117_FeeSchedule().getValue();
	}
	/**
	 * @param ft1_17_feeSchedule the ft1_17_feeSchedule to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_17_feeSchedule")
	public void setFt1_17_feeSchedule(String ft1_17_feeSchedule) throws DataTypeException {
		this.ft1.getFt117_FeeSchedule().setValue(ft1_17_feeSchedule);
		this.ft1_17_feeSchedule = ft1_17_feeSchedule;
	}
	/**
	 * @return the ft1_18_patientType
	 */
	
	@JsonProperty("ft1_18_patientType")
	public String getFt1_18_patientType() {
		return this.ft1.getFt118_PatientType().getValue()==null?"":this.ft1.getFt118_PatientType().getValue();
	}
	/**
	 * @param ft1_18_patientType the ft1_18_patientType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_18_patientType")
	public void setFt1_18_patientType(String ft1_18_patientType) throws DataTypeException {
		this.ft1.getFt118_PatientType().setValue(ft1_18_patientType);
		this.ft1_18_patientType = ft1_18_patientType;
	}
	/**
	 * @return the ft1_19_diagnosisCode
	 */
	
	@JsonProperty("ft1_19_diagnosisCode")
	public CE_v2[] getFt1_19_diagnosisCode() {
		CE_v2[] diagnosisCode = new CE_v2[this.ft1.getFt119_DiagnosisCodeFT1().length];
		for(int i = 0; i < this.ft1.getFt119_DiagnosisCodeFT1().length-1; i++) {
			diagnosisCode[i] = new CE_v2(
							this.ft1.getFt119_DiagnosisCodeFT1(i).getCe1_Identifier().getValue()==null?"":this.ft1.getFt119_DiagnosisCodeFT1(i).getCe1_Identifier().getValue(),
							this.ft1.getFt119_DiagnosisCodeFT1(i).getCe2_Text().getValue()==null?"":this.ft1.getFt119_DiagnosisCodeFT1(i).getCe2_Text().getValue(),
							this.ft1.getFt119_DiagnosisCodeFT1(i).getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt119_DiagnosisCodeFT1(i).getCe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt119_DiagnosisCodeFT1(i).getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt119_DiagnosisCodeFT1(i).getCe4_AlternateIdentifier().getValue(),
							this.ft1.getFt119_DiagnosisCodeFT1(i).getCe5_AlternateText().getValue()==null?"":this.ft1.getFt119_DiagnosisCodeFT1(i).getCe5_AlternateText().getValue(),
							this.ft1.getFt119_DiagnosisCodeFT1(i).getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt119_DiagnosisCodeFT1(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return diagnosisCode;
	}
	/**
	 * @param ft1_19_diagnosisCode the ft1_19_diagnosisCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_19_diagnosisCode")
	public void setFt1_19_diagnosisCode(CE_v2[] ft1_19_diagnosisCode) throws DataTypeException {
		for(int i = 0; i < ft1_19_diagnosisCode.length-1; i++) {
			this.ft1.getFt119_DiagnosisCodeFT1(i).getCe1_Identifier().setValue(ft1_19_diagnosisCode[i].getCe_1_identifier());
			this.ft1.getFt119_DiagnosisCodeFT1(i).getCe2_Text().setValue(ft1_19_diagnosisCode[i].getCe_2_text());
			this.ft1.getFt119_DiagnosisCodeFT1(i).getCe3_NameOfCodingSystem().setValue(ft1_19_diagnosisCode[i].getCe_3_nameOfCodingSystem());
			this.ft1.getFt119_DiagnosisCodeFT1(i).getCe4_AlternateIdentifier().setValue(ft1_19_diagnosisCode[i].getCe_4_alternateIdentifier());
			this.ft1.getFt119_DiagnosisCodeFT1(i).getCe5_AlternateText().setValue(ft1_19_diagnosisCode[i].getCe_5_alternateText());
			this.ft1.getFt119_DiagnosisCodeFT1(i).getCe6_NameOfAlternateCodingSystem().setValue(ft1_19_diagnosisCode[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.ft1_19_diagnosisCode = ft1_19_diagnosisCode;
	}
	/**
	 * @return the ft1_20_performedByCode
	 */
	
	@JsonProperty("ft1_20_performedByCode")
	public XCN_v25[] getFt1_20_performedByCode() {
		XCN_v25[] performedByCode = new XCN_v25[this.ft1.getFt120_PerformedByCode().length];
		for(int i =0; i <this.ft1.getFt120_PerformedByCode().length-1; i++) {
			performedByCode[i] = new XCN_v25(
					this.ft1.getFt120_PerformedByCode(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn1_Surname().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.ft1.getFt120_PerformedByCode(i).getXcn3_GivenName().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn3_GivenName().getValue(),
					this.ft1.getFt120_PerformedByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.ft1.getFt120_PerformedByCode(i).getXcn5_SuffixEgJRorIII().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.ft1.getFt120_PerformedByCode(i).getXcn6_PrefixEgDR().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn6_PrefixEgDR().getValue(),
					this.ft1.getFt120_PerformedByCode(i).getXcn7_DegreeEgMD().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn7_DegreeEgMD().getValue(),
					this.ft1.getFt120_PerformedByCode(i).getXcn8_SourceTable().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.ft1.getFt120_PerformedByCode(i).getXcn10_NameTypeCode().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn10_NameTypeCode().getValue(),
					this.ft1.getFt120_PerformedByCode(i).getXcn11_IdentifierCheckDigit().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn11_IdentifierCheckDigit().getValue(), 
					this.ft1.getFt120_PerformedByCode(i).getXcn12_CheckDigitScheme().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn12_CheckDigitScheme().getValue(), 
					this.ft1.getFt120_PerformedByCode(i).getXcn13_IdentifierTypeCode().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()), 
					this.ft1.getFt120_PerformedByCode(i).getXcn15_NameRepresentationCode().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe1_Identifier().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe2_Text().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe2_Text().getValue(), 
							this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.ft1.getFt120_PerformedByCode(i).getXcn18_NameAssemblyOrder().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn18_NameAssemblyOrder().getValue(), 
					new TS_v2(
							this.ft1.getFt120_PerformedByCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.ft1.getFt120_PerformedByCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()), 
					this.ft1.getFt120_PerformedByCode(i).getXcn21_ProfessionalSuffix().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return performedByCode;
	}
	/**
	 * @param ft1_20_performedByCode the ft1_20_performedByCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_20_performedByCode")
	public void setFt1_20_performedByCode(XCN_v25[] ft1_20_performedByCode) throws DataTypeException {
		for(int i = 0; i < ft1_20_performedByCode.length-1;i++) {
			this.ft1.getFt120_PerformedByCode(i).getXcn1_IDNumber().setValue(ft1_20_performedByCode[i].getXcn_1_idNumber());
			this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn1_Surname().setValue(ft1_20_performedByCode[i].getXcn_2_familyName().getFn_1_surname());
			this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(ft1_20_performedByCode[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(ft1_20_performedByCode[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(ft1_20_performedByCode[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.ft1.getFt120_PerformedByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(ft1_20_performedByCode[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.ft1.getFt120_PerformedByCode(i).getXcn3_GivenName().setValue(ft1_20_performedByCode[i].getXcn_3_givenName());
			this.ft1.getFt120_PerformedByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(ft1_20_performedByCode[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.ft1.getFt120_PerformedByCode(i).getXcn5_SuffixEgJRorIII().setValue(ft1_20_performedByCode[i].getXcn_5_suffixegJrOrIii());
			this.ft1.getFt120_PerformedByCode(i).getXcn6_PrefixEgDR().setValue(ft1_20_performedByCode[i].getXcn_6_prefixegDr());
			this.ft1.getFt120_PerformedByCode(i).getXcn7_DegreeEgMD().setValue(ft1_20_performedByCode[i].getXcn_7_degreeegMd());
			this.ft1.getFt120_PerformedByCode(i).getXcn8_SourceTable().setValue(ft1_20_performedByCode[i].getXcn_8_sourceTable());
			this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(ft1_20_performedByCode[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(ft1_20_performedByCode[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.ft1.getFt120_PerformedByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(ft1_20_performedByCode[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.ft1.getFt120_PerformedByCode(i).getXcn10_NameTypeCode().setValue(ft1_20_performedByCode[i].getXcn_10_nameTypeCode());
			this.ft1.getFt120_PerformedByCode(i).getXcn11_IdentifierCheckDigit().setValue(ft1_20_performedByCode[i].getXcn_11_identifierCheckDigit());
			this.ft1.getFt120_PerformedByCode(i).getXcn12_CheckDigitScheme().setValue(ft1_20_performedByCode[i].getXcn_12_checkDigitScheme());
			this.ft1.getFt120_PerformedByCode(i).getXcn13_IdentifierTypeCode().setValue(ft1_20_performedByCode[i].getXcn_13_identifierTypeCode());
			this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(ft1_20_performedByCode[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(ft1_20_performedByCode[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.ft1.getFt120_PerformedByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(ft1_20_performedByCode[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.ft1.getFt120_PerformedByCode(i).getXcn15_NameRepresentationCode().setValue(ft1_20_performedByCode[i].getXcn_15_nameRepresentationCode());
			this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe1_Identifier().setValue(ft1_20_performedByCode[i].getXcn_16_nameContext().getCe_1_identifier());
			this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe2_Text().setValue(ft1_20_performedByCode[i].getXcn_16_nameContext().getCe_2_text());
			this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(ft1_20_performedByCode[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(ft1_20_performedByCode[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe5_AlternateText().setValue(ft1_20_performedByCode[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.ft1.getFt120_PerformedByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(ft1_20_performedByCode[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(ft1_20_performedByCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(ft1_20_performedByCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(ft1_20_performedByCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.ft1.getFt120_PerformedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(ft1_20_performedByCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.ft1.getFt120_PerformedByCode(i).getXcn18_NameAssemblyOrder().setValue(ft1_20_performedByCode[i].getXcn_18_nameAssemblyOrder());
			this.ft1.getFt120_PerformedByCode(i).getXcn19_EffectiveDate().getTs1_Time().setValue(ft1_20_performedByCode[i].getXcn_19_effectiveDate().getTs_1_time());
			this.ft1.getFt120_PerformedByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(ft1_20_performedByCode[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.ft1.getFt120_PerformedByCode(i).getXcn20_ExpirationDate().getTs1_Time().setValue(ft1_20_performedByCode[i].getXcn_20_expirationDate().getTs_1_time());
			this.ft1.getFt120_PerformedByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(ft1_20_performedByCode[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision()); 
			this.ft1.getFt120_PerformedByCode(i).getXcn21_ProfessionalSuffix().setValue(ft1_20_performedByCode[i].getXcn_21_professionalSuffix());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.ft1.getFt120_PerformedByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(ft1_20_performedByCode[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.ft1.getFt120_PerformedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(ft1_20_performedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.ft1_20_performedByCode = ft1_20_performedByCode;
	}
	/**
	 * @return the ft1_21_orderedByCode
	 */
	
	@JsonProperty("ft1_21_orderedByCode")
	public XCN_v25[] getFt1_21_orderedByCode() {
		XCN_v25[] orderedByCode = new XCN_v25[this.ft1.getFt121_OrderedByCode().length];
		for(int i =0; i <this.ft1.getFt121_OrderedByCode().length-1; i++) {
			orderedByCode[i] = new XCN_v25(
					this.ft1.getFt121_OrderedByCode(i).getXcn1_IDNumber().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn1_Surname().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.ft1.getFt121_OrderedByCode(i).getXcn3_GivenName().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn3_GivenName().getValue(),
					this.ft1.getFt121_OrderedByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.ft1.getFt121_OrderedByCode(i).getXcn5_SuffixEgJRorIII().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.ft1.getFt121_OrderedByCode(i).getXcn6_PrefixEgDR().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn6_PrefixEgDR().getValue(),
					this.ft1.getFt121_OrderedByCode(i).getXcn7_DegreeEgMD().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn7_DegreeEgMD().getValue(),
					this.ft1.getFt121_OrderedByCode(i).getXcn8_SourceTable().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.ft1.getFt121_OrderedByCode(i).getXcn10_NameTypeCode().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn10_NameTypeCode().getValue(),
					this.ft1.getFt121_OrderedByCode(i).getXcn11_IdentifierCheckDigit().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn11_IdentifierCheckDigit().getValue(), 
					this.ft1.getFt121_OrderedByCode(i).getXcn12_CheckDigitScheme().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn12_CheckDigitScheme().getValue(), 
					this.ft1.getFt121_OrderedByCode(i).getXcn13_IdentifierTypeCode().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()), 
					this.ft1.getFt121_OrderedByCode(i).getXcn15_NameRepresentationCode().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe1_Identifier().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe2_Text().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe2_Text().getValue(), 
							this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.ft1.getFt121_OrderedByCode(i).getXcn18_NameAssemblyOrder().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn18_NameAssemblyOrder().getValue(), 
					new TS_v2(
							this.ft1.getFt121_OrderedByCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.ft1.getFt121_OrderedByCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()), 
					this.ft1.getFt121_OrderedByCode(i).getXcn21_ProfessionalSuffix().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		
		return orderedByCode;
	}
	/**
	 * @param ft1_21_orderedByCode the ft1_21_orderedByCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_21_orderedByCode")
	public void setFt1_21_orderedByCode(XCN_v25[] ft1_21_orderedByCode) throws DataTypeException {
		for(int i = 0; i < ft1_21_orderedByCode.length-1;i++) {
			this.ft1.getFt121_OrderedByCode(i).getXcn1_IDNumber().setValue(ft1_21_orderedByCode[i].getXcn_1_idNumber());
			this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn1_Surname().setValue(ft1_21_orderedByCode[i].getXcn_2_familyName().getFn_1_surname());
			this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(ft1_21_orderedByCode[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(ft1_21_orderedByCode[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(ft1_21_orderedByCode[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.ft1.getFt121_OrderedByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(ft1_21_orderedByCode[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.ft1.getFt121_OrderedByCode(i).getXcn3_GivenName().setValue(ft1_21_orderedByCode[i].getXcn_3_givenName());
			this.ft1.getFt121_OrderedByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(ft1_21_orderedByCode[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.ft1.getFt121_OrderedByCode(i).getXcn5_SuffixEgJRorIII().setValue(ft1_21_orderedByCode[i].getXcn_5_suffixegJrOrIii());
			this.ft1.getFt121_OrderedByCode(i).getXcn6_PrefixEgDR().setValue(ft1_21_orderedByCode[i].getXcn_6_prefixegDr());
			this.ft1.getFt121_OrderedByCode(i).getXcn7_DegreeEgMD().setValue(ft1_21_orderedByCode[i].getXcn_7_degreeegMd());
			this.ft1.getFt121_OrderedByCode(i).getXcn8_SourceTable().setValue(ft1_21_orderedByCode[i].getXcn_8_sourceTable());
			this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(ft1_21_orderedByCode[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(ft1_21_orderedByCode[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.ft1.getFt121_OrderedByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(ft1_21_orderedByCode[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.ft1.getFt121_OrderedByCode(i).getXcn10_NameTypeCode().setValue(ft1_21_orderedByCode[i].getXcn_10_nameTypeCode());
			this.ft1.getFt121_OrderedByCode(i).getXcn11_IdentifierCheckDigit().setValue(ft1_21_orderedByCode[i].getXcn_11_identifierCheckDigit());
			this.ft1.getFt121_OrderedByCode(i).getXcn12_CheckDigitScheme().setValue(ft1_21_orderedByCode[i].getXcn_12_checkDigitScheme());
			this.ft1.getFt121_OrderedByCode(i).getXcn13_IdentifierTypeCode().setValue(ft1_21_orderedByCode[i].getXcn_13_identifierTypeCode());
			this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(ft1_21_orderedByCode[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(ft1_21_orderedByCode[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.ft1.getFt121_OrderedByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(ft1_21_orderedByCode[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.ft1.getFt121_OrderedByCode(i).getXcn15_NameRepresentationCode().setValue(ft1_21_orderedByCode[i].getXcn_15_nameRepresentationCode());
			this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe1_Identifier().setValue(ft1_21_orderedByCode[i].getXcn_16_nameContext().getCe_1_identifier());
			this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe2_Text().setValue(ft1_21_orderedByCode[i].getXcn_16_nameContext().getCe_2_text());
			this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(ft1_21_orderedByCode[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(ft1_21_orderedByCode[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe5_AlternateText().setValue(ft1_21_orderedByCode[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.ft1.getFt121_OrderedByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(ft1_21_orderedByCode[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(ft1_21_orderedByCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(ft1_21_orderedByCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(ft1_21_orderedByCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.ft1.getFt121_OrderedByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(ft1_21_orderedByCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.ft1.getFt121_OrderedByCode(i).getXcn18_NameAssemblyOrder().setValue(ft1_21_orderedByCode[i].getXcn_18_nameAssemblyOrder());
			this.ft1.getFt121_OrderedByCode(i).getXcn19_EffectiveDate().getTs1_Time().setValue(ft1_21_orderedByCode[i].getXcn_19_effectiveDate().getTs_1_time());
			this.ft1.getFt121_OrderedByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(ft1_21_orderedByCode[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.ft1.getFt121_OrderedByCode(i).getXcn20_ExpirationDate().getTs1_Time().setValue(ft1_21_orderedByCode[i].getXcn_20_expirationDate().getTs_1_time());
			this.ft1.getFt121_OrderedByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(ft1_21_orderedByCode[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision()); 
			this.ft1.getFt121_OrderedByCode(i).getXcn21_ProfessionalSuffix().setValue(ft1_21_orderedByCode[i].getXcn_21_professionalSuffix());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.ft1.getFt121_OrderedByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(ft1_21_orderedByCode[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.ft1.getFt121_OrderedByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(ft1_21_orderedByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.ft1_21_orderedByCode = ft1_21_orderedByCode;
	}
	/**
	 * @return the ft1_22_unitCost
	 *	@JsonProperty("ft1_22_unitCost")
	 */
	
	public CP_v2 getFt1_22_unitCost() {
		return 	new CP_v2(
				new MO_v2(
						this.ft1.getFt122_UnitCost().getCp1_Price().getMo1_Quantity().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp1_Price().getMo1_Quantity().getValue(), 
						this.ft1.getFt122_UnitCost().getCp1_Price().getMo2_Denomination().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp1_Price().getMo2_Denomination().getValue()),
				this.ft1.getFt122_UnitCost().getCp2_PriceType().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp2_PriceType().getValue(),
				this.ft1.getFt122_UnitCost().getCp3_FromValue().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp3_FromValue().getValue(),
				this.ft1.getFt122_UnitCost().getCp4_ToValue().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp4_ToValue().getValue(), 
				new CE_v2(
						this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe1_Identifier().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe1_Identifier().getValue(),
						this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe2_Text().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe2_Text().getValue(),
						this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe3_NameOfCodingSystem().getValue(),
						this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe4_AlternateIdentifier().getValue(),
						this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe5_AlternateText().getValue(),
						this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().getValue()), 
				this.ft1.getFt122_UnitCost().getCp6_RangeType().getValue()==null?"":this.ft1.getFt122_UnitCost().getCp6_RangeType().getValue());
	}
	/**
	 * @param ft1_22_unitCost the ft1_22_unitCost to set
	 * @JsonProperty("ft1_22_unitCost")
	 * @throws DataTypeException 
	 */
	public void setFt1_22_unitCost(CP_v2 ft1_22_unitCost) throws DataTypeException {
		this.ft1.getFt122_UnitCost().getCp1_Price().getMo1_Quantity().setValue(ft1_22_unitCost.getCp_1_price().getMo_1_quantity()); 
		this.ft1.getFt122_UnitCost().getCp1_Price().getMo2_Denomination().setValue(ft1_22_unitCost.getCp_1_price().getMo_2_denomination());
		this.ft1.getFt122_UnitCost().getCp2_PriceType().setValue(ft1_22_unitCost.getCp_2_priceType());
		this.ft1.getFt122_UnitCost().getCp3_FromValue().setValue(ft1_22_unitCost.getCp_3_fromValue());
		this.ft1.getFt122_UnitCost().getCp4_ToValue().setValue(ft1_22_unitCost.getCp_4_toValue()); 
		this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe1_Identifier().setValue(ft1_22_unitCost.getCp_5_rangeUnits().getCe_1_identifier());
		this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe2_Text().setValue(ft1_22_unitCost.getCp_5_rangeUnits().getCe_2_text());
		this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe3_NameOfCodingSystem().setValue(ft1_22_unitCost.getCp_5_rangeUnits().getCe_3_nameOfCodingSystem());
		this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe4_AlternateIdentifier().setValue(ft1_22_unitCost.getCp_5_rangeUnits().getCe_4_alternateIdentifier());
		this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe5_AlternateText().setValue(ft1_22_unitCost.getCp_5_rangeUnits().getCe_5_alternateText());
		this.ft1.getFt122_UnitCost().getCp5_RangeUnits().getCe6_NameOfAlternateCodingSystem().setValue(ft1_22_unitCost.getCp_5_rangeUnits().getCe_6_nameOfAlternateCodingSystem()); 
		this.ft1.getFt122_UnitCost().getCp6_RangeType().setValue(ft1_22_unitCost.getCp_6_rangeType());
		this.ft1_22_unitCost = ft1_22_unitCost;
	}
	/**
	 * @return the ft1_23_fillerOrderNumber
	 */
	
	@JsonProperty("ft1_23_fillerOrderNumber")
	public EI_v2 getFt1_23_fillerOrderNumber() {
		return new EI_v2(
				this.ft1.getFt123_FillerOrderNumber().getEi1_EntityIdentifier().getValue()==null?"":this.ft1.getFt123_FillerOrderNumber().getEi1_EntityIdentifier().getValue(),
				this.ft1.getFt123_FillerOrderNumber().getEi2_NamespaceID().getValue()==null?"":this.ft1.getFt123_FillerOrderNumber().getEi2_NamespaceID().getValue(),
				this.ft1.getFt123_FillerOrderNumber().getEi3_UniversalID().getValue()==null?"":this.ft1.getFt123_FillerOrderNumber().getEi3_UniversalID().getValue(),
				this.ft1.getFt123_FillerOrderNumber().getEi4_UniversalIDType().getValue()==null?"":this.ft1.getFt123_FillerOrderNumber().getEi4_UniversalIDType().getValue());
	}
	/**
	 * @param ft1_23_fillerOrderNumber the ft1_23_fillerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_23_fillerOrderNumber")
	public void setFt1_23_fillerOrderNumber(EI_v2 ft1_23_fillerOrderNumber) throws DataTypeException {
		this.ft1.getFt123_FillerOrderNumber().getEi1_EntityIdentifier().setValue(ft1_23_fillerOrderNumber.getEi_1_entityIdentifier());
		this.ft1.getFt123_FillerOrderNumber().getEi2_NamespaceID().setValue(ft1_23_fillerOrderNumber.getEi_2_namespaceId());
		this.ft1.getFt123_FillerOrderNumber().getEi3_UniversalID().setValue(ft1_23_fillerOrderNumber.getEi_3_universalId());
		this.ft1.getFt123_FillerOrderNumber().getEi4_UniversalIDType().setValue(ft1_23_fillerOrderNumber.getEi_4_universalIdType());
		this.ft1_23_fillerOrderNumber = ft1_23_fillerOrderNumber;
	}
	/**
	 * @return the ft1_24_enteredByCode
	 */
	
	@JsonProperty("ft1_24_enteredByCode")
	public XCN_v25[] getFt1_24_enteredByCode() {
		XCN_v25[] enteredByCode = new XCN_v25[this.ft1.getFt121_OrderedByCode().length];
		for(int i =0; i <this.ft1.getFt121_OrderedByCode().length-1; i++) {
			enteredByCode[i] = new XCN_v25(
					this.ft1.getFt124_EnteredByCode(i).getXcn1_IDNumber().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn1_Surname().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.ft1.getFt124_EnteredByCode(i).getXcn3_GivenName().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn3_GivenName().getValue(),
					this.ft1.getFt124_EnteredByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.ft1.getFt124_EnteredByCode(i).getXcn5_SuffixEgJRorIII().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.ft1.getFt124_EnteredByCode(i).getXcn6_PrefixEgDR().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn6_PrefixEgDR().getValue(),
					this.ft1.getFt124_EnteredByCode(i).getXcn7_DegreeEgMD().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn7_DegreeEgMD().getValue(),
					this.ft1.getFt124_EnteredByCode(i).getXcn8_SourceTable().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.ft1.getFt124_EnteredByCode(i).getXcn10_NameTypeCode().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn10_NameTypeCode().getValue(),
					this.ft1.getFt124_EnteredByCode(i).getXcn11_IdentifierCheckDigit().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn11_IdentifierCheckDigit().getValue(), 
					this.ft1.getFt124_EnteredByCode(i).getXcn12_CheckDigitScheme().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn12_CheckDigitScheme().getValue(), 
					this.ft1.getFt124_EnteredByCode(i).getXcn13_IdentifierTypeCode().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()), 
					this.ft1.getFt124_EnteredByCode(i).getXcn15_NameRepresentationCode().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe1_Identifier().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe2_Text().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe2_Text().getValue(), 
							this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.ft1.getFt124_EnteredByCode(i).getXcn18_NameAssemblyOrder().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn18_NameAssemblyOrder().getValue(), 
					new TS_v2(
							this.ft1.getFt124_EnteredByCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.ft1.getFt124_EnteredByCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()), 
					this.ft1.getFt124_EnteredByCode(i).getXcn21_ProfessionalSuffix().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn21_ProfessionalSuffix().getValue(), 
					new CWE_v25(
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return enteredByCode;
	}
	
	/**
	 * @param ft1_24_enteredByCode the ft1_24_enteredByCode to set
	 * @JsonProperty("ft1_24_enteredByCode")
	 * @throws DataTypeException 
	 */
	public void setFt1_24_enteredByCode(XCN_v25[] ft1_24_enteredByCode) throws DataTypeException {
		for(int i = 0; i < ft1_24_enteredByCode.length-1;i++) {
			this.ft1.getFt124_EnteredByCode(i).getXcn1_IDNumber().setValue(ft1_24_enteredByCode[i].getXcn_1_idNumber());
			this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn1_Surname().setValue(ft1_24_enteredByCode[i].getXcn_2_familyName().getFn_1_surname());
			this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(ft1_24_enteredByCode[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(ft1_24_enteredByCode[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(ft1_24_enteredByCode[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.ft1.getFt124_EnteredByCode(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(ft1_24_enteredByCode[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.ft1.getFt124_EnteredByCode(i).getXcn3_GivenName().setValue(ft1_24_enteredByCode[i].getXcn_3_givenName());
			this.ft1.getFt124_EnteredByCode(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(ft1_24_enteredByCode[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.ft1.getFt124_EnteredByCode(i).getXcn5_SuffixEgJRorIII().setValue(ft1_24_enteredByCode[i].getXcn_5_suffixegJrOrIii());
			this.ft1.getFt124_EnteredByCode(i).getXcn6_PrefixEgDR().setValue(ft1_24_enteredByCode[i].getXcn_6_prefixegDr());
			this.ft1.getFt124_EnteredByCode(i).getXcn7_DegreeEgMD().setValue(ft1_24_enteredByCode[i].getXcn_7_degreeegMd());
			this.ft1.getFt124_EnteredByCode(i).getXcn8_SourceTable().setValue(ft1_24_enteredByCode[i].getXcn_8_sourceTable());
			this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(ft1_24_enteredByCode[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(ft1_24_enteredByCode[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.ft1.getFt124_EnteredByCode(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(ft1_24_enteredByCode[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.ft1.getFt124_EnteredByCode(i).getXcn10_NameTypeCode().setValue(ft1_24_enteredByCode[i].getXcn_10_nameTypeCode());
			this.ft1.getFt124_EnteredByCode(i).getXcn11_IdentifierCheckDigit().setValue(ft1_24_enteredByCode[i].getXcn_11_identifierCheckDigit());
			this.ft1.getFt124_EnteredByCode(i).getXcn12_CheckDigitScheme().setValue(ft1_24_enteredByCode[i].getXcn_12_checkDigitScheme());
			this.ft1.getFt124_EnteredByCode(i).getXcn13_IdentifierTypeCode().setValue(ft1_24_enteredByCode[i].getXcn_13_identifierTypeCode());
			this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(ft1_24_enteredByCode[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(ft1_24_enteredByCode[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.ft1.getFt124_EnteredByCode(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(ft1_24_enteredByCode[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.ft1.getFt124_EnteredByCode(i).getXcn15_NameRepresentationCode().setValue(ft1_24_enteredByCode[i].getXcn_15_nameRepresentationCode());
			this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe1_Identifier().setValue(ft1_24_enteredByCode[i].getXcn_16_nameContext().getCe_1_identifier());
			this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe2_Text().setValue(ft1_24_enteredByCode[i].getXcn_16_nameContext().getCe_2_text());
			this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(ft1_24_enteredByCode[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(ft1_24_enteredByCode[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe5_AlternateText().setValue(ft1_24_enteredByCode[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.ft1.getFt124_EnteredByCode(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(ft1_24_enteredByCode[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(ft1_24_enteredByCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(ft1_24_enteredByCode[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(ft1_24_enteredByCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.ft1.getFt124_EnteredByCode(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(ft1_24_enteredByCode[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.ft1.getFt124_EnteredByCode(i).getXcn18_NameAssemblyOrder().setValue(ft1_24_enteredByCode[i].getXcn_18_nameAssemblyOrder());
			this.ft1.getFt124_EnteredByCode(i).getXcn19_EffectiveDate().getTs1_Time().setValue(ft1_24_enteredByCode[i].getXcn_19_effectiveDate().getTs_1_time());
			this.ft1.getFt124_EnteredByCode(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(ft1_24_enteredByCode[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.ft1.getFt124_EnteredByCode(i).getXcn20_ExpirationDate().getTs1_Time().setValue(ft1_24_enteredByCode[i].getXcn_20_expirationDate().getTs_1_time());
			this.ft1.getFt124_EnteredByCode(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(ft1_24_enteredByCode[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision()); 
			this.ft1.getFt124_EnteredByCode(i).getXcn21_ProfessionalSuffix().setValue(ft1_24_enteredByCode[i].getXcn_21_professionalSuffix());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.ft1.getFt124_EnteredByCode(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(ft1_24_enteredByCode[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_1_identifier());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_2_text());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_5_alternateText());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
			this.ft1.getFt124_EnteredByCode(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(ft1_24_enteredByCode[i].getXcn_23_assigningAgencyOrDepartment().getCwe_9_originalText());
		}
		this.ft1_24_enteredByCode = ft1_24_enteredByCode;
	}
	/**
	 * @return the ft1_25_procedureCode
	 */
	
	@JsonProperty("ft1_25_procedureCode")
	public CE_v2 getFt1_25_procedureCode() {
		return new CE_v2(
				this.ft1.getFt125_ProcedureCode().getCe1_Identifier().getValue()==null?"":this.ft1.getFt125_ProcedureCode().getCe1_Identifier().getValue(),
				this.ft1.getFt125_ProcedureCode().getCe2_Text().getValue()==null?"":this.ft1.getFt125_ProcedureCode().getCe2_Text().getValue(),
				this.ft1.getFt125_ProcedureCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt125_ProcedureCode().getCe3_NameOfCodingSystem().getValue(),
				this.ft1.getFt125_ProcedureCode().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt125_ProcedureCode().getCe4_AlternateIdentifier().getValue(),
				this.ft1.getFt125_ProcedureCode().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt125_ProcedureCode().getCe5_AlternateText().getValue(),
				this.ft1.getFt125_ProcedureCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt125_ProcedureCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param ft1_25_procedureCode the ft1_25_procedureCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_25_procedureCode")
	public void setFt1_25_procedureCode(CE_v2 ft1_25_procedureCode) throws DataTypeException {
		this.ft1.getFt125_ProcedureCode().getCe1_Identifier().setValue(ft1_25_procedureCode.getCe_1_identifier());
		this.ft1.getFt125_ProcedureCode().getCe2_Text().setValue(ft1_25_procedureCode.getCe_2_text());
		this.ft1.getFt125_ProcedureCode().getCe3_NameOfCodingSystem().setValue(ft1_25_procedureCode.getCe_3_nameOfCodingSystem());
		this.ft1.getFt125_ProcedureCode().getCe4_AlternateIdentifier().setValue(ft1_25_procedureCode.getCe_4_alternateIdentifier());
		this.ft1.getFt125_ProcedureCode().getCe5_AlternateText().setValue(ft1_25_procedureCode.getCe_5_alternateText());
		this.ft1.getFt125_ProcedureCode().getCe6_NameOfAlternateCodingSystem().setValue(ft1_25_procedureCode.getCe_6_nameOfAlternateCodingSystem());
		this.ft1_25_procedureCode = ft1_25_procedureCode;
	}
	/**
	 * @return the ft1_26_procedureCodeModifier
	 */
	
	@JsonProperty("ft1_26_procedureCodeModifier")
	public CE_v2[] getFt1_26_procedureCodeModifier() {
		CE_v2[] procedureCodeModifier = new CE_v2[this.ft1.getFt126_ProcedureCodeModifier().length];
		for(int i = 0; i < this.ft1.getFt126_ProcedureCodeModifier().length-1; i++) {
			procedureCodeModifier[i] = new CE_v2(
							this.ft1.getFt126_ProcedureCodeModifier(i).getCe1_Identifier().getValue()==null?"":this.ft1.getFt126_ProcedureCodeModifier(i).getCe1_Identifier().getValue(),
							this.ft1.getFt126_ProcedureCodeModifier(i).getCe2_Text().getValue()==null?"":this.ft1.getFt126_ProcedureCodeModifier(i).getCe2_Text().getValue(),
							this.ft1.getFt126_ProcedureCodeModifier(i).getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt126_ProcedureCodeModifier(i).getCe3_NameOfCodingSystem().getValue(),
							this.ft1.getFt126_ProcedureCodeModifier(i).getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt126_ProcedureCodeModifier(i).getCe4_AlternateIdentifier().getValue(),
							this.ft1.getFt126_ProcedureCodeModifier(i).getCe5_AlternateText().getValue()==null?"":this.ft1.getFt126_ProcedureCodeModifier(i).getCe5_AlternateText().getValue(),
							this.ft1.getFt126_ProcedureCodeModifier(i).getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt126_ProcedureCodeModifier(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return procedureCodeModifier;
	}
	/**
	 * @param ft1_26_procedureCodeModifier the ft1_26_procedureCodeModifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_26_procedureCodeModifier")
	public void setFt1_26_procedureCodeModifier(CE_v2[] ft1_26_procedureCodeModifier) throws DataTypeException {
		for(int i = 0; i <ft1_26_procedureCodeModifier.length-1; i++) {
			this.ft1.getFt126_ProcedureCodeModifier(i).getCe1_Identifier().setValue(ft1_26_procedureCodeModifier[i].getCe_1_identifier());
			this.ft1.getFt126_ProcedureCodeModifier(i).getCe2_Text().setValue(ft1_26_procedureCodeModifier[i].getCe_2_text());
			this.ft1.getFt126_ProcedureCodeModifier(i).getCe3_NameOfCodingSystem().setValue(ft1_26_procedureCodeModifier[i].getCe_3_nameOfCodingSystem());
			this.ft1.getFt126_ProcedureCodeModifier(i).getCe4_AlternateIdentifier().setValue(ft1_26_procedureCodeModifier[i].getCe_4_alternateIdentifier());
			this.ft1.getFt126_ProcedureCodeModifier(i).getCe5_AlternateText().setValue(ft1_26_procedureCodeModifier[i].getCe_5_alternateText());
			this.ft1.getFt126_ProcedureCodeModifier(i).getCe6_NameOfAlternateCodingSystem().setValue(ft1_26_procedureCodeModifier[i].getCe_6_nameOfAlternateCodingSystem());
		}
		this.ft1_26_procedureCodeModifier = ft1_26_procedureCodeModifier;
	}
	/**
	 * @return the ft1_27_advancedBeneficiaryNoticeCode
	 */
	
	@JsonProperty("ft1_27_advancedBeneficiaryNoticeCode")
	public CE_v2 getFt1_27_advancedBeneficiaryNoticeCode() {
		return new CE_v2(
				this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe1_Identifier().getValue()==null?"":this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe1_Identifier().getValue(),
				this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe2_Text().getValue()==null?"":this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe2_Text().getValue(), 
				this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe3_NameOfCodingSystem().getValue(), 
				this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe4_AlternateIdentifier().getValue(), 
				this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe5_AlternateText().getValue()==null?"":this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe5_AlternateText().getValue(), 
				this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param ft1_27_advancedBeneficiaryNoticeCode the ft1_27_advancedBeneficiaryNoticeCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_27_advancedBeneficiaryNoticeCode")
	public void setFt1_27_advancedBeneficiaryNoticeCode(CE_v2 ft1_27_advancedBeneficiaryNoticeCode) throws DataTypeException {
		this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe1_Identifier().setValue(ft1_27_advancedBeneficiaryNoticeCode.getCe_1_identifier());
		this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe2_Text().setValue(ft1_27_advancedBeneficiaryNoticeCode.getCe_2_text()); 
		this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe3_NameOfCodingSystem().setValue(ft1_27_advancedBeneficiaryNoticeCode.getCe_3_nameOfCodingSystem());
		this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe4_AlternateIdentifier().setValue(ft1_27_advancedBeneficiaryNoticeCode.getCe_4_alternateIdentifier());
		this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe5_AlternateText().setValue(ft1_27_advancedBeneficiaryNoticeCode.getCe_5_alternateText());
		this.ft1.getFt127_AdvancedBeneficiaryNoticeCode().getCe6_NameOfAlternateCodingSystem().setValue(ft1_27_advancedBeneficiaryNoticeCode.getCe_6_nameOfAlternateCodingSystem());
		this.ft1_27_advancedBeneficiaryNoticeCode = ft1_27_advancedBeneficiaryNoticeCode;
	}
	/**
	 * @return the ft1_28_medicallyNecessaryDuplicateProcedureReason
	 */
	
	@JsonProperty("ft1_28_medicallyNecessaryDuplicateProcedureReason")
	public CWE_v25 getFt1_28_medicallyNecessaryDuplicateProcedureReason() {
		return new CWE_v25(
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe1_Identifier().getValue(),
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe2_Text().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe2_Text().getValue(),
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe3_NameOfCodingSystem().getValue(), 
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe4_AlternateIdentifier().getValue(),
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe5_AlternateText().getValue(), 
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe7_CodingSystemVersionID().getValue(),
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param ft1_28_medicallyNecessaryDuplicateProcedureReason the ft1_28_medicallyNecessaryDuplicateProcedureReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_28_medicallyNecessaryDuplicateProcedureReason")
	public void setFt1_28_medicallyNecessaryDuplicateProcedureReason(
			CWE_v25 ft1_28_medicallyNecessaryDuplicateProcedureReason) throws DataTypeException {
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe1_Identifier().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_1_identifier());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe2_Text().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_2_text());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe3_NameOfCodingSystem().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_3_nameOfCodingSystem());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe4_AlternateIdentifier().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_4_alternateIdentifier());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe5_AlternateText().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_5_alternateText());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_6_nameOfAlternateCodingSystem());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe7_CodingSystemVersionID().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_7_codingSystemVersionId());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_8_alternateCodingSystemVersionId());
		this.ft1.getFt128_MedicallyNecessaryDuplicateProcedureReason().getCwe9_OriginalText().setValue(ft1_28_medicallyNecessaryDuplicateProcedureReason.getCwe_9_originalText());
		this.ft1_28_medicallyNecessaryDuplicateProcedureReason = ft1_28_medicallyNecessaryDuplicateProcedureReason;
	}
	/**
	 * @return the ft1_29_NDCCode
	 */
	
	@JsonProperty("ft1_29_NDCCode")
	public CNE_v25 getFt1_29_NDCCode() {
		return new CNE_v25(
				this.ft1.getFt129_NDCCode().getCne1_Identifier().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne1_Identifier().getValue(),
				this.ft1.getFt129_NDCCode().getCne2_Text().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne2_Text().getValue(),
				this.ft1.getFt129_NDCCode().getCne3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne3_NameOfCodingSystem().getValue(), 
				this.ft1.getFt129_NDCCode().getCne4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne4_AlternateIdentifier().getValue(), 
				this.ft1.getFt129_NDCCode().getCne5_AlternateText().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne5_AlternateText().getValue(), 
				this.ft1.getFt129_NDCCode().getCne6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne6_NameOfAlternateCodingSystem().getValue(), 
				this.ft1.getFt129_NDCCode().getCne7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne7_CodingSystemVersionID().getValue(), 
				this.ft1.getFt129_NDCCode().getCne8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne8_AlternateCodingSystemVersionID().getValue(), 
				this.ft1.getFt129_NDCCode().getCne9_OriginalText().getValue()==null?"":this.ft1.getFt129_NDCCode().getCne9_OriginalText().getValue());
	}
	/**
	 * @param ft1_29_NDCCode the ft1_29_NDCCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_29_NDCCode")
	public void setFt1_29_NDCCode(CNE_v25 ft1_29_NDCCode) throws DataTypeException {
		this.ft1.getFt129_NDCCode().getCne1_Identifier().setValue(ft1_29_NDCCode.getCne_1_identifier());
		this.ft1.getFt129_NDCCode().getCne2_Text().setValue(ft1_29_NDCCode.getCne_2_text());
		this.ft1.getFt129_NDCCode().getCne3_NameOfCodingSystem().setValue(ft1_29_NDCCode.getCne_3_nameOfCodingSystem());
		this.ft1.getFt129_NDCCode().getCne4_AlternateIdentifier().setValue(ft1_29_NDCCode.getCne_4_alternateIdentifier()); 
		this.ft1.getFt129_NDCCode().getCne5_AlternateText().setValue(ft1_29_NDCCode.getCne_5_alternateText());
		this.ft1.getFt129_NDCCode().getCne6_NameOfAlternateCodingSystem().setValue(ft1_29_NDCCode.getCne_6_nameOfAlternateCodingSystem());
		this.ft1.getFt129_NDCCode().getCne7_CodingSystemVersionID().setValue(ft1_29_NDCCode.getCne_7_codingSystemVersionId());
		this.ft1.getFt129_NDCCode().getCne8_AlternateCodingSystemVersionID().setValue(ft1_29_NDCCode.getCne_8_alternateCodingSystemVersionId());
		this.ft1.getFt129_NDCCode().getCne9_OriginalText().setValue(ft1_29_NDCCode.getCne_9_originalText());
		this.ft1_29_NDCCode = ft1_29_NDCCode;
	}
	/**
	 * @return the ft1_30_paymentReferenceID
	 */
	
	@JsonProperty("ft1_30_paymentReferenceID")
	public CX_v25 getFt1_30_paymentReferenceID() {
		return new CX_v25(
				this.ft1.getFt130_PaymentReferenceID().getCx1_IDNumber().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx1_IDNumber().getValue(),
				this.ft1.getFt130_PaymentReferenceID().getCx2_CheckDigit().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx2_CheckDigit().getValue(),
				this.ft1.getFt130_PaymentReferenceID().getCx3_CheckDigitScheme().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx3_CheckDigitScheme().getValue(),
				new HD_v2(
						this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd1_NamespaceID().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd2_UniversalID().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()),
				this.ft1.getFt130_PaymentReferenceID().getCx5_IdentifierTypeCode().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx5_IdentifierTypeCode().getValue(),
				new HD_v2(
						this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd1_NamespaceID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd1_NamespaceID().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd2_UniversalID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd2_UniversalID().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd3_UniversalIDType().getValue()),
				this.ft1.getFt130_PaymentReferenceID().getCx7_EffectiveDate().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx7_EffectiveDate().getValue(),
				this.ft1.getFt130_PaymentReferenceID().getCx8_ExpirationDate().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx8_ExpirationDate().getValue(),
				new CWE_v25(
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe1_Identifier().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe2_Text().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe2_Text().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().getValue())
				,
				new CWE_v25(
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(), 
						this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()==null?"":this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
	}
	/**
	 * @param ft1_30_paymentReferenceID the ft1_30_paymentReferenceID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_30_paymentReferenceID")
	public void setFt1_30_paymentReferenceID(CX_v25 ft1_30_paymentReferenceID) throws DataTypeException {
		this.ft1.getFt130_PaymentReferenceID().getCx1_IDNumber().setValue(ft1_30_paymentReferenceID.getCx_1_idNumber());
		this.ft1.getFt130_PaymentReferenceID().getCx2_CheckDigit().setValue(ft1_30_paymentReferenceID.getCx_2_checkDigit());
		this.ft1.getFt130_PaymentReferenceID().getCx3_CheckDigitScheme().setValue(ft1_30_paymentReferenceID.getCx_3_checkDigitScheme());
		this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd1_NamespaceID().setValue(ft1_30_paymentReferenceID.getCx_4_assigningAuthority().getHd_1_namespaceId());
		this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd2_UniversalID().setValue(ft1_30_paymentReferenceID.getCx_4_assigningAuthority().getHd_2_universalId());
		this.ft1.getFt130_PaymentReferenceID().getCx4_AssigningAuthority().getHd3_UniversalIDType().setValue(ft1_30_paymentReferenceID.getCx_4_assigningAuthority().getHd_3_universalIdType());
		this.ft1.getFt130_PaymentReferenceID().getCx5_IdentifierTypeCode().setValue(ft1_30_paymentReferenceID.getCx_5_identifierTypeCode());
		this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd1_NamespaceID().setValue(ft1_30_paymentReferenceID.getCx_6_assigningFacility().getHd_1_namespaceId());
		this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd2_UniversalID().setValue(ft1_30_paymentReferenceID.getCx_6_assigningFacility().getHd_2_universalId());
		this.ft1.getFt130_PaymentReferenceID().getCx6_AssigningFacility().getHd3_UniversalIDType().setValue(ft1_30_paymentReferenceID.getCx_6_assigningFacility().getHd_3_universalIdType());
		this.ft1.getFt130_PaymentReferenceID().getCx7_EffectiveDate().setValue(ft1_30_paymentReferenceID.getCx_7_effectiveDate());
		this.ft1.getFt130_PaymentReferenceID().getCx8_ExpirationDate().setValue(ft1_30_paymentReferenceID.getCx_8_expirationDate());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe1_Identifier().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_1_identifier());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe2_Text().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_2_text());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_4_alternateIdentifier());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe5_AlternateText().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_5_alternateText());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_7_codingSystemVersionId());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
		this.ft1.getFt130_PaymentReferenceID().getCx9_AssigningJurisdiction().getCwe9_OriginalText().setValue(ft1_30_paymentReferenceID.getCx_9_assigningJurisdiction().getCwe_9_originalText());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_1_identifier());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe2_Text().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_2_text());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_3_nameOfCodingSystem());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_4_alternateIdentifier());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_5_alternateText());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_6_nameOfAlternateCodingSystem());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_7_codingSystemVersionId());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_8_alternateCodingSystemVersionId());
		this.ft1.getFt130_PaymentReferenceID().getCx10_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(ft1_30_paymentReferenceID.getCx_10_assigningAgencyOrDepartment().getCwe_9_originalText());
		this.ft1_30_paymentReferenceID = ft1_30_paymentReferenceID;
	}
	/**
	 * @return the ft1_31_transactionReferenceKey
	 */
	
	@JsonProperty("ft1_31_transactionReferenceKey")
	public String[] getFt1_31_transactionReferenceKey() {
		String[] transactionReferenceKey = new String[this.ft1.getFt131_TransactionReferenceKey().length];
		for(int i = 0; i<this.ft1.getFt131_TransactionReferenceKey().length-1;i++) {
			transactionReferenceKey[i] = this.ft1.getFt131_TransactionReferenceKey(i).getValue();
		}
				
		return transactionReferenceKey;
	}
	/**
	 * @param ft1_31_transactionReferenceKey the ft1_31_transactionReferenceKey to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ft1_31_transactionReferenceKey")
	public void setFt1_31_transactionReferenceKey(String[] ft1_31_transactionReferenceKey) throws DataTypeException {
		for(int i = 0; i<ft1_31_transactionReferenceKey.length-1;i++) {
			this.ft1.getFt131_TransactionReferenceKey(i).setValue(ft1_31_transactionReferenceKey[i]);
		}
		this.ft1_31_transactionReferenceKey = ft1_31_transactionReferenceKey;
	}
	@Override
	public String toString() {
		return "CustomFT1_v25 [ft1_1_setID=" + ft1_1_setID + ", ft1_2_transactionID=" + ft1_2_transactionID
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
				+ Arrays.toString(ft1_31_transactionReferenceKey) + ", ft1=" + ft1 + "]";
	}
}
