package playground.codeWars;

import java.util.Scanner;

/**
 * Created by aaron on 3/15/17.
 */
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        while (x != 0 && n != 0) {
            System.out.printf("%.2f\n", x * Math.pow(10, n));
            x = scanner.nextDouble();
            n = scanner.nextInt();
        }
    }
}
