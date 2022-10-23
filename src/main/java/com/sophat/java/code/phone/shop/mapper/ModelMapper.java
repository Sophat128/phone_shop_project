package com.sophat.java.code.phone.shop.mapper;

import com.sophat.java.code.phone.shop.dto.ModelDTO;
import com.sophat.java.code.phone.shop.model.Model;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);
    Model toModel(ModelDTO dto);
    ModelDTO toDTO(Model model);
}
