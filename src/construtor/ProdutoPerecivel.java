package construtor;

public class ProdutoPerecivel extends Produto{
    
    private String dataValidade;


       

    public ProdutoPerecivel(String nome, Double preco, int quandidade, String dataValidade) {
        super(nome, preco, quandidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    


}
