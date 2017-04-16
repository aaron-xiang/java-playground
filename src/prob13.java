import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by aaron on 3/24/17.
 */
public class prob13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            scanner.next();
            scanner.next();
            double r = scanner.nextDouble();
            double ra = 15*(a+b/60);
            double dec = (c > 0) ? c+d/60 : c-d/60;
            double theta = (90 - dec) * PI/180;
            double phi = ra * PI/180;
            double x = r * sin(theta) * cos(phi);
            double y = r * sin(theta) * sin(phi);
            double z = r * cos(theta);
            System.out.printf("%s x=%.2f, y=%.2f, z=%.2f\n", name, x, y, z);
        }
    }
}
