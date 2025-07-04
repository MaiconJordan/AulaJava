package devdojo.metodos.teste;

import devdojo.metodos.MetodoParametroTipoPrimitivo;

public class MetodoParametroTipoPrimitivoTeste {

    public static void main(String[] args) {
        

        MetodoParametroTipoPrimitivo m = new MetodoParametroTipoPrimitivo();

        int num1 = 1;
        int num2 = 2;

        m.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do escopo do Main ");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

    }
}
