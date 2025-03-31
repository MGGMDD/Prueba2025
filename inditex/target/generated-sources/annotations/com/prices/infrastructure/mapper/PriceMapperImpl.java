package com.prices.infrastructure.mapper;

import com.prices.domain.model.Brand;
import com.prices.domain.model.Brand.BrandBuilder;
import com.prices.domain.model.Price;
import com.prices.domain.model.Price.PriceBuilder;
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

        PriceBuilder price = Price.builder();

        price.id( priceEntity.getId() );
        price.brand( brandEntityToBrand( priceEntity.getBrand() ) );
        price.startDate( priceEntity.getStartDate() );
        price.endDate( priceEntity.getEndDate() );
        price.productId( priceEntity.getProductId() );
        price.price( priceEntity.getPrice() );
        price.priority( priceEntity.getPriority() );
        price.curr( priceEntity.getCurr() );

        return price.build();
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

        BrandBuilder brand = Brand.builder();

        brand.id( brandEntity.getId() );
        brand.brandName( brandEntity.getBrandName() );

        return brand.build();
    }
}
