import java.util.Scanner;

public class For_Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int qas = 0;

        for (char as : s.toCharArray()) {
            if (as == 'a') {
                qas++;
            }
        }

        System.out.println(qas);

        sc.close();
    }
}
