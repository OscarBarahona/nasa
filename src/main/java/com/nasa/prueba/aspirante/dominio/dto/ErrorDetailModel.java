package com.nasa.prueba.aspirante.dominio.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class ErrorDetailModel implements Serializable {
    private Date timestamp;
    private String code;
    private String message;
    private String details;

    public ErrorDetailModel(Date timestamp, String code, String message, String details) {
        this.timestamp = timestamp;
        this.code = code;
        this.message = message;
        this.details = details;
    }
}
