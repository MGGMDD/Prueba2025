package com.prices.infrastructure.rest.data;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * ResponsePricesInfoDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-31T15:52:25.041216100+02:00[Europe/Madrid]")

public class ResponsePricesInfoDto  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("brandId")
  private Integer brandId;

  @JsonProperty("priceList")
  private Integer priceList;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime startDate;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime endDate;

  @JsonProperty("final_price")
  private Double finalPrice;

  public ResponsePricesInfoDto productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product Code
   * @return productId
  */
  @ApiModelProperty(example = "35466", required = true, value = "Product Code")
  @NotNull


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public ResponsePricesInfoDto brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Brand Code
   * @return brandId
  */
  @ApiModelProperty(example = "1", required = true, value = "Brand Code")
  @NotNull


  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public ResponsePricesInfoDto priceList(Integer priceList) {
    this.priceList = priceList;
    return this;
  }

  /**
   * Price list
   * @return priceList
  */
  @ApiModelProperty(example = "1", required = true, value = "Price list")
  @NotNull


  public Integer getPriceList() {
    return priceList;
  }

  public void setPriceList(Integer priceList) {
    this.priceList = priceList;
  }

  public ResponsePricesInfoDto startDate(java.time.LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.time.LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(java.time.LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public ResponsePricesInfoDto endDate(java.time.LocalDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.time.LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(java.time.LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public ResponsePricesInfoDto finalPrice(Double finalPrice) {
    this.finalPrice = finalPrice;
    return this;
  }

  /**
   * Final price to apply
   * @return finalPrice
  */
  @ApiModelProperty(example = "35.5", value = "Final price to apply")


  public Double getFinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(Double finalPrice) {
    this.finalPrice = finalPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePricesInfoDto responsePricesInfo = (ResponsePricesInfoDto) o;
    return Objects.equals(this.productId, responsePricesInfo.productId) &&
        Objects.equals(this.brandId, responsePricesInfo.brandId) &&
        Objects.equals(this.priceList, responsePricesInfo.priceList) &&
        Objects.equals(this.startDate, responsePricesInfo.startDate) &&
        Objects.equals(this.endDate, responsePricesInfo.endDate) &&
        Objects.equals(this.finalPrice, responsePricesInfo.finalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, brandId, priceList, startDate, endDate, finalPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePricesInfoDto {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    finalPrice: ").append(toIndentedString(finalPrice)).append("\n");
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

