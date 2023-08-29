package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

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
    private String nasa_id;
    private Date date_created;
    private String media_type;
    private String description;
    private List<String> album;
    private String photographer;
    private String location;
}
