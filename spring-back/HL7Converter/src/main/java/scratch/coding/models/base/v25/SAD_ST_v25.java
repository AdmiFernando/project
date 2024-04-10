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
//@Table(name="SAD_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class SAD_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="SAD_ID")
//	private Long id;
//	@Column(name="SAD_1_v25")
//	@JsonProperty("sad_1_streetOrMailingAddress")
//	private String sad_1_streetOrMailingAddress;
//	@Column(name="SAD_2_v25")
//	@JsonProperty("sad_2_streetName")
//	private String sad_2_streetName;
//	@Column(name="SAD_3_v25")
//	@JsonProperty("sad_3_dwellingNumber")
//	private String sad_3_dwellingNumber;
//
//	public SAD_ST_v25(String sad_1_streetOrMailingAddress, String sad_2_streetName, String sad_3_dwellingNumber) {
//		super();
//		this.sad_1_streetOrMailingAddress = sad_1_streetOrMailingAddress;
//		this.sad_2_streetName = sad_2_streetName;
//		this.sad_3_dwellingNumber = sad_3_dwellingNumber;
//	}
//
//	public SAD_ST_v25() {
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
//	 * @return the sad_1_streetOrMailingAddress
//	 *	@JsonProperty("sad_1_streetOrMailingAddress")
//	 */
//	
//	public String getSad_1_streetOrMailingAddress() {
//		return sad_1_streetOrMailingAddress;
//	}
//
//	/**
//	 * @param sad_1_streetOrMailingAddress the sad_1_streetOrMailingAddress to set
//	 * @JsonProperty("sad_1_streetOrMailingAddress")
//	 */
//	public void setSad_1_streetOrMailingAddress(String sad_1_streetOrMailingAddress) {
//		this.sad_1_streetOrMailingAddress = sad_1_streetOrMailingAddress;
//	}
//
//	/**
//	 * @return the sad_2_streetName
//	 *	@JsonProperty("sad_2_streetName")
//	 */
//	
//	public String getSad_2_streetName() {
//		return sad_2_streetName;
//	}
//
//	/**
//	 * @param sad_2_streetName the sad_2_streetName to set
//	 * @JsonProperty("sad_2_streetName")
//	 */
//	public void setSad_2_streetName(String sad_2_streetName) {
//		this.sad_2_streetName = sad_2_streetName;
//	}
//
//	/**
//	 * @return the sad_3_dwellingNumber
//	 *	@JsonProperty("sad_3_dwellingNumber")
//	 */
//	
//	public String getSad_3_dwellingNumber() {
//		return sad_3_dwellingNumber;
//	}
//
//	/**
//	 * @param sad_3_dwellingNumber the sad_3_dwellingNumber to set
//	 * @JsonProperty("sad_3_dwellingNumber")
//	 */
//	public void setSad_3_dwellingNumber(String sad_3_dwellingNumber) {
//		this.sad_3_dwellingNumber = sad_3_dwellingNumber;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, sad_1_streetOrMailingAddress, sad_2_streetName, sad_3_dwellingNumber);
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
//		SAD_ST_v25 other = (SAD_ST_v25) obj;
//		return Objects.equals(id, other.id)
//				&& Objects.equals(sad_1_streetOrMailingAddress, other.sad_1_streetOrMailingAddress)
//				&& Objects.equals(sad_2_streetName, other.sad_2_streetName)
//				&& Objects.equals(sad_3_dwellingNumber, other.sad_3_dwellingNumber);
//	}
//	
//	
//}
