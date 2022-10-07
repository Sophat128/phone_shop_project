package com.sophat.java.code.phone.shop.service;

import com.sophat.java.code.phone.shop.dto.BrandDTO;
import com.sophat.java.code.phone.shop.model.Brand;

public class EntityMapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        brand.setName(dto.getName());
        return brand;
    }

}
