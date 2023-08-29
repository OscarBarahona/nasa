package com.nasa.prueba.aspirante.dominio.mapper;

import com.nasa.prueba.aspirante.dominio.dto.apolo.ResponseApoloDTO;
import com.nasa.prueba.aspirante.dominio.entities.ApoloEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ApoloMapper {
    ApoloMapper INSTANCE = Mappers.getMapper(ApoloMapper.class);

    @Mapping(target = "id", source = "id")
    List<ResponseApoloDTO> mapToDto(List<ApoloEntity> entity);
}
