import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModificandoComSet {
    public static void main(String[] args){

        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Phyton");
        linguagens.add("C");
        linguagens.add("C++");
        linguagens.add("C#");
        linguagens.add("C");
        linguagens.add("Java");

        Set<String> linguagensUnicas = new HashSet<>(linguagens);
        System.out.println(linguagensUnicas);
    }
}
