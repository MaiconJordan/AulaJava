package devdojo.polimorfismo;

public class Computador  extends Produto {

    public Computador(String nome, double valor) {
        super(nome, valor);
    }   

    @Override
    public double calcularImposto() {
        return this.getValor() * 0.2; // Exemplo de cálculo de imposto      
    }
}