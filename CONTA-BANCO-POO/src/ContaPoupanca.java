public class ContaPoupanca extends Contas {
    public ContaPoupanca (Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO DA CONTA POUPANÇA ===");
        super.mostrarInfo();
    }
}
