package com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service;

import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.model.Producto;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.repo.ProductoRepository;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
