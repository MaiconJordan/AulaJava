package devdojo.polimorfismo.repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }

    // Outros métodos específicos para o repositório de arquivo podem ser adicionados aqui

}
