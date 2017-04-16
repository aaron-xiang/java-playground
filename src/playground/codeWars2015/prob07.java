package playground.codeWars2015;

import java.util.Scanner;

/**
 * Created by aaron on 4/7/17.
 */
public class prob07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double p = scanner.nextDouble();
            if (p == 0) {
                break;
            }
            System.out.println(Math.pow(p, 2/3.0));
        }
    }
}
