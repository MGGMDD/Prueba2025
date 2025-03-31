package com.prices.domain.service;

import com.prices.application.usecases.CalculatePriceUseCase;
import com.prices.domain.model.Price;
import com.prices.domain.model.ResponsePricesInfo;
import com.prices.domain.ports.PricesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * The type Calculate price service.
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class CalculatePriceService implements CalculatePriceUseCase {
    private PricesRepository pricesRepository;

    @Override
    public ResponsePricesInfo callToPricesInfo(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        Price price = pricesRepository.findPriceByDate(applicationDate, productId, brandId);
        return ResponsePricesInfo.builder()
                .priceList(price.getId())
                .finalPrice(price.getPrice())
                .brandId(price.getBrand().getId())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .productId(price.getProductId()).build();
    }

}
