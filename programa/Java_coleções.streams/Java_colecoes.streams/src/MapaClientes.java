import java.util.HashMap;
import java.util.Map;

public class MapaClientes {
    public static void main(String[] args){

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put (1, "Maria");
        clientes.put (2, "João");
        clientes.put (3, "Ana");
        clientes.put(4, "Lisa");
        clientes.put(5, "Marcos");

        int idCliente = 4;

        if (clientes.containsKey(idCliente)){
            String nomeCliente = clientes.get(idCliente);
            System.out.println("\nO nome do cliente com ID " + idCliente + " é: " + nomeCliente);
        } else {
            System.out.println("\nCliente com ID " + idCliente + " não encontrado");
        }
    }
}
