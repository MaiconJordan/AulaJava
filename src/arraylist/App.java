package arraylist;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa p = new Pessoa("Maicon", 32);
        
        Pessoa p2 = new Pessoa("João", 30);

        Pessoa p3 = new Pessoa("Maria", 20);       

        pessoas.add(p);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Pegando o primeiro nome da lista");
        System.out.println(pessoas.get(0));
        System.out.println("-----------------------------------");

        System.out.println("Lista de nome gerado pelo ToString():");
        System.out.println(pessoas);
        System.out.println("-----------------------------------");

        System.out.println("Lista de pessoas gerado pelo foreach: ");
        for (Pessoa pessoa : pessoas) {
            System.err.println(pessoa);
        }
        System.out.println("-----------------------------------");
        System.out.println("Tamanho da lista:");
        System.out.println(pessoas.size());



    }
}
