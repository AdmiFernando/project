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
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//@Table(name="PT_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class PT_ST {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="PT_ID")
//	private Long id;
//	@Column(name="PT_1")
//	@JsonProperty("pt_1_processingId")
//	private String pt_1_processingId;
//	@Column(name="PT_2")
//	@JsonProperty("pt_2_processingMode")
//	private String pt_2_processingMode;
//	@OneToOne(mappedBy = "msh_11_processingID")
//	@JsonIgnoreProperties("msh_11_processingID")
//	private MSH_ST_v25 msh_11_v25;
//	
//	
//	
//	public PT_ST(String pt_1_processingId, String pt_2_processingMode) {
//		super();
//		this.pt_1_processingId = pt_1_processingId;
//		this.pt_2_processingMode = pt_2_processingMode;
//	}
//	public PT_ST() {
//		super();
//	}
//	public String getPt_1_processingId() {
//		return pt_1_processingId;
//	}
//	public void setPt_1_processingId(String pt_1_processingId) {
//		this.pt_1_processingId = pt_1_processingId;
//	}
//	public String getPt_2_processingMode() {
//		return pt_2_processingMode;
//	}
//	public void setPt_2_processingMode(String pt_2_processingMode) {
//		this.pt_2_processingMode = pt_2_processingMode;
//	}
//	@Override
//	public String toString() {
//		return "PT_v25 [pt_1_processingId=" + pt_1_processingId + ", pt_2_processingMode=" + pt_2_processingMode + "]";
//	}
//	
//}
