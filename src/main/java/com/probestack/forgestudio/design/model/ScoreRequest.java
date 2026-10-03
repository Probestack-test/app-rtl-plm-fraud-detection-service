package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScoreRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")public class ScoreRequest {

  private String transactionId;

  private UUID customerId;

  private Double amount;

  private String currency;

  private String ipAddress;

  private String deviceFingerprint;

  private String billingCountry;

  private String shippingCountry;

  public ScoreRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScoreRequest(String transactionId, Double amount, String currency) {
    this.transactionId = transactionId;
    this.amount = amount;
    this.currency = currency;
  }

  public ScoreRequest transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  @NotNull   @Schema(name = "transactionId", example = "TXN-2026-99182", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public ScoreRequest customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @Valid   @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public ScoreRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull   @Schema(name = "amount", example = "1899.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ScoreRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull   @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ScoreRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
  */
    @Schema(name = "ipAddress", example = "203.0.113.42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public ScoreRequest deviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

  /**
   * Get deviceFingerprint
   * @return deviceFingerprint
  */
    @Schema(name = "deviceFingerprint", example = "df_8a7b6c5d", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceFingerprint")
  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }

  public void setDeviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }

  public ScoreRequest billingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
    return this;
  }

  /**
   * Get billingCountry
   * @return billingCountry
  */
    @Schema(name = "billingCountry", example = "US", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billingCountry")
  public String getBillingCountry() {
    return billingCountry;
  }

  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }

  public ScoreRequest shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

  /**
   * Get shippingCountry
   * @return shippingCountry
  */
    @Schema(name = "shippingCountry", example = "NG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingCountry")
  public String getShippingCountry() {
    return shippingCountry;
  }

  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreRequest scoreRequest = (ScoreRequest) o;
    return Objects.equals(this.transactionId, scoreRequest.transactionId) &&
        Objects.equals(this.customerId, scoreRequest.customerId) &&
        Objects.equals(this.amount, scoreRequest.amount) &&
        Objects.equals(this.currency, scoreRequest.currency) &&
        Objects.equals(this.ipAddress, scoreRequest.ipAddress) &&
        Objects.equals(this.deviceFingerprint, scoreRequest.deviceFingerprint) &&
        Objects.equals(this.billingCountry, scoreRequest.billingCountry) &&
        Objects.equals(this.shippingCountry, scoreRequest.shippingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, customerId, amount, currency, ipAddress, deviceFingerprint, billingCountry, shippingCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreRequest {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    billingCountry: ").append(toIndentedString(billingCountry)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
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

