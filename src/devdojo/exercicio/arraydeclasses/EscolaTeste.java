package devdojo.exercicio.arraydeclasses;

public class EscolaTeste {

    public static void main(String[] args) {
        
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor2  = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konorra", professores);

        escola.imprime();
    }

}
