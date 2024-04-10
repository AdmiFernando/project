package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class NkName implements Serializable {
	@JsonProperty("DegreeEgMD")
	private String DegreeEgMD;
	@JsonProperty("fullname")
	private FullName fullname;
	public NkName(String degreeEgMD, FullName fullname) {
		super();
		DegreeEgMD = degreeEgMD;
		this.fullname = fullname;
	}
	public NkName() {
		super();
	}
	@JsonProperty("DegreeEgMD")
	public String getDegreeEgMD() {
		return DegreeEgMD;
	}
	@JsonProperty("DegreeEgMD")
	public void setDegreeEgMD(String degreeEgMD) {
		DegreeEgMD = degreeEgMD;
	}
	@JsonProperty("fullname")
	public FullName getFullname() {
		return fullname;
	}
	@JsonProperty("fullname")
	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}
	@Override
	public String toString() {
		return "NkName [DegreeEgMD=" + DegreeEgMD + ", fullname=" + fullname + "]";
	}
}
