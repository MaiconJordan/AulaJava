package devdojo.exercicio.array;

public class Exemplo01 {

    // exemplo de array multidimensional com for apenas, crie um array de duas dimensões com 3 linhas e 3 colunas, atribua a variavel para cada um das linhas
    // o valor 1, 2, 3 e depois imprima esse arrray na tela

    public static void main(String[] args) {
        int[][] arrayMultidimensional = new int[3][3];

        // Atribuindo valores
        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                arrayMultidimensional[i][j] = i + 1;
            }
        }

        // Imprimindo o array
        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                System.out.print(arrayMultidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
