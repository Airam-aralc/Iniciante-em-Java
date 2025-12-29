package br.com.alura.javaAPI.principal;

import br.com.alura.javaAPI.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.javaAPI.modelos.Titulo;
import br.com.alura.javaAPI.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException; //adicionou uma exceção por causa do send
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PincipalComBusca{

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)  //Para indicar que o Títlo vem com letra maiúscula, evitando o erro de não encontrar a variável pq ela está com letra minúscula
                .setPrettyPrinting() //deixar mais bonito para a visualização do json
                .create();

        while (!busca.equalsIgnoreCase("sair")) { // tanto faz digitar maiúsculo ou minusculo
            System.out.println("Digite um filme para busca");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=fe8cd2b0"; //o replace é para resolver o problema dos filmes compostos separados por espaço

            try {
                HttpClient client = HttpClient.newHttpClient(); //para importar: Alt + Enter
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build(); //construir objetos complexos

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo); //Vai adicionar o título na lista
            } catch (
                    NumberFormatException e) { //para erros, na classe Exception tem muitas filhas para cada tipo de erro, consulte a documentação
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) { //para mais erros
                System.out.println("Algum erro de argumento na busca, verifique o endereço"); //o conteúdo precisa indicar qual é o erro
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json"); //vai fazer um arquivo json
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente");
    }
}