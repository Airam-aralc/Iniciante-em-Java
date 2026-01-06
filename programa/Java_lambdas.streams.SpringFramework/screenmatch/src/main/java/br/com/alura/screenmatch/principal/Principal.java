package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    //Usamos o "final" e letras maiúsculas para constantes, naõ iremos modificar depois
    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=463d14c9";

    public void exibeMenu(){
        System.out.println("Digite o nome da série: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);


        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i<= dados.totalTemporadas(); i++){
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + "&" + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println); //Cada elemento da lista será impresso

//        for (int i = 0; i < dados.totalTemporadas(); i++){
//            List<DadosEpisodio> episodiosTemporadas = temporadas.get(i).episodio();
//            //Irá pegar somente os títulos da série
//            for (int j = 0; j < episodiosTemporadas.size(); j++){
//                System.out.println(episodiosTemporadas.get(j).titulo());
//            }
//        }

        // ( -> ) São lambdas, usados para trabalhar com coleções
        temporadas.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));
    }
}
