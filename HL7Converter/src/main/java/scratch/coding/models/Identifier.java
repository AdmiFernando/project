package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Identifier implements Serializable {
	@JsonProperty("assigningAuthority")
	private String assigningAuthority;
	@JsonProperty("assigningFacilityId")
	private String assigningFacilityId;
	@JsonProperty("id")
	private String id;

	public Identifier(String assigningAuthority, String assigningFacilityId, String id) {
		super();
		this.assigningAuthority = assigningAuthority;
		this.assigningFacilityId = assigningFacilityId;
		this.id = id;
	}
	public Identifier() {
		super();
	}
	@JsonProperty("assigningAuthority")
	public String getAssigningAuthority() {
		return assigningAuthority;
	}
	@JsonProperty("assigningAuthority")
	public void setAssigningAuthority(String assigningAuthority) {
		this.assigningAuthority = assigningAuthority;
	}
	@JsonProperty("assigningFacilityId")
	public String getAssigningFacilityId() {
		return assigningFacilityId;
	}
	@JsonProperty("assigningFacilityId")
	public void setAssigningFacilityId(String assigningFacilityId) {
		this.assigningFacilityId = assigningFacilityId;
	}
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Identifier [assigningAuthority=" + assigningAuthority + ", assigningFacilityId=" + assigningFacilityId
				+ ", id=" + id + "]";
	}
}
