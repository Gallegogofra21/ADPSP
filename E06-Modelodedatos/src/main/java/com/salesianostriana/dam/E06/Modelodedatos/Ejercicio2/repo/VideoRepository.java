package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.repo;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
