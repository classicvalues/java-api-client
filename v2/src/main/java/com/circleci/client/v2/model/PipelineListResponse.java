/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2. API v2 is currently in Preview. Additional documentation for this API can be found in the [API Preview Docs](https://github.com/CircleCI-Public/api-preview-docs/tree/master/docs). Breaking changes to the API will be announced in the [Breaking Changes log](https://github.com/CircleCI-Public/api-preview-docs/blob/master/docs/breaking.md).
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.client.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.circleci.client.v2.model.Pipeline;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * List of pipelines
 */
@ApiModel(description = "List of pipelines")

public class PipelineListResponse {
  public static final String JSON_PROPERTY_ITEMS = "items";
  @JsonProperty(JSON_PROPERTY_ITEMS)
  private List<Pipeline> items = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public PipelineListResponse items(List<Pipeline> items) {
    this.items = items;
    return this;
  }

  public PipelineListResponse addItemsItem(Pipeline itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Pipeline> getItems() {
    return items;
  }

  public void setItems(List<Pipeline> items) {
    this.items = items;
  }

  public PipelineListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * A token to pass as a &#x60;page-token&#x60; query parameter to return the next page of results.
   * @return nextPageToken
  **/
  @ApiModelProperty(required = true, value = "A token to pass as a `page-token` query parameter to return the next page of results.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineListResponse pipelineListResponse = (PipelineListResponse) o;
    return Objects.equals(this.items, pipelineListResponse.items) &&
        Objects.equals(this.nextPageToken, pipelineListResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineListResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

