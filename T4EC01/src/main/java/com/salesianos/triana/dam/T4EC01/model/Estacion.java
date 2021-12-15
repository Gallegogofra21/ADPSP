package com.salesianos.triana.dam.T4EC01.model;

import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Estacion {

    @Id
    @GeneratedValue
    private Long id;


    private String nombre;

    private String marca;


    private String ubicacion;


    private boolean autolavado;


    private Float precioGasoilNormal;


    private Float precioGasolina95;

    @PositiveOrZero(message = "{estacion.precioGasoilEspecial.positivo}")
    private Float precioGasoilEspecial;

    @PositiveOrZero(message = "{estacion.precioGasolina98.positivo}")
    private Float precioGasolina98;

    @Lob
    private String servicios;


    private Date fechaApertura;

    private LocalDateTime fechaRegistro;
}
