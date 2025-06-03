package exercicio.polimorfismo;

public class App {

    public static void main(String[] args) {
        
        Empregado empregado = new Empregado("João", 40, 15.0);
        System.out.println(empregado);
        Empregado empregadoComissionado = new EmpregadoComissionado("Maria", 40, 15.0, 200.0);
        System.out.println(empregadoComissionado);


               

    }

}
