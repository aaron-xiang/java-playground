import java.util.Scanner;


/**
 * Created by aaron on 3/30/17.
 */
public class prob00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int y = scanner.nextInt();
        while (x != 0) {
            System.out.printf("%.2f\n", x * Math.pow(10, y));
            x = scanner.nextDouble();
            y = scanner.nextInt();
        }
    }
}