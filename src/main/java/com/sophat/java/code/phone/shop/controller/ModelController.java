package com.sophat.java.code.phone.shop.controller;

import com.sophat.java.code.phone.shop.dto.ModelDTO;
import com.sophat.java.code.phone.shop.mapper.ModelMapper;
import com.sophat.java.code.phone.shop.model.Model;
import com.sophat.java.code.phone.shop.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/models")
@RequiredArgsConstructor
public class ModelController {
    private final ModelService modelService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ModelDTO modelDTO) {
        Model model = modelService.save(modelDTO);
        ModelDTO dto = ModelMapper.INSTANCE.toDTO(model);
        return ResponseEntity.ok(dto);
    }
}
