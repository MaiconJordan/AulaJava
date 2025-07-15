package devdojo.excecao.exception01;

public class File {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
       java.io.File file = new java.io.File("arquivo/arquivo.txt");
         try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (java.io.IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }

}
