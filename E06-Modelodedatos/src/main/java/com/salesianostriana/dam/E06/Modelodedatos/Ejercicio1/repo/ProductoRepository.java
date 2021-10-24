package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.repo;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
