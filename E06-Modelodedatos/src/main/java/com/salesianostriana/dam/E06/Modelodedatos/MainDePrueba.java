package com.salesianostriana.dam.E06.Modelodedatos;


import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.model.Producto;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio1.service.ProductoService;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.CursoOnline;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.model.Profesor;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.service.CursoService;
import com.salesianostriana.dam.E06.Modelodedatos.Ejercicio2.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ProductoService service;
    private final ProfesorService profesorService;
    private final CursoService cursoService;

    @PostConstruct
    public void test(){
        Producto producto = Producto.builder()
                .nombre("Estuche")
                .pvp(3)
                .build();

        service.save(producto);

        service.findALl().forEach(a -> System.out.printf( a.getNombre(), a.getPvp()));




        Optional<Profesor> profesor = profesorService.findById(2L);

        profesor.ifPresent(p -> {
            System.out.println("Profesor: " + p.getNombre());
            System.out.println("Nº de cursos: " + p.getCursos().size());
            p.getCursos().forEach(c -> {
                System.out.println("\tCurso: " + c.getNombre());
            });
        });

        Optional<CursoOnline> curso = cursoService.findById(5L);

        curso.ifPresent(c -> {
            System.out.println("Curso: " + c.getNombre());
            System.out.println("Profesor: " + c.getProfesor().getNombre());
        });

    }
    }

