package devdojo.modificadores;

public class EstudanteTeste {

    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();

        estudante.setNome("Joao");
        estudante.setIdade(-1);

        estudante.imprime(estudante);

    }

}
