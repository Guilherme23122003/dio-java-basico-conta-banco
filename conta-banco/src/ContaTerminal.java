import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Por favor, digite o Nome Cliente
        System.out.print("Por favor, digite seu nome: ");
        String nomeDoCliente = scanner.nextLine();



        //Por favor, digite o número da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); //Limpando o buffer

        //Por favor, digite o número da Agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();



        //Por favor, informe seu saldo
        System.out.print("Por favor, informe seu saldo: ");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
