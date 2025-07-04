package devdojo.metodos.teste;

import devdojo.metodos.ExeMetodo;

public class ExeMetodoNotas {

    public static void main(String[] args) {
        ExeMetodo notas = new ExeMetodo();


        double media = notas.recebeNotas(8, 7, 7);
        String resiltado = notas.resultado(media);
        System.out.println(resiltado);
        
        

    }

}
