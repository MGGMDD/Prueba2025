package com.prices.domain.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * The type Response prices info.
 */
@Builder
public class ResponsePricesInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer productId;
    private Integer brandId;
    private Integer priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double finalPrice;
}