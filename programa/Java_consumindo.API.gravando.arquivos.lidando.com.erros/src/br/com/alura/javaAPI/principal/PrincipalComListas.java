package br.com.alura.javaAPI.principal;

import br.com.alura.javaAPI.modelos.Filme;
import br.com.alura.javaAPI.modelos.Series;
import br.com.alura.javaAPI.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Senhor dos anéis: Sociedade do anel", 2001);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("O Hobbit", 2012);
        outroFilme.avalia(8);
        Filme maisUmFilme = new Filme("O Senhor dos anéis: O retorno do rei", 2002);
        maisUmFilme.avalia(9.5);
        Series series = new Series("Lost", 2000);
        series.avalia(7);

        Filme f1 = maisUmFilme; //variável de referência, não é a criação de outro objeto

        List<Titulo> lista = new LinkedList<>(); // irá armazenar os filmes
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(series);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { //Perguntar se é um filme ou uma série, já declarou o Filme como filme e colocou um comparador. Não é muito elegante, mas alguns códigos ainda é usado
                System.out.println("Classificação do filme: " + filme.getClassificacao());
            }
        }

        //ordenando listas
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Leonardo Da Vinci");
        buscaPorArtista.add("Pablo Pícasso");
        buscaPorArtista.add("Arlindo Cruz");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); //ordem alfabética
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de título depois da ordenação");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //Comparador
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}