package playground.algo;

import java.util.ArrayList;
import java.util.List;


public class Algorithm {

    public static List<String> getPermutation(String input) {
        List<String> results = new ArrayList<>();
        results.add(input.substring(0, 1));
        for (int i = 1; i < input.length(); i++) {
            List<String> temp = new ArrayList<>();
            String c = input.substring(i, i+1);
            for (String w : results) {
                for (int j = w.length(); j >= 0; j--) {
                    temp.add(insertIntoString(c, w, j));
                }
            }
            results = temp;
        }
        return results;
    }

    public static List<String> getAllSubsets(String input) {
        List<String> results = new ArrayList<>();

        return results;
    }

    public static List<String> getAllCombination(String input, int chosenNumber) {
        List<String> results = new ArrayList<>();

        return results;
    }

    private static String insertIntoString(String insertion, String target, int index) {
        if (index >= target.length()) {
            return target + insertion;
        }
        else {
            return target.substring(0, index) + insertion + target.substring(index);
        }
    }
}
