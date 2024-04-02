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
//import scratch.coding.models.base.v25.TQ_ST_v25;
//
//@Table(name="RI_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class RI_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="RI_ID")
//	private Long id;
//	@Column(name="RI_1_v25")
//	@JsonProperty("ri_1_repeatPattern")
//	private String ri_1_repeatPattern;
//	@Column(name="RI_2_v25")
//	@JsonProperty("ri_2_explicitTimeInterval")
//	private String ri_2_explicitTimeInterval;
//	
//	@OneToOne(mappedBy = "tq_2_interval")
//	@JsonIgnoreProperties({"tq_2_interval"})
//	private TQ_ST_v25 tq_1_v25;
//
//	public RI_ST(String ri_1_repeatPattern, String ri_2_explicitTimeInterval) {
//		super();
//		this.ri_1_repeatPattern = ri_1_repeatPattern;
//		this.ri_2_explicitTimeInterval = ri_2_explicitTimeInterval;
//	}
//
//	public RI_ST() {
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
//	 * @return the ri_1_repeatPattern
//	 *	@JsonProperty("ri_1_repeatPattern")
//	 */
//	
//	public String getRi_1_repeatPattern() {
//		return ri_1_repeatPattern;
//	}
//
//	/**
//	 * @param ri_1_repeatPattern the ri_1_repeatPattern to set
//	 * @JsonProperty("ri_1_repeatPattern")
//	 */
//	public void setRi_1_repeatPattern(String ri_1_repeatPattern) {
//		this.ri_1_repeatPattern = ri_1_repeatPattern;
//	}
//
//	/**
//	 * @return the ri_2_explicitTimeInterval
//	 *	@JsonProperty("ri_2_explicitTimeInterval")
//	 */
//	
//	public String getRi_2_explicitTimeInterval() {
//		return ri_2_explicitTimeInterval;
//	}
//
//	/**
//	 * @param ri_2_explicitTimeInterval the ri_2_explicitTimeInterval to set
//	 * @JsonProperty("ri_2_explicitTimeInterval")
//	 */
//	public void setRi_2_explicitTimeInterval(String ri_2_explicitTimeInterval) {
//		this.ri_2_explicitTimeInterval = ri_2_explicitTimeInterval;
//	}
//
//	/**
//	 * @return the tq_1_v25
//	 *	@JsonProperty("tq_1_v25")
//	 */
//	
//	public TQ_ST_v25 getTq_1_v25() {
//		return tq_1_v25;
//	}
//
//	/**
//	 * @param tq_1_v25 the tq_1_v25 to set
//	 * @JsonProperty("tq_1_v25")
//	 */
//	public void setTq_1_v25(TQ_ST_v25 tq_1_v25) {
//		this.tq_1_v25 = tq_1_v25;
//	}
//
//	@Override
//	public String toString() {
//		return "RI_ST [id=" + id + ", ri_1_repeatPattern=" + ri_1_repeatPattern + ", ri_2_explicitTimeInterval="
//				+ ri_2_explicitTimeInterval + ", tq_1_v25=" + tq_1_v25 + "]";
//	}
//	
//	
//}
