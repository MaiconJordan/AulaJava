package devdojo.excecao.exception04;

public class MultiplosException {

    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException
            int resultado = 10 / 0; 
            System.out.println(resultado);// ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice do array fora do limite.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }
    }

}
