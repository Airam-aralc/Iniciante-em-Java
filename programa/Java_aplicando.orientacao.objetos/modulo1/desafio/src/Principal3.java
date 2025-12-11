public class Principal3 {

    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Homem-aranha";
        minhaMusica.artista = "Jorge Vercillo";
        minhaMusica.anoDeLancamento = 2018;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avalia(8);
        minhaMusica.avalia(9);
        minhaMusica.avalia(7);
        System.out.println(minhaMusica.avaliacao);
        System.out.println(minhaMusica.numAvaliacao);
        System.out.println(minhaMusica.media());
    }
}
