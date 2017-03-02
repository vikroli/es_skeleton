
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
    "utcTimeOffset",
    "utcTimeOffsetCode"
})
public class UTCTimeOffsetInfo implements Serializable
{

    @JsonProperty("utcTimeOffset")
    private String utcTimeOffset;
    @JsonProperty("utcTimeOffsetCode")
    private int utcTimeOffsetCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1297299437227777737L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UTCTimeOffsetInfo() {
    }

    /**
     * 
     * @param utcTimeOffsetCode
     * @param utcTimeOffset
     */
    public UTCTimeOffsetInfo(String utcTimeOffset, int utcTimeOffsetCode) {
        super();
        this.utcTimeOffset = utcTimeOffset;
        this.utcTimeOffsetCode = utcTimeOffsetCode;
    }

    @JsonProperty("utcTimeOffset")
    public String getUtcTimeOffset() {
        return utcTimeOffset;
    }

    @JsonProperty("utcTimeOffset")
    public void setUtcTimeOffset(String utcTimeOffset) {
        this.utcTimeOffset = utcTimeOffset;
    }

    @JsonProperty("utcTimeOffsetCode")
    public int getUtcTimeOffsetCode() {
        return utcTimeOffsetCode;
    }

    @JsonProperty("utcTimeOffsetCode")
    public void setUtcTimeOffsetCode(int utcTimeOffsetCode) {
        this.utcTimeOffsetCode = utcTimeOffsetCode;
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
