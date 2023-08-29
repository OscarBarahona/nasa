package com.nasa.prueba.aspirante.dominio.dto.apolo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseApoloDTO implements Serializable {
    private long id;
    private String href;
    private String center;
    private String title;
    private String nasaId;

    private String createdAt;
}
