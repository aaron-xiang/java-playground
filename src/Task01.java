import java.util.Scanner;

/**
 * Created by aaron on 4/22/17.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            double o = scanner.nextDouble();
            System.out.printf("%.2f\n", n/o);
        }
    }
}
