package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.service;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service.base.BaseService;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.CursoOnline;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.repo.CursoOnlineRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoService extends BaseService<CursoOnline, Long, CursoOnlineRepository> {
}
