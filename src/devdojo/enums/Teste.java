package devdojo.enums;

public class Teste {
    public static void main(String[] args) {
        
        Cadastro cad1 = new Cadastro("Joao",Estados.AC);

        
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado);
        }

        // Buscar um estado pela sigla
        EstadoBrasileiro estado = EstadoBrasileiro.porSigla("PR");
        if (estado != null) {
            System.out.println("Encontrado: " + estado.getNome());
        } else {
            System.out.println("Estado não encontrado.");
        }

    }

}
