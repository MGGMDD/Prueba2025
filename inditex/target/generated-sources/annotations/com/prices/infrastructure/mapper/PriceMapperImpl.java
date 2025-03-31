package com.prices.infrastructure.mapper;

import com.prices.domain.model.Brand;
import com.prices.domain.model.Price;
import com.prices.infrastructure.persistence.BrandEntity;
import com.prices.infrastructure.persistence.PriceEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PriceMapperImpl implements PriceMapper {

    @Override
    public PriceEntity toPriceEntity(Price price) {
        if ( price == null ) {
            return null;
        }

        PriceEntity priceEntity = new PriceEntity();

        priceEntity.setId( price.getId() );
        priceEntity.setBrand( brandToBrandEntity( price.getBrand() ) );
        priceEntity.setStartDate( price.getStartDate() );
        priceEntity.setEndDate( price.getEndDate() );
        priceEntity.setProductId( price.getProductId() );
        priceEntity.setPrice( price.getPrice() );
        priceEntity.setPriority( price.getPriority() );
        priceEntity.setCurr( price.getCurr() );

        return priceEntity;
    }

    @Override
    public Price toPrice(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        Price price = new Price();

        price.setId( priceEntity.getId() );
        price.setBrand( brandEntityToBrand( priceEntity.getBrand() ) );
        price.setStartDate( priceEntity.getStartDate() );
        price.setEndDate( priceEntity.getEndDate() );
        price.setProductId( priceEntity.getProductId() );
        price.setPrice( priceEntity.getPrice() );
        price.setPriority( priceEntity.getPriority() );
        price.setCurr( priceEntity.getCurr() );

        return price;
    }

    protected BrandEntity brandToBrandEntity(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setId( brand.getId() );
        brandEntity.setBrandName( brand.getBrandName() );

        return brandEntity;
    }

    protected Brand brandEntityToBrand(BrandEntity brandEntity) {
        if ( brandEntity == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setId( brandEntity.getId() );
        brand.setBrandName( brandEntity.getBrandName() );

        return brand;
    }
}
