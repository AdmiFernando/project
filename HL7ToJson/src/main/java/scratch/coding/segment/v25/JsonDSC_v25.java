package scratch.coding.segment.v25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonDSC_v25 {
	@JsonProperty("dsc_1_continuationPointer")
	private String dsc_1_continuationPointer;
	@JsonProperty("dsc_2_continuationStyle")
	private String dsc_2_continuationStyle;
	private JsonDSC_v25(DSCBuilder builder) {
		super();
		this.dsc_1_continuationPointer = builder.dsc_1_continuationPointer;
		this.dsc_2_continuationStyle = builder.dsc_2_continuationStyle;
	}
	private JsonDSC_v25() {
		super();
		this.dsc_1_continuationPointer = "";
		this.dsc_2_continuationStyle = "";
	}
	public static class DSCBuilder {
		private String dsc_1_continuationPointer;
		private String dsc_2_continuationStyle;
		public DSCBuilder(String dsc_1_continuationPointer, String dsc_2_continuationStyle) {
			super();
			this.dsc_1_continuationPointer = "";
			this.dsc_2_continuationStyle = "";
		}
		public DSCBuilder dsc_1_continuationPointer(String dsc_1_continuationPointer) {
			this.dsc_1_continuationPointer = dsc_1_continuationPointer;
			return this;
		}
		public DSCBuilder dsc_2_continuationStyle(String dsc_2_continuationStyle) {
			this.dsc_2_continuationStyle = dsc_2_continuationStyle;
			return this;
		}
		public JsonDSC_v25 build() {
			return new JsonDSC_v25(this);
		}
	}
	public String getDsc_1_continuationPointer() {
		return dsc_1_continuationPointer;
	}
	public String getDsc_2_continuationStyle() {
		return dsc_2_continuationStyle;
	}
	@Override
	public String toString() {
		return "JsonDSC_v25 [dsc_1_continuationPointer=" + dsc_1_continuationPointer + ", dsc_2_continuationStyle="
				+ dsc_2_continuationStyle + "]";
	}
	
}
