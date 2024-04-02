package scratch.coding.segment.v23;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.v23.CX_v23;
@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonDB1_v23 {
	@JsonProperty("db1_1_setId")
	private String db1_1_setId;
	@JsonProperty("db1_2_disabledPersonCode")
	private String db1_2_disabledPersonCode;
	@JsonProperty("cx_db1_3_disabledPersonIdentifier")
	private CX_v23[] cx_db1_3_disabledPersonIdentifier;
	@JsonProperty("db1_4_disableIndicator")
	private String db1_4_disableIndicator;
	@JsonProperty("db1_5_disabilityStartDate")
	private String db1_5_disabilityStartDate;
	@JsonProperty("db1_6_disabilityEndDate")
	private String db1_6_disabilityEndDate;
	@JsonProperty("db1_7_disabilityReturnToWorkDate")
	private String db1_7_disabilityReturnToWorkDate;
	@JsonProperty("db1_8_disabilityUnableToWorkDate")
	private String db1_8_disabilityUnableToWorkDate;
	private JsonDB1_v23(DB1Builder builder) {
		super();
		this.db1_1_setId = builder.db1_1_setId;
		this.db1_2_disabledPersonCode = builder.db1_2_disabledPersonCode;
		this.cx_db1_3_disabledPersonIdentifier = builder.cx_db1_3_disabledPersonIdentifier;
		this.db1_4_disableIndicator = builder.db1_4_disableIndicator;
		this.db1_5_disabilityStartDate = builder.db1_5_disabilityStartDate;
		this.db1_6_disabilityEndDate = builder.db1_6_disabilityEndDate;
		this.db1_7_disabilityReturnToWorkDate = builder.db1_7_disabilityReturnToWorkDate;
		this.db1_8_disabilityUnableToWorkDate = builder.db1_8_disabilityUnableToWorkDate;
	}
	public JsonDB1_v23() {
		super();
		this.db1_1_setId = "";
		this.db1_2_disabledPersonCode = "";
		this.cx_db1_3_disabledPersonIdentifier = new CX_v23[] {};
		this.db1_4_disableIndicator = "";
		this.db1_5_disabilityStartDate = "";
		this.db1_6_disabilityEndDate = "";
		this.db1_7_disabilityReturnToWorkDate = "";
		this.db1_8_disabilityUnableToWorkDate = "";
	}
	public static class DB1Builder {
		private String db1_1_setId;
		private String db1_2_disabledPersonCode;
		private CX_v23[] cx_db1_3_disabledPersonIdentifier;
		private String db1_4_disableIndicator;
		private String db1_5_disabilityStartDate;
		private String db1_6_disabilityEndDate;
		private String db1_7_disabilityReturnToWorkDate;
		private String db1_8_disabilityUnableToWorkDate;
		public DB1Builder(String db1_1_setId) {
			super();
			this.db1_1_setId = db1_1_setId;
			this.db1_2_disabledPersonCode = "";
			this.cx_db1_3_disabledPersonIdentifier = new CX_v23[] {};
			this.db1_4_disableIndicator = "";
			this.db1_5_disabilityStartDate = "";
			this.db1_6_disabilityEndDate = "";
			this.db1_7_disabilityReturnToWorkDate = "";
			this.db1_8_disabilityUnableToWorkDate = "";
		}
		public DB1Builder db1_1_setId(String db1_1_setId) {
			this.db1_1_setId = db1_1_setId;
			return this;
		}
		public DB1Builder db1_2_disabledPersonCode(String db1_2_disabledPersonCode) {
			this.db1_2_disabledPersonCode = db1_2_disabledPersonCode;
			return this;
		}
		public DB1Builder cx_db1_3_disabledPersonIdentifier(CX_v23[] cx_db1_3_disabledPersonIdentifier) {
			this.cx_db1_3_disabledPersonIdentifier = cx_db1_3_disabledPersonIdentifier;
			return this;
		}
		public DB1Builder db1_4_disableIndicator(String db1_4_disableIndicator) {
			this.db1_4_disableIndicator = db1_4_disableIndicator;
			return this;
		}
		public DB1Builder db1_5_disabilityStartDate(String db1_5_disabilityStartDate) {
			this.db1_5_disabilityStartDate = db1_5_disabilityStartDate;
			return this;
		}
		public DB1Builder db1_6_disabilityEndDate(String db1_6_disabilityEndDate) {
			this.db1_6_disabilityEndDate = db1_6_disabilityEndDate;
			return this;
		}
		public DB1Builder db1_7_disabilityReturnToWorkDate(String db1_7_disabilityReturnToWorkDate) {
			this.db1_7_disabilityReturnToWorkDate = db1_7_disabilityReturnToWorkDate;
			return this;
		}
		public DB1Builder db1_8_disabilityUnableToWorkDate(String db1_8_disabilityUnableToWorkDate) {
			this.db1_8_disabilityUnableToWorkDate = db1_8_disabilityUnableToWorkDate;
			return this;
		}
		public JsonDB1_v23 build() {
			return new JsonDB1_v23(this);
		}
	}
	public String getDb1_1_setId() {
		return db1_1_setId;
	}
	public String getDb1_2_disabledPersonCode() {
		return db1_2_disabledPersonCode;
	}
	public CX_v23[] getCx_db1_3_disabledPersonIdentifier() {
		return cx_db1_3_disabledPersonIdentifier;
	}
	public String getDb1_4_disableIndicator() {
		return db1_4_disableIndicator;
	}
	public String getDb1_5_disabilityStartDate() {
		return db1_5_disabilityStartDate;
	}
	public String getDb1_6_disabilityEndDate() {
		return db1_6_disabilityEndDate;
	}
	public String getDb1_7_disabilityReturnToWorkDate() {
		return db1_7_disabilityReturnToWorkDate;
	}
	public String getDb1_8_disabilityUnableToWorkDate() {
		return db1_8_disabilityUnableToWorkDate;
	}
	@Override
	public String toString() {
		return "JsonDB1_v23 [db1_1_setId=" + db1_1_setId + ", db1_2_disabledPersonCode=" + db1_2_disabledPersonCode
				+ ", cx_db1_3_disabledPersonIdentifier=" + Arrays.toString(cx_db1_3_disabledPersonIdentifier)
				+ ", db1_4_disableIndicator=" + db1_4_disableIndicator + ", db1_5_disabilityStartDate="
				+ db1_5_disabilityStartDate + ", db1_6_disabilityEndDate=" + db1_6_disabilityEndDate
				+ ", db1_7_disabilityReturnToWorkDate=" + db1_7_disabilityReturnToWorkDate
				+ ", db1_8_disabilityUnableToWorkDate=" + db1_8_disabilityUnableToWorkDate + "]";
	}
	
}
