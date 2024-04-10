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
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//@Table(name="EIP_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class EIP_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="EIP_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_EIP_1_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("eip_1_placerAssignedIdentifier")
//	private EI_ST_v25 eip_1_placerAssignedIdentifier;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "EI_EIP_2_v25", referencedColumnName = "EI_ID")
//	@JsonProperty("eip_2_fillerAssignedIdentifier")
//	private EI_ST_v25 eip_2_fillerAssignedIdentifier;
//	
//
//	public EIP_ST_v25(EI_ST_v25 eip_1_placerAssignedIdentifier, EI_ST_v25 eip_2_fillerAssignedIdentifier) {
//		super();
//		this.eip_1_placerAssignedIdentifier = eip_1_placerAssignedIdentifier;
//		this.eip_2_fillerAssignedIdentifier = eip_2_fillerAssignedIdentifier;
//	}
//
//	public EIP_ST_v25() {
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
//	 * @return the eip_1_placerAssignedIdentifier
//	 *	@JsonProperty("eip_1_placerAssignedIdentifier")
//	 */
//	
//	public EI_ST_v25 getEip_1_placerAssignedIdentifier() {
//		return eip_1_placerAssignedIdentifier;
//	}
//
//	/**
//	 * @param eip_1_placerAssignedIdentifier the eip_1_placerAssignedIdentifier to set
//	 * @JsonProperty("eip_1_placerAssignedIdentifier")
//	 */
//	public void setEip_1_placerAssignedIdentifier(EI_ST_v25 eip_1_placerAssignedIdentifier) {
//		this.eip_1_placerAssignedIdentifier = eip_1_placerAssignedIdentifier;
//	}
//
//	/**
//	 * @return the eip_2_fillerAssignedIdentifier
//	 *	@JsonProperty("eip_2_fillerAssignedIdentifier")
//	 */
//	
//	public EI_ST_v25 getEip_2_fillerAssignedIdentifier() {
//		return eip_2_fillerAssignedIdentifier;
//	}
//
//	/**
//	 * @param eip_2_fillerAssignedIdentifier the eip_2_fillerAssignedIdentifier to set
//	 * @JsonProperty("eip_2_fillerAssignedIdentifier")
//	 */
//	public void setEip_2_fillerAssignedIdentifier(EI_ST_v25 eip_2_fillerAssignedIdentifier) {
//		this.eip_2_fillerAssignedIdentifier = eip_2_fillerAssignedIdentifier;
//	}
//
//	@Override
//	public String toString() {
//		return "EIP_ST_v25 [id=" + id + ", eip_1_placerAssignedIdentifier=" + eip_1_placerAssignedIdentifier
//				+ ", eip_2_fillerAssignedIdentifier=" + eip_2_fillerAssignedIdentifier + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(eip_1_placerAssignedIdentifier, eip_2_fillerAssignedIdentifier, id);
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
//		EIP_ST_v25 other = (EIP_ST_v25) obj;
//		return Objects.equals(eip_1_placerAssignedIdentifier, other.eip_1_placerAssignedIdentifier)
//				&& Objects.equals(eip_2_fillerAssignedIdentifier, other.eip_2_fillerAssignedIdentifier)
//				&& Objects.equals(id, other.id);
//	}
//
//
//
//	
//}
