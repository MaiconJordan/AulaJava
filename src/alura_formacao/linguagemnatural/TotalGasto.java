package alura_formacao.linguagemnatural;

import java.util.Scanner;

public class TotalGasto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gastos = 0; 
        double vl =1;       

        while (vl != 0 ){
            System.out.println("Informe seus gastos");
            vl = sc.nextDouble();
            

            gastos += vl;
            //gasots
        }

        System.out.println(gastos);
        



        sc.close();

        



    }

}
