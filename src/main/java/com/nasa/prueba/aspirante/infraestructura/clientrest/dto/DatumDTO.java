package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DatumDTO implements Serializable {
    private String center;
    private String title;
    private List<String> keywords;
    @JsonProperty("nasa_id")
    private String nasaId;
    @JsonProperty("date_created")
    private Date dateCreated;
    @JsonProperty("media_type")
    private String mediaType;
    private String description;
    private List<String> album;
    private String photographer;
    private String location;
}
