public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 1000;
        double saque = 349.50;

        if (saldo > saque) {

            saldo = saldo - saque;
            System.out.println("Transação aceita, saque de R$: " + saque + ", agora seu saldo é de R$: " + saldo);
        }
    }

}
