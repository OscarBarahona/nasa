package com.nasa.prueba.aspirante.infraestructura.clientrest.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nasa.prueba.aspirante.dominio.entities.ApoloEntity;
import com.nasa.prueba.aspirante.dominio.repository.ApoloRepository;
import com.nasa.prueba.aspirante.infraestructura.clientrest.dto.DatumDTO;
import com.nasa.prueba.aspirante.infraestructura.clientrest.dto.ItemDTO;
import com.nasa.prueba.aspirante.infraestructura.clientrest.dto.NasaDTO;
import com.nasa.prueba.aspirante.infraestructura.clientrest.service.ISearch;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
@Slf4j
public class SearchImpl implements ISearch {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${url.base.nasa}")
    private String urlBaseNasa;
    @Autowired
    private ApoloRepository repository;

    @SneakyThrows
    @Override
    public ResponseEntity<NasaDTO> searchData(String param) {

        URI targetUrl = UriComponentsBuilder.fromHttpUrl(urlBaseNasa)
                .path("search")
                .queryParam("q", URLEncoder.encode(param, StandardCharsets.UTF_8))
                .build(true).toUri();


        log.info("URL del proveedor {}", targetUrl);

        ResponseEntity<NasaDTO> nasaDTOResponseEntity =
                restTemplate.getForEntity(targetUrl, NasaDTO.class);
        NasaDTO nasaDTO = nasaDTOResponseEntity.getBody();
        for (ItemDTO itemDTO : nasaDTO.getCollection().getItems()) {
            ApoloEntity entity = new ApoloEntity();
            entity.setHref(itemDTO.getHref());
            for (DatumDTO datumDTO : itemDTO.getData()) {
                entity.setCenter(datumDTO.getCenter());
                entity.setTitle(datumDTO.getTitle());
                entity.setNasaId(datumDTO.getNasa_id());

            }
            log.info("Iteracion {}", new ObjectMapper().writeValueAsString(entity));
            repository.save(entity);
        }


        return nasaDTOResponseEntity;
    }


}
