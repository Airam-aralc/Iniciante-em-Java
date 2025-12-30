import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {

    public static void main(String[] args){
        Titulo meuTitulo = new Titulo("O Hobbit", 2011, 10.0);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(meuTitulo);

        System.out.println(json);
    }
}
