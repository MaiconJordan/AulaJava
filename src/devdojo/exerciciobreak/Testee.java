package devdojo.exerciciobreak;

public class Testee {

        int inicial = 1;

      public void contador(int numero) {
        if (inicial <= numero) {
            System.out.println("Contador: " + inicial);
            inicial++;
            contador(numero);
        }
    }

}
