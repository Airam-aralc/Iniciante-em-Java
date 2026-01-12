import java.util.List;
import java.util.stream.Collectors;

public class SelecionaNomes {
    public static void main(String[] args){

        List<String> nomesFuncionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Ded");

        List<String> nomesCurtos = nomesFuncionarios.stream()
                .filter(nome -> nome.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(nomesCurtos);
    }
}
