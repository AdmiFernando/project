package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Authorization implements Serializable {
	@JsonProperty("AuthorizationNumber")
	private String AuthorizationNumber;
	@JsonProperty("date")
	private DateAndTime date;
	@JsonProperty("source")
	private String source;
	public Authorization(String authorizationNumber, DateAndTime date, String source) {
		super();
		AuthorizationNumber = authorizationNumber;
		this.date = date;
		this.source = source;
	}
	public Authorization() {
		super();
	}
	@JsonProperty("AuthorizationNumber")
	public String getAuthorizationNumber() {
		return AuthorizationNumber;
	}
	@JsonProperty("AuthorizationNumber")
	public void setAuthorizationNumber(String authorizationNumber) {
		AuthorizationNumber = authorizationNumber;
	}
	@JsonProperty("date")
	public DateAndTime getDate() {
		return date;
	}
	@JsonProperty("date")
	public void setDate(DateAndTime date) {
		this.date = date;
	}
	@JsonProperty("source")
	public String getSource() {
		return source;
	}
	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "Authorization [AuthorizationNumber=" + AuthorizationNumber + ", date=" + date + ", source=" + source
				+ "]";
	}
}
