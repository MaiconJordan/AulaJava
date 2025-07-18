package devdojo.excecao.exception05;

public class MultiplosException02 {

    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }
    }

}
