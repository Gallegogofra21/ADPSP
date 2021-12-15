package com.salesianos.triana.dam.T4EC01.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.salesianos.triana.dam.T4EC01.validacion.anotaciones.UniqueUbicacion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
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
    @Pattern(regexp = "^([-+]?\\d{1,2}[.]\\d+),\\s*([-+]?\\d{1,3}[.]\\d+)$", message = "{estacion.ubicacion.formato}")
    @UniqueUbicacion(message = "{estacion.ubicacion.unico}")
    private String ubicacion;
    @Builder.Default
    private boolean autolavado = false;
    @NotNull(message = "{estacion.precioGasoilNormal.null}")
    @PositiveOrZero(message = "{estacion.precioGasoilNormal.positivo}")
    private Float precioGasoilNormal;
    @NotNull(message = "{estacion.precioGasolina95.null}")
    @PositiveOrZero(message = "{estacion.precioGasolina95.positivo}")
    private Float precioGasolina95;
    @Past(message = "{estacion.fechaApertura.past}")
    private Date fechaApertura;
    @Builder.Default
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private LocalDateTime fechaRegistro = LocalDateTime.now();

}
