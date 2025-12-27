import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {

    public static void main(String[] args){
        String jsonPesssoa = """
                {  
                    "nome": "Maria",
                    "idade": 21
                }
                """; //Text Blocks

        //Personalizar para criar uma instância personalizada com o GsonBuilder
        Gson gson = new GsonBuilder()
                .setLenient() //torna o analisador mais tolerante a erros JSON
                .create();

        //Transformando a String Json em um Objeto Pessoa
        Pessoa pessoa = gson.fromJson(jsonPesssoa, Pessoa.class); //o primeiro é a string, o segundo é para que classe converter

        System.out.println(pessoa);
    }
}