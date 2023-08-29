package com.nasa.prueba.aspirante.infraestructura.clientrest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
public class CollectionDTO implements Serializable {
    private String version;
    private String href;
    private ArrayList<ItemDTO> items;
    private MetadataDTO metadata;
    private ArrayList<LinkDTO> links;
}