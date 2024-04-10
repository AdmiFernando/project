package scratch.coding.segment.v251;
//package app.models251;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import ca.uhn.hl7v2.model.v251.segment.SFT;
//
//@JsonIgnoreProperties(ignoreUnknown= true)
//public class CustomSFT {
//	@JsonProperty("SFT01_SoftwareVenderOrganization")
//	private String SFT01_SoftwareVenderOrganization;
//	@JsonProperty("SFT02_SoftwareCertificationVersionOrReleaseNumber")
//	private String SFT02_SoftwareCertificationVersionOrReleaseNumber;
//	@JsonProperty("SFT03_SoftwareProdutcName")
//	private String SFT03_SoftwareProdutcName;
//	@JsonProperty("SFT04_SoftwareBinaryId")
//	private String SFT04_SoftwareBinaryId;
//	@JsonProperty("SFT05_SoftwareProductInformation")
//	private String SFT05_SoftwareProductInformation;
//	@JsonProperty("SFT06_SoftwareInstallDate")
//	private String SFT06_SoftwareInstallDate;
//	
//	private SFT sft;
//	
//	private CustomSFT(SFT sft) {
//		super();
//		this.sft = sft;
//	}
//	public static CustomSFT createSFTWithTypeAndVersion(SFT sft) {
//		return new CustomSFT(sft);
//	}
//	/**
//	 * @return the sFT01_SoftwareVenderOrganization
//	 */
//	public String getSFT01_SoftwareVenderOrganization() {
//		return sft.getSft1_SoftwareVendorOrganization().;
//	}
//	/**
//	 * @param sFT01_SoftwareVenderOrganization the sFT01_SoftwareVenderOrganization to set
//	 */
//	public void setSFT01_SoftwareVenderOrganization(String sFT01_SoftwareVenderOrganization) {
//		SFT01_SoftwareVenderOrganization = sFT01_SoftwareVenderOrganization;
//	}
//	/**
//	 * @return the sFT02_SoftwareCertificationVersionOrReleaseNumber
//	 */
//	public String getSFT02_SoftwareCertificationVersionOrReleaseNumber() {
//		return SFT02_SoftwareCertificationVersionOrReleaseNumber;
//	}
//	/**
//	 * @param sFT02_SoftwareCertificationVersionOrReleaseNumber the sFT02_SoftwareCertificationVersionOrReleaseNumber to set
//	 */
//	public void setSFT02_SoftwareCertificationVersionOrReleaseNumber(
//			String sFT02_SoftwareCertificationVersionOrReleaseNumber) {
//		SFT02_SoftwareCertificationVersionOrReleaseNumber = sFT02_SoftwareCertificationVersionOrReleaseNumber;
//	}
//	/**
//	 * @return the sFT03_SoftwareProdutcName
//	 */
//	public String getSFT03_SoftwareProdutcName() {
//		return SFT03_SoftwareProdutcName;
//	}
//	/**
//	 * @param sFT03_SoftwareProdutcName the sFT03_SoftwareProdutcName to set
//	 */
//	public void setSFT03_SoftwareProdutcName(String sFT03_SoftwareProdutcName) {
//		SFT03_SoftwareProdutcName = sFT03_SoftwareProdutcName;
//	}
//	/**
//	 * @return the sFT04_SoftwareBinaryId
//	 */
//	public String getSFT04_SoftwareBinaryId() {
//		return SFT04_SoftwareBinaryId;
//	}
//	/**
//	 * @param sFT04_SoftwareBinaryId the sFT04_SoftwareBinaryId to set
//	 */
//	public void setSFT04_SoftwareBinaryId(String sFT04_SoftwareBinaryId) {
//		SFT04_SoftwareBinaryId = sFT04_SoftwareBinaryId;
//	}
//	/**
//	 * @return the sFT05_SoftwareProductInformation
//	 */
//	public String getSFT05_SoftwareProductInformation() {
//		return SFT05_SoftwareProductInformation;
//	}
//	/**
//	 * @param sFT05_SoftwareProductInformation the sFT05_SoftwareProductInformation to set
//	 */
//	public void setSFT05_SoftwareProductInformation(String sFT05_SoftwareProductInformation) {
//		SFT05_SoftwareProductInformation = sFT05_SoftwareProductInformation;
//	}
//	/**
//	 * @return the sFT06_SoftwareInstallDate
//	 */
//	public String getSFT06_SoftwareInstallDate() {
//		return SFT06_SoftwareInstallDate;
//	}
//	/**
//	 * @param sFT06_SoftwareInstallDate the sFT06_SoftwareInstallDate to set
//	 */
//	public void setSFT06_SoftwareInstallDate(String sFT06_SoftwareInstallDate) {
//		SFT06_SoftwareInstallDate = sFT06_SoftwareInstallDate;
//	}
//	/**
//	 * @return the sft
//	 */
//	public SFT getSft() {
//		return sft;
//	}
//	/**
//	 * @param sft the sft to set
//	 */
//	public void setSft(SFT sft) {
//		this.sft = sft;
//	}
//	
//}
