package instancia;

import java.util.ArrayList;
import java.util.List;

public class AppForma {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));
        
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
