//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
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
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//
//@Table(name="MSG_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class MSG_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="MSG_ID")
//	private Long id;
//	@Column(name="MSG_1_v25")
//	@JsonProperty("msg_1_messageCode")
//	private String msg_1_messageCode;
//	@Column(name="MSG_2_v25")
//	@JsonProperty("msg_2_triggerEvent")
//	private String msg_2_triggerEvent;
//	@Column(name="MSG_3_v25")
//	@JsonProperty("msg_3_messageStructure")
//	private String msg_3_messageStructure;
//	
//	public MSG_ST_v25() {
//		super();
//	}
//	public MSG_ST_v25(String msg_1_messageCode, String msg_2_triggerEvent, String msg_3_messageStructure) {
//		super();
//		this.msg_1_messageCode = msg_1_messageCode;
//		this.msg_2_triggerEvent = msg_2_triggerEvent;
//		this.msg_3_messageStructure = msg_3_messageStructure;
//	}
//	public String getMsg_1_messageCode() {
//		return msg_1_messageCode;
//	}
//	public void setMsg_1_messageCode(String msg_1_messageCode) {
//		this.msg_1_messageCode = msg_1_messageCode;
//	}
//	public String getMsg_2_triggerEvent() {
//		return msg_2_triggerEvent;
//	}
//	public void setMsg_2_triggerEvent(String msg_2_triggerEvent) {
//		this.msg_2_triggerEvent = msg_2_triggerEvent;
//	}
//	public String getMsg_3_messageStructure() {
//		return msg_3_messageStructure;
//	}
//	public void setMsg_3_messageStructure(String msg_3_messageStructure) {
//		this.msg_3_messageStructure = msg_3_messageStructure;
//	}
//	@Override
//	public String toString() {
//		return "MSG_v25 [msg_1_messageCode=" + msg_1_messageCode + ", msg_2_triggerEvent=" + msg_2_triggerEvent
//				+ ", msg_3_messageStructure=" + msg_3_messageStructure + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, msg_1_messageCode, msg_2_triggerEvent, msg_3_messageStructure);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MSG_ST_v25 other = (MSG_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(msg_1_messageCode, other.msg_1_messageCode)
//				&& Objects.equals(msg_2_triggerEvent, other.msg_2_triggerEvent)
//				&& Objects.equals(msg_3_messageStructure, other.msg_3_messageStructure);
//	} 
//
//}
