package com.salesianos.triana.dam.T4EC01.dtos;

import com.salesianos.triana.dam.T4EC01.model.Estacion;
import org.springframework.stereotype.Component;

@Component
public class EstacionDtoConverter {


    public GetEstacionDto estacionToGetEstacionDto (Estacion e) {

        GetEstacionDto result = new GetEstacionDto();
        result.setNombre(e.getNombre());
        result.setUbicacion(e.getUbicacion());
        result.setPrecioGasoil(e.getPrecioGasoilNormal());
        result.setPrecioGasolina95(e.getPrecioGasolina95());
        result.setFechaApertura(e.getFechaApertura());
        return result;
    }

    public Estacion createEstacionDtoToEstacion (CreateEstacionDto e) {
        Estacion result = new Estacion();

        result.setId(e.getId());
        result.setNombre(e.getNombre());
        result.setUbicacion(e.getUbicacion());
        result.setAutolavado(e.isAutolavado());
        result.setPrecioGasoilNormal(e.getPrecioGasoilNormal());
        result.setPrecioGasolina95(e.getPrecioGasolina95());
        result.setFechaApertura(e.getFechaApertura());

        return result;
    }
}
