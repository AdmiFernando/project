package scratch.coding.segment.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonAL1_v23{
	@JsonProperty("al1_1_setId")
	private String al1_1_setId;
	@JsonProperty("al1_2_allergyType")
	private String al1_2_allergyType;
	@JsonProperty("ce_al1_3_allergyCodeMnomonicDescription")
	private CE_v2 ce_al1_3_allergyCodeMnomonicDescription;
	@JsonProperty("al1_4_allergySeverity")
	private String al1_4_allergySeverity;
	@JsonProperty("al1_5_allergyReaction")
	private String al1_5_allergyReaction;
	@JsonProperty("al1_6_identificationDate")
	private String al1_6_identificationDate;
	
	public JsonAL1_v23() {
		super();
	}
	private JsonAL1_v23(AL1Builder builder) {
		super();
		this.al1_1_setId = builder.al1_1_setId;
		this.ce_al1_3_allergyCodeMnomonicDescription = builder.ce_al1_3_allergyCodeMnomonicDescription;
		this.al1_2_allergyType=builder.al1_2_allergyType;
		this.al1_4_allergySeverity = builder.al1_4_allergySeverity;
		this.al1_5_allergyReaction=builder.al1_5_allergyReaction;
		this.al1_6_identificationDate=builder.al1_6_identificationDate;
	}
	public static class AL1Builder {
		private String al1_1_setId;
		private String al1_2_allergyType;
		private CE_v2 ce_al1_3_allergyCodeMnomonicDescription;
		private String al1_4_allergySeverity;
		private String al1_5_allergyReaction;
		private String al1_6_identificationDate;
		public AL1Builder(String al1_1_setId, CE_v2 ce_al1_3_allergyCodeMnomonicDescription) {
			super();
			this.al1_1_setId = al1_1_setId;
			this.ce_al1_3_allergyCodeMnomonicDescription = ce_al1_3_allergyCodeMnomonicDescription;
			this.al1_2_allergyType="";
			this.al1_4_allergySeverity ="";
			this.al1_5_allergyReaction="";
			this.al1_6_identificationDate="";
		}
		public AL1Builder al1_1_setId(String al1_1_setId) {
			this.al1_1_setId = al1_1_setId;
			return this;
		}
		public AL1Builder al1_2_allergyType(String al1_2_allergyType) {
			this.al1_2_allergyType = al1_2_allergyType;
			return this;
		}
		public AL1Builder ce_al1_3_allergyCodeMnomonicDescription(CE_v2 ce_al1_3_allergyCodeMnomonicDescription) {
			this.ce_al1_3_allergyCodeMnomonicDescription = ce_al1_3_allergyCodeMnomonicDescription;
			return this;
		}
		public AL1Builder al1_4_allergySeverity(String al1_4_allergySeverity) {
			this.al1_4_allergySeverity = al1_4_allergySeverity;
			return this;
		}
		public AL1Builder al1_5_allergyReaction(String al1_5_allergyReaction) {
			this.al1_5_allergyReaction = al1_5_allergyReaction;
			return this;
		}
		public AL1Builder al1_6_identificationDate(String al1_6_identificationDate) {
			this.al1_6_identificationDate = al1_6_identificationDate;
			return this;
		}
		
	}
	public String getAl1_1_setId() {
		return al1_1_setId;
	}
	public String getAl1_2_allergyType() {
		return al1_2_allergyType;
	}
	public CE_v2 getCe_al1_3_allergyCodeMnomonicDescription() {
		return ce_al1_3_allergyCodeMnomonicDescription;
	}
	public String getAl1_4_allergySeverity() {
		return al1_4_allergySeverity;
	}
	public String getAl1_5_allergyReaction() {
		return al1_5_allergyReaction;
	}
	public String getAl1_6_identificationDate() {
		return al1_6_identificationDate;
	}
	@Override
	public String toString() {
		return "JsonAL1_v23 [al1_1_setId=" + al1_1_setId + ", al1_2_allergyType=" + al1_2_allergyType
				+ ", ce_al1_3_allergyCodeMnomonicDescription=" + ce_al1_3_allergyCodeMnomonicDescription
				+ ", al1_4_allergySeverity=" + al1_4_allergySeverity + ", al1_5_allergyReaction="
				+ al1_5_allergyReaction + ", al1_6_identificationDate=" + al1_6_identificationDate + "]";
	}
	
	
}
