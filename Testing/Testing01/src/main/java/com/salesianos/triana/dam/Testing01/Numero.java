package com.salesianos.triana.dam.Testing01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class Numero {

    private int numero, maximo, minimo;
    private ArrayList<Integer> numeros = new ArrayList<>();

    public ArrayList<Integer> calcularNumerosAleatorios() {

        maximo = 10;
        for (int i = 0; i <= 5; i++) {
            numero = (int) (Math.random() * maximo + 1);
            if(numeros.contains(numero)) {
                i--;
            }else {
                numeros.add(numero);
            }
        }
        return numeros;
    }
}
