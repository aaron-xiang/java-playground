import java.util.Scanner;

/**
 * Created by aaron on 3/24/17.
 */
public class prob08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < a.length()-1; j++) {
                s.append(" ");
            }
            String ss = s + a + s;
            for (int j = 0; j < 2*a.length()-1; j++) {
                System.out.println(ss.substring(j, j + a.length()));
            }
            System.out.println("");
        }
    }
}
