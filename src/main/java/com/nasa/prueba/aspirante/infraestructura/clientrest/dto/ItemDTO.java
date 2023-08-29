package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ItemDTO implements Serializable {
    private String href;
    private List<DatumDTO> data;
    private List<LinkDTO> links;
}
