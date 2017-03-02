
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
    "taxCode",
    "taxType",
    "taxRate"
})
public class Taxation implements Serializable
{

    @JsonProperty("taxCode")
    private int taxCode;
    @JsonProperty("taxType")
    private String taxType;
    @JsonProperty("taxRate")
    private double taxRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9045034504772589816L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Taxation() {
    }

    /**
     * 
     * @param taxRate
     * @param taxType
     * @param taxCode
     */
    public Taxation(int taxCode, String taxType, double taxRate) {
        super();
        this.taxCode = taxCode;
        this.taxType = taxType;
        this.taxRate = taxRate;
    }

    @JsonProperty("taxCode")
    public int getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(int taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("taxType")
    public String getTaxType() {
        return taxType;
    }

    @JsonProperty("taxType")
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    @JsonProperty("taxRate")
    public double getTaxRate() {
        return taxRate;
    }

    @JsonProperty("taxRate")
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
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
