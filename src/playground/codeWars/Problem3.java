package playground.codeWars;

import java.util.Scanner;

/**
 * Created by aaron on 3/15/17.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            String word = scanner.next();
            //System.out.println(word);
            if (findDups(word)) {
                System.out.println("likes " + word);
            } else {
                System.out.println("hates " + word);
            }
        }
    }

    public static boolean findDups(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return true;
            }
        }
        return false;
    }

//    public static boolean findDups2(String word) {
//        for (int i = 0; i < word.length()-1; i++) {
//            if (word.charAt(i) == word.charAt(i+1))
//                return true;
//        }
//        return false;
//    }
//}
}