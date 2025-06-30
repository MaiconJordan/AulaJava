package devdojo.exerciciobreak;

import java.util.Scanner;

public class exe01 {
    //Dado um valor de um carro descubra em quantas parcelas ele pode ser parcelado.
    //Condição valor parcela maior que 1000.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();

        System.out.println("Digite o numero de parcelas: ");
        int nParcelas = scanner.nextInt();

        Double vlParcelas = valorCarro / nParcelas;

        if(vlParcelas < 1000){
            System.out.println("Valor da parcela deve ser maior que 1000.");
        } else {
            System.out.println("Seu carro pode ser parcelado em: " + nParcelas + " parcelas de R$" + vlParcelas);
        }


        scanner.close();


    }
    
}
