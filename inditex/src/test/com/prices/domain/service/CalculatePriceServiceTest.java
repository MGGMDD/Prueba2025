package com.prices.domain.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.prices.domain.model.Brand;
import com.prices.domain.model.Price;
import com.prices.domain.model.ResponsePricesInfo;
import com.prices.domain.ports.PricesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
class CalculatePriceServiceTest {

    @Mock
    private PricesRepository pricesRepository;

    @InjectMocks
    private CalculatePriceService calculatePriceService;

    private Price mockPrice;

    @BeforeEach
    void setUp() {
        mockPrice = Price.builder()
                .id(1)
                .brand(Brand.builder().id(1).brandName("Zara").build())
                .startDate(LocalDateTime.of(2020, 6, 14, 0, 0))
                .endDate(LocalDateTime.of(2020, 12, 31, 23, 59))
                .priority(1)
                .productId(35455)
                .priority(0)
                .price(35.50)
                .curr("EUR")
                .build();
    }
    @Test
    void test_callToPricesInfo_1() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 10, 0);
        when(pricesRepository.findPriceByDate(date, 35455, 1)).thenReturn(mockPrice);

        ResponsePricesInfo response = calculatePriceService.callToPricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35455, response.getProductId());
        assertEquals(1, response.getBrandId());
        assertEquals(35.50, response.getFinalPrice());
    }

    @Test
    void test_callToPricesInfo_2() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 16, 0);
        when(pricesRepository.findPriceByDate(date, 35455, 1)).thenReturn(mockPrice);

        ResponsePricesInfo response = calculatePriceService.callToPricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getFinalPrice());
    }

    @Test
    void test_callToPricesInfo_3() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 21, 0);
        when(pricesRepository.findPriceByDate(date, 35455, 1)).thenReturn(mockPrice);

        ResponsePricesInfo response = calculatePriceService.callToPricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getFinalPrice());
    }

    @Test
    void test_callToPricesInfo_4() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 15, 10, 0);
        when(pricesRepository.findPriceByDate(date, 35455, 1)).thenReturn(mockPrice);

        ResponsePricesInfo response = calculatePriceService.callToPricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getFinalPrice());
    }

    @Test
    void test_callToPricesInfo_5() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 16, 21, 0);
        when(pricesRepository.findPriceByDate(date, 35455, 1)).thenReturn(mockPrice);

        ResponsePricesInfo response = calculatePriceService.callToPricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getFinalPrice());
    }
}