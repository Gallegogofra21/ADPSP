package com.salesianos.triana.dam.T4EC01.errores.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ApiValidationSubError extends ApiSubError{

    private String objeto;
    private String campo;
    private Object valorRechazado;
    private String mensaje;

}
