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
//
//@Table(name="CQ_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CQ_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CQ_ID")
//	private Long id;
//	@Column(name="CQ_1_v25")
//	@JsonProperty("cq_1_quantity")
//	private String cq_1_quantity;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_CQ_2_v25", referencedColumnName = "CE_ID")
//	@JsonIgnoreProperties({"cq_2_v25"})
//	@JsonProperty("cq_2_units")
//	private CE_ST cq_2_units;
//
//	public CQ_ST_v25(String cq_1_quantity, CE_ST cq_2_units) {
//		super();
//		this.cq_1_quantity = cq_1_quantity;
//		this.cq_2_units = cq_2_units;
//	}
//
//	public CQ_ST_v25() {
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
//	 * @return the cq_1_quantity
//	 *	@JsonProperty("cq_1_quantity")
//	 */
//	
//	public String getCq_1_quantity() {
//		return cq_1_quantity;
//	}
//
//	/**
//	 * @param cq_1_quantity the cq_1_quantity to set
//	 * @JsonProperty("cq_1_quantity")
//	 */
//	public void setCq_1_quantity(String cq_1_quantity) {
//		this.cq_1_quantity = cq_1_quantity;
//	}
//
//	/**
//	 * @return the cq_2_units
//	 *	@JsonProperty("cq_2_units")
//	 */
//	
//	public CE_ST getCq_2_units() {
//		return cq_2_units;
//	}
//
//	/**
//	 * @param cq_2_units the cq_2_units to set
//	 * @JsonProperty("cq_2_units")
//	 */
//	public void setCq_2_units(CE_ST cq_2_units) {
//		this.cq_2_units = cq_2_units;
//	}
//
//	@Override
//	public String toString() {
//		return "CQ_ST_v25 [id=" + id + ", cq_1_quantity=" + cq_1_quantity + ", cq_2_units=" + cq_2_units + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(cq_1_quantity, cq_2_units, id);
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
//		CQ_ST_v25 other = (CQ_ST_v25) obj;
//		return Objects.equals(cq_1_quantity, other.cq_1_quantity) && Objects.equals(cq_2_units, other.cq_2_units)
//				&& Objects.equals(id, other.id);
//	}
//
//
//	
//	
//}
