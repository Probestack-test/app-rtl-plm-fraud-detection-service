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
 * UpdateRuleRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")public class UpdateRuleRequest {

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

  private Boolean enabled;

  public UpdateRuleRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateRuleRequest expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
  */
    @Schema(name = "expression", example = "txnCountLastHour > 8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public UpdateRuleRequest severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
    @Schema(name = "severity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public UpdateRuleRequest scoreWeight(Integer scoreWeight) {
    this.scoreWeight = scoreWeight;
    return this;
  }

  /**
   * Get scoreWeight
   * @return scoreWeight
  */
    @Schema(name = "scoreWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoreWeight")
  public Integer getScoreWeight() {
    return scoreWeight;
  }

  public void setScoreWeight(Integer scoreWeight) {
    this.scoreWeight = scoreWeight;
  }

  public UpdateRuleRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
    @Schema(name = "enabled", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRuleRequest updateRuleRequest = (UpdateRuleRequest) o;
    return Objects.equals(this.description, updateRuleRequest.description) &&
        Objects.equals(this.expression, updateRuleRequest.expression) &&
        Objects.equals(this.severity, updateRuleRequest.severity) &&
        Objects.equals(this.scoreWeight, updateRuleRequest.scoreWeight) &&
        Objects.equals(this.enabled, updateRuleRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expression, severity, scoreWeight, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRuleRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    scoreWeight: ").append(toIndentedString(scoreWeight)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

