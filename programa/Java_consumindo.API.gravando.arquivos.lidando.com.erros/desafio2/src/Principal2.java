import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal2 {

    public static void main(String[] args){
        String jsonLivro = """
                {
                    "Titulo": "As mentiras de Lock Lamora",
                    "Autor": "Scott Lynch",
                    "Editora": {
                        "Nome": "Arqueiro",
                        "Cidade": "Rio de Janeiro"
                    }
                }
                """;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Livro completo: " + livro);
        System.out.println("Somente a editora: " + livro.editora().nome());
    }
}
