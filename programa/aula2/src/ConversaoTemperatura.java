public class ConversaoTemperatura {
    public static void main(String [] args){
        System.out.println("Programa para conversão de temperatura de celsius para Fahrenheit");

        double temperatura = 28;
        double temperaturaConversao = (temperatura * 1.8) + 32;

        System.out.println("a temperatura " + temperatura + "°C é de " + temperaturaConversao + "°F");

        int temp = (int) (temperaturaConversao); //uso do casting
        System.out.println(temp + "°F : valor convertido para inteiro");
    }
}
