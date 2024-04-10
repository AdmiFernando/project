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
////import scratch.coding.segment.base.v25.PID_ST_v25;
//
//@Table(name="DLN_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class DLN_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="DLN_ID")
//	private Long id;
//	@Column(name="DLN_1")
//	@JsonProperty("dln_1_licenseNumber")
//	private String dln_1_licenseNumber;
//	@Column(name="DLN_2")
//	@JsonProperty("dln_2_issuingStateProvinceCountry")
//	private String dln_2_issuingStateProvinceCountry;
//	@Column(name="DLN_3")
//	@JsonProperty("dln_3_expirationDate")
//	private String dln_3_expirationDate;
//
//	public DLN_ST(String dln_1_licenseNumber, String dln_2_issuingStateProvinceCountry, String dln_3_expirationDate) {
//		super();
//		this.dln_1_licenseNumber = dln_1_licenseNumber;
//		this.dln_2_issuingStateProvinceCountry = dln_2_issuingStateProvinceCountry;
//		this.dln_3_expirationDate = dln_3_expirationDate;
//	}
//
//	public DLN_ST() {
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
//	 * @return the dln_1_licenseNumber
//	 *	@JsonProperty("dln_1_licenseNumber")
//	 */
//	
//	public String getDln_1_licenseNumber() {
//		return dln_1_licenseNumber;
//	}
//
//	/**
//	 * @param dln_1_licenseNumber the dln_1_licenseNumber to set
//	 * @JsonProperty("dln_1_licenseNumber")
//	 */
//	public void setDln_1_licenseNumber(String dln_1_licenseNumber) {
//		this.dln_1_licenseNumber = dln_1_licenseNumber;
//	}
//
//	/**
//	 * @return the dln_2_issuingStateProvinceCountry
//	 *	@JsonProperty("dln_2_issuingStateProvinceCountry")
//	 */
//	
//	public String getDln_2_issuingStateProvinceCountry() {
//		return dln_2_issuingStateProvinceCountry;
//	}
//
//	/**
//	 * @param dln_2_issuingStateProvinceCountry the dln_2_issuingStateProvinceCountry to set
//	 * @JsonProperty("dln_2_issuingStateProvinceCountry")
//	 */
//	public void setDln_2_issuingStateProvinceCountry(String dln_2_issuingStateProvinceCountry) {
//		this.dln_2_issuingStateProvinceCountry = dln_2_issuingStateProvinceCountry;
//	}
//
//	/**
//	 * @return the dln_3_expirationDate
//	 *	@JsonProperty("dln_3_expirationDate")
//	 */
//	
//	public String getDln_3_expirationDate() {
//		return dln_3_expirationDate;
//	}
//
//	/**
//	 * @param dln_3_expirationDate the dln_3_expirationDate to set
//	 * @JsonProperty("dln_3_expirationDate")
//	 */
//	public void setDln_3_expirationDate(String dln_3_expirationDate) {
//		this.dln_3_expirationDate = dln_3_expirationDate;
//	}
//
//	/**
//	 * @return the pid_20_v25
//	 *	@JsonProperty("pid_20_v25")
//	 */
//	
////	public PID_ST_v25 getPid_20_v25() {
////		return pid_20_v25;
////	}
////
////	/**
////	 * @param pid_20_v25 the pid_20_v25 to set
////	 * @JsonProperty("pid_20_v25")
////	 */
////	public void setPid_20_v25(PID_ST_v25 pid_20_v25) {
////		this.pid_20_v25 = pid_20_v25;
////	}
//
////	@Override
////	public String toString() {
////		return "DLN_ST [id=" + id + ", dln_1_licenseNumber=" + dln_1_licenseNumber
////				+ ", dln_2_issuingStateProvinceCountry=" + dln_2_issuingStateProvinceCountry + ", dln_3_expirationDate="
////				+ dln_3_expirationDate + ", pid_20_v25=" + pid_20_v25 + "]";
////	}
//	
//	
//}
