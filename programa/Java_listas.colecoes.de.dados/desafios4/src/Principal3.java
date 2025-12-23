import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal3 {

    public static void main(String[] args){
        List<String> listaPolimorfica;

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        listaPolimorfica.add("Elemento 3");
        System.out.println("Lista com o LinkedList: " + listaPolimorfica);


        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        listaPolimorfica.add("Elemento C");
        System.out.println("Lista com o ArrayList: " + listaPolimorfica);
    }
}
