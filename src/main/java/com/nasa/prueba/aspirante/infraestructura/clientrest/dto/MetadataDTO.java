package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MetadataDTO implements Serializable {
    @JsonProperty("total_hits")
    private int totalHits;
}