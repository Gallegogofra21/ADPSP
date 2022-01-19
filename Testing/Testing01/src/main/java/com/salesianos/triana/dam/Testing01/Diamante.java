package com.salesianos.triana.dam.Testing01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Stack;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Diamante {

    private Stack<String> cadena = new Stack<>();
    int parte1, parte2, numDiamantes;


    public Stack<String> addElement (String e) {
        cadena.add(e);
        return cadena;
    }

    public void imprimirCadena(){
        System.out.println("La mina es: "+cadena);
    }

    public int comprobarNumDiamantes() {
        cadena.forEach(plate -> {
            if(plate.equals("<")){
                parte1++;
            }
            if(plate.equals(">")){
                parte2++;
            }
            if(parte1 >= parte2 && parte2 != 0){
                numDiamantes++;
            }
            System.out.println(plate);
        });

        return numDiamantes;
    }
}
