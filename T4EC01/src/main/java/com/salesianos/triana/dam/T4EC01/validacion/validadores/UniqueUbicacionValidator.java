package com.salesianos.triana.dam.T4EC01.validacion.validadores;

import com.salesianos.triana.dam.T4EC01.model.Estacion;
import com.salesianos.triana.dam.T4EC01.repo.EstacionRepository;
import com.salesianos.triana.dam.T4EC01.servicios.EstacionService;

import com.salesianos.triana.dam.T4EC01.validacion.anotaciones.UniqueUbicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class UniqueUbicacionValidator implements ConstraintValidator<UniqueUbicacion, String> {

    @Autowired
    private EstacionRepository repository;

    @Override
    public void initialize(UniqueUbicacion constraintAnnotation) {
    }

    @Override
    public boolean isValid(String ubicacion, ConstraintValidatorContext context) {
        return StringUtils.hasText(ubicacion) && !repository.existsByUbicacion(ubicacion);
    }
}
