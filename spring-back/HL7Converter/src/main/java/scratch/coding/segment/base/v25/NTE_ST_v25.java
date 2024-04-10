//package scratch.coding.segment.base.v25;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.ST;
//@Table(name="NTE_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class NTE_ST_v25 {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="NTE_ID")
//	private Long id;
//	@Column(name="NTE_1_v25")
//	@JsonProperty("nte_1_setID")
//	private String nte_1_setID;
//	@Column(name="NTE_2_v25")
//	@JsonProperty("nte_2_sourceofComment")
//	private String nte_2_sourceofComment;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "NTE_ST_3_v25")
//	@JsonProperty("nte_3_comment")
//	private List<ST> nte_3_comment;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_NTE_4_v25", referencedColumnName = "CE_ID")
//	@JsonIgnoreProperties("nte_4_commentType")
//	@JsonProperty("nte_4_commentType")
//	private CE_ST nte_4_commentType;
//	
//	public NTE_ST_v25() {
//		super();
//		this.nte_1_setID = "";
//		this.nte_2_sourceofComment = "";
//		this.nte_3_comment = new ArrayList<>();
//		this.nte_4_commentType = new CE_ST();
//	}
//	private NTE_ST_v25(NTEBuilder builder) {
//		this.nte_1_setID = builder.nte_1_setID;
//		this.nte_2_sourceofComment = builder.nte_2_sourceofComment;
//		this.nte_3_comment = builder.nte_3_comment;
//		this.nte_4_commentType = builder.nte_4_commentType;
//	}
//	public static class NTEBuilder {
//		private String nte_1_setID;
//		private String nte_2_sourceofComment;
//		private List<ST> nte_3_comment;
//		private CE_ST nte_4_commentType;
//		public NTEBuilder(String nte_2_sourceofComment) {
//			this.nte_1_setID = "";
//			this.nte_2_sourceofComment = nte_2_sourceofComment;
//			this.nte_3_comment = new ArrayList<>();
//			this.nte_4_commentType = new CE_ST();
//		}
//		public NTEBuilder nte_1_setID(String nte_1_setID) {
//			this.nte_1_setID = nte_1_setID;
//			return this;
//		}
//		public NTEBuilder nte_3_comment(List<ST> nte_3_comment) {
//			this.nte_3_comment = nte_3_comment;
//			return this;
//		}
//		public NTEBuilder nte_4_commentType(CE_ST nte_4_commentType) {
//			this.nte_4_commentType = nte_4_commentType;
//			return this;
//		}
//		public NTE_ST_v25 build() {
//			return new NTE_ST_v25(this);
//		}
//	}
//	public String getNte_1_setID() {
//		return nte_1_setID;
//	}
//	public String getNte_2_sourceofComment() {
//		return nte_2_sourceofComment;
//	}
//	public List<ST> getNte_3_comment() {
//		return nte_3_comment;
//	}
//	public CE_ST getNte_4_commentType() {
//		return nte_4_commentType;
//	}
//	@Override
//	public String toString() {
//		return "JsonNTE_v25 [nte_1_setID=" + nte_1_setID + ", nte_2_sourceofComment=" + nte_2_sourceofComment
//				+ ", nte_3_comment=" + nte_3_comment + ", nte_4_commentType=" + nte_4_commentType + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, nte_1_setID, nte_2_sourceofComment, nte_3_comment, nte_4_commentType);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		NTE_ST_v25 other = (NTE_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(nte_1_setID, other.nte_1_setID)
//				&& Objects.equals(nte_2_sourceofComment, other.nte_2_sourceofComment)
//				&& Objects.equals(nte_3_comment, other.nte_3_comment)
//				&& Objects.equals(nte_4_commentType, other.nte_4_commentType);
//	}
//	
//}
