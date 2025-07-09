package devdojo.exercicio.array;

public class Jogador {

    private String nome;
    private Time time;


    public void imprime(){
        System.out.println(this.time);
    }

    
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    

}
