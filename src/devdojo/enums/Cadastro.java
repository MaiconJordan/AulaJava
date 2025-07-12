package devdojo.enums;

public class Cadastro {

    private String nome;
    private Estados estado;

    

    public Cadastro(String nome, Estados estado) {
        this.nome = nome;
        this.estado = estado;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Estados getEstado() {
        return estado;
    }
    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    

}
