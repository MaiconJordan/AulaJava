package devdojo.exercicio.array;

public class Exe03 {
    
    public static void main(String[] args) {
        
        //Crie um array de palavras (String[] palavras = {"Java", "foreach", "loop", "desenvolvedor"}) e 
        //use foreach para contar quantas vogais existem no total (independente de maiúsculas/minúsculas) entre todas as palavras.

        String[] palavras = {"Java", "foreach", "loop", "desenvolvedor"};
        int totalVogais = 0;
        for (String palavra : palavras) {
            for (char letra : palavra.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(letra) != -1) {
                    totalVogais++;
                }
            }
        }
        System.out.println("Total de vogais: " + totalVogais);





    }
}
