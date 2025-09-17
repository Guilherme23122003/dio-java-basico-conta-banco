import java.util.Scanner;

public class ContaDoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nome Cliente
        System.out.print("Por favor, digite seu nome: ");
        String nomeDoCliente = scanner.nextLine();

        //Número do CPF
        System.out.println("Por favor, informe seu CPF");
        String cpf = scanner.nextLine();
        
        //Por favor, informe seu saldo
        System.out.print("Por favor, informe seu saldo: ");
        double saldoConta = scanner.nextDouble();

        Usuario user = new Usuario(nomeDoCliente, cpf, saldoConta);

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + user.getAgencia() + ", conta: " + user.getNumeroDaConta() + " saldo atual: " + saldoConta);
        scanner.close();
    }
}
