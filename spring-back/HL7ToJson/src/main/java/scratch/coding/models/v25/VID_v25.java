package scratch.coding.models.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;

@JsonIgnoreProperties(ignoreUnknown= true)
public class VID_v25 {
					
	@JsonProperty("vid_1_versionId")
	private String vid_1_versionId;
	@JsonProperty("vid_2_ce_internationalizationCode")
	private CE_v2 vid_2_ce_internationalizationCode;
	@JsonProperty("vid_3_ce_internationalVersionId")
	private CE_v2 vid_3_ce_internationalVersionId;
	public VID_v25() {
		super();
	}
	public VID_v25(String vid_1_versionId, CE_v2 vid_2_ce_internationalizationCode,
			CE_v2 vid_3_ce_internationalVersionId) {
		super();
		this.vid_1_versionId = vid_1_versionId;
		this.vid_2_ce_internationalizationCode = vid_2_ce_internationalizationCode;
		this.vid_3_ce_internationalVersionId = vid_3_ce_internationalVersionId;
	}
	public String getVid_1_versionId() {
		return vid_1_versionId;
	}
	public void setVid_1_versionId(String vid_1_versionId) {
		this.vid_1_versionId = vid_1_versionId;
	}
	public CE_v2 getVid_2_ce_internationalizationCode() {
		return vid_2_ce_internationalizationCode;
	}
	public void setVid_2_ce_internationalizationCode(CE_v2 vid_2_ce_internationalizationCode) {
		this.vid_2_ce_internationalizationCode = vid_2_ce_internationalizationCode;
	}
	public CE_v2 getVid_3_ce_internationalVersionId() {
		return vid_3_ce_internationalVersionId;
	}
	public void setVid_3_ce_internationalVersionId(CE_v2 vid_3_ce_internationalVersionId) {
		this.vid_3_ce_internationalVersionId = vid_3_ce_internationalVersionId;
	}
	@Override
	public String toString() {
		return "VID_v25 [vid_1_versionId=" + vid_1_versionId + ", vid_2_ce_internationalizationCode="
				+ vid_2_ce_internationalizationCode + ", vid_3_ce_internationalVersionId="
				+ vid_3_ce_internationalVersionId + "]";
	}
	

}
