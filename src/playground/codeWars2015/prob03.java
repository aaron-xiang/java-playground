package playground.codeWars2015;

import java.util.Scanner;

/**
 * Created by aaron on 4/7/17.
 */
public class prob03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String[] s = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
        };
        System.out.printf("Number %s is alive!", s[x]);
    }
}
