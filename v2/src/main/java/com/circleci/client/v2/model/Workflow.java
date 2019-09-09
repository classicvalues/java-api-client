/*
 * CircleCI API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * A workflow
 */
@ApiModel(description = "A workflow")

public class Workflow {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  /**
   * The current status of the workflow.
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    RUNNING("running"),
    
    NOT_RUN("not_run"),
    
    FAILED("failed"),
    
    ERROR("error"),
    
    FAILING("failing"),
    
    ON_HOLD("on_hold"),
    
    CANCELED("canceled"),
    
    UNAUTHORIZED("unauthorized");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private StatusEnum status;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_STOPPED_AT = "stopped_at";
  @JsonProperty(JSON_PROPERTY_STOPPED_AT)
  private OffsetDateTime stoppedAt;

  public static final String JSON_PROPERTY_PIPELINE_ID = "pipeline_id";
  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  private UUID pipelineId;

  public static final String JSON_PROPERTY_PIPELINE_NUMBER = "pipeline_number";
  @JsonProperty(JSON_PROPERTY_PIPELINE_NUMBER)
  private Long pipelineNumber;

  public static final String JSON_PROPERTY_PROJECT_SLUG = "project_slug";
  @JsonProperty(JSON_PROPERTY_PROJECT_SLUG)
  private String projectSlug;

  public Workflow id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the workflow.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the workflow.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Workflow name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow.
   * @return name
  **/
  @ApiModelProperty(example = "build-and-test", required = true, value = "The name of the workflow.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Workflow status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the workflow.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the workflow.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Workflow createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the workflow was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the workflow was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Workflow stoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
    return this;
  }

   /**
   * The date and time the workflow stopped.
   * @return stoppedAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the workflow stopped.")
  public OffsetDateTime getStoppedAt() {
    return stoppedAt;
  }

  public void setStoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
  }

  public Workflow pipelineId(UUID pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

   /**
   * The ID of the pipeline this workflow belongs to.
   * @return pipelineId
  **/
  @ApiModelProperty(required = true, value = "The ID of the pipeline this workflow belongs to.")
  public UUID getPipelineId() {
    return pipelineId;
  }

  public void setPipelineId(UUID pipelineId) {
    this.pipelineId = pipelineId;
  }

  public Workflow pipelineNumber(Long pipelineNumber) {
    this.pipelineNumber = pipelineNumber;
    return this;
  }

   /**
   * The number of the pipeline this workflow belongs to.
   * @return pipelineNumber
  **/
  @ApiModelProperty(required = true, value = "The number of the pipeline this workflow belongs to.")
  public Long getPipelineNumber() {
    return pipelineNumber;
  }

  public void setPipelineNumber(Long pipelineNumber) {
    this.pipelineNumber = pipelineNumber;
  }

  public Workflow projectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * The project-slug for the pipeline this workflow belongs to.
   * @return projectSlug
  **/
  @ApiModelProperty(example = "gh/CircleCI-Public/api-preview-docs", required = true, value = "The project-slug for the pipeline this workflow belongs to.")
  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.name, workflow.name) &&
        Objects.equals(this.status, workflow.status) &&
        Objects.equals(this.createdAt, workflow.createdAt) &&
        Objects.equals(this.stoppedAt, workflow.stoppedAt) &&
        Objects.equals(this.pipelineId, workflow.pipelineId) &&
        Objects.equals(this.pipelineNumber, workflow.pipelineNumber) &&
        Objects.equals(this.projectSlug, workflow.projectSlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, createdAt, stoppedAt, pipelineId, pipelineNumber, projectSlug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    pipelineNumber: ").append(toIndentedString(pipelineNumber)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
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
