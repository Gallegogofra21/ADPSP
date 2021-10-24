package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.repo;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
