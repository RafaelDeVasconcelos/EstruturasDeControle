public class SistemaMedida {
    public static void main(String[] args) {

        //Medidas (P), (M), (G), (GG), (XG).
        String tamanho = "G";

        switch (tamanho) {
            case "P":
                System.out.println("Tamanho (P)!");
                break;

            case "M":
                System.out.println("Tamanho (G)!");
                break;

            case "G":
                System.out.println("Tamanho (M)!");
                break;

            case "GG":
                System.out.println("Tamanho (GG)!");
                break;

            case "XG":
                System.out.println("Tamanho (XG)!");
                break;

            default:
                System.out.println("Tamanho inválido, defina o valor com (P), (M), (G), (GG), (XG).");


        }
    }
}
