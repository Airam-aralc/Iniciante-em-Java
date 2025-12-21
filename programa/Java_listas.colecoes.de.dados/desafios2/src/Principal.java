import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){
        Produto produtoPC = new Produto("PC Gamer", 2600.89, 1);

        Produto produtoPlaca = new Produto("Placa de vídeo", 1671.46, 1);

        Produto produtoMonitor = new Produto("Monitor_24 polegadas", 489.75, 2);

        ArrayList<Produto> listaGamer = new ArrayList<>();
        listaGamer.add(produtoPC);
        listaGamer.add(produtoPlaca);
        listaGamer.add(produtoMonitor);

        System.out.println("\nTamanho da lista: " + listaGamer.size());
        System.out.println(listaGamer.get(1));
        System.out.println("Ficha dos produtos\n" + listaGamer.toString());


        PodutoPeriferico periferico = new PodutoPeriferico("mouse", 50.69, 1, "Anubis");

        System.out.println("\n" + periferico);
    }
}
