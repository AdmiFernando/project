package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.EI_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonCTI_v25 {
	@JsonProperty("cti_1_sponsorStudyID")
	private EI_v2 cti_1_sponsorStudyID;
	@JsonProperty("cti_2_studyPhaseIdentifier")
	private CE_v2 cti_2_studyPhaseIdentifier;
	@JsonProperty("cti_3_studyScheduledTimePoint")
	private CE_v2 cti_3_studyScheduledTimePoint;
	public JsonCTI_v25() {
		super();
		this.cti_1_sponsorStudyID = new EI_v2();
		this.cti_2_studyPhaseIdentifier = new CE_v2();
		this.cti_3_studyScheduledTimePoint = new CE_v2();
	}
	private JsonCTI_v25(CTIBuilder builder) {
		super();
		this.cti_1_sponsorStudyID = builder.cti_1_sponsorStudyID;
		this.cti_2_studyPhaseIdentifier = builder.cti_2_studyPhaseIdentifier;
		this.cti_3_studyScheduledTimePoint = builder.cti_3_studyScheduledTimePoint;
	}
	public static class CTIBuilder {
		private EI_v2 cti_1_sponsorStudyID;
		private CE_v2 cti_2_studyPhaseIdentifier;
		private CE_v2 cti_3_studyScheduledTimePoint;
		public CTIBuilder(EI_v2 cti_1_sponsorStudyID, CE_v2 cti_2_studyPhaseIdentifier,
				CE_v2 cti_3_studyScheduledTimePoint) {
			super();
			this.cti_1_sponsorStudyID = new EI_v2();
			this.cti_2_studyPhaseIdentifier = new CE_v2();
			this.cti_3_studyScheduledTimePoint = new CE_v2();
		}
		public CTIBuilder cti_1_sponsorStudyID(EI_v2 cti_1_sponsorStudyID) {
			this.cti_1_sponsorStudyID = cti_1_sponsorStudyID;
			return this;
		}
		public CTIBuilder cti_2_studyPhaseIdentifier(CE_v2 cti_2_studyPhaseIdentifier) {
			this.cti_2_studyPhaseIdentifier = cti_2_studyPhaseIdentifier;
			return this;
		}
		public CTIBuilder cti_3_studyScheduledTimePoint(CE_v2 cti_3_studyScheduledTimePoint) {
			this.cti_3_studyScheduledTimePoint = cti_3_studyScheduledTimePoint;
			return this;
		}	
		public JsonCTI_v25 build() {
			return new JsonCTI_v25(this);
		}
	}
	public EI_v2 getCti_1_sponsorStudyID() {
		return cti_1_sponsorStudyID;
	}
	public CE_v2 getCti_2_studyPhaseIdentifier() {
		return cti_2_studyPhaseIdentifier;
	}
	public CE_v2 getCti_3_studyScheduledTimePoint() {
		return cti_3_studyScheduledTimePoint;
	}
	@Override
	public String toString() {
		return "JsonCTI_v25 [cti_1_sponsorStudyID=" + cti_1_sponsorStudyID + ", cti_2_studyPhaseIdentifier="
				+ cti_2_studyPhaseIdentifier + ", cti_3_studyScheduledTimePoint=" + cti_3_studyScheduledTimePoint + "]";
	}
}
