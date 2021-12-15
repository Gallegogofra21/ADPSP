package com.salesianos.triana.dam.T4EC01.validacion.anotaciones;

import com.salesianos.triana.dam.T4EC01.validacion.validadores.UniqueUbicacionValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUbicacionValidator.class)
@Documented
public @interface UniqueUbicacion {
    String message() default "La ubicación de la estación ya existe";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};
}
