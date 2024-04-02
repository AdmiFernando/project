//package scratch.coding.models.base;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.v25.TQ_ST_v25;
//import scratch.coding.models.base.v25.XAD_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
////import scratch.coding.segment.base.v25.ORC_ST_v25;
////import scratch.coding.segment.base.v25.PID_ST_v25;
//@Table(name="TS_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class TS_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="TS_ID")
//	private Long id;
//	@Column(name="TS_1")
//	@JsonProperty("ts_1_time")
//	private String ts_1_time;
//	@Column(name="TS_2")
//	@JsonProperty("ts_2_degreeOfPrecision")
//	private String ts_2_degreeOfPrecision;
//	
//	public TS_ST() {
//		super();
//	}
//	public TS_ST(String ts_1_time, String ts_2_degreeOfPrecision) {
//		super();
//		this.ts_1_time = ts_1_time;
//		this.ts_2_degreeOfPrecision = ts_2_degreeOfPrecision;
//	}
//	public String getTs_1_time() {
//		return ts_1_time;
//	}
//	public void setTs_1_time(String ts_1_time) {
//		this.ts_1_time = ts_1_time;
//	}
//	public String getTs_2_degreeOfPrecision() {
//		return ts_2_degreeOfPrecision;
//	}
//	public void setTs_2_degreeOfPrecision(String ts_2_degreeOfPrecision) {
//		this.ts_2_degreeOfPrecision = ts_2_degreeOfPrecision;
//	}
//	@Override
//	public String toString() {
//		return "TS_v25 [ts_1_time=" + ts_1_time + ", ts_2_degreeOfPrecision=" + ts_2_degreeOfPrecision + "]";
//	}
//	
//}
