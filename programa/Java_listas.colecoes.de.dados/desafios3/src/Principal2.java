public class Principal2 {

    public static void main (String[] args){
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;

            System.out.println("\nCasting realizado com sucesso!");
            cachorro.emitirSom();
            cachorro.comida(); // Agora podemos acessar métodos exclusivos de Cachorro
        } else {
            System.out.println("Não é um cachorro");
        }
    }
}
