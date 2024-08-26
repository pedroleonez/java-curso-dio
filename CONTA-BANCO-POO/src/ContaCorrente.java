public class ContaCorrente extends Contas {
    public ContaCorrente (Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO DA CONTA CORRENTE ===");
        super.mostrarInfo();
    }
}
