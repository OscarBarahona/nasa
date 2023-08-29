package com.nasa.prueba.aspirante.dominio.restcontroller;


import com.nasa.prueba.aspirante.dominio.dto.ResponseDataModel;
import com.nasa.prueba.aspirante.dominio.dto.apolo.ResponseApoloDTO;
import com.nasa.prueba.aspirante.dominio.service.IApolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1.0")
public class ApiNasaController {
    @Autowired
    IApolo apolo;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDataModel<ResponseApoloDTO> GetDataApolo() {
        return apolo.getInfoDB();
    }


}
