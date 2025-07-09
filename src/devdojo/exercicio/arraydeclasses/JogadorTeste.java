package devdojo.exercicio.arraydeclasses;

public class JogadorTeste {

    public static void main(String[] args) {
        
        Jogador romario = new Jogador("Romario", 10);
        Jogador cristiano = new Jogador("Cristiano", 7);
        Jogador neymar = new Jogador("Neyma", 11);

        Jogador[] jogadores = {romario, cristiano, neymar};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome() + " " + jogador.getNumero());
        }




    }

}
