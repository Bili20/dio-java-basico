import java.util.Scanner;

public class ContaTerminal {
    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência !: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor digite seu numero: ");
        numero = scanner.nextInt();

        System.out.print("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
