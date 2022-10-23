package com.sophat.java.code.phone.shop.mapper;

import com.sophat.java.code.phone.shop.dto.BrandDTO;
import com.sophat.java.code.phone.shop.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    Brand toBrand(BrandDTO dto);
    BrandDTO toBrandDTO(Brand brand);
}
