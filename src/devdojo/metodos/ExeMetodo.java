package devdojo.metodos;

public class ExeMetodo {

    public double recebeNotas(double notaum, double notadois, double notatres){
        double soma  = notaum + notadois + notatres;

        double media = soma / 3;

        return media ;

    }

    public String resultado(double media){
        if (media >= 7){
            return "aprovado";
        }

        if (media > 5 && media < 7){
            return "recuperação";
        }

        return "reprovado";
    }

    

}
