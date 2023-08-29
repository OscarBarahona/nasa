package com.nasa.prueba.aspirante.dominio.service;

import com.nasa.prueba.aspirante.dominio.dto.ResponseDataModel;
import com.nasa.prueba.aspirante.dominio.dto.apolo.ResponseApoloDTO;

public interface IApolo {
    ResponseDataModel<ResponseApoloDTO> getInfoDB();
}
