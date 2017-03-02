
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
    "latestCallTimeStamp",
    "totalDiscountValue",
    "callEventDetailsCount",
    "totalTaxValue",
    "earliestCallTimeStamp",
    "totalCharge",
    "operatorSpecInformation"
})
public class AuditControlInfo implements Serializable
{

    @JsonProperty("latestCallTimeStamp")
    private LatestCallTimeStamp latestCallTimeStamp;
    @JsonProperty("totalDiscountValue")
    private int totalDiscountValue;
    @JsonProperty("callEventDetailsCount")
    private int callEventDetailsCount;
    @JsonProperty("totalTaxValue")
    private int totalTaxValue;
    @JsonProperty("earliestCallTimeStamp")
    private EarliestCallTimeStamp earliestCallTimeStamp;
    @JsonProperty("totalCharge")
    private int totalCharge;
    @JsonProperty("operatorSpecInformation")
  private List<String> operatorSpecInformation = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 413811964642315476L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AuditControlInfo() {
    }

    /**
     * 
     * @param totalTaxValue
     * @param totalDiscountValue
     * @param totalCharge
     * @param callEventDetailsCount
     * @param earliestCallTimeStamp
     * @param operatorSpecInformation
     * @param latestCallTimeStamp
     */
  public AuditControlInfo(LatestCallTimeStamp latestCallTimeStamp, int totalDiscountValue,
      int callEventDetailsCount, int totalTaxValue, EarliestCallTimeStamp earliestCallTimeStamp,
      int totalCharge, List<String> operatorSpecInformation) {
        super();
        this.latestCallTimeStamp = latestCallTimeStamp;
        this.totalDiscountValue = totalDiscountValue;
        this.callEventDetailsCount = callEventDetailsCount;
        this.totalTaxValue = totalTaxValue;
        this.earliestCallTimeStamp = earliestCallTimeStamp;
        this.totalCharge = totalCharge;
        this.operatorSpecInformation = operatorSpecInformation;
    }

    @JsonProperty("latestCallTimeStamp")
    public LatestCallTimeStamp getLatestCallTimeStamp() {
        return latestCallTimeStamp;
    }

    @JsonProperty("latestCallTimeStamp")
    public void setLatestCallTimeStamp(LatestCallTimeStamp latestCallTimeStamp) {
        this.latestCallTimeStamp = latestCallTimeStamp;
    }

    @JsonProperty("totalDiscountValue")
    public int getTotalDiscountValue() {
        return totalDiscountValue;
    }

    @JsonProperty("totalDiscountValue")
    public void setTotalDiscountValue(int totalDiscountValue) {
        this.totalDiscountValue = totalDiscountValue;
    }

    @JsonProperty("callEventDetailsCount")
    public int getCallEventDetailsCount() {
        return callEventDetailsCount;
    }

    @JsonProperty("callEventDetailsCount")
    public void setCallEventDetailsCount(int callEventDetailsCount) {
        this.callEventDetailsCount = callEventDetailsCount;
    }

    @JsonProperty("totalTaxValue")
    public int getTotalTaxValue() {
        return totalTaxValue;
    }

    @JsonProperty("totalTaxValue")
    public void setTotalTaxValue(int totalTaxValue) {
        this.totalTaxValue = totalTaxValue;
    }

    @JsonProperty("earliestCallTimeStamp")
    public EarliestCallTimeStamp getEarliestCallTimeStamp() {
        return earliestCallTimeStamp;
    }

    @JsonProperty("earliestCallTimeStamp")
    public void setEarliestCallTimeStamp(EarliestCallTimeStamp earliestCallTimeStamp) {
        this.earliestCallTimeStamp = earliestCallTimeStamp;
    }

    @JsonProperty("totalCharge")
    public int getTotalCharge() {
        return totalCharge;
    }

    @JsonProperty("totalCharge")
    public void setTotalCharge(int totalCharge) {
        this.totalCharge = totalCharge;
    }

    @JsonProperty("operatorSpecInformation")
  public List<String> getOperatorSpecInformation() {
        return operatorSpecInformation;
    }

    @JsonProperty("operatorSpecInformation")
  public void setOperatorSpecInformation(List<String> operatorSpecInformation) {
        this.operatorSpecInformation = operatorSpecInformation;
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
