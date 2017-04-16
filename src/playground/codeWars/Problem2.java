package playground.codeWars;

import java.util.Scanner;

/**
 * Created by aaron on 3/15/17.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while ((x = scanner.nextInt()) != 0) {
            String formatString = "%d gallons per week will last %d weeks";
            String output = String.format(formatString, x, 10000/x);
            System.out.println(output);
//            System.out.printf("%d gallons per week will last %d weeks\n", x, 10000/x);
        }
    }
}
