public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void comida(){
        System.out.println("Cachorro gosta de roer osso");
    }
}
