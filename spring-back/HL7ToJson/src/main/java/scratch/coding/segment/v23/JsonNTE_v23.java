package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonNTE_v23  {
	@JsonProperty("nte_1_setId")
	private String nte_1_setId;
	@JsonProperty("nte_2_sourceOfComment")
	private String nte_2_sourceOfComment;
	@JsonProperty("nte_3_comment")
	private String[] nte_3_comment;
	public JsonNTE_v23(NTEBuilder builder) {
		super();
		this.nte_1_setId = builder.nte_1_setId;
		this.nte_2_sourceOfComment = builder.nte_2_sourceOfComment;
		this.nte_3_comment = builder.nte_3_comment;
	}
	
	public JsonNTE_v23(String nte_1_setId, String nte_2_sourceOfComment, String[] nte_3_comment) {
		super();
		this.nte_1_setId = nte_1_setId;
		this.nte_2_sourceOfComment = nte_2_sourceOfComment;
		this.nte_3_comment = nte_3_comment;
	}
	public JsonNTE_v23() {
		super();
		this.nte_1_setId = "";
		this.nte_2_sourceOfComment = "";
		this.nte_3_comment = new String[] {};
	}
	public static class NTEBuilder {
		private String nte_1_setId;
		private String nte_2_sourceOfComment;
		private String[] nte_3_comment;
		public NTEBuilder() {
			super();
			this.nte_1_setId = "";
			this.nte_2_sourceOfComment = "";
			this.nte_3_comment = new String[] {};
		}
		public NTEBuilder nte_1_setId(String nte_1_setId) {
			this.nte_1_setId = nte_1_setId;
			return this;
		}
		public NTEBuilder nte_2_sourceOfComment(String nte_2_sourceOfComment) {
			this.nte_2_sourceOfComment = nte_2_sourceOfComment;
			return this;
		}
		public NTEBuilder nte_3_comment(String[] nte_3_comment) {
			this.nte_3_comment = nte_3_comment;
			return this;
		}
		public JsonNTE_v23 build() {
			return new JsonNTE_v23(this);
		}
	}
	public String getNte_1_setId() {
		return nte_1_setId;
	}
	public String getNte_2_sourceOfComment() {
		return nte_2_sourceOfComment;
	}
	public String[] getNte_3_comment() {
		return nte_3_comment;
	}
	@Override
	public String toString() {
		return "JsonNTE_v23 [nte_1_setId=" + nte_1_setId + ", nte_2_sourceOfComment=" + nte_2_sourceOfComment
				+ ", nte_3_comment=" + Arrays.toString(nte_3_comment) + "]";
	}
	
}
