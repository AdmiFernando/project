//package scratch.coding.models.base;
//
//import java.util.Arrays;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import scratch.coding.segment.base.v23.MSH_ST_v23;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//
//@Table(name="ST")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class ST {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="ST_ID")
//	private Long id;
//	@Column(name="ST_1")
//	@JsonProperty("ST_1")
//	private String st_1;
//	@Column(name="ST_2")
//	@JsonProperty("ST_2")
//	@Lob
//	private byte[] st_2;
//	
//	public ST(String st_1) {
//		super();
//		this.st_1 = st_1;
//	}
//	public ST(byte[] st_2) {
//		super();
//		this.st_2 = st_2;
//	}
//	public ST() {
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
//	 * @return the st_1
//	 *	@JsonProperty("st_1")
//	 */
//	
//	public String getSt_1() {
//		return st_1;
//	}
//	/**
//	 * @param st_1 the st_1 to set
//	 * @JsonProperty("st_1")
//	 */
//	public void setSt_1(String st_1) {
//		this.st_1 = st_1;
//	}
//	/**
//	 * @return the st_2
//	 *	@JsonProperty("st_2")
//	 */
//	
//	public byte[] getSt_2() {
//		return st_2;
//	}
//	/**
//	 * @param st_2 the st_2 to set
//	 * @JsonProperty("st_2")
//	 */
//	public void setSt_2(byte[] st_2) {
//		this.st_2 = st_2;
//	}
//	@Override
//	public String toString() {
//		return "ST [id=" + id + ", st_1=" + st_1 + ", st_2=" + Arrays.toString(st_2) + "]";
//	}
//	
//	
//	
//}
