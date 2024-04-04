package scratch.coding.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class EI_v2 {
								
	@JsonProperty("ei_1_entityIdentifier")
	private String ei_1_entityIdentifier;
	@JsonProperty("ei_2_namespaceId")
	private String ei_2_namespaceId;
	@JsonProperty("ei_3_universalId")
	private String ei_3_universalId;
	@JsonProperty("ei_4_universalIdType")
	private String ei_4_universalIdType;
	public EI_v2(String ei_1_entityIdentifier, String ei_2_namespaceId, String ei_3_universalId,
			String ei_4_universalIdType) {
		super();
		this.ei_1_entityIdentifier = ei_1_entityIdentifier;
		this.ei_2_namespaceId = ei_2_namespaceId;
		this.ei_3_universalId = ei_3_universalId;
		this.ei_4_universalIdType = ei_4_universalIdType;
	}
	public EI_v2() {
		super();
		this.ei_1_entityIdentifier = "";
		this.ei_2_namespaceId = "";
		this.ei_3_universalId = "";
		this.ei_4_universalIdType = "";
	}
	public String getEi_1_entityIdentifier() {
		return ei_1_entityIdentifier;
	}
	public void setEi_1_entityIdentifier(String ei_1_entityIdentifier) {
		this.ei_1_entityIdentifier = ei_1_entityIdentifier;
	}
	public String getEi_2_namespaceId() {
		return ei_2_namespaceId;
	}
	public void setEi_2_namespaceId(String ei_2_namespaceId) {
		this.ei_2_namespaceId = ei_2_namespaceId;
	}
	public String getEi_3_universalId() {
		return ei_3_universalId;
	}
	public void setEi_3_universalId(String ei_3_universalId) {
		this.ei_3_universalId = ei_3_universalId;
	}
	public String getEi_4_universalIdType() {
		return ei_4_universalIdType;
	}
	public void setEi_4_universalIdType(String ei_4_universalIdType) {
		this.ei_4_universalIdType = ei_4_universalIdType;
	}
	@Override
	public String toString() {
		return "EI_v25 [ei_1_entityIdentifier=" + ei_1_entityIdentifier + ", ei_2_namespaceId=" + ei_2_namespaceId
				+ ", ei_3_universalId=" + ei_3_universalId + ", ei_4_universalIdType=" + ei_4_universalIdType + "]";
	}
	
}
