package devdojo.exercicio.chatgpt.catalagodefilmes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int escolha = 0;
        List<Filme> filmes = new ArrayList<>();

        
        Scanner sc = new Scanner(System.in);

        while (escolha !=4) {
            System.out.println("Escolha uma opção \n" + //
                                "1 - Cadastrar filme\n" + //
                                "2 - Listar filmes\n" + //
                                "3 - Buscar por gênero\n" + //
                                "4 - Sair\n" + //
                                "");           
            escolha = sc.nextInt();
            sc.nextLine();

            if(escolha == 1){
                System.out.println("Cadastre um filme:");

                System.out.println("Titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Genero: ");
                String genero = sc.nextLine();
                System.out.println("Ano: ");
                int ano = sc.nextInt();

                Filme filme = new Filme(titulo, genero, ano);
                filmes.add(filme);

               
            }

            if (escolha == 2) {                
                 for (Filme f : filmes) {
                    System.out.println(f.getTitulo());
                }
            }

            if(escolha == 3){

                

            

            }

            
            
        }






        sc.close();


    }

}
