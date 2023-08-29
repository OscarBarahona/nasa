package com.nasa.prueba.aspirante.aplicacion.taskscheduler;

import com.nasa.prueba.aspirante.infraestructura.clientrest.service.ISearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PruebaTask {

    @Autowired
    private ISearch search;
    @Value("${param.query.search}")
    private String parametro;

    @Scheduled(cron = "0 * * * * *")
    public void runRetry() {
        search.searchData(parametro);
    }
}
