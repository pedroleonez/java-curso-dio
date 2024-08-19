import java.util.Scanner;

public class For_Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[3];
        
        vetor[0] = sc.nextInt();
        vetor[1] = sc.nextInt();
        vetor[2] = sc.nextInt();
        
        sc.close();

        int soma = 0;

        for (int numero : vetor) {
            soma = soma + numero;
        }

        System.out.println(soma);
    }
}
