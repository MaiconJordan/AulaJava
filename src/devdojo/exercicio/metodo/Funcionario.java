package devdojo.exercicio.metodo;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprime(Funcionario funcionario){

        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);        
        for(double salario : funcionario.salario){
            System.out.println(salario);
        }

              

    }

    public void mediaSalarial(Funcionario funcionario){

        double soma = 0;
        for(double salario : funcionario.salario){
            soma = salario;
        }

        double media = soma / 3;

        System.out.println("Media salario do " + funcionario.nome + " é de " + media);

    }




}
