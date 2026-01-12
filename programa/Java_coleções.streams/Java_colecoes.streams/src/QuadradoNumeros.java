import java.util.List;
import java.util.stream.Collectors;

public class QuadradoNumeros {
    public static void main(String[] args){

        List<Integer> numeros = List.of(2, 3, 5, 9,11);

        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + quadrados);
    }
}
