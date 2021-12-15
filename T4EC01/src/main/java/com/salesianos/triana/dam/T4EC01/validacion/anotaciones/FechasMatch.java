package com.salesianos.triana.dam.T4EC01.validacion.anotaciones;

import com.salesianos.triana.dam.T4EC01.validacion.validadores.FechasMatchValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.time.LocalDateTime;

@Constraint(validatedBy = FechasMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FechasMatch   {
    String message() default "Las fechas son incorrectas";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};

    String fechaField();
    String verifyFechaField();
}
