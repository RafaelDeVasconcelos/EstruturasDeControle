public class ResultadoEscolarTernário {
    public static void main(String[] args) {

        int nota = 4;

        //Ternário composto
        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);

        //Ternário encadeado
        String resultado2 = nota >= 7 ? "Aprovado!" : nota < 7 && nota >= 5 ? "Recuperação" : "Reprovado!";
        System.out.println(resultado2);
    }
}
