package scratch.coding.models.v23;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CM_PRL_v23 {
	@JsonProperty("ce_obr_1_obx3ObservationIdentifierOfParentResult")
	private CE_v2 ce_obr_1_obx3ObservationIdentifierOfParentResult;
	@JsonProperty("obr_2_obx4SubIdOfParentResult")
	private String obr_2_obx4SubIdOfParentResult;
	@JsonProperty("obr_3_partOfObx5ObservationResultFromParent")
	private String obr_3_partOfObx5ObservationResultFromParent;
	public CM_PRL_v23(CE_v2 ce_obr_1_obx3ObservationIdentifierOfParentResult,
			String obr_2_obx4SubIdOfParentResult, String obr_3_partOfObx5ObservationResultFromParent) {
		super();
		this.ce_obr_1_obx3ObservationIdentifierOfParentResult = ce_obr_1_obx3ObservationIdentifierOfParentResult;
		this.obr_2_obx4SubIdOfParentResult = obr_2_obx4SubIdOfParentResult;
		this.obr_3_partOfObx5ObservationResultFromParent = obr_3_partOfObx5ObservationResultFromParent;
	}
	public CM_PRL_v23() {
		super();
		this.ce_obr_1_obx3ObservationIdentifierOfParentResult = new CE_v2();
		this.obr_2_obx4SubIdOfParentResult = "";
		this.obr_3_partOfObx5ObservationResultFromParent = "";
	}
	public CE_v2 getCe_obr_1_obx3ObservationIdentifierOfParentResult() {
		return ce_obr_1_obx3ObservationIdentifierOfParentResult;
	}
	public void setCe_obr_1_obx3ObservationIdentifierOfParentResult(
			CE_v2 ce_obr_1_obx3ObservationIdentifierOfParentResult) {
		this.ce_obr_1_obx3ObservationIdentifierOfParentResult = ce_obr_1_obx3ObservationIdentifierOfParentResult;
	}
	public String getObr_2_obx4SubIdOfParentResult() {
		return obr_2_obx4SubIdOfParentResult;
	}
	public void setObr_2_obx4SubIdOfParentResult(String obr_2_obx4SubIdOfParentResult) {
		this.obr_2_obx4SubIdOfParentResult = obr_2_obx4SubIdOfParentResult;
	}
	public String getObr_3_partOfObx5ObservationResultFromParent() {
		return obr_3_partOfObx5ObservationResultFromParent;
	}
	public void setObr_3_partOfObx5ObservationResultFromParent(String obr_3_partOfObx5ObservationResultFromParent) {
		this.obr_3_partOfObx5ObservationResultFromParent = obr_3_partOfObx5ObservationResultFromParent;
	}

}
