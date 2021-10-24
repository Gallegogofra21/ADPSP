package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Categoria implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "categoria_id", foreignKey = @ForeignKey(name = "FK_CATEGORIA_CATEGORIA"))
    private Categoria categoria;
}
