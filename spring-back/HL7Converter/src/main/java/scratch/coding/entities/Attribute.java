//package scratch.coding.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@Table(name="ATTRIBUTE")
//@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class Attribute {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="ATTRIBUTE_ID")
//	private Long id;
//	@Column(name="ATTRIBUTE_NAME")
//	private String attributeName;
//	@Column(name="ATTRIBUTE_VALUE")
//	private String value;
//	public Attribute() {
//		super();
//	}
//	public Attribute( String attributeName, String value) {
//		super();
//		this.attributeName = attributeName;
//		this.value = value;
//	}
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getAttributeName() {
//		return attributeName;
//	}
//	public void setAttributeName(String attributeName) {
//		this.attributeName = attributeName;
//	}
//	public String getValue() {
//		return value;
//	}
//	public void setValue(String value) {
//		this.value = value;
//	}
//	@Override
//	public String toString() {
//		return "Attribute [id=" + id + ", attributeName=" + attributeName + ", value=" + value + "]";
//	}
//}
