public class Principal2 {

    public static void main(String[] args){
        IdadePessoa sujeito = new IdadePessoa();
        sujeito.setNome("Maria"); //Privado
        sujeito.setIdade(21); //Privado

        System.out.println("\n" + sujeito.getNome() + " tem " + sujeito.getIdade() + " anos");
        sujeito.verificarIdade();
    }
}
