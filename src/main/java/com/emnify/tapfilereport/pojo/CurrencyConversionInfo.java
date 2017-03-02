
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
    "exchangeRateCode",
    "exchangeRate",
    "numberOfDecimalPlaces"
})
public class CurrencyConversionInfo implements Serializable
{

    @JsonProperty("exchangeRateCode")
    private int exchangeRateCode;
    @JsonProperty("exchangeRate")
    private int exchangeRate;
    @JsonProperty("numberOfDecimalPlaces")
    private int numberOfDecimalPlaces;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9179777210942984534L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrencyConversionInfo() {
    }

    /**
     * 
     * @param exchangeRateCode
     * @param numberOfDecimalPlaces
     * @param exchangeRate
     */
    public CurrencyConversionInfo(int exchangeRateCode, int exchangeRate, int numberOfDecimalPlaces) {
        super();
        this.exchangeRateCode = exchangeRateCode;
        this.exchangeRate = exchangeRate;
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
    }

    @JsonProperty("exchangeRateCode")
    public int getExchangeRateCode() {
        return exchangeRateCode;
    }

    @JsonProperty("exchangeRateCode")
    public void setExchangeRateCode(int exchangeRateCode) {
        this.exchangeRateCode = exchangeRateCode;
    }

    @JsonProperty("exchangeRate")
    public int getExchangeRate() {
        return exchangeRate;
    }

    @JsonProperty("exchangeRate")
    public void setExchangeRate(int exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @JsonProperty("numberOfDecimalPlaces")
    public int getNumberOfDecimalPlaces() {
        return numberOfDecimalPlaces;
    }

    @JsonProperty("numberOfDecimalPlaces")
    public void setNumberOfDecimalPlaces(int numberOfDecimalPlaces) {
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
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
