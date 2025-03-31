package com.prices.application.model;


import lombok.Builder;
import lombok.Data;

/**
 * The type Error data.
 */
@Builder
public class ErrorData {
    private String codResponse;
    private String descResponse;
}