package com.prices.infrastructure.mapper;

import com.prices.domain.model.ResponsePricesInfo;
import com.prices.infrastructure.rest.data.ResponsePricesInfoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PriceRestMapperImpl implements PriceRestMapper {

    @Override
    public ResponsePricesInfoDto toResponsePricesInfoDto(ResponsePricesInfo responsePricesInfo) {
        if ( responsePricesInfo == null ) {
            return null;
        }

        ResponsePricesInfoDto responsePricesInfoDto = new ResponsePricesInfoDto();

        responsePricesInfoDto.setProductId( responsePricesInfo.getProductId() );
        responsePricesInfoDto.setBrandId( responsePricesInfo.getBrandId() );
        responsePricesInfoDto.setPriceList( responsePricesInfo.getPriceList() );
        responsePricesInfoDto.setStartDate( responsePricesInfo.getStartDate() );
        responsePricesInfoDto.setEndDate( responsePricesInfo.getEndDate() );
        responsePricesInfoDto.setFinalPrice( responsePricesInfo.getFinalPrice() );

        return responsePricesInfoDto;
    }
}
