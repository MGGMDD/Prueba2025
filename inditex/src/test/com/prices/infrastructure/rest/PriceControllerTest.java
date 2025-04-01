package com.prices.infrastructure.rest;

import com.prices.application.usecases.CalculatePriceUseCase;
import com.prices.domain.model.ResponsePricesInfo;
import com.prices.infrastructure.mapper.PriceRestMapper;
import com.prices.infrastructure.rest.data.ResponsePricesInfoDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PriceControllerTest {

    @Mock
    private CalculatePriceUseCase calculatePriceUseCase;

    @Mock
    private PriceRestMapper priceRestMapper;

    @InjectMocks
    private PriceController priceController;

    private ResponsePricesInfo mockResponse;
    private ResponsePricesInfoDto mockResponseDto;

    @BeforeEach
    void setUp() {
        mockResponse = ResponsePricesInfo.builder()
                .productId(35455)
                .brandId(1)
                .priceList(1)
                .startDate(LocalDateTime.of(2020, 6, 14, 0, 0))
                .endDate(LocalDateTime.of(2020, 12, 31, 23, 59))
                .finalPrice(35.50)
                .build();

        mockResponseDto = new ResponsePricesInfoDto();
        mockResponseDto.setProductId(35455);
        mockResponseDto.setBrandId(1);
        mockResponseDto.setPriceList(2);
        mockResponseDto.setStartDate(LocalDateTime.of(2020, 6, 14, 10, 0));
        mockResponseDto.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59));
        mockResponseDto.setFinalPrice(35.50);
    }

    @Test
    void test_pricesInfo_1() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 10, 0);
        when(calculatePriceUseCase.callToPricesInfo(date, 35455, 1)).thenReturn(mockResponse);
        when(priceRestMapper.toResponsePricesInfoDto(mockResponse)).thenReturn(mockResponseDto);

        ResponseEntity<ResponsePricesInfoDto> response = priceController._pricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getBody().getFinalPrice());
    }

    @Test
    void test_pricesInfo_2() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 16, 0);
        when(calculatePriceUseCase.callToPricesInfo(date, 35455, 1)).thenReturn(mockResponse);
        when(priceRestMapper.toResponsePricesInfoDto(mockResponse)).thenReturn(mockResponseDto);

        ResponseEntity<ResponsePricesInfoDto> response = priceController._pricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getBody().getFinalPrice());
    }

    @Test
    void test_pricesInfo_3() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 21, 0);
        when(calculatePriceUseCase.callToPricesInfo(date, 35455, 1)).thenReturn(mockResponse);
        when(priceRestMapper.toResponsePricesInfoDto(mockResponse)).thenReturn(mockResponseDto);

        ResponseEntity<ResponsePricesInfoDto> response = priceController._pricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getBody().getFinalPrice());
    }

    @Test
    void test_pricesInfo_4() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 15, 10, 0);
        when(calculatePriceUseCase.callToPricesInfo(date, 35455, 1)).thenReturn(mockResponse);
        when(priceRestMapper.toResponsePricesInfoDto(mockResponse)).thenReturn(mockResponseDto);

        ResponseEntity<ResponsePricesInfoDto> response = priceController._pricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getBody().getFinalPrice());
    }

    @Test
    void test_pricesInfo_5() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 16, 21, 0);
        when(calculatePriceUseCase.callToPricesInfo(date, 35455, 1)).thenReturn(mockResponse);
        when(priceRestMapper.toResponsePricesInfoDto(mockResponse)).thenReturn(mockResponseDto);

        ResponseEntity<ResponsePricesInfoDto> response = priceController._pricesInfo(date, 35455, 1);

        assertNotNull(response);
        assertEquals(35.50, response.getBody().getFinalPrice());
    }
}
