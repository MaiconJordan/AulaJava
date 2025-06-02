package calisthenics;

public class Nome {
    private String valor;

    public Nome(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.valor = valor;
    }

    public String comoTexto() {
        return valor;
    }
}
