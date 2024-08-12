import java.util.Scanner;

public class For_Ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        sc.close();

        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}