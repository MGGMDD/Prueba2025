package com.prices.infrastructure.adapter;

import com.prices.domain.model.Price;
import com.prices.domain.ports.PricesRepository;
import com.prices.infrastructure.mapper.PriceMapper;
import com.prices.application.exception.PriceNotFoundException;
import com.prices.infrastructure.respository.PriceJpaRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * The type Prices repository adapter.
 */
@Component
public class PricesRepositoryAdapter implements PricesRepository {
    private final PriceJpaRepository priceJpaRepository;
    private final PriceMapper priceMapper;

    /**
     * Instantiates a new Prices repository adapter.
     *
     * @param priceJpaRepository the price jpa repository
     * @param priceMapper        the price mapper
     */
    public PricesRepositoryAdapter(PriceJpaRepository priceJpaRepository, PriceMapper priceMapper) {
        this.priceJpaRepository = priceJpaRepository;
        this.priceMapper = priceMapper;
    }

    @Override
    public Price findPriceByDate(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        return priceJpaRepository.findHighestPriorityPrice(applicationDate, productId, brandId)
                .map(priceMapper::toPrice)
                .orElseThrow(PriceNotFoundException::new);
    }
}
