import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args){

        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("\nLista de funcionários: " + funcionarios);
        System.out.println("\nA segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("Quantidade de funcionários: " + funcionarios.size());
    }
}
