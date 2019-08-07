
package example.jsonDesserialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "value", "value_classification", "timestamp", "time_until_update" })
public class Datum implements Serializable {

	@JsonProperty("value")
	private String value;
	@JsonProperty("value_classification")
	private String valueClassification;
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("time_until_update")
	private String timeUntilUpdate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 7465694482189873858L;

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	public Datum withValue(String value) {
		this.value = value;
		return this;
	}

	@JsonProperty("value_classification")
	public String getValueClassification() {
		return valueClassification;
	}

	@JsonProperty("value_classification")
	public void setValueClassification(String valueClassification) {
		this.valueClassification = valueClassification;
	}

	public Datum withValueClassification(String valueClassification) {
		this.valueClassification = valueClassification;
		return this;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Datum withTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	@JsonProperty("time_until_update")
	public String getTimeUntilUpdate() {
		return timeUntilUpdate;
	}

	@JsonProperty("time_until_update")
	public void setTimeUntilUpdate(String timeUntilUpdate) {
		this.timeUntilUpdate = timeUntilUpdate;
	}

	public Datum withTimeUntilUpdate(String timeUntilUpdate) {
		this.timeUntilUpdate = timeUntilUpdate;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Datum withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
