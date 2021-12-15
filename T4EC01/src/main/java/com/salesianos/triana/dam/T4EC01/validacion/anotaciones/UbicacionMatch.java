package com.salesianos.triana.dam.T4EC01.validacion.anotaciones;

import com.salesianos.triana.dam.T4EC01.validacion.validadores.UbicacionMatchValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = UbicacionMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UbicacionMatch {
    String message() default "La ubicación de la estación ya existe";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};

    String ubicacionField();
    List<Estacion> verifyUbicacionField();
}
