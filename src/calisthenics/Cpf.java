package calisthenics;

public class Cpf {


    private String numero;

    public Cpf(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.numero = numero;
    }

    public String comoTexto() {
        return numero;
    }

}
