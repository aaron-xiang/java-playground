package playground.codeWars;

import java.util.Scanner;

/**
 * Created by aaron on 3/17/17.
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            int y = scanner.nextInt();
            String w = scanner.next();
            int n = 0;
            for (int j = 0; j < w.length(); j++) {
                if (j % y != 0) {
                    System.out.print(w.charAt(j));
                    n += 1;
                }
            }
            System.out.println(" " + n);
        }

    }
}
