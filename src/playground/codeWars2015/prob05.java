package playground.codeWars2015;

import java.util.Scanner;

/**
 * Created by aaron on 4/7/17.
 */
public class prob05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.printf("%d x (%d + %d) = %d + %d + %d x %d\n", x, y, z, x, y, x, z);
        System.out.printf("%d x %d = %d + %d\n", x, y+z, x*y, x*z);
        System.out.printf("%d = %d\n", x*(y+z), x*y+x*z);
    }
}
