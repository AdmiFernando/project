package scratch.coding.segment.v25;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.CTI;
import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomCTI_v25 {
	@JsonProperty("cti_1_sponsorStudyID")
	private EI_v2 cti_1_sponsorStudyID;
	@JsonProperty("cti_2_studyPhaseIdentifier")
	private CE_v2 cti_2_studyPhaseIdentifier;
	@JsonProperty("cti_3_studyScheduledTimePoint")
	private CE_v2 cti_3_studyScheduledTimePoint;
	
	private CTI cti;
	private CustomCTI_v25(CTI cti, CustomNTE_v25[] nte) {
		super();
		this.cti =cti;
//		setNte(nte);
	}
	private CustomCTI_v25(CTI cti) {
		super();
		this.cti =cti;
	}
	
	public CustomCTI_v25() {
		super();
	}
	public static CustomCTI_v25 createCTIWithCTI(CTI cti) throws HL7Exception, IOException {
		return new CustomCTI_v25(cti);
	}

	public static CustomCTI_v25 createCTIWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		CTI cti = oru.getPATIENT_RESULT().getORDER_OBSERVATION().getCTI();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		return new CustomCTI_v25(cti);
	}
	/**
	 * @return the cti_1_sponsorStudyID
	 */
	
	@JsonProperty("cti_1_sponsorStudyID")
	public EI_v2 getCti_1_sponsorStudyID() {
		return new EI_v2(
				this.cti.getCti1_SponsorStudyID().getEi1_EntityIdentifier().getValue(),
				this.cti.getCti1_SponsorStudyID().getEi2_NamespaceID().getValue(),
				this.cti.getCti1_SponsorStudyID().getEi3_UniversalID().getValue(),
				this.cti.getCti1_SponsorStudyID().getEi4_UniversalIDType().getValue());
	}
	/**
	 * @param cti_1_sponsorStudyID the cti_1_sponsorStudyID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cti_1_sponsorStudyID")
	public void setCti_1_sponsorStudyID(EI_v2 cti_1_sponsorStudyID) throws DataTypeException {
		this.cti.getCti1_SponsorStudyID().getEi1_EntityIdentifier().setValue(cti_1_sponsorStudyID.getEi_1_entityIdentifier());
		this.cti.getCti1_SponsorStudyID().getEi2_NamespaceID().setValue(cti_1_sponsorStudyID.getEi_2_namespaceId());
		this.cti.getCti1_SponsorStudyID().getEi3_UniversalID().setValue(cti_1_sponsorStudyID.getEi_3_universalId());
		this.cti.getCti1_SponsorStudyID().getEi4_UniversalIDType().setValue(cti_1_sponsorStudyID.getEi_4_universalIdType());
		this.cti_1_sponsorStudyID = cti_1_sponsorStudyID;
	}
	/**
	 * @return the cti_2_studyPhaseIdentifier
	 */
	
	@JsonProperty("cti_2_studyPhaseIdentifier")
	public CE_v2 getCti_2_studyPhaseIdentifier() {
		return new CE_v2(
				this.cti.getCti2_StudyPhaseIdentifier().getCe1_Identifier().getValue(),
				this.cti.getCti2_StudyPhaseIdentifier().getCe2_Text().getValue(),
				this.cti.getCti2_StudyPhaseIdentifier().getCe3_NameOfCodingSystem().getValue(),
				this.cti.getCti2_StudyPhaseIdentifier().getCe4_AlternateIdentifier().getValue(),
				this.cti.getCti2_StudyPhaseIdentifier().getCe5_AlternateText().getValue(),
				this.cti.getCti2_StudyPhaseIdentifier().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param cti_2_studyPhaseIdentifier the cti_2_studyPhaseIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cti_2_studyPhaseIdentifier")
	public void setCti_2_studyPhaseIdentifier(CE_v2 cti_2_studyPhaseIdentifier) throws DataTypeException {
		this.cti.getCti2_StudyPhaseIdentifier().getCe1_Identifier().setValue(cti_2_studyPhaseIdentifier.getCe_1_identifier());
		this.cti.getCti2_StudyPhaseIdentifier().getCe2_Text().setValue(cti_2_studyPhaseIdentifier.getCe_2_text());
		this.cti.getCti2_StudyPhaseIdentifier().getCe3_NameOfCodingSystem().setValue(cti_2_studyPhaseIdentifier.getCe_3_nameOfCodingSystem());
		this.cti.getCti2_StudyPhaseIdentifier().getCe4_AlternateIdentifier().setValue(cti_2_studyPhaseIdentifier.getCe_4_alternateIdentifier());
		this.cti.getCti2_StudyPhaseIdentifier().getCe5_AlternateText().setValue(cti_2_studyPhaseIdentifier.getCe_5_alternateText());
		this.cti.getCti2_StudyPhaseIdentifier().getCe6_NameOfAlternateCodingSystem().setValue(cti_2_studyPhaseIdentifier.getCe_6_nameOfAlternateCodingSystem());
		this.cti_2_studyPhaseIdentifier = cti_2_studyPhaseIdentifier;
	}
	/**
	 * @return the cti_3_studyScheduledTimePoint
	 */
	
	@JsonProperty("cti_3_studyScheduledTimePoint")
	public CE_v2 getCti_3_studyScheduledTimePoint() {
		return new CE_v2(
				this.cti.getCti3_StudyScheduledTimePoint().getCe1_Identifier().getValue(),
				this.cti.getCti3_StudyScheduledTimePoint().getCe2_Text().getValue(),
				this.cti.getCti3_StudyScheduledTimePoint().getCe3_NameOfCodingSystem().getValue(),
				this.cti.getCti3_StudyScheduledTimePoint().getCe4_AlternateIdentifier().getValue(),
				this.cti.getCti3_StudyScheduledTimePoint().getCe5_AlternateText().getValue(),
				this.cti.getCti3_StudyScheduledTimePoint().getCe6_NameOfAlternateCodingSystem().getValue());
	}
	/**
	 * @param cti_3_studyScheduledTimePoint the cti_3_studyScheduledTimePoint to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cti_3_studyScheduledTimePoint")
	public void setCti_3_studyScheduledTimePoint(CE_v2 cti_3_studyScheduledTimePoint) throws DataTypeException {
		this.cti.getCti3_StudyScheduledTimePoint().getCe1_Identifier().setValue(cti_3_studyScheduledTimePoint.getCe_1_identifier());
		this.cti.getCti3_StudyScheduledTimePoint().getCe2_Text().setValue(cti_3_studyScheduledTimePoint.getCe_2_text());
		this.cti.getCti3_StudyScheduledTimePoint().getCe3_NameOfCodingSystem().setValue(cti_3_studyScheduledTimePoint.getCe_3_nameOfCodingSystem());
		this.cti.getCti3_StudyScheduledTimePoint().getCe4_AlternateIdentifier().setValue(cti_3_studyScheduledTimePoint.getCe_4_alternateIdentifier());
		this.cti.getCti3_StudyScheduledTimePoint().getCe5_AlternateText().setValue(cti_3_studyScheduledTimePoint.getCe_5_alternateText());
		this.cti.getCti3_StudyScheduledTimePoint().getCe6_NameOfAlternateCodingSystem().setValue(cti_3_studyScheduledTimePoint.getCe_6_nameOfAlternateCodingSystem());
		this.cti_3_studyScheduledTimePoint = cti_3_studyScheduledTimePoint;
	}
	@Override
	public String toString() {
		return "CustomCTI_v25 [cti_1_sponsorStudyID=" + cti_1_sponsorStudyID + ", cti_2_studyPhaseIdentifier="
				+ cti_2_studyPhaseIdentifier + ", cti_3_studyScheduledTimePoint=" + cti_3_studyScheduledTimePoint
				+ ", cti=" + cti + "]";
	}
	
}
