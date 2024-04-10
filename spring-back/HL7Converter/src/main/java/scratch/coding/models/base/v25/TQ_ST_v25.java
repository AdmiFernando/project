//package scratch.coding.models.base.v25;
//
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.CE_ST;
//import scratch.coding.models.base.OSD_ST;
//import scratch.coding.models.base.RI_ST;
//import scratch.coding.models.base.TS_ST;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//
//@Table(name="TQ_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class TQ_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="TQ_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CQ_TQ_1_v25", referencedColumnName = "CQ_ID")
//	@JsonProperty("tq_1_quantity")
//	private CQ_ST_v25 tq_1_quantity;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "RI_TQ_2_v25", referencedColumnName = "RI_ID")
//	@JsonProperty("tq_2_interval")
//	private RI_ST tq_2_interval;
//	@Column(name="TQ_3_v25")
//	@JsonProperty("tq_3_duration")
//	private String tq_3_duration;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_TQ_4_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("tq_4_startDateTime")
//	private TS_ST tq_4_startDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "TS_TQ_5_v25", referencedColumnName = "TS_ID")
//	@JsonProperty("tq_5_endDateTime")
//	private TS_ST tq_5_endDateTime;
//	@Column(name="TQ_6_v25")
//	@JsonProperty("tq_6_priority")
//	private String tq_6_priority;
//	@Column(name="TQ_7_v25")
//	@JsonProperty("tq_7_condition")
//	private String tq_7_condition;
//	@Column(name="TQ_8_v25")
//	@JsonProperty("tq_8_text")
//	private String tq_8_text;
//	@Column(name="TQ_9_v25")
//	@JsonProperty("tq_9_conjunction")
//	private String tq_9_conjunction;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "OSD_TQ_10_v25", referencedColumnName = "OSD_ID")
//	@JsonProperty("tq_10_orderSequencing")
//	private OSD_ST tq_10_orderSequencing;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CE_TQ_11_v25", referencedColumnName = "CE_ID")
//	@JsonProperty("tq_11_occurrenceDuration")
//	private CE_ST tq_11_occurrenceDuration;
//	@Column(name="TQ_12_v25")
//	@JsonProperty("tq_12_totalOccurrences")
//	private String tq_12_totalOccurrences;
//
//	public TQ_ST_v25(CQ_ST_v25 tq_1_quantity, RI_ST tq_2_interval, String tq_3_duration, TS_ST tq_4_startDateTime,
//			TS_ST tq_5_endDateTime, String tq_6_priority, String tq_7_condition, String tq_8_text,
//			String tq_9_conjunction, OSD_ST tq_10_orderSequencing, CE_ST tq_11_occurrenceDuration,
//			String tq_12_totalOccurrences) {
//		super();
//		this.tq_1_quantity = tq_1_quantity;
//		this.tq_2_interval = tq_2_interval;
//		this.tq_3_duration = tq_3_duration;
//		this.tq_4_startDateTime = tq_4_startDateTime;
//		this.tq_5_endDateTime = tq_5_endDateTime;
//		this.tq_6_priority = tq_6_priority;
//		this.tq_7_condition = tq_7_condition;
//		this.tq_8_text = tq_8_text;
//		this.tq_9_conjunction = tq_9_conjunction;
//		this.tq_10_orderSequencing = tq_10_orderSequencing;
//		this.tq_11_occurrenceDuration = tq_11_occurrenceDuration;
//		this.tq_12_totalOccurrences = tq_12_totalOccurrences;
//	}
//
//	public TQ_ST_v25() {
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
//	 * @return the tq_1_quantity
//	 *	@JsonProperty("tq_1_quantity")
//	 */
//	
//	public CQ_ST_v25 getTq_1_quantity() {
//		return tq_1_quantity;
//	}
//
//	/**
//	 * @param tq_1_quantity the tq_1_quantity to set
//	 * @JsonProperty("tq_1_quantity")
//	 */
//	public void setTq_1_quantity(CQ_ST_v25 tq_1_quantity) {
//		this.tq_1_quantity = tq_1_quantity;
//	}
//
//	/**
//	 * @return the tq_2_interval
//	 *	@JsonProperty("tq_2_interval")
//	 */
//	
//	public RI_ST getTq_2_interval() {
//		return tq_2_interval;
//	}
//
//	/**
//	 * @param tq_2_interval the tq_2_interval to set
//	 * @JsonProperty("tq_2_interval")
//	 */
//	public void setTq_2_interval(RI_ST tq_2_interval) {
//		this.tq_2_interval = tq_2_interval;
//	}
//
//	/**
//	 * @return the tq_3_duration
//	 *	@JsonProperty("tq_3_duration")
//	 */
//	
//	public String getTq_3_duration() {
//		return tq_3_duration;
//	}
//
//	/**
//	 * @param tq_3_duration the tq_3_duration to set
//	 * @JsonProperty("tq_3_duration")
//	 */
//	public void setTq_3_duration(String tq_3_duration) {
//		this.tq_3_duration = tq_3_duration;
//	}
//
//	/**
//	 * @return the tq_4_startDateTime
//	 *	@JsonProperty("tq_4_startDateTime")
//	 */
//	
//	public TS_ST getTq_4_startDateTime() {
//		return tq_4_startDateTime;
//	}
//
//	/**
//	 * @param tq_4_startDateTime the tq_4_startDateTime to set
//	 * @JsonProperty("tq_4_startDateTime")
//	 */
//	public void setTq_4_startDateTime(TS_ST tq_4_startDateTime) {
//		this.tq_4_startDateTime = tq_4_startDateTime;
//	}
//
//	/**
//	 * @return the tq_5_endDateTime
//	 *	@JsonProperty("tq_5_endDateTime")
//	 */
//	
//	public TS_ST getTq_5_endDateTime() {
//		return tq_5_endDateTime;
//	}
//
//	/**
//	 * @param tq_5_endDateTime the tq_5_endDateTime to set
//	 * @JsonProperty("tq_5_endDateTime")
//	 */
//	public void setTq_5_endDateTime(TS_ST tq_5_endDateTime) {
//		this.tq_5_endDateTime = tq_5_endDateTime;
//	}
//
//	/**
//	 * @return the tq_6_priority
//	 *	@JsonProperty("tq_6_priority")
//	 */
//	
//	public String getTq_6_priority() {
//		return tq_6_priority;
//	}
//
//	/**
//	 * @param tq_6_priority the tq_6_priority to set
//	 * @JsonProperty("tq_6_priority")
//	 */
//	public void setTq_6_priority(String tq_6_priority) {
//		this.tq_6_priority = tq_6_priority;
//	}
//
//	/**
//	 * @return the tq_7_condition
//	 *	@JsonProperty("tq_7_condition")
//	 */
//	
//	public String getTq_7_condition() {
//		return tq_7_condition;
//	}
//
//	/**
//	 * @param tq_7_condition the tq_7_condition to set
//	 * @JsonProperty("tq_7_condition")
//	 */
//	public void setTq_7_condition(String tq_7_condition) {
//		this.tq_7_condition = tq_7_condition;
//	}
//
//	/**
//	 * @return the tq_8_text
//	 *	@JsonProperty("tq_8_text")
//	 */
//	
//	public String getTq_8_text() {
//		return tq_8_text;
//	}
//
//	/**
//	 * @param tq_8_text the tq_8_text to set
//	 * @JsonProperty("tq_8_text")
//	 */
//	public void setTq_8_text(String tq_8_text) {
//		this.tq_8_text = tq_8_text;
//	}
//
//	/**
//	 * @return the tq_9_conjunction
//	 *	@JsonProperty("tq_9_conjunction")
//	 */
//	
//	public String getTq_9_conjunction() {
//		return tq_9_conjunction;
//	}
//
//	/**
//	 * @param tq_9_conjunction the tq_9_conjunction to set
//	 * @JsonProperty("tq_9_conjunction")
//	 */
//	public void setTq_9_conjunction(String tq_9_conjunction) {
//		this.tq_9_conjunction = tq_9_conjunction;
//	}
//
//	/**
//	 * @return the tq_10_orderSequencing
//	 *	@JsonProperty("tq_10_orderSequencing")
//	 */
//	
//	public OSD_ST getTq_10_orderSequencing() {
//		return tq_10_orderSequencing;
//	}
//
//	/**
//	 * @param tq_10_orderSequencing the tq_10_orderSequencing to set
//	 * @JsonProperty("tq_10_orderSequencing")
//	 */
//	public void setTq_10_orderSequencing(OSD_ST tq_10_orderSequencing) {
//		this.tq_10_orderSequencing = tq_10_orderSequencing;
//	}
//
//	/**
//	 * @return the tq_11_occurrenceDuration
//	 *	@JsonProperty("tq_11_occurrenceDuration")
//	 */
//	
//	public CE_ST getTq_11_occurrenceDuration() {
//		return tq_11_occurrenceDuration;
//	}
//
//	/**
//	 * @param tq_11_occurrenceDuration the tq_11_occurrenceDuration to set
//	 * @JsonProperty("tq_11_occurrenceDuration")
//	 */
//	public void setTq_11_occurrenceDuration(CE_ST tq_11_occurrenceDuration) {
//		this.tq_11_occurrenceDuration = tq_11_occurrenceDuration;
//	}
//
//	/**
//	 * @return the tq_12_totalOccurrences
//	 *	@JsonProperty("tq_12_totalOccurrences")
//	 */
//	
//	public String getTq_12_totalOccurrences() {
//		return tq_12_totalOccurrences;
//	}
//
//	/**
//	 * @param tq_12_totalOccurrences the tq_12_totalOccurrences to set
//	 * @JsonProperty("tq_12_totalOccurrences")
//	 */
//	public void setTq_12_totalOccurrences(String tq_12_totalOccurrences) {
//		this.tq_12_totalOccurrences = tq_12_totalOccurrences;
//	}
//
//	@Override
//	public String toString() {
//		return "TQ_ST_v25 [id=" + id + ", tq_1_quantity=" + tq_1_quantity + ", tq_2_interval=" + tq_2_interval
//				+ ", tq_3_duration=" + tq_3_duration + ", tq_4_startDateTime=" + tq_4_startDateTime
//				+ ", tq_5_endDateTime=" + tq_5_endDateTime + ", tq_6_priority=" + tq_6_priority + ", tq_7_condition="
//				+ tq_7_condition + ", tq_8_text=" + tq_8_text + ", tq_9_conjunction=" + tq_9_conjunction
//				+ ", tq_10_orderSequencing=" + tq_10_orderSequencing + ", tq_11_occurrenceDuration="
//				+ tq_11_occurrenceDuration + ", tq_12_totalOccurrences=" + tq_12_totalOccurrences + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, tq_10_orderSequencing, tq_11_occurrenceDuration, tq_12_totalOccurrences, tq_1_quantity,
//				tq_2_interval, tq_3_duration, tq_4_startDateTime, tq_5_endDateTime, tq_6_priority, tq_7_condition,
//				tq_8_text, tq_9_conjunction);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		TQ_ST_v25 other = (TQ_ST_v25) obj;
//		return Objects.equals(id, other.id) && Objects.equals(tq_10_orderSequencing, other.tq_10_orderSequencing)
//				&& Objects.equals(tq_11_occurrenceDuration, other.tq_11_occurrenceDuration)
//				&& Objects.equals(tq_12_totalOccurrences, other.tq_12_totalOccurrences)
//				&& Objects.equals(tq_1_quantity, other.tq_1_quantity)
//				&& Objects.equals(tq_2_interval, other.tq_2_interval)
//				&& Objects.equals(tq_3_duration, other.tq_3_duration)
//				&& Objects.equals(tq_4_startDateTime, other.tq_4_startDateTime)
//				&& Objects.equals(tq_5_endDateTime, other.tq_5_endDateTime)
//				&& Objects.equals(tq_6_priority, other.tq_6_priority)
//				&& Objects.equals(tq_7_condition, other.tq_7_condition) && Objects.equals(tq_8_text, other.tq_8_text)
//				&& Objects.equals(tq_9_conjunction, other.tq_9_conjunction);
//	}
//
//
//}
