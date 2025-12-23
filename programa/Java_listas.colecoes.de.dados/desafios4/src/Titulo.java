public class Titulo implements Comparable<Titulo>{

    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) { //"Eu vou te ensinar como comparar dois objetos do tipo Titulo"
        return this.nome.compareTo(outroTitulo.getNome());
    }
}
