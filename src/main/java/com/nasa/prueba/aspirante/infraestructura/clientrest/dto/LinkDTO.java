package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class LinkDTO implements Serializable {
    private String href;
    private String rel;
    private String render;
}
