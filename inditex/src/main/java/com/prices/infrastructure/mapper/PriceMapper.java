package com.prices.infrastructure.mapper;


import com.prices.domain.model.Price;
import com.prices.infrastructure.persistence.PriceEntity;
import org.mapstruct.Mapper;

/**
 * The interface Price mapper.
 */
@Mapper
public interface PriceMapper {
    /**
     * To price entity price entity.
     *
     * @param price the price
     * @return the price entity
     */
    PriceEntity toPriceEntity(Price price);

    /**
     * To price price.
     *
     * @param priceEntity the price entity
     * @return the price
     */
    Price toPrice(PriceEntity priceEntity);
}