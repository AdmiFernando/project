//package scratch.coding.models.base;
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
//@Table(name="MOC_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class MOC_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="MOC_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MOC_1", referencedColumnName = "MO_ID")
//	@JsonProperty("moc_1_monetaryAmount")
//	private MO_ST moc_1_monetaryAmount;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MOC_2", referencedColumnName = "CE_ID")
//	@JsonProperty("moc_2_chargeCode")
//	private CE_ST moc_2_chargeCode;
//	public MOC_ST(MO_ST moc_1_monetaryAmount, CE_ST moc_2_chargeCode) {
//		super();
//		this.moc_1_monetaryAmount = moc_1_monetaryAmount;
//		this.moc_2_chargeCode = moc_2_chargeCode;
//	}
//	public MOC_ST() {
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
//	 * @return the moc_1_monetaryAmount
//	 *	@JsonProperty("moc_1_monetaryAmount")
//	 */
//	
//	public MO_ST getMoc_1_monetaryAmount() {
//		return moc_1_monetaryAmount;
//	}
//	/**
//	 * @param moc_1_monetaryAmount the moc_1_monetaryAmount to set
//	 * @JsonProperty("moc_1_monetaryAmount")
//	 */
//	public void setMoc_1_monetaryAmount(MO_ST moc_1_monetaryAmount) {
//		this.moc_1_monetaryAmount = moc_1_monetaryAmount;
//	}
//	/**
//	 * @return the moc_2_chargeCode
//	 *	@JsonProperty("moc_2_chargeCode")
//	 */
//	
//	public CE_ST getMoc_2_chargeCode() {
//		return moc_2_chargeCode;
//	}
//	/**
//	 * @param moc_2_chargeCode the moc_2_chargeCode to set
//	 * @JsonProperty("moc_2_chargeCode")
//	 */
//	public void setMoc_2_chargeCode(CE_ST moc_2_chargeCode) {
//		this.moc_2_chargeCode = moc_2_chargeCode;
//	}
//	@Override
//	public String toString() {
//		return "MOC_ST [id=" + id + ", moc_1_monetaryAmount=" + moc_1_monetaryAmount + ", moc_2_chargeCode="
//				+ moc_2_chargeCode + "]";
//	}
//	
//	
//}
