public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "M"; // Planos (T), (M) e (B)

        //Switch sem o break para não parar a execução do bloco e pegar os próximos.
        switch (plano) {
            case "T":
                System.out.println("5GB de Youtube!");
            case "M":
                System.out.println("Whats e Instagram grátis!");
            case "B":
                System.out.println("Ligações ilimitadas!");
        }
    }
}
