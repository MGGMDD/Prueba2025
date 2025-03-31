package com.prices.domain.model;

import lombok.Data;
import java.io.Serializable;

/**
 * The type Brand.
 */
@Data
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String brandName;
}