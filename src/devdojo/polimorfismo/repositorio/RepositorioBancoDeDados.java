package devdojo.polimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }

    // Outros métodos específicos para o repositório de banco de dados podem ser adicionados aqui

}
