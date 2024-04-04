package scratch.coding.generator.segment.v23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.message.ORM_O01;
import scratch.coding.segment.v23.JsonPD1_v23;
import scratch.coding.services.CommonService;
public class PD1Segment_v23 {
	
	public static void setPD1(ORM_O01 orm, JsonPD1_v23 customPD1) throws DataTypeException {
		orm.getPATIENT().getPD1().getPd11_LivingDependency().setValue(customPD1.getPd1_1_livingDependency());
		orm.getPATIENT().getPD1().getPd12_LivingArrangement().setValue(customPD1.getPd1_2_livingArrangement());
		for(int i = 0; i<customPD1.getXon_pd1_3_patientPrimaryFacility().length;i++) {
			CommonService.setXON_v23(orm.getPATIENT().getPD1().getPd13_PatientPrimaryFacility(i), customPD1.getXon_pd1_3_patientPrimaryFacility()[i]);
		}
		for(int i = 0; i< customPD1.getXcn_pd1_4_patientPrimaryCareProviderNameAndIdNo().length;i++) {
			CommonService.setXCN_v23(orm.getPATIENT().getPD1().getPd14_PatientPrimaryCareProviderNameIDNo(i), customPD1.getXcn_pd1_4_patientPrimaryCareProviderNameAndIdNo()[i]);
		}
		orm.getPATIENT().getPD1().getPd15_StudentIndicator().setValue(customPD1.getPd1_5_studenIndicator());
		orm.getPATIENT().getPD1().getPd16_Handicap().setValue(customPD1.getPd1_6_handicap());
		orm.getPATIENT().getPD1().getPd17_LivingWill().setValue(customPD1.getPd1_7_livingWill());
		orm.getPATIENT().getPD1().getPd18_OrganDonor().setValue(customPD1.getPd1_8_organDonor());
		orm.getPATIENT().getPD1().getPd19_SeparateBill().setValue(customPD1.getPd1_9_separateBill());
		for(int i = 0; i <customPD1.getCx_pd1_10_duplicatePatient().length;i++) {
			CommonService.setCX_23(orm.getPATIENT().getPD1().getPd110_DuplicatePatient(i), customPD1.getCx_pd1_10_duplicatePatient()[i]);
		}
		CommonService.setCE_v2(orm.getPATIENT().getPD1().getPd111_PublicityIndicator(), customPD1.getCe_pd1_11_publicityIndicator());
		orm.getPATIENT().getPD1().getPd112_ProtectionIndicator().setValue(customPD1.getPd1_12_protectionIndicator());
	}
}
