package calisthenics;

class Cliente {
    private Nome nome;
    private Cpf cpf;

    public Cliente(Nome nome, Cpf cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Regra 8: Sem getters — expõe comportamento, não dados
    public void exibirDados() {
        System.out.println("Nome: " + nome.comoTexto());
        System.out.println("CPF: " + cpf.comoTexto());
    }
}