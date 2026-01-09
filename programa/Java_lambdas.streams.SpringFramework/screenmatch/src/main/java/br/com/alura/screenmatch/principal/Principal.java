package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    //As variáveis de instância ficam fora dos métodos
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=463d14c9";

    //O metodo exibeMenu() é um metodo da classe, não do main
    public void exibeMenu() {
        System.out.println("Digite o nome da série: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }

        temporadas.forEach(System.out::println);
        temporadas.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));

        //flatMap irá criar uma lista dentro de outra lista
        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodio().stream())
                .collect(Collectors.toList());

        //Pegar os cinco melhores episodios
        System.out.println("\nTOP 10 episódios:");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                //.peek(e -> System.out.println("Primeiro filtro (N/A) " + e))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                //.peek(e -> System.out.println("Ordenação " + e))
                .limit(10)
                //.peek(e -> System.out.println("Limite " + e))
                .map(e -> e.titulo().toUpperCase())
                //.peek(e -> System.out.println("Mapeamento " + e))
                .forEach(System.out::println);

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodio().stream()
                        .map(d -> new Episodio(t.numero(), d))
                ).collect(Collectors.toList());

        episodios.forEach(System.out::println);

//        System.out.println("Digite um trecho do título para buscar:");
//        var trechoTitulo = leitura.nextLine();
//
//        Optional<Episodio> episodioBusca = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase())) //coloca o titulo digitado pelo usuário e o da API tudo em maiúsculo
//                .findFirst();
//
//        if(episodioBusca.isPresent()){
//            System.out.println("Encontrei o episódio!");
//            System.out.println("Temporada: " + episodioBusca.get().getTemporada());
//        } else {
//            System.out.println("Episodio não encontrado");
//        }

//        System.out.println("A partir de que ano você quer ver os episódios?");
//        var ano = leitura.nextInt(); // Usamos nextInt para capturar o número diretamente
//        leitura.nextLine(); // Limpamos o buffer após ler o número
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
//                .forEach(e -> System.out.println(
//                        "Temporada: " + e.getTemporada() +
//                                " | Episódio: " + e.getTitulo() +
//                                " | Data de lançamento: " + e.getDataLancamento().format(formatador)
//                ));

        Map<Integer,Double> avaliacaoPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));

        System.out.println(avaliacaoPorTemporada);

        //Coletando estatísticas 
        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
        System.out.println("Média: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " + est.getCount());
    }

    //O main apenas inicia a execução
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.exibeMenu();
    }
}