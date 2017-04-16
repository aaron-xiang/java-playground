import java.util.Scanner;

public class prob14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < x; i++) {
            String a = scanner.nextLine();
            String[] codes = a.split("\\.");
            for (String code : codes) {
                if (code.isEmpty())
                    continue;
                String decoded = decode(code);
                System.out.print(decoded + ".");
            }
            System.out.println("");
        }
    }

    private static String decode(String code) {
        int size = code.length();
        char[] decoded = new char[size];
        char[] line = code.toCharArray();
        int indexCode = 0, indexDecode = 0;
        char currentChar = line[0];
        int counter;
        for (int j = 0; j < size; j++) {
            currentChar = line[indexCode];
            line[indexCode] = '-';
            decoded[j] = currentChar;
            if (j == size-1)
                break;
            //indexDecode += 1;
            counter = getCount(currentChar);
            while (counter > 0) {
                indexCode = (indexCode + 1)%(line.length);
                if (line[indexCode] != '-') {
                    counter -= 1;
                }
            }
        }
        return new String(decoded);
    }

    public static int getCount(char c) {
        if (c == ' ') {
            return 6;
        }
        else {
            return (c-'A')%5+1;
        }
    }
}

