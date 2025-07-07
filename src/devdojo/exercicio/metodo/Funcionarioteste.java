package devdojo.exercicio.metodo;

public class Funcionarioteste {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Joao";
        funcionario.idade = 20;
        funcionario.salario[0] = 2200;
        funcionario.salario[1] = 3400;
        funcionario.salario[2] = 5001;

        funcionario.imprime(funcionario);
        funcionario.mediaSalarial(funcionario);
    }

}
