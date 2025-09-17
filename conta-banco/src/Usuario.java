public class Usuario {
    private String nomeDoCliente;
    private String cpf;
    private int numeroDaConta;
    private int agencia;
    private Double Saldo;

    private static int contadorAgencia = 1;
    private static int contadorConta = 2;

    public Usuario(String nomeDoCliente, String cpf, Double saldo) {
        this.nomeDoCliente = nomeDoCliente;
        this.cpf = cpf;
        this.numeroDaConta = contadorConta++;
        this.agencia = contadorAgencia++;
        Saldo = saldo;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    public static int getContadorAgencia() {
        return contadorAgencia;
    }

    public static void setContadorAgencia(int contadorAgencia) {
        Usuario.contadorAgencia = contadorAgencia;
    }
}
