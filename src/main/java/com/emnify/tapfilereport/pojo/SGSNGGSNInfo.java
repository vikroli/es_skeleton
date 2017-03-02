
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
    "recEntityType",
    "recEntityCode",
    "recEntityId"
})
public class SGSNGGSNInfo implements Serializable
{

    @JsonProperty("recEntityType")
    private int recEntityType;
    @JsonProperty("recEntityCode")
    private int recEntityCode;
    @JsonProperty("recEntityId")
    private String recEntityId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6077657850942152982L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SGSNGGSNInfo() {
    }

    /**
     * 
     * @param recEntityCode
     * @param recEntityId
     * @param recEntityType
     */
    public SGSNGGSNInfo(int recEntityType, int recEntityCode, String recEntityId) {
        super();
        this.recEntityType = recEntityType;
        this.recEntityCode = recEntityCode;
        this.recEntityId = recEntityId;
    }

    @JsonProperty("recEntityType")
    public int getRecEntityType() {
        return recEntityType;
    }

    @JsonProperty("recEntityType")
    public void setRecEntityType(int recEntityType) {
        this.recEntityType = recEntityType;
    }

    @JsonProperty("recEntityCode")
    public int getRecEntityCode() {
        return recEntityCode;
    }

    @JsonProperty("recEntityCode")
    public void setRecEntityCode(int recEntityCode) {
        this.recEntityCode = recEntityCode;
    }

    @JsonProperty("recEntityId")
    public String getRecEntityId() {
        return recEntityId;
    }

    @JsonProperty("recEntityId")
    public void setRecEntityId(String recEntityId) {
        this.recEntityId = recEntityId;
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
