package playground.codeWars2015;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by aaron on 4/20/17.
 */
public class prob13 {
    public static void main(String[] args) {
        InputStream inputstream = prob13.class.getResourceAsStream("prob13-input.txt");
        if (inputstream != null) {
            System.setIn(inputstream);
        }
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            String acronym = scanner.next();
            String phrase = scanner.nextLine().trim();
            System.out.println(phrase);
        }
        String[] a = {"A", "B", "CCC"};
        System.out.println(String.join("-", a));
    }
}
