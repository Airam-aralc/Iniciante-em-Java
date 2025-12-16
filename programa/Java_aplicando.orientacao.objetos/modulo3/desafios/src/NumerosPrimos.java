public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero) { //recebe um número inteiro, se for primo é "true" e se não for é "false"
        if (numero <= 1){ //números menores que 1 não são primos.
            return false;
        }

        //os números primos são divisíveis por um (assim como todos os números) e por ele mesmo
        for(int i = 2; i * i <= numero; i++){ //inicia em 2, porque o 1 é comum para primos e não primos, o laço vai rodar até a raiz quadrada de i for menor do que o número.
            if(numero % i == 0){
                return false; //Se não dividir até aqui, o número é primo
            }
        }

        return true; //o número é primo
    }

    public void listarPrimos(int limiteSperior){ //Listar todos os números primos até esse valor
        System.out.println("Números primos até " + limiteSperior + ": ");

        for(int i = 2; i <= limiteSperior; i++){ //testar a partir de 2 até o limite
            if(verificarPrimalidade(i)){
                System.out.println(i + " "); //mostrar apenas os números primos
            }
        }
        System.out.println();
    }
}
