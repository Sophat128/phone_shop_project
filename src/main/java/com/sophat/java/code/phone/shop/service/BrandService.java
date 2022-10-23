package com.sophat.java.code.phone.shop.service;

import com.sophat.java.code.phone.shop.model.Brand;

import java.util.List;

public interface BrandService {
    Brand save(Brand brand);
    Brand getBrandById(Integer id);
    List<Brand> getListOfBrands();
    Brand updateBrand(Brand brand, Integer id);
    void deleteBrandById(Integer id);
}
