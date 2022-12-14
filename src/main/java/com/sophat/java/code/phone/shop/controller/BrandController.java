package com.sophat.java.code.phone.shop.controller;

import com.sophat.java.code.phone.shop.dto.BrandDTO;
import com.sophat.java.code.phone.shop.mapper.BrandMapper;
import com.sophat.java.code.phone.shop.model.Brand;
import com.sophat.java.code.phone.shop.service.BrandService;
//import com.sophat.java.code.phone.shop.mapper.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping
    public ResponseEntity<Brand> saveBrand(@RequestBody BrandDTO brandDTO) {
//        Brand brand = EntityMapper.toBrand(brandDTO);
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
        return ResponseEntity.ok(brandService.save(brand)
        );
    }

    @GetMapping("/{id}")
    public Brand getBrandById(@PathVariable Integer id){
        return brandService.getBrandById(id);
    }

    @GetMapping
    public List<Brand> ListOfBrands(){
       return brandService.getListOfBrands();
    }

    @PutMapping("/update/{id}")
    public Brand updateBrand(@RequestBody BrandDTO brandDTO, @PathVariable Integer id){
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
//        Brand brand = EntityMapper.toBrand(brandDTO);
        return brandService.updateBrand(brand, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBrandById(@PathVariable Integer id){
        brandService.deleteBrandById(id);
    }

}
