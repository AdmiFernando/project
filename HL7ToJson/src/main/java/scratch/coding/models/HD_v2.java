package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class HD_v2 {
	
	@JsonProperty("hd_1_namespaceId")
	private String hd_1_namespaceId;
	@JsonProperty("hd_2_universalId")
	private String hd_2_universalId;
	@JsonProperty("hd_3_universalIdType")
	private String hd_3_universalIdType;
	public HD_v2(String hd_1_namespaceId, String hd_2_universalId, String hd_3_universalIdType) {
		super();
		this.hd_1_namespaceId = hd_1_namespaceId;
		this.hd_2_universalId = hd_2_universalId;
		this.hd_3_universalIdType = hd_3_universalIdType;
	}
	public HD_v2() {
		super();
	}
	public String getHd_1_namespaceId() {
		return hd_1_namespaceId;
	}
	public void setHd_1_namespaceId(String hd_1_namespaceId) {
		this.hd_1_namespaceId = hd_1_namespaceId;
	}
	public String getHd_2_universalId() {
		return hd_2_universalId;
	}
	public void setHd_2_universalId(String hd_2_universalId) {
		this.hd_2_universalId = hd_2_universalId;
	}
	public String getHd_3_universalIdType() {
		return hd_3_universalIdType;
	}
	public void setHd_3_universalIdType(String hd_3_universalIdType) {
		this.hd_3_universalIdType = hd_3_universalIdType;
	}
	@Override
	public String toString() {
		return "HD_v25 [hd_1_namespaceId=" + hd_1_namespaceId + ", hd_2_universalId=" + hd_2_universalId
				+ ", hd_3_universalIdType=" + hd_3_universalIdType + "]";
	}
	
}
