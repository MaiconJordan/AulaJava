package ordenandodados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        List<Titulo> filmes = new ArrayList<>();

        Titulo f1 = new Titulo("Exterminador do Futuro");
        Titulo f2 = new Titulo("Jumangi");
        Titulo f3 = new Titulo("HOmem Aranha");
        Titulo f4 = new Titulo("Vingadores");
        Titulo f5 = new Titulo("Amanhecer");
        Titulo f6 = new Titulo("Lista de Schindler");
        Titulo f7 = new Titulo("Poderoso Chefao");
    
        
        filmes.add(f1);
        filmes.add(f6);
        filmes.add(f5);
        filmes.add(f4);
        filmes.add(f3);
        filmes.add(f2);
        filmes.add(f7);

        Collections.sort(filmes);

        System.out.println(filmes);

        for (Titulo titulo : filmes) {
            System.out.println(titulo);
        }

        
    }
    



}
