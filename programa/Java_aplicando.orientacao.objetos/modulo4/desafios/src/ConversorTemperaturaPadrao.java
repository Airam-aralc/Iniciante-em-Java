public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double resultadoFah = (1.8 * celsius) + 32;
        System.out.println("\n" + celsius + "° celsius é " + resultadoFah + "° em Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double resultadoCel = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + "° fahrenheit é " + resultadoCel + "° em celsius");
    }
}
