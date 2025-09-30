package alura.carreiras.exercicio;

public class SomaList {

    public static void main(String[] args) {
//         João recebeu uma lista de valores representando as receitas de sua loja de roupas. Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

// int[] valores = {10, 20, 30, 40, 50};

// Crie um programa que ajude João a calcular o valor total.

// Saída esperada:

// A soma total das receitas é: 150

        int[] valores = {10, 20, 30, 40, 50};

        int soma = 0;
        for (int i : valores) {
            soma += i;
        }

        System.out.println("soma total: " + soma);




    }

}
