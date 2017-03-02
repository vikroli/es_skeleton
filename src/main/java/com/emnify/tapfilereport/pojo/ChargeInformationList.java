
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
    "callTypeGroup",
    "exchangeRateCode",
    "chargedItem",
    "taxInformation",
    "chargeDetailList"
})
public class ChargeInformationList implements Serializable
{

    @JsonProperty("callTypeGroup")
    private CallTypeGroup callTypeGroup;
    @JsonProperty("exchangeRateCode")
    private int exchangeRateCode;
    @JsonProperty("chargedItem")
    private String chargedItem;
    @JsonProperty("taxInformation")
    private List<TaxInformation> taxInformation = null;
    @JsonProperty("chargeDetailList")
    private List<ChargeDetailList> chargeDetailList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -576557431943039368L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChargeInformationList() {
    }

    /**
     * 
     * @param exchangeRateCode
     * @param taxInformation
     * @param chargedItem
     * @param callTypeGroup
     * @param chargeDetailList
     */
    public ChargeInformationList(CallTypeGroup callTypeGroup, int exchangeRateCode, String chargedItem, List<TaxInformation> taxInformation, List<ChargeDetailList> chargeDetailList) {
        super();
        this.callTypeGroup = callTypeGroup;
        this.exchangeRateCode = exchangeRateCode;
        this.chargedItem = chargedItem;
        this.taxInformation = taxInformation;
        this.chargeDetailList = chargeDetailList;
    }

    @JsonProperty("callTypeGroup")
    public CallTypeGroup getCallTypeGroup() {
        return callTypeGroup;
    }

    @JsonProperty("callTypeGroup")
    public void setCallTypeGroup(CallTypeGroup callTypeGroup) {
        this.callTypeGroup = callTypeGroup;
    }

    @JsonProperty("exchangeRateCode")
    public int getExchangeRateCode() {
        return exchangeRateCode;
    }

    @JsonProperty("exchangeRateCode")
    public void setExchangeRateCode(int exchangeRateCode) {
        this.exchangeRateCode = exchangeRateCode;
    }

    @JsonProperty("chargedItem")
    public String getChargedItem() {
        return chargedItem;
    }

    @JsonProperty("chargedItem")
    public void setChargedItem(String chargedItem) {
        this.chargedItem = chargedItem;
    }

    @JsonProperty("taxInformation")
    public List<TaxInformation> getTaxInformation() {
        return taxInformation;
    }

    @JsonProperty("taxInformation")
    public void setTaxInformation(List<TaxInformation> taxInformation) {
        this.taxInformation = taxInformation;
    }

    @JsonProperty("chargeDetailList")
    public List<ChargeDetailList> getChargeDetailList() {
        return chargeDetailList;
    }

    @JsonProperty("chargeDetailList")
    public void setChargeDetailList(List<ChargeDetailList> chargeDetailList) {
        this.chargeDetailList = chargeDetailList;
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
