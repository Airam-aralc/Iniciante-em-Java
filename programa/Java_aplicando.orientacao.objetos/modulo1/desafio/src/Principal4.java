public class Principal4 {

    public static void main (String[] args){
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Onix";
        meuCarro.cor = "Branco";
        meuCarro.ano = 2018;

        meuCarro.fichaTecnica();
        System.out.println("O carro tem " + meuCarro.calculaIdade() + " anos");
    }
}
