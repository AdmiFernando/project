//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
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
//@Table(name="FN_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class FN_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="FN_ID")
//	private Long id;
//	@Column(name="FN_1_v25")
//	@JsonProperty("fn_1_surname")
//	private String fn_1_surname;
//	@Column(name="FN_2_v25")
//	@JsonProperty("fn_2_ownSurnamePrefix")
//	private String fn_2_ownSurnamePrefix;
//	@Column(name="FN_3_v25")
//	@JsonProperty("fn_3_ownSurname")
//	private String fn_3_ownSurname;
//	@Column(name="FN_4_v25")
//	@JsonProperty("fn_4_surnamePrefixFromPartnerSpouse")
//	private String fn_4_surnamePrefixFromPartnerSpouse;
//	@Column(name="FN_5_v25")
//	@JsonProperty("fn_5_surnameFromPartnerSpouse")
//	private String fn_5_surnameFromPartnerSpouse;
//
//	public FN_ST_v25(String fn_1_surname, String fn_2_ownSurnamePrefix, String fn_3_ownSurname,
//			String fn_4_surnamePrefixFromPartnerSpouse, String fn_5_surnameFromPartnerSpouse) {
//		super();
//		this.fn_1_surname = fn_1_surname;
//		this.fn_2_ownSurnamePrefix = fn_2_ownSurnamePrefix;
//		this.fn_3_ownSurname = fn_3_ownSurname;
//		this.fn_4_surnamePrefixFromPartnerSpouse = fn_4_surnamePrefixFromPartnerSpouse;
//		this.fn_5_surnameFromPartnerSpouse = fn_5_surnameFromPartnerSpouse;
//	}
//
//	public FN_ST_v25() {
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
//	 * @return the fn_1_surname
//	 *	@JsonProperty("fn_1_surname")
//	 */
//	
//	public String getFn_1_surname() {
//		return fn_1_surname;
//	}
//
//	/**
//	 * @param fn_1_surname the fn_1_surname to set
//	 * @JsonProperty("fn_1_surname")
//	 */
//	public void setFn_1_surname(String fn_1_surname) {
//		this.fn_1_surname = fn_1_surname;
//	}
//
//	/**
//	 * @return the fn_2_ownSurnamePrefix
//	 *	@JsonProperty("fn_2_ownSurnamePrefix")
//	 */
//	
//	public String getFn_2_ownSurnamePrefix() {
//		return fn_2_ownSurnamePrefix;
//	}
//
//	/**
//	 * @param fn_2_ownSurnamePrefix the fn_2_ownSurnamePrefix to set
//	 * @JsonProperty("fn_2_ownSurnamePrefix")
//	 */
//	public void setFn_2_ownSurnamePrefix(String fn_2_ownSurnamePrefix) {
//		this.fn_2_ownSurnamePrefix = fn_2_ownSurnamePrefix;
//	}
//
//	/**
//	 * @return the fn_3_ownSurname
//	 *	@JsonProperty("fn_3_ownSurname")
//	 */
//	
//	public String getFn_3_ownSurname() {
//		return fn_3_ownSurname;
//	}
//
//	/**
//	 * @param fn_3_ownSurname the fn_3_ownSurname to set
//	 * @JsonProperty("fn_3_ownSurname")
//	 */
//	public void setFn_3_ownSurname(String fn_3_ownSurname) {
//		this.fn_3_ownSurname = fn_3_ownSurname;
//	}
//
//	/**
//	 * @return the fn_4_surnamePrefixFromPartnerSpouse
//	 *	@JsonProperty("fn_4_surnamePrefixFromPartnerSpouse")
//	 */
//	
//	public String getFn_4_surnamePrefixFromPartnerSpouse() {
//		return fn_4_surnamePrefixFromPartnerSpouse;
//	}
//
//	/**
//	 * @param fn_4_surnamePrefixFromPartnerSpouse the fn_4_surnamePrefixFromPartnerSpouse to set
//	 * @JsonProperty("fn_4_surnamePrefixFromPartnerSpouse")
//	 */
//	public void setFn_4_surnamePrefixFromPartnerSpouse(String fn_4_surnamePrefixFromPartnerSpouse) {
//		this.fn_4_surnamePrefixFromPartnerSpouse = fn_4_surnamePrefixFromPartnerSpouse;
//	}
//
//	/**
//	 * @return the fn_5_surnameFromPartnerSpouse
//	 *	@JsonProperty("fn_5_surnameFromPartnerSpouse")
//	 */
//	
//	public String getFn_5_surnameFromPartnerSpouse() {
//		return fn_5_surnameFromPartnerSpouse;
//	}
//
//	/**
//	 * @param fn_5_surnameFromPartnerSpouse the fn_5_surnameFromPartnerSpouse to set
//	 * @JsonProperty("fn_5_surnameFromPartnerSpouse")
//	 */
//	public void setFn_5_surnameFromPartnerSpouse(String fn_5_surnameFromPartnerSpouse) {
//		this.fn_5_surnameFromPartnerSpouse = fn_5_surnameFromPartnerSpouse;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "FN_ST_v25 [id=" + id + ", fn_1_surname=" + fn_1_surname + ", fn_2_ownSurnamePrefix="
//				+ fn_2_ownSurnamePrefix + ", fn_3_ownSurname=" + fn_3_ownSurname
//				+ ", fn_4_surnamePrefixFromPartnerSpouse=" + fn_4_surnamePrefixFromPartnerSpouse
//				+ ", fn_5_surnameFromPartnerSpouse=" + fn_5_surnameFromPartnerSpouse + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(fn_1_surname, fn_2_ownSurnamePrefix, fn_3_ownSurname, fn_4_surnamePrefixFromPartnerSpouse,
//				fn_5_surnameFromPartnerSpouse, id);
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
//		FN_ST_v25 other = (FN_ST_v25) obj;
//		return Objects.equals(fn_1_surname, other.fn_1_surname)
//				&& Objects.equals(fn_2_ownSurnamePrefix, other.fn_2_ownSurnamePrefix)
//				&& Objects.equals(fn_3_ownSurname, other.fn_3_ownSurname)
//				&& Objects.equals(fn_4_surnamePrefixFromPartnerSpouse, other.fn_4_surnamePrefixFromPartnerSpouse)
//				&& Objects.equals(fn_5_surnameFromPartnerSpouse, other.fn_5_surnameFromPartnerSpouse)
//				&& Objects.equals(id, other.id);
//	}
//
//}
