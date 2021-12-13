package com.salesianos.triana.dam.T4EC01.controller;

import com.salesianos.triana.dam.T4EC01.dtos.CreateEstacionDto;
import com.salesianos.triana.dam.T4EC01.dtos.EstacionDtoConverter;
import com.salesianos.triana.dam.T4EC01.dtos.GetEstacionDto;
import com.salesianos.triana.dam.T4EC01.model.Estacion;
import com.salesianos.triana.dam.T4EC01.servicios.EstacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estacion")
public class EstacionController {

    private final EstacionService service;
    private final EstacionDtoConverter dtoConverter;

    @GetMapping("/")
    public List<GetEstacionDto> findAll() {
        List<GetEstacionDto> result = service.findAll().stream().map(dtoConverter::estacionToGetEstacionDto).collect(Collectors.toList());
        return result;
    }

    @GetMapping("/{id}")
    public Estacion findOne(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/")
    public Estacion crear(@Valid @RequestBody CreateEstacionDto estacion){
        Estacion nueva;
        nueva = dtoConverter.createEstacionDtoToEstacion(estacion);
        service.save(nueva);
        return nueva;
    }

    @PutMapping("/{id}")
    public Estacion edit(@Valid @RequestBody CreateEstacionDto estacion, @PathVariable Long id){
        Estacion nueva;
        nueva = dtoConverter.createEstacionDtoToEstacion(estacion);
        service.edit(nueva);
        return nueva;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

}
