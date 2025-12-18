package br.com.alura.modulo5.modelos;

//Heranca
public class Podcast extends Audio {
    protected String tituloPodcast;
    private int episodios;

    public String getTituloPodcast() {
        return tituloPodcast;
    }
    public void setTituloPodcast(String titulo) {
        this.tituloPodcast = titulo;
    }

    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override //Polimorfismo
    public void tituloDaObras() {
        System.out.println("\nO Podcast: " + tituloPodcast);;
    }

    public void exibeFichaTecnica(){
        System.out.println("Tem " + episodios + " episódios ao todo.");
        super.exibeFichaTecnica();
    }
}
