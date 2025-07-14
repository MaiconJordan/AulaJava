package devdojo.polimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }

    // Outros métodos específicos para o repositório de memória podem ser adicionados aqui

}
