package com.deltek.integration.maconomy.domain.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
  "meta",
  "records"
})
public class Card<T> {

  @JsonProperty("meta")
  private CardMeta meta;
  @JsonProperty("records")
  private List<RecordImpl> records = new ArrayList<>();
  @JsonIgnore
  private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   *
   * @return
   *     The meta
   */
  @JsonProperty("meta")
  public CardMeta getMeta() {
    return meta;
  }

  /**
   *
   * @param meta
   *     The meta
   */
  @JsonProperty("meta")
  public void setMeta(final CardMeta meta) {
    this.meta = meta;
  }

  /**
   *
   * @return
   *     The records
   */
  @JsonProperty("records")
  public List<RecordImpl> getRecords() {
    return records;
  }

  /**
   *
   * @param records
   *     The records
   */
  @JsonProperty("records")
  public void setRecords(final List<RecordImpl> records) {
    this.records = records;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(final String name, final Object value) {
    this.additionalProperties.put(name, value);
  }

}
