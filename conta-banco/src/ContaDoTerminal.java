public class ContaDoTerminal extends Usuario {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta();
        banco.criarConta();

        banco.listarContas();
    }
}