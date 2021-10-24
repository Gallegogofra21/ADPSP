package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.service;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service.base.BaseService;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.Profesor;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.repo.ProfesorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {
}
