//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.segment.base.v25.MSH_ST_v25;
////import scratch.coding.segment.base.v25.ORC_ST_v25;
//@Table(name="EI_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class EI_ST_v25 {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="EI_ID")
//	private Long id;
//	@Column(name="EI_1_v25")
//	@JsonProperty("ei_1_entityIdentifier")
//	private String ei_1_entityIdentifier;
//	@Column(name="EI_2_v25")
//	@JsonProperty("ei_2_namespaceId")
//	private String ei_2_namespaceId;
//	@Column(name="EI_3_v25")
//	@JsonProperty("ei_3_universalId")
//	private String ei_3_universalId;
//	@Column(name="EI_4_v25")
//	@JsonProperty("ei_4_universalIdType")
//	private String ei_4_universalIdType;
//	
//	public EI_ST_v25(String ei_1_entityIdentifier, String ei_2_namespaceId, String ei_3_universalId,
//			String ei_4_universalIdType) {
//		super();
//		this.ei_1_entityIdentifier = ei_1_entityIdentifier;
//		this.ei_2_namespaceId = ei_2_namespaceId;
//		this.ei_3_universalId = ei_3_universalId;
//		this.ei_4_universalIdType = ei_4_universalIdType;
//	}
//	public EI_ST_v25() {
//		super();
//		this.ei_1_entityIdentifier = "";
//		this.ei_2_namespaceId = "";
//		this.ei_3_universalId = "";
//		this.ei_4_universalIdType = "";
//	}
//	public String getEi_1_entityIdentifier() {
//		return ei_1_entityIdentifier;
//	}
//	public void setEi_1_entityIdentifier(String ei_1_entityIdentifier) {
//		this.ei_1_entityIdentifier = ei_1_entityIdentifier;
//	}
//	public String getEi_2_namespaceId() {
//		return ei_2_namespaceId;
//	}
//	public void setEi_2_namespaceId(String ei_2_namespaceId) {
//		this.ei_2_namespaceId = ei_2_namespaceId;
//	}
//	public String getEi_3_universalId() {
//		return ei_3_universalId;
//	}
//	public void setEi_3_universalId(String ei_3_universalId) {
//		this.ei_3_universalId = ei_3_universalId;
//	}
//	public String getEi_4_universalIdType() {
//		return ei_4_universalIdType;
//	}
//	public void setEi_4_universalIdType(String ei_4_universalIdType) {
//		this.ei_4_universalIdType = ei_4_universalIdType;
//	}
//	@Override
//	public String toString() {
//		return "EI_v25 [ei_1_entityIdentifier=" + ei_1_entityIdentifier + ", ei_2_namespaceId=" + ei_2_namespaceId
//				+ ", ei_3_universalId=" + ei_3_universalId + ", ei_4_universalIdType=" + ei_4_universalIdType + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(ei_1_entityIdentifier, ei_2_namespaceId, ei_3_universalId, ei_4_universalIdType, id);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EI_ST_v25 other = (EI_ST_v25) obj;
//		return Objects.equals(ei_1_entityIdentifier, other.ei_1_entityIdentifier)
//				&& Objects.equals(ei_2_namespaceId, other.ei_2_namespaceId)
//				&& Objects.equals(ei_3_universalId, other.ei_3_universalId)
//				&& Objects.equals(ei_4_universalIdType, other.ei_4_universalIdType) && Objects.equals(id, other.id);
//	}
//	
//}
