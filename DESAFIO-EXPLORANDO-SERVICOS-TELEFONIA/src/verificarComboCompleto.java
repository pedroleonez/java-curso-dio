import java.util.Scanner;

public class VerificarComboCompleto {
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Iterando sobre os serviços contratados
        for (String servico : servicosContratados) {
            if (servico.equals("movel")) {
                movelContratado = true;
            } else if (servico.equals("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.equals("tv")) {
                tvContratada = true;
            }
        }

        // Verificando se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();

    }
}
