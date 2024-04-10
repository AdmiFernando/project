//package scratch.coding.hl7.base.v25;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import ca.uhn.hl7v2.HL7Exception;
//import scratch.coding.segment.base.v25.MSH_ST_v25;
//import scratch.coding.segment.base.v25.ORC_ST_v25;
//import scratch.coding.segment.base.v25.PID_ST_v25;
//
//@Table(name="ORU_ST_v25")
//@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class ORU_ST_v25 {
//	@Id
//	@Column(name="ORU_ID")
//	private String id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "MSH_ORU", referencedColumnName = "MSH_ID")
//	@JsonIgnoreProperties("oru_msh_v25")
//	@JsonProperty("msh")
//	private MSH_ST_v25 msh;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PID_ORU", referencedColumnName = "PID_ID")
//	@JsonProperty("pid")
//	private PID_ST_v25 pid;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ORU_ORC")
//	@JsonProperty("orc")
//	private List<ORC_ST_v25> orc;
//	
//	public ORU_ST_v25() {
//		super();
//	}
//	
//	public static ORU_ST_v25 createJsonFromORU_O01(MSH_ST_v25 msh, PID_ST_v25 pid, List<ORC_ST_v25> orc
//			, String id) throws HL7Exception, IOException {
//		return new ORU_ST_v25(msh, pid,orc,id);
//	}
//	
//	
//	
//	public ORU_ST_v25(MSH_ST_v25 msh, PID_ST_v25 pid, List<ORC_ST_v25> orc, String id) {
//		super();
//		this.msh = msh;
//		this.pid = pid;
//		this.orc = orc;
//		this.id = id;
//	}
//
//
//
//	/**
//	 * @return the id
//	 *	@JsonProperty("id")
//	 */
//	
//	public String getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 * @JsonProperty("id")
//	 */
//	public void setId(String id) {
//		this.id = id;
//	}
//	/**
//	 * @return the msh
//	 *	@JsonProperty("msh")
//	 */
//	
//	public MSH_ST_v25 getMsh() {
//		return msh;
//	}
//	/**
//	 * @param msh the msh to set
//	 * @JsonProperty("msh")
//	 */
//	public void setMsh(MSH_ST_v25 msh) {
//		this.msh = msh;
//	}
//	/**
//	 * @return the pid
//	 *	@JsonProperty("pid")
//	 */
//	
//	public PID_ST_v25 getPid() {
//		return pid;
//	}
//	/**
//	 * @param pid the pid to set
//	 * @JsonProperty("pid")
//	 */
//	public void setPid(PID_ST_v25 pid) {
//		this.pid = pid;
//	}
//
//
//
//	/**
//	 * @return the orc
//	 *	@JsonProperty("orc")
//	 */
//	
//	public List<ORC_ST_v25> getOrc() {
//		return orc;
//	}
//
//
//
//	/**
//	 * @param orc the orc to set
//	 * @JsonProperty("orc")
//	 */
//	public void setOrc(List<ORC_ST_v25> orc) {
//		this.orc = orc;
//	}
//
//	@Override
//	public String toString() {
//		return "ORU_ST_v25 [id=" + id + ", msh=" + msh + ", pid=" + pid + ", orc=" + orc + "]";
//	}
//
//	@Override
//    public boolean equals(Object o) {
//
//        if (o == this) return true;
//        if (!(o instanceof ORU_ST_v25)) {
//            return false;
//        }
//        ORU_ST_v25 user = (ORU_ST_v25) o;
//        return  Objects.equals(this.getMsh(), user.getMsh()) &&
//                Objects.equals(this.getPid(), user.getPid()) &&
//                Objects.equals(this.getOrc(), user.getOrc());
//    }
//	@Override
//    public int hashCode() {
//        return Objects.hash(this.getMsh(), this.getPid(), this.getOrc());
//    }
//
//	
//}
//
//
//	