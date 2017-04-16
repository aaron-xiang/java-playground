import java.util.Scanner;

/**
 * Created by aaron on 3/24/17.
 */
public class prob09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 0) {
                break;
            }
            int v2 = (a-2) * (b-2) * (c-2);
            int volume = a * b * c;
            if (v2 < volume - v2) {
                System.out.printf("A %dx%dx%d block is MORE than Perfect\n", a, b, c);
            }
            else if (v2 > volume - v2) {
                System.out.printf("A %dx%dx%d block is LESS than Perfect\n", a, b, c);

            }
            else {
                System.out.printf("A %dx%dx%d block is Perfect\n", a, b, c);

            }
        }
    }
}
