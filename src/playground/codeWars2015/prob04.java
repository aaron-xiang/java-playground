package playground.codeWars2015;

import java.util.Scanner;

/**
 * Created by aaron on 4/7/17.
 */
public class prob04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            System.out.println(x*y);
        }
    }
}
