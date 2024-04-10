package scratch.coding.segment.v25;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.NTE;
import scratch.coding.models.CE_v2;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomNTE_v25 {
	@JsonProperty("nte_1_setID")
	private String nte_1_setID;
	@JsonProperty("nte_2_sourceofComment")
	private String nte_2_sourceofComment;
	@JsonProperty("nte_3_comment")
	private String[] nte_3_comment;
	@JsonProperty("nte_4_commentType")
	private CE_v2 nte_4_commentType;
	
	private NTE nte;
	public static CustomNTE_v25 createNteWithTypeAndVersion(NTE nte) throws HL7Exception, IOException {
		return new CustomNTE_v25(nte);
	}
	
	private CustomNTE_v25(NTE nte) {
		super();
		this.nte =nte;
	}

	/**
	 * @return the nte_1_setID
	 */
	
	@JsonProperty("nte_1_setID")
	public String getNte_1_setID() {
		return nte.getNte1_SetIDNTE().getValue();
	}

	/**
	 * @param nte_1_setID the nte_1_setID to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_1_setID")
	public void setNte_1_setID(String nte_1_setID) throws DataTypeException {
		nte.getNte1_SetIDNTE().setValue(nte_1_setID);
		this.nte_1_setID = nte_1_setID;
	}

	/**
	 * @return the nte_2_sourceofComment
	 */
	
	@JsonProperty("nte_2_sourceofComment")
	public String getNte_2_sourceofComment() {
		return nte.getNte2_SourceOfComment().getValue();
	}

	/**
	 * @param nte_2_sourceofComment the nte_2_sourceofComment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_2_sourceofComment")
	public void setNte_2_sourceofComment(String nte_2_sourceofComment) throws DataTypeException {
		nte.getNte2_SourceOfComment().setValue(nte_2_sourceofComment);
		this.nte_2_sourceofComment = nte_2_sourceofComment;
	}

	/**
	 * @return the nte_3_comment
	 */
	
	@JsonProperty("nte_3_comment")
	public String[] getNte_3_comment() {
		String[] comments = new String[nte.getComment().length];
		for(int i = 0;i< nte.getComment().length; i++) {
			comments[i] = nte.getComment(i).getValue();
		}
		return comments;
	}

	/**
	 * @param nte_3_comment the nte_3_comment to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_3_comment")
	public void setNte_3_comment(String[] nte_3_comment) throws DataTypeException {
		for(int i = 0; i<nte_3_comment.length;i++) {
			 nte.getNte3_Comment(i).setValue(nte_3_comment[i]);
		}
		this.nte_3_comment = nte_3_comment;
	}

	/**
	 * @return the nte_4_commentType
	 */
	
	@JsonProperty("nte_4_commentType")
	public CE_v2 getNte_4_commentType() {
		return new CE_v2(
				this.nte.getNte4_CommentType().getCe1_Identifier().getValue(),
				this.nte.getNte4_CommentType().getCe2_Text().getValue(), 
				this.nte.getNte4_CommentType().getCe3_NameOfCodingSystem().getValue(),
				this.nte.getNte4_CommentType().getCe4_AlternateIdentifier().getValue(),
				this.nte.getNte4_CommentType().getCe5_AlternateText().getValue(),
				this.nte.getNte4_CommentType().getCe6_NameOfAlternateCodingSystem().getValue());
	}

	/**
	 * @param nte_4_commentType the nte_4_commentType to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("nte_4_commentType")
	public void setNte_4_commentType(CE_v2 nte_4_commentType) throws DataTypeException {
		this.nte.getNte4_CommentType().getCe1_Identifier().setValue(nte_4_commentType.getCe_1_identifier());
		this.nte.getNte4_CommentType().getCe2_Text().setValue(nte_4_commentType.getCe_2_text()); 
		this.nte.getNte4_CommentType().getCe3_NameOfCodingSystem().setValue(nte_4_commentType.getCe_3_nameOfCodingSystem());
		this.nte.getNte4_CommentType().getCe4_AlternateIdentifier().setValue(nte_4_commentType.getCe_4_alternateIdentifier());
		this.nte.getNte4_CommentType().getCe5_AlternateText().setValue(nte_4_commentType.getCe_5_alternateText());
		this.nte.getNte4_CommentType().getCe6_NameOfAlternateCodingSystem().setValue(nte_4_commentType.getCe_6_nameOfAlternateCodingSystem());
		this.nte_4_commentType = nte_4_commentType;
	}

	@Override
	public String toString() {
		return "CustomNTE_v25 [nte_1_setID=" + nte_1_setID + ", nte_2_sourceofComment=" + nte_2_sourceofComment
				+ ", nte_3_comment=" + nte_3_comment + ", nte_4_commentType=" + nte_4_commentType + ", nte=" + nte
				+ "]";
	}
	
}
