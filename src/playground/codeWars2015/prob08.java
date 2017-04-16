package playground.codeWars2015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aaron on 4/7/17.
 */
public class prob08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<String> names = new ArrayList<>();
        List<Integer> cubes = new ArrayList<>();
        int emptyCube = 0;
        int noAssignment = 0;
        int duplicate = 0;
        for (int i = 0; i < x; i++) {
            String name = scanner.next();
            int cube = scanner.nextInt();
            names.add(name);
            cubes.add(cube);
        }
        for (int i = 0; i < x; i++) {
            if (names.get(x) == "NA") {
                emptyCube += 1;
            }
            if (cubes.get(x) == 0) {
                noAssignment += 1;
            }

        }
    }
}
