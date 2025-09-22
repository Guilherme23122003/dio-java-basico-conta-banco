import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Usuario> contaCriada = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Usuario> getContaCriada() {
        return contaCriada;
    }

    public void setContaCriada(List<Usuario> contaCriada) {
        this.contaCriada = contaCriada;
    }

    public void criarConta() {

        System.out.print("Por favor, digite seu nome: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Por favor, informe seu CPF");
        String cpf = scanner.nextLine();

        Usuario user = new Usuario(nomeDoCliente, cpf);
        contaCriada.add(user);
        System.out.println("✅ Conta criada com sucesso para: " + user.getNomeDoCliente());
    }

    public void listarContas(){
        if (contaCriada.isEmpty()){
            System.out.println("Nenhuma conta criada...");
        } else {
            System.out.println("Contas cadastradas: ");
            for (Usuario user : contaCriada){
                System.out.println(user);
            }
        }
        System.out.println();
    }
}