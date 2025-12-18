import br.com.alura.modulo5.modelos.Musica;
import br.com.alura.modulo5.modelos.Podcast;

public class Principal {

    public static void main (String[] args){
        Podcast podcast = new Podcast();
        podcast.setTituloPodcast("Como a tecnologia muda o mundo?");
        podcast.setDuracao(55000);
        podcast.setTotalDeReproducao(10000);
        podcast.setCurtidas(5000);
        podcast.setClassificacao(29);
        podcast.setEpisodios(10);
        podcast.tituloDaObras();
        podcast.exibeFichaTecnica();

        Musica musica = new Musica();
        musica.setTituloMusica("Blade Runner - A balada dos Androids");
        musica.setDuracao(180);
        musica.setTotalDeReproducao(20000);
        musica.setCurtidas(15000);
        musica.setClassificacao(10);
        musica.setNomeDoAlbum("Androids sonham com ovelhas elétricas?");
        musica.tituloDaObras();
        musica.exibeFichaTecnica();
    }
}
