package scratch.coding.models.base.v25;
//package scratch.coding.models.base.v25;
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
//@Table(name="PLN_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class PLN_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="PLN_ID")
//	private Long id;
//	@Column(name="PLN_1_v25")
//	@JsonProperty("pnl_1_idNumber")
//	private String pnl_1_idNumber;
//	@Column(name="PLN_2_v25")
//	@JsonProperty("pnl_2_typeOfIdNumber")
//	private String pnl_2_typeOfIdNumber;
//	@Column(name="PLN_3_v25")
//	@JsonProperty("pnl_3_stateOtherQualifyingInformation")
//	private String pnl_3_stateOtherQualifyingInformation;
//	@Column(name="PLN_4_v25")
//	@JsonProperty("pnl_4_expirationDate")
//	private String pnl_4_expirationDate;
//	public PLN_ST_v25(String pnl_1_idNumber, String pnl_2_typeOfIdNumber, String pnl_3_stateOtherQualifyingInformation,
//			String pnl_4_expirationDate) {
//		super();
//		this.pnl_1_idNumber = pnl_1_idNumber;
//		this.pnl_2_typeOfIdNumber = pnl_2_typeOfIdNumber;
//		this.pnl_3_stateOtherQualifyingInformation = pnl_3_stateOtherQualifyingInformation;
//		this.pnl_4_expirationDate = pnl_4_expirationDate;
//	}
//	public PLN_ST_v25() {
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
//	 * @return the pnl_1_idNumber
//	 *	@JsonProperty("pnl_1_idNumber")
//	 */
//	
//	public String getPnl_1_idNumber() {
//		return pnl_1_idNumber;
//	}
//	/**
//	 * @param pnl_1_idNumber the pnl_1_idNumber to set
//	 * @JsonProperty("pnl_1_idNumber")
//	 */
//	public void setPnl_1_idNumber(String pnl_1_idNumber) {
//		this.pnl_1_idNumber = pnl_1_idNumber;
//	}
//	/**
//	 * @return the pnl_2_typeOfIdNumber
//	 *	@JsonProperty("pnl_2_typeOfIdNumber")
//	 */
//	
//	public String getPnl_2_typeOfIdNumber() {
//		return pnl_2_typeOfIdNumber;
//	}
//	/**
//	 * @param pnl_2_typeOfIdNumber the pnl_2_typeOfIdNumber to set
//	 * @JsonProperty("pnl_2_typeOfIdNumber")
//	 */
//	public void setPnl_2_typeOfIdNumber(String pnl_2_typeOfIdNumber) {
//		this.pnl_2_typeOfIdNumber = pnl_2_typeOfIdNumber;
//	}
//	/**
//	 * @return the pnl_3_stateOtherQualifyingInformation
//	 *	@JsonProperty("pnl_3_stateOtherQualifyingInformation")
//	 */
//	
//	public String getPnl_3_stateOtherQualifyingInformation() {
//		return pnl_3_stateOtherQualifyingInformation;
//	}
//	/**
//	 * @param pnl_3_stateOtherQualifyingInformation the pnl_3_stateOtherQualifyingInformation to set
//	 * @JsonProperty("pnl_3_stateOtherQualifyingInformation")
//	 */
//	public void setPnl_3_stateOtherQualifyingInformation(String pnl_3_stateOtherQualifyingInformation) {
//		this.pnl_3_stateOtherQualifyingInformation = pnl_3_stateOtherQualifyingInformation;
//	}
//	/**
//	 * @return the pnl_4_expirationDate
//	 *	@JsonProperty("pnl_4_expirationDate")
//	 */
//	
//	public String getPnl_4_expirationDate() {
//		return pnl_4_expirationDate;
//	}
//	/**
//	 * @param pnl_4_expirationDate the pnl_4_expirationDate to set
//	 * @JsonProperty("pnl_4_expirationDate")
//	 */
//	public void setPnl_4_expirationDate(String pnl_4_expirationDate) {
//		this.pnl_4_expirationDate = pnl_4_expirationDate;
//	}
//	@Override
//	public String toString() {
//		return "PLN_ST_v25 [id=" + id + ", pnl_1_idNumber=" + pnl_1_idNumber + ", pnl_2_typeOfIdNumber="
//				+ pnl_2_typeOfIdNumber + ", pnl_3_stateOtherQualifyingInformation="
//				+ pnl_3_stateOtherQualifyingInformation + ", pnl_4_expirationDate=" + pnl_4_expirationDate + "]";
//	}
//	
//}
