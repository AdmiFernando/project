package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonNTE_v25 {
			
	@JsonProperty("obx_1_setID")
	private String nte_1_setID;
	@JsonProperty("obx_1_setID")
	private String nte_2_sourceofComment;
	@JsonProperty("obx_1_setID")
	private String nte_3_comment;
	@JsonProperty("obx_1_setID")
	private CE_v2 nte_4_commentType;
	public JsonNTE_v25() {
		super();
		this.nte_1_setID = "";
		this.nte_2_sourceofComment = "";
		this.nte_3_comment = "";
		this.nte_4_commentType = new CE_v2();
	}
	private JsonNTE_v25(NTEBuilder builder) {
		this.nte_1_setID = builder.nte_1_setID;
		this.nte_2_sourceofComment = builder.nte_2_sourceofComment;
		this.nte_3_comment = builder.nte_3_comment;
		this.nte_4_commentType = builder.nte_4_commentType;
	}
	public static class NTEBuilder {
		private String nte_1_setID;
		private String nte_2_sourceofComment;
		private String nte_3_comment;
		private CE_v2 nte_4_commentType;
		public NTEBuilder(String nte_2_sourceofComment) {
			this.nte_1_setID = "";
			this.nte_2_sourceofComment = nte_2_sourceofComment;
			this.nte_3_comment = "";
			this.nte_4_commentType = new CE_v2();
		}
		public NTEBuilder nte_1_setID(String nte_1_setID) {
			this.nte_1_setID = nte_1_setID;
			return this;
		}
		public NTEBuilder nte_3_comment(String nte_3_comment) {
			this.nte_3_comment = nte_3_comment;
			return this;
		}
		public NTEBuilder nte_4_commentType(CE_v2 nte_4_commentType) {
			this.nte_4_commentType = nte_4_commentType;
			return this;
		}
		public JsonNTE_v25 build() {
			return new JsonNTE_v25(this);
		}
	}
	public String getNte_1_setID() {
		return nte_1_setID;
	}
	public String getNte_2_sourceofComment() {
		return nte_2_sourceofComment;
	}
	public String getNte_3_comment() {
		return nte_3_comment;
	}
	public CE_v2 getNte_4_commentType() {
		return nte_4_commentType;
	}
	@Override
	public String toString() {
		return "JsonNTE_v25 [nte_1_setID=" + nte_1_setID + ", nte_2_sourceofComment=" + nte_2_sourceofComment
				+ ", nte_3_comment=" + nte_3_comment + ", nte_4_commentType=" + nte_4_commentType + "]";
	}
}
