//package scratch.coding.entities;
//
//import java.util.Arrays;
//import java.util.Date;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@Table(name="ORU_RESULT")
//@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class ORU_Result {
//	@Id
//	@Column(name="MESSAGE_CONTROL")
//	private String messageControlId;
//	@Column(name="PATIENT_ID")
//	private String patientId;
//	@Column(name="HL7")
//	@Lob
//	private byte[] hl7;
//	@Column(name="EXAM_DATE")
//	@Temporal(value=TemporalType.DATE)
//	private Date examDate;
//	@Column(name="TIME_STAMP")
//	@Temporal(value=TemporalType.DATE)
//	private Date timeStamp;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ATTIBUTE_ORU", referencedColumnName = "ATTRIBUTE_ID")
//	private Attribute attribute;
//	public ORU_Result() {
//		super();
//	}
//	public ORU_Result(String messageControlId, String patientId, byte[] hl7, Date examDate, Date timeStamp,
//			Attribute attribute) {
//		super();
//		this.messageControlId = messageControlId;
//		this.patientId = patientId;
//		this.hl7 = hl7;
//		this.examDate = examDate;
//		this.timeStamp = timeStamp;
//		this.attribute = attribute;
//	}
//	public String getMessageControlId() {
//		return messageControlId;
//	}
//	public void setMessageControlId(String messageControlId) {
//		this.messageControlId = messageControlId;
//	}
//	public String getPatientId() {
//		return patientId;
//	}
//	public void setPatientId(String patientId) {
//		this.patientId = patientId;
//	}
//	public byte[] getHl7() {
//		return hl7;
//	}
//	public void setHl7(byte[] hl7) {
//		this.hl7 = hl7;
//	}
//	public Date getExamDate() {
//		return examDate;
//	}
//	public void setExamDate(Date examDate) {
//		this.examDate = examDate;
//	}
//	public Date getTimeStamp() {
//		return timeStamp;
//	}
//	public void setTimeStamp(Date timeStamp) {
//		this.timeStamp = timeStamp;
//	}
//	public Attribute getAttribute() {
//		return attribute;
//	}
//	public void setAttribute(Attribute attribute) {
//		this.attribute = attribute;
//	}
//	@Override
//	public String toString() {
//		return "ORU_Result [messageControlId=" + messageControlId + ", patientId=" + patientId + ", hl7="
//				+ Arrays.toString(hl7) + ", examDate=" + examDate + ", timeStamp=" + timeStamp + ", attribute="
//				+ attribute + "]";
//	}
//}
