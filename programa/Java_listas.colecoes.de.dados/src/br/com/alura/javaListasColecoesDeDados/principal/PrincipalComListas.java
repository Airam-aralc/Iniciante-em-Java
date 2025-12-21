package br.com.alura.javaListasColecoesDeDados.principal;

import br.com.alura.javaListasColecoesDeDados.modelos.Filme;
import br.com.alura.javaListasColecoesDeDados.modelos.Series;
import br.com.alura.javaListasColecoesDeDados.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Hobbit", 2012);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Senhor dos anéis: Sociedade do anel", 2001);
        outroFilme.avalia(10);
        Filme maisUmFilme = new Filme("Senhor dos anéis: O retorno do rei", 2002);
        maisUmFilme.avalia(9.5);
        Series series = new Series("Lost", 2000);
        series.avalia(7);

        ArrayList<Titulo> lista = new ArrayList<>(); // irá armazenar os filmes
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(series);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }
    }
}
