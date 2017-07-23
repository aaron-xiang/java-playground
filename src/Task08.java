import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aaron on 4/22/17.
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        List<Character> result = new ArrayList<>();
        for (char c : a.toCharArray()) {
            if (b.indexOf(c) >= 0) {
                result.add(c);
//                System.out.print(c);
            }
        }
        result.sort(Character::compareTo);
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : result) {
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder.toString());
    }
}
