package com.salesianos.triana.dam.T4EC01.validacion.validadores;

import com.salesianos.triana.dam.T4EC01.model.Estacion;
import com.salesianos.triana.dam.T4EC01.servicios.EstacionService;
import com.salesianos.triana.dam.T4EC01.validacion.anotaciones.UbicacionMatch;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class UbicacionMatchValidator implements ConstraintValidator<UbicacionMatch, Object> {

    private String ubicacionField;
    private List<Estacion> verifyUbicacionField;
    private EstacionService service;

    @Override
    public void initialize(UbicacionMatch constraintAnnotation) {
        ubicacionField = constraintAnnotation.ubicacionField();

        verifyUbicacionField = service.findAll()..getUbicacion();

        verifyUbicacionField = constraintAnnotation.verifyUbicacionField();

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
