package devdojo.polimorfismo.test;

import devdojo.polimorfismo.Computador;
import devdojo.polimorfismo.Tomate;
import devdojo.polimorfismo.service.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        
         Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        
    }

}
