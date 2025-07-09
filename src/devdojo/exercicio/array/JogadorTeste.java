package devdojo.exercicio.array;

public class JogadorTeste {

    public static void main(String[] args) {
        

        Jogador jogador1 = new Jogador("Romario");
        Time time = new Time("Flamengo");

        jogador1.setTime(time); 

        jogador1.imprime();


        System.err.println(jogador1.getNome());
        System.out.println(jogador1.getTime().getNome());



    }

}
