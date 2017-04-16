import java.util.Scanner;
import static java.lang.Math.*;

public class prob11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            LOOP: for (int i = -100; i <= 100; i++) {
                for (int j = -100; j <= 100; j++) {
//                    System.out.println(i + ", " +j);
                    double d1 = pow(i, 2) + pow(100-j, 2);
                    double d2 = pow(i + 100, 2) + pow(j+100, 2);
                    double d3 = pow(i-100, 2) + pow(100+j, 2);
                    double p1 = a * d1;
                    double p2 = b * d2;
                    double p3 = c * d3;
                    double minp = min(min(p1, p2), p3);
                    double maxp = max(max(p1, p2), p3);
                    double error = (maxp - minp)/minp;
                    if (error < 1e-2) {
                        System.out.println(i + " " + j);
                        break LOOP;
                    }
                }
            }
        }
    }
}
