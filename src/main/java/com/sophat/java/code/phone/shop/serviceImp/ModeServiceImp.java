package com.sophat.java.code.phone.shop.serviceImp;

import com.sophat.java.code.phone.shop.dto.ModelDTO;
import com.sophat.java.code.phone.shop.mapper.ModelMapper;
import com.sophat.java.code.phone.shop.model.Brand;
import com.sophat.java.code.phone.shop.model.Model;
import com.sophat.java.code.phone.shop.repository.ModelRepository;
import com.sophat.java.code.phone.shop.service.BrandService;
import com.sophat.java.code.phone.shop.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModeServiceImp implements ModelService {
    private final ModelRepository modelRepository;
    private final BrandService brandService;
    @Override
    public Model save(ModelDTO dto) {
        Integer brandId = dto.getBrandDTO().getId();
        Brand brand = brandService.getBrandById(brandId);

        Model model = ModelMapper.INSTANCE.toModel(dto);
        return modelRepository.save(model);
    }
}
