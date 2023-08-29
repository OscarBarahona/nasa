package com.nasa.prueba.aspirante.dominio.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "nasa_test")
public class ApoloEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_nasa")
    @SequenceGenerator(sequenceName = "seq_id_nasa", allocationSize = 1, name = "seq_id_nasa")
    private long id;
    private String href;
    private String center;
    private String title;
    @Column(name = "nasa_id")
    private String nasaId;

    @Column(name = "created_at")
    private transient String createdAt;
}
