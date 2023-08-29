package com.nasa.prueba.aspirante.dominio.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nasa.prueba.aspirante.dominio.dto.ResponseDataModel;
import com.nasa.prueba.aspirante.dominio.dto.apolo.ResponseApoloDTO;
import com.nasa.prueba.aspirante.dominio.entities.ApoloEntity;
import com.nasa.prueba.aspirante.dominio.mapper.ApoloMapper;
import com.nasa.prueba.aspirante.dominio.repository.ApoloRepository;
import com.nasa.prueba.aspirante.dominio.service.IApolo;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ApoloServiceImpl implements IApolo {

    @Autowired
    private ApoloRepository repository;

    @SneakyThrows
    @Override
    public ResponseDataModel<ResponseApoloDTO> getInfoDB() {
        ResponseDataModel<ResponseApoloDTO> response = new ResponseDataModel<>();
        List<ApoloEntity> entity = repository.findAll(Sort.by(Sort.Direction.DESC,"id"));

        log.info("entity es {}", new ObjectMapper().writeValueAsString(entity));

        List<ResponseApoloDTO> dto = ApoloMapper.INSTANCE.mapToDto(entity);
        response.setData(dto);
        response.setError(null);
        return response;
    }
}
