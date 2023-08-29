package com.nasa.prueba.aspirante.infraestructura.clientrest.service;

import com.nasa.prueba.aspirante.infraestructura.clientrest.dto.NasaDTO;
import org.springframework.http.ResponseEntity;

public interface ISearch {
    ResponseEntity<NasaDTO> searchData(String param);
}
