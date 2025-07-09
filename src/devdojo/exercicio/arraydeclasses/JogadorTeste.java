package devdojo.exercicio.arraydeclasses;

public class JogadorTeste {

    public static void main(String[] args) {
        
        Jogador arraxca = new Jogador("Arraxca", 10);
        Time time = new Time("Flamengo");
        Jogador cristiano = new Jogador("Cristiano", 7);
        Jogador neymar = new Jogador("Neymar", 11);

        

        arraxca.setTime(time);

        arraxca.imprime();
       


        Jogador[] jogadores = {arraxca, cristiano, neymar};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getTime());
        }




    }

}
