package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.repo;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.CursoOnline;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline, Long> {

    List<CursoOnline> findByProfesor(Profesor profesor);
}
