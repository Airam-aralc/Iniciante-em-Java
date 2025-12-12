//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados (Principal1).

public class ContaBancaria {

    private double numeroConta;
    private double saldo;
    public String titular;

    //Permite acessar os atributos privados na classe Principal1
    public void setNumeroConta(double numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodo acessor- O usuário vai poder acessar, mas não modificar
    public double getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
}
