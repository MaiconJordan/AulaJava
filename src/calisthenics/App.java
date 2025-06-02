package calisthenics;

public class App {
    public static void main(String[] args) {
        Nome nome = new Nome("Maicon Rocha");
        Cpf cpf = new Cpf("123.456.789-00");
        Cliente cliente = new Cliente(nome, cpf);

        cliente.exibirDados();
    }
}
