
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
    "taxableAmount",
    "taxCode",
    "taxValue"
})
public class TaxInformation implements Serializable
{

    @JsonProperty("taxableAmount")
    private int taxableAmount;
    @JsonProperty("taxCode")
    private int taxCode;
    @JsonProperty("taxValue")
    private int taxValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2985977122753136618L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxInformation() {
    }

    /**
     * 
     * @param taxableAmount
     * @param taxValue
     * @param taxCode
     */
    public TaxInformation(int taxableAmount, int taxCode, int taxValue) {
        super();
        this.taxableAmount = taxableAmount;
        this.taxCode = taxCode;
        this.taxValue = taxValue;
    }

    @JsonProperty("taxableAmount")
    public int getTaxableAmount() {
        return taxableAmount;
    }

    @JsonProperty("taxableAmount")
    public void setTaxableAmount(int taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    @JsonProperty("taxCode")
    public int getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(int taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("taxValue")
    public int getTaxValue() {
        return taxValue;
    }

    @JsonProperty("taxValue")
    public void setTaxValue(int taxValue) {
        this.taxValue = taxValue;
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
