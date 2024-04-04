package scratch.coding.segment.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.datatype.FT;
import ca.uhn.hl7v2.model.v23.segment.NTE;
import scratch.coding.services.CommonService;

@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomNTE implements Serializable {
	@JsonProperty("nte_1_setId")
	private String nte_1_setId;
	@JsonProperty("nte_2_sourceOfComment")
	private String nte_2_sourceOfComment;
	@JsonProperty("nte_3_comment")
	private String[] nte_3_comment;
	
	private NTE nte;
	
	private CustomNTE(NTE nte) {
		super();
		this.nte =nte;
	}
	public static CustomNTE createNteWithTypeAndVersion(NTE nte) throws HL7Exception, IOException {
		return new CustomNTE(nte);
	}
	public CustomNTE() {
		super();
	}
	/**
	 *	@return the nte_1_setId
	 */
	
	@JsonProperty("nte_1_setId")
	public String getNte_1_setId() {
		return CommonService.getString(this.nte.getNte1_SetIDNotesAndComments().getValue());
	}
	/**
	 * @param nte_1_setId the nte_1_setId to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_1_setId")
	public void setNte_1_setId(String nte_1_setId) throws DataTypeException {
		this.nte.getNte1_SetIDNotesAndComments().setValue(nte_1_setId);
		this.nte_1_setId = nte_1_setId;
	}
	/**
	 *	@return the nte_2_sourceOfComment
	 */
	
	@JsonProperty("nte_2_sourceOfComment")
	public String getNte_2_sourceOfComment() {
		return CommonService.getString(this.nte.getNte2_SourceOfComment().getValue());
	}
	/**
	 * @param nte_2_sourceOfComment the nte_2_sourceOfComment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_2_sourceOfComment")
	public void setNte_2_sourceOfComment(String nte_2_sourceOfComment) throws DataTypeException {
		this.nte.getNte2_SourceOfComment().setValue(nte_2_sourceOfComment);
		this.nte_2_sourceOfComment = nte_2_sourceOfComment;
	}
	/**
	 *	@return the nte_3_comment
	 */
	
	@JsonProperty("nte_3_comment")
	public String[] getNte_3_comment() {
		String[] comment = new String[this.nte.getNte3_Comment().length];
		for(int i =0; i<this.nte.getNte3_Comment().length;i++) {
			comment[i]=CommonService.getString(this.nte.getNte3_Comment(i).getValue());
		}
		return comment;
	}
	/**
	 * @param nte_3_comment the nte_3_comment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_3_comment")
	public void setNte_3_comment(String[] nte_3_comment) throws DataTypeException {
		for(int i =0; i<nte_3_comment.length;i++) {
			this.nte.getNte3_Comment(i).setValue(nte_3_comment[i]);
		}
		this.nte_3_comment = nte_3_comment;
	}
	@Override
	public String toString() {
		return "CustomNTE [nte_1_setId=" + nte_1_setId + ", nte_2_sourceOfComment=" + nte_2_sourceOfComment
				+ ", nte_3_comment=" + Arrays.toString(nte_3_comment) + ", nte=" + nte + "]";
	}
	

}
