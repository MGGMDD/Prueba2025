package com.prices.infrastructure.rest;

import com.prices.application.usecases.CalculatePriceUseCase;
import com.prices.domain.model.ResponsePricesInfo;
import com.prices.infrastructure.mapper.PriceRestMapper;
import com.prices.infrastructure.rest.data.ResponsePricesInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * The type Price controller.
 */
@RestController
@RequiredArgsConstructor
public class PriceController  implements PricesApi {
    private  CalculatePriceUseCase calculatePriceUseCase;
    private  PriceRestMapper priceRestMapper;

    @Override
    public ResponseEntity<ResponsePricesInfoDto> _pricesInfo(LocalDateTime applicationDate, Integer productId, Integer brandId) {
        ResponsePricesInfo response = calculatePriceUseCase.callToPricesInfo(applicationDate, productId, brandId);
        return ResponseEntity.ok().body(priceRestMapper.toResponsePricesInfoDto(response));
    }
}
