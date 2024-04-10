package scratch.coding.segment.v23;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.AL1;
import scratch.coding.models.CE_v2;
import scratch.coding.services.CommonService;
//import scratch.coding.services.CommonService;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomAL1 {
	@JsonProperty("al1_1_setId")
	private String al1_1_setId;
	@JsonProperty("al1_2_allergyType")
	private String al1_2_allergyType;
	@JsonProperty("ce_al1_3_allergyCodeMnomonicDescription")
	private CE_v2 ce_al1_3_allergyCodeMnomonicDescription;
	@JsonProperty("al1_4_allergySeverity")
	private String al1_4_allergySeverity;
	@JsonProperty("al1_5_allergyReaction")
	private String al1_5_allergyReaction;
	@JsonProperty("al1_6_identificationDate")
	private String al1_6_identificationDate;
	

	private AL1 al1;
	
	private CustomAL1(AL1 al1) {
		super();
		this.al1 =al1;
	}
	public static CustomAL1 createAl1WithTypeAndVersion(AL1 al1) throws HL7Exception, IOException {
		return new CustomAL1(al1);
	}
	/**
	 *	@return the al1_1_setId
	 */
	
	@JsonProperty("al1_1_setId")
	public String getAl1_1_setId() {
		return this.al1.getAl11_SetIDAL1().getValue()==null?"":this.al1.getAl11_SetIDAL1().getValue();
	}
	/**
	 * @param al1_1_setId the al1_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("al1_1_setId")
	public void setAl1_1_setId(String al1_1_setId) throws DataTypeException {
		this.al1.getAl11_SetIDAL1().setValue(al1_1_setId);
		this.al1_1_setId = al1_1_setId;
	}
	/**
	 *	@return the al1_2_allergyType
	 */
	
	@JsonProperty("al1_2_allergyType")
	public String getAl1_2_allergyType() {
		return this.al1.getAl12_AllergyType().getValue()==null?"":this.al1.getAl12_AllergyType().getValue();
	}
	/**
	 * @param al1_2_allergyType the al1_2_allergyType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("al1_2_allergyType")
	public void setAl1_2_allergyType(String al1_2_allergyType) throws DataTypeException {
		this.al1.getAl12_AllergyType().setValue(al1_1_setId);
		this.al1_2_allergyType = al1_2_allergyType;
	}
	/**
	 *	@return the ce_al1_3_allergyCodeMnomonicDescription
	 */
	
	@JsonProperty("ce_al1_3_allergyCodeMnomonicDescription")
	public CE_v2 getCe_al1_3_allergyCodeMnomonicDescription() {
		return CommonService.getCE_v2(this.al1.getAl13_AllergyCodeMnemonicDescription());
	}
	/**
	 * @param ce_al1_3_allergyCodeMnomonicDescription the ce_al1_3_allergyCodeMnomonicDescription to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("ce_al1_3_allergyCodeMnomonicDescription")
	public void setCe_al1_3_allergyCodeMnomonicDescription(CE_v2 ce_al1_3_allergyCodeMnomonicDescription) throws DataTypeException {
		CommonService.setCE_v2(this.al1.getAl13_AllergyCodeMnemonicDescription(), ce_al1_3_allergyCodeMnomonicDescription);
		this.ce_al1_3_allergyCodeMnomonicDescription = ce_al1_3_allergyCodeMnomonicDescription;
	}
	/**
	 *	@return the al1_4_allergySeverity
	 */
	
	@JsonProperty("al1_4_allergySeverity")
	public String getAl1_4_allergySeverity() {
		return this.al1.getAl14_AllergySeverity().getValue()==null?"":this.al1.getAl14_AllergySeverity().getValue();
	}
	/**
	 * @param al1_4_allergySeverity the al1_4_allergySeverity to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("al1_4_allergySeverity")
	public void setAl1_4_allergySeverity(String al1_4_allergySeverity) throws DataTypeException {
		this.al1.getAl14_AllergySeverity().setValue(al1_4_allergySeverity);
		this.al1_4_allergySeverity = al1_4_allergySeverity;
	}
	/**
	 *	@return the al1_5_allergyReaction
	 */
	
	@JsonProperty("al1_5_allergyReaction")
	public String getAl1_5_allergyReaction() {
		return this.al1.getAl15_AllergyReaction().getValue()==null?"":this.al1.getAl15_AllergyReaction().getValue();
	}
	/**
	 * @param al1_5_allergyReaction the al1_5_allergyReaction to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("al1_5_allergyReaction")
	public void setAl1_5_allergyReaction(String al1_5_allergyReaction) throws DataTypeException {
		this.al1.getAl15_AllergyReaction().setValue(al1_5_allergyReaction);
		this.al1_5_allergyReaction = al1_5_allergyReaction;
	}
	/**
	 *	@return the al1_6_identificationDate
	 */
	
	@JsonProperty("al1_6_identificationDate")
	public String getAl1_6_identificationDate() {
		return this.al1.getAl16_IdentificationDate().getValue()==null?"":this.al1.getAl16_IdentificationDate().getValue();
	}
	/**
	 * @param al1_6_identificationDate the al1_6_identificationDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("al1_6_identificationDate")
	public void setAl1_6_identificationDate(String al1_6_identificationDate) throws DataTypeException {
		this.al1.getAl16_IdentificationDate().setValue(al1_6_identificationDate);
		this.al1_6_identificationDate = al1_6_identificationDate;
	}
	@Override
	public String toString() {
		return "CustomAL1 [al1_1_setId=" + al1_1_setId + ", al1_2_allergyType=" + al1_2_allergyType
				+ ", ce_al1_3_allergyCodeMnomonicDescription=" + ce_al1_3_allergyCodeMnomonicDescription
				+ ", al1_4_allergySeverity=" + al1_4_allergySeverity + ", al1_5_allergyReaction="
				+ al1_5_allergyReaction + ", al1_6_identificationDate=" + al1_6_identificationDate + ", al1=" + al1 + "]";
	}

	
}
