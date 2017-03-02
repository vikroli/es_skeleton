
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
    "charge",
    "chargeType",
    "chargeableUnits",
    "chargedUnits"
})
public class ChargeDetailList implements Serializable
{

    @JsonProperty("charge")
    private int charge;
    @JsonProperty("chargeType")
    private String chargeType;
    @JsonProperty("chargeableUnits")
    private int chargeableUnits;
    @JsonProperty("chargedUnits")
    private int chargedUnits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4814065017471582060L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChargeDetailList() {
    }

    /**
     * 
     * @param charge
     * @param chargedUnits
     * @param chargeableUnits
     * @param chargeType
     */
    public ChargeDetailList(int charge, String chargeType, int chargeableUnits, int chargedUnits) {
        super();
        this.charge = charge;
        this.chargeType = chargeType;
        this.chargeableUnits = chargeableUnits;
        this.chargedUnits = chargedUnits;
    }

    @JsonProperty("charge")
    public int getCharge() {
        return charge;
    }

    @JsonProperty("charge")
    public void setCharge(int charge) {
        this.charge = charge;
    }

    @JsonProperty("chargeType")
    public String getChargeType() {
        return chargeType;
    }

    @JsonProperty("chargeType")
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    @JsonProperty("chargeableUnits")
    public int getChargeableUnits() {
        return chargeableUnits;
    }

    @JsonProperty("chargeableUnits")
    public void setChargeableUnits(int chargeableUnits) {
        this.chargeableUnits = chargeableUnits;
    }

    @JsonProperty("chargedUnits")
    public int getChargedUnits() {
        return chargedUnits;
    }

    @JsonProperty("chargedUnits")
    public void setChargedUnits(int chargedUnits) {
        this.chargedUnits = chargedUnits;
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
