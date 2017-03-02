
package com.emnify.tapfilereport.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "localTimeStamp",
    "utcTimeOffset"
})
public class EarliestCallTimeStamp implements Serializable
{

    @JsonProperty("localTimeStamp")
    private String localTimeStamp;
    @JsonProperty("utcTimeOffset")
    private String utcTimeOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2712635565261325511L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EarliestCallTimeStamp() {
    }

    /**
     * 
     * @param utcTimeOffset
     * @param localTimeStamp
     */
    public EarliestCallTimeStamp(String localTimeStamp, String utcTimeOffset) {
        super();
        this.localTimeStamp = localTimeStamp;
        this.utcTimeOffset = utcTimeOffset;
    }

    @JsonProperty("localTimeStamp")
    public String getLocalTimeStamp() {
        return localTimeStamp;
    }

    @JsonProperty("localTimeStamp")
    public void setLocalTimeStamp(String localTimeStamp) {
        this.localTimeStamp = localTimeStamp;
    }

    @JsonProperty("utcTimeOffset")
    public String getUtcTimeOffset() {
        return utcTimeOffset;
    }

    @JsonProperty("utcTimeOffset")
    public void setUtcTimeOffset(String utcTimeOffset) {
        this.utcTimeOffset = utcTimeOffset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
