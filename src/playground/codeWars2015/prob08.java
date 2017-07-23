package playground.codeWars2015;

import java.io.InputStream;
import java.util.*;

/**
 * Created by aaron on 4/7/17.
 */
public class prob08 {
    public static void main(String[] args) {
        InputStream inputStream = prob08.class.getResourceAsStream("prob08-input.txt");
        if (inputStream != null) {
            System.setIn(inputStream);
        }
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        int emptyCube = 0;
        int noAssignment = 0;
        Integer duplicate = 0;
        for (int i = 0; i < x; i++) {
            String name = scanner.next();
            int cube = scanner.nextInt();
            if ("NA".equals(name)) {
                emptyCube += 1;
            }
            if (cube == 0) {
                noAssignment += 1;
            } else {
                if (count.containsKey(cube)) {
                    count.put(cube, count.get(cube)+1);
                }
                else {
                    count.put(cube, 1);
                }
            }
        }
        for (Integer i : count.values()) {
            if (i > 1) {
                duplicate+=1;
            }
        }

//        count.forEach((k, v) -> {
//            if (v > 1) {
//                d += 1;
//            }
//        });

        // Java 8
//        count.forEach((k, v) -> {
//            System.out.println(k + ":" + v);
//        });
        System.out.println("Empty Cubes: " + emptyCube);
        System.out.println("Duplicate Cube Assignments: " + duplicate);
        System.out.println("Employees without Cube: " + noAssignment);
    }
}
