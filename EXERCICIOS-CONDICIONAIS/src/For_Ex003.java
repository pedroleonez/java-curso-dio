import java.util.Locale;
import java.util.Scanner;

public class For_Ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //ponto tanto na entrada quanto na saída
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //ponto na entrada

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = ((n1*2) + (n2*3) + (n3*5)) / 10;

            System.out.printf("%.1f%n" ,media);
        }

        sc.close();
        
    }
}
