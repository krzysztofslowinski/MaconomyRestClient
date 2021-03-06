package com.deltek.integration.maconomy.domain.internal;

import java.util.HashMap;
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
  "card",
  "table"
})
public class CardTablePanes<T, U> {

  @JsonProperty("card")
  private Card<T> card;
  @JsonProperty("table")
  private Table<U> table;
  @JsonIgnore
  private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   *
   * @return
   *     The card
   */
  @JsonProperty("card")
  public Card<T> getCard() {
    return card;
  }

  /**
   *
   * @param card
   *     The card
   */
  @JsonProperty("card")
  public void setCard(final Card<T> card) {
    this.card = card;
  }

  /**
   *
   * @return
   *     The table
   */
  @JsonProperty("table")
  public Table<U> getTable() {
    return table;
  }

  /**
   *
   * @param table
   *     The table
   */
  @JsonProperty("table")
  public void setTable(final Table<U> table) {
    this.table = table;
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
