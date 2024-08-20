import java.util.Scanner;

public class For_Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qntRepeticoes = sc.nextInt();

        for (int repeticao : new int[qntRepeticoes]) {
            if (repeticao % 2 == 0) {
                System.out.println("010101");
            } else {
                System.out.println("101010");
            }
        }

        sc.close();
    }
}
