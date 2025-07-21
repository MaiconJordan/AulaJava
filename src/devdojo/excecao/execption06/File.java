package devdojo.excecao.execption06;

public class File {

    public static void main(String[] args) {
        try (java.io.FileReader reader = new java.io.FileReader("test.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (java.io.IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
