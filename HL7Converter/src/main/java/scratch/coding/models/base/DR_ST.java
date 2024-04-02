//package scratch.coding.models.base;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.models.base.v25.XAD_ST_v25;
//import scratch.coding.models.base.v25.XCN_ST_v25;
//import scratch.coding.models.base.v25.XPN_ST_v25;
//
//@Table(name="DR_ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class DR_ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="DR_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "DR_1", referencedColumnName = "TS_ID")
//	@JsonIgnoreProperties({"dr_1_v25","dr_2_v25"})
//	@JsonProperty("dr_1_RangeStartDateTime")
//	private TS_ST dr_1_RangeStartDateTime;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "DR_2", referencedColumnName = "TS_ID")
//	@JsonIgnoreProperties({"dr_1_v25","dr_2_v25"})
//	@JsonProperty("dr_2_rangeEndDateTime")
//	private TS_ST dr_2_rangeEndDateTime;
//	
//	@OneToOne(mappedBy="xpn_10_nameValidityRange", cascade=CascadeType.ALL)
//	@JsonIgnoreProperties({"xpn_10_nameValidityRange"})
//    private XPN_ST_v25 xpn_10_v25;
//	
//	@OneToOne(mappedBy="xad_12_addressValidityRange", cascade=CascadeType.ALL)
//	@JsonIgnoreProperties({"xad_12_addressValidityRange"})
//    private XAD_ST_v25 xad_12_v25;
//	
//	
//	@OneToOne(mappedBy="xcn_17_nameValidityRange", cascade=CascadeType.ALL)
//	@JsonIgnoreProperties({"xcn_17_nameValidityRange"})
//    private XCN_ST_v25 xcn_17_v25;
//	
//	public DR_ST(TS_ST dr_1_RangeStartDateTime, TS_ST dr_2_rangeEndDateTime) {
//		super();
//		this.dr_1_RangeStartDateTime = dr_1_RangeStartDateTime;
//		this.dr_2_rangeEndDateTime = dr_2_rangeEndDateTime;
//	}
//	public DR_ST() {
//		super();
//	}
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public Long getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * @return the dr_1_RangeStartDateTime
//	 *	@JsonProperty("dr_1_RangeStartDateTime")
//	 */
//	
//	public TS_ST getDr_1_RangeStartDateTime() {
//		return dr_1_RangeStartDateTime;
//	}
//	/**
//	 * @param dr_1_RangeStartDateTime the dr_1_RangeStartDateTime to set
//	 * @JsonProperty("dr_1_RangeStartDateTime")
//	 */
//	public void setDr_1_RangeStartDateTime(TS_ST dr_1_RangeStartDateTime) {
//		this.dr_1_RangeStartDateTime = dr_1_RangeStartDateTime;
//	}
//	/**
//	 * @return the dr_2_rangeEndDateTime
//	 *	@JsonProperty("dr_2_rangeEndDateTime")
//	 */
//	
//	public TS_ST getDr_2_rangeEndDateTime() {
//		return dr_2_rangeEndDateTime;
//	}
//	/**
//	 * @param dr_2_rangeEndDateTime the dr_2_rangeEndDateTime to set
//	 * @JsonProperty("dr_2_rangeEndDateTime")
//	 */
//	public void setDr_2_rangeEndDateTime(TS_ST dr_2_rangeEndDateTime) {
//		this.dr_2_rangeEndDateTime = dr_2_rangeEndDateTime;
//	}
//	@Override
//	public String toString() {
//		return "DR_ST [id=" + id + ", dr_1_RangeStartDateTime=" + dr_1_RangeStartDateTime + ", dr_2_rangeEndDateTime="
//				+ dr_2_rangeEndDateTime + "]";
//	}
//}
