package scratch.coding.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown= true)
public class OrderNumberEI implements Serializable {
	@JsonProperty("application")
	private AuthorityAndFacility application;
	@JsonProperty("entityIdentifier")
	private String entityIdentifier;
	public OrderNumberEI(AuthorityAndFacility application, String entityIdentifier) {
		super();
		this.application = application;
		this.entityIdentifier = entityIdentifier;
	}
	public OrderNumberEI() {
		super();
	}
	@JsonProperty("application")
	public AuthorityAndFacility getApplication() {
		return application;
	}
	@JsonProperty("application")
	public void setApplication(AuthorityAndFacility application) {
		this.application = application;
	}
	@JsonProperty("entityIdentifier")
	public String getEntityIdentifier() {
		return entityIdentifier;
	}
	@JsonProperty("entityIdentifier")
	public void setEntityIdentifier(String entityIdentifier) {
		this.entityIdentifier = entityIdentifier;
	}
	@Override
	public String toString() {
		return "OrderNumberEI [application=" + application + ", entityIdentifier=" + entityIdentifier + "]";
	}
}
