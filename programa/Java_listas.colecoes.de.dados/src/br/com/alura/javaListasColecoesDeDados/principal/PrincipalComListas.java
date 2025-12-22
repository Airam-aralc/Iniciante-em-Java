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

        Filme f1 = maisUmFilme; //variável de referência, não é a criação de outro objeto
        //f1.setNome(2000);

        ArrayList<Titulo> lista = new ArrayList<>(); // irá armazenar os filmes
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
    }
}
