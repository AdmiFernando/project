package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class IdentificationXCN implements Serializable {
	@JsonProperty("id")
	private PatientID id;
	@JsonProperty("nameType")
	private String nameType;
	@JsonProperty("fullName")
	private FullName fullName;
	public IdentificationXCN(PatientID id, String nameType, FullName fullName) {
		super();
		this.id = id;
		this.nameType = nameType;
		this.fullName = fullName;
	}
	public IdentificationXCN() {
		super();
	}
	@JsonProperty("id")
	public PatientID getId() {
		return id;
	}
	@JsonProperty("id")
	public void setId(PatientID id) {
		this.id = id;
	}
	@JsonProperty("nameType")
	public String getNameType() {
		return nameType;
	}
	@JsonProperty("nameType")
	public void setNameType(String nameType) {
		this.nameType = nameType;
	}
	@JsonProperty("fullName")
	public FullName getFullName() {
		return fullName;
	}
	@JsonProperty("fullName")
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "IdentificationXCN [id=" + id + ", nameType=" + nameType + ", fullName=" + fullName + "]";
	}
}
