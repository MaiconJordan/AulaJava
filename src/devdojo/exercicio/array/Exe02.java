package devdojo.exercicio.array;

public class Exe02 {
    public static void main(String[] args) {
        
        //Crie um array de inteiros com os valores {5, 10, 15, 20}. Use foreach para calcular a soma de todos os elementos e depois imprima o resultado.

        int[] numeros = {5, 10, 15, 20};
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        System.out.println("A soma dos elementos do array é: " + soma);


    }
}
