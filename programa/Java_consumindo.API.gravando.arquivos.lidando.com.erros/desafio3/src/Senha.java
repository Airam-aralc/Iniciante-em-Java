import java.util.Scanner;

public class Senha {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha (String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException("A senha tem que ter no mínimo 8 caracteres.");
        }
    }
}