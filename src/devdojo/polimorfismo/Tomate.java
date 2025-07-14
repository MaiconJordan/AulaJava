package devdojo.polimorfismo;

public class Tomate extends Produto {

    private String dataValidade;


    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.getValor() * 0.05; // Exemplo de cálculo de imposto para tomate
    }

    public String getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


}
