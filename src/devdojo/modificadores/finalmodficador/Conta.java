package devdojo.modificadores.finalmodficador;

public class Conta {

    private String nome;
    private int numeroConta;
    private static final int AGENCIA = 0001;
    private static final String CONTA_CORRENTE = "Conta Corrente";
    private static final String CONTA_POUPANCA = "Conta Poupança";


    

    public Conta(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public static int getAgencia() {
        return AGENCIA;
    }
    public static String getContaCorrente() {
        return CONTA_CORRENTE;
    }
    public static String getContaPoupanca() {
        return CONTA_POUPANCA;
    }

    
    

}
