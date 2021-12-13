package com.salesianos.triana.dam.T4EC01.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateEstacionDto {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message = "El nombre de la estacion no puede estar en blanco")
    @NotNull(message = "{estacion.nombre.null}")
    private String nombre;
    @NotNull(message = "{estacion.ubicacion.null}")
    private String ubicacion;
    private boolean autolavado;
    @NotNull(message = "{estacion.precioGasoilNormal.null}")
    @PositiveOrZero(message = "{estacion.precioGasoilNormal.positivo}")
    private Float precioGasoilNormal;
    @NotNull(message = "{estacion.precioGasolina95.null}")
    @PositiveOrZero(message = "{estacion.precioGasolina95.positivo}")
    private Float precioGasolina95;
    @Past(message = "{estacion.fechaApertura.past}")
    private Date fechaApertura;

}
