package scratch.coding.segment.v25;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.DSC;
@JsonIgnoreProperties(ignoreUnknown= true)
public class CustomDSC_v25 {
	@JsonProperty("dsc_1_continuationPointer")
	private String dsc_1_continuationPointer;
	@JsonProperty("dsc_2_continuationStyle")
	private String dsc_2_continuationStyle;
	
	private DSC dsc;
	private CustomDSC_v25(DSC dsc, CustomNTE_v25[] nte) {
		super();
		this.dsc =dsc;
//		setNte(nte);
	}
	private CustomDSC_v25(DSC dsc) {
		super();
		this.dsc =dsc;
	}
	
	public CustomDSC_v25() {
		super();
	}
	public static CustomDSC_v25 createDSCWithDSC(DSC dsc) throws HL7Exception, IOException {
		return new CustomDSC_v25(dsc);
	}

	public static CustomDSC_v25 createDSCWithTypeAndVersion(ORU_R01 oru) throws HL7Exception, IOException {
		DSC dsc = oru.getDSC();
//		List<NTE> ntes = orm.getNTEAll();
//		CustomNTE[] nteArray = new CustomNTE[ntes.size()];
//		int l = 0;
//		for (NTE nt : ntes) {
//			nteArray[l] = CustomNTE.createNteWithTypeAndVersion(nt);
//			l++;
//		}
		return new CustomDSC_v25(dsc);
	}
	/**
	 * @return the dsc_1_continuationPointer
	 */
	
	@JsonProperty("dsc_1_continuationPointer")
	public String getDsc_1_continuationPointer() {
		return this.dsc.getDsc1_ContinuationPointer().getValue()==null?"":this.dsc.getDsc1_ContinuationPointer().getValue();
	}
	/**
	 * @param dsc_1_continuationPointer the dsc_1_continuationPointer to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dsc_1_continuationPointer")
	public void setDsc_1_continuationPointer(String dsc_1_continuationPointer) throws DataTypeException {
		this.dsc.getDsc1_ContinuationPointer().setValue(dsc_1_continuationPointer);
		this.dsc_1_continuationPointer = dsc_1_continuationPointer;
	}
	/**
	 * @return the dsc_2_continuationStyle
	 */
	
	@JsonProperty("dsc_2_continuationStyle")
	public String getDsc_2_continuationStyle() {
		return this.dsc.getDsc2_ContinuationStyle().getValue()==null?"":this.dsc.getDsc2_ContinuationStyle().getValue();
	}
	/**
	 * @param dsc_2_continuationStyle the dsc_2_continuationStyle to set
	 * @throws DataTypeException 
	 */
	@JsonProperty("dsc_2_continuationStyle")
	public void setDsc_2_continuationStyle(String dsc_2_continuationStyle) throws DataTypeException {
		this.dsc.getDsc2_ContinuationStyle().setValue(dsc_2_continuationStyle);
		this.dsc_2_continuationStyle = dsc_2_continuationStyle;
	}
	@Override
	public String toString() {
		return "CustomDSC_v25 [dsc_1_continuationPointer=" + dsc_1_continuationPointer + ", dsc_2_continuationStyle="
				+ dsc_2_continuationStyle + ", dsc=" + dsc + "]";
	}
}
