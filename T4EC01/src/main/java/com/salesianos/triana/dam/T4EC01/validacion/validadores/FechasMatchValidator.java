package com.salesianos.triana.dam.T4EC01.validacion.validadores;


import com.salesianos.triana.dam.T4EC01.validacion.anotaciones.FechasMatch;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FechasMatchValidator implements ConstraintValidator<FechasMatch, Object> {

    private String fechaField;
    private String verifyFechaField;

    @Override
    public void initialize(FechasMatch constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
