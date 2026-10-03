package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateRuleRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")public class CreateRuleRequest {

  private String code;

  private String description;

  private String expression;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  private Integer scoreWeight;

  private Integer priority;

  public CreateRuleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateRuleRequest(String code, String expression, SeverityEnum severity) {
    this.code = code;
    this.expression = expression;
    this.severity = severity;
  }

  public CreateRuleRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @NotNull   @Schema(name = "code", example = "VELOCITY_5_IN_1H", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CreateRuleRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "More than five transactions in one hour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateRuleRequest expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
  */
  @NotNull   @Schema(name = "expression", example = "txnCountLastHour > 5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public CreateRuleRequest severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  @NotNull   @Schema(name = "severity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public CreateRuleRequest scoreWeight(Integer scoreWeight) {
    this.scoreWeight = scoreWeight;
    return this;
  }

  /**
   * Get scoreWeight
   * minimum: 0
   * maximum: 100
   * @return scoreWeight
  */
  @Min(0) @Max(100)   @Schema(name = "scoreWeight", example = "30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoreWeight")
  public Integer getScoreWeight() {
    return scoreWeight;
  }

  public void setScoreWeight(Integer scoreWeight) {
    this.scoreWeight = scoreWeight;
  }

  public CreateRuleRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
    @Schema(name = "priority", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRuleRequest createRuleRequest = (CreateRuleRequest) o;
    return Objects.equals(this.code, createRuleRequest.code) &&
        Objects.equals(this.description, createRuleRequest.description) &&
        Objects.equals(this.expression, createRuleRequest.expression) &&
        Objects.equals(this.severity, createRuleRequest.severity) &&
        Objects.equals(this.scoreWeight, createRuleRequest.scoreWeight) &&
        Objects.equals(this.priority, createRuleRequest.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, expression, severity, scoreWeight, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRuleRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    scoreWeight: ").append(toIndentedString(scoreWeight)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

