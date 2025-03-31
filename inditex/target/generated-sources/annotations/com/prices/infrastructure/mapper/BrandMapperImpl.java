package com.prices.infrastructure.mapper;

import com.prices.domain.model.Brand;
import com.prices.domain.model.Brand.BrandBuilder;
import com.prices.infrastructure.persistence.BrandEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BrandMapperImpl implements BrandMapper {

    @Override
    public BrandEntity toBrandEntity(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setId( brand.getId() );
        brandEntity.setBrandName( brand.getBrandName() );

        return brandEntity;
    }

    @Override
    public Brand toBrand(BrandEntity brandEntity) {
        if ( brandEntity == null ) {
            return null;
        }

        BrandBuilder brand = Brand.builder();

        brand.id( brandEntity.getId() );
        brand.brandName( brandEntity.getBrandName() );

        return brand.build();
    }
}
