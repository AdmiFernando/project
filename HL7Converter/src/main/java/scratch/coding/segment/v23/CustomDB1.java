package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.DB1;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.services.CommonService;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomDB1 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2597648911278120572L;
	@JsonProperty("db1_1_setId")
	private String db1_1_setId;
	@JsonProperty("db1_2_disabledPersonCode")
	private String db1_2_disabledPersonCode;
	@JsonProperty("cx_db1_3_disabledPersonIdentifier")
	private CX_v23[] cx_db1_3_disabledPersonIdentifier;
	@JsonProperty("db1_4_disableIndicator")
	private String db1_4_disableIndicator;
	@JsonProperty("db1_5_disabilityStartDate")
	private String db1_5_disabilityStartDate;
	@JsonProperty("db1_6_disabilityEndDate")
	private String db1_6_disabilityEndDate;
	@JsonProperty("db1_7_disabilityReturnToWorkDate")
	private String db1_7_disabilityReturnToWorkDate;
	@JsonProperty("db1_8_disabilityUnableToWorkDate")
	private String db1_8_disabilityUnableToWorkDate;
	
	private DB1 db1;
	
	private CustomDB1(DB1 db1) {
		super();
		this.db1 =db1;
	}
	public static CustomDB1 createDb1WithTypeAndVersion(DB1 db1) throws HL7Exception, IOException {
		return new CustomDB1(db1);
	}
	/**
	 *	@return the db1_1_setId
	 */
	
	@JsonProperty("db1_1_setId")
	public String getDb1_1_setId() {
		return this.db1.getDb11_SetIDDB1().getValue()==null?"":this.db1.getDb11_SetIDDB1().getValue();
	}
	/**
	 * @param db1_1_setId the db1_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_1_setId")
	public void setDb1_1_setId(String db1_1_setId) throws DataTypeException {
		this.db1.getDb11_SetIDDB1().setValue(db1_1_setId);;
		this.db1_1_setId = db1_1_setId;
	}
	/**
	 *	@return the db1_2_disabledPersonCode
	 */
	
	@JsonProperty("db1_2_disabledPersonCode")
	public String getDb1_2_disabledPersonCode() {
		return this.db1.getDb12_DisabledPersonCode().getValue()==null?"":this.db1.getDb12_DisabledPersonCode().getValue();
	}
	/**
	 * @param db1_2_disabledPersonCode the db1_2_disabledPersonCode to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_2_disabledPersonCode")
	public void setDb1_2_disabledPersonCode(String db1_2_disabledPersonCode) throws DataTypeException {
		this.db1.getDb12_DisabledPersonCode().setValue(db1_2_disabledPersonCode);
		this.db1_2_disabledPersonCode = db1_2_disabledPersonCode;
	}
	/**
	 *	@return the cx_db1_3_disabledPersonIdentifier
	 */
	@JsonProperty("cx_db1_3_disabledPersonIdentifier")
	public CX_v23[] getCx_db1_3_disabledPersonIdentifier() {
		CX_v23[] disabledPersonIdentifier = new CX_v23[this.db1.getDb13_DisabledPersonIdentifier().length];
		for(int i =0; i<this.db1.getDb13_DisabledPersonIdentifier().length;i++) {
			disabledPersonIdentifier[i] = CommonService.getCX_v23(this.db1.getDb13_DisabledPersonIdentifier(i));
		}
		return disabledPersonIdentifier;
	}
	/**
	 * @param cx_db1_3_disabledPersonIdentifier the cx_db1_3_disabledPersonIdentifier to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("cx_db1_3_disabledPersonIdentifier")
	public void setCx_db1_3_disabledPersonIdentifier(CX_v23[] cx_db1_3_disabledPersonIdentifier) throws DataTypeException {
		for(int i =0; i<cx_db1_3_disabledPersonIdentifier.length;i++) {
			CommonService.setCX_23(this.db1.getDb13_DisabledPersonIdentifier(i), cx_db1_3_disabledPersonIdentifier[i]);
		}
		this.cx_db1_3_disabledPersonIdentifier = cx_db1_3_disabledPersonIdentifier;
	}
	/**
	 *	@return the db1_4_disableIndicator
	 */
	
	@JsonProperty("db1_4_disableIndicator")
	public String getDb1_4_disableIndicator() {
		return this.db1.getDb14_DisabledIndicator().getValue()==null?"":this.db1.getDb14_DisabledIndicator().getValue();
	}
	/**
	 * @param db1_4_disableIndicator the db1_4_disableIndicator to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_4_disableIndicator")
	public void setDb1_4_disableIndicator(String db1_4_disableIndicator) throws DataTypeException {
		this.db1.getDb14_DisabledIndicator().setValue(db1_4_disableIndicator);
		this.db1_4_disableIndicator = db1_4_disableIndicator;
	}
	/**
	 *	@return the db1_5_disabilityStartDate
	 */
	
	@JsonProperty("db1_5_disabilityStartDate")
	public String getDb1_5_disabilityStartDate() {
		return this.db1.getDb15_DisabilityStartDate().getValue()==null?"":this.db1.getDb15_DisabilityStartDate().getValue();
	}
	/**
	 * @param db1_5_disabilityStartDate the db1_5_disabilityStartDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_5_disabilityStartDate")
	public void setDb1_5_disabilityStartDate(String db1_5_disabilityStartDate) throws DataTypeException {
		this.db1.getDb15_DisabilityStartDate().setValue(db1_5_disabilityStartDate);
		this.db1_5_disabilityStartDate = db1_5_disabilityStartDate;
	}
	/**
	 *	@return the db1_6_disabilityEndDate
	 */
	
	@JsonProperty("db1_6_disabilityEndDate")
	public String getDb1_6_disabilityEndDate() {
		return this.db1.getDb16_DisabilityEndDate().getValue()==null?"":this.db1.getDb16_DisabilityEndDate().getValue();
	}
	/**
	 * @param db1_6_disabilityEndDate the db1_6_disabilityEndDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_6_disabilityEndDate")
	public void setDb1_6_disabilityEndDate(String db1_6_disabilityEndDate) throws DataTypeException {
		this.db1.getDb16_DisabilityEndDate().setValue(db1_6_disabilityEndDate);
		this.db1_6_disabilityEndDate = db1_6_disabilityEndDate;
	}
	/**
	 *	@return the db1_7_disabilityReturnToWorkDate
	 */
	
	@JsonProperty("db1_7_disabilityReturnToWorkDate")
	public String getDb1_7_disabilityReturnToWorkDate() {
		return this.db1.getDb17_DisabilityReturnToWorkDate().getValue()==null?"":this.db1.getDb17_DisabilityReturnToWorkDate().getValue();
	}
	/**
	 * @param db1_7_disabilityReturnToWorkDate the db1_7_disabilityReturnToWorkDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_7_disabilityReturnToWorkDate")
	public void setDb1_7_disabilityReturnToWorkDate(String db1_7_disabilityReturnToWorkDate) throws DataTypeException {
		this.db1.getDb17_DisabilityReturnToWorkDate().setValue(db1_7_disabilityReturnToWorkDate);
		this.db1_7_disabilityReturnToWorkDate = db1_7_disabilityReturnToWorkDate;
	}
	/**
	 *	@return the db1_8_disabilityUnableToWorkDate
	 */
	
	@JsonProperty("db1_8_disabilityUnableToWorkDate")
	public String getDb1_8_disabilityUnableToWorkDate() {
		return this.db1.getDb18_DisabilityUnableToWorkDate().getValue()==null?"":this.db1.getDb18_DisabilityUnableToWorkDate().getValue();
	}
	/**
	 * @param db1_8_disabilityUnableToWorkDate the db1_8_disabilityUnableToWorkDate to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("db1_8_disabilityUnableToWorkDate")
	public void setDb1_8_disabilityUnableToWorkDate(String db1_8_disabilityUnableToWorkDate) throws DataTypeException {
		this.db1.getDb18_DisabilityUnableToWorkDate().setValue(db1_8_disabilityUnableToWorkDate);
		this.db1_8_disabilityUnableToWorkDate = db1_8_disabilityUnableToWorkDate;
	}
	@Override
	public String toString() {
		return "CustomDB1 [db1_1_setId=" + db1_1_setId + ", db1_2_disabledPersonCode=" + db1_2_disabledPersonCode
				+ ", cx_db1_3_disabledPersonIdentifier=" + Arrays.toString(cx_db1_3_disabledPersonIdentifier)
				+ ", db1_4_disableIndicator=" + db1_4_disableIndicator + ", db1_5_disabilityStartDate="
				+ db1_5_disabilityStartDate + ", db1_6_disabilityEndDate=" + db1_6_disabilityEndDate
				+ ", db1_7_disabilityReturnToWorkDate=" + db1_7_disabilityReturnToWorkDate
				+ ", db1_8_disabilityUnableToWorkDate=" + db1_8_disabilityUnableToWorkDate + ", db1=" + db1 + "]";
	}

	
}
