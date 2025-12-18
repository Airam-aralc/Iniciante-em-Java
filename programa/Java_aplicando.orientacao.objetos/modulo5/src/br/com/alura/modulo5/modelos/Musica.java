package br.com.alura.modulo5.modelos;

//Heranca
public class Musica extends Audio {
    protected String tituloMusica;
    private String nomeDoAlbum;

    public String getTituloMusica() {
        return tituloMusica;
    }
    public void setTituloMusica(String tituloMusica) {
        this.tituloMusica = tituloMusica;
    }

    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }
    public void setNomeDoAlbum(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
    }

    @Override //Polimorfismo
    public void tituloDaObras() {
        System.out.println("\nA musica " + tituloMusica);
    }

    public void exibeFichaTecnica(){
        System.out.println("Presente no album: " + nomeDoAlbum);
        super.exibeFichaTecnica();
    }
}
