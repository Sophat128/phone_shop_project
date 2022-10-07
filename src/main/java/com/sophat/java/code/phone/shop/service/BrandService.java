package com.sophat.java.code.phone.shop.service;

import com.sophat.java.code.phone.shop.model.Brand;

public interface BrandService {
    Brand save(Brand brand);
    Brand getBrandById(Integer id);
    Brand updateBrand(Brand brand, Integer id);
    void deleteBrandById(Integer id);
}
