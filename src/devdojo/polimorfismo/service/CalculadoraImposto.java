package devdojo.polimorfismo.service;

import devdojo.polimorfismo.Produto;
import devdojo.polimorfismo.Tomate;


public class CalculadoraImposto {


    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto genérico");
        double imposto = produto.calcularImposto();
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        if( produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade do tomate: " + tomate.getDataValidade());
        }
        

    }

}
