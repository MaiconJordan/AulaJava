package devdojo.polimorfismo;

public class Tomate extends Produto {

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.getValor() * 0.05; // Exemplo de cálculo de imposto para tomate
    }

}
