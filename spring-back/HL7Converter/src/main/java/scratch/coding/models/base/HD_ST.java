//package scratch.coding.models.base;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.v25.CX_ST_v25;
//import scratch.coding.models.base.v25.PL_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XON_ST_v25;
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//import scratch.coding.segment.v23.JsonMSH_v23;
//@Table(name="HD_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class HD_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="HD_ID")
//	private Long id;
//	@Column(name="HD_1")
//	@JsonProperty("hd_1_namespaceId")
//	private String hd_1_namespaceId;
//	@Column(name="HD_2")
//	@JsonProperty("hd_2_universalId")
//	private String hd_2_universalId;
//	@Column(name="HD_3")
//	@JsonProperty("hd_3_universalIdType")
//	private String hd_3_universalIdType;
//	public HD_ST(String hd_1_namespaceId, String hd_2_universalId, String hd_3_universalIdType) {
//		super();
//		this.hd_1_namespaceId = hd_1_namespaceId;
//		this.hd_2_universalId = hd_2_universalId;
//		this.hd_3_universalIdType = hd_3_universalIdType;
//	}
//	public HD_ST() {
//		super();
//	}
//	public String getHd_1_namespaceId() {
//		return hd_1_namespaceId;
//	}
//	public void setHd_1_namespaceId(String hd_1_namespaceId) {
//		this.hd_1_namespaceId = hd_1_namespaceId;
//	}
//	public String getHd_2_universalId() {
//		return hd_2_universalId;
//	}
//	public void setHd_2_universalId(String hd_2_universalId) {
//		this.hd_2_universalId = hd_2_universalId;
//	}
//	public String getHd_3_universalIdType() {
//		return hd_3_universalIdType;
//	}
//	public void setHd_3_universalIdType(String hd_3_universalIdType) {
//		this.hd_3_universalIdType = hd_3_universalIdType;
//	}
//	@Override
//	public String toString() {
//		return "HD_v25 [hd_1_namespaceId=" + hd_1_namespaceId + ", hd_2_universalId=" + hd_2_universalId
//				+ ", hd_3_universalIdType=" + hd_3_universalIdType + "]";
//	}
//	
//}
