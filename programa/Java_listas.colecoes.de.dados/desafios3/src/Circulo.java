public class Circulo implements Forma{

    double raio;

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}
