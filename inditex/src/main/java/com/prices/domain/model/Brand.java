package com.prices.domain.model;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

/**
 * The type Brand.
 */
@Data
@Builder
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String brandName;
}