public class ResultadoEscolareEncadeado {
    public static void main(String[] args) {

        int notaAluno = 4;

        if (notaAluno >= 7) {
            System.out.println("Aluno aprovado!");

        } else if (notaAluno < 7 && notaAluno >= 5) {
            System.out.println("Aluno em recuperação!");

        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
