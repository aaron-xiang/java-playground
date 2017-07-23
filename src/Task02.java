import java.util.Scanner;

/**
 * Created by aaron on 4/22/17.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            boolean found = false;
            String name = "";
            for (String w : line.split("\\s")) {
                if ("C3PO".equalsIgnoreCase(w) || "R2D2".equalsIgnoreCase(w)) {
                    found = true;
                    name = w;
                    break;
                }
            }
            if (found) {
                System.out.printf("%s isn't the droid we're looking for.", name);
            }
        }
    }
}

