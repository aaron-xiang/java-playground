import java.util.Scanner;

/**
 * Created by aaron on 4/22/17.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            char[] code = line.toCharArray();
            for (char c : code) {
                char decode = (char) ('z' - (c-'a'));
                if (c == ' ') {
                    decode = ' ';
                }
                System.out.print(decode);
            }
            System.out.println("");
        }
    }
}
