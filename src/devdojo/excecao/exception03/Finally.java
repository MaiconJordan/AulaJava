package devdojo.excecao.exception03;

public class Finally {

    public static void main(String[] args) {
        java.io.FileReader file = null;
        try {
            file = new java.io.FileReader("arquivo.txt");
            System.out.println("Arquivo aberto com sucesso.");
            // Simula leitura do arquivo
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } finally {
            if (file != null) {
                try {
                    file.close();
                    System.out.println("Arquivo fechado.");
                } catch (java.io.IOException e) {
                    System.out.println("Erro ao fechar o arquivo.");
                }
            }
        }
    }

}
