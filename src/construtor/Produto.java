package construtor;

public class Produto {

    private String nome ;
    private Double preco;
    private int quandidade;

    
    public Produto(){
        
    }

    public Produto(String nome, Double preco, int quandidade) {
        this.nome = nome;
        this.preco = preco;
        this.quandidade = quandidade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public int getQuandidade() {
        return quandidade;
    }
    public void setQuandidade(int quandidade) {
        this.quandidade = quandidade;
    }


    @Override
    public String toString() {
        return  nome + " | Preço: " + preco + " | Quantidade: " + quandidade + " | " ;
    }



    
    
}
