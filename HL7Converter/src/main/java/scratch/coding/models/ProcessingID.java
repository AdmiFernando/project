package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Betancof
 *
 */
@JsonIgnoreProperties(ignoreUnknown= true)
public class ProcessingID implements Serializable {
	@JsonProperty("name")
	private String name;
	@JsonProperty("processingID")
	private String processingID;
	@JsonProperty("processingMode")
	private String processingMode;
	public ProcessingID(String name, String processingID, String processingMode) {
		super();
		this.name = name;
		this.processingID = processingID;
		this.processingMode = processingMode;
	}
	public ProcessingID() {
		super();
	}
	@JsonProperty("processingID")
	public String getProcessingID() {
		return processingID;
	}
	@JsonProperty("processingID")
	public void setProcessingID(String processingID) {
		this.processingID = processingID;
	}
	@JsonProperty("processingMode")
	public String getProcessingMode() {
		return processingMode;
	}
	@JsonProperty("processingMode")
	public void setProcessingMode(String processingMode) {
		this.processingMode = processingMode;
	}
	@Override
	public String toString() {
		return "ProcessingID [name=" + name + ", processingID=" + processingID + ", processingMode=" + processingMode
				+ "]";
	}
}
