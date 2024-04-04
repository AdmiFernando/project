package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CNN_v25 {
						
	@JsonProperty("cnn_1_idNumber")
	private String cnn_1_idNumber;
	@JsonProperty("cnn_2_familyName")
	private String cnn_2_familyName;
	@JsonProperty("cnn_3_givenName")
	private String cnn_3_givenName;
	@JsonProperty("cnn_4_secondAndFurtherGivenNamesOrInitialsThereof")
	private String cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	@JsonProperty("cnn_5_suffix")
	private String cnn_5_suffix;
	@JsonProperty("cnn_6_prefix")
	private String cnn_6_prefix;
	@JsonProperty("cnn_7_degree")
	private String cnn_7_degree;
	@JsonProperty("cnn_8_sourceTable")
	private String cnn_8_sourceTable;
	@JsonProperty("cnn_9_assigningAuthorityNamespaceId")
	private String cnn_9_assigningAuthorityNamespaceId;
	@JsonProperty("cnn_10_assigningAuthorityUniversalId")
	private String cnn_10_assigningAuthorityUniversalId;
	@JsonProperty("cnn_11_assigningAuthorityUniversalIdType")
	private String cnn_11_assigningAuthorityUniversalIdType;
	public CNN_v25() {
		super();
		this.cnn_1_idNumber = "";
		this.cnn_2_familyName = "";
		this.cnn_3_givenName = "";
		this.cnn_4_secondAndFurtherGivenNamesOrInitialsThereof = "";
		this.cnn_5_suffix = "";
		this.cnn_6_prefix = "";
		this.cnn_7_degree = "";
		this.cnn_8_sourceTable = "";
		this.cnn_9_assigningAuthorityNamespaceId = "";
		this.cnn_10_assigningAuthorityUniversalId = "";
		this.cnn_11_assigningAuthorityUniversalIdType = "";
	}
	public CNN_v25(String cnn_1_idNumber, String cnn_2_familyName, String cnn_3_givenName,
			String cnn_4_secondAndFurtherGivenNamesOrInitialsThereof, String cnn_5_suffix, String cnn_6_prefix,
			String cnn_7_degree, String cnn_8_sourceTable, String cnn_9_assigningAuthorityNamespaceId,
			String cnn_10_assigningAuthorityUniversalId, String cnn_11_assigningAuthorityUniversalIdType) {
		super();
		this.cnn_1_idNumber = cnn_1_idNumber;
		this.cnn_2_familyName = cnn_2_familyName;
		this.cnn_3_givenName = cnn_3_givenName;
		this.cnn_4_secondAndFurtherGivenNamesOrInitialsThereof = cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
		this.cnn_5_suffix = cnn_5_suffix;
		this.cnn_6_prefix = cnn_6_prefix;
		this.cnn_7_degree = cnn_7_degree;
		this.cnn_8_sourceTable = cnn_8_sourceTable;
		this.cnn_9_assigningAuthorityNamespaceId = cnn_9_assigningAuthorityNamespaceId;
		this.cnn_10_assigningAuthorityUniversalId = cnn_10_assigningAuthorityUniversalId;
		this.cnn_11_assigningAuthorityUniversalIdType = cnn_11_assigningAuthorityUniversalIdType;
	}
	public String getCnn_1_idNumber() {
		return cnn_1_idNumber;
	}
	public void setCnn_1_idNumber(String cnn_1_idNumber) {
		this.cnn_1_idNumber = cnn_1_idNumber;
	}
	public String getCnn_2_familyName() {
		return cnn_2_familyName;
	}
	public void setCnn_2_familyName(String cnn_2_familyName) {
		this.cnn_2_familyName = cnn_2_familyName;
	}
	public String getCnn_3_givenName() {
		return cnn_3_givenName;
	}
	public void setCnn_3_givenName(String cnn_3_givenName) {
		this.cnn_3_givenName = cnn_3_givenName;
	}
	public String getCnn_4_secondAndFurtherGivenNamesOrInitialsThereof() {
		return cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	}
	public void setCnn_4_secondAndFurtherGivenNamesOrInitialsThereof(
			String cnn_4_secondAndFurtherGivenNamesOrInitialsThereof) {
		this.cnn_4_secondAndFurtherGivenNamesOrInitialsThereof = cnn_4_secondAndFurtherGivenNamesOrInitialsThereof;
	}
	public String getCnn_5_suffix() {
		return cnn_5_suffix;
	}
	public void setCnn_5_suffix(String cnn_5_suffix) {
		this.cnn_5_suffix = cnn_5_suffix;
	}
	public String getCnn_6_prefix() {
		return cnn_6_prefix;
	}
	public void setCnn_6_prefix(String cnn_6_prefix) {
		this.cnn_6_prefix = cnn_6_prefix;
	}
	public String getCnn_7_degree() {
		return cnn_7_degree;
	}
	public void setCnn_7_degree(String cnn_7_degree) {
		this.cnn_7_degree = cnn_7_degree;
	}
	public String getCnn_8_sourceTable() {
		return cnn_8_sourceTable;
	}
	public void setCnn_8_sourceTable(String cnn_8_sourceTable) {
		this.cnn_8_sourceTable = cnn_8_sourceTable;
	}
	public String getCnn_9_assigningAuthorityNamespaceId() {
		return cnn_9_assigningAuthorityNamespaceId;
	}
	public void setCnn_9_assigningAuthorityNamespaceId(String cnn_9_assigningAuthorityNamespaceId) {
		this.cnn_9_assigningAuthorityNamespaceId = cnn_9_assigningAuthorityNamespaceId;
	}
	public String getCnn_10_assigningAuthorityUniversalId() {
		return cnn_10_assigningAuthorityUniversalId;
	}
	public void setCnn_10_assigningAuthorityUniversalId(String cnn_10_assigningAuthorityUniversalId) {
		this.cnn_10_assigningAuthorityUniversalId = cnn_10_assigningAuthorityUniversalId;
	}
	public String getCnn_11_assigningAuthorityUniversalIdType() {
		return cnn_11_assigningAuthorityUniversalIdType;
	}
	public void setCnn_11_assigningAuthorityUniversalIdType(String cnn_11_assigningAuthorityUniversalIdType) {
		this.cnn_11_assigningAuthorityUniversalIdType = cnn_11_assigningAuthorityUniversalIdType;
	}
	@Override
	public String toString() {
		return "CNN_v25 [cnn_1_idNumber=" + cnn_1_idNumber + ", cnn_2_familyName=" + cnn_2_familyName
				+ ", cnn_3_givenName=" + cnn_3_givenName + ", cnn_4_secondAndFurtherGivenNamesOrInitialsThereof="
				+ cnn_4_secondAndFurtherGivenNamesOrInitialsThereof + ", cnn_5_suffix=" + cnn_5_suffix
				+ ", cnn_6_prefix=" + cnn_6_prefix + ", cnn_7_degree=" + cnn_7_degree + ", cnn_8_sourceTable="
				+ cnn_8_sourceTable + ", cnn_9_assigningAuthorityNamespaceId=" + cnn_9_assigningAuthorityNamespaceId
				+ ", cnn_10_assigningAuthorityUniversalId=" + cnn_10_assigningAuthorityUniversalId
				+ ", cnn_11_assigningAuthorityUniversalIdType=" + cnn_11_assigningAuthorityUniversalIdType + "]";
	}
}
