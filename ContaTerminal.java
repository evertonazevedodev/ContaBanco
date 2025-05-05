import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //Criação de conta bancária

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = new BigDecimal(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
