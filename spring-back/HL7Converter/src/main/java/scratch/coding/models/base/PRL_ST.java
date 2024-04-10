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
//@Table(name="PRL_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class PRL_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="PRL_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PRL_1", referencedColumnName = "CE_ID")
//	@JsonProperty("prl_1_parentObservationIdentifier")
//	private CE_ST prl_1_parentObservationIdentifier;
//	@Column(name="PRL_2")
//	@JsonProperty("prl_2_parentObservationSubidentifier")
//	private String prl_2_parentObservationSubidentifier;
//	@Column(name="PRL_3")
//	@JsonProperty("prl_3_parentObservationValueDescriptor")
//	private String prl_3_parentObservationValueDescriptor;
//	public PRL_ST(CE_ST prl_1_parentObservationIdentifier, String prl_2_parentObservationSubidentifier,
//			String prl_3_parentObservationValueDescriptor) {
//		super();
//		this.prl_1_parentObservationIdentifier = prl_1_parentObservationIdentifier;
//		this.prl_2_parentObservationSubidentifier = prl_2_parentObservationSubidentifier;
//		this.prl_3_parentObservationValueDescriptor = prl_3_parentObservationValueDescriptor;
//	}
//	public PRL_ST() {
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
//	 * @return the prl_1_parentObservationIdentifier
//	 *	@JsonProperty("prl_1_parentObservationIdentifier")
//	 */
//	
//	public CE_ST getPrl_1_parentObservationIdentifier() {
//		return prl_1_parentObservationIdentifier;
//	}
//	/**
//	 * @param prl_1_parentObservationIdentifier the prl_1_parentObservationIdentifier to set
//	 * @JsonProperty("prl_1_parentObservationIdentifier")
//	 */
//	public void setPrl_1_parentObservationIdentifier(CE_ST prl_1_parentObservationIdentifier) {
//		this.prl_1_parentObservationIdentifier = prl_1_parentObservationIdentifier;
//	}
//	/**
//	 * @return the prl_2_parentObservationSubidentifier
//	 *	@JsonProperty("prl_2_parentObservationSubidentifier")
//	 */
//	
//	public String getPrl_2_parentObservationSubidentifier() {
//		return prl_2_parentObservationSubidentifier;
//	}
//	/**
//	 * @param prl_2_parentObservationSubidentifier the prl_2_parentObservationSubidentifier to set
//	 * @JsonProperty("prl_2_parentObservationSubidentifier")
//	 */
//	public void setPrl_2_parentObservationSubidentifier(String prl_2_parentObservationSubidentifier) {
//		this.prl_2_parentObservationSubidentifier = prl_2_parentObservationSubidentifier;
//	}
//	/**
//	 * @return the prl_3_parentObservationValueDescriptor
//	 *	@JsonProperty("prl_3_parentObservationValueDescriptor")
//	 */
//	
//	public String getPrl_3_parentObservationValueDescriptor() {
//		return prl_3_parentObservationValueDescriptor;
//	}
//	/**
//	 * @param prl_3_parentObservationValueDescriptor the prl_3_parentObservationValueDescriptor to set
//	 * @JsonProperty("prl_3_parentObservationValueDescriptor")
//	 */
//	public void setPrl_3_parentObservationValueDescriptor(String prl_3_parentObservationValueDescriptor) {
//		this.prl_3_parentObservationValueDescriptor = prl_3_parentObservationValueDescriptor;
//	}
//	@Override
//	public String toString() {
//		return "PRL_ST [id=" + id + ", prl_1_parentObservationIdentifier=" + prl_1_parentObservationIdentifier
//				+ ", prl_2_parentObservationSubidentifier=" + prl_2_parentObservationSubidentifier
//				+ ", prl_3_parentObservationValueDescriptor=" + prl_3_parentObservationValueDescriptor + "]";
//	}
//	
//	
//}
