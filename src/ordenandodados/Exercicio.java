package ordenandodados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(1);
        numeros.add(15);
        numeros.add(4);
        numeros.add(12);
        numeros.add(23);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);


        Collections.sort(numeros);
        System.out.println(numeros);



    }

}
