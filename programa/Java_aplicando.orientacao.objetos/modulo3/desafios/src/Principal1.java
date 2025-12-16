public class Principal1 {

    public static void main (String[] args){
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Onix");
        meuCarro.definirPrecos(22000,25000,20000);
        meuCarro.Detalhes("O carro é bastante confortável e versátil, ideal para a família toda");

        meuCarro.exibirInformacoes();
        meuCarro.exibirDetalhes();
    }
}
