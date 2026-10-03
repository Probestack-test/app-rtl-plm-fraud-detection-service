package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScoreResponse
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")public class ScoreResponse {

  private String transactionId;

  private Integer riskScore;

  /**
   * Gets or Sets recommendation
   */
  public enum RecommendationEnum {
    ALLOW("ALLOW"),
    
    REVIEW("REVIEW"),
    
    BLOCK("BLOCK");

    private String value;

    RecommendationEnum(String value) {
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
    public static RecommendationEnum fromValue(String value) {
      for (RecommendationEnum b : RecommendationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RecommendationEnum recommendation;

  @Valid
  private List<String> triggeredRules;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedAt;

  public ScoreResponse transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
    @Schema(name = "transactionId", example = "TXN-2026-99182", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public ScoreResponse riskScore(Integer riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * Get riskScore
   * minimum: 0
   * maximum: 100
   * @return riskScore
  */
  @Min(0) @Max(100)   @Schema(name = "riskScore", example = "82", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("riskScore")
  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public ScoreResponse recommendation(RecommendationEnum recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  /**
   * Get recommendation
   * @return recommendation
  */
    @Schema(name = "recommendation", example = "REVIEW", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendation")
  public RecommendationEnum getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(RecommendationEnum recommendation) {
    this.recommendation = recommendation;
  }

  public ScoreResponse triggeredRules(List<String> triggeredRules) {
    this.triggeredRules = triggeredRules;
    return this;
  }

  public ScoreResponse addTriggeredRulesItem(String triggeredRulesItem) {
    if (this.triggeredRules == null) {
      this.triggeredRules = new ArrayList<>();
    }
    this.triggeredRules.add(triggeredRulesItem);
    return this;
  }

  /**
   * Get triggeredRules
   * @return triggeredRules
  */
    @Schema(name = "triggeredRules", example = "[\"GEO_MISMATCH\",\"HIGH_VALUE_NEW_CUSTOMER\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggeredRules")
  public List<String> getTriggeredRules() {
    return triggeredRules;
  }

  public void setTriggeredRules(List<String> triggeredRules) {
    this.triggeredRules = triggeredRules;
  }

  public ScoreResponse evaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
    return this;
  }

  /**
   * Get evaluatedAt
   * @return evaluatedAt
  */
  @Valid   @Schema(name = "evaluatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluatedAt")
  public OffsetDateTime getEvaluatedAt() {
    return evaluatedAt;
  }

  public void setEvaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreResponse scoreResponse = (ScoreResponse) o;
    return Objects.equals(this.transactionId, scoreResponse.transactionId) &&
        Objects.equals(this.riskScore, scoreResponse.riskScore) &&
        Objects.equals(this.recommendation, scoreResponse.recommendation) &&
        Objects.equals(this.triggeredRules, scoreResponse.triggeredRules) &&
        Objects.equals(this.evaluatedAt, scoreResponse.evaluatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, riskScore, recommendation, triggeredRules, evaluatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreResponse {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    triggeredRules: ").append(toIndentedString(triggeredRules)).append("\n");
    sb.append("    evaluatedAt: ").append(toIndentedString(evaluatedAt)).append("\n");
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

