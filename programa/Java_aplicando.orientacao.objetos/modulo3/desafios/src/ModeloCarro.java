public class ModeloCarro extends Carro {
    private String detalhes;

    public void Detalhes(String detalhes){
        this.detalhes = detalhes;
    }

    public void exibirDetalhes(){
        System.out.println("\nDetalhes: " + detalhes);
    }
}
