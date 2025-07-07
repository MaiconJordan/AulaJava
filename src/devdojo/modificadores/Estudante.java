package devdojo.modificadores;

public class Estudante {

    private String nome;
    private int idade;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade < 0 ){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public void imprime(Estudante estudante){
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
    }

    

}
