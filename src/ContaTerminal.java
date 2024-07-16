import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String clienteNome = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String clienteAgencia = scanner.nextLine();

        System.out.print("Agora informe o número da conta: ");
        Integer clienteNumeroCC = scanner.nextInt();

        System.out.print("Qual o saldo da sua conta: ");
        Double clienteSaldo = scanner.nextDouble();

        System.out.print("Olá " + clienteNome + ",");
        System.out.print("obrigado por criar uma conta em nosso banco,");
        System.out.print("sua agência é " + clienteAgencia +",");
        System.out.print("conta "+ clienteNumeroCC );
        System.out.print(" e seu saldo " + clienteSaldo +" já está disponível para saque.");
    }
}