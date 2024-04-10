//package scratch.coding.models.base;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//@Table(name="MO_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class MO_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="MO_ID")
//	private Long id;
//	@Column(name="MO_1")
//	@JsonProperty("mo_1_quantity")
//	private String mo_1_quantity;
//	@Column(name="MO_2")
//	@JsonProperty("mo_2_denomination")
//	private String mo_2_denomination;
//	public MO_ST(String mo_1_quantity, String mo_2_denomination) {
//		super();
//		this.mo_1_quantity = mo_1_quantity;
//		this.mo_2_denomination = mo_2_denomination;
//	}
//	public MO_ST() {
//		super();
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
//	 * @return the mo_1_quantity
//	 *	@JsonProperty("mo_1_quantity")
//	 */
//	
//	public String getMo_1_quantity() {
//		return mo_1_quantity;
//	}
//	/**
//	 * @param mo_1_quantity the mo_1_quantity to set
//	 * @JsonProperty("mo_1_quantity")
//	 */
//	public void setMo_1_quantity(String mo_1_quantity) {
//		this.mo_1_quantity = mo_1_quantity;
//	}
//	/**
//	 * @return the mo_2_denomination
//	 *	@JsonProperty("mo_2_denomination")
//	 */
//	
//	public String getMo_2_denomination() {
//		return mo_2_denomination;
//	}
//	/**
//	 * @param mo_2_denomination the mo_2_denomination to set
//	 * @JsonProperty("mo_2_denomination")
//	 */
//	public void setMo_2_denomination(String mo_2_denomination) {
//		this.mo_2_denomination = mo_2_denomination;
//	}
//	@Override
//	public String toString() {
//		return "MO_ST [id=" + id + ", mo_1_quantity=" + mo_1_quantity + ", mo_2_denomination=" + mo_2_denomination
//				+ "]";
//	}
//	
//}
