package alura.carreiras.exercicio;

import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero e direi se ele é impar ou par");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }


        




        sc.close();



    }

}
