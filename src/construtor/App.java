package construtor;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
    
        List<Produto> prod = new ArrayList<>();
        Produto produto1 = new Produto();

        

        produto1.setNome("Água");
        produto1.setPreco(2.00);
        produto1.setQuandidade(10);

        Produto produto2 = new Produto();

        produto2.setNome("Café");
        produto2.setPreco(30.00);
        produto2.setQuandidade(11);

        Produto produto3 = new Produto("Leite", 4.5 , 20 );

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Carne", 35.00, 5, "2024-03-01");

        System.out.println(perecivel);

        prod.add(produto1);
        prod.add(produto2);
        prod.add(produto3);

        for (Produto produto : prod) {
            System.out.println(produto);
        }
        

        

        
    }

    
   


    
    
}
