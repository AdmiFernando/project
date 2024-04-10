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
//@Table(name="SPS_ST_v25")
//@Entity
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class SPS_ST_v25 {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="SPS_ID")
//	private Long id;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_SPS_1_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("sps_1_specimenSourceNameOrCode")
//	private CWE_ST_v25 sps_1_specimenSourceNameOrCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_SPS_2_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("sps_2_additives")
//	private CWE_ST_v25 sps_2_additives;
//	@Column(name="SPS_3_v25")
//	@JsonProperty("sps_3_specimenCollectionMethod")
//	private String sps_3_specimenCollectionMethod;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_SPS_4_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("sps_4_bodySite")
//	private CWE_ST_v25 sps_4_bodySite;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_SPS_5_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("sps_5_siteModifier")
//	private CWE_ST_v25 sps_5_siteModifier;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_SPS_6_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("sps_6_collectionMethodModifierCode")
//	private CWE_ST_v25 sps_6_collectionMethodModifierCode;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CWE_SPS_7_v25", referencedColumnName = "CWE_ID")
//	@JsonProperty("sps_7_specimenRole")
//	private CWE_ST_v25 sps_7_specimenRole;
//	public SPS_ST_v25(CWE_ST_v25 sps_1_specimenSourceNameOrCode, CWE_ST_v25 sps_2_additives,
//			String sps_3_specimenCollectionMethod, CWE_ST_v25 sps_4_bodySite, CWE_ST_v25 sps_5_siteModifier,
//			CWE_ST_v25 sps_6_collectionMethodModifierCode, CWE_ST_v25 sps_7_specimenRole) {
//		super();
//		this.sps_1_specimenSourceNameOrCode = sps_1_specimenSourceNameOrCode;
//		this.sps_2_additives = sps_2_additives;
//		this.sps_3_specimenCollectionMethod = sps_3_specimenCollectionMethod;
//		this.sps_4_bodySite = sps_4_bodySite;
//		this.sps_5_siteModifier = sps_5_siteModifier;
//		this.sps_6_collectionMethodModifierCode = sps_6_collectionMethodModifierCode;
//		this.sps_7_specimenRole = sps_7_specimenRole;
//	}
//	public SPS_ST_v25() {
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
//	 * @return the sps_1_specimenSourceNameOrCode
//	 *	@JsonProperty("sps_1_specimenSourceNameOrCode")
//	 */
//	
//	public CWE_ST_v25 getSps_1_specimenSourceNameOrCode() {
//		return sps_1_specimenSourceNameOrCode;
//	}
//	/**
//	 * @param sps_1_specimenSourceNameOrCode the sps_1_specimenSourceNameOrCode to set
//	 * @JsonProperty("sps_1_specimenSourceNameOrCode")
//	 */
//	public void setSps_1_specimenSourceNameOrCode(CWE_ST_v25 sps_1_specimenSourceNameOrCode) {
//		this.sps_1_specimenSourceNameOrCode = sps_1_specimenSourceNameOrCode;
//	}
//	/**
//	 * @return the sps_2_additives
//	 *	@JsonProperty("sps_2_additives")
//	 */
//	
//	public CWE_ST_v25 getSps_2_additives() {
//		return sps_2_additives;
//	}
//	/**
//	 * @param sps_2_additives the sps_2_additives to set
//	 * @JsonProperty("sps_2_additives")
//	 */
//	public void setSps_2_additives(CWE_ST_v25 sps_2_additives) {
//		this.sps_2_additives = sps_2_additives;
//	}
//	/**
//	 * @return the sps_3_specimenCollectionMethod
//	 *	@JsonProperty("sps_3_specimenCollectionMethod")
//	 */
//	
//	public String getSps_3_specimenCollectionMethod() {
//		return sps_3_specimenCollectionMethod;
//	}
//	/**
//	 * @param sps_3_specimenCollectionMethod the sps_3_specimenCollectionMethod to set
//	 * @JsonProperty("sps_3_specimenCollectionMethod")
//	 */
//	public void setSps_3_specimenCollectionMethod(String sps_3_specimenCollectionMethod) {
//		this.sps_3_specimenCollectionMethod = sps_3_specimenCollectionMethod;
//	}
//	/**
//	 * @return the sps_4_bodySite
//	 *	@JsonProperty("sps_4_bodySite")
//	 */
//	
//	public CWE_ST_v25 getSps_4_bodySite() {
//		return sps_4_bodySite;
//	}
//	/**
//	 * @param sps_4_bodySite the sps_4_bodySite to set
//	 * @JsonProperty("sps_4_bodySite")
//	 */
//	public void setSps_4_bodySite(CWE_ST_v25 sps_4_bodySite) {
//		this.sps_4_bodySite = sps_4_bodySite;
//	}
//	/**
//	 * @return the sps_5_siteModifier
//	 *	@JsonProperty("sps_5_siteModifier")
//	 */
//	
//	public CWE_ST_v25 getSps_5_siteModifier() {
//		return sps_5_siteModifier;
//	}
//	/**
//	 * @param sps_5_siteModifier the sps_5_siteModifier to set
//	 * @JsonProperty("sps_5_siteModifier")
//	 */
//	public void setSps_5_siteModifier(CWE_ST_v25 sps_5_siteModifier) {
//		this.sps_5_siteModifier = sps_5_siteModifier;
//	}
//	/**
//	 * @return the sps_6_collectionMethodModifierCode
//	 *	@JsonProperty("sps_6_collectionMethodModifierCode")
//	 */
//	
//	public CWE_ST_v25 getSps_6_collectionMethodModifierCode() {
//		return sps_6_collectionMethodModifierCode;
//	}
//	/**
//	 * @param sps_6_collectionMethodModifierCode the sps_6_collectionMethodModifierCode to set
//	 * @JsonProperty("sps_6_collectionMethodModifierCode")
//	 */
//	public void setSps_6_collectionMethodModifierCode(CWE_ST_v25 sps_6_collectionMethodModifierCode) {
//		this.sps_6_collectionMethodModifierCode = sps_6_collectionMethodModifierCode;
//	}
//	/**
//	 * @return the sps_7_specimenRole
//	 *	@JsonProperty("sps_7_specimenRole")
//	 */
//	
//	public CWE_ST_v25 getSps_7_specimenRole() {
//		return sps_7_specimenRole;
//	}
//	/**
//	 * @param sps_7_specimenRole the sps_7_specimenRole to set
//	 * @JsonProperty("sps_7_specimenRole")
//	 */
//	public void setSps_7_specimenRole(CWE_ST_v25 sps_7_specimenRole) {
//		this.sps_7_specimenRole = sps_7_specimenRole;
//	}
//	@Override
//	public String toString() {
//		return "SPS_ST_v25 [id=" + id + ", sps_1_specimenSourceNameOrCode=" + sps_1_specimenSourceNameOrCode
//				+ ", sps_2_additives=" + sps_2_additives + ", sps_3_specimenCollectionMethod="
//				+ sps_3_specimenCollectionMethod + ", sps_4_bodySite=" + sps_4_bodySite + ", sps_5_siteModifier="
//				+ sps_5_siteModifier + ", sps_6_collectionMethodModifierCode=" + sps_6_collectionMethodModifierCode
//				+ ", sps_7_specimenRole=" + sps_7_specimenRole + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, sps_1_specimenSourceNameOrCode, sps_2_additives, sps_3_specimenCollectionMethod,
//				sps_4_bodySite, sps_5_siteModifier, sps_6_collectionMethodModifierCode, sps_7_specimenRole);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		SPS_ST_v25 other = (SPS_ST_v25) obj;
//		return Objects.equals(id, other.id)
//				&& Objects.equals(sps_1_specimenSourceNameOrCode, other.sps_1_specimenSourceNameOrCode)
//				&& Objects.equals(sps_2_additives, other.sps_2_additives)
//				&& Objects.equals(sps_3_specimenCollectionMethod, other.sps_3_specimenCollectionMethod)
//				&& Objects.equals(sps_4_bodySite, other.sps_4_bodySite)
//				&& Objects.equals(sps_5_siteModifier, other.sps_5_siteModifier)
//				&& Objects.equals(sps_6_collectionMethodModifierCode, other.sps_6_collectionMethodModifierCode)
//				&& Objects.equals(sps_7_specimenRole, other.sps_7_specimenRole);
//	}
//	
//	
//}
