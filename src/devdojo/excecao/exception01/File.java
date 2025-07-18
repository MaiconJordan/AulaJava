package devdojo.excecao.exception01;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException  {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
       java.io.File file = new java.io.File("arquivo/arquivo.txt");
         try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

}

