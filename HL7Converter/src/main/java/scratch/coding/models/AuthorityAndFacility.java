package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class AuthorityAndFacility implements Serializable {
	@JsonProperty("name")
	private String name;
	@JsonProperty("nameSpaceId")
	private String nameSpaceId;
	@JsonProperty("universalID")
	private String universalID;
	@JsonProperty("universalIDType")
	private String universalIDType;
	public AuthorityAndFacility(String name, String nameSpaceId, String universalID, String universalIDType) {
		super();
		this.name = name;
		this.nameSpaceId = nameSpaceId;
		this.universalID = universalID;
		this.universalIDType = universalIDType;
	}
	public AuthorityAndFacility() {
		super();
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("nameSpaceId")
	public String getNameSpaceId() {
		return nameSpaceId;
	}
	@JsonProperty("nameSpaceId")
	public void setNameSpaceId(String nameSpaceId) {
		this.nameSpaceId = nameSpaceId;
	}
	@JsonProperty("universalID")
	public String getUniversalID() {
		return universalID;
	}
	@JsonProperty("universalID")
	public void setUniversalID(String universalID) {
		this.universalID = universalID;
	}
	@JsonProperty("universalIDType")
	public String getUniversalIDType() {
		return universalIDType;
	}
	@JsonProperty("universalIDType")
	public void setUniversalIDType(String universalIDType) {
		this.universalIDType = universalIDType;
	}
	@Override
	public String toString() {
		return "ApplicationAndFacility [name=" + name + ", nameSpaceId=" + nameSpaceId + ", universalID=" + universalID
				+ ", universalIDType=" + universalIDType + "]";
	}
}
