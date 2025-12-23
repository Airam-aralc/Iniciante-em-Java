import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args){
        List<Integer> listaNumeros = new LinkedList<>();
        listaNumeros.add(8);
        listaNumeros.add(7);
        listaNumeros.add(10);
        listaNumeros.add(1);
        listaNumeros.add(5);

        Collections.sort(listaNumeros);

        System.out.println("\nLista ordenada dos números: " + listaNumeros);
    }
}
