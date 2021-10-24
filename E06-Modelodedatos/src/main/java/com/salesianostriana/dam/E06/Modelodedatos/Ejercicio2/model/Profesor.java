package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Profesor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String email;

    private double puntuacion;

    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursos;
}
