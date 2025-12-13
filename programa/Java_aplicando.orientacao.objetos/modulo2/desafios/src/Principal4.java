public class Principal4 {

    public static void main(String[] args){
        Aluno aluno = new Aluno("Maria", 10,6,7.5);

        System.out.println("\nA aluna " + aluno.getNome() + " com notas: " + aluno.getNota1() + ", " + aluno.getNota2() + " e " + aluno.getNota3());
        System.out.println("Tem média de " + aluno.calculeMedia() + " pontos");
    }
}
