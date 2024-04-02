package scratch.coding.models.v23;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.HD_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CN_v23 {
	@JsonProperty("cn_1_iDNumber")
	private String  cn_1_iDNumber;
	@JsonProperty("cn_2_familyName")
	private String cn_2_familyName;
	@JsonProperty("cn_3_givenName")
	private String cn_3_givenName;
	@JsonProperty("cn_4_middleInitialOrName")
	private String cn_4_middleInitialOrName;
	@JsonProperty("cn_5_suffix")
	private String cn_5_suffix;
	@JsonProperty("cn_6_prefix")
	private String cn_6_prefix;
	@JsonProperty("cn_7_degree")
	private String cn_7_degree;
	@JsonProperty("cn_8_sourceTable")
	private String cn_8_sourceTable;
	@JsonProperty("cn_9_assigningAuthority")
	private HD_v2 hd_cn_9_assigningAuthority;
	public CN_v23() {
		super();
		this.cn_1_iDNumber = "";
		this.cn_2_familyName = "";
		this.cn_3_givenName = "";
		this.cn_4_middleInitialOrName = "";
		this.cn_5_suffix = "";
		this.cn_6_prefix = "";
		this.cn_7_degree = "";
		this.cn_8_sourceTable = "";
		this.hd_cn_9_assigningAuthority = new HD_v2();
	}
	public CN_v23(String cn_1_iDNumber, String cn_2_familyName, String cn_3_givenName, String cn_4_middleInitialOrName,
			String cn_5_suffix, String cn_6_prefix, String cn_7_degree, String cn_8_sourceTable,
			HD_v2 hd_cn_9_assigningAuthority) {
		super();
		this.cn_1_iDNumber = cn_1_iDNumber;
		this.cn_2_familyName = cn_2_familyName;
		this.cn_3_givenName = cn_3_givenName;
		this.cn_4_middleInitialOrName = cn_4_middleInitialOrName;
		this.cn_5_suffix = cn_5_suffix;
		this.cn_6_prefix = cn_6_prefix;
		this.cn_7_degree = cn_7_degree;
		this.cn_8_sourceTable = cn_8_sourceTable;
		this.hd_cn_9_assigningAuthority = hd_cn_9_assigningAuthority;
	}
	public String getCn_1_iDNumber() {
		return cn_1_iDNumber;
	}
	public void setCn_1_iDNumber(String cn_1_iDNumber) {
		this.cn_1_iDNumber = cn_1_iDNumber;
	}
	public String getCn_2_familyName() {
		return cn_2_familyName;
	}
	public void setCn_2_familyName(String cn_2_familyName) {
		this.cn_2_familyName = cn_2_familyName;
	}
	public String getCn_3_givenName() {
		return cn_3_givenName;
	}
	public void setCn_3_givenName(String cn_3_givenName) {
		this.cn_3_givenName = cn_3_givenName;
	}
	public String getCn_4_middleInitialOrName() {
		return cn_4_middleInitialOrName;
	}
	public void setCn_4_middleInitialOrName(String cn_4_middleInitialOrName) {
		this.cn_4_middleInitialOrName = cn_4_middleInitialOrName;
	}
	public String getCn_5_suffix() {
		return cn_5_suffix;
	}
	public void setCn_5_suffix(String cn_5_suffix) {
		this.cn_5_suffix = cn_5_suffix;
	}
	public String getCn_6_prefix() {
		return cn_6_prefix;
	}
	public void setCn_6_prefix(String cn_6_prefix) {
		this.cn_6_prefix = cn_6_prefix;
	}
	public String getCn_7_degree() {
		return cn_7_degree;
	}
	public void setCn_7_degree(String cn_7_degree) {
		this.cn_7_degree = cn_7_degree;
	}
	public String getCn_8_sourceTable() {
		return cn_8_sourceTable;
	}
	public void setCn_8_sourceTable(String cn_8_sourceTable) {
		this.cn_8_sourceTable = cn_8_sourceTable;
	}
	public HD_v2 getHd_cn_9_assigningAuthority() {
		return hd_cn_9_assigningAuthority;
	}
	public void setHd_cn_9_assigningAuthority(HD_v2 hd_cn_9_assigningAuthority) {
		this.hd_cn_9_assigningAuthority = hd_cn_9_assigningAuthority;
	}
	@Override
	public String toString() {
		return "CN_v23 [cn_1_iDNumber=" + cn_1_iDNumber + ", cn_2_familyName=" + cn_2_familyName + ", cn_3_givenName="
				+ cn_3_givenName + ", cn_4_middleInitialOrName=" + cn_4_middleInitialOrName + ", cn_5_suffix="
				+ cn_5_suffix + ", cn_6_prefix=" + cn_6_prefix + ", cn_7_degree=" + cn_7_degree + ", cn_8_sourceTable="
				+ cn_8_sourceTable + ", hd_cn_9_assigningAuthority=" + hd_cn_9_assigningAuthority + "]";
	}
	
	
}
