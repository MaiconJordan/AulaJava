package devdojo.sobrecargademetodos;

public class SomaTeste {
    public static void main(String[] args) {
        
        Soma soma = new Soma();

        soma.setNum1(3);
        soma.setNum2(3);
        soma.setNum3(3);

        soma.soma(soma.getNum1(), soma.getNum2());
        soma.soma(soma.getNum1(), soma.getNum2(), soma.getNum3());

        
        


    }

}
