package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class SAD_v25 {
			
	@JsonProperty("sad_1_streetOrMailingAddress")
	private String sad_1_streetOrMailingAddress;
	@JsonProperty("sad_2_streetName")
	private String sad_2_streetName;
	@JsonProperty("sad_3_dwellingNumber")
	private String sad_3_dwellingNumber;
	public SAD_v25(String sad_1_streetOrMailingAddress, String sad_2_streetName, String sad_3_dwellingNumber) {
		super();
		this.sad_1_streetOrMailingAddress = sad_1_streetOrMailingAddress;
		this.sad_2_streetName = sad_2_streetName;
		this.sad_3_dwellingNumber = sad_3_dwellingNumber;
	}
	public SAD_v25() {
		super();
		this.sad_1_streetOrMailingAddress = "";
		this.sad_2_streetName = "";
		this.sad_3_dwellingNumber = "";
	}
	public String getSad_1_streetOrMailingAddress() {
		return sad_1_streetOrMailingAddress;
	}
	public void setSad_1_streetOrMailingAddress(String sad_1_streetOrMailingAddress) {
		this.sad_1_streetOrMailingAddress = sad_1_streetOrMailingAddress;
	}
	public String getSad_2_streetName() {
		return sad_2_streetName;
	}
	public void setSad_2_streetName(String sad_2_streetName) {
		this.sad_2_streetName = sad_2_streetName;
	}
	public String getSad_3_dwellingNumber() {
		return sad_3_dwellingNumber;
	}
	public void setSad_3_dwellingNumber(String sad_3_dwellingNumber) {
		this.sad_3_dwellingNumber = sad_3_dwellingNumber;
	}
	@Override
	public String toString() {
		return "SAD_v25 [sad_1_streetOrMailingAddress=" + sad_1_streetOrMailingAddress + ", sad_2_streetName="
				+ sad_2_streetName + ", sad_3_dwellingNumber=" + sad_3_dwellingNumber + "]";
	}
	
}
