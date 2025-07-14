package devdojo.polimorfismo.repositorio;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio01 = new RepositorioArquivo();
        Repositorio repositorio02 = new RepositorioMemoria();

        repositorio.salvar();
        repositorio01.salvar();
        repositorio02.salvar();
    }

}
