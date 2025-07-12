package devdojo.abstrados;

public class Geerente extends Funcionario {

    public Geerente(String nome, double salario) {
        super(nome, salario);
        //TODO Auto-generated constructor stub
    }

 
    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.1;
    }

    
    

}
