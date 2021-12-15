package com.salesianos.triana.dam.T4EC01.repo;

import com.salesianos.triana.dam.T4EC01.model.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionRepository extends JpaRepository<Estacion, Long> {

    boolean existsByUbicacion(String ubicacion);
}
