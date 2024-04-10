//package scratch.coding.models.base.v23;
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
//
//import scratch.coding.models.base.v25.VID_ST_v25;
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//
//@Table(name="CM_MSG_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CM_MSG_ST {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="CM_MSG_ST_ID")
//	private Long id;
//	@Column(name="CM_MSG_ST_1")
//	private String cm_msg_1_messageType;
//	@Column(name="CM_MSG_ST_2")
//	private String cm_msg_1_triggerEvent;
//	
//	@OneToOne(mappedBy = "msh_9_messageType")
//	@JsonIgnoreProperties("msh_9_messageType")
//	private MSH_ST_v23 msh_9_v23;
//
//	public CM_MSG_ST(String cm_msg_1_messageType, String cm_msg_1_triggerEvent, MSH_ST_v23 msh_9_v23) {
//		super();
//		this.cm_msg_1_messageType = cm_msg_1_messageType;
//		this.cm_msg_1_triggerEvent = cm_msg_1_triggerEvent;
//		this.msh_9_v23 = msh_9_v23;
//	}
//
//	public CM_MSG_ST() {
//		super();
//	}
//
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the cm_msg_1_messageType
//	 *	@JsonProperty("cm_msg_1_messageType")
//	 */
//	
//	public String getCm_msg_1_messageType() {
//		return cm_msg_1_messageType;
//	}
//
//	/**
//	 * @param cm_msg_1_messageType the cm_msg_1_messageType to set
//	 * @JsonProperty("cm_msg_1_messageType")
//	 */
//	public void setCm_msg_1_messageType(String cm_msg_1_messageType) {
//		this.cm_msg_1_messageType = cm_msg_1_messageType;
//	}
//
//	/**
//	 * @return the cm_msg_1_triggerEvent
//	 *	@JsonProperty("cm_msg_1_triggerEvent")
//	 */
//	
//	public String getCm_msg_1_triggerEvent() {
//		return cm_msg_1_triggerEvent;
//	}
//
//	/**
//	 * @param cm_msg_1_triggerEvent the cm_msg_1_triggerEvent to set
//	 * @JsonProperty("cm_msg_1_triggerEvent")
//	 */
//	public void setCm_msg_1_triggerEvent(String cm_msg_1_triggerEvent) {
//		this.cm_msg_1_triggerEvent = cm_msg_1_triggerEvent;
//	}
//
//	/**
//	 * @return the msh_9_v23
//	 *	@JsonProperty("msh_9_v23")
//	 */
//	
//	public MSH_ST_v23 getMsh_9_v23() {
//		return msh_9_v23;
//	}
//
//	/**
//	 * @param msh_9_v23 the msh_9_v23 to set
//	 * @JsonProperty("msh_9_v23")
//	 */
//	public void setMsh_9_v23(MSH_ST_v23 msh_9_v23) {
//		this.msh_9_v23 = msh_9_v23;
//	}
//
//	@Override
//	public String toString() {
//		return "CM_MSG_ST [id=" + id + ", cm_msg_1_messageType=" + cm_msg_1_messageType + ", cm_msg_1_triggerEvent="
//				+ cm_msg_1_triggerEvent + ", msh_9_v23=" + msh_9_v23 + "]";
//	}
//	
//	
//}
