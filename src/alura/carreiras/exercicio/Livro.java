package alura.carreiras.exercicio;

public class Livro {

    private String livro;
    private String titulo;
    private String paginas;

    public Livro(String livro, String titulo, String paginas) {
        this.livro = livro;
        this.titulo = titulo;
        this.paginas = paginas;
    }


    public String getLivro() {
        return livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPaginas() {
        return paginas;
    }
    

    public void imprimirDetalhes() {
        System.out.println("Livro: " + livro);
        System.out.println("Título: " + titulo);
        System.out.println("Páginas: " + paginas);
    }



    @Override
    public String toString() {
        return "Livro{" +
                "livro='" + livro + '\'' +
                ", titulo='" + titulo + '\'' +
                ", paginas='" + paginas + '\'' +
                '}';
    }   


}
