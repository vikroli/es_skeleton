
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
    "callTypeLevel3",
    "callTypeLevel1",
    "callTypeLevel2"
})
public class CallTypeGroup implements Serializable
{

    @JsonProperty("callTypeLevel3")
    private int callTypeLevel3;
    @JsonProperty("callTypeLevel1")
    private int callTypeLevel1;
    @JsonProperty("callTypeLevel2")
    private int callTypeLevel2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1020439581869537810L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CallTypeGroup() {
    }

    /**
     * 
     * @param callTypeLevel3
     * @param callTypeLevel2
     * @param callTypeLevel1
     */
    public CallTypeGroup(int callTypeLevel3, int callTypeLevel1, int callTypeLevel2) {
        super();
        this.callTypeLevel3 = callTypeLevel3;
        this.callTypeLevel1 = callTypeLevel1;
        this.callTypeLevel2 = callTypeLevel2;
    }

    @JsonProperty("callTypeLevel3")
    public int getCallTypeLevel3() {
        return callTypeLevel3;
    }

    @JsonProperty("callTypeLevel3")
    public void setCallTypeLevel3(int callTypeLevel3) {
        this.callTypeLevel3 = callTypeLevel3;
    }

    @JsonProperty("callTypeLevel1")
    public int getCallTypeLevel1() {
        return callTypeLevel1;
    }

    @JsonProperty("callTypeLevel1")
    public void setCallTypeLevel1(int callTypeLevel1) {
        this.callTypeLevel1 = callTypeLevel1;
    }

    @JsonProperty("callTypeLevel2")
    public int getCallTypeLevel2() {
        return callTypeLevel2;
    }

    @JsonProperty("callTypeLevel2")
    public void setCallTypeLevel2(int callTypeLevel2) {
        this.callTypeLevel2 = callTypeLevel2;
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
