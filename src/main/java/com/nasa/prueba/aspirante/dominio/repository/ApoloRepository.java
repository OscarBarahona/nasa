package com.nasa.prueba.aspirante.dominio.repository;

import com.nasa.prueba.aspirante.dominio.entities.ApoloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApoloRepository extends JpaRepository<ApoloEntity, Long> {

}
