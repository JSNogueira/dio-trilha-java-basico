import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero = 0;
        String agencia = new String();
        String nomeCliente = new String();
        double saldo = 0.0f;

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o numero da agencia: ");
        agencia = scan.nextLine();

        System.out.print("Por favor, digite o numero da conta: ");
        numero = scan.nextInt();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
