package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args)  throws IOException, InterruptedException  {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme para busca: ");
        var busca = leitura.nextLine();

        String chave = "3826f258";
        String endereco = "https://www.omdbapi.com/?t=" +busca + "&apikey=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

       
}
