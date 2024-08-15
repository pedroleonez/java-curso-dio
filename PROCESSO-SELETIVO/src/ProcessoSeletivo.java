import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        imprimirSelecioandos();
    }

    static void imprimirSelecioandos() {
        String [] candidatos = {"ANA", "BRENA", "CARLA", "DAIANE", "EMANUELE"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidatos de nº " + (indice + 1) + " é a " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"ANA", "BRENA", "CARLA", "DAIANE", "EMANUELE", "FERNANDA", "GABRIELA", "HANNA", "IASMIN", "JENNIEFER", "KELLY", "MANUELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("A candidata " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("A candidata " + candidato + " foi selecionada para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDITADO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDITADOS");
        }
    }
}
