//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
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
//@Table(name="CNN_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CNN_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CNN_ID")
//	private Long id;
//	@Column(name="CNN_1_v25")
//	@JsonProperty("cnn_1_idNumber")
//	private String cnn_1_idNumber;
//	@Column(name="CNN_2_v25")
//	@JsonProperty("cnn_2_familyName")
//	private String cnn_2_familyName;
//	@Column(name="CNN_3_v25")
//	@JsonProperty("cnn_3_givenName")
//	private String cnn_3_givenName;
//	@Column(name="CNN_4_v25")
//	@JsonProperty("cnn_4_secondAndFurtherGivenNamesOrInitialsThereof")
//	private String cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//	@Column(name="CNN_5_v25")
//	@JsonProperty("cnn_5_suffix")
//	private String cnn_5_suffix;
//	@Column(name="CNN_6_v25")
//	@JsonProperty("cnn_6_prefix")
//	private String cnn_6_prefix;
//	@Column(name="CNN_7_v25")
//	@JsonProperty("cnn_7_degree")
//	private String cnn_7_degree;
//	@Column(name="CNN_8_v25")
//	@JsonProperty("cnn_8_sourceTable")
//	private String cnn_8_sourceTable;
//	@Column(name="CNN_9_v25")
//	@JsonProperty("cnn_9_assigningAuthorityNamespaceId")
//	private String cnn_9_assigningAuthorityNamespaceId;
//	@Column(name="CNN_10_v25")
//	@JsonProperty("cnn_10_assigningAuthorityUniversalId")
//	private String cnn_10_assigningAuthorityUniversalId;
//	@Column(name="CNN_11_v25")
//	@JsonProperty("cnn_11_assigningAuthorityUniversalIdType")
//	private String cnn_11_assigningAuthorityUniversalIdType;
//	public CNN_ST_v25(String cnn_1_idNumber, String cnn_2_familyName, String cnn_3_givenName,
//			String cnn_4_secondAndFurtherGivenNamesOrInitialsThereof, String cnn_5_suffix, String cnn_6_prefix,
//			String cnn_7_degree, String cnn_8_sourceTable, String cnn_9_assigningAuthorityNamespaceId,
//			String cnn_10_assigningAuthorityUniversalId, String cnn_11_assigningAuthorityUniversalIdType) {
//		super();
//		this.cnn_1_idNumber = cnn_1_idNumber;
//		this.cnn_2_familyName = cnn_2_familyName;
//		this.cnn_3_givenName = cnn_3_givenName;
//		this.cnn_4_secondAndFurtherGivenNamesOrInitialsThereof = cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//		this.cnn_5_suffix = cnn_5_suffix;
//		this.cnn_6_prefix = cnn_6_prefix;
//		this.cnn_7_degree = cnn_7_degree;
//		this.cnn_8_sourceTable = cnn_8_sourceTable;
//		this.cnn_9_assigningAuthorityNamespaceId = cnn_9_assigningAuthorityNamespaceId;
//		this.cnn_10_assigningAuthorityUniversalId = cnn_10_assigningAuthorityUniversalId;
//		this.cnn_11_assigningAuthorityUniversalIdType = cnn_11_assigningAuthorityUniversalIdType;
//	}
//	public CNN_ST_v25() {
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
//	 * @return the cnn_1_idNumber
//	 *	@JsonProperty("cnn_1_idNumber")
//	 */
//	
//	public String getCnn_1_idNumber() {
//		return cnn_1_idNumber;
//	}
//	/**
//	 * @param cnn_1_idNumber the cnn_1_idNumber to set
//	 * @JsonProperty("cnn_1_idNumber")
//	 */
//	public void setCnn_1_idNumber(String cnn_1_idNumber) {
//		this.cnn_1_idNumber = cnn_1_idNumber;
//	}
//	/**
//	 * @return the cnn_2_familyName
//	 *	@JsonProperty("cnn_2_familyName")
//	 */
//	
//	public String getCnn_2_familyName() {
//		return cnn_2_familyName;
//	}
//	/**
//	 * @param cnn_2_familyName the cnn_2_familyName to set
//	 * @JsonProperty("cnn_2_familyName")
//	 */
//	public void setCnn_2_familyName(String cnn_2_familyName) {
//		this.cnn_2_familyName = cnn_2_familyName;
//	}
//	/**
//	 * @return the cnn_3_givenName
//	 *	@JsonProperty("cnn_3_givenName")
//	 */
//	
//	public String getCnn_3_givenName() {
//		return cnn_3_givenName;
//	}
//	/**
//	 * @param cnn_3_givenName the cnn_3_givenName to set
//	 * @JsonProperty("cnn_3_givenName")
//	 */
//	public void setCnn_3_givenName(String cnn_3_givenName) {
//		this.cnn_3_givenName = cnn_3_givenName;
//	}
//	/**
//	 * @return the cnn_4_secondAndFurtherGivenNamesOrInitialsThereof
//	 *	@JsonProperty("cnn_4_secondAndFurtherGivenNamesOrInitialsThereof")
//	 */
//	
//	public String getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof() {
//		return cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//	}
//	/**
//	 * @param cnn_4_secondAndFurtherGivenNamesOrInitialsThereof the cnn_4_secondAndFurtherGivenNamesOrInitialsThereof to set
//	 * @JsonProperty("cnn_4_secondAndFurtherGivenNamesOrInitialsThereof")
//	 */
//	public void setCnn_4_secondAndFurtherGivenNamesOrInitialsThereof(
//			String cnn_4_secondAndFurtherGivenNamesOrInitialsThereof) {
//		this.cnn_4_secondAndFurtherGivenNamesOrInitialsThereof = cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
//	}
//	/**
//	 * @return the cnn_5_suffix
//	 *	@JsonProperty("cnn_5_suffix")
//	 */
//	
//	public String getCnn_5_suffix() {
//		return cnn_5_suffix;
//	}
//	/**
//	 * @param cnn_5_suffix the cnn_5_suffix to set
//	 * @JsonProperty("cnn_5_suffix")
//	 */
//	public void setCnn_5_suffix(String cnn_5_suffix) {
//		this.cnn_5_suffix = cnn_5_suffix;
//	}
//	/**
//	 * @return the cnn_6_prefix
//	 *	@JsonProperty("cnn_6_prefix")
//	 */
//	
//	public String getCnn_6_prefix() {
//		return cnn_6_prefix;
//	}
//	/**
//	 * @param cnn_6_prefix the cnn_6_prefix to set
//	 * @JsonProperty("cnn_6_prefix")
//	 */
//	public void setCnn_6_prefix(String cnn_6_prefix) {
//		this.cnn_6_prefix = cnn_6_prefix;
//	}
//	/**
//	 * @return the cnn_7_degree
//	 *	@JsonProperty("cnn_7_degree")
//	 */
//	
//	public String getCnn_7_degree() {
//		return cnn_7_degree;
//	}
//	/**
//	 * @param cnn_7_degree the cnn_7_degree to set
//	 * @JsonProperty("cnn_7_degree")
//	 */
//	public void setCnn_7_degree(String cnn_7_degree) {
//		this.cnn_7_degree = cnn_7_degree;
//	}
//	/**
//	 * @return the cnn_8_sourceTable
//	 *	@JsonProperty("cnn_8_sourceTable")
//	 */
//	
//	public String getCnn_8_sourceTable() {
//		return cnn_8_sourceTable;
//	}
//	/**
//	 * @param cnn_8_sourceTable the cnn_8_sourceTable to set
//	 * @JsonProperty("cnn_8_sourceTable")
//	 */
//	public void setCnn_8_sourceTable(String cnn_8_sourceTable) {
//		this.cnn_8_sourceTable = cnn_8_sourceTable;
//	}
//	/**
//	 * @return the cnn_9_assigningAuthorityNamespaceId
//	 *	@JsonProperty("cnn_9_assigningAuthorityNamespaceId")
//	 */
//	
//	public String getCnn_9_assigningAuthorityNamespaceId() {
//		return cnn_9_assigningAuthorityNamespaceId;
//	}
//	/**
//	 * @param cnn_9_assigningAuthorityNamespaceId the cnn_9_assigningAuthorityNamespaceId to set
//	 * @JsonProperty("cnn_9_assigningAuthorityNamespaceId")
//	 */
//	public void setCnn_9_assigningAuthorityNamespaceId(String cnn_9_assigningAuthorityNamespaceId) {
//		this.cnn_9_assigningAuthorityNamespaceId = cnn_9_assigningAuthorityNamespaceId;
//	}
//	/**
//	 * @return the cnn_10_assigningAuthorityUniversalId
//	 *	@JsonProperty("cnn_10_assigningAuthorityUniversalId")
//	 */
//	
//	public String getCnn_10_assigningAuthorityUniversalId() {
//		return cnn_10_assigningAuthorityUniversalId;
//	}
//	/**
//	 * @param cnn_10_assigningAuthorityUniversalId the cnn_10_assigningAuthorityUniversalId to set
//	 * @JsonProperty("cnn_10_assigningAuthorityUniversalId")
//	 */
//	public void setCnn_10_assigningAuthorityUniversalId(String cnn_10_assigningAuthorityUniversalId) {
//		this.cnn_10_assigningAuthorityUniversalId = cnn_10_assigningAuthorityUniversalId;
//	}
//	/**
//	 * @return the cnn_11_assigningAuthorityUniversalIdType
//	 *	@JsonProperty("cnn_11_assigningAuthorityUniversalIdType")
//	 */
//	
//	public String getCnn_11_assigningAuthorityUniversalIdType() {
//		return cnn_11_assigningAuthorityUniversalIdType;
//	}
//	/**
//	 * @param cnn_11_assigningAuthorityUniversalIdType the cnn_11_assigningAuthorityUniversalIdType to set
//	 * @JsonProperty("cnn_11_assigningAuthorityUniversalIdType")
//	 */
//	public void setCnn_11_assigningAuthorityUniversalIdType(String cnn_11_assigningAuthorityUniversalIdType) {
//		this.cnn_11_assigningAuthorityUniversalIdType = cnn_11_assigningAuthorityUniversalIdType;
//	}
//	@Override
//	public String toString() {
//		return "CNN_ST_v25 [id=" + id + ", cnn_1_idNumber=" + cnn_1_idNumber + ", cnn_2_familyName=" + cnn_2_familyName
//				+ ", cnn_3_givenName=" + cnn_3_givenName + ", cnn_4_secondAndFurtherGivenNamesOrInitialsThereof="
//				+ cnn_4_secondAndFurtherGivenNamesOrInitialsThereof + ", cnn_5_suffix=" + cnn_5_suffix
//				+ ", cnn_6_prefix=" + cnn_6_prefix + ", cnn_7_degree=" + cnn_7_degree + ", cnn_8_sourceTable="
//				+ cnn_8_sourceTable + ", cnn_9_assigningAuthorityNamespaceId=" + cnn_9_assigningAuthorityNamespaceId
//				+ ", cnn_10_assigningAuthorityUniversalId=" + cnn_10_assigningAuthorityUniversalId
//				+ ", cnn_11_assigningAuthorityUniversalIdType=" + cnn_11_assigningAuthorityUniversalIdType + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(cnn_10_assigningAuthorityUniversalId, cnn_11_assigningAuthorityUniversalIdType,
//				cnn_1_idNumber, cnn_2_familyName, cnn_3_givenName, cnn_4_secondAndFurtherGivenNamesOrInitialsThereof,
//				cnn_5_suffix, cnn_6_prefix, cnn_7_degree, cnn_8_sourceTable, cnn_9_assigningAuthorityNamespaceId, id);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CNN_ST_v25 other = (CNN_ST_v25) obj;
//		return Objects.equals(cnn_10_assigningAuthorityUniversalId, other.cnn_10_assigningAuthorityUniversalId)
//				&& Objects.equals(cnn_11_assigningAuthorityUniversalIdType,
//						other.cnn_11_assigningAuthorityUniversalIdType)
//				&& Objects.equals(cnn_1_idNumber, other.cnn_1_idNumber)
//				&& Objects.equals(cnn_2_familyName, other.cnn_2_familyName)
//				&& Objects.equals(cnn_3_givenName, other.cnn_3_givenName)
//				&& Objects.equals(cnn_4_secondAndFurtherGivenNamesOrInitialsThereof,
//						other.cnn_4_secondAndFurtherGivenNamesOrInitialsThereof)
//				&& Objects.equals(cnn_5_suffix, other.cnn_5_suffix) && Objects.equals(cnn_6_prefix, other.cnn_6_prefix)
//				&& Objects.equals(cnn_7_degree, other.cnn_7_degree)
//				&& Objects.equals(cnn_8_sourceTable, other.cnn_8_sourceTable)
//				&& Objects.equals(cnn_9_assigningAuthorityNamespaceId, other.cnn_9_assigningAuthorityNamespaceId)
//				&& Objects.equals(id, other.id);
//	}
//	
//}
