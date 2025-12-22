import java.util.ArrayList;

public class Principal {

    public static void main (String[] args){
        ArrayList<String> listaLinguagens = new ArrayList<>();
        listaLinguagens.add("\nJava");
        listaLinguagens.add("Python");
        listaLinguagens.add("C++");

        for (String elemento : listaLinguagens) {
            System.out.println(elemento);
        }
    }
}
