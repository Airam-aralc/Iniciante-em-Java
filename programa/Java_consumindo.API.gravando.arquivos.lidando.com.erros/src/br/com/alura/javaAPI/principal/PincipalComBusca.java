package br.com.alura.javaAPI.principal;

import java.io.IOException; //adicionou uma exceção por causa do send
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PincipalComBusca{

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=463d14c9";

        HttpClient client = HttpClient.newHttpClient(); //para importar: Alt + Enter
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build(); //construir objetos complexos

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
