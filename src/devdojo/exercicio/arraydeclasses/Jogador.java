package devdojo.exercicio.arraydeclasses;

public class Jogador {

    private String nome;
    private int numero;
    private Time time;


    
    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Jogador(){

    }


    public void imprime(){
        System.out.println(this.nome);
        if(time != null){
              System.out.println(this.time);
        }
      
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    

}
