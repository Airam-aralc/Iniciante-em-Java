public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero) { //recebe um número inteiro, se for primo é "true" e se não for é "false"
        if (numero <= 1){ //números menores que 1 não são primos.
            return false;
        }

        for(int i = 2; i * i <= numero; i++){ //2 é o primeiro divisor possível, vai até a raiz quadrada do número
            if(numero % i == 0){
                return false;//se o número for divisível por i, não é primo. Ex.: 10 % 2 == 0
            }
        }

        return true; //se não tem nenhum divisor, o número é primo
    }

    public void listarPrimos(int limiteSperior){ //Listar todos os números primos até esse valor
        System.out.println("Números primos até " + limiteSperior + ": ");

        for(int i = 2; i <= limiteSperior; i++){ //testar apartir de 2 até o limite
            if(verificarPrimalidade(i)){
                System.out.println(i + " "); //mostrar apenas os números primos
            }
        }
        System.out.println();
    }
}
