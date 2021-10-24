package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor", foreignKey = @ForeignKey(name = "FK_CURSO_PROFESOR"))
    private Profesor profesor;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Video> videos = new ArrayList<>();

    public void addProfesor(Profesor p) {
        this.profesor = p;
        p.getCursos().add(this);
    }

    public void removeProfesor(Profesor p){
        p.getCursos().remove(this);
        this.profesor = null;
    }

    public void addVideo(Video v){
        v.setCurso(this);
        this.videos.add(v);
    }

    public void removeVideo(Video v){
        this.videos.remove(v);
        v.setCurso(null);
    }
}
