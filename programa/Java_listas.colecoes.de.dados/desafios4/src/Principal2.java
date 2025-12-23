import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal2 {

    public static void main(String[] args){
        Titulo t1 = new Titulo();
        t1.setNome("Bruno");

        Titulo t2 = new Titulo();
        t2.setNome("João");

        Titulo t3 = new Titulo();
        t3.setNome("André");

        Titulo t4 = new Titulo();
        t4.setNome("Carlos");

        List<Titulo> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);

        Collections.sort(lista);

        for (Titulo titulo : lista){
            System.out.println(titulo.getNome());
        }
    }
}
