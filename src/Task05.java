import java.util.Scanner;

/**
 * Created by aaron on 4/22/17.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            boolean isPrime = true;
            for (int j = 2; j < t/2; j++) {
                if (t%j == 0) {
//                    System.out.println("false");
                    isPrime = false;
                    break;
                }
//                else {
//                    System.out.println("true");
//                    break;
//                }
            }
            if (t == 2) {
                isPrime = true;
            }
            if (t == 1) {
                isPrime = false;

            }
            System.out.println(isPrime);
//            if (t%5 == 0) {
//                System.out.println("false");
//            }
        }
    }
}

//2
//18
//419