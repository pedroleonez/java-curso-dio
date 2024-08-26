public class Contas extends Cofre {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected double saldo;
    protected int agencia;
    protected int numConta;
    protected Cliente cliente;

    public Contas(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("SALDO INSUFICIENTE!");
//            return;
        } else if (cofre < valor) {
            System.out.println("O banco não possui recursos suficientes para essa operação, tente novamente mais tarde.");
//            return;
        } else {
            saldo -= valor;
            cofre -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        cofre += valor;
    }

    public void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("TRANFERÊNCIA REALIZADA COM SUCESSSO!");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}
