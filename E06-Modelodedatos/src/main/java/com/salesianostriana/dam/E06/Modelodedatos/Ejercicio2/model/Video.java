package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Video implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String orden;

    private String titulo;

    private String descripcion;

    private String url;

    @ManyToOne
    private CursoOnline curso;
}
