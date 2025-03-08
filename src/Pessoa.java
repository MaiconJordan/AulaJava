public class Pessoa {
    
    String nome = this.nome;
    int idade = this.idade;


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
        this.idade = idade;
    }

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nome + " " + this.idade;
    }

}
