
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
    "took",
    "timed_out",
    "_shards",
    "hits"
})
public class TapFileRecord implements Serializable
{

    @JsonProperty("took")
    private int took;
    @JsonProperty("timed_out")
    private boolean timedOut;
    @JsonProperty("_shards")
    private Shards shards;
    @JsonProperty("hits")
    private Hits hits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5113948894238187263L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TapFileRecord() {
    }

    /**
     * 
     * @param hits
     * @param shards
     * @param timedOut
     * @param took
     */
    public TapFileRecord(int took, boolean timedOut, Shards shards, Hits hits) {
        super();
        this.took = took;
        this.timedOut = timedOut;
        this.shards = shards;
        this.hits = hits;
    }

    @JsonProperty("took")
    public int getTook() {
        return took;
    }

    @JsonProperty("took")
    public void setTook(int took) {
        this.took = took;
    }

    @JsonProperty("timed_out")
    public boolean isTimedOut() {
        return timedOut;
    }

    @JsonProperty("timed_out")
    public void setTimedOut(boolean timedOut) {
        this.timedOut = timedOut;
    }

    @JsonProperty("_shards")
    public Shards getShards() {
        return shards;
    }

    @JsonProperty("_shards")
    public void setShards(Shards shards) {
        this.shards = shards;
    }

    @JsonProperty("hits")
    public Hits getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(Hits hits) {
        this.hits = hits;
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
