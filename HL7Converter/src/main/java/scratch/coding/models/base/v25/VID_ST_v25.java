//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//@Table(name="VID_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class VID_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="VID_ID")
//	private Long id;
//	@Column(name="VID_1_v25")
//	@JsonProperty("vid_1_versionId")
//	private String vid_1_versionId;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_VID_2_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("vid_2_ce_internationalizationCode")
//	private CE_ST vid_2_ce_internationalizationCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_VID_3_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("vid_3_ce_internationalVersionId")
//	private CE_ST vid_3_ce_internationalVersionId;
//	
//	public VID_ST_v25(String vid_1_versionId, CE_ST vid_2_ce_internationalizationCode,
//			CE_ST vid_3_ce_internationalVersionId, MSH_ST_v25 msh_12_v25) {
//		super();
//		this.vid_1_versionId = vid_1_versionId;
//		this.vid_2_ce_internationalizationCode = vid_2_ce_internationalizationCode;
//		this.vid_3_ce_internationalVersionId = vid_3_ce_internationalVersionId;
////		this.msh_12_v25 = msh_12_v25;
//	}
//
//	public VID_ST_v25() {
//		super();
//	}
//
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the vid_1_versionId
//	 *	@JsonProperty("vid_1_versionId")
//	 */
//	
//	public String getVid_1_versionId() {
//		return vid_1_versionId;
//	}
//
//	/**
//	 * @param vid_1_versionId the vid_1_versionId to set
//	 * @JsonProperty("vid_1_versionId")
//	 */
//	public void setVid_1_versionId(String vid_1_versionId) {
//		this.vid_1_versionId = vid_1_versionId;
//	}
//
//	/**
//	 * @return the vid_2_ce_internationalizationCode
//	 *	@JsonProperty("vid_2_ce_internationalizationCode")
//	 */
//	
//	public CE_ST getVid_2_ce_internationalizationCode() {
//		return vid_2_ce_internationalizationCode;
//	}
//
//	/**
//	 * @param vid_2_ce_internationalizationCode the vid_2_ce_internationalizationCode to set
//	 * @JsonProperty("vid_2_ce_internationalizationCode")
//	 */
//	public void setVid_2_ce_internationalizationCode(CE_ST vid_2_ce_internationalizationCode) {
//		this.vid_2_ce_internationalizationCode = vid_2_ce_internationalizationCode;
//	}
//
//	/**
//	 * @return the vid_3_ce_internationalVersionId
//	 *	@JsonProperty("vid_3_ce_internationalVersionId")
//	 */
//	
//	public CE_ST getVid_3_ce_internationalVersionId() {
//		return vid_3_ce_internationalVersionId;
//	}
//
//	/**
//	 * @param vid_3_ce_internationalVersionId the vid_3_ce_internationalVersionId to set
//	 * @JsonProperty("vid_3_ce_internationalVersionId")
//	 */
//	public void setVid_3_ce_internationalVersionId(CE_ST vid_3_ce_internationalVersionId) {
//		this.vid_3_ce_internationalVersionId = vid_3_ce_internationalVersionId;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, vid_1_versionId, vid_2_ce_internationalizationCode, vid_3_ce_internationalVersionId);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		VID_ST_v25 other = (VID_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(vid_1_versionId, other.vid_1_versionId)
//				&& Objects.equals(vid_2_ce_internationalizationCode, other.vid_2_ce_internationalizationCode)
//				&& Objects.equals(vid_3_ce_internationalVersionId, other.vid_3_ce_internationalVersionId);
//	}
//	
//}
