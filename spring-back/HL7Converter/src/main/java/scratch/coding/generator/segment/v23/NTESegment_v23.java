package scratch.coding.generator.segment.v23;

import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.segment.NTE;
import scratch.coding.segment.v23.JsonNTE_v23;

public class NTESegment_v23 {

	public static void setNTE(NTE nte, JsonNTE_v23 customNTE) throws DataTypeException {
		nte.getNte1_SetIDNotesAndComments().setValue(customNTE.getNte_1_setId());
		nte.getNte2_SourceOfComment().setValue(customNTE.getNte_2_sourceOfComment());
		for(int i = 0; i <customNTE.getNte_3_comment().length; i++) {
			nte.getNte3_Comment(i).setValue(customNTE.getNte_3_comment()[i]);
		}
	}
}
