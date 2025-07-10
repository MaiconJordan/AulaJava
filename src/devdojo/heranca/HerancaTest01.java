package devdojo.heranca;

public class HerancaTest01 {

    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        Endereco endereco = new Endereco();

        endereco.setRua("Rua doze");
        endereco.setCep("88000-888");

        funcionario01.setCpf("99988877755");
        funcionario01.setEndereco(endereco);
        funcionario01.setNome("Joao");
        funcionario01.setSalario(20000);

        System.out.println(funcionario01);
        funcionario01.relatorio();

    }

;

    

}
