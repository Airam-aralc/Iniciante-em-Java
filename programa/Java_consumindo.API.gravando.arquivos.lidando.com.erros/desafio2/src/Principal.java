import com.google.gson.Gson;

public class Principal {

    public static void main (String[] args){
        String jsonPesssoa = """
                {  
                    "nome": "Maria",
                    "idade": 21,
                    "cidade": "Belo Horizonte"
                }
                """; //Text Blocks

        Gson gson = new Gson(); //importou o Gson do google pelo "Project Structure"
        Pessoa pessoa = gson.fromJson(jsonPesssoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);
    }
}