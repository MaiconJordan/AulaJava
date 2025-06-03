package exercicio.polimorfismo;

public class EmpregadoComissionado extends Empregado {

    private Double comissao;

    public EmpregadoComissionado(String nome, int horas, Double valorHora, Double comissao) {
        super(nome, horas, valorHora);
        this.comissao = comissao;
    }

   

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + comissao;
    }

    @Override
    public String toString() {
        return "Empregado Comissionado: " + getNome() + " | Salário: " + calcularSalario();
    }



}
