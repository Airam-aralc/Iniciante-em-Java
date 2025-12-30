import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

    public static void main(String[] args){
        String escrita = "Conteúdos a ser gravado no arquivo";

        try (FileWriter arquivo = new FileWriter("arquivo.txt")){
            arquivo.write(escrita);
            System.out.println("Dados gravados com sucesso");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
