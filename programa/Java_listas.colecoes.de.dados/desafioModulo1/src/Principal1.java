import java.util.ArrayList;

public class Principal1 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", 21);
        Pessoa pessoa2 = new Pessoa("Pedro", 27);
        Pessoa pessoa3 = new Pessoa("Vilma", 51);
        Pessoa pessoa4 = new Pessoa("Sidiscley", 50);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);

        System.out.println("\nTamanho da lista " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista_ " + listaDePessoas.get(0));
        System.out.println("Lista completa:\n" + listaDePessoas);
    }
}
