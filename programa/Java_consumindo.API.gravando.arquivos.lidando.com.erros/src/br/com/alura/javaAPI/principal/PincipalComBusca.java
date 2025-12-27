package br.com.alura.javaAPI.principal;

import br.com.alura.javaAPI.modelos.Titulo;
import br.com.alura.javaAPI.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)  //Para indicar que o Títlo vem com letra maiúscula, evitando o erro de não encontrar a variável pq ela está com letra minúscula
                .create();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Título já convertido");
        System.out.println(meuTitulo);
    }
}
