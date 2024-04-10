//package scratch.coding.segment.base.v23;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//@Table(name="NTE_ST_v23")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class NTE_ST_v23 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="NTE_ID")
//	private Long id;
//	@Column(name="NTE_1_v23")
//	@JsonProperty("nte_1_setID")
//	private String nte_1_setID;
//	@Column(name="NTE_2_v23")
//	@JsonProperty("msg_1_messageCode")
//	private String nte_2_sourceOfComment;
//	@Column(name="NTE_3_v23")
//	@JsonProperty("msg_1_messageCode")
//	private String nte_3_comment;
//	
//
//	
//	public NTE_ST_v23() {
//		super();
//		this.nte_1_setID = "";
//		this.nte_2_sourceOfComment = "";
//		this.nte_3_comment = "";
//	}
//	private NTE_ST_v23(NTEBuilder builder) {
//		this.nte_1_setID = builder.nte_1_setID;
//		this.nte_2_sourceOfComment = builder.nte_2_sourceOfComment;
//		this.nte_3_comment = builder.nte_3_comment;
//
//	}
//	public static class NTEBuilder {
//		private String nte_1_setID;
//		private String nte_2_sourceOfComment;
//		private String nte_3_comment;
//		public NTEBuilder(String nte_2_sourceofComment) {
//			this.nte_1_setID = "";
//			this.nte_2_sourceOfComment = nte_2_sourceofComment;
//			this.nte_3_comment = "";
//		}
//		public NTEBuilder nte_1_setID(String nte_1_setID) {
//			this.nte_1_setID = nte_1_setID;
//			return this;
//		}
//		public NTEBuilder nte_3_comment(String nte_3_comment) {
//			this.nte_3_comment = nte_3_comment;
//			return this;
//		}
//		public NTE_ST_v23 build() {
//			return new NTE_ST_v23(this);
//		}
//	}
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * @return the nte_1_setID
//	 *	@JsonProperty("nte_1_setID")
//	 */
//	
//	public String getNte_1_setID() {
//		return nte_1_setID;
//	}
//	/**
//	 * @param nte_1_setID the nte_1_setID to set
//	 * @JsonProperty("nte_1_setID")
//	 */
//	public void setNte_1_setID(String nte_1_setID) {
//		this.nte_1_setID = nte_1_setID;
//	}
//	/**
//	 * @return the nte_2_sourceOfComment
//	 *	@JsonProperty("nte_2_sourceOfComment")
//	 */
//	
//	public String getNte_2_sourceOfComment() {
//		return nte_2_sourceOfComment;
//	}
//	/**
//	 * @param nte_2_sourceOfComment the nte_2_sourceOfComment to set
//	 * @JsonProperty("nte_2_sourceOfComment")
//	 */
//	public void setNte_2_sourceOfComment(String nte_2_sourceOfComment) {
//		this.nte_2_sourceOfComment = nte_2_sourceOfComment;
//	}
//	/**
//	 * @return the nte_3_comment
//	 *	@JsonProperty("nte_3_comment")
//	 */
//	
//	public String getNte_3_comment() {
//		return nte_3_comment;
//	}
//	/**
//	 * @param nte_3_comment the nte_3_comment to set
//	 * @JsonProperty("nte_3_comment")
//	 */
//	public void setNte_3_comment(String nte_3_comment) {
//		this.nte_3_comment = nte_3_comment;
//	}
//
//	
//	
//}
