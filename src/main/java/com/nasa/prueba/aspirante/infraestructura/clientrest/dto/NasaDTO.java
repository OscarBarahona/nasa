package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class NasaDTO implements Serializable {
    private CollectionDTO collection;

}
