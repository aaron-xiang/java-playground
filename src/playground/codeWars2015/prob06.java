package playground.codeWars2015;

import java.util.Scanner;

import static java.lang.Math.*;
/**
 * Created by aaron on 4/7/17.
 */
public class prob06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        double v = (x * y * z)/27.0;
        int vol = (int) ceil(v);
        System.out.println(vol);

    }
}
