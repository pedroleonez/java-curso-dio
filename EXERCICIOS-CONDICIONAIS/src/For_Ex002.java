import java.util.Scanner;

public class For_Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int v[] = new int[x];

        for (int j = 0; j < v.length; j++) {
            v[j] = sc.nextInt();
        }

        sc.close();

        int in = 0;
        int out = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= 10 && v[i] <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
