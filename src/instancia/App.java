package instancia;



public class App {
    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro();
        
        // Verificando se o objeto é uma instância de Animal antes de fazer o casting
        if (meuCachorro instanceof Animal) {
            // Fazendo o casting para a classe Animal
            Animal meuAnimal = (Animal) meuCachorro;
            
            // Chamando o método fazerSom
            meuAnimal.fazerSom(); // Devido ao polimorfismo, imprime "O cachorro late."
        } else {
            System.out.println("O objeto não é uma instância de Animal.");
        }
    }
}
