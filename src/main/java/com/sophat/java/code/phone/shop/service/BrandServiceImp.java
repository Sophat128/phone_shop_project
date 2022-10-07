package com.sophat.java.code.phone.shop.service;

import com.sophat.java.code.phone.shop.model.Brand;
import com.sophat.java.code.phone.shop.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class BrandServiceImp implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand save(Brand brand) {

        return brandRepository.save(brand);
    }


    @Override
    public Brand getBrandById(Integer id) {
        Optional<Brand> brandOptional = brandRepository.findById(id);
        if (brandOptional.isPresent()) {
            return brandOptional.get();
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("Not found for id %d", id));
        }
    }

    @Override
    public Brand updateBrand(Brand brand, Integer id) {
        Brand updateBrand = getBrandById(id);
        updateBrand.setName(brand.getName());
        return brandRepository.save(updateBrand);
    }


    @Override
    public void deleteBrandById(Integer id) {
        Optional<Brand> brandOptional = brandRepository.findById(id);
        if (brandOptional.isPresent()) {
            brandRepository.deleteById(id);
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("Not found for id %d", id));
        }

    }
}
