public class Carro {
    //Atributos
    String modelo;
    String cor;
    int ano;

    //Metodos
    void fichaTecnica(){
        System.out.println("\nModelo do carro: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    int calculaIdade(){
        return 2025 - ano;
    }
}
