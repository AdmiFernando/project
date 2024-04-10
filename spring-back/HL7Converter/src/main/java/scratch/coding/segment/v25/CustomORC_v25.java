package scratch.coding.segment.v25;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.ORC;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.RI_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CNE_v25;
import scratch.coding.models.v25.CQ_v25;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.EIP_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.OSD_V25;
import scratch.coding.models.v25.PL_v25;
import scratch.coding.models.v25.SAD_v25;
import scratch.coding.models.v25.TQ_v25;
import scratch.coding.models.v25.XAD_v25;
import scratch.coding.models.v25.XCN_v25;
import scratch.coding.models.v25.XON_v25;
import scratch.coding.models.v25.XTN_v25;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomORC_v25 {
	@JsonProperty("orc_1_orderControl")
	private String orc_1_orderControl;
	@JsonProperty("orc_2_placerOrderNumber")
	private EI_v2 orc_2_placerOrderNumber;
	@JsonProperty("orc_3_fillerOrderNumber")
	private EI_v2 orc_3_fillerOrderNumber;
	@JsonProperty("orc_4_placerGroupNumber")
	private EI_v2 orc_4_placerGroupNumber;
	@JsonProperty("orc_5_orderStatus")
	private String orc_5_orderStatus;
	@JsonProperty("orc_6_responseFlag")
	private String orc_6_responseFlag;
	@JsonProperty("orc_7_quantityTiming")
	private TQ_v25[] orc_7_quantityTiming;
	@JsonProperty("orc_8_parentOrder")
	private EIP_v25 orc_8_parentOrder;
	@JsonProperty("orc_9_dateTimeofTransaction")
	private TS_v2 orc_9_dateTimeofTransaction;
	@JsonProperty("orc_10_enteredBy")
	private XCN_v25[] orc_10_enteredBy;
	@JsonProperty("orc_11_verifiedBy")
	private XCN_v25[] orc_11_verifiedBy;
	@JsonProperty("orc_12_orderingProvider")
	private XCN_v25[] orc_12_orderingProvider;
	@JsonProperty("orc_13_enterersLocation")
	private PL_v25 orc_13_enterersLocation;
	@JsonProperty("orc_14_callBackPhoneNumber")
	private XTN_v25[] orc_14_callBackPhoneNumber;
	@JsonProperty("orc_15_orderEffectiveDateTime")
	private TS_v2 orc_15_orderEffectiveDateTime;
	@JsonProperty("orc_16_orderControlCodeReason")
	private CE_v2 orc_16_orderControlCodeReason;
	@JsonProperty("orc_17_enteringOrganization")
	private CE_v2 orc_17_enteringOrganization;
	@JsonProperty("orc_18_enteringDevice")
	private CE_v2 orc_18_enteringDevice;
	@JsonProperty("orc_19_actionBy")
	private XCN_v25[] orc_19_actionBy;
	@JsonProperty("orc_20_advancedBeneficiaryNoticeCode")
	private CE_v2 orc_20_advancedBeneficiaryNoticeCode;
	@JsonProperty("orc_21_orderingFacilityName")
	private XON_v25[] orc_21_orderingFacilityName;
	@JsonProperty("orc_22_orderingFacilityAddress")
	private XAD_v25[] orc_22_orderingFacilityAddress;
	@JsonProperty("orc_23_orderingFacilityPhoneNumber")
	private XTN_v25[] orc_23_orderingFacilityPhoneNumber;
	@JsonProperty("orc_24_orderingProviderAddress")
	private XAD_v25[] orc_24_orderingProviderAddress;
	@JsonProperty("orc_25_orderStatusModifier")
	private CWE_v25 orc_25_orderStatusModifier;
	@JsonProperty("orc_26_advancedBeneficiaryNoticeOverrideReason")
	private CWE_v25 orc_26_advancedBeneficiaryNoticeOverrideReason;
	@JsonProperty("orc_27_fillersExpectedAvailabilityDateTime")
	private TS_v2 orc_27_fillersExpectedAvailabilityDateTime;
	@JsonProperty("orc_28_confidentialityCode")
	private CWE_v25 orc_28_confidentialityCode;
	@JsonProperty("orc_29_orderType")
	private CWE_v25 orc_29_orderType;
	@JsonProperty("orc_30_entererAuthorizationMode")
	private CNE_v25 orc_30_entererAuthorizationMode;
	@JsonProperty("obr")
	private CustomOBR_v25 obr;
	
	private ORC orc;
	
	private CustomORC_v25(ORC orc, CustomOBR_v25 obr) {
		super();
		this.orc =orc;
		this.obr = obr;
	}
	private CustomORC_v25(ORC orc) {
		super();
		this.orc = orc;
	}
	
	public CustomORC_v25() {
		super();
	}
	public static CustomORC_v25 createOBXWithOBX(ORC orc) throws HL7Exception, IOException {
		return new CustomORC_v25(orc);
	}

	public static CustomORC_v25 createOrc(ORU_R01_ORDER_OBSERVATION observation) throws HL7Exception, IOException {
		ORC orc = observation.getORC();
		return new CustomORC_v25(orc,CustomOBR_v25.createOBR(observation));
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the orc_1_orderControl
	 */
	
	@JsonProperty("orc_1_orderControl")
	public String getOrc_1_orderControl() {
		return this.orc.getOrc1_OrderControl().getValue();
	}
	/**
	 * @param orc_1_orderControl the orc_1_orderControl to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_1_orderControl")
	public void setOrc_1_orderControl(String orc_1_orderControl) throws DataTypeException {
		this.orc.getOrc1_OrderControl().setValue(orc_1_orderControl);
		this.orc_1_orderControl = orc_1_orderControl;
	}
	/**
	 * @return the orc_2_placerOrderNumber
	 */
	
	@JsonProperty("orc_2_placerOrderNumber")
	public EI_v2 getOrc_2_placerOrderNumber() {
		return new EI_v2(
				this.orc.getOrc2_PlacerOrderNumber().getEi1_EntityIdentifier().getValue(),
				this.orc.getOrc2_PlacerOrderNumber().getEi2_NamespaceID().getValue(), 
				this.orc.getOrc2_PlacerOrderNumber().getEi3_UniversalID().getValue(), 
				this.orc.getOrc2_PlacerOrderNumber().getEi4_UniversalIDType().getValue());
	}
	/**
	 * @param orc_2_placerOrderNumber the orc_2_placerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_2_placerOrderNumber")
	public void setOrc_2_placerOrderNumber(EI_v2 orc_2_placerOrderNumber) throws DataTypeException {
		this.orc.getOrc2_PlacerOrderNumber().getEi1_EntityIdentifier().setValue(orc_2_placerOrderNumber.getEi_1_entityIdentifier());
		this.orc.getOrc2_PlacerOrderNumber().getEi2_NamespaceID().setValue(orc_2_placerOrderNumber.getEi_2_namespaceId());
		this.orc.getOrc2_PlacerOrderNumber().getEi3_UniversalID().setValue(orc_2_placerOrderNumber.getEi_3_universalId()); 
		this.orc.getOrc2_PlacerOrderNumber().getEi4_UniversalIDType().setValue(orc_2_placerOrderNumber.getEi_4_universalIdType());
		this.orc_2_placerOrderNumber = orc_2_placerOrderNumber;
	}
	/**
	 * @return the orc_3_fillerOrderNumber
	 */
	
	@JsonProperty("orc_3_fillerOrderNumber")
	public EI_v2 getOrc_3_fillerOrderNumber() {
		return new EI_v2(
				this.orc.getOrc3_FillerOrderNumber().getEi1_EntityIdentifier().getValue(),
				this.orc.getOrc3_FillerOrderNumber().getEi2_NamespaceID().getValue(), 
				this.orc.getOrc3_FillerOrderNumber().getEi3_UniversalID().getValue(), 
				this.orc.getOrc3_FillerOrderNumber().getEi4_UniversalIDType().getValue());
		
	}
	/**
	 * @param orc_3_fillerOrderNumber the orc_3_fillerOrderNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_3_fillerOrderNumber")
	public void setOrc_3_fillerOrderNumber(EI_v2 orc_3_fillerOrderNumber) throws DataTypeException {
		this.orc.getOrc3_FillerOrderNumber().getEi1_EntityIdentifier().setValue(orc_3_fillerOrderNumber.getEi_1_entityIdentifier());
		this.orc.getOrc3_FillerOrderNumber().getEi2_NamespaceID().setValue(orc_3_fillerOrderNumber.getEi_2_namespaceId());
		this.orc.getOrc3_FillerOrderNumber().getEi3_UniversalID().setValue(orc_3_fillerOrderNumber.getEi_3_universalId()); 
		this.orc.getOrc3_FillerOrderNumber().getEi4_UniversalIDType().setValue(orc_3_fillerOrderNumber.getEi_4_universalIdType());
		this.orc_3_fillerOrderNumber = orc_3_fillerOrderNumber;
	}
	/**
	 * @return the orc_4_placerGroupNumber
	 */
	
	@JsonProperty("orc_4_placerGroupNumber")
	public EI_v2 getOrc_4_placerGroupNumber() {
		return new EI_v2(
				this.orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().getValue(),
				this.orc.getOrc4_PlacerGroupNumber().getEi2_NamespaceID().getValue(), 
				this.orc.getOrc4_PlacerGroupNumber().getEi3_UniversalID().getValue(), 
				this.orc.getOrc4_PlacerGroupNumber().getEi4_UniversalIDType().getValue());
	}
	/**
	 * @param orc_4_placerGroupNumber the orc_4_placerGroupNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_4_placerGroupNumber")
	public void setOrc_4_placerGroupNumber(EI_v2 orc_4_placerGroupNumber) throws DataTypeException {
		this.orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().setValue(orc_4_placerGroupNumber.getEi_1_entityIdentifier());
		this.orc.getOrc4_PlacerGroupNumber().getEi2_NamespaceID().setValue(orc_4_placerGroupNumber.getEi_2_namespaceId());
		this.orc.getOrc4_PlacerGroupNumber().getEi3_UniversalID().setValue(orc_4_placerGroupNumber.getEi_3_universalId()); 
		this.orc.getOrc4_PlacerGroupNumber().getEi4_UniversalIDType().setValue(orc_4_placerGroupNumber.getEi_4_universalIdType());
		this.orc_4_placerGroupNumber = orc_4_placerGroupNumber;
	}
	/**
	 * @return the orc_5_orderStatus
	 */
	
	@JsonProperty("orc_5_orderStatus")
	public String getOrc_5_orderStatus() {
		return this.orc.getOrc5_OrderStatus().getValue();
	}
	/**
	 * @param orc_5_orderStatus the orc_5_orderStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_5_orderStatus")
	public void setOrc_5_orderStatus(String orc_5_orderStatus) throws DataTypeException {
		this.orc.getOrc5_OrderStatus().setValue(orc_5_orderStatus);
		this.orc_5_orderStatus = orc_5_orderStatus;
	}
	/**
	 * @return the orc_6_responseFlag
	 */
	
	@JsonProperty("orc_6_responseFlag")
	public String getOrc_6_responseFlag() {
		return this.orc.getOrc6_ResponseFlag().getValue();
	}
	/**
	 * @param orc_6_responseFlag the orc_6_responseFlag to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_6_responseFlag")
	public void setOrc_6_responseFlag(String orc_6_responseFlag) throws DataTypeException {
		this.orc.getOrc6_ResponseFlag().setValue(orc_6_responseFlag);
		this.orc_6_responseFlag = orc_6_responseFlag;
	}
	/**
	 * @return the orc_7_quantityTiming
	 */
	
	@JsonProperty("orc_7_quantityTiming")
	public TQ_v25[] getOrc_7_quantityTiming() {
		TQ_v25[] quantityTiming = new TQ_v25[this.orc.getOrc7_QuantityTiming().length];
		for(int i = 0; i<this.orc.getOrc7_QuantityTiming().length ; i++) {
			quantityTiming[i] = new TQ_v25(
					new CQ_v25(
							this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq1_Quantity().getValue(),
							new CE_v2(
									this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe1_Identifier().getValue(),
									this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe2_Text().getValue(),
									this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe3_NameOfCodingSystem().getValue(),
									this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe4_AlternateIdentifier().getValue(), 
									this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe5_AlternateText().getValue(),
									this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe6_NameOfAlternateCodingSystem().getValue())),
					new RI_v2(
							this.orc.getOrc7_QuantityTiming(i).getTq2_Interval().getRi1_RepeatPattern().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq2_Interval().getRi2_ExplicitTimeInterval().getValue()),
					this.orc.getOrc7_QuantityTiming(i).getTq3_Duration().getValue(),
					new TS_v2(
							this.orc.getOrc7_QuantityTiming(i).getTq4_StartDateTime().getTs1_Time().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq4_StartDateTime().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.orc.getOrc7_QuantityTiming(i).getTq5_EndDateTime().getTs1_Time().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq5_EndDateTime().getTs2_DegreeOfPrecision().getValue()),
					this.orc.getOrc7_QuantityTiming(i).getTq6_Priority().getValue(),
					this.orc.getOrc7_QuantityTiming(i).getTq7_Condition().getValue(),
					this.orc.getOrc7_QuantityTiming(i).getTq8_Text().getValue(), 
					this.orc.getOrc7_QuantityTiming(i).getTq9_Conjunction().getValue(), 
					new OSD_V25(
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd1_SequenceResultsFlag().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd2_PlacerOrderNumberEntityIdentifier().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd3_PlacerOrderNumberNamespaceID().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd4_FillerOrderNumberEntityIdentifier().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd5_FillerOrderNumberNamespaceID().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd6_SequenceConditionValue().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd7_MaximumNumberOfRepeats().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd8_PlacerOrderNumberUniversalID().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd9_PlacerOrderNumberUniversalIDType().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd10_FillerOrderNumberUniversalID().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd11_FillerOrderNumberUniversalIDType().getValue()), 
					new CE_v2(
							this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe1_Identifier().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe2_Text().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe4_AlternateIdentifier().getValue(),
							this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe5_AlternateText().getValue(), 
							this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe6_NameOfAlternateCodingSystem().getValue()),
					this.orc.getOrc7_QuantityTiming(i).getTq12_TotalOccurrences().getValue());
		}
		return quantityTiming;
	}
	/**
	 * @param orc_7_quantityTiming the orc_7_quantityTiming to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_7_quantityTiming")
	public void setOrc_7_quantityTiming(TQ_v25[] orc_7_quantityTiming) throws DataTypeException {
		for(int i = 0; i<this.orc.getOrc7_QuantityTiming().length ; i++) {
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq1_Quantity().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_1_quantity());
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe1_Identifier().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_1_identifier());
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe2_Text().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_2_text());
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe3_NameOfCodingSystem().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_3_nameOfCodingSystem());
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe4_AlternateIdentifier().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_4_alternateIdentifier());
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe5_AlternateText().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_5_alternateText());
			this.orc.getOrc7_QuantityTiming(i).getTq1_Quantity().getCq2_Units().getCe6_NameOfAlternateCodingSystem().setValue(orc_7_quantityTiming[i].getTq_1_quantity().getCq_2_units().getCe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc7_QuantityTiming(i).getTq2_Interval().getRi1_RepeatPattern().setValue(orc_7_quantityTiming[i].getTq_2_interval().getRi_1_repeatPattern());
			this.orc.getOrc7_QuantityTiming(i).getTq2_Interval().getRi2_ExplicitTimeInterval().setValue(orc_7_quantityTiming[i].getTq_2_interval().getRi_2_explicitTimeInterval());
			this.orc.getOrc7_QuantityTiming(i).getTq3_Duration().setValue(orc_7_quantityTiming[i].getTq_3_duration());
			this.orc.getOrc7_QuantityTiming(i).getTq4_StartDateTime().getTs1_Time().setValue(orc_7_quantityTiming[i].getTq_4_startDateTime().getTs_1_time());
			this.orc.getOrc7_QuantityTiming(i).getTq4_StartDateTime().getTs2_DegreeOfPrecision().setValue(orc_7_quantityTiming[i].getTq_4_startDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc7_QuantityTiming(i).getTq5_EndDateTime().getTs1_Time().setValue(orc_7_quantityTiming[i].getTq_5_endDateTime().getTs_1_time());
			this.orc.getOrc7_QuantityTiming(i).getTq5_EndDateTime().getTs2_DegreeOfPrecision().setValue(orc_7_quantityTiming[i].getTq_5_endDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc7_QuantityTiming(i).getTq6_Priority().setValue(orc_7_quantityTiming[i].getTq_6_priority());
			this.orc.getOrc7_QuantityTiming(i).getTq7_Condition().setValue(orc_7_quantityTiming[i].getTq_7_condition());
			this.orc.getOrc7_QuantityTiming(i).getTq8_Text().setValue(orc_7_quantityTiming[i].getTq_8_text());
			this.orc.getOrc7_QuantityTiming(i).getTq9_Conjunction().setValue(orc_7_quantityTiming[i].getTq_9_conjunction());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd1_SequenceResultsFlag().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_1_sequenceResultsFlag());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd2_PlacerOrderNumberEntityIdentifier().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_2_placerOrderNumber());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd3_PlacerOrderNumberNamespaceID().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_3_placerOrderNumberNamespaceId());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd4_FillerOrderNumberEntityIdentifier().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_4_fillerOrderNumber());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd5_FillerOrderNumberNamespaceID().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_5_fillerOrderNumber());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd6_SequenceConditionValue().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_6_sequenceConditionValue());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd7_MaximumNumberOfRepeats().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_7_maximumNumberOfRepeats());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd8_PlacerOrderNumberUniversalID().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_8_placerOrderNumber());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd9_PlacerOrderNumberUniversalIDType().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_9_placerOrderNumber());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd10_FillerOrderNumberUniversalID().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_10_fillerOrderNumberUniversalID());
			this.orc.getOrc7_QuantityTiming(i).getTq10_OrderSequencing().getOsd11_FillerOrderNumberUniversalIDType().setValue(orc_7_quantityTiming[i].getTq_10_orderSequencing().getOsd_11_fillerOrderNumberUniversalIDType());
			this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe1_Identifier().setValue(orc_7_quantityTiming[i].getTq_11_occurrenceDuration().getCe_1_identifier());
			this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe2_Text().setValue(orc_7_quantityTiming[i].getTq_11_occurrenceDuration().getCe_2_text());
			this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe3_NameOfCodingSystem().setValue(orc_7_quantityTiming[i].getTq_11_occurrenceDuration().getCe_3_nameOfCodingSystem());
			this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe4_AlternateIdentifier().setValue(orc_7_quantityTiming[i].getTq_11_occurrenceDuration().getCe_4_alternateIdentifier());
			this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe5_AlternateText().setValue(orc_7_quantityTiming[i].getTq_11_occurrenceDuration().getCe_5_alternateText());
			this.orc.getOrc7_QuantityTiming(i).getTq11_OccurrenceDuration().getCe6_NameOfAlternateCodingSystem().setValue(orc_7_quantityTiming[i].getTq_11_occurrenceDuration().getCe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc7_QuantityTiming(i).getTq12_TotalOccurrences().setValue(orc_7_quantityTiming[i].getTq_12_totalOccurrences());
		}
		this.orc_7_quantityTiming = orc_7_quantityTiming;
	}
	/**
	 * @return the orc_8_parentOrder
	 */
	
	@JsonProperty("orc_8_parentOrder")
	public EIP_v25 getOrc_8_parentOrder() {
		return new EIP_v25(
				new EI_v2(
						this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
						this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().getValue(),
						this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().getValue(),
						this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().getValue()),
				new EI_v2(
						this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().getValue(),
						this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().getValue(),
						this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi3_UniversalID().getValue(),
						this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().getValue()));
	}
	/**
	 * @param orc_8_parentOrder the orc_8_parentOrder to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_8_parentOrder")
	public void setOrc_8_parentOrder(EIP_v25 orc_8_parentOrder) throws DataTypeException {
		this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi1_EntityIdentifier().setValue(orc_8_parentOrder.getEip_1_placerAssignedIdentifier().getEi_1_entityIdentifier());
		this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi2_NamespaceID().setValue(orc_8_parentOrder.getEip_1_placerAssignedIdentifier().getEi_2_namespaceId());
		this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi3_UniversalID().setValue(orc_8_parentOrder.getEip_1_placerAssignedIdentifier().getEi_3_universalId());
		this.orc.getOrc8_ParentOrder().getEip1_PlacerAssignedIdentifier().getEi4_UniversalIDType().setValue(orc_8_parentOrder.getEip_1_placerAssignedIdentifier().getEi_4_universalIdType());
		this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi1_EntityIdentifier().setValue(orc_8_parentOrder.getEip_2_fillerAssignedIdentifier().getEi_1_entityIdentifier());
		this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi2_NamespaceID().setValue(orc_8_parentOrder.getEip_2_fillerAssignedIdentifier().getEi_2_namespaceId());
		this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi3_UniversalID().setValue(orc_8_parentOrder.getEip_2_fillerAssignedIdentifier().getEi_3_universalId());
		this.orc.getOrc8_ParentOrder().getEip2_FillerAssignedIdentifier().getEi4_UniversalIDType().setValue(orc_8_parentOrder.getEip_2_fillerAssignedIdentifier().getEi_4_universalIdType());
		this.orc_8_parentOrder = orc_8_parentOrder;
	}
	/**
	 * @return the orc_9_dateTimeofTransaction
	 */
	
	@JsonProperty("orc_9_dateTimeofTransaction")
	public TS_v2 getOrc_9_dateTimeofTransaction() {
		return new TS_v2(
				this.orc.getOrc9_DateTimeOfTransaction().getTs1_Time().getValue(),
				this.orc.getOrc9_DateTimeOfTransaction().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param orc_9_dateTimeofTransaction the orc_9_dateTimeofTransaction to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_9_dateTimeofTransaction")
	public void setOrc_9_dateTimeofTransaction(TS_v2 orc_9_dateTimeofTransaction) throws DataTypeException {
		this.orc.getOrc9_DateTimeOfTransaction().getTs1_Time().setValue(orc_9_dateTimeofTransaction.getTs_1_time());
		this.orc.getOrc9_DateTimeOfTransaction().getTs2_DegreeOfPrecision().setValue(orc_9_dateTimeofTransaction.getTs_2_degreeOfPrecision());
		this.orc_9_dateTimeofTransaction = orc_9_dateTimeofTransaction;
	}
	/**
	 * @return the orc_10_enteredBy
	 */
	
	@JsonProperty("orc_10_enteredBy")
	public XCN_v25[] getOrc_10_enteredBy() {
		XCN_v25[] enteredBy = new XCN_v25[this.orc.getOrc10_EnteredBy().length];
		for(int i = 0; i<this.orc.getOrc10_EnteredBy().length;i++) {
			enteredBy[i] = new XCN_v25(
					this.orc.getOrc10_EnteredBy(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.orc.getOrc10_EnteredBy(i).getXcn3_GivenName().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn6_PrefixEgDR().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn7_DegreeEgMD().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.orc.getOrc10_EnteredBy(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc10_EnteredBy(i).getXcn10_NameTypeCode().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn12_CheckDigitScheme().getValue(),
					this.orc.getOrc10_EnteredBy(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.orc.getOrc10_EnteredBy(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc10_EnteredBy(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.orc.getOrc10_EnteredBy(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.orc.getOrc10_EnteredBy(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.orc.getOrc10_EnteredBy(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.orc.getOrc10_EnteredBy(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return enteredBy;
	}
	/**
	 * @param orc_10_enteredBy the orc_10_enteredBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_10_enteredBy")
	public void setOrc_10_enteredBy(XCN_v25[] orc_10_enteredBy) throws DataTypeException {
		for(int i = 0; i<orc_10_enteredBy.length;i++) {
			this.orc.getOrc10_EnteredBy(i).getXcn1_IDNumber().setValue(orc_10_enteredBy[i].getXcn_1_idNumber());
			this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn1_Surname().setValue(orc_10_enteredBy[i].getXcn_2_familyName().getFn_1_surname());
			this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(orc_10_enteredBy[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(orc_10_enteredBy[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(orc_10_enteredBy[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.orc.getOrc10_EnteredBy(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(orc_10_enteredBy[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.orc.getOrc10_EnteredBy(i).getXcn3_GivenName().setValue(orc_10_enteredBy[i].getXcn_3_givenName());
			this.orc.getOrc10_EnteredBy(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(orc_10_enteredBy[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.orc.getOrc10_EnteredBy(i).getXcn5_SuffixEgJRorIII().setValue(orc_10_enteredBy[i].getXcn_5_suffixegJrOrIii());
			this.orc.getOrc10_EnteredBy(i).getXcn6_PrefixEgDR().setValue(orc_10_enteredBy[i].getXcn_6_prefixegDr());
			this.orc.getOrc10_EnteredBy(i).getXcn7_DegreeEgMD().setValue(orc_10_enteredBy[i].getXcn_7_degreeegMd());
			this.orc.getOrc10_EnteredBy(i).getXcn8_SourceTable().setValue(orc_10_enteredBy[i].getXcn_8_sourceTable());
			this.orc.getOrc10_EnteredBy(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(orc_10_enteredBy[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.orc.getOrc10_EnteredBy(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(orc_10_enteredBy[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.orc.getOrc10_EnteredBy(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(orc_10_enteredBy[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.orc.getOrc10_EnteredBy(i).getXcn10_NameTypeCode().setValue(orc_10_enteredBy[i].getXcn_10_nameTypeCode());
			this.orc.getOrc10_EnteredBy(i).getXcn11_IdentifierCheckDigit().setValue(orc_10_enteredBy[i].getXcn_11_identifierCheckDigit());
			this.orc.getOrc10_EnteredBy(i).getXcn12_CheckDigitScheme().setValue(orc_10_enteredBy[i].getXcn_12_checkDigitScheme());
			this.orc.getOrc10_EnteredBy(i).getXcn13_IdentifierTypeCode().setValue(orc_10_enteredBy[i].getXcn_13_identifierTypeCode());
			this.orc.getOrc10_EnteredBy(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(orc_10_enteredBy[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.orc.getOrc10_EnteredBy(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(orc_10_enteredBy[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.orc.getOrc10_EnteredBy(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(orc_10_enteredBy[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.orc.getOrc10_EnteredBy(i).getXcn15_NameRepresentationCode().setValue(orc_10_enteredBy[i].getXcn_15_nameRepresentationCode());
			this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe1_Identifier().setValue(orc_10_enteredBy[i].getXcn_16_nameContext().getCe_1_identifier());
			this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe2_Text().setValue(orc_10_enteredBy[i].getXcn_16_nameContext().getCe_2_text());
			this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(orc_10_enteredBy[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(orc_10_enteredBy[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe5_AlternateText().setValue(orc_10_enteredBy[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.orc.getOrc10_EnteredBy(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(orc_10_enteredBy[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(orc_10_enteredBy[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(orc_10_enteredBy[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(orc_10_enteredBy[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.orc.getOrc10_EnteredBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(orc_10_enteredBy[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc10_EnteredBy(i).getXcn18_NameAssemblyOrder().setValue(orc_10_enteredBy[i].getXcn_18_nameAssemblyOrder());
			this.orc.getOrc10_EnteredBy(i).getXcn19_EffectiveDate().getTs1_Time().setValue(orc_10_enteredBy[i].getXcn_19_effectiveDate().getTs_1_time());
			this.orc.getOrc10_EnteredBy(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(orc_10_enteredBy[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc10_EnteredBy(i).getXcn20_ExpirationDate().getTs1_Time().setValue(orc_10_enteredBy[i].getXcn_20_expirationDate().getTs_1_time());
			this.orc.getOrc10_EnteredBy(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(orc_10_enteredBy[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc10_EnteredBy(i).getXcn21_ProfessionalSuffix().setValue(orc_10_enteredBy[i].getXcn_21_professionalSuffix());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc10_EnteredBy(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc10_EnteredBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(orc_10_enteredBy[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.orc_10_enteredBy = orc_10_enteredBy;
	}
	/**
	 * @return the orc_11_verifiedBy
	 */
	
	@JsonProperty("orc_11_verifiedBy")
	public XCN_v25[] getOrc_11_verifiedBy() {
		XCN_v25[] verifiedBy = new XCN_v25[this.orc.getOrc11_VerifiedBy().length];
		for(int i = 0; i<this.orc.getOrc11_VerifiedBy().length;i++) {
			verifiedBy[i] = new XCN_v25(
					this.orc.getOrc11_VerifiedBy(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.orc.getOrc11_VerifiedBy(i).getXcn3_GivenName().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn6_PrefixEgDR().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn7_DegreeEgMD().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.orc.getOrc11_VerifiedBy(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc11_VerifiedBy(i).getXcn10_NameTypeCode().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn12_CheckDigitScheme().getValue(),
					this.orc.getOrc11_VerifiedBy(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.orc.getOrc11_VerifiedBy(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc11_VerifiedBy(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.orc.getOrc11_VerifiedBy(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.orc.getOrc11_VerifiedBy(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.orc.getOrc11_VerifiedBy(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.orc.getOrc11_VerifiedBy(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return verifiedBy;
	}
	/**
	 * @param orc_11_verifiedBy the orc_11_verifiedBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_11_verifiedBy")
	public void setOrc_11_verifiedBy(XCN_v25[] orc_11_verifiedBy) throws DataTypeException {
		for(int i = 0; i<orc_11_verifiedBy.length;i++) {
			this.orc.getOrc11_VerifiedBy(i).getXcn1_IDNumber().setValue(orc_11_verifiedBy[i].getXcn_1_idNumber());
			this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn1_Surname().setValue(orc_11_verifiedBy[i].getXcn_2_familyName().getFn_1_surname());
			this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(orc_11_verifiedBy[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(orc_11_verifiedBy[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(orc_11_verifiedBy[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.orc.getOrc11_VerifiedBy(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(orc_11_verifiedBy[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.orc.getOrc11_VerifiedBy(i).getXcn3_GivenName().setValue(orc_11_verifiedBy[i].getXcn_3_givenName());
			this.orc.getOrc11_VerifiedBy(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(orc_11_verifiedBy[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.orc.getOrc11_VerifiedBy(i).getXcn5_SuffixEgJRorIII().setValue(orc_11_verifiedBy[i].getXcn_5_suffixegJrOrIii());
			this.orc.getOrc11_VerifiedBy(i).getXcn6_PrefixEgDR().setValue(orc_11_verifiedBy[i].getXcn_6_prefixegDr());
			this.orc.getOrc11_VerifiedBy(i).getXcn7_DegreeEgMD().setValue(orc_11_verifiedBy[i].getXcn_7_degreeegMd());
			this.orc.getOrc11_VerifiedBy(i).getXcn8_SourceTable().setValue(orc_11_verifiedBy[i].getXcn_8_sourceTable());
			this.orc.getOrc11_VerifiedBy(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(orc_11_verifiedBy[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.orc.getOrc11_VerifiedBy(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(orc_11_verifiedBy[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.orc.getOrc11_VerifiedBy(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(orc_11_verifiedBy[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.orc.getOrc11_VerifiedBy(i).getXcn10_NameTypeCode().setValue(orc_11_verifiedBy[i].getXcn_10_nameTypeCode());
			this.orc.getOrc11_VerifiedBy(i).getXcn11_IdentifierCheckDigit().setValue(orc_11_verifiedBy[i].getXcn_11_identifierCheckDigit());
			this.orc.getOrc11_VerifiedBy(i).getXcn12_CheckDigitScheme().setValue(orc_11_verifiedBy[i].getXcn_12_checkDigitScheme());
			this.orc.getOrc11_VerifiedBy(i).getXcn13_IdentifierTypeCode().setValue(orc_11_verifiedBy[i].getXcn_13_identifierTypeCode());
			this.orc.getOrc11_VerifiedBy(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(orc_11_verifiedBy[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.orc.getOrc11_VerifiedBy(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(orc_11_verifiedBy[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.orc.getOrc11_VerifiedBy(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(orc_11_verifiedBy[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.orc.getOrc11_VerifiedBy(i).getXcn15_NameRepresentationCode().setValue(orc_11_verifiedBy[i].getXcn_15_nameRepresentationCode());
			this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe1_Identifier().setValue(orc_11_verifiedBy[i].getXcn_16_nameContext().getCe_1_identifier());
			this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe2_Text().setValue(orc_11_verifiedBy[i].getXcn_16_nameContext().getCe_2_text());
			this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(orc_11_verifiedBy[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(orc_11_verifiedBy[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe5_AlternateText().setValue(orc_11_verifiedBy[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.orc.getOrc11_VerifiedBy(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(orc_11_verifiedBy[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(orc_11_verifiedBy[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(orc_11_verifiedBy[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(orc_11_verifiedBy[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.orc.getOrc11_VerifiedBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(orc_11_verifiedBy[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc11_VerifiedBy(i).getXcn18_NameAssemblyOrder().setValue(orc_11_verifiedBy[i].getXcn_18_nameAssemblyOrder());
			this.orc.getOrc11_VerifiedBy(i).getXcn19_EffectiveDate().getTs1_Time().setValue(orc_11_verifiedBy[i].getXcn_19_effectiveDate().getTs_1_time());
			this.orc.getOrc11_VerifiedBy(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(orc_11_verifiedBy[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc11_VerifiedBy(i).getXcn20_ExpirationDate().getTs1_Time().setValue(orc_11_verifiedBy[i].getXcn_20_expirationDate().getTs_1_time());
			this.orc.getOrc11_VerifiedBy(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(orc_11_verifiedBy[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc11_VerifiedBy(i).getXcn21_ProfessionalSuffix().setValue(orc_11_verifiedBy[i].getXcn_21_professionalSuffix());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc11_VerifiedBy(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc11_VerifiedBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(orc_11_verifiedBy[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.orc_11_verifiedBy = orc_11_verifiedBy;
	}
	/**
	 * @return the orc_12_orderingProvider
	 */
	
	@JsonProperty("orc_12_orderingProvider")
	public XCN_v25[] getOrc_12_orderingProvider() {
		XCN_v25[] orderingProvider = new XCN_v25[this.orc.getOrc12_OrderingProvider().length];
		for(int i = 0; i<this.orc.getOrc12_OrderingProvider().length;i++) {
			orderingProvider[i] = new XCN_v25(
					this.orc.getOrc12_OrderingProvider(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.orc.getOrc12_OrderingProvider(i).getXcn3_GivenName().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn6_PrefixEgDR().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn7_DegreeEgMD().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.orc.getOrc12_OrderingProvider(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc12_OrderingProvider(i).getXcn10_NameTypeCode().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn12_CheckDigitScheme().getValue(),
					this.orc.getOrc12_OrderingProvider(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.orc.getOrc12_OrderingProvider(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc12_OrderingProvider(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.orc.getOrc12_OrderingProvider(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.orc.getOrc12_OrderingProvider(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.orc.getOrc12_OrderingProvider(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.orc.getOrc12_OrderingProvider(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return orderingProvider;
	}
	/**
	 * @param orc_12_orderingProvider the orc_12_orderingProvider to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_12_orderingProvider")
	public void setOrc_12_orderingProvider(XCN_v25[] orc_12_orderingProvider) throws DataTypeException {
		for(int i = 0; i<orc_12_orderingProvider.length;i++) {
			this.orc.getOrc12_OrderingProvider(i).getXcn1_IDNumber().setValue(orc_12_orderingProvider[i].getXcn_1_idNumber());
			this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn1_Surname().setValue(orc_12_orderingProvider[i].getXcn_2_familyName().getFn_1_surname());
			this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(orc_12_orderingProvider[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(orc_12_orderingProvider[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(orc_12_orderingProvider[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.orc.getOrc12_OrderingProvider(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(orc_12_orderingProvider[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.orc.getOrc12_OrderingProvider(i).getXcn3_GivenName().setValue(orc_12_orderingProvider[i].getXcn_3_givenName());
			this.orc.getOrc12_OrderingProvider(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(orc_12_orderingProvider[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.orc.getOrc12_OrderingProvider(i).getXcn5_SuffixEgJRorIII().setValue(orc_12_orderingProvider[i].getXcn_5_suffixegJrOrIii());
			this.orc.getOrc12_OrderingProvider(i).getXcn6_PrefixEgDR().setValue(orc_12_orderingProvider[i].getXcn_6_prefixegDr());
			this.orc.getOrc12_OrderingProvider(i).getXcn7_DegreeEgMD().setValue(orc_12_orderingProvider[i].getXcn_7_degreeegMd());
			this.orc.getOrc12_OrderingProvider(i).getXcn8_SourceTable().setValue(orc_12_orderingProvider[i].getXcn_8_sourceTable());
			this.orc.getOrc12_OrderingProvider(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(orc_12_orderingProvider[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.orc.getOrc12_OrderingProvider(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(orc_12_orderingProvider[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.orc.getOrc12_OrderingProvider(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(orc_12_orderingProvider[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.orc.getOrc12_OrderingProvider(i).getXcn10_NameTypeCode().setValue(orc_12_orderingProvider[i].getXcn_10_nameTypeCode());
			this.orc.getOrc12_OrderingProvider(i).getXcn11_IdentifierCheckDigit().setValue(orc_12_orderingProvider[i].getXcn_11_identifierCheckDigit());
			this.orc.getOrc12_OrderingProvider(i).getXcn12_CheckDigitScheme().setValue(orc_12_orderingProvider[i].getXcn_12_checkDigitScheme());
			this.orc.getOrc12_OrderingProvider(i).getXcn13_IdentifierTypeCode().setValue(orc_12_orderingProvider[i].getXcn_13_identifierTypeCode());
			this.orc.getOrc12_OrderingProvider(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(orc_12_orderingProvider[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.orc.getOrc12_OrderingProvider(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(orc_12_orderingProvider[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.orc.getOrc12_OrderingProvider(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(orc_12_orderingProvider[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.orc.getOrc12_OrderingProvider(i).getXcn15_NameRepresentationCode().setValue(orc_12_orderingProvider[i].getXcn_15_nameRepresentationCode());
			this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe1_Identifier().setValue(orc_12_orderingProvider[i].getXcn_16_nameContext().getCe_1_identifier());
			this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe2_Text().setValue(orc_12_orderingProvider[i].getXcn_16_nameContext().getCe_2_text());
			this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(orc_12_orderingProvider[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(orc_12_orderingProvider[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe5_AlternateText().setValue(orc_12_orderingProvider[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.orc.getOrc12_OrderingProvider(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(orc_12_orderingProvider[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(orc_12_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(orc_12_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(orc_12_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.orc.getOrc12_OrderingProvider(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(orc_12_orderingProvider[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc12_OrderingProvider(i).getXcn18_NameAssemblyOrder().setValue(orc_12_orderingProvider[i].getXcn_18_nameAssemblyOrder());
			this.orc.getOrc12_OrderingProvider(i).getXcn19_EffectiveDate().getTs1_Time().setValue(orc_12_orderingProvider[i].getXcn_19_effectiveDate().getTs_1_time());
			this.orc.getOrc12_OrderingProvider(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(orc_12_orderingProvider[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc12_OrderingProvider(i).getXcn20_ExpirationDate().getTs1_Time().setValue(orc_12_orderingProvider[i].getXcn_20_expirationDate().getTs_1_time());
			this.orc.getOrc12_OrderingProvider(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(orc_12_orderingProvider[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc12_OrderingProvider(i).getXcn21_ProfessionalSuffix().setValue(orc_12_orderingProvider[i].getXcn_21_professionalSuffix());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc12_OrderingProvider(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc12_OrderingProvider(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(orc_12_orderingProvider[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.orc_12_orderingProvider = orc_12_orderingProvider;
	}
	/**
	 * @return the orc_13_enterersLocation
	 */
	
	@JsonProperty("orc_13_enterersLocation")
	public PL_v25 getOrc_13_enterersLocation() {
		return new PL_v25(
				this.orc.getOrc13_EntererSLocation().getPl1_PointOfCare().getValue(),
				this.orc.getOrc13_EntererSLocation().getPl2_Room().getValue(),
				this.orc.getOrc13_EntererSLocation().getPl3_Bed().getValue(),
				new HD_v2(
						this.orc.getOrc13_EntererSLocation().getPl4_Facility().getHd1_NamespaceID().getValue(),
						this.orc.getOrc13_EntererSLocation().getPl4_Facility().getHd2_UniversalID().getValue(),
						this.orc.getOrc13_EntererSLocation().getPl4_Facility().getHd3_UniversalIDType().getValue()),
				this.orc.getOrc13_EntererSLocation().getPl5_LocationStatus().getValue(),
				this.orc.getOrc13_EntererSLocation().getPl6_PersonLocationType().getValue(),
				this.orc.getOrc13_EntererSLocation().getPl7_Building().getValue(), 
				this.orc.getOrc13_EntererSLocation().getPl8_Floor().getValue(),
				this.orc.getOrc13_EntererSLocation().getPl9_LocationDescription().getValue(),
				new EI_v2(
						this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().getValue(),
						this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().getValue(),
						this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().getValue(),
						this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().getValue()),
				new HD_v2(
						this.orc.getOrc13_EntererSLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().getValue(),
						this.orc.getOrc13_EntererSLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().getValue(), 
						this.orc.getOrc13_EntererSLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().getValue()));
	}
	/**
	 * @param orc_13_enterersLocation the orc_13_enterersLocation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_13_enterersLocation")
	public void setOrc_13_enterersLocation(PL_v25 orc_13_enterersLocation) throws DataTypeException {
		this.orc.getOrc13_EntererSLocation().getPl1_PointOfCare().setValue(orc_13_enterersLocation.getPl_1_pointOfCare());
		this.orc.getOrc13_EntererSLocation().getPl2_Room().setValue(orc_13_enterersLocation.getPl_2_room());
		this.orc.getOrc13_EntererSLocation().getPl3_Bed().setValue(orc_13_enterersLocation.getPl_3_bed());
		this.orc.getOrc13_EntererSLocation().getPl4_Facility().getHd1_NamespaceID().setValue(orc_13_enterersLocation.getPl_4_facility().getHd_1_namespaceId());
		this.orc.getOrc13_EntererSLocation().getPl4_Facility().getHd2_UniversalID().setValue(orc_13_enterersLocation.getPl_4_facility().getHd_2_universalId());
		this.orc.getOrc13_EntererSLocation().getPl4_Facility().getHd3_UniversalIDType().setValue(orc_13_enterersLocation.getPl_4_facility().getHd_3_universalIdType());
		this.orc.getOrc13_EntererSLocation().getPl5_LocationStatus().setValue(orc_13_enterersLocation.getPl_5_locationStatus());
		this.orc.getOrc13_EntererSLocation().getPl6_PersonLocationType().setValue(orc_13_enterersLocation.getPl_6_personLocationType());
		this.orc.getOrc13_EntererSLocation().getPl7_Building().setValue(orc_13_enterersLocation.getPl_7_building());
		this.orc.getOrc13_EntererSLocation().getPl8_Floor().setValue(orc_13_enterersLocation.getPl_8_floor());
		this.orc.getOrc13_EntererSLocation().getPl9_LocationDescription().setValue(orc_13_enterersLocation.getPl_9_locationDescription());
		this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi1_EntityIdentifier().setValue(orc_13_enterersLocation.getPl_10_comprehensiveLocationIdentifier().getEi_1_entityIdentifier());
		this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi2_NamespaceID().setValue(orc_13_enterersLocation.getPl_10_comprehensiveLocationIdentifier().getEi_2_namespaceId());
		this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi3_UniversalID().setValue(orc_13_enterersLocation.getPl_10_comprehensiveLocationIdentifier().getEi_3_universalId());
		this.orc.getOrc13_EntererSLocation().getPl10_ComprehensiveLocationIdentifier().getEi4_UniversalIDType().setValue(orc_13_enterersLocation.getPl_10_comprehensiveLocationIdentifier().getEi_4_universalIdType());
		this.orc.getOrc13_EntererSLocation().getPl11_AssigningAuthorityForLocation().getHd1_NamespaceID().setValue(orc_13_enterersLocation.getPl_11_assigningAuthorityForLocation().getHd_1_namespaceId());
		this.orc.getOrc13_EntererSLocation().getPl11_AssigningAuthorityForLocation().getHd2_UniversalID().setValue(orc_13_enterersLocation.getPl_11_assigningAuthorityForLocation().getHd_2_universalId());
		this.orc.getOrc13_EntererSLocation().getPl11_AssigningAuthorityForLocation().getHd3_UniversalIDType().setValue(orc_13_enterersLocation.getPl_11_assigningAuthorityForLocation().getHd_3_universalIdType());
		this.orc_13_enterersLocation = orc_13_enterersLocation;
	}
	/**
	 * @return the orc_14_callBackPhoneNumber
	 */
	
	@JsonProperty("orc_14_callBackPhoneNumber")
	public XTN_v25[] getOrc_14_callBackPhoneNumber() {
		XTN_v25[] callBackPhoneNumber = new XTN_v25[this.orc.getOrc14_CallBackPhoneNumber().length];
		for(int i = 0; i<this.orc.getOrc14_CallBackPhoneNumber().length;i++) {
			callBackPhoneNumber[i] = new XTN_v25(
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn1_TelephoneNumber().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn4_EmailAddress().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn5_CountryCode().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn6_AreaCityCode().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn7_LocalNumber().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn8_Extension().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn9_AnyText().getValue(), 
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn10_ExtensionPrefix().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn11_SpeedDialCode().getValue(),
					this.orc.getOrc14_CallBackPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return callBackPhoneNumber;
	}
	/**
	 * @param orc_14_callBackPhoneNumber the orc_14_callBackPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_14_callBackPhoneNumber")
	public void setOrc_14_callBackPhoneNumber(XTN_v25[] orc_14_callBackPhoneNumber) throws DataTypeException {
		for(int i = 0; i<orc_14_callBackPhoneNumber.length;i++) {
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn1_TelephoneNumber().setValue(orc_14_callBackPhoneNumber[i].getXtn_1_telephoneNumber());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn2_TelecommunicationUseCode().setValue(orc_14_callBackPhoneNumber[i].getXtn_2_telecommunicationUseCode());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().setValue(orc_14_callBackPhoneNumber[i].getXtn_3_telecommunicationEquipmentType());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn4_EmailAddress().setValue(orc_14_callBackPhoneNumber[i].getXtn_4_emailAddress());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn5_CountryCode().setValue(orc_14_callBackPhoneNumber[i].getXtn_5_countryCode());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn6_AreaCityCode().setValue(orc_14_callBackPhoneNumber[i].getXtn_6_areaCityCode());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn7_LocalNumber().setValue(orc_14_callBackPhoneNumber[i].getXtn_7_localNumber());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn8_Extension().setValue(orc_14_callBackPhoneNumber[i].getXtn_8_extension());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn9_AnyText().setValue(orc_14_callBackPhoneNumber[i].getXtn_9_anyText());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn10_ExtensionPrefix().setValue(orc_14_callBackPhoneNumber[i].getXtn_10_extensionPrefix());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn11_SpeedDialCode().setValue(orc_14_callBackPhoneNumber[i].getXtn_11_SpeedDialCode());
			this.orc.getOrc14_CallBackPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().setValue(orc_14_callBackPhoneNumber[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.orc_14_callBackPhoneNumber = orc_14_callBackPhoneNumber;
	}
	/**
	 * @return the orc_15_orderEffectiveDateTime
	 */
	
	@JsonProperty("orc_15_orderEffectiveDateTime")
	public TS_v2 getOrc_15_orderEffectiveDateTime() {
		return new TS_v2(
				this.orc.getOrc15_OrderEffectiveDateTime().getTs1_Time().getValue(),
				this.orc.getOrc15_OrderEffectiveDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param orc_15_orderEffectiveDateTime the orc_15_orderEffectiveDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_15_orderEffectiveDateTime")
	public void setOrc_15_orderEffectiveDateTime(TS_v2 orc_15_orderEffectiveDateTime) throws DataTypeException {
		this.orc.getOrc15_OrderEffectiveDateTime().getTs1_Time().setValue(orc_15_orderEffectiveDateTime.getTs_1_time());
		this.orc.getOrc15_OrderEffectiveDateTime().getTs2_DegreeOfPrecision().setValue(orc_15_orderEffectiveDateTime.getTs_2_degreeOfPrecision());
		this.orc_15_orderEffectiveDateTime = orc_15_orderEffectiveDateTime;
	}
	/**
	 * @return the orc_16_orderControlCodeReason
	 */
	
	@JsonProperty("orc_16_orderControlCodeReason")
	public CE_v2 getOrc_16_orderControlCodeReason() {
		return new CE_v2(
				this.orc.getOrc16_OrderControlCodeReason().getCe1_Identifier().getValue(),
				this.orc.getOrc16_OrderControlCodeReason().getCe2_Text().getValue(),
				this.orc.getOrc16_OrderControlCodeReason().getCe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc16_OrderControlCodeReason().getCe4_AlternateIdentifier().getValue(),
				this.orc.getOrc16_OrderControlCodeReason().getCe5_AlternateText().getValue(),
				this.orc.getOrc16_OrderControlCodeReason().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param orc_16_orderControlCodeReason the orc_16_orderControlCodeReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_16_orderControlCodeReason")
	public void setOrc_16_orderControlCodeReason(CE_v2 orc_16_orderControlCodeReason) throws DataTypeException {
		this.orc.getOrc16_OrderControlCodeReason().getCe1_Identifier().setValue(orc_16_orderControlCodeReason.getCe_1_identifier());
		this.orc.getOrc16_OrderControlCodeReason().getCe2_Text().setValue(orc_16_orderControlCodeReason.getCe_2_text());
		this.orc.getOrc16_OrderControlCodeReason().getCe3_NameOfCodingSystem().setValue(orc_16_orderControlCodeReason.getCe_3_nameOfCodingSystem());
		this.orc.getOrc16_OrderControlCodeReason().getCe4_AlternateIdentifier().setValue(orc_16_orderControlCodeReason.getCe_4_alternateIdentifier());
		this.orc.getOrc16_OrderControlCodeReason().getCe5_AlternateText().setValue(orc_16_orderControlCodeReason.getCe_5_alternateText());
		this.orc.getOrc16_OrderControlCodeReason().getCe6_NameOfAlternateCodingSystem().setValue(orc_16_orderControlCodeReason.getCe_6_nameOfAlternateCodingSystem());
		this.orc_16_orderControlCodeReason = orc_16_orderControlCodeReason;
	}
	/**
	 * @return the orc_17_enteringOrganization
	 */
	
	@JsonProperty("orc_17_enteringOrganization")
	public CE_v2 getOrc_17_enteringOrganization() {
		return new CE_v2(
				this.orc.getOrc17_EnteringOrganization().getCe1_Identifier().getValue(),
				this.orc.getOrc17_EnteringOrganization().getCe2_Text().getValue(),
				this.orc.getOrc17_EnteringOrganization().getCe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc17_EnteringOrganization().getCe4_AlternateIdentifier().getValue(),
				this.orc.getOrc17_EnteringOrganization().getCe5_AlternateText().getValue(),
				this.orc.getOrc17_EnteringOrganization().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param orc_17_enteringOrganization the orc_17_enteringOrganization to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_17_enteringOrganization")
	public void setOrc_17_enteringOrganization(CE_v2 orc_17_enteringOrganization) throws DataTypeException {
		this.orc.getOrc17_EnteringOrganization().getCe1_Identifier().setValue(orc_17_enteringOrganization.getCe_1_identifier());
		this.orc.getOrc17_EnteringOrganization().getCe2_Text().setValue(orc_17_enteringOrganization.getCe_2_text());
		this.orc.getOrc17_EnteringOrganization().getCe3_NameOfCodingSystem().setValue(orc_17_enteringOrganization.getCe_3_nameOfCodingSystem());
		this.orc.getOrc17_EnteringOrganization().getCe4_AlternateIdentifier().setValue(orc_17_enteringOrganization.getCe_4_alternateIdentifier());
		this.orc.getOrc17_EnteringOrganization().getCe5_AlternateText().setValue(orc_17_enteringOrganization.getCe_5_alternateText());
		this.orc.getOrc17_EnteringOrganization().getCe6_NameOfAlternateCodingSystem().setValue(orc_17_enteringOrganization.getCe_6_nameOfAlternateCodingSystem());
		this.orc_17_enteringOrganization = orc_17_enteringOrganization;
	}
	/**
	 * @return the orc_18_enteringDevice
	 */
	
	@JsonProperty("orc_18_enteringDevice")
	public CE_v2 getOrc_18_enteringDevice() {
		return new CE_v2(
				this.orc.getOrc18_EnteringDevice().getCe1_Identifier().getValue(),
				this.orc.getOrc18_EnteringDevice().getCe2_Text().getValue(),
				this.orc.getOrc18_EnteringDevice().getCe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc18_EnteringDevice().getCe4_AlternateIdentifier().getValue(),
				this.orc.getOrc18_EnteringDevice().getCe5_AlternateText().getValue(),
				this.orc.getOrc18_EnteringDevice().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param orc_18_enteringDevice the orc_18_enteringDevice to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_18_enteringDevice")
	public void setOrc_18_enteringDevice(CE_v2 orc_18_enteringDevice) throws DataTypeException {
		this.orc.getOrc18_EnteringDevice().getCe1_Identifier().setValue(orc_18_enteringDevice.getCe_1_identifier());
		this.orc.getOrc18_EnteringDevice().getCe2_Text().setValue(orc_18_enteringDevice.getCe_2_text());
		this.orc.getOrc18_EnteringDevice().getCe3_NameOfCodingSystem().setValue(orc_18_enteringDevice.getCe_3_nameOfCodingSystem());
		this.orc.getOrc18_EnteringDevice().getCe4_AlternateIdentifier().setValue(orc_18_enteringDevice.getCe_4_alternateIdentifier());
		this.orc.getOrc18_EnteringDevice().getCe5_AlternateText().setValue(orc_18_enteringDevice.getCe_5_alternateText());
		this.orc.getOrc18_EnteringDevice().getCe6_NameOfAlternateCodingSystem().setValue(orc_18_enteringDevice.getCe_6_nameOfAlternateCodingSystem());
		this.orc_18_enteringDevice = orc_18_enteringDevice;
	}
	/**
	 * @return the orc_19_actionBy
	 */
	
	@JsonProperty("orc_19_actionBy")
	public XCN_v25[] getOrc_19_actionBy() {
		XCN_v25[] actionBy = new XCN_v25[this.orc.getOrc19_ActionBy().length];
		for(int i = 0; i<this.orc.getOrc19_ActionBy().length;i++) {
			actionBy[i] = new XCN_v25(
					this.orc.getOrc19_ActionBy(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.orc.getOrc19_ActionBy(i).getXcn3_GivenName().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn6_PrefixEgDR().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn7_DegreeEgMD().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.orc.getOrc19_ActionBy(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc19_ActionBy(i).getXcn10_NameTypeCode().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn12_CheckDigitScheme().getValue(),
					this.orc.getOrc19_ActionBy(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.orc.getOrc19_ActionBy(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc19_ActionBy(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.orc.getOrc19_ActionBy(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.orc.getOrc19_ActionBy(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.orc.getOrc19_ActionBy(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.orc.getOrc19_ActionBy(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return actionBy;
	}
	/**
	 * @param orc_19_actionBy the orc_19_actionBy to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_19_actionBy")
	public void setOrc_19_actionBy(XCN_v25[] orc_19_actionBy) throws DataTypeException {
		for(int i = 0; i<orc_19_actionBy.length;i++) {
			this.orc.getOrc19_ActionBy(i).getXcn1_IDNumber().setValue(orc_19_actionBy[i].getXcn_1_idNumber());
			this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn1_Surname().setValue(orc_19_actionBy[i].getXcn_2_familyName().getFn_1_surname());
			this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(orc_19_actionBy[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(orc_19_actionBy[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(orc_19_actionBy[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.orc.getOrc19_ActionBy(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(orc_19_actionBy[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.orc.getOrc19_ActionBy(i).getXcn3_GivenName().setValue(orc_19_actionBy[i].getXcn_3_givenName());
			this.orc.getOrc19_ActionBy(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(orc_19_actionBy[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.orc.getOrc19_ActionBy(i).getXcn5_SuffixEgJRorIII().setValue(orc_19_actionBy[i].getXcn_5_suffixegJrOrIii());
			this.orc.getOrc19_ActionBy(i).getXcn6_PrefixEgDR().setValue(orc_19_actionBy[i].getXcn_6_prefixegDr());
			this.orc.getOrc19_ActionBy(i).getXcn7_DegreeEgMD().setValue(orc_19_actionBy[i].getXcn_7_degreeegMd());
			this.orc.getOrc19_ActionBy(i).getXcn8_SourceTable().setValue(orc_19_actionBy[i].getXcn_8_sourceTable());
			this.orc.getOrc19_ActionBy(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(orc_19_actionBy[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.orc.getOrc19_ActionBy(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(orc_19_actionBy[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.orc.getOrc19_ActionBy(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(orc_19_actionBy[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.orc.getOrc19_ActionBy(i).getXcn10_NameTypeCode().setValue(orc_19_actionBy[i].getXcn_10_nameTypeCode());
			this.orc.getOrc19_ActionBy(i).getXcn11_IdentifierCheckDigit().setValue(orc_19_actionBy[i].getXcn_11_identifierCheckDigit());
			this.orc.getOrc19_ActionBy(i).getXcn12_CheckDigitScheme().setValue(orc_19_actionBy[i].getXcn_12_checkDigitScheme());
			this.orc.getOrc19_ActionBy(i).getXcn13_IdentifierTypeCode().setValue(orc_19_actionBy[i].getXcn_13_identifierTypeCode());
			this.orc.getOrc19_ActionBy(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(orc_19_actionBy[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.orc.getOrc19_ActionBy(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(orc_19_actionBy[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.orc.getOrc19_ActionBy(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(orc_19_actionBy[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.orc.getOrc19_ActionBy(i).getXcn15_NameRepresentationCode().setValue(orc_19_actionBy[i].getXcn_15_nameRepresentationCode());
			this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe1_Identifier().setValue(orc_19_actionBy[i].getXcn_16_nameContext().getCe_1_identifier());
			this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe2_Text().setValue(orc_19_actionBy[i].getXcn_16_nameContext().getCe_2_text());
			this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(orc_19_actionBy[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(orc_19_actionBy[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe5_AlternateText().setValue(orc_19_actionBy[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.orc.getOrc19_ActionBy(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(orc_19_actionBy[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(orc_19_actionBy[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(orc_19_actionBy[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(orc_19_actionBy[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.orc.getOrc19_ActionBy(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(orc_19_actionBy[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc19_ActionBy(i).getXcn18_NameAssemblyOrder().setValue(orc_19_actionBy[i].getXcn_18_nameAssemblyOrder());
			this.orc.getOrc19_ActionBy(i).getXcn19_EffectiveDate().getTs1_Time().setValue(orc_19_actionBy[i].getXcn_19_effectiveDate().getTs_1_time());
			this.orc.getOrc19_ActionBy(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(orc_19_actionBy[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc19_ActionBy(i).getXcn20_ExpirationDate().getTs1_Time().setValue(orc_19_actionBy[i].getXcn_20_expirationDate().getTs_1_time());
			this.orc.getOrc19_ActionBy(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(orc_19_actionBy[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc19_ActionBy(i).getXcn21_ProfessionalSuffix().setValue(orc_19_actionBy[i].getXcn_21_professionalSuffix());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc19_ActionBy(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.orc.getOrc19_ActionBy(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(orc_19_actionBy[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.orc_19_actionBy = orc_19_actionBy;
	}
	/**
	 * @return the orc_20_advancedBeneficiaryNoticeCode
	 */
	
	@JsonProperty("orc_20_advancedBeneficiaryNoticeCode")
	public CE_v2 getOrc_20_advancedBeneficiaryNoticeCode() {
		return new CE_v2(
				this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe1_Identifier().getValue(),
				this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe2_Text().getValue(),
				this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe4_AlternateIdentifier().getValue(),
				this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe5_AlternateText().getValue(),
				this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param orc_20_advancedBeneficiaryNoticeCode the orc_20_advancedBeneficiaryNoticeCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_20_advancedBeneficiaryNoticeCode")
	public void setOrc_20_advancedBeneficiaryNoticeCode(CE_v2 orc_20_advancedBeneficiaryNoticeCode) throws DataTypeException {
		this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe1_Identifier().setValue(orc_20_advancedBeneficiaryNoticeCode.getCe_1_identifier());
		this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe2_Text().setValue(orc_20_advancedBeneficiaryNoticeCode.getCe_2_text());
		this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe3_NameOfCodingSystem().setValue(orc_20_advancedBeneficiaryNoticeCode.getCe_3_nameOfCodingSystem());
		this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe4_AlternateIdentifier().setValue(orc_20_advancedBeneficiaryNoticeCode.getCe_4_alternateIdentifier());
		this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe5_AlternateText().setValue(orc_20_advancedBeneficiaryNoticeCode.getCe_5_alternateText());
		this.orc.getOrc20_AdvancedBeneficiaryNoticeCode().getCe6_NameOfAlternateCodingSystem().setValue(orc_20_advancedBeneficiaryNoticeCode.getCe_6_nameOfAlternateCodingSystem());
		this.orc_20_advancedBeneficiaryNoticeCode = orc_20_advancedBeneficiaryNoticeCode;
	}
	/**
	 * @return the orc_21_orderingFacilityName
	 */
	
	@JsonProperty("orc_21_orderingFacilityName")
	public XON_v25[] getOrc_21_orderingFacilityName() {
		XON_v25[] orderingFacilityName = new XON_v25[this.orc.getOrc21_OrderingFacilityName().length];
		for(int i = 0; i<this.orc.getOrc21_OrderingFacilityName().length; i++) {
			orderingFacilityName[i] = new XON_v25(
					this.orc.getOrc21_OrderingFacilityName(i).getXon1_OrganizationName().getValue(),
					this.orc.getOrc21_OrderingFacilityName(i).getXon2_OrganizationNameTypeCode().getValue(), 
					this.orc.getOrc21_OrderingFacilityName(i).getXon3_IDNumber().getValue(), 
					this.orc.getOrc21_OrderingFacilityName(i).getXon4_CheckDigit().getValue(), 
					this.orc.getOrc21_OrderingFacilityName(i).getXon5_CheckDigitScheme().getValue(), 
					new HD_v2(
							this.orc.getOrc21_OrderingFacilityName(i).getXon6_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.orc.getOrc21_OrderingFacilityName(i).getXon6_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.orc.getOrc21_OrderingFacilityName(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().getValue()), 
					this.orc.getOrc21_OrderingFacilityName(i).getXon7_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.orc.getOrc21_OrderingFacilityName(i).getXon8_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.orc.getOrc21_OrderingFacilityName(i).getXon8_AssigningFacility().getHd2_UniversalID().getValue(),
							this.orc.getOrc21_OrderingFacilityName(i).getXon8_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.orc.getOrc21_OrderingFacilityName(i).getXon9_NameRepresentationCode().getValue(),
					this.orc.getOrc21_OrderingFacilityName(i).getXon10_OrganizationIdentifier().getValue());
		}
		return orderingFacilityName;
	}
	/**
	 * @param orc_21_orderingFacilityName the orc_21_orderingFacilityName to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_21_orderingFacilityName")
	public void setOrc_21_orderingFacilityName(XON_v25[] orc_21_orderingFacilityName) throws DataTypeException {
		for(int i = 0; i<this.orc.getOrc21_OrderingFacilityName().length; i++) {
			this.orc.getOrc21_OrderingFacilityName(i).getXon1_OrganizationName().setValue(orc_21_orderingFacilityName[i].getXon_1_organizationName());
			this.orc.getOrc21_OrderingFacilityName(i).getXon2_OrganizationNameTypeCode().setValue(orc_21_orderingFacilityName[i].getXon_2_organizationNameTypeCode()); 
			this.orc.getOrc21_OrderingFacilityName(i).getXon3_IDNumber().setValue(orc_21_orderingFacilityName[i].getXon_3_idNumber());
			this.orc.getOrc21_OrderingFacilityName(i).getXon4_CheckDigit().setValue(orc_21_orderingFacilityName[i].getXon_4_checkDigit());
			this.orc.getOrc21_OrderingFacilityName(i).getXon5_CheckDigitScheme().setValue(orc_21_orderingFacilityName[i].getXon_5_checkDigitScheme());
			this.orc.getOrc21_OrderingFacilityName(i).getXon6_AssigningAuthority().getHd1_NamespaceID().setValue(orc_21_orderingFacilityName[i].getXon_6_assigningAuthority().getHd_1_namespaceId());
			this.orc.getOrc21_OrderingFacilityName(i).getXon6_AssigningAuthority().getHd2_UniversalID().setValue(orc_21_orderingFacilityName[i].getXon_6_assigningAuthority().getHd_2_universalId());
			this.orc.getOrc21_OrderingFacilityName(i).getXon6_AssigningAuthority().getHd3_UniversalIDType().setValue(orc_21_orderingFacilityName[i].getXon_6_assigningAuthority().getHd_3_universalIdType());
			this.orc.getOrc21_OrderingFacilityName(i).getXon7_IdentifierTypeCode().setValue(orc_21_orderingFacilityName[i].getXon_7_identifierTypeCode());
			this.orc.getOrc21_OrderingFacilityName(i).getXon8_AssigningFacility().getHd1_NamespaceID().setValue(orc_21_orderingFacilityName[i].getXon_8_assigningFacility().getHd_1_namespaceId());
			this.orc.getOrc21_OrderingFacilityName(i).getXon8_AssigningFacility().getHd2_UniversalID().setValue(orc_21_orderingFacilityName[i].getXon_8_assigningFacility().getHd_2_universalId());
			this.orc.getOrc21_OrderingFacilityName(i).getXon8_AssigningFacility().getHd3_UniversalIDType().setValue(orc_21_orderingFacilityName[i].getXon_8_assigningFacility().getHd_3_universalIdType());
			this.orc.getOrc21_OrderingFacilityName(i).getXon9_NameRepresentationCode().setValue(orc_21_orderingFacilityName[i].getXon_9_nameRepresentationCode());
			this.orc.getOrc21_OrderingFacilityName(i).getXon10_OrganizationIdentifier().setValue(orc_21_orderingFacilityName[i].getXon_10_organizationIdentifier());
		}
		this.orc_21_orderingFacilityName = orc_21_orderingFacilityName;
	}
	/**
	 * @return the orc_22_orderingFacilityAddress
	 */
	
	@JsonProperty("orc_22_orderingFacilityAddress")
	public XAD_v25[] getOrc_22_orderingFacilityAddress() {
		XAD_v25[] orderingFacilityAddress = new XAD_v25[this.orc.getOrc22_OrderingFacilityAddress().length];
		for(int i = 0; i < this.orc.getOrc22_OrderingFacilityAddress().length;i++) {
			orderingFacilityAddress[i] = new XAD_v25(
					new SAD_v25(
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue(),
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad1_StreetAddress().getSad2_StreetName().getValue(),
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad2_OtherDesignation().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad3_City().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad4_StateOrProvince().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad5_ZipOrPostalCode().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad6_Country().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad7_AddressType().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad8_OtherGeographicDesignation().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad9_CountyParishCode().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad10_CensusTract().getValue(),
					this.orc.getOrc22_OrderingFacilityAddress(i).getXad11_AddressRepresentationCode().getValue(), 
					new DR_v2(
							new TS_v2(
									this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					new TS_v2(
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad13_EffectiveDate().getTs1_Time().getValue(),
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad14_ExpirationDate().getTs1_Time().getValue(),
							this.orc.getOrc22_OrderingFacilityAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()));
		}
		return orderingFacilityAddress;
	}
	/**
	 * @param orc_22_orderingFacilityAddress the orc_22_orderingFacilityAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_22_orderingFacilityAddress")
	public void setOrc_22_orderingFacilityAddress(XAD_v25[] orc_22_orderingFacilityAddress) throws DataTypeException {
		for(int i = 0; i < this.orc.getOrc22_OrderingFacilityAddress().length;i++) {
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().setValue(orc_22_orderingFacilityAddress[i].getXad_1_streetAddress().getSad_1_streetOrMailingAddress());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad1_StreetAddress().getSad2_StreetName().setValue(orc_22_orderingFacilityAddress[i].getXad_1_streetAddress().getSad_2_streetName());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().setValue(orc_22_orderingFacilityAddress[i].getXad_1_streetAddress().getSad_3_dwellingNumber());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad2_OtherDesignation().setValue(orc_22_orderingFacilityAddress[i].getXad_2_otherDesignation());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad3_City().setValue(orc_22_orderingFacilityAddress[i].getXad_3_city());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad4_StateOrProvince().setValue(orc_22_orderingFacilityAddress[i].getXad_4_stateOrProvince());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad5_ZipOrPostalCode().setValue(orc_22_orderingFacilityAddress[i].getXad_5_zipOrPostalCode());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad6_Country().setValue(orc_22_orderingFacilityAddress[i].getXad_6_country());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad7_AddressType().setValue(orc_22_orderingFacilityAddress[i].getXad_7_addressType());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad8_OtherGeographicDesignation().setValue(orc_22_orderingFacilityAddress[i].getXad_8_otherGeographicDesignation());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad9_CountyParishCode().setValue(orc_22_orderingFacilityAddress[i].getXad_9_countyParishCode());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad10_CensusTract().setValue(orc_22_orderingFacilityAddress[i].getXad_10_censusTract());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad11_AddressRepresentationCode().setValue(orc_22_orderingFacilityAddress[i].getXad_11_addressRepresentationCode());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(orc_22_orderingFacilityAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(orc_22_orderingFacilityAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(orc_22_orderingFacilityAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(orc_22_orderingFacilityAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad13_EffectiveDate().getTs1_Time().setValue(orc_22_orderingFacilityAddress[i].getXad_13_effectiveDate().getTs_1_time());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().setValue(orc_22_orderingFacilityAddress[i].getXad_13_effectiveDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad14_ExpirationDate().getTs1_Time().setValue(orc_22_orderingFacilityAddress[i].getXad_14_expirationDate().getTs_1_time());
			this.orc.getOrc22_OrderingFacilityAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().setValue(orc_22_orderingFacilityAddress[i].getXad_14_expirationDate().getTs_2_degreeOfPrecision());
		}
		this.orc_22_orderingFacilityAddress = orc_22_orderingFacilityAddress;
	}
	/**
	 * @return the orc_23_orderingFacilityPhoneNumber
	 */
	
	@JsonProperty("orc_23_orderingFacilityPhoneNumber")
	public XTN_v25[] getOrc_23_orderingFacilityPhoneNumber() {
		XTN_v25[] orderingFacilityPhoneNumber = new XTN_v25[this.orc.getOrc23_OrderingFacilityPhoneNumber().length];
		for(int i = 0; i<this.orc.getOrc23_OrderingFacilityPhoneNumber().length;i++) {
			orderingFacilityPhoneNumber[i] = new XTN_v25(
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn1_TelephoneNumber().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn2_TelecommunicationUseCode().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn4_EmailAddress().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn5_CountryCode().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn6_AreaCityCode().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn7_LocalNumber().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn8_Extension().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn9_AnyText().getValue(), 
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn10_ExtensionPrefix().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn11_SpeedDialCode().getValue(),
					this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().getValue());
		}
		return orderingFacilityPhoneNumber;
	}
	/**
	 * @param orc_23_orderingFacilityPhoneNumber the orc_23_orderingFacilityPhoneNumber to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_23_orderingFacilityPhoneNumber")
	public void setOrc_23_orderingFacilityPhoneNumber(XTN_v25[] orc_23_orderingFacilityPhoneNumber) throws DataTypeException {
		for(int i = 0; i<orc_23_orderingFacilityPhoneNumber.length;i++) {
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn1_TelephoneNumber().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_1_telephoneNumber());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn2_TelecommunicationUseCode().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_2_telecommunicationUseCode());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn3_TelecommunicationEquipmentType().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_3_telecommunicationEquipmentType());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn4_EmailAddress().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_4_emailAddress());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn5_CountryCode().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_5_countryCode());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn6_AreaCityCode().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_6_areaCityCode());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn7_LocalNumber().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_7_localNumber());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn8_Extension().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_8_extension());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn9_AnyText().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_9_anyText());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn10_ExtensionPrefix().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_10_extensionPrefix());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn11_SpeedDialCode().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_11_SpeedDialCode());
			this.orc.getOrc23_OrderingFacilityPhoneNumber(i).getXtn12_UnformattedTelephoneNumber().setValue(orc_23_orderingFacilityPhoneNumber[i].getXtn_12_unformattedTelephoneNumber());
		}
		this.orc_23_orderingFacilityPhoneNumber = orc_23_orderingFacilityPhoneNumber;
	}
	/**
	 * @return the orc_24_orderingProviderAddress
	 *	@JsonProperty("orc_24_orderingProviderAddress")
	 */
	
	public XAD_v25[] getOrc_24_orderingProviderAddress() {
		XAD_v25[] orderingProviderAddress = new XAD_v25[this.orc.getOrc24_OrderingProviderAddress().length];
		for(int i = 0; i < this.orc.getOrc24_OrderingProviderAddress().length;i++) {
			orderingProviderAddress[i] = new XAD_v25(
					new SAD_v25(
							this.orc.getOrc24_OrderingProviderAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().getValue(),
							this.orc.getOrc24_OrderingProviderAddress(i).getXad1_StreetAddress().getSad2_StreetName().getValue(),
							this.orc.getOrc24_OrderingProviderAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().getValue()),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad2_OtherDesignation().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad3_City().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad4_StateOrProvince().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad5_ZipOrPostalCode().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad6_Country().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad7_AddressType().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad8_OtherGeographicDesignation().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad9_CountyParishCode().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad10_CensusTract().getValue(),
					this.orc.getOrc24_OrderingProviderAddress(i).getXad11_AddressRepresentationCode().getValue(), 
					new DR_v2(
							new TS_v2(
									this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(),
									this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(), 
									this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					new TS_v2(
							this.orc.getOrc24_OrderingProviderAddress(i).getXad13_EffectiveDate().getTs1_Time().getValue(),
							this.orc.getOrc24_OrderingProviderAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().getValue()), 
					new TS_v2(
							this.orc.getOrc24_OrderingProviderAddress(i).getXad14_ExpirationDate().getTs1_Time().getValue(),
							this.orc.getOrc24_OrderingProviderAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().getValue()));
		}
		return orderingProviderAddress;
	}
	/**
	 * @param orc_24_orderingProviderAddress the orc_24_orderingProviderAddress to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_24_orderingProviderAddress")
	public void setOrc_24_orderingProviderAddress(XAD_v25[] orc_24_orderingProviderAddress) throws DataTypeException {
		for(int i = 0; i < this.orc.getOrc24_OrderingProviderAddress().length;i++) {
			this.orc.getOrc24_OrderingProviderAddress(i).getXad1_StreetAddress().getSad1_StreetOrMailingAddress().setValue(orc_24_orderingProviderAddress[i].getXad_1_streetAddress().getSad_1_streetOrMailingAddress());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad1_StreetAddress().getSad2_StreetName().setValue(orc_24_orderingProviderAddress[i].getXad_1_streetAddress().getSad_2_streetName());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad1_StreetAddress().getSad3_DwellingNumber().setValue(orc_24_orderingProviderAddress[i].getXad_1_streetAddress().getSad_3_dwellingNumber());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad2_OtherDesignation().setValue(orc_24_orderingProviderAddress[i].getXad_2_otherDesignation());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad3_City().setValue(orc_24_orderingProviderAddress[i].getXad_3_city());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad4_StateOrProvince().setValue(orc_24_orderingProviderAddress[i].getXad_4_stateOrProvince());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad5_ZipOrPostalCode().setValue(orc_24_orderingProviderAddress[i].getXad_5_zipOrPostalCode());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad6_Country().setValue(orc_24_orderingProviderAddress[i].getXad_6_country());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad7_AddressType().setValue(orc_24_orderingProviderAddress[i].getXad_7_addressType());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad8_OtherGeographicDesignation().setValue(orc_24_orderingProviderAddress[i].getXad_8_otherGeographicDesignation());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad9_CountyParishCode().setValue(orc_24_orderingProviderAddress[i].getXad_9_countyParishCode());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad10_CensusTract().setValue(orc_24_orderingProviderAddress[i].getXad_10_censusTract());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad11_AddressRepresentationCode().setValue(orc_24_orderingProviderAddress[i].getXad_11_addressRepresentationCode());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(orc_24_orderingProviderAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(orc_24_orderingProviderAddress[i].getXad_12_addressValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(orc_24_orderingProviderAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad12_AddressValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(orc_24_orderingProviderAddress[i].getXad_12_addressValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad13_EffectiveDate().getTs1_Time().setValue(orc_24_orderingProviderAddress[i].getXad_13_effectiveDate().getTs_1_time());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad13_EffectiveDate().getTs2_DegreeOfPrecision().setValue(orc_24_orderingProviderAddress[i].getXad_13_effectiveDate().getTs_2_degreeOfPrecision());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad14_ExpirationDate().getTs1_Time().setValue(orc_24_orderingProviderAddress[i].getXad_14_expirationDate().getTs_1_time());
			this.orc.getOrc24_OrderingProviderAddress(i).getXad14_ExpirationDate().getTs2_DegreeOfPrecision().setValue(orc_24_orderingProviderAddress[i].getXad_14_expirationDate().getTs_2_degreeOfPrecision());
		}
		this.orc_24_orderingProviderAddress = orc_24_orderingProviderAddress;
	}
	/**
	 * @return the orc_25_orderStatusModifier
	 */
	
	@JsonProperty("orc_25_orderStatusModifier")
	public CWE_v25 getOrc_25_orderStatusModifier() {
		return new CWE_v25(
				this.orc.getOrc25_OrderStatusModifier().getCwe1_Identifier().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe2_Text().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe4_AlternateIdentifier().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe5_AlternateText().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe7_CodingSystemVersionID().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.orc.getOrc25_OrderStatusModifier().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param orc_25_orderStatusModifier the orc_25_orderStatusModifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_25_orderStatusModifier")
	public void setOrc_25_orderStatusModifier(CWE_v25 orc_25_orderStatusModifier) throws DataTypeException {
		this.orc.getOrc25_OrderStatusModifier().getCwe1_Identifier().setValue(orc_25_orderStatusModifier.getCwe_1_identifier());
		this.orc.getOrc25_OrderStatusModifier().getCwe2_Text().setValue(orc_25_orderStatusModifier.getCwe_2_text());
		this.orc.getOrc25_OrderStatusModifier().getCwe3_NameOfCodingSystem().setValue(orc_25_orderStatusModifier.getCwe_3_nameOfCodingSystem());
		this.orc.getOrc25_OrderStatusModifier().getCwe4_AlternateIdentifier().setValue(orc_25_orderStatusModifier.getCwe_4_alternateIdentifier());
		this.orc.getOrc25_OrderStatusModifier().getCwe5_AlternateText().setValue(orc_25_orderStatusModifier.getCwe_5_alternateText());
		this.orc.getOrc25_OrderStatusModifier().getCwe6_NameOfAlternateCodingSystem().setValue(orc_25_orderStatusModifier.getCwe_6_nameOfAlternateCodingSystem());
		this.orc.getOrc25_OrderStatusModifier().getCwe7_CodingSystemVersionID().setValue(orc_25_orderStatusModifier.getCwe_7_codingSystemVersionId());
		this.orc.getOrc25_OrderStatusModifier().getCwe8_AlternateCodingSystemVersionID().setValue(orc_25_orderStatusModifier.getCwe_8_alternateCodingSystemVersionId());
		this.orc.getOrc25_OrderStatusModifier().getCwe9_OriginalText().setValue(orc_25_orderStatusModifier.getCwe_9_originalText());
		this.orc_25_orderStatusModifier = orc_25_orderStatusModifier;
	}
	/**
	 * @return the orc_26_advancedBeneficiaryNoticeOverrideReason
	 */
	
	@JsonProperty("orc_26_advancedBeneficiaryNoticeOverrideReason")
	public CWE_v25 getOrc_26_advancedBeneficiaryNoticeOverrideReason() {
		return new CWE_v25(
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe1_Identifier().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe2_Text().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe4_AlternateIdentifier().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe5_AlternateText().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe7_CodingSystemVersionID().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param orc_26_advancedBeneficiaryNoticeOverrideReason the orc_26_advancedBeneficiaryNoticeOverrideReason to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_26_advancedBeneficiaryNoticeOverrideReason")
	public void setOrc_26_advancedBeneficiaryNoticeOverrideReason(CWE_v25 orc_26_advancedBeneficiaryNoticeOverrideReason) throws DataTypeException {
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe1_Identifier().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_1_identifier());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe2_Text().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_2_text());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe3_NameOfCodingSystem().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_3_nameOfCodingSystem());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe4_AlternateIdentifier().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_4_alternateIdentifier());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe5_AlternateText().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_5_alternateText());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe6_NameOfAlternateCodingSystem().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_6_nameOfAlternateCodingSystem());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe7_CodingSystemVersionID().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_7_codingSystemVersionId());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe8_AlternateCodingSystemVersionID().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_8_alternateCodingSystemVersionId());
		this.orc.getOrc26_AdvancedBeneficiaryNoticeOverrideReason().getCwe9_OriginalText().setValue(orc_26_advancedBeneficiaryNoticeOverrideReason.getCwe_9_originalText());
		this.orc_26_advancedBeneficiaryNoticeOverrideReason = orc_26_advancedBeneficiaryNoticeOverrideReason;
	}
	/**
	 * @return the orc_27_fillersExpectedAvailabilityDateTime
	 */
	
	@JsonProperty("orc_27_fillersExpectedAvailabilityDateTime")
	public TS_v2 getOrc_27_fillersExpectedAvailabilityDateTime() {
		return new TS_v2(
				this.orc.getOrc27_FillerSExpectedAvailabilityDateTime().getTs1_Time().getValue(),
				this.orc.getOrc27_FillerSExpectedAvailabilityDateTime().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param orc_27_fillersExpectedAvailabilityDateTime the orc_27_fillersExpectedAvailabilityDateTime to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_27_fillersExpectedAvailabilityDateTime")
	public void setOrc_27_fillersExpectedAvailabilityDateTime(TS_v2 orc_27_fillersExpectedAvailabilityDateTime) throws DataTypeException {
		this.orc.getOrc27_FillerSExpectedAvailabilityDateTime().getTs1_Time().setValue(orc_27_fillersExpectedAvailabilityDateTime.getTs_1_time());
		this.orc.getOrc27_FillerSExpectedAvailabilityDateTime().getTs2_DegreeOfPrecision().setValue(orc_27_fillersExpectedAvailabilityDateTime.getTs_2_degreeOfPrecision());
		this.orc_27_fillersExpectedAvailabilityDateTime = orc_27_fillersExpectedAvailabilityDateTime;
	}
	/**
	 * @return the orc_28_confidentialityCode
	 */
	
	@JsonProperty("orc_28_confidentialityCode")
	public CWE_v25 getOrc_28_confidentialityCode() {
		return new CWE_v25(
				this.orc.getOrc28_ConfidentialityCode().getCwe1_Identifier().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe2_Text().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe4_AlternateIdentifier().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe5_AlternateText().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe7_CodingSystemVersionID().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.orc.getOrc28_ConfidentialityCode().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param orc_28_confidentialityCode the orc_28_confidentialityCode to set
	 * @throws DataTypeException 
	 */
	 @JsonProperty("orc_28_confidentialityCode")
	public void setOrc_28_confidentialityCode(CWE_v25 orc_28_confidentialityCode) throws DataTypeException {
		this.orc.getOrc28_ConfidentialityCode().getCwe1_Identifier().setValue(orc_28_confidentialityCode.getCwe_1_identifier());
		this.orc.getOrc28_ConfidentialityCode().getCwe2_Text().setValue(orc_28_confidentialityCode.getCwe_2_text());
		this.orc.getOrc28_ConfidentialityCode().getCwe3_NameOfCodingSystem().setValue(orc_28_confidentialityCode.getCwe_3_nameOfCodingSystem());
		this.orc.getOrc28_ConfidentialityCode().getCwe4_AlternateIdentifier().setValue(orc_28_confidentialityCode.getCwe_4_alternateIdentifier());
		this.orc.getOrc28_ConfidentialityCode().getCwe5_AlternateText().setValue(orc_28_confidentialityCode.getCwe_5_alternateText());
		this.orc.getOrc28_ConfidentialityCode().getCwe6_NameOfAlternateCodingSystem().setValue(orc_28_confidentialityCode.getCwe_6_nameOfAlternateCodingSystem());
		this.orc.getOrc28_ConfidentialityCode().getCwe7_CodingSystemVersionID().setValue(orc_28_confidentialityCode.getCwe_7_codingSystemVersionId());
		this.orc.getOrc28_ConfidentialityCode().getCwe8_AlternateCodingSystemVersionID().setValue(orc_28_confidentialityCode.getCwe_8_alternateCodingSystemVersionId());
		this.orc.getOrc28_ConfidentialityCode().getCwe9_OriginalText().setValue(orc_28_confidentialityCode.getCwe_9_originalText());
		this.orc_28_confidentialityCode = orc_28_confidentialityCode;
	}
	/**
	 * @return the orc_29_orderType
	 */
	
	@JsonProperty("orc_29_orderType")
	public CWE_v25 getOrc_29_orderType() {
		return new CWE_v25(
				this.orc.getOrc29_OrderType().getCwe1_Identifier().getValue(),
				this.orc.getOrc29_OrderType().getCwe2_Text().getValue(),
				this.orc.getOrc29_OrderType().getCwe3_NameOfCodingSystem().getValue(),
				this.orc.getOrc29_OrderType().getCwe4_AlternateIdentifier().getValue(),
				this.orc.getOrc29_OrderType().getCwe5_AlternateText().getValue(),
				this.orc.getOrc29_OrderType().getCwe6_NameOfAlternateCodingSystem().getValue(),
				this.orc.getOrc29_OrderType().getCwe7_CodingSystemVersionID().getValue(),
				this.orc.getOrc29_OrderType().getCwe8_AlternateCodingSystemVersionID().getValue(),
				this.orc.getOrc29_OrderType().getCwe9_OriginalText().getValue());
	}
	/**
	 * @param orc_29_orderType the orc_29_orderType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_29_orderType")
	public void setOrc_29_orderType(CWE_v25 orc_29_orderType) throws DataTypeException {
		this.orc.getOrc29_OrderType().getCwe1_Identifier().setValue(orc_29_orderType.getCwe_1_identifier());
		this.orc.getOrc29_OrderType().getCwe2_Text().setValue(orc_29_orderType.getCwe_2_text());
		this.orc.getOrc29_OrderType().getCwe3_NameOfCodingSystem().setValue(orc_29_orderType.getCwe_3_nameOfCodingSystem());
		this.orc.getOrc29_OrderType().getCwe4_AlternateIdentifier().setValue(orc_29_orderType.getCwe_4_alternateIdentifier());
		this.orc.getOrc29_OrderType().getCwe5_AlternateText().setValue(orc_29_orderType.getCwe_5_alternateText());
		this.orc.getOrc29_OrderType().getCwe6_NameOfAlternateCodingSystem().setValue(orc_29_orderType.getCwe_6_nameOfAlternateCodingSystem());
		this.orc.getOrc29_OrderType().getCwe7_CodingSystemVersionID().setValue(orc_29_orderType.getCwe_7_codingSystemVersionId());
		this.orc.getOrc29_OrderType().getCwe8_AlternateCodingSystemVersionID().setValue(orc_29_orderType.getCwe_8_alternateCodingSystemVersionId());
		this.orc.getOrc29_OrderType().getCwe9_OriginalText().setValue(orc_29_orderType.getCwe_9_originalText());
		this.orc_29_orderType = orc_29_orderType;
	}
	/**
	 * @return the orc_30_entererAuthorizationMode
	 */
	
	@JsonProperty("orc_30_entererAuthorizationMode")
	public CNE_v25 getOrc_30_entererAuthorizationMode() {
		return new CNE_v25(
				this.orc.getOrc30_EntererAuthorizationMode().getCne1_Identifier().getValue(),
				this.orc.getOrc30_EntererAuthorizationMode().getCne2_Text().getValue(), 
				this.orc.getOrc30_EntererAuthorizationMode().getCne3_NameOfCodingSystem().getValue(),
				this.orc.getOrc30_EntererAuthorizationMode().getCne4_AlternateIdentifier().getValue(), 
				this.orc.getOrc30_EntererAuthorizationMode().getCne5_AlternateText().getValue(), 
				this.orc.getOrc30_EntererAuthorizationMode().getCne6_NameOfAlternateCodingSystem().getValue(), 
				this.orc.getOrc30_EntererAuthorizationMode().getCne7_CodingSystemVersionID().getValue(), 
				this.orc.getOrc30_EntererAuthorizationMode().getCne8_AlternateCodingSystemVersionID().getValue(), 
				this.orc.getOrc30_EntererAuthorizationMode().getCne9_OriginalText().getValue());
	}
	/**
	 * @param orc_30_entererAuthorizationMode the orc_30_entererAuthorizationMode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("orc_30_entererAuthorizationMode")
	public void setOrc_30_entererAuthorizationMode(CNE_v25 orc_30_entererAuthorizationMode) throws DataTypeException {
		this.orc.getOrc30_EntererAuthorizationMode().getCne1_Identifier().setValue(orc_30_entererAuthorizationMode.getCne_1_identifier());
		this.orc.getOrc30_EntererAuthorizationMode().getCne2_Text().setValue(orc_30_entererAuthorizationMode.getCne_2_text());
		this.orc.getOrc30_EntererAuthorizationMode().getCne3_NameOfCodingSystem().setValue(orc_30_entererAuthorizationMode.getCne_3_nameOfCodingSystem());
		this.orc.getOrc30_EntererAuthorizationMode().getCne4_AlternateIdentifier().setValue(orc_30_entererAuthorizationMode.getCne_4_alternateIdentifier());
		this.orc.getOrc30_EntererAuthorizationMode().getCne5_AlternateText().setValue(orc_30_entererAuthorizationMode.getCne_5_alternateText());
		this.orc.getOrc30_EntererAuthorizationMode().getCne6_NameOfAlternateCodingSystem().setValue(orc_30_entererAuthorizationMode.getCne_6_nameOfAlternateCodingSystem());
		this.orc.getOrc30_EntererAuthorizationMode().getCne7_CodingSystemVersionID().setValue(orc_30_entererAuthorizationMode.getCne_7_codingSystemVersionId());
		this.orc.getOrc30_EntererAuthorizationMode().getCne8_AlternateCodingSystemVersionID().setValue(orc_30_entererAuthorizationMode.getCne_8_alternateCodingSystemVersionId());
		this.orc.getOrc30_EntererAuthorizationMode().getCne9_OriginalText().setValue(orc_30_entererAuthorizationMode.getCne_9_originalText());
		this.orc_30_entererAuthorizationMode = orc_30_entererAuthorizationMode;
	}
	
	/**
	 * @return the obr
	 *	@JsonProperty("obr")
	 */
	
	public CustomOBR_v25 getObr() {
		return obr;
	}
	/**
	 * @param obr the obr to set
	 * @JsonProperty("obr")
	 */
	public void setObr(CustomOBR_v25 obr) {
		this.obr = obr;
	}
	@Override
	public String toString() {
		return "CustomORC_v25 [orc_1_orderControl=" + orc_1_orderControl + ", orc_2_placerOrderNumber="
				+ orc_2_placerOrderNumber + ", orc_3_fillerOrderNumber=" + orc_3_fillerOrderNumber
				+ ", orc_4_placerGroupNumber=" + orc_4_placerGroupNumber + ", orc_5_orderStatus=" + orc_5_orderStatus
				+ ", orc_6_responseFlag=" + orc_6_responseFlag + ", orc_7_quantityTiming="
				+ Arrays.toString(orc_7_quantityTiming) + ", orc_8_parentOrder=" + orc_8_parentOrder
				+ ", orc_9_dateTimeofTransaction=" + orc_9_dateTimeofTransaction + ", orc_10_enteredBy="
				+ Arrays.toString(orc_10_enteredBy) + ", orc_11_verifiedBy=" + Arrays.toString(orc_11_verifiedBy)
				+ ", orc_12_orderingProvider=" + Arrays.toString(orc_12_orderingProvider) + ", orc_13_enterersLocation="
				+ orc_13_enterersLocation + ", orc_14_callBackPhoneNumber="
				+ Arrays.toString(orc_14_callBackPhoneNumber) + ", orc_15_orderEffectiveDateTime="
				+ orc_15_orderEffectiveDateTime + ", orc_16_orderControlCodeReason=" + orc_16_orderControlCodeReason
				+ ", orc_17_enteringOrganization=" + orc_17_enteringOrganization + ", orc_18_enteringDevice="
				+ orc_18_enteringDevice + ", orc_19_actionBy=" + Arrays.toString(orc_19_actionBy)
				+ ", orc_20_advancedBeneficiaryNoticeCode=" + orc_20_advancedBeneficiaryNoticeCode
				+ ", orc_21_orderingFacilityName=" + Arrays.toString(orc_21_orderingFacilityName)
				+ ", orc_22_orderingFacilityAddress=" + Arrays.toString(orc_22_orderingFacilityAddress)
				+ ", orc_23_orderingFacilityPhoneNumber=" + Arrays.toString(orc_23_orderingFacilityPhoneNumber)
				+ ", orc_24_orderingProviderAddress=" + Arrays.toString(orc_24_orderingProviderAddress)
				+ ", orc_25_orderStatusModifier=" + orc_25_orderStatusModifier
				+ ", orc_26_advancedBeneficiaryNoticeOverrideReason=" + orc_26_advancedBeneficiaryNoticeOverrideReason
				+ ", orc_27_fillersExpectedAvailabilityDateTime=" + orc_27_fillersExpectedAvailabilityDateTime
				+ ", orc_28_confidentialityCode=" + orc_28_confidentialityCode + ", orc_29_orderType="
				+ orc_29_orderType + ", orc_30_entererAuthorizationMode=" + orc_30_entererAuthorizationMode + ", obr="
				+ obr + ", orc=" + orc + "]";
	}
	
	
	
}
