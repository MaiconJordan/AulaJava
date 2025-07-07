package devdojo.metodos.teste;

import devdojo.metodos.Estudante;
import devdojo.metodos.ImprimeEstudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        estudante01.nome = "Naruto";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        Estudante estuddante02 = new Estudante();
        estuddante02.nome = "Sakura";
        estuddante02.idade = 14;
        estuddante02.sexo = 'F';


        ImprimeEstudante impressora = new ImprimeEstudante();
        impressora.impressora(estudante01);
        impressora.impressora(estuddante02);



    }
}
