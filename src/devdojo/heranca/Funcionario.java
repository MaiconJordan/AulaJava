package devdojo.heranca;

public class Funcionario extends Pessoa {

    private double salario;


    public void relatorio(){
        System.out.println("Eu " + this.nome + " recebo " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + ", getNome()=" + getNome()
                + ", getCpf()=" + getCpf() + ", getEndereco()=" + getEndereco().getRua() + "]";
    }


    
    

}
