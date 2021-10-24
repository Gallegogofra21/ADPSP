package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.model.Categoria;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.repo.CategoriaRepository;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
