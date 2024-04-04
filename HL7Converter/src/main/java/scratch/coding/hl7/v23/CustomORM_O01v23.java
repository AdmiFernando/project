package scratch.coding.hl7.v23;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.group.ORM_O01_ORDER;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import scratch.coding.generic.JsonGenerator;
import scratch.coding.segment.v23.CustomIN1;
import scratch.coding.segment.v23.CustomMSH;
import scratch.coding.segment.v23.CustomORC;
import scratch.coding.segment.v23.CustomPID;

@JsonIgnoreProperties(ignoreUnknown= true)
@Component
@Qualifier("CustomORM_O01v23")
public class CustomORM_O01v23 implements Serializable, JsonGenerator{
	@JsonProperty("msh")
	@Autowired
	private CustomMSH msh;
	@JsonProperty("pid")
	private CustomPID pid;
	@JsonProperty("orc")
	private CustomORC[] orc;
	@JsonProperty("error")
	private String error;
	
	
	
	public CustomORM_O01v23 createJsonFromORM_O01(ORM_O01 orm) throws HL7Exception, IOException {
		return new CustomORM_O01v23(getMSH(orm), getPID(orm), getIN1(orm) ,getORCAll(orm.getORDERAll()));
	}
	
	private CustomMSH getMSH(ORM_O01 orm) throws HL7Exception, IOException {
		return msh.createMsh1WithTypeAndVersion(orm);
	}
	
	private static CustomPID getPID(ORM_O01 orm) throws HL7Exception, IOException {
		return CustomPID.createPidWithTypeAndVersion(orm.getPATIENT());
	}
	
	private static CustomIN1 getIN1(ORM_O01 orm) throws HL7Exception, IOException {
		return CustomIN1.createIn1WithTypeAndVersion(orm.getPATIENT().getINSURANCE().getIN1());
	}
	private static CustomORC[] getORCAll(List<ORM_O01_ORDER> orcList) throws HL7Exception, IOException {
		int  orcCounter = 0;
		CustomORC[] orc = new CustomORC[orcList.size()];
		for(ORM_O01_ORDER o : orcList) {
			orc[orcCounter] = CustomORC.createOrc(o);
			orcCounter++;
		}
		return orc;
	}
	
	private CustomORM_O01v23(CustomMSH msh, CustomPID pid, CustomIN1 in1, CustomORC[] orc) {
		super();
		this.msh = msh;
		this.pid = pid;
//		this.in1 = in1;
		this.orc = orc;
		
	}
	public CustomORM_O01v23() {
		super();
	}
	@JsonProperty("msh")
	public CustomMSH getMsh() {
		return msh;
	}
	@JsonProperty("msh")
	public void setMsh(CustomMSH msh) {
		this.msh = msh;
	}
	@JsonProperty("pid")
	public CustomPID getPid() {
		return pid;
	}
	@JsonProperty("pid")
	public void setPid(CustomPID pid) {
		this.pid = pid;
	}
//	@JsonProperty("in1")
//	public CustomIN1 getIn1() {
//		return in1;
//	}
//	@JsonProperty("in1")
//	public void setIn1(CustomIN1 in1) {
//		this.in1 = in1;
//	}
	@JsonProperty("orc")
	public CustomORC[] getOrc() {
		return orc;
	}
	@JsonProperty("orc")
	public void setOrc(CustomORC[] orc) {
		this.orc = orc;
	}

	/**
	 * @return the error
	 */
	@JsonProperty("error")
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	@JsonProperty("error")
	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "CustomHL7_23 [msh=" + msh + ", pid=" + pid + ", in1=" +/* in1 +*/ ", orc=" + Arrays.toString(orc)
				+ ", error=" + error + "]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T, S> T createJsonFromHL7(S s) throws HL7Exception, IOException {
		// TODO Auto-generated method stub
		ORM_O01 orm = (ORM_O01)s;
		return  (T) new CustomORM_O01v23(getMSH( orm), getPID( orm), getIN1(orm) ,getORCAll(orm.getORDERAll()));
	}

	



}
