package com.prices.application.exception;

/**
 * The type Price not found exception.
 */
public class PriceNotFoundException extends RuntimeException {
    /**
     * The constant ERROR_CODE.
     */
    public static final String ERROR_CODE = "001";
    /**
     * The constant serialVersionUID.
     */
    public static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Price not found exception.
     */
    public PriceNotFoundException() {
        super();
    }
}