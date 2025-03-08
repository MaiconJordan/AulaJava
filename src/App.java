import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa p = new Pessoa();
        
        p.setNome("Maicon");
        p.setIdade(32);

        Pessoa p2 = new Pessoa();
        p2.setIdade(20);
        p2.setNome("Joao");

        Pessoa p3 = new Pessoa();
        p3.setNome("Maria");
        p3.setIdade(18);

        pessoas.add(p);
        pessoas.add(p2);
        pessoas.add(p3);


        System.out.println(pessoas);



    }
}
