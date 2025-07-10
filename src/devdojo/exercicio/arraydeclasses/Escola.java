package devdojo.exercicio.arraydeclasses;

public class Escola {

    private String nome;
    private Professor[] professor;

    
    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professor == null) return;
        for (Professor professor2 : professor) {
            System.out.println(professor2.getNome());
        }
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor[] getProfessor() {
        return professor;
    }
    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    

}
