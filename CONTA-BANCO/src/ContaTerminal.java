import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String cliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite quanto deseja depositar: ");
        double saldo = sc.nextDouble();

        System.out.println("Seu nome é: " + cliente);
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Seu saldo é: " + saldo);

        System.out.println("----------------------------------");

        System.out.println("Deseja sacar algum valor? (s/n)");
        String sacar = sc.next();

        if (sacar.equals("s")) {
            System.out.println("Por favor, digite quanto deseja sacar: ");
            double saque = sc.nextDouble();
            if (saque > saldo) {
                System.out.println("Valor de saldo insufuciente!");
                System.out.println("Obrigado pela operação conosco. Tenha um bom dia!");
            }
            else {
                saldo = saldo - saque;
                System.out.printf("Você sacou R$ %.2f e seu novo saldo é de R$ %.2f.%n", saque, saldo);
                System.out.println("Obrigado pela operação conosco. Tenha um bom dia!");
            }
        }
        else {
            System.out.println("Obrigado pela operação conosco. Tenha um bom dia!");
        }

        sc.close();
    }
}
