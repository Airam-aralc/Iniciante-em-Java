public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1; //começa a testar a partir do próximo número

        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++; //enquanto não for primo, soma 1
        }
        return proximoNumero; //quando encontrar o primo, retorna
    }
}
