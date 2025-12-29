import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHub {

    public static void main(String[] args){
        Scanner  leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuário do GitHub para consulta: ");
        String name = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + name;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub");
            }

            String json = response.body();
            System.out.println(json);

            Gson gson = new Gson();
            UserGitHub meuUsuario = gson.fromJson(json, UserGitHub.class);

            System.out.println("------------DADOS FORMATADOS ----------------");
            System.out.println("Login: " + meuUsuario.login());
            System.out.println("ID: " + meuUsuario.id());
            System.out.println("Perfil: " + meuUsuario.html_url());

        } catch (IOException | InterruptedException e){
            System.out.println("Opa! Houve um erro durante a consulta");
            e.printStackTrace();
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
