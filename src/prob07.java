import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class prob07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String b = scanner.next();
            String c = scanner.next();
            Map<Character, Integer> m1 = new TreeMap<>();
            Map<Character, Integer> m2 = new TreeMap<>();
            Map<Character, Integer> m3 = new TreeMap<>();
            initMap(m1, a);
            initMap(m2, b);
            initMap(m3, c);
            for (char key : m1.keySet()) {
                if (m2.containsKey(key) && m3.containsKey(key)) {
                    for (int j = 0; j < min(m1.get(key), m2.get(key), m3.get(key)); j++) {
                        System.out.print(key);
                    }
                }
            }
            System.out.println("");
        }
    }

    private static void initMap(Map<Character, Integer> m, String a) {
        for (char k: a.toCharArray()){
            if (m.containsKey(k)) {
                m.put(k, m.get(k) + 1);
            }
            else {
                m.put(k, 1);
            }
        }
    }

    private static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
