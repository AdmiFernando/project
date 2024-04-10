package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class ParentResult implements Serializable {
	@JsonProperty("obx3ObservationIdentifierOfParentResult")
	private IdentifierAndCoding obx3ObservationIdentifierOfParentResult;
	@JsonProperty("obx4SubIDOParentResult")
	private String obx4SubIDOParentResult;
	@JsonProperty("partOfObx5ObservationResultFromParent")
	private String partOfObx5ObservationResultFromParent;
	public ParentResult(IdentifierAndCoding obx3ObservationIdentifierOfParentResult, String obx4SubIDOParentResult,
			String partOfObx5ObservationResultFromParent) {
		super();
		this.obx3ObservationIdentifierOfParentResult = obx3ObservationIdentifierOfParentResult;
		this.obx4SubIDOParentResult = obx4SubIDOParentResult;
		this.partOfObx5ObservationResultFromParent = partOfObx5ObservationResultFromParent;
	}
	public ParentResult() {
		super();
	}
	@JsonProperty("obx3ObservationIdentifierOfParentResult")
	public IdentifierAndCoding getObx3ObservationIdentifierOfParentResult() {
		return obx3ObservationIdentifierOfParentResult;
	}
	@JsonProperty("obx3ObservationIdentifierOfParentResult")
	public void setObx3ObservationIdentifierOfParentResult(IdentifierAndCoding obx3ObservationIdentifierOfParentResult) {
		this.obx3ObservationIdentifierOfParentResult = obx3ObservationIdentifierOfParentResult;
	}
	@JsonProperty("obx4SubIDOParentResult")
	public String getObx4SubIDOParentResult() {
		return obx4SubIDOParentResult;
	}
	@JsonProperty("obx4SubIDOParentResult")
	public void setObx4SubIDOParentResult(String obx4SubIDOParentResult) {
		this.obx4SubIDOParentResult = obx4SubIDOParentResult;
	}
	@JsonProperty("partOfObx5ObservationResultFromParent")
	public String getPartOfObx5ObservationResultFromParent() {
		return partOfObx5ObservationResultFromParent;
	}
	@JsonProperty("partOfObx5ObservationResultFromParent")
	public void setPartOfObx5ObservationResultFromParent(String partOfObx5ObservationResultFromParent) {
		this.partOfObx5ObservationResultFromParent = partOfObx5ObservationResultFromParent;
	}
	@Override
	public String toString() {
		return "ParentResult [obx3ObservationIdentifierOfParentResult=" + obx3ObservationIdentifierOfParentResult
				+ ", obx4SubIDOParentResult=" + obx4SubIDOParentResult + ", partOfObx5ObservationResultFromParent="
				+ partOfObx5ObservationResultFromParent + "]";
	}
}
