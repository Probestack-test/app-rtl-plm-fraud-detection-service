package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReviewCase
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")public class ReviewCase {

  private UUID id;

  private String transactionId;

  private Integer riskScore;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OPEN("OPEN"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    ESCALATED("ESCALATED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StateEnum state;

  private String assignedTo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime openedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime closedAt;

  public ReviewCase id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid   @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ReviewCase transactionId(String transactionId) {
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

  public ReviewCase riskScore(Integer riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * Get riskScore
   * @return riskScore
  */
    @Schema(name = "riskScore", example = "82", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("riskScore")
  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public ReviewCase state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
    @Schema(name = "state", example = "OPEN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ReviewCase assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Get assignedTo
   * @return assignedTo
  */
  @jakarta.validation.constraints.Email   @Schema(name = "assignedTo", example = "analyst@probestack.io", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedTo")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public ReviewCase openedAt(OffsetDateTime openedAt) {
    this.openedAt = openedAt;
    return this;
  }

  /**
   * Get openedAt
   * @return openedAt
  */
  @Valid   @Schema(name = "openedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openedAt")
  public OffsetDateTime getOpenedAt() {
    return openedAt;
  }

  public void setOpenedAt(OffsetDateTime openedAt) {
    this.openedAt = openedAt;
  }

  public ReviewCase closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

  /**
   * Get closedAt
   * @return closedAt
  */
  @Valid   @Schema(name = "closedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closedAt")
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewCase reviewCase = (ReviewCase) o;
    return Objects.equals(this.id, reviewCase.id) &&
        Objects.equals(this.transactionId, reviewCase.transactionId) &&
        Objects.equals(this.riskScore, reviewCase.riskScore) &&
        Objects.equals(this.state, reviewCase.state) &&
        Objects.equals(this.assignedTo, reviewCase.assignedTo) &&
        Objects.equals(this.openedAt, reviewCase.openedAt) &&
        Objects.equals(this.closedAt, reviewCase.closedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionId, riskScore, state, assignedTo, openedAt, closedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewCase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    openedAt: ").append(toIndentedString(openedAt)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
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

