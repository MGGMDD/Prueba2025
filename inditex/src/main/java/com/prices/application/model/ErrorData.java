package com.prices.application.model;


import lombok.Builder;
import lombok.Data;

/**
 * The type Error data.
 */
@Data
@Builder
public class ErrorData {
    private String codResponse;
    private String descResponse;
}