package com.sophat.java.code.phone.shop.mapper;

import com.sophat.java.code.phone.shop.dto.BrandDTO;
import com.sophat.java.code.phone.shop.model.Brand;

public class EntityMapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        brand.setName(dto.getName());
        return brand;
    }

    public static BrandDTO brandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());
        return brandDTO;
    }

}
