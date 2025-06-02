package ordenandodados;

public class Cliente {

    Identifyer id;

    public Cliente(Identifyer id) {
        this.id = id;
    }

    public static void main(String[] args) {
        
        Identifyer id = new Identifyer(null);
        Cliente cliente = new Cliente(id);


    }

}
