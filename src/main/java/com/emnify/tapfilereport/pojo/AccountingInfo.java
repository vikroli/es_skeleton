
package com.emnify.tapfilereport.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "taxation",
    "tapDecimalPlaces",
    "localCurrency",
    "currencyConversionInfo"
})
public class AccountingInfo implements Serializable
{

    @JsonProperty("taxation")
    private List<Taxation> taxation = null;
    @JsonProperty("tapDecimalPlaces")
    private int tapDecimalPlaces;
    @JsonProperty("localCurrency")
    private String localCurrency;
    @JsonProperty("currencyConversionInfo")
    private List<CurrencyConversionInfo_> currencyConversionInfo = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7342693152914547161L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccountingInfo() {
    }

    /**
     * 
     * @param taxation
     * @param localCurrency
     * @param currencyConversionInfo
     * @param tapDecimalPlaces
     */
    public AccountingInfo(List<Taxation> taxation, int tapDecimalPlaces, String localCurrency, List<CurrencyConversionInfo_> currencyConversionInfo) {
        super();
        this.taxation = taxation;
        this.tapDecimalPlaces = tapDecimalPlaces;
        this.localCurrency = localCurrency;
        this.currencyConversionInfo = currencyConversionInfo;
    }

    @JsonProperty("taxation")
    public List<Taxation> getTaxation() {
        return taxation;
    }

    @JsonProperty("taxation")
    public void setTaxation(List<Taxation> taxation) {
        this.taxation = taxation;
    }

    @JsonProperty("tapDecimalPlaces")
    public int getTapDecimalPlaces() {
        return tapDecimalPlaces;
    }

    @JsonProperty("tapDecimalPlaces")
    public void setTapDecimalPlaces(int tapDecimalPlaces) {
        this.tapDecimalPlaces = tapDecimalPlaces;
    }

    @JsonProperty("localCurrency")
    public String getLocalCurrency() {
        return localCurrency;
    }

    @JsonProperty("localCurrency")
    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency;
    }

    @JsonProperty("currencyConversionInfo")
    public List<CurrencyConversionInfo_> getCurrencyConversionInfo() {
        return currencyConversionInfo;
    }

    @JsonProperty("currencyConversionInfo")
    public void setCurrencyConversionInfo(List<CurrencyConversionInfo_> currencyConversionInfo) {
        this.currencyConversionInfo = currencyConversionInfo;
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
