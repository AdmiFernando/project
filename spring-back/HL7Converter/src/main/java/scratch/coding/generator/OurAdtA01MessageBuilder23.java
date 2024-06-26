package scratch.coding.generator;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v23.message.ADT_A01;
import ca.uhn.hl7v2.model.v23.datatype.PL;
import ca.uhn.hl7v2.model.v23.datatype.XAD;
import ca.uhn.hl7v2.model.v23.datatype.XCN;
import ca.uhn.hl7v2.model.v23.datatype.XPN;
import ca.uhn.hl7v2.model.v23.message.ORU_R01;
import ca.uhn.hl7v2.model.v23.segment.EVN;
import ca.uhn.hl7v2.model.v23.segment.MSH;
import ca.uhn.hl7v2.model.v23.segment.PID;
import ca.uhn.hl7v2.model.v23.segment.PV1;

public class OurAdtA01MessageBuilder23 {
	private ADT_A01 _adtMessage;
	private ORU_R01 _oruMessage;
	
	 public ADT_A01 BuildAdt() throws HL7Exception, IOException {
		 System.out.println("ADT_A01 version:2.3");
         String currentDateTimeString = getCurrentTimeStamp();
         _adtMessage = new ADT_A01(); 
         //you can use the context class's newMessage method to instantiate a message if you want
         _adtMessage.initQuickstart("ADT", "A01", "P");
         createMshSegment(currentDateTimeString, new ADT_A01());
         createEvnSegment(currentDateTimeString);
         createPidSegment();
         createPv1Segment();
         return _adtMessage;
     }
	 public ORU_R01 BuildOru() throws HL7Exception, IOException {
		 System.out.println("ORU_R01 version:2.3");
		 String currentDateTimeString = getCurrentTimeStamp();
		 _oruMessage = new ORU_R01();
		 _oruMessage.initQuickstart("ORU", "R01", "T");
		 createMshSegment(currentDateTimeString, new ORU_R01());
		 return _oruMessage;
	 }
	 private <T> void createMshSegment(String currentDateTimeString, T t) throws DataTypeException {
		 MSH mshSegment;
		 if(t.getClass().equals(new ADT_A01().getClass())) {
			 mshSegment = _adtMessage.getMSH();
         mshSegment.getFieldSeparator().setValue("|");
         mshSegment.getEncodingCharacters().setValue("^~\\&");
         mshSegment.getSendingApplication().getNamespaceID().setValue("Our System");
         mshSegment.getSendingFacility().getNamespaceID().setValue("Our Facility");
         mshSegment.getReceivingApplication().getNamespaceID().setValue("Their Remote System");
         mshSegment.getReceivingFacility().getNamespaceID().setValue("Their Remote Facility");
         mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
         mshSegment.getMessageControlID().setValue(getSequenceNumber());
         mshSegment.getVersionID().setValue("2.3");
		 
		 } else if(t.getClass().equals(new ORU_R01().getClass())){
			 mshSegment = _oruMessage.getMSH();
	         mshSegment.getFieldSeparator().setValue("|");
	         mshSegment.getEncodingCharacters().setValue("^~\\&");
	         mshSegment.getSendingApplication().getNamespaceID().setValue("Our System");
	         mshSegment.getSendingFacility().getNamespaceID().setValue("Our Facility");
	         mshSegment.getReceivingApplication().getNamespaceID().setValue("Their Remote System");
	         mshSegment.getReceivingFacility().getNamespaceID().setValue("Their Remote Facility");
	         mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
	         mshSegment.getMessageControlID().setValue(getSequenceNumber());
	         mshSegment.getVersionID().setValue("2.4");

		 }
     }
	 private void createEvnSegment(String currentDateTimeString) throws DataTypeException {
         EVN evn = _adtMessage.getEVN();
         evn.getEventTypeCode().setValue("A01");
         evn.getRecordedDateTime().getTimeOfAnEvent().setValue(currentDateTimeString);
     }
	 private void createPidSegment() throws DataTypeException {
         PID pid = _adtMessage.getPID();
         XPN patientName = pid.getPatientName(0);
         patientName.getFamilyName().setValue("Mouse");
         patientName.getGivenName().setValue("Mickey");
         pid.getPid1_SetIDPatientID().setValue("378785433211");
         XAD patientAddress = pid.getPatientAddress(0);
         patientAddress.getStreetAddress().setValue("123 Main Street");
         patientAddress.getCity().setValue("Lake Buena Vista");
         patientAddress.getStateOrProvince().setValue("FL");
         patientAddress.getCountry().setValue("USA");
     }
	  private String getCurrentTimeStamp() {
          return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
      }
	  private void createPv1Segment() throws DataTypeException {
          PV1 pv1 = _adtMessage.getPV1();
          pv1.getPatientClass().setValue("O"); // to represent an 'Outpatient'
          PL assignedPatientLocation = pv1.getAssignedPatientLocation();
          assignedPatientLocation.getFacility().getNamespaceID().setValue("Some Treatment Facility Name");
          assignedPatientLocation.getPointOfCare().setValue("Some Point of Care");
          pv1.getAdmissionType().setValue("ALERT");
          XCN referringDoctor = pv1.getReferringDoctor(0);
          referringDoctor.getIDNumber().setValue("99999999");
          referringDoctor.getFamilyName().setValue("Smith");
          referringDoctor.getGivenName().setValue("Jack");
          referringDoctor.getIdentifierTypeCode().setValue("456789");
          pv1.getAdmitDateTime().getTimeOfAnEvent().setValue(getCurrentTimeStamp());
      }
      

      private String getSequenceNumber() {
          String facilityNumberPrefix = "1234"; // some arbitrary prefix for the facility
          return facilityNumberPrefix.concat(getCurrentTimeStamp());
      }
}
