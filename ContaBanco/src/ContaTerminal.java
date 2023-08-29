import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPor favor, digite o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.println("\nPor favor, digite sua agência: ");
        String agencia = scan.nextLine();

        System.out.println("\nPor favor, digite o número da conta: ");
        int numero = scan.nextInt();

        System.out.println("\nInsira o valor do seu saldo: "); //Separado por viírgula
        double saldo = scan.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
        scan.close();
    }
}
