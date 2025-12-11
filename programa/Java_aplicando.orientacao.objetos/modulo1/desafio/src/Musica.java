public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacao;

    //Metodos
    void exibeFichaTecnica(){
        System.out.println("\nNome do filme: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia (double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }

    double media(){
        return avaliacao / numAvaliacao;
    }
}
