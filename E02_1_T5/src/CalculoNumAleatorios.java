import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

@AllArgsConstructor
@NoArgsConstructor
public class CalculoNumAleatorios {

    private int numero;
    private ArrayList<Integer> numeros= new ArrayList<Integer>();


    public ArrayList<Integer> calcularAleatorios(){
        for (int i = 0; i <= 5; i++) {
            numero = (int) (Math.random() * 6 + 1);
            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }
        return numeros;

    }
    static class diamantes{
        private int numDiamantes;
        private Stack<String> mina = new Stack<>();




        public int compobarDiamantes(){
            if(mina.peek().equals("<>")){
                numDiamantes+= numDiamantes +1;
            }
            return numDiamantes;
        }
    }


    public static void main(String[] args){
        CalculoNumAleatorios a = new CalculoNumAleatorios();
        String mina = "<>><>><<<<<>><>";


        System.out.println(a.calcularAleatorios());

        AtomicInteger numDiamantes= new AtomicInteger();
        Stack<Character> guion1 = new Stack<>();
        Stack<Character> guion2 = new Stack<>();

        for(int i=0; i< mina.length(); i++){
            int numMas = 0, numMenos= 0;

            char c = mina.charAt(i);
            if(c == '<'){
                numMas += 1;
            }else{
                numMenos += 1;
            }
            
        }





        System.out.println(numDiamantes);




    }
}
