package com.nasa.prueba.aspirante.dominio.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ResponseDataModel<T> implements Serializable {
    private Boolean succeeded=true;
    private List<T> data;
    private List<ErrorDetailModel> error;
}
