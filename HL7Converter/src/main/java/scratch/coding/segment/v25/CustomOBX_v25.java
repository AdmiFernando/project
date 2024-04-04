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
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import scratch.coding.models.CE_v2;
import scratch.coding.models.DR_v2;
import scratch.coding.models.EI_v2;
import scratch.coding.models.HD_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v25.CWE_v25;
import scratch.coding.models.v25.FN_v25;
import scratch.coding.models.v25.XCN_v25;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomOBX_v25 {
	@JsonProperty("obx_1_setID")
	private String obx_1_setID;
	@JsonProperty("obx_2_valueType")
	private String obx_2_valueType;
	@JsonProperty("obx_3_observationIdentifier")
	private CE_v2 obx_3_observationIdentifier;
	@JsonProperty("obx_4_observationSubID")
	private String obx_4_observationSubID;
	@JsonProperty("obx_5_observationValue")
	private String[] obx_5_observationValue;
	@JsonProperty("obx_6_units")
	private CE_v2 obx_6_units;
	@JsonProperty("obx_7_referencesRange")
	private String obx_7_referencesRange;
	@JsonProperty("obx_8_abnormalFlags")
	private String[] obx_8_abnormalFlags;
	@JsonProperty("obx_9_probability")
	private String obx_9_probability;
	@JsonProperty("obx_10_natureofAbnormalTest")
	private String[] obx_10_natureofAbnormalTest;
	@JsonProperty("obx_11_observationResultStatus")
	private String obx_11_observationResultStatus;
	@JsonProperty("obx_12_effectiveDateofReferenceRange")
	private TS_v2 obx_12_effectiveDateofReferenceRange;
	@JsonProperty("obx_13_userDefinedAccessChecks")
	private String obx_13_userDefinedAccessChecks;
	@JsonProperty("obx_14_dateTimeoftheObservation")
	private TS_v2 obx_14_dateTimeoftheObservation;
	@JsonProperty("obx_15_producersID")
	private CE_v2 obx_15_producersID;
	@JsonProperty("obx_16_responsibleObserver")
	private XCN_v25[] obx_16_responsibleObserver;
	@JsonProperty("obx_17_observationMethod")
	private CE_v2[] obx_17_observationMethod;
	@JsonProperty("obx_18_equipmentInstanceIdentifier")
	private EI_v2[] obx_18_equipmentInstanceIdentifier;
	@JsonProperty("obx_19_dateTimeoftheAnalysis")
	private TS_v2 obx_19_dateTimeoftheAnalysis;
	
	@JsonProperty("nte")
	private List<CustomNTE_v25> nte;
	
	private OBX obx;
	
	private CustomOBX_v25(OBX obx, List<CustomNTE_v25> nte) {
		super();
		this.obx =obx;
		this.nte = nte;
	}
	private CustomOBX_v25(OBX obx) {
		super();
		this.obx = obx;
	}
	
	public CustomOBX_v25() {
		super();
	}
	public static CustomOBX_v25 createOBX(ORU_R01_OBSERVATION obs) throws HL7Exception, IOException {
		List<CustomNTE_v25> nteArray = new ArrayList<>();
		for(NTE nt: obs.getNTEAll()) {
			nteArray.add(CustomNTE_v25.createNteWithTypeAndVersion(nt));
		}
		return new CustomOBX_v25(obs.getOBX(), nteArray);
	}

	public static CustomOBX_v25 createOBXWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		OBX obx = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getOBSERVATION().getOBX();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		
		
		
//		for (ORM_O01_OBSERVATION observation: ormOrder.getORDER_DETAIL().getOBSERVATIONAll()) {
//			obxArray[i] = CustomOBX.createObxWithTypeAndVersion(observation);
//			i++;
//		}
		return new CustomOBX_v25(obx);
		
		
//		return new CustomNK1_v25(nk1);
	}
	/**
	 * @return the obx_1_setID
	 */
	
	@JsonProperty("obx_1_setID")
	public String getObx_1_setID() {
		return this.obx.getObx1_SetIDOBX().getValue();
	}
	/**
	 * @param obx_1_setID the obx_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_1_setID")
	public void setObx_1_setID(String obx_1_setID) throws DataTypeException {
		this.obx.getObx1_SetIDOBX().setValue(obx_1_setID);
		this.obx_1_setID = obx_1_setID;
	}
	/**
	 * @return the obx_2_valueType
	 */
	
	@JsonProperty("obx_2_valueType")
	public String getObx_2_valueType() {
		return this.obx.getObx2_ValueType().getValue();
	}
	/**
	 * @param obx_2_valueType the obx_2_valueType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_2_valueType")
	public void setObx_2_valueType(String obx_2_valueType) throws DataTypeException {
		this.obx.getObx2_ValueType().setValue(obx_2_valueType);
		this.obx_2_valueType = obx_2_valueType;
	}
	/**
	 * @return the obx_3_observationIdentifier
	 */
	
	@JsonProperty("obx_3_observationIdentifier")
	public CE_v2 getObx_3_observationIdentifier() {
		return new CE_v2(
				this.obx.getObx3_ObservationIdentifier().getCe1_Identifier().getValue(),
				this.obx.getObx3_ObservationIdentifier().getCe2_Text().getValue(),
				this.obx.getObx3_ObservationIdentifier().getCe3_NameOfCodingSystem().getValue(),
				this.obx.getObx3_ObservationIdentifier().getCe4_AlternateIdentifier().getValue(),
				this.obx.getObx3_ObservationIdentifier().getCe5_AlternateText().getValue(),
				this.obx.getObx3_ObservationIdentifier().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obx_3_observationIdentifier the obx_3_observationIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_3_observationIdentifier")
	public void setObx_3_observationIdentifier(CE_v2 obx_3_observationIdentifier) throws DataTypeException {
		this.obx.getObx3_ObservationIdentifier().getCe1_Identifier().setValue(obx_3_observationIdentifier.getCe_1_identifier());
		this.obx.getObx3_ObservationIdentifier().getCe2_Text().setValue(obx_3_observationIdentifier.getCe_2_text());
		this.obx.getObx3_ObservationIdentifier().getCe3_NameOfCodingSystem().setValue(obx_3_observationIdentifier.getCe_3_nameOfCodingSystem());
		this.obx.getObx3_ObservationIdentifier().getCe4_AlternateIdentifier().setValue(obx_3_observationIdentifier.getCe_4_alternateIdentifier());
		this.obx.getObx3_ObservationIdentifier().getCe5_AlternateText().setValue(obx_3_observationIdentifier.getCe_5_alternateText());
		this.obx.getObx3_ObservationIdentifier().getCe6_NameOfAlternateCodingSystem().setValue(obx_3_observationIdentifier.getCe_6_nameOfAlternateCodingSystem());
		this.obx_3_observationIdentifier = obx_3_observationIdentifier;
	}
	/**
	 * @return the obx_4_observationSubID
	 */
	
	@JsonProperty("obx_4_observationSubID")
	public String getObx_4_observationSubID() {
		return this.obx.getObx4_ObservationSubID().getValue();
	}
	/**
	 * @param obx_4_observationSubID the obx_4_observationSubID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_4_observationSubID")
	public void setObx_4_observationSubID(String obx_4_observationSubID) throws DataTypeException {
		this.obx.getObx4_ObservationSubID().setValue(obx_4_observationSubID);
		this.obx_4_observationSubID = obx_4_observationSubID;
	}
	/**
	 * @return the obx_5_observationValue
	 * @throws HL7Exception 
	 */
	
	@JsonProperty("obx_5_observationValue")
	public String[] getObx_5_observationValue() throws HL7Exception {
		String[] observationValue = new String[this.obx.getObx5_ObservationValue().length];
		for(int i = 0; i<this.obx.getObx5_ObservationValue().length;i++) {
			observationValue[i] = this.obx.getObx5_ObservationValue(i).encode();
		}
		return observationValue;
	}
	/**
	 * @param obx_5_observationValue the obx_5_observationValue to set
	 * @throws HL7Exception 
	 */
	@JsonProperty("obx_5_observationValue")
	public void setObx_5_observationValue(String[] obx_5_observationValue) throws HL7Exception {
		for(int i = 0; i<obx_5_observationValue.length;i++) {
			this.obx.getObx5_ObservationValue(i).parse(obx_5_observationValue[i]);;
		}
		this.obx_5_observationValue = obx_5_observationValue;
	}
	/**
	 * @return the obx_15_producersID
	 */
	
	@JsonProperty("obx_6_units")
	public CE_v2 getObx_6_units() {
		return new CE_v2(
				this.obx.getObx6_Units().getCe1_Identifier().getValue(),
				this.obx.getObx6_Units().getCe2_Text().getValue(),
				this.obx.getObx6_Units().getCe3_NameOfCodingSystem().getValue(),
				this.obx.getObx6_Units().getCe4_AlternateIdentifier().getValue(),
				this.obx.getObx6_Units().getCe5_AlternateText().getValue(),
				this.obx.getObx6_Units().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obx_15_producersID the obx_15_producersID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_6_units")
	public void setObx_6_units(CE_v2 obx_6_units) throws DataTypeException {
		this.obx.getObx6_Units().getCe1_Identifier().setValue(obx_6_units.getCe_1_identifier());
		this.obx.getObx6_Units().getCe2_Text().setValue(obx_6_units.getCe_2_text());
		this.obx.getObx6_Units().getCe3_NameOfCodingSystem().setValue(obx_6_units.getCe_3_nameOfCodingSystem());
		this.obx.getObx6_Units().getCe4_AlternateIdentifier().setValue(obx_6_units.getCe_4_alternateIdentifier());
		this.obx.getObx6_Units().getCe5_AlternateText().setValue(obx_6_units.getCe_5_alternateText());
		this.obx.getObx6_Units().getCe6_NameOfAlternateCodingSystem().setValue(obx_6_units.getCe_6_nameOfAlternateCodingSystem());
		this.obx_6_units = obx_6_units;
	}
	/**
	 * @return the obx_7_referencesRange
	 */
	
	@JsonProperty("obx_7_referencesRange")
	public String getObx_7_referencesRange() {
		return this.obx.getObx7_ReferencesRange().getValue();
	}
	/**
	 * @param obx_7_referencesRange the obx_7_referencesRange to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_7_referencesRange")
	public void setObx_7_referencesRange(String obx_7_referencesRange) throws DataTypeException {
		this.obx.getObx7_ReferencesRange().setValue(obx_7_referencesRange);
		this.obx_7_referencesRange = obx_7_referencesRange;
	}
	/**
	 * @return the obx_8_abnormalFlags
	 */
	
	@JsonProperty("obx_8_abnormalFlags")
	public String[] getObx_8_abnormalFlags() {
		String[] abnormalFlags = new String[this.obx.getObx8_AbnormalFlags().length];
		for(int i =0; i< this.obx.getObx8_AbnormalFlags().length;i++) {
			abnormalFlags[i] = this.obx.getObx8_AbnormalFlags(i).getValue();
		}
		return abnormalFlags;
	}
	/**
	 * @param obx_8_abnormalFlags the obx_8_abnormalFlags to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_8_abnormalFlags")
	public void setObx_8_abnormalFlags(String[] obx_8_abnormalFlags) throws DataTypeException {
		for(int i =0; i< obx_8_abnormalFlags.length;i++) {
			this.obx.getObx8_AbnormalFlags(i).setValue(obx_8_abnormalFlags[i]);
		}
		this.obx_8_abnormalFlags = obx_8_abnormalFlags;
	}
	/**
	 * @return the obx_9_probability
	 */
	
	@JsonProperty("obx_9_probability")
	public String getObx_9_probability() {
		return this.obx.getObx9_Probability().getValue();
	}
	/**
	 * @param obx_9_probability the obx_9_probability to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_9_probability")
	public void setObx_9_probability(String obx_9_probability) throws DataTypeException {
		this.obx.getObx9_Probability().setValue(obx_9_probability);
		this.obx_9_probability = obx_9_probability;
	}
	/**
	 * @return the obx_10_natureofAbnormalTest
	 */
	
	@JsonProperty("obx_10_natureofAbnormalTest")
	public String[] getObx_10_natureofAbnormalTest() {
		String[] natureofAbnormalTest = new String[this.obx.getObx10_NatureOfAbnormalTest().length];
		for(int i = 0; i<this.obx.getObx10_NatureOfAbnormalTest().length;i++) {
			natureofAbnormalTest[i] = this.obx.getObx10_NatureOfAbnormalTest(i).getValue();
		}
		return natureofAbnormalTest;
	}
	/**
	 * @param obx_10_natureofAbnormalTest the obx_10_natureofAbnormalTest to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_10_natureofAbnormalTest")
	public void setObx_10_natureofAbnormalTest(String[] obx_10_natureofAbnormalTest) throws DataTypeException {
		for(int i = 0; i<obx_10_natureofAbnormalTest.length;i++) {
			this.obx.getObx10_NatureOfAbnormalTest(i).setValue(obx_10_natureofAbnormalTest[i]);
		}
		this.obx_10_natureofAbnormalTest = obx_10_natureofAbnormalTest;
	}
	/**
	 * @return the obx_11_observationResultStatus
	 */
	
	@JsonProperty("obx_11_observationResultStatus")
	public String getObx_11_observationResultStatus() {
		return this.obx.getObx11_ObservationResultStatus().getValue();
	}
	/**
	 * @param obx_11_observationResultStatus the obx_11_observationResultStatus to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_11_observationResultStatus")
	public void setObx_11_observationResultStatus(String obx_11_observationResultStatus) throws DataTypeException {
		this.obx.getObx11_ObservationResultStatus().setValue(obx_11_observationResultStatus);
		this.obx_11_observationResultStatus = obx_11_observationResultStatus;
	}
	/**
	 * @return the obx_12_effectiveDateofReferenceRange
	 */
	
	@JsonProperty("obx_12_effectiveDateofReferenceRange")
	public TS_v2 getObx_12_effectiveDateofReferenceRange() {
		return new TS_v2(
				this.obx.getObx12_EffectiveDateOfReferenceRange().getTs1_Time().getValue(),
				this.obx.getObx12_EffectiveDateOfReferenceRange().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obx_12_effectiveDateofReferenceRange the obx_12_effectiveDateofReferenceRange to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_12_effectiveDateofReferenceRange")
	public void setObx_12_effectiveDateofReferenceRange(TS_v2 obx_12_effectiveDateofReferenceRange) throws DataTypeException {
		this.obx.getObx12_EffectiveDateOfReferenceRange().getTs1_Time().setValue(obx_12_effectiveDateofReferenceRange.getTs_1_time());
		this.obx.getObx12_EffectiveDateOfReferenceRange().getTs2_DegreeOfPrecision().setValue(obx_12_effectiveDateofReferenceRange.getTs_2_degreeOfPrecision());
		this.obx_12_effectiveDateofReferenceRange = obx_12_effectiveDateofReferenceRange;
	}
	/**
	 * @return the obx_13_userDefinedAccessChecks
	 */
	
	@JsonProperty("obx_13_userDefinedAccessChecks")
	public String getObx_13_userDefinedAccessChecks() {
		return this.obx.getObx13_UserDefinedAccessChecks().getValue();
	}
	/**
	 * @param obx_13_userDefinedAccessChecks the obx_13_userDefinedAccessChecks to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_13_userDefinedAccessChecks")
	public void setObx_13_userDefinedAccessChecks(String obx_13_userDefinedAccessChecks) throws DataTypeException {
		this.obx.getObx13_UserDefinedAccessChecks().setValue(obx_13_userDefinedAccessChecks);
		this.obx_13_userDefinedAccessChecks = obx_13_userDefinedAccessChecks;
	}
	/**
	 * @return the obx_14_dateTimeoftheObservation
	 */
	
	@JsonProperty("obx_14_dateTimeoftheObservation")
	public TS_v2 getObx_14_dateTimeoftheObservation() {
		return new TS_v2(
				this.obx.getObx14_DateTimeOfTheObservation().getTs1_Time().getValue(),
				this.obx.getObx14_DateTimeOfTheObservation().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obx_14_dateTimeoftheObservation the obx_14_dateTimeoftheObservation to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_14_dateTimeoftheObservation")
	public void setObx_14_dateTimeoftheObservation(TS_v2 obx_14_dateTimeoftheObservation) throws DataTypeException {
		this.obx.getObx14_DateTimeOfTheObservation().getTs1_Time().setValue(obx_14_dateTimeoftheObservation.getTs_1_time());
		this.obx.getObx14_DateTimeOfTheObservation().getTs2_DegreeOfPrecision().setValue(obx_14_dateTimeoftheObservation.getTs_2_degreeOfPrecision());
		this.obx_14_dateTimeoftheObservation = obx_14_dateTimeoftheObservation;
	}
	/**
	 * @return the obx_15_producersID
	 */
	
	@JsonProperty("obx_15_producersID")
	public CE_v2 getObx_15_producersID() {
		return new CE_v2(
				this.obx.getObx15_ProducerSID().getCe1_Identifier().getValue(),
				this.obx.getObx15_ProducerSID().getCe2_Text().getValue(),
				this.obx.getObx15_ProducerSID().getCe3_NameOfCodingSystem().getValue(),
				this.obx.getObx15_ProducerSID().getCe4_AlternateIdentifier().getValue(),
				this.obx.getObx15_ProducerSID().getCe5_AlternateText().getValue(),
				this.obx.getObx15_ProducerSID().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param obx_15_producersID the obx_15_producersID to set
	 * @JsonProperty("obx_15_producersID")
	 * @throws DataTypeException 
	 */
	public void setObx_15_producersID(CE_v2 obx_15_producersID) throws DataTypeException {
		this.obx.getObx15_ProducerSID().getCe1_Identifier().setValue(obx_15_producersID.getCe_1_identifier());
		this.obx.getObx15_ProducerSID().getCe2_Text().setValue(obx_15_producersID.getCe_2_text());
		this.obx.getObx15_ProducerSID().getCe3_NameOfCodingSystem().setValue(obx_15_producersID.getCe_3_nameOfCodingSystem());
		this.obx.getObx15_ProducerSID().getCe4_AlternateIdentifier().setValue(obx_15_producersID.getCe_4_alternateIdentifier());
		this.obx.getObx15_ProducerSID().getCe5_AlternateText().setValue(obx_15_producersID.getCe_5_alternateText());
		this.obx.getObx15_ProducerSID().getCe6_NameOfAlternateCodingSystem().setValue(obx_15_producersID.getCe_6_nameOfAlternateCodingSystem());
		this.obx_15_producersID = obx_15_producersID;
	}
	/**
	 * @return the obx_16_responsibleObserver
	 */
	
	@JsonProperty("obx_16_responsibleObserver")
	public XCN_v25[] getObx_16_responsibleObserver() {
		XCN_v25[] responsibleObserver = new XCN_v25[this.obx.getObx16_ResponsibleObserver().length];
		for(int i = 0; i<this.obx.getObx16_ResponsibleObserver().length;i++) {
			responsibleObserver[i] = new XCN_v25(
					this.obx.getObx16_ResponsibleObserver(i).getXcn1_IDNumber().getValue(),
					new FN_v25(
							this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn1_Surname().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn3_OwnSurname().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().getValue()),
					this.obx.getObx16_ResponsibleObserver(i).getXcn3_GivenName().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn5_SuffixEgJRorIII().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn6_PrefixEgDR().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn7_DegreeEgMD().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn8_SourceTable().getValue(),
					new HD_v2(
							this.obx.getObx16_ResponsibleObserver(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn9_AssigningAuthority().getHd2_UniversalID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().getValue()),
					this.obx.getObx16_ResponsibleObserver(i).getXcn10_NameTypeCode().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn11_IdentifierCheckDigit().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn12_CheckDigitScheme().getValue(),
					this.obx.getObx16_ResponsibleObserver(i).getXcn13_IdentifierTypeCode().getValue(),
					new HD_v2(
							this.obx.getObx16_ResponsibleObserver(i).getXcn14_AssigningFacility().getHd1_NamespaceID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn14_AssigningFacility().getHd2_UniversalID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().getValue()),
					this.obx.getObx16_ResponsibleObserver(i).getXcn15_NameRepresentationCode().getValue(),
					new CE_v2(
							this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe1_Identifier().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe2_Text().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe4_AlternateIdentifier().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe5_AlternateText().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().getValue()),
					new DR_v2(
							new TS_v2(
									this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().getValue(), 
									this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().getValue()),
							new TS_v2(
									this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().getValue(),
									this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().getValue())),
					this.obx.getObx16_ResponsibleObserver(i).getXcn18_NameAssemblyOrder().getValue(),
					new TS_v2(
							this.obx.getObx16_ResponsibleObserver(i).getXcn19_EffectiveDate().getTs1_Time().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().getValue()),
					new TS_v2(
							this.obx.getObx16_ResponsibleObserver(i).getXcn20_ExpirationDate().getTs1_Time().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().getValue()),
					this.obx.getObx16_ResponsibleObserver(i).getXcn21_ProfessionalSuffix().getValue(),
					new CWE_v25(
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe2_Text().getValue(), 
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().getValue(), 
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().getValue()),
					new CWE_v25(
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().getValue(), 
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().getValue(), 
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().getValue(),
							this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().getValue()));
		}
		return responsibleObserver;
	}
	/**
	 * @param obx_16_responsibleObserver the obx_16_responsibleObserver to set
	 * @JsonProperty("obx_16_responsibleObserver")
	 * @throws DataTypeException 
	 */
	public void setObx_16_responsibleObserver(XCN_v25[] obx_16_responsibleObserver) throws DataTypeException {
		for(int i = 0; i<obx_16_responsibleObserver.length;i++) {
			this.obx.getObx16_ResponsibleObserver(i).getXcn1_IDNumber().setValue(obx_16_responsibleObserver[i].getXcn_1_idNumber());
			this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn1_Surname().setValue(obx_16_responsibleObserver[i].getXcn_2_familyName().getFn_1_surname());
			this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn2_OwnSurnamePrefix().setValue(obx_16_responsibleObserver[i].getXcn_2_familyName().getFn_2_ownSurnamePrefix());
			this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn3_OwnSurname().setValue(obx_16_responsibleObserver[i].getXcn_2_familyName().getFn_3_ownSurname());
			this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn4_SurnamePrefixFromPartnerSpouse().setValue(obx_16_responsibleObserver[i].getXcn_2_familyName().getFn_4_surnamePrefixFromPartnerSpouse());
			this.obx.getObx16_ResponsibleObserver(i).getXcn2_FamilyName().getFn5_SurnameFromPartnerSpouse().setValue(obx_16_responsibleObserver[i].getXcn_2_familyName().getFn_5_surnameFromPartnerSpouse());
			this.obx.getObx16_ResponsibleObserver(i).getXcn3_GivenName().setValue(obx_16_responsibleObserver[i].getXcn_3_givenName());
			this.obx.getObx16_ResponsibleObserver(i).getXcn4_SecondAndFurtherGivenNamesOrInitialsThereof().setValue(obx_16_responsibleObserver[i].getXcn_4_secondAndFurtherGivenNamesOrInitialsThereof());
			this.obx.getObx16_ResponsibleObserver(i).getXcn5_SuffixEgJRorIII().setValue(obx_16_responsibleObserver[i].getXcn_5_suffixegJrOrIii());
			this.obx.getObx16_ResponsibleObserver(i).getXcn6_PrefixEgDR().setValue(obx_16_responsibleObserver[i].getXcn_6_prefixegDr());
			this.obx.getObx16_ResponsibleObserver(i).getXcn7_DegreeEgMD().setValue(obx_16_responsibleObserver[i].getXcn_7_degreeegMd());
			this.obx.getObx16_ResponsibleObserver(i).getXcn8_SourceTable().setValue(obx_16_responsibleObserver[i].getXcn_8_sourceTable());
			this.obx.getObx16_ResponsibleObserver(i).getXcn9_AssigningAuthority().getHd1_NamespaceID().setValue(obx_16_responsibleObserver[i].getXcn_9_assigningAuthority().getHd_1_namespaceId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn9_AssigningAuthority().getHd2_UniversalID().setValue(obx_16_responsibleObserver[i].getXcn_9_assigningAuthority().getHd_2_universalId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn9_AssigningAuthority().getHd3_UniversalIDType().setValue(obx_16_responsibleObserver[i].getXcn_9_assigningAuthority().getHd_3_universalIdType());
			this.obx.getObx16_ResponsibleObserver(i).getXcn10_NameTypeCode().setValue(obx_16_responsibleObserver[i].getXcn_10_nameTypeCode());
			this.obx.getObx16_ResponsibleObserver(i).getXcn11_IdentifierCheckDigit().setValue(obx_16_responsibleObserver[i].getXcn_11_identifierCheckDigit());
			this.obx.getObx16_ResponsibleObserver(i).getXcn12_CheckDigitScheme().setValue(obx_16_responsibleObserver[i].getXcn_12_checkDigitScheme());
			this.obx.getObx16_ResponsibleObserver(i).getXcn13_IdentifierTypeCode().setValue(obx_16_responsibleObserver[i].getXcn_13_identifierTypeCode());
			this.obx.getObx16_ResponsibleObserver(i).getXcn14_AssigningFacility().getHd1_NamespaceID().setValue(obx_16_responsibleObserver[i].getXcn_14_assigningFacility().getHd_1_namespaceId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn14_AssigningFacility().getHd2_UniversalID().setValue(obx_16_responsibleObserver[i].getXcn_14_assigningFacility().getHd_2_universalId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn14_AssigningFacility().getHd3_UniversalIDType().setValue(obx_16_responsibleObserver[i].getXcn_14_assigningFacility().getHd_3_universalIdType());
			this.obx.getObx16_ResponsibleObserver(i).getXcn15_NameRepresentationCode().setValue(obx_16_responsibleObserver[i].getXcn_15_nameRepresentationCode());
			this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe1_Identifier().setValue(obx_16_responsibleObserver[i].getXcn_16_nameContext().getCe_1_identifier());
			this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe2_Text().setValue(obx_16_responsibleObserver[i].getXcn_16_nameContext().getCe_2_text());
			this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe3_NameOfCodingSystem().setValue(obx_16_responsibleObserver[i].getXcn_16_nameContext().getCe_3_nameOfCodingSystem());
			this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe4_AlternateIdentifier().setValue(obx_16_responsibleObserver[i].getXcn_16_nameContext().getCe_4_alternateIdentifier());
			this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe5_AlternateText().setValue(obx_16_responsibleObserver[i].getXcn_16_nameContext().getCe_5_alternateText());
			this.obx.getObx16_ResponsibleObserver(i).getXcn16_NameContext().getCe6_NameOfAlternateCodingSystem().setValue(obx_16_responsibleObserver[i].getXcn_16_nameContext().getCe_6_nameOfAlternateCodingSystem());
			this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs1_Time().setValue(obx_16_responsibleObserver[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_1_time());
			this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr1_RangeStartDateTime().getTs2_DegreeOfPrecision().setValue(obx_16_responsibleObserver[i].getXcn_17_nameValidityRange().getTs_dr_1_rangeStartDateTime().getTs_2_degreeOfPrecision());
			this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs1_Time().setValue(obx_16_responsibleObserver[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_1_time());
			this.obx.getObx16_ResponsibleObserver(i).getXcn17_NameValidityRange().getDr2_RangeEndDateTime().getTs2_DegreeOfPrecision().setValue(obx_16_responsibleObserver[i].getXcn_17_nameValidityRange().getTs_dr_2_rangeEndDateTime().getTs_2_degreeOfPrecision());
			this.obx.getObx16_ResponsibleObserver(i).getXcn18_NameAssemblyOrder().setValue(obx_16_responsibleObserver[i].getXcn_18_nameAssemblyOrder());
			this.obx.getObx16_ResponsibleObserver(i).getXcn19_EffectiveDate().getTs1_Time().setValue(obx_16_responsibleObserver[i].getXcn_19_effectiveDate().getTs_1_time());
			this.obx.getObx16_ResponsibleObserver(i).getXcn19_EffectiveDate().getTs2_DegreeOfPrecision().setValue(obx_16_responsibleObserver[i].getXcn_19_effectiveDate().getTs_2_degreeOfPrecision());
			this.obx.getObx16_ResponsibleObserver(i).getXcn20_ExpirationDate().getTs1_Time().setValue(obx_16_responsibleObserver[i].getXcn_20_expirationDate().getTs_1_time());
			this.obx.getObx16_ResponsibleObserver(i).getXcn20_ExpirationDate().getTs2_DegreeOfPrecision().setValue(obx_16_responsibleObserver[i].getXcn_20_expirationDate().getTs_2_degreeOfPrecision());
			this.obx.getObx16_ResponsibleObserver(i).getXcn21_ProfessionalSuffix().setValue(obx_16_responsibleObserver[i].getXcn_21_professionalSuffix());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe1_Identifier().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe2_Text().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe3_NameOfCodingSystem().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe4_AlternateIdentifier().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe5_AlternateText().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe6_NameOfAlternateCodingSystem().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe7_CodingSystemVersionID().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe8_AlternateCodingSystemVersionID().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn22_AssigningJurisdiction().getCwe9_OriginalText().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe1_Identifier().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_1_identifier());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe2_Text().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_2_text());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe3_NameOfCodingSystem().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_3_nameOfCodingSystem());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe4_AlternateIdentifier().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_4_alternateIdentifier());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe5_AlternateText().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_5_alternateText());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe6_NameOfAlternateCodingSystem().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_6_nameOfAlternateCodingSystem());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe7_CodingSystemVersionID().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_7_codingSystemVersionId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe8_AlternateCodingSystemVersionID().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_8_alternateCodingSystemVersionId());
			this.obx.getObx16_ResponsibleObserver(i).getXcn23_AssigningAgencyOrDepartment().getCwe9_OriginalText().setValue(obx_16_responsibleObserver[i].getXcn_22_assigningJurisdiction().getCwe_9_originalText());
		}
		this.obx_16_responsibleObserver = obx_16_responsibleObserver;
	}
	/**
	 * @return the obx_17_observationMethod
	 */
	
	@JsonProperty("obx_17_observationMethod")
	public CE_v2[] getObx_17_observationMethod() {
		CE_v2[] observationMethod = new CE_v2[this.obx.getObx17_ObservationMethod().length];
		for(int i = 0; i<this.obx.getObx17_ObservationMethod().length;i++) {
			observationMethod[i] = new CE_v2(
					this.obx.getObx17_ObservationMethod(i).getCe1_Identifier().getValue(),
					this.obx.getObx17_ObservationMethod(i).getCe2_Text().getValue(),
					this.obx.getObx17_ObservationMethod(i).getCe3_NameOfCodingSystem().getValue(), 
					this.obx.getObx17_ObservationMethod(i).getCe4_AlternateIdentifier().getValue(), 
					this.obx.getObx17_ObservationMethod(i).getCe5_AlternateText().getValue(), 
					this.obx.getObx17_ObservationMethod(i).getCe6_NameOfAlternateCodingSystem().getValue());
		}
		return observationMethod;
	}
	/**
	 * @param obx_17_observationMethod the obx_17_observationMethod to set
	 * @JsonProperty("obx_17_observationMethod")
	 * @throws DataTypeException 
	 */
	public void setObx_17_observationMethod(CE_v2[] obx_17_observationMethod) throws DataTypeException {
		for(int i = 0; i<obx_17_observationMethod.length;i++) {
			this.obx.getObx17_ObservationMethod(i).getCe1_Identifier().setValue(obx_17_observationMethod[i].getCe_1_identifier()); 
			this.obx.getObx17_ObservationMethod(i).getCe2_Text().setValue(obx_17_observationMethod[i].getCe_2_text());
			this.obx.getObx17_ObservationMethod(i).getCe3_NameOfCodingSystem().setValue(obx_17_observationMethod[i].getCe_3_nameOfCodingSystem()); 
			this.obx.getObx17_ObservationMethod(i).getCe4_AlternateIdentifier().setValue(obx_17_observationMethod[i].getCe_4_alternateIdentifier());
			this.obx.getObx17_ObservationMethod(i).getCe5_AlternateText().setValue(obx_17_observationMethod[i].getCe_5_alternateText());
			this.obx.getObx17_ObservationMethod(i).getCe6_NameOfAlternateCodingSystem().setValue(obx_17_observationMethod[i].getCe_6_nameOfAlternateCodingSystem());
		}

		this.obx_17_observationMethod = obx_17_observationMethod;
	}
	/**
	 * @return the obx_18_equipmentInstanceIdentifier
	 */
	
	@JsonProperty("obx_18_equipmentInstanceIdentifier")
	public EI_v2[] getObx_18_equipmentInstanceIdentifier() {
		EI_v2[] equipmentInstanceIdentifier = new EI_v2[this.obx.getObx18_EquipmentInstanceIdentifier().length];
		for(int i = 0; i< this.obx.getObx18_EquipmentInstanceIdentifier().length;i++) {
			equipmentInstanceIdentifier[i] = new EI_v2(
					this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi1_EntityIdentifier().getValue(),
					this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi2_NamespaceID().getValue(),
					this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi3_UniversalID().getValue(),
					this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi4_UniversalIDType().getValue());
		}
		return equipmentInstanceIdentifier;
	}
	/**
	 * @param obx_18_equipmentInstanceIdentifier the obx_18_equipmentInstanceIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("obx_18_equipmentInstanceIdentifier")
	public void setObx_18_equipmentInstanceIdentifier(EI_v2[] obx_18_equipmentInstanceIdentifier) throws DataTypeException {
		for(int i = 0; i< obx_18_equipmentInstanceIdentifier.length;i++) {
			this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi1_EntityIdentifier().setValue(obx_18_equipmentInstanceIdentifier[i].getEi_1_entityIdentifier());
			this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi2_NamespaceID().setValue(obx_18_equipmentInstanceIdentifier[i].getEi_2_namespaceId());
			this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi3_UniversalID().setValue(obx_18_equipmentInstanceIdentifier[i].getEi_3_universalId());
			this.obx.getObx18_EquipmentInstanceIdentifier(i).getEi4_UniversalIDType().setValue(obx_18_equipmentInstanceIdentifier[i].getEi_4_universalIdType());
		}
		this.obx_18_equipmentInstanceIdentifier = obx_18_equipmentInstanceIdentifier;
	}
	/**
	 * @return the obx_19_dateTimeoftheAnalysis
	 */
	
	@JsonProperty("obx_19_dateTimeoftheAnalysis")
	public TS_v2 getObx_19_dateTimeoftheAnalysis() {
		return new TS_v2(
				this.obx.getObx19_DateTimeOfTheAnalysis().getTs1_Time().getValue(),
				this.obx.getObx19_DateTimeOfTheAnalysis().getTs2_DegreeOfPrecision().getValue());
	}
	/**
	 * @param obx_19_dateTimeoftheAnalysis the obx_19_dateTimeoftheAnalysis to set
	 * @JsonProperty("obx_19_dateTimeoftheAnalysis")
	 * @throws DataTypeException 
	 */
	public void setObx_19_dateTimeoftheAnalysis(TS_v2 obx_19_dateTimeoftheAnalysis) throws DataTypeException {
		this.obx.getObx19_DateTimeOfTheAnalysis().getTs1_Time().setValue(obx_19_dateTimeoftheAnalysis.getTs_1_time());
		this.obx.getObx19_DateTimeOfTheAnalysis().getTs2_DegreeOfPrecision().setValue(obx_19_dateTimeoftheAnalysis.getTs_2_degreeOfPrecision());
		this.obx_19_dateTimeoftheAnalysis = obx_19_dateTimeoftheAnalysis;
	}
	
	/**
	 * @return the nte
	 *	@JsonProperty("nte")
	 */
	
	public List<CustomNTE_v25> getNte() {
		return nte;
	}
	/**
	 * @param nte the nte to set
	 * @JsonProperty("nte")
	 */
	public void setNte(List<CustomNTE_v25> nte) {
		this.nte = nte;
	}
	@Override
	public String toString() {
		return "CustomOBX_v25 [obx_1_setID=" + obx_1_setID + ", obx_2_valueType=" + obx_2_valueType
				+ ", obx_3_observationIdentifier=" + obx_3_observationIdentifier + ", obx_4_observationSubID="
				+ obx_4_observationSubID + ", obx_5_observationValue=" + Arrays.toString(obx_5_observationValue)
				+ ", obx_6_units=" + obx_6_units + ", obx_7_referencesRange=" + obx_7_referencesRange
				+ ", obx_8_abnormalFlags=" + Arrays.toString(obx_8_abnormalFlags) + ", obx_9_probability="
				+ obx_9_probability + ", obx_10_natureofAbnormalTest=" + Arrays.toString(obx_10_natureofAbnormalTest)
				+ ", obx_11_observationResultStatus=" + obx_11_observationResultStatus
				+ ", obx_12_effectiveDateofReferenceRange=" + obx_12_effectiveDateofReferenceRange
				+ ", obx_13_userDefinedAccessChecks=" + obx_13_userDefinedAccessChecks
				+ ", obx_14_dateTimeoftheObservation=" + obx_14_dateTimeoftheObservation + ", obx_15_producersID="
				+ obx_15_producersID + ", obx_16_responsibleObserver=" + Arrays.toString(obx_16_responsibleObserver)
				+ ", obx_17_observationMethod=" + Arrays.toString(obx_17_observationMethod)
				+ ", obx_18_equipmentInstanceIdentifier=" + Arrays.toString(obx_18_equipmentInstanceIdentifier)
				+ ", obx_19_dateTimeoftheAnalysis=" + obx_19_dateTimeoftheAnalysis + ", obx=" + obx + "]";
	}
}
