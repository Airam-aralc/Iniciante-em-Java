import com.google.gson.Gson;

public class Principal2 {

    public static void main(String[] args){
        Veiculo veiculo = new Veiculo("Onix", 2016, true);

        Gson gson = new Gson();
        String json = gson.toJson(veiculo);

        System.out.println("Objeto Veiculo serializado para json");
        System.out.println(json);
    }
}
