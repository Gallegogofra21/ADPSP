package com.salesianos.triana.dam.T4EC01.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Builder
public class GetEstacionDto {

    private String nombre;
    private String ubicacion;
    private Float precioGasoil;
    private Float precioGasolina95;
    private Date fechaApertura;

    public GetEstacionDto(String nombre, String ubicacion, Float precioGasoil, Float precioGasolina95, Date fechaApertura) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precioGasoil = precioGasoil;
        this.precioGasolina95 = precioGasolina95;
        this.fechaApertura = fechaApertura;
    }
}
